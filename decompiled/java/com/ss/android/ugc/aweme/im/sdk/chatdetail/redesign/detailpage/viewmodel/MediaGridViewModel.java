package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel;

import X.AbstractC316870CbV;
import X.AbstractC345490DgZ;
import X.AbstractC879060Ye8;
import X.C01GW;
import X.C054G;
import X.C09IC;
import X.C0Y8T;
import X.C0Z5J;
import X.C0ZU2;
import X.C0ZU9;
import X.C0ZUC;
import X.C0ZUD;
import X.C0ZUE;
import X.C13BV;
import X.C1594406Mc;
import X.C189200o6;
import X.C2252331DDr;
import X.C2296808zG;
import X.C317290CcB;
import X.C345480DgY;
import X.C452501pT;
import X.C861640Xr8;
import X.C882340YjQ;
import X.C900410ZTz;
import X.EnumC904370Zdr;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1755906uD;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IIMMediaGridPerformanceAnalytics;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MediaGridViewModel extends AssemViewModel<C0ZUE> {
    public volatile InterfaceC1364105Vn<? super AbstractC316870CbV<Unit>> LLILLL;
    public volatile InterfaceC1364105Vn<? super AbstractC316870CbV<Unit>> LLILZ;
    public volatile boolean LLILZIL;
    public volatile boolean LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1021));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(233));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1020));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1023));

    public InterfaceC1755906uD AQ2() {
        return null;
    }

    public IMUser CQ2() {
        return null;
    }

    public boolean EQ2() {
        return false;
    }

    public abstract boolean FQ2();

    public abstract void IQ2();

    public abstract String xQ2();

    public final C0ZU2 BQ2() {
        return (C0ZU2) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0ZUE(0);
    }

    public final C0Y8T wQ2() {
        AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LL.getValue();
        if (abstractC879060Ye8 != null) {
            return abstractC879060Ye8.LJ();
        }
        return null;
    }

    public final boolean GQ2() {
        C0Y8T c0y8tWQ2 = wQ2();
        if (c0y8tWQ2 != null) {
            return C0Z5J.LIZIZ(c0y8tWQ2);
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C054G c054g;
        C900410ZTz c900410ZTz;
        C900410ZTz c900410ZTz2;
        String strXQ2 = xQ2();
        if (strXQ2 != null) {
            C0ZU2 c0zu2BQ2 = BQ2();
            AtomicInteger atomicInteger = c0zu2BQ2.LIZLLL.get(strXQ2);
            if (atomicInteger != null && atomicInteger.decrementAndGet() <= 0) {
                c0zu2BQ2.LIZLLL.remove(strXQ2);
                C0ZU9 c0zu9 = c0zu2BQ2.LIZJ.get(strXQ2);
                if (c0zu9 != null && (c900410ZTz2 = c0zu9.LIZIZ) != null) {
                    c900410ZTz2.LLILZIL.LIZ().LJI();
                }
                C0ZU9 c0zu92 = c0zu2BQ2.LIZJ.get(strXQ2);
                if (c0zu92 != null && (c900410ZTz = c0zu92.LIZJ) != null) {
                    c900410ZTz.LLILZIL.LIZ().LJI();
                }
                C0ZU9 c0zu9Remove = c0zu2BQ2.LIZJ.remove(strXQ2);
                if (c0zu9Remove != null && (c054g = c0zu9Remove.LIZ) != null) {
                    C2296808zG.LIZJ(c054g, null);
                }
                IIMMediaGridPerformanceAnalytics iIMMediaGridPerformanceAnalytics = (IIMMediaGridPerformanceAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMediaGridPerformanceAnalytics.class);
                if (iIMMediaGridPerformanceAnalytics != null) {
                    iIMMediaGridPerformanceAnalytics.LIZ(strXQ2);
                }
            }
        }
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C2252331DDr c2252331DDr;
        C2252331DDr c2252331DDr2;
        AtomicInteger atomicIntegerPutIfAbsent;
        super.onPrepared();
        String strXQ2 = xQ2();
        if (strXQ2 != null) {
            C0ZU2 c0zu2BQ2 = BQ2();
            AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1022);
            ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = c0zu2BQ2.LIZLLL;
            AtomicInteger atomicInteger = concurrentHashMap.get(strXQ2);
            if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(strXQ2, (atomicInteger = new AtomicInteger(0)))) != null) {
                atomicInteger = atomicIntegerPutIfAbsent;
            }
            atomicInteger.incrementAndGet();
            ConcurrentHashMap<String, C0ZU9> concurrentHashMap2 = c0zu2BQ2.LIZJ;
            if (concurrentHashMap2.get(strXQ2) == null) {
                concurrentHashMap2.putIfAbsent(strXQ2, new C0ZU9(c0zu2BQ2, strXQ2, awS558S0100000_14));
            }
            C0ZU9 c0zu9 = BQ2().LIZJ.get(strXQ2);
            if (c0zu9 != null && (c2252331DDr2 = c0zu9.LIZLLL) != null) {
                C09IC.LJJI(getAssemVMScope(), new C861640Xr8(new C0ZUC(this, null), c2252331DDr2));
            }
            C0ZU9 c0zu92 = BQ2().LIZJ.get(strXQ2);
            if (c0zu92 == null || (c2252331DDr = c0zu92.LJ) == null) {
                return;
            }
            C09IC.LJJI(getAssemVMScope(), new C861640Xr8(new C0ZUD(this, null), c2252331DDr));
        }
    }

    public final int vQ2() {
        C0Y8T c0y8tWQ2 = wQ2();
        if (c0y8tWQ2 == null) {
            return 0;
        }
        if (c0y8tWQ2.isGroupChat()) {
            return 3;
        }
        return C882340YjQ.LJ(c0y8tWQ2) ? 1 : 0;
    }

    public static long yQ2(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final boolean DQ2(EnumC904370Zdr enumC904370Zdr) {
        if (zQ2(enumC904370Zdr).size() != 1 || !Intrinsics.LJFF(ListProtector.get(zQ2(enumC904370Zdr), 0), new C345480DgY(enumC904370Zdr, false))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C0ZW7> HQ2(java.util.List<? extends X.C869590Y9l> r35) {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel.HQ2(java.util.List):java.util.List");
    }

    public final void JQ2(EnumC904370Zdr enumC904370Zdr) {
        InterfaceC1364105Vn<? super AbstractC316870CbV<Unit>> interfaceC1364105Vn;
        Object objLIZIZ;
        String strXQ2 = xQ2();
        if (strXQ2 == null) {
            return;
        }
        boolean zLIZIZ = BQ2().LIZIZ(strXQ2, enumC904370Zdr);
        if (C1594406Mc.LIZ[enumC904370Zdr.ordinal()] == 1) {
            interfaceC1364105Vn = this.LLILLL;
            if (interfaceC1364105Vn != null) {
                this.LLILLL = null;
            } else {
                return;
            }
        } else {
            interfaceC1364105Vn = this.LLILZ;
            if (interfaceC1364105Vn != null) {
                this.LLILZ = null;
            } else {
                return;
            }
        }
        if (zLIZIZ) {
            objLIZIZ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, Unit.LIZ, null, 5);
        } else {
            objLIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
        }
        C189200o6.m2constructorimpl(objLIZIZ);
        interfaceC1364105Vn.resumeWith(objLIZIZ);
    }

    public final List<AbstractC345490DgZ> zQ2(EnumC904370Zdr enumC904370Zdr) {
        int i = C1594406Mc.LIZ[enumC904370Zdr.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return C13BV.INSTANCE;
            }
            return getState().LLILLL;
        }
        return getState().LLILLJJLI;
    }
}
