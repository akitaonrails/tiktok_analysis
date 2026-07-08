package com.ss.android.ugc.aweme.homepage;

import X.AbstractC1591090rVT;
import X.AbstractC1591940rWq;
import X.C0CCZ;
import X.C1591020rVM;
import X.C1592950rYT;
import X.C686150Qvl;
import X.EnumC1570580qyO;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public interface IHomePageExService {
    void LIZ(C686150Qvl c686150Qvl, String str, JSONObject jSONObject);

    Object LIZIZ(C1592950rYT c1592950rYT, String str);

    boolean LIZJ(String str);

    boolean LIZLLL(String str);

    String LJ();

    String LJFF();

    void LJI(Context context);

    boolean LJII();

    boolean LJIIIIZZ();

    boolean LJIIIZ();

    boolean LJIIJ(Fragment fragment, ScrollSwitchStateManager scrollSwitchStateManager, C1591020rVM c1591020rVM, C1591020rVM c1591020rVM2);

    AbstractC1591090rVT LJIIJJI(AbstractC1591940rWq abstractC1591940rWq);

    boolean LJIIL(Intent intent);

    boolean LJIILIIL(String str);

    void LJIILJJIL(Uri uri, Object obj, String str);

    boolean LJIILL(String str);

    EnumC1570580qyO LJIILLIIL();

    void LJIIZILJ();

    boolean LJIJ();

    boolean LJIJI();

    ITabAnimationAbility LJIJJ();

    boolean LJIJJLI(MainActivity mainActivity, Fragment fragment, ScrollSwitchStateManager scrollSwitchStateManager, C1591020rVM c1591020rVM, C1591020rVM c1591020rVM2);

    int LJIL();

    void LJJ(Object obj, String str);

    boolean LJJI(Context context);

    boolean LJJIFFI();

    boolean LJJII();

    Integer LJJIII();

    List<C0CCZ> getInitTask();
}
