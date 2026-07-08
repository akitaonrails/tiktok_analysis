package com.ss.android.ugc.aweme.creative.taskscheduler.resource;

import X.C08FF;

/* JADX INFO: loaded from: classes26.dex */
public enum ResourceType {
    NETWORK_TRANSMIT,
    NETWORK_RECEIVE,
    CPU;

    public static ResourceType valueOf(String str) {
        return (ResourceType) C08FF.LIZ(ResourceType.class, str);
    }
}
