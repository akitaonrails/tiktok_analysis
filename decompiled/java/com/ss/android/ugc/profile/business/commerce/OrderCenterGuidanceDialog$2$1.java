package com.ss.android.ugc.profile.business.commerce;

import X.C0IQC;
import X.C0PEM;
import X.C1251190ifF;
import X.C2296808zG;
import X.C23250099c;
import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class OrderCenterGuidanceDialog$2$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ String LL;

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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public OrderCenterGuidanceDialog$2$1(String str) {
        this.LL = str;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) throws JSONException {
        C356901a3.LJ(this, lifecycleOwner);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0IQC(new ReportTradeEntranceRequest(1), null), 3);
        C1251190ifF c1251190ifF = C1251190ifF.LIZ;
        String str = this.LL;
        c1251190ifF.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("page_name", "personal_homepage");
        jSONObject.put("previous_page", str);
        jSONObject.put("actionsheet_name", "order_center_shoptab_diversion_guide");
        jSONObject.put("mall_extra_info", C1251190ifF.LIZIZ);
        C1251190ifF.LJFF("tiktokec_enter_actionsheet", jSONObject);
    }
}
