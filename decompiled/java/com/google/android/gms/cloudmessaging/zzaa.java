package com.google.android.gms.cloudmessaging;

import X.C1C7U;
import X.C786410Ut5;
import X.C812350Vtp;
import X.C830530Wi3;
import X.C835520Wq6;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes14.dex */
public final class zzaa extends zzf {
    public final /* synthetic */ C812350Vtp LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String stringExtra;
        String stringExtra2;
        C1C7U.LIZ("zzaa@269c.handleMessage");
        C812350Vtp c812350Vtp = this.LL;
        if (message != null && (HandlerHook.getMessageObj(message.obj) instanceof Intent)) {
            Intent intent = (Intent) HandlerHook.getMessageObj(message.obj);
            intent.setExtrasClassLoader(new ClassLoader() { // from class: X.0Vtr
                @Override // java.lang.ClassLoader
                public final Class<?> loadClass(String str, boolean z) {
                    if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
                        Log.isLoggable("CloudMessengerCompat", 3);
                        return zzd.class;
                    }
                    return super.loadClass(str, z);
                }
            });
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof zzd) {
                    c812350Vtp.LJI = (zzd) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    c812350Vtp.LJFF = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) HandlerHook.getMessageObj(message.obj);
            String action = intent2.getAction();
            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                if (Log.isLoggable("Rpc", 3)) {
                    String strValueOf = String.valueOf(action);
                    if (strValueOf.length() != 0) {
                        "Unexpected response action: ".concat(strValueOf);
                    }
                }
            } else {
                try {
                    stringExtra = intent2.getStringExtra("registration_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (stringExtra == null) {
                    try {
                        stringExtra = intent2.getStringExtra("unregistered");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        stringExtra = null;
                    }
                }
                if (stringExtra == null) {
                    try {
                        stringExtra2 = intent2.getStringExtra("error");
                    } catch (Exception th) {
                    }
                    if (stringExtra2 != null) {
                        if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                            "Received InstanceID error ".concat(stringExtra2);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] strArrSplit = stringExtra2.split("\\|");
                            if (strArrSplit.length > 2 && "ID".equals(strArrSplit[1])) {
                                String str = strArrSplit[2];
                                String strSubstring = strArrSplit[3];
                                if (strSubstring.startsWith(":")) {
                                    strSubstring = strSubstring.substring(1);
                                }
                                c812350Vtp.LJ(C812350Vtp.LIZ(intent2.putExtra("error", strSubstring)), str);
                            } else if (stringExtra2.length() != 0) {
                                "Unexpected structured response ".concat(stringExtra2);
                            }
                        } else {
                            synchronized (c812350Vtp.LIZ) {
                                int i = 0;
                                while (true) {
                                    try {
                                        C830530Wi3<String, C835520Wq6<Bundle>> c830530Wi3 = c812350Vtp.LIZ;
                                        if (i >= c830530Wi3.LLILLL) {
                                            break;
                                        }
                                        c812350Vtp.LJ(C812350Vtp.LIZ(intent2), c830530Wi3.LJFF(i));
                                        i++;
                                    } finally {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                        }
                    } else {
                        new StringBuilder(String.valueOf(C812350Vtp.LIZ(intent2)).length() + 49);
                    }
                } else {
                    Matcher matcher = C812350Vtp.LJIIJ.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3) && stringExtra.length() != 0) {
                            "Unexpected response string: ".concat(stringExtra);
                        }
                    } else {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        if (strGroup != null) {
                            Bundle bundleLIZ = C812350Vtp.LIZ(intent2);
                            C786410Ut5.LJJJI("registration_id", strGroup2, bundleLIZ);
                            c812350Vtp.LJ(bundleLIZ, strGroup);
                        }
                    }
                }
            }
        }
        C1C7U.LIZIZ("zzaa@269c.handleMessage");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(C812350Vtp c812350Vtp, Looper looper) {
        super(looper);
        this.LL = c812350Vtp;
    }
}
