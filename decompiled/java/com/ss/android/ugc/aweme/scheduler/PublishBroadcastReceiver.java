package com.ss.android.ugc.aweme.scheduler;

import X.C0CHQ;
import X.C1433730nPf;
import X.C1439030nYD;
import X.C1444780nhU;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.C815520Vyw;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishBroadcastReceiver extends BroadcastReceiver {
    public static void LIZ(final Context context, Intent intent) {
        String stringExtra;
        final String stringExtra2;
        try {
            stringExtra = intent.getStringExtra("DEBUG_MSG");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (Intrinsics.LJFF(stringExtra, "MSG_SUCCESS")) {
            C1433730nPf.LIZ.getClass();
            C1433730nPf.LJIJJLI("PublishBroadcastReceiver onReceive success");
            return;
        }
        try {
            stringExtra2 = intent.getStringExtra("creation_id");
            if (stringExtra2 != null) {
                C1444780nhU.LIZLLL("clear");
                Application application = C0CHQ.LIZ;
                C1444780nhU.LIZJ(application);
                new C815520Vyw(application).LIZIZ(stringExtra2.hashCode(), null);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        C1433730nPf c1433730nPf = C1433730nPf.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishBroadcastReceiver onReceive intentCreationId:");
        sbLIZ.append(stringExtra2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1433730nPf.getClass();
        C1433730nPf.LJIJJLI(strLIZIZ);
        C1439030nYD.LIZ.LJ(false, new IGetPublishDraftCallback() { // from class: X.0nZG
            @Override // com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback
            public final void onFail() {
                C1433730nPf.LJJIFFI("PublishBroadcastReceiver retry onFail");
            }

            @Override // com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback
            public final void onSuccess(AwemeDraft awemeDraft) {
                CreativeToolsPluginService creativeToolsPluginService;
                String strLIZ = awemeDraft.LIZ();
                C1433730nPf c1433730nPf2 = C1433730nPf.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PublishBroadcastReceiver retry onSuccess draftCreationId:");
                sbLIZ2.append(strLIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c1433730nPf2.getClass();
                C1433730nPf.LJIJJLI(strLIZIZ2);
                if (!Intrinsics.LJFF(stringExtra2, strLIZ)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("PublishBroadcastReceiver retry CreationIdNotEqual intent:");
                    sbLIZ3.append(stringExtra2);
                    sbLIZ3.append(" draft:");
                    sbLIZ3.append(strLIZ);
                    C1433730nPf.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ3));
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("action_type", "publish");
                c0lab.LJ("creation_id", strLIZ);
                C559510Lwz.LIZ(c0lab, awemeDraft, "broadcast");
                c0lab.LJ("enter_from", "notification");
                c0lab.LJ("enter_method", "click_retry");
                C20684815ws.LJIILLIIL("publish_retry", c0lab.LIZ);
                if (!((Boolean) C283410B8x.LIZ.getValue()).booleanValue() || !C299090Bnv.LIZ() || ((creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null && creativeToolsPluginService.LJI(context))) {
                    o.LJIILJJIL.LJIIIIZZ(true, true);
                    C1439030nYD.LIZ.getClass();
                    String strLIZJ = C1433730nPf.LIZJ(C1439030nYD.LIZIZ(awemeDraft, null, true));
                    C1433730nPf.LJJII();
                    if (strLIZJ == null) {
                        C201955140j.LJII(C830690WiJ.LIZIZ, "PublishFromDraft Already In publish, can not start new");
                    }
                    AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("PublishBroadcastReceiver bind publishId:");
                    sbLIZ4.append(strLIZJ);
                    sbLIZ4.append(" topPage:");
                    sbLIZ4.append(abstractC1387200mCcLJ);
                    C1433730nPf.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ4));
                    if (strLIZJ != null) {
                        C1403010mc7.LIZ.getPublishService().LJ(abstractC1387200mCcLJ, strLIZJ);
                        return;
                    }
                    return;
                }
                C1433730nPf.LJIJJLI("PublishBroadcastReceiver retry skipped: VE plugin not ready");
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }
}
