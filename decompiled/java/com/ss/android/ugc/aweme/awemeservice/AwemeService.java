package com.ss.android.ugc.aweme.awemeservice;

import X.C1323820kYO;
import X.C1345240l6w;
import X.C1387110mCT;
import X.C1387120mCU;
import X.C1387140mCW;
import X.C1548820qPI;
import X.C15O7;
import X.C2188811AlT;
import X.C397901gf;
import Y.ACallableS426S0100000_21;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwemeService implements IAwemeService {
    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final boolean wr(Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void Cr() {
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            Iterator<Aweme> it2 = c1387120mCULIZ.LIZ.values().iterator();
            while (it2.hasNext()) {
                AwemeBizExtKt.setFeedCount(it2.next(), 0L);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void clearCache() {
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            C15O7.LIZJ(new ACallableS426S0100000_21(c1387120mCULIZ, 8));
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme Ar(String str) {
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("type0");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("type1");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (c1387120mCULIZ.LIZ.containsKey(strLIZIZ)) {
                return c1387120mCULIZ.LIZ.get(strLIZIZ);
            }
            if (c1387120mCULIZ.LIZ.containsKey(strLIZIZ2)) {
                return c1387120mCULIZ.LIZ.get(strLIZIZ2);
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme Er(String str) {
        C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
        if (c1387110mCTLIZ != null) {
            return c1387110mCTLIZ.LIZ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme Fr(String str) {
        C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
        if (c1387110mCTLIZ != null && !TextUtils.isEmpty(str)) {
            return (Aweme) ((ConcurrentHashMap) c1387110mCTLIZ.LIZIZ).get(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme Gr(String str) {
        String packageName;
        AwemeRawAd awemeRawAd;
        C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
        if (c1387110mCTLIZ != null && !TextUtils.isEmpty(str)) {
            for (Aweme aweme : ((ConcurrentHashMap) c1387110mCTLIZ.LIZ).values()) {
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    packageName = awemeRawAd.getPackageName();
                } else {
                    packageName = null;
                }
                if (TextUtils.equals(packageName, str)) {
                    return aweme;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void Hr(String str) {
        AwemeStatistics awemeStatisticsLIZIZ;
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
            if (c1387110mCTLIZ != null && (awemeStatisticsLIZIZ = c1387110mCTLIZ.LIZIZ(str)) != null) {
                awemeStatisticsLIZIZ.setCommentCount(awemeStatisticsLIZIZ.getCommentCount() + 1);
            }
            Aweme awemeLIZIZ = c1387120mCULIZ.LIZIZ(str);
            AwemeStatistics awemeStatisticsLIZLLL = C1387120mCU.LIZLLL(awemeLIZIZ);
            if (awemeStatisticsLIZLLL != null) {
                awemeStatisticsLIZLLL.setCommentCount(awemeStatisticsLIZLLL.getCommentCount() + 1);
                c1387120mCULIZ.LIZ.LIZ(awemeLIZIZ, awemeLIZIZ.getAid());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme LLILLL(Aweme aweme) {
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            return c1387120mCULIZ.LJFF(aweme);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme LLILZ(String str) {
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            return c1387120mCULIZ.LIZ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme vr(Aweme aweme) {
        C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
        if (c1387110mCTLIZ != null) {
            return c1387110mCTLIZ.LIZLLL(aweme);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme xr(String str) {
        C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
        if (c1387110mCTLIZ != null) {
            return c1387110mCTLIZ.LIZ(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme zr(String str) {
        C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
        if (c1387110mCTLIZ != null) {
            for (Aweme aweme : ((ConcurrentHashMap) c1387110mCTLIZ.LIZ).values()) {
                if (TextUtils.equals(AwemeExtKt.getAwemeRawAdIdStr(aweme), str)) {
                    return aweme;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void Br(int i, String str) throws JSONException {
        IMainService iMainService;
        Aweme awemeLIZ;
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
            if (c1387110mCTLIZ != null && !TextUtils.isEmpty(str) && (awemeLIZ = c1387110mCTLIZ.LIZ(str)) != null) {
                awemeLIZ.setCollectStatus(i);
                AwemeStatistics statistics = awemeLIZ.getStatistics();
                if (statistics != null) {
                    if (i != 0) {
                        if (i == 1) {
                            if (statistics.getCollectCount() < 0) {
                                statistics.setCollectCount(0L);
                            }
                            statistics.setCollectCount(statistics.getCollectCount() + 1);
                        }
                    } else if (statistics.getCollectCount() > 0) {
                        statistics.setCollectCount(statistics.getCollectCount() - 1);
                    }
                    awemeLIZ.setStatistics(statistics);
                }
            }
            Aweme awemeLIZIZ = c1387120mCULIZ.LIZIZ(str);
            if (awemeLIZIZ != null) {
                awemeLIZIZ.setCollectStatus(i);
                AwemeStatistics statistics2 = awemeLIZIZ.getStatistics();
                if (statistics2 != null) {
                    if (i != 0) {
                        if (i == 1) {
                            statistics2.setCollectCount(statistics2.getCollectCount() + 1);
                        }
                    } else if (statistics2.getCollectCount() > 0) {
                        statistics2.setCollectCount(statistics2.getCollectCount() - 1);
                    }
                    awemeLIZIZ.setStatistics(statistics2);
                }
                if (awemeLIZIZ.getAid() != null) {
                    c1387120mCULIZ.LIZ.LIZ(awemeLIZIZ, awemeLIZIZ.getAid());
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            jSONObject.put("awemeId", str);
            C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "collectStatusChange"));
            if (i == 1 && (iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null)) != null) {
                iMainService.trackAppsFlyerEvent("collect_video", str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void Dr(Aweme aweme, long j) {
        AwemeStatistics awemeStatisticsLIZLLL;
        if (C1387140mCW.LIZ() != null && (awemeStatisticsLIZLLL = C1387120mCU.LIZLLL(aweme)) != null) {
            awemeStatisticsLIZLLL.setCommentCount(j);
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme Ir(int i, Aweme aweme) {
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            return c1387120mCULIZ.LJII(i, aweme);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void sr(long j, String str) {
        AwemeStatistics awemeStatisticsLIZIZ;
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
            if (c1387110mCTLIZ != null && (awemeStatisticsLIZIZ = c1387110mCTLIZ.LIZIZ(str)) != null) {
                awemeStatisticsLIZIZ.setCommentCount(j);
            }
            Aweme awemeLIZIZ = c1387120mCULIZ.LIZIZ(str);
            AwemeStatistics awemeStatisticsLIZLLL = C1387120mCU.LIZLLL(awemeLIZIZ);
            if (awemeStatisticsLIZLLL != null) {
                awemeStatisticsLIZLLL.setCommentCount(j);
                c1387120mCULIZ.LIZ.LIZ(awemeLIZIZ, awemeLIZIZ.getAid());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme tr(int i, String str) {
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            return c1387120mCULIZ.LIZJ(i, str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void ur(long j, String str) {
        AwemeStatistics awemeStatisticsLIZIZ;
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null) {
            C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
            if (c1387110mCTLIZ != null && (awemeStatisticsLIZIZ = c1387110mCTLIZ.LIZIZ(str)) != null) {
                awemeStatisticsLIZIZ.setDiggCount(j);
            }
            Aweme awemeLIZIZ = c1387120mCULIZ.LIZIZ(str);
            AwemeStatistics awemeStatisticsLIZLLL = C1387120mCU.LIZLLL(awemeLIZIZ);
            if (awemeStatisticsLIZLLL != null) {
                awemeStatisticsLIZLLL.setDiggCount(j);
                c1387120mCULIZ.LIZ.LIZ(awemeLIZIZ, awemeLIZIZ.getAid());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void yr(int i, String str) {
        Aweme awemeLIZ;
        C1387120mCU c1387120mCULIZ = C1387140mCW.LIZ();
        if (c1387120mCULIZ != null && !TextUtils.isEmpty(str)) {
            C1387110mCT c1387110mCTLIZ = C1345240l6w.LIZ();
            if (c1387110mCTLIZ != null && !TextUtils.isEmpty(str) && (awemeLIZ = c1387110mCTLIZ.LIZ(str)) != null) {
                awemeLIZ.setUserDigg(i);
                if (i == 0) {
                    AwemeStatistics awemeStatisticsLIZIZ = c1387110mCTLIZ.LIZIZ(str);
                    if (awemeStatisticsLIZIZ != null) {
                        awemeStatisticsLIZIZ.setDiggCount(awemeStatisticsLIZIZ.getDiggCount() - 1);
                    }
                } else {
                    AwemeStatistics awemeStatisticsLIZIZ2 = c1387110mCTLIZ.LIZIZ(str);
                    if (awemeStatisticsLIZIZ2 != null) {
                        awemeStatisticsLIZIZ2.setDiggCount(awemeStatisticsLIZIZ2.getDiggCount() + 1);
                    }
                }
            }
            Aweme awemeLIZIZ = c1387120mCULIZ.LIZIZ(str);
            if (awemeLIZIZ == null) {
                Aweme awemeLIZJ = c1387120mCULIZ.LIZJ(0, str);
                if (awemeLIZJ != null) {
                    c1387120mCULIZ.LJIIIIZZ(i, awemeLIZJ);
                }
                Aweme awemeLIZJ2 = c1387120mCULIZ.LIZJ(1, str);
                if (awemeLIZJ2 != null) {
                    c1387120mCULIZ.LJIIIIZZ(i, awemeLIZJ2);
                    return;
                }
                return;
            }
            c1387120mCULIZ.LJIIIIZZ(i, awemeLIZIZ);
        }
    }
}
