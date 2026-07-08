package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.title;

import X.C03B0;
import X.C0H9H;
import X.C786410Ut5;
import X.C997203v8;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class GlobalTitleVH extends PdpHolder<C997203v8> {
    public static final float LLJJJIL = C0H9H.LIZ(24);
    public static final float LLJJJJ = C0H9H.LIZ(16);
    public TuxTextView LLJJIJIL;
    public TuxIconView LLJJJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final TuxTextView c6() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.y3b) : null;
            this.LLJJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public GlobalTitleVH(View view) {
        super(R.layout.b3j, view, true);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        float f;
        float f2;
        float f3;
        float f4;
        C997203v8 c997203v8 = (C997203v8) obj;
        View viewFindViewById = null;
        if (c997203v8.LLILLJJLI != null) {
            TuxTextView tuxTextViewC6 = c6();
            if (tuxTextViewC6 != null) {
                C03B0 c03b0 = new C03B0(tuxTextViewC6, "pdp_module_title");
                C03B0.LIZ(c03b0, c997203v8.LLILLJJLI, null, null, false, null, null, 126);
                tuxTextViewC6.setText(c03b0.LIZJ);
            }
        } else {
            TuxTextView tuxTextViewC62 = c6();
            String string = c997203v8.LL;
            if (string == null) {
                Integer num = c997203v8.LLILLL;
                if (num != null) {
                    string = this.itemView.getContext().getString(num.intValue());
                } else {
                    string = null;
                }
            }
            tuxTextViewC62.setText(string);
            Integer num2 = c997203v8.LLIZLLLIL;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                TuxTextView tuxTextViewC63 = c6();
                if (tuxTextViewC63 != null) {
                    tuxTextViewC63.setTuxFont(iIntValue);
                }
            }
        }
        View view = this.LLJJJ;
        if (view == null) {
            View view2 = this.itemView;
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.y05);
            }
            this.LLJJJ = (TuxIconView) viewFindViewById;
            view = viewFindViewById;
        }
        int i = 0;
        if (!c997203v8.LLILZ || c997203v8.LLILZLL == null) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        C786410Ut5.I7(new AjS60S0100000_1(c997203v8, 44), this.itemView);
        View view3 = this.itemView;
        Padding padding = c997203v8.LLIZ;
        if (padding != null) {
            f = padding.left;
        } else {
            f = LLJJJJ;
        }
        int i2 = (int) f;
        if (padding != null) {
            f2 = padding.top;
        } else {
            f2 = LLJJJIL;
        }
        int i3 = (int) f2;
        if (padding != null) {
            f3 = padding.right;
        } else {
            f3 = LLJJJJ;
        }
        int i4 = (int) f3;
        if (padding != null) {
            f4 = padding.bottom;
        } else {
            f4 = LLJJJIL;
        }
        view3.setPadding(i2, i3, i4, (int) f4);
    }
}
