package com.ss.android.ugc.aweme.comment.viewerlist.viewmodel;

import X.C01GW;
import X.C09JN;
import X.C11S5;
import X.C1701940uOG;
import X.C452501pT;
import X.InterfaceC742660TBg;
import android.app.Activity;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class VideoViewAuthorizationViewModel extends ViewModel {
    public static final /* synthetic */ int LLILLL = 0;
    public final NextLiveData<Pair<Integer, Pair<Boolean, Map<String, String>>>> LL = new NextLiveData<>();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(171));

    public final boolean wQ2() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map vQ2(com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel r3, java.lang.Throwable r4, com.ss.android.ugc.aweme.network.model.BaseResponse r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r6 & 2
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r3.getClass()
            java.lang.String r2 = ""
            if (r5 == 0) goto L37
            com.ss.android.ugc.aweme.network.model.LogPbBean r0 = r5.getLogPb()
            if (r0 == 0) goto L1c
            java.lang.String r3 = r0.imprId
            if (r3 != 0) goto L1f
        L1c:
            r3 = r2
            if (r5 == 0) goto L55
        L1f:
            int r0 = r5.getStatusCode()
            java.lang.String r2 = java.lang.String.valueOf(r0)
        L27:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r0 = "log_id"
            r1.put(r0, r3)
            java.lang.String r0 = "status_code"
            r1.put(r0, r2)
            return r1
        L37:
            boolean r0 = r4 instanceof X.C0XIR
            if (r0 == 0) goto L1c
            r0 = r4
            X.0XIR r0 = (X.C0XIR) r0
            java.lang.Object r1 = r0.getRawResponse()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.network.model.BaseResponse
            if (r0 == 0) goto L1c
            com.ss.android.ugc.aweme.network.model.BaseResponse r1 = (com.ss.android.ugc.aweme.network.model.BaseResponse) r1
            if (r1 == 0) goto L1c
            com.ss.android.ugc.aweme.network.model.LogPbBean r0 = r1.getLogPb()
            if (r0 == 0) goto L1c
            java.lang.String r3 = r0.imprId
            if (r3 != 0) goto L55
            goto L1c
        L55:
            boolean r0 = r4 instanceof X.C0XIR
            if (r0 == 0) goto L27
            X.0XIR r4 = (X.C0XIR) r4
            java.lang.Object r1 = r4.getRawResponse()
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.network.model.BaseResponse
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.network.model.BaseResponse r1 = (com.ss.android.ugc.aweme.network.model.BaseResponse) r1
            if (r1 == 0) goto L27
            int r0 = r1.getStatusCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L27
            r2 = r0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel.vQ2(com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel, java.lang.Throwable, com.ss.android.ugc.aweme.network.model.BaseResponse, int):java.util.Map");
    }

    public final void xQ2(final String str, final String str2, final String str3, final String str4, final String str5, final int i, final boolean z) {
        InterfaceC742660TBg interfaceC742660TBgLIZIZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZIZ();
        if (interfaceC742660TBgLIZIZ != null) {
            interfaceC742660TBgLIZIZ.LIZIZ(i).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0TAj
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str6;
                    Activity activityLJFF;
                    int i2;
                    C1C7U.LIZ("VideoViewAuthorizationViewModel@daf9.saveOnVideoViewerSetting$1$disposable$1");
                    Pair<Integer, Pair<Boolean, Map<String, String>>> pair = new Pair<>(Integer.valueOf(i), new Pair(Boolean.TRUE, VideoViewAuthorizationViewModel.vQ2(this, null, (BaseResponse) obj, 1)));
                    if ((Intrinsics.LJFF(str2, "personal_homepage") || !z) && i == 1) {
                        String str7 = str;
                        if (str7 == null) {
                            str7 = "";
                        }
                        C1440005kM.LIZ(new C2038607yi(str7, true));
                    }
                    if (pair.getFirst().intValue() == 1 && (activityLJFF = C2214201BlK.LJFF()) != null) {
                        VideoViewAuthorizationViewModel videoViewAuthorizationViewModel = this;
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                        if (videoViewAuthorizationViewModel.wQ2()) {
                            i2 = 2131837198;
                        } else {
                            i2 = 2131858193;
                        }
                        c1389890mGx.LJIIIZ(i2);
                        c1389890mGx.LJIIJJI();
                    }
                    VideoViewAuthorizationViewModel videoViewAuthorizationViewModel2 = this;
                    String str8 = str2;
                    String str9 = str3;
                    String str10 = str4;
                    String str11 = str5;
                    String strValueOf = String.valueOf(i);
                    if (pair.getSecond().getFirst().booleanValue()) {
                        str6 = "1";
                    } else {
                        str6 = CardStruct.IStatusCode.DEFAULT;
                    }
                    Map<String, String> second = pair.getSecond().getSecond();
                    videoViewAuthorizationViewModel2.getClass();
                    C1350920lG6.LJIL("video_views_pop_up_auth_result", str8, str9, str10, strValueOf, null, str11, str6, second, 32);
                    this.LL.postValue(pair);
                    C1C7U.LIZIZ("VideoViewAuthorizationViewModel@daf9.saveOnVideoViewerSetting$1$disposable$1");
                }
            }, new C09JN() { // from class: X.0TAk
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str6;
                    C1C7U.LIZ("VideoViewAuthorizationViewModel@daf9.saveOnVideoViewerSetting$1$disposable$2");
                    Throwable th = (Throwable) obj;
                    Activity activityLJFF = C2214201BlK.LJFF();
                    if (activityLJFF != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                        c1389890mGx.LJIIIZ(2131858194);
                        c1389890mGx.LJIIJJI();
                    }
                    Pair<Integer, Pair<Boolean, Map<String, String>>> pair = new Pair<>(Integer.valueOf(i), new Pair(Boolean.FALSE, VideoViewAuthorizationViewModel.vQ2(this, th, null, 2)));
                    VideoViewAuthorizationViewModel videoViewAuthorizationViewModel = this;
                    String str7 = str2;
                    String str8 = str3;
                    String str9 = str4;
                    String str10 = str5;
                    String strValueOf = String.valueOf(i);
                    if (pair.getSecond().getFirst().booleanValue()) {
                        str6 = "1";
                    } else {
                        str6 = CardStruct.IStatusCode.DEFAULT;
                    }
                    Map<String, String> second = pair.getSecond().getSecond();
                    videoViewAuthorizationViewModel.getClass();
                    C1350920lG6.LJIL("video_views_pop_up_auth_result", str7, str8, str9, strValueOf, null, str10, str6, second, 32);
                    this.LL.postValue(pair);
                    C1C7U.LIZIZ("VideoViewAuthorizationViewModel@daf9.saveOnVideoViewerSetting$1$disposable$2");
                }
            });
        }
    }
}
