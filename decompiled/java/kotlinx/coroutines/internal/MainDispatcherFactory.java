package kotlinx.coroutines.internal;

import X.AbstractC2238408pq;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface MainDispatcherFactory {
    AbstractC2238408pq createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
