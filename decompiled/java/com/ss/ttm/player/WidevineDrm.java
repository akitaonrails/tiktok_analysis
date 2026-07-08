package com.ss.ttm.player;

import X.C1285300jYG;
import X.C1285320jYI;
import X.C2188811AlT;
import X.C2280261ENc;
import X.C2280281ENe;
import X.C2280291ENf;
import android.text.TextUtils;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.bytedance.vcloud.strategy.drm.SessionEntry;

/* JADX INFO: loaded from: classes36.dex */
public class WidevineDrm extends NativeObject {
    public C1285300jYG LIZIZ;

    public void closeDrm() {
        C1285300jYG c1285300jYG = this.LIZIZ;
        if (c1285300jYG != null) {
            C2280281ENe.LIZJ.LIZ(c1285300jYG);
            this.LIZIZ = null;
        }
    }

    public int installLicense(String str) {
        if (this.LIZIZ == null) {
            C1285320jYI.LIZ(this, "WidevineDrm", "drm installLicense failed: AJMediaDrm is null");
            return -1;
        }
        C2280281ENe c2280281ENe = C2280281ENe.LIZJ;
        if (TextUtils.isEmpty(str)) {
            C1285320jYI.LIZ(null, "AJMediaDrmManager", "drm installLicense failed: pssh is empty");
        } else {
            if (c2280281ENe.LIZIZ == null) {
                C1285320jYI.LIZ(null, "AJMediaDrmManager", "drm installLicense failed: LiveWidevineServiceProvider is null");
                return -1;
            }
            if (!TextUtils.isEmpty(str)) {
                return StrategyCenter.getInstance().installLicenseForLiveWidevineSessionEntry(str);
            }
        }
        return -1;
    }

    public boolean tryAcquirePreloaded(String str) {
        SessionEntry sessionEntryAcquireLiveWidevineSessionEntry;
        byte[] bArr;
        C2280281ENe c2280281ENe = C2280281ENe.LIZJ;
        C1285300jYG c1285300jYG = null;
        if (c2280281ENe.LIZIZ == null) {
            C1285320jYI.LIZ(null, "AJMediaDrmManager", "drm tryAcquirePreloaded failed: LiveWidevineServiceProvider is null");
        } else if (TextUtils.isEmpty(str)) {
            C1285320jYI.LIZ(null, "AJMediaDrmManager", "drm tryAcquirePreloaded failed: pssh is empty");
        } else if (!TextUtils.isEmpty(str) && (sessionEntryAcquireLiveWidevineSessionEntry = StrategyCenter.getInstance().acquireLiveWidevineSessionEntry(str)) != null && sessionEntryAcquireLiveWidevineSessionEntry.isValid()) {
            C2280291ENf c2280291ENf = new C2280291ENf(sessionEntryAcquireLiveWidevineSessionEntry.mediaDrm, sessionEntryAcquireLiveWidevineSessionEntry.sessionId, sessionEntryAcquireLiveWidevineSessionEntry.mediaCrypto, sessionEntryAcquireLiveWidevineSessionEntry.securityLevel, sessionEntryAcquireLiveWidevineSessionEntry);
            if (c2280291ENf.LIZ != null && (bArr = c2280291ENf.LIZIZ) != null && bArr.length > 0 && c2280291ENf.LIZJ != null && c2280291ENf.LJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("drm tryAcquirePreloaded hit, pssh=");
                sbLIZ.append(str);
                C1285320jYI.LIZIZ(null, "AJMediaDrmManager", C2188811AlT.LIZIZ(sbLIZ));
                c1285300jYG = new C1285300jYG(c2280291ENf.LIZ);
                c1285300jYG.LIZIZ = c2280291ENf.LIZJ;
                c1285300jYG.LIZJ = str;
                c1285300jYG.LIZLLL = c2280291ENf.LIZLLL;
                c2280281ENe.LIZ = c1285300jYG;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("drm tryAcquirePreloaded invalid session, pssh=");
                sbLIZ2.append(str);
                sbLIZ2.append(", widevineCode=");
                sbLIZ2.append(0);
                C1285320jYI.LIZ(null, "AJMediaDrmManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (!TextUtils.isEmpty(str)) {
                    StrategyCenter.getInstance().releaseLiveWidevineSessionEntry(str);
                }
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("drm tryAcquirePreloaded returned null, pssh=");
            sbLIZ3.append(str);
            C1285320jYI.LIZIZ(null, "AJMediaDrmManager", C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (c1285300jYG == null) {
            C1285320jYI.LIZIZ(this, "WidevineDrm", "drm tryAcquirePreloaded return null");
            return false;
        }
        this.LIZIZ = c1285300jYG;
        C1285320jYI.LIZIZ(this, "WidevineDrm", "drm tryAcquirePreloaded hit");
        return true;
    }

    public int openDrm(String str, String str2, String str3, String str4) {
        C1285300jYG c1285300jYGLIZIZ = C2280281ENe.LIZJ.LIZIZ(new C2280261ENc(str, str2, str3, str4));
        this.LIZIZ = c1285300jYGLIZIZ;
        if (c1285300jYGLIZIZ == null) {
            C1285320jYI.LIZ(this, "WidevineDrm", "drm openDrm failed: AJMediaDrm is null");
            return -1;
        }
        return 0;
    }
}
