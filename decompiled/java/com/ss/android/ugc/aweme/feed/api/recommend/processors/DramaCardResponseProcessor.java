package com.ss.android.ugc.aweme.feed.api.recommend.processors;

import X.C09C2;
import X.C09CT;
import X.C0C64;
import X.C1578370rAx;
import X.C1601460rmC;
import X.C1601650rmV;
import X.C718180SFc;
import X.C718190SFd;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.LynxTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaCardResponseProcessor extends C1601650rmV {
    public DramaCardResponseProcessor() {
        super("drama_card_response");
    }

    public static final class DramaBizInfo {

        @C09CT("series_card_type")
        public final String seriesCardType;

        public DramaBizInfo() {
            this(null);
        }

        public DramaBizInfo(String str) {
            this.seriesCardType = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // X.C1601650rmV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1601460rmC r6, com.ss.android.ugc.aweme.feed.model.FeedItemList r7) {
        /*
            r5 = this;
            java.util.List r0 = r7.getItems()
            if (r0 == 0) goto L96
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo r0 = r0.getCardInsertInfo()
            if (r0 == 0) goto Lf
            int r1 = r0.getCardType()
            r0 = 92
            if (r1 != r0) goto Lf
            r4.add(r2)
            goto Lf
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            com.ss.android.ugc.aweme.feed.model.PaidContentInfo r0 = r3.mPaidContentInfo
            if (r0 == 0) goto L94
            com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo r0 = r0.getMiniDramaCardInfo()
            if (r0 == 0) goto L94
            java.lang.Integer r2 = r0.style
        L4a:
            com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle r0 = com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle.MINI_DRAMA_FEED_CARD_STYLE_LIST
            int r1 = r0.getValue()
            if (r2 == 0) goto L58
            int r0 = r2.intValue()
            if (r0 == r1) goto L66
        L58:
            com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle r0 = com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle.MINI_DRAMA_FEED_CARD_STYLE_DEFAULT
            int r1 = r0.getValue()
            if (r2 == 0) goto L8d
            int r0 = r2.intValue()
            if (r0 != r1) goto L8d
        L66:
            com.ss.android.ugc.aweme.feed.model.PaidContentInfo r0 = r3.mPaidContentInfo
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo r0 = r0.getMiniDramaCardInfo()
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.bgImg
            if (r0 == 0) goto L8d
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L8d
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            X.0kl3 r0 = X.C1331660kl2.LJI(r0)
            r0.LJIILL()
        L8d:
            r0 = 819200(0xc8000, float:1.147944E-39)
            X.C1483340ohg.LJIL(r0, r3)
            goto L32
        L94:
            r2 = 0
            goto L4a
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.api.recommend.processors.DramaCardResponseProcessor.LIZIZ(X.0rmC, com.ss.android.ugc.aweme.feed.model.FeedItemList):void");
    }

    @Override // X.C1601650rmV
    public final void LIZJ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
        List<Aweme> items;
        VideoControl videoControl;
        String cardInsertStatus;
        Object obj;
        MiniDramaCardInfo miniDramaCardInfo;
        Video video;
        List<Aweme> items2 = feedItemList.getItems();
        if (items2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : items2) {
                if (aweme.isPaidContent) {
                    arrayList.add(aweme);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AwemeExtKt.appendMobParam((Aweme) it2.next(), "enter_from", "homepage_hot");
            }
        }
        List<Aweme> items3 = feedItemList.getItems();
        if (items3 != null) {
            ArrayList<Aweme> arrayList2 = new ArrayList();
            for (Aweme aweme2 : items3) {
                CardInsertInfo cardInsertInfo = aweme2.getCardInsertInfo();
                if (cardInsertInfo != null && cardInsertInfo.getCardType() == 92) {
                    arrayList2.add(aweme2);
                }
            }
            for (Aweme aweme3 : arrayList2) {
                CardInsertInfo cardInsertInfo2 = aweme3.getCardInsertInfo();
                if (cardInsertInfo2 != null) {
                    cardInsertStatus = cardInsertInfo2.getCardInsertStatus();
                } else {
                    cardInsertStatus = null;
                }
                MiniDramaCardInfo miniDramaCardInfo2 = (MiniDramaCardInfo) GsonProtectorUtils.fromJson(C09C2.LIZ(), cardInsertStatus, MiniDramaCardInfo.class);
                PaidContentInfo paidContentInfo = new PaidContentInfo();
                paidContentInfo.setMiniDramaCardInfo(miniDramaCardInfo2);
                aweme3.mPaidContentInfo = paidContentInfo;
                if (miniDramaCardInfo2 != null && (video = miniDramaCardInfo2.bgmVideo) != null) {
                    aweme3.setVideo(video);
                }
                CardInsertInfo cardInsertInfo3 = aweme3.getCardInsertInfo();
                if (cardInsertInfo3 != null) {
                    LynxTemplate lynxTemplate = new LynxTemplate("", "", null, 0, "", "", "", "");
                    Gson gsonLIZ = C09C2.LIZ();
                    PaidContentInfo paidContentInfo2 = aweme3.mPaidContentInfo;
                    String str = "";
                    if (paidContentInfo2 == null || (miniDramaCardInfo = paidContentInfo2.getMiniDramaCardInfo()) == null || (obj = miniDramaCardInfo.style) == null) {
                        obj = "";
                    }
                    if (Intrinsics.LJFF(obj, 0)) {
                        str = "list_6drama";
                    } else if (Intrinsics.LJFF(obj, 1)) {
                        str = "list_3drama";
                    }
                    lynxTemplate.setBizInfo(GsonProtectorUtils.toJson(gsonLIZ, new DramaBizInfo(str)));
                    cardInsertInfo3.setLynxTemplate(lynxTemplate);
                }
            }
        }
        C1578370rAx.LIZ.getClass();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "short_drama_struct_preprocess", true, false) && (items = feedItemList.getItems()) != null) {
            for (Aweme aweme4 : items) {
                if (aweme4 != null) {
                    PaidContentInfo paidContentInfo3 = aweme4.mPaidContentInfo;
                    if (paidContentInfo3 != null) {
                        C718180SFc.LIZ(paidContentInfo3);
                    }
                    if (C718190SFd.LIZLLL(aweme4, "homepage_hot") && (videoControl = aweme4.getVideoControl()) != null) {
                        videoControl.showProgressBar = 0;
                    }
                }
            }
        }
    }
}
