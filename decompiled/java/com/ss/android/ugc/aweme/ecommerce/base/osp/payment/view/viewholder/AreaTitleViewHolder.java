package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C03YR;
import X.C03YV;
import X.C0H1U;
import X.C0H9H;
import X.C12ES;
import X.C452501pT;
import X.C786410Ut5;
import X.C924703jR;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS545S0100000_1;
import ola.f;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class AreaTitleViewHolder extends ECJediViewHolder<C03YV> implements c {
    public final C924703jR LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // p8b.c
    public final String getViewName() {
        return "AreaTitleViewHolder";
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int iIntValue;
        C03YV c03yv = (C03YV) obj;
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        Object objLLLIIIIL = this.LLJILJIL.LLLIIIIL(this.LLILLL - 1, false);
        if (objLLLIIIIL != null) {
            if (objLLLIIIIL instanceof C03YR) {
                C0H9H.LJI(C0H9H.LIZIZ(0), this.itemView);
            } else {
                View view = this.itemView;
                Integer num = c03yv.LIZLLL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 24;
                }
                C0H9H.LJI(C0H9H.LIZIZ(iIntValue), view);
            }
        }
        View view2 = this.itemView;
        TextView textView = (TextView) view2.findViewById(R.id.title);
        String string = c03yv.LJ;
        if (string == null) {
            string = this.itemView.getContext().getString(c03yv.LIZ);
        }
        textView.setText(string);
        ((TuxTextView) view2.findViewById(R.id.title)).setTuxFont(((f) this.LLJILJILJ.getValue()).LJJII());
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.title);
        ((f) this.LLJILJILJ.getValue()).LLIILII();
        tuxTextView.setTextColorRes(R.attr.a1k);
        String str = c03yv.LIZIZ;
        if (str != null) {
            C12ES.LJIILL(0, view2.findViewById(R.id.ayo));
            ((TextView) view2.findViewById(R.id.ayo)).setText(str);
        } else {
            C0H1U.LIZIZ(view2.findViewById(R.id.ayo));
        }
    }

    public AreaTitleViewHolder(ViewGroup viewGroup, C924703jR c924703jR) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aqn, viewGroup, false));
        this.LLJILJIL = c924703jR;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1244));
    }
}
