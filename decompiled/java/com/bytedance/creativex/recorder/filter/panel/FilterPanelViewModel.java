package com.bytedance.creativex.recorder.filter.panel;

import X.C01GW;
import X.C09AE;
import X.C0CIT;
import X.C0ETY;
import X.C11NJ;
import X.C11NZ;
import X.C11RK;
import X.C13LQ;
import X.C1453230nv7;
import X.C1638440sjq;
import X.C1639640slm;
import X.C1639660slo;
import X.C1639670slp;
import X.C1641830spJ;
import X.C1641840spK;
import X.C1642530sqR;
import X.C1644670stt;
import X.C1663770tOh;
import X.C194561119z;
import X.C19475711Hn;
import X.C1954807lC;
import X.C1DRG;
import X.C2097608Jq;
import X.C2219091BtD;
import X.C2281251EQx;
import X.C228600uS;
import X.C2296808zG;
import X.C452501pT;
import X.C993510bxd;
import X.EnumC1159880gHy;
import X.EnumC992840bwY;
import X.InterfaceC1639870sm9;
import X.InterfaceC1640320sms;
import X.InterfaceC1642510sqP;
import X.InterfaceC1644770su3;
import X.InterfaceC1650230t2r;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class FilterPanelViewModel extends LifecycleAwareViewModel<FilterPanelState> implements InterfaceC1642510sqP {
    public final C1DRG LLILZLL;
    public final Function0<InterfaceC1639870sm9> LLIZ;
    public final Function0<Boolean> LLIZLLLIL;
    public final Function1<Activity, Boolean> LLJ;
    public InterfaceC1644770su3 LLJIJIL;
    public C09AE LLJJ;
    public final C11RK<C1644670stt> LLJJIJIIJIL;
    public final C11NZ<C1644670stt> LLJJIJIL;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 78));
    public final Handler LLJILJIL = new BPEAHandler(Looper.getMainLooper());
    public final C11NJ LLJILJILJ = new C11NJ();
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(26));
    public int LLJJI = -1;
    public final MutableLiveData<EnumC992840bwY> LLJJIII = new MutableLiveData<>();
    public final MutableLiveData<EnumC1159880gHy> LLJJIJI = new MutableLiveData<>();

    private final InterfaceC1650230t2r nR2() {
        return (InterfaceC1650230t2r) this.LLJI.getValue();
    }

    private final InterfaceC1644770su3 pR2() {
        InterfaceC1644770su3 interfaceC1644770su3 = this.LLJIJIL;
        if (interfaceC1644770su3 != null) {
            return interfaceC1644770su3;
        }
        InterfaceC1644770su3 interfaceC1644770su32 = (InterfaceC1644770su3) ((C0ETY) this.LLILZLL.LJII(C0ETY.class, null)).MY1(InterfaceC1644770su3.class);
        if (interfaceC1644770su32 == null) {
            return null;
        }
        this.LLJIJIL = interfaceC1644770su32;
        return interfaceC1644770su32;
    }

    @Override // X.InterfaceC1642510sqP
    public LiveData<EnumC992840bwY> Vm2() {
        return C228600uS.LIZ(this.LLJJIII);
    }

    public final void jR2() {
        uR2(C993510bxd.LIZ);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: kR2, reason: merged with bridge method [inline-methods] */
    public FilterPanelState zQ2() {
        return new FilterPanelState(new C194561119z(), null, Intrinsics.LJFF(this.LLIZLLLIL.invoke(), Boolean.TRUE), new C1641840spK(C2097608Jq.LJ(), false), null, C993510bxd.LIZ);
    }

    public final InterfaceC497601wk oR2() {
        return (InterfaceC497601wk) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC1642510sqP
    public LiveData<EnumC1159880gHy> p4() {
        return C228600uS.LIZ(this.LLJJIJI);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        if (!this.LLJILJILJ.LLILLJJLI) {
            this.LLJILJILJ.dispose();
        }
        C2296808zG.LIZJ(oR2(), null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public void onStart() {
        super.onStart();
        ((C0ETY) this.LLILZLL.LJII(C0ETY.class, null)).Sd(InterfaceC1644770su3.class, new AwS604S0100000_25(this, 62));
    }

    @Override // X.InterfaceC1642510sqP
    public C11NZ<C1644670stt> sP0() {
        return this.LLJJIJIL;
    }

    private final void uR2(Pair<String, String> pair) {
        setState(new AwS604S0100000_25((Pair) pair, (Pair<String, String>) 63));
    }

    public final void AR2(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        setStateImmediate(new AwS391S0200000_25(this, (FilterPanelViewModel) map, (Map<EffectCategoryResponse, ? extends List<? extends FilterBean>>) 40));
    }

    public final void BR2(EnumC1159880gHy enumC1159880gHy) {
        this.LLJJIJI.setValue(enumC1159880gHy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<EffectCategoryResponse, List<FilterBean>> lR2(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        if (C0CIT.LIZ().length == 0) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (C13LQ.LJJIJIIJI(((EffectCategoryResponse) entry.getKey()).getKey(), C0CIT.LIZ()) < 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void mR2(C1638440sjq c1638440sjq) {
        InterfaceC1640320sms interfaceC1640320smsLJJI;
        boolean z;
        InterfaceC1639870sm9 interfaceC1639870sm9Invoke = this.LLIZ.invoke();
        if (interfaceC1639870sm9Invoke != null && (interfaceC1640320smsLJJI = interfaceC1639870sm9Invoke.LJJI()) != null) {
            List list = (List) interfaceC1640320smsLJJI.LIZ().getValue();
            if (list != null && !list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            if (this.LLJJIII.getValue() == EnumC992840bwY.ON_SHOWN && z2) {
                AR2(C1639660slo.LIZIZ(c1638440sjq, interfaceC1640320smsLJJI.LJ()));
                C2219091BtD.LIZLLL().d("viki filter, record page -> panel null and fresh");
                C2281251EQx.LIZ.LJ("video_shoot_page", false);
            }
        }
    }

    @Override // X.InterfaceC1642510sqP
    public void of(boolean z) {
        setStateImmediate(new AwS111S0110000_25(z, this, 1));
        nR2().Zl0(new C1663770tOh(!z, false, false));
    }

    public final void qR2(C1641830spJ c1641830spJ) {
        InterfaceC1640320sms interfaceC1640320smsLJJI;
        MutableLiveData mutableLiveDataLJFF;
        List list;
        int i = C1642530sqR.LIZ[c1641830spJ.LIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                jR2();
                withState(new AwS391S0200000_25(c1641830spJ, this, 38));
                return;
            }
            throw new C1954807lC();
        }
        InterfaceC1639870sm9 interfaceC1639870sm9Invoke = this.LLIZ.invoke();
        Object obj = null;
        if (interfaceC1639870sm9Invoke != null && (interfaceC1640320smsLJJI = interfaceC1639870sm9Invoke.LJJI()) != null && (mutableLiveDataLJFF = interfaceC1640320smsLJJI.LJFF()) != null && (list = (List) mutableLiveDataLJFF.getValue()) != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (C1639640slm.LIZ((FilterBean) next, c1641830spJ.LIZIZ.LIZ)) {
                    obj = next;
                    break;
                }
            }
            FilterBean filterBean = (FilterBean) obj;
            if (filterBean != null) {
                vR2(filterBean, true, "");
                return;
            }
        }
        C1639670slp c1639670slp = c1641830spJ.LIZIZ.LIZ;
        uR2(new Pair<>(c1639670slp.LIZ, c1639670slp.LIZLLL));
    }

    public final void rR2(Activity activity) {
        Function1<Activity, Boolean> function1 = this.LLJ;
        if (function1 == null || function1.invoke(activity).booleanValue()) {
            InterfaceC1639870sm9 interfaceC1639870sm9Invoke = this.LLIZ.invoke();
            if (interfaceC1639870sm9Invoke != null) {
                interfaceC1639870sm9Invoke.LJIJI(-1, true);
            }
            setState(AFwS266S0000000_25.get$arr$(72));
        }
    }

    public final void sR2(int i) {
        this.LLJJI = i;
    }

    public final void tR2(boolean z) {
        InterfaceC1644770su3 interfaceC1644770su3PR2 = pR2();
        if (interfaceC1644770su3PR2 != null) {
            interfaceC1644770su3PR2.yL2(z, "build_in");
        }
        setState(new AwS37S0010000_25(z, 1));
        if (z) {
            setStateImmediate(AFwS266S0000000_25.get$arr$(73));
        }
    }

    public final void xR2(List<? extends FilterBean> list) {
        withState(new AwS391S0200000_25((List) list, (List<? extends FilterBean>) this, (FilterPanelViewModel) 39));
    }

    public final void zR2(C1644670stt c1644670stt) {
        this.LLJJIJIIJIL.onNext(c1644670stt);
    }

    public final void yR2(FilterBean filterBean, int i) {
        InterfaceC1644770su3 interfaceC1644770su3PR2 = pR2();
        if (interfaceC1644770su3PR2 != null) {
            interfaceC1644770su3PR2.RX1(filterBean, i);
        }
    }

    public final void vR2(FilterBean filterBean, boolean z, String str) {
        String str2 = str;
        InterfaceC1639870sm9 interfaceC1639870sm9Invoke = this.LLIZ.invoke();
        if (interfaceC1639870sm9Invoke != null && C1453230nv7.LJIIIZ(filterBean, interfaceC1639870sm9Invoke)) {
            if (filterBean != null) {
                InterfaceC1644770su3 interfaceC1644770su3PR2 = pR2();
                if (interfaceC1644770su3PR2 != null) {
                    if (z) {
                        str2 = "filter_box";
                    }
                    interfaceC1644770su3PR2.MO(filterBean, str2, true, true, false, true);
                }
                InterfaceC1644770su3 interfaceC1644770su3PR22 = pR2();
                if (interfaceC1644770su3PR22 != null) {
                    interfaceC1644770su3PR22.yL2(false, "build_in");
                }
                InterfaceC1644770su3 interfaceC1644770su3PR23 = pR2();
                if (interfaceC1644770su3PR23 != null) {
                    interfaceC1644770su3PR23.Pb1(true);
                }
                setState(AFwS266S0000000_25.get$arr$(74));
            }
            setStateImmediate(new AwS604S0100000_25(filterBean, 64));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterPanelViewModel(C1DRG c1drg, Function0<? extends InterfaceC1639870sm9> function0, Function0<Boolean> function02, Function1<? super Activity, Boolean> function1) {
        this.LLILZLL = c1drg;
        this.LLIZ = function0;
        this.LLIZLLLIL = function02;
        this.LLJ = function1;
        C11RK<C1644670stt> c11rk = new C11RK<>();
        this.LLJJIJIIJIL = c11rk;
        this.LLJJIJIL = new C19475711Hn(c11rk);
    }
}
