package com.ss.android.ugc.aweme.compliance.agegate.view;

import X.AbstractC1250290idn;
import X.C01GW;
import X.C098200Yq;
import X.C0I7D;
import X.C0OM1;
import X.C0WZX;
import X.C10WS;
import X.C10WW;
import X.C123100dR;
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
import X.C1685300txQ;
import X.C189200o6;
import X.C19258510Vz;
import X.C19298010eg;
import X.C19299010eq;
import X.C19300010f0;
import X.C19301110fB;
import X.C19331610k6;
import X.C1954807lC;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C444920HcY;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.C985403tE;
import X.EnumC19298710en;
import X.EnumC19300210f2;
import X.EnumC19300410f4;
import X.EnumC19300510f5;
import X.EnumC19300610f6;
import X.EnumC19301010fA;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.zhiliaoapp.musically.R;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS45S0310000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public class AgeGateFragment extends Fragment implements C10WS {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiHELIOSKip9KSIpLi4nLWs6ICokZgQrLAgyPCAKOy40JSAiPQ==";
    public final int LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public LinearLayout LLILZIL;
    public C0I7D LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public SmartImageView LLJ;
    public TuxNavBar LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    public AgeGateFragment() {
        this(0);
    }

    @Override // X.C10WS
    public final MutableLiveData<Integer> MM() {
        return null;
    }

    @Override // X.C10WS
    public final LiveData<C19258510Vz> Un() {
        return null;
    }

    @Override // X.C10WS
    public final void qh() {
    }

    public final TuxTextView PR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajq) : null;
            this.LLIZLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView RR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajr) : null;
            this.LLIZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final SmartImageView SR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ajw) : null;
            this.LLJ = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final Locale UR() {
        return Build.VERSION.SDK_INT >= 24 ? C786410Ut5.P3(requireActivity()).getResources().getConfiguration().getLocales().get(0) : requireActivity().getResources().getConfiguration().locale;
    }

    public final Map<String, String> VR() {
        return (Map) this.LLJILJIL.getValue();
    }

    public AgeGateBaseLowerFragment WR() {
        return (AgeGateBaseLowerFragment) this.LLJIJIL.getValue();
    }

    @Override // X.C10WS
    public final MutableLiveData<Unit> bJ() {
        return WR().bJ();
    }

    @Override // X.C10WS
    public final LiveData<Boolean> iz() {
        return WR().iz();
    }

    @Override // X.C10WS
    public final LiveData<Date> mD() {
        return WR().MR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C19EG activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            int i = window.getAttributes().softInputMode;
            if ((i & 240) != 16) {
                window.setSoftInputMode((i & (-241)) ^ 16);
            }
        }
    }

    public AgeGateFragment(int i) {
        this.LL = -1;
        this.LLILLJJLI = "";
        this.LLILLL = -1;
        this.LLILZ = true;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1068));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(761));
    }

    @Override // X.C10WS
    public final void Kq(String str) {
        WR().PR(str);
    }

    @Override // X.C10WS
    public final void Kz(boolean z) {
        WR().Kz(z);
    }

    public final void MR(String str) {
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(getContext(), str).open();
        }
    }

    public final AbstractC1250290idn OR(PNSNavButton pNSNavButton) {
        boolean z;
        EnumC19300210f2 enumC19300210f2;
        EnumC19300210f2 enumC19300210f22 = null;
        if (pNSNavButton != null) {
            enumC19300210f22 = pNSNavButton.type;
        }
        int i = 0;
        if (TextUtils.getLayoutDirectionFromLocale(UR()) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (enumC19300210f22 != null) {
            int i2 = C19300010f0.LIZ[enumC19300210f22.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3 || i2 == 4 || i2 == 5) {
                        i = z ? R.raw.icon_arrow_right_ltr : R.raw.icon_arrow_left_ltr;
                    }
                } else {
                    i = z ? R.raw.icon_chevron_right_thin_ltr : R.raw.icon_chevron_left_thin_ltr;
                }
            } else {
                i = R.raw.icon_x_mark;
            }
        }
        if (pNSNavButton != null && (enumC19300210f2 = pNSNavButton.type) != null) {
            switch (C19300010f0.LIZ[enumC19300210f2.ordinal()]) {
                case 1:
                    return NR(i, new AwS572S0100000_28(this, 130));
                case 2:
                    return NR(i, new AwS572S0100000_28(this, 129));
                case 3:
                    return NR(i, new AwS429S0200000_28(this, pNSNavButton, 19));
                case 4:
                    return NR(i, new AwS429S0200000_28(this, pNSNavButton, 20));
                case 5:
                    return NR(i, new AwS429S0200000_28(this, pNSNavButton, 21));
                case 6:
                    return new C1250280idm();
            }
        }
        return new C1250280idm();
    }

    @Override // X.C10WS
    public final void er(String str) {
        WR().er(str);
    }

    @Override // X.C10WS
    public final void jF(boolean z) {
        WR().jF(z);
    }

    @Override // X.C10WS
    public final void lu(C19299010eq c19299010eq) {
        boolean z;
        PNSNavButton pNSNavButton;
        PNSNavButton pNSNavButton2;
        boolean z2;
        Context contextP3;
        Resources resources;
        String quantityString;
        int i;
        int iIntValue;
        int iIntValue2;
        if (c19299010eq == null) {
            return;
        }
        String str = c19299010eq.title;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLLLZLL(RR(), 8);
        } else {
            RR().setText(c19299010eq.title);
            C786410Ut5.LLLLZLL(RR(), 0);
        }
        String str2 = c19299010eq.contentDesc;
        if (str2 != null && !a0.LJJJIL(str2)) {
            String str3 = c19299010eq.contentDesc;
            List<PNSHyperlink> list = c19299010eq.hyperLinks;
            PR().setText(str3);
            C786410Ut5.LLLLZLL(PR(), 0);
            TuxTextView tuxTextViewPR = PR();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, requireContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxTextViewPR.setTextColor(iIntValue);
            TuxTextView tuxTextViewPR2 = PR();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bm, requireContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            tuxTextViewPR2.setHighlightColor(iIntValue2);
            if (list != null && !list.isEmpty()) {
                PR().setText(aS(PR().getText().toString(), list));
                PR().setMovementMethod(LinkMovementMethod.getInstance());
            }
        } else {
            C786410Ut5.LLLLZLL(PR(), 8);
        }
        List<PNSNavButton> list2 = c19299010eq.navButtons;
        String str4 = c19299010eq.header;
        View viewFindViewById = null;
        if (list2 != null) {
            pNSNavButton = null;
            pNSNavButton2 = null;
            for (PNSNavButton pNSNavButton3 : list2) {
                EnumC19300410f4 enumC19300410f4 = pNSNavButton3.position;
                if (enumC19300410f4 == EnumC19300410f4.LEFT) {
                    pNSNavButton = pNSNavButton3;
                } else if (enumC19300410f4 == EnumC19300410f4.RIGHT) {
                    pNSNavButton2 = pNSNavButton3;
                }
            }
        } else {
            pNSNavButton = null;
            pNSNavButton2 = null;
        }
        View viewFindViewById2 = this.LLJI;
        if (viewFindViewById2 == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById2 = view.findViewById(R.id.ak2);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJI = (TuxNavBar) viewFindViewById2;
        }
        C786410Ut5.LLLLZLLLI((TuxNavBar) viewFindViewById2, 0);
        View viewFindViewById3 = this.LLJI;
        if (viewFindViewById3 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById3 = view2.findViewById(R.id.ak2);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJI = (TuxNavBar) viewFindViewById3;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById3;
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(OR(pNSNavButton));
        C1250250idj c1250250idj = new C1250250idj();
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        c1250250idj.LIZJ = str4;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(OR(pNSNavButton2));
        c0om1.LIZLLL = false;
        tuxNavBar.setNavActions(c0om1);
        String str6 = c19299010eq.imageUrl;
        if (str6 == null) {
            Context context = getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                i = R.drawable.bdm;
            } else {
                i = R.drawable.bdl;
            }
            C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(i);
            c1331670kl3LJFF.LJJ(SR());
            C786410Ut5.h3(c1331670kl3LJFF);
        } else if (a0.LJJJIL(str6)) {
            C786410Ut5.LLFF(8, SR());
        } else if (!a0.LJJJIL(str6)) {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str6));
            c1331670kl3LJI.LJJ(SR());
            C786410Ut5.h3(c1331670kl3LJI);
            C786410Ut5.LLFF(0, SR());
        }
        WR().SR(c19299010eq.nextBtnText);
        WR().RR(c19299010eq.inputPlaceHolder);
        Date date = c19299010eq.defaultDate;
        if (date == null) {
            date = new Date();
        }
        WR().OR(date);
        Date date2 = c19299010eq.upperBound;
        if (date2 == null) {
            date2 = new Date();
        }
        WR().UR(date2);
        if (c19299010eq.indicatorType == EnumC19300610f6.DISPLAY) {
            z2 = true;
        } else {
            z2 = false;
        }
        WR().NR(z2);
        if (this.LL != -1 && this.LLILZ) {
            View view3 = this.LLILZLL;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.ajz);
                }
                this.LLILZLL = (C0I7D) viewFindViewById;
                view3 = viewFindViewById;
            }
            ((C0I7D) view3).setTuxFont(41);
            C19EG activity = getActivity();
            if (activity != null && (contextP3 = C786410Ut5.P3(activity)) != null && (resources = contextP3.getResources()) != null && (quantityString = resources.getQuantityString(2131755084, C10WW.LIZLLL(c19299010eq.defaultDate), Integer.valueOf(C10WW.LIZLLL(c19299010eq.defaultDate)))) != null) {
                str5 = quantityString;
            }
            er(str5);
        }
    }

    @Override // X.C10WS
    public final void Iq(PNSFeedbackModel pNSFeedbackModel, Function1<? super Integer, Unit> function1) {
        PNSDialogModel pNSDialogModel;
        Integer num;
        boolean z;
        CharSequence charSequenceAS;
        String value;
        PNSErrorModel pNSErrorModel;
        boolean z2;
        PNSErrorModel pNSErrorModel2;
        String str;
        String str2;
        Integer num2 = null;
        if (pNSFeedbackModel != null) {
            pNSDialogModel = pNSFeedbackModel.dialogModel;
            num = pNSFeedbackModel.f72case;
        } else {
            pNSDialogModel = null;
            num = null;
        }
        if (pNSFeedbackModel != null && pNSFeedbackModel.fromCalculateAPI) {
            z = true;
        } else {
            z = false;
        }
        if (pNSDialogModel == null) {
            function1.invoke(Integer.valueOf(EnumC19301010fA.CONTINUE.getType()));
        } else {
            String strReplace = pNSDialogModel.title;
            if (strReplace == null) {
                strReplace = "";
            }
            if (new Regex("Are you \\d+ years old\\?").matches(strReplace)) {
                Regex regex = new Regex("\\d+");
                View viewFindViewById = this.LLILZLL;
                if (viewFindViewById == null) {
                    View view = getView();
                    if (view != null) {
                        viewFindViewById = view.findViewById(R.id.ajz);
                    } else {
                        viewFindViewById = null;
                    }
                    this.LLILZLL = (C0I7D) viewFindViewById;
                }
                MatchResult matchResultFind$default = Regex.find$default(regex, String.valueOf(C2204961BRm.LLLLJI((C0I7D) viewFindViewById, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga4DU2SSr/PBAhJPPX00vKQyv1DUBQeJPug5CFrA==", null))), 0, 2, null);
                if (matchResultFind$default != null && (value = matchResultFind$default.getValue()) != null) {
                    strReplace = new Regex("\\d+").replace(strReplace, value);
                }
            }
            C1397580mTM c1397580mTM = new C1397580mTM(requireContext());
            c1397580mTM.LJI(strReplace);
            List<PNSHyperlink> list = pNSDialogModel.hyperLinks;
            if (list != null) {
                charSequenceAS = aS(pNSDialogModel.message, list);
            } else {
                charSequenceAS = pNSDialogModel.message;
            }
            c1397580mTM.LIZIZ(charSequenceAS);
            c1397580mTM.LJII = pNSDialogModel.cancellable;
            Integer num3 = pNSDialogModel.style;
            int value2 = EnumC19298710en.ACTION.getValue();
            if (num3 != null && num3.intValue() == value2) {
                C985403tE.LIZ(c1397580mTM, new AwS45S0310000_28(pNSDialogModel, (PNSDialogModel) this, (AgeGateFragment) z, (boolean) function1, (Function1<? super Integer, Unit>) 3));
            } else {
                C1238130iKB.LIZ(c1397580mTM, new AwS45S0310000_28(pNSDialogModel, (PNSDialogModel) this, (AgeGateFragment) z, (boolean) function1, (Function1<? super Integer, Unit>) 4));
            }
            c1397580mTM.LJII = pNSDialogModel.cancellable;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", String.valueOf(num));
            C19298010eg.LJ("age_gate_popup_show", linkedHashMap, VR());
            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
            C1391850mK7.LIZIZ(c1397510mTF, "add_birthday_dialog");
            c1397510mTF.LIZLLL();
        }
        if (pNSFeedbackModel != null && (pNSErrorModel = pNSFeedbackModel.errorModel) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Integer num4 = pNSErrorModel.errorType;
            if (num4 != null) {
                num4.intValue();
                linkedHashMap2.put("type", String.valueOf(pNSFeedbackModel.f72case));
            }
            C19298010eg.LJ("age_gate_response_error_show", linkedHashMap2, VR());
            if (this.LL != -1) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("user_type", "edit");
                C19298010eg.LJ("age_gate_error", linkedHashMap3, C2097608Jq.LJ());
            }
            Integer num5 = pNSErrorModel.errorType;
            if (num5 != null) {
                int iIntValue = num5.intValue();
                EnumC19300510f5.Companion.getClass();
                int i = C19300010f0.LIZIZ[C19301110fB.LIZ(iIntValue).ordinal()];
                z2 = true;
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
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        WR().VR(pNSErrorModel.errorMessage, false);
                    }
                    z2 = true;
                } else {
                    WR().VR(pNSErrorModel.errorMessage, true);
                }
            } else {
                z2 = true;
            }
            if (pNSFeedbackModel.fromCalculateAPI == z2 && (pNSErrorModel2 = pNSFeedbackModel.errorModel) != null && (str = pNSErrorModel2.appealUrl) != null && C123100dR.LIZ(str) == z2) {
                PNSErrorModel pNSErrorModel3 = pNSFeedbackModel.errorModel;
                if (pNSErrorModel3 != null) {
                    str2 = pNSErrorModel3.appealUrl;
                    num2 = pNSErrorModel3.errorCode;
                } else {
                    str2 = null;
                }
                ZR(num2, str2);
            }
        }
    }

    public final C1251150ifB NR(int i, Function0 function0) {
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = i;
        c1251150ifB.LJI = true;
        c1251150ifB.LIZJ(new AwS572S0100000_28(function0, (Function0<Unit>) 1067));
        return c1251150ifB;
    }

    public final void ZR(Integer num, String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C123100dR.LIZ(str)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        linkedHashMap.put("verification_required", str2);
        if (num != null) {
            linkedHashMap.put("verification_reason", String.valueOf(num.intValue()));
        }
        C19298010eg.LJ("age_edit_confirm_click", linkedHashMap, VR());
    }

    public final SpannableStringBuilder aS(String str, List list) {
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
            C786410Ut5.q2(spannableStringBuilderValueOf, new C19331610k6(uRLSpan, this, 5), spannableStringBuilderValueOf.getSpanStart(uRLSpan), spannableStringBuilderValueOf.getSpanEnd(uRLSpan), 17);
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

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.ak3);
            } else {
                viewFindViewById = null;
            }
            this.LLILZIL = (LinearLayout) viewFindViewById;
        }
        int i = 1;
        if (TextUtils.getLayoutDirectionFromLocale(UR()) != 1) {
            i = 0;
        }
        viewFindViewById.setLayoutDirection(i);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZIZ(R.id.nsc, WR());
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dx7, viewGroup, false);
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
}
