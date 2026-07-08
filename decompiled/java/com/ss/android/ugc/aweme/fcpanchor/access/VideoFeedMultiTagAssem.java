package com.ss.android.ugc.aweme.fcpanchor.access;

import X.C01GW;
import X.C04UD;
import X.C09R3;
import X.C0QSJ;
import X.C0RKW;
import X.C0RQN;
import X.C0RQO;
import X.C0SKM;
import X.C13LE;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2765015f;
import X.C452501pT;
import X.C631370Opb;
import X.C693650RIt;
import X.C698800Rb4;
import X.C703790Rj7;
import X.C704440RkA;
import X.C704480RkE;
import X.C704760Rkg;
import X.C704800Rkk;
import X.C715260S3w;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.EnumC697300RWu;
import X.InterfaceC1554640qYg;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC704550RkL;
import X.InterfaceC705550Rlx;
import X.InterfaceC710220RtU;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS26S0001000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoFeedMultiTagAssem extends BaseFeedMultiTagAssem<VideoFeedMultiTagAssem> implements C0RQO, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIZZ;
    public final /* synthetic */ C693650RIt LLJLLL = new C693650RIt();
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 166));
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public C0RKW LLLII;
    public C0RKW LLLIIII;
    public final C01GW LLLIIIIL;
    public final VideoFeedMultiTagAssem$descExpandModeProtocol$1 LLLIIIL;
    public final VideoFeedMultiTagAssem$eCommercePhotoOnIndexSetProtocol$1 LLLIIL;
    public final C704480RkE LLLIILIL;
    public final C703790Rj7 LLLIL;
    public volatile FcpProtocolAbility LLLILZ;
    public InterfaceC665370Q7z LLLILZJ;
    public C0QSJ LLLILZLLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoFeedMultiTagAssem.class, "tagVM", "getTagVM()Lcom/ss/android/ugc/aweme/fcpanchor/access/VideoFeedMultiTagVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoFeedMultiTagAssem.class, "fcpProtocolAbility", "getFcpProtocolAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/FcpProtocolAbility;", 0);
        c09r3.getClass();
        LLLIZZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagAssem$descExpandModeProtocol$1] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagAssem$eCommercePhotoOnIndexSetProtocol$1] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.0RkE] */
    public VideoFeedMultiTagAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoFeedMultiTagVM.class);
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 177), null, AFwS243S0000000_11.get$arr$(42));
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(43));
        this.LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(44));
        this.LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(45));
        this.LLLFFI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 175));
        this.LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 163));
        this.LLLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 165));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 176));
        this.LLLIIIL = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagAssem$descExpandModeProtocol$1
        };
        this.LLLIIL = new ECommercePhotoOnIndexSetProtocol() { // from class: com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagAssem$eCommercePhotoOnIndexSetProtocol$1
            @Override // com.ss.android.ugc.aweme.fcpanchor.access.ECommercePhotoOnIndexSetProtocol
            public final void H82(int i, String str) {
                if (Intrinsics.LJFF(str, ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme().getAid())) {
                    VideoFeedMultiTagVM videoFeedMultiTagVMFp = this.LL.Fp();
                    videoFeedMultiTagVMFp.getClass();
                    videoFeedMultiTagVMFp.setState(new AwS26S0001000_11(i, 7));
                }
            }
        };
        this.LLLIILIL = new InterfaceC704550RkL() { // from class: X.0RkE
            @Override // X.InterfaceC704550RkL
            public final AwS555S0100000_11 LIZ() {
                return new AwS555S0100000_11(this.LIZ, 189);
            }

            @Override // X.InterfaceC704550RkL
            public final AwS555S0100000_11 LIZIZ() {
                return new AwS555S0100000_11(this.LIZ, 188);
            }

            @Override // X.InterfaceC704550RkL
            public final AwS590S0100000_11 LIZJ() {
                return new AwS590S0100000_11(this.LIZ, 71);
            }
        };
        this.LLLIL = new C703790Rj7(this);
    }

    @Override // X.C0RQO
    public final String Ig() {
        return C0RQN.LIZIZ(null, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d_m;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final boolean Vo() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 2025602746) {
            return null;
        }
        return this;
    }

    public final VideoFeedMultiTagVM Fp() {
        return (VideoFeedMultiTagVM) this.LLJZIJLIL.getValue(this, LLLIZZ[0]);
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem, com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public final boolean M51() {
        C704760Rkg c704760Rkg = this.LLJLLIL;
        return c704760Rkg != null && c704760Rkg.LJI;
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem, com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public final View Uf() {
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg != null) {
            return (c704760Rkg.LJI ? c704760Rkg.LIZJ : c704760Rkg.LIZIZ).LJIIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem, com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public final String bc0() {
        C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
        FeedComponentPriorityData feedComponentPriorityDataEp = Ep();
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C698800Rb4.LIZIZ(c698800Rb4, feedComponentPriorityDataEp, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAnchors());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    public final boolean tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        return aweme != null && AwemeExtKt.isPhotoMode(aweme) && C0SKM.LJIIIIZZ().blockCheckColor;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[Catch: all -> 0x003c, PHI: r1
      0x0030: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:10:0x0012, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:7:0x000c, B:9:0x0010, B:11:0x0014, B:13:0x0018, B:14:0x001e, B:18:0x0038, B:19:0x003a, B:17:0x0030), top: B:42:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData Ep() {
        /*
            r5 = this;
            boolean r0 = X.C299830Bp7.LIZ()
            r4 = 0
            if (r0 == 0) goto L61
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLILZ
            if (r0 != 0) goto L40
            monitor-enter(r5)
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLILZ     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3f
            X.0QSJ r1 = r5.LLLILZLLLI     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            X.0Q7z r3 = r5.LLLILZJ     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L1e
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L3c
            r5.LLLILZJ = r3     // Catch: java.lang.Throwable -> L3c
        L1e:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope> r1 = com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3c
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3c
            r5.LLLILZLLLI = r1     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            r0 = r4
            goto L38
        L30:
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility> r0 = com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = (com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility) r0     // Catch: java.lang.Throwable -> L3c
        L38:
            r5.LLLILZ = r0     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            goto L45
        L3c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L3f:
            monitor-exit(r5)
        L40:
            X.0RKW r0 = r0.qR1()
            goto L48
        L45:
            if (r0 != 0) goto L40
            r0 = r4
        L48:
            r5.LLLII = r0
            if (r0 == 0) goto L53
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r0 = r0.LIZ()
            if (r0 == 0) goto L53
            return r0
        L53:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLLIIII = r0
            if (r0 == 0) goto L60
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
            return r4
        L60:
            return r4
        L61:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLLIIII = r0
            if (r0 == 0) goto L6d
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagAssem.Ep():com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData");
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem, com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility
    public final void KI0() {
        IPhotoSlidesAbility iPhotoSlidesAbility;
        InterfaceC710220RtU interfaceC710220RtUYn;
        super.KI0();
        if (C0SKM.LIZIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (!AwemeExtKt.isPhotoMode(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) || (iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLLIIIIL.getValue()) == null || (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) == null) {
                return;
            }
            interfaceC710220RtUYn.LJIILLIIL(Uf());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        long jLJFF = C0RQN.LJFF();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONUNSELECTED, jLJFF);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void hp() {
        IECommerceFYPPlayerService iECommerceFYPPlayerService;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (iECommerceFYPPlayerService = (IECommerceFYPPlayerService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceFYPPlayerService.class))) == null) {
            return;
        }
        iECommerceFYPPlayerService.LIZIZ(fragmentLJI);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        long jLJFF = C0RQN.LJFF();
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        final VideoFeedMultiTagAssem$eCommercePhotoOnIndexSetProtocol$1 videoFeedMultiTagAssem$eCommercePhotoOnIndexSetProtocol$1 = this.LLLIIL;
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, ECommercePhotoOnIndexSetProtocol.class, C1697810uHb.LJIILJJIL(videoFeedMultiTagAssem$eCommercePhotoOnIndexSetProtocol$1));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagAssem$onParentSet$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, ECommercePhotoOnIndexSetProtocol.class, videoFeedMultiTagAssem$eCommercePhotoOnIndexSetProtocol$1);
                    }
                }
            });
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DescExpandModeProtocol.class, C1697810uHb.LJIILJJIL(this.LLLIIIL));
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONPARENTSET, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        long jLJFF = C0RQN.LJFF();
        super.unBind();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_UNBIND, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem
    /* JADX INFO: renamed from: Bp */
    public final void up(VideoItemParams videoItemParams) {
        IPhotoSlidesAbility iPhotoSlidesAbility;
        InterfaceC710220RtU interfaceC710220RtUYn;
        View viewLJIIL;
        InterfaceC705550Rlx interfaceC705550Rlx;
        long jLJFF = C0RQN.LJFF();
        super.up(videoItemParams);
        if (C0SKM.LIZIZ() && (iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLLIIIIL.getValue()) != null && (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) != null) {
            C704760Rkg c704760Rkg = this.LLJLLIL;
            if (c704760Rkg != null) {
                if (c704760Rkg.LJI) {
                    interfaceC705550Rlx = c704760Rkg.LIZJ;
                } else {
                    interfaceC705550Rlx = c704760Rkg.LIZIZ;
                }
                viewLJIIL = interfaceC705550Rlx.LJIIL();
            } else {
                viewLJIIL = null;
            }
            interfaceC710220RtUYn.LJIJJLI(viewLJIIL);
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONBIND, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        long jLJFF = C0RQN.LJFF();
        C2765015f.LIZJ("VideoFeedMultiTagAssem.onViewCreated", new AwS555S0100000_11(this, 168));
        super.onViewCreated(view);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 174);
        this.LLJLLIL = new C704760Rkg(LJJIJL(), (InterfaceC705550Rlx) view.findViewById(R.id.feed_multi_tag_layout), new C704800Rkk(new AwS555S0100000_11(this, 169), awS555S0100000_11, new AwS555S0100000_11(this, 170), new AwS555S0100000_11(this, 171), (FrameLayout) view.findViewById(R.id.hu8), new AwS555S0100000_11(this, 172)), awS555S0100000_11);
        if (C04UD.LIZ()) {
            interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        } else {
            interfaceC665370Q7zLJIIL = null;
        }
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg != null) {
            c704760Rkg.LIZIZ.LJJI(new AwS555S0100000_11(this, 173));
        }
        C704760Rkg c704760Rkg2 = this.LLJLLIL;
        if (c704760Rkg2 != null) {
            c704760Rkg2.LIZIZ(m128do(), interfaceC665370Q7zLJIIL);
        }
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0RkJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C704520RkI) obj).LL;
            }
        }, null, new C704440RkA(), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0RkG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C704520RkI) obj).LLILLJJLI;
            }
        }, null, AFwS294S0000000_11.get$arr$(283), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0RkH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C704520RkI) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(284), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0RkC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(35), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0RkD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(31), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0RkK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJLLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(32), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0RkB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIII;
            }
        }, null, AFwS294S0000000_11.get$arr$(33), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0RkF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(34), 4);
        C2765015f.LIZ("VideoFeedMultiTagAssem.onViewCreated", new AwS555S0100000_11(this, 167));
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_VIEWCREATED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        long jLJFF = C0RQN.LJFF();
        Boolean boolValueOf = Boolean.valueOf(super.ur(videoItemParams));
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ISACTIVE, jLJFF);
        }
        if ((boolValueOf instanceof Boolean) && boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        up(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        long jLJFF = C0RQN.LJFF();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        long jLJFF = C0RQN.LJFF();
        super.T6(i, aweme);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONREUSEDBIND, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: up */
    public final void sr(VideoItemParams videoItemParams, List<? extends Object> list) {
        up(videoItemParams);
    }
}
