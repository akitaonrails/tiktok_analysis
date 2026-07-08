package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class AssetType {

    @C09CT("image")
    public static final AssetType IMAGE;
    public static final /* synthetic */ AssetType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("video")
    public static final AssetType VIDEO;

    public static InterfaceC2044707zh<AssetType> getEntries() {
        return LLILLJJLI;
    }

    static {
        AssetType assetType = new AssetType("VIDEO", 0);
        VIDEO = assetType;
        AssetType assetType2 = new AssetType("IMAGE", 1);
        IMAGE = assetType2;
        AssetType[] assetTypeArr = {assetType, assetType2};
        LL = assetTypeArr;
        LLILLJJLI = new C2254308sP(assetTypeArr);
    }

    public static AssetType[] values() {
        return (AssetType[]) LL.clone();
    }

    public static AssetType valueOf(String str) {
        return (AssetType) C08FF.LIZ(AssetType.class, str);
    }

    public AssetType(String str, int i) {
    }
}
