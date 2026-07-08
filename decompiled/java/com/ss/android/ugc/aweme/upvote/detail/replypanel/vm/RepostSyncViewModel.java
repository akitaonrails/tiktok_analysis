package com.ss.android.ugc.aweme.upvote.detail.replypanel.vm;

import X.AbstractC1387200mCc;
import X.C11NJ;
import X.C1357810lRD;
import X.C1357900lRM;
import X.C1358380lS8;
import X.C1359520lTy;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1554610qYd;
import X.C1906580ziK;
import X.C19EG;
import X.InterfaceC0148002o;
import X.InterfaceC1360310lVF;
import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostSyncViewModel extends AssemViewModel<C1357900lRM> implements InterfaceC1360310lVF {
    public static final /* synthetic */ int LLILLL = 0;
    public boolean LL;
    public final C11NJ LLILLJJLI = new C11NJ();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1357900lRM(null, null, null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC1360310lVF
    public final boolean aU1() {
        return this.LL;
    }

    public final void L1(int i) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            c1389890mGx.LJIIJ(c19egLIZIZ.getString(i));
            c1389890mGx.LIZLLL(2000L);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void xQ2(int i, String str, String str2, boolean z) {
        C1359520lTy c1359520lTy = new C1359520lTy(i, str, str2, z);
        setState(new AwS600S0100000_21(c1359520lTy, 299));
        List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, IRepostInteractionSyncProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                ((IRepostInteractionSyncProtocol) it2.next()).E22(c1359520lTy);
            }
        }
    }

    public final void vQ2(int i, Aweme aweme, String str, String str2, boolean z) {
        int i2;
        if (z) {
            i2 = i - 1;
        } else {
            i2 = i + 1;
        }
        C1358380lS8 c1358380lS8 = C1358380lS8.LIZ;
        String aid = aweme.getAid();
        boolean z2 = !z;
        c1358380lS8.getClass();
        C1358380lS8.LJII(i2, aid, str, str2, z2);
        aweme.getAid();
        xQ2(i2, str, str2, z2);
    }

    public final void wQ2(String str, RepostReplyStruct repostReplyStruct, UpvoteCacheState upvoteCacheState, Integer num, String str2) {
        C1357810lRD c1357810lRD = new C1357810lRD(str, repostReplyStruct, upvoteCacheState, num, str2);
        setState(new AwS600S0100000_21(c1357810lRD, 185));
        List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, IRepostInteractionSyncProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                ((IRepostInteractionSyncProtocol) it2.next()).Zc1(c1357810lRD);
            }
        }
    }
}
