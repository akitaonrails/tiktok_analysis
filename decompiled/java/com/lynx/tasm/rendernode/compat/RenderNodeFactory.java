package com.lynx.tasm.rendernode.compat;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class RenderNodeFactory {
    public static volatile RenderNodeFactory mInstance;

    public static RenderNodeFactory getInstance() {
        try {
            if (mInstance == null) {
                synchronized (RenderNodeFactory.class) {
                    try {
                        if (mInstance == null) {
                            mInstance = new RenderNodeFactory();
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        } catch (Exception th) {
        }
        return mInstance;
    }

    public RenderNodeCompat createRenderNodeCompat() {
        RenderNodeCompat renderNodeImpl = Build.VERSION.SDK_INT >= 29 ? new RenderNodeImpl() : new RenderNodeV23Impl();
        renderNodeImpl.init();
        return renderNodeImpl;
    }
}
