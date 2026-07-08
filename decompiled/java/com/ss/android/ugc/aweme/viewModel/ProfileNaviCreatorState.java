package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.C110P;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviCreatorState implements C004I {
    public boolean isBackPressed;
    public boolean isContinueEditing;
    public boolean isDoneCreatingProfileImage;
    public C110P newWorkRequest;
    public String profileImageBackgroundColor;
    public boolean shouldShowSetProfileView;

    public ProfileNaviCreatorState() {
        this(null, false, false, false, false, null);
    }

    public final C110P component6() {
        return null;
    }

    public final ProfileNaviCreatorState copy(String str, boolean z, boolean z2, boolean z3, boolean z4, C110P c110p) {
        return new ProfileNaviCreatorState(str, z, z2, z3, z4, c110p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviCreatorState)) {
            return false;
        }
        ProfileNaviCreatorState profileNaviCreatorState = (ProfileNaviCreatorState) obj;
        return Intrinsics.LJFF(this.profileImageBackgroundColor, profileNaviCreatorState.profileImageBackgroundColor) && this.isDoneCreatingProfileImage == profileNaviCreatorState.isDoneCreatingProfileImage && this.isBackPressed == profileNaviCreatorState.isBackPressed && this.isContinueEditing == profileNaviCreatorState.isContinueEditing && this.shouldShowSetProfileView == profileNaviCreatorState.shouldShowSetProfileView && Intrinsics.LJFF(null, null);
    }

    public final C110P getNewWorkRequest() {
        return null;
    }

    public int hashCode() {
        String str = this.profileImageBackgroundColor;
        return (((((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.isDoneCreatingProfileImage)) * 31) + C786410Ut5.Z2(this.isBackPressed)) * 31) + C786410Ut5.Z2(this.isContinueEditing)) * 31) + C786410Ut5.Z2(this.shouldShowSetProfileView)) * 31;
    }

    public final void setNewWorkRequest(C110P c110p) {
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviCreatorState(profileImageBackgroundColor=");
        sbLIZ.append(this.profileImageBackgroundColor);
        sbLIZ.append(", isDoneCreatingProfileImage=");
        sbLIZ.append(this.isDoneCreatingProfileImage);
        sbLIZ.append(", isBackPressed=");
        sbLIZ.append(this.isBackPressed);
        sbLIZ.append(", isContinueEditing=");
        sbLIZ.append(this.isContinueEditing);
        sbLIZ.append(", shouldShowSetProfileView=");
        sbLIZ.append(this.shouldShowSetProfileView);
        sbLIZ.append(", newWorkRequest=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getProfileImageBackgroundColor() {
        return this.profileImageBackgroundColor;
    }

    public final boolean getShouldShowSetProfileView() {
        return this.shouldShowSetProfileView;
    }

    public final boolean isBackPressed() {
        return this.isBackPressed;
    }

    public final boolean isContinueEditing() {
        return this.isContinueEditing;
    }

    public final boolean isDoneCreatingProfileImage() {
        return this.isDoneCreatingProfileImage;
    }

    public final void setBackPressed(boolean z) {
        this.isBackPressed = z;
    }

    public final void setContinueEditing(boolean z) {
        this.isContinueEditing = z;
    }

    public final void setDoneCreatingProfileImage(boolean z) {
        this.isDoneCreatingProfileImage = z;
    }

    public final void setProfileImageBackgroundColor(String str) {
        this.profileImageBackgroundColor = str;
    }

    public final void setShouldShowSetProfileView(boolean z) {
        this.shouldShowSetProfileView = z;
    }

    public ProfileNaviCreatorState(String str, boolean z, boolean z2, boolean z3, boolean z4, C110P c110p) {
        this.profileImageBackgroundColor = str;
        this.isDoneCreatingProfileImage = z;
        this.isBackPressed = z2;
        this.isContinueEditing = z3;
        this.shouldShowSetProfileView = z4;
    }
}
