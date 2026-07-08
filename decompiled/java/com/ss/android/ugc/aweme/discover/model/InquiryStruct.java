package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public class InquiryStruct implements Serializable {

    @C09CT("desc")
    public String desc;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("open_url")
    public String openUrl;

    @C09CT("web_url")
    public String webUrl;

    public String getDesc() {
        return this.desc;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }
}
