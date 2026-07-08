package com.ss.android.ugc.aweme.tako.feed.topicon;

import X.AbstractC1585770rMt;
import X.C1148304eP;
import X.C13LE;
import X.C1585710rMn;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.tako.ITakoFeedIconService;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoFeedIconServiceImpl implements ITakoFeedIconService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0rMn] */
    @Override // com.ss.android.ugc.aweme.tako.ITakoFeedIconService
    public final C1585710rMn LIZ() {
        return new AbstractC1585770rMt() { // from class: X.0rMn
            @Override // X.AbstractC1585770rMt
            public final InterfaceC1570900qyu LIZJ() {
                return new C14T6();
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.TAKO;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.tako.ITakoFeedIconService
    public final C19719912Dl LIZIZ() {
        if (C1148304eP.LIZ()) {
            return C13LE.LIZ(TakoTopIconAssem.class);
        }
        return null;
    }
}
