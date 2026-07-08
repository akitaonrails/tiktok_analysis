package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C01GW;
import X.C04TD;
import X.C123100dR;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C15442062u;
import X.C1576640r8A;
import X.C1617170sBX;
import X.C1617190sBZ;
import X.C1617200sBa;
import X.C1617230sBd;
import X.C2188811AlT;
import X.C2540209xQ;
import X.C452501pT;
import X.InterfaceC1791670wiz;
import X.InterfaceC1791930wjP;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.experiment.PaidContentAnchorInAppSetting;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaPricingServiceImpl;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaPricingServiceImpl implements ISeriesPricingService {
    public final String LIZIZ = C2540209xQ.LIZ();
    public final Map<String, IapProductDetail> LIZJ = new LinkedHashMap();
    public final Set<String> LIZLLL = C13LP.LLIIJI(PaidContentAnchorInAppSetting.LIZ().iAPIDs);
    public final C01GW LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(260));

    public static ISeriesPricingService LJI() {
        Object objLIZ = C04TD.LIZ(ISeriesPricingService.class, false);
        if (objLIZ != null) {
            return (ISeriesPricingService) objLIZ;
        }
        if (C04TD.Q3 == null) {
            synchronized (ISeriesPricingService.class) {
                if (C04TD.Q3 == null) {
                    C04TD.Q3 = new MiniDramaPricingServiceImpl();
                }
            }
        }
        return C04TD.Q3;
    }

    public static String LJ(List list) {
        List<String> listLIZ;
        String str;
        Float fValueOf;
        Regex regex = new Regex("(\\d*.?\\d*)");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MatchResult matchResultFind$default = Regex.find$default(regex, ((PriceInfo) it2.next()).priceInUsd, 0, 2, null);
            if (matchResultFind$default != null && (listLIZ = matchResultFind$default.LIZ()) != null && (str = (String) C13LP.LJJJLZIJ(0, listLIZ)) != null && (fValueOf = Float.valueOf(CastFloatProtector.parseFloat(str))) != null) {
                arrayList.add(fValueOf);
            }
        }
        if (arrayList.size() == list.size()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('$');
            sbLIZ.append(C13LP.LJZ(arrayList));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesPricingService
    public final MutableLiveData LIZIZ(final List list) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!this.LIZJ.containsKey(((PriceInfo) obj).iapId)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            mutableLiveData.postValue(LJFF(list));
        } else {
            C1617170sBX c1617170sBX = new C1617170sBX(this.LIZIZ, (String) null, 6);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PriceInfo) it2.next()).iapId);
            }
            c1617170sBX.LIZIZ = arrayList2;
            InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) this.LJ.getValue();
            if (interfaceC1791930wjP != null) {
                interfaceC1791930wjP.LJIIIZ(new InterfaceC1791670wiz() { // from class: X.0sBW
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
                    @Override // X.InterfaceC1791670wiz
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZLLL(X.C518160KTu r5) {
                        /*
                            r4 = this;
                            java.util.Map<java.lang.String, com.bytedance.android.livesdk.iap.IapProductDetail> r3 = r5.LJIIJ
                            if (r3 == 0) goto L13
                            com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaPricingServiceImpl r2 = r2
                            java.util.List<com.ss.android.ugc.aweme.model.PriceInfo> r1 = r3
                            java.util.Map<java.lang.String, com.bytedance.android.livesdk.iap.IapProductDetail> r0 = r2.LIZJ
                            r0.putAll(r3)
                            java.lang.String r1 = r2.LJFF(r1)
                            if (r1 != 0) goto L1e
                        L13:
                            com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaPricingServiceImpl r1 = r2
                            java.util.List<com.ss.android.ugc.aweme.model.PriceInfo> r0 = r3
                            r1.getClass()
                            java.lang.String r1 = com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaPricingServiceImpl.LJ(r0)
                        L1e:
                            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r1
                            r0.postValue(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1617160sBW.LIZLLL(X.0KTu):void");
                    }

                    @Override // X.InterfaceC1791670wiz
                    public final void LJ(C518080KTm c518080KTm) {
                        MiniDramaPricingServiceImpl miniDramaPricingServiceImpl = this;
                        List<PriceInfo> list2 = list;
                        miniDramaPricingServiceImpl.getClass();
                        mutableLiveData.postValue(MiniDramaPricingServiceImpl.LJ(list2));
                    }
                }, c1617170sBX);
                return mutableLiveData;
            }
        }
        return mutableLiveData;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesPricingService
    public final Map<String, String> LIZLLL(List<PriceInfo> list) {
        C1617230sBd c1617230sBd;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (PriceInfo priceInfo : list) {
                IapProductDetail iapProductDetail = (IapProductDetail) ((LinkedHashMap) this.LIZJ).get(priceInfo.iapId);
                if (iapProductDetail != null && (c1617230sBd = iapProductDetail.oneTimePurchaseProduct) != null && (str = c1617230sBd.price) != null) {
                    linkedHashMap.put(priceInfo.iapId, str);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJFF(java.util.List<com.ss.android.ugc.aweme.model.PriceInfo> r7) {
        /*
            r6 = this;
            java.lang.Object r0 = X.C13LP.LJJJLL(r7)
            com.ss.android.ugc.aweme.model.PriceInfo r0 = (com.ss.android.ugc.aweme.model.PriceInfo) r0
            r5 = 0
            if (r0 == 0) goto L52
            java.util.Map<java.lang.String, com.bytedance.android.livesdk.iap.IapProductDetail> r1 = r6.LIZJ
            java.lang.String r0 = r0.iapId
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            com.bytedance.android.livesdk.iap.IapProductDetail r0 = (com.bytedance.android.livesdk.iap.IapProductDetail) r0
            if (r0 == 0) goto L52
            X.0sBd r0 = r0.oneTimePurchaseProduct
            if (r0 == 0) goto L52
            java.lang.String r3 = r0.priceCurrencyCode
        L1d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r7.iterator()
        L26:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.model.PriceInfo r0 = (com.ss.android.ugc.aweme.model.PriceInfo) r0
            java.util.Map<java.lang.String, com.bytedance.android.livesdk.iap.IapProductDetail> r1 = r6.LIZJ
            java.lang.String r0 = r0.iapId
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            com.bytedance.android.livesdk.iap.IapProductDetail r0 = (com.bytedance.android.livesdk.iap.IapProductDetail) r0
            if (r0 == 0) goto L50
            X.0sBd r0 = r0.oneTimePurchaseProduct
            if (r0 == 0) goto L50
            long r0 = r0.priceAmountMicros
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L4a:
            if (r0 == 0) goto L26
            r2.add(r0)
            goto L26
        L50:
            r0 = r5
            goto L4a
        L52:
            r3 = r5
            goto L1d
        L54:
            int r1 = r2.size()
            int r0 = r7.size()
            if (r1 != r0) goto L8a
            if (r3 == 0) goto L8a
            java.text.NumberFormat r4 = java.text.NumberFormat.getCurrencyInstance()     // Catch: java.lang.Exception -> L81
            r0 = 2
            r4.setMaximumFractionDigits(r0)     // Catch: java.lang.Exception -> L81
            java.util.Currency r0 = java.util.Currency.getInstance(r3)     // Catch: java.lang.Exception -> L81
            r4.setCurrency(r0)     // Catch: java.lang.Exception -> L81
            long r2 = X.C13LP.LJZL(r2)     // Catch: java.lang.Exception -> L81
            float r1 = (float) r2     // Catch: java.lang.Exception -> L81
            r0 = 1232348160(0x49742400, float:1000000.0)
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Exception -> L81
            java.lang.String r0 = r4.format(r0)     // Catch: java.lang.Exception -> L81
            return r0
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = LJ(r7)
            return r0
        L8a:
            java.lang.String r0 = LJ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaPricingServiceImpl.LJFF(java.util.List):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesPricingService
    public final MutableLiveData LIZ(Context context, List list) {
        C1617230sBd c1617230sBd;
        String str;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final MutableLiveData mutableLiveData = new MutableLiveData();
        ArrayList<PriceInfo> arrayList = (ArrayList) list;
        for (PriceInfo priceInfo : arrayList) {
            IapProductDetail iapProductDetail = (IapProductDetail) ((LinkedHashMap) this.LIZJ).get(priceInfo.iapId);
            if (iapProductDetail != null && (c1617230sBd = iapProductDetail.oneTimePurchaseProduct) != null && (str = c1617230sBd.price) != null) {
                linkedHashMap.put(priceInfo.iapId, str);
            }
        }
        final ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!this.LIZJ.containsKey(((PriceInfo) obj).iapId)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            mutableLiveData.postValue(linkedHashMap);
        } else {
            String string = context.getString(2131829862);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(((PriceInfo) it2.next()).iapId, string);
            }
            mutableLiveData.postValue(linkedHashMap);
            C1617170sBX c1617170sBX = new C1617170sBX(this.LIZIZ, (String) null, 6);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((PriceInfo) it3.next()).iapId);
            }
            c1617170sBX.LIZIZ = arrayList3;
            InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) this.LJ.getValue();
            if (interfaceC1791930wjP != null) {
                interfaceC1791930wjP.LJIIIZ(new InterfaceC1791670wiz() { // from class: X.0sBS
                    @Override // X.InterfaceC1791670wiz
                    public final void LIZLLL(C518160KTu c518160KTu) {
                        PriceInfo next;
                        String str2;
                        String strLIZIZ;
                        Map<String, IapProductDetail> map = c518160KTu.LJIIJ;
                        if (map != null) {
                            MiniDramaPricingServiceImpl miniDramaPricingServiceImpl = this.LIZ;
                            MutableLiveData<Map<String, String>> mutableLiveData2 = mutableLiveData;
                            Map<String, String> map2 = linkedHashMap;
                            List<PriceInfo> list2 = arrayList2;
                            miniDramaPricingServiceImpl.LIZJ.putAll(map);
                            for (Map.Entry<String, IapProductDetail> entry : map.entrySet()) {
                                String key = entry.getKey();
                                C1617230sBd c1617230sBd2 = entry.getValue().oneTimePurchaseProduct;
                                if (c1617230sBd2 == null || (strLIZIZ = c1617230sBd2.price) == null) {
                                    Iterator<PriceInfo> it4 = list2.iterator();
                                    do {
                                        next = null;
                                        if (!it4.hasNext()) {
                                            break;
                                        } else {
                                            next = it4.next();
                                        }
                                    } while (!Intrinsics.LJFF(next.iapId, key));
                                    PriceInfo priceInfo2 = next;
                                    if (priceInfo2 != null && (str2 = priceInfo2.priceInUsd) != null) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append('$');
                                        sbLIZ.append(str2);
                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        if (strLIZIZ != null) {
                                        }
                                    }
                                }
                                map2.put(key, strLIZIZ);
                            }
                            mutableLiveData2.postValue(map2);
                        }
                    }

                    @Override // X.InterfaceC1791670wiz
                    public final void LJ(C518080KTm c518080KTm) {
                        List<PriceInfo> list2 = arrayList2;
                        Map<String, String> map = linkedHashMap;
                        for (PriceInfo priceInfo2 : list2) {
                            String str2 = priceInfo2.iapId;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('$');
                            sbLIZ.append(priceInfo2.priceInUsd);
                            map.put(str2, C2188811AlT.LIZIZ(sbLIZ));
                        }
                        mutableLiveData.postValue(linkedHashMap);
                    }
                }, c1617170sBX);
                return mutableLiveData;
            }
        }
        return mutableLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.service.ISeriesPricingService
    public final LiveData<Map<Long, C1576640r8A>> LIZJ(Context context, List<C1617190sBZ> list) {
        Long lValueOf;
        IapProductDetail iapProductDetail;
        IapProductDetail iapProductDetail2;
        String strLIZIZ;
        Object obj;
        String str;
        Long lValueOf2;
        String str2;
        String str3;
        String str4;
        C1617230sBd c1617230sBd;
        C1617230sBd c1617230sBd2;
        String str5;
        C1617230sBd c1617230sBd3;
        C1617230sBd c1617230sBd4;
        C1617230sBd c1617230sBd5;
        C1617230sBd c1617230sBd6;
        C1617230sBd c1617230sBd7;
        String str6;
        String str7;
        String str8;
        String str9;
        final MutableLiveData mutableLiveData = new MutableLiveData();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1617190sBZ> it2 = list.iterator();
        while (true) {
            lValueOf = null;
            String str10 = null;
            if (!it2.hasNext()) {
                break;
            }
            C1617190sBZ next = it2.next();
            String[] strArr = new String[3];
            strArr[0] = next.LIZIZ.iapId;
            PriceInfo priceInfo = next.LIZJ;
            if (priceInfo != null) {
                str9 = priceInfo.iapId;
            } else {
                str9 = null;
            }
            strArr[1] = str9;
            PriceInfo priceInfo2 = next.LIZLLL;
            if (priceInfo2 != null) {
                str10 = priceInfo2.iapId;
            }
            strArr[2] = str10;
            arrayList.add(C13LQ.LJIJI(strArr));
        }
        List listLJIJJLI = C15438062q.LJIJJLI(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (ArrayList) listLJIJJLI) {
            if (C123100dR.LIZ((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
        if (this.LIZJ.isEmpty()) {
            C1617170sBX c1617170sBX = new C1617170sBX(this.LIZIZ, (String) null, 6);
            c1617170sBX.LIZIZ = C13LP.LLIIII(C15442062u.LJIIIZ(this.LIZLLL, setLLIIJI));
            mutableLiveData.postValue(C1617200sBa.LIZ);
            InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) this.LJ.getValue();
            if (interfaceC1791930wjP != null) {
                interfaceC1791930wjP.LJIIIZ(new InterfaceC1791670wiz() { // from class: X.0sBT
                    @Override // X.InterfaceC1791670wiz
                    public final void LIZLLL(C518160KTu c518160KTu) {
                        C1617150sBV c1617150sBV;
                        MutableLiveData<AbstractC1617180sBY> mutableLiveData2 = mutableLiveData;
                        Map<String, IapProductDetail> map = c518160KTu.LJIIJ;
                        if (map != null) {
                            HashMap map2 = new HashMap();
                            map2.putAll(map);
                            c1617150sBV = new C1617150sBV(map2);
                        } else {
                            c1617150sBV = null;
                        }
                        mutableLiveData2.postValue(c1617150sBV);
                    }

                    @Override // X.InterfaceC1791670wiz
                    public final void LJ(C518080KTm c518080KTm) {
                        mutableLiveData.postValue(C1617210sBb.LIZ);
                    }
                }, c1617170sBX);
            }
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C1617190sBZ c1617190sBZ : list) {
                if (c1617190sBZ.LIZIZ.iapId.length() > 0 && !this.LIZJ.containsKey(c1617190sBZ.LIZIZ.iapId)) {
                    linkedHashSet.add(c1617190sBZ.LIZIZ.iapId);
                }
                PriceInfo priceInfo3 = c1617190sBZ.LIZJ;
                if (priceInfo3 != null && priceInfo3.iapId.length() > 0 && !this.LIZJ.containsKey(priceInfo3.iapId)) {
                    linkedHashSet.add(priceInfo3.iapId);
                }
                PriceInfo priceInfo4 = c1617190sBZ.LIZLLL;
                if (priceInfo4 != null && (str8 = priceInfo4.iapId) != null && str8.length() > 0 && !this.LIZJ.containsKey(priceInfo4.iapId)) {
                    linkedHashSet.add(priceInfo4.iapId);
                }
            }
            if (linkedHashSet.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (C1617190sBZ c1617190sBZ2 : list) {
                    PriceInfo priceInfo5 = c1617190sBZ2.LIZIZ;
                    IapProductDetail iapProductDetail3 = (IapProductDetail) ((LinkedHashMap) this.LIZJ).get(priceInfo5.iapId);
                    PriceInfo priceInfo6 = c1617190sBZ2.LIZJ;
                    if (priceInfo6 != null && (str7 = priceInfo6.iapId) != null && str7.length() > 0) {
                        iapProductDetail = (IapProductDetail) ((LinkedHashMap) this.LIZJ).get(priceInfo6.iapId);
                    } else {
                        iapProductDetail = lValueOf;
                    }
                    PriceInfo priceInfo7 = c1617190sBZ2.LIZLLL;
                    if (priceInfo7 != null && (str6 = priceInfo7.iapId) != null && str6.length() > 0) {
                        iapProductDetail2 = (IapProductDetail) ((LinkedHashMap) this.LIZJ).get(priceInfo7.iapId);
                    } else {
                        iapProductDetail2 = lValueOf;
                    }
                    String str11 = priceInfo5.iapId;
                    if (iapProductDetail3 == null || (c1617230sBd7 = iapProductDetail3.oneTimePurchaseProduct) == null || (strLIZIZ = c1617230sBd7.price) == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('$');
                        sbLIZ.append(c1617190sBZ2.LIZIZ.priceInUsd);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (priceInfo6 != null) {
                        obj = priceInfo6.iapId;
                    } else {
                        obj = lValueOf;
                    }
                    String str12 = "";
                    if (iapProductDetail == 0 || (c1617230sBd6 = iapProductDetail.oneTimePurchaseProduct) == null || (str = c1617230sBd6.price) == null) {
                        str = "";
                    }
                    if (iapProductDetail3 != null && (c1617230sBd5 = iapProductDetail3.oneTimePurchaseProduct) != null) {
                        lValueOf = Long.valueOf(c1617230sBd5.priceAmountMicros);
                    }
                    if (iapProductDetail != 0 && (c1617230sBd4 = iapProductDetail.oneTimePurchaseProduct) != null) {
                        lValueOf2 = Long.valueOf(c1617230sBd4.priceAmountMicros);
                    } else {
                        lValueOf2 = null;
                    }
                    if (iapProductDetail3 != null && (c1617230sBd3 = iapProductDetail3.oneTimePurchaseProduct) != null) {
                        str2 = c1617230sBd3.priceCurrencyCode;
                    } else {
                        str2 = null;
                    }
                    String strLJII = LJII(lValueOf, lValueOf2, str2);
                    if (priceInfo7 != null) {
                        str3 = priceInfo7.iapId;
                    } else {
                        str3 = null;
                    }
                    if (iapProductDetail2 != 0 && (c1617230sBd2 = iapProductDetail2.oneTimePurchaseProduct) != null && (str5 = c1617230sBd2.price) != null) {
                        str12 = str5;
                    }
                    if (iapProductDetail3 == null || (c1617230sBd = iapProductDetail3.oneTimePurchaseProduct) == null || (str4 = c1617230sBd.priceCurrencyCode) == null) {
                        str4 = "USD";
                    }
                    Pair pair = new Pair(Long.valueOf(c1617190sBZ2.LIZ), new C1576640r8A(str11, strLIZIZ, obj, str, strLJII, str3, str12, str4, false));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    lValueOf = null;
                }
                return new MutableLiveData(linkedHashMap);
            }
            C1617170sBX c1617170sBX2 = new C1617170sBX(this.LIZIZ, (String) null, 6);
            c1617170sBX2.LIZIZ = C13LP.LLIIII(linkedHashSet);
            mutableLiveData.postValue(C1617200sBa.LIZ);
            InterfaceC1791930wjP interfaceC1791930wjP2 = (InterfaceC1791930wjP) this.LJ.getValue();
            if (interfaceC1791930wjP2 != null) {
                interfaceC1791930wjP2.LJIIIZ(new InterfaceC1791670wiz() { // from class: X.0sBU
                    @Override // X.InterfaceC1791670wiz
                    public final void LIZLLL(C518160KTu c518160KTu) {
                        C1617150sBV c1617150sBV;
                        MutableLiveData<AbstractC1617180sBY> mutableLiveData2 = mutableLiveData;
                        Map<String, IapProductDetail> map = c518160KTu.LJIIJ;
                        if (map != null) {
                            HashMap map2 = new HashMap();
                            map2.putAll(map);
                            c1617150sBV = new C1617150sBV(map2);
                        } else {
                            c1617150sBV = null;
                        }
                        mutableLiveData2.postValue(c1617150sBV);
                    }

                    @Override // X.InterfaceC1791670wiz
                    public final void LJ(C518080KTm c518080KTm) {
                        mutableLiveData.postValue(C1617210sBb.LIZ);
                    }
                }, c1617170sBX2);
            }
        }
        return Transformations.map(mutableLiveData, new AwS233S0300000_24((List) list, (List<C1617190sBZ>) this, (MiniDramaPricingServiceImpl) context, (Context) 5));
    }

    public static String LJII(Long l, Long l2, String str) {
        if (l != null && l2 != null && str != null) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            currencyInstance.setMinimumFractionDigits(0);
            currencyInstance.setMaximumFractionDigits(2);
            currencyInstance.setCurrency(Currency.getInstance(str));
            return currencyInstance.format(Float.valueOf((l.longValue() - l2.longValue()) / 1000000.0f));
        }
        return null;
    }
}
