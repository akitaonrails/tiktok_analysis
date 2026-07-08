package com.ss.android.ugc.aweme.storage.impl;

import X.C0AUJ;
import X.C0B9U;
import X.C0CHQ;
import X.C0FI2;
import X.C0MZY;
import X.C0VSJ;
import X.C122T;
import X.C13VD;
import X.C13VF;
import X.C13VI;
import X.C13VP;
import X.C13VU;
import X.C19565911gn;
import X.C196909122h;
import X.EnumC1335420kr6;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.effect.EffectType;
import com.ss.android.ugc.aweme.services.effect.IEffectStorageCleanService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.EffectManager;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class AVFontStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIIJIL(""));
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        IEffectStorageCleanService iEffectStorageCleanService;
        if (C0B9U.LIZ() && z && (iEffectStorageCleanService = (IEffectStorageCleanService) PluggableExtentionKt.pluggableSpi$default(IEffectStorageCleanService.class, false, false, false, 14, null)) != null) {
            iEffectStorageCleanService.tryClean(EffectType.FONT, AFwS219S0000000_30.get$arr$(102));
            return 0L;
        }
        return 0L;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        CreativeToolsPluginService creativeToolsPluginService;
        EffectManager effectManagerLLJILJILJ;
        C13VP.LIZ.getClass();
        long jLongValue = 0;
        if ((C13VP.LIZ() || C0B9U.LIZ()) && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null && creativeToolsPluginService.LJI(null)) {
            if (((Boolean) C0AUJ.LIZ.getValue()).booleanValue()) {
                C19565911gn.LIZ();
                C122T.LIZ();
                if (C196909122h.LJ && (effectManagerLLJILJILJ = C196909122h.LIZ().LLJILJILJ()) != null) {
                    jLongValue = effectManagerLLJILJILJ.getEffectCacheSize().getFirst().longValue();
                }
            }
            if (C13VP.LIZ()) {
                C0MZY.LIZ.getClass();
                C13VD c13vd = new C13VD(C0MZY.LIZIZ(), null, 2);
                if (LJIIIIZZ().exists()) {
                    C13VF c13vf = new C13VF();
                    c13vf.LIZ(c13vd);
                    c13vf.LIZIZ(LJIIIIZZ());
                }
                jLongValue += c13vd.LIZJ;
            }
        }
        if (z) {
            if (((Boolean) C0AUJ.LIZ.getValue()).booleanValue()) {
                for (C0FI2 c0fi2 : ((ConcurrentHashMap) C0FI2.LJIIIZ).values()) {
                    c0fi2.LIZIZ.clear();
                    ((ConcurrentHashMap) c0fi2.LIZJ).clear();
                    c0fi2.LIZLLL.clear();
                    c0fi2.LJ.set(false);
                }
                if (C196909122h.LJ) {
                    C0FI2.LJJJI();
                    C196909122h.LIZ().LIZLLL("textfont");
                    C196909122h.LIZ().LIZLLL("language_text_font");
                    C196909122h.LIZ().LIZLLL("editor_pro_font_panel");
                    Iterator<String> it2 = C0FI2.LJIIJJI.iterator();
                    while (it2.hasNext()) {
                        C196909122h.LIZ().LIZLLL(it2.next());
                    }
                }
            }
            C13VP.LIZ.getClass();
            if ((C13VP.LIZ() || C0B9U.LIZ()) && LJIIIIZZ().exists()) {
                C0MZY.LIZ.getClass();
                C13VU c13vu = new C13VU(C0MZY.LIZIZ(), 2);
                c13vu.LIZJ = true;
                C13VF c13vf2 = new C13VF();
                c13vf2.LIZ(c13vu);
                c13vf2.LIZIZ(LJIIIIZZ());
                c13vu.LIZIZ(null);
                return jLongValue;
            }
        }
        return jLongValue;
    }

    @Override // X.C13VI
    public final long LJIIL(boolean z) {
        C13VP.LIZ.getClass();
        if (C13VP.LIZIZ()) {
            IEffectStorageCleanService.DefaultImpls.tryCleanOnForExtremeLowStorage$default((IEffectStorageCleanService) ServiceManager.get().getService(IEffectStorageCleanService.class), EffectType.FONT, null, AFwS219S0000000_30.get$arr$(103), 2, null);
            return 0L;
        }
        LJIIIZ(z);
        return 0L;
    }
}
