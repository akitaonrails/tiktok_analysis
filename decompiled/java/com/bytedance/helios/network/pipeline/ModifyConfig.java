package com.bytedance.helios.network.pipeline;

import X.C09CT;
import X.C0WSW;
import X.C0WSX;
import X.C13LP;
import X.C2097608Jq;
import X.C840660WyO;
import com.bytedance.helios.network.api.service.INetworkApiService;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS414S0200000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class ModifyConfig {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("content")
    public OperationConfig content;

    @C09CT("cookie")
    public OperationConfig cookie;

    @C09CT("domain")
    public OperationConfig domain;

    @C09CT("header")
    public OperationConfig header;

    @C09CT("path")
    public OperationConfig path;

    @C09CT("query")
    public OperationConfig query;

    @C09CT("scheme")
    public OperationConfig scheme;

    public ModifyConfig() {
        this(null, null, null, null, null, null, null);
    }

    public final void LIZ(ModifyConfig modifyConfig) {
        if (modifyConfig != null) {
            OperationConfig operationConfig = this.query;
            if (operationConfig == null) {
                this.query = modifyConfig.query;
            } else {
                operationConfig.LIZ(modifyConfig.query);
            }
            OperationConfig operationConfig2 = this.header;
            if (operationConfig2 == null) {
                this.header = modifyConfig.header;
            } else {
                operationConfig2.LIZ(modifyConfig.header);
            }
            OperationConfig operationConfig3 = this.cookie;
            if (operationConfig3 == null) {
                this.cookie = modifyConfig.cookie;
            } else {
                operationConfig3.LIZ(modifyConfig.cookie);
            }
            OperationConfig operationConfig4 = this.content;
            if (operationConfig4 == null) {
                this.content = modifyConfig.content;
            } else {
                operationConfig4.LIZ(modifyConfig.content);
            }
            OperationConfig operationConfig5 = this.scheme;
            if (operationConfig5 == null) {
                this.scheme = modifyConfig.scheme;
            } else {
                operationConfig5.LIZ(modifyConfig.scheme);
            }
            OperationConfig operationConfig6 = this.domain;
            if (operationConfig6 == null) {
                this.domain = modifyConfig.domain;
            } else {
                operationConfig6.LIZ(modifyConfig.domain);
            }
            OperationConfig operationConfig7 = this.path;
            if (operationConfig7 == null) {
                this.path = modifyConfig.path;
            } else {
                operationConfig7.LIZ(modifyConfig.path);
            }
        }
    }

    public final void LIZIZ(C840660WyO c840660WyO, boolean z) {
        Map<String, ReplaceConfig> map;
        INetworkApiService iNetworkApiService;
        Map<String, ReplaceConfig> map2;
        INetworkApiService iNetworkApiService2;
        Map<String, ReplaceConfig> map3;
        INetworkApiService iNetworkApiService3;
        List<String> list;
        INetworkApiService iNetworkApiService4;
        Map<String, ReplaceConfig> map4;
        INetworkApiService iNetworkApiService5;
        Map<String, String> map5;
        INetworkApiService iNetworkApiService6;
        List<String> list2;
        INetworkApiService iNetworkApiService7;
        Map<String, ReplaceConfig> map6;
        INetworkApiService iNetworkApiService8;
        Map<String, String> map7;
        INetworkApiService iNetworkApiService9;
        List<String> list3;
        INetworkApiService iNetworkApiService10;
        Map<String, ReplaceConfig> map8;
        INetworkApiService iNetworkApiService11;
        Map<String, String> map9;
        INetworkApiService iNetworkApiService12;
        try {
            OperationConfig operationConfig = this.query;
            if (operationConfig != null && (map9 = operationConfig.add) != null && !map9.isEmpty() && (iNetworkApiService12 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService12.addQueries(c840660WyO, C2097608Jq.LJIIZILJ(map9));
            }
            OperationConfig operationConfig2 = this.query;
            if (operationConfig2 != null && (map8 = operationConfig2.replace) != null && !map8.isEmpty() && (iNetworkApiService11 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService11.replaceQueries(c840660WyO, C2097608Jq.LJIIZILJ(map8), z);
            }
            OperationConfig operationConfig3 = this.query;
            if (operationConfig3 != null && (list3 = operationConfig3.remove) != null && !list3.isEmpty() && (iNetworkApiService10 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService10.removeQueries(c840660WyO, C13LP.LLIIII(list3), z);
            }
            OperationConfig operationConfig4 = this.header;
            if (operationConfig4 != null && (map7 = operationConfig4.add) != null && !map7.isEmpty() && (iNetworkApiService9 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService9.addHeaders(c840660WyO, C2097608Jq.LJIIZILJ(map7));
            }
            OperationConfig operationConfig5 = this.header;
            if (operationConfig5 != null && (map6 = operationConfig5.replace) != null && !map6.isEmpty() && (iNetworkApiService8 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService8.replaceHeaders(c840660WyO, C2097608Jq.LJIIZILJ(map6), z);
            }
            OperationConfig operationConfig6 = this.header;
            if (operationConfig6 != null && (list2 = operationConfig6.remove) != null && !list2.isEmpty() && (iNetworkApiService7 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService7.removeHeaders(c840660WyO, C13LP.LLIIII(list2), z);
            }
            OperationConfig operationConfig7 = this.cookie;
            if (operationConfig7 != null && (map5 = operationConfig7.add) != null && !map5.isEmpty() && (iNetworkApiService6 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService6.addCookies(c840660WyO, C2097608Jq.LJIIZILJ(map5));
            }
            OperationConfig operationConfig8 = this.cookie;
            if (operationConfig8 != null && (map4 = operationConfig8.replace) != null && !map4.isEmpty() && (iNetworkApiService5 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService5.replaceCookies(c840660WyO, C2097608Jq.LJIIZILJ(map4), z);
            }
            OperationConfig operationConfig9 = this.cookie;
            if (operationConfig9 != null && (list = operationConfig9.remove) != null && !list.isEmpty() && (iNetworkApiService4 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService4.removeCookies(c840660WyO, C13LP.LLIIII(list), z);
            }
            OperationConfig operationConfig10 = this.scheme;
            if (operationConfig10 != null && (map3 = operationConfig10.replace) != null && !map3.isEmpty() && (iNetworkApiService3 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService3.replaceScheme(c840660WyO, C2097608Jq.LJIIZILJ(map3));
            }
            OperationConfig operationConfig11 = this.domain;
            if (operationConfig11 != null && (map2 = operationConfig11.replace) != null && !map2.isEmpty() && (iNetworkApiService2 = c840660WyO.LIZIZ) != null) {
                iNetworkApiService2.replaceDomain(c840660WyO, C2097608Jq.LJIIZILJ(map2));
            }
            OperationConfig operationConfig12 = this.path;
            if (operationConfig12 != null && (map = operationConfig12.replace) != null && !map.isEmpty() && (iNetworkApiService = c840660WyO.LIZIZ) != null) {
                iNetworkApiService.replacePath(c840660WyO, C2097608Jq.LJIIZILJ(map));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Invoke", new AwS414S0200000_13(c840660WyO, this, 2), 6, th);
        }
    }

    public ModifyConfig(OperationConfig operationConfig, OperationConfig operationConfig2, OperationConfig operationConfig3, OperationConfig operationConfig4, OperationConfig operationConfig5, OperationConfig operationConfig6, OperationConfig operationConfig7) {
        this.query = operationConfig;
        this.header = operationConfig2;
        this.cookie = operationConfig3;
        this.content = operationConfig4;
        this.scheme = operationConfig5;
        this.domain = operationConfig6;
        this.path = operationConfig7;
    }
}
