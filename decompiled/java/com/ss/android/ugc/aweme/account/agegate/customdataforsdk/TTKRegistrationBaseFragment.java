package com.ss.android.ugc.aweme.account.agegate.customdataforsdk;

import X.AbstractC1250290idn;
import X.C01GW;
import X.C098200Yq;
import X.C0FNV;
import X.C0OM1;
import X.C0XQS;
import X.C0XQT;
import X.C10TG;
import X.C10VR;
import X.C10WS;
import X.C1235760iGM;
import X.C1236880iIA;
import X.C1238130iKB;
import X.C1250250idj;
import X.C1250280idm;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1391850mK7;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19254610Um;
import X.C19258510Vz;
import X.C19299010eq;
import X.C19300110f1;
import X.C19301110fB;
import X.C19318010hu;
import X.C19331610k6;
import X.C19334710kb;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21405318pn;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C294000Bfi;
import X.C294530BgZ;
import X.C294540Bga;
import X.C341940Daq;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C444890HcV;
import X.C444920HcY;
import X.C452501pT;
import X.C770750ULh;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.C849850XVn;
import X.C960203pA;
import X.C985403tE;
import X.DialogC1389620mGW;
import X.EnumC19298710en;
import X.EnumC19300210f2;
import X.EnumC19300410f4;
import X.EnumC19300510f5;
import X.EnumC19300610f6;
import X.EnumC19301010fA;
import X.InterfaceC19301510fF;
import Y.ACListenerS162S0100000_28;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJAgeGateRemoveLoginService;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.ss.android.ugc.aweme.services.IAwemeAccountAppDiffService;
import com.ss.android.ugc.aweme.services.ISignupAndLoginPanelReorderService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS30S1400000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public class TTKRegistrationBaseFragment extends Fragment implements C10WS {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiKCg2LyQ4LGEwPTHELIOSY4JiI3KTEtLyAhOyEnZxsHAxcpLiYgPDctPSY8JgctOioVOiQrJCo9PA==";
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public SmartImageView LLILLL;
    public TuxNavBar LLILZ;
    public FrameLayout LLILZIL;
    public C19318010hu LLILZLL;
    public TuxTextView LLIZ;
    public LinearLayout LLIZLLLIL;
    public C197039127h LLJ;
    public ConstraintLayout LLJI;
    public TuxTextView LLJIJIL;
    public LinearLayout LLJILJIL;
    public LinearLayout LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxTextView LLJJ;
    public C21405318pn LLJJI;
    public TuxTextView LLJJIII;
    public ConstraintLayout LLJJIJI;
    public boolean LLJJJJ;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public DialogC1389620mGW LLJLL;
    public final Map<String, String> LLJJIJIIJIL = new LinkedHashMap(RegistrationAgeGateServiceImpl.LIZJ);
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(76));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 54));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 55));
    public final Set<String> LLJJJJJIL = C13LQ.LJLIIL(new String[]{"br_parental_consent", "AU_U16_BLOCK"});
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 58));

    public final void clearFromXmlViewCache() {
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
    }

    public final void onBackPressed() {
        this.LLJLIL = true;
        if (!YS()) {
            bJ().postValue(Unit.LIZ);
            return;
        }
        ISignupAndLoginPanelReorderService iSignupAndLoginPanelReorderService = (ISignupAndLoginPanelReorderService) PluggableExtentionKt.pluggableSpi$default(ISignupAndLoginPanelReorderService.class, false, false, false, 14, null);
        if (iSignupAndLoginPanelReorderService != null && iSignupAndLoginPanelReorderService.reorderSignupAndLoginPanelToForeground(getActivity())) {
            C10VR.LIZIZ("back");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_fullscreen_dialog", false);
        bundle.putBoolean("is_skippable_dialog", true);
        fT(bundle, true);
    }

    public final FrameLayout UR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajp) : null;
            this.LLILZIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final TuxTextView VR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajq) : null;
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView WR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajr) : null;
            this.LL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C19318010hu ZR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajs) : null;
            this.LLILZLL = (C19318010hu) viewFindViewById;
        }
        return (C19318010hu) viewFindViewById;
    }

    public final C21405318pn aS() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajv) : null;
            this.LLJJI = (C21405318pn) viewFindViewById;
        }
        return (C21405318pn) viewFindViewById;
    }

    public final SmartImageView bS() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajw) : null;
            this.LLILLL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final TuxTextView cS() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajx) : null;
            this.LLJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final LinearLayout dS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajy) : null;
            this.LLIZLLLIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxTextView gS() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajz) : null;
            this.LLJJIII = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C197039127h hS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ak1) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxNavBar iS() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ak2) : null;
            this.LLILZ = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final LinearLayout kS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ak6) : null;
            this.LLJILJILJ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final int mS() {
        return ((Number) this.LLJJJIL.getValue()).intValue();
    }

    public final TuxTextView nS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.npc) : null;
            this.LLIZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView oS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pnj) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final LinearLayout qS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qff) : null;
            this.LLJILJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final ConstraintLayout rS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vam) : null;
            this.LLJI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final TTKCustomViewModel sS() {
        return (TTKCustomViewModel) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.C10WS
    public final MutableLiveData<Integer> MM() {
        return sS().LLILLL;
    }

    public final void NR() {
        C197039127h c197039127hHS;
        if (!C294000Bfi.LIZ() || (c197039127hHS = hS()) == null) {
            return;
        }
        C1236880iIA.LIZJ(c197039127hHS, getContext(), R.attr.a00, R.attr.a0o);
    }

    public LiveData<C19258510Vz> Un() {
        return sS().LLILZIL;
    }

    public void VS() {
        C197039127h c197039127hHS = hS();
        if (c197039127hHS != null) {
            C786410Ut5.U8(c197039127hHS, new ACListenerS162S0100000_28(this, 25));
        }
    }

    public final boolean YS() {
        INUJAgeGateRemoveLoginService iNUJAgeGateRemoveLoginService;
        return mS() == AgeGateSdkRegistrationFlow.NEW_COMPONENT.getFlow() && (iNUJAgeGateRemoveLoginService = (INUJAgeGateRemoveLoginService) PluggableExtentionKt.pluggableSpi$default(INUJAgeGateRemoveLoginService.class, false, false, false, 14, null)) != null && iNUJAgeGateRemoveLoginService.LIZ();
    }

    @Override // X.C10WS
    public final MutableLiveData<Unit> bJ() {
        return sS().LLILZ;
    }

    public final void gT() {
        Integer numLIZJ;
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        Integer num = null;
        if (!(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0)) {
            MutableLiveData<Integer> mutableLiveDataMM = MM();
            if (mutableLiveDataMM != null) {
                mutableLiveDataMM.postValue(null);
                return;
            }
            return;
        }
        C10TG c10tgLJII = C19254610Um.LIZIZ.LJII();
        if (c10tgLJII != null && (numLIZJ = c10tgLJII.LIZJ(mS())) != null) {
            num = numLIZJ;
        }
        MutableLiveData<Integer> mutableLiveDataMM2 = MM();
        if (mutableLiveDataMM2 != null) {
            mutableLiveDataMM2.postValue(num);
        }
    }

    @Override // X.C10WS
    public final LiveData iz() {
        return sS().LLILLJJLI;
    }

    @Override // X.C10WS
    public final LiveData<Date> mD() {
        return sS().LL;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (C294530BgZ.LIZ()) {
            DialogC1389620mGW dialogC1389620mGW = this.LLJLL;
            if (dialogC1389620mGW != null) {
                C0FNV.LIZIZ(dialogC1389620mGW);
            }
            DialogC1389620mGW dialogC1389620mGW2 = this.LLJLL;
            if (dialogC1389620mGW2 != null) {
                dialogC1389620mGW2.cancel();
            }
            DialogC1389620mGW dialogC1389620mGW3 = this.LLJLL;
            if (dialogC1389620mGW3 != null) {
                dialogC1389620mGW3.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW3);
            }
            this.LLJLL = null;
        }
        super.onDestroy();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(this.LLJJIJIIJIL);
        c2344009Gk.LJIIIIZZ("default_format", C10VR.LIZ());
        c2344009Gk.LIZJ(this.LLJJJJLIIL, "day");
        c2344009Gk.LIZJ(this.LLJJL, "month");
        c2344009Gk.LIZJ(this.LLJJLIIIJLLLLLLLZ, "year");
        c2344009Gk.LIZJ(Math.max(this.LLJJJJLIIL, Math.max(this.LLJJL, this.LLJJLIIIJLLLLLLLZ)), "selected_cnt");
        c2344009Gk.LIZJ(this.LLJL ? 1 : 0, "is_submit");
        c2344009Gk.LIZJ(this.LLJLIL ? 1 : 0, "is_back");
        C20684815ws.LJIILLIIL("age_scroll_result", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (C294540Bga.LIZ()) {
            if (C294530BgZ.LIZ()) {
                DialogC1389620mGW dialogC1389620mGW = this.LLJLL;
                if (dialogC1389620mGW != null) {
                    C0FNV.LIZIZ(dialogC1389620mGW);
                }
                DialogC1389620mGW dialogC1389620mGW2 = this.LLJLL;
                if (dialogC1389620mGW2 != null) {
                    dialogC1389620mGW2.cancel();
                }
                DialogC1389620mGW dialogC1389620mGW3 = this.LLJLL;
                if (dialogC1389620mGW3 != null) {
                    dialogC1389620mGW3.dismiss();
                    C785410UrT.LIZ(dialogC1389620mGW3);
                }
                this.LLJLL = null;
            } else {
                DialogC1389620mGW dialogC1389620mGW4 = this.LLJLL;
                if (dialogC1389620mGW4 != null) {
                    dialogC1389620mGW4.hide();
                }
            }
            sS().LLILZLL.postValue(Boolean.FALSE);
        }
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (mS() == AgeGateSdkRegistrationFlow.SIGN_UP.getFlow() || this.LLJL || this.LLJLIL) {
            return;
        }
        C10VR.LIZIZ("background");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C19EG activity = getActivity();
        if (activity != null) {
            KeyboardUtils.LJ(16, activity, 240);
        }
    }

    public void qh() {
        C786410Ut5.LLLLZLL(oS(), 0);
    }

    public static void XS(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playSequentially(ObjectAnimator.ofFloat(view, "translationX", 0.0f, -C341940Daq.LIZ(6.0d)).setDuration(80L), ObjectAnimator.ofFloat(view, "translationX", -C341940Daq.LIZ(6.0d), 0.0f).setDuration(80L), ObjectAnimator.ofFloat(view, "translationX", 0.0f, C341940Daq.LIZ(4.0d)).setDuration(60L), ObjectAnimator.ofFloat(view, "translationX", C341940Daq.LIZ(4.0d), 0.0f).setDuration(60L), ObjectAnimator.ofFloat(view, "translationX", 0.0f, -C341940Daq.LIZ(2.0d)).setDuration(40L), ObjectAnimator.ofFloat(view, "translationX", -C341940Daq.LIZ(2.0d), 0.0f).setDuration(40L), ObjectAnimator.ofFloat(view, "translationX", 0.0f, C341940Daq.LIZ(1.0d)).setDuration(20L), ObjectAnimator.ofFloat(view, "translationX", C341940Daq.LIZ(1.0d), 0.0f).setDuration(20L));
        animatorSet.start();
    }

    public static boolean hT(int i) {
        if (i != EnumC19301010fA.NATIVE.getType() && i != EnumC19301010fA.URL.getType() && i != EnumC19301010fA.DISMISS.getType() && i != EnumC19301010fA.CONTINUE.getType()) {
            EnumC19301010fA.EXIT.getType();
            return false;
        }
        return true;
    }

    public void ES(Date date) {
        ZR().LIZJ(date);
    }

    public void FS(String str) {
        int i;
        if (str == null) {
            Context context = getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                i = R.drawable.bdm;
            } else {
                i = R.drawable.bdl;
            }
            C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(i);
            c1331670kl3LJFF.LJJ(bS());
            C786410Ut5.h3(c1331670kl3LJFF);
            return;
        }
        if (a0.LJJJIL(str)) {
            C786410Ut5.LLFF(8, bS());
        } else {
            if (!(true ^ a0.LJJJIL(str))) {
                return;
            }
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
            c1331670kl3LJI.LJJ(bS());
            C786410Ut5.h3(c1331670kl3LJI);
            C786410Ut5.LLFF(0, bS());
        }
    }

    public void GS(String str) {
        EditText editText;
        C21405318pn c21405318pnAS = aS();
        if (c21405318pnAS != null && (editText = c21405318pnAS.getEditText()) != null) {
            editText.setHint(str);
            editText.setInputType(0);
            editText.setTypeface(Typeface.DEFAULT);
            editText.setEnabled(true);
        }
    }

    public void HS(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        ZR().setLowerBoundDate(calendar);
    }

    public void Kq(String str) {
        C21405318pn c21405318pnAS;
        if (str != null && (c21405318pnAS = aS()) != null) {
            c21405318pnAS.setText(str);
        }
    }

    public void Kz(boolean z) {
        hS().setEnabled(z);
        if (z) {
            C786410Ut5.LJZL(8, kS());
        }
    }

    public final void MR(String str) {
        if (IAwemeAccountAppDiffService.Companion.get().isQuitApp(str)) {
            SmartRouter.buildRoute(this, "aweme://pns/close").open();
        }
    }

    public void NS(String str) {
        C197039127h c197039127hHS = hS();
        if (c197039127hHS != null) {
            c197039127hHS.setText(str);
        }
    }

    public void OR(PNSErrorModel pNSErrorModel) {
        Integer num = pNSErrorModel.errorType;
        if (num != null) {
            int iIntValue = num.intValue();
            EnumC19300510f5.Companion.getClass();
            int i = C19300110f1.LIZIZ[C19301110fB.LIZ(iIntValue).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String string = pNSErrorModel.errorMessage;
                        if (string != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(this);
                            if (string.length() == 0) {
                                string = getString(2131837962);
                            }
                            c1389890mGx.LJIIJ(string);
                            c1389890mGx.LJIIJJI();
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                eT(pNSErrorModel.errorMessage, false);
                return;
            }
            eT(pNSErrorModel.errorMessage, true);
        }
    }

    public final void PR(String str) {
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(getContext(), str).open();
        }
    }

    public void PS(String str) {
        WR().setText(str);
        C786410Ut5.LLLLZLL(WR(), 0);
    }

    public void QS(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        ZR().setUpperBoundDate(calendar);
    }

    public AbstractC1250290idn SR(PNSNavButton pNSNavButton) {
        EnumC19300210f2 enumC19300210f2;
        if (pNSNavButton != null && (enumC19300210f2 = pNSNavButton.type) != null) {
            switch (C19300110f1.LIZ[enumC19300210f2.ordinal()]) {
            }
            return new C1250280idm();
        }
        return new C1250280idm();
    }

    public void US(C19299010eq c19299010eq) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        List<PNSHyperlink> list;
        String str5 = null;
        if (c19299010eq != null) {
            str = c19299010eq.title;
        } else {
            str = null;
        }
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLLLZLL(WR(), 8);
        } else {
            if (c19299010eq != null) {
                str2 = c19299010eq.title;
            } else {
                str2 = null;
            }
            PS(str2);
        }
        if (c19299010eq != null && (str3 = c19299010eq.contentDesc) != null && !a0.LJJJIL(str3)) {
            if (c19299010eq != null) {
                str4 = c19299010eq.contentDesc;
                list = c19299010eq.hyperLinks;
            } else {
                str4 = null;
                list = null;
            }
            BS(str4, list);
        } else {
            C786410Ut5.LLLLZLL(VR(), 8);
        }
        if (c19299010eq != null) {
            str5 = c19299010eq.nextBtnText;
        }
        NS(str5);
    }

    public void er(String str) {
        gS().setText(str);
    }

    public void jF(boolean z) {
        hS().setLoading(z);
    }

    public void lu(C19299010eq c19299010eq) {
        boolean z;
        if (c19299010eq == null) {
            return;
        }
        US(c19299010eq);
        JS(c19299010eq.header, c19299010eq.navButtons);
        FS(c19299010eq.imageUrl);
        GS(c19299010eq.inputPlaceHolder);
        Date date = c19299010eq.defaultDate;
        if (date == null) {
            date = new Date();
        }
        ES(date);
        Date date2 = c19299010eq.upperBound;
        if (date2 == null) {
            date2 = new Date();
        }
        QS(date2);
        Date date3 = c19299010eq.lowerBound;
        if (date3 != null) {
            HS(date3);
        }
        if (c19299010eq.indicatorType == EnumC19300610f6.DISPLAY) {
            z = true;
        } else {
            z = false;
        }
        zS(z);
        TuxTextView tuxTextViewOS = oS();
        C844470XAv.LIZ.getClass();
        tuxTextViewOS.setText(C844470XAv.LIZ().getString(2131847051));
    }

    public final void uS(C19318010hu c19318010hu) {
        if (sS().LL.getValue() != null) {
            if (c19318010hu != null) {
                c19318010hu.LIZLLL(sS().LL.getValue());
            } else {
                return;
            }
        } else if (c19318010hu == null) {
            return;
        }
        c19318010hu.LLIZ = new InterfaceC19301510fF() { // from class: X.10f7
            @Override // X.InterfaceC19301510fF
            public final void LIZ(Calendar calendar, int i) {
                Date time;
                MutableLiveData<Date> mutableLiveData = this.LIZ.sS().LL;
                if (calendar != null) {
                    time = calendar.getTime();
                } else {
                    time = null;
                }
                mutableLiveData.postValue(time);
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            TTKRegistrationBaseFragment tTKRegistrationBaseFragment = this.LIZ;
                            if (tTKRegistrationBaseFragment.LLJJJJLIIL == 0) {
                                tTKRegistrationBaseFragment.LLJJJJLIIL = Math.max(tTKRegistrationBaseFragment.LLJJL, tTKRegistrationBaseFragment.LLJJLIIIJLLLLLLLZ) + 1;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    TTKRegistrationBaseFragment tTKRegistrationBaseFragment2 = this.LIZ;
                    if (tTKRegistrationBaseFragment2.LLJJL != 0) {
                        return;
                    }
                    tTKRegistrationBaseFragment2.LLJJL = Math.max(tTKRegistrationBaseFragment2.LLJJJJLIIL, tTKRegistrationBaseFragment2.LLJJLIIIJLLLLLLLZ) + 1;
                    return;
                }
                TTKRegistrationBaseFragment tTKRegistrationBaseFragment3 = this.LIZ;
                if (tTKRegistrationBaseFragment3.LLJJLIIIJLLLLLLLZ != 0) {
                    return;
                }
                tTKRegistrationBaseFragment3.LLJJLIIIJLLLLLLLZ = Math.max(tTKRegistrationBaseFragment3.LLJJJJLIIL, tTKRegistrationBaseFragment3.LLJJL) + 1;
            }
        };
    }

    public final void wS(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(this.LLJJIJIIJIL);
        c2344009Gk.LJIIIIZZ("enter_method", "quit_confirmation");
        c2344009Gk.LJIIIIZZ("result", str);
        C20684815ws.LJIILLIIL("confirmation_pop_up_response", c2344009Gk.LIZ);
    }

    public void zS(boolean z) {
        int i;
        TuxTextView tuxTextViewGS = gS();
        if (tuxTextViewGS != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextViewGS, i);
        }
    }

    public void BS(String str, List<PNSHyperlink> list) {
        int iIntValue;
        int iIntValue2;
        VR().setText(str);
        C786410Ut5.LLLLZLL(VR(), 0);
        TuxTextView tuxTextViewVR = VR();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, requireContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextViewVR.setTextColor(iIntValue);
        TuxTextView tuxTextViewVR2 = VR();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bm, requireContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        tuxTextViewVR2.setHighlightColor(iIntValue2);
        if (list != null && !list.isEmpty()) {
            VR().setText(ZS(VR().getText().toString(), list));
            VR().setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // X.C10WS
    public final void Iq(PNSFeedbackModel pNSFeedbackModel, Function1<? super Integer, Unit> function1) {
        PNSDialogModel pNSDialogModel;
        Integer num;
        String str;
        CharSequence charSequenceZS;
        String str2;
        String str3;
        PNSAgeConfirmOption pNSAgeConfirmOption;
        PNSAgeConfirmOption pNSAgeConfirmOption2;
        PNSErrorModel pNSErrorModel;
        if (pNSFeedbackModel != null) {
            pNSDialogModel = pNSFeedbackModel.dialogModel;
            num = pNSFeedbackModel.f72case;
        } else {
            pNSDialogModel = null;
            num = null;
        }
        String str4 = "";
        if (pNSFeedbackModel == null || (str = pNSFeedbackModel.business) == null) {
            str = "";
        }
        if (pNSDialogModel == null) {
            function1.invoke(Integer.valueOf(EnumC19301010fA.CONTINUE.getType()));
        } else if (!this.LLJJJJ) {
            this.LLJJJJ = true;
            int i = pNSDialogModel.styleType;
            if (this.LLJJJJJIL.contains(str)) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_method", str);
                c2344009Gk.LJIIIIZZ("business", str);
                c2344009Gk.LIZJ(i, "style_type");
                C20684815ws.LJIILLIIL("show_confirmation_pop_up", c2344009Gk.LIZ);
            } else {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJII(this.LLJJIJIIJIL);
                c2344009Gk2.LJ(num, "type");
                C20684815ws.LJIILLIIL("age_gate_popup_show", c2344009Gk2.LIZ);
            }
            if (pNSDialogModel.styleType == 1) {
                AwS30S1400000_28 awS30S1400000_28 = new AwS30S1400000_28(this, pNSDialogModel, num, str, function1, 0);
                jF(false);
                C770750ULh c770750ULh = new C770750ULh();
                String str5 = pNSDialogModel.title;
                if (str5 == null) {
                    str5 = "";
                }
                c770750ULh.LJ = str5;
                c770750ULh.LJIILLIIL = false;
                String str6 = pNSDialogModel.message;
                if (str6 != null) {
                    str4 = str6;
                }
                c770750ULh.LIZJ(str4);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_shield_exclamation;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c770750ULh.LIZIZ = c419910GdJ;
                c770750ULh.LIZLLL = 3;
                List<PNSAgeConfirmOption> list = pNSDialogModel.options;
                if (list != null && (pNSAgeConfirmOption2 = (PNSAgeConfirmOption) ListProtector.get(list, 1)) != null) {
                    str2 = pNSAgeConfirmOption2.optionContent;
                } else {
                    str2 = null;
                }
                List<PNSAgeConfirmOption> list2 = pNSDialogModel.options;
                if (list2 != null && (pNSAgeConfirmOption = (PNSAgeConfirmOption) ListProtector.get(list2, 0)) != null) {
                    str3 = pNSAgeConfirmOption.optionContent;
                } else {
                    str3 = null;
                }
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                Float fValueOf = Float.valueOf(16.0f);
                layoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
                layoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
                C786410Ut5.d6(linearLayout, layoutParams);
                linearLayout.setGravity(1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f))));
                C197039127h c197039127h = new C197039127h(linearLayout.getContext(), null, 6, 0);
                c197039127h.setText(str2);
                c197039127h.setButtonVariant(1);
                C786410Ut5.J6(c197039127h, layoutParams2);
                C786410Ut5.U8(c197039127h, new ACListenerS162S0100000_28(awS30S1400000_28, 11));
                C197039127h c197039127h2 = new C197039127h(linearLayout.getContext(), null, 6, 0);
                c197039127h2.setText(str3);
                c197039127h2.setButtonVariant(1);
                C786410Ut5.J6(c197039127h2, layoutParams2);
                C786410Ut5.U8(c197039127h2, new ACListenerS162S0100000_28(awS30S1400000_28, 12));
                linearLayout.addView(c197039127h);
                linearLayout.addView(c197039127h2);
                c770750ULh.LJIILL = linearLayout;
                TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
                tuxSheet.LLILLL = false;
                tuxSheet.LLJLLIL = false;
                tuxSheet.LLJLLL = false;
                tuxSheet.show(getChildFragmentManager(), "TTKAgeGateRegistrationFragment");
            } else {
                C1397580mTM c1397580mTM = new C1397580mTM(requireContext());
                String str7 = pNSDialogModel.title;
                if (str7 != null) {
                    str4 = str7;
                }
                c1397580mTM.LJI(str4);
                List<PNSHyperlink> list3 = pNSDialogModel.hyperLinks;
                if (list3 != null) {
                    charSequenceZS = ZS(pNSDialogModel.message, list3);
                } else {
                    charSequenceZS = pNSDialogModel.message;
                }
                c1397580mTM.LIZIZ(charSequenceZS);
                c1397580mTM.LJII = pNSDialogModel.cancellable;
                Integer num2 = pNSDialogModel.style;
                int value = EnumC19298710en.ACTION.getValue();
                if (num2 != null && num2.intValue() == value) {
                    C985403tE.LIZ(c1397580mTM, new AwS30S1400000_28(this, pNSDialogModel, num, str, function1, 1));
                } else {
                    C1238130iKB.LIZ(c1397580mTM, new AwS30S1400000_28(this, pNSDialogModel, num, str, function1, 2));
                }
                c1397580mTM.LJII = pNSDialogModel.cancellable;
                if (pNSDialogModel.addExclamationIcon) {
                    C1235760iGM.LIZ(c1397580mTM, R.raw.icon_exclamation_mark_circle, null, 6);
                }
                C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                C1391850mK7.LIZIZ(c1397510mTF, "481");
                c1397510mTF.LIZLLL();
                jF(false);
            }
        }
        if (pNSFeedbackModel != null && (pNSErrorModel = pNSFeedbackModel.errorModel) != null) {
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LJII(this.LLJJIJIIJIL);
            Integer num3 = pNSErrorModel.errorType;
            if (num3 != null) {
                num3.intValue();
                c2344009Gk3.LJ(pNSFeedbackModel.f72case, "type");
            }
            C20684815ws.LJIILLIIL("age_gate_response_error_show", c2344009Gk3.LIZ);
            OR(pNSErrorModel);
        }
    }

    public void JS(String str, List list) {
        PNSNavButton pNSNavButton;
        PNSNavButton pNSNavButton2 = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            pNSNavButton = null;
            while (it2.hasNext()) {
                PNSNavButton pNSNavButton3 = (PNSNavButton) it2.next();
                EnumC19300410f4 enumC19300410f4 = pNSNavButton3.position;
                if (enumC19300410f4 == EnumC19300410f4.LEFT) {
                    pNSNavButton2 = pNSNavButton3;
                } else if (enumC19300410f4 == EnumC19300410f4.RIGHT) {
                    pNSNavButton = pNSNavButton3;
                }
            }
        } else {
            pNSNavButton = null;
        }
        C786410Ut5.LLLLZLLLI(iS(), 0);
        TuxNavBar tuxNavBarIS = iS();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(SR(pNSNavButton2));
        C1250250idj c1250250idj = new C1250250idj();
        if (str == null) {
            str = "";
        }
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(SR(pNSNavButton));
        c0om1.LIZLLL = false;
        tuxNavBarIS.setNavActions(c0om1);
    }

    public final C1251150ifB RR(int i, Function0 function0) {
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = i;
        c1251150ifB.LJI = true;
        c1251150ifB.LIZJ(new AwS572S0100000_28(function0, (Function0<Unit>) 19));
        return c1251150ifB;
    }

    public final SpannableStringBuilder ZS(String str, List list) {
        String strReplace;
        Spanned spannedFromHtml;
        int iIntValue;
        if (str != null) {
            strReplace = u.LJJIFFI(str, "\n", "<br>", false);
        } else {
            strReplace = null;
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PNSHyperlink pNSHyperlink = (PNSHyperlink) it2.next();
                if (strReplace != null) {
                    String str2 = pNSHyperlink.ageGateHyperlinkText;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Regex regex = new Regex(str2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("<a href=\"");
                    sbLIZ.append(pNSHyperlink.ageGateHyperlinkAction);
                    sbLIZ.append("\">");
                    sbLIZ.append(pNSHyperlink.ageGateHyperlinkText);
                    sbLIZ.append("</a>");
                    strReplace = regex.replace(strReplace, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    strReplace = null;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            spannedFromHtml = Html.fromHtml(strReplace, 63);
        } else {
            spannedFromHtml = Html.fromHtml(strReplace);
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(spannedFromHtml);
        for (Object obj : spannableStringBuilderValueOf.getSpans(0, spannableStringBuilderValueOf.length(), URLSpan.class)) {
            URLSpan uRLSpan = (URLSpan) obj;
            C786410Ut5.q2(spannableStringBuilderValueOf, new C19331610k6(uRLSpan, this, 1), spannableStringBuilderValueOf.getSpanStart(uRLSpan), spannableStringBuilderValueOf.getSpanEnd(uRLSpan), 17);
            C786410Ut5.q2(spannableStringBuilderValueOf, new C444920HcY(42, false), spannableStringBuilderValueOf.getSpanStart(uRLSpan), spannableStringBuilderValueOf.getSpanEnd(uRLSpan), 18);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, requireContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C786410Ut5.q2(spannableStringBuilderValueOf, new ForegroundColorSpan(iIntValue), spannableStringBuilderValueOf.getSpanStart(uRLSpan), spannableStringBuilderValueOf.getSpanEnd(uRLSpan), 18);
        }
        return spannableStringBuilderValueOf;
    }

    public final void eT(String str, boolean z) {
        int iIntValue;
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.ak5);
            } else {
                viewFindViewById = null;
            }
            this.LLJILLL = (TuxIconView) viewFindViewById;
        }
        ImageView imageView = (ImageView) viewFindViewById;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bii, requireContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        imageView.setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
        C786410Ut5.LJZL(0, kS());
        cS().setText(str);
        if (z) {
            XS(kS());
        }
    }

    public final void fT(Bundle bundle, boolean z) {
        String str;
        C19EG activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (mS() != AgeGateSdkRegistrationFlow.SIGN_UP.getFlow()) {
            if (z) {
                str = "sign_up_click";
            } else {
                str = "login_click";
            }
            C10VR.LIZIZ(str);
        }
        bundle.putBoolean("show_login_page_first", !z);
        Bundle arguments = getArguments();
        boolean z2 = false;
        if (arguments != null) {
            z2 = arguments.getBoolean("is_from_new_user_journey_age_gate", false);
        }
        bundle.putBoolean("is_from_new_user_journey_age_gate", z2);
        C0XQS c0xqs = new C0XQS();
        c0xqs.LIZ = activity;
        c0xqs.LIZIZ = "age_gate_page";
        c0xqs.LJ = new C19334710kb(this, activity, 0);
        c0xqs.LIZLLL = bundle;
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LIZJ().showLoginAndRegisterView(new C0XQT(c0xqs));
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x054b, code lost:
    
        if (r10 != false) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b8  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void RS(C19EG c19eg, String str, final String str2) {
        String str3;
        if (str2 == null) {
            str3 = str;
        } else {
            str3 = str2;
        }
        String strJ4 = C786410Ut5.j4(str3, Arrays.copyOf(new Object[]{str}, 1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
        int iLJJJ = a0.LJJJ(strJ4, str, 0, false, 6);
        if (iLJJJ >= 0) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, c19eg);
            if (numLIZJ != null) {
                final int iIntValue = numLIZJ.intValue();
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue) { // from class: com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment$setupSingleLinkLoginSignupEntry$1
                    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        C444890HcV c444890HcV = new C444890HcV();
                        if (str2 == null) {
                            c444890HcV.LIZ(43);
                        } else {
                            c444890HcV.LIZ(82);
                        }
                        textPaint.setTypeface(c444890HcV.getTypeface());
                    }
                }, iLJJJ, str.length() + iLJJJ, 34);
            } else {
                return;
            }
        }
        nS().setText(spannableStringBuilder);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a5g, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public final void yS(String str, int i, Integer num, int i2) {
        this.LLJJJJ = false;
        EnumC19301010fA enumC19301010fA = EnumC19301010fA.CONTINUE;
        if (i == enumC19301010fA.getType()) {
            C849850XVn.LIZIZ.LIZJ().LJIJI("481", "positive", true);
        } else {
            C849850XVn.LIZIZ.LIZJ().LJIJI("481", "negative", false);
        }
        if (Intrinsics.LJFF(str, "quit_popup")) {
            if (i == EnumC19301010fA.DISMISS.getType()) {
                wS("add_birthday");
                return;
            } else {
                if (i != EnumC19301010fA.EXIT.getType()) {
                    return;
                }
                wS("go_back");
                return;
            }
        }
        if (this.LLJJJJJIL.contains(str)) {
            if (i != enumC19301010fA.getType()) {
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", str);
            c2344009Gk.LJIIIIZZ("business", str);
            c2344009Gk.LIZJ(i2, "style_type");
            c2344009Gk.LIZJ(1, "result");
            C20684815ws.LJIILLIIL("confirmation_pop_up_response", c2344009Gk.LIZ);
            return;
        }
        if (i != EnumC19301010fA.DISMISS.getType() && i != EnumC19301010fA.EXIT.getType()) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJII(this.LLJJIJIIJIL);
            c2344009Gk2.LJ(num, "type");
            c2344009Gk2.LJIIIIZZ("result", "confirm");
            C20684815ws.LJIILLIIL("age_gate_popup_show", c2344009Gk2.LIZ);
            return;
        }
        C2344009Gk c2344009Gk3 = new C2344009Gk();
        c2344009Gk3.LJII(this.LLJJIJIIJIL);
        c2344009Gk3.LJ(num, "type");
        c2344009Gk3.LJIIIIZZ("result", "dismiss");
        C20684815ws.LJIILLIIL("age_gate_popup_show", c2344009Gk3.LIZ);
    }
}
