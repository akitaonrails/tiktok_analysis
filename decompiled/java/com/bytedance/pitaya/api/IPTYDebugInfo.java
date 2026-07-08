package com.bytedance.pitaya.api;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface IPTYDebugInfo extends ReflectionCall {
    Map<String, String> getClientInfo();

    String getPackageInfo();

    String getPackageInfoDict();

    String getSettingsContent(String str);
}
