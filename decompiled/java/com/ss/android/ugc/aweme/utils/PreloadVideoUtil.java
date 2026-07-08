package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import X.C09GA;
import X.C1014030cUj;
import X.C1058540deW;
import X.C123100dR;
import X.C1300610jwx;
import X.C1395050mPH;
import X.C1395270mPd;
import X.C13LP;
import X.C1475600oVC;
import X.C1482570ogR;
import X.C1482580ogS;
import X.C1482860ogu;
import X.C1484680ojq;
import X.C1720306oT;
import X.C212350188e;
import X.C2188811AlT;
import X.C2215011Bmd;
import X.C582130MsN;
import X.C805420Vie;
import X.C844470XAv;
import X.InterfaceC1475290oUh;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.api.IAnchorBusinessApi;
import com.ss.android.ugc.aweme.config.CCAnchorLandingPageFourthOpt;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class PreloadVideoUtil {
    public static final PreloadVideoUtil LIZ = new PreloadVideoUtil();
    public static FeedJsonExtra LIZIZ;
    public static Pair<String, String> LIZJ;

    static {
        C582130MsN.LIZ().LJ().getClass();
        C1014030cUj.LIZ.LJJI(new InterfaceC1475290oUh() { // from class: X.0mPR
            @Override // X.InterfaceC1475290oUh
            public final void LIZLLL(List<SimVideoUrlModel> list) {
            }

            @Override // X.InterfaceC1475290oUh
            public final void LIZJ(Pair<SimVideoUrlModel, String> pair) {
                String urlKey;
                SimUrlModel simUrlModel;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preload success urlKey = ");
                String str = null;
                if (pair != null && (simUrlModel = (SimUrlModel) pair.first) != null) {
                    urlKey = simUrlModel.getUrlKey();
                } else {
                    urlKey = null;
                }
                sbLIZ.append(urlKey);
                sbLIZ.append("path = ");
                if (pair != null) {
                    str = (String) pair.second;
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                int i = C1720306oT.LIZ;
            }

            @Override // X.InterfaceC1475290oUh
            public final void LJFF(SimVideoUrlModel simVideoUrlModel) {
                String urlKey;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preload error urlKey = ");
                if (simVideoUrlModel != null) {
                    urlKey = simVideoUrlModel.getUrlKey();
                } else {
                    urlKey = null;
                }
                sbLIZ.append(urlKey);
                C2188811AlT.LIZIZ(sbLIZ);
                int i = C1720306oT.LIZ;
            }
        });
    }

    public static final class FeedJsonExtra {

        @C09CT("high_ctr")
        public Boolean highCtr;

        @C09CT("preload_info")
        public FeedJsonPreloadInfo preloadInfo;

        public FeedJsonExtra() {
            this(null, null);
        }

        public FeedJsonExtra(FeedJsonPreloadInfo feedJsonPreloadInfo, Boolean bool) {
            this.preloadInfo = feedJsonPreloadInfo;
            this.highCtr = bool;
        }
    }

    public static final class FeedJsonPreloadInfo {

        @C09CT("preload_key")
        public String preloadKey;

        @C09CT("video_url")
        public final List<Map<String, String>> videoUrls;

        public FeedJsonPreloadInfo() {
            this(null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FeedJsonPreloadInfo(String str, List<? extends Map<String, String>> list) {
            this.preloadKey = str;
            this.videoUrls = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(int i, List list) {
        String extra;
        FeedJsonPreloadInfo feedJsonPreloadInfo;
        Float f;
        Map map;
        Set<String> setKeySet;
        long jLongValue;
        Long l;
        float fFloatValue;
        Float f2;
        AnchorCommonStruct anchorCommonStruct;
        FeedJsonExtra feedJsonExtra;
        String str;
        String str2;
        String str3;
        Long l2;
        FeedJsonExtra feedJsonExtra2;
        if (i == 2 && (feedJsonExtra2 = LIZIZ) != null && Intrinsics.LJFF(feedJsonExtra2.highCtr, Boolean.TRUE)) {
            return;
        }
        long jLongValue2 = 0;
        Object obj = null;
        String str4 = null;
        obj = null;
        if (i == 2 && LIZJ != null && (feedJsonExtra = LIZIZ) != null && Intrinsics.LJFF(feedJsonExtra.highCtr, Boolean.FALSE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Avoid multiple parse json and save time ");
            Pair<String, String> pair = LIZJ;
            if (pair != null) {
                str = (String) pair.first;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append("  ");
            Pair<String, String> pair2 = LIZJ;
            if (pair2 != null) {
                str2 = (String) pair2.second;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            int i2 = C1720306oT.LIZ;
            Pair<String, String> pair3 = LIZJ;
            if (pair3 != null) {
                str3 = (String) pair3.first;
                str4 = (String) pair3.second;
            } else {
                str3 = null;
            }
            C1395050mPH.LIZ.getClass();
            CCAnchorLandingPageFourthOpt cCAnchorLandingPageFourthOptLIZ = C1395050mPH.LIZ();
            if (cCAnchorLandingPageFourthOptLIZ != null && (l2 = cCAnchorLandingPageFourthOptLIZ.videoPreloadSize) != null) {
                jLongValue2 = l2.longValue();
            }
            LIZIZ(jLongValue2, str3, str4);
            return;
        }
        LIZIZ = null;
        LIZJ = null;
        if (list != null && (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLZIJ(0, list)) != null) {
            extra = anchorCommonStruct.getExtra();
        } else {
            extra = null;
        }
        FeedJsonExtra feedJsonExtra3 = (FeedJsonExtra) GsonProtectorUtils.fromJson(new Gson(), extra, FeedJsonExtra.class);
        LIZIZ = feedJsonExtra3;
        if (feedJsonExtra3.preloadInfo == null) {
            return;
        }
        if ((!Intrinsics.LJFF(feedJsonExtra3.highCtr, Boolean.FALSE) || i != 1) && (feedJsonPreloadInfo = feedJsonExtra3.preloadInfo) != null) {
            String str5 = feedJsonPreloadInfo.preloadKey;
            List<Map<String, String>> list2 = feedJsonPreloadInfo.videoUrls;
            if (str5 != null && str5.length() != 0 && list2 != null && !list2.isEmpty()) {
                C1395050mPH.LIZ.getClass();
                try {
                    C212350188e c212350188eLIZJ = C212350188e.LIZJ();
                    C844470XAv.LIZ.getClass();
                    C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
                    C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
                    C1300610jwx[] c1300610jwxArr = {c1300610jwx};
                    Bundle bundle = new Bundle();
                    if (c09gaLIZIZ != null) {
                        c09gaLIZIZ.LJIILJJIL(c1300610jwxArr, bundle);
                    }
                    try {
                        obj = bundle.get(c1300610jwx.LIZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    Integer numValueOf = Integer.valueOf(C2215011Bmd.LIZ());
                    if (numValueOf instanceof Float) {
                        f = (Float) numValueOf;
                    }
                    map = (Map) C13LP.LJJJLZIJ(0, list2);
                }
                if (obj instanceof Float) {
                    f = (Float) obj;
                    if (f != null) {
                        float fFloatValue2 = f.floatValue();
                        C1395050mPH.LIZ.getClass();
                        CCAnchorLandingPageFourthOpt cCAnchorLandingPageFourthOptLIZ2 = C1395050mPH.LIZ();
                        if (cCAnchorLandingPageFourthOptLIZ2 != null && (f2 = cCAnchorLandingPageFourthOptLIZ2.androidScore) != null) {
                            fFloatValue = f2.floatValue();
                        } else {
                            fFloatValue = 6.6f;
                        }
                        if (fFloatValue2 < fFloatValue) {
                            map = (Map) C13LP.LJJJLZIJ(list2.size() - 1, list2);
                        }
                    }
                    if (map == null && (setKeySet = map.keySet()) != null) {
                        for (String str6 : setKeySet) {
                            if (C123100dR.LIZ(str6) && C123100dR.LIZ((String) map.get(str6))) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(str5);
                                sbLIZ2.append('_');
                                sbLIZ2.append(str6);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                LIZJ = new Pair<>(str6, map.get(str6));
                                PreloadVideoUtil preloadVideoUtil = LIZ;
                                String str7 = (String) map.get(str6);
                                C1395050mPH.LIZ.getClass();
                                CCAnchorLandingPageFourthOpt cCAnchorLandingPageFourthOptLIZ3 = C1395050mPH.LIZ();
                                if (cCAnchorLandingPageFourthOptLIZ3 != null && (l = cCAnchorLandingPageFourthOptLIZ3.videoPreloadSize) != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                preloadVideoUtil.getClass();
                                LIZIZ(jLongValue, strLIZIZ, str7);
                            }
                        }
                        return;
                    }
                }
                map = (Map) C13LP.LJJJLZIJ(0, list2);
                if (map == null) {
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZIZ(long j, String str, String str2) {
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            if (!((IAnchorBusinessApi) ServiceManager.get().getService(IAnchorBusinessApi.class)).LJIIZILJ()) {
                C1475600oVC c1475600oVC = new C1475600oVC(j, str, null, new String[]{str2});
                c1475600oVC.LJIIJ = new C1395270mPd(str);
                C805420Vie.LIZ.LJIIZILJ(c1475600oVC);
                return;
            }
            int i = (int) (j / ((long) 1024));
            C582130MsN.LIZ().LJ().getClass();
            C1482860ogu c1482860ogu = C1014030cUj.LIZ;
            if (C1482860ogu.LJL(str) > 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            C1482580ogS c1482580ogS = new C1482580ogS();
            c1482580ogS.LIZ = String.valueOf(System.currentTimeMillis());
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            c1058540deW.LIZIZ(str2);
            c1058540deW.LIZIZ = str;
            C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
            C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
            c1482580ogS2.LJ = c1482570ogRLIZ;
            arrayList.add(new C1484680ojq(c1482580ogS2).LIZ());
            C582130MsN.LIZ().LJ().getClass();
            c1482860ogu.LJIILLIIL(i, arrayList);
        }
    }
}
