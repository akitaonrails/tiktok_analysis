package com.ss.android.ugc.aweme.shortvideo.filter;

import X.C01GW;
import X.C0C64;
import X.C0CHQ;
import X.C0CIT;
import X.C0F1U;
import X.C13LE;
import X.C13LQ;
import X.C1429350nIb;
import X.C1432990nOT;
import X.C1444630nhF;
import X.C1444640nhG;
import X.C1453230nv7;
import X.C1456550o0T;
import X.C1622090sJT;
import X.C1642320sq6;
import X.C1643870ssb;
import X.C1643900sse;
import X.C1643920ssg;
import X.C1643930ssh;
import X.C1644970suN;
import X.C1645020suS;
import X.C1645050suV;
import X.C1645070suX;
import X.C1645090suZ;
import X.C1645130sud;
import X.C1645150suf;
import X.C1645380sv2;
import X.C1664770tQJ;
import X.C1701940uOG;
import X.C19487811Me;
import X.C1DRG;
import X.C20186013yc;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C385670FAf;
import X.C452501pT;
import X.InterfaceC1456340o08;
import X.InterfaceC1635390sev;
import X.InterfaceC1639870sm9;
import X.InterfaceC1645100sua;
import X.InterfaceC1645180sui;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650230t2r;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import Y.AfS159S0200000_25;
import b7k.b;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS174S1100000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ln3.a;
import mn3.e0;

/* JADX INFO: loaded from: classes26.dex */
public class k extends C1644970suN<InterfaceC1645180sui> implements InterfaceC1645180sui, C0F1U {
    public static final C1645150suf LLLFF;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public static final int LLLFZ;
    public static int LLLI;
    public final C01GW LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final C01GW LLJZIJLIL;
    public FilterBean LLL;
    public InterfaceC420801kM LLLF;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0suf] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(k.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFF = new Object() { // from class: X.0suf
        };
        LLLFZ = 8;
    }

    private final C1643900sse N5() {
        return (C1643900sse) this.LLJZIJLIL.getValue();
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJLLL.getValue();
    }

    public final C1645380sv2 R5() {
        return (C1645380sv2) this.LLJZ.getValue(this, LLLFFI[0]);
    }

    private final a M5() {
        return C1622090sJT.LIZ(R5()) ? (a) findReadyComponent(this, a.class) : (a) getDiContainer().LJIIL(null, a.class);
    }

    private final boolean m6() {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tools_avoid_normal_filter_rendering", true);
        return iLJIJ == 2 || (iLJIJ == 1 && LLLI == 1);
    }

    @Override // X.C1644970suN
    public void o4() {
        FilterBean first;
        super.o4();
        Pair<? extends FilterBean, C1643870ssb> pair = this.LLJJIJI;
        if (pair == null || (first = pair.getFirst()) == null) {
            return;
        }
        J6(first);
    }

    @Override // X.C1644970suN, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C1643900sse c1643900sseN5 = N5();
        if (c1643900sseN5 != null) {
            AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 276);
            AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 153);
            final String str = C0CHQ.LIZ().LJJIL().LIZJ().get();
            if (a0.LJJIIZI(str, "composer", false)) {
                str = c1643900sseN5.LIZLLL.get(str);
            }
            if (str != null) {
                Keva keva = c1643900sseN5.LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Filter_Data_2_Has_Migrated_");
                sbLIZ.append(str);
                if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                    return;
                }
                C0CHQ.LIZ().getRegionService();
                final C1444640nhG c1444630nhF = C20186013yc.LIZIZ().booleanValue() ^ true ? new C1444630nhF() : new C1444640nhG();
                InterfaceC1645100sua interfaceC1645100sua = new InterfaceC1645100sua(c1444630nhF) { // from class: X.0suR
                    public final InterfaceC1645170suh LIZ;

                    @Override // X.InterfaceC1645100sua
                    public final boolean LIZJ() {
                        return C0CHQ.LIZ().LJJIIZI().LJJL(false);
                    }

                    {
                        this.LIZ = c1444630nhF;
                    }

                    @Override // X.InterfaceC1645100sua
                    public final String LIZ(int i) {
                        return this.LIZ.LIZLLL(i);
                    }

                    @Override // X.InterfaceC1645100sua
                    public final void LJ(boolean z) {
                        C0CHQ.LIZ().LJJIIZI().LJJJLL(z);
                    }

                    @Override // X.InterfaceC1645100sua
                    public final void LIZLLL(int i, String str2) {
                        this.LIZ.LIZJ(i, str2);
                    }
                };
                ((InterfaceC1635390sev) C1642320sq6.LL.get()).LJJJJI((String) new InterfaceC1456340o08() { // from class: X.0suY
                    @Override // X.InterfaceC1456340o08
                    public final /* bridge */ /* synthetic */ Object get() {
                        return str;
                    }
                }.get(), true, false, new C1432990nOT(new C1643920ssg(c1643900sseN5, str, interfaceC1645100sua.LIZ(1), interfaceC1645100sua.LIZ(0), awS604S0100000_25, awS569S0100000_25), AFwS266S0000000_25.get$arr$(143)));
            }
        }
    }

    private final void J6(FilterBean filterBean) {
        String id;
        String str;
        String id2 = filterBean.getId();
        FilterBean filterBean2 = getShortVideoContext().creativeModel.recordData.defaultFilter;
        if (filterBean2 != null) {
            id = filterBean2.getId();
        } else {
            id = null;
        }
        if (Intrinsics.LJFF(id2, id)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        getCameraApiComponent().pw0().recordContext.filterIsDefaultInfos.add(str);
    }

    private final void S5(Function0<Unit> function0) {
        InterfaceC1639870sm9 interfaceC1639870sm9;
        C1643870ssb value = this.LLJILJILJ.getValue();
        if (value != null && (interfaceC1639870sm9 = value.LIZIZ) != null && this.LLLF == null) {
            this.LLLF = interfaceC1639870sm9.LJJIFFI().LJI(1000L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS159S0200000_25(this, function0, 0), C19487811Me.LIZLLL);
        }
    }

    private final void u6(FilterBean filterBean) {
        if (getShortVideoContext().creativeModel.recordData.defaultFilter == null) {
            getShortVideoContext().creativeModel.recordData.defaultFilter = filterBean;
        }
    }

    @Override // X.C1644970suN
    public FilterBean E3(C1643870ssb c1643870ssb) {
        Object next;
        InterfaceC1645100sua interfaceC1645100sua = c1643870ssb.LIZLLL;
        if (interfaceC1645100sua instanceof b) {
            String strLJFF = ((b) interfaceC1645100sua).LJFF(getCameraApiComponent().LJLJJLL());
            Object obj = null;
            if (strLJFF == null) {
                return null;
            }
            List list = (List) c1643870ssb.LIZIZ.LJJI().LJFF().getValue();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        FilterBean filterBean = (FilterBean) next;
                        if (Intrinsics.LJFF(filterBean.getResId(), strLJFF)) {
                            if (C13LQ.LJJIJIIJI(filterBean.getCategoryKey(), C0CIT.LIZ()) < 0) {
                                break;
                            }
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                FilterBean filterBean2 = (FilterBean) next;
                if (filterBean2 != null) {
                    return filterBean2;
                }
            }
            List list2 = (List) c1643870ssb.LIZIZ.LJJI().LJI().getValue();
            if (list2 == null) {
                return null;
            }
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                FilterBean filterBean3 = (FilterBean) next2;
                if (Intrinsics.LJFF(filterBean3.getResId(), strLJFF)) {
                    if (C13LQ.LJJIJIIJI(filterBean3.getCategoryKey(), C0CIT.LIZ()) < 0) {
                        obj = next2;
                        break;
                    }
                }
            }
            return (FilterBean) obj;
        }
        return super.E3(c1643870ssb);
    }

    @Override // X.C1644970suN
    public void H5(Pair<? extends FilterBean, C1643870ssb> pair) {
        C385670FAf<Boolean> c385670FAfJv2;
        super.H5(pair);
        InterfaceC1648570t0B recordControlApi = getRecordControlApi();
        if (recordControlApi != null && (c385670FAfJv2 = recordControlApi.Jv2()) != null && Intrinsics.LJFF(c385670FAfJv2.LIZJ(), Boolean.FALSE)) {
            J6(pair.getFirst());
        }
    }

    @Override // X.C1644970suN
    public void W1(C1645070suX c1645070suX) {
        if (getCameraApiComponent() instanceof e0) {
            e0 e0Var = (e0) getCameraApiComponent();
            if (c1645070suX != null && !C1429350nIb.LIZ) {
                a aVarM5 = M5();
                if (aVarM5 != null && !aVarM5.UM0()) {
                    return;
                }
                c1645070suX.LIZ.setFilterFolder(c1645070suX.LIZJ);
                Float f = c1645070suX.LIZLLL;
                if (f == null) {
                    e0Var.rM(c1645070suX.LIZ, null);
                    return;
                } else {
                    e0Var.rM(c1645070suX.LIZ, f);
                    return;
                }
            }
            e0Var.eZ1(this.LLJJJJJIL.LIZJ());
            return;
        }
        super.W1(c1645070suX);
    }

    @Override // X.C1644970suN
    public void X1(FilterBean filterBean, InterfaceC1645100sua interfaceC1645100sua) {
        if (interfaceC1645100sua instanceof b) {
            ((b) interfaceC1645100sua).LJI(getCameraApiComponent().LJLJJLL(), filterBean.getResId());
        } else {
            super.X1(filterBean, interfaceC1645100sua);
        }
    }

    private final void U5(boolean z, boolean z2, boolean z3) {
        C1643870ssb value;
        if (!H4() && (value = this.LLJILJILJ.getValue()) != null) {
            FilterBean filterBeanE3 = E3(value);
            if (filterBeanE3 == null) {
                am2();
                return;
            }
            u6(filterBeanE3);
            if (C1453230nv7.LJIIIZ(filterBeanE3, value.LIZIZ)) {
                d6(this, z, z2, z3, filterBeanE3);
                return;
            }
            this.LLL = filterBeanE3;
            value.LIZIZ.LJFF(filterBeanE3);
            S5(new C1645050suV(this, z, z2, z3));
        }
    }

    @Override // X.C1644970suN
    public void T4(boolean z, boolean z2, boolean z3) {
        String enName;
        if (H4()) {
            return;
        }
        if (this.LLJJIJI == null && m6()) {
            C1643870ssb value = this.LLJILJILJ.getValue();
            if (value != null) {
                FilterBean filterBeanE3 = E3(value);
                if (filterBeanE3 != null) {
                    enName = filterBeanE3.getEnName();
                } else {
                    enName = null;
                }
                if (Intrinsics.LJFF("normal", enName)) {
                    return;
                }
                U5(z, z2, z3);
                return;
            }
            U5(z, z2, z3);
            return;
        }
        U5(z, z2, z3);
    }

    @Override // X.C1644970suN
    public void Z1(C1645070suX c1645070suX, C1645070suX c1645070suX2, float f) {
        float fFloatValue;
        InterfaceC1650230t2r cameraApiComponent = getCameraApiComponent();
        if ((cameraApiComponent instanceof e0) && cameraApiComponent != null) {
            FilterBean filterBean = c1645070suX.LIZ;
            Float f2 = c1645070suX.LIZLLL;
            float fFloatValue2 = 0.0f;
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            C1645090suZ c1645090suZ = new C1645090suZ(filterBean, fFloatValue, c1645070suX.LIZIZ);
            FilterBean filterBean2 = c1645070suX2.LIZ;
            Float f3 = c1645070suX2.LIZLLL;
            if (f3 != null) {
                fFloatValue2 = f3.floatValue();
            }
            cameraApiComponent.wr1(c1645090suZ, new C1645090suZ(filterBean2, fFloatValue2, c1645070suX2.LIZIZ), f);
            return;
        }
        super.Z1(c1645070suX, c1645070suX2, f);
    }

    public static final void d6(k kVar, boolean z, boolean z2, boolean z3, FilterBean filterBean) {
        C1644970suN.n5(kVar, filterBean, null, z, false, z2, z3, false, false, 192, null);
    }

    public k(C1DRG c1drg, String str, String str2, boolean z, C1645020suS c1645020suS, Function1<? super C1645070suX, C1645070suX> function1, Function0<Boolean> function0, Function1<? super C1645130sud, Unit> function12) {
        C1645020suS c1645020suS2 = c1645020suS;
        if (c1645020suS2 == null) {
            c1645020suS2 = new C1645020suS(C0CHQ.LIZ().LJJIL().LIZIZ(), C1456550o0T.LIZ(str), new b(new C1643930ssh()));
        }
        super(z, c1drg, c1645020suS2, function1, function0, function12);
        this.LLJLLL = C452501pT.LIZIZ(new AwS569S0100000_25(c1drg, 277));
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");
        LLLI++;
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS174S1100000_25(str2, this, 5));
    }
}
