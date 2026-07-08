package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material;

import X.C0C64;
import X.C0HZQ;
import X.C0J15;
import X.C0J16;
import X.C0J19;
import X.C0J1D;
import X.C0JEG;
import X.C0JEH;
import X.C0JEI;
import X.C0JEL;
import X.C0JEQ;
import X.C0JES;
import X.C0JEX;
import X.C0JEY;
import X.C0ML7;
import X.C1378990lzN;
import X.C1390410mHn;
import X.C13LE;
import X.C13LP;
import X.C1659640tI2;
import X.C21679919sz;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C418440Gaw;
import X.C425520GmM;
import X.C521600Kcw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1631630sYr;
import Y.ACListenerS142S0100000_7;
import Y.AObjectS526S0100000_7;
import Y.AObserverS172S0200000_7;
import Y.ARunnableS18S0101000_7;
import Y.AsS29S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.viewmodel.CombinedMaterialListViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class MaterialSelectPagingScene extends BaseMaterialSelectScene {
    public C0J19 LLLF;
    public C0J1D LLLFF;
    public C21679919sz LLLFFI;
    public C0JES LLLII;
    public final C0JEX LLL = C0JEY.LIZ(this, C13LE.LIZ(CombinedMaterialListViewModel.class), new AwS551S0100000_7((Scene) this, 418), null);
    public final AwS586S0100000_7 LLLFZ = new AwS586S0100000_7(this, 268);
    public final AwS586S0100000_7 LLLI = new AwS586S0100000_7(this, 269);
    public final AObjectS526S0100000_7 LLLIIII = new AObjectS526S0100000_7(this, 1);
    public final C0JEG LLLIIIIL = new InterfaceC1631630sYr<Boolean, OnThisDayTiktokMediaModel, Boolean, Boolean, Unit>() { // from class: X.0JEG
        @Override // X.InterfaceC1631630sYr
        public final Unit invoke(Boolean bool, OnThisDayTiktokMediaModel onThisDayTiktokMediaModel, Boolean bool2, Boolean bool3) {
            C0J19 c0j19;
            C0JES c0jes;
            boolean zBooleanValue = bool.booleanValue();
            OnThisDayTiktokMediaModel onThisDayTiktokMediaModel2 = onThisDayTiktokMediaModel;
            boolean zBooleanValue2 = bool2.booleanValue();
            boolean zBooleanValue3 = bool3.booleanValue();
            MaterialSelectPagingScene materialSelectPagingScene = this.LL;
            C0J1D c0j1d = materialSelectPagingScene.LLLFF;
            if (c0j1d != null && (c0j19 = materialSelectPagingScene.LLLF) != null && (c0jes = materialSelectPagingScene.LLLII) != null) {
                c0jes.LJI(onThisDayTiktokMediaModel2, c0j1d, c0j19, zBooleanValue);
                if (zBooleanValue) {
                    C0ML7 c0ml7 = C0ML7.LIZ;
                    CreativeModel creativeModel = c0jes.LIZLLL.creativeModel;
                    String str = onThisDayTiktokMediaModel2.selectType;
                    c0ml7.getClass();
                    C0ML7.LJIILL(creativeModel, false, zBooleanValue2, zBooleanValue3, str, null);
                }
            }
            return Unit.LIZ;
        }
    };

    @Override // X.C0MWS
    public final void LJLL(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final void LLLLLL() {
        C0J1D c0j1d;
        C0JES c0jes;
        boolean z;
        C0J19 c0j19 = this.LLLF;
        if (c0j19 == null || (c0j1d = this.LLLFF) == null || (c0jes = this.LLLII) == null) {
            return;
        }
        if (((ArrayList) c0jes.LIZIZ.LLIZLLLIL).size() >= c0jes.LIZJ.LIZ || ((ArrayList) c0jes.LIZIZ.LLIZLLLIL).size() >= ((ArrayList) c0jes.LIZIZ.LLJ).size()) {
            z = false;
            ListIterator listIterator = C13LP.LLIIII(c0jes.LIZIZ.LLIZLLLIL).listIterator();
            while (listIterator.hasNext()) {
                c0jes.LJI((OnThisDayTiktokMediaModel) listIterator.next(), c0j1d, c0j19, false);
            }
        } else {
            z = true;
            Iterator it2 = ((ArrayList) c0jes.LIZIZ.LLJ).iterator();
            while (((ArrayList) c0jes.LIZIZ.LLIZLLLIL).size() < c0jes.LIZJ.LIZ && it2.hasNext()) {
                OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = (OnThisDayTiktokMediaModel) it2.next();
                if (onThisDayTiktokMediaModel.selectIndex <= 0) {
                    c0jes.LJI(onThisDayTiktokMediaModel, c0j1d, c0j19, true);
                }
            }
        }
        c0jes.LJFF.invoke(Boolean.valueOf(((ArrayList) c0jes.LIZIZ.LLIZLLLIL).size() == c0jes.LJ()));
        if (z) {
            C0ML7 c0ml7 = C0ML7.LIZ;
            CreativeModel creativeModel = c0jes.LIZLLL.creativeModel;
            c0ml7.getClass();
            C0ML7.LJIILL(creativeModel, true, false, false, "select_all", null);
        }
    }

    public final CombinedMaterialListViewModel LLLLLLLLL() {
        return (CombinedMaterialListViewModel) this.LLL.getValue();
    }

    public final void LLLLLLLLLL() {
        C1390410mHn c1390410mHn = this.LLJJLIIIJLLLLLLLZ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
        View view = this.LLJJJJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C0HZQ c0hzq = this.LLJJJIL;
        if (c0hzq != null) {
            C786410Ut5.LLLLLZ(c0hzq, 0);
        }
        View view2 = this.LLJJL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        RecyclerView recyclerView = this.LLJL;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 0);
        }
        TuxTextView tuxTextView = this.LLJJJJJIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final List<OnThisDayTiktokMediaModel> LLLLJI() {
        return LLLLLLLLL().LLJ;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final List<OnThisDayTiktokMediaModel> LLLLLIL() {
        return LLLLLLLLL().LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final void LLLLLILLIL() {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_eoy_upload_material_new_style", true, false)) {
            super.LLLLLILLIL();
            return;
        }
        View view = this.LLJJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        TuxIconView tuxIconView = this.LLJJJJLIIL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        TuxIconView tuxIconView2 = this.LLJJJJLIIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS142S0100000_7(this, 141));
        }
        C0JEQ c0jeq = this.LLJLLIL;
        if (c0jeq == null || !c0jeq.LIZJ) {
            View view2 = this.LLJJL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        View view3 = this.LLJJL;
        if (view3 != null) {
            C1378990lzN.LIZIZ(view3, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, null, null, 30);
        }
        View view4 = this.LLJJL;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 142), view4);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final void LLLLLLJ(ArrayList<OnThisDayTiktokMediaModel> arrayList) {
        int itemCount;
        C0JES c0jes;
        if (arrayList == null) {
            return;
        }
        C0J1D c0j1d = this.LLLFF;
        if (c0j1d != null) {
            itemCount = c0j1d.getItemCount();
        } else {
            itemCount = 0;
        }
        for (OnThisDayTiktokMediaModel onThisDayTiktokMediaModel : arrayList) {
            C0J1D c0j1d2 = this.LLLFF;
            if (c0j1d2 != null) {
                c0j1d2.LLLII(onThisDayTiktokMediaModel);
            }
        }
        CombinedMaterialListViewModel combinedMaterialListViewModelLLLLLLLLL = LLLLLLLLL();
        C0JEQ c0jeq = this.LLJLLIL;
        C2252321DDq c2252321DDq = combinedMaterialListViewModelLLLLLLLLL.LLILZLL;
        c2252321DDq.setValue(C13LP.LJLIL(arrayList, (Collection) c2252321DDq.getValue()));
        C0J19 c0j19 = this.LLLF;
        if (c0j19 != null && (c0jes = this.LLLII) != null) {
            c0jes.LIZ(c0j19.LJJLIIIJLLLLLLLZ());
        }
        RecyclerView recyclerView = this.LLJL;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS18S0101000_7(itemCount, this, 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene
    public final void LLLLLLL(ViewGroup viewGroup) {
        TuxTextView tuxTextView = this.LLJJJJJIL;
        if (tuxTextView != null) {
            C1378990lzN.LIZIZ(tuxTextView, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, null, null, 30);
        }
        if (this.LLJLLIL != null) {
            LLLLLLLLL().getClass();
        }
        RecyclerView recyclerView = this.LLJL;
        if (recyclerView != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(3, 1, requireContext(), false);
            CombinedMaterialListViewModel combinedMaterialListViewModelLLLLLLLLL = LLLLLLLLL();
            C0JEQ c0jeq = this.LLJLLIL;
            if (c0jeq == null) {
                c0jeq = C0JEL.LIZ;
            }
            ShortVideoContext shortVideoContext = this.LLJLILLLLZIIL;
            if (shortVideoContext != null) {
                C0JES c0jes = new C0JES(this, combinedMaterialListViewModelLLLLLLLLL, c0jeq, shortVideoContext, (ChooseMediaViewModel) C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class), this.LLLFZ, this.LLLI);
                this.LLLII = c0jes;
                C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class);
                this.LLLF = new C0J19(LLLLLLLLL(), c0jes, this.LLLIIII, this.LLLIIIIL, new AwS551S0100000_7(this, 417));
                C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class);
                this.LLLFF = new C0J1D(LLLLLLLLL(), c0jes, this.LLLIIII, this.LLLIIIIL);
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.addItemDecoration(new C425520GmM());
                recyclerView.setItemAnimator(null);
                C0JEH c0jeh = new C0JEH();
                c0jeh.LIZ = true;
                C0JEI c0jei = new C0JEI(c0jeh.LIZ, c0jeh.LIZIZ);
                ArrayList arrayList = new ArrayList();
                C0J1D c0j1d = this.LLLFF;
                if (c0j1d != null) {
                    arrayList.add(c0j1d);
                }
                C0J19 c0j19 = this.LLLF;
                if (c0j19 != null) {
                    arrayList.add(c0j19);
                }
                C21679919sz c21679919sz = new C21679919sz(c0jei, arrayList);
                recyclerView.setAdapter(c21679919sz);
                this.LLLFFI = c21679919sz;
                gridLayoutManager.LLIZ = new C521600Kcw(gridLayoutManager, this, 0);
                ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class);
                LLLLLJLJLL(chooseMediaViewModel);
                getScene();
                BaseJediViewModel.iR2(chooseMediaViewModel, this, new C2217381BqS() { // from class: X.0KfU
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ChooseMediaState) obj).getSelectMediaState();
                    }
                }, new AwS373S0200000_7(this, c0jes, 84));
                getScene();
                BaseJediViewModel.iR2(chooseMediaViewModel, this, new C2217381BqS() { // from class: X.0KfX
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ChooseMediaState) obj).getUnSelectMediaState();
                    }
                }, new AwS373S0200000_7(this, c0jes, 85));
                c0jes.LJIIIIZZ();
                recyclerView.addOnScrollListener(new AsS29S0200000_7(this, c0jes, 1));
                ((LiveData) LLLLLLLLL().LLILZIL.getValue()).observe(this, new AObserverS172S0200000_7(this, c0jes, 0));
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0J16(this, null), 3);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0J15(this, null), 3);
                List<OnThisDayTiktokMediaModel> listLLLLL = LLLLL();
                ArrayList<OnThisDayTiktokMediaModel> arrayList2 = (ArrayList) listLLLLL;
                if ((!arrayList2.isEmpty()) && ((List) LLLLLLLLL().LLIZ.getValue()).isEmpty()) {
                    if (this.LLJLLIL != null) {
                        LLLLLLLLL().getClass();
                    }
                    CombinedMaterialListViewModel combinedMaterialListViewModelLLLLLLLLL2 = LLLLLLLLL();
                    C0JEQ c0jeq2 = this.LLJLLIL;
                    C2252321DDq c2252321DDq = combinedMaterialListViewModelLLLLLLLLL2.LLILZLL;
                    c2252321DDq.setValue(C13LP.LJLIL(listLLLLL, (Collection) c2252321DDq.getValue()));
                    LLLLLLLLL().vQ2(new ArrayList());
                    for (OnThisDayTiktokMediaModel onThisDayTiktokMediaModel : arrayList2) {
                        C0J1D c0j1d2 = this.LLLFF;
                        if (c0j1d2 != null) {
                            c0j1d2.LLLII(onThisDayTiktokMediaModel);
                        }
                    }
                    C0J1D c0j1d3 = this.LLLFF;
                    if (c0j1d3 != null) {
                        c0j1d3.notifyDataSetChanged();
                    }
                } else {
                    C0JES c0jes2 = this.LLLII;
                    if (c0jes2 != null) {
                        if (((ArrayList) LLLLLLLLL().LLIZLLLIL).size() >= c0jes2.LJ()) {
                            this.LLLFZ.invoke(Boolean.TRUE);
                        }
                    }
                }
                CombinedMaterialListViewModel combinedMaterialListViewModelLLLLLLLLL3 = LLLLLLLLL();
                for (OnThisDayTiktokMediaModel onThisDayTiktokMediaModel2 : (ArrayList) combinedMaterialListViewModelLLLLLLLLL3.LLJ) {
                    onThisDayTiktokMediaModel2.isDefaultSelectItem = ((ArrayList) combinedMaterialListViewModelLLLLLLLLL3.LLIZLLLIL).contains(onThisDayTiktokMediaModel2);
                }
                return;
            }
            throw new IllegalStateException("ShortVideoContext required");
        }
    }
}
