package com.bytedance.hybrid.spark.security.api.protocols;

import X.C828420Wee;
import X.C828480Wek;

/* JADX INFO: loaded from: classes14.dex */
public interface DynamicRuleHandler extends SparkSecurityService {
    C828480Wek handle(String str, C828420Wee c828420Wee);

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    boolean interceptable();
}
