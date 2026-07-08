package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class AvatarUri {

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }
}
