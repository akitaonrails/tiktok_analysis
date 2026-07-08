package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0CAU;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1606820ruq;
import X.C1608680rxq;
import X.C1608750rxx;
import X.C189200o6;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C337180DJs;
import X.C339190DRl;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452501pT;
import X.C706480RnS;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737760Swo;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1256840ioM;
import X.EnumC1606080rte;
import X.EnumC1607270rvZ;
import X.EnumC1608710rxt;
import X.InterfaceC1320850kTb;
import X.InterfaceC1606880ruw;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS191S1100000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class StoryGuideCardSingleAvatarComponent extends BaseStoryGuideCardAvatarComponent<StoryGuideCardSingleAvatarComponent> {
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 668));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 672));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 673));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 671));
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(154));
    public boolean LLLIIII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fcb;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 669);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_guide_card_single_avatar", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.BaseStoryGuideCardAvatarComponent
    public final List<Aweme> Fp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return Collections.singletonList(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
    }

    public final AvatarComponentView Qp() {
        return (AvatarComponentView) this.LLLFF.getValue();
    }

    public final TuxTextView Tp() {
        return (TuxTextView) this.LLLI.getValue();
    }

    public final TuxTextView Up() {
        return (TuxTextView) this.LLLFFI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.BaseStoryGuideCardAvatarComponent
    public final void Gp() {
        View viewFindViewById;
        AvatarComponentView avatarComponentViewQp = Qp();
        if (avatarComponentViewQp == null || (viewFindViewById = avatarComponentViewQp.findViewById(C1608680rxq.LIZIZ(EnumC1607270rvZ.STORY, EnumC1608710rxt.RING, null))) == null) {
            return;
        }
        viewFindViewById.performClick();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.component.BaseStoryGuideCardAvatarComponent
    public final void Ip() {
        View viewFindViewById;
        AvatarComponentView avatarComponentViewQp = Qp();
        if (avatarComponentViewQp == null || (viewFindViewById = avatarComponentViewQp.findViewById(C1608680rxq.LIZIZ(EnumC1607270rvZ.STORY, EnumC1608710rxt.RING, null))) == null) {
            return;
        }
        viewFindViewById.performClick();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        AvatarComponentView avatarComponentViewQp = Qp();
        if (avatarComponentViewQp != null) {
            avatarComponentViewQp.LJI(EnumC1607270rvZ.STORY, EnumC1256840ioM.END_ANIMATION, null);
        }
        Wp(false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        try {
            C337180DJs.LIZJ(getContentView());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        try {
            C339190DRl.LIZIZ(getContentView());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        Wp(false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        Wp(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Vp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardSingleAvatarComponent.rr(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public final void Wp(boolean z) {
        C427660Gpo avatar;
        InterfaceC1320850kTb controller;
        Animatable animatableLIZ;
        if (this.LLLIIII != z) {
            this.LLLIIII = z;
            AvatarComponentView avatarComponentViewQp = Qp();
            if (avatarComponentViewQp != null && (avatar = avatarComponentViewQp.getAvatar()) != null && (controller = avatar.getController()) != null && (animatableLIZ = controller.LIZ()) != null) {
                if (this.LLLIIII && !animatableLIZ.isRunning()) {
                    C0CAU.LIZIZ(new ARunnableS104S0100000_4(animatableLIZ, 111));
                } else {
                    if (this.LLLIIII || !animatableLIZ.isRunning()) {
                        return;
                    }
                    C0CAU.LIZIZ(new ARunnableS104S0100000_4(animatableLIZ, 112));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String eventType;
        C2189821An6 c2189821An6;
        super.onViewCreated(view);
        BaseFeedPageParams baseFeedPageParams = jm().LJ;
        String string = null;
        if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (eventType = c2189821An6.getEventType()) == null) {
            eventType = "";
        }
        TuxTextView tuxTextViewTp = Tp();
        if (tuxTextViewTp != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131825039);
            }
            tuxTextViewTp.setText(string);
        }
        C1606750ruj c1606750ruj = new C1606750ruj(EnumC1606080rte.STORY_GUIDE_CARD, new C1606770rul(null, new AwS191S1100000_11(eventType, this, 0), null, new AwS625S0100000_11(this, 52), new AwS555S0100000_11(this, 670), AFwS198S0000000_11.get$arr$(155), null, null, null, 453), 4);
        AvatarComponentView avatarComponentViewQp = Qp();
        if (avatarComponentViewQp != null) {
            C1608750rxx config = avatarComponentViewQp.getConfig();
            new AwS590S0100000_11(this, 196).invoke(config.LIZ);
            config.LIZJ(new C737760Swo(c1606750ruj));
            new AwS590S0100000_11(this, 197).invoke(config.LIZJ);
            avatarComponentViewQp.LJFF(avatarComponentViewQp.getConfig());
        }
        if (((Boolean) this.LLLII.getValue()).booleanValue()) {
            AvatarComponentView avatarComponentViewQp2 = Qp();
            if (avatarComponentViewQp2 != null) {
                avatarComponentViewQp2.LJIILJJIL(72, 88);
            }
            View view2 = (View) this.LLLFZ.getValue();
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    C786410Ut5.W5(view2, marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            TuxTextView tuxTextViewUp = Up();
            if (tuxTextViewUp != null) {
                tuxTextViewUp.setTuxFont(23);
            }
        } else {
            AvatarComponentView avatarComponentViewQp3 = Qp();
            if (avatarComponentViewQp3 != null) {
                avatarComponentViewQp3.LJIILJJIL(96, 112);
            }
            View view3 = (View) this.LLLFZ.getValue();
            if (view3 != null) {
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    marginLayoutParams2.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    marginLayoutParams2.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    C786410Ut5.W5(view3, marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            TuxTextView tuxTextViewUp2 = Up();
            if (tuxTextViewUp2 != null) {
                tuxTextViewUp2.setTuxFont(13);
            }
        }
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Rxm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C712870Rxl) obj).LL;
            }
        }, null, new AwS625S0100000_11((BaseStoryGuideCardAvatarComponent) this, (BaseStoryGuideCardAvatarComponent<C03H5>) 132), 6);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Rxn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C712870Rxl) obj).LLILLJJLI;
            }
        }, null, new AwS625S0100000_11((BaseStoryGuideCardAvatarComponent) this, (BaseStoryGuideCardAvatarComponent<C03H5>) 133), 6);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Rxo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C712870Rxl) obj).LLILLL;
            }
        }, null, new AwS625S0100000_11((BaseStoryGuideCardAvatarComponent) this, (BaseStoryGuideCardAvatarComponent<C03H5>) 134), 6);
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Rxp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C712870Rxl) obj).LLILZ;
            }
        }, null, new AwS625S0100000_11((BaseStoryGuideCardAvatarComponent) this, (BaseStoryGuideCardAvatarComponent<C03H5>) 135), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        InterfaceC1606880ruw interfaceC1606880ruw;
        String simpleName;
        AvatarComponentView avatarComponentViewQp;
        Map<EnumC1607270rvZ, InterfaceC1606880ruw> currentActiveBusiness;
        AvatarComponentView avatarComponentViewQp2 = Qp();
        if (avatarComponentViewQp2 != null && (currentActiveBusiness = avatarComponentViewQp2.getCurrentActiveBusiness()) != null) {
            interfaceC1606880ruw = currentActiveBusiness.get(EnumC1607270rvZ.STORY);
        } else {
            interfaceC1606880ruw = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderSelected, storyState = ");
        if (interfaceC1606880ruw != null) {
            simpleName = interfaceC1606880ruw.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(",  position:");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if ((interfaceC1606880ruw instanceof C1606820ruq) && (avatarComponentViewQp = Qp()) != null) {
            avatarComponentViewQp.LJI(EnumC1607270rvZ.STORY, EnumC1256840ioM.START_ANIMATION, null);
        }
        Wp(true);
    }
}
