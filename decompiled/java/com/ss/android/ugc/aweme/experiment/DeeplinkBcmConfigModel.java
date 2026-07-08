package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class DeeplinkBcmConfigModel {

    @C09CT("additional_url_path")
    public final List<String> additionalUrlPathList;

    @C09CT("deeplink_bcm_key_and_location")
    public final List<BcmKeyEntryPath> deepLinkBcmKeyList;

    public DeeplinkBcmConfigModel() {
        this(null, null, 3, null);
    }

    public DeeplinkBcmConfigModel(List<BcmKeyEntryPath> list, List<String> list2) {
        this.deepLinkBcmKeyList = list;
        this.additionalUrlPathList = list2;
    }

    public DeeplinkBcmConfigModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? Collections.singletonList("params_url") : list2);
    }
}
