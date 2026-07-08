package com.ss.android.ugc.aweme.i18n.language.i18n;

import X.C0CCZ;
import X.C0VZ0;
import X.C202068144s;
import X.C2273351DyX;
import X.C844020X9c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC842850X4p;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class TTI18nManagerLanguageDownloadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TTI18nManagerLanguageDownloadTask";
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
        final Locale localeLIZLLL = null;
        String string = C2273351DyX.LJ.getString("download_locale", null);
        if (string != null) {
            IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
            if (iUnKnownOwnershipBusinessOuterService != null) {
                localeLIZLLL = iUnKnownOwnershipBusinessOuterService.LIZLLL(string);
            }
            if (iPluginService != null) {
                C844020X9c c844020X9c = new C844020X9c();
                c844020X9c.LJFF = localeLIZLLL;
                c844020X9c.LIZIZ = true;
                c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.145O
                    @Override // X.InterfaceC842850X4p
                    public final void LIZJ(String str, boolean z) {
                        C2273351DyX.LJ.storeString("download_locale", null);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("locale", localeLIZLLL);
                            jSONObject.put("success", true);
                            C20684815ws.LJIJ("i18nDownloadLanguage", jSONObject);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }

                    @Override // X.InterfaceC842850X4p
                    public final void LIZ(int i, String str, boolean z) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("locale", localeLIZLLL);
                            jSONObject.put("success", false);
                            C20684815ws.LJIJ("i18nDownloadLanguage", jSONObject);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                };
                iPluginService.LJJI(new C202068144s(c844020X9c));
            }
        }
    }
}
