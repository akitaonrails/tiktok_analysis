package com.tiktok.pns.ldp.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class FrequencyRequestParams {

    @C09CT("common_data")
    public final String commonParams;

    @C09CT("data")
    public final List<PrivatisedDataStorageModel> data;

    public FrequencyRequestParams(String str, List<PrivatisedDataStorageModel> list) {
        this.commonParams = str;
        this.data = list;
    }
}
