package com.ss.android.ugc.aweme.utils;

import X.C1C7U;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes14.dex */
public final class ToastHook {
    public static final Field LIZ;
    public static final Field LIZIZ;

    static {
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            LIZ = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
            LIZIZ = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().logException(e);
        }
    }

    public static class ToastHandlerWrapper extends BPEAHandler {
        public final Handler LL;

        public ToastHandlerWrapper(Handler handler) {
            this.LL = handler;
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (WindowManager.BadTokenException e) {
                TryCatchGuardChecker.doCheck(e);
                CrashlyticsWrapperService.LIZLLL().logException(e);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("ToastHook$ToastHandlerWrapper@1614.handleMessage");
            this.LL.handleMessage(message);
            C1C7U.LIZIZ("ToastHook$ToastHandlerWrapper@1614.handleMessage");
        }
    }
}
