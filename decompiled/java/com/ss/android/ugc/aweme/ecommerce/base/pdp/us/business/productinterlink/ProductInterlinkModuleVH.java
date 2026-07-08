package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink;

import X.C01GW;
import X.C049K;
import X.C049O;
import X.C049X;
import X.C049Y;
import X.C04CS;
import X.C04FR;
import X.C04FZ;
import X.C0DXR;
import X.C1010003xC;
import X.C10515049h;
import X.C10516049i;
import X.C1053804Ae;
import X.C13LP;
import X.C1748720vbi;
import X.C2097608Jq;
import X.C418440Gaw;
import X.C452501pT;
import X.C814420VxA;
import X.C919503ib;
import X.C954703oH;
import X.EnumC1066604Fc;
import X.InterfaceC1010203xE;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductInterlinkModuleVH extends AbsFullSpanVH<ProductInterlinkModuleVO> implements InterfaceC1010203xE {
    public final ECBaseFragment LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final TuxTextView LLJJJJ;
    public final RecyclerView LLJJJJJIL;
    public List<ProductInterlinkItemVO> LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean c6() {
        C04FZ c04fzLJI;
        C04FR c04fr = (C04FR) this.LLJJJIL.getValue();
        return (c04fr == null || (c04fzLJI = c04fr.LJI()) == null || c04fzLJI.LIZ == null) ? false : true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C04CS c04cs;
        List<ProductInterlinkItemVO> list;
        TuxTextView tuxTextView;
        ProductInterlinkModuleVO productInterlinkModuleVO = (ProductInterlinkModuleVO) obj;
        RecyclerView recyclerView = this.LLJJJJJIL;
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            return;
        }
        List<ProductInterlinkItemVO> list2 = productInterlinkModuleVO.propertyValues;
        if (list2 != null) {
            this.LLJJJJLIIL = list2;
        }
        String str = productInterlinkModuleVO.title;
        if (str != null && (tuxTextView = this.LLJJJJ) != null) {
            tuxTextView.setText(str);
        }
        RecyclerView recyclerView2 = this.LLJJJJJIL;
        if (recyclerView2 != null && (list = productInterlinkModuleVO.propertyValues) != null) {
            recyclerView2.setAdapter(new C1010003xC(list, this));
        }
        if (!c6()) {
            C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS185S0000000_1.get$arr$(500), AFwS228S0000000_1.get$arr$(828));
            return;
        }
        C04FR c04fr = (C04FR) this.LLJJJIL.getValue();
        if (c04fr == null || (c04cs = this.LLJILJILJ) == null) {
            return;
        }
        c04cs.LJI(c04fr, EnumC1066604Fc.MODULE_SHOW.getValue(), null);
    }

    @Override // X.InterfaceC1010203xE
    public final void h4(View view, ProductInterlinkItemVO productInterlinkItemVO) {
        Map<String, String> map;
        String str;
        C04CS c04cs;
        if (!c6()) {
            C1748720vbi.LIZLLL(view, new C049X(), new AwS580S0100000_1(productInterlinkItemVO, 252));
            C1748720vbi.LIZLLL(view, new C049K(), new AwS367S0200000_1(productInterlinkItemVO, this, 120));
            return;
        }
        C04FR c04fr = (C04FR) this.LLJJJIL.getValue();
        if (c04fr != null && (map = productInterlinkItemVO.eventTrackingTriggerKeys) != null && (str = map.get(EnumC1066604Fc.PRODUCT_SHOW.getValue())) != null && (c04cs = this.LLJILJILJ) != null) {
            c04cs.LJI(c04fr, str, null);
        }
    }

    @Override // X.InterfaceC1010203xE
    public final void j4(int i, ProductInterlinkItemVO productInterlinkItemVO) {
        Map<String, String> map;
        String str;
        C04CS c04cs;
        String str2;
        Map linkedHashMap;
        ProductInterlinkItemVO productInterlinkItemVO2;
        if (!c6()) {
            C1748720vbi.LIZLLL(this.itemView, new C10516049i(), new AwS580S0100000_1(productInterlinkItemVO, 919));
            C1748720vbi.LIZLLL(this.itemView, new C049Y(), new AwS580S0100000_1(productInterlinkItemVO, 920));
            C1748720vbi.LIZLLL(this.itemView, new C049O(), new AwS580S0100000_1(productInterlinkItemVO, 921));
        } else {
            C04FR c04fr = (C04FR) this.LLJJJIL.getValue();
            if (c04fr != null && (map = productInterlinkItemVO.eventTrackingTriggerKeys) != null && (str = map.get(EnumC1066604Fc.PRODUCT_CLICK.getValue())) != null && (c04cs = this.LLJILJILJ) != null) {
                c04cs.LJI(c04fr, str, null);
            }
        }
        List<ProductInterlinkItemVO> list = this.LLJJJJLIIL;
        if (list != null && (productInterlinkItemVO2 = (ProductInterlinkItemVO) C13LP.LJJJLZIJ(i, list)) != null) {
            str2 = productInterlinkItemVO2.schema;
        } else {
            str2 = null;
        }
        IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpViewModel) this.LLJJJ.getValue()).LLJI;
        if (pdpEnterParam == null || (linkedHashMap = pdpEnterParam.trackParams) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put("source_page_type", "pdp_linkage_product");
        linkedHashMap.put("entrance_form", "pdp_link");
        linkedHashMap.put("previous_page", "product_detail");
        linkedHashMap.put("source_previous_page", "product_detail");
        Context context = this.LLJJIJIL.getContext();
        if (context != null && str2 != null) {
            C1053804Ae c1053804Ae = ((PdpViewModel) this.LLJJJ.getValue()).LLILZIL;
            c1053804Ae.getClass();
            C919503ib.LIZIZ(context, c1053804Ae.LJII("c71601.d52113", str2, null), C2097608Jq.LJI(new Pair("trackParams", linkedHashMap)), false).open();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductInterlinkModuleVH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.b38, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1377));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1376));
        this.LLJJJJ = (TuxTextView) this.itemView.findViewById(R.id.rya);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.ry9);
        this.LLJJJJJIL = recyclerView;
        if (recyclerView != null) {
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            recyclerView.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.04Fd
                public final int LL;

                {
                    this.LL = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    int itemCount;
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                    AbstractC21673619ry adapter = recyclerView2.getAdapter();
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (childAdapterPosition != -1 && childAdapterPosition != itemCount - 1) {
                        rect.right = this.LL;
                    }
                }
            });
            recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
        }
    }
}
