package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public final class SkuQuantityLimit {

    @C09CT("combo_multiplier")
    public final Integer comboMultiplier;

    @C09CT("combo_multiplier_hint")
    public final String comboMultiplierHint;

    @C09CT("max_num")
    public final Integer maxNum;

    @C09CT("min_num")
    public final Integer minNum;

    @C09CT("violate_max_num_hint")
    public final String violateMaxNumHint;

    @C09CT("violate_min_num_hint")
    public final String violateMinNumHint;

    public int hashCode() {
        Integer num = this.minNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxNum;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.violateMinNumHint;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.violateMaxNumHint;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.comboMultiplier;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.comboMultiplierHint;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuQuantityLimit(minNum=");
        sbLIZ.append(this.minNum);
        sbLIZ.append(", maxNum=");
        sbLIZ.append(this.maxNum);
        sbLIZ.append(", violateMinNumHint=");
        sbLIZ.append(this.violateMinNumHint);
        sbLIZ.append(", violateMaxNumHint=");
        sbLIZ.append(this.violateMaxNumHint);
        sbLIZ.append(", comboMultiplier=");
        sbLIZ.append(this.comboMultiplier);
        sbLIZ.append(", comboMultiplierHint=");
        sbLIZ.append(this.comboMultiplierHint);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SkuQuantityLimit(Integer num, Integer num2, String str, String str2, Integer num3, String str3) {
        this.minNum = num;
        this.maxNum = num2;
        this.violateMinNumHint = str;
        this.violateMaxNumHint = str2;
        this.comboMultiplier = num3;
        this.comboMultiplierHint = str3;
    }
}
