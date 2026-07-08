package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TitlePanelConfigs implements Serializable {

    @C09CT("anchors")
    public final List<TextMoreAnchor> anchors;

    @C09CT("enable")
    public final Integer enable;

    @C09CT("feed_optimise_enable")
    public final Integer feedOptimiseEnable;

    public TitlePanelConfigs() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitlePanelConfigs)) {
            return false;
        }
        TitlePanelConfigs titlePanelConfigs = (TitlePanelConfigs) obj;
        return Intrinsics.LJFF(this.enable, titlePanelConfigs.enable) && Intrinsics.LJFF(this.feedOptimiseEnable, titlePanelConfigs.feedOptimiseEnable) && Intrinsics.LJFF(this.anchors, titlePanelConfigs.anchors);
    }

    public int hashCode() {
        Integer num = this.enable;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.feedOptimiseEnable;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<TextMoreAnchor> list = this.anchors;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitlePanelConfigs(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", feedOptimiseEnable=");
        sbLIZ.append(this.feedOptimiseEnable);
        sbLIZ.append(", anchors=");
        sbLIZ.append(this.anchors);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TitlePanelConfigs(Integer num, Integer num2, List<TextMoreAnchor> list) {
        this.enable = num;
        this.feedOptimiseEnable = num2;
        this.anchors = list;
    }
}
