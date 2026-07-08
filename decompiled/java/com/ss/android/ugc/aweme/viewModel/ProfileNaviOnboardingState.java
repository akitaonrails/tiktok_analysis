package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.C19404010vm;
import X.C19424210z2;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviOnboardingState implements C004I {
    public boolean allowCameraFeature;
    public C19424210z2 onboardingStepState;
    public boolean shouldShowAutoCreation;
    public boolean shouldStartAutoCreation;
    public Integer starterAvatarId;
    public List<C19404010vm> starterAvatarList;
    public ProfileNaviDataModel starterAvatarSelected;

    public ProfileNaviOnboardingState() {
        this(new C19424210z2(null, 3), null, null, null, false, false, true);
    }

    public final ProfileNaviOnboardingState copy(C19424210z2 c19424210z2, List<C19404010vm> list, Integer num, ProfileNaviDataModel profileNaviDataModel, boolean z, boolean z2, boolean z3) {
        return new ProfileNaviOnboardingState(c19424210z2, list, num, profileNaviDataModel, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviOnboardingState)) {
            return false;
        }
        ProfileNaviOnboardingState profileNaviOnboardingState = (ProfileNaviOnboardingState) obj;
        return Intrinsics.LJFF(this.onboardingStepState, profileNaviOnboardingState.onboardingStepState) && Intrinsics.LJFF(this.starterAvatarList, profileNaviOnboardingState.starterAvatarList) && Intrinsics.LJFF(this.starterAvatarId, profileNaviOnboardingState.starterAvatarId) && Intrinsics.LJFF(this.starterAvatarSelected, profileNaviOnboardingState.starterAvatarSelected) && this.shouldStartAutoCreation == profileNaviOnboardingState.shouldStartAutoCreation && this.shouldShowAutoCreation == profileNaviOnboardingState.shouldShowAutoCreation && this.allowCameraFeature == profileNaviOnboardingState.allowCameraFeature;
    }

    public int hashCode() {
        int iHashCode = this.onboardingStepState.hashCode() * 31;
        List<C19404010vm> list = this.starterAvatarList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.starterAvatarId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ProfileNaviDataModel profileNaviDataModel = this.starterAvatarSelected;
        return ((((((iHashCode3 + (profileNaviDataModel != null ? profileNaviDataModel.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.shouldStartAutoCreation)) * 31) + C786410Ut5.Z2(this.shouldShowAutoCreation)) * 31) + C786410Ut5.Z2(this.allowCameraFeature);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviOnboardingState(onboardingStepState=");
        sbLIZ.append(this.onboardingStepState);
        sbLIZ.append(", starterAvatarList=");
        sbLIZ.append(this.starterAvatarList);
        sbLIZ.append(", starterAvatarId=");
        sbLIZ.append(this.starterAvatarId);
        sbLIZ.append(", starterAvatarSelected=");
        sbLIZ.append(this.starterAvatarSelected);
        sbLIZ.append(", shouldStartAutoCreation=");
        sbLIZ.append(this.shouldStartAutoCreation);
        sbLIZ.append(", shouldShowAutoCreation=");
        sbLIZ.append(this.shouldShowAutoCreation);
        sbLIZ.append(", allowCameraFeature=");
        sbLIZ.append(this.allowCameraFeature);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getAllowCameraFeature() {
        return this.allowCameraFeature;
    }

    public final C19424210z2 getOnboardingStepState() {
        return this.onboardingStepState;
    }

    public final boolean getShouldShowAutoCreation() {
        return this.shouldShowAutoCreation;
    }

    public final boolean getShouldStartAutoCreation() {
        return this.shouldStartAutoCreation;
    }

    public final Integer getStarterAvatarId() {
        return this.starterAvatarId;
    }

    public final List<C19404010vm> getStarterAvatarList() {
        return this.starterAvatarList;
    }

    public final ProfileNaviDataModel getStarterAvatarSelected() {
        return this.starterAvatarSelected;
    }

    public final void setAllowCameraFeature(boolean z) {
        this.allowCameraFeature = z;
    }

    public final void setOnboardingStepState(C19424210z2 c19424210z2) {
        this.onboardingStepState = c19424210z2;
    }

    public final void setShouldShowAutoCreation(boolean z) {
        this.shouldShowAutoCreation = z;
    }

    public final void setShouldStartAutoCreation(boolean z) {
        this.shouldStartAutoCreation = z;
    }

    public final void setStarterAvatarId(Integer num) {
        this.starterAvatarId = num;
    }

    public final void setStarterAvatarList(List<C19404010vm> list) {
        this.starterAvatarList = list;
    }

    public final void setStarterAvatarSelected(ProfileNaviDataModel profileNaviDataModel) {
        this.starterAvatarSelected = profileNaviDataModel;
    }

    public ProfileNaviOnboardingState(C19424210z2 c19424210z2, List<C19404010vm> list, Integer num, ProfileNaviDataModel profileNaviDataModel, boolean z, boolean z2, boolean z3) {
        this.onboardingStepState = c19424210z2;
        this.starterAvatarList = list;
        this.starterAvatarId = num;
        this.starterAvatarSelected = profileNaviDataModel;
        this.shouldStartAutoCreation = z;
        this.shouldShowAutoCreation = z2;
        this.allowCameraFeature = z3;
    }
}
