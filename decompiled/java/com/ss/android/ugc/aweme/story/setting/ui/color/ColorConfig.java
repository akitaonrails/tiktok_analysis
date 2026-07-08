package com.ss.android.ugc.aweme.story.setting.ui.color;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes12.dex */
public final class ColorConfig {

    @C09CT("alpha")
    public final float alpha;

    @C09CT("is_shader")
    public final boolean isShader;

    @C09CT("shader_param")
    public final ShaderParam shaderParam;

    @C09CT("single_color")
    public final Integer singleColor;

    public ColorConfig() {
        this(false, null, null, 0.0f);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColorConfig(isShader=");
        sbLIZ.append(this.isShader);
        sbLIZ.append(", singleColor=");
        sbLIZ.append(this.singleColor);
        sbLIZ.append(", shaderParam=");
        sbLIZ.append(this.shaderParam);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.alpha);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ColorConfig(boolean z, Integer num, ShaderParam shaderParam, float f) {
        this.isShader = z;
        this.singleColor = num;
        this.shaderParam = shaderParam;
        this.alpha = f;
    }
}
