package com.ss.android.ugc.aweme.hybridkit.task;

import X.C04TD;
import X.C08N7;
import X.C0CCZ;
import X.C0VZ0;
import X.C1529130ptX;
import X.C2188811AlT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1529220ptg;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.info.model.GlobalConfig;
import com.ss.android.ugc.aweme.hybridkit.ssc.utils.HybridOidUtilsImpl;
import com.ss.android.ugc.aweme.hybridkit.task.HybridInfoInitTask;
import com.tiktok.ssc.oid.IHybridOidUtils;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class HybridInfoInitTask implements C0CCZ {
    public static final HybridInfoInitTask LL = new HybridInfoInitTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "HybridInfoInitTask";
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
        return EnumC799870VZh.MAIN;
    }

    public static String LIZ(String str) {
        IHybridOidUtils iHybridOidUtils;
        String strLIZ;
        String str2;
        C08N7 c08n7LIZ;
        boolean z = false;
        boolean zLJJIIZI = a0.LJJIIZI(str, "lynxview", false);
        Object objLIZ = C04TD.LIZ(IHybridOidUtils.class, false);
        if (objLIZ != null) {
            iHybridOidUtils = (IHybridOidUtils) objLIZ;
        } else {
            if (C04TD.L0 == null) {
                synchronized (IHybridOidUtils.class) {
                    if (C04TD.L0 == null) {
                        C04TD.L0 = new HybridOidUtilsImpl();
                    }
                }
            }
            iHybridOidUtils = C04TD.L0;
        }
        if (iHybridOidUtils == null || (c08n7LIZ = iHybridOidUtils.LIZ(str)) == null || (strLIZ = c08n7LIZ.LIZ()) == null) {
            strLIZ = "";
        }
        if (strLIZ.length() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page_");
        if (zLJJIIZI) {
            str2 = "lynx";
        } else {
            str2 = "h5";
        }
        sbLIZ.append(str2);
        sbLIZ.append("_auto_");
        sbLIZ.append(strLIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        InterfaceC1529220ptg interfaceC1529220ptg = new InterfaceC1529220ptg() { // from class: X.0pth
            /* JADX WARN: Type inference failed for: r0v0, types: [X.0ptl] */
            @Override // X.InterfaceC1529220ptg
            public final C1529270ptl LIZ() {
                return new InterfaceC1529060ptQ() { // from class: X.0ptl
                    @Override // X.InterfaceC1529060ptQ
                    public final Object LIZ(Class cls, String str) {
                        return C09S2.LIZJ(cls, str);
                    }
                };
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0ptj] */
            @Override // X.InterfaceC1529220ptg
            public final C1529250ptj LIZIZ() {
                return new InterfaceC1529290ptn() { // from class: X.0ptj
                    @Override // X.InterfaceC1529290ptn
                    public final String LIZ(String str) {
                        HybridInfoInitTask.LL.getClass();
                        return HybridInfoInitTask.LIZ(str);
                    }
                };
            }

            @Override // X.InterfaceC1529220ptg
            public final GlobalConfig LIZJ() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                GlobalConfig globalConfig = C1529260ptk.LIZ;
                GlobalConfig globalConfig2 = (GlobalConfig) settingsManagerLIZLLL.LJIIIIZZ("hybrid_info_global_config", GlobalConfig.class, globalConfig);
                return globalConfig2 != null ? globalConfig2 : globalConfig;
            }

            @Override // X.InterfaceC1529220ptg
            public final String LIZLLL() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LJI("hybrid_info_url_config", "");
            }
        };
        if (C1529130ptX.LIZ.compareAndSet(false, true)) {
            C1529130ptX.LIZIZ = interfaceC1529220ptg;
        }
    }
}
