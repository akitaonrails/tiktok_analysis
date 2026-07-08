package com.ss.android.ugc.aweme.detail.component.biz.creativetools;

import X.C19EG;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes4.dex */
public final class CreativeToolMagicBottomComponent extends CreativeToolCommonBottomComponent {
    @Override // com.ss.android.ugc.aweme.detail.component.biz.creativetools.CreativeToolCommonBottomComponent
    public final void mo() {
    }

    @Override // com.ss.android.ugc.aweme.detail.component.biz.creativetools.CreativeToolCommonBottomComponent
    public final int oo(boolean z) {
        return z ? 2131826577 : 2131826578;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.biz.creativetools.CreativeToolCommonBottomComponent
    public final void so(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.detail.component.biz.creativetools.CreativeToolCommonBottomComponent
    public final void uo(C19EG c19eg, Aweme aweme, String str, String str2) {
        if (str.length() == 0) {
            return;
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse("//studio/editor_pro").buildUpon().appendQueryParameter(Scene.SCENE_SERVICE, "open_ep_magic");
        if (str2 == null) {
            str2 = "";
        }
        SmartRouter.buildRoute(c19eg, builderAppendQueryParameter.appendQueryParameter("resource_type", str2).appendQueryParameter("resource_id", "").appendQueryParameter("effect_id", str).toString()).open();
    }
}
