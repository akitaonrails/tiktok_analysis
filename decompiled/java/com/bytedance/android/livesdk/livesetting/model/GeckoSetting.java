package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GeckoSetting {
    public static final TypeAdapter ADAPTER = new GeckoSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("is_enable")
    public boolean isEnable = true;

    @C09CT("url_list")
    public List<String> urlList = new ArrayList();

    @C09CT("ppe_url_list")
    public List<String> ppeUrlList = new ArrayList();

    @C09CT("boe_url_list")
    public List<String> boeUrlList = new ArrayList();

    @C09CT("delay_trigger_down_time")
    public int delayTriggerDownTime = 5;
    public final transient List<String> LIZ = C1697810uHb.LJIILJJIL("https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/gecko/resource", "https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-euttp/10/gecko/resource", "https://lf-main-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource", "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource", "https://lf19-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource");
    public final transient List<String> LIZIZ = C1697810uHb.LJIILJJIL("https://lf19-gecko-source.tiktokcdn-us.com/obj/byte-gurd-source-tx/10/gecko/resource", "https://lf16-gecko-source.tiktokcdn-us.com/obj/byte-gurd-source-tx/10/gecko/resource");
    public final transient List<String> LIZJ = C1697810uHb.LJIILJJIL("https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-euttp/10/gecko/resource", "https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/gecko/resource", "https://lf16-sourcecdn-tos.ibytedtos.com/obj/tiktok-teko-source-gcp-aiso/10/gecko/resource", "https://lf19-sourcecdn-tos.ibytedtos.com/obj/tiktok-teko-source-gcp-aiso/10/gecko/resource", "https://lf-main-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource");
}
