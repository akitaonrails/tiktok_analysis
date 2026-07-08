package com.orbu.core.utils;

import com.orbu.core.config.AgConfig;
import com.orbu.core.config.BootConfig;
import com.orbu.core.config.NetConfig;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKOrbuUtils {
    public static final TTKOrbuUtils INSTANCE = new TTKOrbuUtils();

    public final String getBuiltinDataflowId(String str, String str2, BootConfig bootConfig) {
        AgConfig agConfig = bootConfig.agConfig;
        if (agConfig.boot.matchDomainAndPath(str, str2)) {
            return agConfig.boot.dataflowId;
        }
        if (agConfig.ag.matchDomainAndPath(str, str2)) {
            return agConfig.ag.dataflowId;
        }
        if (!agConfig.agSpecial.isEmpty()) {
            for (NetConfig netConfig : agConfig.agSpecial) {
                if (netConfig.matchDomainAndPath(str, str2)) {
                    return netConfig.dataflowId;
                }
            }
            return null;
        }
        return null;
    }
}
