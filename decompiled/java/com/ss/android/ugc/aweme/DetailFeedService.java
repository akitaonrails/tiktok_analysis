package com.ss.android.ugc.aweme;

import X.C19EG;
import X.C2189821An6;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public interface DetailFeedService {
    boolean LIZ(Context context);

    BatchDetailList LIZIZ(int i, String str, String str2, String str3, String str4);

    BatchDetailList LIZJ(String str, String str2);

    Aweme LIZLLL(String str);

    Aweme LJ(String str);

    Fragment LJFF(Object obj);

    Long LJI(Fragment fragment);

    C2189821An6 LJII(C19EG c19eg);

    Map<String, View> LJIIIIZZ(View view);

    InterfaceC665370Q7z LJIIIZ(Fragment fragment);

    Aweme LJIIJ(String str, String str2);

    void LJIIJJI(C19EG c19eg, boolean z);

    void LJIIL(Context context, String str, String str2, String str3, int i, String str4, View view, Bundle bundle);

    BatchDetailList LJIILIIL(int i, String str);

    String LJIILJJIL(String str, String str2, String str3);

    Fragment LJIILL(Activity activity);

    boolean LJIILLIIL();

    String LJIIZILJ(Object obj);

    boolean LJIJ();

    View LJIJI(View view);

    void LJIJJ();

    Class<? extends Activity> LJIJJLI();
}
