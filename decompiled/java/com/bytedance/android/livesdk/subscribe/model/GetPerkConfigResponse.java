package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class GetPerkConfigResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("content_type_list")
        public List<PerkContentType> contentTypeList = new ArrayList();

        @C09CT("user_current_config")
        public UserCurrentConfig userCurrentConfig;
    }
}
