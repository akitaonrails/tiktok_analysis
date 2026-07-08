package com.ss.android.ugc.aweme.player.sdk.audio;

import X.C1484570ojf;
import X.C1484580ojg;
import X.C1484600oji;
import X.C1C7U;
import X.C786410Ut5;
import X.InterfaceC1484620ojk;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class SimAudioFocusManager$checkStart$1 extends BPEAHandler {
    public final /* synthetic */ C1484570ojf LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference;
        Object obj;
        boolean z;
        int iQ4;
        C1484600oji c1484600oji;
        C1C7U.LIZ("SimAudioFocusManager@c23a.checkStart$1");
        int i = message.what;
        WeakReference weakReference2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (Intrinsics.LJFF(HandlerHook.getMessageObj(message.obj), this.LL.LJ)) {
                                C1C7U.LIZIZ("SimAudioFocusManager@c23a.checkStart$1");
                                return;
                            }
                            this.LL.LJIIIIZZ.remove(HandlerHook.getMessageObj(message.obj));
                        }
                    } else {
                        if (Intrinsics.LJFF(HandlerHook.getMessageObj(message.obj), this.LL.LJ)) {
                            C1C7U.LIZIZ("SimAudioFocusManager@c23a.checkStart$1");
                            return;
                        }
                        this.LL.LJIIIIZZ.put(HandlerHook.getMessageObj(message.obj), 1);
                        C1484570ojf c1484570ojf = this.LL;
                        Object messageObj = HandlerHook.getMessageObj(message.obj);
                        c1484570ojf.getClass();
                        c1484570ojf.LIZJ = C1484570ojf.LIZLLL(messageObj);
                    }
                } else {
                    this.LL.LIZIZ(((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue());
                }
            } else {
                C1484570ojf c1484570ojf2 = this.LL;
                c1484570ojf2.getClass();
                if (HandlerHook.getMessageObj(message.obj) instanceof C1484600oji) {
                    C1484600oji c1484600oji2 = (C1484600oji) HandlerHook.getMessageObj(message.obj);
                    c1484570ojf2.LIZJ();
                    if (c1484570ojf2.LIZLLL != null) {
                        c1484570ojf2.LJIIJ();
                        if (c1484570ojf2.LJFF.containsKey(c1484600oji2.LIZIZ) || c1484570ojf2.LJI.containsKey(c1484600oji2.LIZIZ) || C1484570ojf.LJFF(c1484570ojf2.LJII, c1484600oji2.LIZIZ)) {
                            c1484570ojf2.LJFF.remove(c1484600oji2.LIZIZ);
                            c1484570ojf2.LJI.remove(c1484600oji2.LIZIZ);
                            C1484570ojf.LJI(c1484570ojf2.LJII, c1484600oji2.LIZIZ);
                            if (c1484570ojf2.LJFF.isEmpty() && c1484570ojf2.LJI.isEmpty() && c1484570ojf2.LJII.isEmpty()) {
                                try {
                                    c1484570ojf2.LIZLLL.abandonAudioFocus(c1484570ojf2.LJ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                                c1484570ojf2.LIZIZ = false;
                                c1484570ojf2.LIZJ = null;
                            }
                        }
                    }
                }
            }
        } else {
            C1484570ojf c1484570ojf3 = this.LL;
            c1484570ojf3.getClass();
            if (HandlerHook.getMessageObj(message.obj) instanceof C1484600oji) {
                C1484600oji c1484600oji3 = (C1484600oji) HandlerHook.getMessageObj(message.obj);
                c1484570ojf3.LIZJ();
                if (c1484570ojf3.LIZLLL != null) {
                    c1484570ojf3.LJIIJ();
                    if (!c1484570ojf3.LJFF.containsKey(c1484600oji3.LIZIZ)) {
                        c1484570ojf3.LJI.putAll(c1484570ojf3.LJFF);
                    }
                    c1484570ojf3.LJFF.clear();
                    WeakHashMap<Object, C1484580ojg> weakHashMap = c1484570ojf3.LJFF;
                    Object obj2 = c1484600oji3.LIZIZ;
                    int i2 = c1484600oji3.LIZ;
                    WeakReference weakReference3 = new WeakReference(c1484600oji3.LIZIZ);
                    InterfaceC1484620ojk interfaceC1484620ojk = c1484600oji3.LIZJ;
                    if (interfaceC1484620ojk != null) {
                        weakReference2 = new WeakReference(interfaceC1484620ojk);
                    }
                    Handler handler = c1484600oji3.LIZLLL;
                    if (handler != null) {
                        weakReference = new WeakReference(handler);
                    } else {
                        weakReference = null;
                    }
                    weakHashMap.put(obj2, new C1484580ojg(i2, weakReference3, weakReference2, weakReference));
                    Object messageObj2 = HandlerHook.getMessageObj(message.obj);
                    if ((messageObj2 instanceof C1484600oji) && (c1484600oji = (C1484600oji) messageObj2) != null) {
                        obj = c1484600oji.LIZIZ;
                    } else {
                        obj = null;
                    }
                    if (!c1484570ojf3.LIZIZ || "bg_audio_play".equals(obj)) {
                        try {
                            iQ4 = C786410Ut5.q4(c1484570ojf3.LIZLLL, c1484570ojf3.LJ, 3, 1);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        if (iQ4 != 1 && iQ4 != 2 && iQ4 != 3 && iQ4 != 4) {
                            z = false;
                        } else {
                            z = true;
                        }
                        c1484570ojf3.LIZIZ = z;
                    }
                    c1484570ojf3.LIZIZ(c1484570ojf3.LIZIZ);
                }
            }
        }
        C1C7U.LIZIZ("SimAudioFocusManager@c23a.checkStart$1");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimAudioFocusManager$checkStart$1(C1484570ojf c1484570ojf, Looper looper) {
        super(looper);
        this.LL = c1484570ojf;
    }
}
