package com.ss.android.ugc.aweme.stemfeed.service;

import X.AbstractC1585770rMt;
import X.C1562770qln;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.stemfeed.ui.tab.StemTabProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class StemFeedServiceImpl implements IStemFeedService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0qln] */
    @Override // com.ss.android.ugc.aweme.stemfeed.service.IStemFeedService
    public final C1562770qln LIZ() {
        return new AbstractC1585770rMt() { // from class: X.0qln
            @Override // X.AbstractC1585770rMt
            public final TopTabProtocol LIZLLL() {
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("stem_feed_crash", true)) {
                    return new StemTabProtocol();
                }
                try {
                    return new StemTabProtocol();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.STEM;
            }
        };
    }
}
