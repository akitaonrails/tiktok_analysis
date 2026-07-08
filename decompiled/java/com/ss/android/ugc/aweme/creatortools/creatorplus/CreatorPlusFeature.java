package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class CreatorPlusFeature {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Integer id;

    @C09CT("image")
    public final UrlModel image;

    @C09CT("is_accessible")
    public final Boolean isAccessible;

    @C09CT("modal_info")
    public final ModalInfo modalInfo;

    @C09CT("name")
    public final String name;

    @C09CT("schema")
    public final String schema;

    @C09CT("show_red_dot")
    public final boolean showRedDot;

    public CreatorPlusFeature(Integer num, UrlModel urlModel, Boolean bool, ModalInfo modalInfo, String str, String str2, boolean z) {
        this.id = num;
        this.image = urlModel;
        this.isAccessible = bool;
        this.modalInfo = modalInfo;
        this.name = str;
        this.schema = str2;
        this.showRedDot = z;
    }
}
