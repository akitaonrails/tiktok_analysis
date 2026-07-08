package com.bytedance.goda.v2.model.vo;

import X.C09CT;
import com.bytedance.goda.v2.model.dto.GodaV2Facade;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class GodaV2RequestParams {

    @C09CT("client_screen")
    public final ClientScreen clientScreen;

    @C09CT("extension")
    public final Map<String, Object> extension;

    @C09CT("facade")
    public final GodaV2Facade facade;

    @C09CT("init_page")
    public final String initPage;

    public GodaV2RequestParams(ClientScreen clientScreen, GodaV2Facade godaV2Facade, String str, Map<String, ? extends Object> map) {
        this.clientScreen = clientScreen;
        this.facade = godaV2Facade;
        this.initPage = str;
        this.extension = map;
    }
}
