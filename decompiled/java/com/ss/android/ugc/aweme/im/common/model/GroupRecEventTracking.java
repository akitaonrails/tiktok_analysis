package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupRecEventTracking implements Serializable {

    @C09CT("cluster_id")
    public final String clusterId;

    @C09CT("cluster_score")
    public final String clusterScore;

    @C09CT("data_source")
    public final String dataSource;

    @C09CT("rec_id")
    public final String recId;

    @C09CT("rec_type")
    public final String recType;

    public GroupRecEventTracking() {
        this(null, null, null, null, null);
    }

    public GroupRecEventTracking(String str, String str2, String str3, String str4, String str5) {
        this.recType = str;
        this.dataSource = str2;
        this.recId = str3;
        this.clusterId = str4;
        this.clusterScore = str5;
    }
}
