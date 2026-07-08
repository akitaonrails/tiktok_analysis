package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation;

import X.AbstractC21673619ry;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03BB;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C10515049h;
import X.C13LE;
import X.C13LP;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C443120HZe;
import X.C452080Ho6;
import X.C452501pT;
import X.C719102rN;
import X.C719202rO;
import X.C719302rP;
import X.C723002s0;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C819503Ib;
import X.InterfaceC1164530gPT;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.AsS15S0300000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USCombineAggregationOrderCell extends ECPowerCell<C719302rP> implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;
    public int LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USCombineAggregationOrderCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
    }

    public USCombineAggregationOrderCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1358);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(68);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1369), awS577S0100000_33, AFwS224S0000000_33.get$arr$(193), new AwS577S0100000_33((C03K6) this, 1344), new AwS577S0100000_33((C03K6) this, 1346), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1348), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1350), null, new AwS577S0100000_33((C03K6) this, 1351));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1345);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1347);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1349);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 50));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1352);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1353);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1354);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1355);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1356);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1357), awS577S0100000_33, AFwS224S0000000_33.get$arr$(191), new AwS577S0100000_33((C03K6) this, 1359), new AwS577S0100000_33((C03K6) this, 1360), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1361), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1362), null, new AwS577S0100000_33((C03K6) this, 1363));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1364), awS577S0100000_33, AFwS224S0000000_33.get$arr$(192), new AwS577S0100000_33((C03K6) this, 1365), new AwS577S0100000_33((C03K6) this, 1366), new AwS577S0100000_33((C03K6) this, 1367), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1368));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        AbstractC21673619ry adapter;
        C03BB c03bb;
        C719202rO c719202rO;
        Image image;
        C719302rP c719302rP = (C719302rP) interfaceC1891350zJl;
        super.onBindItemView(c719302rP);
        this.LLIZLLLIL = System.currentTimeMillis();
        View view = this.itemView;
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.us_order_submit_aggregation_order_image_list);
            AbstractC21673619ry adapter2 = null;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            int i = 8;
            boolean z = false;
            if (adapter == null) {
                C03BB c03bb2 = new C03BB(null);
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
                    recyclerView.addItemDecoration(new C819503Ib(0, 8));
                    recyclerView.setAdapter(c03bb2);
                    recyclerView.setItemAnimator(null);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<C719202rO> it2 = c719302rP.LLIZLLLIL.iterator();
            while (it2.hasNext()) {
                Iterator<C723002s0> it3 = it2.next().LLJIJIL.iterator();
                while (it3.hasNext()) {
                    for (C719102rN c719102rN : it3.next().LLJ) {
                        if (!c719102rN.LIZLLL() && (image = c719102rN.LLIZLLLIL) != null) {
                            Integer numValueOf = Integer.valueOf(c719102rN.LLIZ);
                            String str = c719102rN.LLJIJIL;
                            if (str == null) {
                                str = "";
                            }
                            arrayList.add(new C443120HZe(image, numValueOf, str));
                        }
                    }
                }
            }
            if (recyclerView != null) {
                if (arrayList.size() > 0) {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, recyclerView);
                C1748720vbi.LJFF(recyclerView, new C10515049h(), new AwS577S0100000_33(c719302rP, 28), new AwS367S0200000_1(c719302rP, this, 34));
                adapter2 = recyclerView.getAdapter();
            }
            if ((adapter2 instanceof C03BB) && (c03bb = (C03BB) adapter2) != null) {
                List<C719202rO> list = c719302rP.LLIZLLLIL;
                if (list != null && (c719202rO = (C719202rO) C13LP.LJJJLL(list)) != null && !c719202rO.LLJJLIIIJLLLLLLLZ) {
                    z = true;
                }
                AwS245S0300000_1 awS245S0300000_1 = new AwS245S0300000_1(this, view, c719302rP, 4);
                c03bb.LL = arrayList;
                c03bb.LLILLL = z;
                c03bb.LLILLJJLI = awS245S0300000_1;
                c03bb.notifyDataSetChanged();
            }
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(new AsS15S0300000_1(this, recyclerView, c719302rP, 0));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b2_, viewGroup, false);
    }
}
