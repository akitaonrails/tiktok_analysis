package com.lynx.tasm.behavior.ui.view;

import X.AbstractC1311530kEZ;
import X.C1311420kEO;
import X.C1313390kHZ;
import X.C1314270kIz;
import X.C1318790kQH;
import X.InterfaceC1312540kGC;
import X.ViewOnAttachStateChangeListenerC1339240kxG;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import j27.s;
import java.util.Map;
import u4.q0;

/* JADX INFO: loaded from: classes21.dex */
public class UIView extends UISimpleView<AndroidView> {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean canConsumeGesture(float f, float f2) {
        return true;
    }

    @InterfaceC1312540kGC(name = "copyable")
    public void copyable(boolean z) {
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final boolean enableAutoClipRadius() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollX() {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollY() {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getScrollContainerDirection() {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean isAtBorder(boolean z) {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onGestureScrollBy(float f, float f2) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getInitialOverflowType() {
        return !this.mContext.LJI() ? 1 : 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        T t = this.mView;
        if (t != 0) {
            ((AndroidView) t).setNativeInteractionEnabled(this.nativeInteractionEnabled);
            ((AndroidView) this.mView).setConsumeHoverEvent(this.mConsumeHoverEvent);
        }
        super.onPropsUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final Map<Integer, AbstractC1311530kEZ> getGestureHandlers() {
        return super.getGestureHandlers();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void initAccessibilityDelegate() {
        super.initAccessibilityDelegate();
        T t = this.mView;
        if (t != 0) {
            q0.LJIJ(t, new C1318790kQH(this));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onInvalidate() {
        if (isEnableNewGesture()) {
            this.mView.postInvalidateOnAnimation();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
    }

    public AndroidView LJJIIZI(Context context) {
        return new AndroidView(context);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, X.InterfaceC1314130kIl
    public final void afterDraw(Canvas canvas) {
        T t;
        super.afterDraw(canvas);
        C1314270kIz c1314270kIz = this.mLynxMask;
        C1313390kHZ c1313390kHZ = null;
        if (c1314270kIz != null && c1314270kIz.LIZIZ != 0) {
            Drawable drawable = c1314270kIz.LIZIZ;
            if (drawable == null) {
                drawable = null;
            }
            drawable.setBounds(0, 0, getWidth(), getHeight());
            C1314270kIz c1314270kIz2 = this.mLynxMask;
            if (c1314270kIz2 != null && (t = c1314270kIz2.LIZIZ) != 0) {
                c1313390kHZ = (C1313390kHZ) t;
            }
            c1313390kHZ.draw(canvas);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public AndroidView createView(Context context) {
        AndroidView androidViewLJJIIZI = LJJIIZI(context);
        androidViewLJJIIZI.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1339240kxG(this, 1));
        return androidViewLJJIIZI;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void interceptGesture(boolean z) {
        super.interceptGesture(z);
        ((AndroidView) this.mView).interceptGesture(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "android-enable-auto-blur")
    public void setBlurAutoUpdate(boolean z) {
        ((AndroidView) this.mView).setBlurAutoUpdate(z);
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "blur-sampling")
    public void setBlurSampling(int i) {
        ((AndroidView) this.mView).setBlurSampling(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setGestureDetectors(Map<Integer, C1311420kEO> map) {
        super.setGestureDetectors(map);
        if (map != null && !map.isEmpty()) {
            ((AndroidView) this.mView).setGestureManager(getGestureArenaManager());
        }
    }

    @InterfaceC1312540kGC(name = "impression_id")
    public void setImpressionId(String str) {
        ((AndroidView) this.mView).setImpressionId(str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptAncestors(boolean z) {
        ((AndroidView) this.mView).setPanInterceptAncestors(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptDescendants(boolean z) {
        ((AndroidView) this.mView).setPanInterceptDescendants(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptSelf(boolean z) {
        ((AndroidView) this.mView).setPanInterceptSelf(z);
    }

    public UIView(s sVar, Object obj) {
        super(sVar, obj);
        if (sVar.LJI()) {
            this.mOverflow = 3;
        }
    }
}
