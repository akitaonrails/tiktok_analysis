package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable;

import X.AbstractViewOnClickListenerC589820NBk;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C031B;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHorizonBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable.USHalfPageOrderUnavailableFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USHalfPageUnreachableCell extends ECPowerCell<C031B> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USHalfPageUnreachableCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b16;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.19yx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 40), 6);
    }

    public USHalfPageUnreachableCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1576);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(76);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1587), awS577S0100000_33, AFwS224S0000000_33.get$arr$(215), new AwS577S0100000_33((C03K6) this, 1562), new AwS577S0100000_33((C03K6) this, 1564), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1566), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1568), null, new AwS577S0100000_33((C03K6) this, 1569));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1563);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1565);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1567);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 58));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1570);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1571);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1572);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1573);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1574);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1575), awS577S0100000_33, AFwS224S0000000_33.get$arr$(216), new AwS577S0100000_33((C03K6) this, 1577), new AwS577S0100000_33((C03K6) this, 1578), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1579), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1580), null, new AwS577S0100000_33((C03K6) this, 1581));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1582), awS577S0100000_33, AFwS224S0000000_33.get$arr$(217), new AwS577S0100000_33((C03K6) this, 1583), new AwS577S0100000_33((C03K6) this, 1584), new AwS577S0100000_33((C03K6) this, 1585), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1586));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1561));
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        final C031B c031b = (C031B) interfaceC1891350zJl;
        super.onBindItemView(c031b);
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.us_half_page_order_submit_unavailable_title)).setText(c031b.LLIZ);
        ((TextView) view.findViewById(R.id.us_half_page_order_submit_unavailable_content)).setText(c031b.LLIZLLLIL);
        C786410Ut5.I7(new AbstractViewOnClickListenerC589820NBk() { // from class: X.03HH
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractViewOnClickListenerC589820NBk
            public final void LIZ(View view2) {
                LifecycleOwner parent;
                Fragment fragmentLJI;
                String str;
                String string;
                String string2;
                Map mapLJIIZILJ;
                Object obj;
                Object obj2;
                BillStarling billStarling;
                BillStarlingText billStarlingText;
                if (view2 != null && (parent = this.LLILZ.getParent()) != null && (fragmentLJI = C724240Sb0.LJI(parent)) != 0) {
                    C03HI c03hi = USHalfPageOrderUnavailableFragment.LLILZLL;
                    Map<String, List<MainOrderInfo>> map = c031b.LLILZLL;
                    BillInfoData billInfoData = this.LLILZ.L5().LLJJI;
                    if (billInfoData != null && (billStarling = billInfoData.starlingTexts) != null && (billStarlingText = billStarling.unavailableSubPageTitle) != null) {
                        str = billStarlingText.text;
                    } else {
                        str = null;
                    }
                    HashMap<String, Object> map2 = this.LLILZ.L5().LLLIL;
                    if (map2 == null || (obj2 = map2.get("previous_page")) == null || (string = obj2.toString()) == null) {
                        string = "";
                    }
                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("previous_page", string));
                    String str2 = this.LLILZ.L5().n;
                    HashMap<String, Object> map3 = this.LLILZ.L5().LLLIL;
                    if (map3 != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(map3)) != null && (obj = mapLJIIZILJ.get("source_page_type")) != null) {
                        string2 = obj.toString();
                    } else {
                        string2 = null;
                    }
                    this.LLILZ.L5();
                    c03hi.getClass();
                    USHalfPageOrderUnavailableFragment uSHalfPageOrderUnavailableFragment = new USHalfPageOrderUnavailableFragment();
                    Bundle bundle = new Bundle();
                    if (fragmentLJI instanceof InterfaceC1748810vbr) {
                        C960603pE.LJI(bundle, (InterfaceC1748810vbr) fragmentLJI, new AwS86S1200000_1(str, map, mapLIZJ, 3));
                    }
                    uSHalfPageOrderUnavailableFragment.setArguments(bundle);
                    CommerceHorizonBottomSheetDialogFragment commerceHorizonBottomSheetDialogFragment = new CommerceHorizonBottomSheetDialogFragment();
                    CommerceHorizonBottomSheetDialogFragment.dS(commerceHorizonBottomSheetDialogFragment, uSHalfPageOrderUnavailableFragment);
                    C928203k0.LIZ.getClass();
                    commerceHorizonBottomSheetDialogFragment.cS(C928203k0.LJIIL(null, str2, string2));
                    commerceHorizonBottomSheetDialogFragment.LLJILLL = false;
                    FragmentManager fragmentManager = fragmentLJI.getFragmentManager();
                    if (fragmentManager != null) {
                        commerceHorizonBottomSheetDialogFragment.show(fragmentManager, "CommerceHorizonBottomSheetDialogFragment");
                    }
                }
            }
        }, view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b16, viewGroup, false);
    }
}
