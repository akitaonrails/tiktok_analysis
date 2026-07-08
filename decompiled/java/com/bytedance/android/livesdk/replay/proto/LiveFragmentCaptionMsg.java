package com.bytedance.android.livesdk.replay.proto;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveFragmentCaptionMsg {

    @C09CT("caption_status")
    public int captionStatus;

    @C09CT("captions")
    public List<Caption> captions = new ArrayList();

    @C09CT("fragment_id")
    public long fragmentId;

    @C09CT("owner_user_id")
    public long ownerUserId;

    @C09CT("room_id")
    public long roomId;
}
