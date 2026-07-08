package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class EfficiencyComponents implements Serializable {

    @C09CT("ai_components")
    public final List<String> aiComponents;

    @C09CT("auto_popup_refer_list")
    public final List<String> autoPopUpReferList;

    @C09CT("color")
    public final String color;

    @C09CT("component_type")
    public final Integer componentType;

    @C09CT("jump_data")
    public final EfficiencyJumpData jumpData;

    @C09CT("left_highlight_icon")
    public final String leftHighLightIcon;

    @C09CT("left_icon")
    public final String leftIcon;

    @C09CT("left_text")
    public final String leftText;

    @C09CT("radius")
    public final Integer radius;

    @C09CT("right_icon")
    public final String rightIcon;

    @C09CT("right_text")
    public final String rightText;

    public EfficiencyComponents() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public int hashCode() {
        String str = this.leftIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leftHighLightIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leftText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rightText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rightIcon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.color;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.radius;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        EfficiencyJumpData efficiencyJumpData = this.jumpData;
        int iHashCode8 = (iHashCode7 + (efficiencyJumpData == null ? 0 : efficiencyJumpData.hashCode())) * 31;
        List<String> list = this.autoPopUpReferList;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.componentType;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list2 = this.aiComponents;
        return iHashCode10 + (list2 != null ? list2.hashCode() : 0);
    }

    public EfficiencyComponents(String str, String str2, String str3, String str4, String str5, String str6, Integer num, EfficiencyJumpData efficiencyJumpData, List<String> list, Integer num2, List<String> list2) {
        this.leftIcon = str;
        this.leftHighLightIcon = str2;
        this.leftText = str3;
        this.rightText = str4;
        this.rightIcon = str5;
        this.color = str6;
        this.radius = num;
        this.jumpData = efficiencyJumpData;
        this.autoPopUpReferList = list;
        this.componentType = num2;
        this.aiComponents = list2;
    }
}
