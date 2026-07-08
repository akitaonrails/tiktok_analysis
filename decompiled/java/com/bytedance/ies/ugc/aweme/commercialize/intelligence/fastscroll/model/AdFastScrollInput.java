package com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes28.dex */
public final class AdFastScrollInput implements Serializable {

    @C09CT("config")
    public AdFastScrollConfigParam config;

    @C09CT("data")
    public final ArrayList<AdFastScrollDataParam> datas;

    public AdFastScrollInput() {
        this(new ArrayList(), null);
    }

    public final AdFastScrollConfigParam getConfig() {
        return this.config;
    }

    public final ArrayList<AdFastScrollDataParam> getDatas() {
        return this.datas;
    }

    public final void setConfig(AdFastScrollConfigParam adFastScrollConfigParam) {
        this.config = adFastScrollConfigParam;
    }

    public AdFastScrollInput(ArrayList<AdFastScrollDataParam> arrayList, AdFastScrollConfigParam adFastScrollConfigParam) {
        this.datas = arrayList;
        this.config = adFastScrollConfigParam;
    }
}
