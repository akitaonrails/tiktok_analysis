package com.tiktok.strategycenter;

import X.AbstractC2213611BkN;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes35.dex */
public class TTMCepSettingsValueManager {
    public ConcurrentHashMap<String, AbstractC2213611BkN> ruleSettingsMap = new ConcurrentHashMap<>();

    public void removeRuleConfig(String str) {
        this.ruleSettingsMap.remove(str);
    }

    public void addRuleConfig(String str, AbstractC2213611BkN abstractC2213611BkN) {
        this.ruleSettingsMap.put(str, abstractC2213611BkN);
    }

    public int getConfigValue(String str, String str2) {
        AbstractC2213611BkN abstractC2213611BkN = this.ruleSettingsMap.get(str);
        if (abstractC2213611BkN != null) {
            return abstractC2213611BkN.LIZ(str2);
        }
        return -1;
    }
}
