package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.C09CT;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CascadeAnswer implements Serializable {

    @C09CT("has_sub")
    public boolean hasSub;

    @C09CT("sub_value")
    public List<CascadeAnswer> subValue;

    @C09CT("value")
    public String value;

    public CascadeAnswer() {
        this(false, Collections.emptyList(), "");
    }

    public final void setHasSub(boolean z) {
        this.hasSub = z;
    }

    public final void setSubValue(List<CascadeAnswer> list) {
        this.subValue = list;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public CascadeAnswer(boolean z, List<CascadeAnswer> list, String str) {
        this.hasSub = z;
        this.subValue = list;
        this.value = str;
    }
}
