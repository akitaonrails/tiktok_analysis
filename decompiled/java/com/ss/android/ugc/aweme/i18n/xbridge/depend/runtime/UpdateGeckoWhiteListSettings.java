package com.ss.android.ugc.aweme.i18n.xbridge.depend.runtime;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class UpdateGeckoWhiteListSettings {
    public static final UpdateGeckoWhiteListModel LIZ = new UpdateGeckoWhiteListModel(C13BV.INSTANCE);

    public static final class UpdateGeckoWhiteListModel {

        @C09CT("white_list")
        public final List<String> whiteList;

        public UpdateGeckoWhiteListModel(List<String> list) {
            this.whiteList = list;
        }
    }
}
