package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.AnonymousClass1278;
import X.C0OM1;
import X.C0TRW;
import X.C11GO;
import X.C1251150ifB;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C1308910kAL;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C785990UsP;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS216S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.datamodel.CustomizeYourExperienceStruct;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class CustomizeYourExperienceFragment extends BaseAdChoiceFragment {
    public static int LLJJIJIIJIL = -1;
    public static int LLJJIJIL = -1;
    public static boolean LLJJJ = false;
    public static boolean LLJJJIL = false;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSHELIOSM6KSsvLGEyLCYkJiYwLWsPPDwnJyglMyoKJzA+DDcjLTclLCEwLQM+KCg+LSs4";
    public C127K LLILZIL;
    public C127K LLILZLL;
    public C127K LLIZ;
    public C127K LLIZLLLIL;
    public C127K LLJ;
    public TuxNavBar LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public ConstraintLayout LLJILLL;
    public TuxTextView LLJJ;
    public C197039127h LLJJI;
    public CustomizeYourExperienceStruct LLJJIII;
    public long LLJJIJI;

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.BaseAdChoiceFragment
    public final int MR() {
        return R.layout.biw;
    }

    public final C127K PR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.aih) : null;
            this.LLIZLLLIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K RR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.aik) : null;
            this.LLIZ = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K SR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ail) : null;
            this.LLJ = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final ConstraintLayout UR() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hg_) : null;
            this.LLJILLL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final TuxTextView VR() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jok) : null;
            this.LLJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxNavBar WR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p15) : null;
            this.LLJI = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final C197039127h ZR() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p8k) : null;
            this.LLJJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C127K aS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.videos_generic_cell) : null;
            this.LLILZLL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final C127K bS() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.videos_personalize_cell) : null;
            this.LLILZIL = (C127K) viewFindViewById;
        }
        return (C127K) viewFindViewById;
    }

    public final void dS() {
        C11GO c11go;
        C11GO c11go2;
        C11GO c11go3;
        C127M accessory = bS().getAccessory();
        C11GO c11go4 = accessory instanceof AnonymousClass1278 ? (C11GO) accessory : null;
        boolean z = true;
        boolean z2 = c11go4 != null && c11go4.LJIILIIL();
        C127M accessory2 = aS().getAccessory();
        boolean z3 = (accessory2 instanceof AnonymousClass1278) && (c11go3 = (C11GO) accessory2) != null && c11go3.LJIILIIL();
        C127M accessory3 = RR().getAccessory();
        boolean z4 = (accessory3 instanceof AnonymousClass1278) && (c11go2 = (C11GO) accessory3) != null && c11go2.LJIILIIL();
        C127M accessory4 = PR().getAccessory();
        boolean z5 = (accessory4 instanceof AnonymousClass1278) && (c11go = (C11GO) accessory4) != null && c11go.LJIILIIL();
        MutableLiveData<Boolean> mutableLiveData = OR().LL;
        if ((!z3 && !z2) || (!z4 && !z5)) {
            z = false;
        }
        mutableLiveData.postValue(Boolean.valueOf(z));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i;
        C11GO c11go;
        C11GO c11go2;
        C11GO c11go3;
        C11GO c11go4;
        super.onDestroyView();
        C127M accessory = bS().getAccessory();
        C11GO c11go5 = accessory instanceof AnonymousClass1278 ? (C11GO) accessory : null;
        int i2 = -1;
        if (c11go5 != null && c11go5.LJIILIIL()) {
            i = 1;
        } else {
            C127M accessory2 = aS().getAccessory();
            i = ((accessory2 instanceof AnonymousClass1278) && (c11go = (C11GO) accessory2) != null && c11go.LJIILIIL()) ? 0 : -1;
        }
        LLJJIJIIJIL = i;
        C127M accessory3 = RR().getAccessory();
        if ((accessory3 instanceof AnonymousClass1278) && (c11go4 = (C11GO) accessory3) != null && c11go4.LJIILIIL()) {
            i2 = 1;
        } else {
            C127M accessory4 = PR().getAccessory();
            if ((accessory4 instanceof AnonymousClass1278) && (c11go2 = (C11GO) accessory4) != null && c11go2.LJIILIIL()) {
                i2 = 0;
            }
        }
        LLJJIJIL = i2;
        C127M accessory5 = SR().getAccessory();
        LLJJJ = (accessory5 instanceof C127A) && (c11go3 = (C11GO) accessory5) != null && c11go3.LJIILIIL();
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
    }

    public final void cS(boolean z) {
        C11GO c11go;
        int i;
        int i2;
        C11GO c11go2;
        C11GO c11go3;
        C11GO c11go4;
        C11GO c11go5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - this.LLJJIJI, "stay_time");
        C127M accessory = SR().getAccessory();
        if (accessory instanceof C127A) {
            c11go = (C11GO) accessory;
        } else {
            c11go = null;
        }
        int i3 = 0;
        if (c11go != null && c11go.LJIILIIL()) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "toggle_status");
        C127M accessory2 = bS().getAccessory();
        if ((accessory2 instanceof AnonymousClass1278) && (c11go5 = (C11GO) accessory2) != null && c11go5.LJIILIIL()) {
            i2 = 1;
        } else {
            C127M accessory3 = aS().getAccessory();
            if ((accessory3 instanceof AnonymousClass1278) && (c11go2 = (C11GO) accessory3) != null && c11go2.LJIILIIL()) {
                i2 = 0;
            } else {
                i2 = -1;
            }
        }
        c2344009Gk.LIZJ(i2, "video_status");
        C127M accessory4 = RR().getAccessory();
        if ((accessory4 instanceof AnonymousClass1278) && (c11go4 = (C11GO) accessory4) != null && c11go4.LJIILIIL()) {
            i3 = 1;
        } else {
            C127M accessory5 = PR().getAccessory();
            if (!(accessory5 instanceof AnonymousClass1278) || (c11go3 = (C11GO) accessory5) == null || !c11go3.LJIILIIL()) {
                i3 = -1;
            }
        }
        c2344009Gk.LIZJ(i3, "ad_status");
        c2344009Gk.LIZJ(!z ? 1 : 0, "is_back");
        C20684815ws.LJIILLIIL("exit_choose_your_experience_prompt", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CustomizeYourExperienceStruct customizeYourExperienceStruct;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        CustomizeYourExperienceStruct customizeYourExperienceStruct2;
        CustomizeYourExperienceStruct customizeYourExperienceStruct3;
        CustomizeYourExperienceStruct customizeYourExperienceStruct4;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        CustomizeYourExperienceStruct customizeYourExperienceStruct5 = null;
        if (arguments != null && (customizeYourExperienceStruct = (CustomizeYourExperienceStruct) arguments.getParcelable("customizeYourExperienceFragmentData")) != null) {
            this.LLJJIII = customizeYourExperienceStruct;
            this.LLJJIJI = SystemClock.elapsedRealtime();
            TuxNavBar tuxNavBarWR = WR();
            C0OM1 c0om1 = new C0OM1();
            boolean z5 = true;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS556S0100000_12(this, 31));
            c0om1.LJ(c1251150ifB);
            c0om1.LIZLLL = false;
            tuxNavBarWR.setNavActions(c0om1);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, WR().getContext());
            if (numLIZJ != null) {
                WR().setNavBackground(numLIZJ.intValue());
            }
            View viewFindViewById = this.LLJIJIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.jkv);
                } else {
                    viewFindViewById = null;
                }
                this.LLJIJIL = (TuxTextView) viewFindViewById;
            }
            TextView textView = (TextView) viewFindViewById;
            CustomizeYourExperienceStruct customizeYourExperienceStruct6 = this.LLJJIII;
            if (customizeYourExperienceStruct6 == null) {
                customizeYourExperienceStruct6 = null;
            }
            textView.setText(customizeYourExperienceStruct6.header_title);
            View viewFindViewById2 = this.LLJIJIL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.jkv);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJIJIL = (TuxTextView) viewFindViewById2;
            }
            ((TuxTextView) viewFindViewById2).LJJJJI(38.0f);
            View viewFindViewById3 = this.LLJILJIL;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.videos_title);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJILJIL = (TuxTextView) viewFindViewById3;
            }
            TextView textView2 = (TextView) viewFindViewById3;
            CustomizeYourExperienceStruct customizeYourExperienceStruct7 = this.LLJJIII;
            if (customizeYourExperienceStruct7 == null) {
                customizeYourExperienceStruct7 = null;
            }
            textView2.setText(customizeYourExperienceStruct7.video_experience_data.title);
            C127K c127kBS = bS();
            CustomizeYourExperienceStruct customizeYourExperienceStruct8 = this.LLJJIII;
            if (customizeYourExperienceStruct8 == null) {
                customizeYourExperienceStruct8 = null;
            }
            c127kBS.setTitle(customizeYourExperienceStruct8.video_experience_data.personalized_title);
            CustomizeYourExperienceStruct customizeYourExperienceStruct9 = this.LLJJIII;
            if (customizeYourExperienceStruct9 == null) {
                customizeYourExperienceStruct9 = null;
            }
            if (!TextUtils.isEmpty(customizeYourExperienceStruct9.video_experience_data.personalized_link_text)) {
                C127K c127kBS2 = bS();
                Context context = bS().getContext();
                CustomizeYourExperienceStruct customizeYourExperienceStruct10 = this.LLJJIII;
                if (customizeYourExperienceStruct10 == null) {
                    customizeYourExperienceStruct4 = null;
                } else {
                    customizeYourExperienceStruct4 = customizeYourExperienceStruct10;
                }
                String str = customizeYourExperienceStruct4.video_experience_data.personalized_link_text;
                if (customizeYourExperienceStruct10 == null) {
                    customizeYourExperienceStruct10 = null;
                }
                c127kBS2.setSubtitle(C0TRW.LIZIZ(context, str, customizeYourExperienceStruct10.video_experience_data.personalized_desc, new AwS556S0100000_12(this, 32)));
                ((TextView) bS().findViewById(R.id.wmy)).setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                C127K c127kBS3 = bS();
                CustomizeYourExperienceStruct customizeYourExperienceStruct11 = this.LLJJIII;
                if (customizeYourExperienceStruct11 == null) {
                    customizeYourExperienceStruct11 = null;
                }
                c127kBS3.setSubtitle(customizeYourExperienceStruct11.video_experience_data.personalized_desc);
            }
            C127K c127kBS4 = bS();
            AnonymousClass1278 anonymousClass1278 = new AnonymousClass1278(bS().getContext());
            if (LLJJIJIIJIL == 1) {
                z = true;
            } else {
                z = false;
            }
            anonymousClass1278.LJIILJJIL(z);
            anonymousClass1278.LJIILLIIL(new C785990UsP(this, 0));
            c127kBS4.setAccessory(anonymousClass1278);
            C127K c127kAS = aS();
            CustomizeYourExperienceStruct customizeYourExperienceStruct12 = this.LLJJIII;
            if (customizeYourExperienceStruct12 == null) {
                customizeYourExperienceStruct12 = null;
            }
            c127kAS.setTitle(customizeYourExperienceStruct12.video_experience_data.generic_title);
            C127K c127kAS2 = aS();
            CustomizeYourExperienceStruct customizeYourExperienceStruct13 = this.LLJJIII;
            if (customizeYourExperienceStruct13 == null) {
                customizeYourExperienceStruct13 = null;
            }
            c127kAS2.setSubtitle(customizeYourExperienceStruct13.video_experience_data.generic_desc);
            C127K c127kAS3 = aS();
            AnonymousClass1278 anonymousClass12782 = new AnonymousClass1278(aS().getContext());
            if (LLJJIJIIJIL == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            anonymousClass12782.LJIILJJIL(z2);
            anonymousClass12782.LJIILLIIL(new C785990UsP(this, 1));
            c127kAS3.setAccessory(anonymousClass12782);
            View viewFindViewById4 = this.LLJILJILJ;
            if (viewFindViewById4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById4 = view5.findViewById(R.id.aio);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJILJILJ = (TuxTextView) viewFindViewById4;
            }
            TextView textView3 = (TextView) viewFindViewById4;
            CustomizeYourExperienceStruct customizeYourExperienceStruct14 = this.LLJJIII;
            if (customizeYourExperienceStruct14 == null) {
                customizeYourExperienceStruct14 = null;
            }
            textView3.setText(customizeYourExperienceStruct14.ads_experience_data.title);
            C127K c127kRR = RR();
            CustomizeYourExperienceStruct customizeYourExperienceStruct15 = this.LLJJIII;
            if (customizeYourExperienceStruct15 == null) {
                customizeYourExperienceStruct15 = null;
            }
            c127kRR.setTitle(customizeYourExperienceStruct15.ads_experience_data.personalized_title);
            CustomizeYourExperienceStruct customizeYourExperienceStruct16 = this.LLJJIII;
            if (customizeYourExperienceStruct16 == null) {
                customizeYourExperienceStruct16 = null;
            }
            if (!TextUtils.isEmpty(customizeYourExperienceStruct16.ads_experience_data.personalized_link_text)) {
                C127K c127kRR2 = RR();
                Context context2 = RR().getContext();
                CustomizeYourExperienceStruct customizeYourExperienceStruct17 = this.LLJJIII;
                if (customizeYourExperienceStruct17 == null) {
                    customizeYourExperienceStruct3 = null;
                } else {
                    customizeYourExperienceStruct3 = customizeYourExperienceStruct17;
                }
                String str2 = customizeYourExperienceStruct3.ads_experience_data.personalized_link_text;
                if (customizeYourExperienceStruct17 == null) {
                    customizeYourExperienceStruct17 = null;
                }
                c127kRR2.setSubtitle(C0TRW.LIZIZ(context2, str2, customizeYourExperienceStruct17.ads_experience_data.personalized_desc, new AwS556S0100000_12(this, 33)));
                ((TextView) RR().findViewById(R.id.wmy)).setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                C127K c127kRR3 = RR();
                CustomizeYourExperienceStruct customizeYourExperienceStruct18 = this.LLJJIII;
                if (customizeYourExperienceStruct18 == null) {
                    customizeYourExperienceStruct18 = null;
                }
                c127kRR3.setSubtitle(customizeYourExperienceStruct18.ads_experience_data.personalized_desc);
            }
            C127K c127kRR4 = RR();
            AnonymousClass1278 anonymousClass12783 = new AnonymousClass1278(RR().getContext());
            if (LLJJIJIL == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            anonymousClass12783.LJIILJJIL(z3);
            anonymousClass12783.LJIILLIIL(new C785990UsP(this, 23));
            c127kRR4.setAccessory(anonymousClass12783);
            C127K c127kSR = SR();
            CustomizeYourExperienceStruct customizeYourExperienceStruct19 = this.LLJJIII;
            if (customizeYourExperienceStruct19 == null) {
                customizeYourExperienceStruct19 = null;
            }
            c127kSR.setTitle(customizeYourExperienceStruct19.ads_experience_data.personalized_off_tiktok_title);
            C127K c127kSR2 = SR();
            CustomizeYourExperienceStruct customizeYourExperienceStruct20 = this.LLJJIII;
            if (customizeYourExperienceStruct20 == null) {
                customizeYourExperienceStruct20 = null;
            }
            c127kSR2.setSubtitle(customizeYourExperienceStruct20.ads_experience_data.personalized_off_tiktok_desc);
            C127K c127kSR3 = SR();
            C127A c127a = new C127A(SR().getContext());
            c127a.LJIILJJIL(LLJJJ);
            c127kSR3.setAccessory(c127a);
            ConstraintLayout constraintLayoutUR = UR();
            if (LLJJJIL) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LL(i, constraintLayoutUR);
            C127K c127kSR4 = SR();
            if (LLJJIJIL == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            c127kSR4.setCellEnabled(z4);
            C127K c127kPR = PR();
            CustomizeYourExperienceStruct customizeYourExperienceStruct21 = this.LLJJIII;
            if (customizeYourExperienceStruct21 == null) {
                customizeYourExperienceStruct21 = null;
            }
            c127kPR.setTitle(customizeYourExperienceStruct21.ads_experience_data.generic_title);
            C127K c127kPR2 = PR();
            CustomizeYourExperienceStruct customizeYourExperienceStruct22 = this.LLJJIII;
            if (customizeYourExperienceStruct22 == null) {
                customizeYourExperienceStruct22 = null;
            }
            c127kPR2.setSubtitle(customizeYourExperienceStruct22.ads_experience_data.generic_desc);
            C127K c127kPR3 = PR();
            AnonymousClass1278 anonymousClass12784 = new AnonymousClass1278(PR().getContext());
            if (LLJJIJIL != 0) {
                z5 = false;
            }
            anonymousClass12784.LJIILJJIL(z5);
            anonymousClass12784.LJIILLIIL(new C785990UsP(this, 2));
            c127kPR3.setAccessory(anonymousClass12784);
            CustomizeYourExperienceStruct customizeYourExperienceStruct23 = this.LLJJIII;
            if (customizeYourExperienceStruct23 == null) {
                customizeYourExperienceStruct23 = null;
            }
            if (!TextUtils.isEmpty(customizeYourExperienceStruct23.learn_more_data.link_text)) {
                TuxTextView tuxTextViewVR = VR();
                Context context3 = VR().getContext();
                CustomizeYourExperienceStruct customizeYourExperienceStruct24 = this.LLJJIII;
                if (customizeYourExperienceStruct24 == null) {
                    customizeYourExperienceStruct2 = null;
                } else {
                    customizeYourExperienceStruct2 = customizeYourExperienceStruct24;
                }
                String str3 = customizeYourExperienceStruct2.learn_more_data.link_text;
                if (customizeYourExperienceStruct24 == null) {
                    customizeYourExperienceStruct24 = null;
                }
                tuxTextViewVR.setText(C0TRW.LIZIZ(context3, str3, customizeYourExperienceStruct24.learn_more_data.desc, new AwS556S0100000_12(this, 34)));
                VR().setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                TuxTextView tuxTextViewVR2 = VR();
                CustomizeYourExperienceStruct customizeYourExperienceStruct25 = this.LLJJIII;
                if (customizeYourExperienceStruct25 == null) {
                    customizeYourExperienceStruct25 = null;
                }
                tuxTextViewVR2.setText(customizeYourExperienceStruct25.learn_more_data.desc);
            }
            C197039127h c197039127hZR = ZR();
            CustomizeYourExperienceStruct customizeYourExperienceStruct26 = this.LLJJIII;
            if (customizeYourExperienceStruct26 != null) {
                customizeYourExperienceStruct5 = customizeYourExperienceStruct26;
            }
            c197039127hZR.setText(customizeYourExperienceStruct5.next_button_text);
            C786410Ut5.U8(ZR(), new ACListenerS147S0100000_12(this, 238));
            dS();
            OR().LL.observe(getViewLifecycleOwner(), new AObserverS216S0100000_12(this, 4));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
