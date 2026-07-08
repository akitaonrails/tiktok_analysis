package com.ss.android.ugc.aweme.feed.assem.container;

import X.C01GW;
import X.C09R3;
import X.C0H9H;
import X.C0HCN;
import X.C0HHT;
import X.C0SXF;
import X.C13LE;
import X.C14TF;
import X.C1637806bA;
import X.C1637906bB;
import X.C17977072h;
import X.C19719912Dl;
import X.C2189821An6;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C692680RFa;
import X.C695370RPj;
import X.C723830SaL;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C725080ScM;
import X.C732110Snh;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1350790lFt;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class RightAreaContainerAssem extends FeedBaseContentAssem<RightAreaContainerAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final int LLJLL;
    public static final int LLJLLIL;
    public static final int LLJLLL;
    public final C692680RFa LLJJJJ;
    public final BaseFeedPageParams LLJJJJJIL;
    public final Function0<Long> LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public boolean LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RightAreaContainerAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(RightAreaContainerAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
        LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(22.5d)));
    }

    public final RightAreaContainerVM cp() {
        return (RightAreaContainerVM) this.LLJJL.getValue(this, LLJLILLLLZIIL[0]);
    }

    public final void dp(boolean z) {
        if (z) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL.getVisibility() != 0) {
                HandlerHook.viewPost(viewLJJIJL, new ARunnableS111S0100000_11(this, 18));
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS111S0100000_11(this, 19), 100L);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        RelativeLayout.LayoutParams layoutParams;
        Object obj;
        dp(false);
        cp().getClass();
        view.findViewById(R.id.bj1).setTag(R.id.em8, "feed_avatar");
        view.findViewById(R.id.fu8).setTag(R.id.em8, "feed_digg");
        view.findViewById(R.id.ebx).setTag(R.id.em8, "feed_comment");
        view.findViewById(R.id.uzs).setTag(R.id.em8, "feed_share");
        if (!C0SXF.LJIL(view.getContext())) {
            view.findViewById(R.id.ol2).setTag(R.id.em8, "feed_more");
        }
        if (((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJIIJJI() > 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            int iLIZIZ = (LLJLL - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C732110Snh.LJ())))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(C732110Snh.LIZLLL())));
            Context context = getContext();
            if (context != null && C0SXF.LJIL(context)) {
                C695370RPj c695370RPj = C695370RPj.LIZ;
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Aweme aweme = ((VideoItemParams) obj).getAweme();
                c695370RPj.getClass();
                if (C695370RPj.LIZ(aweme).LIZ()) {
                    if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                        layoutParams3.addRule(12);
                        layoutParams3.addRule(21);
                        layoutParams3.setMarginEnd(LLJLLIL);
                    }
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.tlr);
                    linearLayout.setOrientation(0);
                    C0H9H.LIZJ(LLJLLL, linearLayout);
                } else {
                    if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams2).addRule(12);
                    }
                    LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.tlr);
                    linearLayout2.setGravity(1);
                    C0H9H.LIZJ(LLJLLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), linearLayout2);
                    if (C0HCN.LIZIZ()) {
                        C0H9H.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), linearLayout2);
                    }
                }
            } else if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.bottomMargin = iLIZIZ;
            }
            C786410Ut5.W5(view, layoutParams2);
        }
        synchronized (this) {
            if (!this.LLJLIL) {
                C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 381));
                this.LLJLIL = true;
            }
        }
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 214);
        if (C17977072h.LIZ()) {
            C725080ScM.LIZ().execute(new ARunnableS111S0100000_11(awS555S0100000_11, 20));
        } else {
            awS555S0100000_11.invoke();
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJL.getValue(), new C2217381BqS() { // from class: X.0RL6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(44), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        C2189821An6 c2189821An6;
        Context context;
        VideoItemParams videoItemParams2 = videoItemParams;
        InterfaceC1350790lFt interfaceC1350790lFtLJIILL = C14TF.LIZIZ.LJIILL();
        Aweme aweme = videoItemParams2.getAweme();
        BaseFeedPageParams baseFeedPageParams = videoItemParams2.baseFeedPageParams;
        if (baseFeedPageParams != null) {
            c2189821An6 = baseFeedPageParams.param;
        } else {
            c2189821An6 = null;
        }
        if (interfaceC1350790lFtLJIILL.LJIILJJIL(aweme, c2189821An6) && (context = getContext()) != null && !C0SXF.LJIL(context)) {
            C723830SaL.LJ(this, C13LE.LIZ(TakoAssem.class), true, null);
        }
    }

    public RightAreaContainerAssem(C692680RFa c692680RFa, BaseFeedPageParams baseFeedPageParams, Function0<Long> function0) {
        this.LLJJJJ = c692680RFa;
        this.LLJJJJJIL = baseFeedPageParams;
        this.LLJJJJLIIL = function0;
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RightAreaContainerVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 215), null, AFwS243S0000000_11.get$arr$(58));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoDiggVM.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 216), null, AFwS243S0000000_11.get$arr$(59));
        this.LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(60));
    }
}
