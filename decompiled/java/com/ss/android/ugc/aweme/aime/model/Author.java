package com.ss.android.ugc.aweme.aime.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class Author implements Serializable {
    public static final int $stable = 8;

    @C09CT("user_id")
    public String id;

    @C09CT("name")
    public String name;

    public Author() {
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

    public Author(String str, String str2) {
        this.name = str;
        this.id = str2;
    }
}
