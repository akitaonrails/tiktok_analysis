package defpackage;

import X.AbstractC19994813Le;
import X.AbstractC590750NEz;
import X.AnonymousClass0958;
import X.C054G;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0HAW;
import X.C0NDV;
import X.C0NE4;
import X.C0NE5;
import X.C0NF1;
import X.C13BV;
import X.C13LP;
import X.C13LZ;
import X.C155000ia;
import X.C1954807lC;
import X.C2232408os;
import X.C2268981DrU;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C259800zU;
import X.C294330BgF;
import X.C590350NDl;
import X.C590420NDs;
import X.C590480NDy;
import X.C590710NEv;
import X.C639060P4u;
import X.C786410Ut5;
import X.EnumC590690NEt;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import Y.AComparatorS28S0000000_9;
import Y.AComparatorS363S0200000_9;
import Y.AComparatorS508S0100000_9;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.coldcache.exp.PlayerCacheSortSetting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localcache.database.HistoryVideoInfoStruct;
import com.ss.android.ugc.aweme.util.IFeedCacheLoaderService;
import defpackage.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS92S0210000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes10.dex */
public final class z0 {
    public static final int LIZLLL;
    public static final int LJ;
    public static final boolean LJFF;
    public static volatile boolean LJII;
    public static volatile boolean LJIIIIZZ;
    public static volatile int LJIIIZ;
    public static final z0 LIZ = new z0();
    public static final C054G LIZIZ = C2296808zG.LIZ(new C2232408os(C786410Ut5.h4()).plus(C2296908zH.LIZ()).plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 24)));
    public static final CopyOnWriteArrayList<HistoryVideoInfoStruct> LIZJ = new CopyOnWriteArrayList<>();
    public static final AtomicInteger LJI = new AtomicInteger(0);

    public final synchronized void LIZ() {
        if (!LJIIIIZZ && LJ > 0) {
            C590420NDs.LIZ.getClass();
            LIZJ.addAll(C590420NDs.LJIILL());
            LIZIZ();
            LJIIIIZZ = true;
        }
    }

    public final synchronized void LIZIZ() {
        CopyOnWriteArrayList<HistoryVideoInfoStruct> copyOnWriteArrayList = LIZJ;
        int size = copyOnWriteArrayList.size();
        int i = LIZLLL;
        if (size > i) {
            ArrayList arrayList = new ArrayList(C13LP.LL(copyOnWriteArrayList, i));
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(arrayList);
        }
    }

    static {
        LIZLLL = 10;
        LJ = 10;
        LJFF = true;
        LJ = ((Number) C2268981DrU.LJIIJJI.getValue()).intValue();
        LIZLLL = ((Number) C2268981DrU.LJIIIZ.getValue()).intValue();
        LJFF = ((double) ((Number) C2268981DrU.LJIIJ.getValue()).floatValue()) >= ((double) C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(1, 10))) / 10.0d;
    }

    @C09DV(c = "ColdCachePoolSortWrapper$sort$1", f = "ColdCachePoolSortWrapper.kt", l = {}, m = "invokeSuspend")
    public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ C0NE4 LL;
        public final /* synthetic */ C590710NEv LLILLJJLI;
        public final /* synthetic */ Function1<C0HAW, Unit> LLILLL;

        /* JADX INFO: renamed from: z0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0081a {
            public static final /* synthetic */ int[] LIZ;
            public static final /* synthetic */ int[] LIZIZ;

            static {
                int[] iArr = new int[C0NE4.values().length];
                try {
                    iArr[C0NE4.COLD_CACHE_DB.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    iArr[C0NE4.UNCONSUMED_CACHE.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    iArr[C0NE4.GOLDEN_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                LIZ = iArr;
                int[] iArr2 = new int[EnumC590690NEt.values().length];
                try {
                    iArr2[EnumC590690NEt.RANDOM.ordinal()] = 1;
                } catch (NoSuchFieldError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                try {
                    iArr2[EnumC590690NEt.BY_BITRATE.ordinal()] = 2;
                } catch (NoSuchFieldError e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
                try {
                    iArr2[EnumC590690NEt.BY_SIMILARITY.ordinal()] = 3;
                } catch (NoSuchFieldError e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
                try {
                    iArr2[EnumC590690NEt.BY_AGGREGATION.ordinal()] = 4;
                } catch (NoSuchFieldError e7) {
                    TryCatchGuardChecker.doCheck(e7);
                }
                LIZIZ = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C0NE4 c0ne4, C590710NEv c590710NEv, Function1<? super C0HAW, Unit> function1, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.LL = c0ne4;
            this.LLILLJJLI = c590710NEv;
            this.LLILLL = function1;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new a(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            final PlayerCacheSortSetting playerCacheSortSetting;
            AbstractC590750NEz c0nf1;
            ArrayList<C590350NDl> arrayList;
            n nVar;
            ArrayList<HistoryVideoInfoStruct> arrayList2;
            C099R.LJFF();
            C155000ia.LIZIZ(obj);
            System.currentTimeMillis();
            int i = C0081a.LIZ[this.LL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        playerCacheSortSetting = (PlayerCacheSortSetting) C2268981DrU.LJIIIIZZ.getValue();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    playerCacheSortSetting = (PlayerCacheSortSetting) C2268981DrU.LJII.getValue();
                }
            } else {
                playerCacheSortSetting = (PlayerCacheSortSetting) C2268981DrU.LJI.getValue();
            }
            int i2 = C0081a.LIZIZ[((EnumC590690NEt) playerCacheSortSetting.LIZIZ.getValue()).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            c0nf1 = null;
                        } else {
                            c0nf1 = new C0NF1(playerCacheSortSetting) { // from class: X.0NF2
                                public final boolean LJIIJ;
                                public final int LJIIJJI;
                                public final double LJIIL;
                                public final double LJIILIIL;
                                public final double LJIILJJIL;
                                public final double LJIILL;

                                {
                                    boolean z;
                                    Object objValueOf;
                                    Object objValueOf2;
                                    super(playerCacheSortSetting);
                                    this.LJIIJJI = 10;
                                    this.LJIIL = 0.5d;
                                    this.LJIILIIL = 0.5d;
                                    this.LJIILJJIL = 0.5d;
                                    this.LJIILL = 0.5d;
                                    this.LJIIJ = playerCacheSortSetting.needLocalSwap;
                                    this.LJIIJJI = playerCacheSortSetting.maxLoopCount;
                                    this.LJII = playerCacheSortSetting.lowerNonVideoRank;
                                    List<Double> list = playerCacheSortSetting.coefficients;
                                    if (list.size() > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        objValueOf = ListProtector.get(list, 0);
                                    } else {
                                        objValueOf = Double.valueOf(0.0d);
                                    }
                                    double dDoubleValue = ((Number) objValueOf).doubleValue();
                                    this.LJIIL = dDoubleValue;
                                    List<Double> list2 = playerCacheSortSetting.coefficients;
                                    if (1 < list2.size()) {
                                        objValueOf2 = ListProtector.get(list2, 1);
                                    } else {
                                        objValueOf2 = Double.valueOf(0.0d);
                                    }
                                    double dDoubleValue2 = ((Number) objValueOf2).doubleValue();
                                    this.LJIILIIL = dDoubleValue2;
                                    this.LJIILJJIL = Math.abs(dDoubleValue);
                                    this.LJIILL = Math.abs(dDoubleValue2);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // X.AbstractC590750NEz
                                public final Pair<List<String>, List<C0NGD>> LIZ(C590710NEv c590710NEv) {
                                    List listSingletonList;
                                    C717620SCy c717620SCyLLIIL;
                                    int iIntValue;
                                    int iIntValue2;
                                    int iIntValue3;
                                    double dDoubleValue;
                                    int iIntValue4;
                                    boolean z;
                                    int iIntValue5;
                                    int iIntValue6;
                                    boolean z2;
                                    boolean z3;
                                    int iIntValue7;
                                    int iIntValue8;
                                    boolean z4;
                                    Double d;
                                    int iIntValue9;
                                    int iIntValue10;
                                    int iIntValue11;
                                    int iIntValue12;
                                    double d2;
                                    double d3;
                                    int size;
                                    int size2;
                                    double d4;
                                    Object objValueOf;
                                    Object objValueOf2;
                                    double dDoubleValue2;
                                    double dDoubleValue3;
                                    C590350NDl c590350NDl = (C590350NDl) C13LP.LJJJLL(c590710NEv.LIZ);
                                    boolean zLJ = C0NF1.LJ(c590350NDl);
                                    if (zLJ && c590350NDl != null) {
                                        listSingletonList = Collections.singletonList(new IndexedValue(0, c590350NDl));
                                    } else {
                                        listSingletonList = C13BV.INSTANCE;
                                    }
                                    if (zLJ) {
                                        c717620SCyLLIIL = C13LP.LLIIL(C13LP.LJJJJIZL(c590710NEv.LIZ, 1));
                                    } else {
                                        c717620SCyLLIIL = C13LP.LLIIL(c590710NEv.LIZ);
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it2 = c717620SCyLLIIL.iterator();
                                    while (true) {
                                        C717610SCx c717610SCx = (C717610SCx) it2;
                                        if (!c717610SCx.hasNext()) {
                                            break;
                                        }
                                        Object next = c717610SCx.next();
                                        IndexedValue indexedValue = (IndexedValue) next;
                                        if (this.LJII && !((C590350NDl) indexedValue.LIZIZ).LIZLLL()) {
                                            arrayList4.add(next);
                                        } else {
                                            arrayList3.add(next);
                                        }
                                    }
                                    Pair pair = new Pair(arrayList3, arrayList4);
                                    List list = (List) pair.getFirst();
                                    List list2 = (List) pair.getSecond();
                                    ArrayList arrayList5 = new ArrayList();
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj2 : list) {
                                        if (((C590350NDl) ((IndexedValue) obj2).LIZIZ).LJIIJ != EnumC590300NDg.NOT_COMPLETE) {
                                            arrayList5.add(obj2);
                                        } else {
                                            arrayList6.add(obj2);
                                        }
                                    }
                                    Pair pair2 = new Pair(arrayList5, arrayList6);
                                    List<IndexedValue> list3 = (List) pair2.getFirst();
                                    List list4 = (List) pair2.getSecond();
                                    if ((!list4.isEmpty()) && C0BTV.LIZ()) {
                                        Iterator it3 = list4.iterator();
                                        while (it3.hasNext()) {
                                            C0NE3.LIZ.add(((C590350NDl) ((IndexedValue) it3.next()).LIZIZ).LIZJ);
                                        }
                                    }
                                    list3.size();
                                    list2.size();
                                    List listLJLLLL = C13LP.LJLLLL(new AComparatorS363S0200000_9(this, c590710NEv, 1), list2);
                                    int i3 = 10;
                                    if (list3.isEmpty()) {
                                        List listLJLIL = C13LP.LJLIL(listLJLLLL, listSingletonList);
                                        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
                                        Iterator it4 = ((ArrayList) listLJLIL).iterator();
                                        while (it4.hasNext()) {
                                            arrayList7.add(((C590350NDl) ((IndexedValue) it4.next()).LIZIZ).LIZJ);
                                        }
                                        return new Pair<>(arrayList7, C13BV.INSTANCE);
                                    }
                                    ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                    for (IndexedValue indexedValue2 : list3) {
                                        int i4 = indexedValue2.LIZ;
                                        C590350NDl c590350NDl2 = (C590350NDl) indexedValue2.LIZIZ;
                                        List listLL = C13LP.LL(this.LIZLLL, 2);
                                        ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(listLL, i3));
                                        int i5 = 0;
                                        for (Object obj3 : listLL) {
                                            int i6 = i5 + 1;
                                            if (i5 >= 0) {
                                                C0NFD c0nfd = (C0NFD) obj3;
                                                C0NFB c0nfb = this.LIZJ;
                                                C0NF3 c0nf3 = new C0NF3(i4, c590350NDl2, c590710NEv.LIZIZ);
                                                Double d5 = (Double) C13LP.LJJJLZIJ(i5, this.LJFF);
                                                if (d5 != null) {
                                                    dDoubleValue2 = d5.doubleValue();
                                                } else {
                                                    dDoubleValue2 = 0.0d;
                                                }
                                                Double d6 = (Double) C13LP.LJJJLZIJ(i5, this.LJI);
                                                if (d6 != null) {
                                                    dDoubleValue3 = d6.doubleValue();
                                                } else {
                                                    dDoubleValue3 = 0.0d;
                                                }
                                                arrayList9.add(Double.valueOf(c0nfb.LJFF(c0nf3, c0nfd, dDoubleValue2, dDoubleValue3)));
                                                i5 = i6;
                                            } else {
                                                C1697810uHb.LJIJI();
                                                throw null;
                                            }
                                        }
                                        if (arrayList9.size() > 0) {
                                            objValueOf = ListProtector.get(arrayList9, 0);
                                            d4 = 0.0d;
                                        } else {
                                            d4 = 0.0d;
                                            objValueOf = Double.valueOf(0.0d);
                                        }
                                        if (1 < arrayList9.size()) {
                                            objValueOf2 = ListProtector.get(arrayList9, 1);
                                        } else {
                                            objValueOf2 = Double.valueOf(d4);
                                        }
                                        arrayList8.add(new C443120HZe(c590350NDl2, objValueOf, objValueOf2));
                                        i3 = 10;
                                    }
                                    List listLJLLLL2 = C13LP.LJLLLL(new AComparatorS28S0000000_9(32), arrayList8);
                                    ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(listLJLLLL2, i3));
                                    int i7 = 0;
                                    for (Object obj4 : listLJLLLL2) {
                                        int i8 = i7 + 1;
                                        if (i7 >= 0) {
                                            Object first = ((C443120HZe) obj4).getFirst();
                                            int size3 = list3.size();
                                            if (this.LJIIL < 0.0d) {
                                                i7 = size3 - i7;
                                            }
                                            arrayList10.add(new Pair(first, Integer.valueOf(i7)));
                                            i7 = i8;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList10);
                                    List listLJLLLL3 = C13LP.LJLLLL(new AComparatorS28S0000000_9(31), arrayList8);
                                    ArrayList arrayList11 = new ArrayList(C15438062q.LJIJJ(listLJLLLL3, 10));
                                    int i9 = 0;
                                    for (Object obj5 : listLJLLLL3) {
                                        int i10 = i9 + 1;
                                        if (i9 >= 0) {
                                            Object first2 = ((C443120HZe) obj5).getFirst();
                                            int size4 = list3.size();
                                            if (this.LJIILIIL < 0.0d) {
                                                i9 = size4 - i9;
                                            }
                                            arrayList11.add(new Pair(first2, Integer.valueOf(i9)));
                                            i9 = i10;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    Map mapLJIILLIIL2 = C2097608Jq.LJIILLIIL(arrayList11);
                                    ArrayList arrayList12 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                    Iterator it5 = list3.iterator();
                                    while (it5.hasNext()) {
                                        arrayList12.add(((C590350NDl) ((IndexedValue) it5.next()).LIZIZ).LIZJ);
                                    }
                                    arrayList12.toString();
                                    ArrayList arrayList13 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                    Iterator it6 = list3.iterator();
                                    while (it6.hasNext()) {
                                        arrayList13.add(mapLJIILLIIL.get(((IndexedValue) it6.next()).LIZIZ));
                                    }
                                    arrayList13.toString();
                                    ArrayList arrayList14 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                    Iterator it7 = list3.iterator();
                                    while (it7.hasNext()) {
                                        arrayList14.add(mapLJIILLIIL2.get(((IndexedValue) it7.next()).LIZIZ));
                                    }
                                    Set setKeySet = mapLJIILLIIL.keySet();
                                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setKeySet, 10));
                                    if (iLIZIZ < 16) {
                                        iLIZIZ = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                                    for (Object obj6 : setKeySet) {
                                        Integer num = (Integer) mapLJIILLIIL.get(obj6);
                                        if (num != null) {
                                            size = num.intValue();
                                        } else {
                                            size = mapLJIILLIIL.size();
                                        }
                                        Integer num2 = (Integer) mapLJIILLIIL2.get(obj6);
                                        if (num2 != null) {
                                            size2 = num2.intValue();
                                        } else {
                                            size2 = mapLJIILLIIL2.size();
                                        }
                                        linkedHashMap.put(obj6, Double.valueOf((this.LJIILJJIL * ((double) size)) + (this.LJIILL * ((double) size2))));
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    List listLJLLLL4 = C13LP.LJLLLL(new AComparatorS508S0100000_9(linkedHashMap, 4), list3);
                                    int i11 = 0;
                                    for (Object obj7 : listLJLLLL4) {
                                        int i12 = i11 + 1;
                                        if (i11 >= 0) {
                                            C590350NDl c590350NDl3 = (C590350NDl) ((IndexedValue) obj7).LIZIZ;
                                            linkedHashMap2.put(c590350NDl3, Integer.valueOf(i11));
                                            String str = c590350NDl3.LIZJ;
                                            Pair[] pairArr = new Pair[2];
                                            pairArr[0] = new Pair("weighted_rank", Integer.valueOf(i11));
                                            Object obj8 = linkedHashMap.get(c590350NDl3);
                                            if (obj8 == null) {
                                                obj8 = -1;
                                            }
                                            pairArr[1] = new Pair("weighted_score", obj8);
                                            LIZIZ(str, C2097608Jq.LJIIJ(pairArr), false);
                                            i11 = i12;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    ArrayList arrayList15 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                    Iterator it8 = list3.iterator();
                                    while (it8.hasNext()) {
                                        arrayList15.add(((C590350NDl) ((IndexedValue) it8.next()).LIZIZ).LIZJ);
                                    }
                                    arrayList15.toString();
                                    ArrayList arrayList16 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                    Iterator it9 = list3.iterator();
                                    while (it9.hasNext()) {
                                        arrayList16.add(linkedHashMap.get(((IndexedValue) it9.next()).LIZIZ));
                                    }
                                    arrayList16.toString();
                                    ArrayList arrayList17 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                    Iterator it10 = list3.iterator();
                                    while (it10.hasNext()) {
                                        arrayList17.add(linkedHashMap2.get(((IndexedValue) it10.next()).LIZIZ));
                                    }
                                    if (this.LJIIJ) {
                                        long jNanoTime = System.nanoTime();
                                        int size5 = mapLJIILLIIL.size();
                                        Set setKeySet2 = mapLJIILLIIL.keySet();
                                        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setKeySet2, 10));
                                        if (iLIZIZ2 < 16) {
                                            iLIZIZ2 = 16;
                                        }
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ2);
                                        for (Object obj9 : setKeySet2) {
                                            C13DA c13da = new C13DA(setKeySet2.size() - 1);
                                            for (Object obj10 : setKeySet2) {
                                                if (!Intrinsics.LJFF(obj9, obj10)) {
                                                    Integer num3 = (Integer) mapLJIILLIIL.get(obj9);
                                                    if (num3 != null) {
                                                        iIntValue9 = num3.intValue();
                                                    } else {
                                                        iIntValue9 = size5;
                                                    }
                                                    Integer num4 = (Integer) mapLJIILLIIL.get(obj10);
                                                    if (num4 != null) {
                                                        iIntValue10 = num4.intValue();
                                                    } else {
                                                        iIntValue10 = size5;
                                                    }
                                                    Integer num5 = (Integer) mapLJIILLIIL2.get(obj9);
                                                    if (num5 != null) {
                                                        iIntValue11 = num5.intValue();
                                                    } else {
                                                        iIntValue11 = size5;
                                                    }
                                                    Integer num6 = (Integer) mapLJIILLIIL2.get(obj10);
                                                    if (num6 != null) {
                                                        iIntValue12 = num6.intValue();
                                                    } else {
                                                        iIntValue12 = size5;
                                                    }
                                                    if (iIntValue9 < iIntValue10) {
                                                        d2 = this.LJIILJJIL;
                                                    } else {
                                                        d2 = -this.LJIILJJIL;
                                                    }
                                                    double d7 = d2 + 0.0d;
                                                    if (iIntValue11 < iIntValue12) {
                                                        d3 = this.LJIILL;
                                                    } else {
                                                        d3 = -this.LJIILL;
                                                    }
                                                    c13da.put(obj10, Double.valueOf(d7 + d3));
                                                }
                                            }
                                            linkedHashMap3.put(obj9, c13da.build());
                                        }
                                        int i13 = 0;
                                        int i14 = 0;
                                        while (i13 < this.LJIIJJI) {
                                            i13++;
                                            boolean z5 = false;
                                            int iMax = 0;
                                            while (iMax < listLJLLLL4.size() - 1) {
                                                Object obj11 = ((IndexedValue) ListProtector.get(listLJLLLL4, iMax)).LIZIZ;
                                                int i15 = iMax + 1;
                                                Object obj12 = ((IndexedValue) ListProtector.get(listLJLLLL4, i15)).LIZIZ;
                                                Map map = (Map) linkedHashMap3.get(obj11);
                                                if (map != null && (d = (Double) map.get(obj12)) != null && d.doubleValue() < -1.0E-6d) {
                                                    Collections.swap(listLJLLLL4, iMax, i15);
                                                    iMax = Math.max(iMax - 1, 0);
                                                    i14++;
                                                    z5 = true;
                                                } else {
                                                    iMax = i15;
                                                }
                                            }
                                            if (!z5) {
                                                break;
                                            }
                                        }
                                        long jNanoTime2 = System.nanoTime() - jNanoTime;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("In step 4&5, localSwap runTime ");
                                        sbLIZ.append(jNanoTime2 / 1000000.0d);
                                        sbLIZ.append(" ms, swapCnt: ");
                                        sbLIZ.append(i14);
                                        C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                    ArrayList arrayList18 = new ArrayList(C15438062q.LJIJJ(listLJLLLL4, 10));
                                    int i16 = 0;
                                    for (Object obj13 : listLJLLLL4) {
                                        int i17 = i16 + 1;
                                        if (i16 >= 0) {
                                            arrayList18.add(new Pair(((IndexedValue) obj13).LIZIZ, Integer.valueOf(i16)));
                                            i16 = i17;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    Map mapLJIILLIIL3 = C2097608Jq.LJIILLIIL(arrayList18);
                                    Iterator it11 = listLJLLLL4.iterator();
                                    while (it11.hasNext()) {
                                        C590350NDl c590350NDl4 = (C590350NDl) ((IndexedValue) it11.next()).LIZIZ;
                                        if (!z0.LJFF) {
                                            int size6 = mapLJIILLIIL.size();
                                            Integer num7 = (Integer) mapLJIILLIIL.get(c590350NDl4);
                                            if (num7 != null) {
                                                iIntValue4 = num7.intValue();
                                            } else {
                                                iIntValue4 = size6;
                                            }
                                            int i18 = 0;
                                            int i19 = 0;
                                            int i20 = 0;
                                            for (Map.Entry entry : mapLJIILLIIL.entrySet()) {
                                                Object key = entry.getKey();
                                                int iIntValue13 = ((Number) entry.getValue()).intValue();
                                                if (!Intrinsics.LJFF(c590350NDl4, key)) {
                                                    if (iIntValue4 < iIntValue13) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    Integer num8 = (Integer) mapLJIILLIIL2.get(c590350NDl4);
                                                    if (num8 != null) {
                                                        iIntValue5 = num8.intValue();
                                                    } else {
                                                        iIntValue5 = size6;
                                                    }
                                                    Integer num9 = (Integer) mapLJIILLIIL2.get(key);
                                                    if (num9 != null) {
                                                        iIntValue6 = num9.intValue();
                                                    } else {
                                                        iIntValue6 = size6;
                                                    }
                                                    if (iIntValue5 < iIntValue6) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    Double d8 = (Double) linkedHashMap.get(c590350NDl4);
                                                    double dDoubleValue4 = d8 != null ? d8.doubleValue() : size6;
                                                    Double d9 = (Double) linkedHashMap.get(key);
                                                    if (dDoubleValue4 < (d9 != null ? d9.doubleValue() : size6)) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    Integer num10 = (Integer) mapLJIILLIIL3.get(c590350NDl4);
                                                    if (num10 != null) {
                                                        iIntValue7 = num10.intValue();
                                                    } else {
                                                        iIntValue7 = size6;
                                                    }
                                                    Integer num11 = (Integer) mapLJIILLIIL3.get(key);
                                                    if (num11 != null) {
                                                        iIntValue8 = num11.intValue();
                                                    } else {
                                                        iIntValue8 = size6;
                                                    }
                                                    if (iIntValue7 < iIntValue8) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    if (z != z2) {
                                                        i18++;
                                                    }
                                                    if (z != z3) {
                                                        i19++;
                                                    }
                                                    if (z != z4) {
                                                        i20++;
                                                    }
                                                }
                                            }
                                            LIZIZ(c590350NDl4.LIZJ, C2097608Jq.LJIIJ(new Pair("cost_rank_rev", Integer.valueOf(i18)), new Pair("weighted_rank_rev", Integer.valueOf(i19)), new Pair("final_rank_rev", Integer.valueOf(i20))), false);
                                        }
                                    }
                                    List listLJLIL2 = C13LP.LJLIL(list4, C13LP.LJLIL(listLJLLLL, C13LP.LJLIL(listLJLLLL4, listSingletonList)));
                                    ArrayList arrayList19 = new ArrayList();
                                    ArrayList arrayList20 = new ArrayList();
                                    int i21 = 0;
                                    for (Object obj14 : (ArrayList) listLJLIL2) {
                                        int i22 = i21 + 1;
                                        if (i21 >= 0) {
                                            IndexedValue indexedValue3 = (IndexedValue) obj14;
                                            int i23 = indexedValue3.LIZ;
                                            C590350NDl c590350NDl5 = (C590350NDl) indexedValue3.LIZIZ;
                                            Pair[] pairArr2 = new Pair[7];
                                            pairArr2[0] = new Pair("origin_idx", Integer.valueOf(i23));
                                            pairArr2[1] = new Pair("sorted_idx", Integer.valueOf(i21));
                                            Integer num12 = c590350NDl5.LJIIIIZZ;
                                            if (num12 != null) {
                                                iIntValue = num12.intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                            pairArr2[2] = new Pair("list_idx", Integer.valueOf(iIntValue));
                                            Integer num13 = (Integer) mapLJIILLIIL.get(c590350NDl5);
                                            if (num13 != null) {
                                                iIntValue2 = num13.intValue();
                                            } else {
                                                iIntValue2 = -1;
                                            }
                                            pairArr2[3] = new Pair("sim_rank", Integer.valueOf(iIntValue2));
                                            Integer num14 = (Integer) mapLJIILLIIL2.get(c590350NDl5);
                                            if (num14 != null) {
                                                iIntValue3 = num14.intValue();
                                            } else {
                                                iIntValue3 = -1;
                                            }
                                            pairArr2[4] = new Pair("cost_rank", Integer.valueOf(iIntValue3));
                                            pairArr2[5] = new Pair("bitrate", Double.valueOf(c590350NDl5.LIZ()));
                                            pairArr2[6] = new Pair("duration", Double.valueOf(c590350NDl5.LIZIZ()));
                                            String strLIZIZ = LIZIZ(c590350NDl5.LIZJ, C2097608Jq.LJIIJ(pairArr2), true);
                                            Double d10 = (Double) linkedHashMap.get(c590350NDl5);
                                            if (d10 != null) {
                                                dDoubleValue = d10.doubleValue();
                                            } else {
                                                dDoubleValue = 0.0d;
                                            }
                                            String strValueOf = String.valueOf(dDoubleValue);
                                            arrayList19.add(c590350NDl5.LIZJ);
                                            arrayList20.add(new C0NGD(c590350NDl5.LIZJ, strValueOf, strLIZIZ));
                                            i21 = i22;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    return new Pair<>(arrayList19, arrayList20);
                                }
                            };
                        }
                    } else {
                        c0nf1 = new C0NF1(playerCacheSortSetting);
                    }
                } else {
                    c0nf1 = new AbstractC590750NEz(playerCacheSortSetting) { // from class: X.0NEx
                        @Override // X.AbstractC590750NEz
                        public final double LIZJ(int i3, C590350NDl c590350NDl, List<HistoryVideoInfoStruct> list) {
                            return c590350NDl.LIZ();
                        }
                    };
                }
            } else {
                c0nf1 = new AbstractC590750NEz(playerCacheSortSetting) { // from class: X.0NF0
                    @Override // X.AbstractC590750NEz
                    public final double LIZJ(int i3, C590350NDl c590350NDl, List<HistoryVideoInfoStruct> list) {
                        if (!z0.LJFF) {
                            C0NF3 c0nf3 = new C0NF3(i3, c590350NDl, list);
                            this.LIZJ.LJIIIZ(c0nf3);
                            this.LIZJ.LJIIJ(c0nf3);
                            this.LIZJ.LJ(c0nf3);
                            this.LIZJ.LJII(c0nf3);
                            LIZIZ(c590350NDl.LIZJ, this.LIZJ.LJI, false);
                        }
                        return AbstractC19994813Le.Default.nextDouble();
                    }
                };
            }
            C590710NEv c590710NEv = this.LLILLJJLI;
            if (c590710NEv != null && (arrayList2 = c590710NEv.LIZIZ) != null && arrayList2.isEmpty()) {
                this.LLILLJJLI.LIZIZ.addAll(z0.LIZJ);
            }
            if (c0nf1 != null) {
                c0nf1.LIZLLL(this.LLILLJJLI, this.LLILLL);
            } else {
                Function1<C0HAW, Unit> function1 = this.LLILLL;
                C13BV c13bv = C13BV.INSTANCE;
                function1.invoke(new C0HAW(false, c13bv, c13bv));
            }
            C590710NEv c590710NEv2 = this.LLILLJJLI;
            if (c590710NEv2 != null && (arrayList = c590710NEv2.LIZ) != null) {
                Iterator<C590350NDl> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().LIZJ;
                    if (c0nf1 != null && str != null && !a0.LJJJIL(str) && (nVar = c0nf1.LIZIZ.get(str)) != null) {
                        nVar.toString();
                    }
                }
            }
            return Unit.LIZ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    @C09DV(c = "ColdCachePoolSortWrapper$sortColdCacheDB$1", f = "ColdCachePoolSortWrapper.kt", l = {123}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int LL;
        public final /* synthetic */ String LLILLJJLI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.LLILLJJLI = str;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new b(this.LLILLJJLI, interfaceC1364105Vn);
        }

        /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.ArrayList] */
        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            List list;
            Object objLJFF = C099R.LJFF();
            int i = this.LL;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                if (TextUtils.equals("onCacheVideoAllFinished", this.LLILLJJLI)) {
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                        return objLJFF;
                    }
                }
            }
            if (C294330BgF.LIZ()) {
                if (((Boolean) C2268981DrU.LJIJJ.getValue()).booleanValue()) {
                    C590480NDy.LIZ.getClass();
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C590480NDy.LJII(), new String[]{","}, 0, 6);
                    arrayList = new ArrayList();
                    for (Object obj2 : listLJJLIIIJILLIZJL) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    C590480NDy.LIZ.getClass();
                    List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(C590480NDy.LJ(), new String[]{","}, 0, 6);
                    arrayList = new ArrayList();
                    for (Object obj3 : listLJJLIIIJILLIZJL2) {
                        if (((String) obj3).length() > 0) {
                            arrayList.add(obj3);
                        }
                    }
                }
            } else {
                C590420NDs.LIZ.getClass();
                List listLJJLIIIJILLIZJL3 = a0.LJJLIIIJILLIZJL(C590420NDs.LJIILIIL(), new String[]{","}, 0, 6);
                arrayList = new ArrayList();
                for (Object obj4 : listLJJLIIIJILLIZJL3) {
                    if (((String) obj4).length() > 0) {
                        arrayList.add(obj4);
                    }
                }
            }
            if (arrayList.size() <= ((Number) C2268981DrU.LJIJJLI.getValue()).intValue()) {
                C0NE5 c0ne5 = C0NE5.LIZ;
                C0NE4 c0ne4 = C0NE4.GOLDEN_CACHE;
                c0ne5.getClass();
                C0NE5.LIZ(c0ne4);
                return Unit.LIZ;
            }
            CopyOnWriteArrayList<HistoryVideoInfoStruct> copyOnWriteArrayList = z0.LIZJ;
            if (copyOnWriteArrayList.size() < z0.LIZLLL) {
                z0.LIZ.LIZ();
            }
            System.currentTimeMillis();
            ArrayList arrayList2 = new ArrayList(copyOnWriteArrayList);
            C0NDV.LIZ.getClass();
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new ArrayList();
            if (!C0NDV.LJIIJ()) {
                list = (List) c259800zU.element;
            } else {
                C0NDV.LJIILIIL(new AwS92S0210000_9(arrayList, c259800zU, 3));
                list = (List) c259800zU.element;
            }
            z0.LIZ.LJ(C0NE4.COLD_CACHE_DB, new C590710NEv((ArrayList) list, arrayList2), AFwS240S0000000_9.get$arr$(977));
            IFeedCacheLoaderService iFeedCacheLoaderService = (IFeedCacheLoaderService) PluggableExtentionKt.pluggableSpi$default(IFeedCacheLoaderService.class, false, false, false, 14, null);
            if (iFeedCacheLoaderService != null) {
                iFeedCacheLoaderService.LIZJ();
            }
            return Unit.LIZ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    public final synchronized void LJFF(String str) {
        if (!LJII) {
            LJII = true;
            C23250099c.LIZLLL(LIZIZ, null, null, new b(str, null), 3);
        }
    }

    public static boolean LIZJ(int i, Aweme aweme) {
        if ((!LJII || LIZJ.size() < LIZLLL) && i > 0 && aweme.getAid() != null && !AwemeSaaSExtKt.isLive(aweme) && !aweme.isAd()) {
            CopyOnWriteArrayList<HistoryVideoInfoStruct> copyOnWriteArrayList = LIZJ;
            if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                Iterator<HistoryVideoInfoStruct> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().awemeId, aweme.getAid())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static List LIZLLL(String str, String str2) {
        ?? arrayList;
        List listLJJLIIIJILLIZJL;
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listLJJLIIIJILLIZJL2) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!arrayList2.contains(obj3)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList2) {
            if (arrayList.contains(obj4)) {
                arrayList4.add(obj4);
            }
        }
        return C13LP.LJLIL(arrayList4, arrayList3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(int r3, long r4, com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            X.01GW r0 = X.C590610NEl.LJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L46
            java.lang.String r0 = r6.getAid()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L46
            java.lang.String r1 = X.C590440NDu.LIZ
            java.lang.String r0 = r6.getAid()
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r2)
            if (r0 != 0) goto L59
            X.0NDs r0 = X.C590420NDs.LIZ
            r0.getClass()
            java.lang.String r1 = X.C590420NDs.LJIILIIL()
            java.lang.String r0 = r6.getAid()
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r2)
            if (r0 != 0) goto L59
            java.lang.String r1 = X.C590420NDs.LJIILJJIL()
            java.lang.String r0 = r6.getAid()
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r2)
            if (r0 != 0) goto L59
        L46:
            X.0NDy r0 = X.C590480NDy.LIZ
            r0.getClass()
            java.lang.String r1 = X.C590480NDy.LJII()
            java.lang.String r0 = r6.getAid()
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r2)
            if (r0 == 0) goto L61
        L59:
            b1 r0 = new b1
            r0.<init>(r3, r4, r6)
            X.C593360NPa.LIZIZ(r0)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z0.LJI(int, long, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final synchronized void LJ(C0NE4 c0ne4, C590710NEv c590710NEv, Function1<? super C0HAW, Unit> function1) {
        C23250099c.LIZLLL(LIZIZ, null, null, new a(c0ne4, c590710NEv, function1, null), 3);
    }
}
