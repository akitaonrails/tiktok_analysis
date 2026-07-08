package com.ss.android.ugc.aweme.im.saas.host.impl.foundation;

import X.C01GW;
import X.C06W5;
import X.C070Q;
import X.C0CBW;
import X.C0OMU;
import X.C0T1N;
import X.C1164420gPI;
import X.C1192870h9B;
import X.C1202330hOR;
import X.C19EG;
import X.C20595415iS;
import X.C21504919Dz;
import X.C2248361CzK;
import X.C2269961Dt4;
import X.C256220A2i;
import X.C698190Ra5;
import X.C786410Ut5;
import X.InterfaceC21501419Cq;
import android.content.Context;
import android.content.Intent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.bytedance.forest.Forest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment;
import com.ss.android.ugc.aweme.power.scene.SceneGenerator;
import kotlin.jvm.internal.AwS663S0100000_14;

/* JADX INFO: loaded from: classes33.dex */
public final class IMFoundationBridgeService implements IMFoundationBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final boolean LIZ() {
        C01GW c01gw = C256220A2i.LIZ;
        return ((Boolean) C256220A2i.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final C1202330hOR LIZLLL() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final C1202330hOR LJFF() {
        C1192870h9B.LIZ.getClass();
        return C1192870h9B.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final boolean LJIIIIZZ() {
        return ((Boolean) C2269961Dt4.LIZLLL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final C06W5 LJIIJ() {
        return new C06W5(0);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final boolean LIZIZ() {
        if (!C070Q.LIZ()) {
            return (C21504919Dz.LIZ() & 2) == 2;
        }
        C0CBW c0cbw = C0CBW.LIZ;
        return C0CBW.LIZIZ() && C070Q.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final Forest LJIIJJI() {
        return C0T1N.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final boolean LJIIL() {
        return C20595415iS.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final void LIZJ(Fragment fragment) throws Throwable {
        Object objH2;
        if (fragment instanceof ChatRootFragment) {
            ChatRootFragment chatRootFragment = (ChatRootFragment) fragment;
            Context context = chatRootFragment.getContext();
            if (context != null) {
                objH2 = C786410Ut5.H2(context, "input_method");
            } else {
                objH2 = null;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) objH2;
            C19EG activity = chatRootFragment.getActivity();
            if (activity != null && inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
            }
            chatRootFragment.ES();
            chatRootFragment.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final C0OMU LJI(final AwS663S0100000_14 awS663S0100000_14) {
        return new C0OMU(new InterfaceC21501419Cq() { // from class: X.19DY
            @Override // X.InterfaceC21501419Cq
            public final void onActivityResult(int i, int i2, Intent intent) {
                awS663S0100000_14.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final void LJIIIZ(String str) {
        SceneGenerator.LIZIZ().LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final C1202330hOR LJ(int i, int i2) {
        C1202330hOR c1202330hOR = new C1202330hOR(false, 3);
        c1202330hOR.LJFF = i;
        c1202330hOR.LJI = i2;
        return c1202330hOR;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi
    public final C1164420gPI LJII(Context context, String str) {
        try {
            C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(context, str);
            if (c698190Ra5LJFF == null) {
                return null;
            }
            return new C1164420gPI(c698190Ra5LJFF.LIZ, c698190Ra5LJFF.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
