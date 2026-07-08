package com.ss.android.ugc.aweme.sec.captcha;

import X.AnonymousClass1490;
import X.AnonymousClass1499;
import X.C01GW;
import X.C145S;
import X.C1498550p6D;
import X.C149A;
import X.C149B;
import X.C202171148r;
import X.C202178148y;
import X.C202179148z;
import X.C20221514Aj;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C452501pT;
import X.InterfaceC202160148g;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bdturing.VerifyTaskHandler;
import com.bytedance.bdturing.ttnet.TTNetUtil;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS574S0100000_30;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class SecCaptcha implements InterfaceC202160148g, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJI = 0;
    public final Context LL;
    public final AnonymousClass1499 LLILLJJLI;
    public final C149B LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 89));
    public final C202178148y LLILZIL;
    public WeakReference<Activity> LLILZLL;
    public C149A LLIZ;
    public String LLIZLLLIL;
    public String LLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    public final AnonymousClass1490 LIZ() {
        return (AnonymousClass1490) this.LLILZ.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        WeakReference<Activity> weakReference = this.LLILZLL;
        ComponentCallbacks2 componentCallbacks2 = weakReference != null ? (Activity) weakReference.get() : null;
        if (componentCallbacks2 instanceof LifecycleOwner) {
            ((LifecycleOwner) componentCallbacks2).getLifecycle().removeObserver(this);
        }
        this.LLIZ = null;
        C202178148y c202178148y = this.LLILZIL;
        if (c202178148y == null || !c202178148y.LIZIZ) {
            return;
        }
        c202178148y.LIZJ.dismissVerifyDialog();
    }

    @Override // X.InterfaceC202160148g
    public final void onFail(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popCaptcha-onFail, code=");
        sbLIZ.append(i);
        C2344809Gs.LIZLLL(4, "Sec", C2188811AlT.LIZIZ(sbLIZ));
        C149A c149a = this.LLIZ;
        if (c149a != null) {
            c149a.LIZIZ(i, false);
        }
        C149A c149a2 = this.LLIZ;
        if (c149a2 != null) {
            c149a2.LIZ();
        }
    }

    public final void LIZIZ(String str, String str2) {
        AnonymousClass1499 anonymousClass1499 = this.LLILLJJLI;
        anonymousClass1499.LJ = str;
        anonymousClass1499.LIZLLL = str2;
        LIZ().LJI = this.LLILLJJLI.LIZLLL;
        LIZ().LJIIIIZZ = this.LLILLJJLI.LJ;
    }

    @Override // X.InterfaceC202160148g
    public final void onSuccess(int i, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popCaptcha-onSuccess, code=");
        sbLIZ.append(i);
        C2344809Gs.LIZLLL(4, "Sec", C2188811AlT.LIZIZ(sbLIZ));
        C149A c149a = this.LLIZ;
        if (c149a != null) {
            c149a.LIZIZ(i, true);
        }
    }

    public SecCaptcha(Context context, AnonymousClass1499 anonymousClass1499, C149B c149b) {
        this.LL = context;
        this.LLILLJJLI = anonymousClass1499;
        this.LLILLL = c149b;
        C202178148y c202178148y = C1498550p6D.LIZ;
        final AnonymousClass1490 anonymousClass1490LIZ = LIZ();
        synchronized (c202178148y) {
            if (!c202178148y.LIZIZ) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c202178148y.LIZ = anonymousClass1490LIZ;
                C202178148y.LIZIZ(anonymousClass1490LIZ);
                VerifyTaskHandler verifyTaskHandler = C145S.LIZ;
                verifyTaskHandler.LIZ();
                Runnable runnable = new Runnable() { // from class: X.148T
                    public final void LIZ() {
                        Context context2 = anonymousClass1490LIZ.LJIIJJI;
                        C148U c148u = C148U.LIZ;
                        C148X c148x = new C148X() { // from class: X.148S
                        };
                        synchronized (c148u) {
                            try {
                                if (!C148U.LJIIIIZZ) {
                                    C148U.LJ = c148x;
                                    C148X c148x2 = C148U.LJ;
                                    if (c148x2 == null) {
                                        c148x2 = null;
                                    }
                                    ((C148S) c148x2).getClass();
                                    C148U.LIZLLL = new BPEAHandler(C786410Ut5.W2(C145S.LIZ.LIZ));
                                    C20188813z4 c20188813z4 = C20188813z4.LIZ;
                                    c20188813z4.LIZJ(context2);
                                    String strLIZIZ = c20188813z4.LIZIZ();
                                    if (strLIZIZ != null) {
                                        C148U.LJI(strLIZIZ);
                                    }
                                    C148X c148x3 = C148U.LJ;
                                    ((C148S) (c148x3 != null ? c148x3 : null)).getClass();
                                    C202154148a.LIZ(C1498550p6D.LIZ.LIZ.LIZIZ);
                                    if (C148U.LIZLLL("common").optInt("skip_launch", 0) == 1) {
                                        C148U.LJFF(C148U.LJ(true));
                                    } else {
                                        C148U.LJFF(0L);
                                    }
                                    C148U.LJIIIIZZ = true;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        C148U.LIZIZ();
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("BdTuring@261f.init$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("BdTuring@261f.init$2");
                    }
                };
                VerifyTaskHandler.MessageHandler messageHandler = verifyTaskHandler.LIZIZ;
                if (messageHandler != null) {
                    messageHandler.post(runnable);
                }
                c202178148y.LIZLLL();
                C202171148r.LIZ().LIZ = c202178148y.LIZ.LJIJ;
                c202178148y.LIZIZ = true;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", jCurrentTimeMillis2);
                    jSONObject.put("key", "init");
                    C202179148z.LIZJ("turing_verify_sdk", jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20221514Aj.LIZIZ();
                }
            }
        }
        this.LLILZIL = c202178148y;
        String sessionId = this.LLILLL.getSessionId();
        this.LLIZLLLIL = sessionId == null ? "" : sessionId;
        String userId = this.LLILLL.getUserId();
        this.LLJ = userId == null ? "" : userId;
        TTNetUtil.LIZIZ();
    }
}
