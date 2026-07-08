package com.ss.android.ugc.aweme.discover.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ChallengeBillboard implements Serializable {
    public int rank;
    public String schema;
    public int version;

    public ChallengeBillboard() {
        this(0, 0, "");
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public ChallengeBillboard(int i, int i2, String str) {
        this.rank = i;
        this.version = i2;
        this.schema = str;
    }
}
