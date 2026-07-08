package com.ss.android.ugc.cut_downloader;

import X.BinderC19857812mm;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C19858012mo;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C788530UwV;
import X.InterfaceC19858112mp;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public abstract class AbsDownloadService extends Service {
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public final Map<Integer, List<InterfaceC19858112mp>> LLILLJJLI = new LinkedHashMap();
    public final Map<String, C19858012mo> LLILLL = new LinkedHashMap();

    public abstract void LIZ(String str, String str2, C19858012mo c19858012mo);

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/cut_downloader/AbsDownloadService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFg3af2mb5DP2DeRZiZp6AP4AxpP5M4RlFEM8IFS0Q==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        if (!Intrinsics.LJFF("com.ss.android.ugc.cut_downloader.DOWNLOAD", intent.getAction())) {
            return null;
        }
        return new BinderC19857812mm(this);
    }
}
