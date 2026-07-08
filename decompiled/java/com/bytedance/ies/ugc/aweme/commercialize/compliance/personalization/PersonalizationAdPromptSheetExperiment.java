package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.C098200Yq;
import X.C0HTI;
import X.C0TOM;
import X.C1077060e8O;
import X.C127K;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C419910GdJ;
import X.C746100TOm;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
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
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class PersonalizationAdPromptSheetExperiment extends Fragment {
    public static TuxSheet LLJJIJIL = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6KSsvLGEjHELIOSLTc/JiEyJCw2KDs6JytiGSohOyoiKCM6MiQ4ICA9CSEcOyA+ODEfISo2PAA0OSohISgpJzs=";
    public ImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C127K LLILZIL;
    public TuxTextView LLILZLL;
    public C127K LLIZ;
    public TuxTextView LLIZLLLIL;
    public ImageView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public C127K LLJILJIL;
    public C127K LLJILJILJ;
    public C127K LLJILLL;
    public TuxTextView LLJJ;
    public C197039127h LLJJI;
    public C197039127h LLJJIII;
    public Activity LLJJIJI;
    public long LLJJIJIIJIL;

    public final void MR() {
        C0TOM.LIZ.getClass();
        C0TOM.LJIIJJI("1", true);
        TuxSheet tuxSheet = LLJJIJIL;
        if (tuxSheet == null) {
            tuxSheet = null;
        }
        tuxSheet.dismiss();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "click_position");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJJIJIIJIL, "stay_time");
        c2344009Gk.LJ(C0TOM.LJFF(), "style_name");
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        c2344009Gk.LJ(adPersonalitySettingsLIZIZ != null ? adPersonalitySettingsLIZIZ.contentType : null, "content_type");
        C20684815ws.LJIILLIIL("click_equally_balanced_pa_prompt", c2344009Gk.LIZ);
    }

    public final void NR() {
        C0TOM.LIZ.getClass();
        C0TOM.LJIIJJI("2", false);
        TuxSheet tuxSheet = LLJJIJIL;
        if (tuxSheet == null) {
            tuxSheet = null;
        }
        tuxSheet.dismiss();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, "click_position");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJJIJIIJIL, "stay_time");
        c2344009Gk.LJ(C0TOM.LJFF(), "style_name");
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        c2344009Gk.LJ(adPersonalitySettingsLIZIZ != null ? adPersonalitySettingsLIZIZ.contentType : null, "content_type");
        C20684815ws.LJIILLIIL("click_equally_balanced_pa_prompt", c2344009Gk.LIZ);
    }

    public final C197039127h OR() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sbg) : null;
            this.LLJJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView PR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sc0) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C127K RR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sc9) : null;
            this.LLILZIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K SR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sca) : null;
            this.LLIZ = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final TuxTextView UR() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sce) : null;
            this.LLJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C197039127h VR() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.scl) : null;
            this.LLJJIII = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C127K WR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sd3) : null;
            this.LLJILJIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K ZR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sd4) : null;
            this.LLJILJILJ = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K aS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sd5) : null;
            this.LLJILLL = (C127K) viewFindViewById;
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
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PopUpCopyWriting popUpCopyWriting;
        Integer num;
        String str;
        String learnMoreLink;
        String privacyPolicyLink;
        Integer num2;
        String privacyPolicyLink2;
        Integer num3;
        String learnMoreLink2;
        String privacyPolicyLink3;
        String learnMoreLink3;
        String privacyPolicyLink4;
        super.onViewCreated(view, bundle);
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null) {
            popUpCopyWriting = adPersonalitySettingsLIZIZ.abCopyWriting;
        } else {
            popUpCopyWriting = null;
        }
        AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ2 != null) {
            num = adPersonalitySettingsLIZIZ2.popUpStyle;
        } else {
            num = null;
        }
        String str2 = "";
        if (num != null) {
            if (num.intValue() == 8) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.o9;
                Activity activity = this.LLJJIJI;
                if (activity == null) {
                    activity = null;
                }
                Drawable drawableLIZ = c0hti.LIZ(activity);
                View viewFindViewById = this.LL;
                if (viewFindViewById == null) {
                    View view2 = getView();
                    if (view2 != null) {
                        viewFindViewById = view2.findViewById(R.id.sbw);
                    } else {
                        viewFindViewById = null;
                    }
                    this.LL = (ImageView) viewFindViewById;
                }
                ((ImageView) viewFindViewById).setImageDrawable(drawableLIZ);
                View viewFindViewById2 = this.LLILLJJLI;
                if (viewFindViewById2 == null) {
                    View view3 = getView();
                    if (view3 != null) {
                        viewFindViewById2 = view3.findViewById(R.id.sbx);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLILLJJLI = (TuxTextView) viewFindViewById2;
                }
                TextView textView = (TextView) viewFindViewById2;
                Activity activity2 = this.LLJJIJI;
                if (activity2 == null) {
                    activity2 = null;
                }
                textView.setText(activity2.getResources().getString(2131850445));
                Activity activity3 = this.LLJJIJI;
                if (activity3 == null) {
                    activity3 = null;
                }
                String string = activity3.getResources().getString(2131850447);
                Activity activity4 = this.LLJJIJI;
                if (activity4 == null) {
                    activity4 = null;
                }
                String string2 = activity4.getResources().getString(2131835635);
                Activity activity5 = this.LLJJIJI;
                if (activity5 == null) {
                    activity5 = null;
                }
                String string3 = activity5.getResources().getString(2131835636);
                View viewFindViewById3 = this.LLILLL;
                if (viewFindViewById3 == null) {
                    View view4 = getView();
                    if (view4 != null) {
                        viewFindViewById3 = view4.findViewById(R.id.sbv);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLILLL = (TuxTextView) viewFindViewById3;
                }
                TextView textView2 = (TextView) viewFindViewById3;
                C746100TOm c746100TOm = C746100TOm.LIZ;
                Activity activity6 = this.LLJJIJI;
                if (activity6 == null) {
                    activity6 = null;
                }
                List listLJIIJJI = C1697810uHb.LJIIJJI(string2, string3);
                String[] strArr = new String[2];
                if (popUpCopyWriting == null || (learnMoreLink3 = popUpCopyWriting.getLearnMoreLink()) == null) {
                    learnMoreLink3 = "";
                }
                strArr[0] = learnMoreLink3;
                if (popUpCopyWriting != null && (privacyPolicyLink4 = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                    str2 = privacyPolicyLink4;
                }
                strArr[1] = str2;
                List listLJIIJJI2 = C1697810uHb.LJIIJJI(strArr);
                c746100TOm.getClass();
                textView2.setText(C746100TOm.LIZ(activity6, string, listLJIIJJI, listLJIIJJI2));
                View viewFindViewById4 = this.LLILLL;
                if (viewFindViewById4 == null) {
                    View view5 = getView();
                    if (view5 != null) {
                        viewFindViewById4 = view5.findViewById(R.id.sbv);
                    } else {
                        viewFindViewById4 = null;
                    }
                    this.LLILLL = (TuxTextView) viewFindViewById4;
                }
                ((TextView) viewFindViewById4).setMovementMethod(LinkMovementMethod.getInstance());
                View viewFindViewById5 = this.LLILZ;
                if (viewFindViewById5 == null) {
                    View view6 = getView();
                    if (view6 != null) {
                        viewFindViewById5 = view6.findViewById(R.id.scd);
                    } else {
                        viewFindViewById5 = null;
                    }
                    this.LLILZ = (TuxTextView) viewFindViewById5;
                }
                TextView textView3 = (TextView) viewFindViewById5;
                Activity activity7 = this.LLJJIJI;
                if (activity7 == null) {
                    activity7 = null;
                }
                textView3.setText(activity7.getResources().getString(2131829532));
                View viewFindViewById6 = this.LLILZ;
                if (viewFindViewById6 == null) {
                    View view7 = getView();
                    if (view7 != null) {
                        viewFindViewById6 = view7.findViewById(R.id.scd);
                    } else {
                        viewFindViewById6 = null;
                    }
                    this.LLILZ = (TuxTextView) viewFindViewById6;
                }
                C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById6, 0);
                C786410Ut5.LLZLL(RR(), 0);
                C127K c127kRR = RR();
                Activity activity8 = this.LLJJIJI;
                if (activity8 == null) {
                    activity8 = null;
                }
                c127kRR.setTitle(activity8.getResources().getString(2131821352));
                RR().setWithSeparator(true);
                View viewFindViewById7 = this.LLILZLL;
                if (viewFindViewById7 == null) {
                    View view8 = getView();
                    if (view8 != null) {
                        viewFindViewById7 = view8.findViewById(R.id.sc_);
                    } else {
                        viewFindViewById7 = null;
                    }
                    this.LLILZLL = (TuxTextView) viewFindViewById7;
                }
                TextView textView4 = (TextView) viewFindViewById7;
                Activity activity9 = this.LLJJIJI;
                if (activity9 == null) {
                    activity9 = null;
                }
                textView4.setText(activity9.getResources().getString(2131821356));
                C1077060e8O c1077060e8O = (C1077060e8O) RR().getAccessory();
                Activity activity10 = this.LLJJIJI;
                if (activity10 == null) {
                    activity10 = null;
                }
                c1077060e8O.LJIILIIL(activity10.getResources().getString(2131821362));
                c1077060e8O.LJIIL(new ACListenerS147S0100000_12(this, 351));
                C786410Ut5.LLZLL(SR(), 0);
                C127K c127kSR = SR();
                Activity activity11 = this.LLJJIJI;
                if (activity11 == null) {
                    activity11 = null;
                }
                c127kSR.setTitle(activity11.getResources().getString(2131821357));
                SR().setWithSeparator(true);
                View viewFindViewById8 = this.LLIZLLLIL;
                if (viewFindViewById8 == null) {
                    View view9 = getView();
                    if (view9 != null) {
                        viewFindViewById8 = view9.findViewById(R.id.scb);
                    } else {
                        viewFindViewById8 = null;
                    }
                    this.LLIZLLLIL = (TuxTextView) viewFindViewById8;
                }
                TextView textView5 = (TextView) viewFindViewById8;
                Activity activity12 = this.LLJJIJI;
                if (activity12 == null) {
                    activity12 = null;
                }
                textView5.setText(activity12.getResources().getString(2131821361));
                C1077060e8O c1077060e8O2 = (C1077060e8O) SR().getAccessory();
                Activity activity13 = this.LLJJIJI;
                if (activity13 == null) {
                    activity13 = null;
                }
                c1077060e8O2.LJIILIIL(activity13.getResources().getString(2131821362));
                c1077060e8O2.LJIIL(new ACListenerS147S0100000_12(this, 353));
            } else if (num != null) {
                if (num.intValue() == 13) {
                    C0HTI c0hti2 = new C0HTI();
                    c0hti2.LIZ = R.drawable.wi;
                    Activity activity14 = this.LLJJIJI;
                    if (activity14 == null) {
                        activity14 = null;
                    }
                    Drawable drawableLIZ2 = c0hti2.LIZ(activity14);
                    View viewFindViewById9 = this.LLJ;
                    if (viewFindViewById9 == null) {
                        View view10 = getView();
                        if (view10 != null) {
                            viewFindViewById9 = view10.findViewById(R.id.sc1);
                        } else {
                            viewFindViewById9 = null;
                        }
                        this.LLJ = (ImageView) viewFindViewById9;
                    }
                    ((ImageView) viewFindViewById9).setImageDrawable(drawableLIZ2);
                    View viewFindViewById10 = this.LLJI;
                    if (viewFindViewById10 == null) {
                        View view11 = getView();
                        if (view11 != null) {
                            viewFindViewById10 = view11.findViewById(R.id.sc2);
                        } else {
                            viewFindViewById10 = null;
                        }
                        this.LLJI = (TuxTextView) viewFindViewById10;
                    }
                    TextView textView6 = (TextView) viewFindViewById10;
                    Activity activity15 = this.LLJJIJI;
                    if (activity15 == null) {
                        activity15 = null;
                    }
                    textView6.setText(activity15.getResources().getString(2131850445));
                    Activity activity16 = this.LLJJIJI;
                    if (activity16 == null) {
                        activity16 = null;
                    }
                    String string4 = activity16.getResources().getString(2131850448);
                    Activity activity17 = this.LLJJIJI;
                    if (activity17 == null) {
                        activity17 = null;
                    }
                    String string5 = activity17.getResources().getString(2131835635);
                    Activity activity18 = this.LLJJIJI;
                    if (activity18 == null) {
                        activity18 = null;
                    }
                    String string6 = activity18.getResources().getString(2131835636);
                    TuxTextView tuxTextViewPR = PR();
                    C746100TOm c746100TOm2 = C746100TOm.LIZ;
                    Activity activity19 = this.LLJJIJI;
                    if (activity19 == null) {
                        activity19 = null;
                    }
                    List listLJIIJJI3 = C1697810uHb.LJIIJJI(string5, string6);
                    String[] strArr2 = new String[2];
                    if (popUpCopyWriting == null || (learnMoreLink2 = popUpCopyWriting.getLearnMoreLink()) == null) {
                        learnMoreLink2 = "";
                    }
                    strArr2[0] = learnMoreLink2;
                    if (popUpCopyWriting != null && (privacyPolicyLink3 = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                        str2 = privacyPolicyLink3;
                    }
                    strArr2[1] = str2;
                    List listLJIIJJI4 = C1697810uHb.LJIIJJI(strArr2);
                    c746100TOm2.getClass();
                    tuxTextViewPR.setText(C746100TOm.LIZ(activity19, string4, listLJIIJJI3, listLJIIJJI4));
                    PR().setMovementMethod(LinkMovementMethod.getInstance());
                    C127K c127kWR = WR();
                    Activity activity20 = this.LLJJIJI;
                    if (activity20 == null) {
                        activity20 = null;
                    }
                    c127kWR.setTitle(activity20.getResources().getString(2131821557));
                    C127K c127kWR2 = WR();
                    Activity activity21 = this.LLJJIJI;
                    if (activity21 == null) {
                        activity21 = null;
                    }
                    c127kWR2.setSubtitle(activity21.getResources().getString(2131821556));
                    C786410Ut5.LLZLL(WR(), 0);
                    C127K c127kZR = ZR();
                    Activity activity22 = this.LLJJIJI;
                    if (activity22 == null) {
                        activity22 = null;
                    }
                    c127kZR.setTitle(activity22.getResources().getString(2131821562));
                    C127K c127kZR2 = ZR();
                    Activity activity23 = this.LLJJIJI;
                    if (activity23 == null) {
                        activity23 = null;
                    }
                    c127kZR2.setSubtitle(activity23.getResources().getString(2131821559));
                    C786410Ut5.LLZLL(ZR(), 0);
                    C786410Ut5.LLZLL(aS(), 8);
                    TuxTextView tuxTextViewUR = UR();
                    Activity activity24 = this.LLJJIJI;
                    if (activity24 == null) {
                        activity24 = null;
                    }
                    tuxTextViewUR.setText(activity24.getResources().getString(2131829532));
                    C786410Ut5.LLLLZLL(UR(), 0);
                    C197039127h c197039127hOR = OR();
                    Activity activity25 = this.LLJJIJI;
                    if (activity25 == null) {
                        activity25 = null;
                    }
                    c197039127hOR.setText(activity25.getResources().getString(2131821354));
                    C786410Ut5.LLLLLLJ(OR(), 0);
                    C786410Ut5.U8(OR(), new ACListenerS147S0100000_12(this, 355));
                    C197039127h c197039127hVR = VR();
                    Activity activity26 = this.LLJJIJI;
                    if (activity26 == null) {
                        activity26 = null;
                    }
                    c197039127hVR.setText(activity26.getResources().getString(2131821359));
                    C786410Ut5.LLLLLLJ(VR(), 0);
                    C786410Ut5.U8(VR(), new ACListenerS147S0100000_12(this, 356));
                } else if (num != null && (num.intValue() == 14 || num.intValue() == 15 || num.intValue() == 16 || num.intValue() == 17)) {
                    C0HTI c0hti3 = new C0HTI();
                    c0hti3.LIZ = R.drawable.xh;
                    Activity activity27 = this.LLJJIJI;
                    if (activity27 == null) {
                        activity27 = null;
                    }
                    Drawable drawableLIZ3 = c0hti3.LIZ(activity27);
                    View viewFindViewById11 = this.LLJ;
                    if (viewFindViewById11 == null) {
                        View view12 = getView();
                        if (view12 != null) {
                            viewFindViewById11 = view12.findViewById(R.id.sc1);
                        } else {
                            viewFindViewById11 = null;
                        }
                        this.LLJ = (ImageView) viewFindViewById11;
                    }
                    ((ImageView) viewFindViewById11).setImageDrawable(drawableLIZ3);
                    View viewFindViewById12 = this.LLJI;
                    if (viewFindViewById12 == null) {
                        View view13 = getView();
                        if (view13 != null) {
                            viewFindViewById12 = view13.findViewById(R.id.sc2);
                        } else {
                            viewFindViewById12 = null;
                        }
                        this.LLJI = (TuxTextView) viewFindViewById12;
                    }
                    TextView textView7 = (TextView) viewFindViewById12;
                    Activity activity28 = this.LLJJIJI;
                    if (activity28 == null) {
                        activity28 = null;
                    }
                    textView7.setText(activity28.getResources().getString(2131850446));
                    Activity activity29 = this.LLJJIJI;
                    if (activity29 == null) {
                        activity29 = null;
                    }
                    String string7 = activity29.getResources().getString(2131850449);
                    Activity activity30 = this.LLJJIJI;
                    if (activity30 == null) {
                        activity30 = null;
                    }
                    String string8 = activity30.getResources().getString(2131835635);
                    TuxTextView tuxTextViewPR2 = PR();
                    C746100TOm c746100TOm3 = C746100TOm.LIZ;
                    Activity activity31 = this.LLJJIJI;
                    if (activity31 == null) {
                        activity31 = null;
                    }
                    List listSingletonList = Collections.singletonList(string8);
                    if (popUpCopyWriting == null || (learnMoreLink = popUpCopyWriting.getLearnMoreLink()) == null) {
                        learnMoreLink = "";
                    }
                    List listSingletonList2 = Collections.singletonList(learnMoreLink);
                    c746100TOm3.getClass();
                    tuxTextViewPR2.setText(C746100TOm.LIZ(activity31, string7, listSingletonList, listSingletonList2));
                    PR().setMovementMethod(LinkMovementMethod.getInstance());
                    C127K c127kWR3 = WR();
                    Activity activity32 = this.LLJJIJI;
                    if (activity32 == null) {
                        activity32 = null;
                    }
                    c127kWR3.setTitle(activity32.getResources().getString(2131821558));
                    C127K c127kWR4 = WR();
                    Activity activity33 = this.LLJJIJI;
                    if (activity33 == null) {
                        activity33 = null;
                    }
                    c127kWR4.setSubtitle(activity33.getResources().getString(2131821556));
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_vertical_bars;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    WR().setIcon(c419910GdJ);
                    C786410Ut5.LLZLL(WR(), 0);
                    C127K c127kZR3 = ZR();
                    Activity activity34 = this.LLJJIJI;
                    if (activity34 == null) {
                        activity34 = null;
                    }
                    c127kZR3.setTitle(activity34.getResources().getString(2131821563));
                    AdPersonalitySettings adPersonalitySettingsLIZIZ3 = C0TOM.LIZIZ();
                    if (adPersonalitySettingsLIZIZ3 != null && (num3 = adPersonalitySettingsLIZIZ3.popUpStyle) != null && num3.intValue() == 17) {
                        C127K c127kZR4 = ZR();
                        Activity activity35 = this.LLJJIJI;
                        if (activity35 == null) {
                            activity35 = null;
                        }
                        c127kZR4.setSubtitle(activity35.getResources().getString(2131821561));
                    } else {
                        Activity activity36 = this.LLJJIJI;
                        if (activity36 == null) {
                            activity36 = null;
                        }
                        String string9 = activity36.getResources().getString(2131821560);
                        Activity activity37 = this.LLJJIJI;
                        if (activity37 == null) {
                            activity37 = null;
                        }
                        String string10 = activity37.getResources().getString(2131835636);
                        C127K c127kZR5 = ZR();
                        Activity activity38 = this.LLJJIJI;
                        if (activity38 == null) {
                            activity38 = null;
                        }
                        List listSingletonList3 = Collections.singletonList(string10);
                        if (popUpCopyWriting == null || (privacyPolicyLink = popUpCopyWriting.getPrivacyPolicyLink()) == null) {
                            privacyPolicyLink = "";
                        }
                        c127kZR5.setSubtitle(C746100TOm.LIZ(activity38, string9, listSingletonList3, Collections.singletonList(privacyPolicyLink)));
                    }
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_personalization_fill;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                    ZR().setIcon(c419910GdJ2);
                    C786410Ut5.LLZLL(ZR(), 0);
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    c419910GdJ3.LIZ = R.raw.icon_lock_large_fill;
                    c419910GdJ3.LJ = Integer.valueOf(R.attr.a1h);
                    aS().setIcon(c419910GdJ3);
                    AdPersonalitySettings adPersonalitySettingsLIZIZ4 = C0TOM.LIZIZ();
                    if (adPersonalitySettingsLIZIZ4 != null && (num2 = adPersonalitySettingsLIZIZ4.popUpStyle) != null) {
                        if (num2.intValue() == 14) {
                            C786410Ut5.LLZLL(aS(), 8);
                            TuxTextView tuxTextViewUR2 = UR();
                            Activity activity39 = this.LLJJIJI;
                            if (activity39 == null) {
                                activity39 = null;
                            }
                            tuxTextViewUR2.setText(activity39.getResources().getString(2131829532));
                            C786410Ut5.LLLLZLL(UR(), 0);
                        } else if (num2.intValue() == 15) {
                            C127K c127kAS = aS();
                            Activity activity40 = this.LLJJIJI;
                            if (activity40 == null) {
                                activity40 = null;
                            }
                            c127kAS.setTitle(activity40.getResources().getString(2131821566));
                            C786410Ut5.LLZLL(aS(), 0);
                            TuxTextView tuxTextViewUR3 = UR();
                            Activity activity41 = this.LLJJIJI;
                            if (activity41 == null) {
                                activity41 = null;
                            }
                            tuxTextViewUR3.setText(activity41.getResources().getString(2131829532));
                            C786410Ut5.LLLLZLL(UR(), 0);
                        } else if (num2.intValue() == 16) {
                            C127K c127kAS2 = aS();
                            Activity activity42 = this.LLJJIJI;
                            if (activity42 == null) {
                                activity42 = null;
                            }
                            c127kAS2.setTitle(activity42.getResources().getString(2131821567));
                            C127K c127kAS3 = aS();
                            Activity activity43 = this.LLJJIJI;
                            if (activity43 == null) {
                                activity43 = null;
                            }
                            c127kAS3.setSubtitle(activity43.getResources().getString(2131821564));
                            C786410Ut5.LLZLL(aS(), 0);
                            C786410Ut5.LLLLZLL(UR(), 8);
                        } else if (num2.intValue() == 17) {
                            C127K c127kAS4 = aS();
                            Activity activity44 = this.LLJJIJI;
                            if (activity44 == null) {
                                activity44 = null;
                            }
                            c127kAS4.setTitle(activity44.getResources().getString(2131821568));
                            Activity activity45 = this.LLJJIJI;
                            if (activity45 == null) {
                                activity45 = null;
                            }
                            String string11 = activity45.getResources().getString(2131821565);
                            Activity activity46 = this.LLJJIJI;
                            if (activity46 == null) {
                                activity46 = null;
                            }
                            String string12 = activity46.getResources().getString(2131835636);
                            C127K c127kAS5 = aS();
                            Activity activity47 = this.LLJJIJI;
                            if (activity47 == null) {
                                activity47 = null;
                            }
                            List listSingletonList4 = Collections.singletonList(string12);
                            if (popUpCopyWriting != null && (privacyPolicyLink2 = popUpCopyWriting.getPrivacyPolicyLink()) != null) {
                                str2 = privacyPolicyLink2;
                            }
                            c127kAS5.setSubtitle(C746100TOm.LIZ(activity47, string11, listSingletonList4, Collections.singletonList(str2)));
                            C786410Ut5.LLZLL(aS(), 0);
                            TuxTextView tuxTextViewUR4 = UR();
                            Activity activity48 = this.LLJJIJI;
                            if (activity48 == null) {
                                activity48 = null;
                            }
                            tuxTextViewUR4.setText(activity48.getResources().getString(2131829532));
                            C786410Ut5.LLLLZLL(UR(), 0);
                        }
                    }
                    C197039127h c197039127hOR2 = OR();
                    Activity activity49 = this.LLJJIJI;
                    if (activity49 == null) {
                        activity49 = null;
                    }
                    c197039127hOR2.setText(activity49.getResources().getString(2131821355));
                    C786410Ut5.LLLLLLJ(OR(), 0);
                    C786410Ut5.U8(OR(), new ACListenerS147S0100000_12(this, 357));
                    C197039127h c197039127hVR2 = VR();
                    Activity activity50 = this.LLJJIJI;
                    if (activity50 == null) {
                        activity50 = null;
                    }
                    c197039127hVR2.setText(activity50.getResources().getString(2131821360));
                    C786410Ut5.LLLLLLJ(VR(), 0);
                    C786410Ut5.U8(VR(), new ACListenerS147S0100000_12(this, 358));
                }
            }
        }
        this.LLJJIJIIJIL = System.currentTimeMillis();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (C0TOM.LJI() == 1) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        c2344009Gk.LJIIIIZZ("age_status", str);
        C20684815ws.LJIILLIIL("display_equally_balanced_pa_prompt", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View viewTd;
        Integer num;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null && (num = adPersonalitySettingsLIZIZ.popUpStyle) != null && num.intValue() == 8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.bda, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.bdb, viewGroup, false);
        }
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
