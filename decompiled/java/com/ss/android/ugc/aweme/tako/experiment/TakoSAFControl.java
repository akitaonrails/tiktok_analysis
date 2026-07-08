package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoSAFControl {

    @C09CT("feed_icon_saf_enable")
    public final boolean feedIconSafEnable;

    @C09CT("inbox_saf_enable")
    public final boolean inboxSafEnable;

    @C09CT("search_ask_tako_saf_enable")
    public final boolean searchAskTakoSafEnable;

    @C09CT("search_middle_button_enable")
    public final boolean searchMiddleButtonEnable;

    @C09CT("search_tab_saf_enable")
    public final boolean searchTabSafEnable;

    @C09CT("search_top1_saf_enable")
    public final boolean searchTop1SafEnable;

    public TakoSAFControl() {
        this(false, false, false, false, false, false);
    }

    public TakoSAFControl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.feedIconSafEnable = z;
        this.inboxSafEnable = z2;
        this.searchTabSafEnable = z3;
        this.searchTop1SafEnable = z4;
        this.searchAskTakoSafEnable = z5;
        this.searchMiddleButtonEnable = z6;
    }
}
