package com.ss.android.ugc.profile.business.ur.ui;

import X.AbstractC19489511Mv;
import X.C01GW;
import X.C0I7D;
import X.C0TVI;
import X.C0WZX;
import X.C0XIC;
import X.C11JF;
import X.C1215680hjy;
import X.C1231880iA6;
import X.C1232090iAR;
import X.C1232150iAX;
import X.C1238700iL6;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C14K9;
import X.C19EG;
import X.C1EDI;
import X.C21405318pn;
import X.C2204961BRm;
import X.C424320GkQ;
import X.C424810GlD;
import X.C688120Qyw;
import X.C786410Ut5;
import X.C793770VBv;
import X.C853750XeP;
import X.C985403tE;
import X.InterfaceC1231760i9u;
import X.InterfaceC1231810i9z;
import X.InterfaceC1232290iAl;
import X.InterfaceC20660615sy;
import Y.ARunnableS88S0200000_19;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.network.CheckUserNameResponse;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AwS598S0100000_19;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditUsernameFragment extends ProfileEditInputFragment implements InterfaceC1232290iAl, InterfaceC20660615sy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9PTdiPCZ9GDcjLyY/LQAoIDsGOyA+Jy4+LQM+KCg+LSs4";
    public InterfaceC1231810i9z LLILZLL;
    public boolean LLJ;
    public InterfaceC1231760i9u LLJILJIL;
    public C0I7D LLJILJILJ;
    public TuxTextView LLJILLL;
    public LinearLayout LLJJ;
    public ImageView LLJJI;
    public TuxIconView LLJJIII;
    public TextView LLJJIJI;
    public TextView LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public LinearLayout LLJJJ;
    public RecyclerView LLJJJIL;
    public C424810GlD LLJJJJ;
    public EditText LLJJJJLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public AccountKeyBoardHelper LLJL;
    public TextView LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public final User LLJLLL;
    public final long LLJZ;
    public final long LLJZIJLIL;
    public final boolean LLL;
    public final C01GW LLLF;
    public C1215680hjy LLLFF;
    public final C01GW LLLFFI;
    public final String LLLFZ;
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public String LLJI = "";
    public String LLJIJIL = "";
    public final C0XIC LLJJJJJIL = new C0XIC();
    public final C1232090iAR LLJJL = new C1232090iAR();

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    public final EditText kS() {
        EditText editText = this.LLJJJJLIIL;
        if (editText != null) {
            return editText;
        }
        return null;
    }

    public final RecyclerView mS() {
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView != null) {
            return recyclerView;
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C0XIC c0xic = this.LLJJJJJIL;
        AbstractC19489511Mv<CheckUserNameResponse> abstractC19489511Mv = c0xic.LIZ;
        if (abstractC19489511Mv != null && !abstractC19489511Mv.isDisposed()) {
            c0xic.LIZ.dispose();
        }
        C11JF c11jf = this.LLJJL.LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProfileEditUsernameFragment() {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = ""
            r6.LLIZ = r0
            r6.LLIZLLLIL = r0
            r6.LLJI = r0
            r6.LLJIJIL = r0
            X.0XIC r0 = new X.0XIC
            r0.<init>()
            r6.LLJJJJJIL = r0
            X.0iAR r0 = new X.0iAR
            r0.<init>()
            r6.LLJJL = r0
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            r5 = 0
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.profile.model.User r4 = r0.getCurUser()
        L26:
            r6.LLJLLL = r4
            if (r4 == 0) goto L77
            long r0 = r4.getHandleModified()
        L2e:
            r6.LLJZ = r0
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            r6.LLJZIJLIL = r2
            if (r4 == 0) goto L75
            java.lang.String r0 = r4.getCustomVerify()
        L40:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 != 0) goto L73
            if (r4 == 0) goto L4c
            java.lang.String r5 = r4.getEnterpriseVerifyReason()
        L4c:
            boolean r0 = X.C123100dR.LIZ(r5)
            if (r0 != 0) goto L73
            r0 = 0
        L53:
            r6.LLL = r0
            r0 = 535(0x217, float:7.5E-43)
            kotlin.jvm.internal.AFwS207S0000000_19 r0 = kotlin.jvm.internal.AFwS207S0000000_19.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r6.LLLF = r0
            kotlin.jvm.internal.AwS563S0100000_19 r1 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 2447(0x98f, float:3.429E-42)
            r1.<init>(r6, r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r1)
            r6.LLLFFI = r0
            java.lang.String r0 = "edit_user_name"
            r6.LLLFZ = r0
            return
        L73:
            r0 = 1
            goto L53
        L75:
            r0 = r5
            goto L40
        L77:
            r0 = 0
            goto L2e
        L7a:
            r4 = r5
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.ProfileEditUsernameFragment.<init>():void");
    }

    @Override // X.InterfaceC1232290iAl
    public final void LLIIIZ() {
        C786410Ut5.LLIZLLLIL(mS(), 8);
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final void gS() throws JSONException {
        Editable editableLLJILLL;
        String string;
        String lowerCase;
        EditText editTextKS = kS();
        if (editTextKS == null || (editableLLJILLL = C2204961BRm.LLJILLL(editTextKS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzP7qB53K1C6YYkSaiVKimx", null))) == null || (string = editableLLJILLL.toString()) == null || (lowerCase = string.toLowerCase(Locale.ROOT)) == null) {
            return;
        }
        InterfaceC1231760i9u interfaceC1231760i9u = this.LLJILJIL;
        if (interfaceC1231760i9u != null) {
            interfaceC1231760i9u.LIZ(lowerCase, this.LLLFF);
        }
        if (C1238700iL6.LIZ(lowerCase)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("start_status", 1);
        C793770VBv.LJII("check_user_name_status", jSONObject, null, null);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(requireContext(), this, null);
    }

    @Override // X.InterfaceC1232290iAl
    public final void ln() {
        C786410Ut5.LLIZLLLIL(mS(), 0);
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final boolean onBackPressed() {
        Dialog dialog;
        KeyboardUtils.LIZIZ(kS());
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
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.LLJL;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.LLIZLLLIL = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.LLJL;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.LLIZLLLIL = this;
        }
        C01GW<Boolean> c01gw = AccountKeyBoardHelper.LLJ;
        if (C853750XeP.LIZ()) {
            C1232150iAX.LIZ(kS());
        } else {
            kS().requestFocus();
        }
    }

    public final void qS() {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJFF(2131845408);
        c1397580mTM.LIZ(2131845406);
        C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(this, 542));
        c1397580mTM.LIZLLL(new AwS598S0100000_19(this, 543));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
        C1231880iA6.LIZ.getClass();
        C1231880iA6.LJ(false);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLLFZ;
    }

    public final boolean nS(int i) {
        boolean z;
        TuxIconView tuxIconView;
        long j = this.LLJZ;
        if (j != 0 && this.LLJZIJLIL < j + ((long) (i * 86400))) {
            z = false;
        } else {
            z = true;
        }
        if (C1EDI.LJ() && !z && (tuxIconView = this.LLJJIII) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        return z;
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLIZ = arguments.getString("content_name");
            this.LLIZLLLIL = arguments.getString("content_value");
            this.LLJ = arguments.getBoolean("is_edit_enabled");
            this.LLJI = arguments.getString("edit_hint");
            arguments.getInt("content_max_length");
            arguments.getBoolean("is_enable_null");
            this.LLJIJIL = arguments.getString("enter_from");
            String string = arguments.getString("custom_verify");
            String str = "";
            if (string == null) {
                string = "";
            }
            this.LLJLILLLLZIIL = string;
            String string2 = arguments.getString("enterprise_verify_reason");
            if (string2 == null) {
                string2 = "";
            }
            this.LLJLL = string2;
            String string3 = arguments.getString("special_account");
            if (string3 != null) {
                str = string3;
            }
            this.LLJLLIL = str;
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileDetailEditFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.0iAV
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(8);
                RecyclerView recyclerViewMS = this.LL.mS();
                if (recyclerViewMS != null) {
                    HandlerHook.viewPost(recyclerViewMS, new ARunnableS88S0200000_19(this.LL, c20244914JjLIZ, 28));
                }
                return c20246014Ju;
            }
        });
    }

    public final void oS(int i, String str, boolean z) {
        C424320GkQ c424320GkQ;
        C424320GkQ c424320GkQ2;
        C424320GkQ c424320GkQ3;
        C424320GkQ c424320GkQ4;
        if (z && this.LLJ) {
            LLFII();
        } else {
            LLIZLLLIL();
        }
        C21405318pn c21405318pn = null;
        if (C1EDI.LJ()) {
            if (str == null) {
                LinearLayout linearLayout = this.LLJJIJIL;
                if (linearLayout != null) {
                    c424320GkQ4 = (C424320GkQ) linearLayout.findViewById(R.id.kqa);
                } else {
                    c424320GkQ4 = null;
                }
                c424320GkQ4.LIZ();
                LinearLayout linearLayout2 = this.LLJJJ;
                if (linearLayout2 != null) {
                    linearLayout2.setBackgroundResource(R.drawable.cr7);
                }
            } else {
                LinearLayout linearLayout3 = this.LLJJIJIL;
                if (linearLayout3 != null) {
                    c424320GkQ3 = (C424320GkQ) linearLayout3.findViewById(R.id.kqa);
                } else {
                    c424320GkQ3 = null;
                }
                c424320GkQ3.LIZIZ(str);
                LinearLayout linearLayout4 = this.LLJJJ;
                if (linearLayout4 != null) {
                    linearLayout4.setBackgroundResource(R.drawable.cr8);
                }
            }
            LinearLayout linearLayout5 = this.LLJJIJIL;
            if (linearLayout5 != null) {
                c21405318pn = (C21405318pn) linearLayout5.findViewById(R.id.kq_);
            }
            c21405318pn.LIZJ(i, 0);
            return;
        }
        if (str == null) {
            LinearLayout linearLayout6 = this.LLJJJ;
            if (linearLayout6 != null) {
                c424320GkQ2 = (C424320GkQ) linearLayout6.findViewById(R.id.kqa);
            } else {
                c424320GkQ2 = null;
            }
            c424320GkQ2.LIZ();
        } else {
            LinearLayout linearLayout7 = this.LLJJJ;
            if (linearLayout7 != null) {
                c424320GkQ = (C424320GkQ) linearLayout7.findViewById(R.id.kqa);
            } else {
                c424320GkQ = null;
            }
            c424320GkQ.LIZIZ(str);
        }
        LinearLayout linearLayout8 = this.LLJJJ;
        if (linearLayout8 != null) {
            c21405318pn = (C21405318pn) linearLayout8.findViewById(R.id.kq_);
        }
        c21405318pn.LIZJ(i, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04e4  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r24, android.view.ViewGroup r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instruction units count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.ProfileEditUsernameFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
