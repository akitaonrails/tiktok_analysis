package com.bytedance.android.livesdk.gift.assets;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _VideoResource_ProtoDecoder implements C0IMD<VideoResource> {
    public static VideoResource LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        VideoResource videoResource = new VideoResource();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            videoResource.videoMd5 = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        videoResource.videoUrl = _ResourceModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    videoResource.videoTypeName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return videoResource;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(VideoResource videoResource) {
        ResourceModel resourceModel = videoResource.videoUrl;
        if (resourceModel != null) {
            _ResourceModel_ProtoDecoder.LJ(resourceModel);
        }
    }

    @Override // X.C0IMD
    public final VideoResource LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VideoResource videoResource, List list) {
    }
}
