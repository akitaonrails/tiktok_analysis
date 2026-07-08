package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class AceBindPhoneScene {
    public static final TypeAdapter ADAPTER = new AceBindPhoneScene_OptTypeAdapter(NormalGson.singleton());

    @C09CT("classification")
    public List<Classification> classification;

    @C09CT("enable")
    public boolean enable;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    public AceBindPhoneScene() {
        this(null, false, null, 7, null);
    }

    public final List<Classification> getClassification() {
        return this.classification;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getScene() {
        return this.scene;
    }

    public final void setClassification(List<Classification> list) {
        this.classification = list;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public AceBindPhoneScene(String str, boolean z, List<Classification> list) {
        this.scene = str;
        this.enable = z;
        this.classification = list;
    }

    public AceBindPhoneScene(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
