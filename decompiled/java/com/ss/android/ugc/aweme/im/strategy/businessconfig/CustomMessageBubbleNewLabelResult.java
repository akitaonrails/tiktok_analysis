package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;
import X.C909890Zml;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class CustomMessageBubbleNewLabelResult extends IBusinessConfig {
    public static final C909890Zml Companion = new Object() { // from class: X.0Zml
    };

    @C09CT("guide_id")
    public final String id;

    @C09CT("image")
    public final String image;

    @C09CT("image_rtl")
    public final String imageRtl;

    @C09CT("max_display_count")
    public final Integer maxDisplayCount;

    public CustomMessageBubbleNewLabelResult() {
        this(null, null, null, null);
    }

    public final CustomMessageBubbleNewLabelResult copy(String str, String str2, String str3, Integer num) {
        return new CustomMessageBubbleNewLabelResult(str, str2, str3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomMessageBubbleNewLabelResult)) {
            return false;
        }
        CustomMessageBubbleNewLabelResult customMessageBubbleNewLabelResult = (CustomMessageBubbleNewLabelResult) obj;
        return Intrinsics.LJFF(this.id, customMessageBubbleNewLabelResult.id) && Intrinsics.LJFF(this.image, customMessageBubbleNewLabelResult.image) && Intrinsics.LJFF(this.imageRtl, customMessageBubbleNewLabelResult.imageRtl) && Intrinsics.LJFF(this.maxDisplayCount, customMessageBubbleNewLabelResult.maxDisplayCount);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageRtl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.maxDisplayCount;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomMessageBubbleNewLabelResult(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", imageRtl=");
        sbLIZ.append(this.imageRtl);
        sbLIZ.append(", maxDisplayCount=");
        sbLIZ.append(this.maxDisplayCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImageRtl() {
        return this.imageRtl;
    }

    public final Integer getMaxDisplayCount() {
        return this.maxDisplayCount;
    }

    public CustomMessageBubbleNewLabelResult(String str, String str2, String str3, Integer num) {
        this.id = str;
        this.image = str2;
        this.imageRtl = str3;
        this.maxDisplayCount = num;
    }
}
