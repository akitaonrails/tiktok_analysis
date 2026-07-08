package com.ss.android.ugc.aweme.minidrama.tab.v2;

import X.AbstractC214823195h;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0QSJ;
import X.C1220000hqw;
import X.C13LE;
import X.C1559210qg3;
import X.C1559260qg8;
import X.C20603715jn;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1572870r25;
import X.InterfaceC1577950rAH;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaCategoryContentListAssem;
import com.ss.android.ugc.aweme.series.feed.profile.view.SeriesFooterCell;
import defpackage.RecyclerViewFirstDrawWatcher;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaCategoryContentListAssem extends UIListContentAssem<DramaCategoryContentListModel> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public String LLIZLLLIL;
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C1559210qg3.class, "drama_category_content_list_page_key"), checkSupervisorPrepared());
    public final C736950SvV LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public volatile InterfaceC1577950rAH LLJJI;
    public InterfaceC665370Q7z LLJJIII;
    public C0QSJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DramaCategoryContentListAssem.class, "hostAbility", "getHostAbility()Lcom/ss/android/ugc/aweme/minidrama/tab/v2/ability/IDramaTopTabHostAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DramaTopTabMainFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DramaTopTabMainFragmentScope.class);
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 3;
        c20603715jn.LIZLLL = SeriesFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel Jo() {
        return (AssemListViewModel) this.LLJI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1577950rAH Lo() {
        /*
            r4 = this;
            X.0rAH r0 = r4.LLJJI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0rAH r0 = r4.LLJJI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIJI     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIII     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIII = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainFragmentScope> r1 = com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJI = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0rAH> r0 = X.InterfaceC1577950rAH.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0rAH r0 = (X.InterfaceC1577950rAH) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJI = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.tab.v2.DramaCategoryContentListAssem.Lo():X.0rAH");
    }

    public DramaCategoryContentListAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 755);
        this.LLJI = new C736950SvV(C13LE.LIZ(DramaCategoryContentListModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(224), new AwS568S0100000_24((AbstractC738140SxQ) this, 752), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 753));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 754));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 750));
        this.LLJILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1742));
        this.LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 749));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        final int iIntValue = ((Number) this.LLJILLL.getValue()).intValue();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(viewOnAttachStateChangeListenerC20604515jvGo.getContext(), iIntValue);
        gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.0r1q
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                if (i < this.LJ.Go().getState().LJIIIIZZ()) {
                    if (this.LJ.Go().getState().LJI(i) instanceof C1573110r2T) {
                        return 1;
                    }
                    return iIntValue;
                }
                return iIntValue;
            }
        };
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(gridLayoutManager);
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(DramaCategoryOverViewCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.setPadding(viewOnAttachStateChangeListenerC20604515jvGo.getPaddingLeft(), viewOnAttachStateChangeListenerC20604515jvGo.getPaddingTop(), viewOnAttachStateChangeListenerC20604515jvGo.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
        viewOnAttachStateChangeListenerC20604515jvGo.setClipToPadding(false);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.0r1s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1165890gRf) obj).LLILZ;
            }
        }, this, null, new AwS603S0100000_24(this, 148), new AwS568S0100000_24(this, 751), new AwS603S0100000_24(this, 149), 4, null);
        new RecyclerViewFirstDrawWatcher(Go(), AFwS213S0000000_24.get$arr$(242)).LIZIZ();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.LLJILJIL.getValue();
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new InterfaceC1572870r25() { // from class: X.0r1r
                @Override // X.InterfaceC1572870r25
                public final void LJFF() {
                    DramaCategoryContentListAssem dramaCategoryContentListAssem = this.LIZ;
                    dramaCategoryContentListAssem.LLIZLLLIL = "slide_down";
                    ((AssemSingleListViewModel) dramaCategoryContentListAssem.LLJI.getValue()).manualListRefresh();
                }
            });
        }
    }
}
