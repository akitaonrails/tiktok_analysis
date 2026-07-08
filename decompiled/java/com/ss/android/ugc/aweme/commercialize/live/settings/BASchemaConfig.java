package com.ss.android.ugc.aweme.commercialize.live.settings;

import X.C01GW;
import X.C09CT;
import X.C123100dR;
import X.C452501pT;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class BASchemaConfig {
    public static final BASchemaConfigData LIZ = new BASchemaConfigData(new LiveLinkData("", "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-list/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-list"), new LiveLinkData("", "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-pin/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-pin"), new LiveLinkData("", "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-preview/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-preview"));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(172));

    public static final class BASchemaConfigData {

        @C09CT("live-link-list")
        public final LiveLinkData liveLinkList;

        @C09CT("live-link-pin")
        public final LiveLinkData liveLinkPin;

        @C09CT("live-link-preview")
        public final LiveLinkData liveLinkPreview;

        public BASchemaConfigData() {
            this(new LiveLinkData("", "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-list/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-list"), new LiveLinkData("", "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-pin/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-pin"), new LiveLinkData("", "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=live-link-preview/template.js&hide_nav_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-link-preview"));
        }

        public BASchemaConfigData(LiveLinkData liveLinkData, LiveLinkData liveLinkData2, LiveLinkData liveLinkData3) {
            this.liveLinkList = liveLinkData;
            this.liveLinkPin = liveLinkData2;
            this.liveLinkPreview = liveLinkData3;
        }
    }

    public static final class LiveLinkData {

        @C09CT("fallback_url")
        public final String fallback_url;

        @C09CT("schema")
        public final String schema;

        public LiveLinkData() {
            this("", "");
        }

        public final String LIZ() {
            Uri.Builder builderBuildUpon = UriProtector.parse(this.schema).buildUpon();
            if (C123100dR.LIZ(this.fallback_url)) {
                builderBuildUpon.appendQueryParameter("fallback_url", this.fallback_url);
            }
            return builderBuildUpon.build().toString();
        }

        public LiveLinkData(String str, String str2) {
            this.fallback_url = str;
            this.schema = str2;
        }
    }
}
