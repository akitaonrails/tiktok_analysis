package com.ss.android.ugc.aweme.detail.component.biz.creativetools;

import X.C19EG;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.IDuetDownloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class CreativeToolDuetBottomComponent extends CreativeToolCommonBottomComponent {
    @Override // com.ss.android.ugc.aweme.detail.component.biz.creativetools.CreativeToolCommonBottomComponent
    public final void mo() {
    }

    @Override // com.ss.android.ugc.aweme.detail.component.biz.creativetools.CreativeToolCommonBottomComponent
    public final int oo(boolean z) {
        return 2131826575;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.biz.creativetools.CreativeToolCommonBottomComponent
    public final void so(Aweme aweme) {
        IDuetDownloadService iDuetDownloadService = (IDuetDownloadService) PluggableExtentionKt.pluggableSpi$default(IDuetDownloadService.class, false, false, false, 14, null);
        if (iDuetDownloadService != null) {
            iDuetDownloadService.LIZJ(aweme, this.LLJILJIL, "detail_page");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.biz.creativetools.CreativeToolCommonBottomComponent
    public final void uo(C19EG c19eg, Aweme aweme, String str, String str2) {
        IDuetDownloadService iDuetDownloadService = (IDuetDownloadService) PluggableExtentionKt.pluggableSpi$default(IDuetDownloadService.class, false, false, false, 14, null);
        if (iDuetDownloadService != null) {
            iDuetDownloadService.LIZLLL(aweme, this.LLJILJIL, "detail_page");
        }
        IDuetDownloadService iDuetDownloadService2 = (IDuetDownloadService) PluggableExtentionKt.pluggableSpi$default(IDuetDownloadService.class, false, false, false, 14, null);
        if (iDuetDownloadService2 != null) {
            iDuetDownloadService2.LJFF(c19eg, str, C2097608Jq.LJIIIIZZ(new Pair("duet_shoot_way", "duet"), new Pair("duet_entrance_type", "detail_page")), "duet_page");
        }
    }
}
