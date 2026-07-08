package com.ss.android.ugc.aweme.property;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes23.dex */
public class SmartCompileBaseModel {
    public static final int $stable = 0;

    @C09CT("package_url")
    public final String packageUrl;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("type")
    public final int type;

    public SmartCompileBaseModel() {
        this("", -1, "");
    }

    public final String getPackageUrl() {
        return this.packageUrl;
    }

    public final String getScene() {
        return this.scene;
    }

    public final int getType() {
        return this.type;
    }

    public SmartCompileBaseModel(String str, int i, String str2) {
        this.scene = str;
        this.type = i;
        this.packageUrl = str2;
    }
}
