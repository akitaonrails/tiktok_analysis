package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class MigrateGroupReq {

    @C09CT("common")
    public LinkCommon common;

    @C09CT("myself")
    public GroupPlayer myself;

    @C09CT("source_group_channel_id")
    public long sourceGroupChannelId;

    @C09CT("target_group_channel_id")
    public long targetGroupChannelId;
}
