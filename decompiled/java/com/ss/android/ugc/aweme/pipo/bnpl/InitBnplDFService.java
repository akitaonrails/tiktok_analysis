package com.ss.android.ugc.aweme.pipo.bnpl;

import X.C10UI;
import X.C1717770unn;
import X.C2097608Jq;
import X.EnumC743970TGh;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.tiktok.pipo.saas.core.init.IPipoBusinessInitService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS40S0000100_26;

/* JADX INFO: loaded from: classes27.dex */
public final class InitBnplDFService implements IPipoBusinessInitService {
    @Override // com.ss.android.ugc.tiktok.pipo.saas.core.init.IPipoBusinessInitService
    public final void init() {
        if (((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJFF(EnumC743970TGh.BNPL)) {
            return;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_bnpl_preload_switch", false)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1717770unn.LJIIIZ().onEventV3("rd_pipo_bnpl_df_download_start", C2097608Jq.LJIIJ(new Pair("bnpl_source_id", "init_task"), new Pair("download_scene", "initTask")));
            if (C10UI.LIZ()) {
                return;
            }
            ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LIZIZ(new AwS40S0000100_26(jCurrentTimeMillis, 1));
        }
    }
}
