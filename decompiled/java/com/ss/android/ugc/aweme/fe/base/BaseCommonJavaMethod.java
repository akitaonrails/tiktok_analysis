package com.ss.android.ugc.aweme.fe.base;

import X.C1058910df7;
import X.C1388190mED;
import X.C2198811B3v;
import X.InterfaceC1041760dDS;
import X.InterfaceC1051760dTa;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseCommonJavaMethod implements InterfaceC1051760dTa, GenericLifecycleObserver {
    public WeakReference<C2198811B3v> LL;
    public final IESJsBridge LLILLJJLI;
    public WeakReference<Context> mContextRef;

    public abstract void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS);

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public Context getActContext() {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference == null) {
            return null;
        }
        Activity activityLIZ = C1388190mED.LIZ(weakReference.get());
        return activityLIZ == null ? this.mContextRef.get() : activityLIZ;
    }

    public BaseCommonJavaMethod() {
    }

    public BaseCommonJavaMethod(IESJsBridge iESJsBridge) {
        this.LLILLJJLI = iESJsBridge;
    }

    public BaseCommonJavaMethod attach(C2198811B3v c2198811B3v) {
        if (c2198811B3v != null) {
            this.LL = new WeakReference<>(c2198811B3v);
        }
        return this;
    }

    public BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        this.mContextRef = weakReference;
        return this;
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = c1058910df7.LIZLLL;
            if (jSONObject2 != null) {
                jSONObject2.put("func", c1058910df7.LIZJ);
                jSONObject2.put("permissionGroup", c1058910df7.LJIIJ);
            }
            final String str = c1058910df7.LIZIZ;
            c1058910df7.LJIIJJI = false;
            final String str2 = c1058910df7.LJI;
            handle(jSONObject2, new InterfaceC1041760dDS() { // from class: X.0dfZ
                @Override // X.InterfaceC1041760dDS
                public final void LIZIZ(JSONObject jSONObject3) {
                    if (this.LIZJ.LLILLJJLI != null) {
                        if (!TextUtils.isEmpty(str2)) {
                            this.LIZJ.LLILLJJLI.LIZIZ(str2, str, jSONObject3);
                        } else {
                            this.LIZJ.LLILLJJLI.LIZ(str, jSONObject3);
                        }
                    }
                }

                @Override // X.InterfaceC1041760dDS
                public final void onSuccess(Object obj) {
                    if (this.LIZJ.LLILLJJLI != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("code", 1);
                            jSONObject3.put("data", obj);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            this.LIZJ.LLILLJJLI.LIZIZ(str2, str, jSONObject3);
                        } else {
                            this.LIZJ.LLILLJJLI.LIZ(str, jSONObject3);
                        }
                    }
                }

                @Override // X.InterfaceC1041760dDS
                public final void LIZ(int i, String str3) {
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("code", i);
                        jSONObject3.put("msg", str3);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.LIZJ.LLILLJJLI.LIZIZ(str2, str, jSONObject3);
                    } else {
                        this.LIZJ.LLILLJJLI.LIZ(str, jSONObject3);
                    }
                }

                @Override // X.InterfaceC1041760dDS
                public final void LIZJ(int i, Object obj, String str3) {
                    if (this.LIZJ.LLILLJJLI != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("code", i);
                            jSONObject3.put("msg", str3);
                            jSONObject3.put("data", obj);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            this.LIZJ.LLILLJJLI.LIZIZ(str2, str, jSONObject3);
                        } else {
                            this.LIZJ.LLILLJJLI.LIZ(str, jSONObject3);
                        }
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void sendEvent(String str, JSONObject jSONObject, int i) {
        IESJsBridge iESJsBridge;
        if ((i == 1 || i == 3) && (iESJsBridge = this.LLILLJJLI) != null) {
            iESJsBridge.LJ(str, jSONObject);
        }
    }
}
