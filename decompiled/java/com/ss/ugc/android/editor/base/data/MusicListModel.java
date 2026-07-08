package com.ss.ugc.android.editor.base.data;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class MusicListModel implements Serializable {

    @C09CT("has_more")
    public final boolean hasMore;
    public final List<MusicItem> list;
    public final int page;
    public final int size;
    public final int total;

    public MusicListModel() {
        this(false, 0, 0, 0, null, 31, null);
    }

    public MusicListModel(boolean z, int i, int i2, int i3, List<MusicItem> list) {
        this.hasMore = z;
        this.total = i;
        this.page = i2;
        this.size = i3;
        this.list = list;
    }

    public MusicListModel(boolean z, int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? C13BV.INSTANCE : list);
    }
}
