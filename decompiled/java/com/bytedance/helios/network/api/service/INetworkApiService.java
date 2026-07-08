package com.bytedance.helios.network.api.service;

import X.C840660WyO;
import X.C840760WyY;
import com.google.gson.k;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface INetworkApiService {
    void addCookies(C840660WyO c840660WyO, Map<String, String> map);

    void addHeaders(C840660WyO c840660WyO, Map<String, String> map);

    Object addInterceptor(Object obj, String str);

    void addQueries(C840660WyO c840660WyO, Map<String, String> map);

    void copyResponseBody(C840660WyO c840660WyO);

    void dropRequest(C840660WyO c840660WyO, int i, String str);

    String getContentSubType(C840660WyO c840660WyO);

    String getContentType(C840660WyO c840660WyO);

    Map<String, String> getCookies(C840660WyO c840660WyO);

    String getDomain(C840660WyO c840660WyO);

    Map<String, List<String>> getHeaders(C840660WyO c840660WyO);

    String getMethod(C840660WyO c840660WyO);

    String getPath(C840660WyO c840660WyO);

    Map<String, List<String>> getQueries(C840660WyO c840660WyO);

    String getRequestBody(C840660WyO c840660WyO);

    String getRequestBodyBase64(C840660WyO c840660WyO);

    k getRequestBodyStruct(C840660WyO c840660WyO);

    String getResContentSubType(C840660WyO c840660WyO);

    String getResContentType(C840660WyO c840660WyO);

    String getResponseBody(C840660WyO c840660WyO);

    Integer getResponseCode(C840660WyO c840660WyO);

    Map<String, String> getResponseCookies(C840660WyO c840660WyO);

    Map<String, List<String>> getResponseHeaders(C840660WyO c840660WyO);

    String getScheme(C840660WyO c840660WyO);

    String getUrl(C840660WyO c840660WyO);

    void initNetworkStackEvent(C840760WyY c840760WyY);

    boolean removeCookies(C840660WyO c840660WyO, List<String> list, boolean z);

    boolean removeHeaders(C840660WyO c840660WyO, List<String> list, boolean z);

    boolean removeQueries(C840660WyO c840660WyO, List<String> list, boolean z);

    boolean replaceCookies(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z);

    void replaceDomain(C840660WyO c840660WyO, Map<String, ReplaceConfig> map);

    boolean replaceHeaders(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z);

    void replacePath(C840660WyO c840660WyO, Map<String, ReplaceConfig> map);

    boolean replaceQueries(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z);

    void replaceScheme(C840660WyO c840660WyO, Map<String, ReplaceConfig> map);
}
