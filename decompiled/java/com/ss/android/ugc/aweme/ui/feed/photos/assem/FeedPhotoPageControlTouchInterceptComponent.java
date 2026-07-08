package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C0RHD;
import X.C0RV4;
import X.C1A5L;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C337180DJs;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedPhotoPageControlTouchInterceptComponent extends BaseCellContentComponent<FeedPhotoPageControlTouchInterceptComponent> implements View.OnTouchListener, InterfaceC1146704e9 {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1009));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1008));
    public C0RHD LLJJLIIIJLLLLLLLZ;
    public View LLJL;

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

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = view;
        view.setOnTouchListener(this);
        C2271391DvN.LIZ(view, (C1A5L) C2271381DvM.LLLLLLL.getValue());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AbsPhotosDotIndicatorAssem.LLLILZJ.getClass();
        if (C0RV4.LIZ(videoItemParams)) {
            View view = this.LLJL;
            if (view != null) {
                C337180DJs.LIZJ(view);
                return;
            }
            return;
        }
        View view2 = this.LLJL;
        if (view2 == null) {
            return;
        }
        C337180DJs.LIZ(view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getAction()
            if (r0 != 0) goto L19
            X.0Ooa r0 = r5.LLJJJJLIIL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility r1 = (com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility) r1
            r2 = 0
            if (r1 == 0) goto L4d
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L4d
        L17:
            r5.LLJJLIIIJLLLLLLLZ = r1
        L19:
            X.0RHD r0 = r5.LLJJLIIIJLLLLLLLZ
            r4 = 0
            if (r0 == 0) goto L60
            boolean r3 = r0.R1(r7, r6)
            if (r3 == 0) goto L30
            int r2 = r7.getAction()
            r1 = 1
            if (r2 == 0) goto L3f
            if (r2 == r1) goto L31
            r0 = 3
            if (r2 == r0) goto L31
        L30:
            return r3
        L31:
            android.view.View r0 = r5.LLJL
            if (r0 == 0) goto L30
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L30
            r0.requestDisallowInterceptTouchEvent(r4)
            return r3
        L3f:
            android.view.View r0 = r5.LLJL
            if (r0 == 0) goto L30
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L30
            r0.requestDisallowInterceptTouchEvent(r1)
            return r3
        L4d:
            X.01GW r0 = r5.LLJJL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility r1 = (com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility) r1
            if (r1 == 0) goto L5e
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L5e
            r2 = r1
        L5e:
            r1 = r2
            goto L17
        L60:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoPageControlTouchInterceptComponent.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
