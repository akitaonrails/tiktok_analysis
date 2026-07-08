package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class CollabInfo implements Serializable {

    @C09CT("collaborators")
    public List<CollaboratorInfo> collaborators;

    @C09CT("should_display_tag")
    public boolean shouldDisplayTag;

    public CollabInfo() {
        this(false, null, 3, null);
    }

    public CollabInfo(boolean z, List<CollaboratorInfo> list) {
        this.shouldDisplayTag = z;
        this.collaborators = list;
    }

    public CollabInfo(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
