package com.bytedance.android.livesdk.programmedlive.ui;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C0DXR;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C475940IlU;
import X.C776250Uch;
import X.C786410Ut5;
import Y.ARunnableS107S0100000_7;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.message.LiveChainMessage;
import com.bytedance.android.livesdkapi.depend.model.live.CoStreamer;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class CastersWidget extends LiveRecyclableWidget implements OnIMMessageListener {
    public Room LL;
    public C475940IlU LLILLL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 83));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(86));
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public final List<CoStreamer> LLILZLL = new ArrayList();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxw;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "casters_widget_listener";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.removeMessageListener((OnIMMessageListener) this);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        RecyclerView recyclerView = (RecyclerView) this.LLILLJJLI.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new C0DXR() { // from class: X.0Ila
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    if (recyclerView2.getChildAdapterPosition(view) == 0) {
                        if (C497740JfY.LJJ()) {
                            rect.right = C439101nJ.LIZ(4);
                        } else {
                            rect.left = C439101nJ.LIZ(4);
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0IlU] */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r6) {
        /*
            r5 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 != 0) goto Ld
            return
        Ld:
            r5.LL = r0
            r5.hide()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LL
            r2 = 0
            if (r0 == 0) goto Lc5
            X.0Ilc r1 = X.C476010Ilb.LIZ(r0)
        L1b:
            X.0Ilc r0 = X.EnumC476020Ilc.MULTITAB
            r4 = 0
            if (r1 == r0) goto Lb3
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LL
            if (r0 == 0) goto L28
            X.0Ilc r2 = X.C476010Ilb.LIZ(r0)
        L28:
            X.0Ilc r0 = X.EnumC476020Ilc.BOTH_MULTITAB_AND_CASTERS
            if (r2 == r0) goto Lb3
            r2 = 0
            android.view.View r1 = r5.getView()
            if (r1 == 0) goto L3c
            r0 = 80
            int r0 = X.C439101nJ.LIZ(r0)
            X.C500260Jjc.LJJZ(r0, r1)
        L3c:
            X.0IlU r3 = new X.0IlU
            if (r2 == 0) goto L46
            r0 = 8
            int r4 = X.C439101nJ.LIZ(r0)
        L46:
            r0 = 41
            kotlin.jvm.internal.AFwS237S0000000_7 r2 = kotlin.jvm.internal.AFwS237S0000000_7.get$arr$(r0)
            kotlin.jvm.internal.AwS586S0100000_7 r1 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 176(0xb0, float:2.47E-43)
            r1.<init>(r5, r0)
            r3.<init>(r4, r2, r1)
            r5.LLILLL = r3
            X.01GW r0 = r5.LLILLJJLI
            java.lang.Object r1 = r0.getValue()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L67
            X.0IlU r0 = r5.LLILLL
            r1.setAdapter(r0)
        L67:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.CoStreamer> r0 = r5.LLILZLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.CoStreamer> r1 = r5.LLILZLL
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LL
            if (r0 == 0) goto Lb0
            com.bytedance.android.livesdkapi.depend.model.live.LiveChain r0 = r0.liveChainInfo
            if (r0 == 0) goto Lb0
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.CoStreamer> r0 = r0.coStreamers
            if (r0 == 0) goto Lb0
        L7c:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.addAll(r0)
            X.0IlU r1 = r5.LLILLL
            if (r1 == 0) goto L8a
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.CoStreamer> r0 = r5.LLILZLL
            r1.LLLI(r0)
        L8a:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r5.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.CastersWidgetVisibleChannel> r2 = com.bytedance.android.livesdk.dataChannel.CastersWidgetVisibleChannel.class
            kotlin.jvm.internal.AwS586S0100000_7 r1 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 177(0xb1, float:2.48E-43)
            r1.<init>(r5, r0)
            r3.EQ2(r5, r2, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            if (r1 == 0) goto Laf
            java.lang.Class<X.0Uch> r0 = X.C776250Uch.class
            java.lang.Object r1 = r1.gg0(r0)
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r1 = (com.ss.ugc.live.sdk.message.interfaces.IMessageManager) r1
            if (r1 == 0) goto Laf
            X.001A r0 = X.C001A.LIVE_CHAIN_MESSAGE
            int r0 = r0.getIntType()
            r1.addMessageListener(r0, r5)
        Laf:
            return
        Lb0:
            X.13BV r0 = X.C13BV.INSTANCE
            goto L7c
        Lb3:
            r2 = 1
            android.view.View r1 = r5.getView()
            if (r1 == 0) goto L3c
            r0 = 88
            int r0 = X.C439101nJ.LIZ(r0)
            X.C500260Jjc.LJJZ(r0, r1)
            goto L3c
        Lc5:
            r1 = r2
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.programmedlive.ui.CastersWidget.onLoad(java.lang.Object[]):void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage != null && (iMessage instanceof LiveChainMessage)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("received LiveChainMessage, maxRandom = ");
            LiveChainMessage liveChainMessage = (LiveChainMessage) iMessage;
            sbLIZ.append(liveChainMessage.maxRandom);
            sbLIZ.append("ms");
            C20441214yg.LJIIIZ("CastersWidget", C2188811AlT.LIZIZ(sbLIZ));
            BPEAHandler bPEAHandler = this.LLILZIL;
            ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 99);
            long j = liveChainMessage.maxRandom;
            long jNextLong = 0;
            if (j > 0) {
                jNextLong = AbstractC19994813Le.Default.nextLong(j);
            }
            C786410Ut5.LJLIIL(jNextLong, bPEAHandler, aRunnableS107S0100000_7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.programmedlive.ui.CastersWidget.x1(X.05Vn):java.lang.Object");
    }
}
