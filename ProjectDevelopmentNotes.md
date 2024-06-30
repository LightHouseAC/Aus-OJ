# AuSOJ 开发笔记
### 库表设计
1. ##### 用户表
    ```sql
    create table user
    (
        uid          bigint auto_increment
          primary key,
        username     varchar(24)                           not null,
        password     varchar(256)                          not null,
        user_role    varchar(16) default 'user'            not null,
        submit_count bigint      default 0                 not null,
        ac_count     bigint      default 0                 not null,
        deleted      tinyint     default 0                 not null,
        created_at   timestamp   default CURRENT_TIMESTAMP not null,
        updated_at   timestamp   default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
        constraint user_uk
          unique (username)
    );
    ```
2. ##### 提交结果表 (存判题结果)

    ```sql 
    create table submission_result
    (
        result_id  bigint auto_increment
            primary key,
        uid        bigint                              not null comment '提交的用户',
        problem_id bigint                              not null comment '题号',
        status     tinyint                             not null comment '0-已提交,1-判题中,2-判题完成',
        result     varchar(256)                        not null comment 'AC/WA/CE/RE/TLE/MLE,etc',
        language   varchar(256)                        not null comment '代码语言',
        code       text                                not null comment '代码',
        judge_info text                                not null comment '判题信息,运行时间内存等',
        deleted    tinyint   default 0                 not null,
        created_at timestamp default CURRENT_TIMESTAMP not null,
        updated_at timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP
    );
    
    create index submission_result_problem_index
        on submission_result (problem_id);
    
    create index submission_result_uid_index
        on submission_result (uid);
    
    create index submission_result_user_problem_index
        on submission_result (uid, problem_id);
    ```
    索引：提交用户, 题号, (提交用户 + 题号)

3. ##### 题目表
    ```sql
    create table problem
    (
        problem_id   bigint auto_increment
            primary key,
        title        varchar(256)                        not null comment '题目名',
        content      text                                not null comment '题目描述',
        std          text                                null comment '题解和std',
        `limit`      varchar(1024)                       not null comment '限制',
        tags         varchar(1024)                       null comment '题目标签',
        sample_case  text                                null comment '样例',
        judge_case   text                                not null comment '测试数据',
        submit_count bigint    default 0                 not null comment '提交数',
        ac_count     bigint    default 0                 not null comment '通过数',
        deleted      tinyint   default 0                 not null,
        created_at   timestamp default CURRENT_TIMESTAMP not null,
        updated_at   timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP
    );
    ```

