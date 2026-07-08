package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes34.dex */
public final class ViewerPicksOrder {

    @C09CT("gift_pick")
    public GiftPick giftPick;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("orderer")
    public ViewerPicksOrderer orderer;
}
