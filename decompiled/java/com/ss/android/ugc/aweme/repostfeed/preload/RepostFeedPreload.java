package com.ss.android.ugc.aweme.repostfeed.preload;

import X.C08JS;
import X.C11U6;
import X.C135Q;
import X.C1360680lVq;
import X.C1499810p8F;
import X.C1586870rOf;
import X.C1586880rOg;
import X.C1593840rZu;
import X.C1603690rpn;
import X.C1697810uHb;
import X.C1902600zbu;
import X.C2188811AlT;
import X.C5418029g;
import X.EnumC1360670lVp;
import X.EnumC1581150rFR;
import X.EnumC1603630rph;
import X.EnumC2272608vM;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedResponse;
import com.ss.android.ugc.aweme.repostfeed.preload.RepostFeedPreload;
import com.ss.android.ugc.aweme.repostfeed.repo.IRepostFeedApi;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedPreload implements InterfaceC727570SgN<IRepostFeedApi, Future<ComposePbAndJson<C5418029g, RepostFeedResponse>>> {
    public static final C1603690rpn Companion = new Object() { // from class: X.0rpn
    };
    public static String preloadRequestId = "-1";

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(true, Api.LIZ, null, 30000, false, 24);
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload, reason: avoid collision after fix types in other method */
    public Future<ComposePbAndJson<C5418029g, RepostFeedResponse>> preload2(Bundle bundle, Function1<? super Class<IRepostFeedApi>, ? extends IRepostFeedApi> function1) {
        String string;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload, bundle = ");
        if (bundle != null) {
            string = bundle.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        if (bundle == null) {
            return null;
        }
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo(-1, "repost_feed", "repost_feed", "/tiktok/v2/share/feed", C1697810uHb.LJIIJJI("source", "max_count", "pull_type", "insert_ids", "insert_item_metas", "page_token"));
        C1593840rZu c1593840rZu = C1593840rZu.LIZ;
        EnumC1360670lVp enumC1360670lVp = EnumC1360670lVp.NORMAL_FEED;
        EnumC1603630rph enumC1603630rph = EnumC1603630rph.REFRESH;
        c1593840rZu.getClass();
        List listLJ = C1593840rZu.LJ(enumC1360670lVp, enumC1603630rph);
        List listLIZLLL = C1593840rZu.LIZLLL(enumC1360670lVp, enumC1603630rph);
        List listLIZIZ = C1593840rZu.LIZIZ(enumC1360670lVp, enumC1603630rph);
        C1586880rOg c1586880rOgLIZ = C1586870rOf.LIZ();
        C1902600zbu.LIZ.getClass();
        if (C1902600zbu.LIZ() && Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)) {
            i = 1;
        } else {
            i = 0;
        }
        IRepostFeedApi iRepostFeedApiInvoke = function1.invoke(IRepostFeedApi.class);
        int dataLevel = EnumC1581150rFR.SORT.getDataLevel();
        int type = enumC1603630rph.getType();
        String strLIZLLL = C08JS.LIZLLL(c1586880rOgLIZ.LIZ);
        String strLIZLLL2 = C08JS.LIZLLL(c1586880rOgLIZ.LIZIZ);
        String strLIZLLL3 = C08JS.LIZLLL(listLJ);
        String strLIZLLL4 = C08JS.LIZLLL(listLIZLLL);
        String strLIZLLL5 = C08JS.LIZLLL(listLIZIZ);
        C1360680lVq.LIZ.getClass();
        ListenableFuture<ComposePbAndJson<C5418029g, RepostFeedResponse>> repostFeedList = iRepostFeedApiInvoke.getRepostFeedList(i, dataLevel, 6, type, strLIZLLL, strLIZLLL2, strLIZLLL3, strLIZLLL4, null, strLIZLLL5, C1360680lVq.LIZJ(), null, preloadExtraInfo);
        repostFeedList.LJIIJJI(new C135Q(repostFeedList, new C11U6<ComposePbAndJson<C5418029g, RepostFeedResponse>>() { // from class: X.0rpi
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
            }

            @Override // X.C11U6
            public final void onSuccess(ComposePbAndJson<C5418029g, RepostFeedResponse> composePbAndJson) {
                ComposePbAndJson<C5418029g, RepostFeedResponse> composePbAndJson2 = composePbAndJson;
                if (composePbAndJson2 != null) {
                    C1603690rpn c1603690rpn = RepostFeedPreload.Companion;
                    String requestId = composePbAndJson2.getRequestId();
                    c1603690rpn.getClass();
                    RepostFeedPreload.preloadRequestId = requestId;
                }
            }
        }), EnumC2272608vM.LL);
        return repostFeedList;
    }
}
