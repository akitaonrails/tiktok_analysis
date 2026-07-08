package com.ss.android.ugc.aweme.aigc.asynctask.models;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class PublicInputType {
    public static final /* synthetic */ PublicInputType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("normal")
    public static final PublicInputType NORMAL;

    @C09CT("restore")
    public static final PublicInputType RESTORE;

    @C09CT("retry")
    public static final PublicInputType RETRY;

    @C09CT("RETRY_DOWNLOAD")
    public static final PublicInputType RETRY_DOWNLOAD;
    public final String LL;

    public static InterfaceC2044707zh<PublicInputType> getEntries() {
        return LLILLL;
    }

    static {
        PublicInputType publicInputType = new PublicInputType("NORMAL", 0, "normal");
        NORMAL = publicInputType;
        PublicInputType publicInputType2 = new PublicInputType("RETRY", 1, "retry");
        RETRY = publicInputType2;
        PublicInputType publicInputType3 = new PublicInputType("RESTORE", 2, "restore");
        RESTORE = publicInputType3;
        PublicInputType publicInputType4 = new PublicInputType("RETRY_DOWNLOAD", 3, "retry_download");
        RETRY_DOWNLOAD = publicInputType4;
        PublicInputType[] publicInputTypeArr = {publicInputType, publicInputType2, publicInputType3, publicInputType4};
        LLILLJJLI = publicInputTypeArr;
        LLILLL = new C2254308sP(publicInputTypeArr);
    }

    public static PublicInputType[] values() {
        return (PublicInputType[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static PublicInputType valueOf(String str) {
        return (PublicInputType) C08FF.LIZ(PublicInputType.class, str);
    }

    public PublicInputType(String str, int i, String str2) {
        this.LL = str2;
    }
}
