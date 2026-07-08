package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PersonaCombine {

    @C09CT("combine_id")
    public long combineId;

    @C09CT("source")
    public int source;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("style")
    public int style;

    @C09CT("asset_sets")
    public List<PersonaAssetSet> assetSets = new ArrayList();

    @C09CT("combine_id_str")
    public String combineIdStr = "";
}
