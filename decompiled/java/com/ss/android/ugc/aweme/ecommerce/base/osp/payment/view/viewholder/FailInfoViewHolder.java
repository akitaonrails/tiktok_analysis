package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C03YR;
import X.C703302op;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class FailInfoViewHolder extends ECJediViewHolder<C03YR> {
    public C03YR LLJILJIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public FailInfoViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aqp, viewGroup, false));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        C03YR c03yr;
        C03YR c03yr2;
        C03YR c03yr3 = (C03YR) obj;
        View view = this.itemView;
        TextView textView = (TextView) view.findViewById(R.id.ji7);
        if (textView != null) {
            String string = c03yr3.LIZ;
            if ((!Boolean.valueOf(C703302op.LIZ(string)).booleanValue() || string == null) && ((c03yr2 = this.LLJILJIL) == null || (string = c03yr2.LIZ) == null)) {
                string = view.getContext().getString(2131832547);
            }
            textView.setText(string);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.o8v);
        if (textView2 != null) {
            String string2 = c03yr3.LIZIZ;
            if ((!Boolean.valueOf(C703302op.LIZ(string2)).booleanValue() || string2 == null) && ((c03yr = this.LLJILJIL) == null || (string2 = c03yr.LIZIZ) == null)) {
                string2 = view.getContext().getString(2131832534);
            }
            textView2.setText(string2);
        }
        if (C703302op.LIZ(c03yr3.LIZ) && C703302op.LIZ(c03yr3.LIZIZ)) {
            this.LLJILJIL = c03yr3;
        }
        TextView textView3 = (TextView) view.findViewById(R.id.uip);
        if (textView3 != null) {
            textView3.setText(view.getContext().getString(2131832975));
        }
    }
}
