package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import tikcast.linkmic.common.PositionConfig;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* JADX INFO: loaded from: classes.dex */
public final class ChangeLayoutReq {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("layout_id")
    public String layoutId = "";

    @C09CT("multi_guest_req_extra")
    public BizChangeLayoutParams multiGuestReqExtra;

    @C09CT("myself")
    public Player myself;

    @C09CT("pos_config")
    public PositionConfig posConfig;

    @C09CT("scene_version")
    public int sceneVersion;
}
