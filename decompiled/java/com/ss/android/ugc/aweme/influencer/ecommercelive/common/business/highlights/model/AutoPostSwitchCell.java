package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AutoPostSwitchCell implements Serializable, InterfaceC1891350zJl {
    public static final int $stable = 8;
    public ECGuidanceCard LL;

    @C09CT("auto_post_switch")
    public final Integer autoPostSwitch;

    @C09CT("desc")
    public final String desc;

    @C09CT("title")
    public final String title;

    public AutoPostSwitchCell() {
        this(null, null, null);
    }

    public final AutoPostSwitchCell copy(String str, String str2, Integer num) {
        return new AutoPostSwitchCell(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoPostSwitchCell)) {
            return false;
        }
        AutoPostSwitchCell autoPostSwitchCell = (AutoPostSwitchCell) obj;
        return Intrinsics.LJFF(this.title, autoPostSwitchCell.title) && Intrinsics.LJFF(this.desc, autoPostSwitchCell.desc) && Intrinsics.LJFF(this.autoPostSwitch, autoPostSwitchCell.autoPostSwitch);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.autoPostSwitch;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPostSwitchCell(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", autoPostSwitch=");
        sbLIZ.append(this.autoPostSwitch);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ECGuidanceCard getAutoPostGuidanceCard() {
        return this.LL;
    }

    public final Integer getAutoPostSwitch() {
        return this.autoPostSwitch;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final void setAutoPostGuidanceCard(ECGuidanceCard eCGuidanceCard) {
        this.LL = eCGuidanceCard;
    }

    public AutoPostSwitchCell(String str, String str2, Integer num) {
        this.title = str;
        this.desc = str2;
        this.autoPostSwitch = num;
    }
}
