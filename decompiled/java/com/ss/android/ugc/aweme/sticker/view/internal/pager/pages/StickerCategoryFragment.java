package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.C01GW;
import X.C0C64;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1322200kVm;
import X.C1330590kjJ;
import X.C1627000sRO;
import X.C1635900sfk;
import X.C1636070sg1;
import X.C1636320sgQ;
import X.C1659630tI1;
import X.C1AF0;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2281551ESb;
import X.C23113093v;
import X.C452501pT;
import X.C786410Ut5;
import X.C817503Hh;
import X.EnumC1159860gHw;
import X.EnumC1641470soj;
import X.InterfaceC1446830nkn;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625220sOW;
import X.InterfaceC1628910sUT;
import X.InterfaceC1629300sV6;
import X.InterfaceC1631540sYi;
import X.InterfaceC1636100sg4;
import X.InterfaceC1640430sn3;
import X.ViewOnAttachStateChangeListenerC1698110uI5;
import Y.AObserverS227S0100000_25;
import Y.ARunnableS36S0101000_25;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.services.EffectPrefetchPreloadConfig;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.adapter.LoadingSkeletonEffect;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.SharedPoolStickerListViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import duk.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public class StickerCategoryFragment extends AbstractStickerFragment<C1636320sgQ> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4ICw4LTdiPyY2P2slJzs2HELIOSOistJWEjKSIpO2EjKSIpOmEAPCwvIiohCyQ4LCg8OjwKOy40JSAiPQ==";
    public boolean LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 425));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 422));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 424));
    public final C01GW<InterfaceC1631540sYi<Effect>> LLJJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 423));
    public int LLJJJ = -1;
    public int LLJJJJJIL = -1;

    public boolean BS(Effect effect) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public String SR() {
        return "sticker_category";
    }

    public final void LJ() {
        if (this.LLJI) {
            int i = 0;
            if (C1635900sfk.LIZ()) {
                ArrayList arrayList = new ArrayList(60);
                do {
                    arrayList.add(new LoadingSkeletonEffect());
                    i++;
                } while (i < 60);
                zS(arrayList);
                return;
            }
            InterfaceC1640430sn3<EnumC1641470soj> interfaceC1640430sn3 = this.LLILLL;
            if (interfaceC1640430sn3 == null) {
                interfaceC1640430sn3 = null;
            }
            interfaceC1640430sn3.setState(EnumC1641470soj.LOADING);
            p pVarLJJJJIZL = RR().LJJJJIZL();
            if (pVarLJJJJIZL == null || pVarLJJJJIZL.LIZIZ != 0) {
                C786410Ut5.LLIZLLLIL(LLII(), 4);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public void ZR() {
        String str = this.LLJJ;
        if (str == null) {
            return;
        }
        iS().XH2(str);
    }

    public final EffectCategoryModel hS() {
        return (EffectCategoryModel) this.LLJJIJI.getValue();
    }

    public final InterfaceC1631540sYi<Effect> iS() {
        return this.LLJJIJIL.getValue();
    }

    public final void kS() {
        String str;
        C1636320sgQ c1636320sgQ;
        InterfaceC1446830nkn interfaceC1446830nkn;
        String str2 = this.LLJILLL;
        if (str2 == null || (str = this.LLJJ) == null || (c1636320sgQ = this.LLILZ) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "category_model", hS());
        Collection collection = c1636320sgQ.LLILZ;
        if (collection == null || ((ArrayList) collection).isEmpty()) {
            return;
        }
        int iFindFirstVisibleItemPosition = NR().findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 1) {
            iFindFirstVisibleItemPosition = 1;
        }
        int iFindLastVisibleItemPosition = NR().findLastVisibleItemPosition() + 1;
        while (iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition) {
            Effect effectLLLII = c1636320sgQ.LLLII(iFindFirstVisibleItemPosition);
            if ((effectLLLII == null || BS(effectLLLII)) && (interfaceC1446830nkn = OR().LIZ) != null) {
                interfaceC1446830nkn.LIZIZ(iFindFirstVisibleItemPosition, str2, str, bundle, new AwS604S0100000_25(c1636320sgQ, 314));
            }
            iFindFirstVisibleItemPosition++;
        }
    }

    public InterfaceC1631540sYi<Effect> rS() {
        InterfaceC1624480sNK interfaceC1624480sNKRR = RR();
        return new SharedPoolStickerListViewModel(this, PR().LJI, PR().LIZIZ, interfaceC1624480sNKRR, uS(), UR());
    }

    public C1636320sgQ sS() {
        return new C1636320sgQ(RR(), UR(), iS(), PR().LJFF, OR().LIZLLL, OR().LIZIZ, OR(), hS(), this.LLILZIL, 512);
    }

    public static void wS() {
        if (C1322200kVm.LIZ().LJIILL()) {
            C1322200kVm.LIZ().LJIJJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final void WR() {
        if (getActivity() != null && VR()) {
            if (this.LLJI) {
                EffectCategoryModel effectCategoryModelHS = hS();
                if (effectCategoryModelHS == null) {
                    return;
                }
                String key = effectCategoryModelHS.getKey();
                this.LLJJ = key;
                if (key == null || a0.LJJJIL(key)) {
                    LJ();
                } else {
                    ZR();
                }
            }
            if (PR().LJFF.LJIIIZ) {
                nS();
            }
        }
    }

    public void dS() {
        LLII().addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0sgg
            public int LL;
            public long LLILLJJLI;
            public float LLILLL;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                C1636320sgQ c1636320sgQ;
                if (this.LLILZ.PR().LJFF.LJIIJ) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                this.LLILZ.getClass();
                                if (!C1322200kVm.LIZ().LJIILL()) {
                                    C1322200kVm.LIZ().LJIILLIIL();
                                }
                                this.LLILZ.qS();
                            }
                        } else {
                            if (this.LL == 2) {
                                this.LLILZ.getClass();
                                if (!C1322200kVm.LIZ().LJIILL()) {
                                    C1322200kVm.LIZ().LJIILLIIL();
                                }
                            } else if (C1322200kVm.LIZ().LJIILL()) {
                                this.LLILZ.getClass();
                                StickerCategoryFragment.wS();
                            }
                            this.LLILZ.qS();
                        }
                    } else {
                        if (C1322200kVm.LIZ().LJIILL()) {
                            this.LLILZ.getClass();
                            StickerCategoryFragment.wS();
                        }
                        StickerCategoryFragment stickerCategoryFragment = this.LLILZ;
                        if (stickerCategoryFragment.RR().LJJLIIIJJIZ().LJIILL) {
                            MutableLiveData<Boolean> mutableLiveDataLLLIIIL = stickerCategoryFragment.iS().LLLIIIL();
                            Boolean bool = Boolean.FALSE;
                            mutableLiveDataLLLIIIL.setValue(bool);
                            T value = stickerCategoryFragment.RR().LJII().LJIJJLI().getValue();
                            if (value != 0 && (c1636320sgQ = stickerCategoryFragment.LLILZ) != null) {
                                Integer numValueOf = Integer.valueOf(c1636320sgQ.LLLI(value));
                                if (numValueOf.intValue() >= -1) {
                                    int iIntValue = numValueOf.intValue();
                                    C1636320sgQ c1636320sgQ2 = stickerCategoryFragment.LLILZ;
                                    if (c1636320sgQ2 != null) {
                                        c1636320sgQ2.notifyItemChanged(iIntValue + 1, bool);
                                    }
                                }
                            }
                        }
                    }
                }
                this.LL = i;
                if (i == 0) {
                    StickerCategoryFragment stickerCategoryFragment2 = this.LLILZ;
                    if (stickerCategoryFragment2.LLJILJILJ) {
                        stickerCategoryFragment2.LLJILJILJ = false;
                        return;
                    }
                    return;
                }
                if (1 != i) {
                    return;
                }
                this.LLILZ.LLJILJILJ = true;
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                if (this.LLILZ.PR().LJFF.LJIL) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = this.LLILLJJLI;
                    if (j > 0) {
                        long j2 = jCurrentTimeMillis - j;
                        if (j2 > 0) {
                            this.LLILLL = Math.abs(i2 / j2);
                        }
                    }
                    this.LLILLJJLI = jCurrentTimeMillis;
                    if (this.LLILLL < this.LLILZ.PR().LJFF.LJJ && C1322200kVm.LIZ().LJIILL()) {
                        this.LLILZ.getClass();
                        StickerCategoryFragment.wS();
                    }
                }
                StickerCategoryFragment stickerCategoryFragment = this.LLILZ;
                if (stickerCategoryFragment.LLJILJILJ) {
                    stickerCategoryFragment.kS();
                }
            }
        });
        LLII().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1698110uI5(this, 0));
    }

    public void gS() {
        iS().he().observe(this, new AObserverS227S0100000_25(this, 39));
        RR().LJII().LJIJ().observe(this, new AObserverS227S0100000_25(this, 40));
    }

    public final void nS() {
        if ((!PR().LJFF.LJIIIZ || this.LLJI) && !this.LLJJI) {
            this.LLJJI = true;
            RR().LJII().LIZ().observe(this, new AObserverS227S0100000_25(this, 139));
            if (iS().LJJIJ().getValue() == EnumC1641470soj.LOADING) {
                LJ();
            }
            C23113093v.LIZ(iS().LJJIJ(), C817503Hh.LL, AFwS266S0000000_25.get$arr$(570), AFwS266S0000000_25.get$arr$(571)).observe(this, new AObserverS227S0100000_25(this, 138));
            gS();
            RR().LJII().LJIJJLI().observe(this, new AObserverS227S0100000_25(this, 140));
            iS().kS0().observe(this, new AObserverS227S0100000_25(this, 141));
            EffectPrefetchPreloadConfig effectPrefetchPreloadConfig = EffectPrefetchPreloadConfig.INSTANCE;
            if (effectPrefetchPreloadConfig.propPanelPrefetchEnabled() || effectPrefetchPreloadConfig.propPanelPreloadEnabled()) {
                iS().E81().observe(this, new AObserverS227S0100000_25(this, 135));
            } else {
                iS().Ke0().observe(this, new AObserverS227S0100000_25(this, 136));
            }
            RR().LJII().LJIILIIL().observe(this, new AObserverS227S0100000_25(this, 137));
        }
    }

    public final void qS() {
        C1636320sgQ c1636320sgQ;
        if (RR().LJJLIIIJJIZ().LJIILL) {
            MutableLiveData<Boolean> mutableLiveDataLLLIIIL = iS().LLLIIIL();
            Boolean bool = Boolean.TRUE;
            mutableLiveDataLLLIIIL.setValue(bool);
            T value = RR().LJII().LJIJJLI().getValue();
            if (value == 0 || (c1636320sgQ = this.LLILZ) == null) {
                return;
            }
            Integer numValueOf = Integer.valueOf(c1636320sgQ.LLLI(value));
            if (numValueOf.intValue() >= -1) {
                int iIntValue = numValueOf.intValue();
                C1636320sgQ c1636320sgQ2 = this.LLILZ;
                if (c1636320sgQ2 != null) {
                    c1636320sgQ2.notifyItemChanged(iIntValue + 1, bool);
                }
            }
        }
    }

    public final InterfaceC1628910sUT uS() {
        String key;
        String key2;
        String str = "";
        if (PR().LJFF.LJIJJ) {
            StickerStatesStoreViewModel stickerStatesStoreViewModel = (StickerStatesStoreViewModel) C1659630tI1.LJII(getView(), requireActivity(), 4).get(StickerStatesStoreViewModel.class);
            InterfaceC1629300sV6 interfaceC1629300sV6LJI = RR().getStickerRepository().LJI();
            EffectCategoryModel effectCategoryModelHS = hS();
            if (effectCategoryModelHS != null && (key2 = effectCategoryModelHS.getKey()) != null) {
                str = key2;
            }
            return stickerStatesStoreViewModel.vQ2(interfaceC1629300sV6LJI, str, null);
        }
        if (PR().LJFF.LJIILJJIL) {
            return ((StickerStatesStoreViewModel) C1659630tI1.LJII(getView(), null, 6).get(StickerStatesStoreViewModel.class)).vQ2(RR().getStickerRepository().LJI(), "defaultCategory", null);
        }
        StickerStatesStoreViewModel stickerStatesStoreViewModel2 = (StickerStatesStoreViewModel) C1659630tI1.LJII(getView(), null, 6).get(StickerStatesStoreViewModel.class);
        InterfaceC1629300sV6 interfaceC1629300sV6LJI2 = RR().getStickerRepository().LJI();
        EffectCategoryModel effectCategoryModelHS2 = hS();
        if (effectCategoryModelHS2 != null && (key = effectCategoryModelHS2.getKey()) != null) {
            str = key;
        }
        return stickerStatesStoreViewModel2.vQ2(interfaceC1629300sV6LJI2, str, null);
    }

    public final void ES(Context context) {
        Function0<Boolean> function0 = OR().LJIIIZ;
        if (function0 != null && function0.invoke().booleanValue()) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LIZIZ("StickerCategoryFragment", "Skipping network error toast - recording is in progress");
        } else {
            C1627000sRO.LIZIZ(context, true);
        }
    }

    public final void mS(int i) {
        int iIntValue;
        boolean z;
        Object value;
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "effect_panel_selected_tab_elapsed_fix", true, false);
        Integer num = OR().LJFF;
        int iIntValue2 = -1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        if (zLJIIIZ && iIntValue != this.LLILZIL) {
            z = false;
        } else {
            z = true;
        }
        LiveData liveData = (LiveData) this.LLJJIII.getValue();
        if (liveData != null) {
            value = liveData.getValue();
        } else {
            value = null;
        }
        if (value == EnumC1159860gHw.SHOWN && getUserVisibleHint() && z) {
            Integer num2 = OR().LJI;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            if (iIntValue2 != this.LLILZIL && !Intrinsics.LJFF(RR().LJIIJ(), this.LLJJ) && RR().LJJIII() != -1) {
                C1AF0.LIZJ("effect_panel_open_tab_steal");
            }
            InterfaceC1446830nkn interfaceC1446830nkn = OR().LIZ;
            if (interfaceC1446830nkn != null) {
                interfaceC1446830nkn.LJ(i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0sg2] */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        EffectCategoryModel effectCategoryModelHS;
        C1636320sgQ c1636320sgQ;
        LinearLayoutManager linearLayoutManager;
        final String id;
        super.onActivityCreated(bundle);
        if (getActivity() == null || !VR() || (effectCategoryModelHS = hS()) == null) {
            return;
        }
        this.LLJILLL = effectCategoryModelHS.getName();
        this.LLJJ = effectCategoryModelHS.getKey();
        Class<?> cls = null;
        if (LLII().getAdapter() == null) {
            LLII().setItemAnimator(null);
            RecyclerView recyclerViewLLII = LLII();
            C1636320sgQ c1636320sgQSS = sS();
            this.LLILZ = c1636320sgQSS;
            recyclerViewLLII.setAdapter(c1636320sgQSS);
            C1636320sgQ c1636320sgQ2 = this.LLILZ;
            if (c1636320sgQ2 != null) {
                final LinearLayoutManager linearLayoutManagerNR = NR();
                final String str = this.LLJILLL;
                final String str2 = this.LLJJ;
                final InterfaceC1625220sOW interfaceC1625220sOW = PR().LIZJ;
                final InterfaceC1624480sNK interfaceC1624480sNKRR = RR();
                EffectCategoryModel effectCategoryModelHS2 = hS();
                if (effectCategoryModelHS2 != null) {
                    id = effectCategoryModelHS2.getId();
                } else {
                    id = null;
                }
                c1636320sgQ2.LLJJI = new InterfaceC1636100sg4() { // from class: X.0sg2
                    @Override // X.InterfaceC1636100sg4
                    public final void onSuccess() {
                        linearLayoutManagerNR.findFirstVisibleItemPosition();
                        interfaceC1624480sNKRR.LJJLL();
                        String strValueOf = String.valueOf(str2);
                        interfaceC1624480sNKRR.LJJLL();
                        String strValueOf2 = String.valueOf(str);
                        InterfaceC1625220sOW interfaceC1625220sOW2 = interfaceC1625220sOW;
                        if (interfaceC1625220sOW2 != null) {
                            String str3 = id;
                            if (str3 == null) {
                                str3 = "";
                            }
                            interfaceC1625220sOW2.LJIILJJIL(str3, strValueOf, strValueOf2, (int) C1636070sg1.LIZ(interfaceC1624480sNKRR.LJJLIIIJLLLLLLLZ()), C1636070sg1.LIZLLL.LIZJ(), linearLayoutManagerNR);
                        }
                        C1636070sg1.LIZIZ = C1636070sg1.LIZ;
                    }
                };
            }
        } else {
            AbstractC21673619ry adapter = LLII().getAdapter();
            if (adapter instanceof C1636320sgQ) {
                c1636320sgQ = (C1636320sgQ) adapter;
            } else {
                c1636320sgQ = null;
            }
            this.LLILZ = c1636320sgQ;
        }
        C1636320sgQ c1636320sgQ3 = this.LLILZ;
        if (c1636320sgQ3 != null) {
            cls = c1636320sgQ3.getClass();
        }
        if (Intrinsics.LJFF(cls, C1636320sgQ.class)) {
            if (PR().LJFF.LJIJJLI) {
                int i = PR().LJFF.LIZ * 3;
                RecyclerView.RecycledViewPool recycledViewPool = this.LLILZLL;
                if (recycledViewPool != null) {
                    recycledViewPool.setMaxRecycledViews(c1636320sgQ3.LLILLL.LIZ - 1, i);
                }
                LLII().setItemViewCacheSize(8);
                RecyclerView.LayoutManager layoutManager = LLII().getLayoutManager();
                if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    linearLayoutManager.mInitialPrefetchItemCount = 4;
                }
            } else if (PR().LJFF.LJIJ) {
                int i2 = PR().LJFF.LIZ * 4;
                RecyclerView.RecycledViewPool recycledViewPool2 = this.LLILZLL;
                if (recycledViewPool2 != null) {
                    recycledViewPool2.setMaxRecycledViews(c1636320sgQ3.LLILLL.LIZ - 1, i2);
                }
                LLII().setRecycledViewPool(this.LLILZLL);
            }
        }
        String str3 = this.LLJJ;
        if (str3 != null && !a0.LJJJIL(str3)) {
            if (this.LLJJIII.getValue() != null) {
                LiveData liveData = (LiveData) this.LLJJIII.getValue();
                if (liveData != null) {
                    liveData.observe(this, new AObserverS227S0100000_25(this, 133));
                }
            } else {
                nS();
            }
            LiveData liveData2 = (LiveData) this.LLJJIII.getValue();
            if (liveData2 != null) {
                liveData2.observe(this, new AObserverS227S0100000_25(this, 134));
            }
        } else {
            LJ();
        }
        dS();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/sticker/view/internal/pager/pages/StickerCategoryFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT8Yr+kSnfiy0XURUWbVwvh/Rt/+/rzMAe78HsQV6xCRXo6sDUToPdiQldn0pwOKJTaw==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            kS();
            if (this.LLJJIJIL.isInitialized()) {
                if (iS().LJJIJ().getValue() == EnumC1641470soj.LOADING || (C2281551ESb.LIZIZ.LJFF().LIZ() && iS().LJJIJ().getValue() == null)) {
                    LJ();
                }
            }
        }
    }

    public final void yS(int i) {
        if (i == -1) {
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scroll2ScreenCenterIfNeed post position = ");
        sbLIZ.append(i);
        C1330590kjJ.LIZIZ("StickerCategoryFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJJIL = i;
        HandlerHook.viewPostDelay(LLII(), new ARunnableS36S0101000_25(i, this, 4), 500L);
    }

    public void zS(List<? extends Effect> list) {
        C1636320sgQ c1636320sgQ = this.LLILZ;
        if (c1636320sgQ == null || getActivity() == null) {
            return;
        }
        C786410Ut5.LLIZLLLIL(LLII(), 0);
        c1636320sgQ.LLILZIL = this.LLILZIL;
        c1636320sgQ.setData(list);
        C1636070sg1.LIZIZ(list, RR());
    }

    public final void oS(C1636320sgQ c1636320sgQ, Effect effect) {
        EnumC1159860gHw value;
        int iLLLI = c1636320sgQ.LLLI(effect);
        if (iLLLI >= 0) {
            c1636320sgQ.notifyItemChanged(iLLLI + 1, effect);
            LiveData<EnumC1159860gHw> liveData = OR().LJ;
            if (liveData != null) {
                value = liveData.getValue();
            } else {
                value = null;
            }
            if (value == EnumC1159860gHw.HIDDEN) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onChangeStickerDealScroller position = ");
                sbLIZ.append(iLLLI);
                C1330590kjJ.LIZIZ("StickerCategoryFragment", C2188811AlT.LIZIZ(sbLIZ));
                yS(iLLLI);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (getActivity() == null || !VR()) {
            return;
        }
        super.onViewCreated(view, bundle);
        if (PR().LJFF.LJIIIZ) {
            LJ();
        }
    }
}
