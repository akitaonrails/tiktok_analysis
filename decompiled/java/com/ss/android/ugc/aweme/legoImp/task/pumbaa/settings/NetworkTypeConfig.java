package com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings;

import X.C09CT;
import X.C13LQ;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkTypeConfig {

    @C09CT("cdn_domain_list")
    public final Set<String> cdnDomainList;

    @C09CT("cdn_path_list")
    public final Set<String> cdnPathList;

    @C09CT("private_image_domain_prefix")
    public final Set<String> privateImageDomainPrefix;

    public NetworkTypeConfig() {
        this(null, null, null, 7, null);
    }

    public NetworkTypeConfig(Set<String> set, Set<String> set2, Set<String> set3) {
        this.cdnDomainList = set;
        this.cdnPathList = set2;
        this.privateImageDomainPrefix = set3;
    }

    public NetworkTypeConfig(Set set, Set set2, Set set3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13LQ.LJLIIL(new String[]{"tiktokcdn-us.com", "tiktokcdn.com", "tiktokcdn-eu.com", "image-va.tiktokv.com", "image-sg.tiktokv.com", "image.tiktokv.us", "ibytedtos.com"}) : set, (i & 2) != 0 ? Collections.singleton("/tos-") : set2, (i & 4) != 0 ? C13LQ.LJLIIL(new String[]{"https://image", "https://p0"}) : set3);
    }
}
