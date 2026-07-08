package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class SecLinkLocalConfig {

    @C09CT("seclink_white_list")
    public final List<String> whiteList;

    public SecLinkLocalConfig() {
        this(C1697810uHb.LJIILJJIL("tiktok.com", "whatsapp.com", "twitter.com", "twitch.com", "youtube.com", "amazon.com", "google.com", "snapchat.com", "sgsnssdk.com"));
    }

    public SecLinkLocalConfig(List<String> list) {
        this.whiteList = list;
    }
}
