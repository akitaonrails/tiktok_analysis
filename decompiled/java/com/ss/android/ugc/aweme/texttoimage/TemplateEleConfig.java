package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateEleConfig {
    public transient String LIZ;

    @C09CT("ele_type")
    public final Integer eleType;

    @C09CT("offset_x")
    public final Float offsetX;

    @C09CT("offset_y")
    public final Float offsetY;

    @C09CT("size_height")
    public final Float sizeHeight;

    @C09CT("size_width")
    public final Float sizeWidth;

    @C09CT("text_align_type")
    public final Integer textAlignType;

    @C09CT("top_body_ele_config")
    public final TopBodyEleConfig topBodyEleConfig;

    @C09CT("url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateEleConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateEleConfig)) {
            return false;
        }
        TemplateEleConfig templateEleConfig = (TemplateEleConfig) obj;
        return Intrinsics.LJFF(this.eleType, templateEleConfig.eleType) && Intrinsics.LJFF(this.offsetX, templateEleConfig.offsetX) && Intrinsics.LJFF(this.offsetY, templateEleConfig.offsetY) && Intrinsics.LJFF(this.sizeWidth, templateEleConfig.sizeWidth) && Intrinsics.LJFF(this.sizeHeight, templateEleConfig.sizeHeight) && Intrinsics.LJFF(this.url, templateEleConfig.url) && Intrinsics.LJFF(this.textAlignType, templateEleConfig.textAlignType) && Intrinsics.LJFF(this.topBodyEleConfig, templateEleConfig.topBodyEleConfig) && Intrinsics.LJFF(this.LIZ, templateEleConfig.LIZ);
    }

    public final int hashCode() {
        Integer num = this.eleType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.offsetX;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.offsetY;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.sizeWidth;
        int iHashCode4 = (iHashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.sizeHeight;
        int iHashCode5 = (iHashCode4 + (f4 == null ? 0 : f4.hashCode())) * 31;
        String str = this.url;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.textAlignType;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        TopBodyEleConfig topBodyEleConfig = this.topBodyEleConfig;
        return ((iHashCode7 + (topBodyEleConfig != null ? topBodyEleConfig.hashCode() : 0)) * 31) + this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateEleConfig(eleType=");
        sbLIZ.append(this.eleType);
        sbLIZ.append(", offsetX=");
        sbLIZ.append(this.offsetX);
        sbLIZ.append(", offsetY=");
        sbLIZ.append(this.offsetY);
        sbLIZ.append(", sizeWidth=");
        sbLIZ.append(this.sizeWidth);
        sbLIZ.append(", sizeHeight=");
        sbLIZ.append(this.sizeHeight);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", textAlignType=");
        sbLIZ.append(this.textAlignType);
        sbLIZ.append(", topBodyEleConfig=");
        sbLIZ.append(this.topBodyEleConfig);
        sbLIZ.append(", stickerPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TemplateEleConfig(Integer num, Float f, Float f2, Float f3, Float f4, String str, Integer num2, TopBodyEleConfig topBodyEleConfig, String str2) {
        this.eleType = num;
        this.offsetX = f;
        this.offsetY = f2;
        this.sizeWidth = f3;
        this.sizeHeight = f4;
        this.url = str;
        this.textAlignType = num2;
        this.topBodyEleConfig = topBodyEleConfig;
        this.LIZ = str2;
    }

    public /* synthetic */ TemplateEleConfig(Integer num, Float f, Float f2, Float f3, Float f4, String str, Integer num2, TopBodyEleConfig topBodyEleConfig, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : f3, (i & 16) != 0 ? null : f4, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : num2, (i & 128) == 0 ? topBodyEleConfig : null, (i & 256) != 0 ? "" : str2);
    }
}
