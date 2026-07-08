package com.ss.android.ugc.aweme.property;

import X.C19EG;
import android.database.ContentObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.tools.ToolsBaseLightSensorUtils;

/* JADX INFO: loaded from: classes31.dex */
public final class LifecycleContentObserver extends ContentObserver implements GenericLifecycleObserver {
    public final C19EG LL;
    public final LifecycleOwner LLILLJJLI;
    public boolean LLILLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        ToolsBaseLightSensorUtils.INSTANCE.unregisterSensorListener();
        this.LLILLJJLI.getLifecycle().removeObserver(this);
        this.LL.getContentResolver().unregisterContentObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZ();
        BrightnessManager.LJI = true;
        BrightnessManager.LIZJ = null;
        BrightnessManager.LIZLLL = null;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        Window window = this.LL.getWindow();
        WindowManager.LayoutParams attributes = this.LL.getWindow().getAttributes();
        attributes.screenBrightness = 2.0f;
        window.setAttributes(attributes);
        LIZ();
        BrightnessManager.LIZJ = null;
        BrightnessManager.LIZLLL = null;
    }

    public LifecycleContentObserver(C19EG c19eg, BPEAHandler bPEAHandler, LifecycleOwner lifecycleOwner) {
        super(bPEAHandler);
        this.LL = c19eg;
        this.LLILLJJLI = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
