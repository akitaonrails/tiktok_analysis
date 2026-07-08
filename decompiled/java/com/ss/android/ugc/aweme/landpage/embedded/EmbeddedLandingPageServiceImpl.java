package com.ss.android.ugc.aweme.landpage.embedded;

import X.C1037620d6m;
import X.C1037740d6y;
import X.C1038180d7g;
import X.ViewOnClickListenerC1066290dr1;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes17.dex */
public final class EmbeddedLandingPageServiceImpl implements IEmbeddedLandingPageService {
    @Override // com.ss.android.ugc.aweme.landpage.embedded.IEmbeddedLandingPageService
    public final C1038180d7g LIZIZ(Fragment fragment, C1037620d6m c1037620d6m) {
        return new C1038180d7g(fragment, c1037620d6m);
    }

    @Override // com.ss.android.ugc.aweme.landpage.embedded.IEmbeddedLandingPageService
    public final ViewOnClickListenerC1066290dr1 LIZ(Fragment fragment, C1037740d6y c1037740d6y, C1037620d6m c1037620d6m) {
        return new ViewOnClickListenerC1066290dr1(c1037740d6y, new C1038180d7g(fragment, c1037620d6m));
    }
}
