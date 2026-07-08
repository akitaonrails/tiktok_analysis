package com.ss.android.ugc.aweme.feed.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class AwemeBizData implements Serializable {
    public final Object fieldData;
    public final boolean joinClone;
    public final boolean joinEquals;
    public final boolean joinToString;

    public AwemeBizData(boolean z, boolean z2, boolean z3, Object obj) {
        this.joinClone = z;
        this.joinEquals = z2;
        this.joinToString = z3;
        this.fieldData = obj;
    }
}
