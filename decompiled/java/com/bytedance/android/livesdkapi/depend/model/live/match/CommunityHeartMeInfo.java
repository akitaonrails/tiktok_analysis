package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CommunityHeartMeInfo {

    @C09CT("anchor_community_level")
    public long anchorCommunityLevel;

    @C09CT("slots")
    public Map<Integer, CommunityActiveDecoration> slots = new LinkedHashMap();

    @C09CT("thrown_item_image")
    public ImageModel thrownItemImage;
}
