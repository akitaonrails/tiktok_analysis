package com.bytedance.android.livesdkapi.dualdevice;

import X.C743410TEd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: loaded from: classes13.dex */
public abstract class IDualDeviceVideoWidget extends LiveWidget {
    public abstract void A1();

    public abstract void B1(boolean z);

    public abstract void onDestroyView();

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract LiveDialogFragment x1();

    public abstract void y1(boolean z);

    public abstract void z1(C743410TEd c743410TEd);
}
