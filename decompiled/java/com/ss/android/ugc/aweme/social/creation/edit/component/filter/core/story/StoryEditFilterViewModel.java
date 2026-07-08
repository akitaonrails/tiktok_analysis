package com.ss.android.ugc.aweme.social.creation.edit.component.filter.core.story;

import X.C01GW;
import X.C09AE;
import X.C09JN;
import X.C0LCS;
import X.C11NJ;
import X.C13LE;
import X.C1453000nuk;
import X.C1453210nv5;
import X.C1638440sjq;
import X.C1664770tQJ;
import X.C194561119z;
import X.C1DRG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C2296808zG;
import X.C452501pT;
import X.InterfaceC1453020num;
import X.InterfaceC1453220nv6;
import X.InterfaceC1455860nzM;
import X.InterfaceC1639870sm9;
import X.InterfaceC1644080ssw;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC358220E2q;
import X.InterfaceC379610EuV;
import X.InterfaceC497601wk;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public class StoryEditFilterViewModel extends LifecycleAwareViewModel<StoryEditFilterState> implements InterfaceC1453020num, InterfaceC1644080ssw, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C1DRG LLILZLL;
    public final InterfaceC1639870sm9 LLIZ;
    public final InterfaceC1644080ssw LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 356));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 357));
    public final MutableLiveData<Boolean> LLJILJIL;
    public final LiveData<Boolean> LLJILJILJ;
    public final C11NJ LLJILLL;
    public final C01GW LLJJ;
    public C09AE LLJJI;
    public int LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryEditFilterViewModel.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIIJIL = 8;
    }

    private final InterfaceC358220E2q oR2() {
        return (InterfaceC358220E2q) this.LLJI.getValue();
    }

    private final InterfaceC1453220nv6 pR2() {
        return (InterfaceC1453220nv6) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public StoryEditFilterState zQ2() {
        return new StoryEditFilterState(null, new C0LCS(null), null, C2097608Jq.LJ(), new C194561119z());
    }

    public final InterfaceC497601wk lR2() {
        return (InterfaceC497601wk) this.LLJJ.getValue();
    }

    public final InterfaceC1455860nzM nR2() {
        return (InterfaceC1455860nzM) this.LLJ.getValue(this, LLJJIJI[0]);
    }

    @Override // X.InterfaceC1453020num
    public void pp() {
        setState(AFwS266S0000000_25.get$arr$(188));
    }

    @Override // X.InterfaceC1453020num
    public void E4() {
        nR2().E4();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.LLJILLL.LJ();
        C2296808zG.LIZJ(lR2(), null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public void onStart() {
        super.onStart();
        this.LLIZ.LJJI().LIZ().observe(this, new AObserverS227S0100000_25(this, 29));
        this.LLJILLL.LIZ(this.LLIZ.LIZIZ(false).LJJLL(new AfS194S0100000_25(this, 26), new C09JN() { // from class: X.0sjh
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("StoryEditFilterViewModel@5ed9.onStart$3");
                C2281251EQx.LIZ.LJFF("filter", "", "", (Throwable) obj, false);
                C1C7U.LIZIZ("StoryEditFilterViewModel@5ed9.onStart$3");
            }
        }));
    }

    @Override // X.InterfaceC1453020num
    public void u() {
        nR2().u();
    }

    @Override // X.InterfaceC1453020num
    public LiveData<Boolean> bw() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    public final InterfaceC1644080ssw mR2() {
        return this.LLIZLLLIL;
    }

    public final InterfaceC1639870sm9 qR2() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1453020num
    public void Fv(boolean z) {
        this.LLJILJIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1453020num
    public void H52(boolean z) {
        if (!z) {
            this.LLIZ.LJIJJ();
        } else if (this.LLJJIII != -1) {
            this.LLIZ.LJIJI(-1, true);
        }
        setState(new AwS37S0010000_25(z, 14));
    }

    public final void kR2(C1638440sjq c1638440sjq) {
        withState(new AwS391S0200000_25(this, c1638440sjq, 81));
    }

    @Override // X.InterfaceC1453020num
    public void l4(boolean z) {
        nR2().l4(z);
        setState(AFwS266S0000000_25.get$arr$(187));
        this.LLIZLLLIL.BG0(null, false, null);
    }

    public final void rR2(int i) {
        this.LLJJIII = i;
    }

    @Override // X.InterfaceC1644080ssw
    public void Ch2(float f, boolean z) {
        this.LLIZLLLIL.Ch2(f, z);
    }

    @Override // X.InterfaceC1644080ssw
    public void Zk2(boolean z, FilterBean filterBean) {
        this.LLIZLLLIL.Zk2(z, filterBean);
    }

    @Override // X.InterfaceC1644080ssw
    public void gi2(String str, String str2) {
        this.LLIZLLLIL.gi2(str, str2);
    }

    public StoryEditFilterViewModel(C1DRG c1drg, InterfaceC1639870sm9 interfaceC1639870sm9, InterfaceC1644080ssw interfaceC1644080ssw) {
        this.LLILZLL = c1drg;
        this.LLIZ = interfaceC1639870sm9;
        this.LLIZLLLIL = interfaceC1644080ssw;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLJILJIL = mutableLiveData;
        this.LLJILJILJ = mutableLiveData;
        this.LLJILLL = new C11NJ();
        this.LLJJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(186));
        this.LLJJIII = -1;
    }

    @Override // X.InterfaceC1644080ssw
    public void BG0(C1453000nuk c1453000nuk, boolean z, Context context) {
        this.LLIZLLLIL.BG0(c1453000nuk, z, context);
    }

    @Override // X.InterfaceC1453020num
    public void Aw(FilterBean filterBean, boolean z, boolean z2, Context context) {
        setState(new AwS604S0100000_25(filterBean, 224));
    }

    @Override // X.InterfaceC1453020num
    public void mc2(FilterBean filterBean, boolean z, boolean z2, Context context) {
        sR2(filterBean, z, z2, context);
        setState(new AwS604S0100000_25(filterBean, 225));
    }

    public void sR2(FilterBean filterBean, boolean z, boolean z2, Context context) {
        if (filterBean != null) {
            nR2().pn2(new C1453000nuk(false, filterBean, z2, this.LLIZ.LJIIL().LIZJ(filterBean.getId()), false, 48));
            this.LLIZLLLIL.BG0(new C1453000nuk(false, filterBean, false, (String) null, false, 60), z, context);
            InterfaceC1644080ssw interfaceC1644080ssw = this.LLIZLLLIL;
            InterfaceC358220E2q interfaceC358220E2qOR2 = oR2();
            InterfaceC1453220nv6 interfaceC1453220nv6PR2 = pR2();
            interfaceC1644080ssw.Ch2(C1453210nv5.LIZLLL(filterBean, interfaceC358220E2qOR2.LIZ(filterBean, interfaceC1453220nv6PR2), interfaceC1453220nv6PR2), true);
            return;
        }
        this.LLIZLLLIL.BG0(null, z, context);
    }

    @Override // X.InterfaceC1453020num
    public void wl(FilterBean filterBean, int i, boolean z, boolean z2) {
        oR2().LIZIZ(filterBean, i);
        nR2().pn2(new C1453000nuk(false, filterBean, z, (String) null, false, 56));
        this.LLIZLLLIL.Ch2(C1453210nv5.LIZLLL(filterBean, i, pR2()), z2);
    }
}
