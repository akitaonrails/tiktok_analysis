package com.ss.android.ugc.aweme.component.playableiabconvertcomponent;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnolePlayableIABCovertData implements Serializable {
    public static final int $stable = 0;

    @C09CT("call_to_action")
    public final ButtonData ctaButton;

    @C09CT("desc")
    public final String desc;

    @C09CT("label")
    public final SponsoredLabel label;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    @C09CT("thumb")
    public final String thumb;

    @C09CT("title")
    public final String title;

    public AnolePlayableIABCovertData() {
        this(null, null, null, null, null, null);
    }

    public AnolePlayableIABCovertData(SponsoredLabel sponsoredLabel, String str, String str2, String str3, ButtonData buttonData, Integer num) {
        this.label = sponsoredLabel;
        this.thumb = str;
        this.title = str2;
        this.desc = str3;
        this.ctaButton = buttonData;
        this.scene = num;
    }
}
