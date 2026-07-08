package kotlin.jvm.internal;

import X.C09AY;
import X.C0H9H;
import X.C1744760vVK;
import X.C426160GnO;
import X.C426750GoL;
import X.C631470Opl;
import X.C723002s0;
import X.C786410Ut5;
import X.C7912037e;
import X.C815003Gi;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.onereview.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.zhiliaoapp.musically.R;
import g1c.AjS7S0400000_1;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public class AwS82S0301000_1 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS82S0301000_1 awS82S0301000_1, Object obj, Object obj2, Object obj3) {
        C815003Gi c815003Gi = (C815003Gi) awS82S0301000_1.l0;
        OspShopViewModel ospShopViewModel = c815003Gi.LLILLL;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = c815003Gi.LLILLJJLI;
        C723002s0 c723002s0 = (C723002s0) awS82S0301000_1.l1;
        int i = awS82S0301000_1.i3;
        Context context = ((View) awS82S0301000_1.l2).getContext();
        ospShopViewModel.getClass();
        return new C7912037e((LogisticExpressionArea) obj, c723002s0, context, ospShopViewModel, orderSubmitAssemViewModel, i, (TuxTextView) obj3);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS82S0301000_1 awS82S0301000_1, Object obj, Object obj2, Object obj3) {
        int i;
        View view = (View) obj;
        ReviewMedia reviewMedia = (ReviewMedia) obj2;
        int iIntValue = ((Number) obj3).intValue();
        C786410Ut5.I7(new AjS7S0400000_1(reviewMedia, (PdpReviewViewHolder) awS82S0301000_1.l0, (ReviewItemStruct) awS82S0301000_1.l1, (C426160GnO) awS82S0301000_1.l2, 13), view.findViewById(R.id.tgm));
        View viewFindViewById = view.findViewById(R.id.qmu);
        if (viewFindViewById != null) {
            Integer num = reviewMedia.mediaType;
            if (num != null && num.intValue() == 2 && iIntValue != 3) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
        if (iIntValue == 3) {
            C426750GoL.LJIIIZ(view, null, null, 0, null, false, 27);
        }
        if (awS82S0301000_1.i3 > 0 && iIntValue == 3) {
            C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.uxy), 0);
            C631470Opl.LIZ(view.findViewById(R.id.uxy), Float.valueOf(C0H9H.LIZ(8)), null, null, null, null, 30);
            if (C1744760vVK.LIZ()) {
                TextView textView = (TextView) view.findViewById(R.id.uxy);
                StringBuilder sb = new StringBuilder();
                sb.append(awS82S0301000_1.i3);
                sb.append('+');
                textView.setText(sb.toString());
            } else {
                ((TextView) view.findViewById(R.id.uxy)).setText("+" + awS82S0301000_1.i3);
            }
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.uxy), 8);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0301000_1(int i, PdpReviewViewHolder pdpReviewViewHolder, ReviewItemStruct reviewItemStruct, C426160GnO c426160GnO, int i2) {
        super(3);
        this.$t = i2;
        this.i3 = i;
        this.l0 = pdpReviewViewHolder;
        this.l1 = reviewItemStruct;
        this.l2 = c426160GnO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0301000_1(C815003Gi c815003Gi, C723002s0 c723002s0, int i, View view, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = c815003Gi;
        this.l1 = c723002s0;
        this.i3 = i;
        this.l2 = view;
    }
}
