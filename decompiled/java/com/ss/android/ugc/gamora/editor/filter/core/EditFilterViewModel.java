package com.ss.android.ugc.gamora.editor.filter.core;

import X.C01GW;
import X.C09AE;
import X.C09JN;
import X.C0C64;
import X.C0LCS;
import X.C11NJ;
import X.C13LE;
import X.C13LQ;
import X.C1453000nuk;
import X.C1453210nv5;
import X.C1453230nv7;
import X.C1638440sjq;
import X.C1664770tQJ;
import X.C194561119z;
import X.C1DRG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C2296808zG;
import X.C291510Bbh;
import X.C452501pT;
import X.EnumC1159880gHy;
import X.InterfaceC1453220nv6;
import X.InterfaceC1453430nvR;
import X.InterfaceC1455860nzM;
import X.InterfaceC1461390o8H;
import X.InterfaceC1639450slT;
import X.InterfaceC1639870sm9;
import X.InterfaceC1640220smi;
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
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS7S0020000_25;

/* JADX INFO: loaded from: classes26.dex */
public class EditFilterViewModel extends LifecycleAwareViewModel<EditFilterState> implements InterfaceC1453430nvR, InterfaceC1644080ssw, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C1DRG LLILZLL;
    public final InterfaceC1639870sm9 LLIZ;
    public final InterfaceC1644080ssw LLIZLLLIL;
    public final InterfaceC1640220smi LLJ;
    public final boolean LLJI;
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 498));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 499));
    public final MutableLiveData<Boolean> LLJILLL;
    public final MutableLiveData<Boolean> LLJJ;
    public Function1<? super Boolean, Boolean> LLJJI;
    public Function0<Unit> LLJJIII;
    public final LiveData<Boolean> LLJJIJI;
    public final LiveData<Boolean> LLJJIJIIJIL;
    public final C11NJ LLJJIJIL;
    public final C01GW LLJJJ;
    public C09AE LLJJJIL;
    public int LLJJJJ;
    public Class<?> LLJJJJJIL;
    public final MutableLiveData<EnumC1159880gHy> LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditFilterViewModel.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final void kR2() {
        if (this.LLJI) {
            pp();
        }
    }

    private final InterfaceC358220E2q sR2() {
        return (InterfaceC358220E2q) this.LLJILJIL.getValue();
    }

    private final InterfaceC1453220nv6 tR2() {
        return (InterfaceC1453220nv6) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC1453430nvR
    public void DH() {
        setState(AFwS266S0000000_25.get$arr$(268));
    }

    @Override // X.InterfaceC1453430nvR
    public void Dh2() {
        setState(AFwS266S0000000_25.get$arr$(270));
    }

    @Override // X.InterfaceC1453430nvR
    public void UH() {
        Function0<Unit> function0 = this.LLJJIII;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public EditFilterState zQ2() {
        return new EditFilterState(null, null, new C0LCS(null), null, null, C2097608Jq.LJ(), null, null, new C194561119z());
    }

    public final InterfaceC497601wk nR2() {
        return (InterfaceC497601wk) this.LLJJJ.getValue();
    }

    public final InterfaceC1455860nzM pR2() {
        return (InterfaceC1455860nzM) this.LLJIJIL.getValue(this, LLJJL[0]);
    }

    @Override // X.InterfaceC1453430nvR
    public void pp() {
        setState(AFwS266S0000000_25.get$arr$(269));
    }

    @Override // X.InterfaceC1453430nvR
    public void E4() {
        pR2().E4();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        List list;
        super.onCleared();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_filter_reset_compare_key", true, true) && (list = (List) this.LLIZ.LJJI().LJFF().getValue()) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((FilterBean) it2.next()).resetCompareKey();
            }
        }
        this.LLJJIJIL.LJ();
        C2296808zG.LIZJ(nR2(), null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public void onStart() {
        super.onStart();
        this.LLIZ.LJJI().LIZ().observe(this, new AObserverS227S0100000_25(this, 46));
        this.LLJJIJIL.LIZ(this.LLIZ.LIZIZ(false).LJJLL(new AfS194S0100000_25(this, 44), new C09JN() { // from class: X.0sji
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EditFilterViewModel@7637.onStart$3");
                C2281251EQx.LIZ.LJFF("filter", "", "", (Throwable) obj, false);
                C1C7U.LIZIZ("EditFilterViewModel@7637.onStart$3");
            }
        }));
    }

    @Override // X.InterfaceC1453430nvR
    public void u() {
        pR2().u();
    }

    @Override // X.InterfaceC1453430nvR
    public LiveData<Boolean> bw() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1453430nvR
    public MutableLiveData<EnumC1159880gHy> fM() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1453430nvR
    public Class<?> iB1() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1453430nvR
    public LiveData<Boolean> kJ0() {
        return this.LLJJIJIIJIL;
    }

    public final InterfaceC1644080ssw oR2() {
        return this.LLIZLLLIL;
    }

    public final Function0<Unit> qR2() {
        return this.LLJJIII;
    }

    public final InterfaceC1640220smi rR2() {
        return this.LLJ;
    }

    public final InterfaceC1639870sm9 uR2() {
        return this.LLIZ;
    }

    public final Function1<Boolean, Boolean> vR2() {
        return this.LLJJI;
    }

    public final Class<?> wR2() {
        return this.LLJJJJJIL;
    }

    public final void AR2(Class<?> cls) {
        this.LLJJJJJIL = cls;
    }

    @Override // X.InterfaceC1453430nvR
    public void Fv(boolean z) {
        this.LLJILLL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1453430nvR
    public void HN1(Class<?> cls) {
        this.LLJJJJJIL = cls;
    }

    @Override // X.InterfaceC1453430nvR
    public void OB0(boolean z) {
        this.LLJJ.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1453430nvR
    public void OK(boolean z) {
        setState(new AwS37S0010000_25(z, 20));
    }

    @Override // X.InterfaceC1453430nvR
    public void Sg0(InterfaceC1461390o8H interfaceC1461390o8H) {
        setState(new AwS604S0100000_25(interfaceC1461390o8H, 335));
    }

    @Override // X.InterfaceC1453430nvR
    public void ip1(Function1<? super Boolean, Boolean> function1) {
        this.LLJJI = function1;
    }

    @Override // X.InterfaceC1453430nvR
    public void l4(boolean z) {
        kR2();
        pR2().l4(z);
        setState(new AwS37S0010000_25(z, 19));
        this.LLIZLLLIL.BG0(null, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<EffectCategoryResponse, List<FilterBean>> lR2(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        if (C291510Bbh.LIZ().length == 0) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (C13LQ.LJJIJIIJI(((EffectCategoryResponse) entry.getKey()).getKey(), C291510Bbh.LIZ()) < 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void mR2(C1638440sjq c1638440sjq) {
        withState(new AwS391S0200000_25(this, c1638440sjq, 159));
    }

    public final void xR2(int i) {
        this.LLJJJJ = i;
    }

    public final void zR2(Function0<Unit> function0) {
        this.LLJJIII = function0;
    }

    @Override // X.InterfaceC1644080ssw
    public void Ch2(float f, boolean z) {
        this.LLIZLLLIL.Ch2(f, z);
    }

    @Override // X.InterfaceC1644080ssw
    public void Zk2(boolean z, FilterBean filterBean) {
        this.LLIZLLLIL.Zk2(z, filterBean);
    }

    @Override // X.InterfaceC1453430nvR
    public void dr2(boolean z, boolean z2) {
        if (!z) {
            this.LLIZ.LJIJJ();
        } else {
            if (this.LLJJJJ != -1) {
                this.LLIZ.LJIJI(-1, true);
            }
            kR2();
        }
        setState(new AwS7S0020000_25(z, z2, 2));
    }

    @Override // X.InterfaceC1644080ssw
    public void gi2(String str, String str2) {
        this.LLIZLLLIL.gi2(str, str2);
    }

    private final void yR2(C1453000nuk c1453000nuk, boolean z, Context context) {
        FilterBean filterBean = c1453000nuk.LIZIZ;
        if (filterBean != null) {
            pR2().pn2(c1453000nuk);
            InterfaceC1644080ssw interfaceC1644080ssw = this.LLIZLLLIL;
            InterfaceC358220E2q interfaceC358220E2qSR2 = sR2();
            InterfaceC1453220nv6 interfaceC1453220nv6TR2 = tR2();
            interfaceC1644080ssw.Ch2(C1453210nv5.LIZLLL(filterBean, interfaceC358220E2qSR2.LIZ(filterBean, interfaceC1453220nv6TR2), interfaceC1453220nv6TR2), true);
        }
        this.LLIZLLLIL.BG0(c1453000nuk, z, context);
    }

    @Override // X.InterfaceC1644080ssw
    public void BG0(C1453000nuk c1453000nuk, boolean z, Context context) {
        this.LLIZLLLIL.BG0(c1453000nuk, z, context);
    }

    @Override // X.InterfaceC1453430nvR
    public void Aw(FilterBean filterBean, boolean z, boolean z2, Context context) {
        setState(new AwS111S0110000_25(filterBean, z2, 13));
    }

    @Override // X.InterfaceC1453430nvR
    public void Dq2(C1453000nuk c1453000nuk, boolean z, Context context, boolean z2) {
        kR2();
        if (C1453230nv7.LJIIIZ(c1453000nuk.LIZIZ, this.LLIZ)) {
            yR2(c1453000nuk, z, context);
        }
        if (z2) {
            setState(new AwS604S0100000_25(c1453000nuk, 336));
        }
    }

    @Override // X.InterfaceC1453430nvR
    public void wl(FilterBean filterBean, int i, boolean z, boolean z2) {
        sR2().LIZIZ(filterBean, i);
        pR2().pn2(new C1453000nuk(false, filterBean, z, (String) null, false, 56));
        this.LLIZLLLIL.Ch2(C1453210nv5.LIZLLL(filterBean, i, tR2()), z2);
    }

    public EditFilterViewModel(C1DRG c1drg, InterfaceC1639870sm9 interfaceC1639870sm9, InterfaceC1644080ssw interfaceC1644080ssw, InterfaceC1640220smi interfaceC1640220smi, boolean z) {
        this.LLILZLL = c1drg;
        this.LLIZ = interfaceC1639870sm9;
        this.LLIZLLLIL = interfaceC1644080ssw;
        this.LLJ = interfaceC1640220smi;
        this.LLJI = z;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLJILLL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LLJJ = mutableLiveData2;
        this.LLJJIJI = mutableLiveData;
        this.LLJJIJIIJIL = mutableLiveData2;
        this.LLJJIJIL = new C11NJ();
        this.LLJJJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(264));
        this.LLJJJJ = -1;
        this.LLJJJJLIIL = new MutableLiveData<>();
    }

    @Override // X.InterfaceC1453430nvR
    public void DA2(FilterBean filterBean, boolean z, boolean z2, Context context, boolean z3, boolean z4, boolean z5, boolean z6) {
        String id;
        InterfaceC1640220smi interfaceC1640220smi;
        if (z && (interfaceC1640220smi = this.LLJ) != null) {
            interfaceC1640220smi.Qm();
        }
        InterfaceC1639450slT interfaceC1639450slTLJIIL = this.LLIZ.LJIIL();
        if (filterBean == null || (id = filterBean.getId()) == null) {
            id = "";
        }
        Dq2(new C1453000nuk(filterBean, interfaceC1639450slTLJIIL.LIZJ(id), z6, z2, z5, z4), z, context, z3);
    }
}
