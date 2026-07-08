package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.view.View;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class HeaderView implements Serializable {

    @C09CT("aspect_ratio")
    public double aspectRatio;

    @C09CT("bg_res_alpha")
    public float bgResAlpha;

    @C09CT("bg_res_id")
    public int bgResId;

    @C09CT("bg_res_name")
    public String bgResName;
    public transient View customizedView;

    @C09CT("customized_view_id")
    public String customizedViewId;

    @C09CT("height")
    public int height;

    @C09CT("top_margin_in_dp")
    public int topMarginInDp;

    @C09CT("width")
    public int width;

    public HeaderView() {
        this(-1, null, 0.2f, null, -1, -2, -1.0d, -1, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeaderView(bgResId=");
        sbLIZ.append(this.bgResId);
        sbLIZ.append(", bgResName=");
        sbLIZ.append(this.bgResName);
        sbLIZ.append(", bgResAlpha=");
        sbLIZ.append(this.bgResAlpha);
        sbLIZ.append(", customizedViewId=");
        sbLIZ.append(this.customizedViewId);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", aspectRatio=");
        sbLIZ.append(this.aspectRatio);
        sbLIZ.append(", topMarginInDp=");
        sbLIZ.append(this.topMarginInDp);
        sbLIZ.append(", customizedView=");
        sbLIZ.append(this.customizedView);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        int i = this.bgResId * 31;
        String str = this.bgResName;
        int iHashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + Float.floatToIntBits(this.bgResAlpha)) * 31;
        String str2 = this.customizedViewId;
        int iHashCode2 = (((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.X2(this.aspectRatio)) * 31) + this.topMarginInDp) * 31;
        View view = this.customizedView;
        return iHashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final void setAspectRatio(double d) {
        this.aspectRatio = d;
    }

    public final void setBgResAlpha(float f) {
        this.bgResAlpha = f;
    }

    public final void setBgResId(int i) {
        this.bgResId = i;
    }

    public final void setBgResName(String str) {
        this.bgResName = str;
    }

    public final void setCustomizedView(View view) {
        this.customizedView = view;
    }

    public final void setCustomizedViewId(String str) {
        this.customizedViewId = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setTopMarginInDp(int i) {
        this.topMarginInDp = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public HeaderView(int i, String str, float f, String str2, int i2, int i3, double d, int i4, View view) {
        this.bgResId = i;
        this.bgResName = str;
        this.bgResAlpha = f;
        this.customizedViewId = str2;
        this.width = i2;
        this.height = i3;
        this.aspectRatio = d;
        this.topMarginInDp = i4;
        this.customizedView = view;
    }
}
