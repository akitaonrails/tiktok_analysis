package org.chromium;

import X.AbstractC1497710p4r;
import X.AbstractC1497730p4t;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class Utils {
    public static List getAllInterfaces(Class cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!arrayList.contains(interfaces[i])) {
                    arrayList.add(interfaces[i]);
                }
                for (Object obj : getAllInterfaces(interfaces[i])) {
                    if (!arrayList.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (cls != null);
        return arrayList;
    }

    public static int mapUrlRequestErrorToApiErrorCode(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case BdTuring.TYPE_ECAF /* 9 */:
                return 9;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return 10;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 11;
            default:
                if (CronetDependManager.inst().loggerDebug()) {
                    CronetDependManager cronetDependManagerInst = CronetDependManager.inst();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown error code: ");
                    sbLIZ.append(i);
                    cronetDependManagerInst.loggerD("monitor", C2188811AlT.LIZIZ(sbLIZ));
                }
                return i;
        }
    }

    public static IOException tryConvertCronetException(AbstractC1497730p4t abstractC1497730p4t) {
        if (!(abstractC1497730p4t instanceof AbstractC1497710p4r)) {
            return abstractC1497730p4t;
        }
        switch (((AbstractC1497710p4r) abstractC1497730p4t).getErrorCode()) {
            case 8:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reset by peer ");
                sbLIZ.append(abstractC1497730p4t.getMessage());
                break;
        }
        return abstractC1497730p4t;
    }

    public static AbstractC1497730p4t createCronetException(int i, int i2, String str) {
        int iMapUrlRequestErrorToApiErrorCode = mapUrlRequestErrorToApiErrorCode(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exception in CronetUrlRequest: ");
        sbLIZ.append(str);
        return new NetworkExceptionImpl(C2188811AlT.LIZIZ(sbLIZ), iMapUrlRequestErrorToApiErrorCode, i2);
    }
}
