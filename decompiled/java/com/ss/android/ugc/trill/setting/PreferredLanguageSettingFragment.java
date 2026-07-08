package com.ss.android.ugc.trill.setting;

import X.AbstractC21673619ry;
import X.AbstractC848400XPy;
import X.AnonymousClass1270;
import X.AnonymousClass1274;
import X.C01GW;
import X.C07MP;
import X.C098200Yq;
import X.C0OM1;
import X.C0WZX;
import X.C0XQ7;
import X.C11S5;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C12ES;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C189200o6;
import X.C197026126u;
import X.C197031126z;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C20703515zt;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C343970De7;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC197030126y;
import X.InterfaceC626120Oh8;
import Y.ACListenerS163S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.AsS55S0100000_29;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class PreferredLanguageSettingFragment extends Fragment implements AnonymousClass1274, InterfaceC197030126y {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZjYpPTs6JiJiHELIOSGT02LiA+Oyo3BCQiLjoyLyAfLDsnISsrDz0yLygpJzs=";
    public int LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 768));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 771));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 770));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 769));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 764));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 685));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 684));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 772));

    public final RecyclerView LLII() {
        return (RecyclerView) this.LL.getValue();
    }

    public final TuxNavBar MR() {
        return (TuxNavBar) this.LLILLL.getValue();
    }

    public final PreferredLanguageSettingPageViewModel NR() {
        return (PreferredLanguageSettingPageViewModel) this.LLJ.getValue();
    }

    public final boolean OR() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("IS_HALF_SHEET");
        }
        return false;
    }

    public final void PR() {
        PreferredLanguageSettingPageViewModel preferredLanguageSettingPageViewModelNR = NR();
        preferredLanguageSettingPageViewModelNR.LLILZLL.postValue(Boolean.TRUE);
        final C197026126u c197026126u = preferredLanguageSettingPageViewModelNR.LLJJ;
        List listVQ2 = PreferredLanguageSettingPageViewModel.vQ2(preferredLanguageSettingPageViewModelNR.LLJ.getValue());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listVQ2, 10));
        Iterator it2 = listVQ2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C197031126z) it2.next()).LIZ);
        }
        final String[] strArr = (String[]) arrayList.toArray(new String[0]);
        List listVQ22 = PreferredLanguageSettingPageViewModel.vQ2(preferredLanguageSettingPageViewModelNR.LLJ.getValue());
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listVQ22, 10));
        Iterator it3 = listVQ22.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C197031126z) it3.next()).LIZIZ);
        }
        arrayList2.toArray(new String[0]);
        c197026126u.getClass();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            c197026126u.LIZIZ.LIZ("content_language", C13LQ.LJJJ(strArr, ",", null, null, null, 62), 2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<BaseResponse>() { // from class: X.126w
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    InterfaceC197030126y interfaceC197030126y = c197026126u.LIZ;
                    if (interfaceC197030126y != null) {
                        interfaceC197030126y.VG(th);
                    }
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(BaseResponse baseResponse) {
                    InterfaceC197030126y interfaceC197030126y;
                    if (baseResponse.status_code == 0 && (interfaceC197030126y = c197026126u.LIZ) != null) {
                        interfaceC197030126y.n4(strArr);
                    }
                }
            });
        }
    }

    @Override // X.AnonymousClass1274
    public final void AQ(boolean z) {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("enter_from")) != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", string);
            C20684815ws.LJIILLIIL("enter_preferred_lang_more", c2344009Gk.LIZ);
        }
        PreferredLanguageSettingPageViewModel preferredLanguageSettingPageViewModelNR = NR();
        preferredLanguageSettingPageViewModelNR.LLIZ.setValue(Boolean.valueOf(z));
        MutableLiveData<Boolean> mutableLiveData = preferredLanguageSettingPageViewModelNR.LLIZ;
        mutableLiveData.postValue(mutableLiveData.getValue());
    }

    @Override // X.InterfaceC197030126y
    public final void VG(Throwable th) {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131834217);
        c1389890mGx.LJIIJJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC197030126y
    public final void n4(String[] strArr) throws Throwable {
        C19EG activity;
        String string;
        int i;
        Integer numValueOf;
        String str;
        MutableLiveData mutableLiveData;
        Boolean bool;
        Integer numValueOf2;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("enter_from")) != null) {
            int i2 = 1;
            if (C13LQ.LJJIJIIJI(((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage(), strArr) >= 0) {
                i = 1;
            } else {
                i = 0;
            }
            List listLJJJJI = C13LP.LJJJJI(C13LQ.LJJLIIIJJIZ(4, C07MP.LIZ()));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJI, 10));
            int i3 = 0;
            for (Object obj : listLJJJJI) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    if (C13LQ.LJJIJIIJI(((ContentLanguage) obj).getLanguageCode(), strArr) >= 0) {
                        numValueOf2 = Integer.valueOf(i3);
                    } else {
                        numValueOf2 = null;
                    }
                    arrayList.add(numValueOf2);
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            Object[] array = C13LP.LJJJJI(C13LP.LJJJJLI(arrayList)).toArray(new Integer[0]);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", string);
            c2344009Gk.LJ(strArr, "lang");
            c2344009Gk.LIZJ(strArr.length, "lang_num");
            c2344009Gk.LIZJ(i, "is_app_lang");
            c2344009Gk.LJ(array, "lang_rank");
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                numValueOf = Integer.valueOf(arguments2.getInt("previous_popup_shown_count"));
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "previous_popup_cnt");
            String[] strArr2 = NR().LLILZ;
            if (strArr2.length > 0) {
                str = strArr2[0];
            } else {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("model_language", str);
            if (!OR() || (mutableLiveData = NR().LLJILJILJ) == null || (bool = (Boolean) mutableLiveData.getValue()) == null || !bool.booleanValue()) {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_show_more");
            C20684815ws.LJIILLIIL("save_preferred_lang", c2344009Gk.LIZ);
        }
        ((ITranslationLangKevaService) ServiceManager.get().getService(ITranslationLangKevaService.class)).LIZLLL(strArr);
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : strArr) {
            C20703515zt.LIZ.getClass();
            String strLJII = C20703515zt.LJII(str2);
            if (strLJII != null) {
                arrayList2.add(strLJII);
            }
        }
        ((ITranslationLangKevaService) ServiceManager.get().getService(ITranslationLangKevaService.class)).LJ((String[]) arrayList2.toArray(new String[0]));
        if (OR() && (activity = getActivity()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131836410);
            c1389890mGx.LJIIJJI();
        }
        if (OR()) {
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
            return;
        }
        Intent intent = new Intent();
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C2204961BRm.LLJJIJIL(-1, intent, activity2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KPmtd4vH0jWWUAPt10yvrH2MYncNBSISeVQ+jhbX+6nfcSxfLVSlcqc=", null));
        }
        C19EG activity3 = getActivity();
        if (activity3 == null) {
            return;
        }
        activity3.finish();
    }

    @Override // X.AnonymousClass1274
    public final void VK(String str, boolean z) {
        C197031126z next;
        if (Intrinsics.LJFF(NR().LLJI.getValue(), Boolean.FALSE)) {
            PreferredLanguageSettingPageViewModel preferredLanguageSettingPageViewModelNR = NR();
            List<C197031126z> value = preferredLanguageSettingPageViewModelNR.LLJ.getValue();
            if (value != null) {
                Iterator<C197031126z> it2 = value.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(str, next.LIZ)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C197031126z c197031126z = next;
                if (c197031126z != null) {
                    c197031126z.LIZJ = z;
                }
            }
            List listVQ2 = PreferredLanguageSettingPageViewModel.vQ2(preferredLanguageSettingPageViewModelNR.LLJ.getValue());
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listVQ2, 10));
            Iterator it3 = listVQ2.iterator();
            while (it3.hasNext()) {
                arrayList.add(((C197031126z) it3.next()).LIZ);
            }
            preferredLanguageSettingPageViewModelNR.LLIZLLLIL.postValue(Boolean.valueOf(!C13LQ.LJLIIL(preferredLanguageSettingPageViewModelNR.LLILLL).equals(C13LQ.LJLIIL(arrayList.toArray(new String[0])))));
            MutableLiveData<List<C197031126z>> mutableLiveData = preferredLanguageSettingPageViewModelNR.LLJ;
            mutableLiveData.postValue(mutableLiveData.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerViewLLII;
        String str;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerViewLLII2 = LLII();
        if (recyclerViewLLII2 != null) {
            recyclerViewLLII2.setAdapter(new AnonymousClass1270(this));
            recyclerViewLLII2.setLayoutManager(new WrapLinearLayoutManager(recyclerViewLLII2.getContext()));
        }
        if (OR()) {
            String[] strArr = NR().LLILZ;
            if (strArr.length > 0) {
                str = strArr[0];
            } else {
                str = "";
            }
            if (Intrinsics.LJFF(str, ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage())) {
                RecyclerView recyclerViewLLII3 = LLII();
                AbstractC21673619ry adapter = null;
                if (recyclerViewLLII3 != null) {
                    adapter = recyclerViewLLII3.getAdapter();
                }
                if ((adapter instanceof AnonymousClass1270) && adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }
        if (OR()) {
            TuxNavBar tuxNavBarMR = MR();
            if (tuxNavBarMR != null) {
                C0OM1 c0om1 = new C0OM1();
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = getString(2131836407);
                c0om1.LIZJ = c1250250idj;
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZJ(new AwS573S0100000_29(this, 765));
                c0om1.LIZIZ(c1251150ifB);
                tuxNavBarMR.setNavActions(c0om1);
            }
            TuxNavBar tuxNavBarMR2 = MR();
            if (tuxNavBarMR2 != null) {
                tuxNavBarMR2.setNavBackground(-1);
            }
            TuxNavBar tuxNavBarMR3 = MR();
            if (tuxNavBarMR3 != null) {
                C786410Ut5.C5(tuxNavBarMR3, 0.0f);
            }
            TuxNavBar tuxNavBarMR4 = MR();
            if (tuxNavBarMR4 != null) {
                C786410Ut5.LLLLZLLLI(tuxNavBarMR4, 0);
            }
            TuxNavBar tuxNavBar = (TuxNavBar) this.LLILLJJLI.getValue();
            if (tuxNavBar != null) {
                C0OM1 c0om12 = new C0OM1();
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_x_mark_small;
                c0om12.LIZIZ(c1251150ifB2);
                tuxNavBar.setNavActions(c0om12);
            }
            TuxNavBar tuxNavBar2 = (TuxNavBar) this.LLILLJJLI.getValue();
            if (tuxNavBar2 != null) {
                C786410Ut5.LLLLZLLLI(tuxNavBar2, 0);
            }
            View view2 = (View) this.LLILZIL.getValue();
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            View view3 = (View) this.LLILZIL.getValue();
            if (view3 != null) {
                C786410Ut5.I7(new ACListenerS163S0100000_29(this, 158), view3);
            }
            View view4 = (View) this.LLILZIL.getValue();
            if (view4 != null) {
                view4.setEnabled(true);
            }
            RecyclerView recyclerViewLLII4 = LLII();
            if (recyclerViewLLII4 != null) {
                recyclerViewLLII4.setPadding(0, 0, 0, (int) C12ES.LIZJ(20.0f, getContext()));
            }
        } else {
            TuxNavBar tuxNavBarMR5 = MR();
            if (tuxNavBarMR5 != null) {
                C0OM1 c0om13 = new C0OM1();
                C1250300ido c1250300ido = new C1250300ido();
                c1250300ido.LIZJ = getString(2131828217);
                c1250300ido.LIZ(new AwS573S0100000_29(this, 766));
                c0om13.LJ(c1250300ido);
                C1250250idj c1250250idj2 = new C1250250idj();
                c1250250idj2.LIZJ = getString(2131836408);
                c0om13.LIZJ = c1250250idj2;
                C1250300ido c1250300ido2 = new C1250300ido();
                c1250300ido2.LIZJ = getString(2131834695);
                c1250300ido2.LIZIZ = "nav_end";
                c1250300ido2.LIZ(new AwS573S0100000_29(this, 767));
                c0om13.LIZIZ(c1250300ido2);
                tuxNavBarMR5.setNavActions(c0om13);
            }
            TuxNavBar tuxNavBarMR6 = MR();
            if (tuxNavBarMR6 != null) {
                C786410Ut5.LLLLZLLLI(tuxNavBarMR6, 0);
            }
            View view5 = (View) this.LLILZIL.getValue();
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            int iIntValue = C1308910kAL.LIZJ(R.attr.zp, requireContext()).intValue();
            view.setBackgroundColor(iIntValue);
            TuxNavBar tuxNavBarMR7 = MR();
            if (tuxNavBarMR7 != null) {
                tuxNavBarMR7.setNavBackground(iIntValue);
            }
            TuxNavBar tuxNavBar3 = (TuxNavBar) this.LLILLJJLI.getValue();
            if (tuxNavBar3 != null) {
                tuxNavBar3.setNavBackground(iIntValue);
            }
        }
        NR().LLJILJIL.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(this, 118));
        NR().LLJILJILJ.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(this, 119));
        NR().LLJILLL.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(this, 120));
        NR().LLJIJIL.observe(getViewLifecycleOwner(), new AObserverS231S0100000_29(this, 117));
        if (OR() && (recyclerViewLLII = LLII()) != null) {
            recyclerViewLLII.addOnScrollListener(new AsS55S0100000_29(this, 8));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f7d, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
