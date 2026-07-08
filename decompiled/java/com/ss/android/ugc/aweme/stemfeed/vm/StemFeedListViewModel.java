package com.ss.android.ugc.aweme.stemfeed.vm;

import X.AbstractC1264080j02;
import X.C09YA;
import X.C1017070cZd;
import X.C1022820ciu;
import X.C1264090j03;
import X.C1264100j04;
import X.C1264120j06;
import X.C1265700j2e;
import X.C1488520oq2;
import X.C1567600qta;
import X.C1582990rIP;
import X.C1588910rRx;
import X.C1618110sD3;
import X.C1697810uHb;
import X.C19719512Dh;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2286608xc;
import X.C2344009Gk;
import X.C627660Ojc;
import X.C729980SkG;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1588940rS0;
import X.InterfaceC1891350zJl;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.stemfeed.settings.UrlStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StemFeedListViewModel extends AssemSingleListViewModel<Aweme, C1567600qta, Long> {
    public boolean LL = true;
    public final C09YA LLILLJJLI = new C09YA(this, AFwS213S0000000_24.get$arr$(350));
    public final List<Aweme> LLILLL = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1567600qta(new C627660Ojc(null, null, null, null, 15), true);
    }

    public final Aweme vQ2() {
        String[] strArr;
        Video video = new Video();
        Aweme aweme = new Aweme();
        aweme.setAid(UUID.randomUUID().toString());
        aweme.setAwemeType(328);
        UrlStruct urlStruct = C1588910rRx.LIZ().bkgdVideo;
        if (urlStruct != null) {
            video.setRatio("720p");
            video.setHeight(1280);
            video.setWidth(720);
            aweme.setVideo(video);
            String[] strArr2 = urlStruct.urlList;
            if (strArr2 != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : strArr2) {
                    arrayList.add(str);
                }
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setUrlList(arrayList);
                videoUrlModel.setUri(urlStruct.uri);
                videoUrlModel.setHeight(1280);
                videoUrlModel.setWidth(720);
                aweme.getVideo().setPlayAddr(videoUrlModel);
                aweme.getVideo().setDownloadAddr(videoUrlModel);
            }
        }
        UrlStruct urlStruct2 = C1588910rRx.LIZ().bkgdVideoCover;
        if (urlStruct2 != null && (strArr = urlStruct2.urlList) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : strArr) {
                arrayList2.add(str2);
            }
            VideoUrlModel videoUrlModel2 = new VideoUrlModel();
            videoUrlModel2.setUrlList(arrayList2);
            videoUrlModel2.setUri(urlStruct2.uri);
            videoUrlModel2.setHeight(1280);
            videoUrlModel2.setWidth(720);
            video.setCover(videoUrlModel2);
            video.setOriginCover(videoUrlModel2);
        }
        return aweme;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<Aweme> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 298));
    }

    public final List<Aweme> wQ2(FeedItemList feedItemList) {
        AwemeRawAd awemeRawAd;
        String creativeIdStr;
        int i;
        String creativeIdStr2;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : feedItemList.getItems()) {
            if (!((ArrayList) this.LLILLL).isEmpty() && C729980SkG.LJFF(aweme, this.LLILLL) >= 0) {
                if (C729980SkG.LJFF(aweme, this.LLILLL) >= 0) {
                    int i2 = 1;
                    if (aweme.isAd() && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && !awemeRawAd3.isEnableFilterSameVideo()) {
                        ((ArrayList) this.LLILLL).add(aweme);
                        arrayList.add(aweme);
                    } else {
                        List<Aweme> list = this.LLILLL;
                        Aweme aweme2 = (Aweme) ListProtector.get(list, C729980SkG.LJFF(aweme, list));
                        if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                            String str = "";
                            if (aweme.isAd()) {
                                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "item_repeat", aweme.getAwemeRawAd());
                                if (aweme2.isAd()) {
                                    i = 1;
                                } else {
                                    i = 2;
                                }
                                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "filter_reason");
                                if (!aweme2.isAd() || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (creativeIdStr2 = awemeRawAd2.getCreativeIdStr()) == null) {
                                    creativeIdStr2 = "";
                                }
                                c1022820ciuLIZLLL.LIZIZ(creativeIdStr2, "repeat_cid");
                                c1022820ciuLIZLLL.LIZIZ(1, "repeat_type");
                                c1022820ciuLIZLLL.LJII();
                            }
                            if (C1017070cZd.LLL(aweme)) {
                                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "show_failed", aweme.getAwemeRawAd());
                                c1022820ciuLIZLLL2.LIZIZ("8", "ad_show_fail_type");
                                if (aweme2.isAd() && (awemeRawAd = aweme2.getAwemeRawAd()) != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null) {
                                    str = creativeIdStr;
                                }
                                c1022820ciuLIZLLL2.LIZIZ(str, "repeat_cid");
                                c1022820ciuLIZLLL2.LJII();
                            }
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            if (!aweme2.isAd()) {
                                i2 = 2;
                            }
                            c2344009Gk.LIZJ(i2, "failed_reason");
                            c2344009Gk.LJIIIIZZ("group_id", aweme2.getAid());
                            C20684815ws.LJIILLIIL("vv_failed", c2344009Gk.LIZ);
                        }
                    }
                }
            } else {
                ((ArrayList) this.LLILLL).add(aweme);
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenRefresh(InterfaceC1364105Vn<? super AbstractC1264080j02<Aweme>> interfaceC1364105Vn) {
        int i;
        List<Aweme> list;
        try {
            if (this.LL) {
                i = 0;
            } else {
                i = 1;
            }
            InterfaceC1588940rS0 interfaceC1588940rS0 = (InterfaceC1588940rS0) this.LLILLJJLI.getValue().getOperator();
            C2286608xc.LJ(6);
            FeedItemList feedItemListLLLLJI = interfaceC1588940rS0.LLLLJI(new C1582990rIP(C2286608xc.LJ(i)));
            this.LL = false;
            if (feedItemListLLLLJI.size() == 0 && !feedItemListLLLLJI.isHasMore()) {
                setState(new AwS603S0100000_24(feedItemListLLLLJI, 299));
                return new C1264120j06(C1697810uHb.LJIILJJIL(vQ2()));
            }
            yQ2(feedItemListLLLLJI);
            ((ArrayList) this.LLILLL).clear();
            List<Aweme> listWQ2 = wQ2(feedItemListLLLLJI);
            if (C19719512Dh.LJI(listWQ2)) {
                list = listWQ2;
            } else {
                list = null;
            }
            xQ2(feedItemListLLLLJI.getRequestId(), list);
            if (feedItemListLLLLJI.isHasMore()) {
                setState(new AwS603S0100000_24(feedItemListLLLLJI, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
                return new C1265700j2e(null, null, listWQ2);
            }
            setState(new AwS603S0100000_24(feedItemListLLLLJI, 301));
            return new C1264120j06(listWQ2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            setState(AFwS264S0000000_24.get$arr$(395));
            return new C1264100j04(e);
        }
    }

    public final void yQ2(FeedItemList feedItemList) {
        Iterator<Aweme> it2 = feedItemList.getItems().iterator();
        while (it2.hasNext()) {
            if (it2.next().isAd()) {
                Iterator<Aweme> it3 = feedItemList.getItems().iterator();
                while (it3.hasNext()) {
                    AwemeBizExtKt.setHasAd(it3.next(), 1);
                }
                return;
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final Object whenLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC1264080j02<Aweme>> interfaceC1364105Vn) {
        List<Aweme> list;
        l.longValue();
        try {
            InterfaceC1588940rS0 interfaceC1588940rS0 = (InterfaceC1588940rS0) this.LLILLJJLI.getValue().getOperator();
            C2286608xc.LJ(6);
            Integer numLJ = C2286608xc.LJ(2);
            if (C1618110sD3.LIZ()) {
                C1488520oq2.LIZJ();
            }
            FeedItemList feedItemListLLLLJI = interfaceC1588940rS0.LLLLJI(new C1582990rIP(numLJ));
            if (feedItemListLLLLJI.size() == 0) {
                setState(new AwS603S0100000_24(feedItemListLLLLJI, 534));
                return C1264090j03.LIZIZ();
            }
            yQ2(feedItemListLLLLJI);
            List<Aweme> listWQ2 = wQ2(feedItemListLLLLJI);
            if (C19719512Dh.LJI(listWQ2)) {
                list = listWQ2;
            } else {
                list = null;
            }
            xQ2(feedItemListLLLLJI.getRequestId(), list);
            if (feedItemListLLLLJI.isHasMore()) {
                setState(new AwS603S0100000_24(feedItemListLLLLJI, 535));
                return new C1265700j2e(null, null, listWQ2);
            }
            setState(new AwS603S0100000_24(feedItemListLLLLJI, 536));
            return new C1264120j06(listWQ2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            setState(AFwS264S0000000_24.get$arr$(653));
            return new C1264100j04(e);
        }
    }

    public final void xQ2(String str, List list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object objLLILLL = ListProtector.get(list, i);
                Aweme aweme = (Aweme) objLLILLL;
                aweme.setRequestId(str);
                IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
                if (iAwemeService != null) {
                    objLLILLL = iAwemeService.LLILLL(aweme);
                }
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                if (iRequestIdService != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(((Aweme) objLLILLL).getAid());
                    sbLIZ.append("36");
                    iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), str);
                }
                ListProtector.set(list, i, objLLILLL);
            }
        }
    }
}
