package com.ss.android.ugc.aweme.base;

import X.C1154150g8j;
import X.C1189060h32;
import X.C1212310heX;
import X.C13LP;
import X.C15WJ;
import X.C2189191Am5;
import X.C2189211Am7;
import X.C786410Ut5;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.MessageSyncer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS83S1000000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class MessageSyncer implements GenericLifecycleObserver {
    public final List<C1212310heX> LL = new ArrayList();
    public final Queue<C1154150g8j> LLILLJJLI = new LinkedList();
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.1Am4
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            C1154150g8j c1154150g8j;
            String str;
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        Object messageObj = HandlerHook.getMessageObj(message.obj);
                        if ((messageObj instanceof String) && (str = (String) messageObj) != null) {
                            Queue<C1154150g8j> queue = this.LL.LLILLJJLI;
                            AwS83S1000000_33 awS83S1000000_33 = new AwS83S1000000_33(str, 0);
                            if (Build.VERSION.SDK_INT >= 24) {
                                queue.removeIf(new C15WK(awS83S1000000_33));
                            } else {
                                Iterator<C1154150g8j> it2 = queue.iterator();
                                while (it2.hasNext()) {
                                    if (((Boolean) awS83S1000000_33.invoke(it2.next())).booleanValue()) {
                                        it2.remove();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Object messageObj2 = HandlerHook.getMessageObj(message.obj);
                    if ((messageObj2 instanceof C1212310heX) && messageObj2 != null) {
                        MessageSyncer messageSyncer = this.LL;
                        ((ArrayList) messageSyncer.LL).add(messageObj2);
                        messageSyncer.LIZJ(null);
                        return true;
                    }
                }
            } else {
                Object messageObj3 = HandlerHook.getMessageObj(message.obj);
                if ((messageObj3 instanceof C1154150g8j) && (c1154150g8j = (C1154150g8j) messageObj3) != null) {
                    MessageSyncer messageSyncer2 = this.LL;
                    Iterator<C1154150g8j> it3 = messageSyncer2.LLILLJJLI.iterator();
                    while (it3.hasNext()) {
                        C1154150g8j next = it3.next();
                        if (C13LP.LJJJJ(next.LIZ, c1154150g8j.LIZIZ)) {
                            it3.remove();
                        } else if (Intrinsics.LJFF(next.LIZ, c1154150g8j.LIZ)) {
                            it3.remove();
                        }
                    }
                    ((LinkedList) messageSyncer2.LLILLJJLI).offer(c1154150g8j);
                    messageSyncer2.LIZJ(c1154150g8j);
                    return true;
                }
            }
            return true;
        }
    });

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZ(Function1<? super C1154150g8j, Unit> function1) {
        C1154150g8j c1154150g8j = new C1154150g8j();
        function1.invoke(c1154150g8j);
        BPEAHandler bPEAHandler = this.LLILLL;
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = c1154150g8j;
        C786410Ut5.LJLJJL(bPEAHandler, messageObtain);
    }

    public final void LIZIZ(String str) {
        BPEAHandler bPEAHandler = this.LLILLL;
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = str;
        C786410Ut5.LJLJJL(bPEAHandler, messageObtain);
    }

    public final void LIZJ(C1154150g8j c1154150g8j) {
        ArrayList<C2189191Am5> arrayList = new ArrayList();
        for (C1212310heX c1212310heX : (ArrayList) this.LL) {
            if (c1154150g8j != null && c1154150g8j.LIZ != null) {
                if (!C13LP.LJJJJ(c1154150g8j.LIZ, c1212310heX.LIZIZ)) {
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> it2 = c1212310heX.LIZIZ.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(it2.next(), Boolean.FALSE);
            }
            arrayList.add(new C2189191Am5(linkedHashMap, c1212310heX.LIZJ));
        }
        for (C2189191Am5 c2189191Am5 : arrayList) {
            Iterator<T> it3 = this.LLILLJJLI.iterator();
            while (it3.hasNext()) {
                C1189060h32.LJIJI(c2189191Am5.LIZ, ((C1154150g8j) it3.next()).LIZ, Boolean.TRUE);
            }
            Map<String, Boolean> map = c2189191Am5.LIZ;
            if (!map.isEmpty()) {
                Iterator<Map.Entry<String, Boolean>> it4 = map.entrySet().iterator();
                while (it4.hasNext()) {
                    if (!it4.next().getValue().booleanValue()) {
                        break;
                    }
                }
            }
            C2189211Am7 c2189211Am7 = new C2189211Am7();
            c2189191Am5.LIZIZ.invoke(c2189211Am7);
            if (c2189211Am7.LIZ) {
                C15WJ.LIZ(this.LL, new AwS612S0100000_33(c2189191Am5, 43));
            }
        }
    }

    public final void LIZLLL(List<String> list, Function1<? super C2189211Am7, Unit> function1) {
        if (list == null) {
            return;
        }
        BPEAHandler bPEAHandler = this.LLILLL;
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = new C1212310heX(list, function1);
        C786410Ut5.LJLJJL(bPEAHandler, messageObtain);
    }
}
