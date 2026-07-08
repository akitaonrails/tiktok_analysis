package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C1558520qew;
import X.C2188811AlT;
import X.C452501pT;
import X.C687700QyG;
import X.C708910RrN;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBottomAreaViewAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class BottomPhotosDotIndicatorAssem extends AbsPhotosDotIndicatorAssem implements BottomSlideIndicatorAbility, InterfaceC1554640qYg, InterfaceC737790Swr {
    public final BottomPhotosDotIndicatorAssem LLLIZZ = this;
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, LSPassThroughRecordSizeConfig.DEFAULT));
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 999));

    @Override // com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility
    public final void Od(float f, int i) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 144986585) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    @Override // X.C0SDU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isVisible() {
        /*
            r5 = this;
            X.01GW r0 = r5.LLLIIIL
            java.lang.Object r4 = r0.getValue()
            com.ss.android.ugc.aweme.ad.feed.carousel.IAdCarouselService r4 = (com.ss.android.ugc.aweme.ad.feed.carousel.IAdCarouselService) r4
            r2 = 1
            r3 = 0
            r1 = 0
            if (r4 == 0) goto L22
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.LL
        L13:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = r4.LIZ(r0)
            if (r0 != r2) goto L22
            return r1
        L20:
            r0 = r3
            goto L13
        L22:
            X.0R8b r0 = r5.jm()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r4 = r0.LJ
            if (r4 == 0) goto L73
            int r0 = com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem.LLLI
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L71
            java.lang.Object r0 = r0.LL
        L32:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
            X.0R8b r0 = r5.jm()
            X.0RF0 r0 = r0.LIZLLL
            if (r0 == 0) goto L6f
            androidx.fragment.app.Fragment r0 = r0.LIZJ
        L42:
            boolean r0 = X.C0ROI.LIZIZ(r4, r1, r0)
            if (r0 != r2) goto L73
            r0 = 1
        L49:
            r5.LLL = r0
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r0.LL
        L51:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            boolean r0 = X.C0SCS.LIZ(r0)
            if (r0 != 0) goto L6c
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L5f
            java.lang.Object r3 = r0.LL
        L5f:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r3 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r3
            java.lang.String r1 = r3.mEventType
            java.lang.String r0 = "create_playlist"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L6c
            r2 = 0
        L6c:
            return r2
        L6d:
            r0 = r3
            goto L51
        L6f:
            r0 = r3
            goto L42
        L71:
            r0 = r3
            goto L32
        L73:
            r0 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.BottomPhotosDotIndicatorAssem.isVisible():boolean");
    }

    public final void EE2() {
        View contentView = getContentView();
        ViewParent parent = contentView.getParent();
        C708910RrN c708910RrN = parent instanceof C708910RrN ? (C708910RrN) parent : null;
        if (c708910RrN != null) {
            C786410Ut5.W(c708910RrN, 8);
        }
        C786410Ut5.LJLLLLLL(8, contentView);
    }

    @Override // com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility
    public final void Yv1() {
        InteractAreaCommonAbility interactAreaCommonAbility;
        if (isVisible()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (!Intrinsics.LJFF(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mEventType, "create_playlist") || (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLLJIL.getValue()) == null) {
                return;
            }
            InteractBottomAreaViewAbility interactBottomAreaViewAbility = (InteractBottomAreaViewAbility) this.LLLJ.getValue();
            interactAreaCommonAbility.Vt1(interactBottomAreaViewAbility != null ? interactBottomAreaViewAbility.BE0() : null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem, com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        String aid;
        super.up(videoItemParams);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomPhotosDotIndicatorAssem visible: ");
        sbLIZ.append(isVisible());
        sbLIZ.append(", ");
        Aweme aweme = videoItemParams.getAweme();
        C708910RrN c708910RrN = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (isVisible()) {
            View contentView = getContentView();
            ViewParent parent = contentView.getParent();
            if (parent instanceof C708910RrN) {
                c708910RrN = (C708910RrN) parent;
            }
            if (c708910RrN != null) {
                C786410Ut5.W(c708910RrN, 0);
            }
            C786410Ut5.LJLLLLLL(0, contentView);
            return;
        }
        EE2();
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).unbindAbility(this.LLLIZZ, BottomSlideIndicatorAbility.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).bindAbility(this.LLLIZZ, BottomSlideIndicatorAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.AbsPhotosDotIndicatorAssem, com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideIndicatorAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // X.C0RHD
    public final boolean R1(MotionEvent motionEvent, View view) {
        return onTouch(view, motionEvent);
    }
}
