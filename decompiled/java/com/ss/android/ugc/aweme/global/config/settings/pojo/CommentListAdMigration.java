package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class CommentListAdMigration {

    @C09CT("enterprise_tag")
    public String enterpriseTag;

    @C09CT("link_tag")
    public String linkTag;

    @C09CT("task_tag")
    public String taskTag;

    public String getEnterpriseTag() throws C316660CbA {
        String str = this.enterpriseTag;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getLinkTag() throws C316660CbA {
        String str = this.linkTag;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getTaskTag() throws C316660CbA {
        String str = this.taskTag;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
