package com.ss.android.ugc.aweme.videohotswap.service;

import X.AnonymousClass0957;
import X.C01GW;
import X.C05NC;
import X.C0PEM;
import X.C0S81;
import X.C0S88;
import X.C0S89;
import X.C0S8A;
import X.C0S8B;
import X.C0S8N;
import X.C0S8O;
import X.C0S8S;
import X.C0S8V;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C15438062q;
import X.C19719912Dl;
import X.C23250099c;
import X.C452501pT;
import X.C716200S7m;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import X.InterfaceC717360SBy;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger;
import com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PaidContentVideoHotSwapServiceImpl implements IPaidContentVideoHotSwapService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(247));
    public final List<C0S89<?>> LIZIZ = new CopyOnWriteArrayList();
    public final List<C0S8V> LIZJ = new CopyOnWriteArrayList();
    public final ConcurrentHashMap<String, AnonymousClass0957<Unit>> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LJ = new ConcurrentHashMap<>();
    public final C01GW LJFF = C452501pT.LIZIZ(new C05NC());
    public final C01GW LJI = C452501pT.LIZIZ(new C0S8N());

    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final C19719912Dl LIZIZ() {
        return C13LE.LIZ(StoryPaywallComponentTrigger.class);
    }

    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final C19719912Dl LJI() {
        return C13LE.LIZ(PaywallComponentTrigger.class);
    }

    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final void LJIIJJI() {
    }

    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final StoryPaywallComponentTrigger LJIIJ() {
        return new StoryPaywallComponentTrigger();
    }

    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final void LIZJ(C0S89<?> c0s89) {
        List<C0S89<?>> list = this.LIZIZ;
        if (!(list instanceof Collection) || !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it2 = ((CopyOnWriteArrayList) list).iterator();
            while (it2.hasNext()) {
                if (it2.next().getClass() == c0s89.getClass()) {
                    return;
                }
            }
        }
        ((CopyOnWriteArrayList) this.LIZIZ).add(c0s89);
        C1440005kM.LIZ(new C716200S7m());
    }

    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final void LJIIIZ(C0S8V c0s8v) {
        ((CopyOnWriteArrayList) this.LIZJ).add(c0s8v);
        C1440005kM.LIZ(new C716200S7m());
    }

    public static final List<C0S81> LJIIL(List<C0S81> list, List<? extends Aweme> list2) {
        Aweme next;
        ArrayList arrayList = new ArrayList();
        for (C0S81 c0s81 : list) {
            C0S8V c0s8v = c0s81.LIZIZ;
            Aweme aweme = c0s81.LIZ;
            c0s8v.getClass();
            String aid = aweme.getAid();
            Iterator<? extends Aweme> it2 = list2.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.LJFF(next.getAid(), aid));
            Aweme aweme2 = next;
            if (aweme2 != null) {
                arrayList.add(new C0S81(aweme2, c0s81.LIZIZ));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final C0S8V LIZ(Aweme aweme, List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C0S81) next).LIZIZ.LIZJ(aweme)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0S81 c0s81 = (C0S81) next;
        if (c0s81 == null) {
            return null;
        }
        return c0s81.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final List<Aweme> LJFF(List<? extends Aweme> list, List<C0S81> list2) {
        Object next;
        Aweme aweme;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Aweme aweme2 : list) {
            Iterator it2 = ((ArrayList) list2).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C0S81 c0s81 = (C0S81) next;
                    c0s81.LIZIZ.getClass();
                    if (Intrinsics.LJFF(aweme2.getAid(), c0s81.LIZ.getAid())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0S81 c0s812 = (C0S81) next;
            if (c0s812 != null && (aweme = c0s812.LIZ) != null) {
                aweme2 = aweme;
            }
            arrayList.add(aweme2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC586210Myx LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme r4, boolean r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L8d
            java.util.List<X.0S89<?>> r1 = r3.LIZIZ
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 1
            if (r0 == 0) goto L59
            r0 = r1
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L59
        L12:
            java.util.List<X.0S8V> r1 = r3.LIZJ
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L72
            r0 = r1
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L72
        L21:
            com.ss.android.ugc.aweme.feed.model.ContentModel r0 = r4.getContentModel()
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.feed.model.StandardBusinessModel r0 = r0.standardBusinessModel
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.feed.model.SubOnlyVideo r0 = r0.getSubOnlyVideo()
            if (r0 == 0) goto L51
            java.lang.Boolean r1 = r0.getShouldShowPaywall()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L51
            X.01GW r0 = r3.LJI
            java.lang.Object r1 = r0.getValue()
            X.0K77 r1 = (X.C0K77) r1
            if (r1 == 0) goto L54
            com.ss.android.ugc.aweme.profile.model.User r0 = r4.getAuthor()
            boolean r0 = r1.LJJI(r0)
            if (r0 != r2) goto L54
        L51:
            X.0Myx r0 = X.EnumC586210Myx.NONE
            return r0
        L54:
            if (r5 == 0) goto L51
            X.0Myx r0 = X.EnumC586210Myx.FYP_PREVIEW
            return r0
        L59:
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L5f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r1.next()
            X.0S89 r0 = (X.C0S89) r0
            boolean r0 = r0.LJI(r4, r5)
            if (r0 == 0) goto L5f
            goto L8a
        L72:
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L78:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            X.0S8V r0 = (X.C0S8V) r0
            boolean r0 = r0.LIZJ(r4)
            if (r0 == 0) goto L78
        L8a:
            X.0Myx r0 = X.EnumC586210Myx.VHS
            return r0
        L8d:
            X.0Myx r0 = X.EnumC586210Myx.NONE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):X.0Myx");
    }

    public final C0S8A<Object> LJIILJJIL(Aweme aweme, boolean z) {
        C0S89<?> next;
        C0S8A<Object> c0s8a;
        Iterator<C0S89<?>> it2 = this.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LJI(aweme, z)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0S89<?> c0s89 = next;
        if (c0s89 != null) {
            c0s8a = new C0S8A<>(aweme, z, c0s89);
        } else {
            c0s8a = null;
        }
        if (!(c0s8a instanceof C0S8A)) {
            return null;
        }
        return c0s8a;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0S8G] */
    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final C0S8S LJ(View view, final Function0<String> function0, final Function0<String> function02, final Function0<String> function03, final Function0<? extends Aweme> function04, final Function0<? extends InterfaceC665370Q7z> function05, final Function1<? super Boolean, Unit> function1) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.video_hot_swap_overlay_view);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.video_hot_swap_paywall_view);
        C0S8S c0s8s = new C0S8S(frameLayout, frameLayout2, new InterfaceC717360SBy() { // from class: X.0S8G
            @Override // X.InterfaceC717360SBy
            public final InterfaceC665370Q7z LLIIJLIL() {
                return function05.invoke();
            }

            @Override // X.InterfaceC717360SBy
            public final String getEnterFrom() {
                return function0.invoke();
            }

            @Override // X.InterfaceC717360SBy
            public final String getFrom() {
                return function02.invoke();
            }

            @Override // X.InterfaceC717360SBy
            public final void LIZ(boolean z) {
                function1.invoke(Boolean.valueOf(z));
            }
        });
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        return c0s8s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(com.ss.android.ugc.aweme.feed.model.Aweme r32, java.util.List<X.C0S8A<java.lang.Object>> r33, androidx.lifecycle.LifecycleCoroutineScope r34, X.C0S8H r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, boolean r39, X.InterfaceC1364105Vn<? super kotlin.Unit> r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl.LJIILIIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.List, androidx.lifecycle.LifecycleCoroutineScope, X.0S8H, java.lang.String, java.lang.String, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService
    public final void LIZLLL(Aweme aweme, List list, int i, boolean z, String str, String str2, String str3, LifecycleCoroutineScope lifecycleCoroutineScope, C0S88 c0s88, C0S8O c0s8o) {
        C23250099c.LIZLLL(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C0S8B(this, C13LP.LLIIII(list), i, aweme, z, lifecycleCoroutineScope, c0s88, str, str2, str3, c0s8o, null), 2);
    }
}
