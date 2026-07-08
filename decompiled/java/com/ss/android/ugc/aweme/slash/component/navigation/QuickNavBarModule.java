package com.ss.android.ugc.aweme.slash.component.navigation;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class QuickNavBarModule extends BaseComponentData implements Serializable {

    @C09CT("group_list")
    public final List<ElevatorNaviGroup> elevatorNaviGroup;

    @C09CT("max_tab_size")
    public final Integer maxTabSize;

    @C09CT("min_tab_size")
    public final Integer minTabSize;

    @C09CT("slider_color_android")
    public final String sliderColor;

    @C09CT("tab_text_default_color")
    public final String textDefaultColor;

    @C09CT("tab_text_selected_color")
    public final String textSelectedColor;

    @C09CT("track_params")
    public final Map<String, String> trackParams;

    public QuickNavBarModule() {
        this(null, null, null, null, null, null, null);
    }

    public final QuickNavBarModule copy(String str, String str2, String str3, List<ElevatorNaviGroup> list, Integer num, Integer num2, Map<String, String> map) {
        return new QuickNavBarModule(str, str2, str3, list, num, num2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickNavBarModule)) {
            return false;
        }
        QuickNavBarModule quickNavBarModule = (QuickNavBarModule) obj;
        return Intrinsics.LJFF(this.textDefaultColor, quickNavBarModule.textDefaultColor) && Intrinsics.LJFF(this.textSelectedColor, quickNavBarModule.textSelectedColor) && Intrinsics.LJFF(this.sliderColor, quickNavBarModule.sliderColor) && Intrinsics.LJFF(this.elevatorNaviGroup, quickNavBarModule.elevatorNaviGroup) && Intrinsics.LJFF(this.minTabSize, quickNavBarModule.minTabSize) && Intrinsics.LJFF(this.maxTabSize, quickNavBarModule.maxTabSize) && Intrinsics.LJFF(this.trackParams, quickNavBarModule.trackParams);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.textDefaultColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textSelectedColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sliderColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ElevatorNaviGroup> list = this.elevatorNaviGroup;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.minTabSize;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxTabSize;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, String> map = this.trackParams;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickNavBarModule(textDefaultColor=");
        sbLIZ.append(this.textDefaultColor);
        sbLIZ.append(", textSelectedColor=");
        sbLIZ.append(this.textSelectedColor);
        sbLIZ.append(", sliderColor=");
        sbLIZ.append(this.sliderColor);
        sbLIZ.append(", elevatorNaviGroup=");
        sbLIZ.append(this.elevatorNaviGroup);
        sbLIZ.append(", minTabSize=");
        sbLIZ.append(this.minTabSize);
        sbLIZ.append(", maxTabSize=");
        sbLIZ.append(this.maxTabSize);
        sbLIZ.append(", trackParams=");
        sbLIZ.append(this.trackParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<ElevatorNaviGroup> getElevatorNaviGroup() {
        return this.elevatorNaviGroup;
    }

    public final Integer getMaxTabSize() {
        return this.maxTabSize;
    }

    public final Integer getMinTabSize() {
        return this.minTabSize;
    }

    public final String getSliderColor() {
        return this.sliderColor;
    }

    public final String getTextDefaultColor() {
        return this.textDefaultColor;
    }

    public final String getTextSelectedColor() {
        return this.textSelectedColor;
    }

    public final Map<String, String> getTrackParams() {
        return this.trackParams;
    }

    public QuickNavBarModule(String str, String str2, String str3, List<ElevatorNaviGroup> list, Integer num, Integer num2, Map<String, String> map) {
        this.textDefaultColor = str;
        this.textSelectedColor = str2;
        this.sliderColor = str3;
        this.elevatorNaviGroup = list;
        this.minTabSize = num;
        this.maxTabSize = num2;
        this.trackParams = map;
    }
}
