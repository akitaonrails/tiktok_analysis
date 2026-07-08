package com.ss.android.ugc.aweme.services.external.ability;

import X.C19EG;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface IOpenPhotoNextService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void gotoNextPage(C19EG c19eg, boolean z, Bundle bundle, List<String> list, IPageToFinish iPageToFinish);

    void openEditPageForImages(C19EG c19eg, Bundle bundle, List<String> list);
}
