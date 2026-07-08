package com.ss.android.ugc.aweme.deeplink.actions.music;

import X.AbstractC1950107kR;
import X.C01GW;
import X.C123100dR;
import X.C1697810uHb;
import X.C1941907j7;
import X.C1950707kX;
import X.C2188811AlT;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.dsp.experiment.MusicDeeplinkSetting;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class MusicLynxviewAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "deep_link_music_lynxview";
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        String str2;
        Object obj = map.get("url");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (C123100dR.LIZ(str2)) {
            if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot()) {
                SmartRouter.buildRoute(c1950707kX.LIZ, "//main").open();
            }
            Uri uri = UriProtector.parse(str2);
            List listLJIIJJI = C1697810uHb.LJIIJJI("surl", "fallback_url", "url", "compile_path");
            if (Intrinsics.LJFF(uri.getScheme(), "aweme") && Intrinsics.LJFF(uri.getHost(), "lynxview")) {
                for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3);
                    if (listLJIIJJI.contains(str3)) {
                        C01GW c01gw = C1941907j7.LIZIZ;
                        if (((MusicDeeplinkSetting) c01gw.getValue()).getEnabled()) {
                            if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                Uri uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                String host = uri2.getHost();
                                if (host == null) {
                                    host = "";
                                }
                                boolean zLJFF = Intrinsics.LJFF(uri2.getScheme(), "https");
                                for (String str4 : ((MusicDeeplinkSetting) c01gw.getValue()).getDomains()) {
                                    if (zLJFF) {
                                        if (!Intrinsics.LJFF(host, str4)) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append('.');
                                            sbLIZ.append(str4);
                                            if (u.LJIIZILJ(host, C2188811AlT.LIZIZ(sbLIZ), false)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                return new Pair<>(str, map);
                            }
                            continue;
                        } else {
                            return new Pair<>(str, map);
                        }
                    }
                }
                return new Pair<>(str2, new HashMap());
            }
            return new Pair<>(str, map);
        }
        return new Pair<>(str, map);
    }
}
