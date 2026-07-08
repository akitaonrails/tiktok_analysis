package com.ss.android.ugc.aweme.contentlanguage.api;

import X.C19EG;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes25.dex */
public interface IContentLanguageGuideService {
    void LIZJ();

    boolean LIZLLL();

    void LJ(Context context, Fragment fragment);

    boolean LJFF();

    void LJI(C19EG c19eg, Fragment fragment, Aweme aweme);

    void LJII(Context context, Fragment fragment);

    boolean LJIIIIZZ();

    String getContentLanguage();

    void onFeedStop();

    void setContentLanguage(String str);
}
