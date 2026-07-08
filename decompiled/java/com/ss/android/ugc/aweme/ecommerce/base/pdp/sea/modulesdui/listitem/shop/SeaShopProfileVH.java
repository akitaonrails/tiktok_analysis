package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop;

import X.C01GW;
import X.C1053804Ae;
import X.C1054104Ah;
import X.C13LE;
import X.C1741890vQh;
import X.C1755030vlt;
import X.C1755600vmo;
import X.C197039127h;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2327809Ae;
import X.C418440Gaw;
import X.C419110Gc1;
import X.C452501pT;
import X.C703502or;
import X.C786410Ut5;
import X.C814420VxA;
import X.C919503ib;
import X.EnumC951903np;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaShopProfileVH extends AbsFullSpanVH<C703502or> {
    public static final /* synthetic */ int LLLFFI = 0;
    public SmartImageView LLJJIJIL;
    public LinearLayout LLJJJ;
    public C197039127h LLJJJIL;
    public C419110Gc1 LLJJJJ;
    public SmartImageView LLJJJJJIL;
    public SmartImageView LLJJJJLIIL;
    public FrameLayout LLJJL;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public LinearLayout LLJLL;
    public LinearLayout LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxIconView LLJZ;
    public final C01GW LLJZIJLIL;
    public List<SellerDetailInfo> LLL;
    public final LinkedList<TuxTextView> LLLF;
    public final LinkedList<SmartImageView> LLLFF;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH
    public final boolean W5() {
        return ((C703502or) this.LLILLJJLI).LLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String d6() {
        ShopBenefitInfo shopBenefitInfo = ((C703502or) this.LLILLJJLI).LLJJIII;
        Integer num = shopBenefitInfo != null ? shopBenefitInfo.benefitType : null;
        int value = EnumC951903np.MALL_STRONG.getValue();
        if (num != null && num.intValue() == value) {
            return "pdp_shop_benefit_bar_mall";
        }
        int value2 = EnumC951903np.MALL_GENTLE.getValue();
        if (num == null || num.intValue() != value2) {
            return (num == null || num.intValue() != EnumC951903np.STAR_SHOP.getValue()) ? "showcase_detail" : "pdp_shop_benefit_bar_star";
        }
        return "pdp_shop_benefit_bar_mall";
    }

    public final LinearLayout e6() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.nho) : null;
            this.LLJLLIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxTextView f6() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.rxf) : null;
            this.LLJL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final FrameLayout h6() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.sri) : null;
            this.LLJJL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final LinearLayout i6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.uow) : null;
            this.LLJJJ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        b6(new C1755030vlt(this.LLILLJJLI));
    }

    public final SmartImageView q6() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v6y) : null;
            this.LLJJIJIL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final LinearLayout r6() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v7o) : null;
            this.LLJJLIIIJLLLLLLLZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final SmartImageView u6() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.vbm) : null;
            this.LLJJJJLIIL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final TuxTextView v6() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.xqk) : null;
            this.LLJLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final SeaPdpViewModel w6() {
        return (SeaPdpViewModel) this.LLJZIJLIL.getValue();
    }

    public final C197039127h z6() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.visit) : null;
            this.LLJJJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaShopProfileVH(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.ax5, context, viewGroup, false, true));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 76));
        this.LLLF = new LinkedList<>();
        this.LLLFF = new LinkedList<>();
    }

    public static SmartImageView c6(Context context) {
        SmartImageView smartImageView = new SmartImageView(context);
        C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))));
        return smartImageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06d8  */
    /* JADX WARN: Type inference failed for: r3v124, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r8v17, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r8v19, types: [android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaShopProfileVH.rr(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C6(String str, String str2) {
        Object obj;
        String str3;
        Map<String, Object> map;
        Map<String, Object> map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = w6().LLIZ;
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            linkedHashMap.putAll(map2);
        }
        linkedHashMap.remove("page_name");
        linkedHashMap.put("previous_page", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam2 = w6().LLIZ;
        if (pdpEnterParam2 == null || (map = pdpEnterParam2.trackParams) == null || (obj = map.get("source_page_type")) == null) {
            obj = "unknown";
        }
        linkedHashMap.put("show_window_source", obj);
        String str4 = ((C703502or) this.LLILLJJLI).LLIZ;
        if (str4 != null && !a0.LJJJIL(str4)) {
            String str5 = null;
            if (0 == 0) {
                SeaPdpViewModel seaPdpViewModelW6 = w6();
                Context context = this.itemView.getContext();
                C703502or c703502or = (C703502or) this.LLILLJJLI;
                String str6 = c703502or.LL;
                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(c703502or.LLILZIL);
                StoreOfficialLabel storeOfficialLabel = ((C703502or) this.LLILLJJLI).LLIZLLLIL;
                if (storeOfficialLabel != null) {
                    str3 = storeOfficialLabel.labelTypeStr;
                } else {
                    str3 = null;
                }
                int iTg2 = w6().Tg2();
                List<SellerDetailInfo> list = this.LLL;
                SellerSellingPoint sellerSellingPoint = ((C703502or) this.LLILLJJLI).LLJJ;
                if (sellerSellingPoint != null) {
                    str5 = sellerSellingPoint.sellingPoints;
                }
                SeaPdpViewModel.ZR2(seaPdpViewModelW6, context, str4, str6, fLJIIIIZZ, str2, str3, iTg2, null, null, "pdp_shop_view_more", list, str, str5, null, null, "c2857.d0", null, 975232);
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        String str7 = ((C703502or) this.LLILLJJLI).LLILZLL;
        if (str7 != null && !a0.LJJJIL(str7)) {
            String string = C919503ib.LIZJ(str7, C2097608Jq.LJIIIIZZ(new Pair("enter_from", w6().NR2()), new Pair("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap)))).build().toString();
            C1054104Ah c1054104Ah = w6().LLJLIL;
            if (c1054104Ah != null) {
                c1054104Ah.LJIILIIL = true;
            }
            Context context2 = this.itemView.getContext();
            C1053804Ae c1053804Ae = w6().LLLLL;
            c1053804Ae.getClass();
            SmartRouter.buildRoute(context2, c1053804Ae.LJII("c2857.d0", string, null)).open();
            C1054104Ah c1054104Ah2 = w6().LLJLIL;
            if (c1054104Ah2 != null) {
                C1054104Ah.LJJII(c1054104Ah2, "showcase_detail", null, null, null, null, null, null, null, null, 510);
            }
        }
    }
}
