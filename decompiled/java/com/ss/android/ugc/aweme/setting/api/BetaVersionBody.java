package com.ss.android.ugc.aweme.setting.api;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class BetaVersionBody {

    @C09CT("data")
    public final Data data;

    public final Integer LIZ() {
        Data data = this.data;
        if (data != null) {
            return data.versionCode;
        }
        return null;
    }

    public final String LIZIZ() {
        Data data = this.data;
        if (data != null) {
            return data.versionName;
        }
        return null;
    }

    public final boolean LIZJ() {
        Data data = this.data;
        return Intrinsics.LJFF(data != null ? data.channel : null, "beta_closedtesting");
    }

    public BetaVersionBody(Data data) {
        this.data = data;
    }

    public static final class Data {

        @C09CT("channel")
        public final String channel;

        @C09CT("tip_version_code")
        public final Integer versionCode;

        @C09CT("tip_version_name")
        public final String versionName;

        public Data(Integer num, String str, String str2) {
            this.versionCode = num;
            this.versionName = str;
            this.channel = str2;
        }
    }
}
