package com.bytedance.hybrid.spark.raven.data;

import X.C01GW;
import X.C1043010dFT;
import X.C1160530gJ1;
import X.C1160780gJQ;
import X.C1160990gJl;
import X.C1161000gJm;
import X.C1161040gJq;
import X.C1161060gJs;
import X.C1161090gJv;
import X.C1161100gJw;
import X.C1161140gK0;
import X.C1161250gKB;
import X.C1161310gKH;
import X.C1161320gKI;
import X.C11JN;
import X.C11K9;
import X.C11NZ;
import X.C11S5;
import X.C1208880hZ0;
import X.C13BV;
import X.C13LP;
import X.C13LZ;
import X.C15438062q;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1889907aj;
import X.C2188811AlT;
import X.C259800zU;
import X.C452501pT;
import X.EnumC1161160gK2;
import X.InterfaceC1160790gJR;
import X.InterfaceC1478005qU;
import X.InterfaceC1487280oo2;
import Y.AComparatorS37S0000000_18;
import Y.AfS154S0200000_18;
import Y.AfS17S1400000_18;
import Y.AfS187S0100000_18;
import Y.AkS200S0300000_18;
import Y.AkS480S0100000_18;
import android.os.Looper;
import androidx.lifecycle.ViewModel;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.google.gson.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS23S0401000_18;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenVm extends ViewModel {
    public final String LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(67));
    public C1161040gJq LLILLL;

    public final C1161250gKB vQ2() {
        return (C1161250gKB) this.LLILLJJLI.getValue();
    }

    public RavenVm(String str) {
        this.LL = str;
    }

    public static void AQ2(C1161040gJq c1161040gJq) {
        C1161090gJv c1161090gJv;
        Map<String, C1161060gJs> map;
        if (c1161040gJq != null && (c1161090gJv = c1161040gJq.LL) != null && (map = c1161090gJv.LIZ) != null) {
            for (Map.Entry<String, C1161060gJs> entry : map.entrySet()) {
                BaseComponentData baseComponentData = entry.getValue().LIZ.LIZLLL;
                if (baseComponentData != null) {
                    baseComponentData.instanceId = entry.getKey();
                }
                BaseComponentData baseComponentData2 = entry.getValue().LIZ.LIZLLL;
                if (baseComponentData2 != null) {
                    baseComponentData2.componentType = entry.getValue().LIZ.LIZIZ;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1161040gJq xQ2(X.C1161040gJq r22) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.raven.data.RavenVm.xQ2(X.0gJq):X.0gJq");
    }

    public static String CQ2(RavenVm ravenVm, List list) {
        String strLIZIZ;
        ravenVm.getClass();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C1161140gK0) it2.next()).LIZ);
            }
            List listLL = C13LP.LL(arrayList, 16);
            if (arrayList.size() > 16) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(", ... total=");
                sbLIZ.append(arrayList.size());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(']');
            sbLIZ2.append(strLIZIZ);
            return C13LP.LJJLIIIJ(listLL, null, e3.e, C2188811AlT.LIZIZ(sbLIZ2), 0, null, null, 57);
        }
        return "[]";
    }

    public static PageInfo yQ2(PageInfo pageInfo, PageInfo pageInfo2) {
        if (pageInfo == null) {
            return pageInfo2;
        }
        if (pageInfo2 == null) {
            return pageInfo;
        }
        String str = pageInfo2.pageId;
        if (str == null) {
            str = pageInfo.pageId;
        }
        Integer num = pageInfo2.responseType;
        if (num == null) {
            num = pageInfo.responseType;
        }
        Integer num2 = pageInfo2.protocolVersion;
        if (num2 == null) {
            num2 = pageInfo.protocolVersion;
        }
        k kVar = pageInfo2.data;
        if (kVar == null) {
            kVar = pageInfo.data;
        }
        k kVar2 = pageInfo2.log_pb;
        if (kVar2 == null) {
            kVar2 = pageInfo.log_pb;
        }
        return pageInfo2.copy(str, num, kVar, kVar2, num2, pageInfo2.refreshBodyOnly, pageInfo2.loadMore, pageInfo2.insert, pageInfo2.delete, pageInfo2.currentHasMore);
    }

    public final C11JN BQ2(final C1161000gJm c1161000gJm, Function1 function1, Function0 function0, final C1160780gJQ c1160780gJQ) {
        final String str = this.LL;
        final C259800zU c259800zU = new C259800zU();
        final C259800zU c259800zU2 = new C259800zU();
        final C259800zU c259800zU3 = new C259800zU();
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0gJf
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<C1161040gJq> c09aj) {
                C1C7U.LIZ("RavenDataProcessor@25d7.submitFirstScreenResponse$1");
                C11NZ c11nzLJJJJZ = C11NZ.LJJJJZ(c1161000gJm);
                if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    c11nzLJJJJZ = c11nzLJJJJZ.LJJJLZIJ(C1701940uOG.LIZIZ());
                }
                C11O8 c11o8LJJJLZIJ = c11nzLJJJJZ.LJJIJIIJIL(new AfS187S0100000_18(c1160780gJQ, 57)).LJJJLZIJ(C11S5.LIZIZ);
                String str2 = str;
                InterfaceC1160790gJR interfaceC1160790gJR = c1160780gJQ;
                C259800zU<C1161090gJv> c259800zU4 = c259800zU3;
                C259800zU<Map<String, List<String>>> c259800zU5 = c259800zU2;
                C259800zU<C1161040gJq> c259800zU6 = c259800zU;
                C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                c11o8LJJJLZIJ.LJJZ(new AfS17S1400000_18(interfaceC1160790gJR, c259800zU4, c259800zU5, str2, c259800zU6, 1), new AfS154S0200000_18(c19482611Ke, c259800zU6, 17), new C1208870hYz(c259800zU6, c19482611Ke, 1));
                C1C7U.LIZIZ("RavenDataProcessor@25d7.submitFirstScreenResponse$1");
            }
        }).LJJJJZI(new AkS480S0100000_18(function1, 5)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS200S0300000_18(c1160780gJQ, this, function0, 3)).LJJL(new AkS200S0300000_18(c1160780gJQ, this, function0, 0)).LJJIIJZLJL(new C1208880hZ0(c1160780gJQ, 5));
    }

    public final C1161040gJq wQ2(C1161040gJq c1161040gJq, Throwable th, InterfaceC1160790gJR interfaceC1160790gJR, Function0<C1161040gJq> function0) {
        int errorCode;
        boolean z;
        C1161310gKH c1161310gKH;
        boolean z2;
        InsertInfo insertInfo;
        int size;
        List<String> list;
        C1161090gJv c1161090gJv;
        boolean z3;
        C1161040gJq c1161040gJq2;
        boolean z4;
        ArrayList arrayList;
        String str;
        C1161100gJw c1161100gJwLIZ;
        C1161140gK0 c1161140gK0;
        BaseComponentData baseComponentData;
        C1161060gJs c1161060gJs;
        C1161040gJq c1161040gJq3;
        int size2;
        ArrayList arrayList2;
        C1161090gJv c1161090gJv2;
        String str2;
        C1161100gJw c1161100gJwLIZ2;
        C1161140gK0 c1161140gK02;
        BaseComponentData baseComponentData2;
        C1161060gJs c1161060gJs2;
        boolean z5;
        C1161090gJv c1161090gJv3;
        Map<String, C1161060gJs> map;
        String str3;
        int i;
        String str4;
        C1161060gJs c1161060gJs3;
        Integer num;
        C1161040gJq c1161040gJqXQ2 = xQ2(c1161040gJq);
        if (c1161040gJqXQ2 != null) {
            PageInfo pageInfo = c1161040gJqXQ2.LLILLL;
            if (pageInfo != null && (num = pageInfo.responseType) != null && num.intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            PageInfo pageInfo2 = c1161040gJqXQ2.LLILLL;
            if (pageInfo2 != null) {
                insertInfo = pageInfo2.insert;
            } else {
                insertInfo = null;
            }
            List<C1161140gK0> listLIZIZ = c1161040gJqXQ2.LIZIZ();
            if (listLIZIZ != null) {
                size = listLIZIZ.size();
            } else {
                size = 0;
            }
            new C1043010dFT();
            C1043010dFT.LIZIZ("RavenVm", new C1160530gJ1(z2, insertInfo, size));
            if (insertInfo != null && (c1161040gJq3 = this.LLILLL) != null) {
                List<C1161140gK0> listLIZIZ2 = c1161040gJq3.LIZIZ();
                if (listLIZIZ2 != null && (c1161090gJv3 = c1161040gJq3.LL) != null && (map = c1161090gJv3.LIZ) != null && (str3 = insertInfo.position) != null) {
                    Iterator<C1161140gK0> it2 = listLIZIZ2.iterator();
                    int i2 = 0;
                    while (true) {
                        i = -1;
                        if (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().LIZ, str3)) {
                                break;
                            }
                            i2++;
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i2);
                    if (numValueOf.intValue() < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        size2 = numValueOf.intValue();
                    } else {
                        size2 = -1;
                        int i3 = 0;
                        for (C1161140gK0 c1161140gK03 : listLIZIZ2) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                C1161060gJs c1161060gJs4 = map.get(c1161140gK03.LIZ);
                                if (c1161060gJs4 != null && (c1161060gJs3 = c1161060gJs4.LIZJ) != null) {
                                    str4 = c1161060gJs3.LIZIZ;
                                } else {
                                    str4 = null;
                                }
                                if (Intrinsics.LJFF(str4, str3)) {
                                    if (size2 < 0) {
                                        size2 = i3;
                                    }
                                    i = i3;
                                }
                                i3 = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        if (!Intrinsics.LJFF(insertInfo.action, "before")) {
                            size2 = i;
                        }
                    }
                    if (size2 < 0) {
                        size2 = listLIZIZ2.size();
                    } else if (!Intrinsics.LJFF(insertInfo.action, "before")) {
                        size2++;
                    }
                } else {
                    size2 = 0;
                }
                C1161090gJv c1161090gJv4 = c1161040gJq3.LL;
                List<C1161140gK0> listLIZIZ3 = c1161040gJqXQ2.LIZIZ();
                if (listLIZIZ3 == null) {
                    listLIZIZ3 = C13BV.INSTANCE;
                }
                C1161090gJv c1161090gJv5 = c1161040gJqXQ2.LL;
                if (c1161090gJv4 != null && c1161090gJv5 != null && (!listLIZIZ3.isEmpty())) {
                    Map<String, C1161060gJs> map2 = c1161090gJv5.LIZ;
                    List<C1161100gJw> list2 = c1161090gJv5.LIZJ;
                    if (listLIZIZ3.isEmpty()) {
                        c1161090gJv2 = c1161090gJv4;
                    } else {
                        List<C1161140gK0> listLIZ = c1161090gJv4.LIZ();
                        if (listLIZ != null) {
                            arrayList2 = new ArrayList(listLIZ);
                        } else {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        arrayList3.addAll(C13LZ.LJ(size2, 0, arrayList3.size()), listLIZIZ3);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(c1161090gJv4.LIZ);
                        for (Map.Entry<String, C1161060gJs> entry : map2.entrySet()) {
                            String key = entry.getKey();
                            C1161060gJs value = entry.getValue();
                            if (value.LIZ.LIZJ != EnumC1161160gK2.GROUP || !linkedHashMap.containsKey(key)) {
                                linkedHashMap.put(key, value);
                            }
                        }
                        int size3 = listLIZIZ3.size();
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        for (C1161100gJw c1161100gJw : list2) {
                            C1161060gJs c1161060gJs5 = map2.get(c1161100gJw.LIZLLL);
                            if (c1161060gJs5 != null && (c1161060gJs2 = c1161060gJs5.LIZJ) != null) {
                                str2 = c1161060gJs2.LIZIZ;
                            } else {
                                str2 = null;
                            }
                            C1161060gJs c1161060gJs6 = c1161090gJv4.LIZ.get(str2);
                            if (c1161060gJs6 != null && (c1161140gK02 = c1161060gJs6.LIZ) != null && (baseComponentData2 = c1161140gK02.LIZLLL) != null) {
                                c1161100gJwLIZ2 = C1161100gJw.LIZ(c1161100gJw, c1161100gJw.LIZ + size2, c1161100gJw.LIZIZ + size2, baseComponentData2.groupLayoutType, null, baseComponentData2.column, baseComponentData2.gap, baseComponentData2.paddingLeft, baseComponentData2.paddingRight, baseComponentData2.paddingTop, baseComponentData2.paddingBottom, baseComponentData2.backgroundColor, baseComponentData2.backgroundColorDark, 8);
                            } else {
                                c1161100gJwLIZ2 = C1161100gJw.LIZ(c1161100gJw, c1161100gJw.LIZ + size2, c1161100gJw.LIZIZ + size2, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 4092);
                            }
                            arrayList4.add(c1161100gJwLIZ2);
                        }
                        List<C1161100gJw> list3 = c1161090gJv4.LIZJ;
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                        for (C1161100gJw c1161100gJwLIZ3 : list3) {
                            int i5 = c1161100gJwLIZ3.LIZIZ;
                            if (i5 > size2) {
                                int i6 = c1161100gJwLIZ3.LIZ;
                                if (i6 >= size2) {
                                    c1161100gJwLIZ3 = C1161100gJw.LIZ(c1161100gJwLIZ3, i6 + size3, i5 + size3, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 4092);
                                } else {
                                    c1161100gJwLIZ3 = C1161100gJw.LIZ(c1161100gJwLIZ3, 0, i5 + size3, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 4093);
                                }
                            }
                            arrayList5.add(c1161100gJwLIZ3);
                        }
                        List listLJLLLL = C13LP.LJLLLL(new AComparatorS37S0000000_18(14), C13LP.LJLIL(arrayList4, arrayList5));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c1161090gJv4.LIZIZ);
                        linkedHashMap2.put("body", arrayList3);
                        c1161090gJv2 = new C1161090gJv(linkedHashMap, linkedHashMap2, listLJLLLL);
                    }
                    C1161090gJv c1161090gJv6 = c1161090gJv2;
                    C1161040gJq c1161040gJqLIZLLL = C1161040gJq.LIZLLL(c1161040gJq3, c1161090gJv6, false, yQ2(c1161040gJq3.LLILLL, c1161040gJqXQ2.LLILLL), false, null, null, 122);
                    this.LLILLL = c1161040gJqLIZLLL;
                    new C1043010dFT();
                    C1043010dFT.LIZIZ("RavenVm", new AwS23S0401000_18(size2, (int) this, (RavenVm) c1161090gJv4, (C1161090gJv) listLIZIZ3, (List<C1161140gK0>) c1161090gJv6, (C1161090gJv) 0));
                    vQ2().LIZLLL(c1161040gJqLIZLLL.LLILLL);
                    vQ2().LIZJ(c1161040gJqLIZLLL.LIZ(), c1161040gJqLIZLLL.LLILLJJLI);
                    C1161040gJq c1161040gJqLIZLLL2 = C1161040gJq.LIZLLL(c1161040gJqXQ2, null, false, null, false, null, Integer.valueOf(size2), 63);
                    List<C1161140gK0> listLIZIZ4 = c1161040gJqLIZLLL2.LIZIZ();
                    if (listLIZIZ4 != null) {
                        for (C1161140gK0 c1161140gK04 : listLIZIZ4) {
                            BaseComponentData baseComponentData3 = c1161140gK04.LIZLLL;
                            if (baseComponentData3 != null) {
                                baseComponentData3.instanceId = c1161140gK04.LIZ;
                            }
                        }
                    }
                    if (interfaceC1160790gJR != null) {
                        if (th == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        interfaceC1160790gJR.LIZJ(c1161040gJqLIZLLL2, z5);
                    }
                    AQ2(c1161040gJqLIZLLL2);
                    return c1161040gJqLIZLLL2;
                }
            }
            PageInfo pageInfo3 = c1161040gJqXQ2.LLILLL;
            if (pageInfo3 != null) {
                list = pageInfo3.loadMore;
            } else {
                list = null;
            }
            if (z2 && insertInfo == null && list != null && !list.isEmpty() && (c1161040gJq2 = this.LLILLL) != null) {
                C1161090gJv c1161090gJv7 = c1161040gJq2.LL;
                List<C1161140gK0> listLIZIZ5 = c1161040gJqXQ2.LIZIZ();
                if (listLIZIZ5 == null) {
                    listLIZIZ5 = C13BV.INSTANCE;
                }
                C1161090gJv c1161090gJv8 = c1161040gJqXQ2.LL;
                if (c1161090gJv7 != null && c1161090gJv8 != null && (!listLIZIZ5.isEmpty())) {
                    Map<String, C1161060gJs> map3 = c1161090gJv8.LIZ;
                    List<C1161100gJw> list4 = c1161090gJv8.LIZJ;
                    if (!listLIZIZ5.isEmpty()) {
                        List<C1161140gK0> listLIZ2 = c1161090gJv7.LIZ();
                        if (listLIZ2 != null) {
                            arrayList = new ArrayList(listLIZ2);
                        } else {
                            arrayList = new ArrayList();
                        }
                        int size4 = arrayList.size();
                        List listLJLIL = C13LP.LJLIL(listLIZIZ5, arrayList);
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.putAll(c1161090gJv7.LIZ);
                        for (Map.Entry<String, C1161060gJs> entry2 : map3.entrySet()) {
                            String key2 = entry2.getKey();
                            C1161060gJs value2 = entry2.getValue();
                            if (value2.LIZ.LIZJ != EnumC1161160gK2.GROUP || !linkedHashMap3.containsKey(key2)) {
                                linkedHashMap3.put(key2, value2);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                        for (C1161100gJw c1161100gJw2 : list4) {
                            C1161060gJs c1161060gJs7 = map3.get(c1161100gJw2.LIZLLL);
                            if (c1161060gJs7 != null && (c1161060gJs = c1161060gJs7.LIZJ) != null) {
                                str = c1161060gJs.LIZIZ;
                            } else {
                                str = null;
                            }
                            C1161060gJs c1161060gJs8 = c1161090gJv7.LIZ.get(str);
                            if (c1161060gJs8 != null && (c1161140gK0 = c1161060gJs8.LIZ) != null && (baseComponentData = c1161140gK0.LIZLLL) != null) {
                                c1161100gJwLIZ = C1161100gJw.LIZ(c1161100gJw2, c1161100gJw2.LIZ + size4, c1161100gJw2.LIZIZ + size4, baseComponentData.groupLayoutType, null, baseComponentData.column, baseComponentData.gap, baseComponentData.paddingLeft, baseComponentData.paddingRight, baseComponentData.paddingTop, baseComponentData.paddingBottom, baseComponentData.backgroundColor, baseComponentData.backgroundColorDark, 8);
                            } else {
                                c1161100gJwLIZ = C1161100gJw.LIZ(c1161100gJw2, c1161100gJw2.LIZ + size4, c1161100gJw2.LIZIZ + size4, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 4092);
                            }
                            arrayList6.add(c1161100gJwLIZ);
                        }
                        List listLJLIL2 = C13LP.LJLIL(arrayList6, c1161090gJv7.LIZJ);
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(c1161090gJv7.LIZIZ);
                        linkedHashMap4.put("body", listLJLIL);
                        c1161090gJv7 = new C1161090gJv(linkedHashMap3, linkedHashMap4, listLJLIL2);
                    }
                    C1161040gJq c1161040gJqLIZLLL3 = C1161040gJq.LIZLLL(c1161040gJq2, c1161090gJv7, false, yQ2(c1161040gJq2.LLILLL, c1161040gJqXQ2.LLILLL), false, null, null, 122);
                    this.LLILLL = c1161040gJqLIZLLL3;
                    vQ2().LIZLLL(c1161040gJqLIZLLL3.LLILLL);
                    vQ2().LIZJ(c1161040gJqLIZLLL3.LIZ(), c1161040gJqLIZLLL3.LLILLJJLI);
                    List<C1161140gK0> listLIZIZ6 = c1161040gJqXQ2.LIZIZ();
                    if (listLIZIZ6 != null) {
                        for (C1161140gK0 c1161140gK05 : listLIZIZ6) {
                            BaseComponentData baseComponentData4 = c1161140gK05.LIZLLL;
                            if (baseComponentData4 != null) {
                                baseComponentData4.instanceId = c1161140gK05.LIZ;
                            }
                        }
                    }
                    if (interfaceC1160790gJR != null) {
                        if (th == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        interfaceC1160790gJR.LIZJ(c1161040gJqXQ2, z4);
                    }
                    AQ2(c1161040gJqXQ2);
                    return c1161040gJqXQ2;
                }
            }
            if (!z2) {
                this.LLILLL = c1161040gJqXQ2;
            } else {
                PageInfo pageInfo4 = c1161040gJqXQ2.LLILLL;
                if (pageInfo4 != null && Intrinsics.LJFF(pageInfo4.refreshBodyOnly, Boolean.TRUE)) {
                    C1161040gJq c1161040gJqLIZLLL4 = this.LLILLL;
                    if (c1161040gJqLIZLLL4 != null && (c1161090gJv = c1161040gJqLIZLLL4.LL) != null) {
                        C1161090gJv c1161090gJv9 = c1161040gJqXQ2.LL;
                        if (c1161090gJv9 != null) {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap(c1161090gJv.LIZIZ);
                            List<C1161140gK0> list5 = c1161090gJv9.LIZIZ.get("body");
                            if (list5 != null) {
                                linkedHashMap5.put("body", list5);
                            }
                            LinkedHashMap linkedHashMap6 = new LinkedHashMap(c1161090gJv.LIZ);
                            linkedHashMap6.putAll(c1161090gJv9.LIZ);
                            C1161090gJv c1161090gJv10 = new C1161090gJv(linkedHashMap6, linkedHashMap5, c1161090gJv9.LIZJ);
                            PageInfo pageInfoYQ2 = yQ2(c1161040gJqLIZLLL4.LLILLL, c1161040gJqXQ2.LLILLL);
                            C1889907aj c1889907aj = c1161040gJqXQ2.LLILZLL;
                            if (c1889907aj == null) {
                                c1889907aj = c1161040gJqLIZLLL4.LLILZLL;
                            }
                            c1161040gJqLIZLLL4 = C1161040gJq.LIZLLL(c1161040gJqLIZLLL4, c1161090gJv10, false, pageInfoYQ2, false, c1889907aj, null, 90);
                        }
                        c1161040gJqXQ2 = c1161040gJqLIZLLL4;
                    }
                    this.LLILLL = c1161040gJqXQ2;
                }
            }
            vQ2().LIZLLL(c1161040gJqXQ2.LLILLL);
            vQ2().LIZJ(c1161040gJqXQ2.LIZ(), c1161040gJqXQ2.LLILLJJLI);
            if (interfaceC1160790gJR != null) {
                if (th == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                interfaceC1160790gJR.LIZJ(c1161040gJqXQ2, z3);
            }
            AQ2(c1161040gJqXQ2);
            return c1161040gJqXQ2;
        }
        C1161040gJq c1161040gJqInvoke = this.LLILLL;
        if (c1161040gJqInvoke == null && (c1161040gJqInvoke = function0.invoke()) == null) {
            return null;
        }
        C1161040gJq c1161040gJq4 = null;
        if ((th instanceof C1161320gKI) && (c1161310gKH = (C1161310gKH) th) != null) {
            errorCode = c1161310gKH.getErrorCode();
        } else if (th != null) {
            errorCode = -999;
        } else {
            errorCode = c1161040gJqInvoke.status_code;
        }
        C1161040gJq c1161040gJqXQ22 = xQ2(C1161040gJq.LIZLLL(c1161040gJqInvoke, null, true, null, true, null, null, 117));
        if (c1161040gJqXQ22 != null) {
            c1161040gJqXQ22.status_code = errorCode;
            c1161040gJq4 = c1161040gJqXQ22;
        }
        this.LLILLL = c1161040gJq4;
        if (c1161040gJq4 != null) {
            vQ2().LIZLLL(c1161040gJq4.LLILLL);
            vQ2().LIZJ(c1161040gJq4.LIZ(), c1161040gJq4.LLILLJJLI);
            if (interfaceC1160790gJR != null) {
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1160790gJR.LIZJ(c1161040gJq4, z);
            }
        }
        C1161040gJq c1161040gJq5 = this.LLILLL;
        AQ2(c1161040gJq5);
        return c1161040gJq5;
    }

    public final C11JN zQ2(C1160990gJl c1160990gJl, C11K9 c11k9, Function1 function1, final C1160780gJQ c1160780gJQ) {
        final String str = this.LL;
        C11NZ c11nzLJJIJIL = c11k9.LJJIJIL(new AfS154S0200000_18(c1160990gJl, c1160780gJQ, 20));
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            c11nzLJJIJIL = c11nzLJJIJIL.LJJJLZIJ(C1701940uOG.LIZIZ());
        }
        return c11nzLJJIJIL.LJJIJIIJIL(new AfS187S0100000_18(c1160780gJQ, 61)).LJJJLZIJ(C11S5.LIZIZ).LJJJ(new InterfaceC1487280oo2() { // from class: X.0gJi
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Pair pairLIZ = C1161130gJz.LIZ(str, (C1161000gJm) obj, c1160780gJQ, null, null);
                if (pairLIZ != null) {
                    return C11NZ.LJJJJZ(pairLIZ.getFirst());
                }
                return C11IR.LL;
            }
        }, false).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJI(new AfS187S0100000_18(c1160780gJQ, 62)).LJJIIJZLJL(new C1208880hZ0(c1160780gJQ, 8)).LJJJJZI(new AkS480S0100000_18(function1, 3)).LJJIJIIJIL(new AfS187S0100000_18(c1160780gJQ, 60));
    }
}
