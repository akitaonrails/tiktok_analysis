package com.ss.android.ugc.aweme.music.api;

import X.C040J;
import X.C09S2;
import X.C0X9S;
import X.C1515820pY4;
import X.C15O7;
import X.C2188811AlT;
import X.C422830Gi1;
import X.C7883036b;
import X.C844470XAv;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import X.InterfaceC2177008fw;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicAwemeListRequestModel;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicAwemeApi {
    public static final MusicService LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;

    public interface MusicService {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/aweme/v1/music/create/")
        C0X9S<String> createMusic(@InterfaceC1501150pAP Map<String, String> map);

        @InterfaceC1501160pAQ
        ListenableFuture<MusicAwemeList> queryMusicAwemeList(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("music_id") String str2, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("type") int i2, @InterfaceC1501070pAH("video_cover_shrink") String str3, @InterfaceC1501070pAH("from_group_id") String str4, @InterfaceC1501070pAH("could_lazy_loading") int i3, @InterfaceC1501070pAH("tmpl_feature_info") String str5, @InterfaceC1501070pAH("experiment_params") String str6, @InterfaceC1501070pAH("item_id") String str7);

        @InterfaceC1501160pAQ
        ListenableFuture<MusicAwemeList> queryMusicAwemeListItems(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("music_id") String str2, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("type") int i2, @InterfaceC1501070pAH("video_cover_shrink") String str3, @InterfaceC1501070pAH("from_group_id") String str4, @InterfaceC1501070pAH("item_ids") String str5, @InterfaceC1501070pAH("lazy_loading_ctx") String str6);

        @C040J
        @InterfaceC1501160pAQ
        C15O7<C1515820pY4<MusicAwemeList>> queryMusicAwemeListStream(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("music_id") String str2, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("type") int i2, @InterfaceC1501070pAH("video_cover_shrink") String str3, @InterfaceC1501070pAH("from_group_id") String str4);

        ListenableFuture<MusicAwemeList> queryMusicFreshAwemeList(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("music_id") String str2, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("type") int i2, @InterfaceC1501070pAH("video_cover_shrink") String str3, @InterfaceC1501070pAH("from_group_id") String str4);

        @InterfaceC1501160pAQ
        C0X9S<MusicAwemeList> queryMusicSquareListItems(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("music_id") String str2, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("effect_sdk_version") String str3, @InterfaceC1501070pAH("feature_bits") String str4, @InterfaceC2177008fw Object obj);
    }

    static {
        String str = Api.LIZ;
        LIZ = (MusicService) C09S2.LIZJ(MusicService.class, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/aweme/v1/music/aweme/");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("/aweme/v1/music/fresh/aweme/");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("/aweme/v1/music/items/");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append("/tiktok/v1/music/square/");
        LJ = C2188811AlT.LIZIZ(sbLIZ4);
    }

    public static String LIZ() {
        C844470XAv.LIZ.getClass();
        int[] iArrLIZ = C422830Gi1.LIZ(C844470XAv.LIZ().getResources().getDisplayMetrics().density > 320.0f ? 201 : 200);
        if (iArrLIZ == null || iArrLIZ.length < 2) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iArrLIZ[0]);
        sbLIZ.append("_");
        sbLIZ.append(iArrLIZ[1]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static MusicAwemeList LIZIZ(String str, long j, int i, int i2, String str2, String str3, MusicAwemeListRequestModel musicAwemeListRequestModel) {
        String str4;
        String strTrim = str;
        boolean zLJI = MethodIDManager.LJI(202234);
        if (i2 == 0) {
            MusicService musicService = LIZ;
            String str5 = LIZIZ;
            if (strTrim != null) {
                strTrim = strTrim.trim();
            }
            String strLIZ = LIZ();
            String strLIZ2 = C7883036b.LIZ();
            if (musicAwemeListRequestModel != null) {
                str4 = musicAwemeListRequestModel.awemeId;
            } else {
                str4 = "";
            }
            MusicAwemeList musicAwemeList = musicService.queryMusicAwemeList(str5, strTrim, j, i, 0, strLIZ, str2, 1, str3, strLIZ2, str4).get();
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return musicAwemeList;
        }
        MusicService musicService2 = LIZ;
        String str6 = LIZJ;
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        MusicAwemeList musicAwemeList2 = musicService2.queryMusicFreshAwemeList(str6, strTrim, j, i, i2, LIZ(), str2).get();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return musicAwemeList2;
    }

    public static MusicAwemeList LIZJ(String str, int i, long j, String str2, String str3, int i2, String str4) {
        String strTrim = str;
        MusicService musicService = LIZ;
        String str5 = LIZLLL;
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        return musicService.queryMusicAwemeListItems(str5, strTrim, j, i, i2, LIZ(), str2, str3, str4).get();
    }
}
