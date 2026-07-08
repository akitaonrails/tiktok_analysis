package com.ss.android.ugc.aweme.link;

import X.C0CQD;
import X.C0CR3;
import X.C1514430pVp;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INUJDeeplinkService;
import com.ss.android.ugc.aweme.journey.step.tts.TTSConditionHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class NUJDeeplinkService implements INUJDeeplinkService {
    @Override // com.ss.android.ugc.aweme.journey.INUJDeeplinkService
    public final void LIZJ() {
        TTSConditionHelper.LIZ.getClass();
        TTSConditionHelper.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJDeeplinkService
    public final void LIZ() {
        IEcUgNewInstallService iEcUgNewInstallService;
        if (!C1514430pVp.LIZLLL().booleanValue() || (iEcUgNewInstallService = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iEcUgNewInstallService.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJDeeplinkService
    public final void LIZIZ(Uri uri) {
        C0CQD.LIZ.getClass();
        C0CQD.LIZLLL = uri.toString();
        if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "need_mall"), "1")) {
            C0CQD.LIZJ = true;
            C0CR3.LIZ.getClass();
            if (C0CR3.LJIIIZ) {
                C0CQD.LIZ();
            }
        }
    }
}
