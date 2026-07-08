package com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SeriesBottomBannerButtonType {

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final SeriesBottomBannerButtonType DEFAULT;
    public static final /* synthetic */ SeriesBottomBannerButtonType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("2")
    public static final SeriesBottomBannerButtonType PLAY_NEXT;

    @C09CT("1")
    public static final SeriesBottomBannerButtonType WATCH;

    public static InterfaceC2044707zh<SeriesBottomBannerButtonType> getEntries() {
        return LLILLJJLI;
    }

    static {
        SeriesBottomBannerButtonType seriesBottomBannerButtonType = new SeriesBottomBannerButtonType(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = seriesBottomBannerButtonType;
        SeriesBottomBannerButtonType seriesBottomBannerButtonType2 = new SeriesBottomBannerButtonType("WATCH", 1);
        WATCH = seriesBottomBannerButtonType2;
        SeriesBottomBannerButtonType seriesBottomBannerButtonType3 = new SeriesBottomBannerButtonType("PLAY_NEXT", 2);
        PLAY_NEXT = seriesBottomBannerButtonType3;
        SeriesBottomBannerButtonType[] seriesBottomBannerButtonTypeArr = {seriesBottomBannerButtonType, seriesBottomBannerButtonType2, seriesBottomBannerButtonType3};
        LL = seriesBottomBannerButtonTypeArr;
        LLILLJJLI = new C2254308sP(seriesBottomBannerButtonTypeArr);
    }

    public static SeriesBottomBannerButtonType[] values() {
        return (SeriesBottomBannerButtonType[]) LL.clone();
    }

    public static SeriesBottomBannerButtonType valueOf(String str) {
        return (SeriesBottomBannerButtonType) C08FF.LIZ(SeriesBottomBannerButtonType.class, str);
    }

    public SeriesBottomBannerButtonType(String str, int i) {
    }
}
