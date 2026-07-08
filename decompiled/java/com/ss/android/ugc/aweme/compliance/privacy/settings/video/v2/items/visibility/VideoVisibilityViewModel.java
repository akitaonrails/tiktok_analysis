package com.ss.android.ugc.aweme.compliance.privacy.settings.video.v2.items.visibility;

import X.C10AH;
import X.C10AJ;
import X.C10AQ;
import X.C10AS;
import X.C10AU;
import X.C10AW;
import X.C11NJ;
import X.C11NZ;
import X.C1697810uHb;
import X.C2095008Iq;
import X.InterfaceC1631620sYq;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.aweme.subscription.preview.SubscriptionPreviewService;
import com.ss.android.ugc.aweme.subscription.utils.SingleLiveData;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.BaseSettingDataViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoVisibilityViewModel extends BaseSettingDataViewModel {
    public final Aweme LLILZLL;
    public final MutableLiveData<Integer> LLIZ;
    public Long LLIZLLLIL;
    public final SingleLiveData<Boolean> LLJ;
    public final C11NJ LLJI;
    public final SubscriptionPreviewService LLJIJIL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLJI.LJ();
        super.onCleared();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.BaseSettingDataViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11NZ<? extends com.ss.android.ugc.aweme.network.model.BaseResponse> vQ2(int r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto Lb
            r0 = 2
            if (r5 == r3) goto L3e
            if (r5 == r0) goto L3c
            r0 = 4
            if (r5 == r0) goto L3e
        Lb:
            X.10A1 r2 = X.C191871104n.LJFF()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILZLL
            if (r0 == 0) goto L3a
            java.lang.String r1 = r0.getAid()
        L17:
            r2.getClass()
            X.01GW r0 = X.C10A1.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.109z r0 = (X.InterfaceC192013109z) r0
            X.11NZ r3 = r0.LIZIZ(r1, r3)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "report_to_tea"
            java.lang.String r0 = "true"
            r2.<init>(r1, r0)
            java.util.Map r1 = X.C2097908Jt.LIZJ(r2)
            java.lang.String r0 = "/aweme/v1/aweme/modify/visibility/"
            X.11NZ r0 = X.C1888930zFr.LIZIZ(r3, r0, r1)
            return r0
        L3a:
            r1 = 0
            goto L17
        L3c:
            r3 = 3
            goto Lb
        L3e:
            r3 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.video.v2.items.visibility.VideoVisibilityViewModel.vQ2(int):X.11NZ");
    }

    public final void yQ2(C10AJ c10aj) {
        String aid;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        String aid2;
        Long lLJIILIIL = null;
        if (c10aj instanceof C10AU) {
            this.LLJ.postValue(Boolean.TRUE);
            C10AU c10au = (C10AU) c10aj;
            CMPreviewInfo cMPreviewInfo = c10au.LIZ;
            if (cMPreviewInfo != null) {
                lValueOf = Long.valueOf(cMPreviewInfo.previewDurationTimeInMs);
            } else {
                lValueOf = null;
            }
            this.LLIZLLLIL = lValueOf;
            CMPreviewInfo cMPreviewInfo2 = c10au.LIZ;
            if (cMPreviewInfo2 != null) {
                lValueOf2 = Long.valueOf(cMPreviewInfo2.previewStartTimeInMs);
            } else {
                lValueOf2 = null;
            }
            CMPreviewInfo cMPreviewInfo3 = c10au.LIZ;
            if (cMPreviewInfo3 != null) {
                lValueOf3 = Long.valueOf(cMPreviewInfo3.previewDurationTimeInMs);
            } else {
                lValueOf3 = null;
            }
            Aweme aweme = this.LLILZLL;
            if (aweme != null && (aid2 = aweme.getAid()) != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(aid2);
            }
            this.LLJIJIL.LIZ(new C10AQ(true, lValueOf2, lValueOf3, lLJIILIIL));
            return;
        }
        int i = 0;
        if (c10aj instanceof C10AH) {
            List<PhotoModeImageUrlModel> list = ((C10AH) c10aj).LIZ.LIZIZ;
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator<PhotoModeImageUrlModel> it2 = list.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        SubscriptionInfo subscriptionInfo = it2.next().subscriptionInfo;
                        if (subscriptionInfo != null && Intrinsics.LJFF(subscriptionInfo.isPreview(), Boolean.TRUE) && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                lLJIILIIL = Long.valueOf(i);
            }
            this.LLIZLLLIL = lLJIILIIL;
            this.LLJ.postValue(Boolean.TRUE);
            return;
        }
        if (c10aj instanceof C10AS) {
            this.LLJ.postValue(Boolean.TRUE);
            this.LLIZLLLIL = null;
            Aweme aweme2 = this.LLILZLL;
            if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(aid);
            }
            this.LLJIJIL.LIZ(new C10AQ(false, 0L, 0L, lLJIILIIL));
            return;
        }
        if (!(c10aj instanceof C10AW)) {
            return;
        }
        this.LLJ.postValue(Boolean.TRUE);
    }

    public VideoVisibilityViewModel(Aweme aweme, Integer num) {
        this.LLILZLL = aweme;
        this.LLILLL.setValue(num == null ? -1 : num);
        this.LLIZ = new MutableLiveData<>();
        this.LLJ = new SingleLiveData<>();
        this.LLJI = new C11NJ();
        this.LLJIJIL = (SubscriptionPreviewService) ServiceManager.get().getService(SubscriptionPreviewService.class);
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.BaseSettingDataViewModel
    public final void wQ2(int i, C11NZ<? extends BaseResponse> c11nz, InterfaceC1631620sYq<? super Integer, ? super Integer, ? super BaseResponse, Unit> interfaceC1631620sYq, InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Throwable, Unit> interfaceC1631620sYq2) {
        Integer value = this.LLILLL.getValue();
        if (value != null && value.intValue() == i) {
            this.LLIZ.postValue(Integer.valueOf(i));
        } else {
            super.wQ2(i, c11nz, interfaceC1631620sYq, interfaceC1631620sYq2);
        }
    }
}
