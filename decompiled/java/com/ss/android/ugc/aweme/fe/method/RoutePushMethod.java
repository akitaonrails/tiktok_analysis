package com.ss.android.ugc.aweme.fe.method;

import X.C13LZ;
import X.C2198811B3v;
import X.C538540LAe;
import X.InterfaceC1041760dDS;
import X.InterfaceC342470Dbh;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ranges.IntRange;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class RoutePushMethod extends BaseCommonJavaMethod {
    public static final IntRange LLILZIL = C13LZ.LJIILJJIL(50000, C538540LAe.LLJJJIL);
    public final Map<Integer, InterfaceC1041760dDS> LLILLL;
    public int LLILZ;

    public RoutePushMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RoutePushMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = new LinkedHashMap();
        this.LLILZ = LLILZIL.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0dGZ] */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString;
        WeakReference<C2198811B3v> weakReference;
        C2198811B3v c2198811B3v;
        final AbsActivityContainer absActivityContainer;
        if (jSONObject != null && (strOptString = jSONObject.optString("schema")) != null && (!TextUtils.isEmpty(strOptString)) && (weakReference = this.LL) != null && (c2198811B3v = weakReference.get()) != null && (absActivityContainer = (AbsActivityContainer) c2198811B3v.LIZ(AbsActivityContainer.class)) != 0) {
            absActivityContainer.LJIIZILJ(new InterfaceC342470Dbh() { // from class: X.0dGZ
                @Override // X.InterfaceC342470Dbh
                public final boolean onActivityResult(int i, int i2, Intent intent) throws JSONException {
                    String string;
                    if (i2 == 50000) {
                        InterfaceC1041760dDS interfaceC1041760dDSRemove = this.LL.LLILLL.remove(Integer.valueOf(i));
                        if (interfaceC1041760dDSRemove != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            if (intent != null) {
                                try {
                                    Bundle extras = intent.getExtras();
                                    if (extras != null && (string = extras.getString("serialized_data")) != null) {
                                        try {
                                            JSONObject jSONObjectOptJSONObject = new JSONObject(string).optJSONObject("data");
                                            if (jSONObjectOptJSONObject != null) {
                                                C1043700dGa.LIZ(jSONObject2, jSONObjectOptJSONObject);
                                            }
                                        } catch (JSONException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }
                            interfaceC1041760dDSRemove.LIZJ(1, jSONObject2, "push callback succeed");
                        }
                    } else {
                        InterfaceC1041760dDS interfaceC1041760dDSRemove2 = this.LL.LLILLL.remove(Integer.valueOf(i));
                        if (interfaceC1041760dDSRemove2 != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("resultCode = ");
                            sbLIZ.append(i2);
                            interfaceC1041760dDSRemove2.LIZ(-1, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    absActivityContainer.LJIJJ(this);
                    return false;
                }
            });
            if (absActivityContainer.LJIJI(this.LLILZ, strOptString)) {
                if (interfaceC1041760dDS != null) {
                    this.LLILLL.put(Integer.valueOf(this.LLILZ), interfaceC1041760dDS);
                }
                int i = this.LLILZ + 1;
                this.LLILZ = i;
                IntRange intRange = LLILZIL;
                if (i > intRange.LLILLJJLI) {
                    this.LLILZ = intRange.LL;
                    return;
                }
                return;
            }
            if (interfaceC1041760dDS == null) {
                return;
            }
            interfaceC1041760dDS.LIZ(-1, "router not supported");
            return;
        }
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZ(-1, "params not valid");
        }
    }
}
