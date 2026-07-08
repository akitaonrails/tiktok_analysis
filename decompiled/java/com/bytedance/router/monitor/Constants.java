package com.bytedance.router.monitor;

/* JADX INFO: loaded from: classes33.dex */
public final class Constants {
    public static final int STATUS_FAIL = 0;
    public static final Companion Companion = new Companion();
    public static final String KEY_CATEGORY_BUSINESS_LINE = "business_line";
    public static final String KEY_CATEGORY_ROUTE_TYPE = "route_type";
    public static final String KEY_CATEGORY_ROUTE_HOST_PATH = "route_host_path";
    public static final String KEY_CATEGORY_ROUTE_SCHEME = "route_scheme";
    public static final String KEY_CATEGORY_ROUTE_STATUS = "route_status";
    public static final String KEY_METRIC_ROUTE_URL = "route_url";
    public static final String KEY_METRIC_TOTAL_DURATION = "total_duration";
    public static final String KEY_METRIC_INTERCEPTOR_DURATION = "interceptor_duration";
    public static final String KEY_METRIC_OPEN_ROUTE_DURATION = "open_route_duration";
    public static final String KEY_METRIC_OPEN_PAGE_DURATION = "open_page_duration";
    public static final String KEY_URL = "route_url";
    public static final String KEY_SCHEME = "route_scheme";
    public static final String KEY_HOST = "route_host";
    public static final String KEY_PATH = "route_path";
    public static final String KEY_LOG_VERSION = "log_version";
    public static final String KEY_PARAMS = "params";
    public static final String KEY_TOTAL_DURATION = "total_duration";
    public static final String KEY_DURATIONS = "durations";
    public static final String KEY_INTERCEPTED_BY = "intercepted_by";
    public static final String KEY_ERROR_MSG = "error_msg";
    public static final String KEY_TARGET_CLASS = "targetClass";
    public static final String KEY_URL_CHANGE_LOG = "url_change_log";
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_INTERCEPTED = 2;
    public static final String KEY_ROUTE_ID = "_RouterMonitor_Route_Id";
    public static final String KEY_ROUTER_JUMP_MARK = "router_jump_mark";
    public static final String LOG_VERSION = "1.0";

    public static final class Companion {
        public final String getKEY_CATEGORY_BUSINESS_LINE() {
            return Constants.KEY_CATEGORY_BUSINESS_LINE;
        }

        public final String getKEY_CATEGORY_ROUTE_HOST_PATH() {
            return Constants.KEY_CATEGORY_ROUTE_HOST_PATH;
        }

        public final String getKEY_CATEGORY_ROUTE_SCHEME() {
            return Constants.KEY_CATEGORY_ROUTE_SCHEME;
        }

        public final String getKEY_CATEGORY_ROUTE_STATUS() {
            return Constants.KEY_CATEGORY_ROUTE_STATUS;
        }

        public final String getKEY_CATEGORY_ROUTE_TYPE() {
            return Constants.KEY_CATEGORY_ROUTE_TYPE;
        }

        public final String getKEY_DURATIONS() {
            return Constants.KEY_DURATIONS;
        }

        public final String getKEY_ERROR_MSG() {
            return Constants.KEY_ERROR_MSG;
        }

        public final String getKEY_HOST() {
            return Constants.KEY_HOST;
        }

        public final String getKEY_INTERCEPTED_BY() {
            return Constants.KEY_INTERCEPTED_BY;
        }

        public final String getKEY_LOG_VERSION() {
            return Constants.KEY_LOG_VERSION;
        }

        public final String getKEY_METRIC_INTERCEPTOR_DURATION() {
            return Constants.KEY_METRIC_INTERCEPTOR_DURATION;
        }

        public final String getKEY_METRIC_OPEN_PAGE_DURATION() {
            return Constants.KEY_METRIC_OPEN_PAGE_DURATION;
        }

        public final String getKEY_METRIC_OPEN_ROUTE_DURATION() {
            return Constants.KEY_METRIC_OPEN_ROUTE_DURATION;
        }

        public final String getKEY_METRIC_ROUTE_URL() {
            return Constants.KEY_METRIC_ROUTE_URL;
        }

        public final String getKEY_METRIC_TOTAL_DURATION() {
            return Constants.KEY_METRIC_TOTAL_DURATION;
        }

        public final String getKEY_PARAMS() {
            return Constants.KEY_PARAMS;
        }

        public final String getKEY_PATH() {
            return Constants.KEY_PATH;
        }

        public final String getKEY_ROUTER_JUMP_MARK() {
            return Constants.KEY_ROUTER_JUMP_MARK;
        }

        public final String getKEY_ROUTE_ID() {
            return Constants.KEY_ROUTE_ID;
        }

        public final String getKEY_SCHEME() {
            return Constants.KEY_SCHEME;
        }

        public final String getKEY_TARGET_CLASS() {
            return Constants.KEY_TARGET_CLASS;
        }

        public final String getKEY_TOTAL_DURATION() {
            return Constants.KEY_TOTAL_DURATION;
        }

        public final String getKEY_URL() {
            return Constants.KEY_URL;
        }

        public final String getKEY_URL_CHANGE_LOG() {
            return Constants.KEY_URL_CHANGE_LOG;
        }

        public final String getLOG_VERSION() {
            return Constants.LOG_VERSION;
        }

        public final int getSTATUS_FAIL() {
            return Constants.STATUS_FAIL;
        }

        public final int getSTATUS_INTERCEPTED() {
            return Constants.STATUS_INTERCEPTED;
        }

        public final int getSTATUS_SUCCESS() {
            return Constants.STATUS_SUCCESS;
        }
    }
}
