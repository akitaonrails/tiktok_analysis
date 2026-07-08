package com.ss.android.ugc.aweme.cktemplate.resource.impl;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes23.dex */
public interface MusicApi {
    @InterfaceC1501160pAQ("/templates/music")
    C11NZ<MusicListRespone> requestMusicList(@InterfaceC1501070pAH("aid") String str, @InterfaceC1501070pAH("carrier_region") String str2, @InterfaceC1501070pAH("language") String str3, @InterfaceC1501070pAH("music_ids") String str4, @InterfaceC1501070pAH("region_key") String str5);
}
