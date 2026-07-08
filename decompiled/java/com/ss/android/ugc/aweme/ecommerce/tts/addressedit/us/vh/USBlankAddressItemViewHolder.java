package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh;

import X.C0H9H;
import X.C1745680vWo;
import X.C786410Ut5;
import X.C992303uL;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class USBlankAddressItemViewHolder extends ECJediViewHolder<C1745680vWo> {
    public View LLJILJIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public USBlankAddressItemViewHolder(ViewGroup viewGroup) {
        super(C992303uL.LIZ(viewGroup.getContext(), R.layout.aid, viewGroup));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int iLIZIZ;
        C1745680vWo c1745680vWo = (C1745680vWo) obj;
        View viewFindViewById = this.LLJILJIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.ago);
            } else {
                viewFindViewById = null;
            }
            this.LLJILJIL = viewFindViewById;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        Integer num = c1745680vWo.LJIIJJI;
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = C0H9H.LIZIZ(48);
        }
        layoutParams.height = iLIZIZ;
        View view = this.LLJILJIL;
        if (view == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.ago);
            }
            this.LLJILJIL = viewFindViewById2;
            view = viewFindViewById2;
        }
        C786410Ut5.W5(view, layoutParams);
    }
}
