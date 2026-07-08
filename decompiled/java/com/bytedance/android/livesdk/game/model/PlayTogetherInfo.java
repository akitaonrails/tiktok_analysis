package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlayTogetherInfo {

    @C09CT("basic_info")
    public PlayTogetherBasicInfo basicInfo;

    @C09CT("apply_list")
    public List<PlayTogetherMember> applyList = new ArrayList();

    @C09CT("history_list")
    public List<PlayTogetherMember> historyList = new ArrayList();

    @C09CT("pick_list")
    public List<PlayTogetherMember> pickList = new ArrayList();
}
