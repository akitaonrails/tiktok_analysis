package com.ss.android.ugc.aweme.search.model;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class VisualSearchContextModel implements Serializable {
    public final String enterFrom;
    public final String enterFromChannel;
    public final String enterMethod;
    public final String panelImprId;
    public final Map<String, String> passThroughLogParams;
    public final String photoSearchModule;
    public final String preClickImprId;
    public final String preTosKey;
    public final int rootEnterFromType;
    public String sessionKey;

    public final VisualSearchContextModel copy(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, Map<String, String> map) {
        return new VisualSearchContextModel(str, str2, str3, str4, i, str5, str6, str7, str8, map);
    }

    public final void setSessionKey(String str) {
        this.sessionKey = str;
    }

    public VisualSearchContextModel(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, Map<String, String> map) {
        this.enterFrom = str;
        this.enterFromChannel = str2;
        this.enterMethod = str3;
        this.sessionKey = str4;
        this.rootEnterFromType = i;
        this.preTosKey = str5;
        this.preClickImprId = str6;
        this.photoSearchModule = str7;
        this.panelImprId = str8;
        this.passThroughLogParams = map;
    }
}
