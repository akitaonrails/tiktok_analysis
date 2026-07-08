package com.ss.android.ugc.aweme.story.feed.guideuploadcard;

import X.C01GW;
import X.C09C2;
import X.C0M9T;
import X.C0XLO;
import X.C0XM9;
import X.C0XS7;
import X.C1499330p7T;
import X.C1618440sDa;
import X.C2188811AlT;
import X.C452501pT;
import X.C718010SEl;
import X.C718020SEm;
import X.C718040SEo;
import X.InterfaceC718030SEn;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.service.IStoryDebugService;
import com.ss.android.ugc.aweme.story.feed.InsertStruct;
import com.ss.android.ugc.aweme.story.feed.StoryGuideCardInfo;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryInsertCard;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideUploadCardInterceptor implements NetworkPartner.ResponseHandler, NetworkPartner.RequestHandler {
    public static final StoryGuideUploadCardInterceptor LIZ = new StoryGuideUploadCardInterceptor();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C718020SEm());

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    public final void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) {
        boolean zLIZJ;
        StoryGetFeedByPageResponse storyGetFeedByPageResponse;
        List<StoryInsertCard> insertCards;
        InterfaceC718030SEn interfaceC718030SEnLJJIJIIJIL;
        if (!a0.LJJIIZI(c0xs7.LIZIZ.LJIIIIZZ, "/tiktok/v1/story/get_feed_by_page", false)) {
            return;
        }
        IStoryDebugService iStoryDebugService = (IStoryDebugService) LIZIZ.getValue();
        if (iStoryDebugService != null) {
            zLIZJ = iStoryDebugService.LIZJ();
        } else {
            zLIZJ = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mockGuideUploadCard: ");
        sbLIZ.append(zLIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        T t = c0xs7.LJII;
        StoryInsertCard storyInsertCard = null;
        if (!(t instanceof StoryGetFeedByPageResponse) || (storyGetFeedByPageResponse = (StoryGetFeedByPageResponse) t) == null || (insertCards = storyGetFeedByPageResponse.getInsertCards()) == null || insertCards.isEmpty()) {
            return;
        }
        Iterator<StoryInsertCard> it2 = insertCards.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            StoryInsertCard next = it2.next();
            if (next.cardType == 1) {
                storyInsertCard = next;
                break;
            }
        }
        StoryInsertCard storyInsertCard2 = storyInsertCard;
        if (storyInsertCard2 != null) {
            StoryGuideUploadCardManager.LL.getClass();
            StoryGuideUploadCardManager.LIZIZ(storyInsertCard2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("response cards,cardType: ");
            sbLIZ2.append(storyInsertCard2.cardType);
            sbLIZ2.append(", insertIndex:");
            sbLIZ2.append(storyInsertCard2.insertIndex);
            sbLIZ2.append(", coverUrls:");
            sbLIZ2.append(storyInsertCard2.coverUrls);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        ArrayList arrayList = new ArrayList();
        for (StoryInsertCard storyInsertCard3 : insertCards) {
            if (storyInsertCard3.cardType == 2) {
                arrayList.add(storyInsertCard3);
            }
        }
        if ((!arrayList.isEmpty()) && (interfaceC718030SEnLJJIJIIJIL = C1618440sDa.LIZIZ.LJJIJIIJIL()) != null) {
            interfaceC718030SEnLJJIJIIJIL.LIZ(arrayList);
        }
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        boolean zLIZJ;
        C0XLO c0xlo = c0xm9.LIZJ;
        if (!a0.LJJIIZI(c0xlo.LJIIIIZZ, "/tiktok/v1/story/get_feed_by_page", false)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        IStoryDebugService iStoryDebugService = (IStoryDebugService) LIZIZ.getValue();
        if (iStoryDebugService != null) {
            zLIZJ = iStoryDebugService.LIZJ();
        } else {
            zLIZJ = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mockGuideUploadCard: ");
        sbLIZ.append(zLIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zLIZJ) {
            arrayList.add(new InsertStruct(1));
        } else {
            StoryGuideUploadCardManager.LL.getClass();
            if (StoryGuideUploadCardManager.LIZ()) {
                arrayList.add(new InsertStruct(1));
            }
        }
        if (C0M9T.LIZ().enable24hEducation || C0M9T.LIZ().enableAILiveEducationSuppression || C0M9T.LIZ().enableViewerInsightOverlay) {
            C718010SEl.LIZ.getClass();
            if (!C718010SEl.LJIIJ()) {
                arrayList.add(new InsertStruct(2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(Integer.valueOf(((InsertStruct) obj).cardType))) {
                arrayList2.add(obj);
            }
        }
        String json = GsonProtectorUtils.toJson(C09C2.LIZ(), new StoryGuideCardInfo(arrayList2));
        c0xlo.LJI.LIZLLL("insert_card_info", json);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cardInfoQueryString:");
        sbLIZ2.append(json);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
