package com.ss.android.ugc.aweme.ecommerce.fps;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EComFpsScrollMonitorModel {

    @C09CT("enable")
    public final int enable;

    @C09CT("frame")
    public final int frame;

    @C09CT("lynx_scenes")
    public final List<String> lynxScenes;

    /* JADX INFO: renamed from: ms, reason: collision with root package name */
    @C09CT("ms")
    public final int f355ms;

    @C09CT("native_scenes")
    public final List<String> nativeScenes;

    @C09CT("random")
    public final int random;

    @C09CT("type")
    public final int type;

    public EComFpsScrollMonitorModel() {
        C13BV c13bv = C13BV.INSTANCE;
        this.nativeScenes = c13bv;
        this.lynxScenes = c13bv;
    }

    public final int getEnable() {
        return this.enable;
    }

    public final int getFrame() {
        return this.frame;
    }

    public final List<String> getLynxScenes() {
        return this.lynxScenes;
    }

    public final int getMs() {
        return this.f355ms;
    }

    public final List<String> getNativeScenes() {
        return this.nativeScenes;
    }

    public final int getRandom() {
        return this.random;
    }

    public final int getType() {
        return this.type;
    }
}
