CREATE TABLE `t_mirror_user`
(
    `id`       bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name`     varchar(32)     NOT NULL COMMENT '名称',
    `password` varchar(255)    NOT NULL COMMENT '密码',
    PRIMARY KEY (`id`),
    KEY `idx_name` (`name`)
) COMMENT '用户表';