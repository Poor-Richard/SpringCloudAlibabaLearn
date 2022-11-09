package com.pzhu.spring.cloud.alibaba.common.util;

/**
 * @author joy-survey team
 * @Description 常量类
 */
public class Constants {
    /**
     * 默认有效时间
     */
    public static class Time {
        /**
         * Token默认有效时间：30分钟
         */
        public final static int TOKEN_EFFECTIVE_TIME = 1800;
    }

    /**
     * Redis
     */
    public static class Redis {
        /**
         * 项目公共 前缀
         */
        public final static String PREFIX = "course_eval_sys";
        /**
         * 校验相关
         */
        public final static String PREFIX_TOKEN = "token";


        /**
         * 课程
         */
        public final static String PREFIX_COURSE = "course";
        /**
         * 文件
         */
        public final static String FILE = "file";
    }

    /**
     * 权限校验
     */
    public static class Auth {
        /**
         * Header中 Token-key名称
         */
        public final static String HEADER_TOKEN_KEY = "token";
        /**
         * Header中 TimeStamp-key名称
         */
        public final static String HEADER_TIME_STAMP_KEY = "time-stamp";
        /**
         * Header中 SourceType-key名称
         */
        public final static String HEADER_SOURCE_TYPE_KEY = "source-type";
        /**
         * 登录用户
         */
        public static final String HEADER_LOGIN_USER_KEY = "login-user";
    }

    /**
     * 分隔符
     */
    public static class Sign {
        /**
         * 冒号
         */
        public final static String COLON = ":";
        /**
         * 下划线
         */
        public final static String UNDERLINE = "_";
        /**
         * 逗号
         */
        public final static String COMMA = ",";
        /**
         * 分号
         */
        public final static String SEMICOLON = ";";
        /**
         * 中划线
         */
        public final static String LINE = "-";

    }

    /**
     * Mysql相关
     */
    public static class Mysql {
        /**
         * 默认版本号
         */
        public final static long VERSION_DEFAULT = 0;
        /**
         * IDS
         */
        public final static String KEY_ID = "id";
        /**
         * ID
         */
        public final static String KEY_IDS = "ids";
        /**
         * status
         */
        public final static String KEY_STATUS = "status";
        /**
         * isDelete
         */
        public final static String KEY_IS_DELETE = "isDelete";
        /**
         * createTimeStart
         */
        public final static String KEY_CREATE_TIME_START = "createTimeStart";
        /**
         * createTimeEnd
         */
        public final static String KEY_CREATE_TIME_END = "createTimeEnd";
        /**
         * title
         */
        public final static String KEY_TITLE = "title";
        /**
         * modifier
         */
        public final static String KEY_MODIFIER = "modifier";
        /**
         * clazzId
         */
        public final static String KEY_CLASS_ID = "clazzId";
        /**
         * className
         */
        public final static String KEY_CLASS_NAME = "className";
        /**
         * questionnaireTitle
         */
        public final static String KEY_QUESTIONNAIRE_TITLE = "questionnaireTitle";
        /**
         * questionnaireId
         */
        public final static String KEY_QUESTIONNAIRE_ID = "questionnaireId";
        /**
         * answerId
         */
        public final static String KEY_ANSWER_ID = "answerId";


    }

    /**
     * 正则表达式
     */
    public static class Regular {
        /**
         * 手机号
         */
        public static String PHONE_REGULAR_EXPRESSION = "^[1][0-9]{10}$";
        /**
         * 密码
         */
        public static String PASSWORD_REGULAR_EXPRESSION = "^(?![a-zA-Z]+$)(?![A-Z0-9]+$)(?![A-Z\\W_]+$)(?![a-z0-9]+$)(?![a-z\\W_]+$)(?![0-9\\W_]+$)[a-zA-Z0-9\\W_]{8,14}$";
    }

    public static class Sys {
        /**
         * 格式化BigDecimal，默认保留两位小数
         */
        public static int DECIMAL_DIGITS = 2;
        /**
         * 选项数
         */
        public static int QUESTION_OPTION_CNT = 5;

        /**
         * 最大问题数
         */
        public static int QUESTION_MAX_CNT = 100;

        /**
         * 问卷名称最大长度
         */
        public static int QUESTIONNAIRE_TITLE_MAX_LEN = 100;

        /**
         * 问题名称最大长度
         */
        public static int QUESTION_TITLE_MAX_LEN = 500;
        /**
         * 选项最大长度
         */
        public static int OPTION_CONTENT_MAX_LEN = 200;
        /**
         * 系统名称
         */
        public static String SERVER_NAME = "JOY SURVEY";

    }

    /**
     * 文件相关常量
     */
    public static class Files {

        /**
         * 文件最小限制
         */
        public static Integer SIZE_MIN = 0;

        /**
         * 文件最大限制
         */
        public static Integer SIZE_MAX = 10 * 1024 * 1024;
        /**
         * Excel后缀
         */
        public static final String EXCEL_SUFFIX = ".xlsx";
    }

    public static class TEMPLATE{
        public static String TEMPLATE_NAME="问卷调研模板";
        public static String SHEET_NAME="问卷调研模板";
    }
}
