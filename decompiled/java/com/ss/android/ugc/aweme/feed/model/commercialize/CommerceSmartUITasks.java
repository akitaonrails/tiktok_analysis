package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class CommerceSmartUITasks implements Serializable {

    @C09CT("learnmore_button_showtime")
    public int buttonShow = -1;

    @C09CT("learnmore_color_delay")
    public int colorDelay = -1;

    @C09CT("ad_cards")
    public int adCardDelay = -1;

    public final int getAdCardDelay() {
        return this.adCardDelay;
    }

    public final int getButtonShow() {
        return this.buttonShow;
    }

    public final int getColorDelay() {
        return this.colorDelay;
    }

    public final void setAdCardDelay(int i) {
        this.adCardDelay = i;
    }

    public final void setButtonShow(int i) {
        this.buttonShow = i;
    }

    public final void setColorDelay(int i) {
        this.colorDelay = i;
    }
}
