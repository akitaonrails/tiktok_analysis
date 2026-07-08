package okp;

import X.AbstractC2238408pq;
import X.C2151808bs;
import X.C2238608ps;
import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public AbstractC2238408pq createDispatcher(List<? extends MainDispatcherFactory> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C2238608ps(C2151808bs.LIZ(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
