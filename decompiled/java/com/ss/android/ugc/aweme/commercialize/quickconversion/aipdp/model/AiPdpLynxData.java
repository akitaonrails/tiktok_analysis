package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class AiPdpLynxData implements Serializable {
    public static final int $stable = 0;
    public final String componentName;
    public final String geckoChannel;
    public final String rawData;
    public final String schema;

    public AiPdpLynxData() {
        this(null, null, null, "ai_preview_page");
    }

    public AiPdpLynxData(String str, String str2, String str3, String str4) {
        this.schema = str;
        this.rawData = str2;
        this.geckoChannel = str3;
        this.componentName = str4;
    }
}
