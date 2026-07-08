package com.ss.android.ugc.aweme.ecommerce.showcase.ab;

import X.C09CT;
import X.C13BV;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.mix.base.PrefetchParamsRuleItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopNativePrefetchParamsSettingModel {

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene = "";

    @C09CT("rules")
    public final List<PrefetchParamsRuleItem> rules = C13BV.INSTANCE;

    public final List<PrefetchParamsRuleItem> getRules() {
        return this.rules;
    }

    public final String getScene() {
        return this.scene;
    }
}
