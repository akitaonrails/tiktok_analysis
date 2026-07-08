package com.ss.android.ugc.gamora.recorder.navi.service;

import X.C0XST;
import X.C11NZ;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviCandidatesResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviListResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ResolveEffectsResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface NaviVideoCreationService {
    public static final C0XST LIZ = C0XST.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/navi/candidates/")
    C11NZ<ProfileNaviCandidatesResponse> getCandidateList(@InterfaceC1501120pAM("transparent_candidates_required") boolean z, @InterfaceC1501120pAM("scenario") int i, @InterfaceC1501120pAM("panel") String str);

    @InterfaceC1501160pAQ("/tiktok/v1/navi/list/")
    C11NZ<ProfileNaviListResponse> getNaviList(@InterfaceC1501120pAM("offset") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("panel") String str);

    @InterfaceC1501160pAQ("/tiktok/v1/navi/resolve/effects/")
    C11NZ<ResolveEffectsResponse> resolveEffects(@InterfaceC1501120pAM("panel") String str, @InterfaceC1501120pAM("paths") String str2);
}
