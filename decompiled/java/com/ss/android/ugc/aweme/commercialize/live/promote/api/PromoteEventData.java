package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class PromoteEventData implements Serializable {

    @C09CT("ev_type")
    public String evType;

    @C09CT("list")
    public List<PromoteEventModel> list;

    public PromoteEventData() {
        this("batch", null);
    }

    public final String getEvType() {
        return this.evType;
    }

    public final List<PromoteEventModel> getList() {
        return this.list;
    }

    public final void setEvType(String str) {
        this.evType = str;
    }

    public final void setList(List<PromoteEventModel> list) {
        this.list = list;
    }

    public PromoteEventData(String str, List<PromoteEventModel> list) {
        this.evType = str;
        this.list = list;
    }
}
