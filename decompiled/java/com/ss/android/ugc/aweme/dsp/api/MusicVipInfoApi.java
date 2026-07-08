package com.ss.android.ugc.aweme.dsp.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2177008fw;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.dsp.subscribe.model.DspVipInfoResponse;

/* JADX INFO: loaded from: classes20.dex */
public final class MusicVipInfoApi {
    public static MusicVipInfoOperatorApi LIZ;

    public interface MusicVipInfoOperatorApi {
        @InterfaceC1501160pAQ("tiktok/music/dsp/ttm/vip_info/v2/")
        C11NZ<DspVipInfoResponse> getVipInfo(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("track_id") String str, @InterfaceC1501070pAH("allow_play_full_song_in_tt") Boolean bool, @InterfaceC1501070pAH("load_player_module_failed") Boolean bool2, @InterfaceC1501070pAH("scene_context") String str2, @InterfaceC2177008fw Object obj);
    }
}
