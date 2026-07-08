package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public class WarningTag {

    @C09CT("detail_url")
    public String detailUrl;

    @C09CT("duration")
    public long duration;

    @C09CT("icon_type")
    public int iconType;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT("style")
    public int style;

    @C09CT("tag_source")
    public int tagSource;

    @C09CT("text")
    public Text text;
}
