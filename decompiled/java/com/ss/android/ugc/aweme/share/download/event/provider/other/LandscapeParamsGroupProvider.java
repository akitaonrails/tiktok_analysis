package com.ss.android.ugc.aweme.share.download.event.provider.other;

import X.C1380150m1F;
import X.C1554960qZC;
import X.C586120Myo;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;

/* JADX INFO: loaded from: classes22.dex */
public final class LandscapeParamsGroupProvider implements BaseDownloadParamsGroupProvider<C586120Myo> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1380150m1F c1380150m1F;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "Download", C1380150m1F.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c1380150m1F = (C1380150m1F) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return new C586120Myo(c1380150m1F.LL, c1380150m1F.LLILLJJLI, Boolean.valueOf(c1380150m1F.LLILLL), c1380150m1F.LLILZ, null, 16);
    }
}
