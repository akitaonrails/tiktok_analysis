package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend;

import X.C013C;
import X.C01GW;
import X.C03C8;
import X.C03J8;
import X.C0H1U;
import X.C0H9H;
import X.C1744700vVE;
import X.C1748730vbj;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1752950viX;
import X.C452501pT;
import X.C786410Ut5;
import X.C954703oH;
import X.InterfaceC1748810vbr;
import Y.ARunnableS95S0200000_26;
import Y.AsS35S0200000_26;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import t2b.m;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpShopPhaseTwoRecommendVH extends AbsFullSpanVH<ShopRecommendVO> implements InterfaceC1748810vbr, c {
    public final ECBaseFragment LLJJIJIL;
    public C1752950viX LLJJJ;
    public boolean LLJJJIL;
    public String LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public final C01GW LLJJL;
    public final m LLJJLIIIJLLLLLLLZ;
    public final RecyclerView LLJL;
    public final TuxTextView LLJLIL;
    public final TuxTextView LLJLILLLLZIIL;
    public final View LLJLL;
    public final ConstraintLayout LLJLLIL;
    public final TuxIconView LLJLLL;

    @Override // p8b.c
    public final String getViewName() {
        return "PdpShopPhaseTwoRecommendVH";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel c6() {
        return (PdpViewModel) this.LLJJL.getValue();
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C1748730vbj.LIZ(this.itemView);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C1752950viX c1752950viX = new C1752950viX(c6(), this.LLJJIJIL, this.LLJJLIIIJLLLLLLLZ);
        this.LLJJJ = c1752950viX;
        this.LLJL.setAdapter(c1752950viX);
        this.LLJL.addOnScrollListener(new AsS35S0200000_26(this, new C013C(), 0));
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS605S0100000_26(X5(), 234));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        ECRichText eCRichText;
        ShopPromotionItem shopPromotionItem;
        ShopRecommendVO shopRecommendVO = (ShopRecommendVO) obj;
        String str = shopRecommendVO.modelTitle;
        if (str != null && !a0.LJJJIL(str)) {
            this.LLJLIL.setText(shopRecommendVO.modelTitle);
        } else {
            this.LLJLIL.setText(this.itemView.getContext().getResources().getString(2131832950));
        }
        TuxTextView tuxTextView = this.LLJLIL;
        this.LLJJLIIIJLLLLLLLZ.getClass();
        tuxTextView.setTuxFont(32);
        TuxTextView tuxTextView2 = this.LLJLIL;
        this.LLJJLIIIJLLLLLLLZ.getClass();
        tuxTextView2.setTextColorRes(R.attr.u_);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_shop_promotion);
        CommonFeedData commonFeedData = shopRecommendVO.shopRecommendData;
        List<Feed> list = null;
        if (commonFeedData != null && (shopPromotionItem = commonFeedData.shopPromotion) != null) {
            eCRichText = shopPromotionItem.promotionText;
        } else {
            eCRichText = null;
        }
        C03C8.LJ(textView, eCRichText, "pdp_shop_card_promotion", null);
        TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
        String str2 = shopRecommendVO.enterName;
        if (str2 == null) {
            str2 = "";
        }
        tuxTextView3.setText(str2);
        CommonFeedData commonFeedData2 = shopRecommendVO.shopRecommendData;
        if (commonFeedData2 != null) {
            list = commonFeedData2.feedList;
        }
        if (list != null) {
            C786410Ut5.LJLLLLLL(0, this.LLJL);
            C786410Ut5.LJLLLLLL(8, this.LLJLL);
            c6().SR2().getClass();
            C1752950viX c1752950viX = this.LLJJJ;
            if (c1752950viX != null) {
                CommonFeedData commonFeedData3 = shopRecommendVO.shopRecommendData;
                List<Feed> list2 = commonFeedData3.feedList;
                String str3 = commonFeedData3.requestId;
                c1752950viX.LLILZ = list2;
                c1752950viX.LLILZIL = str3;
                c1752950viX.notifyDataSetChanged();
            }
            if (!this.LLJJJIL) {
                this.LLJJJIL = true;
                c6();
                new ARunnableS95S0200000_26(this, shopRecommendVO, 53).run();
            }
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLJL);
            C786410Ut5.LJLLLLLL(0, this.LLJLL);
            c6().LLLLLJIL.LIZIZ(this.itemView);
        }
        C786410Ut5.I7(new AjS44S0200000_26(shopRecommendVO, this, 45), this.LLJLLIL);
        C1744700vVE.LJII(this.LLJLLL, this.LLJJLIIIJLLLLLLLZ.LJJIIJZLJL(), this.LLJJLIIIJLLLLLLLZ.LLII());
        TuxIconView tuxIconView = this.LLJLLL;
        this.LLJJLIIIJLLLLLLLZ.getClass();
        tuxIconView.setTintColorRes(R.attr.a1k);
        C0H9H.LJI(this.LLJJLIIIJLLLLLLLZ.LLFF(), this.LLJL);
        C0H1U.LJIIJ(this.LLJJLIIIJLLLLLLLZ.getPaddingTop(), this.itemView);
        C03J8.LIZ(this.itemView, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdpShopPhaseTwoRecommendVH(ViewGroup viewGroup, ECBaseFragment eCBaseFragment, View view) {
        if (view == null) {
            C01GW c01gw = C954703oH.LIZ;
            view = C954703oH.LIZ(viewGroup.getContext(), R.layout.atd, viewGroup, false);
        }
        super(view);
        this.LLJJIJIL = eCBaseFragment;
        this.LLJJJJ = "";
        this.LLJJL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 459));
        this.LLJJLIIIJLLLLLLLZ = new m();
        this.LLJL = (RecyclerView) this.itemView.findViewById(R.id.twa);
        this.LLJLIL = (TuxTextView) this.itemView.findViewById(R.id.tv_title_phase_two);
        this.LLJLILLLLZIIL = (TuxTextView) this.itemView.findViewById(R.id.tv_viewMore_phase_two_cell);
        this.LLJLL = this.itemView.findViewById(R.id.vex);
        this.LLJLLIL = (ConstraintLayout) this.itemView.findViewById(R.id.yaz);
        this.LLJLLL = (TuxIconView) this.itemView.findViewById(R.id.k5v);
    }
}
