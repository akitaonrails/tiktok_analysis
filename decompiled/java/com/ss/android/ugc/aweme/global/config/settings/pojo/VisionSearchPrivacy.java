package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class VisionSearchPrivacy {

    @C09CT("content")
    public String content;

    @C09CT("links")
    public List<VisionSearchPrivacyLink> links = new ArrayList();

    @C09CT("title")
    public String title;

    public String getContent() throws C316660CbA {
        String str = this.content;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getTitle() throws C316660CbA {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public List<VisionSearchPrivacyLink> getLinks() {
        return this.links;
    }
}
