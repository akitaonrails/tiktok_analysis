package com.bytedance.android.livesdk.model.message.ext;

import X.AbstractC1136060ffY;
import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes13.dex */
public class BusinessLinksLiveMessage extends AbstractC1136060ffY {

    @C09CT("card_type")
    public int cardType;

    @C09CT("game_url")
    public String gameUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("live_log_extra")
    public String liveLogExtra = "";

    @C09CT("op")
    public int op;

    @C09CT("op_time")
    public long opTime;

    /* JADX INFO: renamed from: pic, reason: collision with root package name */
    @C09CT("pic")
    public String f317pic;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("title")
    public String title;

    @C09CT("url")
    public String url;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int getIntType() {
        return 20000;
    }
}
