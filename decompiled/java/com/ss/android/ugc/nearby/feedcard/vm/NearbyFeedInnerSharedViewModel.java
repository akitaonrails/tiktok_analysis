package com.ss.android.ugc.nearby.feedcard.vm;

import X.C07WA;
import X.C099F;
import X.C09R9;
import X.C0OCC;
import X.C0PEM;
import X.C1165730gRP;
import X.C1203730hQh;
import X.C1203850hQt;
import X.C1204080hRG;
import X.C1204470hRt;
import X.C1204510hRx;
import X.C1204670hSD;
import X.C1210880hcE;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1DEV;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2191201ApK;
import X.C23250099c;
import X.C322970ClL;
import X.C322980ClM;
import X.C484220Iyq;
import X.C622680Oba;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1204490hRv;
import X.InterfaceC1209780haS;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyFeedInnerSharedViewModel extends BaseDetailShareVM<C1204510hRx, InterfaceC1204490hRv, C07WA> {
    public final C09R9 LLILZIL;
    public ILoadMoreAbility LLILZLL;
    public volatile boolean LLIZ;
    public final C1204670hSD LLIZLLLIL;
    public volatile long LLJ;
    public final C1DEV LLJI;
    public C1204080hRG LLJIJIL;
    public final List<C1204470hRt> LLJILJIL;
    public volatile C099F LLJILJILJ;
    public final RoamingLocationInfo LLJILLL;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 32;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1204510hRx(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void unInit() {
        ILoadMoreAbility iLoadMoreAbility = this.LLILZLL;
        if (iLoadMoreAbility != null) {
            iLoadMoreAbility.jb1(this.LLIZLLLIL);
        }
        this.LLILZLL = null;
        this.LLIZ = false;
        super.unInit();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0hSD] */
    public NearbyFeedInnerSharedViewModel() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyFeedInnerSharedViewModel init hash=");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZIL = new C09R9(this, C13LE.LIZ(C1203850hQt.class));
        this.LLIZLLLIL = new C0OCC() { // from class: X.0hSD
            @Override // X.C0OCC, X.InterfaceC1603270rp7
            public final void onShow() {
                if (this.LL.LLIZ) {
                    return;
                }
                this.LL.LLIZ = true;
                C1205260hTA c1205260hTA = C1205260hTA.LIZ;
                Long lValueOf = Long.valueOf(this.LL.LLJ);
                Integer numValueOf = Integer.valueOf(((ArrayList) this.LL.LLJILJIL).size());
                c1205260hTA.getClass();
                C1205260hTA.LJIIIZ(numValueOf, lValueOf, "inner_feed");
            }
        };
        this.LLJI = C2191201ApK.LIZ();
        this.LLJILJIL = new ArrayList();
        C1203730hQh.LIZ.getClass();
        this.LLJILLL = C1203730hQh.LIZ();
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322970ClL(this, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C622680Oba.LIZJ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        BaseListFragmentPanel baseListFragmentPanel;
        super.bindView(interfaceC1209780haS);
        this.LLIZ = false;
        ILoadMoreAbility iLoadMoreAbility = null;
        if ((interfaceC1209780haS instanceof DetailFragmentPanel) && (baseListFragmentPanel = (BaseListFragmentPanel) interfaceC1209780haS) != null) {
            iLoadMoreAbility = baseListFragmentPanel.LLILZLL;
        }
        this.LLILZLL = iLoadMoreAbility;
        if (iLoadMoreAbility != null) {
            iLoadMoreAbility.jb1(this.LLIZLLLIL);
            iLoadMoreAbility.p41(this.LLIZLLLIL);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C07WA c07wa = (C07WA) obj;
        super.manualListLoadMore(c07wa);
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322980ClM(this, c07wa, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1204490hRv> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 602));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        String string;
        try {
            if (TextUtils.equals("videoReportSuccess", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) && (string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "object_id")) != null && string.length() != 0) {
                vQ2(string);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("something was wrong with onJsBroadCastEvent, e=");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C07WA>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1204630hS9
            if (r0 == 0) goto L6b
            r6 = r8
            X.0hS9 r6 = (X.C1204630hS9) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L54
            if (r0 != r4) goto L8e
            X.C155000ia.LIZIZ(r1)
        L23:
            r0 = 0
            r7.LLJ = r0
            X.0hRG r0 = r7.LLJIJIL
            if (r0 == 0) goto L7c
            java.util.List<X.0hRv> r6 = r0.LIZ
            if (r6 == 0) goto L7c
            long r2 = r7.LLJ
            r0 = 1
            long r2 = r2 + r0
            r7.LLJ = r2
            X.0hRG r0 = r7.LLJIJIL
            if (r0 == 0) goto L71
            java.lang.Boolean r1 = r0.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L71
            X.0CcB r3 = X.AbstractC316870CbV.LIZ
            X.07WA r2 = new X.07WA
            long r0 = r7.LLJ
            r2.<init>(r0)
            X.0Cm0 r0 = X.C317290CcB.LJ(r3, r5, r2, r6, r4)
            return r0
        L54:
            X.C155000ia.LIZIZ(r1)
            X.099F r0 = r7.LLJILJILJ
            if (r0 == 0) goto L23
            X.05W6 r2 = new X.05W6
            r2.<init>(r0, r5)
            r6.LLILLL = r4
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.C099A.LIZJ(r0, r2, r6)
            if (r0 != r3) goto L23
            return r3
        L6b:
            X.0hS9 r6 = new X.0hS9
            r6.<init>(r7, r8)
            goto L12
        L71:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r6)
            return r0
        L7c:
            X.0CcB r2 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "first page data is null"
            r1.<init>(r0)
            r2.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedInnerSharedViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String aid;
        Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
        int i = 0;
        while (true) {
            Aweme aweme = null;
            if (it2.hasNext()) {
                Aweme aweme2 = ((C1204470hRt) it2.next()).LL;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str)) {
                    if (i >= 0) {
                        C1204470hRt c1204470hRt = (C1204470hRt) ListProtector.get(this.LLJILJIL, i);
                        if (c1204470hRt != null) {
                            aweme = c1204470hRt.LL;
                        }
                        C1440005kM.LIZ(new C1210880hcE("homepage_nearby", "FUNCTION_FROM_NOT_INTERESTED", "not_interested", aweme));
                        ListProtector.remove(this.LLJILJIL, i);
                        listRemoveItemAt(i);
                    }
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC1204490hRv interfaceC1204490hRv = (InterfaceC1204490hRv) interfaceC1891350zJl;
        if (interfaceC1204490hRv instanceof C1204470hRt) {
            return ((C1204470hRt) interfaceC1204490hRv).LL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final List zQ2(InterfaceC636340Oxc interfaceC636340Oxc) {
        return this.LLJILJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(long r26, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends X.EnumC1204140hRM, X.C1204080hRG>> r28) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedInnerSharedViewModel.BQ2(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(long r6, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends X.EnumC1204140hRM, X.C1204080hRG>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1204650hSB
            if (r0 == 0) goto L5c
            r4 = r8
            X.0hSB r4 = (X.C1204650hSB) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L62
            X.C155000ia.LIZIZ(r3)
        L22:
            return r3
        L23:
            X.C155000ia.LIZIZ(r3)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            r3 = 0
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L36
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L36
            goto L3b
        L36:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L3b:
            if (r0 != 0) goto L53
            X.0hNI r2 = X.C1201620hNI.LIZ
            X.0hNK r1 = X.EnumC1201640hNK.NETWORK_ERR
            X.0hRB r0 = X.EnumC1204030hRB.INNER_LOAD_MORE
            java.lang.String r0 = r0.getSceneStr()
            r2.LJI(r1, r3, r3, r0)
            X.0hRM r2 = X.EnumC1204140hRM.NO_NETWORK
            kotlin.Pair r1 = new kotlin.Pair
            r0 = 0
            r1.<init>(r2, r0)
            return r1
        L53:
            r4.LLILLL = r1
            java.lang.Object r3 = r5.BQ2(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L5c:
            X.0hSB r4 = new X.0hSB
            r4.<init>(r5, r8)
            goto L12
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedInnerSharedViewModel.CQ2(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[Catch: all -> 0x01aa, TRY_LEAVE, TryCatch #0 {all -> 0x01aa, blocks: (B:23:0x007f, B:24:0x0082, B:26:0x0092, B:30:0x00d0, B:32:0x00ea, B:33:0x00f8, B:35:0x00fe, B:37:0x0108, B:40:0x010e, B:41:0x0112, B:42:0x011b, B:43:0x012e, B:45:0x0134, B:47:0x013e, B:48:0x0142, B:50:0x0148, B:52:0x0161, B:53:0x0176, B:56:0x0184), top: B:65:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: DQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C07WA r11, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C07WA>> r12) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedInnerSharedViewModel.onLoadMore(X.07WA, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C07WA yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return new C07WA(this.LLJ);
    }
}
