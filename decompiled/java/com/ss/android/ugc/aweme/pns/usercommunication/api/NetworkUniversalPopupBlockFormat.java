package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class NetworkUniversalPopupBlockFormat implements Serializable {

    @C09CT("corner_positions")
    public final String cornerPosition;

    @C09CT("corner_radius")
    public final int cornerRadius;

    @C09CT("margin_bottom")
    public final int marginBottom;

    @C09CT("margin_left")
    public final int marginLeft;

    @C09CT("margin_right")
    public final int marginRight;

    @C09CT("margin_top")
    public final int marginTop;

    @C09CT("padding_bottom")
    public final int paddingBottom;

    @C09CT("padding_left")
    public final int paddingLeft;

    @C09CT("padding_right")
    public final int paddingRight;

    @C09CT("padding_top")
    public final int paddingTop;

    public NetworkUniversalPopupBlockFormat() {
        this(32, 32, 0, 0, 0, 0, 0, 0, -1, "all");
    }

    public NetworkUniversalPopupBlockFormat(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str) {
        this.marginLeft = i;
        this.marginRight = i2;
        this.marginTop = i3;
        this.marginBottom = i4;
        this.paddingLeft = i5;
        this.paddingRight = i6;
        this.paddingTop = i7;
        this.paddingBottom = i8;
        this.cornerRadius = i9;
        this.cornerPosition = str;
    }
}
