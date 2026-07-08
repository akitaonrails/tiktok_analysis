package com.lynx.xelement.overlay;

import X.C1298530jtb;
import X.C1299120juY;
import X.C1311380kEK;
import X.C1311730kEt;
import X.C1313060kH2;
import X.InterfaceC1313080kH4;
import X.InterfaceC1313090kH5;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import j27.s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIOverlay extends UIGroup<AndroidView> implements InterfaceC1313080kH4 {
    public static final C1313060kH2 Companion = new Object() { // from class: X.0kH2
    };
    public final LynxOverlayView mOverlayView;
    public int screenHeight;
    public int screenWidth;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isOverlay() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isUserInteractionEnabled() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public int getChildCount() {
        return this.mOverlayView.getChildCount();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public List<LynxBaseUI> getChildren() {
        return this.mOverlayView.getChildren();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public C1311380kEK getTouchEventDispatcher() {
        return this.mOverlayView.LLJJJJLIIL;
    }

    public boolean isViewVisible() {
        return this.mOverlayView.LLILLL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAnimationUpdated() {
        this.mOverlayView.onAnimationUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        this.mOverlayView.onDetach();
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public LynxUI<?> getTransitionUI() {
        return this.mOverlayView;
    }

    public LynxUIOverlay(s sVar) {
        this(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void afterPropsUpdated(C1311730kEt c1311730kEt) {
        this.mOverlayView.afterPropsUpdated(c1311730kEt);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public AndroidView createView(final Context context) {
        return new AndroidView(context) { // from class: X.0kH1
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
    public LynxBaseUI getChildAt(int i) {
        return this.mOverlayView.getChildAt(i);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void insertView(LynxUI<?> lynxUI) {
        this.mOverlayView.insertView(lynxUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void removeChild(LynxBaseUI lynxBaseUI) {
        this.mOverlayView.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void removeView(LynxBaseUI lynxBaseUI) {
        this.mOverlayView.removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setBackgroundColor(int i) {
        this.mOverlayView.setBackgroundColor(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, C1299120juY> map) {
        this.mOverlayView.setEvents(map);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setParent(InterfaceC1313090kH5 interfaceC1313090kH5) {
        super.setParent(interfaceC1313090kH5);
        this.mOverlayView.setParent(interfaceC1313090kH5);
    }

    public final void setScreenHeight(int i) {
        this.screenHeight = i;
    }

    public final void setScreenWidth(int i) {
        this.screenWidth = i;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateExtraData(Object obj) {
        this.mOverlayView.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        super.updateLayoutInfo(lynxBaseUI);
        this.mOverlayView.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updatePropertiesInterval(C1311730kEt c1311730kEt) {
        this.mOverlayView.updatePropertiesInterval(c1311730kEt);
    }

    public LynxUIOverlay(s sVar, Object obj) {
        super(sVar, obj);
        this.mOverlayView = new LynxOverlayView(sVar, this);
        super.insertChild(this.mOverlayView, 0);
        Activity activityLIZ = C1298530jtb.LIZ(sVar);
        if (activityLIZ != null) {
            DisplayMetrics displayMetricsLIZ = DisplayMetricsHolder.LIZ(activityLIZ);
            this.screenHeight = displayMetricsLIZ.heightPixels;
            this.screenWidth = displayMetricsLIZ.widthPixels;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.mOverlayView.insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        this.mOverlayView.insertDrawList(lynxBaseUI, lynxBaseUI2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setSign(int i, String str) {
        super.setSign(i, str);
        this.mOverlayView.setSign(i, str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        super.updateDrawingLayoutInfo(i, i2, rect);
        return this.mOverlayView.updateDrawingLayoutInfo(i, i2, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        super.updateLayout(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
        DisplayMetrics displayMetricsLIZ = DisplayMetricsHolder.LIZ(this.mContext);
        this.mOverlayView.updateLayout(0, 0, displayMetricsLIZ.widthPixels, displayMetricsLIZ.heightPixels, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
    }
}
