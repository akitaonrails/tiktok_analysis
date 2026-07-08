package com.bytedance.common.jato.gfx;

import X.C786410Ut5;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes14.dex */
public final class TextureViewUtil {
    public static final Class LIZ;
    public static final Field LIZIZ;

    static {
        String str = Build.BRAND;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            if (TextUtils.equals(lowerCase, "oppo") || TextUtils.equals(lowerCase, "oneplus") || TextUtils.equals(lowerCase, "realme")) {
                try {
                    LIZ = Class.forName("android.view.OppoBaseTextureView");
                } catch (ClassNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        try {
            Field declaredField = SurfaceTexture.class.getDeclaredField("mOnFrameAvailableHandler");
            LIZIZ = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static class SurfaceHandler extends BPEAHandler {
        public final Handler LL;
        public final boolean LLILLJJLI;

        public SurfaceHandler(Handler handler, boolean z) {
            super(handler.getLooper());
            this.LL = handler;
            this.LLILLJJLI = z;
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            if (this.LLILLJJLI) {
                message.setAsynchronous(true);
            }
            return C786410Ut5.LJLJJLL(this.LL, message);
        }
    }
}
