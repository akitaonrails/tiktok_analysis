package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IndependentAppBubbleItem {

    @C09CT("app_name")
    public final String appName;

    @C09CT("bottom_banner_frequency_control")
    public final BottomBannerFrequencyControl bottomBannerFrequencyControl;

    @C09CT("bottom_card_banner_image_url")
    public final String bottomCardBannerImageUrl;

    @C09CT("bubble_id")
    public final String bubbleId;

    @C09CT("bubble_tail_frequency_control")
    public final BubbleTailFrequencyControl bubbleTailFrequencyControl;

    @C09CT("locked_bubble_open_schema")
    public final String lockedBubbleOpenSchema;

    @C09CT("tail_text_color")
    public final String tailTextColor;

    public IndependentAppBubbleItem() {
        this(null, "", "", "", "", null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndependentAppBubbleItem)) {
            return false;
        }
        IndependentAppBubbleItem independentAppBubbleItem = (IndependentAppBubbleItem) obj;
        return Intrinsics.LJFF(this.appName, independentAppBubbleItem.appName) && Intrinsics.LJFF(this.bubbleId, independentAppBubbleItem.bubbleId) && Intrinsics.LJFF(this.bottomCardBannerImageUrl, independentAppBubbleItem.bottomCardBannerImageUrl) && Intrinsics.LJFF(this.lockedBubbleOpenSchema, independentAppBubbleItem.lockedBubbleOpenSchema) && Intrinsics.LJFF(this.tailTextColor, independentAppBubbleItem.tailTextColor) && Intrinsics.LJFF(this.bottomBannerFrequencyControl, independentAppBubbleItem.bottomBannerFrequencyControl) && Intrinsics.LJFF(this.bubbleTailFrequencyControl, independentAppBubbleItem.bubbleTailFrequencyControl);
    }

    public int hashCode() {
        String str = this.appName;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.bubbleId.hashCode()) * 31) + this.bottomCardBannerImageUrl.hashCode()) * 31) + this.lockedBubbleOpenSchema.hashCode()) * 31) + this.tailTextColor.hashCode()) * 31;
        BottomBannerFrequencyControl bottomBannerFrequencyControl = this.bottomBannerFrequencyControl;
        int iHashCode2 = (iHashCode + (bottomBannerFrequencyControl == null ? 0 : bottomBannerFrequencyControl.hashCode())) * 31;
        BubbleTailFrequencyControl bubbleTailFrequencyControl = this.bubbleTailFrequencyControl;
        return iHashCode2 + (bubbleTailFrequencyControl != null ? bubbleTailFrequencyControl.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IndependentAppBubbleItem(appName=");
        sbLIZ.append(this.appName);
        sbLIZ.append(", bubbleId=");
        sbLIZ.append(this.bubbleId);
        sbLIZ.append(", bottomCardBannerImageUrl=");
        sbLIZ.append(this.bottomCardBannerImageUrl);
        sbLIZ.append(", lockedBubbleOpenSchema=");
        sbLIZ.append(this.lockedBubbleOpenSchema);
        sbLIZ.append(", tailTextColor=");
        sbLIZ.append(this.tailTextColor);
        sbLIZ.append(", bottomBannerFrequencyControl=");
        sbLIZ.append(this.bottomBannerFrequencyControl);
        sbLIZ.append(", bubbleTailFrequencyControl=");
        sbLIZ.append(this.bubbleTailFrequencyControl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IndependentAppBubbleItem(String str, String str2, String str3, String str4, String str5, BottomBannerFrequencyControl bottomBannerFrequencyControl, BubbleTailFrequencyControl bubbleTailFrequencyControl) {
        this.appName = str;
        this.bubbleId = str2;
        this.bottomCardBannerImageUrl = str3;
        this.lockedBubbleOpenSchema = str4;
        this.tailTextColor = str5;
        this.bottomBannerFrequencyControl = bottomBannerFrequencyControl;
        this.bubbleTailFrequencyControl = bubbleTailFrequencyControl;
    }
}
