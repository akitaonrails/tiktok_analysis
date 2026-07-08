package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class UnifyBaseShortTouchGetResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("business_list")
        public List<ShortTouchBusiness> businessList = new ArrayList();

        @C09CT("config_list")
        public List<ShortTouchConfig> configList = new ArrayList();
    }
}
