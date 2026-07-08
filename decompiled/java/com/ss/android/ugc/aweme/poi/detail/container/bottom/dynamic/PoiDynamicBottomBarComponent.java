package com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamic;

import X.AbstractC1186480gys;
import X.C1174850gg7;
import X.C1180090goZ;
import X.C1183700guO;
import X.C1186840gzS;
import X.C13LE;
import X.C337180DJs;
import X.C339190DRl;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1180270gor;
import X.InterfaceC1181010gq3;
import Y.AAListenerS67S0110000_18;
import Y.AUListenerS267S0100000_18;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBaseBottomButtonsComponent;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.stable.PoiStableBottomBarModule;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDynamicBottomBarComponent extends PoiBaseBottomButtonsComponent implements InterfaceC1180270gor {
    public Animator LLJJ;
    public Animator LLJJI;
    public View LLJJIII;

    public final View ap() {
        View view = this.LLJJIII;
        if (view != null) {
            return view;
        }
        View viewFindViewById = LJJIJL().findViewById(R.id.cbl);
        this.LLJJIII = viewFindViewById;
        return viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBaseBottomButtonsComponent
    public final void So() {
        if (ap().getAlpha() == 0.0f) {
            C786410Ut5.LJLLLLLL(4, ap());
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBaseBottomButtonsComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1186840gzS c1186840gzSLw1;
        super.onDestroy();
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ == null || (c1186840gzSLw1 = interfaceC1181010gq3LIZ.lw1()) == null) {
            return;
        }
        c1186840gzSLw1.LIZJ("SlashScrollPositionEvent", this);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBaseBottomButtonsComponent
    public final void Lo(PoiStableBottomBarModule poiStableBottomBarModule) {
        Oo(poiStableBottomBarModule, true);
        if (poiStableBottomBarModule.getPoiLocation() == null) {
            View view = this.LLJILJIL;
            if (view != null) {
                C339190DRl.LIZIZ(view);
            }
            C723850SaN.LJII(this, C13LE.LIZ(PoiNavigateButtonAssem.class), null);
        } else {
            View view2 = this.LLJILJIL;
            if (view2 != null) {
                C337180DJs.LIZJ(view2);
            }
            C723850SaN.LIZLLL(this, new AwS581S0100000_2((PoiBaseBottomButtonsComponent) this, 377));
        }
        No(poiStableBottomBarModule, true);
    }

    @Override // X.InterfaceC1180270gor
    public void onEvent(AbstractC1186480gys abstractC1186480gys) {
        String str;
        Animator animator;
        if (!(abstractC1186480gys instanceof C1183700guO)) {
            return;
        }
        C1183700guO c1183700guO = (C1183700guO) abstractC1186480gys;
        C1180090goZ c1180090goZ = c1183700guO.LLILLL;
        String str2 = null;
        if (c1180090goZ != null) {
            str = c1180090goZ.LIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "poi_head_info") || ap().getAlpha() >= 1.0f || (((animator = this.LLJJ) != null && animator.isStarted()) || c1183700guO.LL < 1)) {
            C1180090goZ c1180090goZ2 = c1183700guO.LLILLL;
            if (c1180090goZ2 != null) {
                str2 = c1180090goZ2.LIZ;
            }
            if (Intrinsics.LJFF(str2, "poi_head_info") && ap().getAlpha() > 0.0f) {
                Animator animator2 = this.LLJJI;
                if (animator2 != null && animator2.isStarted()) {
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                bp(valueAnimatorOfFloat, false);
                this.LLJJI = valueAnimatorOfFloat;
                return;
            }
            return;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        bp(valueAnimatorOfFloat2, true);
        this.LLJJ = valueAnimatorOfFloat2;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBaseBottomButtonsComponent, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1186840gzS c1186840gzSLw1;
        super.onViewCreated(view);
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null && (c1186840gzSLw1 = interfaceC1181010gq3LIZ.lw1()) != null) {
            c1186840gzSLw1.LIZIZ("SlashScrollPositionEvent", this);
        }
        C786410Ut5.T4(ap(), 0.0f);
    }

    public final void bp(ValueAnimator valueAnimator, boolean z) {
        Animator animator;
        Animator animator2;
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new AUListenerS267S0100000_18(this, 0));
        valueAnimator.addListener(new AAListenerS67S0110000_18(this, z, 1));
        valueAnimator.addListener(new AAListenerS67S0110000_18(this, z, 0));
        if (z) {
            Animator animator3 = this.LLJJI;
            if (animator3 != null && animator3.isStarted() && (animator2 = this.LLJJI) != null) {
                animator2.cancel();
            }
        } else {
            Animator animator4 = this.LLJJ;
            if (animator4 != null && animator4.isStarted() && (animator = this.LLJJ) != null) {
                animator.cancel();
            }
        }
        valueAnimator.start();
    }
}
