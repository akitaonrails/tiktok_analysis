package com.bytedance.poplayer;

import X.AbstractC20656215sG;
import X.C688120Qyw;
import X.InterfaceC20658015sY;
import android.view.View;
import com.bytedance.poplayer.IStandardPopupTask;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseStandardPopupTask<POPUP> extends AbstractC20656215sG implements IStandardPopupTask<POPUP> {
    public BaseStandardPopupTask() {
        throw null;
    }

    public void LIZIZ() {
    }

    public void onPopupDismiss() {
    }

    public BaseStandardPopupTask(InterfaceC20658015sY interfaceC20658015sY) {
        super(interfaceC20658015sY);
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public View getRealShowView(POPUP popup) {
        return IStandardPopupTask.DefaultImpls.getRealShowView(this, popup);
    }

    public View showRootView(POPUP popup, C688120Qyw c688120Qyw) {
        return IStandardPopupTask.DefaultImpls.showRootView(this, popup, c688120Qyw);
    }
}
