package com.ss.android.ugc.aweme.configuration.models;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class NUFunctionModel {

    @C09CT("name")
    public final String name;

    @C09CT("params")
    public final String params;

    public NUFunctionModel() {
        this("", null);
    }

    public NUFunctionModel(String str, String str2) {
        this.name = str;
        this.params = str2;
    }
}
