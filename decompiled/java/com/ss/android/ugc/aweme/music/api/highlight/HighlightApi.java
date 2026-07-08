package com.ss.android.ugc.aweme.music.api.highlight;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;
import com.ss.android.ugc.aweme.music.model.NewReleasedList;

/* JADX INFO: loaded from: classes10.dex */
public interface HighlightApi {
    @InterfaceC1501160pAQ("/tiktok/user/new_release_music/list/v1/")
    Object getNewReleasedList(@InterfaceC1501070pAH("sec_user_id") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str2, InterfaceC1364105Vn<? super NewReleasedList> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/user/highlight_music/delete/v1/")
    Object highlightDelete(@InterfaceC1501050pAF("sec_user_id") String str, InterfaceC1364105Vn<? super MusicBaseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/user/highlight_music/set/v1/")
    Object highlightMusic(@InterfaceC1501050pAF("sec_user_id") String str, @InterfaceC1501050pAF("music_id") String str2, InterfaceC1364105Vn<? super MusicBaseResponse> interfaceC1364105Vn);
}
