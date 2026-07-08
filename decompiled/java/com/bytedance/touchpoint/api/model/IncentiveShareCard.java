package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class IncentiveShareCard extends C1893670zNV {

    @C09CT("background_colors")
    public final List<String> backgroundColors;

    @C09CT("cover_background_color")
    public final String coverBackgroundColor;

    @C09CT("detail_button")
    public final FeedButton detailButton;

    @C09CT("notification_id")
    public final String notificationId;

    @C09CT("notification_name")
    public final String notificationName;

    @C09CT("share_button")
    public final FeedButton shareButton;

    @C09CT("title")
    public final Title title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveShareCard)) {
            return false;
        }
        IncentiveShareCard incentiveShareCard = (IncentiveShareCard) obj;
        return Intrinsics.LJFF(this.notificationId, incentiveShareCard.notificationId) && Intrinsics.LJFF(this.notificationName, incentiveShareCard.notificationName) && Intrinsics.LJFF(this.backgroundColors, incentiveShareCard.backgroundColors) && Intrinsics.LJFF(this.coverBackgroundColor, incentiveShareCard.coverBackgroundColor) && Intrinsics.LJFF(this.title, incentiveShareCard.title) && Intrinsics.LJFF(this.shareButton, incentiveShareCard.shareButton) && Intrinsics.LJFF(this.detailButton, incentiveShareCard.detailButton);
    }

    public final int hashCode() {
        String str = this.notificationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notificationName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.backgroundColors;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.coverBackgroundColor;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Title title = this.title;
        int iHashCode5 = (iHashCode4 + (title == null ? 0 : title.hashCode())) * 31;
        FeedButton feedButton = this.shareButton;
        int iHashCode6 = (iHashCode5 + (feedButton == null ? 0 : feedButton.hashCode())) * 31;
        FeedButton feedButton2 = this.detailButton;
        return iHashCode6 + (feedButton2 != null ? feedButton2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveShareCard(notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(", notificationName=");
        sbLIZ.append(this.notificationName);
        sbLIZ.append(", backgroundColors=");
        sbLIZ.append(this.backgroundColors);
        sbLIZ.append(", coverBackgroundColor=");
        sbLIZ.append(this.coverBackgroundColor);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", shareButton=");
        sbLIZ.append(this.shareButton);
        sbLIZ.append(", detailButton=");
        sbLIZ.append(this.detailButton);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IncentiveShareCard(String str, String str2, List<String> list, String str3, Title title, FeedButton feedButton, FeedButton feedButton2) {
        this.notificationId = str;
        this.notificationName = str2;
        this.backgroundColors = list;
        this.coverBackgroundColor = str3;
        this.title = title;
        this.shareButton = feedButton;
        this.detailButton = feedButton2;
    }
}
