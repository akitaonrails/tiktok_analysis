package com.ss.android.ugc.aweme.compliance.consent.termsconditions.component;

import X.C0HZQ;
import X.C1308910kAL;
import X.C13LQ;
import X.C14SL;
import X.C1559260qg8;
import X.C197039127h;
import X.C20307214d4;
import X.C20642515q3;
import X.C294000Bfi;
import X.C431260Gvc;
import X.C444940Hca;
import X.C723590SZx;
import X.C786410Ut5;
import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.ss.android.ugc.aweme.compliance.consent.termsconditions.component.TermsConditionsAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS120S1200000_3;

/* JADX INFO: loaded from: classes31.dex */
public final class TermsConditionsAssem extends UISlotAssem {
    public TuxTextView LLJJI;
    public C0HZQ LLJJIII;
    public TuxTextView LLJJIJI;
    public C0HZQ LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public C0HZQ LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public C0HZQ LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C197039127h LLJL;
    public boolean LLJLIL;
    public final C1559260qg8 LLJLILLLLZIIL = new C1559260qg8(new C723590SZx(this, C14SL.class, "terms_conditions_ui_data"), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bcq;
    }

    public final C14SL ip() {
        return (C14SL) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        TermsConsentInfo termsConsentInfo;
        String string;
        TermsConsentInfo termsConsentInfo2;
        String str2;
        TermsConsentInfo termsConsentInfo3;
        String string2;
        TermsConsentInfo termsConsentInfo4;
        String str3;
        TermsConsentInfo termsConsentInfo5;
        String string3;
        TermsConsentInfo termsConsentInfo6;
        String string4;
        TermsConsentInfo termsConsentInfo7;
        String string5;
        TermsConsentInfo termsConsentInfo8;
        super.onViewCreated(view);
        this.LLJJI = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLJJIII = (C0HZQ) view.findViewById(R.id.dj_);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.z8p);
        this.LLJJIJIIJIL = (C0HZQ) view.findViewById(R.id.dje);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.z8v);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.z8w);
        this.LLJJJIL = (C0HZQ) view.findViewById(R.id.djd);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.z8t);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.z8u);
        this.LLJJJJLIIL = (C0HZQ) view.findViewById(R.id.djb);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.z8s);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.z8r);
        this.LLJL = (C197039127h) view.findViewById(R.id.csc);
        TuxTextView tuxTextView = this.LLJJI;
        if (tuxTextView != null) {
            C14SL c14slIp = ip();
            if (c14slIp == null || (termsConsentInfo8 = c14slIp.LL) == null || (string5 = termsConsentInfo8.title) == null || string5.length() == 0) {
                string5 = view.getContext().getString(2131857924);
            }
            tuxTextView.setText(string5);
        }
        TuxTextView tuxTextView2 = this.LLJJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(123);
        }
        TuxTextView tuxTextView3 = this.LLJJIJI;
        if (tuxTextView3 != null) {
            C14SL c14slIp2 = ip();
            if (c14slIp2 == null || (termsConsentInfo7 = c14slIp2.LL) == null || (string4 = termsConsentInfo7.checkboxAll) == null || string4.length() == 0) {
                string4 = view.getContext().getString(2131857925);
            }
            tuxTextView3.setText(string4);
        }
        TuxTextView tuxTextView4 = this.LLJJI;
        if (tuxTextView4 != null) {
            tuxTextView4.setTuxFont(33);
        }
        TuxTextView tuxTextView5 = this.LLJJIJIL;
        if (tuxTextView5 != null) {
            C14SL c14slIp3 = ip();
            if (c14slIp3 == null || (termsConsentInfo6 = c14slIp3.LL) == null || (string3 = termsConsentInfo6.checkboxTerms) == null || string3.length() == 0) {
                string3 = view.getContext().getString(2131857926);
            }
            tuxTextView5.setText(string3);
        }
        TuxTextView tuxTextView6 = this.LLJJIJIL;
        if (tuxTextView6 != null) {
            tuxTextView6.setTuxFont(51);
        }
        TuxTextView tuxTextView7 = this.LLJJJ;
        if (tuxTextView7 != null) {
            C14SL c14slIp4 = ip();
            if (c14slIp4 == null || (termsConsentInfo5 = c14slIp4.LL) == null || (str3 = termsConsentInfo5.termsOfUseUrl) == null) {
                str3 = "https://www.tiktok.com/legal/page/row/terms-of-service/ko-KR";
            }
            hp(tuxTextView7, str3);
        }
        TuxTextView tuxTextView8 = this.LLJJJJ;
        if (tuxTextView8 != null) {
            C14SL c14slIp5 = ip();
            if (c14slIp5 == null || (termsConsentInfo4 = c14slIp5.LL) == null || (string2 = termsConsentInfo4.checkboxPP) == null || string2.length() == 0) {
                string2 = view.getContext().getString(2131857927);
            }
            tuxTextView8.setText(string2);
        }
        TuxTextView tuxTextView9 = this.LLJJJJ;
        if (tuxTextView9 != null) {
            tuxTextView9.setTuxFont(51);
        }
        TuxTextView tuxTextView10 = this.LLJJJJJIL;
        if (tuxTextView10 != null) {
            C14SL c14slIp6 = ip();
            if (c14slIp6 == null || (termsConsentInfo3 = c14slIp6.LL) == null || (str2 = termsConsentInfo3.privacyPolicyUrl) == null) {
                str2 = "https://www.tiktok.com/legal/terms-and-conditions-kr?lang=ko-KR";
            }
            hp(tuxTextView10, str2);
        }
        TuxTextView tuxTextView11 = this.LLJJL;
        if (tuxTextView11 != null) {
            C14SL c14slIp7 = ip();
            if (c14slIp7 == null || (termsConsentInfo2 = c14slIp7.LL) == null || (string = termsConsentInfo2.cbNotificationTitle) == null || string.length() == 0 || string == null) {
                string = view.getContext().getString(2131857928);
            }
            tuxTextView11.setText(string);
        }
        TuxTextView tuxTextView12 = this.LLJJL;
        if (tuxTextView12 != null) {
            tuxTextView12.setTuxFont(51);
        }
        TuxTextView tuxTextView13 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView13 != null) {
            C14SL c14slIp8 = ip();
            if (c14slIp8 == null || (termsConsentInfo = c14slIp8.LL) == null || (str = termsConsentInfo.krMarketUrl) == null) {
                str = "https://www.tiktok.com/legal/page/global/consent-to-collection-and-use-of-your-personal-information-for-marketing-purposes/ko-KR";
            }
            hp(tuxTextView13, str);
        }
        final C0HZQ c0hzq = this.LLJJIII;
        if (c0hzq != null) {
            final C0HZQ c0hzq2 = this.LLJJIJIIJIL;
            if (c0hzq2 != null) {
                final C0HZQ c0hzq3 = this.LLJJJIL;
                if (c0hzq3 != null) {
                    final C0HZQ c0hzq4 = this.LLJJJJLIIL;
                    if (c0hzq4 != null) {
                        C786410Ut5.D7(c0hzq, new C20307214d4(c0hzq2, c0hzq3, c0hzq4, this, 0));
                        C786410Ut5.D7(c0hzq2, new CompoundButton.OnCheckedChangeListener() { // from class: X.14SM
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                boolean z2;
                                Function1<Boolean, Unit> function1;
                                boolean zIsChecked = c0hzq3.isChecked();
                                boolean zIsChecked2 = c0hzq4.isChecked();
                                C0HZQ c0hzq5 = c0hzq;
                                boolean z3 = true;
                                if (z && c0hzq3.isChecked() && c0hzq4.isChecked()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c0hzq5.setChecked(z2);
                                c0hzq3.setChecked(zIsChecked);
                                c0hzq4.setChecked(zIsChecked2);
                                TermsConditionsAssem termsConditionsAssem = this;
                                if (!c0hzq2.isChecked() || !c0hzq3.isChecked()) {
                                    z3 = false;
                                }
                                termsConditionsAssem.LLJLIL = z3;
                                TermsConditionsAssem termsConditionsAssem2 = this;
                                boolean z4 = termsConditionsAssem2.LLJLIL;
                                C197039127h c197039127h = termsConditionsAssem2.LLJL;
                                if (c197039127h != null) {
                                    c197039127h.setEnabled(z4);
                                }
                                C14SL c14slIp9 = this.ip();
                                if (c14slIp9 != null && (function1 = c14slIp9.LLILLL) != null) {
                                    function1.invoke(Boolean.valueOf(z));
                                }
                            }
                        });
                        C786410Ut5.D7(c0hzq3, new CompoundButton.OnCheckedChangeListener() { // from class: X.14SN
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                boolean z2;
                                Function1<Boolean, Unit> function1;
                                boolean zIsChecked = c0hzq2.isChecked();
                                boolean zIsChecked2 = c0hzq4.isChecked();
                                C0HZQ c0hzq5 = c0hzq;
                                boolean z3 = true;
                                if (z && c0hzq2.isChecked() && c0hzq4.isChecked()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c0hzq5.setChecked(z2);
                                c0hzq2.setChecked(zIsChecked);
                                c0hzq4.setChecked(zIsChecked2);
                                TermsConditionsAssem termsConditionsAssem = this;
                                if (!c0hzq2.isChecked() || !c0hzq3.isChecked()) {
                                    z3 = false;
                                }
                                termsConditionsAssem.LLJLIL = z3;
                                TermsConditionsAssem termsConditionsAssem2 = this;
                                boolean z4 = termsConditionsAssem2.LLJLIL;
                                C197039127h c197039127h = termsConditionsAssem2.LLJL;
                                if (c197039127h != null) {
                                    c197039127h.setEnabled(z4);
                                }
                                C14SL c14slIp9 = this.ip();
                                if (c14slIp9 != null && (function1 = c14slIp9.LLILZ) != null) {
                                    function1.invoke(Boolean.valueOf(z));
                                }
                            }
                        });
                        C786410Ut5.D7(c0hzq4, new C20307214d4(c0hzq2, c0hzq3, c0hzq, this, 1));
                        C14SL c14slIp9 = ip();
                        if (c14slIp9 != null && c14slIp9.LLIZ && C294000Bfi.LIZ()) {
                            for (C0HZQ c0hzq5 : (ArrayList) C13LQ.LJIJI(new C0HZQ[]{this.LLJJIII, this.LLJJIJIIJIL, this.LLJJJIL, this.LLJJJJLIIL})) {
                                Context context = c0hzq5.getContext();
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, context);
                                if (numLIZJ != null) {
                                    c0hzq5.setCheckBoxCheckedColor(numLIZJ.intValue());
                                }
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, context);
                                if (numLIZJ2 != null) {
                                    c0hzq5.setCheckBoxInnerShapeColor(numLIZJ2.intValue());
                                }
                            }
                        }
                        C197039127h c197039127h = this.LLJL;
                        if (c197039127h != null) {
                            c197039127h.setSupportClickWhenDisable(true);
                            c197039127h.setText(C20642515q3.LJI(2131857923));
                            C14SL c14slIp10 = ip();
                            if (c14slIp10 != null && c14slIp10.LLIZ && C294000Bfi.LIZ()) {
                                c197039127h.setButtonVariant(-1);
                                c197039127h.LJJJJL(AFwS232S0000000_4.get$arr$(181));
                            }
                            C786410Ut5.U8(c197039127h, new ACListenerS164S0100000_30(this, 28));
                            return;
                        }
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void hp(TuxTextView tuxTextView, String str) {
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZJ = tuxTextView.getContext().getString(2131834725);
        c444940Hca.LIZIZ = true;
        c444940Hca.LIZIZ(51);
        c444940Hca.LIZLLL(0);
        c444940Hca.LJIIIIZZ = new AwS120S1200000_3(this, tuxTextView, str, 0);
        tuxTextView.setText(c444940Hca.LIZ(tuxTextView.getContext()));
    }
}
