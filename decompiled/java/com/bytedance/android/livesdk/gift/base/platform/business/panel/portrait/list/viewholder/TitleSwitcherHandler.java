package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.list.viewholder;

import X.C1C7U;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final class TitleSwitcherHandler extends BPEAHandler {
    public WeakReference<Function0<Unit>> LL;
    public WeakReference<Function0<Unit>> LLILLJJLI;

    public TitleSwitcherHandler() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Function0<Unit> function0;
        WeakReference<Function0<Unit>> weakReference;
        Function0<Unit> function02;
        C1C7U.LIZ("TitleSwitcherHandler@a38f.handleMessage");
        int i = message.what;
        if (i != 1) {
            if (i == 2 && (weakReference = this.LLILLJJLI) != null && (function02 = weakReference.get()) != null) {
                function02.invoke();
            }
        } else {
            WeakReference<Function0<Unit>> weakReference2 = this.LL;
            if (weakReference2 != null && (function0 = weakReference2.get()) != null) {
                function0.invoke();
            }
            sendEmptyMessageDelayed(2, 3000L);
        }
        C1C7U.LIZIZ("TitleSwitcherHandler@a38f.handleMessage");
    }
}
