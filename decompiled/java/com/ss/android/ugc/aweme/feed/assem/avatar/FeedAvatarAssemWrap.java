package com.ss.android.ugc.aweme.feed.assem.avatar;

import X.C01GW;
import X.C0HHT;
import X.C0RQS;
import X.C0RQT;
import X.C0RQU;
import X.C0RRB;
import X.C0SE1;
import X.C0SXF;
import X.C0SZ0;
import X.C13LE;
import X.C1602720roE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2174761A9i;
import X.C2174771A9j;
import X.C2189821An6;
import X.C2217381BqS;
import X.C328100Ctc;
import X.C452501pT;
import X.C692200RDe;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C709140Rrk;
import X.C723210SYl;
import X.C723220SYm;
import X.C723230SYn;
import X.C723260SYq;
import X.C723280SYs;
import X.C723290SYt;
import X.C723300SYu;
import X.C723310SYv;
import X.C723830SaL;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAvatarAssemWrap extends BaseCellSlotComponent<FeedAvatarAssemWrap> implements ComponentPriorityProtocol {
    public static final C1602720roE LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C0RRB(this));
    public final InterfaceC1731706qJ LLJLLL;
    public C0SZ0 LLJZ;
    public final C01GW LLJZIJLIL;
    public boolean LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final C01GW LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedAvatarAssemWrap.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(FeedAvatarAssemWrap.class, "feedAvatarLiveVM", "getFeedAvatarLiveVM()Lcom/ss/android/ugc/aweme/feed/assem/avatar/FeedAvatarLiveVM;", 0), new C2217381BqS(FeedAvatarAssemWrap.class, "eventDispatchVM", "getEventDispatchVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoEventDispatchViewModel;", 0)};
        LLLFZ = new C1602720roE();
    }

    public FeedAvatarAssemWrap() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RightAreaContainerVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new C0RQS(c19719912DlLIZ), null, new C723280SYs());
        this.LLJZIJLIL = C452501pT.LIZIZ(new C723260SYq());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedAvatarLiveVM.class);
        this.LLLF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new C0RQT(c19719912DlLIZ2), null, new C723290SYt());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(VideoEventDispatchViewModel.class);
        this.LLLFF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0hht, c1637906bB, new C0RQU(c19719912DlLIZ3), null, new C723300SYu());
        this.LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C723310SYv());
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_avatar";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    private final boolean Gp() {
        C2189821An6 c2189821An6;
        C724270Sb3 c724270Sb3 = this.LLJI;
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).baseFeedPageParams;
        return (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || c2189821An6.getCurrentProfileUserRoomId() <= 0) ? false : true;
    }

    public final boolean Ep() {
        return ((Boolean) this.LLJZIJLIL.getValue()).booleanValue();
    }

    public final FeedAvatarLiveVM Fp() {
        return (FeedAvatarLiveVM) this.LLLF.getValue(this, LLLI[1]);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public int Oo() {
        return C0SXF.LJIL(getContext()) ? R.layout.b8i : R.layout.b8t;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public static User Bp(VideoItemParams videoItemParams) {
        String str;
        C2189821An6 c2189821An6;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        String uid = null;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            uid = c2189821An6.getUid();
        }
        String str2 = "";
        if (uid == null) {
            uid = "";
        }
        if (C0SE1.LIZ()) {
            Aweme aweme = videoItemParams.getAweme();
            BaseFeedPageParams baseFeedPageParams2 = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams2 != null && (str = baseFeedPageParams2.eventType) != null) {
                str2 = str;
            }
            return C328100Ctc.LIZ(aweme, uid, str2);
        }
        return videoItemParams.getAweme().getAuthor();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        if (Ep()) {
            C723830SaL.LIZ(this, null, new C692200RDe(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.Object] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ip, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r27) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap.tp(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C709140Rrk c709140Rrk;
        C0SZ0 c0sz0;
        super.onViewCreated(view);
        Object obj = null;
        if (C2174761A9i.LIZIZ() || (LowScreenOptimizeAB.LIZIZ() && C2174771A9j.LIZJ())) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.bi2);
            if ((relativeLayout instanceof C709140Rrk) && (c709140Rrk = (C709140Rrk) relativeLayout) != null) {
                c709140Rrk.LIZ();
            }
        }
        if (!Ep()) {
            C723830SaL.LIZ(this, null, new C692200RDe(this));
        }
        Context context = getContext();
        if (context != null && !C0SXF.LJIL(context)) {
            c0sz0 = new C0SZ0();
        } else {
            c0sz0 = new C0SZ0() { // from class: X.0SYw
                public final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(362));
                public final int LJIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));

                @Override // X.C0SZ0, X.AbstractC731360SmU
                public final void LIZ() {
                }

                public final int LJIIIIZZ() {
                    return ((Number) this.LJIIZILJ.getValue()).intValue();
                }

                {
                    this.LIZ = false;
                }

                @Override // X.C0SZ0
                public final void LJII(C731160SmA c731160SmA) {
                    ViewGroup.LayoutParams layoutParams;
                    if (C726220SeC.LIZIZ.LIZLLL()) {
                        return;
                    }
                    View view2 = this.LIZLLL;
                    if (view2 != null) {
                        view2.getLayoutParams().width = -2;
                        C426750GoL.LJIIIZ(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZJ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZLLL)))), null, false, 26);
                    }
                    View view3 = this.LJI;
                    if (view3 != null) {
                        C618720OOo.LIZIZ(view3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))));
                        C426750GoL.LJIIIZ(view3, null, 0, null, null, false, 29);
                    }
                    LJ(new AwS590S0100000_11(c731160SmA, 408));
                    View view4 = this.LJ;
                    if (view4 != null) {
                        int i = this.LJIJ;
                        C618720OOo.LIZIZ(view4, i, i);
                        C426750GoL.LJIIIZ(view4, null, Integer.valueOf((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZIZ))) - (LJIIIIZZ() / 2)) + ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZIZ)))) / 2)), null, null, false, 29);
                        View viewFindViewById = view4.findViewById(R.id.iet);
                        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null && layoutParams.height > 0) {
                            C426750GoL.LJIIL(view4, null, null, null, Integer.valueOf(this.LJIJ - viewFindViewById.getLayoutParams().height), 23);
                        } else {
                            C426750GoL.LJIIL(view4, null, null, null, Integer.valueOf((this.LJIJ - LJIIIIZZ()) - ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZ))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(c731160SmA.LIZIZ)))) / 2)), 23);
                        }
                    }
                    View view5 = this.LJFF;
                    if (view5 != null) {
                        C618720OOo.LIZIZ(view5, LJIIIIZZ(), LJIIIIZZ());
                    }
                }
            };
        }
        this.LLJZ = c0sz0;
        c0sz0.LIZJ = view;
        c0sz0.LIZLLL = view.findViewById(R.id.hsd);
        c0sz0.LJI = view.findViewById(R.id.bi2);
        c0sz0.LJII = view.findViewById(R.id.user_avatar);
        c0sz0.LJIIIIZZ = view.findViewById(R.id.vng);
        c0sz0.LJIIIZ = view.findViewById(R.id.vnd);
        c0sz0.LJIIJ = view.findViewById(R.id.s7u);
        c0sz0.LJIIJJI = getContentView().findViewById(R.id.user_avatar_live);
        c0sz0.LJIIL = view.findViewById(R.id.bi7);
        c0sz0.LJ = view.findViewById(R.id.iej);
        c0sz0.LJFF = view.findViewById(R.id.idt);
        c0sz0.LJIILIIL = getContentView().findViewById(R.id.i8g);
        c0sz0.LJIILJJIL = LJJIJL().findViewById(R.id.user_avatar_layout_indicator);
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJLLL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLLI;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0RPv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C695520RPy) obj2).LLILLJJLI;
            }
        }, null, new C723230SYn(), 6);
        C1602720roE c1602720roE = LLLFZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        String str = ((VideoItemParams) obj).mEventType;
        c1602720roE.getClass();
        if (C1602720roE.LIZ(str)) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(this, interfaceC2217461BqaArr[2]), new C2217381BqS() { // from class: X.0SYp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C1ELP) obj2).LLJJIJI;
                }
            }, null, new C723210SYl(), 6);
        }
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0RRH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new C723220SYm(), 4);
    }
}
