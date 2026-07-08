package com.lynx.tasm.behavior.ui;

import X.C092S;
import X.C1285920jZG;
import X.C1289620jfE;
import X.C1301610jyZ;
import X.C1310360kCg;
import X.C1310440kCo;
import X.C1310450kCp;
import X.C1310660kDA;
import X.C1311380kEK;
import X.C1311740kEu;
import X.C1311820kF2;
import X.C1311880kF8;
import X.C1311890kF9;
import X.C1312040kFO;
import X.C1312080kFS;
import X.C1313180kHE;
import X.C1313200kHG;
import X.C1313210kHH;
import X.C1313230kHJ;
import X.C1313280kHO;
import X.C1313290kHP;
import X.C1313320kHS;
import X.C1313330kHT;
import X.C1313370kHX;
import X.C1313440kHe;
import X.C1313840kII;
import X.C1313910kIP;
import X.C1314000kIY;
import X.C1314250kIx;
import X.C1314290kJ1;
import X.C1314310kJ3;
import X.C1314530kJP;
import X.C1339300kxM;
import X.C14K9;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1313880kIM;
import X.InterfaceC1289280jeg;
import X.InterfaceC1298070jsr;
import X.InterfaceC1310510kCv;
import X.InterfaceC1310520kCw;
import X.InterfaceC1312540kGC;
import X.InterfaceC1313090kH5;
import X.InterfaceC1313190kHF;
import X.InterfaceC1314130kIl;
import X.InterfaceC1314320kJ4;
import X.InterfaceC1314720kJi;
import X.InterfaceC1967107nB;
import Y.ACallableS425S0100000_20;
import Y.ARunnableS120S0100000_20;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.renderscript.Matrix4f;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.LynxUIRenderer;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.featurecount.LynxFeatureCounter;
import com.lynx.tasm.utils.DeviceUtils;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class LynxUI<T extends View> extends LynxBaseUI implements InterfaceC1314320kJ4 {
    public static final boolean ENABLE_ZINDEX = false;
    public float mAlpha;
    public C1313370kHX[] mAnimationInfos;
    public C1313200kHG mBackgroundManager;
    public float mBrightnessAmount;
    public C1313910kIP mClipPath;
    public float mContrastAmount;
    public LynxBaseUI mDrawHead;
    public boolean mEnableReuseAnimationState;
    public boolean mFirstRender;
    public float mGrayscaleAmount;
    public C1313180kHE mHeroAnimOwner;
    public float mHueRotateAmount;
    public boolean mIsAutoOffsetRotate;
    public C1313320kHS mKeyframeManager;
    public float mLastOffsetEffectRotate;
    public float mLastOffsetEffectX;
    public float mLastOffsetEffectY;
    public C1311820kF2 mLayoutAnimator;
    public float mOffsetDistance;
    public boolean mOffsetHasChanged;
    public C1313910kIP mOffsetPath;
    public float mOffsetRotate;
    public C092S<T> mOnceTask;
    public boolean mOverlappingRendering;
    public ReadableArray mRawOffsetShape;
    public float mSaturateAmount;
    public boolean mSetVisibleByCSS;
    public C1312040kFO mTransitionAnimator;
    public T mView;
    public C1313210kHH mViewInfo;

    @Override // X.InterfaceC1314320kJ4
    public void afterDispatchProcessViewInfo(C1313210kHH c1313210kHH) {
    }

    @Override // X.InterfaceC1314320kJ4
    public void afterProcessChildViewInfo(C1313210kHH c1313210kHH, View view, long j) {
    }

    @Override // X.InterfaceC1314320kJ4
    public void afterProcessViewInfo(C1313210kHH c1313210kHH) {
    }

    @Override // X.InterfaceC1314320kJ4
    public void beforeDispatchProcessViewInfo(C1313210kHH c1313210kHH) {
    }

    @Override // X.InterfaceC1314320kJ4
    public void beforeProcessChildViewInfo(C1313210kHH c1313210kHH, View view, long j) {
    }

    public T createView(Context context) {
        return null;
    }

    public LynxUI getTransitionUI() {
        return null;
    }

    public void initAccessibilityDelegate() {
    }

    @Override // X.InterfaceC1314320kJ4
    public void processLayoutChildren() {
    }

    @Override // X.InterfaceC1314320kJ4
    public void processMeasureChildren() {
    }

    public void setLayoutAnimationCreateTimingFunc(String str) {
    }

    private void prepareKeyframeManager() {
        if (this.mKeyframeManager == null) {
            this.mKeyframeManager = new C1313320kHS(this);
        }
    }

    private void prepareLayoutAnimator() {
        if (this.mLayoutAnimator == null) {
            this.mLayoutAnimator = new C1311820kF2();
        }
    }

    private boolean shouldDoTransformTransition() {
        C1312040kFO c1312040kFO;
        return !this.mIsFirstAnimatedReady && this.hasTransformChanged && (c1312040kFO = this.mTransitionAnimator) != null && c1312040kFO.LIZIZ(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
    }

    public void didEnsureCreateView() {
        Drawable drawable;
        C1313200kHG c1313200kHG = this.mBackgroundManager;
        if (c1313200kHG != null && (drawable = c1313200kHG.LIZIZ) != null) {
            this.mView.setBackground(drawable);
        }
        if (this.mAlpha != this.mView.getAlpha()) {
            C786410Ut5.T4(this.mView, this.mAlpha);
        }
        if (this.mAnimationInfos != null) {
            prepareKeyframeManager();
            C1313320kHS c1313320kHS = this.mKeyframeManager;
            c1313320kHS.LIZIZ = this.mAnimationInfos;
            c1313320kHS.LIZJ();
        }
    }

    public void dispatchProcessViewInfo() {
        for (LynxBaseUI lynxBaseUI = this.mDrawHead; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            if (lynxBaseUI instanceof LynxUI) {
                processChildViewInfo((LynxUI) lynxBaseUI);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean enableLayoutAnimation() {
        C1311890kF9 c1311890kF9;
        C1312080kFS c1312080kFS;
        C1311820kF2 c1311820kF2 = this.mLayoutAnimator;
        if (c1311820kF2 == null) {
            return false;
        }
        C1311880kF8 c1311880kF8 = c1311820kF2.LJIJI;
        return (c1311880kF8 != null && c1311880kF8.LIZJ()) || ((c1311890kF9 = c1311820kF2.LJIJJLI) != null && c1311890kF9.LIZJ()) || ((c1312080kFS = c1311820kF2.LJIJJ) != null && c1312080kFS.LIZJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ensureCreateView() {
        C092S<T> c092s = this.mOnceTask;
        if (c092s != null) {
            c092s.run();
            this.mView = this.mOnceTask.LIZ();
            this.mOnceTask = null;
        }
        if (this.mView == null) {
            T t = (T) createView(this.mContext, this.mParam);
            this.mView = t;
            if (t == null) {
                this.mView = (T) createView(this.mContext);
            }
        }
        T t2 = this.mView;
        if ((t2 instanceof InterfaceC1314720kJi) && (this instanceof InterfaceC1314130kIl)) {
            ((InterfaceC1314720kJi) t2).bindDrawChildHook((InterfaceC1314130kIl) this);
        }
        if ((this.mDrawParent instanceof UIGroup) && this.mView.getParent() == null) {
            ((UIGroup) this.mDrawParent).insertChildWhenRebuildView(this);
        }
        didEnsureCreateView();
        this.mView.requestLayout();
        this.mView.invalidate();
    }

    public void execPauseAnim() {
        C1313370kHX c1313370kHX;
        C1313180kHE c1313180kHE = this.mHeroAnimOwner;
        c1313180kHE.getClass();
        if (!C1310440kCo.LIZ.LJI || c1313180kHE.LIZ() || (c1313370kHX = c1313180kHE.LJI) == null) {
            return;
        }
        c1313180kHE.LIZ.setAnimation(c1313370kHX);
        if (c1313180kHE.LIZ.getKeyframeManager() != null) {
            c1313180kHE.LIZ.getKeyframeManager().LIZJ();
        }
    }

    public void execResumeAnim() {
        C1313370kHX c1313370kHX;
        C1313180kHE c1313180kHE = this.mHeroAnimOwner;
        c1313180kHE.getClass();
        if (!C1310440kCo.LIZ.LJI || c1313180kHE.LIZ() || (c1313370kHX = c1313180kHE.LJII) == null) {
            return;
        }
        c1313180kHE.LIZ.setAnimation(c1313370kHX);
        if (c1313180kHE.LIZ.getKeyframeManager() != null) {
            c1313180kHE.LIZ.getKeyframeManager().LIZJ();
        }
    }

    public int getBackgroundColor() {
        return this.mBackgroundManager.LJ;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getRealTimeTranslationZ() {
        return this.mView.getTranslationZ();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getScaleX() {
        T t = this.mView;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getScaleY() {
        T t = this.mView;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public Matrix getTransformMatrix() {
        T t = this.mView;
        return (t == null || t.getMatrix() == null) ? super.getTransformMatrix() : this.mView.getMatrix();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationX() {
        return this.mView.getTranslationX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationY() {
        return this.mView.getTranslationY();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleLayout() {
        /*
            r7 = this;
            boolean r0 = r7.mIsDetachedWithView
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = com.lynx.tasm.base.TraceController.isTracingStarted()
            if (r0 == 0) goto Lad
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "LynxUI.layout."
            r1.append(r0)
            java.lang.String r0 = r7.getTagName()
            r1.append(r0)
            java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)
            com.lynx.tasm.base.TraceEvent.LIZIZ(r6)
        L22:
            T extends android.view.View r5 = r7.mView
            int r4 = r7.getLeft()
            int r3 = r7.getTop()
            int r2 = r7.getLeft()
            int r0 = r7.getWidth()
            int r2 = r2 + r0
            int r1 = r7.getTop()
            int r0 = r7.getHeight()
            int r1 = r1 + r0
            r5.layout(r4, r3, r2, r1)
            X.0kH5 r1 = r7.mParent
            boolean r0 = r1 instanceof com.lynx.tasm.behavior.ui.UIShadowProxy
            if (r0 == 0) goto L49
            com.lynx.tasm.behavior.ui.UIShadowProxy r1 = (com.lynx.tasm.behavior.ui.UIShadowProxy) r1
        L49:
            T extends android.view.View r0 = r7.mView
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L80
            T extends android.view.View r0 = r7.mView
            android.view.ViewParent r3 = r0.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            float r0 = r7.mSkewX
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            if (r0 != 0) goto Lab
            float r0 = r7.mSkewY
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lab
            r1 = 0
        L6a:
            int r0 = r7.getOverflow()
            if (r0 != 0) goto L72
            if (r1 == 0) goto L77
        L72:
            r3.setClipChildren(r2)
            if (r1 != 0) goto L80
        L77:
            T extends android.view.View r1 = r7.mView
            android.graphics.Rect r0 = r7.getBoundRectForOverflow()
            r1.setClipBounds(r0)
        L80:
            int r0 = r7.getOverflow()
            if (r0 == 0) goto La1
            int r0 = r7.getWidth()
            if (r0 == 0) goto L92
            int r0 = r7.getHeight()
            if (r0 != 0) goto La1
        L92:
            T extends android.view.View r1 = r7.mView
            boolean r0 = r1 instanceof X.ActionModeCallbackC1315180kKS
            if (r0 == 0) goto La1
            X.0kKS r1 = (X.ActionModeCallbackC1315180kKS) r1
            int r0 = r7.getOverflow()
            r1.setOverflow(r0)
        La1:
            boolean r0 = com.lynx.tasm.base.TraceController.isTracingStarted()
            if (r0 == 0) goto Laa
            com.lynx.tasm.base.TraceEvent.LJII(r6)
        Laa:
            return
        Lab:
            r1 = 1
            goto L6a
        Lad:
            r6 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxUI.handleLayout():void");
    }

    public boolean hasAnimationRunning() {
        T t;
        HashMap<String, C1313330kHT> map;
        C1313320kHS c1313320kHS = this.mKeyframeManager;
        if (c1313320kHS != null && (map = c1313320kHS.LIZJ) != null) {
            Iterator<C1313330kHT> it2 = map.values().iterator();
            while (it2.hasNext()) {
                if (it2.next().LJII == EnumC1313880kIM.RUNNING) {
                    break;
                }
            }
            return this.mTransitionAnimator != null ? false : false;
        }
        if ((this.mTransitionAnimator != null || !(!r0.LJII.isEmpty())) && ((t = this.mView) == null || t.getAnimation() == null)) {
            return false;
        }
        return true;
    }

    public boolean hasOverlappingRenderingEnabled() {
        if (!"HUAWEI".equals(Build.MANUFACTURER) || DeviceUtils.is64BitDevice()) {
            return this.mOverlappingRendering;
        }
        LynxLog.i("LynxUI", "Disable overlap rendering for Huawei 32bit machine");
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public void invalidate() {
        T t = this.mView;
        if (t == null) {
            return;
        }
        t.invalidate();
    }

    public boolean isRtl() {
        return this.mLynxDirection == 2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isUserInteractionEnabled() {
        T t;
        return this.userInteractionEnabled && (t = this.mView) != null && t.getVisibility() == 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isVisible() {
        T t = this.mView;
        if (t != null && t.getVisibility() == 0 && this.mView.getAlpha() >= 0.01d) {
            return this.mView.isAttachedToWindow();
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDrawingPositionChanged() {
        if (this.mView.isLayoutRequested()) {
            return;
        }
        handleLayout();
        invalidate();
    }

    public void processViewInfo() {
        beforeProcessViewInfo(this.mViewInfo);
        beforeDispatchProcessViewInfo(this.mViewInfo);
        dispatchProcessViewInfo();
        afterDispatchProcessViewInfo(this.mViewInfo);
        afterProcessViewInfo(this.mViewInfo);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void registerViewAccordingToNodeIndex() {
        s sVar = this.mContext;
        if (sVar == null || sVar.LJIILL() == null) {
            return;
        }
        this.mContext.LJIILL().registerViewAccordingToNodeIndex(this.mNodeIndex, this.mView);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public void requestLayout() {
        this.mView.requestLayout();
    }

    public void setLayoutParamsInternal() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 == null || !(interfaceC1313090kH5 instanceof UIGroup) || !((LynxBaseUI) interfaceC1313090kH5).needCustomLayout() || (layoutParamsGenerateLayoutParams = ((LynxBaseUI) this.mParent).generateLayoutParams((layoutParams = this.mView.getLayoutParams()))) == null || layoutParams == layoutParamsGenerateLayoutParams) {
            return;
        }
        updateLayoutParams(layoutParamsGenerateLayoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updatePerspectiveToView() {
        /*
            r7 = this;
            j27.s r0 = r7.mContext
            android.util.DisplayMetrics r0 = r0.LLJJJ
            float r6 = r0.density
            com.lynx.react.bridge.ReadableArray r0 = r7.mPerspective
            if (r0 == 0) goto L8d
            int r0 = r0.size()
            r3 = 1
            if (r0 <= r3) goto L8d
            com.lynx.react.bridge.ReadableArray r0 = r7.mPerspective
            int r1 = r0.getInt(r3)
            r0 = 3
            if (r1 == r0) goto L8d
            com.lynx.react.bridge.ReadableArray r0 = r7.mPerspective
            int r0 = r0.getInt(r3)
            r2 = 0
            if (r0 != 0) goto L3f
            com.lynx.react.bridge.ReadableArray r0 = r7.mPerspective
            double r2 = r0.getDouble(r2)
            double r0 = (double) r6
            double r2 = r2 * r0
            double r2 = r2 * r0
            float r0 = com.lynx.tasm.behavior.ui.LynxBaseUI.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER
            double r0 = (double) r0
            double r2 = r2 * r0
            float r0 = (float) r2
        L31:
            float r1 = r7.mPrePerspectiveValue
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L3e
            r7.mPrePerspectiveValue = r0
            T extends android.view.View r1 = r7.mView
            r1.setCameraDistance(r0)
        L3e:
            return
        L3f:
            com.lynx.react.bridge.ReadableArray r0 = r7.mPerspective
            int r0 = r0.getInt(r3)
            if (r0 == r3) goto L50
            com.lynx.react.bridge.ReadableArray r0 = r7.mPerspective
            int r1 = r0.getInt(r3)
            r0 = 2
            if (r1 != r0) goto L86
        L50:
            j27.s r0 = r7.mContext
            com.lynx.tasm.behavior.ui.UIBody r0 = r0.LLJILJILJ
            if (r0 == 0) goto L86
            com.lynx.react.bridge.ReadableArray r0 = r7.mPerspective
            int r0 = r0.getInt(r3)
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r0 != r3) goto L76
            com.lynx.react.bridge.ReadableArray r0 = r7.mPerspective
            double r2 = r0.getDouble(r2)
            double r2 = r2 / r4
            j27.s r0 = r7.mContext
            com.lynx.tasm.behavior.ui.UIBody r0 = r0.LLJILJILJ
            int r0 = r0.getLatestWidth()
        L6f:
            double r0 = (double) r0
            double r2 = r2 * r0
        L71:
            float r1 = (float) r2
            float r1 = r1 * r6
            float r0 = com.lynx.tasm.behavior.ui.LynxBaseUI.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER
            goto La2
        L76:
            com.lynx.react.bridge.ReadableArray r0 = r7.mPerspective
            double r2 = r0.getDouble(r2)
            double r2 = r2 / r4
            j27.s r0 = r7.mContext
            com.lynx.tasm.behavior.ui.UIBody r0 = r0.LLJILJILJ
            int r0 = r0.getLatestHeight()
            goto L6f
        L86:
            com.lynx.react.bridge.ReadableArray r0 = r7.mPerspective
            double r2 = r0.getDouble(r2)
            goto L71
        L8d:
            int r1 = r7.getWidth()
            int r0 = r7.getHeight()
            if (r1 <= r0) goto La4
            int r0 = r7.getWidth()
        L9b:
            float r1 = (float) r0
            float r1 = r1 * r6
            float r0 = com.lynx.tasm.behavior.ui.LynxBaseUI.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER
            float r1 = r1 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
        La2:
            float r0 = r0 * r1
            goto L31
        La4:
            int r0 = r7.getHeight()
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxUI.updatePerspectiveToView():void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void createViewAsync() {
        super.createViewAsync();
        C092S<T> c092s = new C092S<>(new ACallableS425S0100000_20(this, 6), new C1339300kxM(this, 0));
        this.mOnceTask = c092s;
        LynxEnv.runJavaTaskOnConcurrentLoop(new ARunnableS120S0100000_20(c092s, 56), 0);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        C1312040kFO c1312040kFO = this.mTransitionAnimator;
        if (c1312040kFO != null) {
            c1312040kFO.LJ();
        }
        C1313320kHS c1313320kHS = this.mKeyframeManager;
        if (c1313320kHS != null) {
            c1313320kHS.LIZIZ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void initialize() {
        super.initialize();
        T t = (T) getOrCreateView(this.mContext, this.mParam);
        this.mView = t;
        if (t == null) {
            return;
        }
        this.mHeroAnimOwner = new C1313180kHE(this);
        C1313200kHG c1313200kHG = new C1313200kHG(this, this.mContext);
        this.mBackgroundManager = c1313200kHG;
        this.mLynxBackground = c1313200kHG;
        c1313200kHG.LIZJ = this.mDrawableCallback;
        C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
        if (c1310360kCgLJIIL == null || !c1310360kCgLJIIL.LJFF()) {
            return;
        }
        initAccessibilityDelegate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void measure() {
        String strLIZIZ;
        if (TraceController.isTracingStarted()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxUI.measure.");
            sbLIZ.append(getTagName());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            TraceEvent.LIZLLL(strLIZIZ);
        } else {
            strLIZIZ = null;
        }
        if (!this.mIsDetachedWithView) {
            setLayoutParamsInternal();
            this.mView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        }
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII(strLIZIZ);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAnimationNodeReady() {
        C1311380kEK c1311380kEK;
        HashSet<Integer> hashSet;
        float[] fArr;
        super.onAnimationNodeReady();
        updatePerspectiveToView();
        if (shouldDoTransform()) {
            C1313200kHG c1313200kHG = this.mBackgroundManager;
            C1314250kIx c1314250kIx = this.mTransformOrigin;
            LynxUI lynxUI = c1313200kHG.LJFF.get();
            if (lynxUI != null && lynxUI.mView != null && c1314250kIx != null) {
                float latestWidth = lynxUI.getLatestWidth();
                float latestHeight = lynxUI.getLatestHeight();
                C1313230kHJ c1313230kHJ = new C1313230kHJ();
                c1313230kHJ.LIZ = latestWidth * 0.5f;
                c1313230kHJ.LIZIZ = latestHeight * 0.5f;
                if (c1314250kIx != C1314250kIx.LJ) {
                    float f = c1314250kIx.LIZ;
                    if (f != 0.5f || c1314250kIx.LIZIZ != 1) {
                        if (c1314250kIx.LIZIZ == 1) {
                            f *= latestWidth;
                        }
                        c1313230kHJ.LIZ = f;
                    }
                    float f2 = c1314250kIx.LIZJ;
                    if (f2 != 0.5f || c1314250kIx.LIZLLL != 1) {
                        if (c1314250kIx.LIZLLL == 1) {
                            f2 *= latestHeight;
                        }
                        c1313230kHJ.LIZIZ = f2;
                    }
                }
                lynxUI.mView.setPivotX(c1313230kHJ.LIZ);
                lynxUI.mView.setPivotY(c1313230kHJ.LIZIZ);
                lynxUI.mView.invalidate();
            }
            if (shouldDoTransformTransition()) {
                C1312040kFO c1312040kFO = this.mTransitionAnimator;
                LynxBaseUI lynxBaseUI = c1312040kFO.LJI;
                if (lynxBaseUI == null) {
                    lynxBaseUI = this;
                }
                c1312040kFO.LIZ(lynxBaseUI, SpeechEngineDefines.TTS_WORK_MODE_BOTH, lynxBaseUI.mTransformRaw);
            } else {
                C1312040kFO c1312040kFO2 = this.mTransitionAnimator;
                if (c1312040kFO2 != null) {
                    c1312040kFO2.LJFF(Integer.valueOf(SpeechEngineDefines.TTS_WORK_MODE_BOTH));
                }
                this.mBackgroundManager.LJIJI(this.mTransformRaw);
            }
        }
        if (this.mOffsetHasChanged) {
            C1313910kIP c1313910kIP = this.mOffsetPath;
            if (c1313910kIP != null) {
                Path pathLIZJ = c1313910kIP.LIZJ(getWidth(), getHeight());
                float f3 = this.mOffsetDistance;
                if (pathLIZJ == null) {
                    fArr = new float[]{0.0f, 0.0f, 0.0f};
                } else {
                    float f4 = 0.0f;
                    float fMax = Math.max(0.0f, Math.min(1.0f, f3));
                    C1314290kJ1 c1314290kJ1 = C1314530kJP.LIZ.get(pathLIZJ);
                    if (c1314290kJ1 == null) {
                        c1314290kJ1 = new C1314290kJ1();
                        PathMeasure pathMeasure = new PathMeasure(pathLIZJ, false);
                        do {
                            float length = pathMeasure.getLength();
                            ((ArrayList) c1314290kJ1.LIZIZ).add(Float.valueOf(length));
                            c1314290kJ1.LIZ += length;
                        } while (pathMeasure.nextContour());
                        C1314530kJP.LIZ.put(pathLIZJ, c1314290kJ1);
                    }
                    float f5 = c1314290kJ1.LIZ * fMax;
                    int i = 0;
                    while (true) {
                        if (i >= ((ArrayList) c1314290kJ1.LIZIZ).size()) {
                            i = 0;
                            break;
                        }
                        float fFloatValue = ((Float) ListProtector.get(c1314290kJ1.LIZIZ, i)).floatValue() + f4;
                        if (f5 <= fFloatValue) {
                            break;
                        }
                        i++;
                        f4 = fFloatValue;
                    }
                    PathMeasure pathMeasure2 = new PathMeasure(pathLIZJ, false);
                    for (int i2 = 0; i2 < i; i2++) {
                        pathMeasure2.nextContour();
                    }
                    float f6 = f5 - f4;
                    float[] fArr2 = new float[2];
                    pathMeasure2.getPosTan(f6, fArr2, new float[2]);
                    fArr = new float[]{fArr2[0], fArr2[1], (float) ((Math.toDegrees(Math.atan2(r1[0], r1[1])) + 360.0d) % 180.0d)};
                }
                if (this.mIsAutoOffsetRotate) {
                    applyOffsetAndRotate(fArr[0], fArr[1], fArr[2]);
                } else {
                    applyOffsetAndRotate(fArr[0], fArr[1], this.mOffsetRotate);
                }
            }
            this.mOffsetHasChanged = false;
        }
        C1312040kFO c1312040kFO3 = this.mTransitionAnimator;
        if (c1312040kFO3 != null && !c1312040kFO3.LJIIIIZZ.isEmpty()) {
            for (Map.Entry<Integer, Animator> entry : c1312040kFO3.LJIIIIZZ.entrySet()) {
                Animator animator = c1312040kFO3.LJII.get(entry.getKey());
                if (animator != null) {
                    animator.cancel();
                }
                Animator animatorClone = entry.getValue().clone();
                animatorClone.setDuration(10000000L);
                animatorClone.setStartDelay(0L);
                if (animatorClone instanceof AnimatorSet) {
                    Iterator<Animator> it2 = ((AnimatorSet) animatorClone).getChildAnimations().iterator();
                    while (it2.hasNext()) {
                        it2.next().removeAllListeners();
                    }
                }
                animatorClone.removeAllListeners();
                animatorClone.addListener(new AnimatorListenerAdapter() { // from class: X.0kFW
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator2) {
                        super.onAnimationStart(animator2);
                        animator2.cancel();
                    }
                });
                animatorClone.start();
                entry.getValue().start();
                c1312040kFO3.LJII.put(entry.getKey(), entry.getValue());
            }
            c1312040kFO3.LJIIIIZZ.clear();
        }
        C1313320kHS c1313320kHS = this.mKeyframeManager;
        if (c1313320kHS != null) {
            c1313320kHS.LIZJ();
        }
        s sVar = this.mContext;
        if (sVar != null && (c1311380kEK = sVar.LLIZLLLIL) != null && c1311380kEK.LJIILLIIL && this.mHasTranslateDiff && c1311380kEK != null && (hashSet = c1311380kEK.LJIJJLI) != null) {
            hashSet.add(Integer.valueOf(getSign()));
        }
        this.mHasTranslateDiff = false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        HashMap<String, C1313330kHT> map;
        int length;
        super.onAttach();
        C1313320kHS c1313320kHS = this.mKeyframeManager;
        if (c1313320kHS == null || (map = c1313320kHS.LIZJ) == null) {
            return;
        }
        for (C1313330kHT c1313330kHT : map.values()) {
            ObjectAnimator[] objectAnimatorArr = c1313330kHT.LJI;
            if (objectAnimatorArr != null && (length = objectAnimatorArr.length) > 0) {
                objectAnimatorArr[length - 1].addListener(new C1313290kHP(c1313330kHT));
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        HashMap<String, C1313330kHT> map;
        super.onDetach();
        C1313320kHS c1313320kHS = this.mKeyframeManager;
        if (c1313320kHS != null && (map = c1313320kHS.LIZJ) != null) {
            Iterator<C1313330kHT> it2 = map.values().iterator();
            while (it2.hasNext()) {
                ObjectAnimator[] objectAnimatorArr = it2.next().LJI;
                if (objectAnimatorArr != null) {
                    for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                        objectAnimator.removeAllListeners();
                    }
                }
            }
        }
        C1311820kF2 c1311820kF2 = this.mLayoutAnimator;
        if (c1311820kF2 != null) {
            c1311820kF2.LIZIZ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        if (getBound() != null && (getBound().width() <= 0 || getBound().height() <= 0)) {
            C786410Ut5.LJLLLLLL(8, this.mView);
        } else if (this.mSetVisibleByCSS) {
            C786410Ut5.LJLLLLLL(0, this.mView);
        }
    }

    public C1313200kHG getBackgroundManager() {
        return this.mBackgroundManager;
    }

    public LynxBaseUI getDrawHead() {
        return this.mDrawHead;
    }

    public C1313180kHE getFakeSharedElementManager() {
        return this.mHeroAnimOwner;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public C1313320kHS getKeyframeManager() {
        return this.mKeyframeManager;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public C1311820kF2 getLayoutAnimator() {
        return this.mLayoutAnimator;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public C1312040kFO getTransitionAnimator() {
        return this.mTransitionAnimator;
    }

    public T getView() {
        return this.mView;
    }

    public C1313210kHH getViewInfo() {
        return this.mViewInfo;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean getVisibility() {
        return this.mSetVisibleByCSS;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        handleLayout();
    }

    public LynxUI(Context context) {
        this((s) context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void attachToView(s sVar) {
        this.mContext = sVar;
        if (this.mView == null) {
            T t = (T) sVar.LJIILL().obtainViewAccordingToNodeIndex(this.mNodeIndex);
            if (t != null) {
                this.mView = t;
            } else {
                createViewAsync();
            }
        }
        ArrayList<LynxUI> arrayList = this.mContext.LLJILJILJ.LLILZ;
        if (arrayList == null) {
            LynxLog.w("UIBody", "UIBody.appendUIWithCreateViewAsync failed since mCreateViewUI is null.");
        } else {
            arrayList.add(this);
        }
        super.attachToView(sVar);
    }

    @Override // X.InterfaceC1314320kJ4
    public void beforeProcessViewInfo(C1313210kHH c1313210kHH) {
        c1313210kHH.LLILZIL = this.mSkewX;
        c1313210kHH.LLILZLL = this.mSkewY;
        c1313210kHH.LLIZ = this.mClipPath;
        c1313210kHH.LLILLL = getWidth();
        c1313210kHH.LLILZ = getHeight();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void detachWithViewInfo(C1313210kHH c1313210kHH) {
        registerViewAccordingToNodeIndex();
        C1313210kHH c1313210kHH2 = this.mViewInfo;
        if (c1313210kHH2 != null) {
            c1313210kHH = c1313210kHH2;
        }
        super.detachWithViewInfo(c1313210kHH);
        C1313210kHH c1313210kHH3 = this.mViewInfo;
        if (c1313210kHH3 != null) {
            if (this.mKeyframeManager != null) {
                c1313210kHH3.getClass();
                this.mKeyframeManager = null;
            }
            this.mViewInfo.LL = null;
            this.mViewInfo = null;
        }
        this.mView = null;
    }

    public void execEnterAnim(final InterfaceC1310510kCv interfaceC1310510kCv) {
        C1313370kHX c1313370kHX;
        View view;
        final C1313180kHE c1313180kHE = this.mHeroAnimOwner;
        c1313180kHE.getClass();
        C1310450kCp c1310450kCp = C1310440kCo.LIZ;
        if (c1310450kCp.LJI && !c1313180kHE.LIZ() && (c1313370kHX = c1313180kHE.LJ) != null) {
            if (c1313180kHE.LJIIIIZZ != null) {
                c1313180kHE.LJIIIZ = true;
                String str = c1313180kHE.LJIIIIZZ;
                LynxUI lynxUI = c1313180kHE.LIZ;
                synchronized (c1310450kCp) {
                    WeakReference<View> weakReference = c1310450kCp.LIZ.get(str);
                    if (weakReference != null) {
                        view = (T) weakReference.get();
                        if (view == null) {
                        }
                    } else {
                        view = null;
                    }
                    for (Map.Entry<LynxUI, String> entry : c1310450kCp.LJFF.entrySet()) {
                        LynxUI key = entry.getKey();
                        if (lynxUI != key && entry.getValue().equals(str)) {
                            view = key.mView;
                            break;
                        }
                    }
                }
                LynxUI lynxUI2 = c1313180kHE.LIZ;
                C1310660kDA c1310660kDA = lynxUI2.mContext.LLJILJILJ.LL;
                if (c1310660kDA != null) {
                    T t = lynxUI2.mView;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(view.getVisibility(), t);
                        C786410Ut5.T4(t, view.getAlpha());
                        C786410Ut5.Jc(t, view.getTranslationX());
                        C786410Ut5.ed(t, view.getTranslationY());
                        C786410Ut5.Ab(t, view.getRotation());
                        C786410Ut5.Hb(t, view.getRotationX());
                        C786410Ut5.Ib(t, view.getRotationY());
                        C786410Ut5.Ob(t, view.getScaleX());
                        C786410Ut5.pc(t, view.getScaleY());
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (c1310660kDA.getRootView() instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) c1310660kDA.getRootView();
                            if (t.getParent() != null) {
                                ViewGroup viewGroup2 = (ViewGroup) t.getParent();
                                c1313180kHE.LIZJ = viewGroup2;
                                int childCount = viewGroup2.getChildCount();
                                int i = 0;
                                while (true) {
                                    if (i >= childCount) {
                                        break;
                                    }
                                    if (t == c1313180kHE.LIZJ.getChildAt(i)) {
                                        c1313180kHE.LIZIZ = i;
                                        break;
                                    }
                                    i++;
                                }
                                C786410Ut5.LJJJLZIJ(t, c1313180kHE.LIZJ);
                                c1313180kHE.LIZLLL = (UIGroup) c1313180kHE.LIZ.mParent;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(width, height);
                            int[] iArr = new int[2];
                            view.getLocationInWindow(iArr);
                            marginLayoutParams.setMargins(iArr[0], iArr[1], 0, 0);
                            viewGroup.addView(t, marginLayoutParams);
                            C1289620jfE.LIZJ(new ARunnableS120S0100000_20(c1313180kHE, 244));
                        }
                    } else {
                        C1289620jfE.LIZJ(new ARunnableS120S0100000_20(c1313180kHE, 245));
                    }
                }
                c1313180kHE.LJIIJJI.put(c1313180kHE.LJ.LL, new InterfaceC1313190kHF() { // from class: X.0kHC
                    @Override // X.InterfaceC1313190kHF
                    public final void LIZ(String str2) {
                        T t2;
                        c1313180kHE.LJIIJJI.remove(str2);
                        C1313180kHE c1313180kHE2 = c1313180kHE;
                        if (c1313180kHE2.LIZJ != null && (t2 = c1313180kHE2.LIZ.mView) != 0) {
                            ViewGroup viewGroup3 = (ViewGroup) t2.getParent();
                            ViewGroup.LayoutParams layoutParams = t2.getLayoutParams();
                            if (viewGroup3 != null) {
                                C786410Ut5.LJJJLZIJ(t2, viewGroup3);
                            }
                            int[] iArr2 = new int[2];
                            c1313180kHE2.LIZJ.getLocationOnScreen(iArr2);
                            c1313180kHE2.LIZLLL.removeChild(c1313180kHE2.LIZ);
                            c1313180kHE2.LIZLLL.insertChild(c1313180kHE2.LIZ, c1313180kHE2.LIZIZ);
                            int left = t2.getLeft() + iArr2[0];
                            int top = t2.getTop() - iArr2[1];
                            LynxUI lynxUI3 = c1313180kHE2.LIZ;
                            lynxUI3.updateLayout(left, top, layoutParams.width, layoutParams.height, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, lynxUI3.getBound());
                        }
                        InterfaceC1310510kCv interfaceC1310510kCv2 = interfaceC1310510kCv;
                        if (interfaceC1310510kCv2 != null) {
                            ((C1310240kCU) interfaceC1310510kCv2).LIZ();
                        }
                        c1313180kHE.LJIIIZ = false;
                    }
                });
                return;
            }
            c1313180kHE.LIZ.setAnimation(c1313370kHX);
            if (c1313180kHE.LIZ.getKeyframeManager() != null) {
                c1313180kHE.LIZ.getKeyframeManager().LIZJ();
            }
        }
    }

    public void execExitAnim(final InterfaceC1310520kCw interfaceC1310520kCw) {
        C1313370kHX c1313370kHX;
        final C1313180kHE c1313180kHE = this.mHeroAnimOwner;
        c1313180kHE.getClass();
        if (C1310440kCo.LIZ.LJI && !c1313180kHE.LIZ() && (c1313370kHX = c1313180kHE.LJFF) != null) {
            c1313180kHE.LJIIJJI.put(c1313370kHX.LL, new InterfaceC1313190kHF(interfaceC1310520kCw) { // from class: X.0kHD
                @Override // X.InterfaceC1313190kHF
                public final void LIZ(String str) {
                    this.LIZ.LJIIJJI.remove(str);
                    T t = this.LIZ.LIZ.mView;
                    if (t == 0) {
                        return;
                    }
                    ViewParent parent = t.getParent();
                    if (parent != null) {
                        C786410Ut5.LJJJLZIJ(t, (ViewGroup) parent);
                    }
                    this.LIZ.LJIIJ = false;
                }
            });
            if (c1313180kHE.LJIIIIZZ != null) {
                c1313180kHE.LJIIJ = true;
                ViewGroup viewGroup = (ViewGroup) c1313180kHE.LIZ.mContext.LLJILJILJ.LL.getRootView();
                T t = c1313180kHE.LIZ.mView;
                t.getLocationInWindow(new int[2]);
                ViewParent parent = t.getParent();
                if (parent != null) {
                    C786410Ut5.LJJJLZIJ(t, (ViewGroup) parent);
                }
                viewGroup.addView(t);
                c1313180kHE.LIZ.setAnimation(c1313180kHE.LJFF);
                if (c1313180kHE.LIZ.getKeyframeManager() != null) {
                    c1313180kHE.LIZ.getKeyframeManager().LIZJ();
                    return;
                }
                return;
            }
            c1313180kHE.LIZ.setAnimation(c1313180kHE.LJFF);
            if (c1313180kHE.LIZ.getKeyframeManager() == null) {
                return;
            }
            c1313180kHE.LIZ.getKeyframeManager().LIZJ();
        }
    }

    public ReadableMap getKeyframes(String str) {
        JavaOnlyMap javaOnlyMap;
        s sVar = this.mContext;
        if (sVar == null || (javaOnlyMap = sVar.LLILZIL) == null || !javaOnlyMap.hasKey(str)) {
            return null;
        }
        return sVar.LLILZIL.getMap(str);
    }

    public boolean hasTranslateDiff(ReadableArray readableArray) {
        boolean z;
        boolean z2;
        List<C1313280kHO> listLIZLLL = C1313280kHO.LIZLLL(readableArray);
        if (Float.compare(C1313280kHO.LIZIZ(this.mTransformRaw), C1313280kHO.LIZIZ(listLIZLLL)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (Float.compare(C1313280kHO.LIZJ(this.mTransformRaw), C1313280kHO.LIZJ(listLIZLLL)) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb A[RETURN] */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initTransitionAnimator(com.lynx.react.bridge.ReadableMap r16) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxUI.initTransitionAnimator(com.lynx.react.bridge.ReadableMap):void");
    }

    public void onAnimationEnd(String str) {
        C1313180kHE c1313180kHE = this.mHeroAnimOwner;
        InterfaceC1313190kHF interfaceC1313190kHF = c1313180kHE.LJIIJJI.get(str);
        if (interfaceC1313190kHF != null) {
            interfaceC1313190kHF.LIZ(str);
            c1313180kHE.LJIIJJI.remove(str);
        }
    }

    public void processChildViewInfo(InterfaceC1314320kJ4 interfaceC1314320kJ4) {
        LynxUI lynxUI = (LynxUI) interfaceC1314320kJ4;
        beforeProcessChildViewInfo(this.mViewInfo, lynxUI.mView, 0L);
        lynxUI.processViewInfo();
        afterProcessChildViewInfo(this.mViewInfo, lynxUI.mView, 0L);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setAccessibilityElement(InterfaceC1298070jsr interfaceC1298070jsr) {
        super.setAccessibilityElement(interfaceC1298070jsr);
        C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
        if (this.mView != null && this.mAccessibilityElementStatus != -1 && c1310360kCgLJIIL != null && c1310360kCgLJIIL.LJFF()) {
            T t = this.mView;
            int i = 1;
            if (this.mAccessibilityElementStatus != 1) {
                i = 2;
            }
            t.setImportantForAccessibility(i);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "accessibility-elements-hidden")
    public void setAccessibilityElementsHidden(boolean z) {
        int i;
        T t = this.mView;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        t.setImportantForAccessibility(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setAccessibilityHeading(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mView.setAccessibilityHeading(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "accessibility-label")
    public void setAccessibilityLabel(InterfaceC1298070jsr interfaceC1298070jsr) {
        super.setAccessibilityLabel(interfaceC1298070jsr);
        T t = this.mView;
        if (t != null) {
            t.setFocusable(true);
            this.mView.setContentDescription(getAccessibilityLabel());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setAccessibilityValue(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mView.setStateDescription(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(defaultFloat = 1.0f, name = "opacity")
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (getKeyframeManager() != null) {
            getKeyframeManager().LIZLLL(Float.valueOf(f), "Alpha");
        }
        C1312040kFO c1312040kFO = this.mTransitionAnimator;
        if (c1312040kFO != null && c1312040kFO.LIZIZ(1)) {
            this.mTransitionAnimator.LIZ(this, 1, Float.valueOf(f));
            return;
        }
        if (f != this.mView.getAlpha()) {
            C786410Ut5.T4(this.mView, f);
        }
        C1311820kF2 c1311820kF2 = this.mLayoutAnimator;
        if (c1311820kF2 != null) {
            c1311820kF2.LJJ = f;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setAnimation(ReadableArray readableArray) {
        if (readableArray == null) {
            C1313320kHS c1313320kHS = this.mKeyframeManager;
            if (c1313320kHS != null) {
                c1313320kHS.LIZIZ();
                this.mKeyframeManager = null;
            }
            this.mAnimationInfos = null;
            return;
        }
        prepareKeyframeManager();
        int size = readableArray.size();
        C1313370kHX[] c1313370kHXArr = new C1313370kHX[size];
        for (int i = 0; i < size; i++) {
            c1313370kHXArr[i] = C1313370kHX.LIZLLL(readableArray.getArray(i));
        }
        this.mAnimationInfos = c1313370kHXArr;
        this.mKeyframeManager.LIZIZ = c1313370kHXArr;
    }

    @InterfaceC1312540kGC(name = "clip-path")
    public void setClipPath(ReadableArray readableArray) {
        this.mClipPath = C1313910kIP.LIZ(readableArray, this.mContext.LLJJJ.scaledDensity);
    }

    public void setDrawHead(LynxBaseUI lynxBaseUI) {
        this.mDrawHead = lynxBaseUI;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-reuse-animation-state")
    public void setEnableReuseAnimationState(boolean z) {
        s sVar;
        this.mEnableReuseAnimationState = z;
        if (!z && (sVar = this.mContext) != null) {
            LynxFeatureCounter.LIZ(80, sVar.LLJLILLLLZIIL);
        }
    }

    public void setEnterAnim(C1313370kHX c1313370kHX) {
        this.mHeroAnimOwner.LJ = c1313370kHX;
    }

    @InterfaceC1312540kGC(name = "enter-transition-name")
    public void setEnterTransitionName(ReadableArray readableArray) {
        C1313370kHX c1313370kHXLIZLLL = C1313370kHX.LIZLLL(readableArray);
        if (c1313370kHXLIZLLL != null) {
            s sVar = this.mContext;
            if (sVar != null) {
                LynxFeatureCounter.LIZ(75, sVar.LLJLILLLLZIIL);
            }
            C1310450kCp c1310450kCp = C1310440kCo.LIZ;
            synchronized (c1310450kCp) {
                c1310450kCp.LIZJ.put(this, c1313370kHXLIZLLL);
                setEnterAnim(c1313370kHXLIZLLL);
            }
        }
    }

    public void setExitAnim(C1313370kHX c1313370kHX) {
        this.mHeroAnimOwner.LJFF = c1313370kHX;
    }

    @InterfaceC1312540kGC(name = "exit-transition-name")
    public void setExitTransitionName(ReadableArray readableArray) {
        C1313370kHX c1313370kHXLIZLLL = C1313370kHX.LIZLLL(readableArray);
        if (c1313370kHXLIZLLL != null) {
            s sVar = this.mContext;
            if (sVar != null) {
                LynxFeatureCounter.LIZ(76, sVar.LLJLILLLLZIIL);
            }
            C1310450kCp c1310450kCp = C1310440kCo.LIZ;
            synchronized (c1310450kCp) {
                c1310450kCp.LIZIZ.put(this, c1313370kHXLIZLLL);
                setExitAnim(c1313370kHXLIZLLL);
            }
        }
    }

    @InterfaceC1312540kGC(name = "filter")
    public void setFilter(ReadableArray readableArray) {
        int i;
        double d;
        if (this.mView == null) {
            return;
        }
        if (readableArray != null && readableArray.size() == 3) {
            i = readableArray.getInt(0);
            d = readableArray.getDouble(1);
        } else {
            i = 0;
            d = 0.0d;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (d < 0.0d) {
                                    d = 1.0d;
                                } else if (d > 3.0d) {
                                    d = 3.0d;
                                }
                                float f = (float) d;
                                if (!C1314000kIY.LIZ(this.mSaturateAmount, f)) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    colorMatrix.setSaturation(f);
                                    Paint paint = new Paint(1);
                                    paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                    this.mView.setLayerType(2, paint);
                                    this.mSaturateAmount = f;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        Double dValueOf = Double.valueOf(d);
                        Double dValueOf2 = Double.valueOf(0.0d);
                        Double dValueOf3 = Double.valueOf(3.0d);
                        if (dValueOf.compareTo(dValueOf2) < 0) {
                            dValueOf = dValueOf2;
                        } else if (dValueOf.compareTo(dValueOf3) > 0) {
                            dValueOf = dValueOf3;
                        }
                        float fDoubleValue = (float) dValueOf.doubleValue();
                        if (C1314000kIY.LIZ(this.mContrastAmount, fDoubleValue)) {
                            return;
                        }
                        ColorMatrix colorMatrix2 = new ColorMatrix();
                        float f2 = (1.0f - fDoubleValue) * 128.0f;
                        colorMatrix2.set(new float[]{fDoubleValue, 0.0f, 0.0f, 0.0f, f2, 0.0f, fDoubleValue, 0.0f, 0.0f, f2, 0.0f, 0.0f, fDoubleValue, 0.0f, f2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                        Paint paint2 = new Paint(1);
                        paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                        this.mView.setLayerType(2, paint2);
                        this.mContrastAmount = fDoubleValue;
                        return;
                    }
                    Double dValueOf4 = Double.valueOf(d);
                    Double dValueOf5 = Double.valueOf(0.0d);
                    Double dValueOf6 = Double.valueOf(2.0d);
                    if (dValueOf4.compareTo(dValueOf5) < 0) {
                        dValueOf4 = dValueOf5;
                    } else if (dValueOf4.compareTo(dValueOf6) > 0) {
                        dValueOf4 = dValueOf6;
                    }
                    float fDoubleValue2 = (float) dValueOf4.doubleValue();
                    if (C1314000kIY.LIZ(this.mBrightnessAmount, fDoubleValue2)) {
                        return;
                    }
                    ColorMatrix colorMatrix3 = new ColorMatrix();
                    colorMatrix3.setScale(fDoubleValue2, fDoubleValue2, fDoubleValue2, 1.0f);
                    Paint paint3 = new Paint(1);
                    paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                    this.mView.setLayerType(2, paint3);
                    this.mBrightnessAmount = fDoubleValue2;
                    return;
                }
                T t = this.mView;
                if (!(t instanceof AndroidView)) {
                    return;
                }
                ((AndroidView) t).setBlur((float) d);
                return;
            }
            Double dValueOf7 = Double.valueOf(1.0d - d);
            Double dValueOf8 = Double.valueOf(0.0d);
            Double dValueOf9 = Double.valueOf(1.0d);
            if (dValueOf7.compareTo(dValueOf8) < 0) {
                dValueOf7 = dValueOf8;
            } else if (dValueOf7.compareTo(dValueOf9) > 0) {
                dValueOf7 = dValueOf9;
            }
            float fDoubleValue3 = (float) dValueOf7.doubleValue();
            if (C1314000kIY.LIZ(this.mGrayscaleAmount, fDoubleValue3)) {
                return;
            }
            ColorMatrix colorMatrix4 = new ColorMatrix();
            colorMatrix4.setSaturation(fDoubleValue3);
            Paint paint4 = new Paint(1);
            paint4.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
            this.mView.setLayerType(2, paint4);
            this.mGrayscaleAmount = fDoubleValue3;
            return;
        }
        this.mView.setLayerType(0, null);
        T t2 = this.mView;
        if (t2 instanceof AndroidView) {
            ((AndroidView) t2).removeBlur();
        }
        this.mGrayscaleAmount = 1.0f;
    }

    @InterfaceC1312540kGC(name = "layout-animation-create-delay")
    public void setLayoutAnimationCreateDelay(double d) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(72, sVar.LLJLILLLLZIIL);
        }
        this.mLayoutAnimator.LIZLLL().LIZ.LLILLL = (long) d;
    }

    @InterfaceC1312540kGC(name = "layout-animation-create-duration")
    public void setLayoutAnimationCreateDuration(double d) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(72, sVar.LLJLILLLLZIIL);
        }
        C1311820kF2 c1311820kF2 = this.mLayoutAnimator;
        c1311820kF2.LIZLLL().LIZ.LLILLJJLI = (long) d;
        if (!c1311820kF2.LIZLLL().LIZJ()) {
            c1311820kF2.LIZJ("layout-animation-create");
        }
    }

    @InterfaceC1312540kGC(name = "layout-animation-create-property")
    public void setLayoutAnimationCreateProperty(int i) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(72, sVar.LLJLILLLLZIIL);
        }
        this.mLayoutAnimator.LIZLLL().LIZ.LLILZ = i;
    }

    @InterfaceC1312540kGC(name = "layout-animation-create-timing-function")
    public void setLayoutAnimationCreateTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(72, sVar.LLJLILLLLZIIL);
        }
        this.mLayoutAnimator.LIZLLL().LIZ.LIZJ(0, readableArray);
    }

    @InterfaceC1312540kGC(name = "layout-animation-delete-delay")
    public void setLayoutAnimationDeleteDelay(double d) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(74, sVar.LLJLILLLLZIIL);
        }
        this.mLayoutAnimator.LJ().LIZ.LLILLL = (long) d;
    }

    @InterfaceC1312540kGC(name = "layout-animation-delete-duration")
    public void setLayoutAnimationDeleteDuration(double d) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(74, sVar.LLJLILLLLZIIL);
        }
        C1311820kF2 c1311820kF2 = this.mLayoutAnimator;
        c1311820kF2.LJ().LIZ.LLILLJJLI = (long) d;
        if (!c1311820kF2.LJ().LIZJ()) {
            c1311820kF2.LIZJ("layout-animation-delete");
        }
    }

    @InterfaceC1312540kGC(name = "layout-animation-delete-property")
    public void setLayoutAnimationDeleteProperty(int i) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(74, sVar.LLJLILLLLZIIL);
        }
        this.mLayoutAnimator.LJ().LIZ.LLILZ = i;
    }

    @InterfaceC1312540kGC(name = "layout-animation-delete-timing-function")
    public void setLayoutAnimationDeleteTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(74, sVar.LLJLILLLLZIIL);
        }
        this.mLayoutAnimator.LJ().LIZ.LIZJ(0, readableArray);
    }

    @InterfaceC1312540kGC(name = "layout-animation-update-delay")
    public void setLayoutAnimationUpdateDelay(double d) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(73, sVar.LLJLILLLLZIIL);
        }
        this.mLayoutAnimator.LJFF().LIZ.LLILLL = (long) d;
    }

    @InterfaceC1312540kGC(name = "layout-animation-update-duration")
    public void setLayoutAnimationUpdateDuration(double d) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(73, sVar.LLJLILLLLZIIL);
        }
        C1311820kF2 c1311820kF2 = this.mLayoutAnimator;
        c1311820kF2.LJFF().LIZ.LLILLJJLI = (long) d;
        if (!c1311820kF2.LJFF().LIZJ()) {
            c1311820kF2.LIZJ("layout-animation-update");
        }
    }

    @InterfaceC1312540kGC(name = "layout-animation-update-property")
    public void setLayoutAnimationUpdateProperty(int i) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(73, sVar.LLJLILLLLZIIL);
        }
        this.mLayoutAnimator.LJFF().LIZ.LLILZ = i;
    }

    @InterfaceC1312540kGC(name = "layout-animation-update-timing-function")
    public void setLayoutAnimationUpdateTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        s sVar = this.mContext;
        if (sVar != null) {
            LynxFeatureCounter.LIZ(73, sVar.LLJLILLLLZIIL);
        }
        this.mLayoutAnimator.LJFF().LIZ.LIZJ(0, readableArray);
    }

    @InterfaceC1312540kGC(name = "offset-distance")
    public void setOffsetDistance(float f) {
        if (this.mOffsetDistance != f) {
            this.mOffsetDistance = f;
            this.mOffsetHasChanged = true;
        }
    }

    @InterfaceC1312540kGC(name = "offset-path")
    public void setOffsetPath(ReadableArray readableArray) {
        if (this.mRawOffsetShape != readableArray) {
            this.mRawOffsetShape = readableArray;
            this.mOffsetPath = C1313910kIP.LIZ(readableArray, this.mContext.LLJJJ.scaledDensity);
            this.mOffsetHasChanged = true;
        }
    }

    @InterfaceC1312540kGC(name = "offset-rotate")
    public void setOffsetRotate(float f) {
        if (this.mOffsetRotate != f) {
            this.mOffsetRotate = f;
            this.mOffsetHasChanged = true;
            if (f != -1024.0f) {
                this.mIsAutoOffsetRotate = false;
            } else {
                this.mIsAutoOffsetRotate = true;
            }
        }
    }

    @InterfaceC1312540kGC(name = "overlap")
    public void setOverlap(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr == null) {
            this.mOverlappingRendering = true;
            return;
        }
        ReadableType type = interfaceC1298070jsr.getType();
        if (type == ReadableType.Boolean) {
            this.mOverlappingRendering = interfaceC1298070jsr.asBoolean();
        } else {
            if (type != ReadableType.String) {
                return;
            }
            this.mOverlappingRendering = interfaceC1298070jsr.asString().equalsIgnoreCase("true");
        }
    }

    public void setPauseAnim(C1313370kHX c1313370kHX) {
        this.mHeroAnimOwner.LJI = c1313370kHX;
    }

    @InterfaceC1312540kGC(name = "pause-transition-name")
    public void setPauseTransitionName(ReadableArray readableArray) {
        C1313370kHX c1313370kHXLIZLLL = C1313370kHX.LIZLLL(readableArray);
        if (c1313370kHXLIZLLL != null) {
            s sVar = this.mContext;
            if (sVar != null) {
                LynxFeatureCounter.LIZ(77, sVar.LLJLILLLLZIIL);
            }
            C1310450kCp c1310450kCp = C1310440kCo.LIZ;
            synchronized (c1310450kCp) {
                c1310450kCp.LJ.put(this, c1313370kHXLIZLLL);
                setPauseAnim(c1313370kHXLIZLLL);
            }
        }
    }

    @InterfaceC1312540kGC(name = "hardware-layer")
    public void setRenderToHardwareTexture(boolean z) {
        int i;
        if (z) {
            s sVar = this.mContext;
            if (sVar != null) {
                LynxFeatureCounter.LIZ(70, sVar.LLJLILLLLZIIL);
            }
            i = 2;
        } else {
            i = 0;
        }
        this.mView.setLayerType(i, null);
    }

    public void setResumeAnim(C1313370kHX c1313370kHX) {
        this.mHeroAnimOwner.LJII = c1313370kHX;
    }

    @InterfaceC1312540kGC(name = "resume-transition-name")
    public void setResumeTransitionName(ReadableArray readableArray) {
        C1313370kHX c1313370kHXLIZLLL = C1313370kHX.LIZLLL(readableArray);
        if (c1313370kHXLIZLLL != null) {
            s sVar = this.mContext;
            if (sVar != null) {
                LynxFeatureCounter.LIZ(78, sVar.LLJLILLLLZIIL);
            }
            C1310450kCp c1310450kCp = C1310440kCo.LIZ;
            synchronized (c1310450kCp) {
                c1310450kCp.LIZLLL.put(this, c1313370kHXLIZLLL);
                setResumeAnim(c1313370kHXLIZLLL);
            }
        }
    }

    @InterfaceC1312540kGC(name = "shared-element")
    public void setShareElement(String str) {
        C1313180kHE c1313180kHE = this.mHeroAnimOwner;
        c1313180kHE.LJIIIIZZ = str;
        C1310450kCp c1310450kCp = C1310440kCo.LIZ;
        LynxUI lynxUI = c1313180kHE.LIZ;
        synchronized (c1310450kCp) {
            c1310450kCp.LJFF.put(lynxUI, str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setStickyTranslate(PointF pointF) {
        super.setStickyTranslate(pointF);
        C1313200kHG c1313200kHG = this.mBackgroundManager;
        if (c1313200kHG != null) {
            c1313200kHG.LJII = pointF;
            c1313200kHG.LJIJJ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "lynx-test-tag")
    public void setTestID(String str) {
        this.mView.setTag(str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        this.mHasTranslateDiff = hasTranslateDiff(readableArray);
        super.setTransform(readableArray);
        if (getKeyframeManager() != null) {
            getKeyframeManager().LIZLLL(this.mTransformRaw, "Transform");
        }
    }

    @InterfaceC1312540kGC(name = "transform-order")
    public void setTransformOrder(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr == null) {
            this.mBackgroundManager.LJIIIIZZ = true;
            return;
        }
        ReadableType type = interfaceC1298070jsr.getType();
        if (type == ReadableType.Boolean) {
            this.mBackgroundManager.LJIIIIZZ = interfaceC1298070jsr.asBoolean();
        } else {
            if (type != ReadableType.String) {
                return;
            }
            String strAsString = interfaceC1298070jsr.asString();
            this.mBackgroundManager.LJIIIIZZ = strAsString.equalsIgnoreCase("true");
        }
    }

    @InterfaceC1312540kGC(defaultInt = 1, name = "visibility")
    public void setVisibility(int i) {
        C1312040kFO c1312040kFO = this.mTransitionAnimator;
        if (c1312040kFO != null && c1312040kFO.LIZIZ(128)) {
            this.mTransitionAnimator.LIZ(this, 128, Integer.valueOf(i));
            return;
        }
        int visibility = this.mView.getVisibility();
        if (i == 1) {
            this.mSetVisibleByCSS = true;
            C786410Ut5.LJLLLLLL(0, this.mView);
            visibility = 0;
        } else if (i == 0) {
            this.mSetVisibleByCSS = false;
            visibility = 4;
            C786410Ut5.LJLLLLLL(4, this.mView);
        }
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 instanceof UIShadowProxy) {
            ((LynxUI) interfaceC1313090kH5).setVisibilityForView(visibility);
        }
    }

    public void setVisibilityForView(int i) {
        if (i == 0) {
            this.mSetVisibleByCSS = true;
            C786410Ut5.LJLLLLLL(0, this.mView);
        } else {
            if (i != 4) {
                return;
            }
            this.mSetVisibleByCSS = false;
            C786410Ut5.LJLLLLLL(4, this.mView);
        }
    }

    public void updateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.width = getWidth();
            layoutParams.height = getHeight();
            if (layoutParams != this.mView.getLayoutParams()) {
                C786410Ut5.W5(this.mView, layoutParams);
                return;
            }
            return;
        }
        throw new RuntimeException("LayoutPrams should not be null");
    }

    public LynxUI(s sVar) {
        this(sVar, null);
    }

    public void setAnimation(C1313370kHX c1313370kHX) {
        prepareKeyframeManager();
        C1313320kHS c1313320kHS = this.mKeyframeManager;
        c1313320kHS.getClass();
        c1313320kHS.LIZIZ = new C1313370kHX[]{c1313370kHX};
    }

    public LynxUI(s sVar, Object obj) {
        super(sVar, obj);
        this.mGrayscaleAmount = 1.0f;
        this.mBrightnessAmount = 1.0f;
        this.mContrastAmount = 1.0f;
        this.mSaturateAmount = 1.0f;
        this.mSetVisibleByCSS = true;
        this.mOverlappingRendering = true;
        this.mEnableReuseAnimationState = true;
        this.mFirstRender = true;
        this.mAlpha = 1.0f;
        this.mOffsetRotate = -1024.0f;
        this.mIsAutoOffsetRotate = true;
    }

    private void restoreKeyframeStateFromStorage(String str, UIList uIList) {
        if (this.mEnableReuseAnimationState && !TextUtils.isEmpty(str) && this.mAnimationInfos != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Animation_");
            sbLIZ.append(constructListStateCacheKey(getTagName(), str, getIdSelector()));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1313320kHS c1313320kHS = (C1313320kHS) ((HashMap) uIList.LLJJJJLIIL).get(strLIZIZ);
            if (c1313320kHS != null) {
                ((HashMap) uIList.LLJJJJLIIL).remove(strLIZIZ);
                C1313320kHS c1313320kHS2 = this.mKeyframeManager;
                if (c1313320kHS2 != null) {
                    c1313320kHS2.LIZ();
                    this.mKeyframeManager = null;
                }
                c1313320kHS.LIZ = new WeakReference<>(this);
                HashMap<String, C1313330kHT> map = c1313320kHS.LIZJ;
                if (map != null) {
                    for (C1313330kHT c1313330kHT : map.values()) {
                        c1313330kHT.getClass();
                        c1313330kHT.LIZIZ = new WeakReference<>(this);
                        c1313330kHT.LIZJ = new WeakReference<>(this.mView);
                        c1313330kHT.LIZIZ(c1313330kHT.LJIIIIZZ);
                    }
                }
                this.mKeyframeManager = c1313320kHS;
            } else {
                prepareKeyframeManager();
            }
            C1313320kHS c1313320kHS3 = this.mKeyframeManager;
            c1313320kHS3.LIZIZ = this.mAnimationInfos;
            c1313320kHS3.LIZJ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean checkStickyOnParentScroll(int i, int i2) {
        PointF pointF;
        boolean zCheckStickyOnParentScroll = super.checkStickyOnParentScroll(i, i2);
        if (this.mSticky != null) {
            LynxBaseUI.Sticky sticky = this.mSticky;
            pointF = new PointF(sticky.LL, sticky.LLILLJJLI);
        } else {
            pointF = null;
        }
        C1313200kHG c1313200kHG = this.mBackgroundManager;
        if (c1313200kHG != null) {
            c1313200kHG.LJII = pointF;
            c1313200kHG.LJIJJ();
        }
        return zCheckStickyOnParentScroll;
    }

    public T createView(Context context, Object obj) {
        return (T) createView(context);
    }

    public T getOrCreateView(Context context, Object obj) {
        s sVar = this.mContext;
        if (sVar != null && sVar.LLLIIIL && sVar.LJIILL() != null && (obj instanceof C1311740kEu)) {
            this.mNodeIndex = ((C1311740kEu) obj).LIZIZ;
            T t = (T) this.mContext.LJIILL().obtainViewAccordingToNodeIndex(this.mNodeIndex);
            if (t != null) {
                t.setBackground(null);
                return t;
            }
        }
        return (T) createView(context, obj);
    }

    public void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        lynxBaseUI2.mDrawParent = this;
        if (lynxBaseUI == null) {
            LynxBaseUI lynxBaseUI3 = this.mDrawHead;
            if (lynxBaseUI3 != null) {
                lynxBaseUI3.mPreviousDrawUI = lynxBaseUI2;
                lynxBaseUI2.mNextDrawUI = lynxBaseUI3;
            }
            this.mDrawHead = lynxBaseUI2;
            return;
        }
        LynxBaseUI lynxBaseUI4 = lynxBaseUI.mNextDrawUI;
        if (lynxBaseUI4 != null) {
            lynxBaseUI4.mPreviousDrawUI = lynxBaseUI2;
            lynxBaseUI2.mNextDrawUI = lynxBaseUI4;
        }
        lynxBaseUI2.mPreviousDrawUI = lynxBaseUI;
        lynxBaseUI.mNextDrawUI = lynxBaseUI2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public void onFocusChanged(boolean z, boolean z2) {
        if (!z2) {
            InputMethodManager inputMethodManager = LynxEnv.inst().getInputMethodManager();
            if (inputMethodManager == null) {
                LynxLog.w("LynxUI", "Failed to get InputMethodManager");
            } else if (z) {
                inputMethodManager.showSoftInput(this.mView, 1);
            } else {
                inputMethodManager.hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
            }
        }
    }

    public void onListCellAppear(String str, UIList uIList) {
        super.onListCellAppear(str, (LynxBaseUI) uIList);
        restoreKeyframeStateFromStorage(str, uIList);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setSign(int i, String str) {
        super.setSign(i, str);
    }

    @InterfaceC1967107nB
    public void takeScreenshot(ReadableMap readableMap, final Callback callback) {
        Bitmap.Config config;
        final Bitmap.CompressFormat compressFormat;
        final String str;
        final Bitmap bitmapCreateBitmap;
        s sVar;
        if (this.mView == null) {
            callback.invoke(6, new JavaOnlyMap());
            return;
        }
        String string = readableMap.getString("format", "jpeg");
        boolean z = readableMap.getBoolean("androidEnablePixelCopy", false);
        if (string.equals("png")) {
            config = Bitmap.Config.ARGB_8888;
            compressFormat = Bitmap.CompressFormat.PNG;
            str = "data:image/png;base64,";
        } else {
            config = Bitmap.Config.RGB_565;
            compressFormat = Bitmap.CompressFormat.JPEG;
            str = "data:image/jpeg;base64,";
        }
        final float f = (float) readableMap.getDouble("scale", 1.0d);
        try {
            InterfaceC1289280jeg interfaceC1289280jeg = (InterfaceC1289280jeg) C1285920jZG.LIZJ().LIZ(InterfaceC1289280jeg.class);
            if (interfaceC1289280jeg != null) {
                bitmapCreateBitmap = interfaceC1289280jeg.LIZJ(this.mView, config);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(this.mView.getWidth(), this.mView.getHeight(), config);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (z && (sVar = this.mContext) != null && sVar.LJIILL() != null) {
                    ((LynxUIRenderer) this.mContext.LJIILL().getLynxUIRendererInternal()).LIZJ(this.mView, canvas);
                } else {
                    boolean zIsDirty = this.mView.isDirty();
                    this.mView.draw(canvas);
                    if (zIsDirty) {
                        this.mView.postInvalidate();
                    }
                }
            }
            C1301610jyZ.LIZIZ().execute(new Runnable() { // from class: X.0jeY
                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x006e
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                    */
                public final void LIZ() {
                    /*
                        r8 = this;
                        float r1 = r1
                        r0 = 1065353216(0x3f800000, float:1.0)
                        int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                        if (r0 == 0) goto L31
                        android.graphics.Matrix r6 = new android.graphics.Matrix
                        r6.<init>()
                        float r0 = r1
                        r6.setScale(r0, r0)
                        android.graphics.Bitmap r1 = r2
                        r2 = 0
                        int r4 = r1.getWidth()
                        android.graphics.Bitmap r0 = r2
                        int r5 = r0.getHeight()
                        r7 = 1
                        r3 = r2
                        android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)
                        android.graphics.Bitmap r0 = r2
                        X.C786410Ut5.LJJJJ(r0)
                    L2a:
                        android.graphics.Bitmap$CompressFormat r1 = r3
                        r2 = 2
                        r3 = 0
                        if (r5 == 0) goto L82
                        goto L34
                    L31:
                        android.graphics.Bitmap r5 = r2
                        goto L2a
                    L34:
                        java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6e
                        r4.<init>()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6e
                        r0 = 100
                        r5.compress(r1, r0, r4)     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L68
                        r4.flush()     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L68
                        r4.close()     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L68
                        byte[] r0 = r4.toByteArray()     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L68
                        java.lang.String r3 = android.util.Base64.encodeToString(r0, r2)     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L68
                        r4.flush()     // Catch: java.io.IOException -> L7e
                        r4.close()     // Catch: java.io.IOException -> L7e
                        goto L82
                    L53:
                        r0 = move-exception
                        goto L57
                    L55:
                        r0 = move-exception
                        r4 = r3
                    L57:
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L68
                        if (r4 == 0) goto L82
                        r4.flush()     // Catch: java.io.IOException -> L63
                        r4.close()     // Catch: java.io.IOException -> L63
                        goto L82
                    L63:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        goto L82
                    L68:
                        r1 = move-exception
                        r3 = r4
                    L6a:
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L6e
                        goto L70
                    L6e:
                        r1 = move-exception
                        goto L6a
                    L70:
                        if (r3 == 0) goto L7d
                        r3.flush()     // Catch: java.io.IOException -> L79
                        r3.close()     // Catch: java.io.IOException -> L79
                        throw r1
                    L79:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    L7d:
                        throw r1
                    L7e:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    L82:
                        com.lynx.react.bridge.JavaOnlyMap r4 = new com.lynx.react.bridge.JavaOnlyMap
                        r4.<init>()
                        int r1 = r5.getWidth()
                        java.lang.String r0 = "width"
                        r4.putInt(r0, r1)
                        java.lang.String r1 = "height"
                        int r0 = r5.getHeight()
                        r4.putInt(r1, r0)
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = r4
                        r1.append(r0)
                        r1.append(r3)
                        java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                        java.lang.String r0 = "data"
                        r4.putString(r0, r1)
                        com.lynx.react.bridge.Callback r3 = r5
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        r1 = 0
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                        r2[r1] = r0
                        r0 = 1
                        r2[r0] = r4
                        r3.invoke(r2)
                        r5.recycle()
                        com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r5)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1289200jeY.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LynxUI@818d.takeScreenshot$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LynxUI@818d.takeScreenshot$1");
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            callback.invoke(1, new JavaOnlyMap());
        }
    }

    private void saveKeyframeStateToStorage(String str, LynxBaseUI lynxBaseUI, boolean z) {
        if (this.mEnableReuseAnimationState && !TextUtils.isEmpty(str)) {
            if (z && this.mKeyframeManager == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Animation_");
            sbLIZ.append(constructListStateCacheKey(getTagName(), str, getIdSelector()));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!z) {
                lynxBaseUI.removeKeyFromNativeStorage(strLIZIZ);
            } else {
                lynxBaseUI.storeKeyToNativeStorage(strLIZIZ, this.mKeyframeManager);
            }
            C1313320kHS c1313320kHS = this.mKeyframeManager;
            if (c1313320kHS != null) {
                c1313320kHS.LIZ();
            }
            this.mKeyframeManager = null;
        }
    }

    public void applyOffsetAndRotate(float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1313280kHO(1, new C1313840kII(f - this.mLastOffsetEffectX), 0, new C1313840kII(f2 - this.mLastOffsetEffectY), 0, new C1313840kII(0.0f), 0));
        arrayList.add(new C1313280kHO(32, 0, 0, 0, f3 - this.mLastOffsetEffectRotate, 0.0f));
        this.mLastOffsetEffectX = f;
        this.mLastOffsetEffectY = f2;
        this.mLastOffsetEffectRotate = f3;
        C1313200kHG c1313200kHG = this.mBackgroundManager;
        if (c1313200kHG.LJI == null) {
            c1313200kHG.LJIJI(arrayList);
            return;
        }
        LynxUI lynxUI = c1313200kHG.LJFF.get();
        if (lynxUI == null) {
            return;
        }
        c1313200kHG.LIZ.LLJILJILJ.getLatestWidth();
        c1313200kHG.LIZ.LLJILJILJ.getLatestHeight();
        C1313230kHJ c1313230kHJLJIIL = C1313230kHJ.LJIIL(arrayList, lynxUI.getLatestWidth(), lynxUI.getLatestHeight());
        Matrix4f matrix4fLJIILLIIL = c1313200kHG.LJI.LJIILLIIL();
        matrix4fLJIILLIIL.multiply(c1313230kHJLJIIL.LJIILLIIL());
        C1313230kHJ c1313230kHJ = c1313200kHG.LJI;
        C1314310kJ3 c1314310kJ3 = new C1314310kJ3();
        c1314310kJ3.LIZ();
        C1313440kHe.LIZ(C1313230kHJ.LIZIZ(matrix4fLJIILLIIL.getArray()), c1314310kJ3);
        c1313230kHJ.LJIILIIL(c1314310kJ3);
        c1313200kHG.LJIJJ();
        lynxUI.mView.setOutlineProvider(null);
        C14K9.LJIL(lynxUI.mView, c1313200kHG.LJI.LJIIJJI());
        C786410Ut5.Ab(lynxUI.mView, c1313200kHG.LJI.LIZJ());
        C786410Ut5.Hb(lynxUI.mView, c1313200kHG.LJI.LIZLLL());
        C786410Ut5.Ib(lynxUI.mView, c1313200kHG.LJI.LJ());
        C786410Ut5.Ob(lynxUI.mView, c1313200kHG.LJI.LJFF());
        C786410Ut5.pc(lynxUI.mView, c1313200kHG.LJI.LJI());
        lynxUI.mSkewX = c1313200kHG.LJI.LJII();
        lynxUI.mSkewY = c1313200kHG.LJI.LJIIIIZZ();
        lynxUI.mView.invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onListCellDisAppear(String str, LynxBaseUI lynxBaseUI, boolean z) {
        super.onListCellDisAppear(str, lynxBaseUI, z);
        saveKeyframeStateToStorage(str, lynxBaseUI, z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean calculateStickyTranslateWithOffset(int i, boolean z, int i2, int i3) {
        PointF pointF;
        boolean zCalculateStickyTranslateWithOffset = super.calculateStickyTranslateWithOffset(i, z, i2, i3);
        if (zCalculateStickyTranslateWithOffset && this.mSticky != null) {
            LynxBaseUI.Sticky sticky = this.mSticky;
            pointF = new PointF(sticky.LL, sticky.LLILLJJLI);
        } else {
            pointF = null;
        }
        C1313200kHG c1313200kHG = this.mBackgroundManager;
        if (c1313200kHG != null) {
            c1313200kHG.LJII = pointF;
            c1313200kHG.LJIJJ();
        }
        return zCalculateStickyTranslateWithOffset;
    }
}
