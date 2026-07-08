package com.ss.android.ugc.aweme.share.download.event.provider.download;

import X.C0SP9;
import X.C1376270luz;
import X.C1376320lv4;
import X.C1380760m2E;
import X.C1380770m2F;
import X.C1380780m2G;
import X.C1380820m2K;
import X.C1380840m2M;
import X.C1383360m6Q;
import X.C1554960qZC;
import X.C2214201BlK;
import X.C523420Kfs;
import X.C735370Ssx;
import X.C735400St0;
import X.C735840Sti;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import android.app.Activity;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadEventParamsGroupProvider implements BaseDownloadParamsGroupProvider<C1380760m2E> {
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C1380780m2G c1380780m2G;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C1380840m2M c1380840m2M;
        String idStr;
        GScope gScope = GScope.LL;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(gScope, "Download", C1380780m2G.class, null);
        if (interfaceC1555100qZQLIZIZ2 == null || (c1380780m2G = (C1380780m2G) interfaceC1555100qZQLIZIZ2.getSource()) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(gScope, "Download", C1380840m2M.class, null)) == null || (c1380840m2M = (C1380840m2M) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ3 = C1554960qZC.LIZIZ(gScope, "Download", C1380770m2F.class, null);
        C1380770m2F c1380770m2F = interfaceC1555100qZQLIZIZ3 != null ? (C1380770m2F) interfaceC1555100qZQLIZIZ3.getSource() : null;
        Aweme aweme = c1380780m2G.LLILLJJLI;
        C735400St0 c735400St0LIZ = C1380820m2K.LIZ(aweme);
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        C1376320lv4.LIZ.getClass();
        String strLIZ = C1376320lv4.LIZ(aweme);
        String strLIZIZ = C1376320lv4.LIZIZ(c1380780m2G.LLILZ);
        C1376270luz.LIZ.getClass();
        String strValueOf = String.valueOf(C1376270luz.LJIIIZ);
        String strLJI = C735370Ssx.LJI(aweme);
        String str = c1380840m2M.LL;
        int i = c1380780m2G.LLILZLL;
        boolean zIsSubOnlyVideo = aweme.isSubOnlyVideo();
        String str2 = c1380840m2M.LLILZIL ? CardStruct.IStatusCode.DEFAULT : "1";
        C735840Sti c735840Sti = C735840Sti.LIZ;
        Activity activityLJFF = C2214201BlK.LJFF();
        c735840Sti.getClass();
        String strLJIIJ = C735840Sti.LJIIJ(activityLJFF, null, null);
        String strValueOf2 = String.valueOf(aweme.aigcInfo.getAIGCLabelType());
        String strValueOf3 = String.valueOf(((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJI(C2214201BlK.LJFF(), aweme));
        Music music = aweme.getMusic();
        if (music == null || (idStr = music.getIdStr()) == null) {
            idStr = "";
        }
        C1380760m2E c1380760m2E = new C1380760m2E(authorUid, strLIZ, strLIZIZ, strValueOf, strLJI, str, i, zIsSubOnlyVideo ? 1 : 0, str2, strLJIIJ, strValueOf2, strValueOf3, idStr, AwemeExtKt.getMixId(aweme), c1380840m2M.LLILZ, c735400St0LIZ.LIZ, c735400St0LIZ.LIZIZ, c1380840m2M.LLILLJJLI, aweme, c1380780m2G.LLILLL, c1380840m2M.LLILLL, C0SP9.LIZJ(aweme), Intrinsics.LJFF("homepage_hot", c1380780m2G.LLILLL) ? C1383360m6Q.LIZ(aweme) : "");
        CommentService.LIZ.getClass();
        Map<String, String> contentRecReasonParams = C523420Kfs.LIZ().getContentRecReasonParams(aweme, c1380780m2G.LLILLL);
        if (contentRecReasonParams != null) {
            c1380760m2E.LLJJJJLIIL = contentRecReasonParams.get("query_id");
            c1380760m2E.LLJJL = contentRecReasonParams.get("recalled_query");
            c1380760m2E.LLJJLIIIJLLLLLLLZ = contentRecReasonParams.get("recalled_query_search_ts");
        }
        if (c1380770m2F != null) {
            c1380760m2E.LLJLIL = c1380770m2F.LLILLJJLI;
            c1380760m2E.LLJLILLLLZIIL = c1380770m2F.LLILLL;
            c1380760m2E.LLJLL = c1380770m2F.LLILZ;
            c1380760m2E.LLJLLIL = c1380770m2F.LLILZIL;
            c1380760m2E.LLJLLL = c1380770m2F.LLILZLL;
        }
        return c1380760m2E;
    }
}
