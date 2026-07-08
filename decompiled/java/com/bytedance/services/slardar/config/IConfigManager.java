package com.bytedance.services.slardar.config;

import X.InterfaceC792030V5d;
import X.InterfaceC792050V5f;
import com.bytedance.news.common.service.manager.IService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface IConfigManager extends IService {
    void fetchConfig();

    int getConfigInt(String str, int i);

    JSONObject getConfigJSON(String str);

    boolean getLogTypeSwitch(String str);

    boolean getMetricTypeSwitch(String str);

    boolean getServiceSwitch(String str);

    boolean getSwitch(String str);

    boolean isConfigReady();

    String queryConfig();

    void registerConfigListener(InterfaceC792030V5d interfaceC792030V5d);

    void registerResponseConfigListener(InterfaceC792050V5f interfaceC792050V5f);

    JSONObject retrieveSettingsParams();

    void unregisterConfigListener(InterfaceC792030V5d interfaceC792030V5d);

    void unregisterResponseConfigListener(InterfaceC792050V5f interfaceC792050V5f);

    boolean updateWithSpecificAidResult(JSONObject jSONObject);
}
