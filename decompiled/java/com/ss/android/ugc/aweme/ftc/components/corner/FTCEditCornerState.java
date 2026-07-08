package com.ss.android.ugc.aweme.ftc.components.corner;

import X.AbstractC194560119y;
import X.C194561119z;
import X.C2188811AlT;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class FTCEditCornerState extends UiState {
    public static final int $stable = 8;
    public final Integer bottomMargin;
    public final Boolean cornerVisible;
    public final Integer topMargin;
    public final AbstractC194560119y ui;

    public FTCEditCornerState() {
        this(null, null, null, new C194561119z());
    }

    public final FTCEditCornerState copy(Boolean bool, Integer num, Integer num2, AbstractC194560119y abstractC194560119y) {
        return new FTCEditCornerState(bool, num, num2, abstractC194560119y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditCornerState)) {
            return false;
        }
        FTCEditCornerState fTCEditCornerState = (FTCEditCornerState) obj;
        return Intrinsics.LJFF(this.cornerVisible, fTCEditCornerState.cornerVisible) && Intrinsics.LJFF(this.topMargin, fTCEditCornerState.topMargin) && Intrinsics.LJFF(this.bottomMargin, fTCEditCornerState.bottomMargin) && Intrinsics.LJFF(this.ui, fTCEditCornerState.ui);
    }

    public int hashCode() {
        Boolean bool = this.cornerVisible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.topMargin;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bottomMargin;
        return ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.ui.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FTCEditCornerState(cornerVisible=");
        sbLIZ.append(this.cornerVisible);
        sbLIZ.append(", topMargin=");
        sbLIZ.append(this.topMargin);
        sbLIZ.append(", bottomMargin=");
        sbLIZ.append(this.bottomMargin);
        sbLIZ.append(", ui=");
        sbLIZ.append(this.ui);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    public final Boolean getCornerVisible() {
        return this.cornerVisible;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC194560119y getUi() {
        return this.ui;
    }

    public FTCEditCornerState(Boolean bool, Integer num, Integer num2, AbstractC194560119y abstractC194560119y) {
        super(abstractC194560119y);
        this.cornerVisible = bool;
        this.topMargin = num;
        this.bottomMargin = num2;
        this.ui = abstractC194560119y;
    }
}
