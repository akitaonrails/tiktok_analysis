package com.ss.android.ugc.aweme.story.feed.common.sub.video.component;

import X.C01GW;
import X.C0RFL;
import X.C19252910Tv;
import X.C19EG;
import X.C452501pT;
import X.C487280J9a;
import X.C628500Oky;
import X.C630740Ooa;
import X.C694980RNw;
import X.C724240Sb0;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.sub.video.component.StoryShapeAdaptComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryShapeAdaptComponent extends BaseCellContentComponent<StoryShapeAdaptComponent> {
    public final C694980RNw LLJJJJLIIL = new InterfaceC487330J9f() { // from class: X.0RNw
        @Override // X.InterfaceC487330J9f
        public final void onConfigurationChanged(Activity activity, Configuration configuration) {
            StoryShapeAdaptComponent storyShapeAdaptComponent = this.LL;
            storyShapeAdaptComponent.ep(((VideoItemParams) C631370Opb.LIZ(storyShapeAdaptComponent)).getAweme());
        }
    };
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 650));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 649));

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C487280J9a.LIZJ(this.LLJJJJLIIL);
        int i = C0RFL.LIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 0 || videoItemParams.getAweme().getStoryType() == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[PHI: r2 r3 r6
      0x009d: PHI (r2v5 float) = (r2v1 float), (r2v6 float) binds: [B:41:0x009b, B:28:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r3v2 int) = (r3v0 int), (r3v3 int) binds: [B:41:0x009b, B:28:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r6v2 int) = (r6v0 int), (r6v3 int) binds: [B:41:0x009b, B:28:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ep(com.ss.android.ugc.aweme.feed.model.Aweme r13) {
        /*
            r12 = this;
            android.content.Context r11 = r12.getContext()
            if (r11 != 0) goto L7
            return
        L7:
            r10 = 1
            r6 = 0
            if (r13 == 0) goto L1e
            int r1 = r13.getStoryType()
            r0 = 3
            if (r1 != r0) goto L1e
            r9 = 1
        L13:
            X.01GW r0 = r12.LLJJL
            java.lang.Object r5 = r0.getValue()
            com.bytedance.tux.widget.RadiusLayout r5 = (com.bytedance.tux.widget.RadiusLayout) r5
            if (r5 != 0) goto L20
            return
        L1e:
            r9 = 0
            goto L13
        L20:
            android.view.ViewParent r4 = r5.getParent()
            boolean r0 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r8 = 0
            if (r0 == 0) goto Lb8
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            if (r4 == 0) goto Lb8
            int r0 = X.C497820Jfg.LIZIZ(r11)
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            int r0 = X.C497820Jfg.LIZ(r11)
            float r0 = (float) r0
            float r1 = r1 / r0
            r7 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L42
            r10 = 0
        L42:
            r1 = 0
            if (r9 == 0) goto L97
            r0 = 28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r2 = X.C418440Gaw.LIZIZ(r0)
            if (r10 != 0) goto L98
            r3 = 0
        L52:
            r6 = -1
            if (r9 == 0) goto L59
            if (r10 != 0) goto L9d
            java.lang.String r8 = "W, 3:4"
        L59:
            r5.setRadius(r2)
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            if (r2 == 0) goto Lb0
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.width = r3
            r2.height = r6
            int r0 = (int) r1
            r2.topMargin = r0
            X.C786410Ut5.W5(r5, r2)
            X.19MB r1 = new X.19MB
            r1.<init>()
            r1.LJII(r4)
            int r0 = r5.getId()
            r1.LJJ(r0, r8)
            r1.LIZIZ(r4)
            r4.invalidate()
            X.0Ooa r0 = r12.LLJJLIIIJLLLLLLLZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility r0 = (com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility) r0
            if (r0 == 0) goto L96
            android.view.View r0 = r0.Vy1()
            if (r0 == 0) goto L96
            r0.invalidate()
        L96:
            return
        L97:
            r2 = 0
        L98:
            r3 = -1
            if (r9 == 0) goto L52
            if (r10 == 0) goto L52
        L9d:
            int r0 = X.C497820Jfg.LIZ(r11)
            float r1 = (float) r0
            int r0 = X.C497820Jfg.LIZIZ(r11)
            float r0 = (float) r0
            float r0 = r0 / r7
            float r1 = r1 - r0
            r0 = 1053609165(0x3ecccccd, float:0.4)
            float r1 = r1 * r0
            java.lang.String r8 = "H, 3:4"
            goto L59
        Lb0:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r1.<init>(r0)
            throw r1
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.sub.video.component.StoryShapeAdaptComponent.ep(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this.LLJJJJLIIL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        ep(videoItemParams.getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
