package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlayTogetherHistoryPickInfo {

    @C09CT("apply_count")
    public long applyCount;

    @C09CT("duration")
    public long duration;

    @C09CT("last_play_together_basic_info")
    public PlayTogetherBasicInfo lastPlayTogetherBasicInfo;

    @C09CT("pick_count")
    public long pickCount;

    @C09CT("picked_members")
    public List<PlayTogetherMember> pickedMembers = new ArrayList();
}
