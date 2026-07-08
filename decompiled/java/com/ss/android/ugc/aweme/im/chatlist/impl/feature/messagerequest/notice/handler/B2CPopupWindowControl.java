package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.handler;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class B2CPopupWindowControl {

    @C09CT("need_show")
    public final Boolean need_show;

    @C09CT("popup_business_scene")
    public final Integer scene;

    public B2CPopupWindowControl() {
        this(null, null);
    }

    public B2CPopupWindowControl(Integer num, Boolean bool) {
        this.scene = num;
        this.need_show = bool;
    }
}
