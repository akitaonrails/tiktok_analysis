package com.ss.android.ugc.aweme.external;

import X.C0C64;
import X.C0CCZ;
import X.C0CHQ;
import X.C0VZ0;
import X.C123100dR;
import X.C13LQ;
import X.C13Q5;
import X.C1BCF;
import X.C201955140j;
import X.C2188811AlT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@C1BCF(distinctId = 112, taskType = "preload")
public final class PreDownloadEffectModel implements C0CCZ {
    public final String[] LL = {"tt_face_extra"};
    public final String[] LLILLJJLI = {"asset://md5_error", "asset://not_found"};

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreDownloadEffectModel";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        CreativeToolsPluginService creativeToolsPluginService;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pre download effect model start ");
        sbLIZ.append(C0C64.LJIILLIIL().LJIIIZ(31744, "tools_enable_pre_download_face_model", true, false));
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tools_enable_pre_download_face_model", true, false) && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null && creativeToolsPluginService.LJI(context)) {
            C0CHQ.LIZ().initDownloadableModel();
            String strFindResourceUri = C13Q5.LIZ().LIZLLL().findResourceUri(this.LL[0]);
            if (strFindResourceUri == null) {
                strFindResourceUri = "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pre download effect model path: ");
            sbLIZ2.append(strFindResourceUri);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
            if (C123100dR.LIZ(strFindResourceUri) && (Intrinsics.LJFF(strFindResourceUri, "asset://not_initialized") || !C13LQ.LJIILLIIL(strFindResourceUri, this.LLILLJJLI))) {
                return;
            }
            DownloadableModelSupport.getInstance().fetchResourcesWithModelNames(0, this.LL, new FetchResourcesListener() { // from class: X.13UX
                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onSuccess() {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("pre download effect model success ");
                    sbLIZ3.append(this.LIZ.LL);
                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ3));
                }

                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onFailed(Exception exc) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("pre download effect model fail ");
                    sbLIZ3.append(exc);
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                }
            });
        }
    }
}
