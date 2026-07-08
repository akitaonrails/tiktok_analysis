package com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc;

import X.AbstractC214814194y;
import X.C01GW;
import X.C1443540nfU;
import X.C1654320t9S;
import X.C1656480tCw;
import X.C1664590tQ1;
import X.C1684810twd;
import X.C19514711Wn;
import X.C19741112Lp;
import X.C19GS;
import X.C1DHV;
import X.C1DPV;
import X.C1DPW;
import X.C1DPX;
import X.C20622515mp;
import X.C2216131BoR;
import X.C452501pT;
import X.C563400M7u;
import X.C786410Ut5;
import X.EnumC1641610sox;
import X.EnumC2249681D3m;
import X.InterfaceC19515111Wr;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import joo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS587S0100000_8;
import lth.o;
import mn3.e0;

/* JADX INFO: loaded from: classes26.dex */
public class AIGCBaseCameraScene extends AbstractC214814194y {
    public static final /* synthetic */ int LLJLLL = 0;
    public C1684810twd LLJJIJIL;
    public ShortVideoContext LLJJJ;
    public e0 LLJJJIL;
    public final String[] LLJJJJ = {""};
    public final Map<String, List<String>> LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C563400M7u LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public boolean LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public View LLJLL;
    public boolean LLJLLIL;

    public boolean LLLLJI() {
        return false;
    }

    public void LLLLL(boolean z) {
        throw null;
    }

    public void LLLLLIL() {
    }

    public void LLLLLILLIL(C1684810twd c1684810twd) {
        throw null;
    }

    public void LLLLLJIL() {
        throw null;
    }

    public boolean LLLLLL() {
        return !(this instanceof AimeCameraScene);
    }

    public final void LLLLLLIL() {
        C1DHV c1dhvQa;
        if (this.LLJLLIL) {
            return;
        }
        this.LLJLLIL = true;
        e0 e0Var = this.LLJJJIL;
        if (e0Var != null && (c1dhvQa = e0Var.qa()) != null) {
            c1dhvQa.LIZJ(1);
        }
        e0 e0Var2 = this.LLJJJIL;
        if (e0Var2 != null) {
            e0Var2.PR(C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_AI_SELF, EnumC2249681D3m.SHOOT), true);
        }
        LLLLLJIL();
    }

    public AIGCBaseCameraScene() {
        HashMap map = new HashMap();
        map.put("1", Collections.singletonList("tt_face"));
        map.put("2", Collections.singletonList("tt_face_extra"));
        map.put("3", Collections.singletonList("tt_face_attribute_exp"));
        map.put("4", Collections.singletonList("tt_face_attribute_age"));
        this.LLJJJJJIL = map;
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(135));
        this.LLJJL = new C563400M7u(0);
        this.LLJL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(144));
    }

    public final void LLLLLJLJLL(Function0<Unit> function0) {
        final AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 603);
        final AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(function0, (Function0<Unit>) 165);
        Activity activity = this.mActivity;
        if (activity != null) {
            C19741112Lp.LIZ.getClass();
            if (C19741112Lp.LIZLLL(activity, "android.permission.CAMERA")) {
                LLLLL(true);
                awS550S0100000_6.invoke();
            } else {
                C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-aigc_camera_face_detection")).LIZIZ("android.permission.CAMERA").LIZJ(new InterfaceC19515111Wr() { // from class: X.0HjB
                    @Override // X.InterfaceC19515111Wr
                    public final void onCanceled() {
                    }

                    @Override // X.InterfaceC19515111Wr
                    public final void LIZ(C0HWO... c0hwoArr) {
                        for (C0HWO c0hwo : c0hwoArr) {
                            if (C449040HjC.LIZ[c0hwo.LIZIZ.ordinal()] == 1) {
                                AIGCBaseCameraScene aIGCBaseCameraScene = this.LIZ;
                                Function0<Unit> function02 = awS550S0100000_6;
                                aIGCBaseCameraScene.LLLLL(true);
                                function02.invoke();
                            } else {
                                AIGCBaseCameraScene aIGCBaseCameraScene2 = this.LIZ;
                                Function1<EnumC442280HVy, Unit> function1 = awS585S0100000_6;
                                EnumC442280HVy enumC442280HVy = c0hwo.LIZIZ;
                                aIGCBaseCameraScene2.LLLLL(false);
                                function1.invoke(enumC442280HVy);
                            }
                        }
                    }
                });
            }
        }
    }

    public final void LLLLLLJ(boolean z) {
        if (!this.LLJLLIL) {
            return;
        }
        this.LLJLLIL = false;
        e0 e0Var = this.LLJJJIL;
        if (e0Var != null) {
            e0Var.sd0(z, C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_AI_SELF, EnumC1641610sox.PAGE_INVISIBLE));
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        boolean z;
        Bundle extras;
        Intent intent;
        Intent intent2;
        super.onActivityCreated(bundle);
        if (C20622515mp.LJ(this) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f fVar = f.LIZ;
            C19GS c19gsRequireAppCompatActivity = requireAppCompatActivity();
            Activity activity = this.mActivity;
            if (activity != null) {
                intent2 = activity.getIntent();
            } else {
                intent2 = null;
            }
            fVar.getClass();
            f.LIZJ(c19gsRequireAppCompatActivity, intent2, null);
        }
        Activity activity2 = this.mActivity;
        if (activity2 != null && (intent = activity2.getIntent()) != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        this.LLJJJ = C1443540nfU.LIZJ(extras, requireAppCompatActivity(), null);
        o.LJFF(C2216131BoR.LIZ());
        C1654320t9S.LIZIZ(this, AFwS266S0000000_25.get$arr$(30));
        C1664590tQ1.LIZLLL(this, "AIGCBaseCameraScene", false, new AwS587S0100000_8(this, 12), 2);
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(this.LLJJJJ, this.LLJJJJJIL, new C1656480tCw(this));
        if (LLLLLL()) {
            LLLLLJLJLL(null);
        }
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ol, viewGroup, false);
    }
}
