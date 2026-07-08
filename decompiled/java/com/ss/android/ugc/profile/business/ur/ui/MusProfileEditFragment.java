package com.ss.android.ugc.profile.business.ur.ui;

import X.AbstractC480470Isn;
import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C01GW;
import X.C03IT;
import X.C089E;
import X.C0HFL;
import X.C0HWW;
import X.C0HXX;
import X.C0HYP;
import X.C0HZQ;
import X.C0PEM;
import X.C0S1B;
import X.C0XGR;
import X.C0XIR;
import X.C0XQ7;
import X.C1067920dte;
import X.C11NJ;
import X.C1215720hk2;
import X.C1216160hkk;
import X.C1220000hqw;
import X.C1221880hty;
import X.C1222200huU;
import X.C1233040iBy;
import X.C1245090iVP;
import X.C1245110iVR;
import X.C1245160iVW;
import X.C1251390ifZ;
import X.C1252550ihR;
import X.C1253930ijf;
import X.C1254890ilD;
import X.C1256140inE;
import X.C127K;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1354920lMY;
import X.C1385040m98;
import X.C1392105cd;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13LE;
import X.C1644806cI;
import X.C19328310jZ;
import X.C19EG;
import X.C1DFH;
import X.C1EDI;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23112093u;
import X.C23250099c;
import X.C2344009Gk;
import X.C290040BYk;
import X.C338520DOw;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C427870Gq9;
import X.C437560HDu;
import X.C442910HYj;
import X.C442950HYn;
import X.C442960HYo;
import X.C442970HYp;
import X.C444920HcY;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C810650Vr5;
import X.C814420VxA;
import X.C815520Vyw;
import X.C844470XAv;
import X.DialogC1389620mGW;
import X.EnumC437540HDs;
import X.InterfaceC427710Gpt;
import X.InterfaceC438160HGc;
import Y.ACListenerS154S0100000_19;
import Y.AObserverS210S0100000_6;
import Y.ARunnableS27S0400000_19;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileSyncSharedViewModel;
import com.ss.android.ugc.profile.business.ur.ui.SocialAvatarBottomSheetActionFragment;
import com.ss.android.ugc.profile.business.ur.utils.SocialAvatarUserInfoCache;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class MusProfileEditFragment extends ProfileEditFragment implements InterfaceC427710Gpt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspHELIOSOjx9PTdiPCZ9BTA/GT08LiwgLAo3ITEKOy40JSAiPQ==";
    public TuxTextView LLLLZLLIL;
    public ViewGroup LLLLZLLLI;
    public ConstraintLayout LLLZ;
    public TuxIconView LLLZIIL;
    public C427870Gq9 LLLZIL;
    public boolean LLLZLL;
    public View LLLZZIL;
    public TuxSheet LLZ;
    public View LLZILL;
    public View LLZL;
    public View LLZLI;
    public View LLZLL;
    public ViewPager LLZLLIL;
    public int LLZZLLIL;
    public int LLZZZIL;
    public boolean LLZZZZ;
    public DialogC1389620mGW l;
    public boolean n;
    public final C736950SvV u;
    public final C01GW LLLZI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2440));
    public boolean LLLZL = true;
    public final C11NJ LLLZLZ = new C11NJ();
    public final C01GW LLLZZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(388));
    public boolean LLZIL = true;
    public final C01GW LLZLLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(389));
    public final C01GW LLZZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(390));
    public final C01GW LLZZJLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(523));
    public final AObserverS210S0100000_6 m = new AObserverS210S0100000_6(this, 34);
    public boolean o = true;
    public final C01GW p = C452501pT.LIZIZ(new AwS550S0100000_6(this, 964));
    public final C01GW q = C452501pT.LIZIZ(new AwS550S0100000_6(this, 967));
    public final C01GW r = C452501pT.LIZIZ(new AwS550S0100000_6(this, 961));
    public final C01GW s = C452501pT.LIZIZ(new AwS550S0100000_6(this, 962));
    public final C01GW t = C452501pT.LIZIZ(new AwS550S0100000_6(this, 963));

    public final User AT() {
        return (User) this.LLLZZ.getValue();
    }

    public final ISocialAvatarService CT() {
        return (ISocialAvatarService) this.LLZZ.getValue();
    }

    public final void ET() {
        RelativeLayout.LayoutParams layoutParams;
        int i = C2187451AjH.LIZ;
        View view = this.LLZL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLZLL;
        RelativeLayout.LayoutParams layoutParams2 = null;
        ViewGroup.LayoutParams layoutParams3 = view2 != null ? view2.getLayoutParams() : null;
        if ((layoutParams3 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams3) != null) {
            layoutParams.addRule(3, R.id.s75);
            layoutParams2 = layoutParams;
        }
        View view3 = this.LLZLL;
        if (view3 != null) {
            C786410Ut5.W5(view3, layoutParams2);
        }
    }

    public final void FT() {
        RelativeLayout.LayoutParams layoutParams;
        int i = C2187451AjH.LIZ;
        View view = this.LLZILL;
        RelativeLayout.LayoutParams layoutParams2 = null;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
            C786410Ut5.I7(null, view);
        }
        View view2 = this.LLZLL;
        ViewGroup.LayoutParams layoutParams3 = view2 != null ? view2.getLayoutParams() : null;
        if ((layoutParams3 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams3) != null) {
            layoutParams.addRule(3, R.id.s75);
            layoutParams2 = layoutParams;
        }
        View view3 = this.LLZLL;
        if (view3 != null) {
            C786410Ut5.W5(view3, layoutParams2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void KT() {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment.KT():void");
    }

    public final void PT() {
        FrameLayout frameLayout;
        Integer numLIZJ;
        C1251390ifZ.LIZ.getClass();
        if (!C1251390ifZ.LIZIZ(true) || (frameLayout = this.LLILLL) == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, frameLayout.getContext())) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(iIntValue);
        frameLayout.setBackground(gradientDrawable);
    }

    public final void zT() {
        if (!this.LLLJIL) {
            ConstraintLayout constraintLayout = this.LLLZ;
            C786410Ut5.LL(8, constraintLayout != null ? constraintLayout : null);
            ViewGroup viewGroup = this.LLLLZLLLI;
            if (viewGroup != null) {
                C786410Ut5.R4(1.0f, viewGroup);
            }
            C786410Ut5.F5(mS(), 1.0f);
            C786410Ut5.F5(wS(), 1.0f);
            if (C1EDI.LJ()) {
                LinearLayout linearLayout = this.LLLIIL;
                if (linearLayout != null) {
                    C786410Ut5.W4(linearLayout, 1.0f);
                }
            } else {
                C786410Ut5.F5(gS(), 1.0f);
            }
            View view = this.LLJJIJIL;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            C127K c127k = this.LLJJJJ;
            if (c127k != null) {
                C786410Ut5.F5(c127k, 1.0f);
            }
            C786410Ut5.F5(BS(), 1.0f);
            return;
        }
        ConstraintLayout constraintLayout2 = this.LLLZ;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        C786410Ut5.LL(0, constraintLayout2);
        TuxTextView tuxTextView = this.LLLLZLLIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTuxFont(62);
        TuxTextView tuxTextView2 = this.LLLLZLLIL;
        C786410Ut5.h9(tuxTextView2 != null ? tuxTextView2 : null, new ACListenerS154S0100000_19(this, 181));
        ViewGroup viewGroup2 = this.LLLLZLLLI;
        if (viewGroup2 != null) {
            C786410Ut5.R4(0.34f, viewGroup2);
        }
        C786410Ut5.F5(mS(), 0.34f);
        C786410Ut5.F5(wS(), 0.34f);
        if (C1EDI.LJ()) {
            LinearLayout linearLayout2 = this.LLLIIL;
            if (linearLayout2 != null) {
                C786410Ut5.W4(linearLayout2, 0.34f);
            }
        } else {
            C786410Ut5.F5(gS(), 0.34f);
        }
        View view2 = this.LLJJIJIL;
        if (view2 != null) {
            C786410Ut5.T4(view2, 0.34f);
        }
        C127K c127k2 = this.LLJJJJ;
        if (c127k2 != null) {
            C786410Ut5.F5(c127k2, 0.34f);
        }
        C786410Ut5.F5(BS(), 0.34f);
        C20684815ws.LJIILLIIL("tns_ags_float_profile_ban", new C0XGR().LIZ);
    }

    public MusProfileEditFragment() {
        AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(522);
        this.u = new C736950SvV(C13LE.LIZ(EditProfileSyncSharedViewModel.class), aFwS207S0000000_19, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS257S0000000_19.get$arr$(466), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment
    public final void initData() {
        super.initData();
        if (this.LLIZLLLIL != null) {
            RT(getUser(), false);
            if (this.LLLZL) {
                this.LLLZL = false;
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                C2344009Gk c2344009Gk = ((C1215720hk2) ((AssemViewModel) this.u.getValue()).getState()).LL;
                c1253930ijf.getClass();
                if (c2344009Gk != null) {
                    c2344009Gk.LJIIIIZZ("enter_type", "enter");
                    C20684815ws.LJIILLIIL("profile_edit_status", c2344009Gk.LIZ);
                }
            }
            zT();
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment
    public final int oS() {
        return qS() ? C1EDI.LJ() ? R.layout.efo : R.layout.efn : C1EDI.LJ() ? R.layout.efq : R.layout.efp;
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJIILLIIL(this);
        C1251390ifZ.LIZ.getClass();
        if (C1251390ifZ.LIZIZ(true)) {
            C1245110iVR c1245110iVR = (C1245110iVR) this.LLLZI.getValue();
            c1245110iVR.getClass();
            ((ArrayList) C1254890ilD.LLJIJIL).remove(c1245110iVR.LJJIJIIJIL);
            C1254890ilD c1254890ilD = (C1254890ilD) c1245110iVR.LJJIJ.getValue();
            c1254890ilD.LIZLLL();
            c1254890ilD.LLJI = null;
            c1254890ilD.LLILZIL = null;
            c1245110iVR.LJJIJIIJI.getValue().getClass();
        }
        this.LLLZLZ.LJ();
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C19EG activity;
        super.onResume();
        zT();
        if (C1067920dte.LIZ() && this.LLLLILI) {
            C1245090iVP.LIZ.getClass();
            C01GW c01gw = C1245090iVP.LIZIZ;
            Keva keva = (Keva) c01gw.getValue();
            C1222200huU c1222200huU = C1222200huU.LIZ;
            c1222200huU.getClass();
            if (!keva.getBoolean(C1222200huU.LIZ("has_shown_notification_permission"), false)) {
                Keva keva2 = (Keva) c01gw.getValue();
                c1222200huU.getClass();
                String[] stringArray = keva2.getStringArray(C1222200huU.LIZ("shown_notification_timestamp_array"), new String[0]);
                ArrayList arrayList = new ArrayList();
                C089E c089e = new C089E(stringArray);
                while (c089e.hasNext()) {
                    String str = (String) c089e.next();
                    if (((System.currentTimeMillis() + ((long) TimeZone.getDefault().getRawOffset())) / 86400000) - ((CastLongProtector.parseLong(str) + ((long) TimeZone.getDefault().getRawOffset())) / 86400000) < 7) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() < 3) {
                    if (new C815520Vyw(requireContext()).LIZ()) {
                        PushSettings pushSettingsLJ = C19328310jZ.LIZIZ.LJ();
                        if (pushSettingsLJ != null && pushSettingsLJ.otherChannel == 0) {
                            C1245090iVP.LIZ.getClass();
                            Keva keva3 = (Keva) C1245090iVP.LIZIZ.getValue();
                            C1222200huU.LIZ.getClass();
                            keva3.storeBoolean(C1222200huU.LIZ("has_shown_notification_permission"), true);
                            C1245090iVP.LIZ();
                            C1397620mTQ c1397620mTQ = new C1397620mTQ(requireActivity());
                            C1221880hty.LJI("toggle");
                            c1397620mTQ.LJFF(2131820616, new AwS598S0100000_19(this, 535));
                            c1397620mTQ.LJII(2131820617, AFwS257S0000000_19.get$arr$(574));
                            Context contextRequireContext = requireContext();
                            String string = contextRequireContext.getString(2131820615);
                            String string2 = contextRequireContext.getString(2131820614, string);
                            int iLJJJ = a0.LJJJ(string2, string, 0, false, 6);
                            if (iLJJJ != -1) {
                                SpannableString spannableString = new SpannableString(string2);
                                C786410Ut5.p2(spannableString, new C444920HcY(33, false), iLJJJ, string.length() + iLJJJ, 18);
                                string2 = spannableString.toString();
                            }
                            C1397580mTM c1397580mTM = new C1397580mTM(requireContext());
                            c1397580mTM.LIZIZ(string2);
                            c1397580mTM.LJIIL = c1397620mTQ;
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    } else {
                        C1245090iVP.LIZ.getClass();
                        Keva keva4 = (Keva) C1245090iVP.LIZIZ.getValue();
                        C1222200huU.LIZ.getClass();
                        keva4.storeBoolean(C1222200huU.LIZ("has_shown_notification_permission"), true);
                        C1245090iVP.LIZ();
                        C1397620mTQ c1397620mTQ2 = new C1397620mTQ(requireActivity());
                        C1221880hty.LJI("normal");
                        c1397620mTQ2.LJFF(2131820612, new AwS598S0100000_19(this, 556));
                        c1397620mTQ2.LJII(2131820613, AFwS257S0000000_19.get$arr$(586));
                        C1397580mTM c1397580mTM2 = new C1397580mTM(requireContext());
                        c1397580mTM2.LIZ(2131820611);
                        c1397580mTM2.LJIIL = c1397620mTQ2;
                        new C1397510mTF(c1397580mTM2).LIZLLL();
                    }
                }
            }
        }
        if (((SocialAvatarAccess) this.LLZZJLIL.getValue()).LIZLLL()) {
            C0HYP.LIZ.getClass();
            if (!C0HYP.LJ().getBoolean("should_show_share_to_dm", false) || (activity = getActivity()) == null) {
                return;
            }
            C0HYP.LJ().storeBoolean("should_show_share_to_dm", false);
            PopupManager.LJIJI(new C0HXX(activity), true);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment, X.InterfaceC1255040ilS
    public final void Eb0(AvatarUri avatarUri) {
        AvatarComponentView avatarComponentView;
        if (avatarUri != null && !C1256140inE.LIZ(avatarUri.urlList) && !TextUtils.isEmpty((CharSequence) ListProtector.get(avatarUri.urlList, 0))) {
            dS().LIZLLL();
            uS().LIZ = avatarUri.uri;
            if (avatarUri.urlList.size() > 0 && (avatarComponentView = this.LLILLJJLI) != null) {
                avatarComponentView.LJIIJ(new C03IT(avatarUri.urlList));
                return;
            }
            return;
        }
        dS().LIZLLL();
        C1233040iBy c1233040iBy = new C1233040iBy(getActivity());
        c1233040iBy.LIZIZ(2131824546);
        c1233040iBy.LIZLLL();
    }

    public final void NT(boolean z) {
        User userAT;
        List<String> list;
        if (z && (userAT = AT()) != null && (list = userAT.boldFields) != null) {
            if (list.size() > 0 && !list.contains("photo")) {
                list.add("photo");
                User userAT2 = AT();
                if (userAT2 != null) {
                    userAT2.setBoldFields(list);
                }
            }
            vT("photo", "is_edited", false);
            ((AssemViewModel) this.u.getValue()).setState(AFwS257S0000000_19.get$arr$(729));
        }
    }

    public final void OT(boolean z) {
        User userAT;
        List<String> list;
        if (z && (userAT = AT()) != null && (list = userAT.boldFields) != null) {
            if (list.size() > 0 && list.contains("photo")) {
                list.remove("photo");
                User userAT2 = AT();
                if (userAT2 != null) {
                    userAT2.setBoldFields(list);
                }
            }
            vT("photo", "blank", true);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment, X.InterfaceC1232420iAy
    public final void Pc0(boolean z) {
        if (z && yS() != null && !Boolean.valueOf(yS().LLJI).booleanValue()) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZJ(getString(2131827634, 48));
            c1233040iBy.LIZLLL();
            return;
        }
        super.Pc0(z);
    }

    public final void ST(int i) {
        ViewPager viewPager;
        if (this.LLZLLIL == null) {
            View view = this.LLLZZIL;
            TuxSheet tuxSheet = null;
            if (view != null) {
                viewPager = (ViewPager) view.findViewById(R.id.a2g);
            } else {
                viewPager = null;
            }
            this.LLZLLIL = viewPager;
            if (viewPager != null) {
                TuxSheet tuxSheet2 = this.LLZ;
                if (tuxSheet2 != null) {
                    tuxSheet = tuxSheet2;
                }
                final FragmentManager childFragmentManager = tuxSheet.getChildFragmentManager();
                final User user = getUser();
                final C0HFL c0hfl = new C0HFL(new AwS550S0100000_6(this, 965), new AwS550S0100000_6(this, 966), new C442970HYp(this), new AwS585S0100000_6(this, 232), new C442950HYn(this), new C442960HYo(this));
                viewPager.setAdapter(new AbstractC480470Isn(childFragmentManager, user, c0hfl) { // from class: X.0HFM
                    public final User LLIZ;
                    public final C0HFL LLIZLLLIL;

                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final int getCount() {
                        return 2;
                    }

                    @Override // X.AbstractC480470Isn
                    public final Fragment LJJIJIL(int i2) {
                        if (i2 != 0 && i2 != 1) {
                            throw new IllegalArgumentException("Invalid tab position");
                        }
                        User user2 = this.LLIZ;
                        C0HFL c0hfl2 = this.LLIZLLLIL;
                        SocialAvatarBottomSheetActionFragment socialAvatarBottomSheetActionFragment = new SocialAvatarBottomSheetActionFragment();
                        socialAvatarBottomSheetActionFragment.LL = i2;
                        socialAvatarBottomSheetActionFragment.LLILLJJLI = user2;
                        socialAvatarBottomSheetActionFragment.LLILLL = c0hfl2;
                        return socialAvatarBottomSheetActionFragment;
                    }

                    {
                        this.LLIZ = user;
                        this.LLIZLLLIL = c0hfl;
                    }
                });
            }
        }
        ViewPager viewPager2 = this.LLZLLIL;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(i);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment, X.InterfaceC1255040ilS
    public final void dN2(String str) {
        super.dN2(str);
        if (qS()) {
            RT(getUser(), false);
            TuxSheet tuxSheet = this.LLZ;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            }
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment, X.InterfaceC1255040ilS
    public final void hO(Exception exc) {
        UR(false);
        dS().LIZLLL();
        if (!isViewValid()) {
            return;
        }
        if ((exc instanceof C0XIR) && ((C23112093u) exc).getErrorCode() == 20022) {
            C810650Vr5.LIZ(getActivity(), "profile_image_setting", "review_failure");
        }
        C1354920lMY.LIZLLL(getActivity(), exc, 2131824546);
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x073a  */
    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initView(android.view.View r25) {
        /*
            Method dump skipped, instruction units count: 2006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment.initView(android.view.View):void");
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        SocialAvatarUserInfoCache socialAvatarUserInfoCache;
        super.onActivityCreated(bundle);
        C290040BYk.LIZ.getClass();
        if (C290040BYk.LIZ() && bundle != null && (socialAvatarUserInfoCache = (SocialAvatarUserInfoCache) bundle.getParcelable("social_avatar_cache_key")) != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1392105cd(socialAvatarUserInfoCache, null), 3);
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C290040BYk.LIZ.getClass();
        if (C290040BYk.LIZ()) {
            C786410Ut5.LJJIJL(bundle, "social_avatar_cache_key", (Parcelable) C442910HYj.LIZJ.getValue());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment, X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
        int i2;
        super.JE2(i, exc);
        if (i == 112 && (i2 = this.LLZZLLIL) != this.LLZZZIL) {
            this.LLZZZIL = i2;
            if (this.LLZ != null) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onUserUpdateFailed, reverting back to the original state currentSocialAvatarType as ");
                sbLIZ.append(this.LLZZLLIL);
                C2188811AlT.LIZIZ(sbLIZ);
                View view = this.LLLZZIL;
                if (view != null) {
                    GT(this.LLZZLLIL, view, false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void RT(User user, boolean z) {
        UrlModel urlModel;
        UrlModel urlModel2;
        UrlModel urlModel3;
        boolean z2;
        AvatarComponentView avatarComponentView;
        TuxIconView tuxIconView;
        AvatarComponentView avatarComponentView2;
        TuxIconView tuxIconView2;
        int i;
        UrlModel urlModel4;
        UrlModel urlModel5;
        List<String> urlList;
        AvatarComponentView avatarComponentView3;
        InterfaceC438160HGc socialAvatarAbility;
        UrlModel avatarLarger;
        List<String> urlList2;
        UrlModel urlModel6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAvatarPhoto, socialAvatarWithBackground is ");
        AvatarSizeUrlStruct socialAvatarWithBackground = user.getSocialAvatarWithBackground();
        if (socialAvatarWithBackground != null) {
            urlModel = socialAvatarWithBackground.avatarLarger;
        } else {
            urlModel = null;
        }
        sbLIZ.append(C1216160hkk.LIZ(urlModel));
        sbLIZ.append(", socialAvatarWithoutBackground is ");
        AvatarSizeUrlStruct socialAvatarWithoutBackground = user.getSocialAvatarWithoutBackground();
        if (socialAvatarWithoutBackground != null) {
            urlModel2 = socialAvatarWithoutBackground.avatarLarger;
        } else {
            urlModel2 = null;
        }
        sbLIZ.append(C1216160hkk.LIZ(urlModel2));
        sbLIZ.append(", dynamicSocialAvatar is ");
        AvatarSizeUrlStruct dynamicSocialAvatar = user.getDynamicSocialAvatar();
        if (dynamicSocialAvatar != null) {
            urlModel3 = dynamicSocialAvatar.avatarLarger;
        } else {
            urlModel3 = null;
        }
        sbLIZ.append(C1216160hkk.LIZ(urlModel3));
        C2188811AlT.LIZIZ(sbLIZ);
        String uid = user.getUid();
        if (uid == null) {
            return;
        }
        EnumC437540HDs enumC437540HDs = ((C437560HDu) ((ISocialAvatarCreationStatusService) this.LLZLLLL.getValue()).LIZ(uid).getValue()).LIZ;
        if (((SocialAvatarAccess) this.LLZZJLIL.getValue()).LIZLLL() && C1216160hkk.LIZ(user.getAvatarMedium()) && C1245160iVW.LIZJ(user) && enumC437540HDs != EnumC437540HDs.DELETED) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLZZZZ = z2;
        boolean zLIZ = C1216160hkk.LIZ(user.getAvatarMedium());
        C1252550ihR.LIZ.getClass();
        C1252550ihR.LJIIJJI(user, "photo");
        if (qS()) {
            View view = this.LLLZZIL;
            if (view != null && (avatarComponentView = (AvatarComponentView) view.findViewById(R.id.ptn)) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.ptt)) != null && (avatarComponentView2 = (AvatarComponentView) view.findViewById(R.id.vnt)) != null && (tuxIconView2 = (TuxIconView) view.findViewById(R.id.p7z)) != null) {
                boolean zLIZ2 = C1245160iVW.LIZ(user);
                C290040BYk.LIZ.getClass();
                int iIntValue = zLIZ2;
                if (C290040BYk.LIZ()) {
                    Integer numLIZ = C442910HYj.LIZ();
                    iIntValue = zLIZ2;
                    if (numLIZ != null) {
                        iIntValue = numLIZ.intValue();
                    }
                }
                this.LLZZLLIL = iIntValue;
                this.LLZZZIL = iIntValue;
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateSocialAvatarPhoto, currentSocialAvatarType is ");
                sbLIZ2.append(this.LLZZLLIL);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (!C1245160iVW.LIZJ(user) && !C442910HYj.LIZJ()) {
                    C786410Ut5.g(avatarComponentView2, 4);
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    i = 8;
                } else {
                    C786410Ut5.g(avatarComponentView2, 0);
                    i = 8;
                    C0S1B.LIZ(avatarComponentView2, user.getUid(), user, this, false, null, 56);
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                }
                if (zLIZ) {
                    AvatarSizeUrlStruct staticAvatar = user.getStaticAvatar();
                    if ((staticAvatar != null && (urlModel6 = staticAvatar.avatarLarger) != null && (urlList2 = urlModel6.getUrlList()) != null) || ((avatarLarger = user.getAvatarLarger()) != null && (urlList2 = avatarLarger.getUrlList()) != null)) {
                        avatarComponentView.LJIIJ(new C03IT(urlList2));
                    }
                    C786410Ut5.g(avatarComponentView, 0);
                    C786410Ut5.LLLLLLZZ(tuxIconView, i);
                } else {
                    C786410Ut5.g(avatarComponentView, 4);
                    tuxIconView.setTintColorRes(R.attr.a1j);
                }
                if (this.LLZZLLIL == 1) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("user.socialAvatarWithBackground is ");
                    sbLIZ3.append(user.getSocialAvatarWithBackground());
                    sbLIZ3.append(", user.socialAvatarWithBackground?.avatarLarge is ");
                    AvatarSizeUrlStruct socialAvatarWithBackground2 = user.getSocialAvatarWithBackground();
                    if (socialAvatarWithBackground2 != null) {
                        urlModel4 = socialAvatarWithBackground2.avatarLarger;
                    } else {
                        urlModel4 = null;
                    }
                    sbLIZ3.append(urlModel4);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    if (this.o) {
                        AvatarComponentView avatarComponentView4 = this.LLILLJJLI;
                        if (avatarComponentView4 != null) {
                            C0S1B.LIZ(avatarComponentView4, user.getUid(), user, this, false, null, 56);
                        }
                        this.o = false;
                    } else {
                        AvatarSizeUrlStruct socialAvatarWithoutBackground2 = user.getSocialAvatarWithoutBackground();
                        if (socialAvatarWithoutBackground2 != null && (urlModel5 = socialAvatarWithoutBackground2.avatarLarger) != null && (urlList = urlModel5.getUrlList()) != null && (avatarComponentView3 = this.LLILLJJLI) != null && (socialAvatarAbility = avatarComponentView3.getSocialAvatarAbility()) != null) {
                            socialAvatarAbility.LIZLLL(urlList, true);
                        }
                    }
                    AvatarComponentView avatarComponentView5 = this.LLILLJJLI;
                    TuxIconView tuxIconView3 = this.LLLZIIL;
                    if (tuxIconView3 == null) {
                        tuxIconView3 = null;
                    }
                    C427870Gq9 c427870Gq9 = this.LLLZIL;
                    if (c427870Gq9 == null) {
                        c427870Gq9 = null;
                    }
                    IT(avatarComponentView5, tuxIconView3, c427870Gq9, user);
                    User userAT = AT();
                    if (userAT != null) {
                        userAT.setAvatarUpdateReminder(false);
                    }
                    NT(z);
                    return;
                }
                if (zLIZ) {
                    AvatarComponentView avatarComponentView6 = this.LLILLJJLI;
                    if (avatarComponentView6 != null) {
                        C0S1B.LIZ(avatarComponentView6, user.getUid(), user, this, false, null, 56);
                    }
                    AvatarComponentView avatarComponentView7 = this.LLILLJJLI;
                    TuxIconView tuxIconView4 = this.LLLZIIL;
                    if (tuxIconView4 == null) {
                        tuxIconView4 = null;
                    }
                    C427870Gq9 c427870Gq92 = this.LLLZIL;
                    if (c427870Gq92 == null) {
                        c427870Gq92 = null;
                    }
                    IT(avatarComponentView7, tuxIconView4, c427870Gq92, user);
                    User userAT2 = AT();
                    if (userAT2 != null) {
                        userAT2.setAvatarUpdateReminder(false);
                    }
                    NT(z);
                    return;
                }
                AvatarComponentView avatarComponentView8 = this.LLILLJJLI;
                TuxIconView tuxIconView5 = this.LLLZIIL;
                if (tuxIconView5 == null) {
                    tuxIconView5 = null;
                }
                C427870Gq9 c427870Gq93 = this.LLLZIL;
                if (c427870Gq93 == null) {
                    c427870Gq93 = null;
                }
                DT(avatarComponentView8, tuxIconView5, c427870Gq93);
                OT(z);
                return;
            }
            return;
        }
        if (zLIZ) {
            AvatarComponentView avatarComponentView9 = this.LLILLJJLI;
            if (avatarComponentView9 != null) {
                C0S1B.LIZ(avatarComponentView9, user.getUid(), user, this, false, null, 56);
            }
            AvatarComponentView avatarComponentView10 = this.LLILLJJLI;
            TuxIconView tuxIconView6 = this.LLLZIIL;
            if (tuxIconView6 == null) {
                tuxIconView6 = null;
            }
            C427870Gq9 c427870Gq94 = this.LLLZIL;
            if (c427870Gq94 == null) {
                c427870Gq94 = null;
            }
            IT(avatarComponentView10, tuxIconView6, c427870Gq94, user);
            User userAT3 = AT();
            if (userAT3 != null) {
                userAT3.setAvatarUpdateReminder(false);
            }
            NT(z);
            return;
        }
        AvatarComponentView avatarComponentView11 = this.LLILLJJLI;
        TuxIconView tuxIconView7 = this.LLLZIIL;
        if (tuxIconView7 == null) {
            tuxIconView7 = null;
        }
        C427870Gq9 c427870Gq95 = this.LLLZIL;
        if (c427870Gq95 == null) {
            c427870Gq95 = null;
        }
        DT(avatarComponentView11, tuxIconView7, c427870Gq95);
        OT(z);
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment, X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
        UrlModel urlModel;
        List<String> urlList;
        AvatarComponentView avatarComponentView;
        InterfaceC438160HGc socialAvatarAbility;
        View view;
        UrlModel avatarLarger;
        List<String> urlList2;
        AvatarComponentView avatarComponentView2;
        InterfaceC438160HGc socialAvatarAbility2;
        UrlModel urlModel2;
        super.Ud0(i, user);
        if (i == 112) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MusProfileEditFragment onUserUpdateSuccess, newSocialAvatarType is ");
            sbLIZ.append(this.LLZZZIL);
            sbLIZ.append(", currentSocialAvatarType is ");
            sbLIZ.append(this.LLZZLLIL);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LLZZLLIL != this.LLZZZIL) {
                AvatarMetaInfo avatarMetaInfoLIZIZ = C1245160iVW.LIZIZ(user);
                if (avatarMetaInfoLIZIZ != null) {
                    avatarMetaInfoLIZIZ.setAvatarChoice(Integer.valueOf(this.LLZZZIL));
                }
                String str = "";
                C427870Gq9 c427870Gq9 = null;
                if (this.LLZZZIL == 0) {
                    AvatarSizeUrlStruct staticAvatar = user.getStaticAvatar();
                    if (((staticAvatar != null && (urlModel2 = staticAvatar.avatarLarger) != null && (urlList2 = urlModel2.getUrlList()) != null) || ((avatarLarger = user.getAvatarLarger()) != null && (urlList2 = avatarLarger.getUrlList()) != null)) && (avatarComponentView2 = this.LLILLJJLI) != null && (socialAvatarAbility2 = avatarComponentView2.getSocialAvatarAbility()) != null) {
                        socialAvatarAbility2.LIZLLL(urlList2, false);
                    }
                    C0HWW c0hww = C0HWW.LIZ;
                    String uid = user.getUid();
                    if (uid != null) {
                        str = uid;
                    }
                    c0hww.getClass();
                    C0HWW.LIZJ(str, "show");
                } else {
                    if (this.o) {
                        AvatarComponentView avatarComponentView3 = this.LLILLJJLI;
                        if (avatarComponentView3 != null) {
                            C0S1B.LIZ(avatarComponentView3, user.getUid(), user, this, false, null, 56);
                        }
                        this.o = false;
                    } else {
                        AvatarSizeUrlStruct socialAvatarWithoutBackground = user.getSocialAvatarWithoutBackground();
                        if (socialAvatarWithoutBackground != null && (urlModel = socialAvatarWithoutBackground.avatarLarger) != null && (urlList = urlModel.getUrlList()) != null && (avatarComponentView = this.LLILLJJLI) != null && (socialAvatarAbility = avatarComponentView.getSocialAvatarAbility()) != null) {
                            socialAvatarAbility.LIZLLL(urlList, true);
                        }
                    }
                    C0HWW c0hww2 = C0HWW.LIZ;
                    String uid2 = user.getUid();
                    if (uid2 != null) {
                        str = uid2;
                    }
                    c0hww2.getClass();
                    C0HWW.LIZLLL(str, "show");
                }
                AvatarComponentView avatarComponentView4 = this.LLILLJJLI;
                TuxIconView tuxIconView = this.LLLZIIL;
                if (tuxIconView == null) {
                    tuxIconView = null;
                }
                C427870Gq9 c427870Gq92 = this.LLLZIL;
                if (c427870Gq92 != null) {
                    c427870Gq9 = c427870Gq92;
                }
                IT(avatarComponentView4, tuxIconView, c427870Gq9, user);
                if (this.LLZ != null && (view = this.LLLZZIL) != null) {
                    GT(this.LLZZZIL, view, false);
                }
                int i3 = this.LLZZZIL;
                this.LLZZLLIL = i3;
                C442910HYj.LIZLLL(i3);
            }
        }
    }

    public final void DT(AvatarComponentView avatarComponentView, TuxIconView tuxIconView, C427870Gq9 c427870Gq9) {
        PT();
        if (avatarComponentView != null) {
            C786410Ut5.LJLLLLLL(8, avatarComponentView);
        }
        tuxIconView.setTintColorRes(R.attr.a1h);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bv, C1385040m98.LIZIZ(c427870Gq9.getContext()));
        if (numLIZJ != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ("");
            c1331670kl3LJIIIZ.LJJIIZI(new ColorDrawable(numLIZJ.intValue()));
            c1331670kl3LJIIIZ.LJJ(c427870Gq9);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    public final void GT(int i, View view, boolean z) {
        C0HZQ c0hzq;
        String uid;
        C0HZQ c0hzq2 = (C0HZQ) view.findViewById(R.id.ptm);
        if (c0hzq2 == null || (c0hzq = (C0HZQ) view.findViewById(R.id.vnm)) == null) {
            return;
        }
        User userAT = AT();
        if (userAT == null || (uid = userAT.getUid()) == null) {
            uid = "";
        }
        View viewFindViewById = view.findViewById(R.id.ptn);
        View viewFindViewById2 = view.findViewById(R.id.vnt);
        if (i == 0) {
            c0hzq2.setChecked(true);
            c0hzq2.setEnabled(false);
            C786410Ut5.y5(c0hzq2, 1.0f);
            if (viewFindViewById != null) {
                viewFindViewById.setEnabled(false);
            }
            c0hzq.setChecked(false);
            c0hzq.setEnabled(true);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setEnabled(true);
            }
            if (z) {
                C0HWW.LIZ.getClass();
                C0HWW.LIZJ(uid, "show");
                return;
            }
            return;
        }
        c0hzq.setChecked(true);
        c0hzq.setEnabled(false);
        C786410Ut5.y5(c0hzq, 1.0f);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setEnabled(false);
        }
        c0hzq2.setChecked(false);
        c0hzq2.setEnabled(true);
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(true);
        }
        if (!z) {
            return;
        }
        C0HWW.LIZ.getClass();
        C0HWW.LIZLLL(uid, "show");
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS27S0400000_19(activity, user, user2, this, 5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment, androidx.fragment.app.Fragment
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            X.0ifZ r0 = X.C1251390ifZ.LIZ
            r0.getClass()
            r5 = 1
            boolean r0 = X.C1251390ifZ.LIZIZ(r5)
            if (r0 == 0) goto Lbb
            X.01GW r0 = r9.LLLZI
            java.lang.Object r6 = r0.getValue()
            X.0iVR r6 = (X.C1245110iVR) r6
            X.01GW r0 = r6.LJJIJ
            java.lang.Object r0 = r0.getValue()
            X.0ilD r0 = (X.C1254890ilD) r0
            boolean r0 = r0.LJ(r10, r11, r12)
            if (r0 == 0) goto L36
            r0 = 10040(0x2738, float:1.4069E-41)
            if (r10 == r0) goto L35
            r0 = 10041(0x2739, float:1.407E-41)
            if (r10 == r0) goto L35
        L2a:
            X.01GW r0 = r9.LLLZI
            java.lang.Object r0 = r0.getValue()
            X.0iVR r0 = (X.C1245110iVR) r0
            r0.LJIIJ(r5)
        L35:
            return
        L36:
            r0 = -1
            r4 = 0
            if (r11 != r0) goto Lbb
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r10 == r0) goto L46
            r0 = 2003(0x7d3, float:2.807E-42)
            if (r10 == r0) goto L46
            r0 = 1004(0x3ec, float:1.407E-42)
            if (r10 != r0) goto Lbb
        L46:
            if (r12 == 0) goto L2a
            java.lang.String r0 = "extra_bg_updated"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L2a
            r8 = 0
            if (r12 == 0) goto L5e
            java.lang.String r0 = "extra_bg_aweme_id"
            java.lang.String r7 = r12.getStringExtra(r0)     // Catch: java.lang.Exception -> L5a
            goto L5f
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5e:
            r7 = r8
        L5f:
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r12 == 0) goto L69
            java.lang.String r0 = "extra_bg_offset_ratio"
            float r3 = r12.getFloatExtra(r0, r3)
        L69:
            if (r7 == 0) goto Lb9
            int r0 = r7.length()
            if (r0 == 0) goto Lb9
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme> r0 = X.C1245100iVQ.LIZ
            java.lang.Object r0 = r0.get(r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
        L79:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "Background preview result awemeId="
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = " offsetRatio="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = " committedAweme="
            r2.append(r1)
            if (r0 == 0) goto Lb7
            r1 = 1
        L95:
            r2.append(r1)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r1 = "ProfileBgEditHelper"
            X.C1720106oR.LJI(r1, r2)
            r6.LIZIZ = r5
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            if (r0 == 0) goto Laa
            r4 = 2
        Laa:
            r6.LIZLLL(r4, r8, r0, r1)
            X.0idb r0 = X.C1250170idb.LIZ
            r0.getClass()
            X.C1250170idb.LIZ(r3, r7)
            goto L2a
        Lb7:
            r1 = 0
            goto L95
        Lb9:
            r0 = r8
            goto L79
        Lbb:
            super.onActivityResult(r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void IT(AvatarComponentView avatarComponentView, TuxIconView tuxIconView, C427870Gq9 c427870Gq9, User user) {
        C1331730kl9 c1331730kl9;
        Integer numLIZJ;
        Integer numLIZJ2;
        UrlModel avatarMedium;
        String uri;
        Integer numLIZJ3;
        PT();
        if (C1EDI.LJ()) {
            if (!C1245160iVW.LIZ(user) && user != null && (avatarMedium = user.getAvatarMedium()) != null && (uri = avatarMedium.getUri()) != null && a0.LJJIIZI(uri, "1594805258216454", false)) {
                if (avatarComponentView != null) {
                    C786410Ut5.LJLLLLLL(8, avatarComponentView);
                }
                Context context = getContext();
                if (context != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1j, context)) != null) {
                    tuxIconView.setTintColor(numLIZJ3.intValue());
                }
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a03, c427870Gq9.getContext());
                if (numLIZJ4 != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ("");
                    c1331670kl3LJIIIZ.LJJIIZI(new ColorDrawable(numLIZJ4.intValue()));
                    c1331670kl3LJIIIZ.LJJ(c427870Gq9);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                    return;
                }
                return;
            }
            if (avatarComponentView != null) {
                C786410Ut5.LJLLLLLL(0, avatarComponentView);
            }
            Context context2 = getContext();
            if (context2 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, C1385040m98.LIZ(context2, true))) != null) {
                tuxIconView.setTintColor(numLIZJ2.intValue());
            }
            Context context3 = getContext();
            if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context3)) != null) {
                int iIntValue = numLIZJ.intValue();
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.33d)));
                c1331750klB.LIZJ = iIntValue;
                c1331750klB.LIZ = true;
                c1331730kl9 = new C1331730kl9(c1331750klB);
            } else {
                c1331730kl9 = null;
            }
            c427870Gq9.setCircleOptions(c1331730kl9);
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.uh, C1385040m98.LIZ(c427870Gq9.getContext(), false));
            if (numLIZJ5 == null) {
                return;
            }
            C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ("");
            c1331670kl3LJIIIZ2.LJJIIZI(new ColorDrawable(numLIZJ5.intValue()));
            c1331670kl3LJIIIZ2.LJJ(c427870Gq9);
            C786410Ut5.h3(c1331670kl3LJIIIZ2);
            return;
        }
        if (C1644806cI.LIZJ()) {
            if (avatarComponentView != null) {
                C786410Ut5.LJLLLLLL(0, avatarComponentView);
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            return;
        }
        if (avatarComponentView != null) {
            C786410Ut5.LJLLLLLL(0, avatarComponentView);
        }
        tuxIconView.setTintColorRes(R.attr.ee);
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.uh, C1385040m98.LIZ(c427870Gq9.getContext(), false));
        if (numLIZJ6 == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIZ3 = C1331660kl2.LJIIIZ("");
        c1331670kl3LJIIIZ3.LJJIIZI(new ColorDrawable(numLIZJ6.intValue()));
        c1331670kl3LJIIIZ3.LJJ(c427870Gq9);
        C786410Ut5.h3(c1331670kl3LJIIIZ3);
    }

    public static void LT(final MusProfileEditFragment musProfileEditFragment, final EnumC437540HDs enumC437540HDs, boolean z, boolean z2, int i) {
        ViewGroup.LayoutParams layoutParams;
        Integer numLIZJ;
        RelativeLayout.LayoutParams layoutParams2;
        final boolean z3 = z2;
        final boolean z4 = z;
        if ((i & 2) != 0) {
            z4 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        musProfileEditFragment.getClass();
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show Social Avatar Status Banner, progressState is ");
        sbLIZ.append(enumC437540HDs);
        sbLIZ.append(", clickDisappear is ");
        sbLIZ.append(z4);
        C2188811AlT.LIZIZ(sbLIZ);
        View view = musProfileEditFragment.LLZL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = musProfileEditFragment.LLZLL;
        RelativeLayout.LayoutParams layoutParams3 = null;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.addRule(3, R.id.vo0);
            layoutParams3 = layoutParams2;
        }
        View view3 = musProfileEditFragment.LLZLL;
        if (view3 != null) {
            C786410Ut5.W5(view3, layoutParams3);
        }
        final View view4 = musProfileEditFragment.LLZILL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
            if (C1EDI.LJ() && (numLIZJ = C1308910kAL.LIZJ(R.attr.zq, view4.getContext())) != null) {
                view4.setBackgroundColor(numLIZJ.intValue());
            }
            C427690Gpr.LJ(view4, 0.0f);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0HDl
                @Override // X.AbstractViewOnClickListenerC1173120gdK
                public final void LIZ(View view5) {
                    C0HZ2 c0hz2;
                    ISocialAvatarService iSocialAvatarServiceCT = this.LLILZ.CT();
                    Context context = view4.getContext();
                    EnumC437540HDs enumC437540HDs2 = enumC437540HDs;
                    EnumC437540HDs enumC437540HDs3 = EnumC437540HDs.FAILED;
                    if (enumC437540HDs2 == enumC437540HDs3) {
                        c0hz2 = C0HZ2.GENERATE_FAILURE_EDIT_PROFILE_PROGRESS_BANNER;
                    } else {
                        c0hz2 = C0HZ2.UNKNOWN;
                    }
                    iSocialAvatarServiceCT.LJIILLIIL(new C0HHA(context, "progress_banner", "personal_homepage", null, null, 4, false, z3, c0hz2, false, null, 3256), enumC437540HDs, null);
                    if (z4) {
                        this.LLILZ.FT();
                    }
                    if (enumC437540HDs == enumC437540HDs3) {
                        C0HYP.LIZ.getClass();
                        C0HYP.LJ().storeBoolean("has_clicked_failure_push_profile_edit", true);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1000L);
                }
            }, view4);
        }
    }
}
