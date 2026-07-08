package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import webcast.data.multilive_biz.BizResumeParams;

/* JADX INFO: loaded from: classes.dex */
public final class ResumeReq {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("multi_guest_req_extra")
    public BizResumeParams multiGuestReqExtra;

    @C09CT("myself")
    public Player myself;
}
