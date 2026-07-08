package com.lynx.tasm.behavior.ui.view;

import X.C1310660kDA;
import X.C1311400kEM;
import X.C1311970kFH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1311940kFE;
import X.InterfaceC1314130kIl;
import X.InterfaceC1314610kJX;
import X.InterfaceC1314720kJi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.utils.BlurUtils;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class AndroidView extends ViewGroup implements InterfaceC1314720kJi, InterfaceC1314610kJX, InterfaceC1311940kFE {
    public Bitmap mBlurBitmap;
    public Canvas mBlurCanvas;
    public float mBlurRadius;
    public int mBlurSampling;
    public boolean mConsumeHoverEvent;
    public InterfaceC1314130kIl mDrawChildHook;
    public boolean mEnableBlurAutoUpdate;
    public WeakReference<C1311400kEM> mGestureArenaManager;
    public boolean mHasSetPanInterceptAncestors;
    public String mImpressionId;
    public Boolean mInterceptGesture;
    public boolean mIsAttachToWindow;
    public boolean mNeedUsePreDrawListener;
    public boolean mPanInterceptAncestors;
    public boolean mPanInterceptDescendants;
    public boolean mPanInterceptSelf;
    public final ViewTreeObserver.OnPreDrawListener mPreDrawListener;
    public boolean mPreDrawListenerAdded;
    public C1311970kFH mRenderer;
    public boolean nativeInteractionEnabled;

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    public void removeBlur() {
        this.mBlurRadius = 0.0f;
        if (BlurUtils.removeEffect(this)) {
            return;
        }
        this.mNeedUsePreDrawListener = false;
        if (this.mPreDrawListenerAdded) {
            if (this.mIsAttachToWindow) {
                C786410Ut5.D3(getViewTreeObserver(), this.mPreDrawListener);
                this.mPreDrawListenerAdded = false;
            }
            this.mBlurBitmap = null;
            this.mBlurCanvas = null;
        }
    }

    private boolean isInterceptGestureNotNull() {
        return this.mInterceptGesture != null;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
        return interfaceC1314130kIl != null ? interfaceC1314130kIl.hasOverlappingRendering() : super.hasOverlappingRendering();
    }

    private boolean isNeedInterceptGesture() {
        return isInterceptGestureNotNull() && this.mInterceptGesture.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBlur() {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            this.mBlurBitmap = null;
            return;
        }
        if (width * height * 4 >= 104857600) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Skip blur bitmap creation: w=");
            sbLIZ.append(width);
            sbLIZ.append(" h=");
            sbLIZ.append(height);
            sbLIZ.append(" exceeds limit maxPixels=");
            sbLIZ.append(104857600);
            LynxLog.e("AndroidView", C2188811AlT.LIZIZ(sbLIZ));
            this.mBlurBitmap = null;
            return;
        }
        Bitmap bitmap = this.mBlurBitmap;
        if (bitmap == null || bitmap.getWidth() != width || this.mBlurBitmap.getHeight() != height) {
            this.mBlurBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.mBlurCanvas = new Canvas(this.mBlurBitmap);
        }
        this.mBlurBitmap.eraseColor(0);
        this.mBlurCanvas.save();
        super.draw(this.mBlurCanvas);
        this.mBlurCanvas.restore();
        Bitmap bitmapBlur = BlurUtils.blur(getContext(), this.mBlurBitmap, width, height, this.mBlurRadius, this.mBlurSampling);
        this.mBlurBitmap = bitmapBlur;
        this.mBlurCanvas.setBitmap(bitmapBlur);
    }

    @Override // android.view.View
    public void computeScroll() {
        C1311400kEM c1311400kEM;
        super.computeScroll();
        WeakReference<C1311400kEM> weakReference = this.mGestureArenaManager;
        if (weakReference == null || (c1311400kEM = weakReference.get()) == null) {
            return;
        }
        c1311400kEM.LIZ();
    }

    @Override // X.InterfaceC1314610kJX
    public void invalidateMeaningfulPaintingArea() {
        C1310660kDA c1310660kDALJIILL;
        if (!(getContext() instanceof s) || (c1310660kDALJIILL = ((s) getContext()).LJIILL()) == null) {
            return;
        }
        c1310660kDALJIILL.invalidateMeaningfulPaintingArea();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsAttachToWindow = true;
        if (!this.mNeedUsePreDrawListener || this.mPreDrawListenerAdded) {
            return;
        }
        C786410Ut5.y3(getViewTreeObserver(), this.mPreDrawListener);
        this.mPreDrawListenerAdded = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mIsAttachToWindow = false;
        if (this.mPreDrawListenerAdded) {
            C786410Ut5.D3(getViewTreeObserver(), this.mPreDrawListener);
            this.mPreDrawListenerAdded = false;
        }
    }

    @Override // X.InterfaceC1314610kJX
    public InterfaceC1314130kIl getDrawChildHook() {
        return this.mDrawChildHook;
    }

    public String getImpressionId() {
        return this.mImpressionId;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.mRenderer;
    }

    public AndroidView(Context context) {
        super(context);
        this.mEnableBlurAutoUpdate = true;
        this.mBlurSampling = 1;
        this.mPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0kIp
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                TraceEvent.LIZIZ("AndroidView:blur");
                this.LL.updateBlur();
                TraceEvent.LJII("AndroidView:blur");
                AndroidView androidView = this.LL;
                if (androidView.mEnableBlurAutoUpdate) {
                    return true;
                }
                C786410Ut5.D3(androidView.getViewTreeObserver(), this.LL.mPreDrawListener);
                this.LL.mPreDrawListenerAdded = false;
                return true;
            }
        };
        this.mConsumeHoverEvent = false;
        this.nativeInteractionEnabled = false;
        this.mPanInterceptSelf = false;
        this.mPanInterceptAncestors = false;
        this.mHasSetPanInterceptAncestors = false;
        this.mPanInterceptDescendants = false;
    }

    @Override // X.InterfaceC1314720kJi
    public void bindDrawChildHook(InterfaceC1314130kIl interfaceC1314130kIl) {
        this.mDrawChildHook = interfaceC1314130kIl;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
        if (interfaceC1314130kIl != null) {
            interfaceC1314130kIl.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        InterfaceC1314130kIl interfaceC1314130kIl2 = this.mDrawChildHook;
        if (interfaceC1314130kIl2 != null) {
            interfaceC1314130kIl2.afterDispatchDraw(canvas);
        }
        C1311970kFH c1311970kFH = this.mRenderer;
        if (c1311970kFH != null) {
            c1311970kFH.LIZ(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.mPanInterceptAncestors) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (this.mHasSetPanInterceptAncestors) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
        if (interfaceC1314130kIl != null) {
            interfaceC1314130kIl.beforeDraw(canvas);
        }
        if (this.mBlurRadius != 0.0f && (bitmap = this.mBlurBitmap) != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            super.draw(canvas);
        }
        InterfaceC1314130kIl interfaceC1314130kIl2 = this.mDrawChildHook;
        if (interfaceC1314130kIl2 != null) {
            interfaceC1314130kIl2.afterDraw(canvas);
        }
    }

    public void interceptGesture(boolean z) {
        this.mInterceptGesture = Boolean.valueOf(z);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mRenderer != null) {
            this.mRenderer.LJ(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!super.onHoverEvent(motionEvent) && !this.mConsumeHoverEvent) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mPanInterceptDescendants) {
            return true;
        }
        if (isNeedInterceptGesture()) {
            return this.mInterceptGesture.booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mPanInterceptAncestors) {
            return true;
        }
        if (this.mPanInterceptSelf) {
            return false;
        }
        if (this.nativeInteractionEnabled) {
            return true;
        }
        if (isInterceptGestureNotNull()) {
            if (motionEvent.getActionMasked() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (motionEvent.getActionMasked() == 2) {
                getParent().requestDisallowInterceptTouchEvent(this.mInterceptGesture.booleanValue());
                boolean zBooleanValue = this.mInterceptGesture.booleanValue();
                if (!this.mInterceptGesture.booleanValue()) {
                    return super.onTouchEvent(motionEvent);
                }
                return zBooleanValue;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                this.mInterceptGesture = null;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlur(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.mBlurRadius = f;
        if (BlurUtils.createEffect(this, f)) {
            return;
        }
        if (f == 0.0f) {
            removeBlur();
            return;
        }
        this.mNeedUsePreDrawListener = true;
        if (this.mIsAttachToWindow && !this.mPreDrawListenerAdded) {
            C786410Ut5.y3(getViewTreeObserver(), this.mPreDrawListener);
            setBackgroundColor(0);
            this.mPreDrawListenerAdded = true;
        }
    }

    public void setBlurAutoUpdate(boolean z) {
        this.mEnableBlurAutoUpdate = z;
        if (z && this.mNeedUsePreDrawListener && this.mIsAttachToWindow && !this.mPreDrawListenerAdded) {
            C786410Ut5.y3(getViewTreeObserver(), this.mPreDrawListener);
            this.mPreDrawListenerAdded = true;
        }
        invalidate();
    }

    public void setBlurSampling(int i) {
        this.mBlurSampling = i;
    }

    @Override // android.view.ViewGroup
    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setConsumeHoverEvent(boolean z) {
        this.mConsumeHoverEvent = z;
    }

    public void setGestureManager(C1311400kEM c1311400kEM) {
        this.mGestureArenaManager = new WeakReference<>(c1311400kEM);
    }

    public void setImpressionId(String str) {
        this.mImpressionId = str;
    }

    public void setNativeInteractionEnabled(boolean z) {
        this.nativeInteractionEnabled = z;
    }

    public void setPanInterceptAncestors(boolean z) {
        this.mPanInterceptAncestors = z;
        if (z) {
            this.mHasSetPanInterceptAncestors = true;
        }
    }

    public void setPanInterceptDescendants(boolean z) {
        this.mPanInterceptDescendants = z;
    }

    public void setPanInterceptSelf(boolean z) {
        this.mPanInterceptSelf = z;
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.mRenderer = c1311970kFH;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
        if (interfaceC1314130kIl != null) {
            return interfaceC1314130kIl.getChildDrawingOrder(i, i2);
        }
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        InterfaceC1314130kIl interfaceC1314130kIl;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (!getRootView().isLayoutRequested() && (interfaceC1314130kIl = this.mDrawChildHook) != null) {
            interfaceC1314130kIl.performMeasureChildrenUI();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Rect rectBeforeDrawChild;
        boolean zDrawChild;
        InterfaceC1314130kIl interfaceC1314130kIl = this.mDrawChildHook;
        if (interfaceC1314130kIl != null) {
            rectBeforeDrawChild = interfaceC1314130kIl.beforeDrawChild(canvas, view, j);
        } else {
            rectBeforeDrawChild = null;
        }
        C1311970kFH c1311970kFH = this.mRenderer;
        if (c1311970kFH != null) {
            c1311970kFH.LIZIZ(canvas, view);
        }
        if (rectBeforeDrawChild != null) {
            canvas.save();
            canvas.clipRect(rectBeforeDrawChild);
            zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        } else {
            zDrawChild = super.drawChild(canvas, view, j);
        }
        InterfaceC1314130kIl interfaceC1314130kIl2 = this.mDrawChildHook;
        if (interfaceC1314130kIl2 != null) {
            interfaceC1314130kIl2.afterDrawChild(canvas, view, j);
        }
        C1311970kFH c1311970kFH2 = this.mRenderer;
        if (c1311970kFH2 != null) {
            c1311970kFH2.getClass();
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC1314130kIl interfaceC1314130kIl;
        C1311970kFH c1311970kFH = this.mRenderer;
        if (c1311970kFH != null) {
            LynxUI<ViewGroup> lynxUI = c1311970kFH.LJII;
            if (lynxUI != null) {
                lynxUI.measure();
            }
            this.mRenderer.LJFF();
        }
        if (!getRootView().isLayoutRequested() && (interfaceC1314130kIl = this.mDrawChildHook) != null) {
            interfaceC1314130kIl.performLayoutChildrenUI();
        }
    }
}
