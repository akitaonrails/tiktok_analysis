package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend;

import X.C01GW;
import X.C03C8;
import X.C03J8;
import X.C0H1U;
import X.C0H9H;
import X.C1744700vVE;
import X.C1748730vbj;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1752410vhf;
import X.C452501pT;
import X.C786410Ut5;
import X.C954703oH;
import X.InterfaceC1748810vbr;
import Y.ARunnableS95S0200000_26;
import Y.AsS52S0100000_26;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPromotionItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.a0;
import p8b.c;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpShopRecommendVH extends AbsFullSpanVH<ShopRecommendVO> implements InterfaceC1748810vbr, c {
    public final ECBaseFragment LLJJIJIL;
    public TuxIconView LLJJJ;
    public RecyclerView LLJJJIL;
    public C1752410vhf LLJJJJ;
    public String LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final C01GW LLJLIL;

    @Override // p8b.c
    public final String getViewName() {
        return "PdpShopRecommendVH";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final t2b.c c6() {
        return (t2b.c) this.LLJLIL.getValue();
    }

    public final PdpViewModel d6() {
        return (PdpViewModel) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C1748730vbj.LIZ(this.itemView);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        this.LLJJJJ = new C1752410vhf(d6(), this.LLJJIJIL, c6());
        ((RecyclerView) this.itemView.findViewById(R.id.twj)).setAdapter(this.LLJJJJ);
        ((RecyclerView) this.itemView.findViewById(R.id.twj)).addOnScrollListener(new AsS52S0100000_26(this, 2));
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS605S0100000_26(X5(), 236));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean z;
        ECRichText eCRichText;
        List<Feed> list;
        ShopPromotionItem shopPromotionItem;
        ShopRecommendVO shopRecommendVO = (ShopRecommendVO) obj;
        String str = shopRecommendVO.modelTitle;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ((TextView) this.itemView.findViewById(R.id.tv_title)).setText(this.itemView.getContext().getResources().getString(2131832950));
        } else {
            ((TextView) this.itemView.findViewById(R.id.tv_title)).setText(shopRecommendVO.modelTitle);
        }
        ((TuxTextView) this.itemView.findViewById(R.id.tv_title)).setTuxFont(c6().LIZ());
        ((TuxTextView) this.itemView.findViewById(R.id.tv_title)).setTextColorRes(c6().LLJILLL());
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_shop_promotion);
        CommonFeedData commonFeedData = shopRecommendVO.shopRecommendData;
        View viewFindViewById = null;
        if (commonFeedData != null && (shopPromotionItem = commonFeedData.shopPromotion) != null) {
            eCRichText = shopPromotionItem.promotionText;
        } else {
            eCRichText = null;
        }
        C03C8.LJ(textView, eCRichText, "pdp_shop_card_promotion", null);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.tv_viewMore);
        String str2 = shopRecommendVO.enterName;
        if (str2 == null) {
            str2 = "";
        }
        textView2.setText(str2);
        CommonFeedData commonFeedData2 = shopRecommendVO.shopRecommendData;
        if (commonFeedData2 != null) {
            list = commonFeedData2.feedList;
        } else {
            list = null;
        }
        if (list != null) {
            C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.twj));
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.vev));
            d6().SR2().getClass();
            C1752410vhf c1752410vhf = this.LLJJJJ;
            if (c1752410vhf != null) {
                CommonFeedData commonFeedData3 = shopRecommendVO.shopRecommendData;
                List<Feed> list2 = commonFeedData3.feedList;
                String str3 = commonFeedData3.requestId;
                c1752410vhf.LLILZ = list2;
                c1752410vhf.LLILZIL = str3;
                c1752410vhf.notifyDataSetChanged();
            }
            if (!this.LLJJJJLIIL) {
                this.LLJJJJLIIL = true;
                d6();
                new ARunnableS95S0200000_26(this, shopRecommendVO, 54).run();
            }
        } else {
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.twj));
            C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.vev));
            d6().LLLLLJIL.LIZIZ(this.itemView);
        }
        C786410Ut5.I7(new AjS44S0200000_26(shopRecommendVO, this, 46), this.itemView.findViewById(R.id.yax));
        View viewFindViewById2 = this.LLJJJ;
        if (viewFindViewById2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById2 = viewLJJIJL.findViewById(R.id.k5u);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJJ = (TuxIconView) viewFindViewById2;
        }
        C1744700vVE.LJII(viewFindViewById2, c6().LJJIIJZLJL(), c6().LLII());
        View viewFindViewById3 = this.LLJJJ;
        if (viewFindViewById3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.k5u);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJJ = (TuxIconView) viewFindViewById3;
        }
        ((TuxIconView) viewFindViewById3).setTintColorRes(c6().LLIZLLLIL());
        View view = this.LLJJJIL;
        if (view == null) {
            View view2 = this.itemView;
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.twj);
            }
            this.LLJJJIL = (RecyclerView) viewFindViewById;
            view = viewFindViewById;
        }
        C0H9H.LJI(c6().LLFF(), view);
        C0H1U.LJIIJ(c6().getPaddingTop(), this.itemView);
        C03J8.LIZ(this.itemView, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpShopRecommendVH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.atc, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJJJIL = "";
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 461));
        this.LLJLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 460));
    }
}
