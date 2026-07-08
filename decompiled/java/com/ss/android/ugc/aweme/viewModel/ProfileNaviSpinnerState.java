package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes29.dex */
public final class ProfileNaviSpinnerState implements C004I {
    public boolean shouldShowSpinner;

    public ProfileNaviSpinnerState() {
        this(false);
    }

    public final ProfileNaviSpinnerState copy(boolean z) {
        return new ProfileNaviSpinnerState(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileNaviSpinnerState) && this.shouldShowSpinner == ((ProfileNaviSpinnerState) obj).shouldShowSpinner;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.shouldShowSpinner);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviSpinnerState(shouldShowSpinner=");
        sbLIZ.append(this.shouldShowSpinner);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getShouldShowSpinner() {
        return this.shouldShowSpinner;
    }

    public ProfileNaviSpinnerState(boolean z) {
        this.shouldShowSpinner = z;
    }

    public final void setShouldShowSpinner(boolean z) {
        this.shouldShowSpinner = z;
    }
}
