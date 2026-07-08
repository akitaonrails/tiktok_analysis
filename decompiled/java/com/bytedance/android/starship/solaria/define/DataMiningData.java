package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class DataMiningData implements Serializable {

    @C09CT("solaria_dm_config")
    public DataMiningConfig configList;

    public DataMiningData() {
        this(null);
    }

    public DataMiningData(DataMiningConfig dataMiningConfig) {
        this.configList = dataMiningConfig;
    }

    public final void setConfigList(DataMiningConfig dataMiningConfig) {
        this.configList = dataMiningConfig;
    }
}
