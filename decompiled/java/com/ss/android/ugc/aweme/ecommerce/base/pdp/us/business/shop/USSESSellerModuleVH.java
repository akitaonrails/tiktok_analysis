package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop;

import X.C01GW;
import X.C03U5;
import X.C046U;
import X.C049X;
import X.C0H1U;
import X.C1003803wC;
import X.C1054004Ag;
import X.C12ES;
import X.C1388190mED;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1751830vgj;
import X.C197039127h;
import X.C2097608Jq;
import X.C2327809Ae;
import X.C452501pT;
import X.C786410Ut5;
import X.C919503ib;
import X.C954703oH;
import X.EnumC1752710vi9;
import X.EnumC1754390vkr;
import X.InterfaceC2260751DeD;
import Y.AUListenerS20S0102000_32;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS141S1200000_26;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes36.dex */
public final class USSESSellerModuleVH extends AbsFullSpanVH<USSESSellerModuleVO> {
    public static final List<String> LLJLLIL = C1697810uHb.LJIIJJI("followers_num", "items_num", "sales_num");
    public final ECBaseFragment LLJJIJIL;
    public C1751830vgj LLJJJ;
    public C197039127h LLJJJIL;
    public C197039127h LLJJJJ;
    public C197039127h LLJJJJJIL;
    public C197039127h LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final LinkedList<TuxTextView> LLJLIL;
    public final LinkedList<View> LLJLILLLLZIIL;
    public boolean LLJLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C1751830vgj e6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cqh) : null;
            this.LLJJJ = (C1751830vgj) viewFindViewById;
        }
        return (C1751830vgj) viewFindViewById;
    }

    public final C197039127h f6() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cs4) : null;
            this.LLJJJJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h h6() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cwm) : null;
            this.LLJJJJLIIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h i6() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cwn) : null;
            this.LLJJJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final InterfaceC2260751DeD r6() {
        return (InterfaceC2260751DeD) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final PdpViewModel u6() {
        return (PdpViewModel) this.LLJJL.getValue();
    }

    public final void C6() {
        C197039127h c197039127hF6 = f6();
        int width = c197039127hF6 != null ? c197039127hF6.getWidth() : 0;
        C197039127h c197039127hH6 = h6();
        if (c197039127hH6 != null) {
            C12ES.LJIILL(4, c197039127hH6);
        }
        int width2 = this.itemView.findViewById(R.id.njn).getWidth();
        C197039127h c197039127hI6 = i6();
        if (c197039127hI6 != null) {
            C12ES.LJIILL(0, c197039127hI6);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width, width2);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS20S0102000_32(this, width, width2, 1));
        valueAnimatorOfInt.start();
    }

    public final Map<String, Object> d6() {
        String str;
        StoreIdentityLabel storeIdentityLabel;
        USSESSellerModuleVO uSSESSellerModuleVOX5 = X5();
        StoreLabel storeLabel = uSSESSellerModuleVOX5.storeLabel;
        Integer num = (storeLabel == null || (storeIdentityLabel = storeLabel.storeIdentityLabel) == null) ? null : storeIdentityLabel.storeIdentityLabel;
        int value = EnumC1752710vi9.TOP_BRAND.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC1752710vi9.OFFICIAL_SHOP.getValue();
            if (num == null || num.intValue() != value2) {
                int value3 = EnumC1752710vi9.AUTHORIZED_SHOP.getValue();
                if (num == null || num.intValue() != value3) {
                    int value4 = EnumC1752710vi9.GOLDEN_SHOP.getValue();
                    if (num == null || num.intValue() != value4) {
                        str = (num == null || num.intValue() != EnumC1752710vi9.SILVER_SHOP.getValue()) ? "" : "silver";
                    } else {
                        str = "gold";
                    }
                } else {
                    str = "authorized";
                }
            } else {
                str = "official";
            }
        } else {
            str = "top_brand";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("badge_type", str);
        linkedHashMap.put("product_id", u6().getProductId());
        String str2 = uSSESSellerModuleVOX5.sellerId;
        linkedHashMap.put("shop_id", str2 != null ? str2 : "");
        return linkedHashMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void c6(LaneParams laneParams) {
        USSESSellerModuleVO uSSESSellerModuleVOX5 = X5();
        laneParams.plusAssign("entrance_type", "showcase_detail");
        String strQ6 = q6(uSSESSellerModuleVOX5.brandLabels);
        if (strQ6 != null) {
            laneParams.plusAssign("entrance_selling_point", strQ6);
        }
        laneParams.plusAssign("shop_rating", uSSESSellerModuleVOX5.rating);
        List<SellerDetailInfo> list = uSSESSellerModuleVOX5.shopDetailInfos;
        if (list != null) {
            for (SellerDetailInfo sellerDetailInfo : list) {
                String str = sellerDetailInfo.key;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123308409:
                            if (str.equals("items_num")) {
                                laneParams.plusAssign("items_num", sellerDetailInfo.count);
                            }
                            break;
                        case -1895799265:
                            if (str.equals("review_num")) {
                                laneParams.plusAssign("review_cnt", sellerDetailInfo.count);
                            }
                            break;
                        case -83116589:
                            if (str.equals("sales_num")) {
                                laneParams.plusAssign("sales_num", sellerDetailInfo.count);
                            }
                            break;
                        case 2028579932:
                            if (str.equals("followers_num")) {
                                laneParams.plusAssign("follower_cnt", sellerDetailInfo.count);
                            }
                            break;
                    }
                }
            }
        }
        ShopPerformance shopPerformance = uSSESSellerModuleVOX5.shopPerformance;
        if (shopPerformance != null) {
            laneParams.putAll(C1003803wC.LIZ(shopPerformance));
        }
        ProductPackStruct productPackStruct = u6().LLJILLL;
        if (productPackStruct != null) {
            laneParams.putAll(productPackStruct.LIZLLL());
        }
    }

    public final String q6(List<StoreLabel> list) {
        StoreLabel next;
        StoreOfficialLabel storeOfficialLabel;
        if (list == null) {
            return null;
        }
        Iterator<StoreLabel> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                StoreOfficialLabel storeOfficialLabel2 = next.officialLabel;
                if (storeOfficialLabel2 != null) {
                    Integer num = storeOfficialLabel2.labelType;
                    int value = C046U.STAR_SHOP.getValue();
                    if (num != null && num.intValue() == value) {
                        break;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        StoreLabel storeLabel = next;
        if (storeLabel == null || (storeOfficialLabel = storeLabel.officialLabel) == null) {
            return null;
        }
        return storeOfficialLabel.labelTypeStr;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0586  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 2162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVH.rr(java.lang.Object):void");
    }

    public final void v6(USSESSellerModuleVO uSSESSellerModuleVO) {
        C1751830vgj c1751830vgjE6 = e6();
        if (c1751830vgjE6 != null) {
            User user = uSSESSellerModuleVO.user;
            if (user != null && user.getFollowStatus() == 0) {
                C12ES.LJIILL(0, c1751830vgjE6);
                C197039127h c197039127hH6 = h6();
                if (c197039127hH6 != null) {
                    C12ES.LJIILL(0, c197039127hH6);
                }
                C197039127h c197039127hI6 = i6();
                if (c197039127hI6 != null) {
                    C0H1U.LIZIZ(c197039127hI6);
                }
                C1748720vbi.LJFF(c1751830vgjE6, new C049X(), AFwS226S0000000_35.get$arr$(133), new AwS401S0200000_35(this, uSSESSellerModuleVO, 38));
                return;
            }
            C0H1U.LIZIZ(c1751830vgjE6);
            C197039127h c197039127hH62 = h6();
            if (c197039127hH62 != null) {
                C12ES.LJIILL(4, c197039127hH62);
            }
            C197039127h c197039127hI62 = i6();
            if (c197039127hI62 == null) {
                return;
            }
            C12ES.LJIILL(0, c197039127hI62);
            C786410Ut5.J6(c197039127hI62, new LinearLayout.LayoutParams(-1, -1));
        }
    }

    public final void w6(String str, String str2) {
        Object obj;
        String str3;
        Map<String, Object> map;
        Map<String, Object> map2;
        USSESSellerModuleVO uSSESSellerModuleVOX5 = X5();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = u6().LLJI;
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            linkedHashMap.putAll(map2);
        }
        linkedHashMap.remove("page_name");
        linkedHashMap.put("previous_page", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam2 = u6().LLJI;
        if (pdpEnterParam2 == null || (map = pdpEnterParam2.trackParams) == null || (obj = map.get("source_page_type")) == null) {
            obj = "unknown";
        }
        linkedHashMap.put("show_window_source", obj);
        String str4 = uSSESSellerModuleVOX5.shopLink;
        if (str4 != null && !a0.LJJJIL(str4)) {
            Float fLJIIIIZZ = null;
            if (0 == 0) {
                PdpViewModel pdpViewModelU6 = u6();
                Context context = this.itemView.getContext();
                String str5 = uSSESSellerModuleVOX5.sellerName;
                String str6 = uSSESSellerModuleVOX5.rating;
                if (str6 != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str6);
                }
                PdpViewModel.VR2(pdpViewModelU6, context, str4, str5, fLJIIIIZZ, "showcase_detail", null, u6().Tg2(), null, null, "showcase_detail", uSSESSellerModuleVOX5.shopDetailInfos, str, q6(uSSESSellerModuleVOX5.brandLabels), uSSESSellerModuleVOX5.shopPerformance, null, str2, null, null, null, 958880);
            }
        }
        String str7 = uSSESSellerModuleVOX5.shopLink;
        if (str7 != null && a0.LJJJIL(str7) && (str3 = uSSESSellerModuleVOX5.link) != null && !a0.LJJJIL(str3)) {
            String string = C919503ib.LIZJ(str3, C2097608Jq.LJIIIIZZ(new Pair("enter_from", u6().HR2()), new Pair("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap)))).build().toString();
            C1054004Ag c1054004Ag = u6().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                c1054004Ag.LJIJ = true;
            }
            SmartRouter.buildRoute(this.itemView.getContext(), string).open();
            C1054004Ag c1054004Ag2 = u6().LLJLILLLLZIIL;
            if (c1054004Ag2 != null) {
                C1054004Ag.LJJ(c1054004Ag2, "showcase_detail", null, null, 6);
            }
        }
    }

    public final void z6(Context context, boolean z) {
        EnumC1754390vkr enumC1754390vkr;
        PdpViewModel pdpViewModelU6 = u6();
        String strLJI = u6().LLILZIL.LJI("c2857.d5326", null);
        C03U5.LIZ(new AwS141S1200000_26(pdpViewModelU6, context, strLJI, 7), C1388190mED.LIZ(context), null);
        C1054004Ag c1054004Ag = u6().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            if (z) {
                enumC1754390vkr = EnumC1754390vkr.NORMAL;
            } else {
                enumC1754390vkr = EnumC1754390vkr.NONE;
            }
            C1054004Ag.LJIL(c1054004Ag, "contact_seller", null, null, enumC1754390vkr.getValue(), 0, 6);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public USSESSellerModuleVH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.att, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 127));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 126));
        this.LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1918));
        this.LLJLIL = new LinkedList<>();
        this.LLJLILLLLZIIL = new LinkedList<>();
    }
}
