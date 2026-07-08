package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model.SeaPdpBottomBtnInterestItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpBottomBarBffContentTemplate {

    @C09CT("desc")
    public final List<SeaPdpBottomBtnInterestItem> desc;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("sub_desc")
    public final List<SeaPdpBottomBtnInterestItem> subDesc;

    @C09CT("tips")
    public final SeaPdpBottomBarBffButtonTips tips;

    @C09CT("title")
    public final String title;

    public SeaPdpBottomBarBffContentTemplate() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpBottomBarBffContentTemplate)) {
            return false;
        }
        SeaPdpBottomBarBffContentTemplate seaPdpBottomBarBffContentTemplate = (SeaPdpBottomBarBffContentTemplate) obj;
        return Intrinsics.LJFF(this.icon, seaPdpBottomBarBffContentTemplate.icon) && Intrinsics.LJFF(this.title, seaPdpBottomBarBffContentTemplate.title) && Intrinsics.LJFF(this.tips, seaPdpBottomBarBffContentTemplate.tips) && Intrinsics.LJFF(this.desc, seaPdpBottomBarBffContentTemplate.desc) && Intrinsics.LJFF(this.subDesc, seaPdpBottomBarBffContentTemplate.subDesc);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SeaPdpBottomBarBffButtonTips seaPdpBottomBarBffButtonTips = this.tips;
        int iHashCode3 = (iHashCode2 + (seaPdpBottomBarBffButtonTips == null ? 0 : seaPdpBottomBarBffButtonTips.hashCode())) * 31;
        List<SeaPdpBottomBtnInterestItem> list = this.desc;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<SeaPdpBottomBtnInterestItem> list2 = this.subDesc;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarBffContentTemplate(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", tips=");
        sbLIZ.append(this.tips);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", subDesc=");
        sbLIZ.append(this.subDesc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpBottomBarBffContentTemplate(Icon icon, String str, SeaPdpBottomBarBffButtonTips seaPdpBottomBarBffButtonTips, List<SeaPdpBottomBtnInterestItem> list, List<SeaPdpBottomBtnInterestItem> list2) {
        this.icon = icon;
        this.title = str;
        this.tips = seaPdpBottomBarBffButtonTips;
        this.desc = list;
        this.subDesc = list2;
    }
}
