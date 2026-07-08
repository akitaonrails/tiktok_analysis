package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.InterfaceC1493105sv;
import android.util.ArrayMap;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatFunnelAnalytics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMChatFunnelAnalytics implements IIMChatFunnelAnalytics {
    public static final IMChatFunnelAnalytics LIZIZ = new IMChatFunnelAnalytics();
    public static final boolean LIZJ;

    public static final class Service implements IIMChatFunnelAnalytics {
        public final /* synthetic */ IMChatFunnelAnalytics LIZIZ = IMChatFunnelAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatFunnelAnalytics
        public final void LIZ(boolean z, boolean z2, int i, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZ(z, z2, i, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatFunnelAnalytics
        public final void LIZIZ(String str, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZIZ(str, interfaceC1493105sv);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    static {
        /*
            com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatFunnelAnalytics r0 = new com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatFunnelAnalytics
            r0.<init>()
            com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatFunnelAnalytics.LIZIZ = r0
            X.05t1 r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMHitSampleDetector.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMHitSampleDetector> r0 = X.C1493705t1.LIZIZ
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMHitSampleDetector r2 = (com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMHitSampleDetector) r2
            if (r2 == 0) goto L25
            java.lang.String r1 = "im_enter_chat_funnel"
            r0 = 1008981770(0x3c23d70a, float:0.01)
            boolean r1 = r2.isHitSample(r1, r0)
            r0 = 1
            if (r1 != r0) goto L25
        L22:
            com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatFunnelAnalytics.LIZJ = r0
            return
        L25:
            r0 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatFunnelAnalytics.<clinit>():void");
    }

    public final void LIZJ(InterfaceC1493105sv interfaceC1493105sv) {
        if (!LIZJ) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("stage", "step");
        arrayMap.put("step", "fragment_create");
        interfaceC1493105sv.sendEvent("im_enter_chat_funnel", arrayMap);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatFunnelAnalytics
    public final void LIZIZ(String str, InterfaceC1493105sv interfaceC1493105sv) {
        if (!LIZJ) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("stage", "end");
        arrayMap.put("step", str);
        interfaceC1493105sv.sendEvent("im_enter_chat_funnel", arrayMap);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatFunnelAnalytics
    public final void LIZ(boolean z, boolean z2, int i, InterfaceC1493105sv interfaceC1493105sv) {
        if (!LIZJ) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("stage", "leave");
        arrayMap.put("has_onquery", String.valueOf(z));
        arrayMap.put("has_submitlist", String.valueOf(z2));
        arrayMap.put("display_list_count", String.valueOf(i));
        interfaceC1493105sv.sendEvent("im_enter_chat_funnel", arrayMap);
    }
}
