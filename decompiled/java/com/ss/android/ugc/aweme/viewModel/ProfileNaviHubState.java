package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviHubState implements C004I {
    public boolean isContinueEditing;
    public boolean isDoneNaviExperience;
    public boolean isNaviDeleted;

    public ProfileNaviHubState() {
        this(false, false, false);
    }

    public final ProfileNaviHubState copy(boolean z, boolean z2, boolean z3) {
        return new ProfileNaviHubState(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviHubState)) {
            return false;
        }
        ProfileNaviHubState profileNaviHubState = (ProfileNaviHubState) obj;
        return this.isContinueEditing == profileNaviHubState.isContinueEditing && this.isDoneNaviExperience == profileNaviHubState.isDoneNaviExperience && this.isNaviDeleted == profileNaviHubState.isNaviDeleted;
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.isContinueEditing) * 31) + C786410Ut5.Z2(this.isDoneNaviExperience)) * 31) + C786410Ut5.Z2(this.isNaviDeleted);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviHubState(isContinueEditing=");
        sbLIZ.append(this.isContinueEditing);
        sbLIZ.append(", isDoneNaviExperience=");
        sbLIZ.append(this.isDoneNaviExperience);
        sbLIZ.append(", isNaviDeleted=");
        sbLIZ.append(this.isNaviDeleted);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isContinueEditing() {
        return this.isContinueEditing;
    }

    public final boolean isDoneNaviExperience() {
        return this.isDoneNaviExperience;
    }

    public final boolean isNaviDeleted() {
        return this.isNaviDeleted;
    }

    public final void setContinueEditing(boolean z) {
        this.isContinueEditing = z;
    }

    public final void setDoneNaviExperience(boolean z) {
        this.isDoneNaviExperience = z;
    }

    public final void setNaviDeleted(boolean z) {
        this.isNaviDeleted = z;
    }

    public ProfileNaviHubState(boolean z, boolean z2, boolean z3) {
        this.isContinueEditing = z;
        this.isDoneNaviExperience = z2;
        this.isNaviDeleted = z3;
    }
}
