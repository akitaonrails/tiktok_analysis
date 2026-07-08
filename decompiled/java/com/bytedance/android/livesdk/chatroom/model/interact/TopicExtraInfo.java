package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TopicExtraInfo {

    @C09CT("all_rivals")
    public long allRivals;

    @C09CT("all_rivals_avatar")
    public List<ImageModel> allRivalsAvatar = new ArrayList();

    @C09CT("end_time_sec")
    public long endTimeSec;

    @C09CT("start_time_sec")
    public long startTimeSec;
}
