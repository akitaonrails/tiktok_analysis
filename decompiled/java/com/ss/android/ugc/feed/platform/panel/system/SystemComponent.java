package com.ss.android.ugc.feed.platform.panel.system;

import X.C01GW;
import X.C1558520qew;
import X.C2176031AEf;
import X.C2176041AEg;
import X.C2176051AEh;
import X.C2176061AEi;
import X.C2189821An6;
import X.C452501pT;
import X.C786410Ut5;
import X.C799570VYd;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ARunnableS9S1100000_3;
import android.app.KeyguardManager;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.tablet.ITabletKeyboardEventSupport;

/* JADX INFO: loaded from: classes34.dex */
public final class SystemComponent extends BasePanelComponent implements SystemComponentAbility, WeakHandler.IHandler, InterfaceC1554640qYg {
    public WeakHandler handler;
    public static final C2176061AEi Companion = new Object() { // from class: X.1AEi
    };
    public static final int $stable = 8;
    public final C01GW displayListeners$delegate = C452501pT.LIZIZ(new C2176051AEh());
    public final C01GW keyguardManager$delegate = C452501pT.LIZIZ(new C2176041AEg());
    public final C01GW displayManager$delegate = C452501pT.LIZIZ(new C2176031AEf());

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // X.InterfaceC1554640qYg
    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 438363465) {
            return null;
        }
        return this;
    }

    private final ConcurrentHashSet<Integer> getDisplayListeners() {
        return (ConcurrentHashSet) this.displayListeners$delegate.getValue();
    }

    private final DisplayManager getDisplayManager() {
        return (DisplayManager) this.displayManager$delegate.getValue();
    }

    private final KeyguardManager getKeyguardManager() {
        return (KeyguardManager) this.keyguardManager$delegate.getValue();
    }

    public boolean isKeyguardLocked() {
        KeyguardManager keyguardManager = getKeyguardManager();
        if (keyguardManager != null) {
            return keyguardManager.isKeyguardLocked();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        this.handler = new WeakHandler(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        WeakHandler weakHandler = this.handler;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onPause() {
        String eventType;
        super.onPause();
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
            eventType = "";
        }
        C786410Ut5.LJLIIL(500L, C799570VYd.LIZJ(), new ARunnableS9S1100000_3(this, eventType, 8));
    }

    public static final SystemComponentAbility getSystemComponent(InterfaceC665370Q7z interfaceC665370Q7z) {
        Companion.getClass();
        return (SystemComponentAbility) C1558520qew.LIZ(interfaceC665370Q7z, SystemComponentAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility
    public boolean onDispatchKeyEvent(KeyEvent keyEvent) {
        ITabletKeyboardEventSupport iTabletKeyboardEventSupport = (ITabletKeyboardEventSupport) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITabletKeyboardEventSupport.class, null);
        if (iTabletKeyboardEventSupport == null || !iTabletKeyboardEventSupport.J3(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean registerDisplayListener(DisplayManager.DisplayListener displayListener) {
        return registerDisplayListener(displayListener, this.handler);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility
    public void unregisterDisplayListener(DisplayManager.DisplayListener displayListener) {
        if (displayListener != null) {
            DisplayManager displayManager = getDisplayManager();
            if (displayManager != null) {
                displayManager.unregisterDisplayListener(displayListener);
            }
            getDisplayListeners().remove(Integer.valueOf(displayListener.hashCode()));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility
    public boolean registerDisplayListener(DisplayManager.DisplayListener displayListener, Handler handler) {
        boolean z = false;
        if (displayListener != null) {
            try {
                if (!getDisplayListeners().contains(Integer.valueOf(displayListener.hashCode()))) {
                    DisplayManager displayManager = getDisplayManager();
                    if (displayManager != null) {
                        displayManager.registerDisplayListener(displayListener, handler);
                    }
                    getDisplayListeners().add(Integer.valueOf(displayListener.hashCode()));
                    z = true;
                    return true;
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return z;
    }
}
