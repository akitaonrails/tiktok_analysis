package com.ss.android.ugc.aweme.im.perf.cls;

import X.C06Z6;
import X.InterfaceC1364105Vn;
import X.InterfaceC904740ZeS;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class EmptyMessageListCLSTrackerImpl implements MessageListCLSTracker {
    public static final EmptyMessageListCLSTrackerImpl LL = new EmptyMessageListCLSTrackerImpl();
    public static final C06Z6 LLILLJJLI = C06Z6.WORKER;

    @Override // com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker
    public final void QT(Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker
    public final void tG(RecyclerView recyclerView) {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.perf.OnChatRoomTouchListener
    public final void vx(MotionEvent motionEvent) {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }
}
