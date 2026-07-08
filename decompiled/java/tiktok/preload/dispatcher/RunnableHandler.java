package tiktok.preload.dispatcher;

import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class RunnableHandler extends BPEAHandler {
    public final Function0<Unit> LL;
    public boolean LLILLJJLI;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.LL.invoke();
        if (!this.LLILLJJLI) {
            sendEmptyMessageDelayed(0, 10000L);
        }
    }

    public RunnableHandler(Looper looper, AFwS225S0000000_34 aFwS225S0000000_34) {
        super(looper);
        this.LL = aFwS225S0000000_34;
    }
}
