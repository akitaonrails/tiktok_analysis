package com.ss.android.ugc.aweme.upvote.detail.videorepost;

import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C1359350lTh;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C1A5L;
import X.C2174761A9i;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C452501pT;
import X.C724750Sbp;
import X.C731980SnU;
import X.C732030SnZ;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C738880Syc;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoRepostAssem extends BaseCellSlotComponent<VideoRepostAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public View LLJLLIL;
    public C731980SnU LLJLLL;
    public TuxTextView LLJZ;
    public C732030SnZ LLJZIJLIL;
    public boolean LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final ACListenerS146S0100000_11 LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoRepostAssem.class, "repostVM", "getRepostVM()Lcom/ss/android/ugc/aweme/upvote/detail/videorepost/VideoRepostVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoRepostAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        c09r3.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoRepostAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoRepostVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 1122), null, AFwS243S0000000_11.get$arr$(544));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(RightAreaContainerVM.class);
        this.LLLFF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 1123), null, AFwS243S0000000_11.get$arr$(545));
        this.LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(546));
        this.LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1124));
        this.LLLI = new ACListenerS146S0100000_11(this, 42);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.i6o;
    }

    public final VideoRepostVM Bp() {
        return (VideoRepostVM) this.LLLF.getValue(this, LLLII[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLLFZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C738880Syc(this, 2));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = view.findViewById(R.id.t9n);
        this.LLJLLL = (C731980SnU) view.findViewById(R.id.t_b);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.t9p);
        View view2 = this.LLJLLIL;
        TuxTextView tuxTextView = null;
        if (view2 == null) {
            view2 = null;
        }
        setComponentClickStatusExperimental(view2, EnumC700430Rdh.POSITIVE);
        View view3 = this.LLJLLIL;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.I7(this.LLLI, view3);
        if (C2174761A9i.LIZIZ()) {
            C786410Ut5.I7(this.LLLI, getContentView());
            View contentView = getContentView();
            C01GW c01gw = C2271381DvM.LLJL;
            C2271391DvN.LIZ(contentView, (C1A5L) c01gw.getValue());
            C786410Ut5.I7(this.LLLI, LJJIJL());
            C2271391DvN.LIZ(LJJIJL(), (C1A5L) c01gw.getValue());
        }
        View view4 = this.LLJLLIL;
        if (view4 == null) {
            view4 = null;
        }
        C2271391DvN.LIZ(view4, (C1A5L) C2271381DvM.LLJJLIIIJLLLLLLLZ.getValue());
        C736680Sv4.LJIIIIZZ(this, Bp(), new C2217381BqS() { // from class: X.0Snk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C732160Snm) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(256), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(this, LLLII[1]), new C2217381BqS() { // from class: X.0RQq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C695520RPy) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(257), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0NzA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(258), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0Nkv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(259), 6);
        C732030SnZ c732030SnZ = new C732030SnZ();
        c732030SnZ.LIZJ = LJJIJL();
        c732030SnZ.LIZLLL = view.findViewById(R.id.tau);
        View view5 = this.LLJLLIL;
        if (view5 == null) {
            view5 = null;
        }
        c732030SnZ.LJ = view5;
        C731980SnU c731980SnU = this.LLJLLL;
        if (c731980SnU == null) {
            c731980SnU = null;
        }
        c732030SnZ.LJFF = c731980SnU;
        TuxTextView tuxTextView2 = this.LLJZ;
        if (tuxTextView2 != null) {
            tuxTextView = tuxTextView2;
        }
        c732030SnZ.LJI = tuxTextView;
        this.LLJZIJLIL = c732030SnZ;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        C731980SnU c731980SnU = this.LLJLLL;
        if (c731980SnU == null) {
            c731980SnU = null;
        }
        c731980SnU.LJ();
        C1359350lTh.LIZIZ(C1359350lTh.LIZ, videoItemParams2.mEventType, "expose_button", videoItemParams2.getAweme(), "expose_button", null, false, 0.0d, null, null, null, null, null, 4080);
    }
}
