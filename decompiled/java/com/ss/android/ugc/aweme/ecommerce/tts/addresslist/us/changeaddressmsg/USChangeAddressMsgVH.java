package com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.changeaddressmsg;

import X.C00X5;
import X.C12ES;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class USChangeAddressMsgVH extends ECJediViewHolder<C00X5> {
    public LinearLayout LLJILJIL;
    public TuxTextView LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public USChangeAddressMsgVH(View view) {
        super(view);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        String str = ((C00X5) obj).LL;
        if (str != null) {
            View viewFindViewById = this.LLJILJIL;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.fpa);
                } else {
                    viewFindViewById = null;
                }
                this.LLJILJIL = (LinearLayout) viewFindViewById;
            }
            C12ES.LJIILL(0, viewFindViewById);
            View view = this.LLJILJILJ;
            if (view == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.fof);
                }
                this.LLJILJILJ = (TuxTextView) viewFindViewById2;
                view = viewFindViewById2;
            }
            ((TextView) view).setText(str);
        }
    }
}
