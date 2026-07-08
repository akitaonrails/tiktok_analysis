package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AssetBundle {

    @C09CT("assets")
    public List<AssetsModel> assets = new ArrayList();

    @C09CT("prefab_bundle")
    public PrefabBundle prefabBundle;

    @C09CT("stream_effect_spec")
    public GiftEffectStreamSpec streamEffectSpec;

    public static final class PrefabBundle {

        @C09CT("prefab_effect_ids")
        public List<Long> prefabEffectIds = new ArrayList();
    }
}
