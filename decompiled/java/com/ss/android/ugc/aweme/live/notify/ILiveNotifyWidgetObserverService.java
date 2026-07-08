package com.ss.android.ugc.aweme.live.notify;

import X.InterfaceC1733670vDR;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public interface ILiveNotifyWidgetObserverService {
    InterfaceC1733670vDR observeNotifyWidgets(DataChannel dataChannel, List<? extends LiveNotifyWidget> list, Function1<? super Boolean, Unit> function1);
}
