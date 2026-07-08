package com.ss.android.ugc.aweme.music.api;

import X.AbstractC842530X3j;
import X.C12NI;
import X.C15O7;
import X.InterfaceC1485405rg;
import X.InterfaceC1485705rj;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.SimpleMusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicApi {
    public static final MusicService LIZ = (MusicService) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C12NI.LIZ).build().retrofit.LIZ(MusicService.class);

    /* JADX INFO: loaded from: classes23.dex */
    public interface MusicService {
        @InterfaceC1501160pAQ("/aweme/v1/commerce/music/beats/songs/")
        ListenableFuture<MusicList> fetchCommerceStickPointMusicList(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("video_count") int i3, @InterfaceC1501070pAH("video_duration") String str);

        @InterfaceC1501160pAQ("/aweme/v1/music/beats/songs/")
        ListenableFuture<MusicList> fetchStickPointMusicList(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("video_count") int i3, @InterfaceC1501070pAH("video_duration") String str);

        @InterfaceC1501170pAR("/tiktok/autocut/http-proxy/music/recommend/v1/")
        C15O7<String> getAutoCutMusicList(@InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j, @InterfaceC1501070pAH("creation_id") String str, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("image_info_req_json") String str2, @InterfaceC1501070pAH("account_type") int i2, @InterfaceC1501070pAH("new_path") int i3, @InterfaceC1501070pAH("featurebits") String str3, @InterfaceC1501070pAH("feature_codes") String str4, @InterfaceC1501070pAH("protocol_version") String str5, @InterfaceC1501070pAH("media_count") int i4, @InterfaceC1501070pAH("entrance_page") int i5, @InterfaceC1501070pAH("effect_sdk_version") String str6, @InterfaceC1501070pAH("allow_pugc") int i6, @InterfaceC1501070pAH("edit_video_duration") long j, @InterfaceC1501070pAH("album_material_image_num") int i7, @InterfaceC1501070pAH("album_material_duration_list") String str7, @InterfaceC1501070pAH("reuse_music_id") String str8, @InterfaceC1501070pAH("enable_preloading") int i8, @InterfaceC1501070pAH("live_count") int i9, @InterfaceC1501070pAH("content_type") String str9, @InterfaceC1501070pAH("content_source") String str10);

        @InterfaceC1501160pAQ("/tiktok/movie/studio/music/recommend/v1/")
        C15O7<String> getAutoCutMusicList(@InterfaceC1501070pAH("zip_uri") String str, @InterfaceC1501070pAH("creation_id") String str2, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("image_info_req_json") String str3, @InterfaceC1501070pAH("new_path") int i2, @InterfaceC1501070pAH("featurebits") String str4, @InterfaceC1501070pAH("feature_codes") String str5, @InterfaceC1501070pAH("protocol_version") String str6, @InterfaceC1501070pAH("media_count") int i3, @InterfaceC1501070pAH("video_duration") long j);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/movie/studio/music/recommend/v1/")
        C15O7<String> getAutoCutMusicListByNewPath(@InterfaceC1501070pAH("zip_uri") String str, @InterfaceC1501070pAH("creation_id") String str2, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("image_info_req_json") String str3, @InterfaceC1501070pAH("new_path") int i2, @InterfaceC1501050pAF("rec_config") String str4, @InterfaceC1501070pAH("featurebits") String str5, @InterfaceC1501070pAH("feature_codes") String str6, @InterfaceC1501070pAH("protocol_version") String str7, @InterfaceC1501070pAH("media_count") int i3, @InterfaceC1501070pAH("entrance_page") int i4, @InterfaceC1501070pAH("video_duration") long j);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/media/api/music/pic/conf/")
        C15O7<String> getAutoCutNLEModel(@InterfaceC1501050pAF("rec_config") String str, @InterfaceC1501070pAH("rec_key") String str2, @InterfaceC1501050pAF("template_type") int i, @InterfaceC1501050pAF("template_group_id") String str3, @InterfaceC1501050pAF("is_first_template_from_mdp") int i2, @InterfaceC1501070pAH("enable_preloading") int i3, @InterfaceC1501070pAH("use_client_features") int i4, @InterfaceC1501050pAF("feature_list") String str4, @InterfaceC1501050pAF("feature_codes") String str5, @InterfaceC1501050pAF("protocol_version") String str6, @InterfaceC1501050pAF("use_aigt") boolean z);

        @InterfaceC1501160pAQ
        ListenableFuture<TypedInput> isUrlExpired(@InterfaceC1485705rj String str);

        @InterfaceC1501160pAQ("/aweme/v1/music/detail/")
        ListenableFuture<SimpleMusicDetail> queryMusic(@InterfaceC1501070pAH("music_id") String str, @InterfaceC1501070pAH("click_reason") int i);

        @InterfaceC1501160pAQ("/tiktok/v1/capcut/template/")
        ListenableFuture<SimpleMusicDetail> queryMusicByTemplateId(@InterfaceC1501070pAH("template_id") String str);
    }

    public static SimpleMusicDetail LIZ(int i, String str) throws ExecutionException, InterruptedException {
        boolean zLJI = MethodIDManager.LJI(137994);
        MusicService musicService = LIZ;
        if (str != null) {
            str = str.trim();
        }
        SimpleMusicDetail simpleMusicDetail = musicService.queryMusic(str, i).get();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return simpleMusicDetail;
    }
}
