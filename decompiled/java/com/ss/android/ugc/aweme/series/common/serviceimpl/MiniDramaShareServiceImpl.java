package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C1372560lp0;
import X.C19EG;
import X.C621180OYa;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.MiniDramaShareService;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class MiniDramaShareServiceImpl implements MiniDramaShareService {
    @Override // com.ss.android.ugc.aweme.service.MiniDramaShareService
    public final void LIZ(C19EG c19eg, long j, String str, String str2, User user, String str3, List list, String str4, boolean z, boolean z2, String str5, boolean z3, int i) {
        C621180OYa.LIZ.LJII(c19eg, new C1372560lp0(j, str, str2, user, str3, list, str4, z, z2, str5, z3, "series_video_innerfeed", i));
    }
}
