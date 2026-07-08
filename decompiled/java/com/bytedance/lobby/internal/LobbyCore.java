package com.bytedance.lobby.internal;

import X.C1ATR;
import X.C1AWO;
import X.C1AWQ;
import X.C1AWR;
import X.C1AWT;
import X.C1AWU;
import X.C1AWV;
import X.C2188811AlT;
import X.C2277811EDr;
import X.C833690Wn9;
import android.app.Application;
import com.bytedance.lobby.facebook.FacebookAuth;
import com.bytedance.lobby.facebook.FacebookShare;
import com.bytedance.lobby.google.GoogleAuth;
import com.bytedance.lobby.google.GoogleShare;
import com.bytedance.lobby.google.GoogleWebAuth;
import com.bytedance.lobby.kakao.KakaoAuth;
import com.bytedance.lobby.line.LineAuth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public final class LobbyCore {
    public static final boolean DEBUG = C833690Wn9.LIZ;
    public static volatile boolean isInit;
    public static Application sApplication;
    public static C1AWV sPluginService;
    public static C1AWT sProviderConfig;

    public static void tryInitProviderConfig() {
        if (isInit) {
            return;
        }
        synchronized (LobbyCore.class) {
            try {
                if (!isInit) {
                    if (sProviderConfig.LIZ() != null) {
                        for (C2277811EDr c2277811EDr : sProviderConfig.LIZ()) {
                            int i = c2277811EDr.LIZ;
                            if (i == 2) {
                                registerAuth(c2277811EDr);
                            } else if (i == 3) {
                                registerShare(c2277811EDr);
                            } else {
                                registerAuth(c2277811EDr);
                                registerShare(c2277811EDr);
                            }
                        }
                    }
                    isInit = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static Application getApplication() {
        return sApplication;
    }

    public static C1AWV getPluginService() {
        return sPluginService;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C1AWO createAuth(C2277811EDr c2277811EDr) {
        String str = c2277811EDr.LIZIZ;
        str.getClass();
        switch (str.hashCode()) {
            case -1534815154:
                if (!str.equals("google_web")) {
                    return null;
                }
                return new GoogleWebAuth(c2277811EDr);
            case -1240244679:
                if (!str.equals("google")) {
                    return null;
                }
                return new GoogleAuth(c2277811EDr);
            case 3321844:
                if (!str.equals("line")) {
                    return null;
                }
                return new LineAuth(c2277811EDr);
            case 486515695:
                if (!str.equals("kakaotalk")) {
                    return null;
                }
                return new KakaoAuth(c2277811EDr);
            case 497130182:
                if (!str.equals("facebook")) {
                    return null;
                }
                return new FacebookAuth(c2277811EDr);
            default:
                return null;
        }
    }

    public static C1AWU createShare(C2277811EDr c2277811EDr) {
        String str = c2277811EDr.LIZIZ;
        str.getClass();
        if (!str.equals("google")) {
            if (!str.equals("facebook")) {
                return null;
            }
            return new FacebookShare(c2277811EDr);
        }
        return new GoogleShare(c2277811EDr);
    }

    public static void initialize(C1AWR c1awr) {
        C1AWT c1awt = c1awr.LIZIZ;
        if (c1awt == null) {
            return;
        }
        sApplication = (Application) c1awr.LIZ;
        sProviderConfig = c1awt;
        sPluginService = c1awr.LIZJ;
        C833690Wn9.LIZ = c1awr.LIZLLL;
        if (c1awt.LIZIZ()) {
            tryInitProviderConfig();
        }
    }

    public static void registerAuth(C2277811EDr c2277811EDr) {
        C1AWO c1awoCreateAuth = createAuth(c2277811EDr);
        if (c1awoCreateAuth == null) {
            if (!C833690Wn9.LIZ) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot find Provider with id ");
            sbLIZ.append(c2277811EDr.LIZIZ);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
        }
        c1awoCreateAuth.nB1();
        C1ATR c1atrLIZIZ = C1ATR.LIZIZ();
        synchronized (c1atrLIZIZ) {
            c1atrLIZIZ.LIZ.put(c1awoCreateAuth.getConfig().LIZIZ, c1awoCreateAuth);
        }
    }

    public static void registerShare(C2277811EDr c2277811EDr) {
        C1AWU c1awuCreateShare = createShare(c2277811EDr);
        if (c1awuCreateShare == null) {
            if (!C833690Wn9.LIZ) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot find Provider with id ");
            sbLIZ.append(c2277811EDr.LIZIZ);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C1AWQ.LIZIZ == null) {
            synchronized (C1AWQ.class) {
                try {
                    if (C1AWQ.LIZIZ == null) {
                        C1AWQ.LIZIZ = new C1AWQ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1AWQ.LIZIZ.LIZ(c1awuCreateShare);
    }
}
