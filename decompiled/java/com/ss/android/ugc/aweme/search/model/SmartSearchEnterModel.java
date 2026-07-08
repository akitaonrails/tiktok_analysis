package com.ss.android.ugc.aweme.search.model;

import X.EnumC180200me;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class SmartSearchEnterModel implements Serializable {
    public final Boolean descOnly;
    public final EnumC180200me enterType;
    public final String lastVisionSearchId;
    public final String smartSearchPanelId;

    public final SmartSearchEnterModel copy(String str, EnumC180200me enumC180200me, Boolean bool, String str2) {
        return new SmartSearchEnterModel(str, enumC180200me, bool, str2);
    }

    public SmartSearchEnterModel(String str, EnumC180200me enumC180200me, Boolean bool, String str2) {
        this.smartSearchPanelId = str;
        this.enterType = enumC180200me;
        this.descOnly = bool;
        this.lastVisionSearchId = str2;
    }
}
