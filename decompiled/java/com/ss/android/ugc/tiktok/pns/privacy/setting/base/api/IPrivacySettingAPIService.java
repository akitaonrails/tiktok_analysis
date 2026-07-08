package com.ss.android.ugc.tiktok.pns.privacy.setting.base.api;

import X.C10BN;
import X.C1701550uNd;
import X.C19EG;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptProcessFragment;
import com.ss.android.ugc.tiktok.pns.props.RemoveOffProps;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes29.dex */
public interface IPrivacySettingAPIService {
    void LIZ(Context context, FragmentManager fragmentManager, String str);

    void LIZIZ();

    boolean LIZJ();

    void LIZLLL(C19EG c19eg);

    boolean LJ();

    void LJFF(View view, boolean z, boolean z2);

    void LJI(C19EG c19eg, RemoveOffProps removeOffProps, String str);

    String LJII(String str);

    void LJIIIIZZ(Context context, Fragment fragment);

    PaPromptProcessFragment LJIIIZ(int i);

    C1701550uNd LJIIJ();

    void LJIIJJI(LifecycleOwner lifecycleOwner, String str);

    boolean LJIIL();

    C1701550uNd LJIILIIL();

    void LJIILJJIL(AwS605S0100000_26 awS605S0100000_26);

    void LJIILL(C19EG c19eg, FragmentManager fragmentManager, C10BN c10bn);

    void LJIILLIIL(C19EG c19eg, AwS572S0100000_28 awS572S0100000_28);

    List LJIIZILJ();

    TPSCRenderManager LJIJ();

    void LJIJI();

    RemoveOffProps LJIJJ();

    boolean LJIJJLI();
}
