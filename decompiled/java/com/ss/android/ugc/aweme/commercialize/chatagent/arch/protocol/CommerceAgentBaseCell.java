package com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol;

import X.C03H5;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CommerceAgentBaseCell<ASSEM extends ReusedUISlotAssem<? extends C03H5>, ITEM extends InterfaceC1891350zJl> extends AssemPowerCell<ASSEM, ITEM> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context) { // from class: X.0Dcb
            @Override // android.widget.FrameLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, 0);
            }
        };
        frameLayout.addView(super.onCreateItemView(viewGroup));
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(frameLayout);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        return frameLayout;
    }
}
