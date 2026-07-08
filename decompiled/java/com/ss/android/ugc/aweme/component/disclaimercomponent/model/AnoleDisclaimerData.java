package com.ss.android.ugc.aweme.component.disclaimercomponent.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.model.AutoData;
import com.ss.android.ugc.aweme.commercialize.model.DisclaimerText;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleDisclaimerData {

    @C09CT("auto_data_map")
    public final Map<String, AutoData> autoDataMap;

    @C09CT("auto_disclaimer_type")
    public final Integer autoDisclaimerType;

    @C09CT("layout_id")
    public final Long layoutId;

    @C09CT("pid_list")
    public final List<String> pidList;

    @C09CT("pure_text")
    public final String pureText;

    @C09CT("spliced_texts")
    public final List<DisclaimerText> textList;

    @C09CT("type")
    public final Integer type;

    @C09CT("ugen_status")
    public final Integer ugenStatus;

    public AnoleDisclaimerData() {
        this(null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleDisclaimerData)) {
            return false;
        }
        AnoleDisclaimerData anoleDisclaimerData = (AnoleDisclaimerData) obj;
        return Intrinsics.LJFF(this.type, anoleDisclaimerData.type) && Intrinsics.LJFF(this.pureText, anoleDisclaimerData.pureText) && Intrinsics.LJFF(this.textList, anoleDisclaimerData.textList) && Intrinsics.LJFF(this.autoDataMap, anoleDisclaimerData.autoDataMap) && Intrinsics.LJFF(this.autoDisclaimerType, anoleDisclaimerData.autoDisclaimerType) && Intrinsics.LJFF(this.pidList, anoleDisclaimerData.pidList) && Intrinsics.LJFF(this.layoutId, anoleDisclaimerData.layoutId) && Intrinsics.LJFF(this.ugenStatus, anoleDisclaimerData.ugenStatus);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.pureText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<DisclaimerText> list = this.textList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, AutoData> map = this.autoDataMap;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num2 = this.autoDisclaimerType;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list2 = this.pidList;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.layoutId;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.ugenStatus;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleDisclaimerData(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", pureText=");
        sbLIZ.append(this.pureText);
        sbLIZ.append(", textList=");
        sbLIZ.append(this.textList);
        sbLIZ.append(", autoDataMap=");
        sbLIZ.append(this.autoDataMap);
        sbLIZ.append(", autoDisclaimerType=");
        sbLIZ.append(this.autoDisclaimerType);
        sbLIZ.append(", pidList=");
        sbLIZ.append(this.pidList);
        sbLIZ.append(", layoutId=");
        sbLIZ.append(this.layoutId);
        sbLIZ.append(", ugenStatus=");
        sbLIZ.append(this.ugenStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnoleDisclaimerData(Integer num, String str, List<DisclaimerText> list, Map<String, AutoData> map, Integer num2, List<String> list2, Long l, Integer num3) {
        this.type = num;
        this.pureText = str;
        this.textList = list;
        this.autoDataMap = map;
        this.autoDisclaimerType = num2;
        this.pidList = list2;
        this.layoutId = l;
        this.ugenStatus = num3;
    }
}
