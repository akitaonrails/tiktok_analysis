package com.ss.android.ugc.gamora.celebration;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PreloadConfig {
    public final String LIZ;

    @C09CT("landing_tab")
    public final String landing_tab;

    @C09CT("tab_style")
    public final TabStyleConfig tab_style;

    @C09CT("template_tab_style")
    public final TemplateTabStyleConfig template_tab_style;

    @C09CT("tooltip")
    public final TooltipConfig tooltip;

    public PreloadConfig() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadConfig)) {
            return false;
        }
        PreloadConfig preloadConfig = (PreloadConfig) obj;
        return Intrinsics.LJFF(this.landing_tab, preloadConfig.landing_tab) && Intrinsics.LJFF(this.tooltip, preloadConfig.tooltip) && Intrinsics.LJFF(this.tab_style, preloadConfig.tab_style) && Intrinsics.LJFF(this.template_tab_style, preloadConfig.template_tab_style) && Intrinsics.LJFF(this.LIZ, preloadConfig.LIZ);
    }

    public final int hashCode() {
        String str = this.landing_tab;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TooltipConfig tooltipConfig = this.tooltip;
        int iHashCode2 = (iHashCode + (tooltipConfig == null ? 0 : tooltipConfig.hashCode())) * 31;
        TabStyleConfig tabStyleConfig = this.tab_style;
        int iHashCode3 = (iHashCode2 + (tabStyleConfig == null ? 0 : tabStyleConfig.hashCode())) * 31;
        TemplateTabStyleConfig templateTabStyleConfig = this.template_tab_style;
        int iHashCode4 = (iHashCode3 + (templateTabStyleConfig == null ? 0 : templateTabStyleConfig.hashCode())) * 31;
        String str2 = this.LIZ;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadConfig(landing_tab=");
        sbLIZ.append(this.landing_tab);
        sbLIZ.append(", tooltip=");
        sbLIZ.append(this.tooltip);
        sbLIZ.append(", tab_style=");
        sbLIZ.append(this.tab_style);
        sbLIZ.append(", template_tab_style=");
        sbLIZ.append(this.template_tab_style);
        sbLIZ.append(", activity_id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadConfig(String str, TooltipConfig tooltipConfig, TabStyleConfig tabStyleConfig, TemplateTabStyleConfig templateTabStyleConfig, String str2) {
        this.landing_tab = str;
        this.tooltip = tooltipConfig;
        this.tab_style = tabStyleConfig;
        this.template_tab_style = templateTabStyleConfig;
        this.LIZ = str2;
    }

    public static PreloadConfig LIZ(PreloadConfig preloadConfig, TooltipConfig tooltipConfig, TabStyleConfig tabStyleConfig, TemplateTabStyleConfig templateTabStyleConfig, String str, int i) {
        String str2;
        String str3 = str;
        TemplateTabStyleConfig templateTabStyleConfig2 = templateTabStyleConfig;
        TabStyleConfig tabStyleConfig2 = tabStyleConfig;
        TooltipConfig tooltipConfig2 = tooltipConfig;
        if ((i & 1) != 0) {
            str2 = preloadConfig.landing_tab;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            tooltipConfig2 = preloadConfig.tooltip;
        }
        if ((i & 4) != 0) {
            tabStyleConfig2 = preloadConfig.tab_style;
        }
        if ((i & 8) != 0) {
            templateTabStyleConfig2 = preloadConfig.template_tab_style;
        }
        if ((i & 16) != 0) {
            str3 = preloadConfig.LIZ;
        }
        return new PreloadConfig(str2, tooltipConfig2, tabStyleConfig2, templateTabStyleConfig2, str3);
    }
}
