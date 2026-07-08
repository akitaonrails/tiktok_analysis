package com.ss.android.ugc.profile.business.ur.ui;

import X.AbstractC1250290idn;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0WZX;
import X.C0XQ7;
import X.C1216070hkb;
import X.C123100dR;
import X.C1232050iAN;
import X.C1232060iAO;
import X.C1232140iAW;
import X.C1232150iAX;
import X.C1232410iAx;
import X.C1250250idj;
import X.C1250300ido;
import X.C1308910kAL;
import X.C1323040kX8;
import X.C1355350lNF;
import X.C13BV;
import X.C1685300txQ;
import X.C1721460utk;
import X.C1749280vcc;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C1EDI;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C430750Gun;
import X.C444920HcY;
import X.C452501pT;
import X.C698190Ra5;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import X.C853750XeP;
import X.C960203pA;
import X.EnumC1216940hm0;
import X.EnumC1254850il9;
import X.EnumC638250P1r;
import X.InterfaceC1215870hkH;
import X.InterfaceC1232290iAl;
import X.InterfaceC1232420iAy;
import X.InterfaceC197023126r;
import Y.AComparatorS516S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS655S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditBioFragment extends ProfileEditInputFragment implements IRouteAction, InterfaceC1232290iAl {
    public static final int LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspHELIOSOjx9PTdiPCZ9GDcjLyY/LQAoIDsRISoKOy40JSAiPQ==";
    public C1749280vcc LLJIJIL;
    public InterfaceC1215870hkH LLJILJIL;
    public AccountKeyBoardHelper LLJILLL;
    public C1355350lNF LLJJ;
    public C197039127h LLJJI;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(525));
    public String LLIZ = "";
    public List<SignatureExtraInfo> LLIZLLLIL = C13BV.INSTANCE;
    public String LLJ = "";
    public String LLJI = "";
    public final C1232410iAx LLJILJILJ = new C1232410iAx(EnumC1254850il9.PROFILE.getValue());

    @Override // X.InterfaceC1232290iAl
    public final void LLIIIZ() {
    }

    @Override // X.InterfaceC1232290iAl
    public final void ln() {
    }

    static {
        new C1216070hkb();
        LLJJIII = ((Boolean) C1EDI.LJIILLIIL.getValue()).booleanValue() ? 160 : 80;
    }

    public final C1250300ido kS() {
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "cancel";
        c1250300ido.LIZJ = getString(C1EDI.LJ() ? 2131838866 : 2131828217);
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ = new InterfaceC197023126r() { // from class: X.0iAh
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                if (!C1EDI.LJ() || TextUtils.equals(C2204961BRm.U(this.LIZ.qS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)), this.LIZ.LLIZ)) {
                    this.LIZ.onBackPressed();
                    return;
                }
                ProfileEditBioFragment profileEditBioFragment = this.LIZ;
                Context context = profileEditBioFragment.getContext();
                if (context != null) {
                    if (C1EDI.LJFF()) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("entrance", EnumC1242700iRY.BIO.getValue());
                        c2344009Gk.LJIIIIZZ("previous_page", profileEditBioFragment.LLJ);
                        C20684815ws.LJIILLIIL("leave_edit_page_confirm_prompt_show", c2344009Gk.LIZ);
                    }
                    if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                        C632670Orh.LIZIZ(context, new C19719212De(1075451004, new AwS655S0100000_6(profileEditBioFragment, 9), true));
                        return;
                    }
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJI(profileEditBioFragment.getString(2131838860));
                    c1397580mTM.LIZIZ(profileEditBioFragment.getString(2131838859));
                    C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(profileEditBioFragment, 550));
                    c1397580mTM.LJII = false;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
            }
        };
        return c1250300ido;
    }

    public final C1355350lNF qS() {
        C1355350lNF c1355350lNF = this.LLJJ;
        if (c1355350lNF != null) {
            return c1355350lNF;
        }
        return null;
    }

    public final AbstractC1250290idn sS() {
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "save";
        c1250300ido.LIZJ = getString(C1EDI.LJ() ? 2131838865 : 2131822935);
        c1250300ido.LIZ = new InterfaceC197023126r() { // from class: X.0iAi
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                if (this.LIZ.bS()) {
                    KeyboardUtils.LIZIZ(this.LIZ.qS());
                    ProfileEditBioFragment profileEditBioFragment = this.LIZ;
                    profileEditBioFragment.mS(profileEditBioFragment.rS(), this.LIZ.oS());
                }
            }
        };
        return c1250300ido;
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final void gS() {
        String strRS = rS();
        List<SignatureExtraInfo> listOS = oS();
        InterfaceC1215870hkH interfaceC1215870hkH = this.LLJILJIL;
        if (interfaceC1215870hkH != null) {
            interfaceC1215870hkH.LIZ(strRS, listOS);
        }
    }

    public final List<SignatureExtraInfo> oS() {
        String string;
        Editable editableU;
        String string2;
        Editable editableU2;
        C1355350lNF c1355350lNFQS = qS();
        String str = "";
        if (c1355350lNFQS == null || (editableU2 = C2204961BRm.U(c1355350lNFQS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null))) == null || (string = editableU2.toString()) == null) {
            string = "";
        }
        C1355350lNF c1355350lNFQS2 = qS();
        if (c1355350lNFQS2 != null && (editableU = C2204961BRm.U(c1355350lNFQS2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null))) != null && (string2 = editableU.toString()) != null) {
            int length = string2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.LJI(string2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string3 = string2.subSequence(i, length + 1).toString();
            if (string3 != null) {
                str = string3;
            }
        }
        if (string.length() == str.length() || str.length() == 0 || 0 != 0 || a0.LJJIZ(string, str.charAt(0), 0, false, 6) <= 0) {
            return nS(qS(), 0);
        }
        return nS(qS(), str.length() != 0 ? a0.LJJIZ(string, str.charAt(0), 0, false, 6) : 0);
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final boolean onBackPressed() {
        Dialog dialog;
        KeyboardUtils.LIZIZ(qS());
        uS(false);
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        AccountKeyBoardHelper accountKeyBoardHelper;
        super.onPause();
        if (!C1EDI.LJ() || (accountKeyBoardHelper = this.LLJILLL) == null) {
            return;
        }
        accountKeyBoardHelper.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (C1EDI.LJ()) {
            AccountKeyBoardHelper accountKeyBoardHelper = this.LLJILLL;
            if (accountKeyBoardHelper != null) {
                accountKeyBoardHelper.LLIZLLLIL = this;
            }
            C01GW<Boolean> c01gw = AccountKeyBoardHelper.LLJ;
            if (C853750XeP.LIZ()) {
                C1232150iAX.LIZ(qS());
            } else {
                qS().requestFocus();
            }
        }
    }

    public final String rS() {
        Editable editableU;
        String string;
        C1355350lNF c1355350lNFQS = qS();
        if (c1355350lNFQS != null && (editableU = C2204961BRm.U(c1355350lNFQS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null))) != null && (string = editableU.toString()) != null) {
            int length = string.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.LJI(string.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string2 = string.subSequence(i, length + 1).toString();
            if (string2 != null) {
                return string2;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        List<SignatureExtraInfo> parcelableArrayList;
        String string;
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.LLIZ = getArguments().getString("content_value");
            Bundle arguments = getArguments();
            if (arguments == null || (parcelableArrayList = arguments.getParcelableArrayList("content_extra")) == null) {
                parcelableArrayList = C13BV.INSTANCE;
            }
            this.LLIZLLLIL = parcelableArrayList;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.getString("enter_method");
            }
            Bundle arguments3 = getArguments();
            String string2 = null;
            if (arguments3 != null) {
                string = arguments3.getString("enter_from");
            } else {
                string = null;
            }
            this.LLJ = string;
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                string2 = arguments4.getString("btn_name");
            }
            this.LLJI = string2;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getSignatureModifyTime() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (!Intrinsics.LJFF(this.LLJ, "add_bio")) {
            C1232140iAW c1232140iAW = C1232140iAW.LIZ;
            String str = this.LLJ;
            c1232140iAW.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", "bio");
            c2344009Gk.LJIIIIZZ("enter_method", "click_bio");
            c2344009Gk.LIZJ(i, "complete_status");
            c2344009Gk.LJIIIIZZ("enter_from", str);
            C20684815ws.LJIILLIIL("enter_profile_bio", c2344009Gk.LIZ);
        }
        this.LLJILJILJ.LLJ = new InterfaceC1232420iAy() { // from class: X.0hm4
            @Override // X.InterfaceC1232420iAy
            public final void Pc0(boolean z) {
            }

            @Override // X.InterfaceC1232420iAy
            public final void aL0(String str2, boolean z) {
            }

            @Override // X.InterfaceC1232420iAy
            public final void JE2(int i2, Exception exc) {
                C1749280vcc c1749280vcc = this.LL.LLJIJIL;
                if (c1749280vcc != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc, 8);
                }
                if (exc instanceof C0XIR) {
                    C0XIR c0xir = (C0XIR) exc;
                    if (c0xir.getErrorCode() == 3002405) {
                        ProfileEditBioFragment profileEditBioFragment = this.LL;
                        profileEditBioFragment.getClass();
                        C1389890mGx c1389890mGx = new C1389890mGx(profileEditBioFragment);
                        c1389890mGx.LJIIJ(profileEditBioFragment.getString(2131824924));
                        c1389890mGx.LJIIJJI();
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LIZJ(1, "prompt_shown");
                        C20684815ws.LJIILLIIL("show_frequency_control_limit_prompt", c2344009Gk2.LIZ);
                        return;
                    }
                    String errorMsg = c0xir.getErrorMsg();
                    if (errorMsg != null) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(this.LL);
                        c1389890mGx2.LJIIJ(errorMsg);
                        c1389890mGx2.LJIIJJI();
                        return;
                    }
                }
                C1389890mGx c1389890mGx3 = new C1389890mGx(this.LL);
                c1389890mGx3.LJIIIZ(R.string.shz);
                c1389890mGx3.LJIIJJI();
            }

            @Override // X.InterfaceC1232420iAy
            public final void Ud0(int i2, User user) {
                long jIntValue;
                if (!Intrinsics.LJFF(this.LL.LLJ, "profile_update_intro_banner") && !Intrinsics.LJFF(this.LL.LLJ, "profile_empty_guide") && !Intrinsics.LJFF(this.LL.LLJ, "add_bio")) {
                    this.LL.gS();
                    this.LL.dismiss();
                    return;
                }
                View view = this.LL.getView();
                if (view == null) {
                    return;
                }
                ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19(this.LL, 136);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Integer num = C1216990hm5.LIZ().delay;
                if (num != null) {
                    jIntValue = num.intValue();
                } else {
                    jIntValue = 2;
                }
                HandlerHook.viewPostDelay(view, aRunnableS119S0100000_19, timeUnit.toMillis(jIntValue));
            }
        };
    }

    public final void uS(boolean z) {
        String str;
        boolean z2;
        boolean z3;
        if (z) {
            str = "click_save";
        } else {
            str = "click_cancel";
        }
        boolean z4 = true;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getSignatureModifyTime() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C2204961BRm.U(qS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).getSpans(0, qS().length(), MentionSpan.class).length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = !z3;
        if (z && TextUtils.equals(C2204961BRm.U(qS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)), this.LLIZ)) {
            z4 = false;
        }
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        C1232050iAN c1232050iAN = new C1232050iAN(str, EnumC1216940hm0.BIO);
        c1232050iAN.LIZJ = "edit_profile_page";
        c1232050iAN.LIZLLL = this.LLJ;
        c1232050iAN.LJ = this.LLJI;
        c1232050iAN.LJI = Boolean.valueOf(z4);
        c1232050iAN.LJII = Boolean.valueOf(z2);
        c1232050iAN.LJIIJ = Boolean.valueOf(z5);
        C1232060iAO c1232060iAO = new C1232060iAO(c1232050iAN);
        c1232140iAW.getClass();
        C1232140iAW.LJ(c1232060iAO);
    }

    public static List nS(C1355350lNF c1355350lNF, int i) {
        String secUid;
        if (c1355350lNF != null) {
            if (C2204961BRm.U(c1355350lNF, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).length() != 0) {
                MentionSpan[] mentionSpanArr = (MentionSpan[]) C2204961BRm.U(c1355350lNF, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).getSpans(0, c1355350lNF.length(), MentionSpan.class);
                Arrays.sort(mentionSpanArr, new AComparatorS516S0100000_19(c1355350lNF, 4));
                ArrayList arrayList = new ArrayList();
                for (MentionSpan mentionSpan : mentionSpanArr) {
                    SignatureExtraInfo signatureExtraInfo = new SignatureExtraInfo();
                    signatureExtraInfo.setStartIndex(Integer.valueOf(C2204961BRm.U(c1355350lNF, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).getSpanStart(mentionSpan) - i));
                    signatureExtraInfo.setEndIndex(Integer.valueOf((C2204961BRm.U(c1355350lNF, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).getSpanEnd(mentionSpan) - 1) - i));
                    signatureExtraInfo.setUserId(mentionSpan.LIZJ());
                    TextExtraStruct textExtraStructLIZ = mentionSpan.LIZ();
                    if (textExtraStructLIZ != null) {
                        secUid = textExtraStructLIZ.getSecUid();
                    } else {
                        secUid = null;
                    }
                    signatureExtraInfo.setSecUserId(secUid);
                    arrayList.add(signatureExtraInfo);
                }
                return arrayList;
            }
        }
        return C13BV.INSTANCE;
    }

    public final void mS(String str, List<SignatureExtraInfo> list) {
        uS(true);
        this.LLJILJILJ.LJIIIZ(str, list);
        C1749280vcc c1749280vcc = this.LLJIJIL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        C1749280vcc c1749280vcc2 = this.LLJIJIL;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileDetailEditFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(202442);
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS372S0200000_6(this, view, 38), 3);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Window window;
        CharSequence string;
        Integer numLIZJ;
        int iIntValue;
        MentionSpan mentionSpan;
        Integer numLIZJ2;
        C430750Gun c430750Gun;
        C419890GdH c419890GdH;
        boolean z;
        int i2;
        Integer num;
        if (C1EDI.LJ()) {
            i = R.layout.edg;
        } else {
            i = R.layout.edf;
        }
        int i3 = 0;
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        C19EG activity = getActivity();
        Dialog dialog = getDialog();
        C19GS c19gs = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        C1323040kX8.LIZIZ(activity, window, true);
        this.LLJJ = (C1355350lNF) viewTd.findViewById(R.id.hd7);
        this.LLILLL = (TextView) viewTd.findViewById(R.id.zjm);
        viewTd.findViewById(R.id.zjj);
        TextView textView = this.LLILLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        this.LLJILLL = new AccountKeyBoardHelper(viewTd, this);
        if (((Boolean) C1EDI.LJIILLIIL.getValue()).booleanValue() && C123100dR.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().addBioGuideText)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "12");
            Context context = getContext();
            if (context != null) {
                TuxTextView tuxTextView = new TuxTextView(context, false ? 1 : 0, 6, i3);
                tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1p, context));
                tuxTextView.setBackgroundColor(0);
                tuxTextView.setTuxFont(101);
                tuxTextView.setText(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().addBioGuideText);
                C426750GoL.LJIIL(tuxTextView, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 0, 16);
                c430750Gun = new C430750Gun(tuxTextView);
            } else {
                c430750Gun = null;
            }
            Context context2 = getContext();
            if (context2 != null) {
                Map<Integer, Integer> map = C1721460utk.LIZ;
                C698190Ra5 c698190Ra5LIZJ = C1721460utk.LIZJ(context2, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().addBioGuideIconRes, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().addBioGuideIconColor, "bio_add_bio", "");
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                if (c698190Ra5LIZJ != null) {
                    i2 = c698190Ra5LIZJ.LIZ;
                } else {
                    i2 = 0;
                }
                c419910GdJ.LIZ = i2;
                if (c698190Ra5LIZJ != null && (num = c698190Ra5LIZJ.LIZIZ) != null) {
                    c419910GdJ.LIZLLL = Integer.valueOf(num.intValue());
                }
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context2);
                tuxIconDrawableLIZ.setBounds(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                c419890GdH = new C419890GdH(tuxIconDrawableLIZ, 2);
            } else {
                c419890GdH = null;
            }
            C786410Ut5.q2(spannableStringBuilder, c419890GdH, 0, 1, 17);
            if (c419890GdH != null) {
                Context context3 = getContext();
                if (context3 != null && C426750GoL.LIZLLL(context3)) {
                    z = true;
                } else {
                    z = false;
                }
                c419890GdH.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), z);
            }
            C786410Ut5.q2(spannableStringBuilder, c430750Gun, 1, 2, 17);
            string = spannableStringBuilder;
        } else if (C1EDI.LJ()) {
            string = getString(2131838861);
        } else {
            string = getString(2131833250);
        }
        qS().setHint(string);
        qS().setText(this.LLIZ);
        qS().setSelection(C2204961BRm.U(qS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).length());
        if (!this.LLIZLLLIL.isEmpty()) {
            C1355350lNF c1355350lNFQS = qS();
            for (SignatureExtraInfo signatureExtraInfo : this.LLIZLLLIL) {
                if (signatureExtraInfo.getStartIndex() != null || signatureExtraInfo.getEndIndex() != null) {
                    Integer startIndex = signatureExtraInfo.getStartIndex();
                    int iIntValue2 = -1;
                    if (startIndex != null) {
                        iIntValue = startIndex.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    Integer endIndex = signatureExtraInfo.getEndIndex();
                    if (endIndex != null) {
                        iIntValue2 = endIndex.intValue();
                    }
                    if (iIntValue >= 0 && iIntValue2 < c1355350lNFQS.length()) {
                        Context context4 = getContext();
                        if (context4 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context4)) != null) {
                            mentionSpan = new MentionSpan(numLIZJ2.intValue(), C2204961BRm.U(c1355350lNFQS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).subSequence(iIntValue, iIntValue2 + 1).toString(), signatureExtraInfo.getUserId(), 9, signatureExtraInfo.getSecUserId());
                        } else {
                            mentionSpan = null;
                        }
                        int i4 = iIntValue2 + 1;
                        C2204961BRm.U(c1355350lNFQS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).setSpan(mentionSpan, iIntValue, i4, 33);
                        C2204961BRm.U(c1355350lNFQS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).setSpan(new C444920HcY(42, false), iIntValue, i4, 33);
                    }
                }
            }
        }
        qS().setFocusable(true);
        qS().setFocusableInTouchMode(true);
        if (!((Boolean) this.LLILZLL.getValue()).booleanValue() || C1EDI.LJ()) {
            qS().requestFocus();
        }
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.o6z);
        this.LLJJI = c197039127h;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C786410Ut5.LLLLLLJ(c197039127h, 8);
        if (C1EDI.LJ()) {
            C197039127h c197039127h2 = this.LLJJI;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            c197039127h2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.5d))), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.5d))), 0);
        }
        C1749280vcc c1749280vcc = (C1749280vcc) viewTd.findViewById(R.id.w28);
        this.LLJIJIL = c1749280vcc;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        this.LLILLJJLI = (TuxNavBar) viewTd.findViewById(R.id.p15);
        if (C1EDI.LJ()) {
            C1250300ido c1250300idoKS = kS();
            AbstractC1250290idn abstractC1250290idnSS = sS();
            TuxNavBar tuxNavBar = this.LLILLJJLI;
            if (tuxNavBar != null) {
                C0OM1 c0om1 = new C0OM1();
                c0om1.LJ(c1250300idoKS);
                c0om1.LIZIZ(abstractC1250290idnSS);
                c0om1.LIZLLL = false;
                tuxNavBar.setNavActions(c0om1);
            }
            Context context5 = getContext();
            if (context5 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context5)) != null) {
                int iIntValue3 = numLIZJ.intValue();
                TuxNavBar tuxNavBar2 = this.LLILLJJLI;
                if (tuxNavBar2 != null) {
                    tuxNavBar2.setNavBackground(iIntValue3);
                }
            }
        } else {
            C1250300ido c1250300idoKS2 = kS();
            C1250250idj c1250250idjCS = cS(getString(2131833251));
            AbstractC1250290idn abstractC1250290idnSS2 = sS();
            TuxNavBar tuxNavBar3 = this.LLILLJJLI;
            if (tuxNavBar3 != null) {
                C0OM1 c0om12 = new C0OM1();
                c0om12.LJ(c1250300idoKS2);
                c0om12.LIZJ = c1250250idjCS;
                c0om12.LIZIZ(abstractC1250290idnSS2);
                c0om12.LIZLLL = true;
                tuxNavBar3.setNavActions(c0om12);
            }
        }
        LLIZLLLIL();
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity2 = getActivity();
            if (activity2 instanceof C19GS) {
                c19gs = (C19GS) activity2;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[PHI: r4 r5
      0x0017: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:9:0x0015, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]
      0x0017: PHI (r5v4 com.ss.android.ugc.aweme.profile.model.User) = (r5v1 com.ss.android.ugc.aweme.profile.model.User), (r5v5 com.ss.android.ugc.aweme.profile.model.User) binds: [B:9:0x0015, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[PHI: r4 r5
      0x001d: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:9:0x0015, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x001d: PHI (r5v3 com.ss.android.ugc.aweme.profile.model.User) = (r5v1 com.ss.android.ugc.aweme.profile.model.User), (r5v4 com.ss.android.ugc.aweme.profile.model.User) binds: [B:9:0x0015, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object open(android.content.Context r8, java.lang.String r9, android.os.Bundle r10) throws java.lang.Throwable {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            r6 = 0
            if (r0 == 0) goto L60
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r5 = r0.getCurUser()
            if (r5 == 0) goto L13
            java.lang.String r4 = r5.signature
            if (r4 != 0) goto L17
        L13:
            java.lang.String r4 = ""
            if (r5 == 0) goto L1d
        L17:
            java.util.List r3 = r5.getSignatureExtra()
            if (r3 != 0) goto L1f
        L1d:
            X.13BV r3 = X.C13BV.INSTANCE
        L1f:
            X.0ihR r2 = X.C1252550ihR.LIZ
            java.lang.String r0 = "bio"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r2.getClass()
            java.lang.String r0 = "click_card"
            android.os.Bundle r2 = X.C1252550ihR.LJI(r5, r0, r1)
            java.lang.String r1 = "enter_from"
            if (r10 == 0) goto L5e
            java.lang.String r0 = r10.getString(r1)
        L38:
            X.C786410Ut5.LJJJI(r1, r0, r2)
            com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment r2 = X.C1216070hkb.LIZ(r2, r4, r3)
            r0 = 1
            r2.setUserVisibleHint(r0)
            X.0hkF r0 = new X.0hkF
            r0.<init>()
            r2.LLJILJIL = r0
            if (r8 == 0) goto L5d
            X.19EG r0 = X.C1388190mED.LIZIZ(r8)
            if (r0 == 0) goto L5d
            androidx.fragment.app.FragmentManager r1 = r0.getSupportFragmentManager()
            if (r1 == 0) goto L5d
            java.lang.String r0 = "EditBioDialog"
            r2.show(r1, r0)
        L5d:
            return r6
        L5e:
            r0 = r6
            goto L38
        L60:
            r5 = r6
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
