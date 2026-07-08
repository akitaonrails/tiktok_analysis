package com.ss.android.ugc.aweme.contentlanguage.api;

import X.C10FJ;
import X.C1594040raE;
import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public interface IContentLanguageService {
    String LIZ();

    void LIZIZ(ContentLanguage contentLanguage);

    void LIZJ(String str);

    void LIZLLL(C10FJ c10fj);

    C1594040raE LJ(List<String> list, List<? extends ContentLanguage> list2);

    void LJFF(Activity activity, Fragment fragment);

    boolean LJI(Aweme aweme);

    Pair<Boolean, String> LJII(Context context, Fragment fragment);

    void LJIIIIZZ();

    String getContentLanguage();

    Activity getCurrentActivity();

    List<String> getLanguage();
}
