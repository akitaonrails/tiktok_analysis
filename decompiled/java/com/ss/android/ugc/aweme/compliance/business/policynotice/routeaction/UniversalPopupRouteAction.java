package com.ss.android.ugc.aweme.compliance.business.policynotice.routeaction;

import X.C19262710Xp;
import X.EnumC1518670pcf;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes24.dex */
public final class UniversalPopupRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Integer numValueOf;
        int value;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), Scene.SCENE_SERVICE);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
        } else {
            numValueOf = null;
        }
        if (context != null && C19262710Xp.LIZ()) {
            if (numValueOf != null) {
                value = numValueOf.intValue();
            } else {
                value = EnumC1518670pcf.SCENE_COLD_LAUNCH.getValue();
            }
            TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
            if (tTKUserCommunicationService != null) {
                tTKUserCommunicationService.LJIIJJI(value, null, null);
            }
        }
        return Boolean.TRUE;
    }
}
