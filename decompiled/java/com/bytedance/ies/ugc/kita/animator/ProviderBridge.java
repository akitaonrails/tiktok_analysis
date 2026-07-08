package com.bytedance.ies.ugc.kita.animator;

import X.C2089608Go;
import X.InterfaceC2090008Gs;
import android.animation.AnimationHandler;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class ProviderBridge implements AnimationHandler.AnimationFrameCallbackProvider {
    public boolean first = true;
    public final C2089608Go mGuard;
    public final Method mMethod;
    public final AnimationHandler.AnimationFrameCallbackProvider mOrigin;

    public long getFrameDelay() {
        return this.mOrigin.getFrameDelay();
    }

    public long getFrameTime() {
        return this.mOrigin.getFrameTime();
    }

    private void firstHint(String str) {
        if (!this.first) {
            return;
        }
        this.first = false;
    }

    public void postCommitCallback(Runnable runnable) {
        this.mOrigin.postCommitCallback(runnable);
    }

    public void postFrameCallback(Choreographer.FrameCallback frameCallback) {
        this.mGuard.getClass();
        InterfaceC2090008Gs interfaceC2090008Gs = C2089608Go.LLILZLL;
        if (interfaceC2090008Gs != null && interfaceC2090008Gs.LJIILIIL()) {
            firstHint("intercept");
            C2089608Go c2089608Go = this.mGuard;
            Method method = this.mMethod;
            c2089608Go.getClass();
            try {
                InterfaceC2090008Gs interfaceC2090008Gs2 = C2089608Go.LLILZLL;
                Object obj = C2089608Go.LLILLL;
                if (C2089608Go.LLILLJJLI) {
                    frameCallback = c2089608Go.LL;
                }
                interfaceC2090008Gs2.LIZ(obj, method, frameCallback);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        firstHint("origin");
        AnimationHandler.AnimationFrameCallbackProvider animationFrameCallbackProvider = this.mOrigin;
        if (C2089608Go.LLILLJJLI) {
            frameCallback = this.mGuard.LL;
        }
        animationFrameCallbackProvider.postFrameCallback(frameCallback);
    }

    public void setFrameDelay(long j) {
        this.mOrigin.setFrameDelay(j);
    }

    public ProviderBridge(Object obj, C2089608Go c2089608Go, Method method) {
        this.mGuard = c2089608Go;
        this.mOrigin = (AnimationHandler.AnimationFrameCallbackProvider) obj;
        this.mMethod = method;
    }
}
