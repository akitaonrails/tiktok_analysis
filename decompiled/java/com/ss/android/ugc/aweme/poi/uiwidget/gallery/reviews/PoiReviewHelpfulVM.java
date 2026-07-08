package com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews;

import X.C1191370h6l;
import X.C1191400h6o;
import X.C1191430h6r;
import X.C23250099c;
import X.EnumC1190080h4g;
import X.EnumC1191410h6p;
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
public final class PoiReviewHelpfulVM extends AssemViewModel<C1191400h6o> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1191400h6o(null, null);
    }

    public final void vQ2(PoiReviewsGalleryData poiReviewsGalleryData, Function1<? super PoiReviewsGalleryData, Unit> function1) {
        long jLongValue;
        EnumC1191410h6p enumC1191410h6p = getState().LL;
        if (enumC1191410h6p != null) {
            int i = C1191430h6r.LIZ[enumC1191410h6p.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    if (poiReviewsGalleryData != null) {
                        wQ2(poiReviewsGalleryData, true, function1);
                    }
                    Long l = getState().LLILLJJLI;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    setState(new AwS33S0000100_18(jLongValue - 1, 6));
                    return;
                }
                return;
            }
            if (poiReviewsGalleryData != null) {
                wQ2(poiReviewsGalleryData, false, function1);
            }
            setState(AFwS256S0000000_18.get$arr$(717));
        }
    }

    public final void wQ2(PoiReviewsGalleryData poiReviewsGalleryData, boolean z, Function1<? super PoiReviewsGalleryData, Unit> function1) {
        String str;
        int value;
        boolean zLJFF;
        long jLongValue;
        boolean zLJFF2;
        Long l;
        String str2 = poiReviewsGalleryData.poiId;
        if (str2 == null || (str = poiReviewsGalleryData.reviewId) == null) {
            return;
        }
        if (z) {
            value = EnumC1190080h4g.CANCEL_LIKE.getValue();
        } else {
            value = EnumC1190080h4g.LIKE.getValue();
        }
        boolean z2 = !z;
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel = poiReviewsGalleryData.userStatus;
        if (poiReviewUserStatusModel != null) {
            zLJFF = Intrinsics.LJFF(poiReviewUserStatusModel.liked, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = poiReviewsGalleryData.statistics;
        if (poiReviewStatisticsModel != null && (l = poiReviewStatisticsModel.likeCount) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel2 = poiReviewsGalleryData.userStatus;
        if (poiReviewUserStatusModel2 != null) {
            zLJFF2 = Intrinsics.LJFF(poiReviewUserStatusModel2.disliked, Boolean.TRUE);
        } else {
            zLJFF2 = false;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1191370h6l(str2, str, value, poiReviewsGalleryData, this, jLongValue, zLJFF, zLJFF2, z2, function1, null), 3);
    }
}
