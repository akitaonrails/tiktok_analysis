package com.ss.android.ugc.aweme.story.setting.ui.color;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ShaderParam {

    @C09CT("gradient_color_list")
    public final List<Integer> colorList;

    @C09CT("gradient_position_list")
    public final List<Float> positionList;

    public ShaderParam() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShaderParam(colorList=");
        sbLIZ.append(this.colorList);
        sbLIZ.append(", positionList=");
        sbLIZ.append(this.positionList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShaderParam(List<Integer> list, List<Float> list2) {
        this.colorList = list;
        this.positionList = list2;
    }
}
