package com.ss.android.ugc.aweme.compliance.common.hydrogen;

import X.C0XMM;
import X.C0XMO;
import X.C0XMP;
import X.C0XMR;
import X.C1826170xcd;
import X.C2097608Jq;
import X.C849300XTk;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class PresentationManager implements IRouteAction {
    public static final C0XMR Companion = new Object() { // from class: X.0XMR
    };
    public static final Map<String, Class<? extends C0XMO>> handlerMap = C2097608Jq.LJIIIIZZ(new Pair("logout", C0XMM.class), new Pair("dialog", C849300XTk.class), new Pair("toast", C0XMP.class), new Pair("bottom_sheet", C1826170xcd.class));

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        C0XMO c0xmoNewInstance;
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            Map<String, Class<? extends C0XMO>> map = handlerMap;
            if (map.containsKey(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                Class<? extends C0XMO> cls = map.get(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                if (cls != null && (c0xmoNewInstance = cls.newInstance()) != null) {
                    c0xmoNewInstance.LIZ(uri);
                }
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
