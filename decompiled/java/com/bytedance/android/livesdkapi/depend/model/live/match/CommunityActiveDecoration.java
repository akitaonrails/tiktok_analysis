package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CommunityActiveDecoration {

    @C09CT("decoration_id")
    public long decorationId;

    @C09CT("images")
    public Map<Integer, ImageModel> images = new LinkedHashMap();

    @C09CT("slot_type")
    public int slotType;
}
