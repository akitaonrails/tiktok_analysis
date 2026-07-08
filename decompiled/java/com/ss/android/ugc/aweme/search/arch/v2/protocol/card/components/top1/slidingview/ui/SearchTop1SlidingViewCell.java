package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.slidingview.ui;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C01GW;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427690Gpr;
import X.C452501pT;
import X.C660830Pw1;
import X.C786410Ut5;
import X.EnumC039900Cf;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.slidingview.ui.Top1CardSlidingViewAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchTop1SlidingViewCell extends PowerCell<C660830Pw1> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 199));
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public LinearLayoutCompat LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Top1CardSlidingViewAbility top1CardSlidingViewAbility;
        super.onViewAttachedToWindow();
        C660830Pw1 item = getItem();
        if (item == null || (top1CardSlidingViewAbility = (Top1CardSlidingViewAbility) this.LL.getValue()) == null) {
            return;
        }
        top1CardSlidingViewAbility.LX1(item);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        int i2;
        final C660830Pw1 c660830Pw1 = (C660830Pw1) interfaceC1891350zJl;
        super.onBindItemView(c660830Pw1);
        c660830Pw1.getClass();
        if (EnumC039900Cf.HIGHLIGHT_CERULEAN == null) {
            i = R.attr.a15;
            i2 = R.attr.a0g;
        } else {
            i = R.attr.a1j;
            i2 = R.attr.a03;
        }
        new C419910GdJ();
        Integer.valueOf(i);
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            c660830Pw1.getClass();
            C339190DRl.LIZIZ(tuxIconView);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            c660830Pw1.getClass();
            tuxTextView.setText((CharSequence) null);
            tuxTextView.setTextColorRes(i);
        }
        LinearLayoutCompat linearLayoutCompat = this.LLILZ;
        if (linearLayoutCompat != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(i2);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            linearLayoutCompat.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        LinearLayoutCompat linearLayoutCompat2 = this.LLILZ;
        if (linearLayoutCompat2 != null) {
            C427690Gpr.LJ(linearLayoutCompat2, C418440Gaw.LIZIZ(10));
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0DhQ
            @Override // X.AbstractViewOnClickListenerC420730Ged
            public final void LIZ(View view) {
                Top1CardSlidingViewAbility top1CardSlidingViewAbility;
                if (view != null && (top1CardSlidingViewAbility = (Top1CardSlidingViewAbility) this.LLILZ.LL.getValue()) != null) {
                    top1CardSlidingViewAbility.y21(c660830Pw1);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1500L);
            }
        }, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewInflateItemView$default = PowerCell.inflateItemView$default(this, viewGroup, R.layout.f3l, false, 4, null);
        this.LLILLJJLI = (TuxIconView) viewInflateItemView$default.findViewById(R.id.ly8);
        this.LLILLL = (TuxTextView) viewInflateItemView$default.findViewById(R.id.tv_top1_sliding_cell);
        this.LLILZ = (LinearLayoutCompat) viewInflateItemView$default.findViewById(R.id.y8o);
        return viewInflateItemView$default;
    }
}
