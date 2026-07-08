package com.bytedance.android.livesdk.workaround;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class Options {
    public static final TypeAdapter ADAPTER = new Options_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_view_root_surface_judge")
    public boolean enableViewRootJudge;

    @C09CT("hardware_block_models")
    public List<String> hardwareBlockModels;

    @C09CT("enable_live_inner")
    public boolean optEnablePositionChange;

    @C09CT("enable_preview_card")
    public boolean optEnablePreviewPositionChange;

    @C09CT("further_position_change")
    public boolean optFurtherPositionChange;

    @C09CT("other_plan")
    public boolean optOtherPlan;

    @C09CT("position_change")
    public boolean optPositionChange;

    @C09CT("remove_trans_logic")
    public boolean removeTransLogic;

    @C09CT("surfaceview_block_models")
    public List<String> surfaceviewBlockModels;

    public Options() {
        this(false, false, false, false, false, false, false, C1697810uHb.LJIIJJI("sm-j260m", "sm-j260f", "sm-a260f", "sm-g570m", "sm-a260g", "sm-g950f", "cph 1901"), C1697810uHb.LJIIJJI("rmx3231", "sm-j400f", "tecno bd4", "nokia c01 plus", "sm-j400m", "zte blade a31 plus", "sm-a032f", "sm-a032m", "i85", "blu g52l", "sky elite n55max", "noolah_mobile p11", "sm-j410g", "sm-j410f", "sm-j260mu", "moto e5 play", "sm-j260m", "samsung-sm-j327a", "sm-j327w", "tfy-lx2", "cma-lx2", "tfy-lx3", "cma-lx3", "hey-w09", "any-lx3", "tfy-lx1", "redmi 8a", "redmi 7a", "redmi 8a dual", "lm-k200"));
    }

    public Options(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List<String> list, List<String> list2) {
        this.optPositionChange = z;
        this.optFurtherPositionChange = z2;
        this.optOtherPlan = z3;
        this.optEnablePositionChange = z4;
        this.optEnablePreviewPositionChange = z5;
        this.removeTransLogic = z6;
        this.enableViewRootJudge = z7;
        this.hardwareBlockModels = list;
        this.surfaceviewBlockModels = list2;
    }
}
