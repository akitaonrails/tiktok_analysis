package com.ss.android.ugc.aweme.player.sdk.api;

import X.C1474750oTp;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface IPortraitService {
    public static final C1474750oTp LIZ = new IPortraitService() { // from class: X.0oTp
        @Override // com.ss.android.ugc.aweme.player.sdk.api.IPortraitService
        public final /* synthetic */ void addGroupConfig(String str, List list) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.IPortraitService
        public final /* synthetic */ Map getGroupPortraits(String str) {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.IPortraitService
        public final /* synthetic */ String getPortrait(String str) {
            return null;
        }

        public final String toString() {
            return "IPortraitService.EMPTY";
        }
    };

    void addGroupConfig(String str, List<String> list);

    Map<String, String> getGroupPortraits(String str);

    String getPortrait(String str);
}
