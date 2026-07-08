package com.ss.android.ugc.aweme.music.api.pin;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface PinApi {
    @InterfaceC1501240pAY("/tiktok/user/pinned_pgc_music/create/v1/")
    @InterfaceC1501300pAe
    Object pinMusic(@InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("music_id") String str2, InterfaceC1364105Vn<? super MusicBaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/user/pinned_pgc_music/delete/v1/")
    @InterfaceC1501300pAe
    Object unpinMusic(@InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("music_id") String str2, InterfaceC1364105Vn<? super MusicBaseResponse> interfaceC1364105Vn);
}
