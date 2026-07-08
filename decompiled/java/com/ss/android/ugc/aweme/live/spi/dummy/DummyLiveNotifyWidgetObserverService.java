package com.ss.android.ugc.aweme.live.spi.dummy;

import X.C1733680vDS;
import X.InterfaceC1733670vDR;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.live.notify.ILiveNotifyWidgetObserverService;
import com.ss.android.ugc.aweme.live.notify.LiveNotifyWidget;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public final class DummyLiveNotifyWidgetObserverService implements ILiveNotifyWidgetObserverService {
    @Override // com.ss.android.ugc.aweme.live.notify.ILiveNotifyWidgetObserverService
    public InterfaceC1733670vDR observeNotifyWidgets(DataChannel dataChannel, List<? extends LiveNotifyWidget> list, Function1<? super Boolean, Unit> function1) {
        function1.invoke(Boolean.FALSE);
        InterfaceC1733670vDR.LIZ.getClass();
        return C1733680vDS.LIZIZ;
    }
}
