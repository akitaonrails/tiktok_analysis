package com.ss.android.ugc.aweme.search.pages.result.bot.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoSugStyle {

    @C09CT("is_short_sug")
    public final boolean isShortSug;

    @C09CT("show_interaction_widget")
    public final boolean showInteractionWidget;

    @C09CT("show_title")
    public final boolean showTitle;

    @C09CT("tako_sug_limit")
    public final int sugMaxNum;

    public TakoSugStyle() {
        this(false, true, false, 2);
    }

    public TakoSugStyle(boolean z, boolean z2, boolean z3, int i) {
        this.isShortSug = z;
        this.showInteractionWidget = z2;
        this.showTitle = z3;
        this.sugMaxNum = i;
    }
}
