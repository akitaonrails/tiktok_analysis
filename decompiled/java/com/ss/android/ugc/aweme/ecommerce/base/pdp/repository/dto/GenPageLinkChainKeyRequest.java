package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes27.dex */
public final class GenPageLinkChainKeyRequest {

    @C09CT("page_link_info")
    public final PageLinkInfo pageLinkInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public GenPageLinkChainKeyRequest() {
        this(0, null);
    }

    public GenPageLinkChainKeyRequest(Integer num, PageLinkInfo pageLinkInfo) {
        this.scene = num;
        this.pageLinkInfo = pageLinkInfo;
    }
}
