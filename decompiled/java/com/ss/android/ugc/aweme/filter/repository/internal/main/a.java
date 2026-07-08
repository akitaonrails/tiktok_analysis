package com.ss.android.ugc.aweme.filter.repository.internal.main;

import X.C01GW;
import X.C09HM;
import X.C09HN;
import X.C09JN;
import X.C0LJ7;
import X.C11NJ;
import X.C11NZ;
import X.C11O8;
import X.C11ON;
import X.C11PQ;
import X.C11PR;
import X.C11RK;
import X.C11S5;
import X.C11SY;
import X.C11T2;
import X.C11T6;
import X.C11T7;
import X.C11T9;
import X.C13LP;
import X.C15438062q;
import X.C1638380sjk;
import X.C1638420sjo;
import X.C1638440sjq;
import X.C1638720skI;
import X.C1639330slH;
import X.C1639340slI;
import X.C1639350slJ;
import X.C1639380slM;
import X.C1639400slO;
import X.C1639410slP;
import X.C1639620slk;
import X.C1639650sln;
import X.C1639670slp;
import X.C1698240uII;
import X.C1701940uOG;
import X.C19475711Hn;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2219091BtD;
import X.C452501pT;
import X.EnumC1641340soW;
import X.EnumC1641430sof;
import X.InterfaceC1456340o08;
import X.InterfaceC1463990oCT;
import X.InterfaceC1487280oo2;
import X.InterfaceC1634080sco;
import X.InterfaceC1639300slE;
import X.InterfaceC1639310slF;
import X.InterfaceC1639320slG;
import X.InterfaceC1639370slL;
import X.InterfaceC1639390slN;
import X.InterfaceC1639450slT;
import X.InterfaceC1639870sm9;
import X.InterfaceC1640320sms;
import X.InterfaceC19505211Sw;
import Y.ARunnableS125S0100000_25;
import Y.AfS13S0111000_25;
import Y.AfS194S0100000_25;
import Y.AfS69S0201000_25;
import Y.AkS10S0010000_25;
import Y.AkS486S0100000_25;
import c75.d;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS347S0000000_25;
import kotlin.jvm.internal.AwS20S0111000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class a extends C11SY implements InterfaceC1639870sm9 {
    public final InterfaceC1639450slT LIZJ;
    public final InterfaceC1639320slG LIZLLL;
    public final InterfaceC1639300slE LJ;
    public final InterfaceC1634080sco LJFF;
    public final InterfaceC1639310slF LJI;
    public final InterfaceC1639370slL LJII;
    public final boolean LJIIIIZZ;
    public final InterfaceC1639390slN LJIIIZ;
    public final InterfaceC1456340o08<String> LJIIJ;
    public final d<C1638380sjk> LJIIJJI;
    public final C11PQ<C1638440sjq> LJIIL;
    public final C1639410slP<String, C1639650sln> LJIILIIL;
    public final C11PQ<Map<String, C1639650sln>> LJIILJJIL;
    public final C11RK<C1639380slM> LJIILL;
    public final AtomicReference<Pair<C11NZ<C1638380sjk>, C11PR<C1638380sjk>>> LJIILLIIL;
    public final C01GW LJIIZILJ;
    public volatile Map<String, ? extends FilterBean> LJIJ;
    public C11NJ LJIJI;

    @Override // X.InterfaceC1639870sm9
    public final List<FilterBean> LJIIIZ() {
        return C13LP.LLIIII(this.LJIJ.values());
    }

    @Override // X.InterfaceC1639870sm9
    public final void LJIILIIL() {
        C11NJ c11nj = this.LJIJI;
        c11nj.dispose();
        c11nj.LJ();
        this.LJIJI = new C11NJ();
        this.LJ.invalidate();
        this.LIZLLL.cancelAllDownload();
        C2219091BtD.LIZLLL().d("viki filter, DefaultFilterRepository.invalidateDataCache");
        this.LJIIJJI.LJI();
        this.LJIIL.onNext(C1638720skI.LIZ);
        C1701940uOG.LIZIZ().LIZIZ(new ARunnableS125S0100000_25(this, 11));
    }

    @Override // X.InterfaceC1639870sm9
    public final void LJIJ() {
        if (this.LJIJ.isEmpty()) {
            return;
        }
        synchronized (this) {
            try {
                this.LJIJ = C2097608Jq.LJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1639870sm9
    public final void LJIJJ() {
        this.LIZLLL.cancelAllDownload();
    }

    @Override // X.InterfaceC1639870sm9
    public final InterfaceC1640320sms LJJI() {
        return (InterfaceC1640320sms) this.LJIIZILJ.getValue();
    }

    @Override // X.InterfaceC1639870sm9
    public final C19475711Hn LJJIFFI() {
        C11RK<C1639380slM> c11rk = this.LJIILL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final C19475711Hn LJJJI() {
        C11PQ<C1638440sjq> c11pq = this.LJIIL;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    public final C19475711Hn LJJJIL() {
        C11PQ<Map<String, C1639650sln>> c11pq = this.LJIILJJIL;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC1639870sm9
    public final InterfaceC1639450slT LJIIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1639870sm9
    public final C11ON LIZIZ(boolean z) {
        return LJJIL(-1, z, true);
    }

    @Override // X.InterfaceC1639870sm9
    public final C1639670slp LIZLLL(String str) {
        C1638440sjq c1638440sjq;
        List<C1639670slp> list;
        C1638380sjk c1638380sjkLIZ = this.LJIIJJI.LIZ(Unit.LIZ);
        C1639670slp c1639670slp = null;
        if (c1638380sjkLIZ == null || (c1638440sjq = c1638380sjkLIZ.LIZ) == null || (list = c1638440sjq.LIZ) == null) {
            return null;
        }
        Iterator<C1639670slp> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1639670slp next = it2.next();
            if (Intrinsics.LJFF(next.LIZ, str)) {
                c1639670slp = next;
                break;
            }
        }
        return c1639670slp;
    }

    @Override // X.InterfaceC1639870sm9
    public final C11NZ<C1639650sln> LJFF(FilterBean filterBean) {
        return LJJIJL(new C1639670slp(filterBean.getId(), filterBean.getResId(), filterBean.getName(), filterBean.getCategoryKey(), filterBean.getEnName(), filterBean.getResource(), filterBean.getTags(), filterBean.getTagUpdateAt(), filterBean.getThumbnailFileUri(), filterBean.getExtra()), true);
    }

    @Override // X.InterfaceC1639870sm9
    public final EnumC1641340soW LJIIJJI(String str) {
        EnumC1641340soW enumC1641340soW;
        C1639650sln c1639650slnLIZ = this.LJIILIIL.LIZ(str);
        if (c1639650slnLIZ == null || (enumC1641340soW = c1639650slnLIZ.LIZIZ) == null) {
            return EnumC1641340soW.FILTER_STATE_UNKNOWN;
        }
        return enumC1641340soW;
    }

    @Override // X.InterfaceC1639870sm9
    public final void LJIIZILJ(FilterBean filterBean) {
        String id = filterBean.getId();
        if (id != null && id.length() != 0) {
            synchronized (this) {
                try {
                    this.LJIJ = C2097608Jq.LJIILIIL(this.LJIJ, new Pair(id, filterBean));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC1639870sm9
    public final C11NZ<C1639650sln> LJIL(C1639670slp c1639670slp) {
        return LJJIJL(c1639670slp, false);
    }

    @Override // X.InterfaceC1639870sm9
    public final void LJJIII(C1639670slp c1639670slp) {
        C1638440sjq c1638440sjq;
        List<C1639670slp> list;
        C2219091BtD.LIZLLL().d("viki filter, DefaultFilterRepository.removeFilterData");
        C1638380sjk c1638380sjkLIZ = this.LJIIJJI.LIZ(Unit.LIZ);
        if (c1638380sjkLIZ != null && (c1638440sjq = c1638380sjkLIZ.LIZ) != null && (list = c1638440sjq.LIZ) != null) {
            for (C1639670slp c1639670slp2 : list) {
                if (Intrinsics.LJFF(c1639670slp, c1639670slp2)) {
                    if (c1639670slp2 != null) {
                        List<C1639670slp> list2 = c1638380sjkLIZ.LIZ.LIZ;
                        ArrayList arrayList = new ArrayList();
                        for (C1639670slp c1639670slp3 : list2) {
                            if (!Intrinsics.LJFF(c1639670slp3.LIZ, c1639670slp.LIZ)) {
                                arrayList.add(c1639670slp3);
                            }
                        }
                        List<Pair<EffectCategoryResponse, List<C1639670slp>>> list3 = c1638380sjkLIZ.LIZ.LIZIZ;
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                        for (Pair<EffectCategoryResponse, List<C1639670slp>> pair : list3) {
                            EffectCategoryResponse first = pair.getFirst();
                            List<C1639670slp> second = pair.getSecond();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : second) {
                                if (!Intrinsics.LJFF(((C1639670slp) obj).LIZ, c1639670slp.LIZ)) {
                                    arrayList3.add(obj);
                                }
                            }
                            arrayList2.add(new Pair(first, arrayList3));
                        }
                        C1638380sjk c1638380sjk = new C1638380sjk(new C1638440sjq(arrayList, arrayList2, null), c1638380sjkLIZ.LIZIZ);
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                        StringBuilder sb = new StringBuilder("viki filter, DefaultFilterRepository.removeFilterData -> filterTable=");
                        List<Pair<EffectCategoryResponse, List<C1639670slp>>> list4 = c1638380sjk.LIZ.LIZIZ;
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                        Iterator<Pair<EffectCategoryResponse, List<C1639670slp>>> it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(it2.next().getFirst().getName());
                        }
                        sb.append(arrayList4);
                        sb.append(", filter.size=");
                        sb.append(c1638380sjk.LIZ.LIZ.size());
                        sb.append('\"');
                        interfaceC1463990oCTLIZLLL.d(sb.toString());
                        d<C1638380sjk> dVar = this.LJIIJJI;
                        dVar.getClass();
                        dVar.put(Unit.LIZ, c1638380sjk);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1639870sm9
    public final void LJJIIJZLJL(List<C1639650sln> list) {
        ArrayList arrayList = new ArrayList();
        for (C1639650sln c1639650sln : list) {
            C1639650sln c1639650slnLIZ = this.LJIILIIL.LIZ(c1639650sln.LIZ);
            if (c1639650slnLIZ == null) {
                c1639650slnLIZ = new C1639650sln(c1639650sln.LIZ, EnumC1641340soW.FILTER_STATE_UNKNOWN, "", "");
            }
            if (!Intrinsics.LJFF(c1639650slnLIZ, c1639650sln)) {
                this.LJIILIIL.put(c1639650sln.LIZ, c1639650sln);
                arrayList.add(new C1639380slM(c1639650sln));
            }
        }
        if (!arrayList.isEmpty()) {
            C11PQ<Map<String, C1639650sln>> c11pq = this.LJIILJJIL;
            List<Pair<String, C1639650sln>> listLJ = this.LJIILIIL.LJ();
            ArrayList<Pair> arrayList2 = new ArrayList();
            for (Object obj : (ArrayList) listLJ) {
                if (((Pair) obj).getSecond() != null) {
                    arrayList2.add(obj);
                }
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Pair pair : arrayList2) {
                Pair pair2 = new Pair(pair.getFirst(), pair.getSecond());
                linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
            }
            c11pq.onNext(linkedHashMap);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.LJIILL.onNext((C1639380slM) it2.next());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1638380sjk LJJIJIL(X.C1638380sjk r13) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.repository.internal.main.a.LJJIJIL(X.0sjk):X.0sjk");
    }

    public final void LJJIJLIJ(List list) {
        EnumC1641340soW enumC1641340soW;
        boolean zLJI = MethodIDManager.LJI(138016);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C1639650sln c1639650slnLIZ = this.LJIILIIL.LIZ(((C1639670slp) obj).LIZ);
            if (c1639650slnLIZ == null || (enumC1641340soW = c1639650slnLIZ.LIZIZ) == null) {
                enumC1641340soW = EnumC1641340soW.FILTER_STATE_UNKNOWN;
            }
            if (enumC1641340soW != EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.LIZLLL.LIZ((C1639670slp) it2.next());
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final C1639650sln LJJJ(C1639340slI c1639340slI) {
        EnumC1641430sof enumC1641430sof = c1639340slI.LIZ;
        if (enumC1641430sof != EnumC1641430sof.PENDING && enumC1641430sof != EnumC1641430sof.START) {
            if (enumC1641430sof == EnumC1641430sof.SUCCESS) {
                C1639400slO c1639400slOLJII = c1639340slI.LIZJ;
                if (c1639400slOLJII == null) {
                    if (this.LJ.LIZ(c1639340slI.LIZIZ)) {
                        c1639400slOLJII = this.LJ.LIZIZ(c1639340slI.LIZIZ.LIZ);
                    } else {
                        c1639400slOLJII = this.LIZJ.LJII(c1639340slI.LIZIZ.LIZ);
                    }
                }
                return new C1639650sln(c1639340slI.LIZIZ.LIZ, EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS, c1639400slOLJII.LIZ, c1639400slOLJII.LIZIZ);
            }
            if (enumC1641430sof == EnumC1641430sof.FAILED) {
                return new C1639650sln(c1639340slI.LIZIZ.LIZ, EnumC1641340soW.FILTER_STATE_DOWNLOAD_FAILED, "", "");
            }
            return new C1639650sln(c1639340slI.LIZIZ.LIZ, EnumC1641340soW.FILTER_STATE_UNKNOWN, "", "");
        }
        return new C1639650sln(c1639340slI.LIZIZ.LIZ, EnumC1641340soW.FILTER_STATE_DOWNLOADING, "", "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0204  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<kotlin.Pair<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.util.List<X.0slp>>>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList, java.util.List] */
    @Override // X.InterfaceC1639870sm9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11NZ<X.C1639650sln> LJI(X.C1639670slp r18, java.util.List<? extends kotlin.Pair<? extends com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<X.C1639670slp>>> r19) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.repository.internal.main.a.LJI(X.0slp, java.util.List):X.11NZ");
    }

    @Override // X.InterfaceC1639870sm9
    public final FilterBean LJIILL(String str, String str2) {
        FilterBean filterBean;
        Map<String, ? extends FilterBean> map = this.LJIJ;
        Object obj = null;
        if (map.isEmpty()) {
            return null;
        }
        if (str != null && str.length() != 0 && (filterBean = map.get(str)) != null) {
            return filterBean;
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        Iterator<T> it2 = map.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((FilterBean) next).getResId(), str2)) {
                obj = next;
                break;
            }
        }
        return (FilterBean) obj;
    }

    @Override // X.InterfaceC1639870sm9
    public final C1639670slp LJIILLIIL(String str, String str2) {
        C1638440sjq c1638440sjq;
        List<C1639670slp> list;
        C1638380sjk c1638380sjkLIZ = this.LJIIJJI.LIZ(Unit.LIZ);
        C1639670slp c1639670slp = null;
        if (c1638380sjkLIZ == null || (c1638440sjq = c1638380sjkLIZ.LIZ) == null || (list = c1638440sjq.LIZ) == null) {
            return null;
        }
        Iterator<C1639670slp> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1639670slp next = it2.next();
            C1639670slp c1639670slp2 = next;
            if (Intrinsics.LJFF(c1639670slp2.LIZ, str) && Intrinsics.LJFF(c1639670slp2.LIZLLL, str2)) {
                c1639670slp = next;
                break;
            }
        }
        return c1639670slp;
    }

    @Override // X.InterfaceC1639870sm9
    public final void LJIJI(int i, boolean z) {
        LJJIL(i, z, false);
    }

    public final C11NZ<C1639650sln> LJJIJL(C1639670slp c1639670slp, boolean z) {
        EnumC1641340soW enumC1641340soW;
        C11PQ c11pqLIZ;
        C11NZ<C1639650sln> c11nzLJJJJZI;
        boolean zLJI = MethodIDManager.LJI(138016);
        C1639650sln c1639650slnLIZ = this.LJIILIIL.LIZ(c1639670slp.LIZ);
        if (c1639650slnLIZ != null) {
            enumC1641340soW = c1639650slnLIZ.LIZIZ;
        } else {
            enumC1641340soW = null;
        }
        if (enumC1641340soW == EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS) {
            c11nzLJJJJZI = C11NZ.LJJJJZ(c1639650slnLIZ);
        } else {
            if (z) {
                c11pqLIZ = this.LIZLLL.LIZIZ(c1639670slp);
            } else {
                c11pqLIZ = this.LIZLLL.LIZ(c1639670slp);
            }
            c11nzLJJJJZI = c11pqLIZ.LJJJJZI(new AkS486S0100000_25(this, 0));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c11nzLJJJJZI;
    }

    public final void LJJIZ(int i, List list) {
        this.LJIJI.LIZ(this.LJI.request(list).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS69S0201000_25(this, list, i, 0), C09HN.LIZ));
    }

    @Override // X.InterfaceC1639870sm9
    public final C11NZ LJ(final long j, final String str, final String str2) {
        return LJJIL(0, false, false).LJJJ(new InterfaceC1487280oo2() { // from class: X.0slC
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C1639670slp next;
                List<C1639670slp> list = ((C1638440sjq) obj).LIZ;
                String str3 = str;
                String str4 = str2;
                Iterator<C1639670slp> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C1639670slp c1639670slp = next;
                        if (Intrinsics.LJFF(c1639670slp.LIZ, str3) || Intrinsics.LJFF(c1639670slp.LIZIZ, str4)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1639670slp c1639670slp2 = next;
                if (c1639670slp2 == null) {
                    return C11IR.LL;
                }
                return this.LL.LJJIJL(c1639670slp2, false).LJJLIIIJJIZ(j);
            }
        }, false);
    }

    public final C11ON LJJIL(int i, boolean z, boolean z2) {
        C11NZ c11nzRequest;
        C11NZ c19475711Hn;
        C11PR<C1638380sjk> second;
        if (z) {
            Keva.getRepo("keva_ep_download_repo").storeLong("keva_key_ep_panel_filtercomposer", 0L);
            c11nzRequest = this.LJFF.request().LJJIJIIJIL(new AfS13S0111000_25(z2, this, i, 0));
        } else {
            if (z2) {
                C2219091BtD.LIZLLL().d("viki filter, DefaultFilterRepository#fetchDataWithReturn -> filterDataFetcher.withCache");
            }
            InterfaceC1634080sco interfaceC1634080sco = this.LJFF;
            d<C1638380sjk> dVar = this.LJIIJJI;
            AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 615);
            InterfaceC19505211Sw interfaceC19505211SwLIZ = C11T2.LIZ(dVar);
            C11T9 c11t9 = new C11T9();
            awS604S0100000_25.invoke(c11t9);
            c11nzRequest = new C11T7(new AwS20S0111000_25(z2, this, i, 3), new C11T6(interfaceC1634080sco, interfaceC19505211SwLIZ, c11t9)).request(Unit.LIZ);
        }
        C11PQ c11pq = new C11PQ();
        if (z) {
            if (z2) {
                C2219091BtD.LIZLLL().d("viki filter, forceRefresh");
            }
            c11nzRequest.LJL(C11S5.LIZ()).LIZIZ(c11pq);
            c19475711Hn = new C19475711Hn(c11pq);
        } else {
            AtomicReference<Pair<C11NZ<C1638380sjk>, C11PR<C1638380sjk>>> atomicReference = this.LJIILLIIL;
            Pair<C11NZ<C1638380sjk>, C11PR<C1638380sjk>> pair = new Pair<>(c11nzRequest, c11pq);
            while (true) {
                if (atomicReference.compareAndSet(null, pair)) {
                    if (z2) {
                        C2219091BtD.LIZLLL().d("viki filter, ongoingFetch.compareAndSet");
                    }
                    c11nzRequest.LJL(C11S5.LIZ()).LJJIJIIJI(new AfS194S0100000_25(this, 133)).LJJIIJZLJL(new C1698240uII(this, 0)).LIZIZ(c11pq);
                    c19475711Hn = new C19475711Hn(c11pq);
                } else if (atomicReference.get() != null) {
                    if (z2) {
                        C2219091BtD.LIZLLL().d("viki filter, else");
                    }
                    Pair<C11NZ<C1638380sjk>, C11PR<C1638380sjk>> pair2 = this.LJIILLIIL.get();
                    if (pair2 != null && (second = pair2.getSecond()) != null) {
                        c19475711Hn = new C19475711Hn(second);
                    } else {
                        c19475711Hn = C11NZ.LJJJJZ(new C1638380sjk(C1638720skI.LIZ, true));
                    }
                }
            }
        }
        return c19475711Hn.LJJIJIIJIL(new C09JN() { // from class: X.0sjj
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DefaultFilterRepository@352a.fetchDataWithReturn$1");
                C1638380sjk c1638380sjk = (C1638380sjk) obj;
                if (c1638380sjk.LIZIZ && c1638380sjk.LIZ.LIZ.isEmpty()) {
                    throw new RuntimeException("Failed to fetch filter data.");
                }
                C1C7U.LIZIZ("DefaultFilterRepository@352a.fetchDataWithReturn$1");
            }
        }).LJJJJZI(new AkS10S0010000_25(z2, 0));
    }

    public a(InterfaceC1639450slT interfaceC1639450slT, C1639350slJ c1639350slJ, InterfaceC1639300slE interfaceC1639300slE, C1638420sjo c1638420sjo, C1639330slH c1639330slH, C1639620slk c1639620slk, boolean z, InterfaceC1639390slN interfaceC1639390slN, InterfaceC1456340o08 interfaceC1456340o08) {
        this.LIZJ = interfaceC1639450slT;
        this.LIZLLL = c1639350slJ;
        this.LJ = interfaceC1639300slE;
        this.LJFF = c1638420sjo;
        this.LJI = c1639330slH;
        this.LJII = c1639620slk;
        this.LJIIIIZZ = z;
        this.LJIIIZ = interfaceC1639390slN;
        this.LJIIJ = interfaceC1456340o08;
        d<C1638380sjk> dVar = new d<>();
        this.LJIIJJI = dVar;
        this.LJIIL = new C11PQ<>();
        this.LJIILIIL = new C1639410slP<>();
        this.LJIILJJIL = new C11PQ<>();
        this.LJIILL = new C11RK<>();
        this.LJIILLIIL = new AtomicReference<>(null);
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 834));
        this.LJIJ = C2097608Jq.LJ();
        this.LJIJI = new C11NJ();
        LJJIJIIJIL(C11T2.LIZIZ(c1638420sjo), C11T2.LIZ(dVar), C0LJ7.LIZ(AFwS347S0000000_25.get$arr$(12)));
        C2219091BtD.LIZLLL().d("viki filter, DefaultFilterRepository.connectFilterDataSources");
        C11O8 c11o8LIZLLL = C11T2.LIZ(dVar).LIZLLL(true, new InterfaceC19505211Sw[0]);
        AfS194S0100000_25 afS194S0100000_25 = new AfS194S0100000_25(this, 131);
        C09HM c09hm = C09HN.LIZ;
        c11o8LIZLLL.LJJLL(afS194S0100000_25, c09hm);
        c1639350slJ.LJ().LJL(C11S5.LIZ()).LJJJJZI(new AkS486S0100000_25(this, 19)).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS194S0100000_25(this, 129), c09hm);
    }
}
