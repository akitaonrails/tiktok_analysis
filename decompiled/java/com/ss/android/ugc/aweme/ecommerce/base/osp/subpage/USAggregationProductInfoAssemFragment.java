package com.ss.android.ugc.aweme.ecommerce.base.osp.subpage;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C034S;
import X.C03EQ;
import X.C03H5;
import X.C03HJ;
import X.C049Z;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C10508049a;
import X.C10512049e;
import X.C10513049f;
import X.C1120604Zw;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1318510kPp;
import X.C13LE;
import X.C14EU;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1713070ugD;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C21588819eI;
import X.C21588919eJ;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C719102rN;
import X.C719202rO;
import X.C719302rP;
import X.C723002s0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C756302xN;
import X.C766302yz;
import X.C786410Ut5;
import X.C799403Ai;
import X.C802003Bi;
import X.C814420VxA;
import X.C815203Gk;
import X.C939603lq;
import X.C960203pA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1164530gPT;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1748810vbr;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC911603hK;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public final class USAggregationProductInfoAssemFragment extends ECBaseFragment implements InterfaceC1164530gPT, InterfaceC724530SbT {
    public static final C03HJ LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static TuxSheet LLJJ = null;
    public static int LLJJI = 0;
    public static USAggregationProductInfoAssemFragment LLJJIII = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGs/HELIOSPC0jKSIpZxoACSIrOyo0KTElJiEDOiooPCwnASsqJg4gOyAhDz0yLygpJzs=";
    public TuxNavBar LLILLL;
    public C1318510kPp LLILZ;
    public RecyclerView LLILZIL;
    public C815203Gk LLILZLL;
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public C939603lq LLJ;
    public long LLJI;
    public String LLJIJIL;
    public Map<String, String> LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USAggregationProductInfoAssemFragment.class, "assemViewModel", "getAssemViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJILJ = new C03HJ();
        LLJJI = -1;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "item_details";
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public USAggregationProductInfoAssemFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1263);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(269);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1264), aFwS228S0000000_1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new AwS545S0100000_1((Fragment) this, 1265), aFwS228S0000000_1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS545S0100000_1, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1266), aFwS228S0000000_1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1262));
        this.LLJIJIL = "return";
    }

    public final OrderSubmitAssemViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final RecyclerView WR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.us_aggregation_order_product_info_fragment_shop_container) : null;
            this.LLILZIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        VR().LLLZLZ.LJIIL(this, "a2270.b93391", VR().LLLZLZ.LIZJ("c3646.d4964", null));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("restore_sku_quantity_event", this);
        LLJJ = null;
        C1713070ugD.LIZIZ(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        IECommerceHostService iECommerceHostService;
        super.onStop();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        if (rootPageMonitor != null && rootPageMonitor.LJFF()) {
            this.LLJIJIL = "close";
        }
        USAggregationProductInfoAssemFragment uSAggregationProductInfoAssemFragment = LLJJIII;
        if (uSAggregationProductInfoAssemFragment != null) {
            C1748720vbi.LIZIZ(uSAggregationProductInfoAssemFragment, new C10508049a(), new AwS580S0100000_1(this, 212));
        }
        USAggregationProductInfoAssemFragment uSAggregationProductInfoAssemFragment2 = LLJJIII;
        if (uSAggregationProductInfoAssemFragment2 != null) {
            C1748720vbi.LIZIZ(uSAggregationProductInfoAssemFragment2, new C10512049e(), new AwS580S0100000_1(this, 213));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS580S0100000_1(this, 211));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJI = System.currentTimeMillis();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("restore_sku_quantity_event", this);
        LLJJIII = this;
        C1713070ugD.LIZ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSkuInfoChangeEvent(C766302yz c766302yz) {
        for (C719302rP c719302rP : c766302yz.LIZ.LLILLJJLI) {
            if (c719302rP.LLJJLIIIJLLLLLLLZ == LLJJI && C756302xN.LIZ(c719302rP.LLIZLLLIL)) {
                C815203Gk c815203Gk = this.LLILZLL;
                if (c815203Gk != null) {
                    c815203Gk.LLLI(c719302rP.LLIZLLLIL);
                    return;
                }
                return;
            }
        }
        TuxSheet tuxSheet = LLJJ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C802003Bi c802003Bi;
        Integer num;
        if (Intrinsics.LJFF(str, "restore_sku_quantity_event") && (c802003Bi = VR().LLLLZIL) != null && (num = c802003Bi.LIZIZ) != null) {
            int iIntValue = num.intValue();
            C939603lq c939603lq = this.LLJ;
            if (c939603lq != null) {
                c939603lq.setQuantity(iIntValue);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        String string;
        Object obj2;
        List list;
        LaneParams laneParamsLIZIZ;
        LaneParams laneParamsLIZIZ2;
        Object obj3;
        Boolean bool;
        LaneParams laneParamsLIZIZ3;
        Object obj4;
        boolean zBooleanValue;
        Boolean bool2;
        LaneParams laneParamsLIZIZ4;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        View viewFindViewById = null;
        int i = 1;
        if (view2 != null && WR().getAdapter() == null) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModelVR = VR();
            int i2 = LLJJI;
            InterfaceC1748810vbr interfaceC1748810vbrD8 = d8();
            if (interfaceC1748810vbrD8 != null && (laneParamsLIZIZ4 = C1748730vbj.LIZIZ(interfaceC1748810vbrD8, "lib_track_builtin_lane_business")) != null) {
                obj4 = laneParamsLIZIZ4.get((Object) "show_gift");
            } else {
                obj4 = null;
            }
            if ((obj4 instanceof Boolean) && (bool2 = (Boolean) obj4) != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = true;
            }
            this.LLILZLL = new C815203Gk(orderSubmitAssemViewModelVR, this, i2, zBooleanValue, getLifecycle());
            WR().setLayoutManager(new LinearLayoutManager(view2.getContext()));
            WR().addItemDecoration(new C21588819eI(view2.getContext(), new C21588919eJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), R.attr.nd, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)))));
            WR().setAdapter(this.LLILZLL);
            WR().setItemAnimator(null);
        }
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.03JG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj5) {
                return Boolean.valueOf(((C03JV) obj5).LLJJJ);
            }
        }, null, new AwS615S0100000_1(this, 191), 6);
        View viewFindViewById2 = this.LLILLL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.us_aggregation_order_product_info_fragment_title);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLL = (TuxNavBar) viewFindViewById2;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById2;
        C0OM1 c0om1 = new C0OM1();
        InterfaceC1748810vbr interfaceC1748810vbrD82 = d8();
        if (interfaceC1748810vbrD82 != null && (laneParamsLIZIZ3 = C1748730vbj.LIZIZ(interfaceC1748810vbrD82, "lib_track_builtin_lane_business")) != null) {
            obj = laneParamsLIZIZ3.get((Object) "product_detail_from_combined_sku");
        } else {
            obj = null;
        }
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue()) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1260));
            c0om1.LJ(c1251150ifB);
        }
        c0om1.LIZJ(C960203pA.LIZ(R.attr.a1f, view.getContext()));
        C1250250idj c1250250idj = new C1250250idj();
        InterfaceC1748810vbr interfaceC1748810vbrD83 = d8();
        if (interfaceC1748810vbrD83 == null || (laneParamsLIZIZ2 = C1748730vbj.LIZIZ(interfaceC1748810vbrD83, "lib_track_builtin_lane_business")) == null || (obj3 = laneParamsLIZIZ2.get((Object) "product_panel_title")) == null || (string = obj3.toString()) == null) {
            string = "";
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB2.LIZLLL = true;
        c1251150ifB2.LIZJ(new AwS545S0100000_1(this, 1261));
        c0om1.LIZIZ(c1251150ifB2);
        tuxNavBar.setNavActions(c0om1);
        View viewFindViewById3 = this.LLILLL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.us_aggregation_order_product_info_fragment_title);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLL = (TuxNavBar) viewFindViewById3;
        }
        ((TuxNavBar) viewFindViewById3).LJIIZILJ(true);
        USAggregationProductInfoAssemFragment uSAggregationProductInfoAssemFragment = LLJJIII;
        if (uSAggregationProductInfoAssemFragment != null) {
            C1748720vbi.LIZIZ(uSAggregationProductInfoAssemFragment, new C049Z(), new AwS580S0100000_1(this, 214));
        }
        USAggregationProductInfoAssemFragment uSAggregationProductInfoAssemFragment2 = LLJJIII;
        if (uSAggregationProductInfoAssemFragment2 != null) {
            C1748720vbi.LIZIZ(uSAggregationProductInfoAssemFragment2, new C10513049f(), AFwS228S0000000_1.get$arr$(268));
        }
        InterfaceC1748810vbr interfaceC1748810vbrD84 = d8();
        if (interfaceC1748810vbrD84 != null && (laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbrD84, "lib_track_builtin_lane_business")) != null) {
            obj2 = laneParamsLIZIZ.get((Object) "shop_info_list");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof List) && (list = (List) obj2) != null) {
            C815203Gk c815203Gk = this.LLILZLL;
            if (c815203Gk != null) {
                c815203Gk.LLLI(list);
            }
            C799403Ai.LIZ.getClass();
            ((LinkedHashMap) C799403Ai.LJ).clear();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List<C723002s0> list2 = ((C719202rO) it2.next()).LLJIJIL;
                if (list2 != null) {
                    Iterator<C723002s0> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List<C719102rN> list3 = it3.next().LLJ;
                        if (list3 != null) {
                            for (C719102rN c719102rN : list3) {
                                String str = c719102rN.LLILZLL;
                                if (str != null) {
                                    Map<String, Integer> map = C799403Ai.LJ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(c719102rN.LLJJIJIL);
                                    sbLIZ.append('_');
                                    sbLIZ.append(str);
                                    map.put(C2188811AlT.LIZIZ(sbLIZ), Integer.valueOf(i));
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        View view5 = this.LLILZ;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById = view6.findViewById(R.id.pub);
            }
            this.LLILZ = (C1318510kPp) viewFindViewById;
            view5 = viewFindViewById;
        }
        ((C1318510kPp) view5).setDispatchTouchInterceptor(new C03EQ());
        List<String> list4 = VR().LLLIIL;
        if (list4 != null) {
            ((ArrayList) list4).add("click_product");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.b1v, viewGroup, false);
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

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
