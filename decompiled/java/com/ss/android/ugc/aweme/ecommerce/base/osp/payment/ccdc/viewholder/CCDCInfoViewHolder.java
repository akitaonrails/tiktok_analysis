package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C03H8;
import X.C03HE;
import X.C0H9H;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCInfoViewHolder extends PowerCell<C03HE> implements C03H8 {
    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        LinearLayout linearLayout;
        C03HE c03he = (C03HE) interfaceC1891350zJl;
        View view = this.itemView;
        if ((view instanceof LinearLayout) && (linearLayout = (LinearLayout) view) != null) {
            SmartImageView smartImageView = new SmartImageView(this.itemView.getContext());
            C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(C0H9H.LIZIZ(32), C0H9H.LIZIZ(20)));
            linearLayout.setGravity(16);
            smartImageView.setBackgroundResource(R.drawable.b2a);
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            String str = c03he.LL;
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.c7, this.itemView.getContext()));
            c1331670kl3LIZLLL.LJJI(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            linearLayout.addView(smartImageView);
            TuxTextView tuxTextView = new TuxTextView(this.itemView.getContext(), null, 6, 0);
            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setTuxFont(42);
            C0H9H.LJFF(C0H9H.LIZIZ(8), tuxTextView);
            String str2 = c03he.LLILLJJLI;
            if (str2 != null) {
                tuxTextView.setText(str2);
            }
            linearLayout.addView(tuxTextView);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setPadding(C0H9H.LIZIZ(16), 0, C0H9H.LIZIZ(16), C0H9H.LIZIZ(12));
        C786410Ut5.d6(linearLayout, layoutParams);
        return linearLayout;
    }
}
