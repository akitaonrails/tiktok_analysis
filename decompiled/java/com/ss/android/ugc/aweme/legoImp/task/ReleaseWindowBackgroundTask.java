package com.ss.android.ugc.aweme.legoImp.task;

import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ReleaseWindowBackgroundTask implements C0CCZ {
    public final WeakReference<Activity> LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ReleaseWindowBackgroundTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public ReleaseWindowBackgroundTask(Activity activity) {
        this.LL = new WeakReference<>(activity);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        WeakReference<Activity> weakReference;
        Activity activity;
        Window window;
        View decorView;
        Drawable background = null;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "is_release_window_background", true, true) && (weakReference = this.LL) != null && (activity = weakReference.get()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            background = decorView.getBackground();
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(C786410Ut5.N3(context), "input_method");
            if (inputMethodManager != null) {
                try {
                    Field declaredField = inputMethodManager.getClass().getDeclaredField("mCurRootView");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(inputMethodManager);
                    if (obj != null && (obj instanceof View)) {
                        Field declaredField2 = obj.getClass().getDeclaredField("mResizingBackgroundDrawable");
                        declaredField2.setAccessible(true);
                        declaredField2.set(obj, background);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
