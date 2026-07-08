package com.bytedance.android.starship.strategy.repository;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ContainerInput {

    @C09CT("data")
    public final String data;

    @C09CT("tags")
    public final List<String> tags;

    public ContainerInput() {
        this(null, null);
    }

    public ContainerInput(String str, List<String> list) {
        this.data = str;
        this.tags = list;
    }
}
