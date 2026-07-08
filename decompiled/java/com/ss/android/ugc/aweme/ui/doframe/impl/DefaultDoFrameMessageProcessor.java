package com.ss.android.ugc.aweme.ui.doframe.impl;

import X.AbstractC20683088j;
import X.C1221404qC;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDoFrameMessageProcessor extends AbstractC20683088j {

    public static final class DefaultHandler extends BPEAHandler {
        public DefaultHandler() {
            super(Looper.getMainLooper());
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!((Boolean) C1221404qC.LIZJ.getValue()).booleanValue()) {
                    throw th;
                }
            }
        }
    }

    public DefaultDoFrameMessageProcessor() {
        super(new DefaultHandler());
    }
}
