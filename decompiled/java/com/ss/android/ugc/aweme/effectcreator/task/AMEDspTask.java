package com.ss.android.ugc.aweme.effectcreator.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1656530tD1;
import X.C1BLW;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2203391BLl;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.agilelogger.ALog;
import java.util.List;
import jv6.a;

/* JADX INFO: loaded from: classes31.dex */
public final class AMEDspTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AMEDspTask";
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
    public final int targetProcess() {
        return 1;
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
        C1656530tD1.LIZ.getClass();
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectCreatorAABUtil", "EffectCreatorAABUtil prepare");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectCreatorAABUtil", "prepare AAB split apk install state callback");
        IPluginService iPluginService = (IPluginService) C1656530tD1.LIZLLL.getValue();
        if (iPluginService != null && iPluginService.LIZLLL() != null) {
            C1BLW.LIZJ("com.bytedance.tiktok.ship", new InterfaceC2203391BLl() { // from class: X.145F
                @Override // X.InterfaceC2203391BLl
                public final void LIZIZ() {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectCreatorAABUtil", "splitInstallListener onInstallPrepared");
                }

                @Override // X.InterfaceC2425409eu
                public final void LIZ(AbstractC2457909k9 abstractC2457909k9) {
                    Boolean boolValueOf;
                    AbstractC2457909k9 abstractC2457909k92 = abstractC2457909k9;
                    int iLJII = abstractC2457909k92.LJII();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("splitInstallListener onStateUpdate curStatus:");
                    sbLIZ.append(iLJII);
                    sbLIZ.append(" errorCode:");
                    sbLIZ.append(abstractC2457909k92.LIZJ());
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectCreatorAABUtil", C2188811AlT.LIZIZ(sbLIZ));
                    if (iLJII == 5) {
                        C1656530tD1.LIZ.getClass();
                        IPluginService iPluginService2 = (IPluginService) C1656530tD1.LIZLLL.getValue();
                        if (iPluginService2 != null && iPluginService2.LIZLLL() != null) {
                            C844470XAv.LIZ.getClass();
                            boolValueOf = Boolean.valueOf(a.install(C844470XAv.LIZ()));
                        } else {
                            boolValueOf = null;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("splitInstallListener onStateUpdate INSTALLED splitCompatInstall splitInstallRet:");
                        sbLIZ2.append(boolValueOf);
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectCreatorAABUtil", C2188811AlT.LIZIZ(sbLIZ2));
                        C1656530tD1.LIZIZ.set(true);
                    }
                }
            });
        }
    }
}
