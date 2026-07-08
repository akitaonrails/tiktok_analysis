package com.ss.android.ugc.aweme.storage;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoNewUserDowngradeConfig {

    @C09CT("downgrade_list")
    public final ArrayList<String> channelList;

    @C09CT("downgrade_list_tts")
    public final ArrayList<String> channelListTTS;

    public GeckoNewUserDowngradeConfig() {
        this(new ArrayList(), new ArrayList());
    }

    public GeckoNewUserDowngradeConfig(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.channelList = arrayList;
        this.channelListTTS = arrayList2;
    }
}
