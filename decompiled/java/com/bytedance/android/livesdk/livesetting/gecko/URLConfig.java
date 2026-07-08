package com.bytedance.android.livesdk.livesetting.gecko;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class URLConfig {
    public static final TypeAdapter ADAPTER = new URLConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("m_internal_test")
    public String[] internalTestM = {"https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/9/teko/resource"};

    @C09CT("t_internal_test")
    public String[] internalTestT = {"https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-internal-sg/7/teko/resource"};

    @C09CT("m_online")
    public String[] onlineM = {"https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/teko/resource", "https://sf-teko-source.tiktokcdn-us.com/obj/byte-gurd-source-tx/10/teko/resource", "https://sf-teko-source.tiktokcdn-eu.com/obj/tiktok-teko-source-euttp/10/teko/resource"};

    @C09CT("t_online")
    public String[] onlineT = {"https://sf-teko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/8/teko/resource", "https://sf-teko-source.tiktokcdn-us.com/obj/byte-gurd-source-tx/8/teko/resource", "https://sf-teko-source.tiktokcdn-eu.com/obj/tiktok-teko-source-euttp/8/teko/resource"};
}
