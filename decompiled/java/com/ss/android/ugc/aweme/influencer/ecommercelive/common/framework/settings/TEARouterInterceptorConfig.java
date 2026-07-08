package com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class TEARouterInterceptorConfig {
    public static final TEARouterInterceptorConfigModel LIZ = new TEARouterInterceptorConfigModel(false, null, null, null);

    public static final class InterceptSchema {

        @C09CT("h5_path")
        public final List<String> h5Path;

        @C09CT("lynx_path")
        public final List<LynxPath> lynxPath;

        public InterceptSchema(List<LynxPath> list, List<String> list2) {
            this.lynxPath = list;
            this.h5Path = list2;
        }
    }

    public static final class LynxPath {

        @C09CT("bundle")
        public final String bundle;

        @C09CT("channel")
        public final String channel;

        public LynxPath(String str, String str2) {
            this.bundle = str;
            this.channel = str2;
        }
    }

    public static final class Status {

        @C09CT("key")
        public final String key;

        @C09CT("value")
        public final String value;

        public Status(String str, String str2) {
            this.value = str;
            this.key = str2;
        }
    }

    public static final class TEARouterInterceptorConfigModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("force_interceptors")
        public final List<Interceptor> forceInterceptors;

        @C09CT("intercept_schema")
        public final List<String> interceptSchema;

        @C09CT("interceptors")
        public final List<Interceptor> interceptors;

        public TEARouterInterceptorConfigModel(boolean z, List<String> list, List<Interceptor> list2, List<Interceptor> list3) {
            this.enable = z;
            this.interceptSchema = list;
            this.interceptors = list2;
            this.forceInterceptors = list3;
        }
    }

    public static final class Interceptor {

        @C09CT("intercept_schema")
        public final InterceptSchema interceptSchema;

        @C09CT("move_params")
        public final List<String> moveParams;

        @C09CT("name")
        public final String name;

        @C09CT("params")
        public final List<Status> params;

        @C09CT("redirect_schema")
        public final String redirectSchema;

        @C09CT("remove_params")
        public final List<String> removeParams;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public final List<Status> status;

        public Interceptor(String str, List<Status> list, List<Status> list2, InterceptSchema interceptSchema, String str2, List<String> list3, List<String> list4) {
            this.name = str;
            this.params = list;
            this.status = list2;
            this.interceptSchema = interceptSchema;
            this.redirectSchema = str2;
            this.moveParams = list3;
            this.removeParams = list4;
        }
    }
}
