package com.ss.android.ugc.aweme.assem;

import X.C1150504el;
import X.C786410Ut5;
import X.C823050WQl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.aweme.translation.service.ITranslationKevaService;
import com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class CaptionMainActivityAssem extends BaseMainContainerAssem {
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"CaptionMainActivityAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0S5F
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CaptionMainActivityAssem@56c0.onCreate$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CaptionMainActivityAssem@56c0.onCreate$1");
            }

            public final void LIZ() {
                Map<String, Object> mapLJLI;
                if (ServiceManager.get() == null || ServiceManager.get().getService(ICaptionKevaService.class) == null) {
                    return;
                }
                ICaptionKevaService iCaptionKevaService = (ICaptionKevaService) ServiceManager.get().getService(ICaptionKevaService.class);
                ((ITranslationKevaService) ServiceManager.get().getService(ITranslationKevaService.class)).LIZLLL();
                ((ITranslationLangKevaService) ServiceManager.get().getService(ITranslationLangKevaService.class)).LJI();
                iCaptionKevaService.LJJJ();
                if (C295340Bhs.LIZ()) {
                    this.LL.getClass();
                    try {
                        int i = 0;
                        ITranslationService iTranslationService = (ITranslationService) PluggableExtentionKt.pluggableSpi$default(ITranslationService.class, false, false, false, 14, null);
                        if (iTranslationService == null || (mapLJLI = iTranslationService.LJLI()) == null) {
                            return;
                        }
                        StringBuilder sb = new StringBuilder("cla_diagnostic_info: {");
                        int i2 = 0;
                        for (Object obj : mapLJLI.entrySet()) {
                            i++;
                            if (i2 < 0) {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                            Map.Entry entry = (Map.Entry) obj;
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (i2 > 0) {
                                sb.append(", ");
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append('=');
                            sbLIZ.append(value);
                            sb.append(C2188811AlT.LIZIZ(sbLIZ));
                            i2 = i;
                        }
                        sb.append("}");
                        C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
                        C0SZC.LIZIZ(sb.toString());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        });
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
