package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlayTogetherApplyInfo {

    @C09CT("basic_info")
    public PlayTogetherBasicInfo basicInfo;

    @C09CT("is_applying")
    public boolean isApplying;

    @C09CT("is_fans_club_frozen")
    public boolean isFansClubFrozen;

    @C09CT("is_meet_limit")
    public boolean isMeetLimit;

    @C09CT("apply_members")
    public List<PlayTogetherMember> applyMembers = new ArrayList();

    @C09CT("last_pick_time")
    public String lastPickTime = "";

    @C09CT("system_time")
    public String systemTime = "";
}
