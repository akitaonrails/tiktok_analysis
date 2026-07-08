package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class QueryCommercialContentToggleResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("open_commercial_content_toggle")
        public boolean openCommercialContentToggle;

        @C09CT("promote_myself")
        public boolean promoteMyself;

        @C09CT("promote_third_party")
        public boolean promoteThirdParty;
    }
}
