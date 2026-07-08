package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class IMActionTemplate {

    @C09CT("action")
    public Integer action;

    @C09CT("extra")
    public List<IMActionTemplateExtra> extra;

    @C09CT("key")
    public Integer key;

    @C09CT("link")
    public String link;

    @C09CT("name")
    public String name;

    public IMActionTemplate() {
        this(null, null, null, null, null);
    }

    public IMActionTemplate(Integer num, Integer num2, String str, String str2, List<IMActionTemplateExtra> list) {
        this.key = num;
        this.action = num2;
        this.name = str;
        this.link = str2;
        this.extra = list;
    }
}
