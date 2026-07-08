package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.cell;

import X.C01GW;
import X.C0DOO;
import X.C0DOP;
import X.C1007370cJz;
import X.C1214260hhg;
import X.C1229970i71;
import X.C1231310i9B;
import X.C1234860iEu;
import X.C1236420iHQ;
import X.C1236430iHR;
import X.C1236440iHS;
import X.C1245860iWe;
import X.C1245880iWg;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C19659111vp;
import X.C19EG;
import X.C19ME;
import X.C20684815ws;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427660Gpo;
import X.C427690Gpr;
import X.C438710HIf;
import X.C452501pT;
import X.C736460Sui;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1229960i70;
import X.EnumC1231460i9Q;
import X.EnumC1234850iEt;
import X.EnumC1236450iHT;
import X.EnumC338610DPf;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.profile.business.ur.school.datasource.CampusGroup;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.button.JoinGroupViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS58S0200000_19;
import irm.AkS88S0100000_19;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolGroupsItemCell extends PowerCell<C1214260hhg> {
    public TuxTextView LL;
    public C427660Gpo LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C1236430iHR LLILZIL;
    public TuxTag LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(483));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(484));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(478));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(480));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(475));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(477));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(479));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(476));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(488));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(486));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(487));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(482));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(481));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2432));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2431));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2433));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2434));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(485));

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
    }

    public final int I5() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1245860iWe c1245860iWe;
        C0DOP c0dopLJIIZILJ;
        C1245860iWe c1245860iWe2;
        CampusGroup campusGroup;
        CampusGroup campusGroup2;
        CampusGroup campusGroup3;
        CampusGroup campusGroup4;
        CampusGroup campusGroup5;
        Integer num;
        CampusGroup campusGroup6;
        super.onViewAttachedToWindow();
        C1214260hhg item = getItem();
        EnumC1234850iEt enumC1234850iEtLIZ = null;
        String str = (item == null || (campusGroup6 = item.LL) == null) ? null : campusGroup6.conversationId;
        SchoolGroupsAbility schoolGroupsAbility = (SchoolGroupsAbility) this.LLJJIJIL.getValue();
        ?? LJFF = 0;
        LJFF = 0;
        if (schoolGroupsAbility == null || !schoolGroupsAbility.av2(str)) {
            return;
        }
        C0DOO c0doo = C0DOO.LIZ;
        ContainerAbility containerAbility = (ContainerAbility) this.LLJJJ.getValue();
        if (containerAbility == null || (c1245860iWe = containerAbility.getEnterFrom()) == null) {
            c1245860iWe = new C1245860iWe(EnumC1231460i9Q.FIND_FRIENDS_PAGE, null, null);
        }
        C1214260hhg item2 = getItem();
        if (item2 == null || (campusGroup5 = item2.LL) == null || (num = campusGroup5.verifyStatus) == null) {
            c0dopLJIIZILJ = null;
        } else {
            int iIntValue = num.intValue();
            EnumC1229960i70.Companion.getClass();
            EnumC1229960i70 enumC1229960i70LIZ = C1229970i71.LIZ(iIntValue);
            c0doo.getClass();
            c0dopLJIIZILJ = C0DOO.LJIIZILJ(enumC1229960i70LIZ);
        }
        c0doo.getClass();
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LJIIIIZZ("enter_method", "click_profile_school");
        EnumC338610DPf enumC338610DPf = EnumC338610DPf.GROUP;
        c2344009Gk.LJIIIIZZ("tab_name", enumC338610DPf.getValue());
        c2344009Gk.LJIIIIZZ("group_status", c0dopLJIIZILJ != null ? c0dopLJIIZILJ.getParamValue() : null);
        C20684815ws.LJIILLIIL("ttsocial_school_page_group_status_show", c2344009Gk.LIZ);
        C1214260hhg item3 = getItem();
        if (item3 != null && (campusGroup4 = item3.LL) != null) {
            enumC1234850iEtLIZ = C1234860iEu.LIZ(campusGroup4);
        }
        boolean z = enumC1234850iEtLIZ == EnumC1234850iEt.EXPLORE;
        ContainerAbility containerAbility2 = (ContainerAbility) this.LLJJJ.getValue();
        if (containerAbility2 == null || (c1245860iWe2 = containerAbility2.getEnterFrom()) == null) {
            c1245860iWe2 = new C1245860iWe(EnumC1231460i9Q.FIND_FRIENDS_PAGE, null, null);
        }
        SchoolGroupsAbility schoolGroupsAbility2 = (SchoolGroupsAbility) this.LLJJIJIL.getValue();
        int iCi2 = schoolGroupsAbility2 != null ? schoolGroupsAbility2.ci2() : 0;
        SchoolGroupsAbility schoolGroupsAbility3 = (SchoolGroupsAbility) this.LLJJIJIL.getValue();
        int iO91 = schoolGroupsAbility3 != null ? schoolGroupsAbility3.O91() : 0;
        C1214260hhg item4 = getItem();
        int i = (item4 == null || (campusGroup3 = item4.LL) == null || !Intrinsics.LJFF(campusGroup3.isUnseen(), Boolean.TRUE) || !z) ? 0 : 1;
        C1214260hhg item5 = getItem();
        int i2 = (item5 == null || (campusGroup2 = item5.LL) == null || !Intrinsics.LJFF(campusGroup2.isNew(), Boolean.TRUE) || !z) ? 0 : 1;
        C1214260hhg item6 = getItem();
        if (item6 != null && (campusGroup = item6.LL) != null) {
            LJFF = Intrinsics.LJFF(campusGroup.isCustomized(), Boolean.TRUE);
        }
        ?? c2344009Gk2 = new C2344009Gk();
        C1245880iWg.LIZ(c2344009Gk2, c1245860iWe2);
        c2344009Gk2.LJIIIIZZ("enter_method", "click_profile_school");
        c2344009Gk2.LJIIIIZZ("tab_position", enumC338610DPf.getValue());
        c2344009Gk2.LIZJ(iCi2, "my_group_num");
        c2344009Gk2.LIZJ(iO91, "explore_group_num");
        c2344009Gk2.LIZJ(i, "is_group_under_color_blue");
        c2344009Gk2.LIZJ(i2, "is_group_new_tagged");
        c2344009Gk2.LIZJ(LJFF, "is_group_head_customized");
        C20684815ws.LJIILLIIL("ttsocial_school_page_element_show", c2344009Gk2.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIntValue;
        Integer num;
        JoinGroupViewModel joinGroupViewModel;
        NextLiveData nextLiveData;
        CampusGroup campusGroup = ((C1214260hhg) interfaceC1891350zJl).LL;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(campusGroup.groupName);
        }
        Integer num2 = campusGroup.groupMemberCount;
        int i = 0;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(this.itemView.getContext().getResources().getQuantityString(2131755266, iIntValue, String.valueOf(iIntValue)));
        }
        TuxTextView tuxTextView3 = this.LLILZ;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(campusGroup.groupDescription);
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(campusGroup.groupAvatar));
        c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
        c1331670kl3LJIIIIZZ.LJJIIZ(R.drawable.c5w);
        c1331670kl3LJIIIIZZ.LJIJJLI(R.drawable.c5w);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        C1236430iHR c1236430iHR = this.LLILZIL;
        Integer num3 = null;
        if (c1236430iHR != null) {
            C1236440iHS c1236440iHS = new C1236440iHS(campusGroup, (C1231310i9B) this.LLJJJJ.getValue());
            C1236420iHQ c1236420iHQ = c1236430iHR.LLLIIIL;
            c1236420iHQ.LLILLJJLI = c1236440iHS;
            c1236420iHQ.LLILLL = campusGroup;
            c1236420iHQ.LLILZIL = SAFExtensionKt.LJJIII(c1236420iHQ.LL.getContext());
            c1236420iHQ.LLILZ = SAFExtensionKt.LJJIII(c1236420iHQ.LL.getContext());
            CampusGroup campusGroup2 = c1236420iHQ.LLILLL;
            if (campusGroup2 != null) {
                num = campusGroup2.verifyStatus;
            } else {
                num = null;
            }
            c1236420iHQ.LIZIZ(num);
            CampusGroup campusGroup3 = c1236420iHQ.LLILLL;
            if (campusGroup3 != null) {
                num3 = campusGroup3.verifyStatus;
            }
            c1236420iHQ.LIZ(num3);
            if (c1236420iHQ.LLILLL != null) {
                C786410Ut5.I7(new AkS88S0100000_19(c1236420iHQ, 7), c1236420iHQ.LL);
            }
            C19EG c19eg = c1236420iHQ.LLILZIL;
            if (c19eg != null && (joinGroupViewModel = (JoinGroupViewModel) c1236420iHQ.LLILZLL.getValue()) != null && (nextLiveData = joinGroupViewModel.LLILLJJLI) != null) {
                nextLiveData.observe(c19eg, c1236420iHQ);
            }
        }
        if (C1234860iEu.LIZ(campusGroup) == EnumC1234850iEt.EXPLORE) {
            C1007370cJz.LIZ.getClass();
            C1007370cJz.LIZ().storeLong("timestamp_of_enter_group_chat", System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            TuxTag tuxTag = this.LLILZLL;
            if (tuxTag != null) {
                if (!Intrinsics.LJFF(campusGroup.isNew(), Boolean.TRUE)) {
                    i = 8;
                }
                C786410Ut5.LLZLLIL(tuxTag, i);
            }
            if (Intrinsics.LJFF(campusGroup.isUnseen(), Boolean.TRUE)) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, this.itemView.getContext());
                if (numLIZJ != null) {
                    this.itemView.setBackgroundColor(numLIZJ.intValue());
                }
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, this.itemView.getContext());
                if (numLIZJ2 != null) {
                    this.itemView.setBackgroundColor(numLIZJ2.intValue());
                }
            }
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 != null) {
                String string = campusGroup.groupDescription;
                if (!C736460Sui.LIZIZ(string) || string == null) {
                    string = this.itemView.getContext().getString(2131846963);
                }
                tuxTextView4.setText(string);
            }
        } else {
            TuxTag tuxTag2 = this.LLILZLL;
            if (tuxTag2 != null) {
                C786410Ut5.LLZLLIL(tuxTag2, 8);
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zm, this.itemView.getContext());
            if (numLIZJ3 != null) {
                this.itemView.setBackgroundColor(numLIZJ3.intValue());
            }
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 != null) {
                String string2 = campusGroup.groupDescription;
                if (!C736460Sui.LIZIZ(string2) || string2 == null) {
                    string2 = this.itemView.getContext().getString(2131846963);
                }
                tuxTextView5.setText(string2);
            }
        }
        TuxTextView tuxTextView6 = this.LL;
        if (tuxTextView6 != null) {
            C786410Ut5.I7(new AkS58S0200000_19(this, campusGroup, 3), tuxTextView6);
        }
        C427660Gpo c427660Gpo = this.LLILLJJLI;
        if (c427660Gpo != null) {
            C786410Ut5.I7(new AkS58S0200000_19(this, campusGroup, 4), c427660Gpo);
        }
        C786410Ut5.I7(new AkS58S0200000_19(this, campusGroup, 5), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setClipChildren(false);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        C427690Gpr.LJ(linearLayout, 0.0f);
        LinearLayout linearLayout2 = new LinearLayout(viewGroup.getContext());
        linearLayout2.setClipChildren(false);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setClipChildren(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
        layoutParams.setMarginStart(((Number) this.LLJIJIL.getValue()).intValue());
        layoutParams.topMargin = I5();
        layoutParams.bottomMargin = I5();
        linearLayout2.addView(frameLayout, layoutParams);
        C427660Gpo c427660Gpo = new C427660Gpo(viewGroup.getContext(), null, 6, 0);
        c427660Gpo.setStrokeWidth(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        frameLayout.addView(c427660Gpo, new FrameLayout.LayoutParams(-1, -1));
        this.LLILLJJLI = c427660Gpo;
        TuxTag tuxTag = new TuxTag(viewGroup.getContext(), null, 6);
        tuxTag.setText(viewGroup.getContext().getString(2131828294));
        tuxTag.setTuxFont(73);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
        Drawable drawableLIZ = c384050F3z.LIZ(viewGroup.getContext());
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(10);
        c19659111vp.LJ = Integer.valueOf(R.attr.f511p1);
        c19659111vp.LIZ = C418440Gaw.LIZIZ(200);
        tuxTag.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(tuxTag.getContext())));
        tuxTag.setTextColorRes(R.attr.a1h);
        float fLIZIZ = C418440Gaw.LIZIZ(5);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTag);
        tuxTag.setTranslationY(fLIZIZ);
        tuxTag.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        tuxTag.setPadding(((Number) this.LLJJIII.getValue()).intValue(), ((Number) this.LLJJ.getValue()).intValue(), ((Number) this.LLJJIII.getValue()).intValue(), ((Number) this.LLJJI.getValue()).intValue());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        frameLayout.addView(tuxTag, layoutParams2);
        C786410Ut5.LLZLLIL(tuxTag, 8);
        this.LLILZLL = tuxTag;
        LinearLayout linearLayout3 = new LinearLayout(viewGroup.getContext());
        linearLayout3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams3.setMarginStart(((Number) this.LLJ.getValue()).intValue());
        layoutParams3.topMargin = I5();
        layoutParams3.bottomMargin = I5();
        linearLayout2.addView(linearLayout3, layoutParams3);
        LinearLayout linearLayout4 = new LinearLayout(viewGroup.getContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        linearLayout3.addView(linearLayout4, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(viewGroup.getContext());
        linearLayout5.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams4.setMarginEnd(((Number) this.LLJJIJI.getValue()).intValue());
        linearLayout4.addView(linearLayout5, layoutParams4);
        LinearLayout linearLayout6 = new LinearLayout(viewGroup.getContext());
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(16);
        C19ME c19me = new C19ME(-1, -2);
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = ((Number) this.LLJJIJIIJIL.getValue()).intValue();
        linearLayout5.addView(linearLayout6, c19me);
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout6.addView(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        this.LL = tuxTextView;
        LinearLayout linearLayout7 = new LinearLayout(viewGroup.getContext());
        linearLayout7.setOrientation(0);
        linearLayout7.setGravity(16);
        linearLayout5.addView(linearLayout7, new LinearLayout.LayoutParams(-2, -1));
        TuxIconView tuxIconView = new TuxIconView(viewGroup.getContext(), null, 0, 6, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_two_same_person;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        tuxIconView.setTuxIcon(c419910GdJ);
        linearLayout7.addView(tuxIconView, new C19ME(((Number) this.LLJILJILJ.getValue()).intValue(), ((Number) this.LLJILJILJ.getValue()).intValue()));
        TuxTextView tuxTextView2 = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView2.setTuxFont(61);
        tuxTextView2.setTextColorRes(R.attr.a1k);
        tuxTextView2.setMaxLines(1);
        C19ME c19me2 = new C19ME(-2, -2);
        c19me2.setMarginStart(((Number) this.LLJI.getValue()).intValue());
        linearLayout7.addView(tuxTextView2, c19me2);
        this.LLILLL = tuxTextView2;
        C1236430iHR c1236430iHR = new C1236430iHR(viewGroup.getContext());
        C19ME c19me3 = new C19ME(((Number) this.LLIZLLLIL.getValue()).intValue(), ((Number) this.LLIZ.getValue()).intValue());
        c19me3.setMarginEnd(((Number) this.LLJILJIL.getValue()).intValue());
        linearLayout4.addView(c1236430iHR, c19me3);
        c1236430iHR.setButtonSize(1);
        this.LLILZIL = c1236430iHR;
        TuxTextView tuxTextView3 = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView3.setTextDirection(1);
        tuxTextView3.setMaxLines(2);
        tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView3.setTuxFont(61);
        tuxTextView3.setTextColorRes(R.attr.a1j);
        C19ME c19me4 = new C19ME(-2, -2);
        c19me4.setMarginEnd(((Number) this.LLJILJIL.getValue()).intValue());
        ((ViewGroup.MarginLayoutParams) c19me4).topMargin = ((Number) this.LLJJIJIIJIL.getValue()).intValue();
        linearLayout3.addView(tuxTextView3, c19me4);
        this.LLILZ = tuxTextView3;
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.b2t);
        View view = new View(viewGroup.getContext());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, viewGroup.getContext());
        if (numLIZJ != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, dimensionPixelSize);
        layoutParams5.setMarginStart(((Number) this.LLJIJIL.getValue()).intValue());
        layoutParams5.setMarginEnd(((Number) this.LLJILJIL.getValue()).intValue());
        linearLayout.addView(view, layoutParams5);
        return linearLayout;
    }

    public final void L5(CampusGroup campusGroup, EnumC1236450iHT enumC1236450iHT) {
        boolean z;
        C1245860iWe c1245860iWe;
        int iIntValue;
        int i;
        int i2 = 1;
        if (C1234860iEu.LIZ(campusGroup) == EnumC1234850iEt.EXPLORE) {
            z = true;
        } else {
            z = false;
        }
        C0DOO c0doo = C0DOO.LIZ;
        ContainerAbility containerAbility = (ContainerAbility) this.LLJJJ.getValue();
        if (containerAbility == null || (c1245860iWe = containerAbility.getEnterFrom()) == null) {
            c1245860iWe = new C1245860iWe(EnumC1231460i9Q.FIND_FRIENDS_PAGE, null, null);
        }
        EnumC338610DPf enumC338610DPf = EnumC338610DPf.GROUP;
        Integer num = campusGroup.groupMemberCount;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Boolean boolIsUnseen = campusGroup.isUnseen();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolIsUnseen, bool) && z) {
            i = 1;
        } else {
            i = 0;
        }
        if (!Intrinsics.LJFF(campusGroup.isNew(), bool) || !z) {
            i2 = 0;
        }
        boolean zLJFF = Intrinsics.LJFF(campusGroup.isCustomized(), bool);
        c0doo.getClass();
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LJIIIIZZ("enter_method", "click_profile_school");
        c2344009Gk.LJIIIIZZ("tab_position", enumC338610DPf.getValue());
        c2344009Gk.LJIIIIZZ("area_click", enumC1236450iHT.getParamValue());
        c2344009Gk.LIZJ(iIntValue, "group_members");
        c2344009Gk.LIZJ(i, "is_group_under_color_blue");
        c2344009Gk.LIZJ(i2, "is_group_new_tagged");
        c2344009Gk.LIZJ(zLJFF ? 1 : 0, "is_group_head_customized");
        C20684815ws.LJIILLIIL("ttsocial_school_page_element_click", c2344009Gk.LIZ);
        JoinGroupViewModel joinGroupViewModel = (JoinGroupViewModel) this.LLJJJIL.getValue();
        if (joinGroupViewModel != null) {
            joinGroupViewModel.vQ2(campusGroup, this.itemView.getContext(), this.itemView, (C1231310i9B) this.LLJJJJ.getValue());
        }
    }
}
