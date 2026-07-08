package com.ss.android.ugc.feed.platform.componentmanager.view;

import X.C01GW;
import X.C0DR7;
import X.C0DR8;
import X.C21311118ab;
import X.C2180551AVp;
import X.C2180571AVr;
import X.C452501pT;
import X.EnumC1019010ccl;
import X.EnumC2180541AVo;
import X.InterfaceC20343214is;
import X.InterfaceC2180591AVt;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractAreaRootLayout extends C21311118ab implements InterfaceC20343214is {
    public final C01GW LL;

    public InteractAreaRootLayout(Context context) {
        this(context, null, 6, 0);
    }

    public InteractAreaRootLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    public void setCustomRiskId(String str) {
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ANIMATE;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, "");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = super.animate();
        C2180551AVp.LIZ(enumC2180541AVo, this, "");
        return viewPropertyAnimatorAnimate;
    }

    public final IAdPhotoModeService getAdPhotoModeService() {
        return (IAdPhotoModeService) this.LL.getValue();
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return getCustomRiskId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IAdPhotoModeService adPhotoModeService;
        if (motionEvent != null && motionEvent.getAction() == 0 && (adPhotoModeService = getAdPhotoModeService()) != null) {
            adPhotoModeService.LJIJ(EnumC1019010ccl.INTERACTION);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            super.setAlpha(f);
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        super.setAlpha(f);
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    public InteractAreaRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(267));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C0DR8.LJLLILLLL.getClass();
        if (C0DR7.LIZ(view) && super.drawChild(canvas, view, j)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ InteractAreaRootLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
