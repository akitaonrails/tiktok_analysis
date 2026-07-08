package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C07H8;
import X.C098200Yq;
import X.C09R3;
import X.C0HHT;
import X.C0Q6K;
import X.C0QCK;
import X.C1012300cRw;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C661470Px3;
import X.C661490Px5;
import X.C664730Q5n;
import X.C664790Q5t;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC661540PxA;
import X.InterfaceC664630Q5d;
import X.InterfaceC664660Q5g;
import X.InterfaceC712990Rxx;
import X.InterfaceC724760Sbq;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel.SearchEllipsisVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleViewVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS61S1000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCLASubtitleCommonAssem extends ReusedAssem<SearchCLASubtitleCommonAssem> implements ISearchCLASubtitleAbility, InterfaceC712990Rxx<InterfaceC664660Q5g>, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C0QCK LLJJ = new C0QCK(InterfaceC664630Q5d.class);
    public C1012300cRw LLJJI;
    public TextView LLJJIII;
    public C661470Px3 LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public Aweme LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchCLASubtitleCommonAssem.class, "searchCLASubtitleViewAbility", "getSearchCLASubtitleViewAbility()Ltiktok/communication/LazyAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchCLASubtitleCommonAssem.class, "subtitleViewVM", "getSubtitleViewVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchCLASubtitleViewVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SearchCLASubtitleCommonAssem.class, "subtitleVM", "getSubtitleVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchCLASubtitleVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SearchCLASubtitleCommonAssem.class, "searchEllipsisVM", "getSearchEllipsisVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/ellipsis/core/viewmodel/SearchEllipsisVM;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public SearchCLASubtitleCommonAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchCLASubtitleViewVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 520), null, AFwS241S0000000_10.get$arr$(240));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SearchCLASubtitleVM.class);
        this.LLJJIJIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ2, 521), null, AFwS241S0000000_10.get$arr$(241));
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SearchEllipsisVM.class);
        this.LLJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), interfaceC724760SbqLJJJIL, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ3, 522), null, AFwS241S0000000_10.get$arr$(242));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C664790Q5t(this, null));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.ISearchCLASubtitleAbility
    public final void TN2() {
        C661470Px3 c661470Px3;
        InterfaceC661540PxA interfaceC661540PxA;
        Eo(false);
        if (!C07H8.LIZJ() || !Fp1() || (c661470Px3 = this.LLJJIJI) == null || (interfaceC661540PxA = c661470Px3.LLJ) == null) {
            return;
        }
        interfaceC661540PxA.LJ();
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchCLASubtitleScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCLASubtitleScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1141746704) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.ISearchCLASubtitleAbility
    public final void xH0() {
        Eo(false);
    }

    public final SearchCLASubtitleViewVM Ao() {
        return (SearchCLASubtitleViewVM) this.LLJJIJIIJIL.getValue(this, LLJJJJLIIL[1]);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.ISearchCLASubtitleAbility
    public final boolean Fp1() {
        Aweme aweme = this.LLJJJIL;
        if (aweme == null) {
            return false;
        }
        C664730Q5n.LIZ.getClass();
        return C664730Q5n.LJFF(aweme);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C0QCK c0qck = this.LLJJ;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        c0qck.LIZ(this).LIZIZ(this, new AwS589S0100000_10(this, 218));
        C736680Sv4.LJIIIIZZ(this, Ao(), new C2217381BqS() { // from class: X.0Q62
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q67) obj).LL;
            }
        }, null, AFwS293S0000000_10.get$arr$(17), 6);
        C736680Sv4.LJIIIIZZ(this, Ao(), new C2217381BqS() { // from class: X.0Q6A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q67) obj).LLILLJJLI;
            }
        }, null, AFwS293S0000000_10.get$arr$(18), 6);
        C736680Sv4.LJIIIIZZ(this, zo(), new C2217381BqS() { // from class: X.0Q5c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C664740Q5o) obj).LL;
            }
        }, null, AFwS293S0000000_10.get$arr$(19), 6);
        C736680Sv4.LJIIIIZZ(this, zo(), new C2217381BqS() { // from class: X.0Q5x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C664740Q5o) obj).LLILLJJLI;
            }
        }, null, AFwS293S0000000_10.get$arr$(20), 6);
        C736680Sv4.LJIIIIZZ(this, zo(), new C2217381BqS() { // from class: X.0Q5z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C664740Q5o) obj).LLILLL;
            }
        }, null, AFwS293S0000000_10.get$arr$(14), 6);
        C736680Sv4.LJIIIIZZ(this, zo(), new C2217381BqS() { // from class: X.0Q61
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C664740Q5o) obj).LLILZ;
            }
        }, null, AFwS293S0000000_10.get$arr$(15), 6);
        AssemViewModel.asyncSubscribe$default(zo(), new C2217381BqS() { // from class: X.0Q5v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C664740Q5o) obj).LLILZIL;
            }
        }, null, AFwS241S0000000_10.get$arr$(239), null, new AwS589S0100000_10(this, 219), 10, null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJ.getValue(this, interfaceC2217461BqaArr[3]), new C2217381BqS() { // from class: X.0Q65
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HXC) obj).LL;
            }
        }, null, AFwS293S0000000_10.get$arr$(16), 6);
    }

    public final SearchCLASubtitleVM zo() {
        return (SearchCLASubtitleVM) this.LLJJIJIL.getValue(this, LLJJJJLIIL[2]);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        try {
            C1558520qew.LIZLLL(this);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void Bo(Aweme aweme) {
        C661490Px5 dataProvider;
        C661470Px3 c661470Px3 = this.LLJJIJI;
        if (c661470Px3 != null) {
            dataProvider = c661470Px3.getDataProvider();
        } else {
            dataProvider = null;
        }
        C664730Q5n.LIZ.getClass();
        boolean zLJFF = C664730Q5n.LJFF(aweme);
        if (dataProvider != null) {
            dataProvider.LJJIIJ = true;
            dataProvider.LJJIII = zLJFF;
            dataProvider.LJJIIZ = zLJFF;
            dataProvider.LJJIIJZLJL = C0Q6K.LIZ(aweme);
        }
    }

    public final void Co(boolean z) {
        this.LLJJJJ = z;
        if (!z) {
            TextView textView = this.LLJJIII;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            C1012300cRw c1012300cRw = this.LLJJI;
            if (c1012300cRw != null) {
                C786410Ut5.r1(c1012300cRw, 8);
            }
        }
    }

    public final void Eo(boolean z) {
        if (z && this.LLJJJJ && this.LLJJJJJIL) {
            C1012300cRw c1012300cRw = this.LLJJI;
            if (c1012300cRw != null) {
                C786410Ut5.r1(c1012300cRw, 0);
                return;
            }
            return;
        }
        TextView textView = this.LLJJIII;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        C1012300cRw c1012300cRw2 = this.LLJJI;
        if (c1012300cRw2 == null) {
            return;
        }
        C786410Ut5.r1(c1012300cRw2, 8);
    }

    public final void Fo(boolean z) {
        if (z && !this.LLJJJJJIL) {
            SearchCLASubtitleViewVM searchCLASubtitleViewVMAo = Ao();
            searchCLASubtitleViewVMAo.getClass();
            searchCLASubtitleViewVMAo.setState(new AwS61S1000000_10("", 20));
        }
        this.LLJJJJJIL = z;
        if (!z) {
            TextView textView = this.LLJJIII;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            C1012300cRw c1012300cRw = this.LLJJI;
            if (c1012300cRw != null) {
                C786410Ut5.r1(c1012300cRw, 8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r1.LIZ() == true) goto L31;
     */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC664660Q5g r7) {
        /*
            r6 = this;
            X.0Q5g r7 = (X.InterfaceC664660Q5g) r7
            X.0Q5f r0 = r7.LLJLLIL()
            r3 = 0
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LIZ
        Lb:
            r6.LLJJJIL = r0
            r4 = 0
            r6.Fo(r4)
            com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleViewVM r5 = r6.Ao()
            r5.getClass()
            kotlin.jvm.internal.AwS61S1000000_10 r2 = new kotlin.jvm.internal.AwS61S1000000_10
            java.lang.String r1 = ""
            r0 = 20
            r2.<init>(r1, r0)
            r5.setState(r2)
            r6.Eo(r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LLJJJIL
            if (r0 == 0) goto L2e
            r6.Bo(r0)
        L2e:
            X.0Q5f r0 = r7.LLJLLIL()
            r2 = 1
            if (r0 == 0) goto L69
            boolean r0 = r0.LJ
            if (r0 != r2) goto L69
            X.0Q5f r0 = r7.LLJLLIL()
            if (r0 == 0) goto L69
            boolean r0 = r0.LIZLLL
            if (r0 != 0) goto L69
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LLJJJIL
            boolean r0 = X.C0Q6K.LIZ(r0)
            if (r0 == 0) goto L69
            boolean r0 = X.C301450Brj.LIZ()
            if (r0 == 0) goto L78
            boolean r0 = r7 instanceof X.C659520Ptu
            if (r0 == 0) goto L74
            X.0Ptu r7 = (X.C659520Ptu) r7
            if (r7 == 0) goto L74
            java.lang.Object r1 = r7.LLILZ
        L5b:
            boolean r0 = r1 instanceof X.InterfaceC660760Pvu
            if (r0 == 0) goto L78
            X.0Pvu r1 = (X.InterfaceC660760Pvu) r1
            if (r1 == 0) goto L78
            boolean r0 = r1.LIZ()
            if (r0 != r2) goto L78
        L69:
            r6.Co(r4)
            X.0Px3 r0 = r6.LLJJIJI
            if (r0 == 0) goto L73
            r0.setISubInfoListener(r3)
        L73:
            return
        L74:
            r1 = r3
            goto L5b
        L76:
            r0 = r3
            goto Lb
        L78:
            X.0Px3 r1 = r6.LLJJIJI
            if (r1 == 0) goto L85
            com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleVM r0 = r6.zo()
            X.0Q66 r0 = r0.LL
            r1.setISubInfoListener(r0)
        L85:
            r6.Co(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleCommonAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC664660Q5g interfaceC664660Q5g) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC664660Q5g interfaceC664660Q5g) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
