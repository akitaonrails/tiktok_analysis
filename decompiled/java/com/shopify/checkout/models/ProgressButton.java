package com.shopify.checkout.models;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class ProgressButton {

    @C09CT("stage")
    public final ProgressButtonStage stage;

    @C09CT("state")
    public final ProgressButtonState state;

    public ProgressButton(ProgressButtonState progressButtonState, ProgressButtonStage progressButtonStage) {
        this.state = progressButtonState;
        this.stage = progressButtonStage;
    }
}
