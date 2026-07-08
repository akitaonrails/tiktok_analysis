package com.ss.android.ugc.aweme.commentv2.uitls;

import X.C01GW;
import X.C11NZ;
import X.C1346140l8O;
import X.C1499810p8F;
import X.C1499850p8J;
import X.C20151213t0;
import X.C2188811AlT;
import X.C2337409Dw;
import X.C452501pT;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.gson.e;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.commentv2.commentlist.ICommentApiV2;
import com.ss.android.ugc.aweme.commentv2.commentlist.TabletCommonParamsInterceptor;
import com.ss.android.ugc.aweme.commentv2.commentlist.net.CommentListTypeAdapterFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPreloadV2 implements InterfaceC727570SgN<ICommentApiV2, C11NZ<CommentItemList>> {
    public static final int $stable = 0;
    public static final C1346140l8O Companion = new C1346140l8O();
    public static final C01GW<HashMap<String, ICommentApiV2>> retrofitMap$delegate = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(237));

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        if (bundle != null && bundle.containsKey("comment_ttl")) {
            return new C1499810p8F(false, Api.LIZ, null, bundle.getInt("comment_ttl"), false, 24);
        }
        return new C1499810p8F(true, Api.LIZ, null, 0, false, 25);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    private final ICommentApiV2 getRetrofitApi(Bundle bundle, Function1<? super Class<ICommentApiV2>, ? extends ICommentApiV2> function1) {
        boolean z = false;
        boolean z2 = bundle.getBoolean("need_split_parse_data", false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPreloadV2.getRetrofitApi needSplitParseData = ");
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z2) {
            return function1.invoke(ICommentApiV2.class);
        }
        C1499810p8F preloadStrategy = getPreloadStrategy(bundle);
        String str = preloadStrategy.LIZJ;
        if (str == null) {
            str = "";
        }
        String taskKey = toTaskKey(preloadStrategy, bundle);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CommentPreloadV2.getRetrofitApi strategy = ");
        sbLIZ2.append(preloadStrategy);
        sbLIZ2.append(", retrofitMap[taskKey]==null = ");
        Companion.getClass();
        C01GW<HashMap<String, ICommentApiV2>> c01gw = retrofitMap$delegate;
        if (c01gw.getValue().get(taskKey) == null) {
            z = true;
        }
        sbLIZ2.append(z);
        sbLIZ2.append(", taskKey = ");
        sbLIZ2.append(taskKey);
        sbLIZ2.append(", baseUrl = ");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        ICommentApiV2 iCommentApiV2 = c01gw.getValue().get(taskKey);
        if (iCommentApiV2 == null) {
            C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
            c1499850p8JCreateBuilder.LJII = preloadStrategy;
            c1499850p8JCreateBuilder.LIZ(new TabletCommonParamsInterceptor());
            e eVarLIZIZ = GsonHolder.LIZIZ();
            CommentListTypeAdapterFactory commentListTypeAdapterFactory = new CommentListTypeAdapterFactory();
            commentListTypeAdapterFactory.LL = true;
            eVarLIZIZ.LIZLLL(commentListTypeAdapterFactory);
            c1499850p8JCreateBuilder.LIZJ(new C2337409Dw(eVarLIZIZ.LIZ()));
            ICommentApiV2 iCommentApiV22 = (ICommentApiV2) c1499850p8JCreateBuilder.build().retrofit.LIZ(ICommentApiV2.class);
            c01gw.getValue().put(taskKey, iCommentApiV22);
            return iCommentApiV22;
        }
        return iCommentApiV2;
    }

    private final String toTaskKey(C1499810p8F c1499810p8F, Bundle bundle) {
        boolean z = C20151213t0.LLJ;
        if (!C20151213t0.LLJ) {
            boolean z2 = false;
            if (bundle != null) {
                z2 = bundle.getBoolean("power_net_preload_key_strict_mode", false);
            }
            String str = c1499810p8F.LIZJ;
            if (str == null) {
                str = "";
            }
            if (!z2) {
                return str;
            }
        }
        return String.valueOf(c1499810p8F.toString().hashCode());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7 A[PHI: r7 r59
      0x01c7: PHI (r7v18 com.ss.android.ugc.aweme.feed.model.search.WordStruct) = 
      (r7v17 com.ss.android.ugc.aweme.feed.model.search.WordStruct)
      (r7v20 com.ss.android.ugc.aweme.feed.model.search.WordStruct)
     binds: [B:70:0x01c5, B:68:0x01c1] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r59v4 java.lang.String) = (r59v2 java.lang.String), (r59v5 java.lang.String) binds: [B:70:0x01c5, B:68:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cd A[PHI: r59
      0x01cd: PHI (r59v3 java.lang.String) = (r59v2 java.lang.String), (r59v4 java.lang.String) binds: [B:70:0x01c5, B:72:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029c  */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C11NZ<com.ss.android.ugc.aweme.comment.model.CommentItemList> preload2(android.os.Bundle r64, kotlin.jvm.functions.Function1<? super java.lang.Class<com.ss.android.ugc.aweme.commentv2.commentlist.ICommentApiV2>, ? extends com.ss.android.ugc.aweme.commentv2.commentlist.ICommentApiV2> r65) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.uitls.CommentPreloadV2.preload2(android.os.Bundle, kotlin.jvm.functions.Function1):X.11NZ");
    }
}
