package com.ss.android.ugc.aweme.component.dualbuttons;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.router.AdUnifyJumpModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ButtonData implements Serializable {
    public static final int $stable = 8;

    @C09CT("color")
    public final String backgroundColor;

    @C09CT("jump_model")
    public final AdUnifyJumpModel jumpModel;

    @C09CT("text")
    public final String text;

    @C09CT("color_text")
    public final String textColor;

    public ButtonData() {
        this(null, null, null, null);
    }

    public ButtonData(String str, String str2, String str3, AdUnifyJumpModel adUnifyJumpModel) {
        this.backgroundColor = str;
        this.text = str2;
        this.textColor = str3;
        this.jumpModel = adUnifyJumpModel;
    }
}
