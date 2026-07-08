package com.ss.android.ugc.aweme;

import X.AbstractC431340Gvk;
import X.C04TD;
import X.C1913610ztf;
import X.C19293810e0;
import X.C2241008qG;
import X.C431300Gvg;
import X.C446980Hfs;
import X.C786410Ut5;
import X.C794240VDq;
import X.C960203pA;
import X.EnumC1913590ztd;
import X.InterfaceC1913620ztg;
import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyDisclaimerUtilService implements IPrivacyDisclaimerUtil {
    public static IPrivacyDisclaimerUtil LJFF() {
        Object objLIZ = C04TD.LIZ(IPrivacyDisclaimerUtil.class, false);
        if (objLIZ != null) {
            return (IPrivacyDisclaimerUtil) objLIZ;
        }
        if (C04TD.LJJLJLI == null) {
            synchronized (IPrivacyDisclaimerUtil.class) {
                if (C04TD.LJJLJLI == null) {
                    C04TD.LJJLJLI = new PrivacyDisclaimerUtilService();
                }
            }
        }
        return C04TD.LJJLJLI;
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void LIZ() {
        LJI("tiktok-series-sale-terms");
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void LIZIZ() {
        LJI("terms-of-service");
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void LIZJ() {
        LJI("privacy-policy");
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void LIZLLL() {
        LJI("rewards-policy-eea");
    }

    public static void LJI(String str) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(EnumC1913590ztd.VIDEO_GIFT.getValue(), str, false, true, true, null, false, 100), new InterfaceC1913620ztg() { // from class: X.10dw
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void LJ(Context context, TuxTextView tuxTextView, final ACListenerS151S0100000_16 aCListenerS151S0100000_16, final ACListenerS151S0100000_16 aCListenerS151S0100000_162, final ACListenerS151S0100000_16 aCListenerS151S0100000_163) {
        try {
            String string = context.getString(2131829455);
            String string2 = context.getString(2131829454);
            String string3 = context.getString(2131858215);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(2131858214, string, string2, string3));
            final int iLIZ = C960203pA.LIZ(R.attr.a1h, context);
            final int iLIZ2 = C960203pA.LIZ(R.attr.a1h, context);
            AbstractC431340Gvk abstractC431340Gvk = new AbstractC431340Gvk(iLIZ, iLIZ2) { // from class: X.10dt
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    View.OnClickListener onClickListener = aCListenerS151S0100000_16;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }

                @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setTypeface(C19293810e0.LJ());
                    textPaint.setUnderlineText(false);
                }
            };
            AbstractC431340Gvk abstractC431340Gvk2 = new AbstractC431340Gvk(iLIZ, iLIZ2) { // from class: X.10du
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    View.OnClickListener onClickListener = aCListenerS151S0100000_162;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }

                @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setTypeface(C19293810e0.LJ());
                    textPaint.setUnderlineText(false);
                }
            };
            AbstractC431340Gvk abstractC431340Gvk3 = new AbstractC431340Gvk(iLIZ, iLIZ2) { // from class: X.10dv
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    View.OnClickListener onClickListener = aCListenerS151S0100000_163;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
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
            int iIndexOf = lowerCase.indexOf(string.toLowerCase(Locale.getDefault()));
            int iIndexOf2 = lowerCase.indexOf(string2.toLowerCase(Locale.getDefault()));
            int iIndexOf3 = lowerCase.indexOf(string3.toLowerCase(Locale.getDefault()));
            if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf3 < 0) {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("enter_from", "login");
                C794240VDq.LIZIZ("text_highlight_not_match", "", c2241008qG.LJ());
            }
            if (iIndexOf >= 0) {
                C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk, iIndexOf, string.length() + iIndexOf, 34);
                C19293810e0.LJIILIIL(EnumC1913590ztd.VIDEO_GIFT.getValue(), "terms-of-service");
            }
            if (iIndexOf2 >= 0) {
                C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk2, iIndexOf2, string2.length() + iIndexOf2, 34);
                C19293810e0.LJIILIIL(EnumC1913590ztd.VIDEO_GIFT.getValue(), "privacy-policy");
            }
            if (iIndexOf3 >= 0) {
                C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk3, iIndexOf3, string3.length() + iIndexOf3, 34);
                C19293810e0.LJIILIIL(EnumC1913590ztd.VIDEO_GIFT.getValue(), "rewards-policy-eea");
            }
            tuxTextView.setHighlightColor(C446980Hfs.LIZ(context, R.color.dr));
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(C431300Gvg.LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
