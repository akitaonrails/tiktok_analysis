package com.bytedance.ies.xelement.overlay;

import X.C0WZX;
import X.C1298530jtb;
import X.C1311730kEt;
import X.C2204961BRm;
import X.InterfaceC1313080kH4;
import X.InterfaceC1313090kH5;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import j27.s;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxOverlayViewProxy extends UIGroup<AndroidView> implements InterfaceC1313080kH4 {
    public final LynxOverlayView LL;

    public LynxOverlayViewProxy() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final int getChildCount() {
        return this.LL.getChildCount();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final List<LynxBaseUI> getChildren() {
        return this.LL.getChildren();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAnimationUpdated() {
        this.LL.onAnimationUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        this.LL.onDetach();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
        this.LL.layout();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        super.measure();
        this.LL.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final LynxUI<?> getTransitionUI() {
        return this.LL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        this.LL.afterPropsUpdated(c1311730kEt);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        return new AndroidView(context) { // from class: X.0kDw
            {
                new LinkedHashMap();
            }

            @Override // android.view.View
            public final void onVisibilityChanged(View view, int i) {
                if (i != 0) {
                    if (i != 4 && i != 8) {
                        return;
                    }
                    this.onDetach();
                    return;
                }
                this.onAttach();
            }
        };
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final LynxBaseUI getChildAt(int i) {
        return this.LL.getChildAt(i);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void insertView(LynxUI<?> lynxUI) {
        this.LL.insertView(lynxUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        this.LL.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeView(LynxBaseUI lynxBaseUI) {
        this.LL.removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setBackgroundColor(int i) {
        this.LL.setBackgroundColor(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setParent(InterfaceC1313090kH5 interfaceC1313090kH5) {
        super.setParent(interfaceC1313090kH5);
        this.LL.setParent(interfaceC1313090kH5);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        this.LL.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        super.updateLayoutInfo(lynxBaseUI);
        this.LL.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updatePropertiesInterval(C1311730kEt c1311730kEt) {
        this.LL.updatePropertiesInterval(c1311730kEt);
    }

    public LynxOverlayViewProxy(s sVar, Object obj) {
        super(sVar, obj);
        this.LL = new LynxOverlayView(sVar, this);
        super.insertChild(this.LL, 0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Activity activityLIZ = C1298530jtb.LIZ(sVar);
        if (activityLIZ != null) {
            C2204961BRm.LLILZIL(activityLIZ.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxG/4TBOoWBpY6vkcAKfrNp38P8BadR7tQHUt5/g==", null)).getMetrics(displayMetrics);
        } else {
            LynxLog.e("LynxOverlayViewProxy", "context is not Activity!");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.LL.insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        this.LL.insertDrawList(lynxBaseUI, lynxBaseUI2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setSign(int i, String str) {
        super.setSign(i, str);
        this.LL.setSign(i, str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        super.updateDrawingLayoutInfo(i, i2, rect);
        return this.LL.updateDrawingLayoutInfo(i, i2, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        this.LL.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}
