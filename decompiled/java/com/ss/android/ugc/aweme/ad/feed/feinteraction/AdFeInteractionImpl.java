package com.ss.android.ugc.aweme.ad.feed.feinteraction;

import X.AbstractC1552040qUU;
import X.C1041070dCL;
import X.C1041280dCg;
import X.C988570bpf;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdFeInteractionModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS16S2000000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdFeInteractionImpl implements IAdFeInteraction {
    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final AdFeInteractionModel LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getInteractionFormModel();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final boolean LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdFeInteractionModel interactionFormModel;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (interactionFormModel = awemeRawAd.getInteractionFormModel()) != null && !interactionFormModel.isInteractivity()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final void LIZIZ(final AwemeRawAd awemeRawAd, final List<String> list) {
        IAdLandPagePreloadService iAdLandPagePreloadService;
        final String strK0;
        String strK02;
        if (list != null && (iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) != null && (strK0 = iAdLandPagePreloadService.K0("lynx_feed")) != null) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZIZ() != null) {
                IAdLandPagePreloadService iAdLandPagePreloadService2 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService2 != null) {
                    strK02 = iAdLandPagePreloadService2.K0("lynx_feed");
                } else {
                    strK02 = null;
                }
                C1041280dCg.LJ(list, strK02, new AbstractC1552040qUU(awemeRawAd, list, strK0) { // from class: X.0cbJ
                    public final AwemeRawAd LIZ;
                    public final List<String> LIZIZ;
                    public final String LIZJ;

                    @Override // X.AbstractC1552040qUU
                    public final void LJII(Throwable th, Map map) {
                        Iterator<String> it2 = this.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            LJJI(it2.next(), "check_server_fail");
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                        List<UpdatePackage> list2;
                        List<Pair<String, Long>> list3;
                        for (String str : this.LIZIZ) {
                            if (map != null && (list3 = map.get(this.LIZJ)) != null) {
                                Iterator<Pair<String, Long>> it2 = list3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Pair<String, Long> next = it2.next();
                                    if (Intrinsics.LJFF(next.first, str)) {
                                        if (next == null) {
                                        }
                                    }
                                }
                            }
                            if (map2 != null && (list2 = map2.get(this.LIZJ)) != null) {
                                Iterator<UpdatePackage> it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    UpdatePackage next2 = it3.next();
                                    if (Intrinsics.LJFF(next2.getChannel(), str)) {
                                        if (next2 == null) {
                                        }
                                    }
                                }
                            }
                            LJJI(str, "invalid_channel");
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJIJI(String str, Throwable th) {
                        if (str != null) {
                            LJJI(str, "update_fail");
                        }
                    }

                    @Override // X.AbstractC1552040qUU
                    public final void LJJ(long j, String str) {
                        if (str != null) {
                            ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
                            C1018060cbE.LIZ.getClass();
                            iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJJIIJ, this.LIZ, new AwS67S1000000_16(str, 42));
                        }
                    }

                    public final void LJJI(String str, String str2) {
                        ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
                        C1018060cbE.LIZ.getClass();
                        iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJJIIJZLJL, this.LIZ, new AwS16S2000000_16(str, str2, 11));
                    }

                    {
                        this.LIZ = awemeRawAd;
                        this.LIZIZ = list;
                        this.LIZJ = strK0;
                    }
                });
            }
        }
    }
}
