package com.ss.android.ugc.aweme.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class StudioVideoUpload1001TimeoutAB {
    public static final StudioVideoUpload1001TimeoutAB LIZ = new StudioVideoUpload1001TimeoutAB();
    public static final Config LIZIZ = new Config(0, 0, 0, 0);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(114));

    public static final class Config {

        @C09CT("BDFileUploadApplyPhaseSocketConnTimeout")
        public final int fileUploadApplyPhaseSocketConnTimeout;

        @C09CT("BDFileUploadApplyPhaseSocketReadTimeout")
        public final int fileUploadApplyPhaseSocketReadTimeout;

        @C09CT("BDFileUploadApplyPhaseSocketWriteTimeout")
        public final int fileUploadApplyPhaseSocketWriteTimeout;

        @C09CT("BDFileUploadApplyPhaseTotalRequestTimeout")
        public final int fileUploadApplyPhaseTotalRequestTimeout;

        public Config() {
            this(0, 0, 0, 0);
        }

        public Config(int i, int i2, int i3, int i4) {
            this.fileUploadApplyPhaseTotalRequestTimeout = i;
            this.fileUploadApplyPhaseSocketConnTimeout = i2;
            this.fileUploadApplyPhaseSocketReadTimeout = i3;
            this.fileUploadApplyPhaseSocketWriteTimeout = i4;
        }
    }
}
