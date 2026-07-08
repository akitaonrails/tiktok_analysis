package com.ss.android.ugc.aweme.ad.comment;

import X.C01GW;
import X.C1009310cN7;
import X.C1024380clQ;
import X.C1049310dPd;
import X.C1049320dPe;
import X.C1049340dPg;
import X.C1049380dPk;
import X.C13LP;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1009320cN8;
import X.InterfaceC1049390dPl;
import X.InterfaceC1049630dQ9;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ad.comment.component.CommerceCommentPowerCell;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.CommentReviewTabFragment;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceCommentServiceImpl implements ICommerceCommentService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(167));

    @Override // com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService
    public final Class<? extends PowerCell<?>> LIZJ() {
        return CommerceCommentPowerCell.class;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0dPj] */
    @Override // com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService
    public final InterfaceC1049630dQ9 LIZ(final String str) {
        if (str == null) {
            return null;
        }
        InterfaceC1049630dQ9 interfaceC1049630dQ9 = (InterfaceC1049630dQ9) ((Map) this.LIZ.getValue()).get(str);
        if (interfaceC1049630dQ9 == null) {
            C1049380dPk c1049380dPk = new C1049380dPk(new InterfaceC1049390dPl(str) { // from class: X.0dPj
                public final String LIZ;

                @Override // X.InterfaceC1049390dPl
                public final String getScene() {
                    return this.LIZ;
                }

                {
                    this.LIZ = str;
                }
            });
            ((Map) this.LIZ.getValue()).put(str, c1049380dPk);
            return c1049380dPk;
        }
        return interfaceC1049630dQ9;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService
    public final void LIZLLL(List<? extends Comment> list) {
        if (list == null) {
            return;
        }
        List listLJJJJLI = C13LP.LJJJJLI(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJJJJLI) {
            if (((Comment) obj).getAwemeRawAd() != null) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1049320dPe c1049320dPe = new C1049320dPe(((Comment) it2.next()).getAwemeRawAd());
            C1049310dPd.LIZ.getClass();
            c1049320dPe.logAd(C1049310dPd.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService
    public final CommentReviewTabFragment LJ(Aweme aweme) {
        CommentReviewTabFragment commentReviewTabFragment = new CommentReviewTabFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "reviews_host_aweme", aweme);
        commentReviewTabFragment.setArguments(bundle);
        return commentReviewTabFragment;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0cN9] */
    @Override // com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService
    public final C1009310cN7 LIZIZ(final Context context, final Aweme aweme) {
        if (context == null || aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return null;
        }
        C1009310cN7 c1009310cN7 = new C1009310cN7(new InterfaceC1009320cN8(context, aweme) { // from class: X.0cN9
            public final Context LIZ;
            public final Aweme LIZIZ;

            @Override // X.InterfaceC1009320cN8
            public final Aweme getAweme() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1009320cN8
            public final Context getContext() {
                return this.LIZ;
            }

            {
                this.LIZ = context;
                this.LIZIZ = aweme;
            }
        });
        c1009310cN7.initialize();
        return c1009310cN7;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r6, java.util.List r7, boolean r8) {
        /*
            r5 = this;
            if (r6 == 0) goto L3a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r6.getAwemeRawAd()
            if (r4 == 0) goto L3a
            X.0dPe r2 = new X.0dPe
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 0
            r1[r0] = r4
            r2.<init>(r1)
            if (r8 == 0) goto L55
            X.0ckk r0 = X.C1001170c9z.LIZ
            r2.logAd(r0)
            com.ss.android.ugc.aweme.commercialize.model.commenttab.ReviewArea r0 = r4.getReviewArea()
            if (r0 != 0) goto L46
            if (r7 == 0) goto L3b
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r7.contains(r0)
            if (r0 != r3) goto L3b
        L2e:
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r7.contains(r0)
            if (r0 != r3) goto L49
        L3a:
            return
        L3b:
            X.0ckk r1 = X.C1049410dPn.LIZ
            r0 = 561(0x231, float:7.86E-43)
            kotlin.jvm.internal.AFwS252S0000000_16 r0 = kotlin.jvm.internal.AFwS252S0000000_16.get$arr$(r0)
            r2.logAd(r1, r0)
        L46:
            if (r7 == 0) goto L49
            goto L2e
        L49:
            X.0ckk r1 = X.C1049410dPn.LIZ
            r0 = 562(0x232, float:7.88E-43)
            kotlin.jvm.internal.AFwS252S0000000_16 r0 = kotlin.jvm.internal.AFwS252S0000000_16.get$arr$(r0)
            r2.logAd(r1, r0)
            return
        L55:
            X.0ckk r0 = X.C1002440cC2.LIZ
            r2.logAd(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.comment.CommerceCommentServiceImpl.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.List, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService
    public final C1049340dPg LJI(Comment comment, Aweme aweme, String str) {
        Aweme awemeM199clone;
        String itemId;
        if (aweme != null && (awemeM199clone = aweme.m199clone()) != null) {
            AwemeRawAd awemeRawAd = comment.getAwemeRawAd();
            if (awemeRawAd == null || (itemId = awemeRawAd.getItemId()) == null) {
                itemId = "";
            }
            awemeM199clone.setAid(itemId);
            awemeM199clone.setAd(true);
            awemeM199clone.setAwemeRawAd(comment.getAwemeRawAd());
        } else {
            awemeM199clone = null;
        }
        ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).G0();
        C1024380clQ.LJIILIIL(Collections.singletonList(awemeM199clone), null, null);
        return new C1049340dPg(comment, awemeM199clone, str);
    }
}
