package com.ss.android.ugc.aweme.shortvideo.model;

import X.C127A;
import X.C127K;
import X.C444910HcX;
import X.InterfaceC1441305kZ;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes29.dex */
public class CommonSettingItemStatus extends CommonViewStatus {
    public static final int $stable = 8;
    public boolean _isDisabled;
    public final MutableLiveData<Boolean> _checked = new MutableLiveData<>();
    public final MutableLiveData<String> _leftText = new MutableLiveData<>();

    public final MutableLiveData<Boolean> getChecked() {
        return this._checked;
    }

    public final MutableLiveData<String> getLeftText() {
        return this._leftText;
    }

    public final boolean isDisabled() {
        return this._isDisabled;
    }

    public final void setShouldDisabled(boolean z) {
        this._isDisabled = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus
    public void bindView(final View view, LifecycleOwner lifecycleOwner) {
        super.bindView(view, lifecycleOwner);
        if (view instanceof C127K) {
            C127K c127k = (C127K) view;
            if (c127k.getAccessory() instanceof C127A) {
                final C127A c127a = (C127A) c127k.getAccessory();
                this._checked.observe(lifecycleOwner, new InterfaceC1441305kZ() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus.bindView.1
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Boolean bool) {
                        c127a.LJIILJJIL(bool.booleanValue());
                    }
                });
                this._leftText.observe(lifecycleOwner, new InterfaceC1441305kZ() { // from class: com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus.bindView.2
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(String str) {
                        C127K c127k2 = (C127K) view;
                        C444910HcX c444910HcX = new C444910HcX(str);
                        c444910HcX.LIZ(42);
                        c127k2.setTitle(c444910HcX);
                    }
                });
            }
        }
    }
}
