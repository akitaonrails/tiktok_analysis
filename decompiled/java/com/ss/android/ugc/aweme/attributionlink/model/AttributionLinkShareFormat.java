package com.ss.android.ugc.aweme.attributionlink.model;

import X.C08FF;
import X.C09CT;
import X.C19593311lD;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes30.dex */
public final class AttributionLinkShareFormat {

    @C09CT("1")
    public static final AttributionLinkShareFormat ATTRIBUTION_LINK_SHARE_FORMAT_GREEN_SCREEN;

    @C09CT("2")
    public static final AttributionLinkShareFormat ATTRIBUTION_LINK_SHARE_FORMAT_PHOTO_MODE;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final AttributionLinkShareFormat ATTRIBUTION_LINK_SHARE_FORMAT_UNKNOWN;
    public static final C19593311lD Companion;
    public static final /* synthetic */ AttributionLinkShareFormat[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<AttributionLinkShareFormat> getEntries() {
        return LLILLL;
    }

    static {
        AttributionLinkShareFormat attributionLinkShareFormat = new AttributionLinkShareFormat("ATTRIBUTION_LINK_SHARE_FORMAT_UNKNOWN", 0, 0);
        ATTRIBUTION_LINK_SHARE_FORMAT_UNKNOWN = attributionLinkShareFormat;
        AttributionLinkShareFormat attributionLinkShareFormat2 = new AttributionLinkShareFormat("ATTRIBUTION_LINK_SHARE_FORMAT_GREEN_SCREEN", 1, 1);
        ATTRIBUTION_LINK_SHARE_FORMAT_GREEN_SCREEN = attributionLinkShareFormat2;
        AttributionLinkShareFormat attributionLinkShareFormat3 = new AttributionLinkShareFormat("ATTRIBUTION_LINK_SHARE_FORMAT_PHOTO_MODE", 2, 2);
        ATTRIBUTION_LINK_SHARE_FORMAT_PHOTO_MODE = attributionLinkShareFormat3;
        AttributionLinkShareFormat[] attributionLinkShareFormatArr = {attributionLinkShareFormat, attributionLinkShareFormat2, attributionLinkShareFormat3};
        LLILLJJLI = attributionLinkShareFormatArr;
        LLILLL = new C2254308sP(attributionLinkShareFormatArr);
        Companion = new C19593311lD();
    }

    public static AttributionLinkShareFormat[] values() {
        return (AttributionLinkShareFormat[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static AttributionLinkShareFormat valueOf(String str) {
        return (AttributionLinkShareFormat) C08FF.LIZ(AttributionLinkShareFormat.class, str);
    }

    public AttributionLinkShareFormat(String str, int i, int i2) {
        this.LL = i2;
    }
}
