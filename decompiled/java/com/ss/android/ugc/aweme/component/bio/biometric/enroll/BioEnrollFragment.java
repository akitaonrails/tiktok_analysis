package com.ss.android.ugc.aweme.component.bio.biometric.enroll;

import X.AbstractC1177930gl5;
import X.C01GW;
import X.C098200Yq;
import X.C0T8W;
import X.C123100dR;
import X.C1238130iKB;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1389600mGU;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1685300txQ;
import X.C168Q;
import X.C1713870uhV;
import X.C1715260ujk;
import X.C1715520ukA;
import X.C1715830ukf;
import X.C1715910ukn;
import X.C1715920uko;
import X.C1715930ukp;
import X.C1715940ukq;
import X.C1716020uky;
import X.C1716030ukz;
import X.C1716050ul1;
import X.C1716300ulQ;
import X.C189200o6;
import X.C19EG;
import X.C19F0;
import X.C19GS;
import X.C2095008Iq;
import X.C2097908Jt;
import X.C21505619Eg;
import X.C2188811AlT;
import X.C336720DHy;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC452301pR;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.component.bio.biometric.ui.BioTransparentFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.common.ab.PipoBiometryConfigSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class BioEnrollFragment extends BioTransparentFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiPWExISHELIOSpiKyY8JSA4OyYwZiAiOyA/JGsOICAWJjcjJSMVOiQrJCo9PA==";
    public C1715930ukp LL;
    public final ViewModelLazy LLILLJJLI;
    public C1716050ul1 LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILZLL;
    public final AwS570S0100000_26 LLIZ;
    public final C1715940ukq<Boolean> LLIZLLLIL;
    public final C19F0<Intent> LLJ;
    public BottomSheetBehavior<?> LLJI;
    public boolean LLJIJIL;
    public final C1715920uko LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public Integer LLJJJ;

    public final void MR() {
        this.LLJIJIL = true;
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLJI;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            BottomSheetBehavior<?> bottomSheetBehavior2 = this.LLJI;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setState(5);
                return;
            }
            return;
        }
        try {
            dismissAllowingStateLoss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("closePageAndEndProcess dismissAllowingStateLoss error: ");
            sbLIZ.append(C0T8W.LIZ(e));
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("BioEnrollFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final BioEnrollViewModel NR() {
        return (BioEnrollViewModel) this.LLILLJJLI.getValue();
    }

    public final Integer OR() {
        Integer num = this.LLJJJ;
        if (num == null) {
            return null;
        }
        if (num.intValue() == 1) {
            return Integer.valueOf(C1385040m98.LIZJ(true));
        }
        if (num.intValue() == 2) {
            return Integer.valueOf(C1385040m98.LIZJ(false));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0uko] */
    public BioEnrollFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS570S0100000_26((Function0) new AwS570S0100000_26((Fragment) this, 123), 124));
        this.LLILLJJLI = C336720DHy.LIZ(this, C13LE.LIZ(BioEnrollViewModel.class), new AwS570S0100000_26(c01gwLIZ, 125), new AwS427S0200000_26((Function0) null, c01gwLIZ, 7), new AwS427S0200000_26(this, c01gwLIZ, 8));
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 122));
        this.LLIZ = new AwS570S0100000_26(this, 126);
        this.LLIZLLLIL = new C1715940ukq<>(AFwS268S0000000_26.get$arr$(104));
        this.LLJ = registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.0ukk
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                C19EG c19egLIZIZ;
                if (((ActivityResult) obj).resultCode == -1) {
                    Context context = this.LIZ.getContext();
                    if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                        C1715520ukA.LIZLLL("bio_ulk_dv_rsp", "1", null, null);
                        this.LIZ.NR().yQ2(c19egLIZIZ);
                        return;
                    }
                    C1715520ukA.LIZLLL("bio_ulk_dv_rsp", "activity_null_after_success", null, null);
                } else {
                    C1715520ukA.LIZLLL("bio_ulk_dv_rsp", CardStruct.IStatusCode.DEFAULT, null, null);
                }
                this.LIZ.NR().EQ2();
            }
        });
        this.LLJILJIL = new AbstractC1177930gl5() { // from class: X.0uko
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
                View view2;
                C1715930ukp c1715930ukp = this.LIZ.LL;
                if (c1715930ukp != null && (view2 = c1715930ukp.LIZIZ) != null) {
                    C786410Ut5.T4(view2, f + 1);
                }
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view) {
                View view2;
                View view3;
                if (i != 3) {
                    if (i == 5) {
                        C1715930ukp c1715930ukp = this.LIZ.LL;
                        if (c1715930ukp != null && (view3 = c1715930ukp.LIZIZ) != null) {
                            C786410Ut5.T4(view3, 0.0f);
                        }
                        if (this.LIZ.LLJIJIL) {
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("BioEnrollFragment", "bottomSheetCallback dismissWithAnimate");
                            try {
                                this.LIZ.dismissAllowingStateLoss();
                                C189200o6.m2constructorimpl(Unit.LIZ);
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                C1715930ukp c1715930ukp2 = this.LIZ.LL;
                if (c1715930ukp2 != null && (view2 = c1715930ukp2.LIZIZ) != null) {
                    C786410Ut5.T4(view2, 1.0f);
                }
            }
        };
    }

    public final void PR(C1715260ujk c1715260ujk) {
        C1716050ul1 c1716050ul1 = this.LLILLL;
        if (c1716050ul1 != null) {
            C1716050ul1.LJ(c1716050ul1, "biometric_info_open_fail", new String[]{"try_again", "enable_later"});
        }
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(SR(context));
            String string = c1715260ujk.LIZ;
            if (string == null) {
                string = getString(2131840142);
            }
            c1397580mTM.LJI(string);
            c1397580mTM.LJII = false;
            String string2 = c1715260ujk.LIZIZ;
            if (string2 == null) {
                string2 = getString(2131840141);
            }
            c1397580mTM.LIZIZ(string2);
            C1238130iKB.LIZ(c1397580mTM, new AwS605S0100000_26(this, 76));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public final Context SR(Context context) {
        Integer numOR = OR();
        if (numOR != null) {
            return new C1361400lX0(context, numOR.intValue());
        }
        return context;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws JSONException {
        Integer numLJIIJJI;
        int iIntValue;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("openPageUrl");
            if (C123100dR.LIZ(string)) {
                Uri uri = UriProtector.parse(string);
                if (uri.isHierarchical()) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                    String str = "";
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pipo_product_code");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "wallet_user_id");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "host");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                    }
                    this.LLJILJILJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "session_id");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
                    }
                    this.LLJILLL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, Scene.SCENE_SERVICE);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                    }
                    this.LLJJI = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    }
                    this.LLJJIII = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7;
                    this.LLJJIJI = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "merchant_id");
                    this.LLJJIJIIJIL = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "merchant_user_id");
                    this.LLJJIJIL = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "token");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "force_theme");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8)) == null || ((iIntValue = numLJIIJJI.intValue()) != 1 && iIntValue != 2)) {
                        numLJIIJJI = null;
                    }
                    this.LLJJJ = numLJIIJJI;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "flow_type");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = "FIXED_SETTINGS";
                    }
                    String str2 = this.LLJILJILJ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = this.LLJILLL;
                    if (str3 != null) {
                        str = str3;
                    }
                    C1715910ukn c1715910ukn = new C1715910ukn(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, str2, str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9, C1716300ulQ.LIZ(), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "title"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "light_image"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "dark_image"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "instruction"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enable_btn"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "skip_button"));
                    this.LLILLL = new C1716050ul1(C1716020uky.LIZLLL(uri));
                    NR().LLILZ = c1715910ukn;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "entrance_type");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                    }
                    this.LLJJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10;
                    C1716030ukz.LIZIZ(this.LLJILJILJ, this.LLJILLL, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10, "BIO", null);
                }
            }
        }
        this.LLILZ = SystemClock.elapsedRealtime();
        C1716050ul1 c1716050ul1 = this.LLILLL;
        if (c1716050ul1 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c1716050ul1.LIZJ(linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            C1713870uhV.LIZ("fp_sdk_biometric_info_agreement_show", linkedHashMap2);
        }
        C1715520ukA.LIZLLL("bio_ef_guide_show", null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.component.bio.biometric.ui.BioTransparentFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        if (!Intrinsics.LJFF(PipoBiometryConfigSettings.LIZ().allowUserBack, Boolean.TRUE)) {
            dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0ukr
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return i == 4;
                }
            });
        }
        Integer numOR = OR();
        if (numOR != null) {
            int iIntValue = numOR.intValue();
            dialogOnCreateDialog.getContext().setTheme(iIntValue);
            dialogOnCreateDialog.getLayoutInflater().cloneInContext(new C1361400lX0(dialogOnCreateDialog.getContext(), iIntValue));
        }
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("BioEnrollFragment", "Fragment onDismiss");
        if (!this.LLILZIL) {
            this.LLIZLLLIL.LIZ(Boolean.valueOf(((C1715830ukf) NR().LLILLL.getValue()).LJIIIIZZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5 A[PHI: r1
      0x00a5: PHI (r1v26 java.lang.String) = (r1v9 java.lang.String), (r1v28 java.lang.String) binds: [B:60:0x01ce, B:23:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.component.bio.biometric.ui.BioTransparentFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void RR(String str, String str2, Function0<Unit> function0) {
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(SR(context));
            c1397580mTM.LJII = false;
            if (str == null) {
                c1397580mTM.LJI(getString(2131840142));
            } else {
                c1397580mTM.LJI(str);
            }
            if (str2 != null) {
                c1397580mTM.LIZIZ(str2);
            } else {
                c1397580mTM.LIZIZ(getString(2131840141));
            }
            C1238130iKB.LIZ(c1397580mTM, new AwS392S0200000_26(this, (BioEnrollFragment) function0, (Function0<Unit>) 8));
            c1397580mTM.LIZLLL(new AwS605S0100000_26(this, 77));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c7k, viewGroup, false);
        this.LL = new C1715930ukp(viewTd);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
