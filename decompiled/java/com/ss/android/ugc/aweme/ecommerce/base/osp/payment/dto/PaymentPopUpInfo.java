package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentPopUpInfo {

    @C09CT("content")
    public String content;

    @C09CT("popup_name")
    public String popupName;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("title")
    public String title;

    public PaymentPopUpInfo() {
        this(null, null, null, null);
    }

    public PaymentPopUpInfo(String str, String str2, String str3, String str4) {
        this.scene = str;
        this.title = str2;
        this.content = str3;
        this.popupName = str4;
    }
}
