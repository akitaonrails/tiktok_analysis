package com.ss.android.ugc.aweme.tracker;

import X.C1175120ggY;
import X.C1183030gtJ;
import X.C1187850h15;
import X.C1189380h3Y;
import X.C1193740hAa;
import X.C123100dR;
import X.C15438062q;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19EG;
import X.C2187701Ajg;
import X.C259800zU;
import X.C5182020e;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C993740by0;
import X.EnumC1193700hAW;
import X.EnumC1193710hAX;
import X.EnumC1193720hAY;
import X.EnumC993730bxz;
import X.InterfaceC1181900grU;
import X.InterfaceC1183590guD;
import X.InterfaceC1187170gzz;
import X.InterfaceC1193730hAZ;
import X.InterfaceC1193760hAc;
import X.InterfaceC494301wD;
import Y.ARunnableS118S0100000_18;
import Y.ARunnableS22S0201000_16;
import Y.ARunnableS35S0110000_16;
import Y.ARunnableS37S0110000_18;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.selectsheet.TuxMultiSelectionSheet;
import com.ss.android.ugc.aweme.tracker.TrackerImpl;
import com.zhiliaoapp.musically.R;
import defpackage.u7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS134S0110000_16;
import kotlin.jvm.internal.AwS14S0111000_2;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TrackerImpl implements InterfaceC494301wD, InterfaceC1183590guD, InterfaceC1193730hAZ, InterfaceC1181900grU, LifecycleEventObserver {
    public final LifecycleOwner LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final View LLILZ;
    public InterfaceC1193730hAZ LLILZIL;
    public final List<InterfaceC1193730hAZ> LLILZLL = new ArrayList();
    public final List<C1189380h3Y> LLIZ = new ArrayList();
    public String LLIZLLLIL = EnumC1193700hAW.PAGE_OPEN.getValue();
    public final List<C1187850h15> LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public Function0<Long> LLJJ;
    public Function0<C1193740hAa> LLJJI;
    public Function1<? super Map<String, String>, Unit> LLJJIII;
    public int LLJJIJI;
    public final List<InterfaceC1193760hAc> LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final Set<Pair<String, String>> LLJJJ;
    public final Map<String, String> LLJJJIL;
    public final Map<String, Long> LLJJJJ;
    public final List<u7> LLJJJJJIL;
    public final Map<Integer, Pair<String, String>> LLJJJJLIIL;
    public String LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public final Map<String, Object> LLJL;
    public final Map<String, Object> LLJLIL;
    public final ARunnableS118S0100000_18 LLJLILLLLZIIL;
    public final Map<ViewTreeObserver.OnDrawListener, List<ViewTreeObserver>> LLJLL;
    public final Map<ViewTreeObserver.OnDrawListener, View> LLJLLIL;
    public final BPEAHandler LLJLLL;

    @Override // X.InterfaceC1193730hAZ
    public final TrackerImpl LJII() {
        return this;
    }

    @Override // X.InterfaceC1183590guD
    public final void LJJJJ() {
        this.LLJJIJIL = true;
    }

    @Override // X.InterfaceC1183590guD
    public final void LJJJJJL() {
    }

    @Override // X.InterfaceC1183590guD
    public final void cancel() {
        this.LLJI = true;
        InterfaceC1193730hAZ interfaceC1193730hAZ = this.LLILZIL;
        if (interfaceC1193730hAZ != null) {
            interfaceC1193730hAZ.LJJIIJ(this);
        }
        this.LLILZIL = null;
        new AwS560S0100000_16(this, 589);
    }

    @Override // X.InterfaceC1183590guD
    public final void unlock() throws Throwable {
        this.LLJJIJIL = false;
        LJL(0, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC1181900grU
    public final void LJIIZILJ() {
        u7 next;
        if (this.LLJI || this.LLJILJIL) {
            return;
        }
        Iterator<u7> it2 = this.LLJJJJJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZJ, "default")) {
                    break;
                }
            }
        }
        u7 u7Var = next;
        if (u7Var != null) {
            u7Var.LIZIZ = AFwS206S0000000_18.get$arr$(624);
        }
    }

    @Override // X.InterfaceC1183590guD
    public final void LJJI() {
        C1187850h15 c1187850h15LJJIZ = LJJIZ(EnumC1193710hAX.END_RENDER, this.LLILLL);
        LJJLIIIJILLIZJL(c1187850h15LJJIZ != null ? c1187850h15LJJIZ.LIZ : System.currentTimeMillis(), true);
    }

    public final boolean LJJJJZ() {
        List<InterfaceC1193730hAZ> list = this.LLILZLL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<InterfaceC1193730hAZ> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LJII().LLJILJIL) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final boolean LJJJJZI() {
        List<C1189380h3Y> list = this.LLIZ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ?? r0 = ((C1189380h3Y) it2.next()).LIZJ;
                if (r0 == 0 || !((Boolean) r0.invoke()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void LJJJLIIL() {
        if (this.LLJILJIL || ((ArrayList) this.LLILZLL).isEmpty() || !LJJJJZ()) {
            return;
        }
        this.LLJILJIL = true;
        EnumC1193710hAX enumC1193710hAX = EnumC1193710hAX.END_RENDER;
        Long lLJJLIIIJJIZ = LJJLIIIJJIZ(enumC1193710hAX);
        ((ArrayList) this.LLJ).add(new C1187850h15(lLJJLIIIJJIZ != null ? lLJJLIIIJJIZ.longValue() : System.currentTimeMillis(), enumC1193710hAX));
        new AwS417S0200000_16(this, lLJJLIIIJJIZ, 31);
    }

    public final void LJJJLZIJ() {
        Iterator<InterfaceC1193730hAZ> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().LJII().LJJJLZIJ();
        }
        LJJJLIIL();
    }

    public final Long LJJLIIIJLJLI() {
        TrackerImpl trackerImplLJII;
        Long lInvoke;
        Function0<Long> function0 = this.LLJJ;
        if (function0 != null && (lInvoke = function0.invoke()) != null) {
            return lInvoke;
        }
        InterfaceC1193730hAZ interfaceC1193730hAZ = this.LLILZIL;
        if (interfaceC1193730hAZ == null || (trackerImplLJII = interfaceC1193730hAZ.LJII()) == null) {
            return null;
        }
        return trackerImplLJII.LJJLIIIJLJLI();
    }

    public final void LJJLL() {
        for (Map.Entry entry : ((LinkedHashMap) this.LLJLL).entrySet()) {
            for (ViewTreeObserver viewTreeObserver : (Iterable) entry.getValue()) {
                if (viewTreeObserver.isAlive()) {
                    ViewTreeObserver.OnDrawListener onDrawListener = (ViewTreeObserver.OnDrawListener) entry.getKey();
                    viewTreeObserver.removeOnDrawListener(onDrawListener);
                    C2187701Ajg.LIZIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
                }
            }
        }
    }

    public final void LJLI() {
        Function0<C1193740hAa> function0;
        C1193740hAa c1193740hAaInvoke;
        if (this.LLJIJIL || (function0 = this.LLJJI) == null || (c1193740hAaInvoke = function0.invoke()) == null) {
            return;
        }
        String str = c1193740hAaInvoke.LIZLLL;
        if (str != null) {
            this.LLJILLL = str;
        }
        boolean z = c1193740hAaInvoke.LIZIZ;
        Long lValueOf = Long.valueOf(c1193740hAaInvoke.LIZ);
        if (this.LLJI || this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = true;
        ((ArrayList) this.LLJ).add(new C1187850h15(lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis(), z ? EnumC1193710hAX.END_NETWORK_SUCCESS : EnumC1193710hAX.END_NETWORK_FAIL));
    }

    public static long LJLILLLLZI(C1187850h15 c1187850h15) {
        long j = c1187850h15.LIZ;
        if (j < -1) {
            return -1L;
        }
        return j;
    }

    @Override // X.InterfaceC1183590guD
    public final void LIZ(Function0<C1193740hAa> function0) {
        this.LLJJI = function0;
    }

    @Override // X.InterfaceC1183590guD
    public final void LIZIZ(Function1<? super u7, Unit> function1) {
        if (!this.LLJI && !this.LLJILJIL) {
            final u7 u7Var = new u7();
            function1.invoke(u7Var);
            ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: X.0hAV
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() throws Throwable {
                    TrackerImpl trackerImpl = this.LL;
                    if (trackerImpl.LLJI || trackerImpl.LLJILJIL) {
                        return;
                    }
                    u7 u7Var2 = u7Var;
                    if (!Intrinsics.LJFF(u7Var2.LIZJ, "default") || ((ArrayList) trackerImpl.LLJJJJJIL).size() <= 1) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Function0<Boolean> function0 = u7Var2.LIZIZ;
                        if (function0 == null) {
                            function0 = null;
                        }
                        boolean zBooleanValue = function0.invoke().booleanValue();
                        if (System.currentTimeMillis() - jCurrentTimeMillis > 100) {
                            int i = trackerImpl.LLJJIJI + 1;
                            trackerImpl.LLJJIJI = i;
                            if (i > C1183030gtJ.LIZ().predicateTimeoutLimit) {
                                new AwS560S0100000_16(trackerImpl, 828);
                                TrackerImpl.LJJZZI(trackerImpl, EnumC1193720hAY.EXCEPTION);
                                return;
                            }
                        } else {
                            trackerImpl.LLJJIJI = 0;
                        }
                        if (!zBooleanValue || this.LL.LL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                            return;
                        }
                        this.LL.LJLI();
                        TrackerImpl trackerImpl2 = this.LL;
                        new AwS419S0200000_18(trackerImpl2, u7Var, 109);
                        trackerImpl2.getClass();
                        this.LL.LJJLIIIJILLIZJL(System.currentTimeMillis(), u7Var.LIZLLL);
                    }
                }
            };
            View view = u7Var.LIZ;
            View view2 = null;
            if (view == null) {
                view = null;
            }
            C786410Ut5.w3(view.getViewTreeObserver(), onDrawListener);
            Map<ViewTreeObserver.OnDrawListener, View> map = this.LLJLLIL;
            View view3 = u7Var.LIZ;
            if (view3 == null) {
                view3 = null;
            }
            map.put(onDrawListener, view3);
            Map<ViewTreeObserver.OnDrawListener, List<ViewTreeObserver>> map2 = this.LLJLL;
            ViewTreeObserver[] viewTreeObserverArr = new ViewTreeObserver[1];
            View view4 = u7Var.LIZ;
            if (view4 != null) {
                view2 = view4;
            }
            viewTreeObserverArr[0] = view2.getViewTreeObserver();
            map2.put(onDrawListener, C1697810uHb.LJIILJJIL(viewTreeObserverArr));
            ((ArrayList) this.LLJJJJJIL).add(u7Var);
        }
    }

    @Override // X.InterfaceC1183590guD
    public final void LIZLLL(Long l) {
        long jCurrentTimeMillis;
        if (!this.LLJI && !this.LLJIJIL) {
            List<C1187850h15> list = this.LLJ;
            if (l != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            ((ArrayList) list).add(new C1187850h15(jCurrentTimeMillis, EnumC1193710hAX.START_NETWORK));
        }
    }

    @Override // X.InterfaceC1193730hAZ
    public final void LJI(Long l) throws Throwable {
        LJL(0, l);
    }

    @Override // X.InterfaceC1183590guD
    public final void LJIIJ(AwS562S0100000_18 awS562S0100000_18) {
        Long l = (Long) awS562S0100000_18.invoke();
        if (l != null) {
            long jLongValue = l.longValue();
            ((ArrayList) this.LLJ).add(new C1187850h15(jLongValue, EnumC1193710hAX.START_COMPONENT_CREATE));
        }
    }

    @Override // X.InterfaceC1183590guD
    public final void LJIIJJI(Function0<Long> function0) {
        this.LLJJ = function0;
    }

    @Override // X.InterfaceC1183590guD
    public final void LJJ(Function1<? super C1189380h3Y, Unit> function1) {
        if (C1183030gtJ.LIZ().enableLcpTrack == 0) {
            return;
        }
        C1189380h3Y c1189380h3Y = new C1189380h3Y();
        function1.invoke(c1189380h3Y);
        if (this.LLJILJIL) {
            new AwS562S0100000_18(c1189380h3Y, 2333);
        } else {
            new AwS562S0100000_18(c1189380h3Y, 2334);
            ((ArrayList) this.LLIZ).add(c1189380h3Y);
        }
    }

    @Override // X.InterfaceC1193730hAZ
    public final void LJJIIJ(InterfaceC1193730hAZ interfaceC1193730hAZ) throws Throwable {
        ((ArrayList) this.LLILZLL).remove(interfaceC1193730hAZ);
        this.LLJJJ.remove(new Pair(interfaceC1193730hAZ.LJII().LLILLJJLI, interfaceC1193730hAZ.LJII().LLILLL));
        LJL(0, LJJLIIIJJIZ(EnumC1193710hAX.END_LCP_RENDER));
    }

    @Override // X.InterfaceC1183590guD
    public final void LJJIIZI(InterfaceC1193760hAc interfaceC1193760hAc) {
        ((ArrayList) this.LLJJIJIIJIL).add(interfaceC1193760hAc);
    }

    @Override // X.InterfaceC1183590guD
    public final void LJJIJIIJIL(C1187850h15 c1187850h15) {
        ((ArrayList) this.LLJ).add(c1187850h15);
    }

    @Override // X.InterfaceC1183590guD
    public final void LJJIL(Map<String, ? extends Object> map) {
        this.LLJL.putAll(map);
    }

    @Override // X.InterfaceC1183590guD
    public final void LJJJ(Function1<? super Map<String, String>, Unit> function1) {
        this.LLJJIII = function1;
    }

    @Override // X.InterfaceC1183590guD
    public final void LJJJJJ(Map<String, ? extends Object> map) {
        this.LLJLIL.putAll(map);
    }

    public final void LJJJZ(View view) {
        C1189380h3Y c1189380h3Y;
        if (view == null || C1183030gtJ.LIZ().enableLcpTrack == 0) {
            return;
        }
        try {
            Object tag = view.getTag(R.id.ywn);
            if ((tag instanceof C1189380h3Y) && (c1189380h3Y = (C1189380h3Y) tag) != null) {
                new AwS562S0100000_18(c1189380h3Y, 2335);
                ((ArrayList) this.LLIZ).add(c1189380h3Y);
            }
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    LJJJZ(((ViewGroup) view).getChildAt(i));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            new AwS560S0100000_16(th, 590);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Long] */
    public final Long LJJLIIIJJIZ(EnumC1193710hAX enumC1193710hAX) {
        C1187850h15 next;
        ?? ValueOf;
        C259800zU c259800zU = new C259800zU();
        Iterator<InterfaceC1193730hAZ> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            Iterator<C1187850h15> it3 = it2.next().LJII().LLJ.iterator();
            do {
                next = null;
                if (!it3.hasNext()) {
                    break;
                }
                next = it3.next();
            } while (next.LIZIZ != enumC1193710hAX);
            C1187850h15 c1187850h15 = next;
            if (c1187850h15 != null && (ValueOf = Long.valueOf(c1187850h15.LIZ)) != 0 && ValueOf.longValue() > C1175120ggY.LIZLLL((Long) c259800zU.element)) {
                c259800zU.element = ValueOf;
            }
        }
        new AwS560S0100000_16(c259800zU, (C259800zU<TuxMultiSelectionSheet>) 591);
        return (Long) c259800zU.element;
    }

    public final void LJLIIIL(C19EG c19eg) {
        long jLongValue;
        Intent intent;
        Long lValueOf;
        Long lLJJLIIIJLJLI = LJJLIIIJLJLI();
        C1187850h15 c1187850h15 = null;
        if (lLJJLIIIJLJLI != null) {
            jLongValue = lLJJLIIIJLJLI.longValue();
        } else {
            jLongValue = -1;
            if (c19eg != null && (intent = c19eg.getIntent()) != null && (lValueOf = Long.valueOf(intent.getLongExtra("page_start_ts", -1L))) != null) {
                jLongValue = lValueOf.longValue();
            }
        }
        Iterator<C1187850h15> it2 = this.LLJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1187850h15 next = it2.next();
            if (next.LIZIZ == EnumC1193710hAX.START_PAGE_OPEN) {
                c1187850h15 = next;
                break;
            }
        }
        C1187850h15 c1187850h152 = c1187850h15;
        if ((c1187850h152 == null || c1187850h152.LIZ <= 0) && jLongValue > 0) {
            if (c1187850h152 != null) {
                C1187850h15 c1187850h153 = new C1187850h15(jLongValue, EnumC1193710hAX.START_PAGE_OPEN);
                ((ArrayList) this.LLJ).remove(c1187850h152);
                ((ArrayList) this.LLJ).add(c1187850h153);
                return;
            }
            ((ArrayList) this.LLJ).add(new C1187850h15(jLongValue, EnumC1193710hAX.START_PAGE_OPEN));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a6 A[Catch: all -> 0x029d, TryCatch #1 {all -> 0x029d, blocks: (B:8:0x0019, B:12:0x001f, B:15:0x006d, B:20:0x007c, B:23:0x0087, B:26:0x008d, B:28:0x0094, B:29:0x0096, B:33:0x00a2, B:37:0x00b0, B:148:0x0231, B:150:0x0237, B:151:0x0240, B:152:0x0247, B:153:0x0272, B:160:0x0286, B:161:0x028e, B:162:0x0291, B:147:0x022f, B:31:0x009d, B:22:0x0083, B:87:0x014b, B:88:0x014d, B:93:0x015b, B:94:0x0163, B:110:0x019c, B:138:0x01f7, B:140:0x01fb, B:142:0x0201, B:146:0x0209, B:85:0x0146, B:97:0x016e, B:108:0x0192, B:109:0x0196, B:98:0x0171, B:106:0x0185, B:107:0x018b, B:72:0x011d, B:74:0x0129, B:76:0x012f, B:111:0x01a1, B:121:0x01bf, B:123:0x01ca, B:125:0x01d0, B:127:0x01d5, B:129:0x01db, B:135:0x01e8, B:137:0x01ee, B:134:0x01e6, B:113:0x01a6, B:116:0x01ad, B:118:0x01b3, B:115:0x01ab, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f9, B:65:0x0101, B:67:0x0107, B:69:0x0114, B:71:0x0118, B:81:0x0139, B:84:0x0144, B:83:0x0140, B:166:0x029e), top: B:171:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b3 A[Catch: all -> 0x029d, TryCatch #1 {all -> 0x029d, blocks: (B:8:0x0019, B:12:0x001f, B:15:0x006d, B:20:0x007c, B:23:0x0087, B:26:0x008d, B:28:0x0094, B:29:0x0096, B:33:0x00a2, B:37:0x00b0, B:148:0x0231, B:150:0x0237, B:151:0x0240, B:152:0x0247, B:153:0x0272, B:160:0x0286, B:161:0x028e, B:162:0x0291, B:147:0x022f, B:31:0x009d, B:22:0x0083, B:87:0x014b, B:88:0x014d, B:93:0x015b, B:94:0x0163, B:110:0x019c, B:138:0x01f7, B:140:0x01fb, B:142:0x0201, B:146:0x0209, B:85:0x0146, B:97:0x016e, B:108:0x0192, B:109:0x0196, B:98:0x0171, B:106:0x0185, B:107:0x018b, B:72:0x011d, B:74:0x0129, B:76:0x012f, B:111:0x01a1, B:121:0x01bf, B:123:0x01ca, B:125:0x01d0, B:127:0x01d5, B:129:0x01db, B:135:0x01e8, B:137:0x01ee, B:134:0x01e6, B:113:0x01a6, B:116:0x01ad, B:118:0x01b3, B:115:0x01ab, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f9, B:65:0x0101, B:67:0x0107, B:69:0x0114, B:71:0x0118, B:81:0x0139, B:84:0x0144, B:83:0x0140, B:166:0x029e), top: B:171:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bf A[Catch: all -> 0x029d, TryCatch #1 {all -> 0x029d, blocks: (B:8:0x0019, B:12:0x001f, B:15:0x006d, B:20:0x007c, B:23:0x0087, B:26:0x008d, B:28:0x0094, B:29:0x0096, B:33:0x00a2, B:37:0x00b0, B:148:0x0231, B:150:0x0237, B:151:0x0240, B:152:0x0247, B:153:0x0272, B:160:0x0286, B:161:0x028e, B:162:0x0291, B:147:0x022f, B:31:0x009d, B:22:0x0083, B:87:0x014b, B:88:0x014d, B:93:0x015b, B:94:0x0163, B:110:0x019c, B:138:0x01f7, B:140:0x01fb, B:142:0x0201, B:146:0x0209, B:85:0x0146, B:97:0x016e, B:108:0x0192, B:109:0x0196, B:98:0x0171, B:106:0x0185, B:107:0x018b, B:72:0x011d, B:74:0x0129, B:76:0x012f, B:111:0x01a1, B:121:0x01bf, B:123:0x01ca, B:125:0x01d0, B:127:0x01d5, B:129:0x01db, B:135:0x01e8, B:137:0x01ee, B:134:0x01e6, B:113:0x01a6, B:116:0x01ad, B:118:0x01b3, B:115:0x01ab, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f9, B:65:0x0101, B:67:0x0107, B:69:0x0114, B:71:0x0118, B:81:0x0139, B:84:0x0144, B:83:0x0140, B:166:0x029e), top: B:171:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fb A[Catch: all -> 0x029d, TryCatch #1 {all -> 0x029d, blocks: (B:8:0x0019, B:12:0x001f, B:15:0x006d, B:20:0x007c, B:23:0x0087, B:26:0x008d, B:28:0x0094, B:29:0x0096, B:33:0x00a2, B:37:0x00b0, B:148:0x0231, B:150:0x0237, B:151:0x0240, B:152:0x0247, B:153:0x0272, B:160:0x0286, B:161:0x028e, B:162:0x0291, B:147:0x022f, B:31:0x009d, B:22:0x0083, B:87:0x014b, B:88:0x014d, B:93:0x015b, B:94:0x0163, B:110:0x019c, B:138:0x01f7, B:140:0x01fb, B:142:0x0201, B:146:0x0209, B:85:0x0146, B:97:0x016e, B:108:0x0192, B:109:0x0196, B:98:0x0171, B:106:0x0185, B:107:0x018b, B:72:0x011d, B:74:0x0129, B:76:0x012f, B:111:0x01a1, B:121:0x01bf, B:123:0x01ca, B:125:0x01d0, B:127:0x01d5, B:129:0x01db, B:135:0x01e8, B:137:0x01ee, B:134:0x01e6, B:113:0x01a6, B:116:0x01ad, B:118:0x01b3, B:115:0x01ab, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f9, B:65:0x0101, B:67:0x0107, B:69:0x0114, B:71:0x0118, B:81:0x0139, B:84:0x0144, B:83:0x0140, B:166:0x029e), top: B:171:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: all -> 0x029d, TryCatch #1 {all -> 0x029d, blocks: (B:8:0x0019, B:12:0x001f, B:15:0x006d, B:20:0x007c, B:23:0x0087, B:26:0x008d, B:28:0x0094, B:29:0x0096, B:33:0x00a2, B:37:0x00b0, B:148:0x0231, B:150:0x0237, B:151:0x0240, B:152:0x0247, B:153:0x0272, B:160:0x0286, B:161:0x028e, B:162:0x0291, B:147:0x022f, B:31:0x009d, B:22:0x0083, B:87:0x014b, B:88:0x014d, B:93:0x015b, B:94:0x0163, B:110:0x019c, B:138:0x01f7, B:140:0x01fb, B:142:0x0201, B:146:0x0209, B:85:0x0146, B:97:0x016e, B:108:0x0192, B:109:0x0196, B:98:0x0171, B:106:0x0185, B:107:0x018b, B:72:0x011d, B:74:0x0129, B:76:0x012f, B:111:0x01a1, B:121:0x01bf, B:123:0x01ca, B:125:0x01d0, B:127:0x01d5, B:129:0x01db, B:135:0x01e8, B:137:0x01ee, B:134:0x01e6, B:113:0x01a6, B:116:0x01ad, B:118:0x01b3, B:115:0x01ab, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f9, B:65:0x0101, B:67:0x0107, B:69:0x0114, B:71:0x0118, B:81:0x0139, B:84:0x0144, B:83:0x0140, B:166:0x029e), top: B:171:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea A[Catch: all -> 0x029d, TRY_ENTER, TryCatch #1 {all -> 0x029d, blocks: (B:8:0x0019, B:12:0x001f, B:15:0x006d, B:20:0x007c, B:23:0x0087, B:26:0x008d, B:28:0x0094, B:29:0x0096, B:33:0x00a2, B:37:0x00b0, B:148:0x0231, B:150:0x0237, B:151:0x0240, B:152:0x0247, B:153:0x0272, B:160:0x0286, B:161:0x028e, B:162:0x0291, B:147:0x022f, B:31:0x009d, B:22:0x0083, B:87:0x014b, B:88:0x014d, B:93:0x015b, B:94:0x0163, B:110:0x019c, B:138:0x01f7, B:140:0x01fb, B:142:0x0201, B:146:0x0209, B:85:0x0146, B:97:0x016e, B:108:0x0192, B:109:0x0196, B:98:0x0171, B:106:0x0185, B:107:0x018b, B:72:0x011d, B:74:0x0129, B:76:0x012f, B:111:0x01a1, B:121:0x01bf, B:123:0x01ca, B:125:0x01d0, B:127:0x01d5, B:129:0x01db, B:135:0x01e8, B:137:0x01ee, B:134:0x01e6, B:113:0x01a6, B:116:0x01ad, B:118:0x01b3, B:115:0x01ab, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f9, B:65:0x0101, B:67:0x0107, B:69:0x0114, B:71:0x0118, B:81:0x0139, B:84:0x0144, B:83:0x0140, B:166:0x029e), top: B:171:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011d A[Catch: all -> 0x029d, PHI: r5
      0x011d: PHI (r5v8 long) = (r5v3 long), (r5v7 long), (r5v10 long) binds: [B:84:0x0144, B:71:0x0118, B:54:0x00e3] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x029d, blocks: (B:8:0x0019, B:12:0x001f, B:15:0x006d, B:20:0x007c, B:23:0x0087, B:26:0x008d, B:28:0x0094, B:29:0x0096, B:33:0x00a2, B:37:0x00b0, B:148:0x0231, B:150:0x0237, B:151:0x0240, B:152:0x0247, B:153:0x0272, B:160:0x0286, B:161:0x028e, B:162:0x0291, B:147:0x022f, B:31:0x009d, B:22:0x0083, B:87:0x014b, B:88:0x014d, B:93:0x015b, B:94:0x0163, B:110:0x019c, B:138:0x01f7, B:140:0x01fb, B:142:0x0201, B:146:0x0209, B:85:0x0146, B:97:0x016e, B:108:0x0192, B:109:0x0196, B:98:0x0171, B:106:0x0185, B:107:0x018b, B:72:0x011d, B:74:0x0129, B:76:0x012f, B:111:0x01a1, B:121:0x01bf, B:123:0x01ca, B:125:0x01d0, B:127:0x01d5, B:129:0x01db, B:135:0x01e8, B:137:0x01ee, B:134:0x01e6, B:113:0x01a6, B:116:0x01ad, B:118:0x01b3, B:115:0x01ab, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f9, B:65:0x0101, B:67:0x0107, B:69:0x0114, B:71:0x0118, B:81:0x0139, B:84:0x0144, B:83:0x0140, B:166:0x029e), top: B:171:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129 A[Catch: all -> 0x029d, TryCatch #1 {all -> 0x029d, blocks: (B:8:0x0019, B:12:0x001f, B:15:0x006d, B:20:0x007c, B:23:0x0087, B:26:0x008d, B:28:0x0094, B:29:0x0096, B:33:0x00a2, B:37:0x00b0, B:148:0x0231, B:150:0x0237, B:151:0x0240, B:152:0x0247, B:153:0x0272, B:160:0x0286, B:161:0x028e, B:162:0x0291, B:147:0x022f, B:31:0x009d, B:22:0x0083, B:87:0x014b, B:88:0x014d, B:93:0x015b, B:94:0x0163, B:110:0x019c, B:138:0x01f7, B:140:0x01fb, B:142:0x0201, B:146:0x0209, B:85:0x0146, B:97:0x016e, B:108:0x0192, B:109:0x0196, B:98:0x0171, B:106:0x0185, B:107:0x018b, B:72:0x011d, B:74:0x0129, B:76:0x012f, B:111:0x01a1, B:121:0x01bf, B:123:0x01ca, B:125:0x01d0, B:127:0x01d5, B:129:0x01db, B:135:0x01e8, B:137:0x01ee, B:134:0x01e6, B:113:0x01a6, B:116:0x01ad, B:118:0x01b3, B:115:0x01ab, B:58:0x00ea, B:60:0x00ee, B:62:0x00f4, B:64:0x00f9, B:65:0x0101, B:67:0x0107, B:69:0x0114, B:71:0x0118, B:81:0x0139, B:84:0x0144, B:83:0x0140, B:166:0x029e), top: B:171:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJZZI(com.ss.android.ugc.aweme.tracker.TrackerImpl r25, X.EnumC1193720hAY r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tracker.TrackerImpl.LJJZZI(com.ss.android.ugc.aweme.tracker.TrackerImpl, X.0hAY):void");
    }

    @Override // X.InterfaceC1181900grU
    public final void LJFF(Long l, String str) {
        long jCurrentTimeMillis;
        if (!this.LLJI && !this.LLJIJIL) {
            Map<String, Long> map = this.LLJJJJ;
            if (l != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            map.put(str, Long.valueOf(jCurrentTimeMillis));
        }
    }

    @Override // X.InterfaceC1183590guD
    public final void LJIILIIL(String str, String str2) {
        this.LLJJJ.add(new Pair<>(str, str2));
    }

    @Override // X.InterfaceC1183590guD
    public final void LJIJJLI(String str, String str2) {
        if (this.LLJI) {
            return;
        }
        this.LLJJJJLIIL.put(1, new Pair<>(str, str2));
    }

    @Override // X.InterfaceC1183590guD
    public final void LJJIFFI(String str, String str2) {
        if (this.LLJI) {
            return;
        }
        this.LLJJJJLIIL.put(2, new Pair<>(str, str2));
    }

    @Override // X.InterfaceC1193730hAZ
    public final C1187850h15 LJJIZ(EnumC1193710hAX enumC1193710hAX, String str) {
        C1187850h15 next;
        Long l;
        if (enumC1193710hAX == EnumC1193710hAX.END_NETWORK_SUCCESS && C123100dR.LIZ(str) && (l = (Long) ((LinkedHashMap) this.LLJJJJ).get(str)) != null) {
            return new C1187850h15(l.longValue(), enumC1193710hAX);
        }
        Iterator<C1187850h15> it2 = this.LLJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZIZ == enumC1193710hAX) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1187850h15 c1187850h15 = next;
        if (c1187850h15 == null) {
            InterfaceC1193730hAZ interfaceC1193730hAZ = this.LLILZIL;
            if (interfaceC1193730hAZ == null) {
                return null;
            }
            return interfaceC1193730hAZ.LJJIZ(enumC1193710hAX, str);
        }
        return c1187850h15;
    }

    public final void LJJLIIIJ(long j, boolean z) {
        if (!this.LLJI && !this.LLJILJILJ) {
            this.LLJILJILJ = true;
            ((ArrayList) this.LLJ).add(new C1187850h15(j, EnumC1193710hAX.END_LCP_RENDER));
            C786410Ut5.LJJZZIII(this.LLJLLL, new ARunnableS37S0110000_18(this, z, 1));
        }
    }

    public final void LJJLIIIJILLIZJL(long j, boolean z) {
        if (!this.LLJI && !this.LLJILJIL) {
            this.LLJILJIL = true;
            ((ArrayList) this.LLJ).add(new C1187850h15(j, EnumC1193710hAX.END_RENDER));
            LJJJZ(this.LLILZ);
            if (LJJJJZI()) {
                new AwS134S0110000_16(this, z, 4);
                LJJLIIIJ(j, z);
            } else {
                new AwS134S0110000_16(this, z, 5);
                C786410Ut5.LJJZZIII(this.LLJLLL, new ARunnableS35S0110000_16(this, z, 0));
            }
        }
    }

    public final void LJL(int i, Long l) throws Throwable {
        boolean z;
        EnumC993730bxz enumC993730bxz;
        long jCurrentTimeMillis;
        if (this.LLJI || this.LLJJIJIL) {
            return;
        }
        List<InterfaceC1193730hAZ> list = this.LLILZLL;
        if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
            z = true;
        } else {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (!((InterfaceC1193730hAZ) it2.next()).LJII().LLJI) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        List<InterfaceC1193730hAZ> list2 = this.LLILZLL;
        ArrayList<InterfaceC1193730hAZ> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list2) {
            if (((InterfaceC1193730hAZ) obj).LJII().LLJILJIL) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (InterfaceC1193730hAZ interfaceC1193730hAZ : arrayList) {
            arrayList2.add(new Pair(interfaceC1193730hAZ.LJII().LLILLJJLI, interfaceC1193730hAZ.LJII().LLILLL));
        }
        new C5182020e(arrayList2, (List<Function0<Unit>>) 155);
        new AwS560S0100000_16(this, 592);
        if (arrayList2.containsAll(this.LLJJJ)) {
            enumC993730bxz = EnumC993730bxz.ALL_READY;
        } else if (LJJJJZ()) {
            enumC993730bxz = EnumC993730bxz.WAIT_REGISTER;
        } else {
            enumC993730bxz = EnumC993730bxz.WAIT_RENDER;
        }
        new AwS14S0111000_2(z, enumC993730bxz, i, 2);
        int i2 = C993740by0.LIZ[enumC993730bxz.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new C1954807lC();
                }
                return;
            } else if (i >= C1183030gtJ.LIZ().waitLoopLimit) {
                this.LLJJJ.clear();
                LJL(0, l);
                return;
            } else {
                C786410Ut5.LJJZZIII(this.LLJLLL, new ARunnableS22S0201000_16(i, l, this, 4));
                return;
            }
        }
        if (z) {
            new AwS560S0100000_16(this, 830);
            if ((!((ArrayList) this.LLILZLL).isEmpty()) && ((ArrayList) this.LLILZLL).size() == 1) {
                if (!((ArrayList) this.LLILZLL).isEmpty()) {
                    for (C1187850h15 c1187850h15 : (ArrayList) ((InterfaceC1193730hAZ) ListProtector.get(this.LLILZLL, 0)).LJII().LLJ) {
                        EnumC1193710hAX enumC1193710hAX = c1187850h15.LIZIZ;
                        if (enumC1193710hAX == EnumC1193710hAX.END_NETWORK_SUCCESS || enumC1193710hAX == EnumC1193710hAX.END_NETWORK_FAIL || enumC1193710hAX == EnumC1193710hAX.END_RENDER || enumC1193710hAX == EnumC1193710hAX.PAGE_EXIT) {
                            ((ArrayList) this.LLJ).add(c1187850h15);
                        }
                    }
                    LJJZZI(this, EnumC1193720hAY.RENDER_FINISH);
                    return;
                }
                return;
            }
            LJJJLIIL();
            Long lLJJLIIIJJIZ = LJJLIIIJJIZ(EnumC1193710hAX.END_LCP_RENDER);
            if (lLJJLIIIJJIZ != null) {
                jCurrentTimeMillis = lLJJLIIIJJIZ.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            LJJLIIIJ(jCurrentTimeMillis, false);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws Throwable {
        C19EG c19egLIZ;
        if (event == Lifecycle.Event.ON_CREATE) {
            if (lifecycleOwner instanceof InterfaceC1187170gzz) {
                c19egLIZ = ((InterfaceC1187170gzz) lifecycleOwner).LIZ();
            } else {
                c19egLIZ = C724240Sb0.LIZ(lifecycleOwner);
            }
            if (c19egLIZ instanceof C19EG) {
                LJLIIIL(c19egLIZ);
                EnumC1193710hAX enumC1193710hAX = EnumC1193710hAX.END_PAGE_OPEN;
                if (LJJIZ(enumC1193710hAX, this.LLILLL) == null) {
                    ((ArrayList) this.LLJ).add(new C1187850h15(System.currentTimeMillis(), enumC1193710hAX));
                }
            }
            ((ArrayList) this.LLJ).add(new C1187850h15(System.currentTimeMillis(), EnumC1193710hAX.END_COMPONENT_CREATE));
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (((ArrayList) this.LLILZLL).isEmpty()) {
                LJLI();
                ((ArrayList) this.LLJ).add(new C1187850h15(System.currentTimeMillis(), EnumC1193710hAX.PAGE_EXIT));
            }
            LJJZZI(this, EnumC1193720hAY.COMPONENT_RELEASE);
            LJJLL();
            ((LinkedHashMap) this.LLJLLIL).clear();
            ((LinkedHashMap) this.LLJLL).clear();
            lifecycleOwner.getLifecycle().removeObserver(this);
            return;
        }
        if (event != Lifecycle.Event.ON_STOP) {
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LLJLLIL).entrySet()) {
            List list = (List) ((LinkedHashMap) this.LLJLL).get(entry.getKey());
            if (list != null) {
                list.add(((View) entry.getValue()).getViewTreeObserver());
            }
        }
    }

    public TrackerImpl(LifecycleOwner lifecycleOwner, String str, String str2, View view) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = view;
        ArrayList arrayList = new ArrayList();
        this.LLJ = arrayList;
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJJ = new LinkedHashSet();
        this.LLJJJIL = new LinkedHashMap();
        this.LLJJJJ = new LinkedHashMap();
        this.LLJJJJJIL = new ArrayList();
        this.LLJJJJLIIL = new LinkedHashMap();
        this.LLJJLIIIJLLLLLLLZ = Long.MAX_VALUE;
        this.LLJL = new LinkedHashMap();
        this.LLJLIL = new LinkedHashMap();
        ARunnableS118S0100000_18 aRunnableS118S0100000_18 = new ARunnableS118S0100000_18(this, 53);
        this.LLJLILLLLZIIL = aRunnableS118S0100000_18;
        this.LLJLL = new LinkedHashMap();
        this.LLJLLIL = new LinkedHashMap();
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LLJLLL = bPEAHandler;
        lifecycleOwner.getLifecycle().addObserver(this);
        arrayList.add(new C1187850h15(System.currentTimeMillis(), EnumC1193710hAX.NODE_CREATE));
        C786410Ut5.LJLIIL(C1183030gtJ.LIZ().timeout, bPEAHandler, aRunnableS118S0100000_18);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x025f  */
    /* JADX WARN: Type inference failed for: r0v161, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v179, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v185, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v194, types: [X.09AY, kotlin.jvm.functions.Function0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI(java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.Long r20, java.lang.Long r21, X.EnumC1193720hAY r22, java.lang.String r23, java.lang.Boolean r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tracker.TrackerImpl.LJJLJLI(java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, X.0hAY, java.lang.String, java.lang.Boolean):void");
    }
}
