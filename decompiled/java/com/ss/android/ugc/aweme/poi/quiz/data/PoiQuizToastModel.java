package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizToastModel implements Serializable {

    @C09CT("right_btn_text")
    public final String rightBtnText;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("style")
    public final String style;

    @C09CT("toast_text")
    public final String toastText;

    public PoiQuizToastModel() {
        this(null, null, null, null);
    }

    public PoiQuizToastModel(String str, String str2, String str3, String str4) {
        this.style = str;
        this.scene = str2;
        this.toastText = str3;
        this.rightBtnText = str4;
    }
}
