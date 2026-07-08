package com.ss.android.ugc.tiktok.privacy.api.phl.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PrivacyHighlightsForTeens {

    @C09CT("approve_info")
    public final PrivacyHighlightsForTeensApproveInfo approveInfo;

    @C09CT("page_button")
    public final String pageButton;

    @C09CT("page_description")
    public final PrivacyHighlightsForTeensDescription pageDesc;

    @C09CT("page_title")
    public final String pageTitle;

    @C09CT("video_list")
    public final List<PrivacyHighlightsForTeensVideo> videoList;

    public PrivacyHighlightsForTeens() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyHighlightsForTeens)) {
            return false;
        }
        PrivacyHighlightsForTeens privacyHighlightsForTeens = (PrivacyHighlightsForTeens) obj;
        return Intrinsics.LJFF(this.pageTitle, privacyHighlightsForTeens.pageTitle) && Intrinsics.LJFF(this.pageDesc, privacyHighlightsForTeens.pageDesc) && Intrinsics.LJFF(this.pageButton, privacyHighlightsForTeens.pageButton) && Intrinsics.LJFF(this.videoList, privacyHighlightsForTeens.videoList) && Intrinsics.LJFF(this.approveInfo, privacyHighlightsForTeens.approveInfo);
    }

    public final int hashCode() {
        return (((((((this.pageTitle.hashCode() * 31) + this.pageDesc.hashCode()) * 31) + this.pageButton.hashCode()) * 31) + this.videoList.hashCode()) * 31) + this.approveInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyHighlightsForTeens(pageTitle=");
        sbLIZ.append(this.pageTitle);
        sbLIZ.append(", pageDesc=");
        sbLIZ.append(this.pageDesc);
        sbLIZ.append(", pageButton=");
        sbLIZ.append(this.pageButton);
        sbLIZ.append(", videoList=");
        sbLIZ.append(this.videoList);
        sbLIZ.append(", approveInfo=");
        sbLIZ.append(this.approveInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyHighlightsForTeens(String str, PrivacyHighlightsForTeensDescription privacyHighlightsForTeensDescription, String str2, List<PrivacyHighlightsForTeensVideo> list, PrivacyHighlightsForTeensApproveInfo privacyHighlightsForTeensApproveInfo) {
        this.pageTitle = str;
        this.pageDesc = privacyHighlightsForTeensDescription;
        this.pageButton = str2;
        this.videoList = list;
        this.approveInfo = privacyHighlightsForTeensApproveInfo;
    }

    public PrivacyHighlightsForTeens(String str, PrivacyHighlightsForTeensDescription privacyHighlightsForTeensDescription, String str2, List list, PrivacyHighlightsForTeensApproveInfo privacyHighlightsForTeensApproveInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new PrivacyHighlightsForTeensDescription("", "", "") : privacyHighlightsForTeensDescription, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? new PrivacyHighlightsForTeensApproveInfo("", null, null, null, null) : privacyHighlightsForTeensApproveInfo);
    }
}
