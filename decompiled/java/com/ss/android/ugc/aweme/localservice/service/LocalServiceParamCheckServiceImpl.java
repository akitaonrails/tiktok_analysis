package com.ss.android.ugc.aweme.localservice.service;

import X.C01GW;
import X.C1186030gy9;
import X.C20316614ea;
import X.InterfaceC829930Wh5;
import com.ss.android.ugc.aweme.localservice.paramcheck.LsParamsCheckConfigSettings;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS115S1000000_31;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS87S1000000_2;

/* JADX INFO: loaded from: classes32.dex */
public final class LocalServiceParamCheckServiceImpl implements ILocalServiceParamCheckService {
    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServiceParamCheckService
    public final void init() {
        C01GW c01gw = LsParamsCheckConfigSettings.LIZIZ;
        Integer num = ((LsParamsCheckConfigSettings.LsParamsCheckConfigModel) c01gw.getValue()).enable;
        if (num == null || num.intValue() != 1) {
            C1186030gy9.LIZ(AFwS221S0000000_31.get$arr$(220));
            return;
        }
        final String str = ((LsParamsCheckConfigSettings.LsParamsCheckConfigModel) c01gw.getValue()).sceneName;
        if (str == null) {
            str = "ttls_params_verify";
        }
        C1186030gy9.LIZ(new AwS87S1000000_2(str, 51));
        if (C20316614ea.LIZ) {
            C1186030gy9.LIZ(AFwS221S0000000_31.get$arr$(549));
        } else {
            C20316614ea.LIZ = true;
            TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.14eX
                @Override // X.InterfaceC829930Wh5
                public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                    C1186030gy9.LIZ(new AwS575S0100000_31(enumC829940Wh6, 1605));
                    if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                        C1186030gy9.LIZ(new AwS115S1000000_31(str, 3));
                        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(str, null, null, new AbstractC830880Wic() { // from class: X.14ej
                            /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
                            /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
                            @Override // X.AbstractC830880Wic
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(X.InterfaceC805220ViK r9, X.InterfaceC830890Wid r10) throws org.json.JSONException {
                                /*
                                    Method dump skipped, instruction units count: 269
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C20317514ej.LIZ(X.0ViK, X.0Wid):void");
                            }

                            @Override // X.AbstractC830880Wic
                            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                                C1186030gy9.LIZ(new AwS428S0200000_27(interfaceC830890Wid, enumC2213771Bkd, 103));
                            }
                        });
                        TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(this);
                    }
                }
            });
        }
    }
}
