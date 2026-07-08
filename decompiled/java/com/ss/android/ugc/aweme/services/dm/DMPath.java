package com.ss.android.ugc.aweme.services.dm;

import X.C01GW;
import X.C08FF;
import X.C0VSJ;
import X.C2188811AlT;
import X.C2254308sP;
import X.C452501pT;
import X.InterfaceC2044707zh;
import java.io.File;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class DMPath {
    public static final Companion Companion = new Companion();
    public static final C01GW<String> ROOT$delegate = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(91));
    public final String id;

    public static final class Companion {
        private final String getUid() {
            return DMPublishService.INSTANCE.getCurrentUid();
        }

        public final String getROOT() {
            return DMPath.ROOT$delegate.getValue();
        }

        public final String getCACHE_PATH() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getROOT());
            sbLIZ.append("cache");
            sbLIZ.append(File.separator);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getCACHE_ROOT() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getROOT());
            sbLIZ.append("cache");
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append(getUid());
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getCREATIVE_ROOT() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getROOT());
            sbLIZ.append("creative");
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append(getUid());
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DMPathType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ DMPathType[] $VALUES;
        public final String spaceName;
        public static final DMPathType SYNTHESISE = new DMPathType("SYNTHESISE", 0, "synthesise");
        public static final DMPathType ORIGIN = new DMPathType("ORIGIN", 1, "origin");
        public static final DMPathType PARALLELUPLOAD = new DMPathType("PARALLELUPLOAD", 2, "parallel_upload");

        public static final /* synthetic */ DMPathType[] $values() {
            return new DMPathType[]{SYNTHESISE, ORIGIN, PARALLELUPLOAD};
        }

        public static InterfaceC2044707zh<DMPathType> getEntries() {
            return $ENTRIES;
        }

        static {
            DMPathType[] dMPathTypeArr$values = $values();
            $VALUES = dMPathTypeArr$values;
            $ENTRIES = new C2254308sP(dMPathTypeArr$values);
        }

        public static DMPathType[] values() {
            return (DMPathType[]) $VALUES.clone();
        }

        public final String getSpaceName() {
            return this.spaceName;
        }

        public static DMPathType valueOf(String str) {
            return (DMPathType) C08FF.LIZ(DMPathType.class, str);
        }

        public DMPathType(String str, int i, String str2) {
            this.spaceName = str2;
        }
    }

    public final String getImageSynthesiseOutputPath() {
        return getCacheResourceDirPath(true) + File.separator + DMPathType.SYNTHESISE.getSpaceName();
    }

    public final String getOriginFilePath() {
        return getCacheResourceDirPath(true) + File.separator + DMPathType.ORIGIN.getSpaceName();
    }

    public final String getParallelUploadOutputPath() {
        return getCacheResourceDirPath(true) + File.separator + DMPathType.PARALLELUPLOAD.getSpaceName();
    }

    public final String getVideoSynthesiseOutputPath() {
        return getCacheResourceDirPath(true) + File.separator + DMPathType.SYNTHESISE.getSpaceName() + ".mp4";
    }

    public final String getId() {
        return this.id;
    }

    public DMPath(String str) {
        this.id = str;
    }

    public final String genCreativeResourceDirPath(boolean z) {
        String str = Companion.getCREATIVE_ROOT() + this.id;
        if (z) {
            DMPathKt.smartCreateNewDir(new C0VSJ(str));
        }
        return str;
    }

    public final String getCacheResourceDirPath(boolean z) {
        String str = Companion.getCACHE_ROOT() + this.id;
        if (z) {
            DMPathKt.smartCreateNewDir(new C0VSJ(str));
        }
        return str;
    }

    public final String genCreativeMsgResourceDirPath(String str, boolean z) {
        String str2 = genCreativeResourceDirPath(true) + File.separator + str;
        if (z) {
            DMPathKt.smartCreateNewDir(new C0VSJ(str2));
        }
        return str2;
    }
}
