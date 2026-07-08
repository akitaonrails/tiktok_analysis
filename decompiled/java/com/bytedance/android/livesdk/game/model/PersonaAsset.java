package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PersonaAsset {

    @C09CT("alter_image")
    public PersonaAlertImage alterImage;

    @C09CT("asset_id")
    public long assetId;

    @C09CT("content")
    public PersonaContent content;

    @C09CT("element")
    public int element;

    @C09CT("image")
    public PersonaImage image;

    @C09CT("is_applied")
    public boolean isApplied;

    @C09CT("source")
    public int source;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("asset_id_str")
    public String assetIdStr = "";

    @C09CT("create_time_str")
    public String createTimeStr = "";
}
