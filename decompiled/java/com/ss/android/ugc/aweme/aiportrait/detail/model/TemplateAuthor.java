package com.ss.android.ugc.aweme.aiportrait.detail.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateAuthor implements Serializable {
    public static final int $stable = 8;

    @C09CT("uid")
    public String id;

    @C09CT("name")
    public String name;

    public TemplateAuthor() {
        this(null, null);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public TemplateAuthor(String str, String str2) {
        this.name = str;
        this.id = str2;
    }
}
