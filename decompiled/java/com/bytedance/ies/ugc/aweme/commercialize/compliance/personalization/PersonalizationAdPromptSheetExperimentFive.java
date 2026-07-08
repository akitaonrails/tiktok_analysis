package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.C098200Yq;
import X.C0HTI;
import X.C0TOM;
import X.C127K;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C426750GoL;
import X.C746100TOm;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.C960203pA;
import Y.ACListenerS147S0100000_12;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.PopUpCopyWriting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PersonalizationAdPromptSheetExperimentFive extends Fragment {
    public static TuxSheet LLJJI = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6KSsvLGEjLTHELIOSc/JiEyJCw2KDs6JytiGSohOyoiKCM6MiQ4ICA9CSEcOyA+ODEfISo2PAA0OSohISgpJzsVITMp";
    public ConstraintLayout LL;
    public ConstraintLayout LLILLJJLI;
    public ImageView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public ImageView LLILZLL;
    public C127K LLIZ;
    public TuxTextView LLIZLLLIL;
    public ImageView LLJ;
    public C127K LLJI;
    public TuxTextView LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public Activity LLJILLL;
    public long LLJJ;

    public final void MR() {
        C0TOM.LIZ.getClass();
        C0TOM.LJIIJJI("1", true);
        TuxSheet tuxSheet = LLJJI;
        if (tuxSheet == null) {
            tuxSheet = null;
        }
        tuxSheet.dismiss();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "click_position");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJJ, "stay_time");
        C20684815ws.LJIILLIIL("click_pa_prompt_final", c2344009Gk.LIZ);
    }

    public final void NR() {
        C0TOM.LIZ.getClass();
        C0TOM.LJIIJJI("2", false);
        TuxSheet tuxSheet = LLJJI;
        if (tuxSheet == null) {
            tuxSheet = null;
        }
        tuxSheet.dismiss();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, "click_position");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJJ, "stay_time");
        C20684815ws.LJIILLIIL("click_pa_prompt_final", c2344009Gk.LIZ);
    }

    public final ImageView OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sbo) : null;
            this.LLILZLL = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final TuxTextView PR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sbq) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ConstraintLayout RR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sbr) : null;
            this.LL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final ImageView SR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sbs) : null;
            this.LLILLL = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final ConstraintLayout UR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sbt) : null;
            this.LLILLJJLI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final TuxTextView VR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sbu) : null;
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ImageView WR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sby) : null;
            this.LLJ = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final C127K ZR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sc4) : null;
            this.LLIZ = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K aS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sc7) : null;
            this.LLJI = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
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
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PopUpCopyWriting popUpCopyWriting;
        Integer num;
        String str;
        String learnMoreLink;
        Integer num2;
        Integer num3;
        String privacyPolicyLink;
        String learnMoreLink2;
        String privacyPolicyLink2;
        String learnMoreLink3;
        String privacyPolicyLink3;
        super.onViewCreated(view, bundle);
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null) {
            popUpCopyWriting = adPersonalitySettingsLIZIZ.abCopyWriting;
        } else {
            popUpCopyWriting = null;
        }
        Activity activity = this.LLJILLL;
        if (activity == null) {
            activity = null;
        }
        if (C960203pA.LIZIZ(activity)) {
            ConstraintLayout constraintLayoutRR = RR();
            Activity activity2 = this.LLJILLL;
            if (activity2 == null) {
                activity2 = null;
            }
            constraintLayoutRR.setBackground(C800330VaR.LIZIZ(activity2, R.drawable.d72));
            C426750GoL.LJIIIZ(RR(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, false, 26);
            RR().setPadding(0, 0, 0, 0);
            ConstraintLayout constraintLayoutUR = UR();
            Activity activity3 = this.LLJILLL;
            if (activity3 == null) {
                activity3 = null;
            }
            constraintLayoutUR.setBackground(C800330VaR.LIZIZ(activity3, R.drawable.d72));
            C426750GoL.LJIIIZ(UR(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, false, 24);
            UR().setPadding(0, 0, 0, 0);
        }
        AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ2 != null) {
            num = adPersonalitySettingsLIZIZ2.popUpStyle;
        } else {
            num = null;
        }
        String str2 = "";
        if (num != null) {
            if (num.intValue() != 9 && num.intValue() != 10) {
                if (num.intValue() == 11) {
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.nt;
                    Activity activity4 = this.LLJILLL;
                    if (activity4 == null) {
                        activity4 = null;
                    }
                    SR().setImageDrawable(c0hti.LIZ(activity4));
                    C786410Ut5.LJZI(0, SR());
                    TuxTextView tuxTextViewVR = VR();
                    Activity activity5 = this.LLJILLL;
                    if (activity5 == null) {
                        activity5 = null;
                    }
                    tuxTextViewVR.setText(activity5.getResources().getString(2131850445));
                    VR().setTuxFont(13);
                    VR().setGravity(17);
                    Activity activity6 = this.LLJILLL;
                    if (activity6 == null) {
                        activity6 = null;
                    }
                    String string = activity6.getResources().getString(2131850447);
                    Activity activity7 = this.LLJILLL;
                    if (activity7 == null) {
                        activity7 = null;
                    }
                    String string2 = activity7.getResources().getString(2131835635);
                    Activity activity8 = this.LLJILLL;
                    if (activity8 == null) {
                        activity8 = null;
                    }
                    String string3 = activity8.getResources().getString(2131835636);
                    TuxTextView tuxTextViewPR = PR();
                    C746100TOm c746100TOm = C746100TOm.LIZ;
                    Activity activity9 = this.LLJILLL;
                    if (activity9 == null) {
                        activity9 = null;
                    }
                    List listLJIIJJI = C1697810uHb.LJIIJJI(string2, string3);
                    String[] strArr = new String[2];
                    if (popUpCopyWriting == null || (learnMoreLink3 = popUpCopyWriting.getLearnMoreLink()) == null) {
                        learnMoreLink3 = "";
                    }
                    strArr[0] = learnMoreLink3;
                    if (popUpCopyWriting != null && (privacyPolicyLink3 = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                        str2 = privacyPolicyLink3;
                    }
                    strArr[1] = str2;
                    List listLJIIJJI2 = C1697810uHb.LJIIJJI(strArr);
                    c746100TOm.getClass();
                    tuxTextViewPR.setText(C746100TOm.LIZ(activity9, string, listLJIIJJI, listLJIIJJI2));
                    PR().setMovementMethod(LinkMovementMethod.getInstance());
                    PR().setGravity(17);
                    C786410Ut5.LJZI(8, OR());
                    C127K c127kZR = ZR();
                    Activity activity10 = this.LLJILLL;
                    if (activity10 == null) {
                        activity10 = null;
                    }
                    c127kZR.setTitle(activity10.getResources().getString(2131821353));
                    C127K c127kZR2 = ZR();
                    Activity activity11 = this.LLJILLL;
                    if (activity11 == null) {
                        activity11 = null;
                    }
                    c127kZR2.setSubtitle(activity11.getResources().getString(2131821356));
                    C786410Ut5.Y7(RR(), new ACListenerS147S0100000_12(this, 341));
                    ZR().setOnClickListener(new AwS591S0100000_12(this, 916));
                    C786410Ut5.LJZI(8, WR());
                    C127K c127kAS = aS();
                    Activity activity12 = this.LLJILLL;
                    if (activity12 == null) {
                        activity12 = null;
                    }
                    c127kAS.setTitle(activity12.getResources().getString(2131821358));
                    C127K c127kAS2 = aS();
                    Activity activity13 = this.LLJILLL;
                    if (activity13 == null) {
                        activity13 = null;
                    }
                    c127kAS2.setSubtitle(activity13.getResources().getString(2131821361));
                    C786410Ut5.Y7(UR(), new ACListenerS147S0100000_12(this, 346));
                    aS().setOnClickListener(new AwS591S0100000_12(this, 917));
                } else if (num.intValue() == 12) {
                    C0HTI c0hti2 = new C0HTI();
                    c0hti2.LIZ = R.drawable.a08;
                    Activity activity14 = this.LLJILLL;
                    if (activity14 == null) {
                        activity14 = null;
                    }
                    OR().setImageDrawable(c0hti2.LIZ(activity14));
                    C0HTI c0hti3 = new C0HTI();
                    c0hti3.LIZ = R.drawable.z4;
                    Activity activity15 = this.LLJILLL;
                    if (activity15 == null) {
                        activity15 = null;
                    }
                    WR().setImageDrawable(c0hti3.LIZ(activity15));
                    C786410Ut5.LJZI(8, SR());
                    TuxTextView tuxTextViewVR2 = VR();
                    Activity activity16 = this.LLJILLL;
                    if (activity16 == null) {
                        activity16 = null;
                    }
                    tuxTextViewVR2.setText(activity16.getResources().getString(2131850445));
                    VR().LJJJJI(32.0f);
                    Activity activity17 = this.LLJILLL;
                    if (activity17 == null) {
                        activity17 = null;
                    }
                    String string4 = activity17.getResources().getString(2131850447);
                    Activity activity18 = this.LLJILLL;
                    if (activity18 == null) {
                        activity18 = null;
                    }
                    String string5 = activity18.getResources().getString(2131835635);
                    Activity activity19 = this.LLJILLL;
                    if (activity19 == null) {
                        activity19 = null;
                    }
                    String string6 = activity19.getResources().getString(2131835636);
                    TuxTextView tuxTextViewPR2 = PR();
                    C746100TOm c746100TOm2 = C746100TOm.LIZ;
                    Activity activity20 = this.LLJILLL;
                    if (activity20 == null) {
                        activity20 = null;
                    }
                    List listLJIIJJI3 = C1697810uHb.LJIIJJI(string5, string6);
                    String[] strArr2 = new String[2];
                    if (popUpCopyWriting == null || (learnMoreLink2 = popUpCopyWriting.getLearnMoreLink()) == null) {
                        learnMoreLink2 = "";
                    }
                    strArr2[0] = learnMoreLink2;
                    if (popUpCopyWriting != null && (privacyPolicyLink2 = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                        str2 = privacyPolicyLink2;
                    }
                    strArr2[1] = str2;
                    List listLJIIJJI4 = C1697810uHb.LJIIJJI(strArr2);
                    c746100TOm2.getClass();
                    tuxTextViewPR2.setText(C746100TOm.LIZ(activity20, string4, listLJIIJJI3, listLJIIJJI4));
                    PR().setMovementMethod(LinkMovementMethod.getInstance());
                    C786410Ut5.LJZI(0, OR());
                    C127K c127kZR3 = ZR();
                    Activity activity21 = this.LLJILLL;
                    if (activity21 == null) {
                        activity21 = null;
                    }
                    c127kZR3.setTitle(activity21.getResources().getString(2131821353));
                    C127K c127kZR4 = ZR();
                    Activity activity22 = this.LLJILLL;
                    if (activity22 == null) {
                        activity22 = null;
                    }
                    c127kZR4.setSubtitle(activity22.getResources().getString(2131821356));
                    ZR().setWithSeparator(false);
                    View viewFindViewById = this.LLJILJIL;
                    if (viewFindViewById == null) {
                        View view2 = getView();
                        if (view2 != null) {
                            viewFindViewById = view2.findViewById(R.id.sc5);
                        } else {
                            viewFindViewById = null;
                        }
                        this.LLJILJIL = viewFindViewById;
                    }
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    C786410Ut5.Y7(RR(), new ACListenerS147S0100000_12(this, 359));
                    ZR().setOnClickListener(new AwS591S0100000_12(this, 918));
                    C786410Ut5.LJZI(0, WR());
                    C127K c127kAS3 = aS();
                    Activity activity23 = this.LLJILLL;
                    if (activity23 == null) {
                        activity23 = null;
                    }
                    c127kAS3.setTitle(activity23.getResources().getString(2131821358));
                    C127K c127kAS4 = aS();
                    Activity activity24 = this.LLJILLL;
                    if (activity24 == null) {
                        activity24 = null;
                    }
                    c127kAS4.setSubtitle(activity24.getResources().getString(2131821361));
                    ZR().setWithSeparator(false);
                    View viewFindViewById2 = this.LLJILJILJ;
                    if (viewFindViewById2 == null) {
                        View view3 = getView();
                        if (view3 != null) {
                            viewFindViewById2 = view3.findViewById(R.id.sc8);
                        } else {
                            viewFindViewById2 = null;
                        }
                        this.LLJILJILJ = viewFindViewById2;
                    }
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                    C786410Ut5.Y7(UR(), new ACListenerS147S0100000_12(this, 360));
                    aS().setOnClickListener(new AwS591S0100000_12(this, 919));
                }
            } else {
                C786410Ut5.LJZI(8, SR());
                TuxTextView tuxTextViewVR3 = VR();
                Activity activity25 = this.LLJILLL;
                if (activity25 == null) {
                    activity25 = null;
                }
                tuxTextViewVR3.setText(activity25.getResources().getString(2131850445));
                VR().LJJJJI(32.0f);
                Activity activity26 = this.LLJILLL;
                if (activity26 == null) {
                    activity26 = null;
                }
                String string7 = activity26.getResources().getString(2131850447);
                Activity activity27 = this.LLJILLL;
                if (activity27 == null) {
                    activity27 = null;
                }
                String string8 = activity27.getResources().getString(2131835635);
                Activity activity28 = this.LLJILLL;
                if (activity28 == null) {
                    activity28 = null;
                }
                String string9 = activity28.getResources().getString(2131835636);
                TuxTextView tuxTextViewPR3 = PR();
                C746100TOm c746100TOm3 = C746100TOm.LIZ;
                Activity activity29 = this.LLJILLL;
                if (activity29 == null) {
                    activity29 = null;
                }
                List listLJIIJJI5 = C1697810uHb.LJIIJJI(string8, string9);
                String[] strArr3 = new String[2];
                if (popUpCopyWriting == null || (learnMoreLink = popUpCopyWriting.getLearnMoreLink()) == null) {
                    learnMoreLink = "";
                }
                strArr3[0] = learnMoreLink;
                if (popUpCopyWriting != null && (privacyPolicyLink = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                    str2 = privacyPolicyLink;
                }
                strArr3[1] = str2;
                List listLJIIJJI6 = C1697810uHb.LJIIJJI(strArr3);
                c746100TOm3.getClass();
                tuxTextViewPR3.setText(C746100TOm.LIZ(activity29, string7, listLJIIJJI5, listLJIIJJI6));
                PR().setMovementMethod(LinkMovementMethod.getInstance());
                C786410Ut5.LJZI(8, OR());
                C127K c127kZR5 = ZR();
                Activity activity30 = this.LLJILLL;
                if (activity30 == null) {
                    activity30 = null;
                }
                c127kZR5.setTitle(activity30.getResources().getString(2131821353));
                C127K c127kZR6 = ZR();
                Activity activity31 = this.LLJILLL;
                if (activity31 == null) {
                    activity31 = null;
                }
                c127kZR6.setSubtitle(activity31.getResources().getString(2131821356));
                AdPersonalitySettings adPersonalitySettingsLIZIZ3 = C0TOM.LIZIZ();
                if (adPersonalitySettingsLIZIZ3 != null && (num3 = adPersonalitySettingsLIZIZ3.popUpStyle) != null && num3.intValue() == 9) {
                    View viewFindViewById3 = this.LLIZLLLIL;
                    if (viewFindViewById3 == null) {
                        View view4 = getView();
                        if (view4 != null) {
                            viewFindViewById3 = view4.findViewById(R.id.sc3);
                        } else {
                            viewFindViewById3 = null;
                        }
                        this.LLIZLLLIL = (TuxTextView) viewFindViewById3;
                    }
                    C786410Ut5.h9((TuxTextView) viewFindViewById3, new ACListenerS147S0100000_12(this, 361));
                } else {
                    C786410Ut5.Y7(RR(), new ACListenerS147S0100000_12(this, 362));
                    ZR().setOnClickListener(new AwS591S0100000_12(this, 910));
                }
                C786410Ut5.LJZI(8, WR());
                C127K c127kAS5 = aS();
                Activity activity32 = this.LLJILLL;
                if (activity32 == null) {
                    activity32 = null;
                }
                c127kAS5.setTitle(activity32.getResources().getString(2131821358));
                C127K c127kAS6 = aS();
                Activity activity33 = this.LLJILLL;
                if (activity33 == null) {
                    activity33 = null;
                }
                c127kAS6.setSubtitle(activity33.getResources().getString(2131821361));
                AdPersonalitySettings adPersonalitySettingsLIZIZ4 = C0TOM.LIZIZ();
                if (adPersonalitySettingsLIZIZ4 != null && (num2 = adPersonalitySettingsLIZIZ4.popUpStyle) != null && num2.intValue() == 9) {
                    View viewFindViewById4 = this.LLJIJIL;
                    if (viewFindViewById4 == null) {
                        View view5 = getView();
                        if (view5 != null) {
                            viewFindViewById4 = view5.findViewById(R.id.sc6);
                        } else {
                            viewFindViewById4 = null;
                        }
                        this.LLJIJIL = (TuxTextView) viewFindViewById4;
                    }
                    C786410Ut5.h9((TuxTextView) viewFindViewById4, new ACListenerS147S0100000_12(this, 338));
                } else {
                    C786410Ut5.Y7(UR(), new ACListenerS147S0100000_12(this, 339));
                    aS().setOnClickListener(new AwS591S0100000_12(this, 915));
                }
            }
        }
        this.LLJJ = System.currentTimeMillis();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (C0TOM.LJI() == 1) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        c2344009Gk.LJIIIIZZ("age_status", str);
        C20684815ws.LJIILLIIL("display_pa_prompt_final", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bd_, viewGroup, false);
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
