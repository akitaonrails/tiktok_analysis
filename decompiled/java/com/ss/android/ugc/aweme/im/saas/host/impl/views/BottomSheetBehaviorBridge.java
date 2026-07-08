package com.ss.android.ugc.aweme.im.saas.host.impl.views;

import X.AbstractC1177930gl5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IBottomSheetBehaviorBridge;

/* JADX INFO: loaded from: classes3.dex */
public final class BottomSheetBehaviorBridge implements IBottomSheetBehaviorBridge {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.views.IBottomSheetBehaviorBridge
    public final void LIZ(BottomSheetBehavior<?> bottomSheetBehavior, AbstractC1177930gl5 abstractC1177930gl5) {
        bottomSheetBehavior.addBottomSheetCallback(abstractC1177930gl5);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.views.IBottomSheetBehaviorBridge
    public final void LIZIZ(BottomSheetBehavior bottomSheetBehavior, int i) {
        bottomSheetBehavior.setPeekHeight(i, true);
    }
}
