package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SceneRestriction {

    @C09CT("normal_hidden_gids")
    public List<Long> normalHiddenGids = new ArrayList();

    @C09CT("match_hidden_gids")
    public List<Long> matchHiddenGids = new ArrayList();

    @C09CT("cohost_hidden_gids")
    public List<Long> cohostHiddenGids = new ArrayList();

    @C09CT("multiguest_hidden_gids")
    public List<Long> multiguestHiddenGids = new ArrayList();
}
