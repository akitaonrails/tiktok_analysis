package com.bytedance.android.livesdk.gift.assets;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _VideoResource_ProtoEncoder implements InterfaceC1132110fZB<VideoResource> {
    public static int LIZIZ(VideoResource videoResource) {
        return C1142340fpg.LJIILL(1, videoResource.videoTypeName) + _ResourceModel_ProtoEncoder.LJ(2, videoResource.videoUrl) + C1142340fpg.LJIILL(3, videoResource.videoMd5);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, VideoResource videoResource) {
        VideoResource videoResource2 = videoResource;
        C1142340fpg.LJFF(c1142350fph, 1, videoResource2.videoTypeName);
        _ResourceModel_ProtoEncoder.LIZJ(c1142350fph, 2, videoResource2.videoUrl);
        C1142340fpg.LJFF(c1142350fph, 3, videoResource2.videoMd5);
    }
}
