package com.ss.android.ugc.aweme.feed.landscape.service;

import X.C0SXF;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.service.ILandscapeFeedVodTagService;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeFeedVodTagServiceImpl implements ILandscapeFeedVodTagService {
    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedVodTagService
    public final String LIZ(Aweme aweme) {
        String strLIZIZ;
        FakeLandscapeInfo fakeLandscapeInfo;
        String str = null;
        if (aweme == null) {
            return null;
        }
        String strLIZIZ2 = "";
        if (C0SXF.LJIJ(aweme)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append("_landscape_fake_");
            Video video = aweme.getVideo();
            if (video == null || (fakeLandscapeInfo = video.getFakeLandscapeInfo()) == null) {
                return null;
            }
            sbLIZ.append(fakeLandscapeInfo.getFakeLandscapeVideoType());
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        } else if (C0SXF.LJIJJ(aweme)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append("_landscape_real");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (strLIZIZ2 != null && strLIZIZ2.length() == 0) {
            strLIZIZ = null;
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("pgc");
            sbLIZ3.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null) {
            str = mobParams.get("landscape_change_keep_tag");
        }
        if (Intrinsics.LJFF(str, "true")) {
            aweme.getMobParams().remove("landscape_change_keep_tag");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append("_2vertical");
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        return strLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedVodTagService
    public final String LIZIZ(Aweme aweme) {
        String strLIZ = LIZ(aweme);
        if (strLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append("_vertical2");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedVodTagService
    public final String LIZJ(Aweme aweme) {
        String strLIZ = LIZ(aweme);
        if (strLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append("_2vertical");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }
}
