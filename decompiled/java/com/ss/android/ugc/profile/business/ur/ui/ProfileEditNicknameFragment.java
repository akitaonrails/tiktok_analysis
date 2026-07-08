package com.ss.android.ugc.profile.business.ur.ui;

import X.AbstractC1250290idn;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0DHG;
import X.C0WZX;
import X.C0XIR;
import X.C0XQ7;
import X.C11NJ;
import X.C11PQ;
import X.C1215680hjy;
import X.C1216990hm5;
import X.C1231880iA6;
import X.C1231890iA7;
import X.C1232050iAN;
import X.C1232060iAO;
import X.C1232140iAW;
import X.C1232150iAX;
import X.C1232410iAx;
import X.C1233040iBy;
import X.C1250300ido;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1390130mHL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1436405jm;
import X.C1440005kM;
import X.C1494690ozz;
import X.C1720106oR;
import X.C1749280vcc;
import X.C19719212De;
import X.C19EG;
import X.C1EDI;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C290430BZx;
import X.C632670Orh;
import X.C786410Ut5;
import X.C844470XAv;
import X.C853750XeP;
import X.C985403tE;
import X.EnumC1216940hm0;
import X.InterfaceC1215650hjv;
import X.InterfaceC1232290iAl;
import X.InterfaceC1232420iAy;
import X.InterfaceC197023126r;
import Y.ARunnableS119S0100000_19;
import Y.AkS481S0100000_19;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncService;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditNicknameFragment extends ProfileEditInputFragment implements InterfaceC1232420iAy, IRouteAction, InterfaceC1232290iAl {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9PTdiPCZ9GDcjLyY/LQAoIDsdISYnJy4+LQM+KCg+LSs4";
    public boolean LLIZ;
    public int LLJ;
    public boolean LLJJI;
    public InterfaceC1215650hjv LLJJIII;
    public final User LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public final int LLJJJIL;
    public final long LLJJJJ;
    public final boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C1232410iAx LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public TuxTextView LLJLIL;
    public EditText LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public TuxTextView LLJLLIL;
    public C1749280vcc LLJLLL;
    public TuxTextView LLJZ;
    public LinearLayout LLJZIJLIL;
    public AccountKeyBoardHelper LLL;
    public C1390130mHL LLLF;
    public final C01GW LLLFF;
    public final C11NJ LLLFFI;
    public final C01GW LLLFZ;
    public C1215680hjy LLLI;
    public String LLILZLL = "";
    public String LLIZLLLIL = "";
    public String LLJI = "";
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public String LLJILJILJ = "";
    public final C11PQ<Object> LLJILLL = new C11PQ<>();
    public final C11NJ LLJJ = new C11NJ();

    public final void BS() throws Throwable {
        boolean z;
        EditText editText = this.LLJLILLLLZIIL;
        if (editText != null) {
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzU9KZg3K1C6YYkSZjhzCp7", null));
            if (editableLLJILLL.length() > 30) {
                if (!C1EDI.LJ()) {
                    editableLLJILLL.toString();
                    editText.setText(this.LLIZLLLIL);
                    Editable editableLLJILLL2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzU9KZg3K1C6YYkSZjhzCp7", null));
                    int length = editableLLJILLL2.length();
                    int i = this.LLJ;
                    if (i > length) {
                        Selection.setSelection(editableLLJILLL2, length);
                    } else {
                        Selection.setSelection(editableLLJILLL2, i);
                    }
                } else if (this.LLJ > 50) {
                    editText.setText(this.LLIZLLLIL);
                    Editable editableLLJILLL3 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzU9KZg3K1C6YYkSZjhzCp7", null));
                    Selection.setSelection(editableLLJILLL3, editableLLJILLL3.length());
                }
                z = true;
            } else {
                z = false;
            }
            this.LLJJI = z;
            if (C1EDI.LJ()) {
                if (this.LLJJI) {
                    if (C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzU9KZg3K1C6YYkSZjhzCp7", null)).length() > 50) {
                        this.LLJILLL.onNext("");
                    }
                    LinearLayout linearLayout = this.LLJZIJLIL;
                    if (linearLayout != null) {
                        C786410Ut5.LJZL(0, linearLayout);
                    }
                    EditText editText2 = this.LLJLILLLLZIIL;
                    if (editText2 != null) {
                        editText2.setBackgroundResource(R.drawable.cr8);
                    }
                } else {
                    LinearLayout linearLayout2 = this.LLJZIJLIL;
                    if (linearLayout2 != null) {
                        C786410Ut5.LJZL(8, linearLayout2);
                    }
                    EditText editText3 = this.LLJLILLLLZIIL;
                    if (editText3 != null) {
                        editText3.setBackgroundResource(R.drawable.cy5);
                    }
                }
            } else if (this.LLJJI) {
                this.LLJILLL.onNext("");
            }
            ProfileEditInputFragment.SR(this, this.LLJJI, editText.length(), 30, true, false, 16, null);
        }
    }

    @Override // X.InterfaceC1232290iAl
    public final void LLIIIZ() {
    }

    @Override // X.InterfaceC1232420iAy
    public final void aL0(String str, boolean z) {
    }

    @Override // X.InterfaceC1232290iAl
    public final void ln() {
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final void gS() {
        InterfaceC1215650hjv interfaceC1215650hjv = this.LLJJIII;
        if (interfaceC1215650hjv != null) {
            interfaceC1215650hjv.LIZ(nS(), this.LLLI);
        }
    }

    public final void kS() {
        String str = this.LLJILJIL;
        String str2 = !TextUtils.isEmpty(this.LLJIJIL) ? this.LLJIJIL : "click_save";
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("enter_from");
        }
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        C1232050iAN c1232050iAN = new C1232050iAN(str2, EnumC1216940hm0.NICKNAME);
        c1232050iAN.LJ = this.LLJILJILJ;
        c1232050iAN.LIZJ = "edit_profile_page";
        c1232050iAN.LIZLLL = str;
        c1232050iAN.LJII = Boolean.valueOf(this.LLJJIJIIJIL == 0);
        C1232060iAO c1232060iAO = new C1232060iAO(c1232050iAN);
        c1232140iAW.getClass();
        C1232140iAW.LJ(c1232060iAO);
        this.LLJJL.LJIIIIZZ(nS());
        uS();
    }

    public final String nS() {
        EditText editText = this.LLJLILLLLZIIL;
        return String.valueOf(editText != null ? C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzU9KZg3K1C6YYkSZjhzCp7", null)) : null);
    }

    public final boolean oS() {
        return this.LLJJIJIIJIL == 0 || this.LLJJJJ >= ((long) this.LLJJJIL);
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final boolean onBackPressed() {
        KeyboardUtils.LIZIZ(this.LLJLILLLLZIIL);
        mS();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLJJ.LJ();
        this.LLLFFI.LJ();
        super.onDestroy();
    }

    public final AbstractC1250290idn rS() {
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "save";
        c1250300ido.LIZJ = getString(C1EDI.LJ() ? 2131838865 : 2131833263);
        c1250300ido.LIZ = new InterfaceC197023126r() { // from class: X.0iA1
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                ProfileEditNicknameFragment profileEditNicknameFragment = this.LIZ;
                if (profileEditNicknameFragment.qS(profileEditNicknameFragment.nS())) {
                    Set<Integer> set = C1244050iTj.LIZ;
                    if (C1244050iTj.LIZ(profileEditNicknameFragment.nS())) {
                        C1389890mGx c1389890mGx = new C1389890mGx(profileEditNicknameFragment);
                        c1389890mGx.LJIIJ(profileEditNicknameFragment.getString(2131838132));
                        c1389890mGx.LJIIJJI();
                        Integer num = 3002390;
                        C1232140iAW.LIZ.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(num != null ? num.intValue() : -1, "error_code");
                        C20684815ws.LJIILLIIL("nickname_uniq_unsuccess_toast", c2344009Gk.LIZ);
                        return;
                    }
                    KeyboardUtils.LIZIZ(profileEditNicknameFragment.LLJLILLLLZIIL);
                    if (((Boolean) profileEditNicknameFragment.LLLFZ.getValue()).booleanValue()) {
                        if (!C290430BZx.LIZ()) {
                            profileEditNicknameFragment.yS();
                            return;
                        } else {
                            profileEditNicknameFragment.uS();
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1231980iAG(profileEditNicknameFragment, null), 3);
                            return;
                        }
                    }
                    if (!((ProfileNameSyncService) profileEditNicknameFragment.LLLFF.getValue()).LIZJ()) {
                        profileEditNicknameFragment.yS();
                        return;
                    }
                    C1390130mHL c1390130mHL = profileEditNicknameFragment.LLLF;
                    if (c1390130mHL == null) {
                        View view = profileEditNicknameFragment.getView();
                        ViewParent parent = view != null ? view.getParent() : null;
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        Context context = profileEditNicknameFragment.getContext();
                        if (context != null && viewGroup != null) {
                            C1390130mHL c1390130mHL2 = new C1390130mHL(context, null, 6);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams.gravity = 17;
                            C786410Ut5.W6(c1390130mHL2, layoutParams);
                            c1390130mHL2.setMessage(c1390130mHL2.getResources().getString(2131845400));
                            profileEditNicknameFragment.LLLF = c1390130mHL2;
                            viewGroup.addView(c1390130mHL2);
                        }
                    } else {
                        C786410Ut5.LLZ(c1390130mHL, 0);
                    }
                    profileEditNicknameFragment.LLLFFI.LIZ(C1239300iM4.LIZLLL(((ProfileNameSyncService) profileEditNicknameFragment.LLLFF.getValue()).LIZLLL(profileEditNicknameFragment.nS()).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIL(new AkS481S0100000_19(profileEditNicknameFragment, 7)), new AwS598S0100000_19(profileEditNicknameFragment, 553), C1239300iM4.LIZ));
                }
            }
        };
        return c1250300ido;
    }

    public final void sS() {
        if (!Intrinsics.LJFF(this.LLJILJIL, "profile_update_intro_banner") && !Intrinsics.LJFF(this.LLJILJIL, "profile_empty_guide") && !this.LLIZ) {
            C1440005kM.LIZ(new C1436405jm(true));
            mS();
            return;
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS119S0100000_19(this, 110), (C1216990hm5.LIZ().delay != null ? r0.intValue() : 2L) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
    }

    public final void uS() {
        C1749280vcc c1749280vcc = this.LLJLLL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        C1749280vcc c1749280vcc2 = this.LLJLLL;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
        LLIZLLLIL();
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            tuxNavBar.LJJ(AFwS257S0000000_19.get$arr$(579), "cancel");
        }
        EditText editText = this.LLJLILLLLZIIL;
        Context context = getContext();
        if (editText != null && context != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, context);
            if (numLIZJ != null) {
                editText.setTextColor(numLIZJ.intValue());
            }
            editText.setFocusable(false);
            editText.setFocusableInTouchMode(false);
        }
        TuxIconView tuxIconView = this.LLJLL;
        if (tuxIconView != null) {
            tuxIconView.setEnabled(false);
        }
    }

    public final void zS() {
        C1749280vcc c1749280vcc = this.LLJLLL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        LLFII();
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            tuxNavBar.LJJ(AFwS257S0000000_19.get$arr$(580), "cancel");
        }
        EditText editText = this.LLJLILLLLZIIL;
        Context context = getContext();
        if (editText != null && context != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
            if (numLIZJ != null) {
                editText.setTextColor(numLIZJ.intValue());
            }
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
        }
        TuxIconView tuxIconView = this.LLJLL;
        if (tuxIconView != null) {
            tuxIconView.setEnabled(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProfileEditNicknameFragment() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment.<init>():void");
    }

    public final void mS() {
        Dialog dialog;
        zS();
        if (getDialog() == null || (dialog = getDialog()) == null || !dialog.isShowing() || !isResumed()) {
            return;
        }
        try {
            dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onExitPressed e:");
            sbLIZ.append(e);
            C1720106oR.LIZ("ProfileEditNicknameFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        AccountKeyBoardHelper accountKeyBoardHelper;
        super.onPause();
        if (!C1EDI.LJ() || (accountKeyBoardHelper = this.LLL) == null) {
            return;
        }
        accountKeyBoardHelper.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (C1EDI.LJ()) {
            AccountKeyBoardHelper accountKeyBoardHelper = this.LLL;
            if (accountKeyBoardHelper != null) {
                accountKeyBoardHelper.LLIZLLLIL = this;
            }
            C01GW<Boolean> c01gw = AccountKeyBoardHelper.LLJ;
            if (C853750XeP.LIZ()) {
                EditText editText = this.LLJLILLLLZIIL;
                if (editText != null) {
                    C1232150iAX.LIZ(editText);
                    return;
                }
                return;
            }
            EditText editText2 = this.LLJLILLLLZIIL;
            if (editText2 != null) {
                editText2.requestFocus();
            }
        }
    }

    public final void wS() {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJFF(2131827628);
        c1397580mTM.LIZ(2131827626);
        C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(this, 434));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void yS() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!C0DHG.LIZ() || C1388190mED.LIZ(context) == null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131838131);
            c1397580mTM.LIZIZ(getString(2131838130, Integer.valueOf(this.LLJJIJIL)));
            C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(this, 435));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
        } else {
            C632670Orh.LIZIZ(context, new C19719212De(239473154, new AwS668S0100000_19(this, 20), true));
        }
        C1231880iA6 c1231880iA6 = C1231880iA6.LIZ;
        String str = this.LLJILJIL;
        c1231880iA6.getClass();
        C1231880iA6.LIZLLL(str, false);
    }

    @Override // X.InterfaceC1232420iAy
    public final void Pc0(boolean z) {
        if (C1231890iA7.LIZ() && z) {
            if (!this.LLJJJJLIIL) {
                C844470XAv.LIZ.getClass();
                String string = C844470XAv.LIZ().getString(2131827634, 48);
                C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
                c1233040iBy.LIZJ(string);
                c1233040iBy.LIZLLL();
                return;
            }
            if (this.LLLI == null) {
                if (C290430BZx.LIZ()) {
                    C19EG activity = getActivity();
                    if (activity != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activity);
                        c1389890mGx.LJIIIZ(2131837895);
                        c1389890mGx.LIZ(true);
                        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                        c1389890mGx.LJII(R.attr.zi);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                C844470XAv.LIZ.getClass();
                C1233040iBy c1233040iBy2 = new C1233040iBy(C844470XAv.LIZ());
                c1233040iBy2.LIZJ(C844470XAv.LIZ().getString(2131827635));
                c1233040iBy2.LIZLLL();
            }
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        int i = 0;
        if (arguments != null) {
            this.LLILZLL = arguments.getString("current_nickname", "");
            this.LLJL = arguments.getBoolean("is_open_from_router", false);
            this.LLJIJIL = arguments.getString("enter_method", "");
            this.LLJILJIL = arguments.getString("enter_from", "");
            this.LLJILJILJ = arguments.getString("btn_name", "");
            this.LLIZ = arguments.getBoolean("is_from_profile_nickname_empty", false);
        }
        this.LLJJL.LLJ = this;
        User user = this.LLJJIJI;
        if (user != null && user.getNickNameModifyTs() == 0) {
            i = 1;
        }
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        String str = this.LLJILJIL;
        c1232140iAW.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "name");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "click_name");
        c2344009Gk.LIZJ(i ^ 1, "complete_status");
        C20684815ws.LJIILLIIL("enter_profile_name", c2344009Gk.LIZ);
    }

    public final boolean qS(String str) {
        if (a0.LJLIIIL(str).toString().length() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
        Integer numValueOf;
        zS();
        if (exc instanceof C1494690ozz) {
            numValueOf = Integer.valueOf(((C1494690ozz) exc).getStatusCode());
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        } else if (exc instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) exc;
            numValueOf = Integer.valueOf(c0xir.getErrorCode());
            if (numValueOf.intValue() != 3002390 && numValueOf.intValue() != 3002395) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(this);
                c1389890mGx2.LJIIJ(c0xir.getErrorMsg());
                c1389890mGx2.LJIIJJI();
            } else {
                C1389890mGx c1389890mGx3 = new C1389890mGx(this);
                c1389890mGx3.LJIIJ(getString(2131838132));
                c1389890mGx3.LJIIJJI();
                LLIZLLLIL();
            }
        } else {
            C1389890mGx c1389890mGx4 = new C1389890mGx(this);
            c1389890mGx4.LJIIIZ(R.string.jb4);
            c1389890mGx4.LJIIJJI();
            numValueOf = null;
        }
        this.LLLI = null;
        C1232140iAW.LIZ.getClass();
        C1232140iAW.LJIIJJI(numValueOf, "edit_nickname_page", 0, false);
    }

    @Override // X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
        long jIntValue;
        if (this.LLJL) {
            String str = null;
            if (i == 0) {
                ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setNickNameModifyTs((int) this.LLJJJJ);
                C1232140iAW.LIZ.getClass();
                C1232140iAW.LJIIJJI(null, "edit_nickname_page", 1, false);
                C1215680hjy c1215680hjy = this.LLLI;
                if (c1215680hjy != null && c1215680hjy.LIZ) {
                    C1232410iAx c1232410iAx = this.LLJJL;
                    if (c1215680hjy != null) {
                        str = c1215680hjy.LIZJ;
                    }
                    c1232410iAx.LIZJ(str);
                }
                this.LLJJLIIIJLLLLLLLZ++;
            } else if (i == 116) {
                C1232140iAW.LIZ.getClass();
                C1232140iAW.LJIILIIL(1, "edit_nickname_page", null, true);
                this.LLJJLIIIJLLLLLLLZ++;
            }
            C1215680hjy c1215680hjy2 = this.LLLI;
            if (c1215680hjy2 != null && c1215680hjy2.LIZ) {
                if (this.LLJJLIIIJLLLLLLLZ == 2) {
                    sS();
                    return;
                }
                return;
            }
            sS();
            return;
        }
        if (!Intrinsics.LJFF(this.LLJILJIL, "profile_update_intro_banner") && !Intrinsics.LJFF(this.LLJILJIL, "profile_empty_guide") && !this.LLIZ) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setNickNameModifyTs((int) this.LLJJJJ);
            C1440005kM.LIZ(new C1436405jm(false));
            gS();
            mS();
            return;
        }
        View view = getView();
        if (view == null) {
            return;
        }
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19(this, 139);
        Integer num = C1216990hm5.LIZ().delay;
        if (num != null) {
            jIntValue = num.intValue();
        } else {
            jIntValue = 2;
        }
        HandlerHook.viewPostDelay(view, aRunnableS119S0100000_19, jIntValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object open(android.content.Context r7, java.lang.String r8, android.os.Bundle r9) throws java.lang.Throwable {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            r5 = 0
            if (r0 == 0) goto L56
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r4 = r0.getCurUser()
            if (r4 == 0) goto L15
            java.lang.String r3 = r4.getNickname()
            if (r3 != 0) goto L17
        L15:
            java.lang.String r3 = ""
        L17:
            X.0ihR r2 = X.C1252550ihR.LIZ
            java.lang.String r0 = "nickname"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r2.getClass()
            java.lang.String r0 = "click_card"
            android.os.Bundle r2 = X.C1252550ihR.LJI(r4, r0, r1)
            java.lang.String r1 = "enter_from"
            if (r9 == 0) goto L54
            java.lang.String r0 = r9.getString(r1)
        L30:
            X.C786410Ut5.LJJJI(r1, r0, r2)
            java.lang.String r1 = "is_open_from_router"
            r0 = 1
            r2.putBoolean(r1, r0)
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment r2 = X.C1215960hkQ.LIZ(r2, r3)
            r2.setUserVisibleHint(r0)
            if (r7 == 0) goto L53
            X.19EG r0 = X.C1388190mED.LIZIZ(r7)
            if (r0 == 0) goto L53
            androidx.fragment.app.FragmentManager r1 = r0.getSupportFragmentManager()
            if (r1 == 0) goto L53
            java.lang.String r0 = "EditNicknameDialog"
            r2.show(r1, r0)
        L53:
            return r5
        L54:
            r0 = r5
            goto L30
        L56:
            r4 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
