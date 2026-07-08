package com.ss.android.ugc.aweme.feed;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CreationInfo implements Serializable {

    @C09CT("creation_used_functions")
    public List<String> creationUsedFunctions;

    public CreationInfo() {
        this(null);
    }

    public final List<String> getCreationUsedFunctions() {
        return this.creationUsedFunctions;
    }

    public CreationInfo(List<String> list) {
        this.creationUsedFunctions = list;
    }
}
