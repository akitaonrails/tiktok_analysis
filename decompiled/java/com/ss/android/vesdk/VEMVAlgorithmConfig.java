package com.ss.android.vesdk;

import X.C08FF;

/* JADX INFO: loaded from: classes9.dex */
public class VEMVAlgorithmConfig {
    public AlgorithmInfo[] infos;

    public class AlgorithmInfo {
        public AlgorithmItem[] items;
        public String photoPath;

        public AlgorithmInfo() {
        }

        public class AlgorithmItem {
            public String algorithmName;
            public String algorithmParamJson;
            public boolean isNeedServerExecute;
            public MV_REESULT_OUT_TYPE result_out_type;

            public AlgorithmItem(AlgorithmInfo algorithmInfo, String str, boolean z) {
                this(algorithmInfo, str, z, null);
            }

            public AlgorithmItem(AlgorithmInfo algorithmInfo, String str, boolean z, String str2) {
                this(str, z, str2, -1);
            }

            public AlgorithmItem(String str, boolean z, String str2, int i) {
                this.algorithmName = str;
                this.isNeedServerExecute = z;
                this.algorithmParamJson = str2;
                if (i == 0) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE;
                    return;
                }
                if (i == 1) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO;
                    return;
                }
                if (i == 2) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE_AND_JSON;
                    return;
                }
                if (i == 3) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO_AND_JSON;
                } else if (i == 4) {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_JSON;
                } else {
                    this.result_out_type = MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_INVALID;
                }
            }
        }
    }

    public enum MV_REESULT_IN_TYPE {
        MV_REESULT_IN_TYPE_IMAGE,
        MV_REESULT_IN_TYPE_VIDEO,
        MV_REESULT_IN_TYPE_JSON;

        public static MV_REESULT_IN_TYPE valueOf(String str) {
            return (MV_REESULT_IN_TYPE) C08FF.LIZ(MV_REESULT_IN_TYPE.class, str);
        }
    }

    public enum MV_REESULT_OUT_TYPE {
        MV_REESULT_OUT_TYPE_IMAGE,
        MV_REESULT_OUT_TYPE_VIDEO,
        MV_REESULT_OUT_TYPE_IMAGE_AND_JSON,
        MV_REESULT_OUT_TYPE_VIDEO_AND_JSON,
        MV_REESULT_OUT_TYPE_JSON,
        MV_REESULT_OUT_TYPE_INVALID;

        public static MV_REESULT_OUT_TYPE valueOf(String str) {
            return (MV_REESULT_OUT_TYPE) C08FF.LIZ(MV_REESULT_OUT_TYPE.class, str);
        }
    }
}
