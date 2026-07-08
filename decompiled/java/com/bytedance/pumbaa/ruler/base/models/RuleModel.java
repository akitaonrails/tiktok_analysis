package com.bytedance.pumbaa.ruler.base.models;

import X.C09CT;
import com.google.gson.k;

/* JADX INFO: loaded from: classes14.dex */
public class RuleModel {

    @C09CT("cel")
    public String cel;

    @C09CT("conf")
    public k conf;

    @C09CT("key")
    public String key;

    @C09CT("title")
    public String title;

    public RuleModel() {
        this(null, null, null, null);
    }

    public RuleModel(String str, k kVar, String str2, String str3) {
        this.title = str;
        this.conf = kVar;
        this.cel = str2;
        this.key = str3;
    }
}
