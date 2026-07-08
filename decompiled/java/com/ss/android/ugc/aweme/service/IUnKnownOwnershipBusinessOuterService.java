package com.ss.android.ugc.aweme.service;

import X.C1581770rGR;
import X.C1618250sDH;
import X.C19277110bJ;
import X.C19719912Dl;
import X.C19EG;
import android.content.Context;
import android.view.View;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.favorites.agents.AwemeCollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.requesttask.idle.AnchorListRequest;
import com.ss.android.ugc.aweme.requesttask.idle.FetchImUnder16RequestTask;
import java.util.Locale;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes29.dex */
public interface IUnKnownOwnershipBusinessOuterService {
    void LIZ();

    boolean LIZIZ(Aweme aweme);

    boolean LIZJ(Music music);

    Locale LIZLLL(String str);

    String LJ();

    C19719912Dl LJFF();

    MainLooperOptService LJI();

    AnchorListRequest LJII();

    C19719912Dl LJIIIIZZ();

    void LJIIIZ();

    FetchImUnder16RequestTask LJIIJ();

    void LJIIJJI(Context context);

    void LJIIL();

    void LJIILIIL(View view);

    String LJIILJJIL();

    Gson LJIILL();

    boolean LJIILLIIL(int i, int i2);

    void LJIIZILJ();

    AwemeCollectionTypeAdapterFactory LJIJ();

    boolean LJIJI();

    void LJIJJ(String str, String str2, Context context, C19277110bJ c19277110bJ);

    void LJIJJLI();

    void LJIL(Context context, String str);

    void LJJ(C19EG c19eg);

    void LJJI(long j, AwS623S0100000_9 awS623S0100000_9);

    void LJJIFFI(int i, C19EG c19eg);

    void LJJII(String str, String str2, String str3, String str4, long j, Aweme aweme);

    void LJJIII();

    void LJJIIJ(Context context);

    C1618250sDH LJJIIJZLJL(C19EG c19eg, C1581770rGR c1581770rGR);

    void LJJIIZ(Context context);

    Gson LJJIIZI();

    void LJJIJ();

    void updateRootViewAndState(View view);
}
