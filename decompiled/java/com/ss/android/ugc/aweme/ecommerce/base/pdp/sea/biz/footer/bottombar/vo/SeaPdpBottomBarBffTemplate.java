package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaPdpBottomBarBffTemplate {

    @C09CT("action")
    public final Map<String, Map<String, SeaPdpBottomBarBffButtonActionChain>> action;

    @C09CT("content")
    public final Map<String, SeaPdpBottomBarBffContentTemplate> content;

    @C09CT("style")
    public final Map<String, SeaPdpBottomBarBffStyleTemplate> style;

    public SeaPdpBottomBarBffTemplate() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpBottomBarBffTemplate)) {
            return false;
        }
        SeaPdpBottomBarBffTemplate seaPdpBottomBarBffTemplate = (SeaPdpBottomBarBffTemplate) obj;
        return Intrinsics.LJFF(this.style, seaPdpBottomBarBffTemplate.style) && Intrinsics.LJFF(this.content, seaPdpBottomBarBffTemplate.content) && Intrinsics.LJFF(this.action, seaPdpBottomBarBffTemplate.action);
    }

    public final int hashCode() {
        Map<String, SeaPdpBottomBarBffStyleTemplate> map = this.style;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, SeaPdpBottomBarBffContentTemplate> map2 = this.content;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Map<String, SeaPdpBottomBarBffButtonActionChain>> map3 = this.action;
        return iHashCode2 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarBffTemplate(style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SeaPdpBottomBarBffTemplate(Map<String, SeaPdpBottomBarBffStyleTemplate> map, Map<String, SeaPdpBottomBarBffContentTemplate> map2, Map<String, ? extends Map<String, SeaPdpBottomBarBffButtonActionChain>> map3) {
        this.style = map;
        this.content = map2;
        this.action = map3;
    }
}
