package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C01GW;
import X.C0HHT;
import X.C0PCU;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C325901Of;
import X.C356901a3;
import X.C452501pT;
import X.C659790PuL;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC435460H5s;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.ISearchPhotoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoImmersiveVM;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHideLabelAssem extends ReusedUIContentAssem<SearchHideLabelAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJJJJ;
    public final C1559260qg8 LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C01GW LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchHideLabelAssem.class, "searchVideoImmersiveVM", "getSearchVideoImmersiveVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoImmersiveVM;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchHideLabelAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchVideoImmersiveVM.class);
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 524), null, AFwS241S0000000_10.get$arr$(243));
        this.LLJJJJJIL = new C1559260qg8(new C723580SZw(this, C659790PuL.class, null), checkSupervisorPrepared());
        this.LLJJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 523));
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void cp() {
        if (this.LLJJJJLIIL) {
            for (View view : (List) this.LLJJL.getValue()) {
                if (view != null) {
                    C786410Ut5.T4(view, 0.0f);
                }
            }
            return;
        }
        for (View view2 : (List) this.LLJJL.getValue()) {
            if (view2 != null) {
                C786410Ut5.T4(view2, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchHideLabelAssem$onViewCreated$3, reason: invalid class name */
    public final class AnonymousClass3 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        public AnonymousClass3() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
            SearchHideLabelAssem.this.cp();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJJJJ;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        SearchVideoImmersiveVM searchVideoImmersiveVM = (SearchVideoImmersiveVM) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0]);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        searchVideoImmersiveVM.getClass();
        searchVideoImmersiveVM.LL = (ISearchVideoHolderAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ISearchVideoHolderAbility.class, null);
        searchVideoImmersiveVM.LLILLJJLI = (ISearchPhotoHolderAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ISearchPhotoHolderAbility.class, null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0PwC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C594640NTy) obj).LL;
            }
        }, null, AFwS293S0000000_10.get$arr$(21), 6);
        C325901Of.LIZ(this, new AnonymousClass3());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC435460H5s r5) {
        /*
            r4 = this;
            X.0H5s r5 = (X.InterfaceC435460H5s) r5
            boolean r0 = X.C301450Brj.LIZ()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L23
            boolean r0 = r5 instanceof X.C659520Ptu
            if (r0 == 0) goto L8a
            X.0Ptu r5 = (X.C659520Ptu) r5
            java.lang.Object r1 = r5.LLILZ
            boolean r0 = r1 instanceof X.InterfaceC657170Pq7
            if (r0 == 0) goto La1
            X.0Pq7 r1 = (X.InterfaceC657170Pq7) r1
            if (r1 == 0) goto La1
            boolean r0 = r1.LIZIZ()
            if (r0 != r2) goto La1
        L20:
            r0 = 1
        L21:
            r4.LLJJJJLIIL = r0
        L23:
            X.06qJ r1 = r4.LLJJJJ
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchHideLabelAssem.LLJJLIIIJLLLLLLLZ
            r0 = r0[r3]
            java.lang.Object r3 = r1.getValue(r4, r0)
            com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoImmersiveVM r3 = (com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoImmersiveVM) r3
            r3.getClass()
            r0 = 562(0x232, float:7.88E-43)
            kotlin.jvm.internal.AFwS241S0000000_10 r0 = kotlin.jvm.internal.AFwS241S0000000_10.get$arr$(r0)
            r3.setStateImmediate(r0)
            com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.ISearchPhotoHolderAbility r1 = r3.LLILLJJLI
            if (r1 == 0) goto L44
            Y.AObjectS353S0100000_10 r0 = r3.LLILZ
            r1.fS(r0)
        L44:
            java.lang.Object r0 = r3.getItem()
            X.0H5s r0 = (X.InterfaceC435460H5s) r0
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
            if (r1 == 0) goto L89
            boolean r0 = r1.hasVisionSearchEntry()
            if (r0 != 0) goto L89
            boolean r0 = r1.isAd()
            if (r0 != 0) goto L89
            com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility r0 = r3.LL
            if (r0 == 0) goto L6d
            X.0Px3 r1 = r0.X4()
            if (r1 == 0) goto L6d
            X.0Pw9 r0 = r3.LLILLL
            r1.LIZLLL(r0)
        L6d:
            com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.ISearchPhotoHolderAbility r1 = r3.LLILLJJLI
            if (r1 == 0) goto L76
            Y.AObjectS353S0100000_10 r0 = r3.LLILZ
            r1.Y02(r0)
        L76:
            com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.ISearchPhotoHolderAbility r0 = r3.LLILLJJLI
            if (r0 == 0) goto L89
            boolean r0 = r0.aq1()
            if (r0 != r2) goto L89
            r0 = 563(0x233, float:7.89E-43)
            kotlin.jvm.internal.AFwS241S0000000_10 r0 = kotlin.jvm.internal.AFwS241S0000000_10.get$arr$(r0)
            r3.setStateImmediate(r0)
        L89:
            return
        L8a:
            boolean r0 = r5 instanceof X.C659750PuH
            if (r0 == 0) goto La1
            X.0PuH r5 = (X.C659750PuH) r5
            java.lang.Object r1 = r5.LLILZ
            boolean r0 = r1 instanceof X.InterfaceC657170Pq7
            if (r0 == 0) goto La1
            X.0Pq7 r1 = (X.InterfaceC657170Pq7) r1
            if (r1 == 0) goto La1
            boolean r0 = r1.LIZIZ()
            if (r0 != r2) goto La1
            goto L20
        La1:
            r0 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchHideLabelAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return C0PCU.LIZIZ();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC435460H5s interfaceC435460H5s) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
