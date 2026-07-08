package com.bytedance.poplayer;

import X.AbstractC20656215sG;
import X.C01GW;
import X.C20659915sr;
import X.C452501pT;
import X.InterfaceC20658015sY;
import android.view.View;
import com.bytedance.poplayer.IPopupTask;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BasePopupTask<Popup> extends AbstractC20656215sG implements IPopupTask<Popup> {
    public final C01GW generic$delegate;

    private final Class<?> getGeneric() {
        return (Class) this.generic$delegate.getValue();
    }

    public BasePopupTask(InterfaceC20658015sY interfaceC20658015sY) {
        super(interfaceC20658015sY);
        this.generic$delegate = C452501pT.LIZIZ(new C20659915sr(this));
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public View getRootView(Popup popup) {
        return IPopupTask.DefaultImpls.getRootView(this, popup);
    }
}
