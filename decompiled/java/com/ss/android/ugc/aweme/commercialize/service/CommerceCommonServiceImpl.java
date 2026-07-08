package com.ss.android.ugc.aweme.commercialize.service;

import X.C1017070cZd;
import X.C1017560caQ;
import X.C1025350cmz;
import X.C1489110oqz;
import X.InterfaceC988770bpz;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceCommonServiceImpl implements ICommerceCommonService {
    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final boolean LIZJ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("enable_gap_info_expand", false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final boolean LIZLLL() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("tools_context_settings", false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final InterfaceC988770bpz LJ() {
        return C1017560caQ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final boolean LJFF(Aweme aweme) {
        return C1017070cZd.LLJIJIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final String LJI(String str) {
        return C1489110oqz.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final void LIZIZ(Context context, String str) {
        C1025350cmz.LIZIZ.LIZIZ(context, str);
    }
}
