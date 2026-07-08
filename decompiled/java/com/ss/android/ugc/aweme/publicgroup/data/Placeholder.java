package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.C2097608Jq;
import X.EnumC1231340i9E;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class Placeholder {

    @C09CT("action")
    public final int action;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("key")
    public final String key;

    @C09CT("name")
    public final String name;

    @C09CT("schema")
    public final String schema;

    public final int hashCode() {
        return (((((((this.key.hashCode() * 31) + this.name.hashCode()) * 31) + this.action) * 31) + this.schema.hashCode()) * 31) + this.ext.hashCode();
    }

    public Placeholder() {
        this("", "", EnumC1231340i9E.CLICK_ACTION_UNKNOWN.getValue(), "", C2097608Jq.LJ());
    }

    public Placeholder(String str, String str2, int i, String str3, Map<String, String> map) {
        this.key = str;
        this.name = str2;
        this.action = i;
        this.schema = str3;
        this.ext = map;
    }
}
