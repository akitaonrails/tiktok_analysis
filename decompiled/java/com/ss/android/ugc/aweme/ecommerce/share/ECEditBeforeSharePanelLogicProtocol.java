package com.ss.android.ugc.aweme.ecommerce.share;

import X.InterfaceC1366490lfD;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class ECEditBeforeSharePanelLogicProtocol extends TTSharePanelLogicProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public final InterfaceC1366490lfD T72() {
        return new InterfaceC1366490lfD() { // from class: X.0m5h
            @Override // X.InterfaceC1361850lXj
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJ(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJFF(Context context, BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1366490lfD
            public final void LJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1361850lXj
            public final Object LJII(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) throws JSONException {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                Uri.Builder builderAppendQueryParameter;
                Uri uriBuild;
                String string;
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("ec_share_link_chainkey_prepare_disable", false)) {
                    return Unit.LIZ;
                }
                String str = null;
                if (baseSharePackage != null) {
                    str = baseSharePackage.url;
                }
                Uri uri = UriProtector.parse(str);
                if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "chain_key")) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        if (Intrinsics.LJFF(jSONObject.opt("sc"), "AFFILIATE_UTM")) {
                            jSONObject.put("sc", interfaceC1369790lkX.key());
                            String strJ3 = C786410Ut5.J3(jSONObject);
                            Uri.Builder builderBuildUpon = C416901jj.LIZIZ(uri, "chain_key").buildUpon();
                            if (builderBuildUpon != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("chain_key", strJ3)) != null && (uriBuild = builderAppendQueryParameter.build()) != null && (string = uriBuild.toString()) != null && baseSharePackage != null) {
                                baseSharePackage.url = string;
                            }
                            return Unit.LIZ;
                        }
                        return Unit.LIZ;
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return Unit.LIZ;
                    }
                }
                return Unit.LIZ;
            }
        };
    }

    public ECEditBeforeSharePanelLogicProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }
}
