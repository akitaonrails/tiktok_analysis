package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes32.dex */
public final class IMPSPMVPExperiment {
    public static final IMPSPMVPData LIZ = new IMPSPMVPData(false, "", "");

    public static IMPSPMVPData LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        IMPSPMVPData iMPSPMVPData = LIZ;
        IMPSPMVPData iMPSPMVPData2 = (IMPSPMVPData) c0c64LJIILLIIL.LJJII(IMPSPMVPData.class, iMPSPMVPData, "im_psp_mvp", true);
        return iMPSPMVPData2 != null ? iMPSPMVPData2 : iMPSPMVPData;
    }

    public static final class IMPSPMVPData {

        @C09CT("data_consumer_scene_name")
        public final String consumerSceneName;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("data_producer_scene_name")
        public final String producerSceneName;

        public IMPSPMVPData() {
            this(false, "", "");
        }

        public IMPSPMVPData(boolean z, String str, String str2) {
            this.enable = z;
            this.producerSceneName = str;
            this.consumerSceneName = str2;
        }
    }
}
