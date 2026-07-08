package com.ss.android.ugc.aweme.experiment;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TitlePanelStyle {

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final TitlePanelStyle DEFAULT;

    @C09CT("2")
    public static final TitlePanelStyle DESC_AND_COMMENT;

    @C09CT("3")
    public static final TitlePanelStyle DESC_AND_COMMENT_AND_SEARCH;

    @C09CT("1")
    public static final TitlePanelStyle DESC_AND_SEARCH;
    public static final /* synthetic */ TitlePanelStyle[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<TitlePanelStyle> getEntries() {
        return LLILLJJLI;
    }

    static {
        TitlePanelStyle titlePanelStyle = new TitlePanelStyle(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = titlePanelStyle;
        TitlePanelStyle titlePanelStyle2 = new TitlePanelStyle("DESC_AND_SEARCH", 1, 1);
        DESC_AND_SEARCH = titlePanelStyle2;
        TitlePanelStyle titlePanelStyle3 = new TitlePanelStyle("DESC_AND_COMMENT", 2, 2);
        DESC_AND_COMMENT = titlePanelStyle3;
        TitlePanelStyle titlePanelStyle4 = new TitlePanelStyle("DESC_AND_COMMENT_AND_SEARCH", 3, 3);
        DESC_AND_COMMENT_AND_SEARCH = titlePanelStyle4;
        TitlePanelStyle[] titlePanelStyleArr = {titlePanelStyle, titlePanelStyle2, titlePanelStyle3, titlePanelStyle4};
        LL = titlePanelStyleArr;
        LLILLJJLI = new C2254308sP(titlePanelStyleArr);
    }

    public static TitlePanelStyle[] values() {
        return (TitlePanelStyle[]) LL.clone();
    }

    public static TitlePanelStyle valueOf(String str) {
        return (TitlePanelStyle) C08FF.LIZ(TitlePanelStyle.class, str);
    }

    public TitlePanelStyle(String str, int i, int i2) {
    }
}
