package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateSettingsParams {

    @C09CT("auto_start")
    public boolean autoStart;

    @C09CT("clicked_confirm")
    public boolean clickedConfirm;

    @C09CT("display_mode")
    public int displayMode;

    @C09CT("enable_auto_restart")
    public boolean enableAutoRestart;

    @C09CT("extra")
    public ProfileExtra extra;

    @C09CT("has_duration")
    public boolean hasDuration;

    @C09CT("has_score")
    public boolean hasScore;

    @C09CT("round_duration_sec")
    public long roundDurationSec;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("gift_ids")
    public List<Long> giftIds = new ArrayList();

    @C09CT("gift_pick_ids")
    public List<Long> giftPickIds = new ArrayList();

    @C09CT("template_ids")
    public List<Long> templateIds = new ArrayList();
}
