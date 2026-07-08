package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public class BottomMessage extends AbstractC1136060ffY {
    public long LL;

    @C09CT("biz_type")
    public int bizType;

    @C09CT("content")
    public String content;

    @C09CT("detail_url")
    public String detailUrl;

    @C09CT("Duration")
    public long duration;

    @C09CT("float_icon_type")
    public int floatIconType;

    @C09CT("float_style")
    public int floatStyle;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT("show_type")
    public int showType;

    @C09CT("style")
    public int style;

    @C09CT("text_type")
    public int textType;

    @C09CT("violation_user_id")
    public long violationUserId;

    public BottomMessage() {
        this.type = C001A.BOTTOM_MESSAGE;
    }
}
