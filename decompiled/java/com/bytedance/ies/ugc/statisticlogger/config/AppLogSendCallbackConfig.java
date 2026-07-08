package com.bytedance.ies.ugc.statisticlogger.config;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class AppLogSendCallbackConfig {
    public static final String[] LIZ = new String[0];
    public static final Model LIZIZ = new Model(Boolean.TRUE, LIZ);

    public static final class Model {

        @C09CT("ban_header_list")
        public final String[] banHeaderList;

        @C09CT("enable")
        public final Boolean enable;

        public Model() {
            this(Boolean.TRUE, AppLogSendCallbackConfig.LIZ);
        }

        public Model(Boolean bool, String[] strArr) {
            this.enable = bool;
            this.banHeaderList = strArr;
        }
    }
}
