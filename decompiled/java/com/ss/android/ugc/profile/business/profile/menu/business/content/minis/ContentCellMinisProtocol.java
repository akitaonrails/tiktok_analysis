package com.ss.android.ugc.profile.business.profile.menu.business.content.minis;

import X.C098200Yq;
import X.C13LP;
import X.C13LQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C2097608Jq;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public class ContentCellMinisProtocol extends ContentCellProtocol {
    public static final Set<String> LLL = C13LQ.LJLIIL(new String[]{"lynxview", "webview"});
    public static final List<String> LLLF = C1697810uHb.LJIIJJI("url", "surl");

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public String getName() {
        return "content_section_cell_tiktok_minis";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public void LJLJI() {
        super.LJLJI();
    }

    public static String LJLLLL(Uri uri) {
        String str = null;
        if (!C13LP.LJJJJ(uri.getHost(), LLL)) {
            return null;
        }
        Iterator<String> it2 = LLLF.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, next);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                str = next;
                break;
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.menu.business.content.minis.ContentCellMinisProtocol.LJII(android.view.View):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLILLLLZI(Map map) {
        Map<String, ? extends Object> map2 = this.LLJZ;
        Object obj = null;
        if (map2 != null) {
            obj = map2.get("minis_auto_open_profile_more_from");
        }
        if (!(obj instanceof String) || obj == null) {
            obj = "";
        }
        if (map == null) {
            map = C2097608Jq.LJIIJ(new Pair("if_rich_card", CardStruct.IStatusCode.DEFAULT), new Pair("click_action", "click_enter_center"), new Pair("enter_from", obj));
        }
        Map<String, String> mapLJLLL = LJLLL(map);
        IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
        if (iMinisApiService != null) {
            iMinisApiService.LJIIL(this.LLJLLL);
        }
        IMinisApiService iMinisApiService2 = (IMinisApiService) ServiceManager.get().getService(IMinisApiService.class);
        if (iMinisApiService2 != null) {
            iMinisApiService2.LIZ(mapLJLLL);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public boolean LJLJLLL(n nVar) {
        IMinisApiService iMinisApiService = (IMinisApiService) ServiceManager.get().getService(IMinisApiService.class);
        if (iMinisApiService != null) {
            return iMinisApiService.LJJIFFI();
        }
        return false;
    }

    public final Map<String, String> LJLLL(Map<String, String> map) {
        Object obj;
        Object obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Map<String, ? extends Object> map2 = this.LLJZ;
        if (map2 != null) {
            obj = map2.get("minis_profile_sidebar_revisit_edu");
        } else {
            obj = null;
        }
        String str = "1";
        if (Intrinsics.LJFF(obj, "1")) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_minis_revisit_edu", obj2);
        if (!this.LLJLLL) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_revisit_guidance_popup_shown", str);
        if (this.LLJLLL) {
            linkedHashMap.put("popup_type", "highlight");
        }
        return linkedHashMap;
    }

    public static Uri LJZI(Uri uri, Map map) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Object c098200Yq;
        Uri uriLL;
        String strLJLLLL = LJLLLL(uri);
        if (strLJLLLL != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, strLJLLLL)) != null) {
            boolean z = true;
            if (!(!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter))) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                try {
                    c098200Yq = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Uri uri2 = (Uri) c098200Yq;
                if (uri2 == null) {
                    return null;
                }
                String scheme = uri2.getScheme();
                if (scheme != null && !a0.LJJJIL(scheme)) {
                    z = false;
                }
                if (z || (uriLL = LL(uri2, map)) == null) {
                    return null;
                }
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    if (Intrinsics.LJFF(str, strLJLLLL)) {
                        builderClearQuery.appendQueryParameter(strLJLLLL, uriLL.toString());
                    } else if (!map.containsKey(str)) {
                        Iterator<String> it2 = UriProtector.getQueryParameters(uri, str).iterator();
                        while (it2.hasNext()) {
                            builderClearQuery.appendQueryParameter(str, it2.next());
                        }
                    }
                }
                return builderClearQuery.build();
            }
        }
        return null;
    }

    public static Uri LL(Uri uri, Map map) {
        Uri.Builder builderClearQuery;
        if (map.isEmpty()) {
            return null;
        }
        Set setKeySet = map.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            builderClearQuery = uri.buildUpon();
        } else {
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, (String) it2.next()) != null) {
                    builderClearQuery = uri.buildUpon().clearQuery();
                    for (String str : UriProtector.getQueryParameterNames(uri)) {
                        if (!map.containsKey(str)) {
                            Iterator<String> it3 = UriProtector.getQueryParameters(uri, str).iterator();
                            while (it3.hasNext()) {
                                builderClearQuery.appendQueryParameter(str, it3.next());
                            }
                        }
                    }
                }
            }
            builderClearQuery = uri.buildUpon();
        }
        for (Map.Entry entry : map.entrySet()) {
            builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderClearQuery.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJJLL(Map map, boolean z) {
        IMinisApiService iMinisApiService;
        Map<String, ? extends Object> map2 = this.LLJZ;
        Object obj = null;
        if (map2 != null) {
            obj = map2.get("minis_auto_open_profile_more_from");
        }
        if (!(obj instanceof String) || obj == null) {
            obj = "";
        }
        if (map == null) {
            map = C2097608Jq.LJIIJ(new Pair("if_rich_card", CardStruct.IStatusCode.DEFAULT), new Pair("enter_from", obj));
        }
        Map<String, String> mapLJLLL = LJLLL(map);
        if (z && (iMinisApiService = (IMinisApiService) ServiceManager.get().getService(IMinisApiService.class)) != null) {
            iMinisApiService.LJIIJ(mapLJLLL);
        }
    }
}
