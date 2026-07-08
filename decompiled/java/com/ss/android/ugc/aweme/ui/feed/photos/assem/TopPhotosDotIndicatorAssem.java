package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C07TO;
import X.C0SCS;
import X.C0SKM;
import X.C0SOW;
import X.C1558520qew;
import X.C2188811AlT;
import X.C288720BTi;
import X.C687700QyG;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC707300Rom;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC710220RtU;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class TopPhotosDotIndicatorAssem extends AbsPhotosDotIndicatorAssem implements ISlideIndicatorAbility, InterfaceC1554640qYg, InterfaceC737790Swr {
    public final TopPhotosDotIndicatorAssem LLLIZZ = this;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1053228885) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility
    public final Integer GJ2() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return Integer.valueOf(!C0SCS.LIZ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)) ? 49 : 0);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem
    public final boolean Tp() {
        InterfaceC710220RtU interfaceC710220RtUYn;
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLLIIIIL.getValue();
        return (iPhotoSlidesAbility == null || (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) == null || !interfaceC710220RtUYn.LJJIFFI()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    @Override // X.C0SDU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isVisible() {
        /*
            r6 = this;
            X.01GW r0 = r6.LLLIIIL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.ad.feed.carousel.IAdCarouselService r1 = (com.ss.android.ugc.aweme.ad.feed.carousel.IAdCarouselService) r1
            r2 = 1
            r3 = 0
            r5 = 0
            if (r1 == 0) goto L22
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.LL
        L13:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = r1.LIZ(r0)
            if (r0 != r2) goto L22
            return r5
        L20:
            r0 = r3
            goto L13
        L22:
            X.0R8b r0 = r6.jm()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r4 = r0.LJ
            if (r4 == 0) goto L7d
            int r0 = com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem.LLLI
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r0.LL
        L32:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
            X.0R8b r0 = r6.jm()
            X.0RF0 r0 = r0.LIZLLL
            if (r0 == 0) goto L79
            androidx.fragment.app.Fragment r0 = r0.LIZJ
        L42:
            boolean r0 = X.C0ROI.LIZIZ(r4, r1, r0)
            if (r0 != r2) goto L7d
            r4 = 1
        L49:
            r6.LLL = r4
            X.0Rb8 r1 = X.C698840Rb8.LIZ
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L77
            java.lang.Object r0 = r0.LL
        L53:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            r1.getClass()
            boolean r0 = X.C698840Rb8.LIZ(r0, r4)
            if (r0 == 0) goto L7f
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.LL
        L68:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = X.C582980Mtk.LIZ(r0)
            if (r0 != 0) goto L7f
            return r5
        L75:
            r0 = r3
            goto L68
        L77:
            r0 = r3
            goto L53
        L79:
            r0 = r3
            goto L42
        L7b:
            r0 = r3
            goto L32
        L7d:
            r4 = 0
            goto L49
        L7f:
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto La0
            java.lang.Object r0 = r0.LL
        L85:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            boolean r0 = X.C0SCS.LIZ(r0)
            if (r0 != 0) goto La2
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L93
            java.lang.Object r3 = r0.LL
        L93:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r3 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r3
            java.lang.String r1 = r3.mEventType
            java.lang.String r0 = "create_playlist"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto La2
            return r2
        La0:
            r0 = r3
            goto L85
        La2:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.TopPhotosDotIndicatorAssem.isVisible():boolean");
    }

    @Override // com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility
    public final View A52() {
        if (bp()) {
            return getContentView();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility
    public final int qj1() {
        View childAt;
        if (!bp() || !isVisible()) {
            return 0;
        }
        int[] iArr = new int[2];
        ViewGroup viewGroup = (ViewGroup) getContentView().findViewById(R.id.qed);
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            childAt.getLocationOnScreen(iArr);
        }
        return iArr[1];
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem, com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        String aid;
        IPhotoSlidesAbility iPhotoSlidesAbility;
        InterfaceC710220RtU interfaceC710220RtUYn;
        IPhotoSlidesAbility iPhotoSlidesAbility2;
        super.up(videoItemParams);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopPhotosDotIndicatorAssem visible: ");
        sbLIZ.append(isVisible());
        sbLIZ.append(", ");
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!isVisible()) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        } else {
            C786410Ut5.LJLLLLLL(0, getContentView());
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            if (C0SKM.LIZIZ() && (iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLLIIIIL.getValue()) != null && (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) != null) {
                interfaceC710220RtUYn.LJJIII(videoItemParams.getAweme().getAid());
            }
        }
        zi();
        if (C07TO.LIZIZ(videoItemParams.mEventType) && bp() && (iPhotoSlidesAbility2 = (IPhotoSlidesAbility) this.LLLIIIIL.getValue()) != null) {
            iPhotoSlidesAbility2.Cq1(getContentView());
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility
    public final void I6(boolean z) {
        Up();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem
    public final EnumC707300Rom Jp(boolean z) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (AwemeExtKt.isAdTraffic(((VideoItemParams) obj).getAweme())) {
            if (z) {
                if (Ip()) {
                    return EnumC707300Rom.PROGRESS_BAR;
                }
                return EnumC707300Rom.SLIDE;
            }
            if (Ip()) {
                return EnumC707300Rom.PROGRESS_BAR;
            }
            return EnumC707300Rom.DEFAULT;
        }
        return super.Jp(z);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).unbindAbility(this.LLLIZZ, ISlideIndicatorAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem, com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).bindAbility(this.LLLIZZ, ISlideIndicatorAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility
    public final void qd0(float f) {
        if (C288720BTi.LIZ()) {
            C786410Ut5.ed(LJJIJL(), f);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem, com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility
    public final void setAlpha(float f) {
        C0SOW c0sow = this.LLJLLL;
        if (c0sow != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0sow);
            c0sow.setAlpha(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility
    public final void Od(float f, int i) {
        C0SOW c0sow;
        if (Ip() && (c0sow = this.LLJLLL) != null) {
            c0sow.LJIILIIL(f, i);
        }
    }

    @Override // X.C0RHD
    public final boolean R1(MotionEvent motionEvent, View view) {
        return onTouch(view, motionEvent);
    }
}
