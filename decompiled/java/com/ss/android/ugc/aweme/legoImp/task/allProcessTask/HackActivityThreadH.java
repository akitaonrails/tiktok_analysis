package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C08AF;
import X.C08AG;
import X.C0CCZ;
import X.C0VZ0;
import X.C2344809Gs;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS14S0101000_3;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.ArrayMap;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class HackActivityThreadH implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "HackActivityThreadH";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            Reflect reflectCall = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            Class<?> cls = Class.forName("android.app.ActivityThread$H");
            if (reflectCall != null) {
                synchronized (cls) {
                    try {
                        Handler handler = (Handler) reflectCall.field("mH", cls).get();
                        if (handler != null) {
                            Reflect reflectOn = Reflect.on(handler);
                            C08AF c08af = new C08AF(handler, (Handler.Callback) reflectOn.field("mCallback", Handler.Callback.class).get());
                            if (C08AG.LIZ) {
                                ((ArrayList) c08af.LLILLJJLI).add(new Handler.Callback() { // from class: X.083W
                                    @Override // android.os.Handler.Callback
                                    public final boolean handleMessage(Message message) {
                                        PrintStream printStream = System.err;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("handleMessage=");
                                        sbLIZ.append(message);
                                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                                        return false;
                                    }
                                });
                            }
                            ((ArrayList) c08af.LLILLJJLI).add(new Handler.Callback() { // from class: X.08AD
                                public Reflect LL;
                                public Field LLILLJJLI;

                                public final IBinder LIZ(Message message) {
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        try {
                                            if (this.LLILLJJLI == null) {
                                                this.LLILLJJLI = Class.forName("com.android.internal.os.SomeArgs").getDeclaredField("arg1");
                                            }
                                            return (IBinder) this.LLILLJJLI.get(HandlerHook.getMessageObj(message.obj));
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            return null;
                                        }
                                    }
                                    if (HandlerHook.getMessageObj(message.obj) instanceof IBinder) {
                                        return (IBinder) HandlerHook.getMessageObj(message.obj);
                                    }
                                    return null;
                                }

                                public final boolean LIZIZ(IBinder iBinder) {
                                    try {
                                        if (this.LL == null) {
                                            this.LL = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
                                        }
                                        ArrayMap arrayMap = (ArrayMap) this.LL.field("mActivities", new Class[0]).get();
                                        if (arrayMap != null) {
                                            if (!arrayMap.containsKey(iBinder)) {
                                                return true;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                    return false;
                                }

                                public final void LIZJ(int i) {
                                    if (((Number) C08AE.LIZ.getValue()).intValue() > 0) {
                                        C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS14S0101000_3(i, this, 0));
                                    }
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
                                
                                    if (r2 != 160) goto L15;
                                 */
                                @Override // android.os.Handler.Callback
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final boolean handleMessage(android.os.Message r5) {
                                    /*
                                        r4 = this;
                                        r3 = 0
                                        if (r5 != 0) goto L4
                                        return r3
                                    L4:
                                        int r2 = r5.what
                                        r0 = 103(0x67, float:1.44E-43)
                                        r1 = 1
                                        if (r2 == r0) goto L1c
                                        r0 = 104(0x68, float:1.46E-43)
                                        if (r2 == r0) goto L1c
                                        r0 = 126(0x7e, float:1.77E-43)
                                        if (r2 == r0) goto L2c
                                        r0 = 156(0x9c, float:2.19E-43)
                                        if (r2 == r0) goto L27
                                        r0 = 160(0xa0, float:2.24E-43)
                                        if (r2 == r0) goto L2c
                                    L1b:
                                        return r3
                                    L1c:
                                        android.os.IBinder r0 = r4.LIZ(r5)     // Catch: java.lang.Throwable -> L31
                                        boolean r0 = r4.LIZIZ(r0)     // Catch: java.lang.Throwable -> L31
                                        if (r0 == 0) goto L1b
                                        goto L30
                                    L27:
                                        r0 = 2
                                        r4.LIZJ(r0)
                                        return r3
                                    L2c:
                                        r4.LIZJ(r1)
                                        return r3
                                    L30:
                                        return r1
                                    L31:
                                        r0 = move-exception
                                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                        return r3
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C08AD.handleMessage(android.os.Message):boolean");
                                }
                            });
                            reflectOn.set("mCallback", c08af);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C2344809Gs.LJI(th2);
        }
    }
}
