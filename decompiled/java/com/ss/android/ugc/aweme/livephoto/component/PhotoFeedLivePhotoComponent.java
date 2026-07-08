package com.ss.android.ugc.aweme.livephoto.component;

import X.C01GW;
import X.C0S7U;
import X.C0SFN;
import X.C0SMF;
import X.C0SOB;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C721220SQu;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.EnumC721170SQp;
import X.InterfaceC1146704e9;
import X.InterfaceC1484830ok5;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.protocol.PhotoDetailNavigationProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS151S0101000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoFeedLivePhotoComponent extends BaseCellContentComponent<PhotoFeedLivePhotoComponent> implements C0SOB, C0SMF, PhotoDetailNavigationProtocol, InterfaceC1146704e9 {
    public C0S7U LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public InterfaceC1484830ok5 LLJZ;
    public final C01GW LLJJJJLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(296));
    public final C01GW LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(PhotoViewModelV2.class), AFwS243S0000000_11.get$arr$(294));
    public final C01GW LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(295));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 500));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 501));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 502));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 496));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 503));

    @Override // X.C0SOB
    public final void Aa() {
    }

    @Override // X.InterfaceC717050SAt
    public final void K6(int i, boolean z) {
    }

    @Override // X.InterfaceC717050SAt
    public final void Qk(EnumC721170SQp enumC721170SQp) {
    }

    @Override // X.C0SMF
    public final void Yb() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJLL = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C0SFN.LIZIZ.LIZLLL("LivePhotoFeedComponent", null, new AwS555S0100000_11(this, 499));
        this.LLJLLIL = false;
        C0S7U c0s7u = this.LLJLL;
        if (c0s7u != null) {
            c0s7u.E4();
        }
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJZ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.release();
        }
        this.LLJZ = null;
        C0S7U c0s7u2 = this.LLJLL;
        if (c0s7u2 != null) {
            c0s7u2.Pn(null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) this.LLJLIL.getValue();
        if (iPhotoSlidesEventDispatchAbility != null) {
            iPhotoSlidesEventDispatchAbility.IL1(this);
        }
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) this.LLJLIL.getValue();
        if (iPhotoSlidesEventDispatchAbility2 != null) {
            iPhotoSlidesEventDispatchAbility2.tj(this);
        }
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJZ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.release();
        }
        this.LLJZ = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r0.enableLivePhotoAutoPlay() == true) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ep() {
        /*
            r4 = this;
            boolean r0 = r4.LLJLLIL
            r3 = 0
            if (r0 != 0) goto L6
            return r3
        L6:
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r0 = r4.hp()
            boolean r0 = r0.UQ2()
            if (r0 == 0) goto L11
            return r3
        L11:
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r0 = r4.hp()
            X.002o r0 = r0.getState()
            X.0S9P r0 = (X.C0S9P) r0
            boolean r0 = r0.LLJJL
            r1 = 1
            if (r0 == 0) goto L63
            X.0Sb3 r0 = r4.LLJI
            r2 = 0
            if (r0 == 0) goto L74
            java.lang.Object r0 = r0.LL
        L27:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            int r0 = X.C0S7E.LIZ(r0)
            if (r0 <= r1) goto L63
            X.0Sb3 r0 = r4.LLJI
            if (r0 == 0) goto L72
            java.lang.Object r0 = r0.LL
        L39:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r0)
            if (r0 == 0) goto L77
            X.0Sb3 r0 = r4.LLJI
            if (r0 == 0) goto L4b
            java.lang.Object r2 = r0.LL
        L4b:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.getAweme()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = X.C1017070cZd.LJJIJLIJ(r0)
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct r0 = r0.getPhotoCarouselInfo()
            if (r0 == 0) goto L77
            boolean r0 = r0.enableLivePhotoAutoPlay()
            if (r0 != r1) goto L77
        L63:
            com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2 r0 = r4.hp()
            X.002o r0 = r0.getState()
            X.0S9P r0 = (X.C0S9P) r0
            boolean r0 = r0.LLJJIJIL
            if (r0 == 0) goto L76
            return r3
        L72:
            r0 = r2
            goto L39
        L74:
            r0 = r2
            goto L27
        L76:
            return r1
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livephoto.component.PhotoFeedLivePhotoComponent.ep():boolean");
    }

    public final PhotoViewModelV2 hp() {
        return (PhotoViewModelV2) this.LLJJL.getValue();
    }

    @Override // X.InterfaceC717050SAt
    public final void oi() {
        C0SFN.LIZIZ.LIZLLL("LivePhotoFeedComponent", null, new AwS555S0100000_11(this, 497));
        this.LLJLLL = true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        C0SFN.LIZIZ.LIZIZ("LivePhotoFeedComponent", null, new AwS151S0101000_11(this, i, 1));
        C0S7U c0s7u = this.LLJLL;
        if (c0s7u != null) {
            c0s7u.M6(this.LLJLLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLI(int r5) {
        /*
            r4 = this;
            X.0SFN r3 = X.C0SFN.LIZIZ
            kotlin.jvm.internal.AwS555S0100000_11 r2 = new kotlin.jvm.internal.AwS555S0100000_11
            r0 = 498(0x1f2, float:6.98E-43)
            r2.<init>(r4, r0)
            java.lang.String r1 = "LivePhotoFeedComponent"
            r0 = 0
            r3.LIZIZ(r1, r0, r2)
            X.0S7U r3 = r4.LLJLL
            r2 = 0
            if (r3 == 0) goto L2e
            X.0Ooa r0 = r4.LLJLILLLLZIIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility r0 = (com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility) r0
            if (r0 == 0) goto L3a
            X.0N0Y r0 = r0.getPlayerManager()
            if (r0 == 0) goto L3a
            boolean r1 = r0.isPaused()
            r0 = 1
            if (r1 != r0) goto L3a
        L2b:
            r3.Ba(r0)
        L2e:
            X.0S7U r1 = r4.LLJLL
            if (r1 == 0) goto L37
            boolean r0 = r4.LLJLLL
            r1.Pf(r0)
        L37:
            r4.LLJLLL = r2
            return
        L3a:
            r0 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livephoto.component.PhotoFeedLivePhotoComponent.LLLI(int):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C721220SQu.LIZLLL(videoItemParams.getAweme());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    @Override // X.C0SOB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r6) {
        /*
            r5 = this;
            X.0Sb3 r0 = r5.LLJI
            r2 = 0
            if (r0 == 0) goto L14
            java.lang.Object r0 = r0.LL
        L7:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = X.C721220SQu.LIZLLL(r0)
            if (r0 != 0) goto L16
            return
        L14:
            r0 = r2
            goto L7
        L16:
            X.0Ooa r0 = r5.LLJL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility r0 = (com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility) r0
            if (r0 == 0) goto L8f
            X.0SKa r1 = r0.rq2(r6)
        L24:
            boolean r0 = r1 instanceof X.C0S7U
            if (r0 == 0) goto L2b
            r2 = r1
            X.0S7U r2 = (X.C0S7U) r2
        L2b:
            X.0SFN r4 = X.C0SFN.LIZIZ
            kotlin.jvm.internal.AwS137S0201000_11 r3 = new kotlin.jvm.internal.AwS137S0201000_11
            r0 = 0
            r3.<init>(r5, r6, r2, r0)
            java.lang.String r1 = "LivePhotoFeedComponent"
            r0 = 0
            r4.LIZLLL(r1, r0, r3)
            X.0S7U r0 = r5.LLJLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 != 0) goto L48
            X.0S7U r0 = r5.LLJLL
            if (r0 == 0) goto L48
            r0.E4()
        L48:
            if (r2 == 0) goto L7f
            androidx.fragment.app.Fragment r1 = X.C724240Sb0.LJI(r5)
            X.0ok5 r0 = r5.LLJZ
            if (r0 != 0) goto L58
            X.0ok5 r0 = X.C708110Rq5.LIZ(r1)
            r5.LLJZ = r0
        L58:
            X.0ok5 r1 = r5.LLJZ
            X.01GW r0 = r5.LLL
            java.lang.Object r0 = r0.getValue()
            X.0S7Y r0 = (X.C0S7Y) r0
            r2.Pn(r1, r0)
            X.0Ooa r0 = r5.LLJLILLLLZIIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility r0 = (com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility) r0
            if (r0 == 0) goto L8d
            X.0N0Y r0 = r0.getPlayerManager()
            if (r0 == 0) goto L8d
            boolean r1 = r0.isPaused()
            r0 = 1
            if (r1 != r0) goto L8d
        L7c:
            r2.Ba(r0)
        L7f:
            boolean r0 = r5.ep()
            if (r0 == 0) goto L8a
            if (r2 == 0) goto L8a
            r2.Q2()
        L8a:
            r5.LLJLL = r2
            return
        L8d:
            r0 = 0
            goto L7c
        L8f:
            r1 = r2
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livephoto.component.PhotoFeedLivePhotoComponent.onPageSelected(int):void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0S7Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(96), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0S71
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILJILJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(97), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(), new C2217381BqS() { // from class: X.0S7S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(98), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0S7T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(99), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0S7X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLJJIII);
            }
        }, null, AFwS294S0000000_11.get$arr$(93), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0S7W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLJILJIL);
            }
        }, null, AFwS294S0000000_11.get$arr$(94), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0S7V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0S9P) obj).LLJJIJIL);
            }
        }, null, AFwS294S0000000_11.get$arr$(95), 6);
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) this.LLJLIL.getValue();
        if (iPhotoSlidesEventDispatchAbility != null) {
            iPhotoSlidesEventDispatchAbility.K5(this);
        }
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, PhotoDetailNavigationProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.livephoto.component.PhotoFeedLivePhotoComponent$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, PhotoDetailNavigationProtocol.class, this);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C0SFN.LIZIZ.LIZLLL("LivePhotoFeedComponent", null, new AwS412S0200000_11(this, videoItemParams, 59));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // X.C0SMF
    public final void wd(int i) {
        Object obj;
        IPhotoSlidesAbility iPhotoSlidesAbility;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C721220SQu.LJFF(i, ((VideoItemParams) obj).getAweme()) && this.LLJLL == null && (iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLJL.getValue()) != null && i == iPhotoSlidesAbility.xt0()) {
            onPageSelected(i);
        }
    }
}
