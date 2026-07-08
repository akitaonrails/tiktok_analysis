package com.ss.android.ugc.aweme.wavepublish.cloudmerge;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes23.dex */
public interface CloudMergeApi {
    @InterfaceC1501160pAQ("/tiktok/v1/publish/config/")
    C11NZ<PublishConfigModel> getConfigAuth(@InterfaceC1501070pAH("publish_video_id") String str, @InterfaceC1501070pAH("video_id_reuse_scene") int i);
}
