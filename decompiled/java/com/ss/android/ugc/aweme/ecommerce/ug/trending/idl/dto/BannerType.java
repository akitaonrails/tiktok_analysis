package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class BannerType {

    @C09CT("ChannelBannerFrameType_H5")
    public static final BannerType ChannelBannerFrameType_H5;

    @C09CT("ChannelBannerFrameType_Live")
    public static final BannerType ChannelBannerFrameType_Live;

    @C09CT("ChannelBannerFrameType_Shop")
    public static final BannerType ChannelBannerFrameType_Shop;

    @C09CT("ChannelBannerFrameType_Unknown")
    public static final BannerType ChannelBannerFrameType_Unknown;
    public static final /* synthetic */ BannerType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<BannerType> getEntries() {
        return LLILLL;
    }

    static {
        BannerType bannerType = new BannerType("ChannelBannerFrameType_Unknown", 0, 0);
        ChannelBannerFrameType_Unknown = bannerType;
        BannerType bannerType2 = new BannerType("ChannelBannerFrameType_Live", 1, 1);
        ChannelBannerFrameType_Live = bannerType2;
        BannerType bannerType3 = new BannerType("ChannelBannerFrameType_Shop", 2, 2);
        ChannelBannerFrameType_Shop = bannerType3;
        BannerType bannerType4 = new BannerType("ChannelBannerFrameType_H5", 3, 3);
        ChannelBannerFrameType_H5 = bannerType4;
        BannerType[] bannerTypeArr = {bannerType, bannerType2, bannerType3, bannerType4};
        LLILLJJLI = bannerTypeArr;
        LLILLL = new C2254308sP(bannerTypeArr);
    }

    public static BannerType[] values() {
        return (BannerType[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static BannerType valueOf(String str) {
        return (BannerType) C08FF.LIZ(BannerType.class, str);
    }

    public BannerType(String str, int i, int i2) {
        this.LL = i2;
    }
}
