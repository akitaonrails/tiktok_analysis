package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC19402510vX;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviAutoCreationState implements C004I {
    public boolean autoCreationComplete;
    public boolean isBackPressed;
    public boolean isCreateProfileImage;
    public ProfileNaviDataModel profileNaviDataModel;
    public final InterfaceC19402510vX selectedSkintone;
    public Bitmap selfieBitmap;
    public boolean shouldShowSkintoneSelectFragment;

    public ProfileNaviAutoCreationState() {
        this(false, null, false, false, false, null, null);
    }

    public final ProfileNaviAutoCreationState copy(boolean z, Bitmap bitmap, boolean z2, boolean z3, boolean z4, ProfileNaviDataModel profileNaviDataModel, InterfaceC19402510vX interfaceC19402510vX) {
        return new ProfileNaviAutoCreationState(z, bitmap, z2, z3, z4, profileNaviDataModel, interfaceC19402510vX);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviAutoCreationState)) {
            return false;
        }
        ProfileNaviAutoCreationState profileNaviAutoCreationState = (ProfileNaviAutoCreationState) obj;
        return this.isCreateProfileImage == profileNaviAutoCreationState.isCreateProfileImage && Intrinsics.LJFF(this.selfieBitmap, profileNaviAutoCreationState.selfieBitmap) && this.shouldShowSkintoneSelectFragment == profileNaviAutoCreationState.shouldShowSkintoneSelectFragment && this.isBackPressed == profileNaviAutoCreationState.isBackPressed && this.autoCreationComplete == profileNaviAutoCreationState.autoCreationComplete && Intrinsics.LJFF(this.profileNaviDataModel, profileNaviAutoCreationState.profileNaviDataModel) && Intrinsics.LJFF(this.selectedSkintone, profileNaviAutoCreationState.selectedSkintone);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isCreateProfileImage) * 31;
        Bitmap bitmap = this.selfieBitmap;
        int iHashCode = (((((((iZ2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + C786410Ut5.Z2(this.shouldShowSkintoneSelectFragment)) * 31) + C786410Ut5.Z2(this.isBackPressed)) * 31) + C786410Ut5.Z2(this.autoCreationComplete)) * 31;
        ProfileNaviDataModel profileNaviDataModel = this.profileNaviDataModel;
        int iHashCode2 = (iHashCode + (profileNaviDataModel == null ? 0 : profileNaviDataModel.hashCode())) * 31;
        InterfaceC19402510vX interfaceC19402510vX = this.selectedSkintone;
        return iHashCode2 + (interfaceC19402510vX != null ? interfaceC19402510vX.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviAutoCreationState(isCreateProfileImage=");
        sbLIZ.append(this.isCreateProfileImage);
        sbLIZ.append(", selfieBitmap=");
        sbLIZ.append(this.selfieBitmap);
        sbLIZ.append(", shouldShowSkintoneSelectFragment=");
        sbLIZ.append(this.shouldShowSkintoneSelectFragment);
        sbLIZ.append(", isBackPressed=");
        sbLIZ.append(this.isBackPressed);
        sbLIZ.append(", autoCreationComplete=");
        sbLIZ.append(this.autoCreationComplete);
        sbLIZ.append(", profileNaviDataModel=");
        sbLIZ.append(this.profileNaviDataModel);
        sbLIZ.append(", selectedSkintone=");
        sbLIZ.append(this.selectedSkintone);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getAutoCreationComplete() {
        return this.autoCreationComplete;
    }

    public final ProfileNaviDataModel getProfileNaviDataModel() {
        return this.profileNaviDataModel;
    }

    public final InterfaceC19402510vX getSelectedSkintone() {
        return this.selectedSkintone;
    }

    public final Bitmap getSelfieBitmap() {
        return this.selfieBitmap;
    }

    public final boolean getShouldShowSkintoneSelectFragment() {
        return this.shouldShowSkintoneSelectFragment;
    }

    public final boolean isBackPressed() {
        return this.isBackPressed;
    }

    public final boolean isCreateProfileImage() {
        return this.isCreateProfileImage;
    }

    public final void setAutoCreationComplete(boolean z) {
        this.autoCreationComplete = z;
    }

    public final void setBackPressed(boolean z) {
        this.isBackPressed = z;
    }

    public final void setCreateProfileImage(boolean z) {
        this.isCreateProfileImage = z;
    }

    public final void setProfileNaviDataModel(ProfileNaviDataModel profileNaviDataModel) {
        this.profileNaviDataModel = profileNaviDataModel;
    }

    public final void setSelfieBitmap(Bitmap bitmap) {
        this.selfieBitmap = bitmap;
    }

    public final void setShouldShowSkintoneSelectFragment(boolean z) {
        this.shouldShowSkintoneSelectFragment = z;
    }

    public ProfileNaviAutoCreationState(boolean z, Bitmap bitmap, boolean z2, boolean z3, boolean z4, ProfileNaviDataModel profileNaviDataModel, InterfaceC19402510vX interfaceC19402510vX) {
        this.isCreateProfileImage = z;
        this.selfieBitmap = bitmap;
        this.shouldShowSkintoneSelectFragment = z2;
        this.isBackPressed = z3;
        this.autoCreationComplete = z4;
        this.profileNaviDataModel = profileNaviDataModel;
        this.selectedSkintone = interfaceC19402510vX;
    }
}
