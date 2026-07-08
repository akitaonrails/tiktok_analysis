package com.ss.ugc.android.editor.base.data;

import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class MusicCollectionModel implements Serializable {
    public final List<MusicCollection> collections;

    public MusicCollectionModel() {
        this(null, 1, null);
    }

    public MusicCollectionModel(List<MusicCollection> list) {
        this.collections = list;
    }

    public MusicCollectionModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
