package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ButtonAction implements Serializable {

    @C09CT("payload")
    public final ButtonActionPayload payload;

    @C09CT("style")
    public final Integer style;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;

    public ButtonAction() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonAction)) {
            return false;
        }
        ButtonAction buttonAction = (ButtonAction) obj;
        return Intrinsics.LJFF(this.text, buttonAction.text) && Intrinsics.LJFF(this.type, buttonAction.type) && Intrinsics.LJFF(this.payload, buttonAction.payload) && Intrinsics.LJFF(this.style, buttonAction.style);
    }

    public ButtonAction(String str, Integer num, ButtonActionPayload buttonActionPayload, Integer num2) {
        this.text = str;
        this.type = num;
        this.payload = buttonActionPayload;
        this.style = num2;
    }
}
