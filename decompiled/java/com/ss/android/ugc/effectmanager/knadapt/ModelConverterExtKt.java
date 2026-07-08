package com.ss.android.ugc.effectmanager.knadapt;

import X.C1954807lC;
import X.EnumC19364410pO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.common.model.FetchModelType;

/* JADX INFO: loaded from: classes31.dex */
public final class ModelConverterExtKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[FetchModelType.values().length];
            try {
                iArr[FetchModelType.ORIGIN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[FetchModelType.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.ss.android.ugc.effectmanager.FetchModelType.values().length];
            try {
                iArr2[com.ss.android.ugc.effectmanager.FetchModelType.ORIGIN.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr2[com.ss.android.ugc.effectmanager.FetchModelType.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DownloadableModelConfig.ModelFileEnv.values().length];
            try {
                iArr3[DownloadableModelConfig.ModelFileEnv.TEST.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr3[DownloadableModelConfig.ModelFileEnv.ONLINE.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final FetchModelType toKNFetchModelType(com.ss.android.ugc.effectmanager.FetchModelType fetchModelType) {
        int i = WhenMappings.$EnumSwitchMapping$1[fetchModelType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return FetchModelType.ZIP;
            }
            throw new C1954807lC();
        }
        return FetchModelType.ORIGIN;
    }

    public static final EnumC19364410pO toKNModel(DownloadableModelConfig.ModelFileEnv modelFileEnv) {
        int i = WhenMappings.$EnumSwitchMapping$2[modelFileEnv.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return EnumC19364410pO.ONLINE;
            }
            throw new C1954807lC();
        }
        return EnumC19364410pO.TEST;
    }

    public static final com.ss.android.ugc.effectmanager.FetchModelType toOldFetchModelType(FetchModelType fetchModelType) {
        int i = WhenMappings.$EnumSwitchMapping$0[fetchModelType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return com.ss.android.ugc.effectmanager.FetchModelType.ZIP;
            }
            throw new C1954807lC();
        }
        return com.ss.android.ugc.effectmanager.FetchModelType.ORIGIN;
    }
}
