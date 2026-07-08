package com.ss.android.ugc.aweme.relation.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LinkPrivacyPopupStatusResponse extends BaseResponse {

    @C09CT("is_displayed_before")
    public boolean isDisplayedBefore;

    @C09CT("link_sug_switch_status")
    public Boolean linkSugSwitchStatus;

    @C09CT("should_display")
    public boolean shouldDisplay;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkPrivacyPopupStatusResponse)) {
            return false;
        }
        LinkPrivacyPopupStatusResponse linkPrivacyPopupStatusResponse = (LinkPrivacyPopupStatusResponse) obj;
        return this.shouldDisplay == linkPrivacyPopupStatusResponse.shouldDisplay && Intrinsics.LJFF(this.linkSugSwitchStatus, linkPrivacyPopupStatusResponse.linkSugSwitchStatus) && this.isDisplayedBefore == linkPrivacyPopupStatusResponse.isDisplayedBefore;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.shouldDisplay) * 31;
        Boolean bool = this.linkSugSwitchStatus;
        return ((iZ2 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.isDisplayedBefore);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkPrivacyPopupStatusResponse(shouldDisplay=");
        sbLIZ.append(this.shouldDisplay);
        sbLIZ.append(", linkSugSwitchStatus=");
        sbLIZ.append(this.linkSugSwitchStatus);
        sbLIZ.append(", isDisplayedBefore=");
        sbLIZ.append(this.isDisplayedBefore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LinkPrivacyPopupStatusResponse(boolean z, Boolean bool, boolean z2) {
        this.shouldDisplay = z;
        this.linkSugSwitchStatus = bool;
        this.isDisplayedBefore = z2;
    }
}
