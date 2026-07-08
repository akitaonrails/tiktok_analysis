package com.ss.android.ugc.aweme.relation.recuser;

import X.C19EG;
import X.EnumC1262370ixH;
import X.InterfaceC1056430db7;
import X.InterfaceC1072780e1U;
import X.InterfaceC1073440e2Y;
import X.InterfaceC1263910izl;
import X.InterfaceC1264190j0D;
import X.InterfaceC1264650j0x;
import X.InterfaceC1294060jmO;
import X.InterfaceC1337505Lh;
import X.InterfaceC1588500rRI;
import X.InterfaceC1589370rSh;
import X.InterfaceC1603120ros;
import X.InterfaceC302490BtP;
import X.InterfaceC800130Va7;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public interface IRecUserService {
    InterfaceC302490BtP LIZ();

    InterfaceC1337505Lh LIZIZ();

    InterfaceC1072780e1U LIZJ();

    InterfaceC1603120ros LIZLLL(C19EG c19eg, Aweme aweme, LifecycleOwner lifecycleOwner);

    void LJ(String str);

    boolean LJFF();

    InterfaceC1588500rRI LJI(Fragment fragment, String str, InterfaceC1264650j0x interfaceC1264650j0x);

    InterfaceC1264190j0D LJII();

    @InterfaceC1294060jmO
    InterfaceC1263910izl LJIIIIZZ(EnumC1262370ixH enumC1262370ixH);

    InterfaceC1073440e2Y LJIIIZ(C19EG c19eg, Bundle bundle);

    IRecUserMonManager LJIIJ();

    List<InterfaceC800130Va7> LJIIJJI(boolean z);

    void LJIIL(TuxTextView tuxTextView, User user, Aweme aweme);

    InterfaceC800130Va7 LJIILIIL();

    InterfaceC1589370rSh LJIILJJIL();

    InterfaceC1056430db7 LJIILL();
}
