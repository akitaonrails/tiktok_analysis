package com.ss.android.ugc.aweme.minis.api;

import X.C1024540clg;
import X.C2344009Gk;
import X.EnumC2196771AyJ;
import X.InterfaceC1037660d6q;
import X.InterfaceC1057480dco;
import X.InterfaceC1057490dcp;
import X.InterfaceC215300sJ;
import X.InterfaceC2196861AyS;
import X.InterfaceC2196941Aya;
import X.InterfaceC713890RzP;
import X.InterfaceC815880VzW;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.foundation.activity.BaseActivity;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
public interface IMinisApiService {
    void LIZ(Map<String, String> map);

    InterfaceC1057480dco LIZIZ();

    InterfaceC1057490dcp LIZJ();

    boolean LIZLLL(BaseActivity baseActivity, Uri uri);

    void LJ(Activity activity, Uri uri, boolean z);

    boolean LJFF(Fragment fragment);

    void LJI(Fragment fragment, boolean z);

    void LJII(List list);

    String LJIIIIZZ(String str, String str2);

    void LJIIIZ(BaseActivity baseActivity, Uri uri);

    void LJIIJ(Map<String, String> map);

    InterfaceC215300sJ LJIIJJI();

    void LJIIL(boolean z);

    String LJIILIIL(String str, String str2);

    Fragment LJIILJJIL(String str, Integer num, Integer num2, InterfaceC2196941Aya interfaceC2196941Aya, InterfaceC1037660d6q interfaceC1037660d6q);

    String LJIILL(String str, String str2, MinisRawAdInfo minisRawAdInfo);

    void LJIILLIIL(Uri uri, String str, BaseActivity baseActivity);

    String LJIIZILJ(Uri uri);

    void LJIJ(C2344009Gk c2344009Gk, String str);

    void LJIJI(Fragment fragment);

    void LJIJJ(boolean z);

    void LJIJJLI(Fragment fragment);

    boolean LJIL(BaseActivity baseActivity, Uri uri, boolean z);

    void LJJ(C1024540clg c1024540clg, EnumC2196771AyJ enumC2196771AyJ, List list);

    InterfaceC815880VzW LJJI();

    boolean LJJIFFI();

    Map<String, String> LJJII(String str);

    InterfaceC713890RzP LJJIII();

    void LJJIIJ();

    boolean LJJIIJZLJL();

    Pair<String, String> LJJIIZ(String str);

    void init(Context context);

    InterfaceC2196861AyS xm();
}
