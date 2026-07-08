package com.ss.android.ugc.aweme.im.strategy;

import X.C09CT;
import X.C898350ZMb;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public class IBusinessConfig implements Serializable {
    public static final C898350ZMb Companion = new Object() { // from class: X.0ZMb
    };

    @C09CT("config_name")
    public String configName = "";

    public final String getConfigName() {
        return this.configName;
    }

    public final void setConfigName(String str) {
        this.configName = str;
    }
}
