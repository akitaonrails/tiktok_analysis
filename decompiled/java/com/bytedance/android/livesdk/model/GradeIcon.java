package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes36.dex */
public class GradeIcon {

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("icon_diamond")
    public int iconDiamond;

    @C09CT("level")
    public int level;

    @C09CT("level_str")
    public String levelStr;

    public final int hashCode() {
        String str = this.levelStr;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.iconDiamond) * 31;
        ImageModel imageModel = this.icon;
        return ((iHashCode + (imageModel != null ? imageModel.hashCode() : 0)) * 31) + this.level;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GradeIcon gradeIcon = (GradeIcon) obj;
        if (this.iconDiamond != gradeIcon.iconDiamond || this.level != gradeIcon.level) {
            return false;
        }
        String str = this.levelStr;
        if (str != null) {
            if (!str.equals(gradeIcon.levelStr)) {
                return false;
            }
        } else if (gradeIcon.levelStr != null) {
            return false;
        }
        ImageModel imageModel = this.icon;
        ImageModel imageModel2 = gradeIcon.icon;
        if (imageModel != null) {
            return imageModel.equals(imageModel2);
        }
        if (imageModel2 == null) {
            return true;
        }
        return false;
    }
}
