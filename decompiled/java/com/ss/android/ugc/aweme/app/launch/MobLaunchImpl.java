package com.ss.android.ugc.aweme.app.launch;

import X.C1400380mXs;
import X.C19265010Ym;
import X.C20684815ws;
import X.C2344009Gk;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class MobLaunchImpl implements IMobLaunchApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void LIZ(boolean z) {
        C19265010Ym.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi
    public final void LIZIZ(Uri uri, String str, boolean z) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        C1400380mXs.LIZ().LIZIZ = false;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("land_position", str);
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("launch_app");
            mobClickObtain.setLabelName(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            mobClickObtain.setJsonObject(jSONObject);
            C20684815ws.onEvent(mobClickObtain);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C19265010Ym.LIZ) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_to", str);
            c2344009Gk.LJIIIIZZ("url", String.valueOf(uri));
            C20684815ws.LJIILLIIL("open_url", c2344009Gk.LIZ);
            C19265010Ym.LIZ = false;
        }
    }
}
