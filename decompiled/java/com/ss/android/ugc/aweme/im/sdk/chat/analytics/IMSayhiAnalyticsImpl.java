package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.C0Z9X;
import X.C1336205Ku;
import X.C2097608Jq;
import X.C892550Yzt;
import X.InterfaceC892560Yzu;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.saas.host.api.main.IMMainSAFLifecycle;
import com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSayhiAnalyticsImpl implements IMSayhiAnalytics {
    public static final IMSayhiAnalyticsImpl LIZ = new IMSayhiAnalyticsImpl();
    public static final Map<LifecycleOwner, Set<String>> LIZIZ = new LinkedHashMap();
    public static final IMSayhiAnalyticsImpl$autoRemoveObserver$1 LIZJ = new IMSayhiAnalyticsImpl$autoRemoveObserver$1();

    public static final class Service implements IMSayhiAnalytics {
        public final /* synthetic */ IMSayhiAnalyticsImpl LIZ = IMSayhiAnalyticsImpl.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics
        public final Map<String, String> LIZ() {
            return this.LIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics
        public final void LIZIZ(String str, Map<String, String> map, LifecycleOwner lifecycleOwner, boolean z) {
            this.LIZ.LIZIZ(str, map, lifecycleOwner, z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics
        public final void LIZJ(String str, Map<String, String> map) {
            this.LIZ.LIZJ(str, map);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics
        public final void LIZLLL(String str, String str2, String str3, Map<String, String> map) {
            this.LIZ.LIZLLL(str, str2, str3, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics
    public final Map<String, String> LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("message_type", "sticker"), new Pair("a:light_interaction_name", "say_hi_sticker_v1"));
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics
    public final void LIZJ(String str, Map<String, String> map) {
        InterfaceC892560Yzu interfaceC892560YzuLIZJ;
        if (C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(str)) {
            map.put("message_type", "send_a_hi");
            C0Z9X c0z9x = (C0Z9X) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
            if (c0z9x != null && (interfaceC892560YzuLIZJ = c0z9x.LIZJ()) != null) {
                interfaceC892560YzuLIZJ.LJFF("send_a_hi", map);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics
    public final void LIZIZ(String str, Map<String, String> map, LifecycleOwner lifecycleOwner, boolean z) {
        InterfaceC892560Yzu interfaceC892560YzuLJJIJIIJIL;
        LifecycleOwner lifecycleOwnerLIZ;
        if (!C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(str)) {
            return;
        }
        if (lifecycleOwner != null) {
            IMMainSAFLifecycle.LIZ.getClass();
            IMMainSAFLifecycle value = C892550Yzt.LIZIZ.getValue();
            if (value == null || (lifecycleOwnerLIZ = value.LIZ(lifecycleOwner)) == null) {
                lifecycleOwnerLIZ = lifecycleOwner;
            }
            Map<LifecycleOwner, Set<String>> map2 = LIZIZ;
            Set<String> linkedHashSet = (Set) ((LinkedHashMap) map2).get(lifecycleOwnerLIZ);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
            }
            Lifecycle lifecycle = lifecycleOwnerLIZ.getLifecycle();
            IMSayhiAnalyticsImpl$autoRemoveObserver$1 iMSayhiAnalyticsImpl$autoRemoveObserver$1 = LIZJ;
            lifecycle.removeObserver(iMSayhiAnalyticsImpl$autoRemoveObserver$1);
            lifecycleOwnerLIZ.getLifecycle().addObserver(iMSayhiAnalyticsImpl$autoRemoveObserver$1);
            map2.put(lifecycleOwnerLIZ, linkedHashSet);
            if (!linkedHashSet.contains(str) || z) {
                linkedHashSet.add(str);
            }
        }
        C0Z9X c0z9x = (C0Z9X) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
        if (c0z9x != null && (interfaceC892560YzuLJJIJIIJIL = c0z9x.LJJIJIIJIL(lifecycleOwner)) != null) {
            if (str == null) {
                str = "";
            }
            interfaceC892560YzuLJJIJIIJIL.LIZJ(str, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics
    public final void LIZLLL(String str, String str2, String str3, Map<String, String> map) {
        C0Z9X c0z9x;
        InterfaceC892560Yzu interfaceC892560YzuLJJIJIIJIL;
        InterfaceC892560Yzu interfaceC892560YzuLIZJ;
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str2), new Pair("enter_method", str3), new Pair("action_type", str), new Pair("message_type", "send_a_hi"));
        if (map != null && (true ^ mapLJIIJ.isEmpty())) {
            mapLJIIJ.putAll(map);
        }
        if (Intrinsics.LJFF(str, "click")) {
            C0Z9X c0z9x2 = (C0Z9X) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
            if (c0z9x2 != null && (interfaceC892560YzuLIZJ = c0z9x2.LIZJ()) != null) {
                interfaceC892560YzuLIZJ.LJFF("send_a_hi", mapLJIIJ);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "show") || (c0z9x = (C0Z9X) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class)) == null || (interfaceC892560YzuLJJIJIIJIL = c0z9x.LJJIJIIJIL(null)) == null) {
            return;
        }
        interfaceC892560YzuLJJIJIIJIL.LIZJ("", mapLJIIJ);
    }
}
