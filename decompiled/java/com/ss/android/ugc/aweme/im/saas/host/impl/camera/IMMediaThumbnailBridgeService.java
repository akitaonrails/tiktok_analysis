package com.ss.android.ugc.aweme.im.saas.host.impl.camera;

import X.C0Z5J;
import X.C0ZQS;
import X.C869590Y9l;
import X.C896060ZDg;
import com.ss.android.ugc.aweme.im.message.template.card.QuickLiveVideoTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMediaThumbnailBridgeService implements IMMediaThumbnailBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi
    public final void LIZ(String str) {
        C896060ZDg.LJII(str, true);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi
    public final boolean LIZIZ(C869590Y9l c869590Y9l) {
        return C896060ZDg.LIZJ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi
    public final void LIZJ(C869590Y9l c869590Y9l) {
        C896060ZDg.LJIIIIZZ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi
    public final String LJ(C869590Y9l c869590Y9l) {
        return C896060ZDg.LIZ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi
    public final boolean LJI(C869590Y9l c869590Y9l) {
        return C0Z5J.LIZJ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi
    public final String LJII(C869590Y9l c869590Y9l) {
        return C0Z5J.LIZ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi
    public final VideoCardFallbackInfoComponent LIZLLL(C869590Y9l c869590Y9l, QuickLiveVideoTemplate quickLiveVideoTemplate) {
        return C0ZQS.LIZ(c869590Y9l, quickLiveVideoTemplate);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi
    public final VideoCardFallbackInfoComponent LJFF(C869590Y9l c869590Y9l, VideoCardTemplate videoCardTemplate) {
        return C0ZQS.LIZIZ(c869590Y9l, videoCardTemplate);
    }
}
