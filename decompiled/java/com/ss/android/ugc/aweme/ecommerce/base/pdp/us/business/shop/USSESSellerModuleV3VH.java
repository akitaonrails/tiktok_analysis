package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C03U5;
import X.C046U;
import X.C049X;
import X.C098200Yq;
import X.C0H1U;
import X.C0HEZ;
import X.C0N6O;
import X.C1003803wC;
import X.C10515049h;
import X.C1054004Ag;
import X.C1120604Zw;
import X.C12ES;
import X.C1320430kSv;
import X.C1326790kdB;
import X.C1331070kk5;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1388190mED;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1751830vgj;
import X.C189200o6;
import X.C1908330zl9;
import X.C197039127h;
import X.C19719612Di;
import X.C19ME;
import X.C1AQS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2260701De8;
import X.C2327809Ae;
import X.C418440Gaw;
import X.C419340GcO;
import X.C426750GoL;
import X.C444910HcX;
import X.C444920HcY;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C919503ib;
import X.C954703oH;
import X.EnumC1752710vi9;
import X.EnumC1754390vkr;
import X.EnumC2274741E1w;
import X.InterfaceC1320380kSq;
import X.InterfaceC2260821DeK;
import X.InterfaceC427850Gq7;
import Y.AObserverS132S0300000_33;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PerformanceMetric;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopCardBackground;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPerformanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.friend.FriendDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityDTCData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeColor;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeImage;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.TopRatedInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import g1c.AjS19S0110000_35;
import g1c.AjS48S0200000_35;
import g1c.AjS74S0100000_35;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS141S1200000_26;
import kotlin.jvm.internal.AwS149S1100000_35;
import kotlin.jvm.internal.AwS279S0300000_35;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS47S0310000_32;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes36.dex */
public final class USSESSellerModuleV3VH extends AbsFullSpanVH<USSESSellerModuleVO> {
    public static final /* synthetic */ int LLLLLLZZ = 0;
    public final Fragment LLJJIJIL;
    public C1751830vgj LLJJJ;
    public C197039127h LLJJJIL;
    public C197039127h LLJJJJ;
    public C197039127h LLJJJJJIL;
    public C197039127h LLJJJJLIIL;
    public SmartImageView LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public RecyclerView LLJLL;
    public TuxTextView LLJLLIL;
    public LinearLayout LLJLLL;
    public LinearLayout LLJZ;
    public TuxTextView LLJZIJLIL;
    public SmartImageView LLL;
    public TuxTextView LLLF;
    public TuxIconView LLLFF;
    public LinearLayout LLLFFI;
    public ConstraintLayout LLLFZ;
    public TuxTextView LLLI;
    public TuxIconView LLLII;
    public SmartImageView LLLIIII;
    public SmartImageView LLLIIIIL;
    public View LLLIIIL;
    public View LLLIIL;
    public View LLLIILIL;
    public View LLLIL;
    public SmartImageView LLLILZ;
    public TuxTextView LLLILZJ;
    public TuxIconView LLLILZLLLI;
    public SmartImageView LLLIZZ;
    public View LLLJ;
    public View LLLJIL;
    public View LLLJL;
    public ConstraintLayout LLLL;
    public SmartImageView LLLLII;
    public SmartImageView LLLLIIIILLL;
    public FrameLayout LLLLIIL;
    public FrameLayout LLLLIILL;
    public ConstraintLayout LLLLIILLL;
    public SmartImageView LLLLIL;
    public TuxTextView LLLLILI;
    public LinearLayout LLLLJ;
    public TuxTextView LLLLJI;
    public TuxTextView LLLLL;
    public TuxIconView LLLLLIL;
    public ConstraintLayout LLLLLILLIL;
    public LinearLayout LLLLLJIL;
    public View LLLLLJLJLL;
    public View LLLLLL;
    public final C01GW LLLLLLIL;
    public final C01GW LLLLLLJ;
    public final LinkedList<TuxTextView> LLLLLLL;
    public final LinkedList<View> LLLLLLLLL;
    public final LinkedList<C419340GcO> LLLLLLLLLL;
    public final LinkedList<View> LLLLLLLZIL;
    public boolean LLLLLLZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final View C6() {
        View viewFindViewById = this.LLLJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cja) : null;
            this.LLLJIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final SmartImageView D6() {
        View viewFindViewById = this.LLLIZZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ciw) : null;
            this.LLLIZZ = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final View J6() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cj6) : null;
            this.LLLIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final TuxTextView K6() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.f684cj7) : null;
            this.LLLILZJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final SmartImageView L6() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cj9) : null;
            this.LLLILZ = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final TuxIconView S6() {
        View viewFindViewById = this.LLLILZLLLI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cj8) : null;
            this.LLLILZLLLI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final C1751830vgj T6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cqh) : null;
            this.LLJJJ = (C1751830vgj) viewFindViewById;
        }
        return (C1751830vgj) viewFindViewById;
    }

    public final C197039127h U6() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cs4) : null;
            this.LLJJJJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h V6() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cwm) : null;
            this.LLJJJJLIIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h a7() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cwn) : null;
            this.LLJJJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final SmartImageView h7() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v6_) : null;
            this.LLJJL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final View i7() {
        View viewFindViewById = this.LLLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v70) : null;
            this.LLLJL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View j7() {
        View viewFindViewById = this.LLLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v71) : null;
            this.LLLJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View k7() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v72) : null;
            this.LLLIILIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final LinearLayout l7() {
        View viewFindViewById = this.LLLLLJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v7u) : null;
            this.LLLLLJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final LinearLayout m7() {
        View viewFindViewById = this.LLLFFI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v82) : null;
            this.LLLFFI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final FrameLayout n7() {
        View viewFindViewById = this.LLLLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wco) : null;
            this.LLLLIIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final FrameLayout p7() {
        View viewFindViewById = this.LLLLIILL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wcp) : null;
            this.LLLLIILL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final ConstraintLayout r7() {
        View viewFindViewById = this.LLLLIILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wcq) : null;
            this.LLLLIILLL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final TuxTextView s7() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.y3b) : null;
            this.LLJLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final PdpViewModel t7() {
        return (PdpViewModel) this.LLLLLLIL.getValue();
    }

    public final Map<String, Object> w6() {
        Object obj;
        Map<String, Object> map;
        Map<String, Object> map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = t7().LLJI;
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            linkedHashMap.putAll(map2);
        }
        linkedHashMap.remove("page_name");
        linkedHashMap.put("previous_page", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam2 = t7().LLJI;
        if (pdpEnterParam2 == null || (map = pdpEnterParam2.trackParams) == null || (obj = map.get("source_page_type")) == null) {
            obj = "unknown";
        }
        linkedHashMap.put("show_window_source", obj);
        return linkedHashMap;
    }

    public final Map<String, Object> z6() {
        String str;
        StoreIdentityLabel storeIdentityLabel;
        USSESSellerModuleVO uSSESSellerModuleVOX5 = X5();
        TopRatedInfo topRatedInfo = uSSESSellerModuleVOX5.topRatedInfo;
        if (topRatedInfo != null ? Intrinsics.LJFF(topRatedInfo.onlyTopRated, Boolean.TRUE) : false) {
            str = "top_rated";
        } else {
            StoreLabel storeLabel = uSSESSellerModuleVOX5.storeLabel;
            if (storeLabel == null || (storeIdentityLabel = storeLabel.storeIdentityLabel) == null || (str = storeIdentityLabel.shopIdentityKey) == null) {
                str = "";
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("badge_type", str);
        linkedHashMap.put("product_id", t7().getProductId());
        String str2 = uSSESSellerModuleVOX5.sellerId;
        linkedHashMap.put("shop_id", str2 != null ? str2 : "");
        return linkedHashMap;
    }

    public static boolean A7(USSESSellerModuleVO uSSESSellerModuleVO) {
        StoreIdentityLabel storeIdentityLabel;
        StoreLabel storeLabel = uSSESSellerModuleVO.storeLabel;
        if (storeLabel != null && (storeIdentityLabel = storeLabel.storeIdentityLabel) != null) {
            Integer num = storeIdentityLabel.storeIdentityLabel;
            int value = EnumC1752710vi9.OFFICIAL_SHOP.getValue();
            if (num != null && num.intValue() == value && uSSESSellerModuleVO.shopBackground != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean I7(USSESSellerModuleVO uSSESSellerModuleVO) {
        Integer num;
        StoreIdentityLabel storeIdentityLabel;
        Integer num2 = uSSESSellerModuleVO.shopCardNewStyle;
        if (num2 == null || num2.intValue() != 4) {
            return false;
        }
        StoreLabel storeLabel = uSSESSellerModuleVO.storeLabel;
        if (storeLabel != null && (storeIdentityLabel = storeLabel.storeIdentityLabel) != null) {
            num = storeIdentityLabel.storeIdentityLabel;
        } else {
            num = null;
        }
        int value = EnumC1752710vi9.OFFICIAL_SHOP.getValue();
        if (num == null || num.intValue() != value || uSSESSellerModuleVO.shopBackground == null) {
            int value2 = EnumC1752710vi9.BRAND_AUTHORIZED_SHOP.getValue();
            if (num == null || num.intValue() != value2) {
                int value3 = EnumC1752710vi9.DTC_SHOP.getValue();
                if (num == null || num.intValue() != value3) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String v6(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO r4) throws org.json.JSONException {
        /*
            com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel r0 = r4.storeLabel
            if (r0 == 0) goto L73
            com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityLabel r3 = r0.storeIdentityLabel
            if (r3 == 0) goto L73
            java.lang.Integer r2 = r3.storeIdentityLabel
            X.0vi9 r0 = X.EnumC1752710vi9.BRAND_AUTHORIZED_SHOP
            int r1 = r0.getValue()
            if (r2 == 0) goto L50
            int r0 = r2.intValue()
            if (r0 != r1) goto L50
            com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityAuthorizedData r0 = r3.authorizedData
            if (r0 == 0) goto L6c
            java.util.List<java.lang.String> r0 = r0.rightIdList
        L1e:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            if (r0 == 0) goto L6e
            java.util.Iterator r3 = r0.iterator()
        L29:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r1 = r3.next()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "right_id"
            r2.put(r0, r1)
            java.lang.String r1 = "scene"
            java.lang.String r0 = "pdp"
            r2.put(r1, r0)
            java.lang.String r1 = "module"
            java.lang.String r0 = "shop_card_brand_explanation"
            r2.put(r1, r0)
            r4.put(r2)
            goto L29
        L50:
            X.0vi9 r0 = X.EnumC1752710vi9.DTC_SHOP
            int r1 = r0.getValue()
            if (r2 == 0) goto L65
            int r0 = r2.intValue()
            if (r0 != r1) goto L65
            com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityDTCData r0 = r3.storeDtcData
            if (r0 == 0) goto L6c
            java.util.List<java.lang.String> r0 = r0.rightIdList
            goto L1e
        L65:
            com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityBannerStyle r0 = r3.bannerStyle
            if (r0 == 0) goto L6c
            java.util.List<java.lang.String> r0 = r0.rightIdList
            goto L1e
        L6c:
            r0 = 0
            goto L1e
        L6e:
            java.lang.String r0 = r4.toString()
            return r0
        L73:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH.v6(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO):java.lang.String");
    }

    public static boolean x7(USSESSellerModuleVO uSSESSellerModuleVO) {
        StoreIdentityLabel storeIdentityLabel;
        StoreLabel storeLabel = uSSESSellerModuleVO.storeLabel;
        if (storeLabel != null && (storeIdentityLabel = storeLabel.storeIdentityLabel) != null && storeIdentityLabel.bannerStyle != null) {
            return true;
        }
        return false;
    }

    public final String b7(List<StoreLabel> list) {
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void c6(LaneParams laneParams) {
        USSESSellerModuleVO uSSESSellerModuleVOX5 = X5();
        laneParams.plusAssign("entrance_type", "showcase_detail");
        String strB7 = b7(uSSESSellerModuleVOX5.brandLabels);
        if (strB7 != null) {
            laneParams.plusAssign("entrance_selling_point", strB7);
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
        ProductPackStruct productPackStruct = t7().LLJILLL;
        if (productPackStruct != null) {
            laneParams.putAll(productPackStruct.LIZLLL());
        }
    }

    public final void i6(USSESSellerModuleVO uSSESSellerModuleVO) {
        StoreIdentityLabel storeIdentityLabel;
        StoreIdentityDTCData storeIdentityDTCData;
        String str;
        ThemeImage themeImage;
        Image imageLIZ;
        Object c098200Yq;
        int iLIZ;
        String strLIZ;
        StoreLabel storeLabel = uSSESSellerModuleVO.storeLabel;
        if (storeLabel != null && (storeIdentityLabel = storeLabel.storeIdentityLabel) != null) {
            Integer num = storeIdentityLabel.storeIdentityLabel;
            int value = EnumC1752710vi9.DTC_SHOP.getValue();
            if (num != null && num.intValue() == value && (storeIdentityDTCData = storeIdentityLabel.storeDtcData) != null && (str = storeIdentityDTCData.directFromText) != null && (!a0.LJJJIL(str)) && (themeImage = storeIdentityDTCData.bgImage) != null && (imageLIZ = themeImage.LIZ(this.itemView.getContext())) != null) {
                try {
                    ThemeColor themeColor = storeIdentityDTCData.bannerTextColor;
                    if (themeColor != null && (strLIZ = themeColor.LIZ(this.itemView.getContext())) != null) {
                        c098200Yq = Integer.valueOf(Color.parseColor(strLIZ));
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Integer num2 = (Integer) c098200Yq;
                if (num2 != null) {
                    iLIZ = num2.intValue();
                } else {
                    iLIZ = C0HEZ.LIZ(R.attr.a1h, this.itemView.getContext());
                }
                SmartImageView smartImageViewD6 = D6();
                if (smartImageViewD6 != null) {
                    C12ES.LJIILL(0, smartImageViewD6);
                    float fLIZIZ = C418440Gaw.LIZIZ(10);
                    if (I7(uSSESSellerModuleVO)) {
                        C19ME c19me = (C19ME) smartImageViewD6.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) c19me).height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        c19me.bottomToBottom = -1;
                        C786410Ut5.G6(smartImageViewD6, c19me);
                        C1331070kk5 hierarchy = smartImageViewD6.getHierarchy();
                        if (hierarchy != null) {
                            hierarchy.LJIIZILJ(InterfaceC1320380kSq.LIZ);
                        }
                        fLIZIZ = 0.0f;
                    } else {
                        C1331070kk5 hierarchy2 = smartImageViewD6.getHierarchy();
                        if (hierarchy2 != null) {
                            hierarchy2.LJIIZILJ(C1320430kSv.LJIILIIL);
                        }
                    }
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageLIZ);
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJ = fLIZIZ;
                    c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
                    c1331670kl3LIZLLL.LIZLLL("USSESSellerModuleVH");
                    c1331670kl3LIZLLL.LJJ(smartImageViewD6);
                    c1331670kl3LIZLLL.LJIIJJI();
                }
                SmartImageView smartImageViewL6 = L6();
                if (smartImageViewL6 != null) {
                    C0H1U.LIZIZ(smartImageViewL6);
                }
                View viewFindViewById = this.LLJLL;
                if (viewFindViewById == null) {
                    View viewLJJIJL = LJJIJL();
                    if (viewLJJIJL != null) {
                        viewFindViewById = viewLJJIJL.findViewById(R.id.f673bck);
                    } else {
                        viewFindViewById = null;
                    }
                    this.LLJLL = (RecyclerView) viewFindViewById;
                }
                View view = viewFindViewById;
                if (view != null) {
                    C0H1U.LIZIZ(view);
                }
                View viewFindViewById2 = this.LLJLILLLLZIIL;
                if (viewFindViewById2 == null) {
                    View viewLJJIJL2 = LJJIJL();
                    if (viewLJJIJL2 != null) {
                        viewFindViewById2 = viewLJJIJL2.findViewById(R.id.bcj);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLJLILLLLZIIL = (TuxTextView) viewFindViewById2;
                }
                TuxTextView tuxTextView = (TuxTextView) viewFindViewById2;
                if (tuxTextView != null) {
                    C12ES.LJIILL(0, tuxTextView);
                    tuxTextView.setText(str);
                    tuxTextView.setTextColor(iLIZ);
                    tuxTextView.setTuxFont(73);
                }
                TuxTextView tuxTextViewK6 = K6();
                if (tuxTextViewK6 != null) {
                    String str2 = storeIdentityDTCData.equityText;
                    if (str2 != null && (!a0.LJJJIL(str2))) {
                        C12ES.LJIILL(0, tuxTextViewK6);
                        tuxTextViewK6.setTuxFont(72);
                        tuxTextViewK6.setText(str2);
                        tuxTextViewK6.setTextColor(iLIZ);
                    } else {
                        C0H1U.LIZIZ(tuxTextViewK6);
                    }
                }
                TuxIconView tuxIconViewS6 = S6();
                if (tuxIconViewS6 != null) {
                    C12ES.LJIILL(0, tuxIconViewS6);
                    tuxIconViewS6.setIconRes(R.raw.icon_chevron_right_slim_ltr);
                    tuxIconViewS6.setTintColor(iLIZ);
                }
                View viewJ6 = J6();
                if (viewJ6 != null) {
                    C12ES.LJIILL(0, viewJ6);
                    L7(viewJ6, "c2857.d3673");
                    C786410Ut5.I7(new AjS48S0200000_35(storeIdentityDTCData, this, 7), viewJ6);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x020f A[PHI: r1
      0x020f: PHI (r1v11 android.view.View) = (r1v10 android.view.View), (r1v41 android.view.View) binds: [B:131:0x01fc, B:136:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0228 A[PHI: r8
      0x0228: PHI (r8v1 android.view.View) = (r8v0 android.view.View), (r8v4 android.view.View) binds: [B:139:0x0214, B:144:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x045b A[PHI: r1
      0x045b: PHI (r1v5 android.view.View) = (r1v4 android.view.View), (r1v8 android.view.View) binds: [B:270:0x0445, B:275:0x0459] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x07bf A[PHI: r1
      0x07bf: PHI (r1v51 android.view.View) = (r1v50 android.view.View), (r1v93 android.view.View) binds: [B:431:0x07a9, B:436:0x07bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[PHI: r8
      0x00aa: PHI (r8v26 android.view.View) = (r8v25 android.view.View), (r8v28 android.view.View) binds: [B:37:0x0097, B:42:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x07e3 A[PHI: r1
      0x07e3: PHI (r1v53 android.view.View) = (r1v52 android.view.View), (r1v89 android.view.View) binds: [B:442:0x07cd, B:447:0x07e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x092c A[PHI: r2
      0x092c: PHI (r2v23 android.view.View) = (r2v22 android.view.View), (r2v25 android.view.View) binds: [B:522:0x0919, B:527:0x092a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0ad4 A[PHI: r1
      0x0ad4: PHI (r1v61 android.view.View) = (r1v60 android.view.View), (r1v68 android.view.View) binds: [B:615:0x0ac1, B:620:0x0ad2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0aec A[PHI: r1
      0x0aec: PHI (r1v63 android.view.View) = (r1v62 android.view.View), (r1v65 android.view.View) binds: [B:623:0x0ad9, B:628:0x0aea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0b61 A[PHI: r1
      0x0b61: PHI (r1v56 android.view.View) = (r1v55 android.view.View), (r1v58 android.view.View) binds: [B:647:0x0b4e, B:652:0x0b5f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 3114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH.rr(java.lang.Object):void");
    }

    public final TuxTextView u6(Context context) {
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C786410Ut5.R6(tuxTextView, layoutParams);
        return tuxTextView;
    }

    public final void v7(USSESSellerModuleVO uSSESSellerModuleVO) {
        C1751830vgj c1751830vgjT6 = T6();
        if (c1751830vgjT6 != null) {
            User user = uSSESSellerModuleVO.user;
            if (user != null && user.getFollowStatus() == 0) {
                C12ES.LJIILL(0, c1751830vgjT6);
                C197039127h c197039127hV6 = V6();
                if (c197039127hV6 != null) {
                    C12ES.LJIILL(0, c197039127hV6);
                }
                C197039127h c197039127hA7 = a7();
                if (c197039127hA7 != null) {
                    C0H1U.LIZIZ(c197039127hA7);
                }
                C1748720vbi.LJFF(c1751830vgjT6, new C049X(), AFwS226S0000000_35.get$arr$(131), new AwS401S0200000_35(this, uSSESSellerModuleVO, 37));
                return;
            }
            C0H1U.LIZIZ(c1751830vgjT6);
            C197039127h c197039127hV62 = V6();
            if (c197039127hV62 != null) {
                C12ES.LJIILL(4, c197039127hV62);
            }
            C197039127h c197039127hA72 = a7();
            if (c197039127hA72 == null) {
                return;
            }
            C12ES.LJIILL(0, c197039127hA72);
            C786410Ut5.J6(c197039127hA72, new LinearLayout.LayoutParams(-1, -1));
        }
    }

    public final boolean z7(USSESSellerModuleVO uSSESSellerModuleVO) {
        Integer num;
        TopRatedInfo topRatedInfo;
        StoreIdentityLabel storeIdentityLabel;
        StoreLabel storeLabel = uSSESSellerModuleVO.storeLabel;
        if (storeLabel != null && (storeIdentityLabel = storeLabel.storeIdentityLabel) != null) {
            num = storeIdentityLabel.storeIdentityLabel;
        } else {
            num = null;
        }
        Integer num2 = X5().shopCardNewStyle;
        if (num2 != null && num2.intValue() == 3) {
            int value = EnumC1752710vi9.DTC_SHOP.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = EnumC1752710vi9.BRAND_AUTHORIZED_SHOP.getValue();
                if ((num == null || num.intValue() != value2) && ((topRatedInfo = uSSESSellerModuleVO.topRatedInfo) == null || !Intrinsics.LJFF(topRatedInfo.onlyTopRated, Boolean.TRUE))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static View r6(Context context, InterfaceC2260821DeK interfaceC2260821DeK) {
        View view = new View(context);
        view.setBackgroundColor(C0HEZ.LIZ(interfaceC2260821DeK.LJFF(), context));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        layoutParams.gravity = 16;
        C786410Ut5.W5(view, layoutParams);
        return view;
    }

    public final void L7(View view, String str) {
        C1748720vbi.LJFF(view, new C10515049h(), AFwS226S0000000_35.get$arr$(132), new AwS149S1100000_35(this, str, 1));
    }

    public final void N7(String str, String str2) {
        String str3;
        USSESSellerModuleVO uSSESSellerModuleVOX5 = X5();
        Map<String, Object> mapW6 = w6();
        String str4 = uSSESSellerModuleVOX5.shopLink;
        if (str4 != null && !a0.LJJJIL(str4)) {
            Float fLJIIIIZZ = null;
            if (0 == 0) {
                PdpViewModel pdpViewModelT7 = t7();
                Context context = this.itemView.getContext();
                String str5 = uSSESSellerModuleVOX5.sellerName;
                String str6 = uSSESSellerModuleVOX5.rating;
                if (str6 != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str6);
                }
                PdpViewModel.VR2(pdpViewModelT7, context, str4, str5, fLJIIIIZZ, "showcase_detail", null, t7().Tg2(), null, null, "showcase_detail", uSSESSellerModuleVOX5.shopDetailInfos, str, b7(uSSESSellerModuleVOX5.brandLabels), uSSESSellerModuleVOX5.shopPerformance, null, str2, null, null, null, 958880);
            }
        }
        String str7 = uSSESSellerModuleVOX5.shopLink;
        if (str7 != null && a0.LJJJIL(str7) && (str3 = uSSESSellerModuleVOX5.link) != null && !a0.LJJJIL(str3)) {
            String string = C919503ib.LIZJ(str3, C2097608Jq.LJIIIIZZ(new Pair("enter_from", t7().HR2()), new Pair("trackParams", C1741890vQh.LJIIIIZZ(mapW6)))).build().toString();
            C1054004Ag c1054004Ag = t7().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                c1054004Ag.LJIJ = true;
            }
            SmartRouter.buildRoute(this.itemView.getContext(), string).open();
            C1054004Ag c1054004Ag2 = t7().LLJLILLLLZIIL;
            if (c1054004Ag2 != null) {
                C1054004Ag.LJJ(c1054004Ag2, "showcase_detail", null, null, 6);
            }
        }
    }

    public final void P7(Context context, boolean z) {
        EnumC1754390vkr enumC1754390vkr;
        PdpViewModel pdpViewModelT7 = t7();
        String strLJI = t7().LLILZIL.LJI("c2857.d5326", null);
        C03U5.LIZ(new AwS141S1200000_26(pdpViewModelT7, context, strLJI, 7), C1388190mED.LIZ(context), null);
        C1054004Ag c1054004Ag = t7().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            if (z) {
                enumC1754390vkr = EnumC1754390vkr.NORMAL;
            } else {
                enumC1754390vkr = EnumC1754390vkr.NONE;
            }
            C1054004Ag.LJIL(c1054004Ag, "contact_seller", null, null, enumC1754390vkr.getValue(), 0, 6);
        }
    }

    public final void d6(USSESSellerModuleVO uSSESSellerModuleVO, InterfaceC2260821DeK interfaceC2260821DeK) {
        boolean z;
        boolean z2;
        int iLJIIIZ;
        User user;
        AnonymousClass0317 anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin;
        boolean z3;
        String name;
        C197039127h c197039127h;
        int i;
        Integer num = uSSESSellerModuleVO.unreadMsgCount;
        if (num != null && num.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer num2 = uSSESSellerModuleVO.shopCardNewStyle;
        if (num2 != null && num2.intValue() == 4 && A7(uSSESSellerModuleVO)) {
            z2 = true;
            iLJIIIZ = R.attr.zi;
        } else {
            z2 = false;
            iLJIIIZ = interfaceC2260821DeK.LJIIIZ();
        }
        Boolean bool = uSSESSellerModuleVO.enableFollow;
        Boolean bool2 = Boolean.TRUE;
        int i2 = 8;
        if (Intrinsics.LJFF(bool, bool2)) {
            View viewFindViewById = this.itemView.findViewById(R.id.t17);
            if (z) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById);
        } else {
            View viewFindViewById2 = this.itemView.findViewById(R.id.t16);
            if (z) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById2);
        }
        C197039127h c197039127hU6 = U6();
        if (c197039127hU6 != null) {
            String string = uSSESSellerModuleVO.imButtonText;
            if (string == null) {
                Context context = this.itemView.getContext();
                if (z) {
                    i = 2131832953;
                } else {
                    i = 2131832952;
                }
                string = context.getString(i);
            }
            c197039127hU6.setText(string);
        }
        if (Intrinsics.LJFF(uSSESSellerModuleVO.enableFollow, bool2)) {
            C197039127h c197039127hU62 = U6();
            if (c197039127hU62 != null) {
                C12ES.LJIILL(4, c197039127hU62);
            }
            View viewFindViewById3 = this.LLJJJJJIL;
            if (viewFindViewById3 == null) {
                View view = this.itemView;
                if (view != null) {
                    viewFindViewById3 = view.findViewById(R.id.cs5);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJJJJJIL = (C197039127h) viewFindViewById3;
            }
            C197039127h c197039127h2 = (C197039127h) viewFindViewById3;
            if (c197039127h2 != null) {
                C12ES.LJIILL(0, c197039127h2);
                if (z2) {
                    c197039127h2.setButtonSize(2);
                    c197039127h2.setButtonVariant(2);
                }
                C786410Ut5.I7(new AjS19S0110000_35(this, z, 0), c197039127h2);
                c197039127h2.setIconTintColorRes(iLJIIIZ);
            }
            v7(uSSESSellerModuleVO);
            C1751830vgj c1751830vgjT6 = T6();
            if (c1751830vgjT6 != null && (user = uSSESSellerModuleVO.user) != null) {
                c1751830vgjT6.LIZ(new C1908330zl9(user, EnumC2274741E1w.CUSTOM_PDP_SHOP_RELATION_NEW, this.LLJJIJIL));
                if (z2) {
                    c1751830vgjT6.LIZIZ(null);
                    View view2 = c1751830vgjT6.getView();
                    if ((view2 instanceof C197039127h) && (c197039127h = (C197039127h) view2) != null) {
                        c197039127h.setButtonSize(2);
                        c197039127h.setButtonVariant(2);
                    }
                }
                c1751830vgjT6.LIZIZ(new AwS47S0310000_32(z2, interfaceC2260821DeK, this, uSSESSellerModuleVO, 3));
                c1751830vgjT6.setTracker(new AwS279S0300000_35(user, this, uSSESSellerModuleVO, 9));
                c1751830vgjT6.setFollowClickInterceptor(new C2260701De8(c1751830vgjT6, uSSESSellerModuleVO, this, user, null));
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin = FriendDependencyService.createIFriendDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String name2 = IFriendDependencyService.class.getName();
                    if (anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IFriendDependencyService.class);
                }
                ((IFriendDependencyService) anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin).getRelationObservable().observe(this.LLJJIJIL, new AObserverS132S0300000_33(user, this, uSSESSellerModuleVO, 2));
            }
        }
        C197039127h c197039127h3 = (C197039127h) this.itemView.findViewById(R.id.cs4);
        if (z2) {
            c197039127h3.setButtonSize(2);
            c197039127h3.setButtonVariant(2);
        }
        c197039127h3.setTextColorRes(iLJIIIZ);
        C786410Ut5.I7(new AjS19S0110000_35(this, z, 1), c197039127h3);
        C197039127h c197039127hV6 = V6();
        if (c197039127hV6 != null) {
            if (z2) {
                c197039127hV6.setButtonSize(2);
                c197039127hV6.setButtonVariant(2);
            }
            c197039127hV6.setTextColorRes(iLJIIIZ);
            C786410Ut5.I7(new AjS74S0100000_35(this, 3), c197039127hV6);
        }
        C197039127h c197039127hA7 = a7();
        if (c197039127hA7 != null) {
            if (z2) {
                c197039127hA7.setButtonSize(2);
                c197039127hA7.setButtonVariant(2);
            }
            c197039127hA7.setTextColorRes(iLJIIIZ);
            C786410Ut5.I7(new AjS74S0100000_35(this, 4), c197039127hA7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e6(USSESSellerModuleVO uSSESSellerModuleVO, InterfaceC2260821DeK interfaceC2260821DeK) {
        boolean z;
        ViewGroup viewGroup;
        int i;
        int i2;
        int i3;
        int iLIZ;
        ShopPerformanceInfo shopPerformanceInfo = uSSESSellerModuleVO.shopPerformanceInfo;
        if (shopPerformanceInfo != null && shopPerformanceInfo.performanceMetrics != null) {
            int i4 = 1;
            if (I7(uSSESSellerModuleVO) && A7(uSSESSellerModuleVO)) {
                z = true;
            } else {
                z = false;
            }
            View viewFindViewById = null;
            if (!z7(uSSESSellerModuleVO) && !I7(uSSESSellerModuleVO)) {
                View viewFindViewById2 = this.LLJLLL;
                if (viewFindViewById2 == null) {
                    View viewLJJIJL = LJJIJL();
                    if (viewLJJIJL != null) {
                        viewFindViewById2 = viewLJJIJL.findViewById(R.id.v83);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLJLLL = (LinearLayout) viewFindViewById2;
                }
                viewGroup = (ViewGroup) viewFindViewById2;
            } else {
                View viewFindViewById3 = this.LLJZ;
                if (viewFindViewById3 == null) {
                    View viewLJJIJL2 = LJJIJL();
                    if (viewLJJIJL2 != null) {
                        viewFindViewById3 = viewLJJIJL2.findViewById(R.id.v84);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLJZ = (LinearLayout) viewFindViewById3;
                }
                viewGroup = (ViewGroup) viewFindViewById3;
            }
            if (viewGroup != null) {
                View view = this.LLJZ;
                if (view == null) {
                    View viewLJJIJL3 = LJJIJL();
                    if (viewLJJIJL3 != null) {
                        viewFindViewById = viewLJJIJL3.findViewById(R.id.v84);
                    }
                    this.LLJZ = (LinearLayout) viewFindViewById;
                    view = viewFindViewById;
                }
                if (Intrinsics.LJFF(viewGroup, view)) {
                    if (z) {
                        viewGroup.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                    } else {
                        viewGroup.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
                    }
                }
                List<PerformanceMetric> list = shopPerformanceInfo.performanceMetrics;
                if (viewGroup.getChildCount() > 0) {
                    LinkedList<C419340GcO> linkedList = this.LLLLLLLLLL;
                    while (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        C786410Ut5.LJJJLZIJ(childAt, viewGroup);
                        if (childAt instanceof C419340GcO) {
                            linkedList.add((C419340GcO) childAt);
                        }
                    }
                    LinkedList<View> linkedList2 = this.LLLLLLLZIL;
                    while (viewGroup.getChildCount() > 0) {
                        View childAt2 = viewGroup.getChildAt(0);
                        C786410Ut5.LJJJLZIJ(childAt2, viewGroup);
                        if (childAt2 instanceof View) {
                            linkedList2.add(childAt2);
                        }
                    }
                }
                C12ES.LJIILL(0, viewGroup);
                C786410Ut5.I7(new AjS48S0200000_35(shopPerformanceInfo, this, 4), viewGroup);
                C1748720vbi.LJFF(viewGroup, new C10515049h(), AFwS226S0000000_35.get$arr$(128), new AwS614S0100000_35(this, 46));
                int size = list.size();
                int i5 = 0;
                while (i5 < size) {
                    C419340GcO c419340GcO = (C419340GcO) C19719612Di.LJJIIZI(this.LLLLLLLLLL);
                    C419340GcO c419340GcO2 = c419340GcO;
                    if (c419340GcO == null) {
                        final Context context = this.itemView.getContext();
                        c419340GcO2 = new LinearLayout(context) { // from class: X.0GcO
                            public TuxTextView LL;
                            public TuxTextView LLILLJJLI;
                            public TuxIconView LLILLL;

                            public final TuxIconView getShopPerfMetricsIconFromXml() {
                                KeyEvent.Callback callbackFindViewById = this.LLILLL;
                                if (callbackFindViewById == null) {
                                    callbackFindViewById = findViewById(R.id.v7j);
                                    this.LLILLL = (TuxIconView) callbackFindViewById;
                                }
                                return (TuxIconView) callbackFindViewById;
                            }

                            public final TuxTextView getShopPerfMetricsNameFromXml() {
                                KeyEvent.Callback callbackFindViewById = this.LL;
                                if (callbackFindViewById == null) {
                                    callbackFindViewById = findViewById(R.id.v7k);
                                    this.LL = (TuxTextView) callbackFindViewById;
                                }
                                return (TuxTextView) callbackFindViewById;
                            }

                            public final TuxTextView getShopPerfMetricsNumFromXml() {
                                KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                                if (callbackFindViewById == null) {
                                    callbackFindViewById = findViewById(R.id.v7l);
                                    this.LLILLJJLI = (TuxTextView) callbackFindViewById;
                                }
                                return (TuxTextView) callbackFindViewById;
                            }

                            {
                                super(context, null, 0);
                                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ats, this, true);
                                int visibility = getVisibility();
                                setVisibility(0);
                                C1602160rnK.LIZIZ(visibility, 0, this);
                            }

                            public final void setShopPerfMetricsIconFromXml(TuxIconView tuxIconView) {
                                this.LLILLL = tuxIconView;
                            }

                            public final void setShopPerfMetricsNameFromXml(TuxTextView tuxTextView) {
                                this.LL = tuxTextView;
                            }

                            public final void setShopPerfMetricsNumFromXml(TuxTextView tuxTextView) {
                                this.LLILLJJLI = tuxTextView;
                            }
                        };
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                    layoutParams.weight = 1.0f;
                    c419340GcO2.setId(View.generateViewId());
                    PerformanceMetric performanceMetric = (PerformanceMetric) ListProtector.get(list, i5);
                    if (z) {
                        i = R.attr.zl;
                        i2 = R.attr.zi;
                    } else {
                        i = R.attr.a1j;
                        i2 = R.attr.a1h;
                    }
                    TuxTextView shopPerfMetricsNameFromXml = c419340GcO2.getShopPerfMetricsNameFromXml();
                    shopPerfMetricsNameFromXml.setText(performanceMetric.description);
                    shopPerfMetricsNameFromXml.setTextColorRes(i);
                    TuxTextView shopPerfMetricsNumFromXml = c419340GcO2.getShopPerfMetricsNumFromXml();
                    shopPerfMetricsNumFromXml.setText(performanceMetric.value);
                    shopPerfMetricsNumFromXml.setTextColorRes(i2);
                    TuxIconView shopPerfMetricsIconFromXml = c419340GcO2.getShopPerfMetricsIconFromXml();
                    Integer num = performanceMetric.platformRateType;
                    int value = C0N6O.GOOD.getValue();
                    if (num != null && num.intValue() == value) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    C786410Ut5.LLLLLLZZ(shopPerfMetricsIconFromXml, i3);
                    shopPerfMetricsIconFromXml.setTintColorRes(R.attr.a0x);
                    viewGroup.addView(c419340GcO2, layoutParams);
                    if (i5 < list.size() - i4) {
                        View view2 = (View) C19719612Di.LJJIIZI(this.LLLLLLLZIL);
                        int iLIZ2 = R.attr.zj;
                        if (view2 == null) {
                            Context context2 = this.itemView.getContext();
                            if (z) {
                                iLIZ = R.attr.zj;
                            } else {
                                iLIZ = interfaceC2260821DeK.LIZ();
                            }
                            view2 = new View(context2);
                            view2.setBackgroundColor(C0HEZ.LIZ(iLIZ, context2));
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4))), -1);
                            C426750GoL.LJIIIIZZ(layoutParams2, context2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, false);
                            C786410Ut5.W5(view2, layoutParams2);
                        }
                        Context context3 = this.itemView.getContext();
                        if (!z) {
                            iLIZ2 = interfaceC2260821DeK.LIZ();
                        }
                        view2.setBackgroundColor(C0HEZ.LIZ(iLIZ2, context3));
                        view2.setId(View.generateViewId());
                        viewGroup.addView(view2);
                    }
                    i5++;
                    i4 = 1;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x0493 A[PHI: r1
      0x0493: PHI (r1v33 android.view.View) = (r1v32 android.view.View), (r1v40 android.view.View) binds: [B:228:0x0480, B:233:0x0491] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ab A[PHI: r1
      0x04ab: PHI (r1v35 android.view.View) = (r1v34 android.view.View), (r1v37 android.view.View) binds: [B:236:0x0498, B:241:0x04a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0569 A[PHI: r10
      0x0569: PHI (r10v3 android.view.View) = (r10v2 android.view.View), (r10v6 android.view.View) binds: [B:277:0x0556, B:282:0x0567] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f6(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO r18, X.InterfaceC2260821DeK r19) {
        /*
            Method dump skipped, instruction units count: 1734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleV3VH.f6(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO, X.1DeK):void");
    }

    public final C444910HcX q6(SellerDetailInfo sellerDetailInfo, InterfaceC2260821DeK interfaceC2260821DeK) {
        boolean z;
        int iLJIIIIZZ;
        int length;
        int length2;
        USSESSellerModuleVO uSSESSellerModuleVOX5 = X5();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(sellerDetailInfo.countShowContent);
        sbLIZ.append(' ');
        sbLIZ.append(sellerDetailInfo.content);
        C444910HcX c444910HcX = new C444910HcX(C2188811AlT.LIZIZ(sbLIZ));
        c444910HcX.LIZ(71);
        int length3 = 0;
        if (uSSESSellerModuleVOX5.topRatedInfo != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C444920HcY c444920HcY = new C444920HcY(72, true);
            String str = sellerDetailInfo.countShowContent;
            if (str != null) {
                length2 = str.length();
            } else {
                length2 = 0;
            }
            C786410Ut5.s2(c444910HcX, c444920HcY, 0, length2, 33);
            iLJIIIIZZ = interfaceC2260821DeK.LIZIZ();
        } else {
            iLJIIIIZZ = interfaceC2260821DeK.LJIIIIZZ();
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C0HEZ.LIZ(iLJIIIIZZ, this.itemView.getContext()));
        String str2 = sellerDetailInfo.countShowContent;
        if (str2 != null) {
            length = str2.length();
        } else {
            length = 0;
        }
        C786410Ut5.s2(c444910HcX, foregroundColorSpan, 0, length, 33);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C0HEZ.LIZ(interfaceC2260821DeK.LJIIIIZZ(), this.itemView.getContext()));
        String str3 = sellerDetailInfo.countShowContent;
        if (str3 != null) {
            length3 = str3.length();
        }
        C786410Ut5.s2(c444910HcX, foregroundColorSpan2, length3 + 1, c444910HcX.length(), 33);
        return c444910HcX;
    }

    public final void u7(String str, String str2) {
        USSESSellerModuleVO uSSESSellerModuleVOX5 = X5();
        Map<String, Object> mapW6 = w6();
        Map<String, Object> mapZ6 = z6();
        for (Map.Entry<String, Object> entry : t7().LLILZIL.LJ(str2).entrySet()) {
            mapZ6.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        mapZ6.put("rights_content_new", v6(uSSESSellerModuleVOX5));
        C1054004Ag c1054004Ag = t7().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            C1054004Ag.LJJ(c1054004Ag, "shop_card_brand_explanation", null, mapZ6, 2);
        }
        Context context = this.itemView.getContext();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strLJI = t7().LLILZIL.LJI(str2, null);
        if (strLJI != null) {
            linkedHashMap.put("source_btm_token", strLJI);
        }
        linkedHashMap.put("trackParams", C1741890vQh.LJIIIIZZ(mapW6));
        linkedHashMap.put("enter_from", t7().HR2());
        C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public USSESSellerModuleV3VH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.atv, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = eCBaseFragment;
        this.LLLLLLIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 390));
        this.LLLLLLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1349));
        this.LLLLLLL = new LinkedList<>();
        this.LLLLLLLLL = new LinkedList<>();
        this.LLLLLLLLLL = new LinkedList<>();
        this.LLLLLLLZIL = new LinkedList<>();
    }

    public static final void h6(SmartImageView smartImageView, USSESSellerModuleVO uSSESSellerModuleVO, USSESSellerModuleV3VH uSSESSellerModuleV3VH, boolean z, InterfaceC427850Gq7 interfaceC427850Gq7) {
        Image image;
        if (z) {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            C786410Ut5.G6(smartImageView, layoutParams);
            smartImageView.requestLayout();
            image = uSSESSellerModuleVO.avatar;
        } else {
            ShopCardBackground shopCardBackground = uSSESSellerModuleVO.shopBackground;
            if (shopCardBackground != null) {
                image = shopCardBackground.textLogo;
            } else {
                image = null;
            }
        }
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
        c1331670kl3LIZLLL.LIZLLL("USSESSellerModuleVH");
        if (z) {
            C1331750klB c1331750klB = new C1331750klB();
            int iLIZ = C0HEZ.LIZ(R.attr.a01, uSSESSellerModuleV3VH.itemView.getContext());
            float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
            c1331750klB.LIZJ = iLIZ;
            c1331750klB.LIZIZ = fLIZIZ;
            c1331750klB.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
        }
        c1331670kl3LIZLLL.LJJ(smartImageView);
        if (interfaceC427850Gq7 == null) {
            C786410Ut5.h3(c1331670kl3LIZLLL);
        } else {
            c1331670kl3LIZLLL.LJIIJ(interfaceC427850Gq7);
        }
    }
}
