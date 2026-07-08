package com.ss.android.ugc.profile.business.live;

import X.C01GW;
import X.C1253930ijf;
import X.C2188811AlT;
import X.C452501pT;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import java.util.Set;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarLiveProtocol extends NavbarPlatformProtocol<BizBaseData> {
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(355));

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "nav_bar_end_live";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        if (Om()) {
            C1253930ijf.LIZ.getClass();
            C1253930ijf.LJ("show");
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return Om();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String strLIZIZ;
        int i;
        C1253930ijf.LIZ.getClass();
        C1253930ijf.LJ("click");
        if (!TextUtils.isEmpty((String) this.LLJLL.getValue()) && !TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse((String) this.LLJLL.getValue()), "url"))) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse((String) this.LLJLL.getValue()), "url");
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).buildUpon();
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("live_event_permission", false)) {
                    i = 1;
                } else {
                    i = 0;
                }
                strLIZIZ = builderBuildUpon.appendQueryParameter("live_event_permission", String.valueOf(i)).build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                sbLIZ.append("&live_event_permission=");
                SettingsManager.LIZLLL().getClass();
                sbLIZ.append(SettingsManager.LIZ("live_event_permission", false) ? 1 : 0);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            Uri uriBuild = UriProtector.parse((String) this.LLJLL.getValue());
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uriBuild);
            if (queryParameterNames != null) {
                Uri.Builder builderClearQuery = uriBuild.buildUpon().clearQuery();
                for (String str : queryParameterNames) {
                    if (!Intrinsics.LJFF(str, "url")) {
                        builderClearQuery.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, str));
                    }
                }
                uriBuild = builderClearQuery.build();
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIJ(getContext(), uriBuild.buildUpon().appendQueryParameter("url", strLIZIZ).build());
        }
        return false;
    }
}
