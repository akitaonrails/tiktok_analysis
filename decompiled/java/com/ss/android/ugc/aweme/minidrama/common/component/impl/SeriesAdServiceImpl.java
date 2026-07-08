package com.ss.android.ugc.aweme.minidrama.common.component.impl;

import X.C13LP;
import X.C19719512Dh;
import X.C21171517tB;
import X.C21177317u7;
import X.C212348188c;
import X.C212349188d;
import X.C261180ALk;
import com.ss.android.ugc.aweme.api.IDramaBlockingAdProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes33.dex */
public final class SeriesAdServiceImpl implements ISeriesAdService {
    public final C212348188c LIZIZ = new C212348188c();

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService
    public final void LIZJ() {
        C212348188c c212348188c = this.LIZIZ;
        c212348188c.LIZ.clear();
        c212348188c.LIZIZ.clear();
        c212348188c.LIZJ.clear();
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService
    public final boolean LIZ(Aweme aweme) {
        IDramaBlockingAdProvider iDramaBlockingAdProvider;
        if (aweme == null || (iDramaBlockingAdProvider = (IDramaBlockingAdProvider) PluggableExtentionKt.pluggableSpi$default(IDramaBlockingAdProvider.class, false, false, false, 14, null)) == null || !iDramaBlockingAdProvider.LIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService
    public final C21171517tB LIZIZ(Aweme aweme) {
        C212349188d c212349188dLIZIZ;
        IDramaBlockingAdProvider iDramaBlockingAdProvider = (IDramaBlockingAdProvider) PluggableExtentionKt.pluggableSpi$default(IDramaBlockingAdProvider.class, false, false, false, 14, null);
        if (iDramaBlockingAdProvider != null && (c212349188dLIZIZ = iDramaBlockingAdProvider.LIZIZ(aweme)) != null) {
            return new C21171517tB(c212349188dLIZIZ.LIZLLL, aweme, c212349188dLIZIZ.LIZ, c212349188dLIZIZ.LIZIZ, c212349188dLIZIZ.LIZJ);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService
    public final void LIZLLL(Aweme aweme) {
        String aid;
        String aid2;
        ArrayList<String> arrayList;
        String aid3;
        C212348188c c212348188c = this.LIZIZ;
        HashSet<String> hashSet = c212348188c.LIZ;
        String aid4 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (C13LP.LJJJJ(aid, hashSet)) {
            ArrayList<String> arrayList2 = c212348188c.LIZIZ;
            if (arrayList2 != null) {
                if (aweme != null) {
                    aid3 = aweme.getAid();
                } else {
                    aid3 = null;
                }
                C19719512Dh.LIZ(arrayList2).remove(aid3);
            }
            ArrayList<String> arrayList3 = c212348188c.LIZJ;
            if (arrayList3 != null) {
                if (aweme != null) {
                    aid4 = aweme.getAid();
                }
                C19719512Dh.LIZ(arrayList3).remove(aid4);
            }
        }
        if (aweme == null || (aid2 = aweme.getAid()) == null) {
            aid2 = "";
        }
        if (aweme != null) {
            if (aweme.isAd()) {
                ArrayList<String> arrayList4 = c212348188c.LIZIZ;
                if (arrayList4 != null) {
                    arrayList4.add(aid2);
                }
                HashSet<String> hashSet2 = c212348188c.LIZ;
                if (hashSet2 != null) {
                    hashSet2.add(aid2);
                }
                if (aweme == null) {
                    return;
                }
            }
            ISeriesAdService.LIZ.getClass();
            if (C21177317u7.LIZ(aweme) && (arrayList = c212348188c.LIZJ) != null) {
                arrayList.add(aid2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService
    public final void LJ(Aweme aweme) {
        IDramaBlockingAdProvider iDramaBlockingAdProvider = (IDramaBlockingAdProvider) PluggableExtentionKt.pluggableSpi$default(IDramaBlockingAdProvider.class, false, false, false, 14, null);
        if (iDramaBlockingAdProvider != null) {
            iDramaBlockingAdProvider.LIZLLL(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService
    public final String LJFF(boolean z) {
        if (z) {
            return C13LP.LJJLIIIJ(C13LP.LLD(((Number) C261180ALk.LIZ.getValue()).intValue(), this.LIZIZ.LIZJ), ",", null, null, 0, null, null, 62);
        }
        return C13LP.LJJLIIIJ(C13LP.LLD(((Number) C261180ALk.LIZ.getValue()).intValue(), this.LIZIZ.LIZIZ), ",", null, null, 0, null, null, 62);
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService
    public final void LJII(Aweme aweme) {
        IDramaBlockingAdProvider iDramaBlockingAdProvider = (IDramaBlockingAdProvider) PluggableExtentionKt.pluggableSpi$default(IDramaBlockingAdProvider.class, false, false, false, 14, null);
        if (iDramaBlockingAdProvider != null) {
            iDramaBlockingAdProvider.LJ(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService
    public final void LJI(int i, Aweme aweme) {
        IDramaBlockingAdProvider iDramaBlockingAdProvider = (IDramaBlockingAdProvider) PluggableExtentionKt.pluggableSpi$default(IDramaBlockingAdProvider.class, false, false, false, 14, null);
        if (iDramaBlockingAdProvider != null) {
            iDramaBlockingAdProvider.LIZJ(i, aweme);
        }
    }
}
