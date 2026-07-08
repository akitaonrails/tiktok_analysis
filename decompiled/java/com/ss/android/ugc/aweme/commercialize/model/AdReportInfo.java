package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdReportInfo implements Serializable {

    @C09CT("enable_ttplus_banner")
    public final boolean enableTTPlusBanner;

    @C09CT("ttplus_banner_guide")
    public final String ttplusBannerGuide;

    @C09CT("ttplus_banner_image")
    public final String ttplusBannerImage;

    @C09CT("ttplus_banner_open_schema")
    public final String ttplusBannerOpenSchema;

    @C09CT("ttplus_banner_title")
    public final String ttplusBannerTitle;

    public final AdReportInfo copy(boolean z, String str, String str2, String str3, String str4) {
        return new AdReportInfo(z, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdReportInfo)) {
            return false;
        }
        AdReportInfo adReportInfo = (AdReportInfo) obj;
        return this.enableTTPlusBanner == adReportInfo.enableTTPlusBanner && Intrinsics.LJFF(this.ttplusBannerImage, adReportInfo.ttplusBannerImage) && Intrinsics.LJFF(this.ttplusBannerTitle, adReportInfo.ttplusBannerTitle) && Intrinsics.LJFF(this.ttplusBannerGuide, adReportInfo.ttplusBannerGuide) && Intrinsics.LJFF(this.ttplusBannerOpenSchema, adReportInfo.ttplusBannerOpenSchema);
    }

    public int hashCode() {
        return (((((((C786410Ut5.Z2(this.enableTTPlusBanner) * 31) + this.ttplusBannerImage.hashCode()) * 31) + this.ttplusBannerTitle.hashCode()) * 31) + this.ttplusBannerGuide.hashCode()) * 31) + this.ttplusBannerOpenSchema.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdReportInfo(enableTTPlusBanner=");
        sbLIZ.append(this.enableTTPlusBanner);
        sbLIZ.append(", ttplusBannerImage=");
        sbLIZ.append(this.ttplusBannerImage);
        sbLIZ.append(", ttplusBannerTitle=");
        sbLIZ.append(this.ttplusBannerTitle);
        sbLIZ.append(", ttplusBannerGuide=");
        sbLIZ.append(this.ttplusBannerGuide);
        sbLIZ.append(", ttplusBannerOpenSchema=");
        sbLIZ.append(this.ttplusBannerOpenSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AdReportInfo() {
        this(false, "", "", "", "");
    }

    public AdReportInfo(boolean z, String str, String str2, String str3, String str4) {
        this.enableTTPlusBanner = z;
        this.ttplusBannerImage = str;
        this.ttplusBannerTitle = str2;
        this.ttplusBannerGuide = str3;
        this.ttplusBannerOpenSchema = str4;
    }
}
