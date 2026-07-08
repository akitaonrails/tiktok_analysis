package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.AbstractViewOnLayoutChangeListenerC425300Gm0;
import X.C01GW;
import X.C0RHD;
import X.C0RKI;
import X.C0SKN;
import X.C0ST8;
import X.C1558520qew;
import X.C425280Gly;
import X.C425400GmA;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C724270Sb3;
import X.InterfaceC1146704e9;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoCellGradualComponent extends CellGradualComponent implements InterfaceC1146704e9 {
    public static final /* synthetic */ int LLLIILIL = 0;
    public final C630740Ooa LLLI = C628500Oky.LIZ(new AwS555S0100000_11(this, 1015));
    public final C630740Ooa LLLII = C628500Oky.LIZ(new AwS555S0100000_11(this, 1016));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1014));
    public C0RHD LLLIIIIL;
    public AbstractViewOnLayoutChangeListenerC425300Gm0 LLLIIIL;
    public boolean LLLIIL;

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

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2065189638) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        AbstractViewOnLayoutChangeListenerC425300Gm0 abstractViewOnLayoutChangeListenerC425300Gm0 = this.LLLIIIL;
        if (abstractViewOnLayoutChangeListenerC425300Gm0 != null) {
            abstractViewOnLayoutChangeListenerC425300Gm0.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        AbstractViewOnLayoutChangeListenerC425300Gm0 abstractViewOnLayoutChangeListenerC425300Gm0 = this.LLLIIIL;
        if (abstractViewOnLayoutChangeListenerC425300Gm0 != null) {
            abstractViewOnLayoutChangeListenerC425300Gm0.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent
    /* JADX INFO: renamed from: ip */
    public final void tp(VideoItemParams videoItemParams) {
        AbstractViewOnLayoutChangeListenerC425300Gm0 c425400GmA;
        Object obj;
        super.tp(videoItemParams);
        if (C0RKI.LIZ(videoItemParams)) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (C0ST8.LIZJ(((VideoItemParams) obj).getAweme()) <= 1) {
                c425400GmA = new C425280Gly(this.LLJJLIIIJLLLLLLLZ, LJJIJL());
            } else {
                final View view = this.LLJJLIIIJLLLLLLLZ;
                final View viewLJJIJL = LJJIJL();
                c425400GmA = new C425280Gly(view, viewLJJIJL) { // from class: X.0Glz
                    @Override // X.C425280Gly
                    public final int LIZJ(int i, int i2) {
                        return (i - i2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    }
                };
            }
        } else {
            c425400GmA = new C425400GmA(this.LLJJLIIIJLLLLLLLZ);
        }
        if (!Intrinsics.LJFF(c425400GmA, this.LLLIIIL)) {
            AbstractViewOnLayoutChangeListenerC425300Gm0 abstractViewOnLayoutChangeListenerC425300Gm0 = this.LLLIIIL;
            if (abstractViewOnLayoutChangeListenerC425300Gm0 != null) {
                abstractViewOnLayoutChangeListenerC425300Gm0.LIZIZ();
            }
            this.LLLIIIL = c425400GmA;
            c425400GmA.LIZ();
        }
        boolean zLJFF = C0SKN.LJFF(videoItemParams);
        this.LLLIIL = zLJFF;
        if (zLJFF) {
            sm0(false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLLIIIL = new C425400GmA(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent, com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final void sm0(boolean z) {
        if (!this.LLLIIL && z) {
            super.sm0(true);
        } else {
            super.sm0(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(android.view.GestureDetector r5, android.view.MotionEvent r6, android.view.View r7) {
        /*
            r4 = this;
            int r0 = r6.getAction()
            if (r0 != 0) goto L19
            X.0Ooa r0 = r4.LLLII
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility r1 = (com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility) r1
            r2 = 0
            if (r1 == 0) goto L31
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L31
        L17:
            r4.LLLIIIIL = r1
        L19:
            X.0RHD r0 = r4.LLLIIIIL
            r3 = 0
            if (r0 == 0) goto L54
            boolean r0 = r0.R1(r6, r7)
            if (r0 == 0) goto L54
            int r2 = r6.getAction()
            r1 = 1
            if (r2 == 0) goto L4c
            if (r2 == r1) goto L44
            r0 = 3
            if (r2 == r0) goto L44
            return
        L31:
            X.01GW r0 = r4.LLLIIII
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility r1 = (com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility) r1
            if (r1 == 0) goto L42
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L42
            r2 = r1
        L42:
            r1 = r2
            goto L17
        L44:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            return
        L4c:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            return
        L54:
            r5.onTouchEvent(r6)
            X.0Ooa r0 = r4.LLLI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility r0 = (com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility) r0
            if (r0 == 0) goto L64
            r0.mh0(r6)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoCellGradualComponent.kp(android.view.GestureDetector, android.view.MotionEvent, android.view.View):void");
    }
}
