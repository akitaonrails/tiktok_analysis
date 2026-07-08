package com.ss.android.ugc.aweme.badge;

import X.C004I;
import com.bytedance.jedi.arch.JediViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class EditProfileBadgeViewModel extends JediViewModel<EditProfileBadgeState> {
    public final List<EditProfileBadgeModel> LLILZIL = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:8:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hR2() {
        /*
            r11 = this;
            java.util.List<com.ss.android.ugc.aweme.badge.EditProfileBadgeModel> r0 = r11.LLILZIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            kotlin.jvm.internal.AwS610S0100000_31 r1 = new kotlin.jvm.internal.AwS610S0100000_31
            r0 = 480(0x1e0, float:6.73E-43)
            r1.<init>(r11, r0)
            r11.setState(r1)
            X.15fx r0 = X.C20579915fx.LIZ
            r0.getClass()
            X.01GW r0 = X.C20579915fx.LIZIZ
            java.lang.Object r4 = r0.getValue()
            X.15fy r4 = (X.InterfaceC20580015fy) r4
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.port.in.IAVSettingService> r0 = com.ss.android.ugc.aweme.port.in.IAVSettingService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.port.in.IAVSettingService r0 = (com.ss.android.ugc.aweme.port.in.IAVSettingService) r0
            java.lang.String r3 = r0.getAppLanguage()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.port.in.IAVSettingService> r0 = com.ss.android.ugc.aweme.port.in.IAVSettingService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.port.in.IAVSettingService r0 = (com.ss.android.ugc.aweme.port.in.IAVSettingService) r0
            java.lang.String r2 = r0.getAppLogRegion()
            java.lang.Class<com.tiktok.ef.i18n.service.manager.I18nServiceApi> r5 = com.tiktok.ef.i18n.service.manager.I18nServiceApi.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.tiktok.ef.i18n.service.manager.I18nServiceApi r0 = (com.tiktok.ef.i18n.service.manager.I18nServiceApi) r0
            if (r0 == 0) goto L63
            com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi r1 = r0.LIZ()
            if (r1 == 0) goto L63
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            java.lang.String r0 = r1.LJIILJJIL(r0)
            if (r0 != 0) goto L65
        L63:
            java.lang.String r0 = ""
        L65:
            X.11Kz r1 = r4.LIZ(r3, r2, r0)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Ks r1 = r1.LJJIJIIJI(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11HU r3 = r1.LJJ(r0)
            Y.AfS200S0100000_31 r2 = new Y.AfS200S0100000_31
            r0 = 41
            r2.<init>(r11, r0)
            Y.AfS200S0100000_31 r1 = new Y.AfS200S0100000_31
            r0 = 42
            r1.<init>(r11, r0)
            r3.LJJIIZ(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.badge.EditProfileBadgeViewModel.hR2():void");
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new EditProfileBadgeState(null);
    }
}
