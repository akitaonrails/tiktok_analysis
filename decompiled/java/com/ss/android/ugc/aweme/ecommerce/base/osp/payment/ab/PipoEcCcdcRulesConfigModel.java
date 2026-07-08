package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PipoEcCcdcRulesConfigModel {

    @C09CT("check_all_rules_for_length")
    public final List<String> checkAllRulesForLength;

    @C09CT("enable_deduplication_icons")
    public final List<String> enableDeduplicationIcons;

    public PipoEcCcdcRulesConfigModel() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoEcCcdcRulesConfigModel)) {
            return false;
        }
        PipoEcCcdcRulesConfigModel pipoEcCcdcRulesConfigModel = (PipoEcCcdcRulesConfigModel) obj;
        return Intrinsics.LJFF(this.checkAllRulesForLength, pipoEcCcdcRulesConfigModel.checkAllRulesForLength) && Intrinsics.LJFF(this.enableDeduplicationIcons, pipoEcCcdcRulesConfigModel.enableDeduplicationIcons);
    }

    public final int hashCode() {
        return (this.checkAllRulesForLength.hashCode() * 31) + this.enableDeduplicationIcons.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoEcCcdcRulesConfigModel(checkAllRulesForLength=");
        sbLIZ.append(this.checkAllRulesForLength);
        sbLIZ.append(", enableDeduplicationIcons=");
        sbLIZ.append(this.enableDeduplicationIcons);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoEcCcdcRulesConfigModel(List<String> list, List<String> list2) {
        this.checkAllRulesForLength = list;
        this.enableDeduplicationIcons = list2;
    }

    public PipoEcCcdcRulesConfigModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
