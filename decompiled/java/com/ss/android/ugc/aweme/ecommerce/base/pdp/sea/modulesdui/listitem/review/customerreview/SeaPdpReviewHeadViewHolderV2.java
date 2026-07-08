package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview;

import X.C01GW;
import X.C03DZ;
import X.C049X;
import X.C04IE;
import X.C1054104Ah;
import X.C1071004Gu;
import X.C1073004Ho;
import X.C13LE;
import X.C1748720vbi;
import X.C1755030vlt;
import X.C1755600vmo;
import X.C19719912Dl;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedbackVoteData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewSubTitle;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpReviewHeadViewHolderV2 extends AbsFullSpanVH<C04IE> {
    public static final /* synthetic */ int LLJJJJ = 0;
    public final String LLJJIJIL;
    public final C01GW LLJJJ;
    public final TuxIconView LLJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel c6() {
        return (SeaPdpViewModel) this.LLJJJ.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        b6(new C1755030vlt(this.LLILLJJLI));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeaPdpReviewHeadViewHolderV2(ViewGroup viewGroup) {
        C1755600vmo c1755600vmo = C1755600vmo.LIZ;
        Context context = viewGroup.getContext();
        c1755600vmo.getClass();
        super(C1755600vmo.LIZ(R.layout.ask, context, viewGroup, false, false));
        this.LLJJIJIL = "SeaPdpReviewHeadViewHolderV2";
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 70));
        this.LLJJJIL = (TuxIconView) this.itemView.findViewById(R.id.lsu);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        ReviewSubTitle reviewSubTitle;
        String str;
        String str2;
        int i;
        ConcurrentHashMap<String, Object> concurrentHashMap;
        C04IE c04ie = (C04IE) obj;
        View viewFindViewById = this.itemView.findViewById(R.id.fdg);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.srj);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.srn);
        View viewFindViewById2 = this.itemView.findViewById(R.id.fz3);
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.tha);
        TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.ujb);
        TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.uj_);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tg0);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView.findViewById(R.id.wm4);
        View viewFindViewById3 = this.itemView.findViewById(R.id.wmv);
        if (C1071004Gu.LIZIZ().LIZ()) {
            tuxTextView.setTuxFont(102);
            tuxTextView2.setTuxFont(102);
        }
        Context context = this.itemView.getContext();
        Object[] objArr = new Object[1];
        String string = c04ie.LLILZ;
        if (string == null) {
            Object obj2 = c04ie.LLILLJJLI;
            if (obj2 == null) {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            string = obj2.toString();
        }
        objArr[0] = string;
        tuxTextView2.setText(context.getString(2131832618, objArr));
        tuxTextView3.setText(this.itemView.getContext().getString(2131832617));
        ProductDetailReview productDetailReview = c04ie.LLILZLL;
        if (productDetailReview != null) {
            reviewSubTitle = productDetailReview.subTitle;
        } else {
            reviewSubTitle = null;
        }
        FeedbackVoteData feedbackVoteData = c04ie.LLIZLLLIL;
        if (feedbackVoteData != null && (str2 = feedbackVoteData.text) != null && !a0.LJJJIL(str2)) {
            C786410Ut5.LJLLLLLL(0, constraintLayout);
            textView.setText(feedbackVoteData.text);
            if (Intrinsics.LJFF(feedbackVoteData.hasInfoIcon, Boolean.TRUE)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById3);
            View view = this.itemView;
            C1054104Ah c1054104Ah = c6().LLJLIL;
            if (c1054104Ah != null) {
                concurrentHashMap = c1054104Ah.LIZIZ;
            } else {
                concurrentHashMap = null;
            }
            C1073004Ho.LIZ(feedbackVoteData, view, constraintLayout, concurrentHashMap);
        } else if (reviewSubTitle != null && (str = reviewSubTitle.text) != null && !a0.LJJJIL(str)) {
            C786410Ut5.LJLLLLLL(0, constraintLayout);
            textView.setText(reviewSubTitle.text);
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
            ReviewFilterStruct reviewFilterStruct = reviewSubTitle.reviewFilter;
            if (reviewFilterStruct != null) {
                C786410Ut5.I7(new AjS40S0200000_1(this, reviewFilterStruct, 62), constraintLayout);
            } else {
                C786410Ut5.Y7(constraintLayout, null);
            }
        } else {
            C786410Ut5.LJLLLLLL(8, constraintLayout);
            C786410Ut5.Y7(constraintLayout, null);
        }
        Float f = c04ie.LL;
        if (f != null) {
            tuxTextView.setText(f.toString());
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
            String str3 = c04ie.LLIZ;
            if (str3 != null && !a0.LJJJIL(str3)) {
                C03DZ.LIZJ(this.LLJJJIL);
                C786410Ut5.I7(new AjS40S0200000_1(c04ie, this, 61), this.LLJJJIL);
                C1748720vbi.LJFF(this.LLJJJIL, new C049X(), new AwS545S0100000_1(this, 1611), new AwS367S0200000_1(this, c04ie, 250));
            } else {
                C03DZ.LIZ(this.LLJJJIL);
            }
            C786410Ut5.I7(new AjS60S0100000_1(this, 94), viewFindViewById);
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        C786410Ut5.LLLLZLL(tuxTextView3, 8);
        C03DZ.LIZ(this.LLJJJIL);
    }
}
