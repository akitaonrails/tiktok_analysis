package com.ss.android.ugc.aweme.api;

import X.C01GW;
import X.C0BBT;
import X.C0NBO;
import X.C0S0L;
import X.C1000330c8d;
import X.C1001410cAN;
import X.C1009450cNL;
import X.C1009460cNM;
import X.C1009770cNr;
import X.C1009780cNs;
import X.C1009790cNt;
import X.C1011220cQC;
import X.C1210880hcE;
import X.C13LE;
import X.C1440005kM;
import X.C1807670x8n;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C307010C1r;
import X.C452501pT;
import X.C811103Ev;
import X.EnumC599900Nfw;
import X.InterfaceC1002070cBR;
import X.InterfaceC1008930cMV;
import X.InterfaceC1017820caq;
import X.InterfaceC2217461Bqa;
import X.RunnableC1000320c8c;
import android.content.Context;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAnoleResourceHandler;
import com.ss.android.ugc.aweme.ad.ucp.IUcpService;
import com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridResourceHandler;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedServiceImpl implements IFeedService {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJI;
    public InterfaceC1008930cMV LIZJ;
    public volatile C1011220cQC LJFF;
    public final C01GW LIZ = C452501pT.LIZIZ(new C1009770cNr());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1009780cNs());
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(185));
    public final C01GW LJ = C452501pT.LIZIZ(new C1009790cNt());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedServiceImpl.class, "eCommerceService", "getECommerceService()Lcom/ss/android/ugc/aweme/api/ecommerce/IAdECommerceService;", 0);
        C13LE.LIZ.getClass();
        LJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final InterfaceC1002070cBR LJFF() {
        C1011220cQC c1011220cQC = this.LJFF;
        if (c1011220cQC == null) {
            synchronized (this) {
                c1011220cQC = this.LJFF;
                if (c1011220cQC == null) {
                    C1011220cQC c1011220cQC2 = (C1011220cQC) C1807670x8n.LJJIZ();
                    this.LJFF = c1011220cQC2;
                    return c1011220cQC2;
                }
            }
        }
        return c1011220cQC;
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final String LJIIJJI(int i) {
        if (i == 3) {
            return "video_share";
        }
        if (i == 12) {
            return "video_follow_button";
        }
        if (i == 14) {
            return "video_comment";
        }
        if (i == 19) {
            return "video_profile_pic";
        }
        if (i == 21) {
            return "video_scroll_to";
        }
        if (i == 1301) {
            return "video_digg";
        }
        if (i == 5401) {
            return "video_collect";
        }
        if (i == 35) {
            return "video_music_icon";
        }
        if (i == 36) {
            return "video_collect";
        }
        switch (i) {
            case 85:
                return "video_name";
            case 86:
                return "video_swipe_left";
            case 87:
                return "video_replay";
            case 88:
                return "video_play_render_first_frame";
            case 89:
                return "video_play_completed_first_time";
            case 90:
                return "video_click_search";
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final ICommerceFeedSeriesService LJIIIZ() {
        return (ICommerceFeedSeriesService) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final InterfaceC1017820caq LJIILIIL() {
        return (InterfaceC1017820caq) this.LJ.getValue();
    }

    public final Map<String, LruCache<String, InterfaceC1008930cMV>> LJIILL() {
        return (Map) this.LIZ.getValue();
    }

    public final Map<String, LruCache<String, InterfaceC1008930cMV>> LJIILLIIL() {
        return (Map) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final InterfaceC1008930cMV LJ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LIZ(Context context, String str) {
        IUcpService iUcpService;
        if (Intrinsics.LJFF(str, "homepage_hot") && (iUcpService = (IUcpService) PluggableExtentionKt.pluggableSpi$default(IUcpService.class, false, false, false, 14, null)) != null) {
            iUcpService.LIZIZ();
        }
        IAnoleResourceHandler iAnoleResourceHandler = (IAnoleResourceHandler) PluggableExtentionKt.pluggableSpi$default(IAnoleResourceHandler.class, false, false, false, 14, null);
        if (iAnoleResourceHandler != null) {
            iAnoleResourceHandler.destroy();
        }
        IAdHybridResourceHandler iAdHybridResourceHandler = (IAdHybridResourceHandler) PluggableExtentionKt.pluggableSpi$default(IAdHybridResourceHandler.class, false, false, false, 14, null);
        if (iAdHybridResourceHandler != null) {
            iAdHybridResourceHandler.destroy();
        }
        if (context == null) {
            return;
        }
        if (((Boolean) C307010C1r.LIZJ.getValue()).booleanValue()) {
            LruCache<String, InterfaceC1008930cMV> lruCache = LJIILL().get(str);
            if (lruCache != null) {
                Iterator<Map.Entry<String, InterfaceC1008930cMV>> it2 = lruCache.snapshot().entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().LJFF();
                }
            }
            LruCache<String, InterfaceC1008930cMV> lruCache2 = LJIILLIIL().get(str);
            if (lruCache2 != null) {
                Iterator<Map.Entry<String, InterfaceC1008930cMV>> it3 = lruCache2.snapshot().entrySet().iterator();
                while (it3.hasNext()) {
                    it3.next().getValue().LJFF();
                }
            }
        }
        this.LIZJ = null;
        LJIILL().remove(str);
        LJIILLIIL().remove(str);
        C1001410cAN.LIZIZ.LIZLLL(EnumC599900Nfw.FEED);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releasePanel,panelName = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LIZLLL(Context context, Aweme aweme) {
        if (aweme.getAid() == null || context == null) {
            return;
        }
        LruCache<String, InterfaceC1008930cMV> lruCache = LJIILL().get("homepage_hot");
        if (lruCache != null) {
            lruCache.remove(aweme.getAid());
        }
        LruCache<String, InterfaceC1008930cMV> lruCache2 = LJIILLIIL().get("homepage_hot");
        if (lruCache2 != null) {
            lruCache2.remove(aweme.getAid());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroyFeedItemModule,panelName = ");
        sbLIZ.append("homepage_hot");
        sbLIZ.append(",aweme = ");
        sbLIZ.append(aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        C1001410cAN.LIZIZ.LIZLLL(EnumC599900Nfw.FEED);
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LJII(Context context, Aweme aweme, String str) {
        if (aweme == null || aweme.getAid() == null || str == null || context == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload,panelName = ");
        sbLIZ.append(str);
        sbLIZ.append(",aweme = ");
        sbLIZ.append(aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = LIZJ(context, aweme, str, true);
        if (interfaceC1008930cMVLIZJ != null) {
            interfaceC1008930cMVLIZJ.preload();
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LJIIIIZZ(Context context, Aweme aweme, String str) {
        this.LIZJ = LIZJ(context, aweme, str, true);
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LJIIJ(Context context, Aweme aweme, String str) {
        if (aweme == null || aweme.getAid() == null || str == null || context == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadResource,panelName = ");
        sbLIZ.append(str);
        sbLIZ.append(",aweme = ");
        sbLIZ.append(aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = LIZJ(context, aweme, str, true);
        if (interfaceC1008930cMVLIZJ != null) {
            interfaceC1008930cMVLIZJ.LIZJ();
        }
    }

    public final InterfaceC1008930cMV LJIILJJIL(Context context, Aweme aweme, String str) {
        if (AwemeExtKt.isAdTraffic(aweme)) {
            C1009460cNM c1009460cNM = new C1009460cNM(context, aweme, str);
            LruCache<String, InterfaceC1008930cMV> lruCache = LJIILL().get(str);
            if (lruCache != null) {
                lruCache.put(aweme.getAid(), c1009460cNM);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createItemModule,panelName = ");
            sbLIZ.append(str);
            sbLIZ.append(",aweme = ");
            sbLIZ.append(aweme.getAid());
            C2188811AlT.LIZIZ(sbLIZ);
            return c1009460cNM;
        }
        if (!AwemeExtKt.isAdTraffic(aweme)) {
            C1009450cNL c1009450cNL = new C1009450cNL(context, aweme, str);
            LruCache<String, InterfaceC1008930cMV> lruCache2 = LJIILLIIL().get(str);
            if (lruCache2 != null) {
                lruCache2.put(aweme.getAid(), c1009450cNL);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createItemModule,type is organic, panelName = ");
            sbLIZ2.append(str);
            sbLIZ2.append(",aweme = ");
            sbLIZ2.append(aweme.getAid());
            C2188811AlT.LIZIZ(sbLIZ2);
            return c1009450cNL;
        }
        return new C1009460cNM(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LIZIZ(int i, C19EG c19eg, String str, List list) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        String renderStrategy;
        if (list == null || c19eg == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkPrerender,panelName = ");
        sbLIZ.append(str);
        sbLIZ.append(",index = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((Boolean) C0BBT.LIZ.getValue()).booleanValue()) {
            if (!list.isEmpty() && i >= 0 && i <= list.size() - 1 && !((Aweme) ListProtector.get(list, i)).isAd()) {
                int i2 = i + 1;
                if (i2 < list.size() && ((Aweme) ListProtector.get(list, i2)).isAd()) {
                    return;
                }
                int i3 = i - 1;
                if (i3 >= 0 && ((Aweme) ListProtector.get(list, i3)).isAd()) {
                    return;
                }
                int size = list.size();
                for (int i4 = i + 2; i4 < size; i4++) {
                    Aweme aweme = (Aweme) ListProtector.get(list, i4);
                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && !map.isEmpty()) {
                        for (Map.Entry<String, AnoleComponentModel> entry : map.entrySet()) {
                            if (Intrinsics.LJFF(entry.getValue().getRenderStrategy(), "idle_prerender") || Intrinsics.LJFF(entry.getValue().getRenderStrategy(), "prerender") || (renderStrategy = entry.getValue().getRenderStrategy()) == null || renderStrategy.length() == 0) {
                                Aweme aweme2 = (Aweme) ListProtector.get(list, i4);
                                if (aweme2 == null) {
                                    return;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("[checkPrerender],getNeedIdlePrerenderAweme, aid = ");
                                sbLIZ2.append(aweme2.getAid());
                                sbLIZ2.append(", desc = ");
                                sbLIZ2.append(aweme2.getDesc());
                                sbLIZ2.append(",index = ");
                                sbLIZ2.append(i);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                C1000330c8d.LIZ = true;
                                C0NBO.LIZJ(500L, RunnableC1000320c8c.LL);
                                InterfaceC1008930cMV interfaceC1008930cMVLIZJ = LIZJ(c19eg, aweme2, str, true);
                                if (interfaceC1008930cMVLIZJ == null) {
                                    return;
                                }
                                interfaceC1008930cMVLIZJ.LIZLLL();
                                return;
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        if (list.isEmpty() || i < 0 || i > list.size() - 1 || ((Aweme) ListProtector.get(list, i)).isAd()) {
            return;
        }
        int i5 = i + 1;
        if (i5 < list.size() && ((Aweme) ListProtector.get(list, i5)).isAd()) {
            return;
        }
        int i6 = i - 1;
        if (i6 >= 0 && ((Aweme) ListProtector.get(list, i6)).isAd()) {
            return;
        }
        int size2 = list.size();
        for (int i7 = i + 2; i7 < size2; i7++) {
            if (((Aweme) ListProtector.get(list, i7)).isAd()) {
                Aweme aweme3 = (Aweme) ListProtector.get(list, i7);
                if (aweme3 == null) {
                    return;
                }
                C1000330c8d.LIZ = true;
                C0NBO.LIZJ(500L, RunnableC1000320c8c.LL);
                InterfaceC1008930cMV interfaceC1008930cMVLIZJ2 = LIZJ(c19eg, aweme3, str, true);
                if (interfaceC1008930cMVLIZJ2 == null) {
                    return;
                }
                interfaceC1008930cMVLIZJ2.LIZLLL();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    @Override // com.ss.android.ugc.aweme.api.IFeedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1008930cMV LIZJ(android.content.Context r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.FeedServiceImpl.LIZJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean):X.0cMV");
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LJI(int i, Context context, String str, List list) {
        if (list == null || context == null) {
            return;
        }
        if (!list.isEmpty() && i >= 0 && i <= list.size() - 1 && !AwemeExtKt.isAdTraffic((Aweme) ListProtector.get(list, i))) {
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                C0S0L c0s0l = C0S0L.LIZ;
                Aweme aweme = (Aweme) ListProtector.get(list, i2);
                c0s0l.getClass();
                if (C0S0L.LIZLLL(aweme) && i >= i2 + 6) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("remove organic feedcard cache ,cache key = ");
                    sbLIZ.append(((Aweme) ListProtector.get(list, i2)).getAid());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C811103Ev.LIZ(null);
                    Aweme aweme2 = (Aweme) ListProtector.get(list, i2);
                    if (aweme2 != null) {
                        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = LIZJ(context, aweme2, str, true);
                        if (interfaceC1008930cMVLIZJ != null) {
                            interfaceC1008930cMVLIZJ.LJI();
                        }
                        C0S0L.LIZ.getClass();
                        if (C0S0L.LJII(aweme2)) {
                            C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "ttplus_card_show_fail", aweme2));
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkOrganicCardRenderCacheRelease,panelName = ");
        sbLIZ2.append(str);
        sbLIZ2.append(",index = ");
        sbLIZ2.append(i);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.ss.android.ugc.aweme.api.IFeedService
    public final void LJIIL(int i, Context context, String str, List list) {
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ;
        if (list == null || context == null) {
            return;
        }
        if (!list.isEmpty() && i >= 0 && i <= list.size() - 1 && !AwemeExtKt.isAdTraffic((Aweme) ListProtector.get(list, i))) {
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (AwemeExtKt.isAdTraffic((Aweme) ListProtector.get(list, i2)) && i >= i2 + 6) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("remove cache ,cache key = ");
                    sbLIZ.append(((Aweme) ListProtector.get(list, i2)).getAid());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C811103Ev.LIZ(null);
                    Aweme aweme = (Aweme) ListProtector.get(list, i2);
                    if (aweme != null && (interfaceC1008930cMVLIZJ = LIZJ(context, aweme, str, true)) != null) {
                        interfaceC1008930cMVLIZJ.LJI();
                    }
                } else {
                    i2++;
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkRenderCacheRelease,panelName = ");
        sbLIZ2.append(str);
        sbLIZ2.append(",index = ");
        sbLIZ2.append(i);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
