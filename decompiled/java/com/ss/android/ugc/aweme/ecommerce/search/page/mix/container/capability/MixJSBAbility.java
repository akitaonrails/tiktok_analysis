package com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability;

import X.AbstractC677870QiP;
import X.AbstractC679120QkQ;
import X.C098200Yq;
import X.C0HA4;
import X.C0PEM;
import X.C139100g1;
import X.C1396605dM;
import X.C1397505dV;
import X.C13LP;
import X.C1422405hW;
import X.C1540620qC4;
import X.C189200o6;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23092093a;
import X.C23250099c;
import X.C675270QeD;
import X.C676490QgB;
import X.C676510QgD;
import X.C677400Qhe;
import X.C677430Qhh;
import X.C677440Qhi;
import X.C677470Qhl;
import X.C677480Qhm;
import X.C677540Qhs;
import X.C678110Qin;
import X.C678130Qip;
import X.C678140Qiq;
import X.C678240Qj0;
import X.C678560QjW;
import X.C679100QkO;
import X.C7740030o;
import X.InterfaceC1364105Vn;
import X.InterfaceC602590NkH;
import X.InterfaceC602810Nkd;
import X.InterfaceC675320QeI;
import X.InterfaceC676500QgC;
import X.InterfaceC677920QiU;
import X.InterfaceC678050Qih;
import Y.ARunnableS79S0200000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class MixJSBAbility implements IMixVSearchAbility, InterfaceC676500QgC {
    public C678130Qip LL;
    public InterfaceC678050Qih LLILLJJLI;
    public final Gson LLILLL = C7740030o.LIZ().getGson();

    @Override // X.InterfaceC676500QgC
    public final void onCreate() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onPause() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onResume() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final boolean Bs() {
        C677480Qhm c677480Qhm;
        C678130Qip c678130Qip = this.LL;
        return (c678130Qip == null || (c677480Qhm = c678130Qip.LJIILJJIL) == null || !c677480Qhm.LIZLLL()) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final View Ce() {
        C678130Qip c678130Qip = this.LL;
        if (c678130Qip != null) {
            return c678130Qip.LIZJ;
        }
        return null;
    }

    @Override // X.InterfaceC676500QgC
    public final void onDestroy() {
        if (((Boolean) C139100g1.LIZ.getValue()).booleanValue()) {
            this.LL = null;
            this.LLILLJJLI = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final Map<String, Object> Su(Map<String, String> map) {
        C677400Qhe c677400Qhe;
        C676490QgB c676490QgB;
        InterfaceC677920QiU interfaceC677920QiU;
        C678130Qip c678130Qip = this.LL;
        if (c678130Qip != null && (c677400Qhe = c678130Qip.LJIIJ) != null && (c676490QgB = c677400Qhe.LJII) != null && (interfaceC677920QiU = c676490QgB.LIZIZ) != null) {
            return interfaceC677920QiU.Su(map);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final void jP2(int i) {
        MixShopSearchBizVM mixShopSearchBizVM;
        NextLiveData<Integer> nextLiveData;
        C678130Qip c678130Qip = this.LL;
        if (c678130Qip != null && (mixShopSearchBizVM = c678130Qip.LJ) != null && (nextLiveData = mixShopSearchBizVM.LLJJIJIL) != null) {
            nextLiveData.setValue(Integer.valueOf(i));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final void sv(String str) {
        C677400Qhe c677400Qhe;
        C676490QgB c676490QgB;
        InterfaceC677920QiU interfaceC677920QiU;
        C678130Qip c678130Qip = this.LL;
        if (c678130Qip != null && (c677400Qhe = c678130Qip.LJIIJ) != null && (c676490QgB = c677400Qhe.LJII) != null && (interfaceC677920QiU = c676490QgB.LIZIZ) != null) {
            interfaceC677920QiU.sv(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final boolean uY1(boolean z) {
        C678140Qiq c678140Qiq;
        int i;
        C678130Qip c678130Qip = this.LL;
        if (c678130Qip != null && (c678140Qiq = c678130Qip.LJII) != null) {
            MixPageViewModel mixPageViewModel = c678140Qiq.LJIIL;
            if (mixPageViewModel == null) {
                mixPageViewModel = null;
            }
            NextLiveData<C678110Qin> nextLiveData = mixPageViewModel.LLJI;
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            nextLiveData.setValue(new C678110Qin(i));
        }
        return true;
    }

    public static C677470Qhl LIZ(C677470Qhl c677470Qhl, C677470Qhl c677470Qhl2) {
        k kVar;
        n nVar;
        String strLIZJ;
        k kVar2;
        String strLIZJ2;
        n nVar2;
        C678240Qj0 c678240Qj0;
        n nVar3;
        if (c677470Qhl2 != null && c677470Qhl2.LL != null) {
            C677470Qhl c677470Qhl3 = new C677470Qhl(c677470Qhl.LLILZIL);
            AbstractC677870QiP abstractC677870QiP = c677470Qhl.LL;
            c677470Qhl3.LL = abstractC677870QiP;
            c677470Qhl3.LLILLJJLI = c677470Qhl.LLILLJJLI;
            c677470Qhl3.LLILLL = c677470Qhl.LLILLL;
            c677470Qhl3.LLILZ = c677470Qhl.LLILZ;
            k kVar3 = null;
            if (abstractC677870QiP == null) {
                kVar = null;
            } else {
                try {
                    kVar = abstractC677870QiP.LJFF;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return c677470Qhl3;
                }
            }
            if (kVar instanceof n) {
                nVar = (n) kVar;
            } else {
                nVar = null;
            }
            if (nVar == null) {
                strLIZJ = null;
            } else {
                strLIZJ = C678560QjW.LIZJ(nVar, "raw_data");
            }
            AbstractC677870QiP abstractC677870QiP2 = c677470Qhl2.LL;
            if (abstractC677870QiP2 != null) {
                kVar2 = abstractC677870QiP2.LJFF;
            } else {
                kVar2 = null;
            }
            if ((kVar2 instanceof n) && (nVar3 = (n) kVar2) != null) {
                strLIZJ2 = C678560QjW.LIZJ(nVar3, "raw_data");
            } else {
                strLIZJ2 = null;
            }
            if (strLIZJ != null && strLIZJ2 != null) {
                C23092093a.LIZ.getClass();
                String strLIZJ3 = C23092093a.LIZJ(strLIZJ, strLIZJ2);
                AbstractC677870QiP abstractC677870QiP3 = c677470Qhl3.LL;
                if ((abstractC677870QiP3 instanceof C678240Qj0) && (c678240Qj0 = (C678240Qj0) abstractC677870QiP3) != null) {
                    c678240Qj0.LJIIIIZZ = strLIZJ3;
                }
                if (abstractC677870QiP3 != null) {
                    kVar3 = abstractC677870QiP3.LJFF;
                }
                if ((kVar3 instanceof n) && (nVar2 = (n) kVar3) != null) {
                    nVar2.LJJIIJ("raw_data", strLIZJ3);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return c677470Qhl3;
        }
        return c677470Qhl;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0096 A[EDGE_INSN: B:88:0x0096->B:54:0x0096 BREAK  A[LOOP:0: B:35:0x005a->B:91:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[LOOP:0: B:35:0x005a->B:91:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.AbstractC677840QiM r11, X.InterfaceC1364105Vn<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixJSBAbility.LIZIZ(X.0QiM, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final Object OP0(InterfaceC602810Nkd interfaceC602810Nkd, InterfaceC1364105Vn<? super Pair<Boolean, String>> interfaceC1364105Vn) {
        C678140Qiq c678140Qiq;
        n nVar;
        MixPageViewModel mixPageViewModel;
        C1396605dM c1396605dM;
        C677540Qhs c677540Qhs;
        if (interfaceC602810Nkd.getCardInfo().isEmpty()) {
            return new Pair(false, "card info is empty!");
        }
        C678130Qip c678130Qip = this.LL;
        C1422405hW c1422405hWLIZIZ = null;
        if (c678130Qip != null) {
            c678140Qiq = c678130Qip.LJII;
        } else {
            c678140Qiq = null;
        }
        k kVarLJ = C678560QjW.LJ(interfaceC602810Nkd.getCardInfo());
        if ((kVarLJ instanceof n) && (nVar = (n) kVarLJ) != null) {
            if (c678140Qiq != null && (mixPageViewModel = c678140Qiq.LJIIL) != null && (c1396605dM = mixPageViewModel.LLILZ) != null && (c677540Qhs = c1396605dM.LJ) != null) {
                c1422405hWLIZIZ = c677540Qhs.LIZIZ(nVar, new C675270QeD(0));
            }
            C1DFH c1dfh = C0PEM.LIZ;
            return C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C677430Qhh(c1422405hWLIZIZ, interfaceC602810Nkd, c678140Qiq, this, null));
        }
        return new Pair(false, "insert card error code = 0");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0OUI, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final void OR0(final View view, final InterfaceC602590NkH interfaceC602590NkH) {
        View viewFindViewById;
        final FrameLayout frameLayout;
        C679100QkO c679100QkOLIZ;
        C678130Qip c678130Qip;
        C678140Qiq c678140Qiq;
        MixPageViewModel mixPageViewModel;
        C1396605dM c1396605dM;
        C1397505dV c1397505dV;
        List<Integer> listLIZIZ;
        Integer num;
        int iIntValue;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        Fragment fragment;
        View view2;
        C678130Qip c678130Qip2 = this.LL;
        RecyclerView.LayoutManager layoutManager = null;
        if (c678130Qip2 != null && (fragment = c678130Qip2.LIZIZ) != null && (view2 = fragment.getView()) != null) {
            viewFindViewById = view2.findViewById(R.id.v_search_fourth_layer);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof FrameLayout) {
            frameLayout = (FrameLayout) viewFindViewById;
        } else {
            frameLayout = null;
        }
        InterfaceC678050Qih interfaceC678050Qih = this.LLILLJJLI;
        if (interfaceC678050Qih != null) {
            c679100QkOLIZ = interfaceC678050Qih.LIZ();
        } else {
            c679100QkOLIZ = null;
        }
        if (frameLayout != null && (c678130Qip = this.LL) != null) {
            final C1540620qC4 c1540620qC4 = c678130Qip.LJIIIIZZ;
            ?? r4 = new AbstractC679120QkQ(view, interfaceC602590NkH, frameLayout, c1540620qC4) { // from class: X.0OUI
                public final View LLILLL;
                public final InterfaceC602590NkH LLILZ;
                public final FrameLayout LLILZIL;
                public final C1540620qC4 LLILZLL;

                @Override // X.AbstractC679120QkQ
                public final String LJFF() {
                    return "show_filter_sort_arrow_panel";
                }

                @Override // X.AbstractC679120QkQ
                public final int getPriority() {
                    return 10;
                }

                @Override // X.AbstractC679120QkQ
                public final void run() {
                    View view3;
                    C1537720q7O c1537720q7O;
                    C1540620qC4 c1540620qC42;
                    C1537720q7O c1537720q7O2;
                    C1540620qC4 c1540620qC43;
                    if (Intrinsics.LJFF(this.LLILZ.getActionName(), "dismiss")) {
                        if (this.LLILZIL.getChildCount() > 0) {
                            Iterator<View> it2 = new C09RD(this.LLILZIL).iterator();
                            while (true) {
                                C09RE c09re = (C09RE) it2;
                                if (!c09re.hasNext()) {
                                    break;
                                }
                                View view4 = (View) c09re.next();
                                if ((view4 instanceof C1537720q7O) && (c1537720q7O2 = (C1537720q7O) view4) != null && (c1540620qC43 = this.LLILZLL) != null) {
                                    c1540620qC43.LJJII(c1537720q7O2);
                                }
                            }
                            C786410Ut5.LJJJJIZL(this.LLILZIL);
                        }
                        C786410Ut5.LJZ(8, this.LLILZIL);
                        return;
                    }
                    if (Intrinsics.LJFF(this.LLILZ.getActionName(), "show")) {
                        C1227904rF c1227904rF = C1227904rF.LIZ;
                        Map<String, Object> lynxData = this.LLILZ.getLynxData();
                        c1227904rF.getClass();
                        C679540Ql6 c679540Ql6 = new C679540Ql6("filter_sort_arrow_panel", TemplateData.LJIIIIZZ(C1227904rF.LJI(lynxData)), Boolean.TRUE, null, null, null, null, null, this.LLILZ.getSchema(), null, 31220);
                        if (this.LLILZIL.getChildCount() > 0) {
                            Iterator<View> it3 = new C09RD(this.LLILZIL).iterator();
                            while (true) {
                                C09RE c09re2 = (C09RE) it3;
                                if (!c09re2.hasNext()) {
                                    break;
                                }
                                View view5 = (View) c09re2.next();
                                if ((view5 instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) view5) != null && (c1540620qC42 = this.LLILZLL) != null) {
                                    c1540620qC42.LJJII(c1537720q7O);
                                }
                            }
                            C786410Ut5.LJJJJIZL(this.LLILZIL);
                        }
                        int iIntValue2 = 0;
                        C786410Ut5.LJZ(0, this.LLILZIL);
                        C1540620qC4 c1540620qC44 = this.LLILZLL;
                        if (c1540620qC44 != null) {
                            C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
                            View viewLJIILIIL = c1540620qC44.LJIILIIL(c679540Ql6, null);
                            if (viewLJIILIIL != null) {
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                Object parent = this.LLILLL.getParent();
                                if ((parent instanceof ViewGroup) && (view3 = (View) parent) != null) {
                                    iIntValue2 = Integer.valueOf(view3.getBottom() + ((int) view3.getTranslationY())).intValue();
                                }
                                layoutParams.topMargin = iIntValue2;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewLJIILIIL);
                                viewLJIILIIL.setLayoutParams(layoutParams);
                                this.LLILZIL.addView(viewLJIILIIL);
                            }
                        }
                    }
                }

                {
                    this.LLILLL = view;
                    this.LLILZ = interfaceC602590NkH;
                    this.LLILZIL = frameLayout;
                    this.LLILZLL = c1540620qC4;
                }
            };
            if ((c678130Qip.LIZLLL.getVisibility() == 0 && c678130Qip.LIZLLL.getChildCount() > 0) || (c678140Qiq = c678130Qip.LJII) == null || (mixPageViewModel = c678140Qiq.LJIIL) == null || (c1396605dM = mixPageViewModel.LLILZ) == null || (c1397505dV = c1396605dM.LIZLLL) == null || (listLIZIZ = c1397505dV.LIZIZ()) == null || (num = (Integer) C13LP.LJJLL(listLIZIZ)) == null || (iIntValue = num.intValue()) <= 0 || !Intrinsics.LJFF(interfaceC602590NkH.getActionName(), "show")) {
                if (c679100QkOLIZ != null) {
                    C679100QkO.LIZIZ(c679100QkOLIZ, r4);
                    return;
                }
                return;
            }
            C0HA4 c0ha4 = c678130Qip.LJI;
            if (c0ha4 != null) {
                layoutManager = c0ha4.getLayoutManager();
            }
            if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
                staggeredGridLayoutManager.scrollToPositionWithOffset(iIntValue, 0);
            }
            C0HA4 c0ha42 = c678130Qip.LJI;
            if (c0ha42 != null) {
                HandlerHook.viewPost(c0ha42, new ARunnableS79S0200000_10(c679100QkOLIZ, (Object) r4, 7));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final void Se(int i, Map<String, String> map) {
        C677400Qhe c677400Qhe;
        C676510QgD c676510QgD;
        InterfaceC675320QeI interfaceC675320QeI;
        C678130Qip c678130Qip = this.LL;
        if (c678130Qip != null && (c677400Qhe = c678130Qip.LJIIJ) != null && (c676510QgD = c677400Qhe.LJI) != null && (interfaceC675320QeI = c676510QgD.LIZ) != null) {
            interfaceC675320QeI.Se(i, map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    public final Map X22(String str, String str2, Map map, Map map2) {
        ListenableFuture<n> listenableFutureDoGet;
        C678140Qiq c678140Qiq;
        MixShopSearchBizVM mixShopSearchBizVM;
        try {
            String str3 = EcSearchMixApi.LIZ;
            boolean z = false;
            if (!Intrinsics.LJFF(str2, "GET") && !Intrinsics.LJFF(str2, "get")) {
                EcSearchMixApi.RealApi realApi = (EcSearchMixApi.RealApi) EcSearchMixApi.LIZIZ.getValue();
                if (map2 == null || map2.isEmpty()) {
                    z = true;
                }
                if (z) {
                    map2 = C2097608Jq.LJ();
                }
                listenableFutureDoGet = realApi.doPost(str, map, map2);
            } else {
                EcSearchMixApi.RealApi realApi2 = (EcSearchMixApi.RealApi) EcSearchMixApi.LIZIZ.getValue();
                if (map2 == null || map2.isEmpty()) {
                    z = true;
                }
                if (z) {
                    map2 = C2097608Jq.LJ();
                }
                listenableFutureDoGet = realApi2.doGet(str, map, map2);
            }
            n nVar = listenableFutureDoGet.get();
            if (nVar != null) {
                C678130Qip c678130Qip = this.LL;
                if (c678130Qip != null) {
                    c678140Qiq = c678130Qip.LJII;
                } else {
                    c678140Qiq = null;
                }
                if (c678130Qip == null) {
                    mixShopSearchBizVM = null;
                } else {
                    mixShopSearchBizVM = c678130Qip.LJ;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C677440Qhi(c678140Qiq, nVar, mixShopSearchBizVM, this, null), 3);
                if (!(nVar instanceof m)) {
                    return (Map) this.LLILLL.LIZLLL(nVar, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00W7
                    }.getType());
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object XW(android.view.View r4, java.lang.String r5, java.lang.String r6, java.lang.Integer r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r3 = this;
            X.0Qip r0 = r3.LL
            r1 = 0
            if (r0 == 0) goto L84
            X.0Qiq r1 = r0.LJII
            com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM r2 = r0.LJ
        L9:
            int r0 = r5.hashCode()
            switch(r0) {
                case -1650982610: goto L13;
                case -1038862339: goto L1c;
                case 75330704: goto L2e;
                case 1409778926: goto L25;
                case 1524472975: goto L52;
                case 1772093451: goto L5b;
                default: goto L10;
            }
        L10:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L13:
            java.lang.String r0 = "VoucherPendant"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            goto L10
        L1c:
            java.lang.String r0 = "OrderReward"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            goto L10
        L25:
            java.lang.String r0 = "ListCard"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L36
            goto L10
        L2e:
            java.lang.String r0 = "ExclusiveCouponBanner"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L10
        L36:
            if (r1 == 0) goto L10
            com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel r0 = r1.LJIIL
            if (r0 == 0) goto L10
            X.1DEK r2 = r0.LLILZLL
            if (r2 == 0) goto L10
            X.05dU r1 = new X.05dU
            r0 = 25
            r1.<init>(r6, r7, r0)
            java.lang.Object r1 = r2.LJIJI(r1, r8)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L86
            return r1
        L52:
            java.lang.String r0 = "ProgressPendant"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            goto L10
        L5b:
            java.lang.String r0 = "CrackEgg"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L64
            goto L10
        L64:
            if (r2 == 0) goto L10
            java.lang.Thread r1 = X.C786410Ut5.u3()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<java.lang.String> r0 = r2.LLJJIJI
            r0.setValue(r5)
            goto L10
        L7e:
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<java.lang.String> r0 = r2.LLJJIJI
            r0.postValue(r5)
            goto L10
        L84:
            r2 = r1
            goto L9
        L86:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixJSBAbility.XW(android.view.View, java.lang.String, java.lang.String, java.lang.Integer, X.05Vn):java.lang.Object");
    }
}
