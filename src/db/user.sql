CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT "",
  `age` int NOT NULL DEFAULT 0,
  `gender` tinyint NOT NULL DEFAULT 0 COMMENT "1:male 2:female",
  `phone_no` varchar(50) NOT NULL DEFAULT "" COMMENT "电话号码",
  `address` varchar (100) NOT NULL DEFAULT "" COMMENT "住址",
  `is_deleted` tinyint NOT NULL DEFAULT 0,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci
