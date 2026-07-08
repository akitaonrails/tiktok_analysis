package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0VZ0;
import X.C10UI;
import X.C844020X9c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC842850X4p;
import android.content.Context;
import android.os.Build;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.PrintStream;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class FontDfPreloadTask implements C0CCZ {
    public final String LL = "com.ss.android.ugc.aweme.df_tiktok_font";
    public final String LLILLJJLI = "com.ss.android.ugc.aweme.df_tiktok_font_fallback";

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FontDfPreloadTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IPluginService iPluginService;
        if (!C10UI.LIZ() && (iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class)) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (!iPluginService.checkPluginInstalled(this.LL)) {
                    C844020X9c c844020X9c = new C844020X9c();
                    c844020X9c.LIZ = this.LL;
                    c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.144q
                        @Override // X.InterfaceC842850X4p
                        public final void LIZJ(String str, boolean z) {
                        }

                        @Override // X.InterfaceC842850X4p
                        public final void LIZ(int i, String str, boolean z) {
                            PrintStream printStream = System.err;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("install ");
                            sbLIZ.append(str);
                            sbLIZ.append(" failed, reason: ");
                            sbLIZ.append(i);
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("install ");
                            sbLIZ2.append(str);
                            sbLIZ2.append(" failed, reason: ");
                            sbLIZ2.append(i);
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("font_df", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    };
                    c844020X9c.LIZIZ = true;
                    iPluginService.LJJI(c844020X9c.LIZ());
                    return;
                }
                return;
            }
            if (iPluginService.checkPluginInstalled(this.LLILLJJLI)) {
                return;
            }
            C844020X9c c844020X9c2 = new C844020X9c();
            c844020X9c2.LIZ = this.LLILLJJLI;
            c844020X9c2.LIZLLL = new InterfaceC842850X4p() { // from class: X.144r
                @Override // X.InterfaceC842850X4p
                public final void LIZJ(String str, boolean z) {
                }

                @Override // X.InterfaceC842850X4p
                public final void LIZ(int i, String str, boolean z) {
                    PrintStream printStream = System.err;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("install ");
                    sbLIZ.append(str);
                    sbLIZ.append(" failed, reason: ");
                    sbLIZ.append(i);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("install ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" failed, reason: ");
                    sbLIZ2.append(i);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("font_df", C2188811AlT.LIZIZ(sbLIZ2));
                }
            };
            c844020X9c2.LIZIZ = true;
            iPluginService.LJJI(c844020X9c2.LIZ());
        }
    }
}
