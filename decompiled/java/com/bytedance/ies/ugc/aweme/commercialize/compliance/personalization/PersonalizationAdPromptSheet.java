package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.C098200Yq;
import X.C0HTI;
import X.C0TOM;
import X.C1077060e8O;
import X.C11GO;
import X.C127K;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C746100TOm;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS216S0100000_12;
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
import androidx.lifecycle.MutableLiveData;
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
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PersonalizationAdPromptSheet extends Fragment {
    public static TuxSheet LLJJI = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6KSHELIOSsvLGEjLTc/JiEyJCw2KDs6JytiGSohOyoiKCM6MiQ4ICA9CSEcOyA+ODEfISo2PA==";
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;
    public C197039127h LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public C127K LLIZ;
    public C127K LLIZLLLIL;
    public C197039127h LLJ;
    public ImageView LLJI;
    public C127K LLJIJIL;
    public C127K LLJILJIL;
    public Activity LLJILJILJ;
    public long LLJILLL;
    public final MutableLiveData<Integer> LLJJ = new MutableLiveData<>();

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
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJILLL, "stay_time");
        c2344009Gk.LJ(C0TOM.LJFF(), "style_name");
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        c2344009Gk.LJ(adPersonalitySettingsLIZIZ != null ? adPersonalitySettingsLIZIZ.contentType : null, "content_type");
        C20684815ws.LJIILLIIL("click_equally_balanced_pa_prompt", c2344009Gk.LIZ);
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
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJILLL, "stay_time");
        c2344009Gk.LJ(C0TOM.LJFF(), "style_name");
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        c2344009Gk.LJ(adPersonalitySettingsLIZIZ != null ? adPersonalitySettingsLIZIZ.contentType : null, "content_type");
        C20684815ws.LJIILLIIL("click_equally_balanced_pa_prompt", c2344009Gk.LIZ);
    }

    public final C127K OR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sbh) : null;
            this.LLJIJIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K PR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sbi) : null;
            this.LLIZ = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final TuxTextView RR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sbm) : null;
            this.LLILZLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C127K SR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.scm) : null;
            this.LLJILJIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K UR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.scn) : null;
            this.LLIZLLLIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C197039127h VR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sd0) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
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
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PopUpCopyWriting popUpCopyWriting;
        Integer num;
        String str;
        super.onViewCreated(view, bundle);
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        Activity activity = null;
        TuxSheet tuxSheet = null;
        View viewFindViewById = null;
        Activity activity2 = null;
        if (adPersonalitySettingsLIZIZ != null) {
            popUpCopyWriting = adPersonalitySettingsLIZIZ.abCopyWriting;
        } else {
            popUpCopyWriting = null;
        }
        if (popUpCopyWriting == null) {
            TuxSheet tuxSheet2 = LLJJI;
            if (tuxSheet2 != null) {
                tuxSheet = tuxSheet2;
            }
            tuxSheet.dismiss();
        } else {
            AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
            if (adPersonalitySettingsLIZIZ2 != null && (num = adPersonalitySettingsLIZIZ2.popUpStyle) != null) {
                if (num.intValue() == 4) {
                    View viewFindViewById2 = this.LL;
                    if (viewFindViewById2 == null) {
                        View view2 = getView();
                        if (view2 != null) {
                            viewFindViewById2 = view2.findViewById(R.id.sd7);
                        } else {
                            viewFindViewById2 = null;
                        }
                        this.LL = (TuxTextView) viewFindViewById2;
                    }
                    ((TextView) viewFindViewById2).setText(popUpCopyWriting.getTitle());
                    View viewFindViewById3 = this.LLILLJJLI;
                    if (viewFindViewById3 == null) {
                        View view3 = getView();
                        if (view3 != null) {
                            viewFindViewById3 = view3.findViewById(R.id.sbl);
                        } else {
                            viewFindViewById3 = null;
                        }
                        this.LLILLJJLI = (TuxTextView) viewFindViewById3;
                    }
                    TextView textView = (TextView) viewFindViewById3;
                    C746100TOm c746100TOm = C746100TOm.LIZ;
                    Activity activity3 = this.LLJILJILJ;
                    if (activity3 == null) {
                        activity3 = null;
                    }
                    String description = popUpCopyWriting.getDescription();
                    List<String> policyList = popUpCopyWriting.getPolicyList();
                    List<String> policyLinkList = popUpCopyWriting.getPolicyLinkList();
                    c746100TOm.getClass();
                    textView.setText(C746100TOm.LIZ(activity3, description, policyList, policyLinkList));
                    View viewFindViewById4 = this.LLILLJJLI;
                    if (viewFindViewById4 == null) {
                        View view4 = getView();
                        if (view4 != null) {
                            viewFindViewById4 = view4.findViewById(R.id.sbl);
                        } else {
                            viewFindViewById4 = null;
                        }
                        this.LLILLJJLI = (TuxTextView) viewFindViewById4;
                    }
                    ((TextView) viewFindViewById4).setMovementMethod(LinkMovementMethod.getInstance());
                    View viewFindViewById5 = this.LLILLL;
                    if (viewFindViewById5 == null) {
                        View view5 = getView();
                        if (view5 != null) {
                            viewFindViewById5 = view5.findViewById(R.id.sck);
                        } else {
                            viewFindViewById5 = null;
                        }
                        this.LLILLL = (C197039127h) viewFindViewById5;
                    }
                    ((TextView) viewFindViewById5).setText(popUpCopyWriting.getCheck());
                    View viewFindViewById6 = this.LLILZ;
                    if (viewFindViewById6 == null) {
                        View view6 = getView();
                        if (view6 != null) {
                            viewFindViewById6 = view6.findViewById(R.id.sbf);
                        } else {
                            viewFindViewById6 = null;
                        }
                        this.LLILZ = (C197039127h) viewFindViewById6;
                    }
                    ((TextView) viewFindViewById6).setText(popUpCopyWriting.getConfirm());
                    View viewFindViewById7 = this.LLILLL;
                    if (viewFindViewById7 == null) {
                        View view7 = getView();
                        if (view7 != null) {
                            viewFindViewById7 = view7.findViewById(R.id.sck);
                        } else {
                            viewFindViewById7 = null;
                        }
                        this.LLILLL = (C197039127h) viewFindViewById7;
                    }
                    C786410Ut5.U8((C197039127h) viewFindViewById7, new ACListenerS147S0100000_12(this, 343));
                    View view8 = this.LLILZ;
                    if (view8 == null) {
                        View view9 = getView();
                        if (view9 != null) {
                            viewFindViewById = view9.findViewById(R.id.sbf);
                        }
                        this.LLILZ = (C197039127h) viewFindViewById;
                        view8 = viewFindViewById;
                    }
                    C786410Ut5.U8((C197039127h) view8, new ACListenerS147S0100000_12(this, 345));
                } else if (num != null) {
                    if (num.intValue() != 5 && num.intValue() != 6) {
                        if (num.intValue() == 7) {
                            C0HTI c0hti = new C0HTI();
                            c0hti.LIZ = R.drawable.pt;
                            Activity activity4 = this.LLJILJILJ;
                            if (activity4 == null) {
                                activity4 = null;
                            }
                            Drawable drawableLIZ = c0hti.LIZ(activity4);
                            View viewFindViewById8 = this.LLJI;
                            if (viewFindViewById8 == null) {
                                View view10 = getView();
                                if (view10 != null) {
                                    viewFindViewById8 = view10.findViewById(R.id.scg);
                                } else {
                                    viewFindViewById8 = null;
                                }
                                this.LLJI = (ImageView) viewFindViewById8;
                            }
                            ((ImageView) viewFindViewById8).setImageDrawable(drawableLIZ);
                            View viewFindViewById9 = this.LLILZIL;
                            if (viewFindViewById9 == null) {
                                View view11 = getView();
                                if (view11 != null) {
                                    viewFindViewById9 = view11.findViewById(R.id.sd8);
                                } else {
                                    viewFindViewById9 = null;
                                }
                                this.LLILZIL = (TuxTextView) viewFindViewById9;
                            }
                            ((TextView) viewFindViewById9).setText(popUpCopyWriting.getTitle());
                            TuxTextView tuxTextViewRR = RR();
                            C746100TOm c746100TOm2 = C746100TOm.LIZ;
                            Activity activity5 = this.LLJILJILJ;
                            if (activity5 == null) {
                                activity5 = null;
                            }
                            String description2 = popUpCopyWriting.getDescription();
                            List<String> policyList2 = popUpCopyWriting.getPolicyList();
                            List<String> policyLinkList2 = popUpCopyWriting.getPolicyLinkList();
                            c746100TOm2.getClass();
                            tuxTextViewRR.setText(C746100TOm.LIZ(activity5, description2, policyList2, policyLinkList2));
                            RR().setMovementMethod(LinkMovementMethod.getInstance());
                            C786410Ut5.LLZLL(OR(), 0);
                            OR().setTitle(popUpCopyWriting.getConfirm());
                            C127K c127kOR = OR();
                            Activity activity6 = this.LLJILJILJ;
                            if (activity6 == null) {
                                activity6 = null;
                            }
                            c127kOR.setSubtitle(C746100TOm.LIZ(activity6, popUpCopyWriting.getConfirmDesc(), popUpCopyWriting.getConfirmPolicyList(), popUpCopyWriting.getConfirmPolicyLinkList()));
                            OR().setWithSeparator(true);
                            C1077060e8O c1077060e8O = (C1077060e8O) OR().getAccessory();
                            c1077060e8O.LJIILIIL(popUpCopyWriting.getConfirmSelectText());
                            c1077060e8O.LJIIL(new ACListenerS147S0100000_12(this, 349));
                            C786410Ut5.LLZLL(SR(), 0);
                            SR().setTitle(popUpCopyWriting.getCheck());
                            C127K c127kSR = SR();
                            Activity activity7 = this.LLJILJILJ;
                            if (activity7 != null) {
                                activity2 = activity7;
                            }
                            c127kSR.setSubtitle(C746100TOm.LIZ(activity2, popUpCopyWriting.getCheckDesc(), popUpCopyWriting.getCheckPolicyList(), popUpCopyWriting.getCheckPolicyLinkList()));
                            C1077060e8O c1077060e8O2 = (C1077060e8O) SR().getAccessory();
                            c1077060e8O2.LJIILIIL(popUpCopyWriting.getCheckSelectText());
                            c1077060e8O2.LJIIL(new ACListenerS147S0100000_12(this, 350));
                        }
                    } else {
                        View viewFindViewById10 = this.LLILZIL;
                        if (viewFindViewById10 == null) {
                            View view12 = getView();
                            if (view12 != null) {
                                viewFindViewById10 = view12.findViewById(R.id.sd8);
                            } else {
                                viewFindViewById10 = null;
                            }
                            this.LLILZIL = (TuxTextView) viewFindViewById10;
                        }
                        ((TextView) viewFindViewById10).setText(popUpCopyWriting.getTitle());
                        TuxTextView tuxTextViewRR2 = RR();
                        C746100TOm c746100TOm3 = C746100TOm.LIZ;
                        Activity activity8 = this.LLJILJILJ;
                        if (activity8 == null) {
                            activity8 = null;
                        }
                        String description3 = popUpCopyWriting.getDescription();
                        List<String> policyList3 = popUpCopyWriting.getPolicyList();
                        List<String> policyLinkList3 = popUpCopyWriting.getPolicyLinkList();
                        c746100TOm3.getClass();
                        tuxTextViewRR2.setText(C746100TOm.LIZ(activity8, description3, policyList3, policyLinkList3));
                        RR().setMovementMethod(LinkMovementMethod.getInstance());
                        C786410Ut5.LLZLL(PR(), 0);
                        PR().setTitle(popUpCopyWriting.getConfirm());
                        C127K c127kPR = PR();
                        Activity activity9 = this.LLJILJILJ;
                        if (activity9 == null) {
                            activity9 = null;
                        }
                        c127kPR.setSubtitle(C746100TOm.LIZ(activity9, popUpCopyWriting.getConfirmDesc(), popUpCopyWriting.getConfirmPolicyList(), popUpCopyWriting.getConfirmPolicyLinkList()));
                        PR().setWithSeparator(true);
                        ((C11GO) PR().getAccessory()).LJIILL(new AwS556S0100000_12(this, 805));
                        C786410Ut5.LLZLL(UR(), 0);
                        UR().setTitle(popUpCopyWriting.getCheck());
                        C127K c127kUR = UR();
                        Activity activity10 = this.LLJILJILJ;
                        if (activity10 != null) {
                            activity = activity10;
                        }
                        c127kUR.setSubtitle(C746100TOm.LIZ(activity, popUpCopyWriting.getCheckDesc(), popUpCopyWriting.getCheckPolicyList(), popUpCopyWriting.getCheckPolicyLinkList()));
                        UR().setWithSeparator(true);
                        ((C11GO) UR().getAccessory()).LJIILL(new AwS556S0100000_12(this, 807));
                        C786410Ut5.LLLLLLJ(VR(), 0);
                        VR().setText(popUpCopyWriting.getSubmitButtonText());
                        this.LLJJ.observe(this, new AObserverS216S0100000_12(this, 79));
                        C786410Ut5.U8(VR(), new ACListenerS147S0100000_12(this, 348));
                    }
                }
            }
        }
        this.LLJILLL = System.currentTimeMillis();
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
        if (adPersonalitySettingsLIZIZ != null && (num = adPersonalitySettingsLIZIZ.popUpStyle) != null && num.intValue() == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.bd8, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.bd9, viewGroup, false);
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
