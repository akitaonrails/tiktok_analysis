package com.bytedance.pumbaa.piz;

import X.C04TD;
import X.C0TVN;
import X.C0WQ8;
import X.C0WRC;
import X.C0WRN;
import X.C0WRT;
import X.C2440509hL;
import X.C823280WRi;
import X.C823370WRr;
import X.EnumC823400WRu;
import com.bytedance.pumbaa.pipeline.EventPipeline;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.pumbaa.piz.api.IPizService;
import com.bytedance.pumbaa.piz.api.ITokenManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public final class PizServiceImpl implements IPizService {
    public static final ITokenManager LIZ;

    static {
        ITokenManager iTokenManager;
        Object objLIZ = C04TD.LIZ(ITokenManager.class, false);
        if (objLIZ != null) {
            iTokenManager = (ITokenManager) objLIZ;
        } else {
            if (C04TD.LJJJLZIJ == null) {
                synchronized (ITokenManager.class) {
                    if (C04TD.LJJJLZIJ == null) {
                        C04TD.LJJJLZIJ = new CryptoTokenManager();
                    }
                }
            }
            iTokenManager = C04TD.LJJJLZIJ;
        }
        LIZ = iTokenManager;
    }

    @Override // com.bytedance.pumbaa.piz.api.IPizService
    public final C2440509hL LIZ(String str) throws JSONException {
        if (!((PIZServiceConfig) C823370WRr.LIZIZ.getValue()).enable) {
            return new C2440509hL(str, C0TVN.PLAIN_TEXT);
        }
        C0WRT c0wrt = new C0WRT("PizService.storeText");
        C2440509hL c2440509hLLIZ = null;
        if (!LIZIZ(null, null, "store_plain_text")) {
            return null;
        }
        try {
            ITokenManager iTokenManager = LIZ;
            if (iTokenManager != null) {
                c2440509hLLIZ = iTokenManager.LIZ(str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C823280WRi.LIZLLL(e);
        }
        c0wrt.LIZIZ();
        return c2440509hLLIZ;
    }

    public static boolean LIZIZ(String str, String str2, String str3) {
        PrivacyEvent.Companion.getClass();
        PrivacyEvent privacyEventLIZ = C0WRC.LIZ("18000", "PIZ");
        if (str != null) {
            privacyEventLIZ.addCallSiteInfo("data_type", new C0WQ8(EnumC823400WRu.String, str));
        }
        if (str2 != null) {
            privacyEventLIZ.addCallSiteInfo("cert", new C0WQ8(EnumC823400WRu.String, str2));
        }
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
        privacyEventLIZ.addCallSiteInfo("op", new C0WQ8(enumC823400WRu, str3));
        privacyEventLIZ.addCallSiteInfo("purpose", new C0WQ8(enumC823400WRu, null));
        Iterator<C0WRN> it2 = EventPipeline.handleEvent(privacyEventLIZ, null).iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LIZ.LIZIZ, "fuse")) {
                return false;
            }
        }
        return true;
    }
}
