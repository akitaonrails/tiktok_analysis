package com.ss.android.ugc.aweme.component.dualbuttons;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleDualButtonData implements Serializable {
    public static final int $stable = 8;

    @C09CT("left_button")
    public final ButtonData leftButton;

    @C09CT("right_button")
    public final ButtonData rightButton;

    public AnoleDualButtonData() {
        this(null, null);
    }

    public AnoleDualButtonData(ButtonData buttonData, ButtonData buttonData2) {
        this.leftButton = buttonData;
        this.rightButton = buttonData2;
    }
}
