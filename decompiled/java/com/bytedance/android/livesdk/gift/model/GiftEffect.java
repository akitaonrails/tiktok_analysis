package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GiftEffect {

    @C09CT("assets")
    public List<AssetsModel> assets = new ArrayList();

    @C09CT("event_tracking_params")
    public Map<String, String> eventTrackingParams = new LinkedHashMap();

    @C09CT("specs")
    public GiftEffectSpecs specs;
}
