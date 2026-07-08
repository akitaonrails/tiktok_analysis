package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class BotMarketInfo {

    @C09CT("background_url")
    public final String backgroundUrl;

    @C09CT("bg_theme_color")
    public final String bgThemeColor;

    @C09CT("bots")
    public final List<TakoBotInfo> bots;

    @C09CT("fuzzy_icon_url")
    public final String fuzzyIconUrl;

    @C09CT("style")
    public final Integer style;

    public BotMarketInfo() {
        this(0, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotMarketInfo)) {
            return false;
        }
        BotMarketInfo botMarketInfo = (BotMarketInfo) obj;
        return Intrinsics.LJFF(this.style, botMarketInfo.style) && Intrinsics.LJFF(this.bots, botMarketInfo.bots) && Intrinsics.LJFF(this.bgThemeColor, botMarketInfo.bgThemeColor) && Intrinsics.LJFF(this.backgroundUrl, botMarketInfo.backgroundUrl) && Intrinsics.LJFF(this.fuzzyIconUrl, botMarketInfo.fuzzyIconUrl);
    }

    public BotMarketInfo(Integer num, List<TakoBotInfo> list, String str, String str2, String str3) {
        this.style = num;
        this.bots = list;
        this.bgThemeColor = str;
        this.backgroundUrl = str2;
        this.fuzzyIconUrl = str3;
    }
}
