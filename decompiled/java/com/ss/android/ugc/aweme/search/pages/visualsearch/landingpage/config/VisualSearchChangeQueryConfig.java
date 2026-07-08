package com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.config;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class VisualSearchChangeQueryConfig {

    @C09CT("circle_enable")
    public final int circleEnable;

    @C09CT("click_drag_enable")
    public final int clickDragEnable;

    @C09CT("panel_height_ratio")
    public final float panelHeightRatio;

    @C09CT("select_box_enable")
    public final int selectBoxEnable;

    @C09CT("switch_tab_enable")
    public final int switchTabEnable;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualSearchChangeQueryConfig)) {
            return false;
        }
        VisualSearchChangeQueryConfig visualSearchChangeQueryConfig = (VisualSearchChangeQueryConfig) obj;
        return Float.compare(this.panelHeightRatio, visualSearchChangeQueryConfig.panelHeightRatio) == 0 && this.circleEnable == visualSearchChangeQueryConfig.circleEnable && this.clickDragEnable == visualSearchChangeQueryConfig.clickDragEnable && this.selectBoxEnable == visualSearchChangeQueryConfig.selectBoxEnable && this.switchTabEnable == visualSearchChangeQueryConfig.switchTabEnable;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualSearchChangeQueryConfig(panelHeightRatio=");
        sbLIZ.append(this.panelHeightRatio);
        sbLIZ.append(", circleEnable=");
        sbLIZ.append(this.circleEnable);
        sbLIZ.append(", clickDragEnable=");
        sbLIZ.append(this.clickDragEnable);
        sbLIZ.append(", selectBoxEnable=");
        sbLIZ.append(this.selectBoxEnable);
        sbLIZ.append(", switchTabEnable=");
        sbLIZ.append(this.switchTabEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VisualSearchChangeQueryConfig() {
        this(-1.0f, 0, 0, 0, 0);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.panelHeightRatio) * 31) + this.circleEnable) * 31) + this.clickDragEnable) * 31) + this.selectBoxEnable) * 31) + this.switchTabEnable;
    }

    public VisualSearchChangeQueryConfig(float f, int i, int i2, int i3, int i4) {
        this.panelHeightRatio = f;
        this.circleEnable = i;
        this.clickDragEnable = i2;
        this.selectBoxEnable = i3;
        this.switchTabEnable = i4;
    }
}
