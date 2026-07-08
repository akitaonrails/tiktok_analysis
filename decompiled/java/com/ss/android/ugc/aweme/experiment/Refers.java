package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Refers implements Serializable {
    public static final int $stable = 8;

    @C09CT("refers")
    public final List<String> refers;

    public Refers() {
        this(null);
    }

    public Refers(List<String> list) {
        this.refers = list;
    }
}
