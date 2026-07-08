package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ShareStruct extends BaseResponse implements Serializable {

    @C09CT("bool_persist")
    public int boolPersist;

    @C09CT("share_desc")
    public String shareDesc;

    @C09CT("share_link_desc")
    public String shareLinkDesc;

    @C09CT("share_qrcode_url")
    public UrlModel shareQrcodeUrl;

    @C09CT("share_title")
    public String shareTitle;

    @C09CT("share_url")
    public String shareUrl;

    @C09CT("share_weibo_desc")
    public String shareWeiboDesc;
}
