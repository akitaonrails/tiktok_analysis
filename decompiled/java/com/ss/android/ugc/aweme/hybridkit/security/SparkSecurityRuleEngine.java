package com.ss.android.ugc.aweme.hybridkit.security;

import X.C829600WgY;
import X.InterfaceC829930Wh5;
import X.InterfaceC830890Wid;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.DynamicRuleHandler;
import com.ss.android.ugc.aweme.hybridkit.experiment.SparkSecurityStrategyConfig;
import com.ss.android.ugc.aweme.hybridkit.security.SparkSecurityRuleEngine;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityRuleEngine implements DynamicRuleHandler {
    public static final SparkSecurityRuleEngine LIZ = new SparkSecurityRuleEngine();
    public static InterfaceC830890Wid LIZIZ;

    @Override // com.bytedance.hybrid.spark.security.api.protocols.DynamicRuleHandler, com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return true;
    }

    public final void init() {
        SparkSecurityStrategyConfig sparkSecurityStrategyConfig;
        SparkSecurityServiceCenter sparkSecurityServiceCenter = SparkSecurityServiceCenter.INSTANCE;
        if (sparkSecurityServiceCenter.getEnable() && (sparkSecurityStrategyConfig = (SparkSecurityStrategyConfig) C829600WgY.LIZ.getValue()) != null && sparkSecurityStrategyConfig.enabled) {
            TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.0Wgc
                @Override // X.InterfaceC829930Wh5
                public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                    if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("spark_security_layer", null, null, new AbstractC830880Wic() { // from class: X.0Wgb
                            @Override // X.AbstractC830880Wic
                            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                                if (interfaceC830890Wid != null && enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                                    SparkSecurityRuleEngine.LIZIZ = interfaceC830890Wid;
                                }
                            }
                        });
                        TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(this);
                    }
                }
            });
            sparkSecurityServiceCenter.setDynamicHandler(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x011c  */
    @Override // com.bytedance.hybrid.spark.security.api.protocols.DynamicRuleHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C828480Wek handle(java.lang.String r12, final X.C828420Wee r13) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.security.SparkSecurityRuleEngine.handle(java.lang.String, X.0Wee):X.0Wek");
    }
}
