package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class VideoSeiEndSetting {
    public static final TypeAdapter ADAPTER = new VideoSeiEndSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_no_parse_sei_end_layout")
    public int enableNoParseSeiEndLayout;

    @C09CT("end_layout_scene")
    public ArrayList<String> enableSceneList;

    @C09CT("enable_video_sei")
    public int enableVideoSei;

    @C09CT("enable_video_sei_end_layout")
    public int enableVideoSeiEndLayout;

    public VideoSeiEndSetting() {
        this(1, 1, 1, new ArrayList(C1697810uHb.LJIIJJI("video", "live_studio")));
    }

    public VideoSeiEndSetting(int i, int i2, int i3, ArrayList<String> arrayList) {
        this.enableVideoSei = i;
        this.enableVideoSeiEndLayout = i2;
        this.enableNoParseSeiEndLayout = i3;
        this.enableSceneList = arrayList;
    }
}
