package com.ss.android.ugc.aweme.ecommerce.ug.common.service;

import X.C1120604Zw;
import X.C1121904a9;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C1570870qyr;
import X.C1741890vQh;
import X.C1768000w6o;
import X.C18PZ;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C207196165y;
import X.C2188811AlT;
import X.C2371409Qy;
import X.C823050WQl;
import X.EnumC1742550vRl;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.ug.common.assem.EcUgMainAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.common.manager.EcUgNetworkRequestHandler;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.EcomCardDislikeRecord;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes32.dex */
public final class EcUgCommonService implements IEcUgCommonService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService
    public final C19719912Dl LIZJ() {
        return C13LE.LIZ(EcUgMainAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService
    public final EcUgNetworkRequestHandler LIZIZ() {
        return EcUgNetworkRequestHandler.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService
    public final void trackLogCommon(String str, Map<String, Object> map) {
        C1768000w6o.LIZ.getClass();
        C1768000w6o.LIZIZ(str, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService
    public final void LIZ(final Context context, final String str, final List list, final int i) {
        try {
            C18PZ.LIZ.getClass();
            try {
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.169t
                    public final void LIZ() {
                        List list2;
                        C21279318Pf c21279318PfLIZJ;
                        try {
                            C18PZ c18pz = C18PZ.LIZ;
                            String str2 = str;
                            c18pz.getClass();
                            if (!C18PZ.LIZJ(str2) || (list2 = list) == null || list2.isEmpty()) {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(list);
                            int i2 = i;
                            if (i2 < 0 || i2 >= arrayList.size() - 1) {
                                return;
                            }
                            int size = arrayList.size();
                            for (int i3 = i + 1; i3 < size; i3++) {
                                Aweme aweme = (Aweme) arrayList.get(i3);
                                C01GW c01gw = C21278818Pa.LIZ;
                                if (C21278818Pa.LJIIIZ(aweme, str) && (c21279318PfLIZJ = C21278818Pa.LIZJ(aweme, str)) != null) {
                                    C18PZ.LIZ.getClass();
                                    C18PZ.LJFF(c21279318PfLIZJ);
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EcUgVSAManager@aafd.preloadProductResource$$inlined$runOnWorkerThread$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EcUgVSAManager@aafd.preloadProductResource$$inlined$runOnWorkerThread$1");
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.18Pd
                    public final void LIZ() {
                        List list2;
                        try {
                            C18PZ c18pz = C18PZ.LIZ;
                            String str2 = str;
                            c18pz.getClass();
                            if (!C18PZ.LIZJ(str2) || (list2 = list) == null || list2.isEmpty()) {
                                return;
                            }
                            Aweme aweme = (Aweme) C13LP.LJJJLZIJ(i, list);
                            if (aweme == null || !aweme.isAd()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.addAll(list);
                                int i2 = 0;
                                for (Object obj : arrayList) {
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                    Aweme aweme2 = (Aweme) obj;
                                    C01GW c01gw = C21278818Pa.LIZ;
                                    if (C21278818Pa.LJIIIZ(aweme2, str) && i2 + 10 < i) {
                                        if (C21278818Pa.LJIIJ(aweme2)) {
                                            C21278918Pb c21278918Pb = C21278918Pb.LIZ;
                                            Context context2 = context;
                                            Aweme aweme3 = C21278818Pa.LIZIZ;
                                            String str3 = str;
                                            c21278918Pb.getClass();
                                            C21278918Pb.LIZJ(context2, aweme3, str3, true);
                                        }
                                        C21279318Pf c21279318PfLIZJ = C21278818Pa.LIZJ(aweme2, str);
                                        if (c21279318PfLIZJ != null) {
                                            c21279318PfLIZJ.LJIIJJI = false;
                                            c21279318PfLIZJ.LJIIL = false;
                                            c21279318PfLIZJ.LJIILIIL = false;
                                            c21279318PfLIZJ.LJIILJJIL = false;
                                            c21279318PfLIZJ.LJIILL = false;
                                            c21279318PfLIZJ.LJIILLIIL = false;
                                            c21279318PfLIZJ.LJIIIIZZ = null;
                                            C18PX c18px = c21279318PfLIZJ.LJIIIZ;
                                            if (c18px != null) {
                                                c18px.LIZ();
                                            }
                                            c21279318PfLIZJ.LJIIIZ = null;
                                            c21279318PfLIZJ.LJIIJ = null;
                                        }
                                    }
                                    i2 = i3;
                                }
                                C01GW c01gw2 = C21278818Pa.LIZ;
                                C21278818Pa.LIZ(context, str, arrayList);
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EcUgVSAManager@aafd.releaseProductResource$$inlined$runOnWorkerThread$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EcUgVSAManager@aafd.releaseProductResource$$inlined$runOnWorkerThread$1");
                    }
                });
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService
    public final void LIZLLL(int i, int i2, Long l, Integer num, Long l2, Integer num2) {
        EcomCardDislikeRecord ecomCardDislikeRecord;
        Collection linkedHashSet;
        Type type;
        Type type2;
        C207196165y c207196165y = C207196165y.LIZ;
        c207196165y.getClass();
        if (l != null) {
            C1570870qyr.LIZ().storeLong("feed_ec_card_last_show_time", System.currentTimeMillis());
            C207196165y.LJ(i, AFwS240S0000000_9.get$arr$(701));
            C207196165y.LIZLLL(c207196165y, 0, true, Integer.valueOf(i), num2, 1);
        }
        if (num != null && l2 != null && num.intValue() > 0) {
            FeedEcCardConfig feedEcCardConfig = new FeedEcCardConfig(0, null, Integer.valueOf(i), 0, Integer.valueOf(i2), 0, 0, null, null, EnumC1742550vRl.VIDEO.getValue(), 0, 0, null, 0, null, null, null, null, null, null, null, Boolean.FALSE, null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strLIZIZ = C207196165y.LIZIZ();
            Keva kevaLIZ = C1570870qyr.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((Number) C207196165y.LIZJ().getFirst()).intValue() + 1);
            sbLIZ.append('_');
            sbLIZ.append(jCurrentTimeMillis);
            kevaLIZ.storeString(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(feedEcCardConfig.cardSubtype);
            sbLIZ2.append('_');
            sbLIZ2.append(feedEcCardConfig.triggerCondition);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append('_');
            sbLIZ3.append(strLIZIZ2);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            String string = C1570870qyr.LIZ().getString(strLIZIZ3, null);
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type2 = C2371409Qy.LIZJ(C13LE.LJ(EcomCardDislikeRecord.class));
                } else {
                    type2 = new TypeToken<EcomCardDislikeRecord>() { // from class: X.1665
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type2);
                if (!(objFromJson instanceof EcomCardDislikeRecord)) {
                    objFromJson = null;
                }
                ecomCardDislikeRecord = (EcomCardDislikeRecord) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (ecomCardDislikeRecord == null) {
                Integer num3 = feedEcCardConfig.cardSubtype;
                Integer num4 = feedEcCardConfig.triggerCondition;
                Integer.valueOf(0);
                ecomCardDislikeRecord = new EcomCardDislikeRecord(num3, num4, 0, 0L);
            }
            ecomCardDislikeRecord.clickCount++;
            ecomCardDislikeRecord.lastClickTime = jCurrentTimeMillis;
            C1570870qyr.LIZ().storeString(strLIZIZ3, C1741890vQh.LJIIIIZZ(ecomCardDislikeRecord));
            String str = strLIZIZ + "_suffixes";
            String string2 = C1570870qyr.LIZ().getString(str, null);
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(String.class);
                    c13jx.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LIZJ(C13LE.LJFF(Set.class, C13JX.LIZ(c13jwLJII))));
                } else {
                    type = new TypeToken<Set<String>>() { // from class: X.04Yz
                    }.getType();
                }
                Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, string2, type);
                if (!C19719512Dh.LJIIIIZZ(objFromJson2)) {
                    objFromJson2 = null;
                }
                linkedHashSet = (Set) objFromJson2;
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
            }
            linkedHashSet.add(strLIZIZ2);
            C1570870qyr.LIZ().storeString(str, C1741890vQh.LJIIIIZZ(linkedHashSet));
        }
    }
}
