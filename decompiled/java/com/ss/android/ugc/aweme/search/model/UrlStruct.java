package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UrlStruct implements Serializable {

    @C09CT("url_list")
    public List<String> urlList;

    public String getFirstUrl() {
        List<String> list = this.urlList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.urlList, 0);
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }
}
