package com.ss.android.ugc.aweme.account.agegate.ftc;

import X.AbstractC431340Gvk;
import X.C01GW;
import X.C0XGR;
import X.C0XQZ;
import X.C11JF;
import X.C1232150iAX;
import X.C1237010iIN;
import X.C1239720iMk;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1701940uOG;
import X.C1913610ztf;
import X.C19241810Po;
import X.C19295310eF;
import X.C19295410eG;
import X.C19295610eI;
import X.C19EG;
import X.C20684815ws;
import X.C21405318pn;
import X.C2188811AlT;
import X.C2241008qG;
import X.C294580Bge;
import X.C424320GkQ;
import X.C424810GlD;
import X.C431300Gvg;
import X.C452501pT;
import X.C786410Ut5;
import X.C794240VDq;
import X.C853720XeM;
import X.C960203pA;
import X.EnumC1913590ztd;
import X.EnumC852910Xd3;
import X.InterfaceC1913620ztg;
import X.InterfaceC19295910eL;
import X.InterfaceC19483011Ki;
import Y.ACListenerS162S0100000_28;
import Y.AfS197S0100000_28;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class FtcCreateAccountFragment extends BaseI18nLoginFragment implements InterfaceC19295910eL {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiKCHELIOSg2LyQ4LGE1PCZiDzswCzcpKDs2CSYvJjo9PAM+KCg+LSs4";
    public TuxTextView LLLIILIL;
    public C21405318pn LLLIL;
    public C424320GkQ LLLILZ;
    public C1239720iMk LLLILZJ;
    public RecyclerView LLLILZLLLI;
    public C424810GlD LLLL;
    public C19295410eG LLLLII;
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 59));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 26));
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 61));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 60));
    public final C19295610eI[] LLLLIIIILLL = {C19295610eI.LIZJ, C19295610eI.LIZLLL, C19295610eI.LJ};

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.y5;
    }

    public final boolean NS() {
        return ((Boolean) this.LLLIZZ.getValue()).booleanValue();
    }

    public final C21405318pn PS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ind) : null;
            this.LLLIL = (C21405318pn) viewFindViewById;
        }
        return (C21405318pn) viewFindViewById;
    }

    public final C424320GkQ QS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ine) : null;
            this.LLLILZ = (C424320GkQ) viewFindViewById;
        }
        return (C424320GkQ) viewFindViewById;
    }

    public final C1239720iMk RS() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.inf) : null;
            this.LLLILZJ = (C1239720iMk) viewFindViewById;
        }
        return (C1239720iMk) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        String string;
        if (NS()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getString(2131857971));
            sbLIZ.append('\n');
            sbLIZ.append(getString(2131857972));
            string = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            string = getString(2131828647);
        }
        return new C1237010iIN(NS() ? getString(2131829374) : " ", null, NS(), getString(2131828650), string, false, null, false, true, null, false, null, null, null, null, 67067102);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        C1239720iMk c1239720iMkRS = RS();
        if (c1239720iMkRS != null) {
            c1239720iMkRS.LIZIZ(c1239720iMkRS.isEnabled());
        }
    }

    @Override // X.InterfaceC19295910eL
    public final void Pe() {
        String text;
        C424320GkQ c424320GkQQS = QS();
        if (c424320GkQQS != null) {
            c424320GkQQS.LIZ();
        }
        aS();
        if (((Boolean) this.LLLJIL.getValue()).booleanValue()) {
            C0XQZ.LIZIZ(false);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC852910Xd3.FTC_CREATE_PASSWORD.getValue());
        C21405318pn c21405318pnPS = PS();
        if (c21405318pnPS == null || (text = c21405318pnPS.getText()) == null) {
            text = "";
        }
        C786410Ut5.LJJJI("username", text, arguments);
        fo(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        C1239720iMk c1239720iMkRS = RS();
        if (c1239720iMkRS != null) {
            c1239720iMkRS.LIZ(c1239720iMkRS.isEnabled());
        }
    }

    @Override // X.InterfaceC19295910eL
    public final void bC() {
        C424320GkQ c424320GkQQS = QS();
        if (c424320GkQQS != null) {
            c424320GkQQS.LIZ();
        }
        C21405318pn c21405318pnPS = PS();
        if (c21405318pnPS != null) {
            c21405318pnPS.LIZJ(1, 3);
        }
    }

    @Override // X.InterfaceC19295910eL
    public final void c0() {
        String text;
        C424320GkQ c424320GkQQS = QS();
        if (c424320GkQQS != null) {
            c424320GkQQS.LIZ();
        }
        aS();
        C0XQZ.LIZIZ(false);
        if (((Number) this.LLLJL.getValue()).intValue() == 0) {
            SmartRouter.buildRoute(this, "aweme://hyd_action/video_export_complete?is_kids_mode=1").open();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC852910Xd3.DELETE_VIDEO_ALERT.getValue());
        C21405318pn c21405318pnPS = PS();
        if (c21405318pnPS == null || (text = c21405318pnPS.getText()) == null) {
            text = "";
        }
        C786410Ut5.LJJJI("username", text, arguments);
        C786410Ut5.LJJJI("enter_from", "from_kids_account_page", arguments);
        arguments.putInt("is_kids", 1);
        arguments.putBoolean("finish_before_jump", true);
        fo(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return !NS();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1232150iAX.LIZ(PS().getEditText());
    }

    @Override // X.InterfaceC19295910eL
    public final void D3(List<String> list) {
        C424810GlD c424810GlD = this.LLLL;
        if (c424810GlD != null) {
            c424810GlD.LIZ(list);
        }
    }

    @Override // X.InterfaceC19295910eL
    public final void LJIIJ(String str) {
        aS();
        if (str != null) {
            pn(0, str);
        }
    }

    @Override // X.InterfaceC19295910eL
    public final void T9(String str) {
        C21405318pn c21405318pnPS = PS();
        if (c21405318pnPS != null) {
            c21405318pnPS.setText(str);
        }
    }

    public final void US(String str) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(EnumC1913590ztd.ACCOUNT_KIDS_SIGNUP.getValue(), str, false, true, true, null, false, 100), new InterfaceC1913620ztg() { // from class: X.10eJ
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }

    public final void VS(String str) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            EnumC1913590ztd.ACCOUNT_KIDS_SIGNUP.getValue();
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
    }

    @Override // X.InterfaceC19295910eL
    public final void gs(boolean z) {
        C1239720iMk c1239720iMkRS = RS();
        if (c1239720iMkRS != null) {
            c1239720iMkRS.setEnabled(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLLLII = new C19295410eG(this, ((Boolean) this.LLLJIL.getValue()).booleanValue(), getEnterFrom(), getEnterMethod());
    }

    @Override // X.InterfaceC19295910eL
    public final void wB(boolean z) {
        int i;
        String text;
        C21405318pn c21405318pnPS = PS();
        if (c21405318pnPS != null) {
            if (z) {
                i = 2;
            } else {
                C21405318pn c21405318pnPS2 = PS();
                if (c21405318pnPS2 != null && (text = c21405318pnPS2.getText()) != null && text.length() != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            c21405318pnPS.LIZJ(i, 0);
        }
    }

    @Override // X.InterfaceC19295910eL
    public final void C1(Integer num, Integer num2) {
        aS();
        if (num2 != null) {
            pn(0, getString(num2.intValue()));
        }
        if (num != null) {
            int iIntValue = num.intValue();
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIJ(getString(iIntValue));
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequenceLIZ;
        int iIntValue;
        TextWithInlineLink textWithInlineLinkLJII;
        C11JF c11jf;
        super.onViewCreated(view, bundle);
        C19295410eG c19295410eG = this.LLLLII;
        if (c19295410eG == null) {
            c19295410eG = null;
        }
        C11JF c11jf2 = c19295410eG.LJI;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = c19295410eG.LJI) != null) {
            c11jf.dispose();
        }
        c19295410eG.LJI = (C11JF) c19295410eG.LJII.LJJIFFI().LJJIJIIJIL(new AfS197S0100000_28(c19295410eG, 47)).LJIL(500L, TimeUnit.MILLISECONDS).LJJIL(new InterfaceC19483011Ki() { // from class: X.08BI
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return C123100dR.LIZ((String) obj);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS197S0100000_28(c19295410eG, 48));
        if (c19295410eG.LIZIZ) {
            c19295410eG.LIZ.T9((String) c19295410eG.LJ.LIZ.getValue());
            c19295410eG.LJII.onNext((String) c19295410eG.LJ.LIZ.getValue());
        }
        String str = c19295410eG.LIZJ;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        C20684815ws.LJIILLIIL("show_create_account_page", c0xgr.LIZ);
        if (NS() || ((Boolean) this.LLLJ.getValue()).booleanValue()) {
            View viewFindViewById = this.LLLIILIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.ing);
                } else {
                    viewFindViewById = null;
                }
                this.LLLIILIL = (TuxTextView) viewFindViewById;
            }
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById;
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ();
            if (C294580Bge.LIZ() && iPNSConsentConfigServiceLJIIIZ != null && (textWithInlineLinkLJII = iPNSConsentConfigServiceLJIIIZ.LJII()) != null) {
                charSequenceLIZ = iPNSConsentConfigServiceLJIIIZ.LIZ(requireContext(), textWithInlineLinkLJII, EnumC1913590ztd.ACCOUNT_KIDS_SIGNUP.getValue(), C960203pA.LIZ(R.attr.a1h, requireContext()), 82);
            } else {
                charSequenceLIZ = null;
            }
            if (charSequenceLIZ != null) {
                if (iPNSConsentConfigServiceLJIIIZ != null) {
                    iPNSConsentConfigServiceLJIIIZ.LIZLLL("consent_label");
                }
                tuxTextView.setText(charSequenceLIZ);
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                if (C294580Bge.LIZ() && iPNSConsentConfigServiceLJIIIZ != null) {
                    iPNSConsentConfigServiceLJIIIZ.LJIIIZ("consent_label");
                }
                C19EG activity = getActivity();
                final ACListenerS162S0100000_28 aCListenerS162S0100000_28 = new ACListenerS162S0100000_28(this, 26);
                final ACListenerS162S0100000_28 aCListenerS162S0100000_282 = new ACListenerS162S0100000_28(this, 27);
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" ");
                    sbLIZ.append(activity.getString(2131829373));
                    sbLIZ.append(" ");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" ");
                    sbLIZ2.append(activity.getString(2131829366));
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(activity.getString(2131829336, strLIZIZ, strLIZIZ2));
                    final int iLIZ = C960203pA.LIZ(R.attr.a1h, activity);
                    final int iLIZ2 = C960203pA.LIZ(R.attr.a1h, activity);
                    AbstractC431340Gvk abstractC431340Gvk = new AbstractC431340Gvk(iLIZ, iLIZ2) { // from class: X.10eC
                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view3) {
                            View.OnClickListener onClickListener = aCListenerS162S0100000_28;
                            if (onClickListener != null) {
                                onClickListener.onClick(view3);
                            }
                        }

                        @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            textPaint.setTypeface(C19293810e0.LJ());
                            textPaint.setUnderlineText(false);
                        }
                    };
                    AbstractC431340Gvk abstractC431340Gvk2 = new AbstractC431340Gvk(iLIZ, iLIZ2) { // from class: X.10eD
                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view3) {
                            View.OnClickListener onClickListener = aCListenerS162S0100000_282;
                            if (onClickListener != null) {
                                onClickListener.onClick(view3);
                            }
                        }

                        @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            textPaint.setTypeface(C19293810e0.LJ());
                            textPaint.setUnderlineText(false);
                        }
                    };
                    String lowerCase = spannableStringBuilder.toString().toLowerCase(Locale.getDefault());
                    int iIndexOf = lowerCase.indexOf(strLIZIZ.toLowerCase(Locale.getDefault()));
                    int iIndexOf2 = lowerCase.indexOf(strLIZIZ2.toLowerCase(Locale.getDefault()));
                    if (iIndexOf < 0 || iIndexOf2 < 0) {
                        C2241008qG c2241008qG = new C2241008qG();
                        c2241008qG.LIZ.put("enter_from", "login");
                        JSONObject jSONObjectLJ = c2241008qG.LJ();
                        if (jSONObjectLJ != null) {
                            C794240VDq.LIZIZ("text_highlight_not_match", "", jSONObjectLJ);
                        }
                    }
                    C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk, iIndexOf + 1, (iIndexOf + strLIZIZ.length()) - 1, 34);
                    C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk2, iIndexOf2 + 1, iIndexOf2 + strLIZIZ2.length(), 34);
                    tuxTextView.setHighlightColor(0);
                    tuxTextView.setText(spannableStringBuilder);
                    tuxTextView.setMovementMethod(C431300Gvg.LIZ());
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, activity);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    tuxTextView.setTextColor(iIntValue);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            VS("privacy-policy");
            VS("terms-of-service");
        }
        if (((Boolean) this.LLLJIL.getValue()).booleanValue()) {
            C0XQZ.LIZIZ(true);
        }
        PS().getEditText().setInputType(524288);
        EditText editText = PS().getEditText();
        final C19295610eI[] c19295610eIArr = this.LLLLIIIILLL;
        final AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 39);
        editText.setFilters(new C19295310eF[]{new InputFilter(c19295610eIArr, awS607S0100000_28) { // from class: X.10eF
            public final C19295610eI[] LL;
            public final Function1<Integer, Unit> LLILLJJLI;

            {
                this.LL = c19295610eIArr;
                this.LLILLJJLI = awS607S0100000_28;
            }

            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                String string;
                CharSequence charSequenceLJJL;
                if (charSequence == null || (string = charSequence.subSequence(i, i2).toString()) == null) {
                    string = "";
                }
                if (spanned != null) {
                    charSequenceLJJL = a0.LJJL(spanned, i3, i4, string);
                } else {
                    charSequenceLJJL = null;
                }
                for (C19295610eI c19295610eI : this.LL) {
                    if (!PatternProtector.compile(c19295610eI.LIZ).matcher(charSequenceLJJL).matches()) {
                        this.LLILLJJLI.invoke(Integer.valueOf(c19295610eI.LIZIZ));
                        if (spanned == null) {
                            return null;
                        }
                        return spanned.subSequence(i3, i4);
                    }
                }
                return null;
            }
        }});
        PS().getEditText().addTextChangedListener(new C853720XeM() { // from class: X.10eH
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C424320GkQ c424320GkQQS = this.LL.QS();
                if (c424320GkQQS != null) {
                    c424320GkQQS.LIZ();
                }
                C19295410eG c19295410eG2 = this.LL.LLLLII;
                if (c19295410eG2 == null) {
                    c19295410eG2 = null;
                }
                c19295410eG2.LJII.onNext(String.valueOf(editable));
            }
        });
        GS(new ACListenerS162S0100000_28(this, 28), RS());
        View viewFindViewById2 = this.LLLILZLLLI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.ink);
            } else {
                viewFindViewById2 = null;
            }
            this.LLLILZLLLI = (RecyclerView) viewFindViewById2;
        }
        C424810GlD c424810GlD = new C424810GlD((RecyclerView) viewFindViewById2, null, new AwS607S0100000_28(this, 40));
        this.LLLL = c424810GlD;
        c424810GlD.LJ = true;
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        C424320GkQ c424320GkQQS = QS();
        if (c424320GkQQS != null) {
            c424320GkQQS.LIZIZ(str);
        }
    }
}
