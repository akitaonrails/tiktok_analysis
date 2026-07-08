package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes28.dex */
public class SubRankTabInfo {
    public int LIZ;

    @C09CT("dark_icon")
    public ImageModel darkIcon;

    @C09CT("default_bg_color")
    public RankStyleColor defaultBgColor;

    @C09CT("default_text_color")
    public RankStyleColor defaultTextColor;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("rank_type")
    public int rankType;

    @C09CT("selected_bg_color")
    public RankStyleColor selectedBgColor;

    @C09CT("selected_text_color")
    public RankStyleColor selectedTextColor;

    @C09CT("title_text")
    public Text title;
}
