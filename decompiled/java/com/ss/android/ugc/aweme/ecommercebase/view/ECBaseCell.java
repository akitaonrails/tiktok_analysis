package com.ss.android.ugc.aweme.ecommercebase.view;

import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;

/* JADX INFO: loaded from: classes27.dex */
public abstract class ECBaseCell<ITEM extends InterfaceC1891350zJl, VH extends ECJediViewHolder<ITEM>> extends PowerCell<ITEM> {
    public VH LL;

    public final VH I5() {
        VH vh = this.LL;
        if (vh != null) {
            return vh;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        I5().onCreate();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        I5().onDestroy();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        super.onPause();
        I5().onPause();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onStart() {
        super.onStart();
        I5().getClass();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onStop() {
        super.onStop();
        I5().onStop();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(ITEM item) {
        super.onBindItemView(item);
        ECJediViewHolder eCJediViewHolderI5 = I5();
        eCJediViewHolderI5.LLJI = getBindingAdapterPosition();
        eCJediViewHolderI5.rr(item);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        I5().onResume();
    }
}
