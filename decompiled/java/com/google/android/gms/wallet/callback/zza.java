package com.google.android.gms.wallet.callback;

import X.AbstractServiceC812790VuX;
import X.C0W0J;
import X.C0W3J;
import X.C1C7U;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.internal.wallet.zzh;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.CallbackOutput;

/* JADX INFO: loaded from: classes14.dex */
public final class zza extends zzh {
    public final /* synthetic */ AbstractServiceC812790VuX LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("zza@47ec.handleMessage");
        if (message.replyTo == null) {
            C1C7U.LIZIZ("zza@47ec.handleMessage");
            return;
        }
        byte[] byteArray = message.getData().getByteArray("extra_callback_input");
        C0W3J.LJIIIIZZ(byteArray);
        final CallbackInput callbackInput = (CallbackInput) C0W0J.LIZ(byteArray, CallbackInput.CREATOR);
        final String string = message.getData().getString("message_task_tag");
        C0W3J.LJIIIIZZ(string);
        final AbstractServiceC812790VuX abstractServiceC812790VuX = this.LL;
        final Messenger messenger = message.replyTo;
        final int i = message.arg1;
        this.LL.LLILLJJLI.execute(new Runnable(callbackInput, messenger, string, i) { // from class: X.0VuZ
            public final CallbackInput LL;
            public final C812820Vua LLILLJJLI;

            {
                this.LL = callbackInput;
                this.LLILLJJLI = new C812820Vua(messenger, i);
            }

            public final void LIZ() {
                Log.isLoggable("BaseCallbackTaskService", 4);
                try {
                    this.LLILLL.LIZ(this.LL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C812820Vua c812820Vua = this.LLILLJJLI;
                    C812830Vub c812830VubLJLZ = CallbackOutput.LJLZ();
                    int i2 = this.LL.zza;
                    CallbackOutput callbackOutput = c812830VubLJLZ.LIZ;
                    callbackOutput.LL = i2;
                    callbackOutput.LLILLJJLI = 5;
                    String message2 = th.getMessage();
                    CallbackOutput callbackOutput2 = c812830VubLJLZ.LIZ;
                    callbackOutput2.LLILZ = message2;
                    synchronized (c812820Vua) {
                        if (c812820Vua.LIZ != null) {
                            try {
                                C0W3J.LIZ("Callback Response Status must be set - status value must be non-zero.", callbackOutput2.LLILLJJLI != 0);
                                Message messageObtain = Message.obtain();
                                messageObtain.what = 1;
                                messageObtain.arg1 = c812820Vua.LIZIZ;
                                Bundle bundle = new Bundle();
                                Parcel parcelObtain = Parcel.obtain();
                                callbackOutput2.writeToParcel(parcelObtain, 0);
                                byte[] bArrMarshall = parcelObtain.marshall();
                                parcelObtain.recycle();
                                C786410Ut5.LJJIJ(bundle, "extra_callback_output", bArrMarshall);
                                messageObtain.setData(bundle);
                                Messenger messenger2 = c812820Vua.LIZ;
                                if (messenger2 != null) {
                                    messenger2.send(messageObtain);
                                }
                                c812820Vua.LIZ = null;
                            } catch (RemoteException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        throw th;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzc@47ea.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzc@47ea.run");
            }
        });
        C1C7U.LIZIZ("zza@47ec.handleMessage");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(AbstractServiceC812790VuX abstractServiceC812790VuX, Looper looper) {
        super(looper);
        this.LL = abstractServiceC812790VuX;
    }
}
