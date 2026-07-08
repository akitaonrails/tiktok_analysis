package com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent;

import X.C1323820kYO;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C20441214yg;
import X.C2188811AlT;
import X.C262100zr;
import X.C356901a3;
import X.C397901gf;
import X.C500260Jjc;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class FlashDataProvider implements InterfaceC1141530foN, DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final List<String> LLILZ = new ArrayList();
    public String LL;
    public final Function0<JSONObject> LLILLJJLI;
    public JSONObject LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final JSONObject LIZ() {
        JSONObject jSONObjectInvoke = this.LLILLJJLI.invoke();
        if (Intrinsics.LJFF(jSONObjectInvoke, this.LLILLL)) {
            JSONObject jSONObject = this.LLILLL;
            return jSONObject == null ? new JSONObject() : jSONObject;
        }
        this.LLILLL = jSONObjectInvoke;
        return jSONObjectInvoke == null ? new JSONObject() : jSONObjectInvoke;
    }

    @Override // X.InterfaceC1141530foN
    public void mh2(C262100zr c262100zr) {
        String strLJFF;
        if (Intrinsics.LJFF(c262100zr.LIZ, "fetch_flash_component_data")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "flash_component_id", "");
            } else {
                strLJFF = null;
            }
            if (Intrinsics.LJFF(strLJFF, this.LL)) {
                try {
                    LIZIZ(LIZ(), "", 0);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZIZ(new JSONObject(), "data_illegal", 1);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("return data error ");
                    sbLIZ.append(this.LL);
                    C20441214yg.LJFF("FlashDataProvider", C2188811AlT.LIZIZ(sbLIZ), e);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlashDataProvider(String str, Function0<? extends JSONObject> function0) {
        this.LL = str;
        this.LLILLJJLI = function0;
    }

    public final void LIZIZ(JSONObject jSONObject, String str, int i) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("status_code", i);
            jSONObject2.put("flash_component_id", this.LL);
            if (C500260Jjc.LJJIIZ(str)) {
                jSONObject2.put("error_message", str);
            }
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject2), "return_flash_component_data"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pushDataToFE ");
            sbLIZ.append(this.LL);
            C20441214yg.LJFF("FlashDataProvider", C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }
}
