package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.hybrid;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class LiveStreamAdaptAbSettings {
    public static final /* synthetic */ int LIZ = 0;

    public static final class AndroidAllowList {

        @C09CT("ChannelMap")
        public final Map<String, String> channelMap;

        @C09CT("PanelId")
        public final List<String> panelId;

        public AndroidAllowList() {
            this(null, null);
        }

        public AndroidAllowList(List<String> list, Map<String, String> map) {
            this.panelId = list;
            this.channelMap = map;
        }
    }

    public static final class Model {

        /* JADX INFO: renamed from: android, reason: collision with root package name */
        @C09CT("Android")
        public final AndroidAllowList f358android;

        @C09CT("iOS")
        public final List<String> iOS;

        public Model() {
            this(null, null);
        }

        public Model(AndroidAllowList androidAllowList, List<String> list) {
            this.f358android = androidAllowList;
            this.iOS = list;
        }
    }
}
