package ttp.orbu.sdk;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum Channel {
    NETWORK,
    WEB,
    WEB_ROUTER,
    APP_TO_APP,
    SETTINGS,
    SDK,
    GECKO,
    SYSTEM_API,
    LIVE_SEI,
    LIVE_VIDEO,
    LIVE_AUDIO;

    public static Channel valueOf(String str) {
        return (Channel) C08FF.LIZ(Channel.class, str);
    }
}
