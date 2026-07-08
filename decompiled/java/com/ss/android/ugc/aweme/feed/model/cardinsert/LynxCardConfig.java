package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LynxCardConfig implements Serializable {

    @C09CT("action_button")
    public ActionButton actionButton;

    @C09CT("background")
    public Background background;

    @C09CT("card_layout")
    public CardLayout cardLayout;

    @C09CT("dislike_button")
    public DislikeButton dislikeButton;

    @C09CT("lynx_card_reserve")
    public String lynxCardReserve;

    public LynxCardConfig() {
        this(null, null, null, null, "");
    }

    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    public final Background getBackground() {
        return this.background;
    }

    public final CardLayout getCardLayout() {
        return this.cardLayout;
    }

    public final DislikeButton getDislikeButton() {
        return this.dislikeButton;
    }

    public final String getLynxCardReserve() {
        return this.lynxCardReserve;
    }

    public final void setActionButton(ActionButton actionButton) {
        this.actionButton = actionButton;
    }

    public final void setBackground(Background background) {
        this.background = background;
    }

    public final void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    public final void setDislikeButton(DislikeButton dislikeButton) {
        this.dislikeButton = dislikeButton;
    }

    public final void setLynxCardReserve(String str) {
        this.lynxCardReserve = str;
    }

    public LynxCardConfig(Background background, ActionButton actionButton, DislikeButton dislikeButton, CardLayout cardLayout, String str) {
        this.background = background;
        this.actionButton = actionButton;
        this.dislikeButton = dislikeButton;
        this.cardLayout = cardLayout;
        this.lynxCardReserve = str;
    }
}
