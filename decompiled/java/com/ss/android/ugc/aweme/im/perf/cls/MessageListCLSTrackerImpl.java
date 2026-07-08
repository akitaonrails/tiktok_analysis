package com.ss.android.ugc.aweme.im.perf.cls;

import X.C06SA;
import X.C06SB;
import X.C06Z6;
import X.C07U1;
import X.C1509705vb;
import X.C1761406v6;
import X.C1761506v7;
import X.C786410Ut5;
import X.C869590Y9l;
import X.InterfaceC1364105Vn;
import X.InterfaceC904740ZeS;
import X.ViewOnAttachStateChangeListenerC913860ZtA;
import X.ViewTreeObserverOnGlobalLayoutListenerC913970ZtL;
import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageListCLSTrackerImpl implements MessageListCLSTracker {
    public RecyclerView LLILZIL;
    public Map<String, String> LLILZLL;
    public final List<Map<Integer, Pair<Float, Integer>>> LL = new ArrayList();
    public final List<Integer> LLILLJJLI = new ArrayList();
    public long LLILLL = -1;
    public long LLILZ = -1;
    public final Rect LLIZ = new Rect();
    public final ViewTreeObserverOnGlobalLayoutListenerC913970ZtL LLIZLLLIL = new ViewTreeObserverOnGlobalLayoutListenerC913970ZtL(this, 0);
    public final ViewOnAttachStateChangeListenerC913860ZtA LLJ = new ViewOnAttachStateChangeListenerC913860ZtA(this, 3);
    public final C06Z6 LLJI = C06Z6.MAIN;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker
    public final void QT(Map<String, String> map) {
        this.LLILZLL = map;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        if (this.LLILZ != -1) {
            return;
        }
        if (!(interfaceC904740ZeS instanceof C07U1) && !(interfaceC904740ZeS instanceof C06SB) && !(interfaceC904740ZeS instanceof C1761506v7) && !(interfaceC904740ZeS instanceof C06SA)) {
            if (interfaceC904740ZeS instanceof C1761406v6) {
                if (!FakeMessageKt.isFakeMessage(((C1761406v6) interfaceC904740ZeS).LIZ)) {
                    this.LLILZ = System.currentTimeMillis();
                    return;
                }
                return;
            } else {
                if (!(interfaceC904740ZeS instanceof C1509705vb)) {
                    return;
                }
                List<C869590Y9l> list = ((C1509705vb) interfaceC904740ZeS).LIZ;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<C869590Y9l> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (FakeMessageKt.isFakeMessage(it2.next())) {
                            return;
                        }
                    }
                }
                this.LLILZ = System.currentTimeMillis();
                return;
            }
        }
        this.LLILZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker
    public final void tG(RecyclerView recyclerView) {
        this.LLILZIL = recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnAttachStateChangeListener(this.LLJ);
            if (recyclerView.isAttachedToWindow()) {
                C786410Ut5.x3(recyclerView.getViewTreeObserver(), this.LLIZLLLIL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.perf.OnChatRoomTouchListener
    public final void vx(MotionEvent motionEvent) {
        if (this.LLILLL == -1 && motionEvent.getAction() == 0) {
            this.LLILLL = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }
}
