package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class EfficiencyComponents implements Serializable {

    @C09CT("auto_popup_refer_list")
    public final List<String> autoPopUpReferList;

    @C09CT("color")
    public final String color;

    @C09CT("jump_data")
    public final EfficiencyJumpData jumpData;

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
        this(null, null, null, null, null, null, null, null);
    }

    public EfficiencyComponents(String str, String str2, String str3, String str4, String str5, Integer num, EfficiencyJumpData efficiencyJumpData, List<String> list) {
        this.leftIcon = str;
        this.leftText = str2;
        this.rightText = str3;
        this.rightIcon = str4;
        this.color = str5;
        this.radius = num;
        this.jumpData = efficiencyJumpData;
        this.autoPopUpReferList = list;
    }
}
