package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PlDataBean implements Serializable {
    public static final int $stable = 8;
    public List<String> alg = new ArrayList();
    public boolean guide;
    public boolean loading;
    public String relation;

    public final List<String> getAlg() {
        return this.alg;
    }

    public final boolean getGuide() {
        return this.guide;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final void setAlg(List<String> list) {
        this.alg = list;
    }

    public final void setGuide(boolean z) {
        this.guide = z;
    }

    public final void setLoading(boolean z) {
        this.loading = z;
    }

    public final void setRelation(String str) {
        this.relation = str;
    }
}
