package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.C034S;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C1120604Zw;
import X.C123100dR;
import X.C1344705Ob;
import X.C155000ia;
import X.C1AQS;
import X.C1C7U;
import X.C293501Bt;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.ECVideoPitayaUtils$predictVideoSR$1", f = "ECVideoPitayaUtils.kt", l = {}, m = "invokeSuspend")
public final class ECVideoPitayaUtils$predictVideoSR$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECVideoPitayaUtils$predictVideoSR$1(Aweme aweme, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new ECVideoPitayaUtils$predictVideoSR$1(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        C1C7U.LIZ("ECVideoPitayaUtils@b08b.predictVideoSR$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        Aweme aweme = this.LLILLJJLI;
        jSONObject.put("aid", str);
        jSONObject.put("aweme", GsonProtectorUtils.toJson(C293501Bt.LIZ(), aweme));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        PitayaCoreFactory.getCore(String.valueOf(((IApplicationDependencyService) iECommerceHostService).getAppId())).runTask("ec_video_sr", new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, 3600.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ecommerce.anchor.utils.ECVideoPitayaUtils$predictVideoSR$1.1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z2, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                boolean zOptBoolean;
                if (z2) {
                    String strOptString = null;
                    if (pTYTaskData != null && pTYTaskData.getParams() != null) {
                        JSONObject params = pTYTaskData.getParams();
                        if (params != null) {
                            strOptString = params.optString("aid");
                        }
                        JSONObject params2 = pTYTaskData.getParams();
                        if (params2 != null) {
                            zOptBoolean = params2.optBoolean("sr_open");
                        } else {
                            zOptBoolean = true;
                        }
                        if (C123100dR.LIZ(strOptString)) {
                            C1344705Ob.LIZ.put(strOptString, Boolean.valueOf(zOptBoolean));
                        }
                    }
                }
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECVideoPitayaUtils@b08b.predictVideoSR$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
