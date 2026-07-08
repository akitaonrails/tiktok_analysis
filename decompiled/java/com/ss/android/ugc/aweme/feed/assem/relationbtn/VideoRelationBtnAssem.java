package com.ss.android.ugc.aweme.feed.assem.relationbtn;

import X.C01GW;
import X.C0HHT;
import X.C0RFL;
import X.C0RP1;
import X.C0T0Y;
import X.C1022820ciu;
import X.C11NJ;
import X.C1245620iWG;
import X.C1246130iX5;
import X.C1387050mCN;
import X.C1388190mED;
import X.C13BV;
import X.C13LE;
import X.C1590970rVH;
import X.C1591220rVg;
import X.C1637806bA;
import X.C1637906bB;
import X.C197039127h;
import X.C19719912Dl;
import X.C1AA2;
import X.C2174831A9p;
import X.C2184171Adz;
import X.C2189791An3;
import X.C2217381BqS;
import X.C299790Bp3;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C487280J9a;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1387060mCO;
import X.EnumC700430Rdh;
import X.EnumC742830TBx;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import Y.ACListenerS115S0200000_11;
import Y.ACListenerS124S0200000_21;
import Y.ACListenerS135S0200000_33;
import Y.ALAdapterS27S0100000_33;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS133S0100000_33;
import Y.AUListenerS56S0201000_6;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS119S0110000_33;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class VideoRelationBtnAssem extends BaseCellSlotComponent<VideoRelationBtnAssem> implements InterfaceC487330J9f {
    public static final C1AA2 LLLILZJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public static final C01GW<Float> LLLIZZ;
    public static final C01GW<Float> LLLJ;
    public View LLJLLIL;
    public RelationButton LLJLLL;
    public C197039127h LLJZ;
    public C197039127h LLJZIJLIL;
    public Aweme LLL;
    public int LLLF = -1;
    public int LLLFF = -1;
    public final InterfaceC1731706qJ LLLFFI;
    public final C01GW LLLFZ;
    public final InterfaceC1731706qJ LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final InterfaceC1731706qJ LLLIIIIL;
    public final C01GW LLLIIIL;
    public ARunnableS133S0100000_33 LLLIIL;
    public String LLLIILIL;
    public List<Integer> LLLIL;
    public final C11NJ LLLILZ;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1AA2] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoRelationBtnAssem.class, "relationBtnVM", "getRelationBtnVM()Lcom/ss/android/ugc/aweme/feed/assem/relationbtn/VideoRelationBtnVM;", 0);
        C13LE.LIZ.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(VideoRelationBtnAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0), new C2217381BqS(VideoRelationBtnAssem.class, "userCardVM", "getUserCardVM()Lcom/ss/android/ugc/aweme/feed/assem/usercard/VideoUserCardVM;", 0)};
        LLLILZJ = new Object() { // from class: X.1AA2
        };
        LLLIZZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(260));
        LLLJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(261));
    }

    public VideoRelationBtnAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoRelationBtnVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLFFI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ, 481), null, AFwS279S0000000_33.get$arr$(122));
        this.LLLFZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS279S0000000_33.get$arr$(125));
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoDiggVM.class);
        this.LLLI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ2, 482), null, AFwS279S0000000_33.get$arr$(123));
        this.LLLII = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS279S0000000_33.get$arr$(126));
        this.LLLIIII = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS279S0000000_33.get$arr$(127));
        C0RP1 c0rp1 = C0RP1.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(VideoUserCardVM.class);
        this.LLLIIIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0rp1, c1637906bB, new AwS556S0100000_12(c19719912DlLIZ3, 483), null, AFwS279S0000000_33.get$arr$(124));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2172));
        this.LLLIL = C13BV.INSTANCE;
        this.LLLILZ = new C11NJ();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b9y;
    }

    public final VideoRelationBtnVM Gp() {
        return (VideoRelationBtnVM) this.LLLFFI.getValue(this, LLLILZLLLI[0]);
    }

    public final void Ip() {
        View view = this.LLJLLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        RelationButton relationButton = this.LLJLLL;
        if (relationButton != null) {
            C786410Ut5.t0(relationButton, 8);
        }
        C197039127h c197039127h = this.LLJZ;
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 8);
        }
        if (C299790Bp3.LIZIZ(this.LLL, "bottom_button_user_suggestion")) {
            Ap(false);
        } else {
            HandlerHook.viewPost(LJJIJL(), new ARunnableS106S0100000_6(this, 60));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        this.LLLILZ.dispose();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C487280J9a.LIZJ(this);
        if (C0RFL.LIZ()) {
            onDestroyView();
        }
    }

    public final void Fp(long j) {
        if (this.LLL == null || this.LLJLLIL == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.LLJLLIL;
        LLLILZJ.getClass();
        animatorSet.play(Ep(1, view, LLLJ.getValue().floatValue(), 0.0f, 250L)).with(Ep(2, this.LLJLLIL, 1.0f, 0.0f, 250L));
        animatorSet.setStartDelay(j);
        animatorSet.addListener(new ALAdapterS27S0100000_33(this, 6));
        animatorSet.start();
    }

    public final void Jp(boolean z) {
        C736680Sv4.LJIJJ(Gp(), new AwS119S0110000_33(this, z, 0));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Activity activityLIZ;
        this.LLJLLIL = view.findViewById(R.id.tqy);
        this.LLJLLL = (RelationButton) view.findViewById(R.id.cqh);
        this.LLJZ = (C197039127h) view.findViewById(R.id.csh);
        this.LLJZIJLIL = (C197039127h) view.findViewById(R.id.up7);
        C197039127h c197039127h = this.LLJZ;
        if (c197039127h != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            c197039127h.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.1A9u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159310gH3) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS321S0000000_33.get$arr$(15), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.1AA1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159310gH3) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS321S0000000_33.get$arr$(6), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.1A9x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159310gH3) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS321S0000000_33.get$arr$(7), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.1A9y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159310gH3) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS321S0000000_33.get$arr$(8), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLII.getValue(), new C2217381BqS() { // from class: X.0S1z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJI;
            }
        }, null, AFwS321S0000000_33.get$arr$(9), 6);
        selectSubscribe((AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0RnF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJI;
            }
        }, new C2217381BqS() { // from class: X.1A9z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJIJIL;
            }
        }, new C2217381BqS() { // from class: X.0mFl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILJIL;
            }
        }, C736820SvI.LIZLLL(), null, C2189791An3.get$arr$(0));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLI.getValue(this, LLLILZLLLI[1]), new C2217381BqS() { // from class: X.0RnD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730490Sl5) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), AFwS321S0000000_33.get$arr$(10), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIII.getValue(), new C2217381BqS() { // from class: X.0RoI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS321S0000000_33.get$arr$(11), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLIIII.getValue(), new C2217381BqS() { // from class: X.0RoJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS321S0000000_33.get$arr$(12), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0RnI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLILZLL;
            }
        }, null, AFwS321S0000000_33.get$arr$(13), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(), new C2217381BqS() { // from class: X.0RoK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, null, AFwS321S0000000_33.get$arr$(14), 6);
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C487280J9a.LIZ(activityLIZ.hashCode(), this);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        User author;
        List<Integer> canMessageFollowStatusList;
        User author2;
        MatchedFriendStruct matchedFriendStruct;
        SchoolMutualStruct schoolMutualStruct;
        LifecycleOwner lifecycleOwnerLIZ;
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLLIILIL = videoItemParams2.mEventType;
        User author3 = videoItemParams2.getAweme().getAuthor();
        RelationButton relationButton = this.LLJLLL;
        if (author3 != null && relationButton != null) {
            if (C1591220rVg.LIZLLL()) {
                lifecycleOwnerLIZ = this;
            } else {
                lifecycleOwnerLIZ = C1590970rVH.LIZ(this);
            }
            C1387050mCN c1387050mCN = new C1387050mCN(author3);
            c1387050mCN.LJIIJJI = lifecycleOwnerLIZ;
            c1387050mCN.LJ = EnumC1387060mCO.FRIENDS;
            relationButton.LLLLZIL(c1387050mCN.LIZ());
        }
        Aweme aweme = videoItemParams2.getAweme();
        if (aweme != null && (author2 = aweme.getAuthor()) != null && (matchedFriendStruct = author2.getMatchedFriendStruct()) != null && (schoolMutualStruct = matchedFriendStruct.schoolMutualStruct) != null) {
            str = schoolMutualStruct.button;
        } else {
            str = null;
        }
        if (C1245620iWG.LIZ() && str != null && str.length() != 0) {
            RelationButton relationButton2 = this.LLJLLL;
            if (relationButton2 != null) {
                relationButton2.setText(str);
            }
            C1246130iX5 c1246130iX5 = C1246130iX5.LIZ;
            Aweme aweme2 = videoItemParams2.getAweme();
            c1246130iX5.getClass();
            C1246130iX5.LIZ(aweme2, false);
        }
        RelationButton relationButton3 = this.LLJLLL;
        if (relationButton3 != null) {
            setComponentClickStatusExperimental(relationButton3, EnumC700430Rdh.POSITIVE);
        }
        C197039127h c197039127h = this.LLJZIJLIL;
        if (c197039127h != null) {
            setComponentClickStatusExperimental(c197039127h, EnumC700430Rdh.POSITIVE);
        }
        C197039127h c197039127h2 = this.LLJZ;
        if (c197039127h2 != null) {
            setComponentClickStatusExperimental(c197039127h2, EnumC700430Rdh.NEGATIVE);
        }
        RelationButton relationButton4 = this.LLJLLL;
        if (relationButton4 != null) {
            C786410Ut5.pa(relationButton4, new ACListenerS135S0200000_33(videoItemParams2, this, 16));
        }
        C197039127h c197039127h3 = this.LLJZ;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS115S0200000_11(this, videoItemParams2, 35));
        }
        C197039127h c197039127h4 = this.LLJZIJLIL;
        if (c197039127h4 != null) {
            C786410Ut5.U8(c197039127h4, new ACListenerS124S0200000_21(videoItemParams2, this, 77));
        }
        this.LLL = videoItemParams2.getAweme();
        VideoRelationBtnVM videoRelationBtnVMGp = Gp();
        Aweme aweme3 = this.LLL;
        videoRelationBtnVMGp.getClass();
        Integer numLIZIZ = C2174831A9p.LIZIZ(aweme3);
        boolean zLIZ = C2174831A9p.LIZ(aweme3, numLIZIZ);
        videoRelationBtnVMGp.LL = numLIZIZ;
        videoRelationBtnVMGp.setState(new AwS32S0010000_18(zLIZ, 23));
        C0T0Y.LIZJ(aweme3, !zLIZ);
        Aweme aweme4 = this.LLL;
        if (aweme4 != null && (author = aweme4.getAuthor()) != null && (canMessageFollowStatusList = author.getCanMessageFollowStatusList()) != null) {
            this.LLLIL = canMessageFollowStatusList;
        }
    }

    public final void Bp(String str, boolean z) {
        String str2;
        AwemeRawAd awemeRawAd;
        if (Intrinsics.LJFF(Gp().LL, EnumC742830TBx.AD.getValue())) {
            if (z) {
                str2 = "button";
            } else {
                str2 = "multi_button";
            }
            Aweme aweme = this.LLL;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", str, awemeRawAd);
            c1022820ciuLIZLLL.LIZJ(str2, "refer");
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        View view = this.LLJLLIL;
        if (view != null) {
            view.invalidate();
        }
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    public final ValueAnimator Ep(int i, View view, float f, float f2, long j) {
        if (view == null) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS56S0201000_6(this, view, i, 0));
        return valueAnimatorOfFloat;
    }
}
