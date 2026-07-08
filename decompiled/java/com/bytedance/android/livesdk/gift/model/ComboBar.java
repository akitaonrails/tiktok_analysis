package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class ComboBar {

    @C09CT("combo_style")
    public int comboStyle;

    @C09CT("left_icon")
    public ImageModel leftIcon;

    @C09CT("show_combo_bar")
    public boolean showComboBar;

    @C09CT("target_combo_num")
    public long targetComboNum;

    @C09CT("target_reach_title")
    public String targetReachTitle = "";

    @C09CT("display_text_before_reach")
    public String displayTextBeforeReach = "";

    @C09CT("display_text_after_reach")
    public String displayTextAfterReach = "";
}
