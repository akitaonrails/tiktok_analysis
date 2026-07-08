package com.ss.android.ugc.aweme.ad.comment.reviewtab.vm;

import X.AbstractC1052910dVR;
import X.AbstractC1843910y5F;
import X.C01GW;
import X.C098200Yq;
import X.C0P0T;
import X.C1002170cBb;
import X.C1022620cia;
import X.C1052880dVO;
import X.C1052890dVP;
import X.C1052900dVQ;
import X.C1052920dVS;
import X.C1052930dVT;
import X.C1052940dVU;
import X.C1843770y51;
import X.C1843830y57;
import X.C1843860y5A;
import X.C1843870y5B;
import X.C1843880y5C;
import X.C1843890y5D;
import X.C1843900y5E;
import X.C1843920y5G;
import X.C1843930y5H;
import X.C1843950y5J;
import X.C1843970y5L;
import X.C1843990y5N;
import X.C1844030y5R;
import X.C1844040y5S;
import X.C1844050y5T;
import X.C1844060y5U;
import X.C1844310y5t;
import X.C1850390yFh;
import X.C1850440yFm;
import X.C189200o6;
import X.C1954807lC;
import X.C1BNE;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.ConvertInfo;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.Review;
import com.ss.android.ugc.aweme.commercialize.model.commenttab.ReviewArea;
import com.ss.android.ugc.aweme.commercialize.model.commenttab.SortItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ReviewViewModel extends ViewModel {
    public C1843830y57 LL;
    public boolean LLJ;
    public Pair<? extends C0P0T, Integer> LLILLJJLI = new Pair<>(null, 0);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 208));
    public final C2252321DDq LLILZ = C1BNE.LIZ(C1843970y5L.LIZ);
    public final C2252321DDq LLILZIL = C1BNE.LIZ(null);
    public final C2252321DDq LLILZLL = C1BNE.LIZ(null);
    public final C2252321DDq LLIZ = C1BNE.LIZ(null);
    public final C2252321DDq LLIZLLLIL = C1BNE.LIZ(null);
    public final C2252321DDq LLJI = C1BNE.LIZ(new C1843770y51("Reviews"));
    public final C2252321DDq LLJIJIL = C1BNE.LIZ(null);

    public final AwemeRawAd vQ2() {
        Aweme aweme;
        C1843830y57 c1843830y57 = this.LL;
        if (c1843830y57 == null || (aweme = (Aweme) c1843830y57.LIZIZ.LLILZ.getValue()) == null) {
            return null;
        }
        return aweme.getAwemeRawAd();
    }

    public final C1002170cBb xQ2() {
        return (C1002170cBb) this.LLILLL.getValue();
    }

    public final String zQ2() {
        User curUser;
        String nickname;
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        return (iAccountUserService == null || (curUser = iAccountUserService.getCurUser()) == null || (nickname = curUser.getNickname()) == null) ? "" : nickname;
    }

    public static long wQ2() {
        Object c098200Yq;
        try {
            c098200Yq = Long.valueOf(CastLongProtector.parseLong(((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).getCurUserId()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0L;
        }
        return ((Number) c098200Yq).longValue();
    }

    public final int yQ2() {
        ReviewArea reviewArea;
        List<SortItem> sortList;
        SortItem sortItem;
        AwemeRawAd awemeRawAdVQ2 = vQ2();
        if (awemeRawAdVQ2 == null || (reviewArea = awemeRawAdVQ2.getReviewArea()) == null || (sortList = reviewArea.getSortList()) == null || (sortItem = (SortItem) ListProtector.get(sortList, this.LLILLJJLI.getSecond().intValue())) == null) {
            return 0;
        }
        return sortItem.getOrderType();
    }

    public final void AQ2(AbstractC1843910y5F abstractC1843910y5F) {
        C1002170cBb c1002170cBbXQ2;
        C1843990y5N c1843990y5N;
        ConvertInfo convertInfo;
        String convertId;
        if (abstractC1843910y5F instanceof C1843870y5B) {
            int i = ((C1843870y5B) abstractC1843910y5F).LIZ;
            C1022620cia.LIZ("ReviewVM", "loadReviews: start");
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1844030y5R(this, i, null), 3);
            return;
        }
        if (abstractC1843910y5F instanceof C1843890y5D) {
            C1843890y5D c1843890y5D = (C1843890y5D) abstractC1843910y5F;
            Review review = c1843890y5D.LIZ;
            boolean z = c1843890y5D.LIZIZ;
            C1022620cia.LIZ("ReviewVM", "publishReview");
            Object value = this.LLILZ.getValue();
            if (!(value instanceof C1843990y5N) || (c1843990y5N = (C1843990y5N) value) == null || (convertInfo = c1843990y5N.LIZJ) == null || (convertId = convertInfo.getConvertId()) == null) {
                return;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1844060y5U(this, z, review, convertInfo, convertId, null), 3);
            return;
        }
        if (abstractC1843910y5F instanceof C1843920y5G) {
            Review review2 = ((C1843920y5G) abstractC1843910y5F).LIZ;
            C1022620cia.LIZ("ReviewVM", "deleteReview: start");
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1844040y5S(review2, this, null), 3);
            return;
        }
        if (abstractC1843910y5F instanceof C1843950y5J) {
            C1843950y5J c1843950y5J = (C1843950y5J) abstractC1843910y5F;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1844050y5T(c1843950y5J.LIZ, c1843950y5J.LIZIZ, this, null), 3);
            return;
        }
        if (abstractC1843910y5F instanceof C1843860y5A) {
            boolean z2 = ((C1843860y5A) abstractC1843910y5F).LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTabSelectionChanged: ");
            sbLIZ.append(this.LLJ);
            sbLIZ.append(" -> ");
            sbLIZ.append(z2);
            C1022620cia.LIZ("ReviewVM", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJ = z2;
            BQ2(false);
            if (!z2 || (c1002170cBbXQ2 = xQ2()) == null) {
                return;
            }
            c1002170cBbXQ2.logAd(C1850440yFm.LIZ);
            return;
        }
        if (abstractC1843910y5F instanceof C1843880y5C) {
            BQ2(((C1843880y5C) abstractC1843910y5F).LIZ);
            return;
        }
        if (abstractC1843910y5F instanceof C1843930y5H) {
            C1843930y5H c1843930y5H = (C1843930y5H) abstractC1843910y5F;
            Review review3 = c1843930y5H.LIZ;
            AbstractC1052910dVR abstractC1052910dVR = c1843930y5H.LIZIZ;
            if (abstractC1052910dVR instanceof C1052900dVQ) {
                this.LLIZLLLIL.setValue(new C1052890dVP(review3, new C1052940dVU(((C1052900dVQ) abstractC1052910dVR).LIZ)));
                C1002170cBb c1002170cBbXQ22 = xQ2();
                if (c1002170cBbXQ22 == null) {
                    return;
                }
                c1002170cBbXQ22.logAd(C1850390yFh.LIZ, new C1844310y5t(yQ2(), review3.id, true));
                return;
            }
            if (abstractC1052910dVR instanceof C1052940dVU) {
                this.LLIZLLLIL.setValue(new C1052890dVP(review3, new C1052900dVQ(((C1052940dVU) abstractC1052910dVR).LIZ)));
                C1002170cBb c1002170cBbXQ23 = xQ2();
                if (c1002170cBbXQ23 == null) {
                    return;
                }
                c1002170cBbXQ23.logAd(C1850390yFh.LIZ, new C1844310y5t(yQ2(), review3.id, false));
                return;
            }
            if (Intrinsics.LJFF(abstractC1052910dVR, C1052930dVT.LIZ)) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1052880dVO(review3, this, null), 3);
                return;
            } else if (Intrinsics.LJFF(abstractC1052910dVR, C1052920dVS.LIZ)) {
                return;
            } else {
                throw new C1954807lC();
            }
        }
        if (Intrinsics.LJFF(abstractC1843910y5F, C1843900y5E.LIZ)) {
            C0P0T first = this.LLILLJJLI.getFirst();
            if (first == null) {
                return;
            }
            first.dismiss();
            return;
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BQ2(boolean r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel.BQ2(boolean):void");
    }
}
