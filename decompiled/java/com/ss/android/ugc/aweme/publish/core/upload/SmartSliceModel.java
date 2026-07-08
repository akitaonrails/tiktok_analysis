package com.ss.android.ugc.aweme.publish.core.upload;

import X.C09CT;
import X.C1440030nZp;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ml.infra.PitayaMLConfig;

/* JADX INFO: loaded from: classes23.dex */
public final class SmartSliceModel {

    @C09CT("base_number")
    public final int baseNumber;

    @C09CT("engine_type")
    public String engineType;

    @C09CT("max_slice_size")
    public final int maxSliceSize;

    @C09CT("min_slice_size")
    public final int minSliceSize;

    @C09CT("nearest_upper")
    public final boolean nearestUpper;

    @C09CT("package_url")
    public final String packageUrl;

    @C09CT("pitaya_ml")
    public final PitayaMLConfig pitayaMLConfig;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("type")
    public final int type;
    public static final C1440030nZp Companion = new Object() { // from class: X.0nZp
    };
    public static final int $stable = 8;

    public final int getValidMaxSliceSize() {
        int i = this.maxSliceSize;
        return i <= 0 ? SpeechEngineDefines.TTS_WORK_MODE_BOTH : i;
    }

    public final int getValidMinSliceSize() {
        int i = this.minSliceSize;
        if (i <= 0) {
            return 256;
        }
        return i;
    }

    public final int getValidTimesBaseNumber() {
        int i = this.baseNumber;
        if (i <= 0) {
            return 16;
        }
        return i;
    }

    public final void setEngineType(String str) {
        this.engineType = str;
    }

    public SmartSliceModel(String str, int i, String str2, boolean z, int i2, int i3, int i4, String str3, PitayaMLConfig pitayaMLConfig) {
        this.scene = str;
        this.type = i;
        this.packageUrl = str2;
        this.nearestUpper = z;
        this.minSliceSize = i2;
        this.maxSliceSize = i3;
        this.baseNumber = i4;
        this.engineType = str3;
        this.pitayaMLConfig = pitayaMLConfig;
    }
}
