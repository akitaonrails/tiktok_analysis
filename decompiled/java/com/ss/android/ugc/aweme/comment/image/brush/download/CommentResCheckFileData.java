package com.ss.android.ugc.aweme.comment.image.brush.download;

import X.C09CT;
import X.C13BV;
import X.C1705290uTf;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class CommentResCheckFileData {
    public static final C1705290uTf LIZ = new Object() { // from class: X.0uTf
    };

    @C09CT("eraser")
    public final List<String> eraser;

    @C09CT("painter")
    public final List<String> painter;

    public CommentResCheckFileData() {
        this(null, null, 3, null);
    }

    public CommentResCheckFileData(List<String> list, List<String> list2) {
        this.eraser = list;
        this.painter = list2;
    }

    public CommentResCheckFileData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
