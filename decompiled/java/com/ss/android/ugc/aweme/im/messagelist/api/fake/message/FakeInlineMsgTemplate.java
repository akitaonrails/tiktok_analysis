package com.ss.android.ugc.aweme.im.messagelist.api.fake.message;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FakeInlineMsgTemplate {

    @C09CT("action")
    public final int action;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("key")
    public final String key;

    @C09CT("link")
    public final String link;

    @C09CT("name")
    public final String name;

    public FakeInlineMsgTemplate() {
        this(null, null, null, 0, null);
    }

    public FakeInlineMsgTemplate(String str, String str2, String str3, int i, Map<String, String> map) {
        this.key = str;
        this.name = str2;
        this.link = str3;
        this.action = i;
        this.extra = map;
    }
}
