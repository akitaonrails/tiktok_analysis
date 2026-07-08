package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view;

import X.C03DZ;
import X.C0H1U;
import X.C1533950q1J;
import X.C197039127h;
import X.C786410Ut5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectCheckoutBottomWidget extends FrameLayout implements c {
    public C197039127h LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public boolean LLIZ;
    public Function1<? super Boolean, Unit> LLIZLLLIL;

    @Override // p8b.c
    public String getViewName() {
        return "OrderSubmitBottomAssemWidget";
    }

    public final TuxTextView getDiscountDescView() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yfr);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C197039127h getPlaceOrderButton() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qkp);
            this.LL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxTextView getTotalPriceView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.total_price);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getTotalTitleRoot() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.yg2);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getTotalTitleView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.total_title);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getUpDownIconView() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.up_down_icon);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final Function1<Boolean, Unit> getSummaryHandler() {
        return this.LLIZLLLIL;
    }

    public final boolean getUpDownIconExpand() {
        return this.LLIZ;
    }

    public final void setDiscountDescView(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setPlaceOrderButton(C197039127h c197039127h) {
        this.LL = c197039127h;
    }

    public final void setSummaryHandler(Function1<? super Boolean, Unit> function1) {
        this.LLIZLLLIL = function1;
    }

    public final void setTotalPriceView(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTotalTitleRoot(View view) {
        this.LLILZ = view;
    }

    public final void setTotalTitleView(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setUpDownIconExpand(boolean z) {
        this.LLIZ = z;
    }

    public final void setUpDownIconView(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public DirectCheckoutBottomWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C0H1U.LIZJ(R.layout.am7, this, true);
        String string = context.getString(2131848100);
        TuxTextView totalTitleView = getTotalTitleView();
        if (totalTitleView != null) {
            totalTitleView.setText(string);
        }
        View totalTitleRoot = getTotalTitleRoot();
        if (totalTitleRoot != null) {
            C786410Ut5.I7(new AjS60S0100000_1(this, 107), totalTitleRoot);
        }
    }

    public final void LIZIZ(String str, String str2) {
        TuxTextView totalPriceView = getTotalPriceView();
        if (totalPriceView != null) {
            if (str == null) {
                str = "";
            }
            totalPriceView.setText(str);
        }
        if (C1533950q1J.LJ(str2)) {
            TuxTextView discountDescView = getDiscountDescView();
            if (discountDescView != null) {
                C03DZ.LIZJ(discountDescView);
            }
            TuxTextView discountDescView2 = getDiscountDescView();
            if (discountDescView2 != null) {
                discountDescView2.setText(str2);
                return;
            }
            return;
        }
        TuxTextView discountDescView3 = getDiscountDescView();
        if (discountDescView3 == null) {
            return;
        }
        C03DZ.LIZ(discountDescView3);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.DirectCheckoutBottomWidget r9, java.lang.String r10, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo r11, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r12, java.lang.String r13, java.lang.String r14, kotlin.jvm.functions.Function1 r15) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.DirectCheckoutBottomWidget.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.DirectCheckoutBottomWidget, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1):void");
    }
}
