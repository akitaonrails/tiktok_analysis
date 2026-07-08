package com.ss.android.ugc.aweme.verify.bio;

import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C1218820hp2;
import X.C1238130iKB;
import X.C1388190mED;
import X.C1390130mHL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1441005kW;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C1708530uYt;
import X.C1713520ugw;
import X.C1713540ugy;
import X.C1713570uh1;
import X.C1713630uh7;
import X.C1713680uhC;
import X.C1713690uhD;
import X.C1713750uhJ;
import X.C1714040uhm;
import X.C1714170uhz;
import X.C1714240ui6;
import X.C1714380uiK;
import X.C1714660uim;
import X.C1714840uj4;
import X.C1714950ujF;
import X.C1715060ujQ;
import X.C1715220ujg;
import X.C1715250ujj;
import X.C1715520ukA;
import X.C1715790ukb;
import X.C1716020uky;
import X.C1836510xtJ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20121713oF;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2242108qR;
import X.C2252321DDq;
import X.C23250099c;
import X.C336720DHy;
import X.C452501pT;
import X.C786410Ut5;
import X.C817503Hh;
import X.C860740Xpg;
import X.EnumC452301pR;
import X.InterfaceC1724030uxt;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.common.ab.PipoBiometryConfigSettings;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class BioVerifyFragment extends BaseFragment implements InterfaceC1724030uxt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMpHELIOSOyY1MWsuICB9CiwjHyohISM1Dz0yLygpJzs=";
    public C1715220ujg LLIZ;
    public final ViewModelLazy LLIZLLLIL;
    public boolean LLJ;
    public Context LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    public final C1713570uh1 UR() {
        return (C1713570uh1) this.LLJIJIL.getValue();
    }

    public final C1714660uim VR() {
        return (C1714660uim) this.LLJILJIL.getValue();
    }

    public final BioVerifyViewModel WR() {
        return (BioVerifyViewModel) this.LLIZLLLIL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        Context context = this.LLJI;
        return context == null ? super.getContext() : context;
    }

    public BioVerifyFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS570S0100000_26((Function0) new AwS570S0100000_26((Fragment) this, 1134), 1135));
        this.LLIZLLLIL = C336720DHy.LIZ(this, C13LE.LIZ(BioVerifyViewModel.class), new AwS548S0100000_4(c01gwLIZ, 299), new AwS405S0200000_4((Function0) null, c01gwLIZ, 27), new AwS405S0200000_4(this, c01gwLIZ, 28));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1133));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1136));
    }

    @Override // X.InterfaceC1724030uxt
    public final void Hz() {
        C1714660uim c1714660uimVR = VR();
        c1714660uimVR.getClass();
        c1714660uimVR.LIZLLL = System.currentTimeMillis();
        c1714660uimVR.LIZ("fp_sdk_bnpl_enter_page", null);
    }

    @Override // X.InterfaceC1724030uxt
    public final void bF() {
        VR().LJ("close");
    }

    @Override // X.InterfaceC1724030uxt
    public final void cv() {
        VR().LJ("return");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("BioVerifyFragment", "[onResume]");
        SettingsManager.LIZLLL().getClass();
        if (!(SettingsManager.LIZ("pipo_vc_bio_verify_onresume_check_satisfied", true))) {
            if (this.LLJ) {
                return;
            }
            C1715520ukA.LIZLLL("bio_vf_on_resume_auth", null, null, null);
            WR().vQ2();
            return;
        }
        if (this.LLJ || WR().yQ2()) {
            return;
        }
        C1715520ukA.LIZLLL("bio_vf_on_resume_auth", null, null, null);
        WR().vQ2();
    }

    @Override // X.InterfaceC1724030uxt
    public final void vg() {
        VR().LJ("next");
    }

    public final void ZR(boolean z) {
        Object value;
        String str;
        String str2;
        String str3;
        VerifyDetail verifyDetailLJIIIIZZ;
        VerifyDetail verifyDetailLJIIIIZZ2;
        VerifyInfo verifyInfoLJIIIZ;
        String str4;
        int i;
        C1713570uh1 c1713570uh1UR = UR();
        if (c1713570uh1UR != null) {
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 426);
            AwS38S0010000_26 awS38S0010000_26 = new AwS38S0010000_26(z, 7);
            if (C1714240ui6.LIZ()) {
                if (WR().LLJILJIL) {
                    str4 = "user_switch_method";
                } else {
                    str4 = "bio_fallback";
                }
            } else {
                str4 = null;
            }
            C1713630uh7 c1713630uh7 = c1713570uh1UR.LIZIZ;
            if (((Boolean) c1713630uh7.LJ.getValue()).booleanValue()) {
                C1713630uh7 c1713630uh72 = new C1713630uh7(c1713630uh7.LIZ, c1713630uh7.LIZIZ + 1);
                C1713520ugw c1713520ugw = c1713570uh1UR.LIZ;
                C1713570uh1 c1713570uh1 = new C1713570uh1(new C1713520ugw(c1713520ugw.LIZ, (C1714040uhm) awS605S0100000_26.invoke(C1714040uhm.LIZ(c1713570uh1UR.LIZ.LIZIZ, null, null, false, 127)), C1713540ugy.LIZ(c1713520ugw.LIZJ, c1713570uh1UR.LJI())), c1713630uh72, c1713570uh1UR.LIZJ, (C1714380uiK) awS38S0010000_26.invoke(c1713570uh1UR.LIZLLL));
                c1713570uh1.LJIIL = c1713570uh1UR.LJIIL;
                if (c1713570uh1UR.LJII instanceof C19EG) {
                    c1713570uh1UR.LJIILL(c1713570uh1.LJIIIZ().verifyType, str4, true);
                    C1713750uhJ c1713750uhJLJII = c1713570uh1UR.LJII();
                    if (c1713750uhJLJII != null) {
                        i = c1713750uhJLJII.LIZ;
                    } else {
                        i = 0;
                    }
                    C1713750uhJ c1713750uhJ = new C1713750uhJ(i);
                    c1713750uhJ.LJIIJ();
                    c1713750uhJ.LIZIZ = c1713570uh1;
                    c1713570uh1.LJIILJJIL(c1713750uhJ, "PIPO_VERIFICATION_TECH_TRACKER");
                    c1713570uh1.LJIIZILJ((C19EG) c1713570uh1UR.LJII);
                    SR("USE_CANDIDATE", null);
                    return;
                }
                c1713570uh1UR.LJIILL(c1713570uh1.LJIIIZ().verifyType, str4, false);
            } else {
                c1713570uh1UR.LJIILL(null, str4, false);
            }
        }
        if (z) {
            C1713570uh1 c1713570uh1UR2 = UR();
            if (c1713570uh1UR2 != null && (verifyInfoLJIIIZ = c1713570uh1UR2.LJIIIZ()) != null) {
                str = verifyInfoLJIIIZ.verifyId;
            } else {
                str = null;
            }
            C1713570uh1 c1713570uh1UR3 = UR();
            if (c1713570uh1UR3 != null && (verifyDetailLJIIIIZZ2 = c1713570uh1UR3.LJIIIIZZ()) != null) {
                str2 = verifyDetailLJIIIIZZ2.bizType;
            } else {
                str2 = null;
            }
            C1713570uh1 c1713570uh1UR4 = UR();
            if (c1713570uh1UR4 != null && (verifyDetailLJIIIIZZ = c1713570uh1UR4.LJIIIIZZ()) != null) {
                str3 = verifyDetailLJIIIIZZ.scene;
            } else {
                str3 = null;
            }
            C1715520ukA.LIZLLL("bio_vf_no_bio_no_candidate", str, str2, str3);
        }
        BioVerifyViewModel bioVerifyViewModelWR = WR();
        if (bioVerifyViewModelWR.yQ2() && !bioVerifyViewModelWR.LLJIJIL) {
            BioVerifyViewModel bioVerifyViewModelWR2 = WR();
            C2252321DDq c2252321DDq = bioVerifyViewModelWR2.LL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C1715060ujQ.LIZ((C1715060ujQ) value, null, null, null, null, true, null, 47)));
            bioVerifyViewModelWR2.LLJIJIL = true;
            C1713570uh1 c1713570uh12 = bioVerifyViewModelWR2.LLJ;
            if (c1713570uh12 != null) {
                C1714170uhz.LIZ(c1713570uh12);
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bioVerifyViewModelWR2), null, null, new C1714840uj4(bioVerifyViewModelWR2, null), 3);
            return;
        }
        SR("CANCEL", null);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        String str;
        C1714040uhm c1714040uhm;
        super.onAttach(context);
        C1713570uh1 c1713570uh1UR = UR();
        if (c1713570uh1UR != null && (c1714040uhm = c1713570uh1UR.LIZ.LIZIZ) != null) {
            str = c1714040uhm.LIZLLL;
        } else {
            str = null;
        }
        this.LLJI = C1218820hp2.LIZ(context, str);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws JSONException {
        C19EG c19egLIZIZ;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        String str3;
        super.onCreate(bundle);
        C1713570uh1 c1713570uh1UR = UR();
        Context context = getContext();
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        C1715520ukA.LIZLLL("bio_vf_page_create", null, null, null);
        boolean z4 = true;
        boolean z5 = false;
        if (context != null) {
            if (c19egLIZIZ != null && c1713570uh1UR != null) {
                if (!C1716020uky.LIZ()) {
                    C1715520ukA.LIZLLL("bio_vf_system_check_2", CardStruct.IStatusCode.DEFAULT, null, null);
                    ZR(false);
                    return;
                }
                C1715520ukA.LIZLLL("bio_vf_system_check_2", "1", null, null);
                BioVerifyViewModel bioVerifyViewModelWR = WR();
                C1714660uim c1714660uimVR = VR();
                VerifyDetail verifyDetailLJIIIIZZ = c1713570uh1UR.LJIIIIZZ();
                if (verifyDetailLJIIIIZZ != null) {
                    str = verifyDetailLJIIIIZZ.walletUserId;
                } else {
                    str = null;
                }
                String str4 = "";
                if (str == null) {
                    str = "";
                }
                VerifyDetail verifyDetailLJIIIIZZ2 = c1713570uh1UR.LJIIIIZZ();
                if (verifyDetailLJIIIIZZ2 == null || (str2 = verifyDetailLJIIIIZZ2.challenge) == null) {
                    str2 = "";
                }
                VerifyDetail verifyDetailLJIIIIZZ3 = c1713570uh1UR.LJIIIIZZ();
                if (verifyDetailLJIIIIZZ3 != null && (str3 = verifyDetailLJIIIIZZ3.biometricDataTag) != null) {
                    str4 = str3;
                }
                bioVerifyViewModelWR.LLILLL = new C1715250ujj(str, str2, str4);
                bioVerifyViewModelWR.LLJ = c1713570uh1UR;
                bioVerifyViewModelWR.LLILZLL = new C1714950ujF(c1713570uh1UR, c1714660uimVR, null, new C1441005kW(null));
                bioVerifyViewModelWR.LLIZLLLIL = c1714660uimVR;
                BioVerifyViewModel bioVerifyViewModelWR2 = WR();
                if (bioVerifyViewModelWR2.LLILLL.LIZIZ.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && bioVerifyViewModelWR2.LLILLL.LIZ.length() != 0 && bioVerifyViewModelWR2.LLILLL.LIZJ.length() != 0) {
                    if (C1836510xtJ.LIZIZ(context).LIZ() != 0) {
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BioVerifyViewModel", "not satisfied: cannot authenticate");
                        C1715520ukA.LIZLLL("bio_vf_param_chk", "cannot_authenticate", null, null);
                        bioVerifyViewModelWR2.LLJI = "not_satisfied_cannot_authenticate";
                        bioVerifyViewModelWR2.wQ2();
                    } else {
                        C20121713oF c20121713oFLIZIZ = C1715790ukb.LIZIZ(bioVerifyViewModelWR2.LLILLL.LIZ);
                        String strLIZLLL = c20121713oFLIZIZ.LIZLLL();
                        if (!Intrinsics.LJFF(strLIZLLL, bioVerifyViewModelWR2.LLILLL.LIZJ)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("bio_tag_not_match: local:");
                            sbLIZ.append(strLIZLLL);
                            sbLIZ.append(" remote:");
                            sbLIZ.append(bioVerifyViewModelWR2.LLILLL.LIZJ);
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BioVerifyViewModel", C2188811AlT.LIZIZ(sbLIZ));
                            C1715520ukA.LIZLLL("bio_vf_param_chk", "bio_tag_not_match", null, null);
                            bioVerifyViewModelWR2.LLJI = "bio_tag_not_match";
                            bioVerifyViewModelWR2.wQ2();
                        } else if (c20121713oFLIZIZ.LIZ() == null) {
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BioVerifyViewModel", "not satisfied: no key");
                            C1715520ukA.LIZLLL("bio_vf_param_chk", "no_keypair", null, null);
                            bioVerifyViewModelWR2.LLJI = "not_satisfied_no_keypair";
                            bioVerifyViewModelWR2.wQ2();
                        } else {
                            C1715520ukA.LIZLLL("bio_vf_param_chk", "1", null, null);
                            return;
                        }
                    }
                } else {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("BioVerifyViewModel", "not satisfied: param empty");
                    bioVerifyViewModelWR2.LLJI = "not_satisfied_param_empty";
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("empty c:");
                    if (bioVerifyViewModelWR2.LLILLL.LIZIZ.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sbLIZ2.append(z2);
                    sbLIZ2.append(" w:");
                    if (bioVerifyViewModelWR2.LLILLL.LIZ.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sbLIZ2.append(z3);
                    sbLIZ2.append(" b:");
                    if (bioVerifyViewModelWR2.LLILLL.LIZJ.length() == 0) {
                        z5 = true;
                    }
                    sbLIZ2.append(z5);
                    C1715520ukA.LIZLLL("bio_vf_param_chk", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                }
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BioVerifyFragment", "viewModel isBioAuthNotSatisfied false");
                ZR(true);
                return;
            }
            z4 = false;
        }
        C1715520ukA.LIZJ("bio_verify_context_null", String.valueOf(z4), null, 12);
        SR("CANCEL", null);
    }

    public final void SR(String str, String str2) {
        C1713680uhC c1713680uhC;
        this.LLJ = true;
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        BioVerifyViewModel bioVerifyViewModelWR = WR();
        bioVerifyViewModelWR.getClass();
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2242108qR(bioVerifyViewModelWR, str, null), 2);
        C1713570uh1 c1713570uh1UR = UR();
        if (c1713570uh1UR != null && (c1713680uhC = c1713570uh1UR.LJIILIIL) != null) {
            c1713680uhC.LIZ(new C1713690uhD(this, str, VR().LIZIZ, str2, (String) null, (C1708530uYt) null, (Map) null, 232));
        }
    }

    public final void aS(String str, String str2) {
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            if (str == null) {
                str = getString(2131840142);
            }
            c1397580mTM.LJI(str);
            if (str2 == null) {
                str2 = getString(2131840141);
            }
            c1397580mTM.LIZIZ(str2);
            C1238130iKB.LIZ(c1397580mTM, new AwS605S0100000_26(this, 427));
            c1397580mTM.LIZLLL(new AwS605S0100000_26(this, 428));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && C1388190mED.LIZIZ(context) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C860740Xpg(this, context, null), 3);
            VR().LIZ("fp_sdk_bnpl_bio_show", C2097908Jt.LIZJ(new Pair("interface_return_cost", CardStruct.IStatusCode.DEFAULT)));
            BioVerifyViewModel bioVerifyViewModelWR = WR();
            bioVerifyViewModelWR.getClass();
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2242108qR(bioVerifyViewModelWR, null, null), 2);
            return;
        }
        SR("CANCEL", null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(this.LLJI), R.layout.i7a, viewGroup, false);
        C1390130mHL c1390130mHL = (C1390130mHL) C1616006Uk.LIZ(R.id.nnp, viewTd);
        if (c1390130mHL != null) {
            FrameLayout frameLayout = (FrameLayout) viewTd;
            this.LLIZ = new C1715220ujg(frameLayout, c1390130mHL);
            if (!Intrinsics.LJFF(PipoBiometryConfigSettings.LIZ().allowUserBack, Boolean.TRUE) && frameLayout != null) {
                frameLayout.setOnKeyListener(new View.OnKeyListener() { // from class: X.0uj7
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                        return i == 4;
                    }
                });
            }
            C19GS c19gs = null;
            if (!(frameLayout instanceof View)) {
                frameLayout = null;
            }
            if (frameLayout != null) {
                try {
                    ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                    ViewTreeViewModelStoreOwner.set(frameLayout, this);
                    frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                    C19EG activity = getActivity();
                    if (activity instanceof C19GS) {
                        c19gs = (C19GS) activity;
                    }
                    C1685300txQ.LIZ(c19gs);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return frameLayout;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(R.id.nnp)));
    }
}
