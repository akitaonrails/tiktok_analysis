package com.ss.android.ugc.aweme.explore.service;

import X.AbstractC1386130mAt;
import X.AbstractC1549150qPp;
import X.AbstractC1585770rMt;
import X.AbstractC738140SxQ;
import X.C03H5;
import X.C0CCZ;
import X.C1386470mBR;
import X.C13IQ;
import X.C2344009Gk;
import X.C735360Ssw;
import X.InterfaceC1603450rpP;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.google.gson.v;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes32.dex */
public interface IExploreFeedService {
    boolean LIZ();

    void LIZIZ(Context context);

    ReusedAssem<? extends C03H5> LIZJ();

    void LIZLLL(ExploreLynxParams exploreLynxParams);

    void LJ(Long l, String str, String str2);

    void LJFF(C2344009Gk c2344009Gk, String str, String str2, String str3);

    void LJI(long j, String str, boolean z);

    Bitmap LJII();

    void LJIIIIZZ(String str);

    void LJIIIZ(String str, String str2, Map<String, String> map);

    void LJIIJ(String str, String str2);

    v LJIIJJI();

    int LJIIL();

    void LJIILIIL(C2344009Gk c2344009Gk, String str, Long l, String str2, String str3);

    void LJIILJJIL(Uri.Builder builder, String str, String str2, String str3);

    boolean LJIILL(PublishModel publishModel);

    C13IQ<? extends AbstractC738140SxQ> LJIILLIIL();

    void LJIIZILJ(C1386470mBR c1386470mBR, String str);

    void LJIJ(String str);

    String LJIJI(SearchFragment searchFragment);

    String LJIJJ(C2344009Gk c2344009Gk, String str, String str2, String str3);

    void LJIJJLI(AbstractC1386130mAt<?> abstractC1386130mAt, String str, String str2, String str3);

    void LJIL(C2344009Gk c2344009Gk, String str, String str2);

    v LJJ();

    AbstractC1585770rMt LJJI();

    InterfaceC1603450rpP LJJIFFI(Fragment fragment, String str, String str2, AwS568S0100000_24 awS568S0100000_24);

    void LJJII();

    List<Class<? extends AbstractC1549150qPp<?, ?>>> LJJIII();

    void LJJIIJ(AbstractC1386130mAt<?> abstractC1386130mAt, String str, Long l, String str2, String str3);

    C0CCZ LJJIIJZLJL();

    void LJJIIZ(C735360Ssw c735360Ssw, String str, String str2);

    Map<String, String> Ln(String str);
}
