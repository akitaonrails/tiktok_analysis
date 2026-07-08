package com.ss.android.ugc.aweme.poi.uiwidget;

import X.C1190150h4n;
import X.C1190560h5S;
import X.C1190590h5V;
import X.C23250099c;
import X.EnumC1190080h4g;
import X.EnumC1190580h5U;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS33S0000100_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewHelpfulVM extends AssemViewModel<C1190560h5S> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1190560h5S(null, null);
    }

    public final void vQ2(PoiReviewsApi.PoiReviewModel poiReviewModel, Function1<? super PoiReviewsApi.PoiReviewModel, Unit> function1) {
        long jLongValue;
        EnumC1190580h5U enumC1190580h5U = getState().LL;
        if (enumC1190580h5U != null) {
            int i = C1190590h5V.LIZ[enumC1190580h5U.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    if (poiReviewModel != null) {
                        wQ2(poiReviewModel, true, function1);
                    }
                    Long l = getState().LLILLJJLI;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    setState(new AwS33S0000100_18(jLongValue - 1, 4));
                    return;
                }
                return;
            }
            if (poiReviewModel != null) {
                wQ2(poiReviewModel, false, function1);
            }
            setState(AFwS256S0000000_18.get$arr$(697));
        }
    }

    public final void wQ2(PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z, Function1<? super PoiReviewsApi.PoiReviewModel, Unit> function1) {
        String reviewId;
        int value;
        boolean zLJFF;
        long jLongValue;
        boolean zLJFF2;
        Long l;
        String poiId = poiReviewModel.getPoiId();
        if (poiId == null || (reviewId = poiReviewModel.getReviewId()) == null) {
            return;
        }
        if (z) {
            value = EnumC1190080h4g.CANCEL_LIKE.getValue();
        } else {
            value = EnumC1190080h4g.LIKE.getValue();
        }
        boolean z2 = !z;
        PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
        if (userStatus != null) {
            zLJFF = Intrinsics.LJFF(userStatus.liked, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
        if (statistics != null && (l = statistics.likeCount) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
        if (userStatus2 != null) {
            zLJFF2 = Intrinsics.LJFF(userStatus2.disliked, Boolean.TRUE);
        } else {
            zLJFF2 = false;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1190150h4n(poiId, reviewId, value, poiReviewModel, this, jLongValue, zLJFF, zLJFF2, z2, function1, null), 3);
    }
}
