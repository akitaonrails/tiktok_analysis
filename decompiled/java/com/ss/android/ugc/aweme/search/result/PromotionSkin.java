package com.ss.android.ugc.aweme.search.result;

import X.C09CT;
import X.C0QOD;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.model.ThemeColor;
import com.ss.android.ugc.aweme.search.model.ThemeImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class PromotionSkin extends C0QOD {

    @C09CT("full_color")
    public final ThemeColor fullColor;

    @C09CT("full_image")
    public final ThemeImage fullImage;

    @C09CT("search_box_style_type")
    public final Integer searchBoxStyleType;

    @C09CT("task_id")
    public final String taskId;

    public PromotionSkin() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionSkin)) {
            return false;
        }
        PromotionSkin promotionSkin = (PromotionSkin) obj;
        return Intrinsics.LJFF(this.fullImage, promotionSkin.fullImage) && Intrinsics.LJFF(this.fullColor, promotionSkin.fullColor) && Intrinsics.LJFF(this.searchBoxStyleType, promotionSkin.searchBoxStyleType) && Intrinsics.LJFF(this.taskId, promotionSkin.taskId);
    }

    public final int hashCode() {
        ThemeImage themeImage = this.fullImage;
        int iHashCode = (themeImage == null ? 0 : themeImage.hashCode()) * 31;
        ThemeColor themeColor = this.fullColor;
        int iHashCode2 = (iHashCode + (themeColor == null ? 0 : themeColor.hashCode())) * 31;
        Integer num = this.searchBoxStyleType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.taskId;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionSkin(fullImage=");
        sbLIZ.append(this.fullImage);
        sbLIZ.append(", fullColor=");
        sbLIZ.append(this.fullColor);
        sbLIZ.append(", searchBoxStyleType=");
        sbLIZ.append(this.searchBoxStyleType);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PromotionSkin(ThemeImage themeImage, ThemeColor themeColor, Integer num, String str) {
        this.fullImage = themeImage;
        this.fullColor = themeColor;
        this.searchBoxStyleType = num;
        this.taskId = str;
    }
}
