package com.ss.android.ugc.feed.platform.panel.system;

import X.InterfaceC494301wD;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes25.dex */
public interface SystemComponentAbility extends InterfaceC494301wD {
    boolean onDispatchKeyEvent(KeyEvent keyEvent);

    boolean registerDisplayListener(DisplayManager.DisplayListener displayListener, Handler handler);

    void unregisterDisplayListener(DisplayManager.DisplayListener displayListener);
}
