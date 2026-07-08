package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;

/* JADX INFO: loaded from: classes.dex */
public final class RechargeReq {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommon common;

    @C09CT("myself")
    public Player myself;

    @C09CT("route_id")
    public long routeId;

    @C09CT("target")
    public Player target;

    @C09CT("type")
    public int type;
}
