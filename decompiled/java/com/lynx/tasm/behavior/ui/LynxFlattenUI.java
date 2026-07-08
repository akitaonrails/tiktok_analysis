package com.lynx.tasm.behavior.ui;

import X.C0WZX;
import X.C1313210kHH;
import X.C2204961BRm;
import X.InterfaceC1312540kGC;
import X.InterfaceC1313090kH5;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.rendernode.compat.RenderNodeCompat;
import com.lynx.tasm.rendernode.compat.RenderNodeFactory;
import j27.s;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class LynxFlattenUI extends LynxBaseUI {
    public static Method sSetUsageHint;
    public float mAlpha;
    public RenderNodeCompat mBackgroundRenderNode;
    public boolean mIsValidate;
    public RenderNodeCompat mRenderNode;

    public boolean enableRenderNode() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getRealTimeTranslationZ() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationX() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationY() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationZ() {
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public void invalidate() {
        this.mIsValidate = false;
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mDrawParent;
        if (interfaceC1313090kH5 != null) {
            interfaceC1313090kH5.invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isFlatten() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public void requestLayout() {
        this.mIsValidate = false;
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mDrawParent;
        if (interfaceC1313090kH5 != null) {
            interfaceC1313090kH5.requestLayout();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getInitialOverflowType() {
        if (this.mContext.LJI()) {
            return ("view".equals(getTagName()) || "component".equals(getTagName())) ? 0 : 1;
        }
        return 1;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void measure() {
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().measure();
        }
    }

    public final RenderNodeCompat updateRenderNode() {
        boolean z = this.mIsValidate;
        this.mIsValidate = true;
        if (!z || !this.mRenderNode.hasDisplayList()) {
            updateRenderNode(this.mRenderNode);
        }
        return this.mRenderNode;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getAlpha() {
        return this.mAlpha;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDrawingPositionChanged() {
        invalidate();
    }

    public LynxFlattenUI(Context context) {
        this((s) context);
    }

    private boolean isHardwareDraw(Canvas canvas) {
        return canvas.isHardwareAccelerated();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void detachWithViewInfo(C1313210kHH c1313210kHH) {
        if (enableRenderNode()) {
            this.mRenderNode = RenderNodeFactory.getInstance().createRenderNodeCompat();
        }
        super.detachWithViewInfo(c1313210kHH);
    }

    public void draw(Canvas canvas) throws Throwable {
        TraceEvent.LIZIZ("LynxFlattenUI.draw.");
        if (this.mAlpha <= 0.0f) {
            TraceEvent.LJII("LynxFlattenUI.draw.");
            return;
        }
        int left = getLeft();
        int top = getTop();
        int iSave = canvas.save();
        if ((left | top) != 0) {
            canvas.translate(left, top);
        }
        if (this.mAlpha < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.mAlpha * 255.0f), 31);
        }
        onDraw(canvas);
        canvas.restoreToCount(iSave);
        TraceEvent.LJII("LynxFlattenUI.draw.");
    }

    public final void innerDraw(Canvas canvas) throws Throwable {
        if (this.mRenderNode != null && isHardwareDraw(canvas)) {
            boolean z = this.mIsValidate;
            this.mIsValidate = true;
            if (!z || !this.mRenderNode.hasDisplayList()) {
                updateRenderNode(this.mRenderNode);
            }
            if (!this.mRenderNode.hasDisplayList()) {
                return;
            }
            this.mRenderNode.drawRenderNode(canvas);
            return;
        }
        draw(canvas);
    }

    public void onDraw(Canvas canvas) throws Throwable {
        BackgroundDrawable backgroundDrawable = (BackgroundDrawable) this.mLynxBackground.LIZIZ;
        if (backgroundDrawable == null) {
            return;
        }
        backgroundDrawable.setBounds(0, 0, getWidth(), getHeight());
        if (this.mContext.LLJLL && sSetUsageHint != null && canvas.isHardwareAccelerated()) {
            try {
                RenderNodeCompat drawableRenderNode = getDrawableRenderNode(backgroundDrawable, this.mBackgroundRenderNode);
                this.mBackgroundRenderNode = drawableRenderNode;
                if (drawableRenderNode.hasDisplayList()) {
                    drawableRenderNode.drawRenderNode(canvas);
                    return;
                } else {
                    backgroundDrawable.draw(canvas);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                backgroundDrawable.draw(canvas);
                return;
            }
        }
        backgroundDrawable.draw(canvas);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(defaultFloat = 1.0f, name = "opacity")
    public void setAlpha(float f) {
        this.mAlpha = f;
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        super.setTransform(readableArray);
        invalidate();
    }

    public void updateRenderNode(RenderNodeCompat renderNodeCompat) {
        int width = getWidth();
        int height = getHeight();
        int left = getLeft();
        int top = getTop();
        int i = left + width;
        int i2 = top + height;
        if (getOverflow() != 0) {
            Rect clipBounds = getClipBounds();
            i = clipBounds.right + left;
            i2 = clipBounds.bottom + top;
            left += clipBounds.left;
            top += clipBounds.top;
            width = i - left;
            height = i2 - top;
        }
        renderNodeCompat.setPosition(left, top, i, i2);
        Canvas canvasBeginRecording = renderNodeCompat.beginRecording(width, height);
        try {
            canvasBeginRecording.translate(-left, -top);
            draw(canvasBeginRecording);
            renderNodeCompat.endRecording(canvasBeginRecording);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            renderNodeCompat.endRecording(canvasBeginRecording);
            throw th;
        }
    }

    public LynxFlattenUI(s sVar) {
        this(sVar, null);
    }

    public LynxFlattenUI(s sVar, Object obj) {
        super(sVar, obj);
        this.mAlpha = 1.0f;
        if (enableRenderNode()) {
            this.mRenderNode = RenderNodeFactory.getInstance().createRenderNodeCompat();
        }
    }

    private RenderNodeCompat getDrawableRenderNode(Drawable drawable, RenderNodeCompat renderNodeCompat) throws Throwable {
        if (renderNodeCompat == null) {
            renderNodeCompat = RenderNodeFactory.getInstance().createRenderNodeCompat();
            C2204961BRm.a0(sSetUsageHint, renderNodeCompat.getRenderNode(), new Object[]{1}, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoeza0QCcio1CV312X1gmwS6u", null));
        }
        Rect bounds = drawable.getBounds();
        Canvas canvasBeginRecording = renderNodeCompat.beginRecording(bounds.width(), bounds.height());
        canvasBeginRecording.translate(-bounds.left, -bounds.top);
        try {
            drawable.draw(canvasBeginRecording);
            renderNodeCompat.endRecording(canvasBeginRecording);
            renderNodeCompat.setPosition(bounds.left, bounds.top, bounds.right, bounds.bottom);
            return renderNodeCompat;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            renderNodeCompat.endRecording(canvasBeginRecording);
            throw th;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setPosition(int i, int i2) {
        if (getOriginTop() != i2) {
            this.mOriginTop = i2;
            setTop(i2);
        }
        if (getOriginLeft() != i) {
            this.mOriginLeft = i;
            setLeft(i);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setSign(int i, String str) {
        super.setSign(i, str);
        if (this.mContext.LJI()) {
            if (str.equals("view") || str.equals("component")) {
                this.mOverflow = 3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layout(int r7, int r8, android.graphics.Rect r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxFlattenUI.layout(int, int, android.graphics.Rect):void");
    }
}
