package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C624500OeW;
import X.C624510OeX;
import X.C815020Vy8;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class FixFocusedViewLeak implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FixFocusedViewLeak";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Application application = (Application) context;
        if (Build.VERSION.SDK_INT <= 25) {
            final ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(C624510OeX.LIZ));
            if (C815020Vy8.LIZ()) {
                arrayList.add("mLastSrvView");
            }
            application.registerActivityLifecycleCallbacks(new C624500OeW() { // from class: X.0OeV
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    List list = arrayList;
                    if (activity != null && list != null) {
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(C786410Ut5.N3(activity), "input_method");
                            if (inputMethodManager != null) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        Field declaredField = inputMethodManager.getClass().getDeclaredField((String) it2.next());
                                        if (declaredField != null) {
                                            if (!declaredField.isAccessible()) {
                                                declaredField.setAccessible(true);
                                            }
                                            Object obj = declaredField.get(inputMethodManager);
                                            if (obj != null && (obj instanceof View) && ((View) obj).getContext() == activity) {
                                                declaredField.set(inputMethodManager, null);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                }
            });
        }
    }
}
