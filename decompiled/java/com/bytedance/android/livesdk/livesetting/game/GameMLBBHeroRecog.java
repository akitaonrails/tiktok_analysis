package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.ml.ab.SmartGameMLBBHeroRecognitionExperiment;

/* JADX INFO: loaded from: classes19.dex */
public final class GameMLBBHeroRecog {
    public static final TypeAdapter ADAPTER = new GameMLBBHeroRecog_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("instant_infer")
    public boolean instantInfer;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = SmartGameMLBBHeroRecognitionExperiment.SCENE;

    @C09CT("interval")
    public long interval = 60000;

    @C09CT("crop_area")
    public Float[] cropArea = {Float.valueOf(0.65f), Float.valueOf(0.45f), Float.valueOf(0.92f), Float.valueOf(1.0f)};

    @C09CT("resize_width")
    public int resizeWidth = 224;

    @C09CT("resize_height")
    public int resizeHeight = 224;

    @C09CT("output_num")
    public int outputNum = 130;

    @C09CT("threshold")
    public float threshold = 0.3f;

    @C09CT("index_to_name_str")
    public String indexToNameStr = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameMLBBHeroRecog(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", interval=");
        sbLIZ.append(this.interval);
        sbLIZ.append(", cropArea=");
        sbLIZ.append(this.cropArea);
        sbLIZ.append(", resizeWidth=");
        sbLIZ.append(this.resizeWidth);
        sbLIZ.append(", resizeHeight=");
        sbLIZ.append(this.resizeHeight);
        sbLIZ.append(", outputNum=");
        sbLIZ.append(this.outputNum);
        sbLIZ.append(", threshold=");
        sbLIZ.append(this.threshold);
        sbLIZ.append(", indexToNameStr=");
        sbLIZ.append(this.indexToNameStr);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
