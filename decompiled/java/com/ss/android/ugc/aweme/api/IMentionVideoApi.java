package com.ss.android.ugc.aweme.api;

import X.C1442910neT;
import X.C19EG;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public interface IMentionVideoApi {
    boolean LIZ(int i);

    void LIZIZ(C19EG c19eg, C1442910neT c1442910neT);

    Fragment LIZJ();

    boolean LIZLLL(TextExtraStruct textExtraStruct);

    boolean LJ(TextExtraStruct textExtraStruct);

    void LJFF(Activity activity, String str);

    List<Aweme> LJI(String str);

    void LJII(String str);

    boolean LJIIIIZZ(int i);

    Fragment LJIIIZ(int i);

    void LJIIJ();

    Fragment LJIIJJI(String str, String str2);

    String LJIIL(int i);

    void LJIILIIL(Fragment fragment);

    void setCreationId(String str);
}
