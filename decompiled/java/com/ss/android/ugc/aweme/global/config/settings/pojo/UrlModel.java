package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class UrlModel {

    @C09CT("height")
    public Integer height;

    @C09CT("uri")
    public String uri;

    @C09CT("url_key")
    public String urlKey;

    @C09CT("url_list")
    public List<String> urlList = new ArrayList();

    @C09CT("width")
    public Integer width;

    public Integer getHeight() throws C316660CbA {
        Integer num = this.height;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getUri() throws C316660CbA {
        String str = this.uri;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getUrlKey() throws C316660CbA {
        String str = this.urlKey;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getWidth() throws C316660CbA {
        Integer num = this.width;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public List<String> getUrlList() {
        return this.urlList;
    }
}
