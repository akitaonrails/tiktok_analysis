package com.ss.android.ugc.aweme.story.uiconfig.color;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.story.setting.ui.color.ColorConfig;

/* JADX INFO: loaded from: classes12.dex */
public final class FactoryColorConfig {

    @C09CT("ui_color")
    public final ColorConfig colorConfig;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    public FactoryColorConfig() {
        this("", new ColorConfig(false, null, null, 0.0f));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FactoryColorConfig(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", colorConfig=");
        sbLIZ.append(this.colorConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FactoryColorConfig(String str, ColorConfig colorConfig) {
        this.id = str;
        this.colorConfig = colorConfig;
    }
}
