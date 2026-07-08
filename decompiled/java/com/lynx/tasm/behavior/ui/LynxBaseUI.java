package com.lynx.tasm.behavior.ui;

import X.AbstractC1311530kEZ;
import X.AbstractC1313260kHM;
import X.AbstractC1313300kHQ;
import X.C1289620jfE;
import X.C1292490jjr;
import X.C1298220jt6;
import X.C1298340jtI;
import X.C1298700jts;
import X.C1298720jtu;
import X.C1298900juC;
import X.C1299120juY;
import X.C1299240juk;
import X.C1310110kCH;
import X.C1310290kCZ;
import X.C1310330kCd;
import X.C1310360kCg;
import X.C1310660kDA;
import X.C1311130kDv;
import X.C1311380kEK;
import X.C1311390kEL;
import X.C1311400kEM;
import X.C1311420kEO;
import X.C1311720kEs;
import X.C1311730kEt;
import X.C1311820kF2;
import X.C1312040kFO;
import X.C1312880kGk;
import X.C1312920kGo;
import X.C1313210kHH;
import X.C1313240kHK;
import X.C1313250kHL;
import X.C1313270kHN;
import X.C1313280kHO;
import X.C1313320kHS;
import X.C1313390kHZ;
import X.C1314250kIx;
import X.C1314270kIz;
import X.C1314390kJB;
import X.C1314710kJh;
import X.C1315080kKI;
import X.C1318220kPM;
import X.C2188811AlT;
import X.EnumC1311070kDp;
import X.EnumC1311610kEh;
import X.EnumC1311640kEk;
import X.EnumC1311650kEl;
import X.EnumC1313350kHV;
import X.EnumC1314040kIc;
import X.EnumC1319630kRd;
import X.InterfaceC1298070jsr;
import X.InterfaceC1310460kCq;
import X.InterfaceC1311410kEN;
import X.InterfaceC1311590kEf;
import X.InterfaceC1311800kF0;
import X.InterfaceC1312510kG9;
import X.InterfaceC1312530kGB;
import X.InterfaceC1312540kGC;
import X.InterfaceC1312870kGj;
import X.InterfaceC1313090kH5;
import X.InterfaceC1314580kJU;
import X.InterfaceC1314870kJx;
import X.InterfaceC1314880kJy;
import X.InterfaceC1326530kcl;
import X.InterfaceC1967107nB;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS89S0200000_20;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.list.AbsLynxList;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import com.lynx.tasm.behavior.ui.scroll.LynxUIScrollViewInternal;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.utils.LynxUISetter;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import com.lynx.tasm.utils.CallStackUtil;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import j27.s;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public abstract class LynxBaseUI implements InterfaceC1313090kH5, InterfaceC1311410kEN, Cloneable, InterfaceC1311590kEf, InterfaceC1314880kJy {
    public boolean hasTransformChanged;
    public ArrayList mAccessibilityActions;
    public int mAccessibilityElementStatus;
    public ArrayList<String> mAccessibilityElements;
    public ArrayList<String> mAccessibilityElementsA11y;
    public boolean mAccessibilityEnableTap;
    public String mAccessibilityId;
    public boolean mAccessibilityKeepFocused;
    public String mAccessibilityLabel;
    public String mAccessibilityRoleDescription;
    public String mAccessibilityStatus;
    public EnumC1319630kRd mAccessibilityTraits;
    public float mAlpha;
    public int mBackgroundColor;
    public Bitmap.Config mBitmapConfig;
    public boolean mBlockListEvent;
    public boolean mBlockNativeEvent;
    public ArrayList<ArrayList<C1315080kKI>> mBlockNativeEventAreas;
    public int mBorderBottomWidth;
    public int mBorderLeftWidth;
    public int mBorderRightWidth;
    public int mBorderSpacingIndex;
    public int mBorderTopWidth;
    public int mBorderWidth;
    public Rect mBound;
    public ArrayList<Runnable> mBoundingClientRectCallbacks;
    public int mCSSPosition;
    public final List<LynxBaseUI> mChildren;
    public boolean mClipToRadius;
    public boolean mConsumeHoverEvent;
    public ArrayList<ArrayList<Float>> mConsumeSlideEventAngles;
    public s mContext;
    public ReadableMap mDataset;
    public boolean mDisableDefaultResize;
    public InterfaceC1313090kH5 mDrawParent;
    public C1314390kJB mDrawableCallback;
    public boolean mEnableBitmapGradient;
    public EnumC1311650kEl mEnableExposureUIClip;
    public Boolean mEnableExposureUIMargin;
    public boolean mEnableScrollMonitor;
    public boolean mEnableTouchPseudoPropagation;
    public EnumC1311650kEl mEventThrough;
    public ArrayList<ArrayList<C1315080kKI>> mEventThroughActiveRegions;
    public Map<String, C1299120juY> mEvents;
    public String mExposureArea;
    public String mExposureID;
    public String mExposureScene;
    public float mExposureScreenMarginBottom;
    public float mExposureScreenMarginLeft;
    public float mExposureScreenMarginRight;
    public float mExposureScreenMarginTop;
    public String mExposureUIMarginBottom;
    public String mExposureUIMarginLeft;
    public String mExposureUIMarginRight;
    public String mExposureUIMarginTop;
    public float mExtraOffsetX;
    public float mExtraOffsetY;
    public int mFlattenChildrenCount;
    public boolean mFocusable;
    public float mFontSize;
    public int mGestureArenaMemberId;
    public Map<Integer, C1311420kEO> mGestureDetectors;
    public Map<Integer, AbstractC1311530kEZ> mGestureHandlers;
    public boolean mHasRadius;
    public boolean mHasTranslateDiff;
    public int mHeight;
    public float mHitSlopBottom;
    public float mHitSlopLeft;
    public float mHitSlopRight;
    public float mHitSlopTop;
    public Matrix mHitTestMatrix;
    public String mIdSelector;
    public EnumC1311650kEl mIgnoreFocus;
    public int mImageRendering;
    public boolean mIncludeNativeGesture;
    public boolean mIsDetachedWithView;
    public boolean mIsFirstAnimatedReady;
    public boolean mIsTransformNode;
    public final Point mLastSize;
    public float mLastTranslateZ;
    public final Point mLatestSize;
    public int mLeft;
    public C1313270kHN mLynxBackground;
    public int mLynxDirection;
    public C1314270kIz mLynxMask;
    public int mMarginBottom;
    public int mMarginLeft;
    public int mMarginRight;
    public int mMarginTop;
    public float mMaxHeight;
    public String mName;
    public boolean mNeedSortChildren;
    public boolean mNeedsBackgroundRecreation;
    public LynxBaseUI mNextDrawUI;
    public int mNodeIndex;
    public ArrayList<Runnable> mNodeReadyBlockArray;
    public WeakReference<int[]> mOffsetDescendantRectToLynxView;
    public boolean mOnResponseChain;
    public int mOriginLeft;
    public int mOriginTop;
    public int mOverflow;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public EnumC1311610kEh mPanInterceptDirection;
    public EnumC1314040kIc mPanInterceptScope;
    public Object mParam;
    public InterfaceC1313090kH5 mParent;
    public ReadableArray mPerspective;
    public EnumC1311640kEk mPointerEvents;
    public float mPrePerspectiveValue;
    public LynxBaseUI mPreviousDrawUI;
    public final JavaOnlyMap mProps;
    public int mPseudoStatus;
    public String mRefId;
    public String mScrollMonitorTag;
    public volatile InterfaceC1314870kJx mScrollStateChangeListener;
    public boolean mShouldAttachChildrenView;
    public int mSign;
    public float mSkewX;
    public float mSkewY;
    public boolean mSkipLayoutUpdated;
    public boolean mSkipRedirection;
    public volatile Set<InterfaceC1314870kJx> mStateChangeListeners;
    public Sticky mSticky;
    public int mStickyScrollerSign;
    public String mTagName;
    public String mTestTagName;
    public int mTop;
    public float mTouchSlop;
    public Matrix mTransformMatrix;
    public C1314250kIx mTransformOrigin;
    public List<C1313280kHO> mTransformRaw;
    public float mTranslationZ;
    public C1313250kHL mUIPaintStyles;
    public InterfaceC1298070jsr mUseLocalCache;
    public int mWidth;
    public boolean nativeInteractionEnabled;
    public boolean userInteractionEnabled;
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    public static final int[] sDefaultOffsetToLynxView = {Integer.MIN_VALUE, Integer.MIN_VALUE};
    public static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    public static final Set<String> BACKGROUND_PROPS = new HashSet(Arrays.asList("background-color", "background-image", "background-origin", "background-position", "background-repeat", "background-size", "border-bottom-left-radius", "border-bottom-right-radius", "border-top-left-radius", "border-top-right-radius", "border-radius"));

    public class Sticky extends RectF {
        public float LL;
        public float LLILLJJLI;
        public float LLILLL;
        public float LLILZ;
        public float LLILZIL;
        public float LLILZLL;
        public float LLIZ;
        public float LLIZLLLIL;
    }

    private synchronized void initScrollStateChangeListener() {
        if (this.mScrollStateChangeListener != null) {
            return;
        }
        this.mScrollStateChangeListener = new InterfaceC1314870kJx() { // from class: X.0kIn
            @Override // X.InterfaceC1314870kJx
            public final void LIZ(int i) {
                InterfaceC1314870kJx[] interfaceC1314870kJxArr;
                synchronized (this.LIZ) {
                    try {
                        interfaceC1314870kJxArr = (InterfaceC1314870kJx[]) this.LIZ.mStateChangeListeners.toArray(new InterfaceC1314870kJx[this.LIZ.mStateChangeListeners.size()]);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                for (InterfaceC1314870kJx interfaceC1314870kJx : interfaceC1314870kJxArr) {
                    interfaceC1314870kJx.LIZ(i);
                }
            }
        };
    }

    public boolean canConsumeGesture(float f, float f2) {
        return false;
    }

    public boolean canHaveFlattenChild() {
        return true;
    }

    public void consumeGesture(boolean z) {
    }

    public void createViewAsync() {
    }

    public boolean dispatchEvent(C1299240juk c1299240juk) {
        return false;
    }

    public void dispatchProperties(C1311730kEt c1311730kEt) {
    }

    public boolean dispatchTouch(MotionEvent motionEvent) {
        return false;
    }

    public boolean enableLayoutAnimation() {
        return false;
    }

    public void ensureCreateView(View view) {
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    public LynxBaseUI getExposeReceiveTarget() {
        return this;
    }

    public long getFirstMeaningfulContentPresentedTimestampMicros() {
        return -1L;
    }

    public int getInitialOverflowType() {
        return 1;
    }

    public C1313320kHS getKeyframeManager() {
        return null;
    }

    public C1311820kF2 getLayoutAnimator() {
        return null;
    }

    public int getMemberScrollX() {
        return 0;
    }

    public int getMemberScrollY() {
        return 0;
    }

    public long getMemoryUsageBytes() {
        return 0L;
    }

    public Map<String, String> getMemoryUsageDetail() {
        return null;
    }

    @Override // X.InterfaceC1311410kEN
    public InterfaceC1311410kEN getRootLynxPageUI() {
        InterfaceC1311410kEN parentLynxPageUI = this;
        while (parentLynxPageUI != null && parentLynxPageUI.getParentLynxPageUI() != null) {
            parentLynxPageUI = parentLynxPageUI.getParentLynxPageUI();
        }
        return parentLynxPageUI;
    }

    public float getScaleX() {
        return 1.0f;
    }

    public float getScaleY() {
        return 1.0f;
    }

    public int getScrollContainerDirection() {
        return 0;
    }

    public int getScrollX() {
        return 0;
    }

    public int getScrollY() {
        return 0;
    }

    public C1312040kFO getTransitionAnimator() {
        return null;
    }

    public float getTranslationX() {
        return 0.0f;
    }

    public float getTranslationY() {
        return 0.0f;
    }

    public Object getValueFromNativeStorage(String str) {
        return null;
    }

    public boolean getVisibility() {
        return true;
    }

    public void initTransitionAnimator(ReadableMap readableMap) {
    }

    public boolean initialPropsFlushed(String str, String str2) {
        return true;
    }

    public void initialize() {
    }

    public void interceptGesture(boolean z) {
    }

    @Override // X.InterfaceC1313090kH5
    public void invalidate() {
    }

    public boolean isAccessibilityDirectionVertical() {
        return true;
    }

    public boolean isAccessibilityHostUI() {
        return false;
    }

    public boolean isAtBorder(boolean z) {
        return true;
    }

    public boolean isCustomHittest() {
        return false;
    }

    public boolean isFlatten() {
        return false;
    }

    public boolean isOverlay() {
        return false;
    }

    public boolean isScrollContainer() {
        return false;
    }

    public boolean isScrollable() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public boolean needCustomLayout() {
        return false;
    }

    @Override // X.InterfaceC1311410kEN
    public void offResponseChain() {
        this.mOnResponseChain = false;
    }

    public void onAnimationNodeReady() {
    }

    public void onAnimationUpdated() {
    }

    public void onBeforeAnimation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public void onBorderRadiusUpdated(int i) {
    }

    public void onDrawingPositionChanged() {
    }

    public void onFocusChanged(boolean z, boolean z2) {
    }

    public void onGestureScrollBy(float f, float f2) {
    }

    public void onInvalidate() {
    }

    public void onLayoutFinish(long j) {
    }

    public void onLayoutFinish(long j, LynxBaseUI lynxBaseUI) {
    }

    public void onNodeReload() {
    }

    @Override // X.InterfaceC1311410kEN
    public void onResponseChain() {
        this.mOnResponseChain = true;
    }

    public void registerViewAccordingToNodeIndex() {
    }

    public void removeChildrenExposureUI() {
    }

    public void removeKeyFromNativeStorage(String str) {
    }

    public void renderIfNeeded() {
    }

    public boolean requestChildUIRectangleOnScreen(LynxBaseUI lynxBaseUI, Rect rect, boolean z) {
        return false;
    }

    @Override // X.InterfaceC1313090kH5
    public void requestLayout() {
    }

    public float[] scrollBy(float f, float f2) {
        return new float[]{0.0f, 0.0f, f, f2};
    }

    @InterfaceC1312540kGC(name = "accessibility-heading")
    public void setAccessibilityHeading(boolean z) {
    }

    @InterfaceC1312540kGC(name = "accessibility-value")
    public void setAccessibilityValue(String str) {
    }

    public void setAnimation(ReadableArray readableArray) {
    }

    @InterfaceC1312540kGC(name = "caret-color")
    public void setCaretColor(String str) {
    }

    public void setInitialPropsHasFlushed(String str, String str2) {
    }

    @Override // X.InterfaceC1311410kEN
    public void setPanInterceptAncestors(boolean z) {
    }

    @Override // X.InterfaceC1311410kEN
    public void setPanInterceptDescendants(boolean z) {
    }

    @Override // X.InterfaceC1311410kEN
    public void setPanInterceptSelf(boolean z) {
    }

    public void setStickyTranslate(PointF pointF) {
    }

    public void storeKeyToNativeStorage(String str, Object obj) {
    }

    public void updateExtraData(Object obj) {
    }

    private void ensureLynxBackground() {
        if (this.mLynxBackground == null || this.mNeedsBackgroundRecreation) {
            C1313270kHN c1313270kHN = new C1313270kHN(this.mContext);
            this.mLynxBackground = c1313270kHN;
            c1313270kHN.LIZJ = this.mDrawableCallback;
            c1313270kHN.LIZLLL = this.mFontSize;
            this.mNeedsBackgroundRecreation = false;
            restoreBackgroundProps();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kHQ, X.0kIz] */
    private C1314270kIz getOrCreateLynxMask() {
        if (this.mLynxMask == null) {
            final s sVar = this.mContext;
            ?? r1 = new AbstractC1313300kHQ<C1313390kHZ>(sVar) { // from class: X.0kIz
                @Override // X.AbstractC1313300kHQ
                public final AbstractC1313260kHM LIZ() {
                    return new C1313390kHZ(this.LIZ, this.LIZLLL);
                }
            };
            this.mLynxMask = r1;
            r1.LIZJ = this.mDrawableCallback;
            r1.LIZLLL = this.mFontSize;
            boolean z = this.mEnableBitmapGradient;
            AbstractC1313260kHM abstractC1313260kHMLIZIZ = r1.LIZIZ();
            abstractC1313260kHMLIZIZ.LJ.LLJI = z;
            abstractC1313260kHMLIZIZ.invalidateSelf();
            LJFF(this.mBitmapConfig);
            C1314270kIz c1314270kIz = this.mLynxMask;
            c1314270kIz.LIZIZ().LIZJ(this.mBorderWidth, SPACING_TYPES[this.mBorderSpacingIndex]);
            C1314270kIz c1314270kIz2 = this.mLynxMask;
            float f = this.mPaddingTop;
            float f2 = this.mPaddingRight;
            float f3 = this.mPaddingBottom;
            float f4 = this.mPaddingLeft;
            T t = c1314270kIz2.LIZIZ;
            if (t != 0) {
                t.LIZLLL(f, f2, f3, f4);
            }
        }
        return this.mLynxMask;
    }

    private float getTouchSlop() {
        if (this.mOnResponseChain) {
            return this.mTouchSlop * this.mContext.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    private boolean isImageConfigBadCase() {
        return Build.VERSION.SDK_INT == 25 && isMeizu15();
    }

    public static boolean isMeizu() {
        String str = Build.BRAND;
        return str != null && str.toLowerCase(Locale.ENGLISH).indexOf("meizu") > -1;
    }

    private void removeSelfFromStickyScrollerIfNeeded() {
        int i = this.mStickyScrollerSign;
        if (i == -1) {
            return;
        }
        s sVar = this.mContext;
        InterfaceC1311410kEN interfaceC1311410kENLJ = sVar != null ? sVar.LJ(i) : null;
        if (interfaceC1311410kENLJ instanceof InterfaceC1314580kJU) {
            ((InterfaceC1314580kJU) interfaceC1311410kENLJ).LJIILL(getSign());
        }
        this.mStickyScrollerSign = -1;
    }

    private void restoreBackgroundProps() {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.mProps.keySetIterator();
        C1311730kEt c1311730kEt = null;
        LynxUISetter lynxUISetterLIZIZ = null;
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (BACKGROUND_PROPS.contains(strNextKey)) {
                if (c1311730kEt == null) {
                    c1311730kEt = new C1311730kEt(this.mProps);
                    lynxUISetterLIZIZ = PropsUpdater.LIZIZ(getClass());
                }
                if (lynxUISetterLIZIZ != null) {
                    lynxUISetterLIZIZ.LIZ(this, strNextKey, c1311730kEt);
                }
            }
        }
    }

    private void sendLayoutChangeEvent() {
        Map<String, C1299120juY> map = this.mEvents;
        if (map == null || !map.containsKey("layoutchange")) {
            return;
        }
        this.mContext.LLIZ.LIZIZ(new C1298700jts(getSign(), "layoutchange", getPositionInfo(LynxEnv.inst().enableTransformForPositionCalculation())));
    }

    public void afterAnimationNodeReady() {
        if (this.mIsFirstAnimatedReady) {
            this.mIsFirstAnimatedReady = false;
        }
        Point point = this.mLastSize;
        Point point2 = this.mLatestSize;
        point.x = point2.x;
        point.y = point2.y;
        this.hasTransformChanged = false;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public LynxBaseUI m147clone() {
        LynxBaseUI lynxBaseUILJ = this.mContext.LJIILIIL().LJ(null, this.mTagName, false);
        applyUIPaintStylesToTarget(lynxBaseUILJ);
        Iterator<LynxBaseUI> it2 = getChildren().iterator();
        while (it2.hasNext()) {
            LynxBaseUI lynxBaseUIM147clone = it2.next().m147clone();
            lynxBaseUILJ.insertChild(lynxBaseUIM147clone, lynxBaseUILJ.getChildren().size());
            ((UIGroup) lynxBaseUILJ).insertView((LynxUI) lynxBaseUIM147clone);
        }
        lynxBaseUILJ.updateProperties(new C1311730kEt(this.mProps));
        lynxBaseUILJ.updateLayoutSize(getWidth(), getHeight());
        lynxBaseUILJ.updateLayout(getLeft(), getTop(), getWidth(), getHeight(), this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom, this.mMarginLeft, this.mMarginTop, this.mMarginRight, lynxBaseUILJ.mMarginBottom, this.mBorderLeftWidth, this.mBorderTopWidth, this.mBorderRightWidth, this.mBorderBottomWidth, getBound());
        lynxBaseUILJ.onLayoutFinish(0L, null);
        lynxBaseUILJ.onNodeReady();
        return lynxBaseUILJ;
    }

    public void destroy() {
        Map<Integer, WeakReference<InterfaceC1311590kEf>> map;
        C1311720kEs c1311720kEsLJIILIIL;
        List<InterfaceC1310460kCq> list;
        List<InterfaceC1311800kF0> list2;
        if ((this instanceof InterfaceC1311800kF0) && (list2 = this.mContext.LLJJJJJIL) != null) {
            ((ArrayList) list2).remove(this);
        }
        if ((this instanceof InterfaceC1310460kCq) && (c1311720kEsLJIILIIL = this.mContext.LJIILIIL()) != null && (list = c1311720kEsLJIILIIL.LJFF) != null) {
            ((ArrayList) list).remove(this);
        }
        if (this.mContext.LJIIJJI() != null) {
            C1298340jtI c1298340jtILJIIJJI = this.mContext.LJIIJJI();
            c1298340jtILJIIJJI.getClass();
            C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(c1298340jtILJIIJJI, this, 139));
        }
        C1313270kHN c1313270kHN = this.mLynxBackground;
        if (c1313270kHN != null) {
            c1313270kHN.LIZLLL();
        }
        C1314270kIz c1314270kIz = this.mLynxMask;
        if (c1314270kIz != null) {
            c1314270kIz.LIZLLL();
        }
        C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
        if (c1310360kCgLJIIL != null) {
            c1310360kCgLJIIL.LIZJ(this, false);
        }
        C1311400kEM gestureArenaManager = getGestureArenaManager();
        if (gestureArenaManager != null && gestureArenaManager.LIZJ() && (map = gestureArenaManager.LIZ) != null) {
            ((HashMap) map).remove(Integer.valueOf(getGestureArenaMemberId()));
            int gestureArenaMemberId = getGestureArenaMemberId();
            Map<Integer, C1311420kEO> gestureDetectorMap = getGestureDetectorMap();
            if (gestureArenaManager.LIZJ() && gestureDetectorMap != null && !gestureDetectorMap.isEmpty() && gestureArenaManager.LJ != null) {
                Iterator<Map.Entry<Integer, C1311420kEO>> it2 = gestureDetectorMap.entrySet().iterator();
                while (it2.hasNext()) {
                    C1311420kEO value = it2.next().getValue();
                    C1310330kCd c1310330kCd = gestureArenaManager.LJ;
                    c1310330kCd.getClass();
                    if (value != null) {
                        int i = value.LIZ;
                        Set set = (Set) ((HashMap) c1310330kCd.LIZ).get(Integer.valueOf(i));
                        if (set != null && !set.isEmpty() && set.contains(Integer.valueOf(gestureArenaMemberId))) {
                            set.remove(Integer.valueOf(gestureArenaMemberId));
                            if (set.isEmpty()) {
                                ((HashMap) c1310330kCd.LIZ).remove(Integer.valueOf(i));
                            }
                        }
                    }
                }
            }
        }
        Map<Integer, AbstractC1311530kEZ> map2 = this.mGestureHandlers;
        if (map2 != null) {
            map2.clear();
        }
    }

    public void flattenChildrenCountDecrement() {
        this.mFlattenChildrenCount--;
    }

    public void flattenChildrenCountIncrement() {
        this.mFlattenChildrenCount++;
    }

    public Rect getBoundingClientRect() {
        int scrollY;
        UIBody uIBody = this.mContext.LLJILJILJ;
        ViewGroup viewGroup = uIBody.LL;
        int scrollX = 0;
        if (viewGroup == null) {
            return new Rect(0, 0, getWidth(), getHeight());
        }
        if (this instanceof LynxUI) {
            View childAt = ((LynxUI) this).mView;
            if (childAt instanceof C1313240kHK) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (viewGroup2.getChildCount() > 0) {
                    childAt = viewGroup2.getChildAt(0);
                }
            }
            Rect rect = new Rect();
            View rootView = childAt.getRootView();
            if (viewGroup.getRootView() != rootView && (rootView instanceof ViewGroup)) {
                viewGroup = (ViewGroup) rootView;
            }
            try {
                viewGroup.offsetDescendantRectToMyCoords(childAt, rect);
                rect.offset(childAt.getScrollX(), childAt.getScrollY());
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            int[] offsetDescendantRectToLynxView = getOffsetDescendantRectToLynxView();
            int i = offsetDescendantRectToLynxView[0];
            if (i != Integer.MIN_VALUE) {
                rect.offset(i, offsetDescendantRectToLynxView[1]);
            }
            scrollY = rect.top;
            scrollX = rect.left;
        } else if (this instanceof LynxFlattenUI) {
            InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
            if (interfaceC1313090kH5 == null || interfaceC1313090kH5 == uIBody) {
                scrollX = this.mLeft;
                scrollY = this.mTop;
            } else {
                LynxBaseUI parentBaseUI = this;
                scrollY = 0;
                while ((parentBaseUI instanceof LynxFlattenUI) && parentBaseUI != this.mContext.LLJILJILJ) {
                    scrollX += parentBaseUI.getOriginLeft();
                    scrollY += parentBaseUI.getOriginTop();
                    parentBaseUI = parentBaseUI.getParentBaseUI();
                }
                if (parentBaseUI != null) {
                    Rect boundingClientRect = parentBaseUI.getBoundingClientRect();
                    scrollX += boundingClientRect.left - parentBaseUI.getScrollX();
                    scrollY += boundingClientRect.top - parentBaseUI.getScrollY();
                }
            }
        } else {
            scrollY = 0;
        }
        return new Rect(scrollX, scrollY, getWidth() + scrollX, getHeight() + scrollY);
    }

    @Override // X.InterfaceC1311410kEN
    public HashMap<String, InterfaceC1311410kEN> getChildrenLynxPageUI() {
        UIBody uIBody;
        s sVar = this.mContext;
        if (sVar == null || (uIBody = sVar.LLJILJILJ) == null) {
            return null;
        }
        return uIBody.getChildrenLynxPageUI();
    }

    public LynxBaseUI getDrawParent() {
        return (LynxBaseUI) this.mDrawParent;
    }

    public boolean getEnableExposureUIMargin() {
        Boolean bool = this.mEnableExposureUIMargin;
        if (bool != null) {
            return bool.booleanValue();
        }
        C1310290kCZ c1310290kCZ = this.mContext.LLLIIII;
        if (c1310290kCZ != null) {
            return c1310290kCZ.LJJIJL;
        }
        return false;
    }

    public String getExposeUniqueID() {
        return String.valueOf(this.mSign);
    }

    public C1311400kEM getGestureArenaManager() {
        C1311720kEs c1311720kEsLJIILIIL;
        s sVar = this.mContext;
        if (sVar == null || (c1311720kEsLJIILIIL = sVar.LJIILIIL()) == null) {
            return null;
        }
        return c1311720kEsLJIILIIL.LJIILJJIL;
    }

    public Matrix getHitTestMatrix() {
        this.mHitTestMatrix.reset();
        return this.mHitTestMatrix;
    }

    public final int getLatestHeight() {
        return this.mLatestSize.y;
    }

    public final int getLatestWidth() {
        return this.mLatestSize.x;
    }

    public int[] getOffsetDescendantRectToLynxView() {
        int[] iArr = this.mOffsetDescendantRectToLynxView.get();
        return iArr != null ? iArr : sDefaultOffsetToLynxView;
    }

    public C1313250kHL getOrCreateUIPaintStyles() {
        if (this.mUIPaintStyles == null) {
            this.mUIPaintStyles = new C1313250kHL();
        }
        return this.mUIPaintStyles;
    }

    public LynxBaseUI getParentBaseUI() {
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        return interfaceC1313090kH5 instanceof UIShadowProxy ? (LynxBaseUI) ((LynxBaseUI) interfaceC1313090kH5).mParent : (LynxBaseUI) interfaceC1313090kH5;
    }

    @Override // X.InterfaceC1311410kEN
    public InterfaceC1311410kEN getParentLynxPageUI() {
        UIBody uIBody;
        s sVar = this.mContext;
        if (sVar == null || (uIBody = sVar.LLJILJILJ) == null) {
            return null;
        }
        return uIBody.getParentLynxPageUI();
    }

    public JSONObject getPlatformCustomInfo() {
        return new JSONObject();
    }

    public Rect getRectToWindow() {
        C1310660kDA c1310660kDA = this.mContext.LLJILJILJ.LL;
        if (c1310660kDA == null) {
            return new Rect();
        }
        int[] iArr = new int[2];
        c1310660kDA.getLocationOnScreen(iArr);
        Rect boundingClientRect = getBoundingClientRect();
        boundingClientRect.offset(iArr[0], iArr[1]);
        return boundingClientRect;
    }

    public String getTestID() {
        String str = this.mTestTagName;
        return str == null ? "" : str;
    }

    public C1311380kEK getTouchEventDispatcher() {
        s sVar = this.mContext;
        if (sVar != null) {
            return sVar.LLIZLLLIL;
        }
        return null;
    }

    public Matrix getTransformMatrix() {
        this.mTransformMatrix.reset();
        return this.mTransformMatrix;
    }

    public Window getWindow() {
        for (Context baseContext = this.mContext; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof Activity) {
                return ((Activity) baseContext).getWindow();
            }
        }
        return null;
    }

    @Override // X.InterfaceC1311410kEN
    public boolean hasConsumeSlideEventAngles() {
        ArrayList<ArrayList<Float>> arrayList = this.mConsumeSlideEventAngles;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final boolean hasSizeChanged() {
        return !this.mLastSize.equals(this.mLatestSize);
    }

    public boolean ignoreFocus() {
        EnumC1311650kEl enumC1311650kEl = this.mIgnoreFocus;
        if (enumC1311650kEl == EnumC1311650kEl.Enable) {
            return true;
        }
        if (enumC1311650kEl == EnumC1311650kEl.Disable || parent() == null) {
            return false;
        }
        return parent().ignoreFocus();
    }

    public void invalidateMeaningfulPaintingArea() {
        s sVar = this.mContext;
        if (sVar == null || sVar.LJIILL() == null) {
            return;
        }
        this.mContext.LJIILL().invalidateMeaningfulPaintingArea();
    }

    public boolean isClickable() {
        Map<String, C1299120juY> map = this.mEvents;
        return map != null && map.containsKey("tap");
    }

    public boolean isEnableNewGesture() {
        return this.mGestureArenaMemberId > 0;
    }

    public boolean isLongClickable() {
        Map<String, C1299120juY> map = this.mEvents;
        return map != null && map.containsKey("longpress");
    }

    public void layout() {
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().layout();
        }
    }

    public void measure() {
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().measure();
        }
    }

    public void onAttach() {
        C1313270kHN c1313270kHN = this.mLynxBackground;
        if (c1313270kHN != null) {
            c1313270kHN.LIZJ();
        }
        C1314270kIz c1314270kIz = this.mLynxMask;
        if (c1314270kIz != null) {
            c1314270kIz.LIZJ();
        }
    }

    public void onDetach() {
        C1313270kHN c1313270kHN = this.mLynxBackground;
        if (c1313270kHN != null) {
            c1313270kHN.LIZLLL();
        }
        C1314270kIz c1314270kIz = this.mLynxMask;
        if (c1314270kIz != null) {
            c1314270kIz.LIZLLL();
        }
    }

    public void onLayoutUpdated() {
        if (this.mSkipLayoutUpdated) {
            return;
        }
        C1313270kHN c1313270kHN = this.mLynxBackground;
        if (c1313270kHN != null) {
            float f = this.mPaddingTop;
            float f2 = this.mPaddingRight;
            float f3 = this.mPaddingBottom;
            float f4 = this.mPaddingLeft;
            T t = c1313270kHN.LIZIZ;
            if (t != 0) {
                t.LIZLLL(f, f2, f3, f4);
            }
        }
        C1314270kIz c1314270kIz = this.mLynxMask;
        if (c1314270kIz != null) {
            float f5 = this.mPaddingTop;
            float f6 = this.mPaddingRight;
            float f7 = this.mPaddingBottom;
            float f8 = this.mPaddingLeft;
            T t2 = c1314270kIz.LIZIZ;
            if (t2 != 0) {
                t2.LIZLLL(f5, f6, f7, f8);
            }
        }
        invalidate();
        requestLayout();
    }

    public void onNodeRemoved() {
        C1310290kCZ c1310290kCZ;
        s sVar = this.mContext;
        if (sVar == null || (c1310290kCZ = sVar.LLLIIII) == null || !c1310290kCZ.LJJJI) {
            return;
        }
        removeSelfFromStickyScrollerIfNeeded();
        setStickyTranslate(null);
    }

    public void onPropsUpdated() {
        C1311400kEM gestureArenaManager;
        Map<Integer, WeakReference<InterfaceC1311590kEf>> map;
        Map<Integer, WeakReference<InterfaceC1311590kEf>> map2;
        s sVar = this.mContext;
        if (sVar != null) {
            sVar.LIZJ(this, null, null, null);
        }
        if (this.mGestureHandlers == null || (gestureArenaManager = getGestureArenaManager()) == null) {
            return;
        }
        int gestureArenaMemberId = getGestureArenaMemberId();
        int sign = 0;
        if (gestureArenaManager.LIZJ() && (map2 = gestureArenaManager.LIZ) != null) {
            if (((HashMap) map2).containsKey(Integer.valueOf(gestureArenaMemberId))) {
                return;
            }
        }
        if (gestureArenaManager.LIZJ() && (map = gestureArenaManager.LIZ) != null) {
            ((HashMap) map).put(Integer.valueOf(getSign()), new WeakReference(this));
            int sign2 = getSign();
            Map<Integer, C1311420kEO> gestureDetectorMap = getGestureDetectorMap();
            if (gestureArenaManager.LIZJ() && gestureDetectorMap != null && !gestureDetectorMap.isEmpty() && gestureArenaManager.LJ != null) {
                Iterator<Map.Entry<Integer, C1311420kEO>> it2 = gestureDetectorMap.entrySet().iterator();
                while (it2.hasNext()) {
                    C1311420kEO value = it2.next().getValue();
                    C1310330kCd c1310330kCd = gestureArenaManager.LJ;
                    c1310330kCd.getClass();
                    if (value != null) {
                        int i = value.LIZ;
                        if (((HashMap) c1310330kCd.LIZ).get(Integer.valueOf(i)) == null) {
                            ((HashMap) c1310330kCd.LIZ).put(Integer.valueOf(i), new HashSet());
                        }
                        ((Set) ((HashMap) c1310330kCd.LIZ).get(Integer.valueOf(i))).add(Integer.valueOf(sign2));
                    }
                }
            }
            sign = getSign();
        }
        this.mGestureArenaMemberId = sign;
    }

    @Override // X.InterfaceC1311410kEN
    public InterfaceC1311410kEN parent() {
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 instanceof InterfaceC1311410kEN) {
            return (InterfaceC1311410kEN) interfaceC1313090kH5;
        }
        return null;
    }

    @Override // X.InterfaceC1326530kcl
    public InterfaceC1326530kcl parentResponder() {
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 instanceof InterfaceC1326530kcl) {
            return (InterfaceC1326530kcl) interfaceC1313090kH5;
        }
        return null;
    }

    public EnumC1311640kEk pointerEvents() {
        EnumC1311640kEk enumC1311640kEk = this.mPointerEvents;
        return enumC1311640kEk != EnumC1311640kEk.Unset ? enumC1311640kEk : parent() != null ? parent().pointerEvents() : EnumC1311640kEk.Auto;
    }

    public void recognizeGesturere() {
        C1311380kEK c1311380kEK;
        HashSet<Integer> hashSet;
        s sVar = this.mContext;
        if (sVar == null || (c1311380kEK = sVar.LLIZLLLIL) == null || (hashSet = c1311380kEK.LJIJJ) == null) {
            return;
        }
        hashSet.add(Integer.valueOf(getSign()));
    }

    public final boolean shouldDoTransform() {
        if (!this.hasTransformChanged) {
            if (!C1313280kHO.LIZ(this.mTransformRaw)) {
                C1314250kIx c1314250kIx = this.mTransformOrigin;
                if (c1314250kIx == null) {
                    return false;
                }
                if (c1314250kIx.LIZ == 0.5f && c1314250kIx.LIZIZ == 1 && c1314250kIx.LIZJ == 0.5f && c1314250kIx.LIZLLL == 1) {
                    return false;
                }
                if (c1314250kIx.LIZIZ != 1 && c1314250kIx.LIZLLL != 1) {
                    return false;
                }
            }
            if (!hasSizeChanged()) {
                return false;
            }
        }
        return true;
    }

    public void uiOwnerDidPerformLayout() {
        if (this.mBoundingClientRectCallbacks.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.mBoundingClientRectCallbacks);
        this.mBoundingClientRectCallbacks.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterfaceC1314580kJU getStickyScroller() {
        for (LynxBaseUI parentBaseUI = getParentBaseUI(); parentBaseUI != 0; parentBaseUI = parentBaseUI.getParentBaseUI()) {
            if (parentBaseUI instanceof InterfaceC1314580kJU) {
                return (InterfaceC1314580kJU) parentBaseUI;
            }
        }
        return null;
    }

    public static boolean isMeizu15() {
        if (!isMeizu()) {
            return false;
        }
        String str = Build.DEVICE;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("15");
    }

    public Rect getBoundRectForOverflow() {
        if (getOverflow() == 3) {
            return null;
        }
        return getClipBounds();
    }

    public Rect getClipBounds() {
        int i;
        int width = getWidth();
        int height = getHeight();
        DisplayMetrics displayMetrics = this.mContext.LLJJJ;
        int i2 = 0;
        if ((getOverflow() & 1) != 0) {
            int i3 = displayMetrics.widthPixels;
            i = -i3;
            width += i3 * 2;
        } else {
            i = 0;
        }
        if ((getOverflow() & 2) != 0) {
            int i4 = displayMetrics.heightPixels;
            i2 = -i4;
            height += i4 * 2;
        }
        return new Rect(i, i2, width + i, height + i2);
    }

    public Map<Integer, AbstractC1311530kEZ> getGestureHandlers() {
        if (!isEnableNewGesture()) {
            return null;
        }
        if (this.mGestureHandlers == null) {
            this.mGestureHandlers = AbstractC1311530kEZ.LIZJ(getSign(), this.mContext, this, getGestureDetectorMap());
        }
        return this.mGestureHandlers;
    }

    public Rect getRect() {
        float width = getWidth() * getScaleX();
        float height = getHeight() * getScaleY();
        float originLeft = ((getOriginLeft() + (getWidth() / 2.0f)) - (width / 2.0f)) + getTranslationX();
        float originTop = ((getOriginTop() + (getHeight() / 2.0f)) - (height / 2.0f)) + getTranslationY();
        return new Rect((int) originLeft, (int) originTop, (int) (originLeft + width), (int) (originTop + height));
    }

    public Rect getRectWithoutTransform() {
        float originLeft = getOriginLeft();
        float originTop = getOriginTop();
        return new Rect((int) originLeft, (int) originTop, (int) (originLeft + getWidth()), (int) (originTop + getHeight()));
    }

    public boolean needGenerateMeaningfulPaintingArea() {
        return getMeaningfulContentStatus() != EnumC1311070kDp.IRRELEVANT;
    }

    public void onNodeReady() {
        onAnimationNodeReady();
        afterAnimationNodeReady();
        Iterator<Runnable> it2 = this.mNodeReadyBlockArray.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        this.mNodeReadyBlockArray.clear();
    }

    @Override // X.InterfaceC1311410kEN
    public boolean enableTouchPseudoPropagation() {
        return this.mEnableTouchPseudoPropagation;
    }

    public int flattenChildrenCount() {
        return this.mFlattenChildrenCount;
    }

    public ArrayList<String> getAccessibilityActions() {
        return this.mAccessibilityActions;
    }

    public int getAccessibilityElementStatus() {
        return this.mAccessibilityElementStatus;
    }

    public ArrayList<String> getAccessibilityElements() {
        return this.mAccessibilityElements;
    }

    public ArrayList<String> getAccessibilityElementsA11y() {
        return this.mAccessibilityElementsA11y;
    }

    public boolean getAccessibilityEnableTap() {
        return this.mAccessibilityEnableTap;
    }

    public String getAccessibilityId() {
        return this.mAccessibilityId;
    }

    public boolean getAccessibilityKeepFocused() {
        return this.mAccessibilityKeepFocused;
    }

    public CharSequence getAccessibilityLabel() {
        return this.mAccessibilityLabel;
    }

    public String getAccessibilityRoleDescription() {
        return this.mAccessibilityRoleDescription;
    }

    public String getAccessibilityStatus() {
        return this.mAccessibilityStatus;
    }

    public EnumC1319630kRd getAccessibilityTraits() {
        return this.mAccessibilityTraits;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public int getBorderBottomWidth() {
        return this.mBorderBottomWidth;
    }

    public int getBorderLeftWidth() {
        return this.mBorderLeftWidth;
    }

    public int getBorderRightWidth() {
        return this.mBorderRightWidth;
    }

    public int getBorderTopWidth() {
        return this.mBorderTopWidth;
    }

    public Rect getBound() {
        return this.mBound;
    }

    public int getCSSPositionType() {
        return this.mCSSPosition;
    }

    public List<LynxBaseUI> getChildren() {
        return this.mChildren;
    }

    public boolean getClipToRadius() {
        return this.mClipToRadius;
    }

    @Override // X.InterfaceC1326530kcl
    public ReadableMap getDataset() {
        return this.mDataset;
    }

    public boolean getDisableDefaultResize() {
        return this.mDisableDefaultResize;
    }

    public EnumC1311650kEl getEnableExposureUIClip() {
        return this.mEnableExposureUIClip;
    }

    public InterfaceC1298070jsr getEnableLocalCache() {
        return this.mUseLocalCache;
    }

    @Override // X.InterfaceC1311410kEN
    public Map<String, C1299120juY> getEvents() {
        return this.mEvents;
    }

    public String getExposureArea() {
        return this.mExposureArea;
    }

    public String getExposureID() {
        return this.mExposureID;
    }

    public String getExposureScene() {
        return this.mExposureScene;
    }

    public float getExposureScreenMarginBottom() {
        return this.mExposureScreenMarginBottom;
    }

    public float getExposureScreenMarginLeft() {
        return this.mExposureScreenMarginLeft;
    }

    public float getExposureScreenMarginRight() {
        return this.mExposureScreenMarginRight;
    }

    public float getExposureScreenMarginTop() {
        return this.mExposureScreenMarginTop;
    }

    public String getExposureUIMarginBottom() {
        return this.mExposureUIMarginBottom;
    }

    public String getExposureUIMarginLeft() {
        return this.mExposureUIMarginLeft;
    }

    public String getExposureUIMarginRight() {
        return this.mExposureUIMarginRight;
    }

    public String getExposureUIMarginTop() {
        return this.mExposureUIMarginTop;
    }

    public float getFontSize() {
        return this.mFontSize;
    }

    @Override // X.InterfaceC1311410kEN
    public int getGestureArenaMemberId() {
        return this.mGestureArenaMemberId;
    }

    @Override // X.InterfaceC1311590kEf
    public Map<Integer, C1311420kEO> getGestureDetectorMap() {
        return this.mGestureDetectors;
    }

    public boolean getHasRadius() {
        return this.mHasRadius;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public String getIdSelector() {
        return this.mIdSelector;
    }

    public int getImageRendering() {
        return this.mImageRendering;
    }

    public boolean getIncludeNativeGesture() {
        return this.mIncludeNativeGesture;
    }

    public Point getLastSize() {
        return this.mLastSize;
    }

    public float getLastTranslateZ() {
        return this.mLastTranslateZ;
    }

    public Point getLatestSize() {
        return this.mLatestSize;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public C1313270kHN getLynxBackground() {
        return this.mLynxBackground;
    }

    public s getLynxContext() {
        return this.mContext;
    }

    public C1314270kIz getLynxMask() {
        return this.mLynxMask;
    }

    public int getMarginBottom() {
        return this.mMarginBottom;
    }

    public int getMarginLeft() {
        return this.mMarginLeft;
    }

    public int getMarginRight() {
        return this.mMarginRight;
    }

    public int getMarginTop() {
        return this.mMarginTop;
    }

    public EnumC1311070kDp getMeaningfulContentStatus() {
        return EnumC1311070kDp.IRRELEVANT;
    }

    public String getName() {
        return this.mName;
    }

    public boolean getNeedSortChildren() {
        return this.mNeedSortChildren;
    }

    public LynxBaseUI getNextDrawUI() {
        return this.mNextDrawUI;
    }

    public int getNodeIndex() {
        return this.mNodeIndex;
    }

    public int getOriginLeft() {
        return this.mOriginLeft;
    }

    public int getOriginTop() {
        return this.mOriginTop;
    }

    public int getOverflow() {
        return this.mOverflow;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public int getPaddingRight() {
        return this.mPaddingRight;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    public InterfaceC1313090kH5 getParent() {
        return this.mParent;
    }

    public LynxBaseUI getPreviousDrawUI() {
        return this.mPreviousDrawUI;
    }

    public JavaOnlyMap getProps() {
        return this.mProps;
    }

    @Override // X.InterfaceC1311410kEN
    public int getPseudoStatus() {
        return this.mPseudoStatus;
    }

    public float getRealTimeTranslationZ() {
        return this.mTranslationZ;
    }

    public String getRefIdSelector() {
        return this.mRefId;
    }

    public String getScrollMonitorTag() {
        return this.mScrollMonitorTag;
    }

    @Override // X.InterfaceC1311410kEN
    public int getSign() {
        return this.mSign;
    }

    public float getSkewX() {
        return this.mSkewX;
    }

    public float getSkewY() {
        return this.mSkewY;
    }

    public boolean getSkipRedirection() {
        return this.mSkipRedirection;
    }

    public String getTagName() {
        return this.mTagName;
    }

    public int getTop() {
        return this.mTop;
    }

    public C1314250kIx getTransformOriginStr() {
        return this.mTransformOrigin;
    }

    public List<C1313280kHO> getTransformRaws() {
        return this.mTransformRaw;
    }

    public float getTranslationZ() {
        return this.mTranslationZ;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isDetachedWithView() {
        return this.mIsDetachedWithView;
    }

    public boolean isEnableScrollMonitor() {
        return this.mEnableScrollMonitor;
    }

    public boolean isFirstAnimatedReady() {
        return this.mIsFirstAnimatedReady;
    }

    public boolean isFocusable() {
        return this.mFocusable;
    }

    public boolean isOnResponseChain() {
        return this.mOnResponseChain;
    }

    public boolean isUserInteractionEnabled() {
        return this.userInteractionEnabled;
    }

    @Override // X.InterfaceC1311410kEN
    public EnumC1311610kEh panInterceptDirection() {
        return this.mPanInterceptDirection;
    }

    @Override // X.InterfaceC1311410kEN
    public EnumC1314040kIc panInterceptScope() {
        return this.mPanInterceptScope;
    }

    public LynxBaseUI(Context context) {
        this((s) context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void bindStickyScrollerIfNeeded(InterfaceC1314580kJU interfaceC1314580kJU) {
        if (interfaceC1314580kJU instanceof LynxBaseUI) {
            int sign = ((LynxBaseUI) interfaceC1314580kJU).getSign();
            int i = this.mStickyScrollerSign;
            if (i != -1 && i != sign) {
                removeSelfFromStickyScrollerIfNeeded();
            }
            this.mStickyScrollerSign = sign;
            interfaceC1314580kJU.LJIIIZ(getSign());
        }
    }

    private void setBorderColorForAllSpacingIndex(Integer num) {
        float fIntValue;
        ensureLynxBackground();
        float fIntValue2 = 1.0E21f;
        if (num == null) {
            fIntValue = 1.0E21f;
        } else {
            fIntValue = num.intValue() & 16777215;
            fIntValue2 = num.intValue() >>> 24;
        }
        int i = 1;
        do {
            this.mLynxBackground.LJIILJJIL(fIntValue, fIntValue2, SPACING_TYPES[i]);
            i++;
        } while (i <= 4);
    }

    private float toPix(String str) {
        return C1312920kGo.LIZIZ(str, this.mContext.LLJILJILJ.mFontSize, this.mFontSize, r1.getWidth(), r1.getHeight(), 1.0E21f, this.mContext.LLJJJ);
    }

    private void updateNewSticky(float[] fArr) {
        if (fArr != null && fArr.length >= 10) {
            Sticky sticky = new Sticky();
            this.mSticky = sticky;
            ((RectF) sticky).left = fArr[0];
            ((RectF) sticky).top = fArr[1];
            ((RectF) sticky).right = fArr[2];
            ((RectF) sticky).bottom = fArr[3];
            sticky.LLILLL = fArr[4];
            sticky.LLILZ = fArr[5];
            sticky.LLILZIL = fArr[6];
            sticky.LLILZLL = fArr[7];
            sticky.LLIZ = fArr[8];
            sticky.LLIZLLLIL = fArr[9];
            sticky.LLILLJJLI = 0.0f;
            sticky.LL = 0.0f;
            InterfaceC1314580kJU stickyScroller = getStickyScroller();
            if (stickyScroller != null) {
                bindStickyScrollerIfNeeded(stickyScroller);
                stickyScroller.LIZLLL();
                return;
            } else {
                removeSelfFromStickyScrollerIfNeeded();
                setStickyTranslate(null);
                return;
            }
        }
        removeSelfFromStickyScrollerIfNeeded();
        setStickyTranslate(null);
        this.mSticky = null;
    }

    public void addNodeReadyBlock(Runnable runnable) {
        if (runnable != null) {
            this.mNodeReadyBlockArray.add(runnable);
        }
    }

    public void afterPropsUpdated(C1311730kEt c1311730kEt) {
        C1314270kIz c1314270kIz;
        C1313270kHN c1313270kHN;
        if (c1311730kEt != null && !c1311730kEt.LJIIIZ()) {
            invalidate();
        }
        onPropsUpdated();
        onAnimationUpdated();
        C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
        if (c1310360kCgLJIIL != null && c1310360kCgLJIIL.LJIIJ != null && c1310360kCgLJIIL.LJIIL()) {
            if (c1311730kEt != null) {
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = c1311730kEt.LIZ.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    c1310360kCgLJIIL.LJIIJ.LIZ(4, this, readableMapKeySetIteratorKeySetIterator.nextKey());
                }
            } else {
                return;
            }
        } else if (c1311730kEt == null) {
            return;
        }
        if (!c1311730kEt.LJIIIZ()) {
            if (c1311730kEt.LJIIIIZZ("background-image") && (c1313270kHN = this.mLynxBackground) != null) {
                c1313270kHN.LJ();
            }
            if (c1311730kEt.LJIIIIZZ("mask-image") && (c1314270kIz = this.mLynxMask) != null) {
                c1314270kIz.LJ();
            }
        }
    }

    public void applyUIPaintStylesToTarget(LynxBaseUI lynxBaseUI) {
        C1313250kHL c1313250kHL = this.mUIPaintStyles;
        if (lynxBaseUI != null && c1313250kHL != null) {
            lynxBaseUI.setBackgroundClip(c1313250kHL.LIZ);
            lynxBaseUI.setBackgroundColor(c1313250kHL.LIZIZ);
            lynxBaseUI.setBackgroundImage(c1313250kHL.LIZJ);
            lynxBaseUI.setBackgroundOrigin(c1313250kHL.LIZLLL);
            lynxBaseUI.setBackgroundPosition(c1313250kHL.LJ);
            lynxBaseUI.setBackgroundRepeat(c1313250kHL.LJFF);
            lynxBaseUI.setBackgroundSize(c1313250kHL.LJI);
            lynxBaseUI.setMaskImage(c1313250kHL.LJII);
            lynxBaseUI.setMaskOrigin(c1313250kHL.LJIIIIZZ);
            lynxBaseUI.setMaskRepeat(c1313250kHL.LJIIIZ);
            lynxBaseUI.setMaskSize(c1313250kHL.LJIIJ);
            lynxBaseUI.setMaskPosition(c1313250kHL.LJIIJJI);
            lynxBaseUI.setMaskClip(c1313250kHL.LJIIL);
            lynxBaseUI.setBorderRadius(0, c1313250kHL.LJIILIIL);
            lynxBaseUI.setBorderRadius(1, c1313250kHL.LJIILJJIL);
            lynxBaseUI.setBorderRadius(2, c1313250kHL.LJIILL);
            lynxBaseUI.setBorderRadius(3, c1313250kHL.LJIILLIIL);
            lynxBaseUI.setBorderRadius(4, c1313250kHL.LJIIZILJ);
            lynxBaseUI.setOverflow(c1313250kHL.LJJIJ);
            lynxBaseUI.setOverflowX(c1313250kHL.LJJIJIIJI);
            lynxBaseUI.setOverflowY(c1313250kHL.LJJIJIIJIL);
            lynxBaseUI.setBorderStyle(0, c1313250kHL.LJIJ);
            lynxBaseUI.setBorderStyle(1, c1313250kHL.LJIJI);
            lynxBaseUI.setBorderStyle(2, c1313250kHL.LJIJJ);
            lynxBaseUI.setBorderStyle(3, c1313250kHL.LJIJJLI);
            lynxBaseUI.setBorderStyle(4, c1313250kHL.LJIL);
            lynxBaseUI.setBorderWidth(0, c1313250kHL.LJJ);
            lynxBaseUI.setBorderWidth(1, c1313250kHL.LJJI);
            lynxBaseUI.setBorderWidth(2, c1313250kHL.LJJIFFI);
            lynxBaseUI.setBorderWidth(3, c1313250kHL.LJJII);
            lynxBaseUI.setBorderWidth(4, c1313250kHL.LJJIII);
            lynxBaseUI.setBorderColor(0, c1313250kHL.LJJIIJ);
            lynxBaseUI.setBorderColor(1, c1313250kHL.LJJIIJZLJL);
            lynxBaseUI.setBorderColor(2, c1313250kHL.LJJIIZ);
            lynxBaseUI.setBorderColor(3, c1313250kHL.LJJIIZI);
            lynxBaseUI.setOutlineColor(c1313250kHL.LJJIJIL);
            lynxBaseUI.setOutlineWidth(c1313250kHL.LJJIJL);
            lynxBaseUI.setOutlineStyle(c1313250kHL.LJJIJLIJ);
            lynxBaseUI.setFontSize(c1313250kHL.LJJIL);
            lynxBaseUI.setLynxDirection(c1313250kHL.LJJIZ);
            lynxBaseUI.setTransformOrigin(c1313250kHL.LJJJ);
            lynxBaseUI.setPerspective(c1313250kHL.LJJJI);
            lynxBaseUI.setBoxShadow(c1313250kHL.LJJJIL);
            lynxBaseUI.setImageRendering(c1313250kHL.LJJJJI);
            if (lynxBaseUI instanceof LynxUI) {
                LynxUI lynxUI = (LynxUI) lynxBaseUI;
                lynxUI.setClipPath(c1313250kHL.LJJJJIZL);
                lynxUI.setFilter(c1313250kHL.LJJJJJ);
                lynxUI.setLayoutAnimationCreateDelay(c1313250kHL.LJJJJJL);
                lynxUI.setLayoutAnimationCreateDuration(c1313250kHL.LJJJJL);
                lynxUI.setLayoutAnimationCreateProperty(c1313250kHL.LJJJJLI);
                lynxUI.setLayoutAnimationCreateTimingFunc(c1313250kHL.LJJJJLL);
                lynxUI.setLayoutAnimationDeleteDelay(c1313250kHL.LJJJJZ);
                lynxUI.setLayoutAnimationDeleteDuration(c1313250kHL.LJJJJZI);
                lynxUI.setLayoutAnimationDeleteProperty(c1313250kHL.LJJJLIIL);
                lynxUI.setLayoutAnimationDeleteTimingFunc(c1313250kHL.LJJJLL);
                lynxUI.setLayoutAnimationUpdateDelay(c1313250kHL.LJJJLZIJ);
                lynxUI.setLayoutAnimationUpdateDuration(c1313250kHL.LJJJZ);
                lynxUI.setLayoutAnimationUpdateTimingFunc(c1313250kHL.LJJL);
                lynxUI.setAlpha(c1313250kHL.LJJLI);
                lynxUI.setVisibility(c1313250kHL.LJJLIIIIJ);
                lynxUI.setTransform(c1313250kHL.LJJJJ);
            }
        }
    }

    public void attachToView(s sVar) {
        this.mContext = sVar;
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().attachToView(sVar);
        }
    }

    @Override // X.InterfaceC1311410kEN
    public boolean blockNativeEvent(MotionEvent motionEvent) {
        if (this.mBlockNativeEvent) {
            return true;
        }
        if (this.mBlockNativeEventAreas == null) {
            return false;
        }
        Rect boundingClientRect = this.mContext.LLJILJILJ.getBoundingClientRect();
        Rect boundingClientRect2 = getBoundingClientRect();
        C1298900juC c1298900juC = new C1298900juC(motionEvent.getX(), motionEvent.getY());
        C1298900juC c1298900juC2 = new C1298900juC((boundingClientRect.left - boundingClientRect2.left) + c1298900juC.LIZ, (boundingClientRect.top - boundingClientRect2.top) + c1298900juC.LIZIZ);
        boolean z = false;
        for (int i = 0; i < this.mBlockNativeEventAreas.size(); i++) {
            ArrayList arrayList = (ArrayList) ListProtector.get(this.mBlockNativeEventAreas, i);
            if (arrayList != null && arrayList.size() == 4) {
                float fLIZ = ((C1315080kKI) ListProtector.get(arrayList, 0)).LIZ(boundingClientRect2.right - boundingClientRect2.left);
                float fLIZ2 = ((C1315080kKI) ListProtector.get(arrayList, 1)).LIZ(boundingClientRect2.bottom - boundingClientRect2.top);
                float fLIZ3 = ((C1315080kKI) ListProtector.get(arrayList, 2)).LIZ(boundingClientRect2.right - boundingClientRect2.left) + fLIZ;
                float fLIZ4 = ((C1315080kKI) ListProtector.get(arrayList, 3)).LIZ(boundingClientRect2.bottom - boundingClientRect2.top) + fLIZ2;
                float f = c1298900juC2.LIZ;
                if (f >= fLIZ && f < fLIZ3) {
                    float f2 = c1298900juC2.LIZIZ;
                    if (f2 >= fLIZ2 && f2 < fLIZ4) {
                        LynxLog.i("LynxBaseUI", "blocked this point!");
                        return true;
                    }
                }
                z = false;
            }
        }
        return z;
    }

    @Override // X.InterfaceC1311410kEN
    public boolean consumeSlideEvent(float f) {
        ArrayList<ArrayList<Float>> arrayList = this.mConsumeSlideEventAngles;
        if (arrayList == null) {
            return false;
        }
        for (ArrayList<Float> arrayList2 : arrayList) {
            if (f >= ((Float) ListProtector.get(arrayList2, 0)).floatValue() && f <= ((Float) ListProtector.get(arrayList2, 1)).floatValue()) {
                return true;
            }
        }
        return false;
    }

    public void copyPropFromOldUiInUpdateFlatten(LynxBaseUI lynxBaseUI) {
        this.mIsFirstAnimatedReady = lynxBaseUI.mIsFirstAnimatedReady;
        Point point = this.mLastSize;
        Point point2 = lynxBaseUI.mLastSize;
        point.set(point2.x, point2.y);
        Point point3 = this.mLatestSize;
        Point point4 = lynxBaseUI.mLatestSize;
        point3.set(point4.x, point4.y);
        this.mFlattenChildrenCount = lynxBaseUI.mFlattenChildrenCount;
        setEvents(lynxBaseUI.getEvents());
    }

    public void detachWithViewInfo(C1313210kHH c1313210kHH) {
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().detachWithViewInfo(c1313210kHH);
        }
    }

    public LynxBaseUI getChildAt(int i) {
        return (LynxBaseUI) ListProtector.get(this.mChildren, i);
    }

    public int getIndex(LynxBaseUI lynxBaseUI) {
        return this.mChildren.indexOf(lynxBaseUI);
    }

    public float[] getLocationOnScreen(float[] fArr) {
        View view;
        int[] iArr = new int[2];
        if (isFlatten()) {
            fArr[0] = fArr[0] + getLeft();
            fArr[1] = fArr[1] + getTop();
        }
        if (isFlatten()) {
            InterfaceC1313090kH5 interfaceC1313090kH5 = this.mDrawParent;
            if (interfaceC1313090kH5 == null) {
                LynxLog.e("LynxBaseUI", "mDrawParent of flattenUI is null, which causes the value getLocationOnScreen returns is not the correct coordinates relative to the screen!");
                return fArr;
            }
            view = ((LynxUI) interfaceC1313090kH5).mView;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
        } else {
            view = ((LynxUI) this).mView;
        }
        view.getRootView().getLocationOnScreen(iArr);
        transformFromViewToRootView(view, fArr);
        fArr[0] = fArr[0] + iArr[0];
        fArr[1] = fArr[1] + iArr[1];
        return fArr;
    }

    public JavaOnlyMap getPositionInfo(boolean z) {
        RectF rectF;
        new RectF();
        if (z) {
            rectF = C1292490jjr.LIZLLL(this, new RectF(0.0f, 0.0f, getWidth(), getHeight()));
        } else {
            rectF = new RectF(getBoundingClientRect());
        }
        float f = this.mContext.LLJJJ.density;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString(FollowStatusChangeMethod.PARAM_UID, getIdSelector());
        javaOnlyMap.putMap("dataset", (WritableMap) getDataset());
        javaOnlyMap.putDouble("left", rectF.left / f);
        javaOnlyMap.putDouble("top", rectF.top / f);
        javaOnlyMap.putDouble("right", rectF.right / f);
        javaOnlyMap.putDouble("bottom", rectF.bottom / f);
        javaOnlyMap.putDouble("width", rectF.width() / f);
        javaOnlyMap.putDouble("height", rectF.height() / f);
        return javaOnlyMap;
    }

    public void markDetachWithViewRecursively(boolean z) {
        this.mIsDetachedWithView = z;
        this.mNeedsBackgroundRecreation = z;
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().markDetachWithViewRecursively(z);
        }
    }

    public void notifyScrollStateChanged(int i) {
        InterfaceC1314870kJx[] interfaceC1314870kJxArr;
        if (this.mStateChangeListeners == null) {
            return;
        }
        synchronized (this) {
            try {
                interfaceC1314870kJxArr = (InterfaceC1314870kJx[]) this.mStateChangeListeners.toArray(new InterfaceC1314870kJx[this.mStateChangeListeners.size()]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (InterfaceC1314870kJx interfaceC1314870kJx : interfaceC1314870kJxArr) {
            interfaceC1314870kJx.LIZ(i);
        }
    }

    @Override // X.InterfaceC1311590kEf
    public void onPlatformGestureStatusChanged(int i) {
        C1311380kEK c1311380kEK;
        boolean z;
        s sVar = this.mContext;
        if (sVar != null && (c1311380kEK = sVar.LLIZLLLIL) != null) {
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            c1311380kEK.LJJIJIIJI = z;
        }
    }

    public void registerScrollStateListener(InterfaceC1314870kJx interfaceC1314870kJx) {
        if (interfaceC1314870kJx == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.mStateChangeListeners == null) {
                    this.mStateChangeListeners = new HashSet();
                }
                this.mStateChangeListeners.add(interfaceC1314870kJx);
                if (this.mStateChangeListeners.size() != 1) {
                    return;
                }
                initScrollStateChangeListener();
                InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
                if (interfaceC1313090kH5 instanceof LynxBaseUI) {
                    ((LynxBaseUI) interfaceC1313090kH5).registerScrollStateListener(this.mScrollStateChangeListener);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void removeChild(LynxBaseUI lynxBaseUI) {
        this.mChildren.remove(lynxBaseUI);
        lynxBaseUI.setParent(null);
    }

    public void scrollIntoView(ReadableMap readableMap) {
        scrollIntoView(readableMap, null);
    }

    @InterfaceC1312540kGC(name = "a11y-id")
    public void setA11yId(InterfaceC1298070jsr interfaceC1298070jsr) {
        String strAsString;
        if (interfaceC1298070jsr != null && ReadableType.String == interfaceC1298070jsr.getType()) {
            strAsString = interfaceC1298070jsr.asString();
        } else {
            strAsString = "";
        }
        this.mAccessibilityId = strAsString;
    }

    @InterfaceC1312540kGC(name = "accessibility-actions")
    public void setAccessibilityActions(ReadableArray readableArray) {
        this.mAccessibilityActions = readableArray.asArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @InterfaceC1312540kGC(name = "accessibility-element")
    public void setAccessibilityElement(InterfaceC1298070jsr interfaceC1298070jsr) {
        ?? AsBoolean = 1;
        AsBoolean = 1;
        AsBoolean = 1;
        if (interfaceC1298070jsr != null) {
            ReadableType type = interfaceC1298070jsr.getType();
            if (type == ReadableType.String) {
                AsBoolean = Boolean.parseBoolean(interfaceC1298070jsr.asString());
            } else if (type != ReadableType.Int && type != ReadableType.Number && type != ReadableType.Long) {
                if (type == ReadableType.Boolean) {
                    AsBoolean = interfaceC1298070jsr.asBoolean();
                }
            } else if (interfaceC1298070jsr.asInt() == 0) {
                AsBoolean = 0;
            }
        }
        this.mAccessibilityElementStatus = AsBoolean;
    }

    @InterfaceC1312540kGC(name = "accessibility-elements")
    public void setAccessibilityElements(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr != null && interfaceC1298070jsr.getType() == ReadableType.String) {
            String[] strArrSplit = interfaceC1298070jsr.asString().split(",");
            if (strArrSplit.length > 0) {
                if (this.mAccessibilityElements == null) {
                    this.mAccessibilityElements = new ArrayList<>();
                }
                this.mAccessibilityElements.clear();
                for (String str : strArrSplit) {
                    this.mAccessibilityElements.add(str);
                }
                C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
                if (c1310360kCgLJIIL != null && c1310360kCgLJIIL.LJFF()) {
                    c1310360kCgLJIIL.LJIILIIL.LIZJ.add(new WeakReference<>(this));
                }
            }
        }
    }

    @InterfaceC1312540kGC(name = "accessibility-elements-a11y")
    public void setAccessibilityElementsA11y(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr != null && interfaceC1298070jsr.getType() == ReadableType.String) {
            String[] strArrSplit = interfaceC1298070jsr.asString().split(",");
            if (strArrSplit.length > 0) {
                if (this.mAccessibilityElementsA11y == null) {
                    this.mAccessibilityElementsA11y = new ArrayList<>();
                }
                this.mAccessibilityElementsA11y.clear();
                for (String str : strArrSplit) {
                    this.mAccessibilityElementsA11y.add(str);
                }
                C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
                if (c1310360kCgLJIIL != null && c1310360kCgLJIIL.LJFF()) {
                    c1310360kCgLJIIL.LJIILIIL.LIZLLL.add(new WeakReference<>(this));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @X.InterfaceC1312540kGC(name = "accessibility-enable-tap")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAccessibilityEnableTap(X.InterfaceC1298070jsr r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1e
            com.lynx.react.bridge.ReadableType r1 = r3.getType()
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.String
            if (r1 != r0) goto L15
            java.lang.String r0 = r3.asString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
        L12:
            r2.mAccessibilityEnableTap = r0
            return
        L15:
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Boolean
            if (r1 != r0) goto L1e
            boolean r0 = r3.asBoolean()
            goto L12
        L1e:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxBaseUI.setAccessibilityEnableTap(X.0jsr):void");
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "accessibility-exclusive-focus")
    public void setAccessibilityExclusiveFocus(boolean z) {
        C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
        if (c1310360kCgLJIIL != null) {
            c1310360kCgLJIIL.LIZJ(this, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @X.InterfaceC1312540kGC(name = "android-accessibility-keep-focused")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAccessibilityKeepFocused(X.InterfaceC1298070jsr r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1e
            com.lynx.react.bridge.ReadableType r1 = r3.getType()
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.String
            if (r1 != r0) goto L15
            java.lang.String r0 = r3.asString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
        L12:
            r2.mAccessibilityKeepFocused = r0
            return
        L15:
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Boolean
            if (r1 != r0) goto L1e
            boolean r0 = r3.asBoolean()
            goto L12
        L1e:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxBaseUI.setAccessibilityKeepFocused(X.0jsr):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @X.InterfaceC1312540kGC(name = "accessibility-label")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAccessibilityLabel(X.InterfaceC1298070jsr r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L33
            com.lynx.react.bridge.ReadableType r1 = r3.getType()
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.String
            if (r1 != r0) goto L11
            java.lang.String r0 = r3.asString()
        Le:
            r2.mAccessibilityLabel = r0
            return
        L11:
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Int
            if (r1 == r0) goto L2a
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Number
            if (r1 == r0) goto L2a
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Long
            if (r1 == r0) goto L2a
            com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Boolean
            if (r1 != r0) goto L33
            boolean r0 = r3.asBoolean()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Le
        L2a:
            int r0 = r3.asInt()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Le
        L33:
            java.lang.String r0 = ""
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxBaseUI.setAccessibilityLabel(X.0jsr):void");
    }

    @InterfaceC1312540kGC(name = "accessibility-role-description")
    public void setAccessibilityRoleDescription(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr != null && interfaceC1298070jsr.getType() == ReadableType.String) {
            this.mAccessibilityRoleDescription = interfaceC1298070jsr.asString();
        }
    }

    @InterfaceC1312540kGC(name = "accessibility-status")
    public void setAccessibilityStatus(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr != null && interfaceC1298070jsr.getType() == ReadableType.String) {
            this.mAccessibilityStatus = interfaceC1298070jsr.asString();
        }
    }

    @InterfaceC1312540kGC(name = "accessibility-traits")
    public void setAccessibilityTraits(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr != null && interfaceC1298070jsr.getType() == ReadableType.String) {
            this.mAccessibilityTraits = EnumC1319630kRd.fromValue(interfaceC1298070jsr.asString());
        }
    }

    public void setAlpha(float f) {
        this.mAlpha = f;
    }

    @InterfaceC1312540kGC(name = "background-clip")
    public void setBackgroundClip(ReadableArray readableArray) {
        ensureLynxBackground();
        this.mLynxBackground.LJI(readableArray);
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "background-color")
    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
        if (getKeyframeManager() != null) {
            getKeyframeManager().LIZLLL(Integer.valueOf(i), "BackgroundColor");
        }
        if (getTransitionAnimator() != null && getTransitionAnimator().LIZIZ(64)) {
            getTransitionAnimator().LIZ(this, 64, Integer.valueOf(i));
            return;
        }
        ensureLynxBackground();
        this.mLynxBackground.LJIILIIL(i);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "background-image")
    public void setBackgroundImage(ReadableArray readableArray) {
        ensureLynxBackground();
        this.mLynxBackground.LIZIZ().LJ.LIZLLL(readableArray, this);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "background-origin")
    public void setBackgroundOrigin(ReadableArray readableArray) {
        ensureLynxBackground();
        this.mLynxBackground.LJII(readableArray);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "background-position")
    public void setBackgroundPosition(ReadableArray readableArray) {
        ensureLynxBackground();
        this.mLynxBackground.LJIIIIZZ(readableArray);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "background-repeat")
    public void setBackgroundRepeat(ReadableArray readableArray) {
        ensureLynxBackground();
        this.mLynxBackground.LJIIIZ(readableArray);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "background-size")
    public void setBackgroundSize(ReadableArray readableArray) {
        ensureLynxBackground();
        this.mLynxBackground.LJIIJ(readableArray);
        invalidate();
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "block-list-event")
    public void setBlockListEvent(boolean z) {
        this.mBlockListEvent = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "block-native-event")
    public void setBlockNativeEvent(boolean z) {
        this.mBlockNativeEvent = z;
    }

    @InterfaceC1312540kGC(name = "block-native-event-areas")
    public void setBlockNativeEventAreas(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.mBlockNativeEventAreas = null;
        if (interfaceC1298070jsr != null && interfaceC1298070jsr.getType() == ReadableType.Array && interfaceC1298070jsr.asArray() != null) {
            ReadableArray readableArrayAsArray = interfaceC1298070jsr.asArray();
            ArrayList<ArrayList<C1315080kKI>> arrayList = new ArrayList<>();
            for (int i = 0; i < readableArrayAsArray.size(); i++) {
                ReadableArray array = readableArrayAsArray.getArray(i);
                if (array != null && array.size() == 4) {
                    C1315080kKI c1315080kKILIZIZ = C1315080kKI.LIZIZ(array.getString(0));
                    C1315080kKI c1315080kKILIZIZ2 = C1315080kKI.LIZIZ(array.getString(1));
                    C1315080kKI c1315080kKILIZIZ3 = C1315080kKI.LIZIZ(array.getString(2));
                    C1315080kKI c1315080kKILIZIZ4 = C1315080kKI.LIZIZ(array.getString(3));
                    if (c1315080kKILIZIZ != null && c1315080kKILIZIZ2 != null && c1315080kKILIZIZ3 != null && c1315080kKILIZIZ4 != null) {
                        ArrayList<C1315080kKI> arrayList2 = new ArrayList<>();
                        arrayList2.add(c1315080kKILIZIZ);
                        arrayList2.add(c1315080kKILIZIZ2);
                        arrayList2.add(c1315080kKILIZIZ3);
                        arrayList2.add(c1315080kKILIZIZ4);
                        arrayList.add(arrayList2);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setBlockNativeEventAreas ");
                        sbLIZ.append(i);
                        sbLIZ.append("th type error");
                        LynxLog.w("LynxBaseUI", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setBlockNativeEventAreas ");
                    sbLIZ2.append(i);
                    sbLIZ2.append("th type error, size != 4");
                    LynxLog.w("LynxBaseUI", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            if (arrayList.size() > 0) {
                this.mBlockNativeEventAreas = arrayList;
                return;
            } else {
                LynxLog.w("LynxBaseUI", "setBlockNativeEventAreas empty areas");
                return;
            }
        }
        LynxLog.w("LynxBaseUI", "setBlockNativeEventAreas input type error");
    }

    public void setBorderColor(String str) {
        LynxLog.DTHROW(new RuntimeException("setBorderColor(String) is deprecated.This has no effect."));
    }

    public void setBound(Rect rect) {
        this.mBound = rect;
    }

    @InterfaceC1312540kGC(name = "box-shadow")
    public void setBoxShadow(ReadableArray readableArray) {
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 instanceof UIShadowProxy) {
            ((LynxBaseUI) interfaceC1313090kH5).setBoxShadow(readableArray);
        }
    }

    @InterfaceC1312540kGC(defaultFloat = 1.0f, name = "position")
    public final void setCSSPosition(int i) {
        this.mCSSPosition = i;
    }

    public void setChildrenLynxPageUI(HashMap<String, InterfaceC1311410kEN> map) {
        UIBody uIBody;
        s sVar = this.mContext;
        if (sVar != null && (uIBody = sVar.LLJILJILJ) != null) {
            uIBody.setChildrenLynxPageUI(map);
        }
    }

    @InterfaceC1312540kGC(name = "clip-radius")
    public void setClipToRadius(InterfaceC1298070jsr interfaceC1298070jsr) {
        boolean z;
        if (interfaceC1298070jsr == null) {
            return;
        }
        ReadableType type = interfaceC1298070jsr.getType();
        if (type == ReadableType.Boolean) {
            this.mClipToRadius = interfaceC1298070jsr.asBoolean();
            return;
        }
        if (type != ReadableType.String) {
            return;
        }
        String strAsString = interfaceC1298070jsr.asString();
        if (!strAsString.equalsIgnoreCase("true") && !strAsString.equalsIgnoreCase("yes")) {
            z = false;
        } else {
            z = true;
        }
        this.mClipToRadius = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-consume-hover-event")
    public void setConsumeHoverEvent(boolean z) {
        C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
        if (c1310360kCgLJIIL != null && c1310360kCgLJIIL.LJFF()) {
            this.mConsumeHoverEvent = z;
        }
    }

    @InterfaceC1312540kGC(name = "consume-slide-event")
    public void setConsumeSlideEvent(ReadableArray readableArray) {
        if (readableArray == null) {
            this.mConsumeSlideEventAngles = null;
            return;
        }
        try {
            ArrayList<Object> arrayList = readableArray.toArrayList();
            this.mConsumeSlideEventAngles = new ArrayList<>();
            for (Object obj : arrayList) {
                if ((obj instanceof ArrayList) && ((ArrayList) obj).size() == 2 && (((ArrayList) obj).get(0) instanceof Number) && (((ArrayList) obj).get(1) instanceof Number)) {
                    ArrayList<Float> arrayList2 = new ArrayList<>();
                    arrayList2.add(Float.valueOf(((Number) ((ArrayList) obj).get(0)).floatValue()));
                    arrayList2.add(Float.valueOf(((Number) ((ArrayList) obj).get(1)).floatValue()));
                    this.mConsumeSlideEventAngles.add(arrayList2);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setConsumeSlideEvent failed since ");
            sbLIZ.append(th.getMessage());
            LynxLog.e("LynxBaseUI", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @InterfaceC1312540kGC(name = "dataset")
    public void setDataset(ReadableMap readableMap) {
        this.mDataset = readableMap;
    }

    @InterfaceC1312540kGC(name = "disable-default-resize")
    public void setDisableDefaultResize(boolean z) {
        this.mDisableDefaultResize = z;
    }

    public void setDrawParent(InterfaceC1313090kH5 interfaceC1313090kH5) {
        this.mDrawParent = interfaceC1313090kH5;
    }

    @InterfaceC1312540kGC(name = "bitmap-gradient")
    public void setEnableBitmapGradient(boolean z) {
        this.mEnableBitmapGradient = z;
        BackgroundDrawable backgroundDrawableLIZIZ = this.mLynxBackground.LIZIZ();
        backgroundDrawableLIZIZ.LJ.LLJI = z;
        backgroundDrawableLIZIZ.invalidateSelf();
        C1314270kIz c1314270kIz = this.mLynxMask;
        if (c1314270kIz != null) {
            C1313390kHZ c1313390kHZLIZIZ = c1314270kIz.LIZIZ();
            c1313390kHZLIZIZ.LJ.LLJI = z;
            c1313390kHZLIZIZ.invalidateSelf();
        }
        invalidate();
    }

    @InterfaceC1312540kGC(name = "enable-exposure-ui-clip")
    public void setEnableExposureUIClip(boolean z) {
        EnumC1311650kEl enumC1311650kEl;
        if (z) {
            enumC1311650kEl = EnumC1311650kEl.Enable;
        } else {
            enumC1311650kEl = EnumC1311650kEl.Disable;
        }
        this.mEnableExposureUIClip = enumC1311650kEl;
    }

    @InterfaceC1312540kGC(name = "enable-exposure-ui-margin")
    public void setEnableExposureUIMargin(boolean z) {
        this.mEnableExposureUIMargin = Boolean.valueOf(z);
    }

    @InterfaceC1312540kGC(name = "enable-scroll-monitor")
    public void setEnableScrollMonitor(boolean z) {
        this.mEnableScrollMonitor = z;
    }

    @InterfaceC1312540kGC(name = "enable-touch-pseudo-propagation")
    public void setEnableTouchPseudoPropagation(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr == null) {
            this.mEnableTouchPseudoPropagation = true;
            return;
        }
        try {
            this.mEnableTouchPseudoPropagation = interfaceC1298070jsr.asBoolean();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LynxLog.i("LynxBaseUI", th.toString());
            this.mEnableTouchPseudoPropagation = true;
        }
    }

    @Override // X.InterfaceC1311410kEN
    public void setEventID(long j) {
        LynxBaseUI lynxBaseUI;
        s sVar;
        C1298720jtu c1298720jtu;
        if (getChildrenLynxPageUI() != null && (lynxBaseUI = (LynxBaseUI) getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this)))) != null && (sVar = lynxBaseUI.mContext) != null && (c1298720jtu = sVar.LLIZ) != null) {
            c1298720jtu.LIZ = j;
        }
    }

    @InterfaceC1312540kGC(name = "event-through")
    public void setEventThrough(InterfaceC1298070jsr interfaceC1298070jsr) {
        EnumC1311650kEl enumC1311650kEl;
        if (interfaceC1298070jsr == null) {
            this.mEventThrough = EnumC1311650kEl.Undefined;
            return;
        }
        try {
            if (interfaceC1298070jsr.asBoolean()) {
                enumC1311650kEl = EnumC1311650kEl.Enable;
            } else {
                enumC1311650kEl = EnumC1311650kEl.Disable;
            }
            this.mEventThrough = enumC1311650kEl;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LynxLog.i("LynxBaseUI", th.toString());
            this.mEventThrough = EnumC1311650kEl.Undefined;
        }
    }

    @InterfaceC1312540kGC(name = "event-through-active-regions")
    public void setEventThroughActiveRegions(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.mEventThroughActiveRegions = null;
        if (interfaceC1298070jsr != null && interfaceC1298070jsr.getType() == ReadableType.Array && interfaceC1298070jsr.asArray() != null) {
            ReadableArray readableArrayAsArray = interfaceC1298070jsr.asArray();
            ArrayList<ArrayList<C1315080kKI>> arrayList = new ArrayList<>();
            for (int i = 0; i < readableArrayAsArray.size(); i++) {
                ReadableArray array = readableArrayAsArray.getArray(i);
                if (array != null && array.size() == 4) {
                    C1315080kKI c1315080kKILIZIZ = C1315080kKI.LIZIZ(array.getString(0));
                    C1315080kKI c1315080kKILIZIZ2 = C1315080kKI.LIZIZ(array.getString(1));
                    C1315080kKI c1315080kKILIZIZ3 = C1315080kKI.LIZIZ(array.getString(2));
                    C1315080kKI c1315080kKILIZIZ4 = C1315080kKI.LIZIZ(array.getString(3));
                    if (c1315080kKILIZIZ != null && c1315080kKILIZIZ2 != null && c1315080kKILIZIZ3 != null && c1315080kKILIZIZ4 != null) {
                        ArrayList<C1315080kKI> arrayList2 = new ArrayList<>();
                        arrayList2.add(c1315080kKILIZIZ);
                        arrayList2.add(c1315080kKILIZIZ2);
                        arrayList2.add(c1315080kKILIZIZ3);
                        arrayList2.add(c1315080kKILIZIZ4);
                        arrayList.add(arrayList2);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setEventThroughActiveRegions ");
                        sbLIZ.append(i);
                        sbLIZ.append("th type error");
                        LynxLog.w("LynxBaseUI", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setEventThroughActiveRegions ");
                    sbLIZ2.append(i);
                    sbLIZ2.append("th type error, size != 4");
                    LynxLog.w("LynxBaseUI", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            if (arrayList.size() > 0) {
                this.mEventThroughActiveRegions = arrayList;
                return;
            } else {
                LynxLog.w("LynxBaseUI", "setEventThroughActiveRegions empty regions");
                return;
            }
        }
        LynxLog.w("LynxBaseUI", "setEventThroughActiveRegions input type error");
    }

    public void setEvents(Map<String, C1299120juY> map) {
        this.mEvents = map;
    }

    @InterfaceC1312540kGC(name = "exposure-area")
    public void setExposureArea(String str) {
        this.mExposureArea = str;
    }

    @InterfaceC1312540kGC(name = "exposure-id")
    public void setExposureID(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.mContext.LJJI(null, this);
        String strAsString = interfaceC1298070jsr.asString();
        if (strAsString != null && !strAsString.isEmpty()) {
            this.mExposureID = strAsString;
            return;
        }
        this.mExposureID = null;
        LynxLog.e("LynxBaseUI", "setExposureID(Dynamic exposureID) failed, since it is not number/string, or it is empty string");
        LynxLog.DTHROW(new RuntimeException("setExposureID(Dynamic exposureID) failed, since it is not number/string, or it is empty string"));
    }

    @InterfaceC1312540kGC(name = "exposure-scene")
    public void setExposureScene(String str) {
        this.mContext.LJJI(null, this);
        this.mExposureScene = str;
    }

    @InterfaceC1312540kGC(name = "exposure-screen-margin-bottom")
    public void setExposureScreenMarginBottom(String str) {
        this.mExposureScreenMarginBottom = C1312920kGo.LIZ(str, 0.0f);
    }

    @InterfaceC1312540kGC(name = "exposure-screen-margin-left")
    public void setExposureScreenMarginLeft(String str) {
        this.mExposureScreenMarginLeft = C1312920kGo.LIZ(str, 0.0f);
    }

    @InterfaceC1312540kGC(name = "exposure-screen-margin-right")
    public void setExposureScreenMarginRight(String str) {
        this.mExposureScreenMarginRight = C1312920kGo.LIZ(str, 0.0f);
    }

    @InterfaceC1312540kGC(name = "exposure-screen-margin-top")
    public void setExposureScreenMarginTop(String str) {
        this.mExposureScreenMarginTop = C1312920kGo.LIZ(str, 0.0f);
    }

    @InterfaceC1312540kGC(name = "exposure-ui-margin-bottom")
    public void setExposureUIMarginBottom(String str) {
        this.mExposureUIMarginBottom = str;
    }

    @InterfaceC1312540kGC(name = "exposure-ui-margin-left")
    public void setExposureUIMarginLeft(String str) {
        this.mExposureUIMarginLeft = str;
    }

    @InterfaceC1312540kGC(name = "exposure-ui-margin-right")
    public void setExposureUIMarginRight(String str) {
        this.mExposureUIMarginRight = str;
    }

    @InterfaceC1312540kGC(name = "exposure-ui-margin-top")
    public void setExposureUIMarginTop(String str) {
        this.mExposureUIMarginTop = str;
    }

    @InterfaceC1312540kGC(name = "focusable")
    public void setFocusable(Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.mFocusable = zBooleanValue;
    }

    @InterfaceC1312540kGC(defaultFloat = 1.0E21f, name = "font-size")
    public void setFontSize(float f) {
        if (f != 1.0E21f) {
            ensureLynxBackground();
            this.mFontSize = f;
            this.mLynxBackground.LIZLLL = f;
            C1314270kIz c1314270kIz = this.mLynxMask;
            if (c1314270kIz != null) {
                c1314270kIz.LIZLLL = f;
            }
        }
    }

    public void setGestureDetectors(Map<Integer, C1311420kEO> map) {
        C1311400kEM gestureArenaManager;
        Map<Integer, WeakReference<InterfaceC1311590kEf>> map2;
        Map<Integer, AbstractC1311530kEZ> map3;
        this.mGestureDetectors = map;
        if (map == null || map.isEmpty() || (gestureArenaManager = getGestureArenaManager()) == null) {
            return;
        }
        int gestureArenaMemberId = getGestureArenaMemberId();
        if (gestureArenaManager.LIZJ() && (map2 = gestureArenaManager.LIZ) != null) {
            if (((HashMap) map2).containsKey(Integer.valueOf(gestureArenaMemberId)) && (map3 = this.mGestureHandlers) != null) {
                map3.clear();
                this.mGestureHandlers = null;
            }
        }
        if (this.mGestureHandlers == null && getSign() > 0) {
            Map<Integer, AbstractC1311530kEZ> mapLIZJ = AbstractC1311530kEZ.LIZJ(getSign(), this.mContext, this, getGestureDetectorMap());
            this.mGestureHandlers = mapLIZJ;
            this.mIncludeNativeGesture = false;
            Iterator it2 = ((HashMap) mapLIZJ).keySet().iterator();
            while (it2.hasNext()) {
                if (((Integer) it2.next()).intValue() == 7) {
                    this.mIncludeNativeGesture = true;
                    return;
                }
            }
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        onLayoutUpdated();
    }

    @InterfaceC1312540kGC(name = "hit-slop")
    public void setHitSlop(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr != null) {
            ReadableType type = interfaceC1298070jsr.getType();
            ReadableType readableType = ReadableType.Map;
            if (type != readableType && interfaceC1298070jsr.getType() != ReadableType.String) {
                return;
            }
            if (interfaceC1298070jsr.getType() == readableType && interfaceC1298070jsr.asMap().size() > 0) {
                ReadableMap readableMapAsMap = interfaceC1298070jsr.asMap();
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMapAsMap.keySetIterator();
                List listAsList = Arrays.asList("top", "bottom", "left", "right");
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    if (listAsList.contains(strNextKey)) {
                        float fLIZ = C1312920kGo.LIZ(readableMapAsMap.getString(strNextKey), 0.0f);
                        int iIndexOf = listAsList.indexOf(strNextKey);
                        if (iIndexOf != 0) {
                            if (iIndexOf != 1) {
                                if (iIndexOf != 2) {
                                    if (iIndexOf == 3) {
                                        float f = this.mHitSlopRight;
                                        if (f == fLIZ) {
                                            fLIZ = f;
                                        }
                                        this.mHitSlopRight = fLIZ;
                                    }
                                } else {
                                    float f2 = this.mHitSlopLeft;
                                    if (f2 == fLIZ) {
                                        fLIZ = f2;
                                    }
                                    this.mHitSlopLeft = fLIZ;
                                }
                            } else {
                                float f3 = this.mHitSlopBottom;
                                if (f3 == fLIZ) {
                                    fLIZ = f3;
                                }
                                this.mHitSlopBottom = fLIZ;
                            }
                        } else {
                            float f4 = this.mHitSlopTop;
                            if (f4 == fLIZ) {
                                fLIZ = f4;
                            }
                            this.mHitSlopTop = fLIZ;
                        }
                    }
                }
                return;
            }
            float fLIZ2 = C1312920kGo.LIZ(interfaceC1298070jsr.asString(), 0.0f);
            if (this.mHitSlopTop == fLIZ2 && this.mHitSlopBottom == fLIZ2 && this.mHitSlopLeft == fLIZ2 && this.mHitSlopRight == fLIZ2) {
                return;
            }
            this.mHitSlopRight = fLIZ2;
            this.mHitSlopLeft = fLIZ2;
            this.mHitSlopBottom = fLIZ2;
            this.mHitSlopTop = fLIZ2;
        }
    }

    @InterfaceC1312540kGC(name = "idSelector")
    public void setIdSelector(String str) {
        this.mIdSelector = str;
    }

    @InterfaceC1312540kGC(name = "ignore-focus")
    public void setIgnoreFocus(InterfaceC1298070jsr interfaceC1298070jsr) {
        EnumC1311650kEl enumC1311650kEl;
        if (interfaceC1298070jsr == null) {
            this.mIgnoreFocus = EnumC1311650kEl.Undefined;
            return;
        }
        try {
            if (interfaceC1298070jsr.asBoolean()) {
                enumC1311650kEl = EnumC1311650kEl.Enable;
            } else {
                enumC1311650kEl = EnumC1311650kEl.Disable;
            }
            this.mIgnoreFocus = enumC1311650kEl;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LynxLog.i("LynxBaseUI", th.toString());
            this.mIgnoreFocus = EnumC1311650kEl.Undefined;
        }
    }

    @InterfaceC1312540kGC(name = "image-config")
    public void setImageConfig(String str) {
        if (str != null && !str.equalsIgnoreCase("")) {
            if (str.equalsIgnoreCase("ALPHA_8")) {
                this.mBitmapConfig = Bitmap.Config.ALPHA_8;
            } else if (str.equalsIgnoreCase("RGB_565")) {
                if (!isImageConfigBadCase()) {
                    this.mBitmapConfig = Bitmap.Config.RGB_565;
                } else {
                    LynxLog.w("LynxBaseUI setImageConfig warn: ", "RGB_565 can't be set on Meizu15");
                    this.mBitmapConfig = null;
                }
            } else if (str.equalsIgnoreCase("ARGB_8888")) {
                this.mBitmapConfig = Bitmap.Config.ARGB_8888;
            } else if (str.equalsIgnoreCase("RGBA_F16")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.mBitmapConfig = Bitmap.Config.RGBA_F16;
                } else {
                    LynxLog.w("LynxBaseUI setImageConfig warn: ", "RGBA_F16 requires build version >= VERSION_CODES.O");
                    this.mBitmapConfig = null;
                }
            } else if (str.equalsIgnoreCase("HARDWARE")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.mBitmapConfig = Bitmap.Config.HARDWARE;
                } else {
                    this.mBitmapConfig = null;
                    LynxLog.w("LynxBaseUI setImageConfig warn: ", "HARDWARE requires build version >= VERSION_CODES.O");
                }
            } else {
                this.mBitmapConfig = null;
            }
            C1313270kHN c1313270kHN = this.mLynxBackground;
            if (c1313270kHN != null) {
                c1313270kHN.LJFF(this.mBitmapConfig);
            }
            C1314270kIz c1314270kIz = this.mLynxMask;
            if (c1314270kIz != null) {
                c1314270kIz.LJFF(this.mBitmapConfig);
                return;
            }
            return;
        }
        this.mBitmapConfig = null;
    }

    @InterfaceC1312540kGC(name = "image-rendering")
    public void setImageRendering(int i) {
        this.mImageRendering = i;
    }

    @InterfaceC1312540kGC(name = "intersection-observers")
    public void setIntersectionObservers(ReadableArray readableArray) {
        C1298340jtI c1298340jtILJIIJJI = this.mContext.LJIIJJI();
        c1298340jtILJIIJJI.getClass();
        C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(c1298340jtILJIIJJI, this, 139));
        if (readableArray != null && this.mEvents.containsKey("intersection")) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                if (map != null) {
                    C1298220jt6 c1298220jt6 = new C1298220jt6(this.mContext.LJIIJJI(), map, this);
                    C1298340jtI c1298340jtILJIIJJI2 = this.mContext.LJIIJJI();
                    c1298340jtILJIIJJI2.getClass();
                    C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(c1298340jtILJIIJJI2, c1298220jt6, 137));
                }
            }
        }
    }

    public void setLastTranslateZ(float f) {
        this.mLastTranslateZ = f;
    }

    public void setLeft(int i) {
        this.mLeft = i;
        this.mOriginLeft = i;
        onLayoutUpdated();
    }

    @InterfaceC1312540kGC(name = "local-cache")
    public void setLocalCache(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.mUseLocalCache = interfaceC1298070jsr;
    }

    public void setLynxBackground(C1313270kHN c1313270kHN) {
        this.mLynxBackground = c1313270kHN;
    }

    @InterfaceC1312540kGC(defaultInt = 3, name = "direction")
    public void setLynxDirection(int i) {
        this.mLynxDirection = i;
    }

    public void setLynxMask(C1314270kIz c1314270kIz) {
        this.mLynxMask = c1314270kIz;
    }

    @InterfaceC1312540kGC(name = "mask-clip")
    public void setMaskClip(ReadableArray readableArray) {
        getOrCreateLynxMask().LJI(readableArray);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "mask-image")
    public void setMaskImage(ReadableArray readableArray) {
        getOrCreateLynxMask().LIZIZ().LJ.LIZLLL(readableArray, this);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "mask-origin")
    public void setMaskOrigin(ReadableArray readableArray) {
        getOrCreateLynxMask().LJII(readableArray);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "mask-position")
    public void setMaskPosition(ReadableArray readableArray) {
        getOrCreateLynxMask().LJIIIIZZ(readableArray);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "mask-repeat")
    public void setMaskRepeat(ReadableArray readableArray) {
        getOrCreateLynxMask().LJIIIZ(readableArray);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "mask-size")
    public void setMaskSize(ReadableArray readableArray) {
        getOrCreateLynxMask().LJIIJ(readableArray);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "name")
    public void setName(String str) {
        this.mName = str;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "native-interaction-enabled")
    public void setNativeInteractionEnabled(boolean z) {
        this.nativeInteractionEnabled = z;
    }

    public void setNeedSortChildren(boolean z) {
        this.mNeedSortChildren = z;
    }

    public void setNextDrawUI(LynxBaseUI lynxBaseUI) {
        this.mNextDrawUI = lynxBaseUI;
    }

    public void setNodeIndex(int i) {
        this.mNodeIndex = i;
    }

    public void setOffsetDescendantRectToLynxView(int[] iArr) {
        this.mOffsetDescendantRectToLynxView = new WeakReference<>(iArr);
    }

    public void setOriginLeft(int i) {
        this.mOriginLeft = i;
    }

    public void setOriginTop(int i) {
        this.mOriginTop = i;
    }

    @InterfaceC1312540kGC(defaultInt = -16777216, name = "outline-color")
    public void setOutlineColor(int i) {
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 instanceof UIShadowProxy) {
            ((LynxBaseUI) interfaceC1313090kH5).setOutlineColor(i);
        }
    }

    @InterfaceC1312540kGC(defaultInt = -1, name = "outline-style")
    public void setOutlineStyle(int i) {
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 instanceof UIShadowProxy) {
            ((UIShadowProxy) interfaceC1313090kH5).LJJIIZI().LIZ = EnumC1313350kHV.parse(i);
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "outline-width")
    public void setOutlineWidth(float f) {
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 instanceof UIShadowProxy) {
            ((LynxBaseUI) interfaceC1313090kH5).setOutlineWidth(f);
        }
    }

    @InterfaceC1312540kGC(name = "overflow")
    public void setOverflow(Integer num) {
        int iIntValue;
        if (num == null) {
            iIntValue = getInitialOverflowType();
        } else {
            iIntValue = num.intValue();
        }
        setOverflow(iIntValue);
    }

    @InterfaceC1312540kGC(name = "overflow-x")
    public void setOverflowX(Integer num) {
        int iIntValue;
        if (num == null) {
            iIntValue = getInitialOverflowType();
        } else {
            iIntValue = num.intValue();
        }
        setOverflowWithMask((short) 1, iIntValue);
    }

    @InterfaceC1312540kGC(name = "overflow-y")
    public void setOverflowY(Integer num) {
        int iIntValue;
        if (num == null) {
            iIntValue = getInitialOverflowType();
        } else {
            iIntValue = num.intValue();
        }
        setOverflowWithMask((short) 2, iIntValue);
    }

    @InterfaceC1312540kGC(name = "pan-intercept-direction")
    public void setPanInterceptDirection(int i) {
        if (i >= EnumC1311610kEh.Horizontal.ordinal() && i < EnumC1311610kEh.None.ordinal()) {
            this.mPanInterceptDirection = EnumC1311610kEh.values()[i];
        }
    }

    @InterfaceC1312540kGC(name = "pan-intercept-scope")
    public void setPanInterceptScope(int i) {
        if (i >= EnumC1314040kIc.Self.ordinal() && i < EnumC1314040kIc.None.ordinal()) {
            this.mPanInterceptScope = EnumC1314040kIc.values()[i];
        }
    }

    public void setParent(InterfaceC1313090kH5 interfaceC1313090kH5) {
        InterfaceC1314870kJx[] interfaceC1314870kJxArr;
        InterfaceC1314870kJx[] interfaceC1314870kJxArr2;
        if (this.mStateChangeListeners == null) {
            this.mParent = interfaceC1313090kH5;
            return;
        }
        int i = 0;
        if (interfaceC1313090kH5 instanceof LynxBaseUI) {
            synchronized (this) {
                try {
                    interfaceC1314870kJxArr2 = (InterfaceC1314870kJx[]) this.mStateChangeListeners.toArray(new InterfaceC1314870kJx[this.mStateChangeListeners.size()]);
                } finally {
                }
            }
            int length = interfaceC1314870kJxArr2.length;
            while (i < length) {
                ((LynxBaseUI) interfaceC1313090kH5).registerScrollStateListener(interfaceC1314870kJxArr2[i]);
                i++;
            }
        } else if (this.mParent instanceof LynxBaseUI) {
            synchronized (this) {
                try {
                    interfaceC1314870kJxArr = (InterfaceC1314870kJx[]) this.mStateChangeListeners.toArray(new InterfaceC1314870kJx[this.mStateChangeListeners.size()]);
                } finally {
                }
            }
            int length2 = interfaceC1314870kJxArr.length;
            while (i < length2) {
                ((LynxBaseUI) this.mParent).unRegisterScrollStateListener(interfaceC1314870kJxArr[i]);
                i++;
            }
        }
        this.mParent = interfaceC1313090kH5;
    }

    public void setParentLynxPageUI(InterfaceC1311410kEN interfaceC1311410kEN) {
        UIBody uIBody;
        s sVar = this.mContext;
        if (sVar != null && (uIBody = sVar.LLJILJILJ) != null) {
            uIBody.setParentLynxPageUI(interfaceC1311410kEN);
        }
    }

    @InterfaceC1312540kGC(name = "perspective")
    public void setPerspective(ReadableArray readableArray) {
        this.mPerspective = readableArray;
    }

    @InterfaceC1312540kGC(name = "pointer-events")
    public void setPointerEvents(int i) {
        if (i >= EnumC1311640kEk.Auto.ordinal() && i < EnumC1311640kEk.Unset.ordinal()) {
            this.mPointerEvents = EnumC1311640kEk.values()[i];
        }
    }

    public void setPreviousDrawUI(LynxBaseUI lynxBaseUI) {
        this.mPreviousDrawUI = lynxBaseUI;
    }

    @InterfaceC1312540kGC(name = "react-ref")
    public void setRefIdSelector(String str) {
        this.mRefId = str;
    }

    @InterfaceC1312540kGC(name = "scroll-monitor-tag")
    public void setScrollMonitorTag(String str) {
        this.mScrollMonitorTag = str;
    }

    public void setSkewX(float f) {
        this.mSkewX = f;
    }

    public void setSkewY(float f) {
        this.mSkewY = f;
    }

    @InterfaceC1312540kGC(name = "skip-redirection")
    public void setSkipRedirection(boolean z) {
        this.mSkipRedirection = z;
    }

    @InterfaceC1312540kGC(name = "lynx-test-tag")
    public void setTestID(String str) {
        this.mTestTagName = str;
    }

    public void setTop(int i) {
        this.mTop = i;
        this.mOriginTop = i;
        onLayoutUpdated();
    }

    public void setTransform(ReadableArray readableArray) {
        this.hasTransformChanged = true;
        List<C1313280kHO> listLIZLLL = C1313280kHO.LIZLLL(readableArray);
        this.mTransformRaw = listLIZLLL;
        float fLIZ = 0.0f;
        if (listLIZLLL != null && !listLIZLLL.isEmpty()) {
            for (C1313280kHO c1313280kHO : listLIZLLL) {
                int i = c1313280kHO.LIZ;
                if (i != 8) {
                    if (i == 16) {
                        fLIZ = c1313280kHO.LJII.LIZ();
                    }
                } else {
                    fLIZ = c1313280kHO.LIZJ.LIZ();
                }
            }
        }
        setTranslationZ(fLIZ);
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 instanceof UIShadowProxy) {
        }
    }

    @InterfaceC1312540kGC(name = "transform-origin")
    public void setTransformOrigin(ReadableArray readableArray) {
        C1314250kIx c1314250kIx;
        this.hasTransformChanged = true;
        C1314250kIx c1314250kIx2 = C1314250kIx.LJ;
        this.mTransformOrigin = c1314250kIx2;
        if (readableArray == null) {
            return;
        }
        if (readableArray.size() < 2) {
            c1314250kIx = null;
        } else {
            c1314250kIx = new C1314250kIx(readableArray);
        }
        this.mTransformOrigin = c1314250kIx;
        if (c1314250kIx == null) {
            LynxLog.e("LynxBaseUI", "transform params error.");
            this.mTransformOrigin = c1314250kIx2;
        }
    }

    public void setTranslationZ(float f) {
        this.mTranslationZ = f;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "user-interaction-enabled")
    public void setUserInteractionEnabled(boolean z) {
        this.userInteractionEnabled = z;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        onLayoutUpdated();
    }

    @Override // X.InterfaceC1311410kEN
    public void startEventBubble(long j) {
        C1298720jtu c1298720jtu;
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            c1298720jtu.LJII(j);
        }
    }

    @Override // X.InterfaceC1311410kEN
    public void startEventCapture(long j) {
        C1298720jtu c1298720jtu;
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            c1298720jtu.LJIIIIZZ(j);
        }
    }

    public void unRegisterScrollStateListener(InterfaceC1314870kJx interfaceC1314870kJx) {
        boolean zIsEmpty;
        if (interfaceC1314870kJx != null && this.mStateChangeListeners != null) {
            synchronized (this) {
                try {
                    this.mStateChangeListeners.remove(interfaceC1314870kJx);
                    zIsEmpty = this.mStateChangeListeners.isEmpty();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (zIsEmpty) {
                InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
                if (interfaceC1313090kH5 instanceof LynxBaseUI) {
                    ((LynxBaseUI) interfaceC1313090kH5).unRegisterScrollStateListener(this.mScrollStateChangeListener);
                }
            }
        }
    }

    public void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        updateLayoutInfo(lynxBaseUI.getLeft(), lynxBaseUI.getTop(), lynxBaseUI.getWidth(), lynxBaseUI.getHeight(), lynxBaseUI.mPaddingLeft, lynxBaseUI.mPaddingTop, lynxBaseUI.mPaddingRight, lynxBaseUI.mPaddingBottom, lynxBaseUI.mMarginLeft, lynxBaseUI.mMarginTop, lynxBaseUI.mMarginRight, lynxBaseUI.mMarginBottom, lynxBaseUI.mBorderLeftWidth, lynxBaseUI.mBorderTopWidth, lynxBaseUI.mBorderRightWidth, lynxBaseUI.mBorderBottomWidth, lynxBaseUI.getBound());
        this.mOriginLeft = lynxBaseUI.getOriginLeft();
        this.mOriginTop = lynxBaseUI.getOriginTop();
    }

    public void updateMaxHeight(float f) {
        this.mMaxHeight = f;
    }

    public final void updateProperties(C1311730kEt c1311730kEt) {
        updatePropertiesInterval(c1311730kEt);
        afterPropsUpdated(c1311730kEt);
    }

    public void updatePropertiesInterval(C1311730kEt c1311730kEt) {
        C1313250kHL orCreateUIPaintStyles;
        if (c1311730kEt != null && !c1311730kEt.LJIIIZ()) {
            this.mProps.merge(c1311730kEt.LIZ);
            LynxUISetter lynxUISetterLIZIZ = PropsUpdater.LIZIZ(getClass());
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = c1311730kEt.LIZ.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                try {
                    lynxUISetterLIZIZ.LIZ(this, strNextKey, c1311730kEt);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error while updating property '");
                    sbLIZ.append(strNextKey);
                    sbLIZ.append("' in ui '");
                    sbLIZ.append(getTagName());
                    sbLIZ.append("': ");
                    sbLIZ.append(th);
                    LynxError lynxError = new LynxError(130100, C2188811AlT.LIZIZ(sbLIZ), "", "error");
                    lynxError.LJII(CallStackUtil.getStackTraceStringWithLineTrimmed(th));
                    JSONObject platformCustomInfo = getPlatformCustomInfo();
                    lynxError.LJI = null;
                    lynxError.LJ = platformCustomInfo;
                    this.mContext.LJIILLIIL(lynxError);
                }
            }
            InterfaceC1312870kGj interfaceC1312870kGj = c1311730kEt.LIZIZ;
            if (interfaceC1312870kGj != null && (orCreateUIPaintStyles = getOrCreateUIPaintStyles()) != null) {
                for (InterfaceC1312510kG9 interfaceC1312510kG9 : interfaceC1312870kGj) {
                    int key = interfaceC1312510kG9.getKey();
                    if (key != 5) {
                        if (key != 7) {
                            if (key != 76) {
                                if (key != 77) {
                                    if (key != 120) {
                                        if (key != 121) {
                                            if (key != 129) {
                                                if (key != 130) {
                                                    if (key != 142) {
                                                        if (key != 143) {
                                                            switch (key) {
                                                                case 7:
                                                                    break;
                                                                case 8:
                                                                    int iLJFF = interfaceC1312510kG9.LJFF();
                                                                    setBorderColor(1, Integer.valueOf(iLJFF));
                                                                    orCreateUIPaintStyles.LJJIIJ = Integer.valueOf(iLJFF);
                                                                    continue;
                                                                case BdTuring.TYPE_ECAF /* 9 */:
                                                                    int iLJFF2 = interfaceC1312510kG9.LJFF();
                                                                    setBorderColor(2, Integer.valueOf(iLJFF2));
                                                                    orCreateUIPaintStyles.LJJIIJZLJL = Integer.valueOf(iLJFF2);
                                                                    continue;
                                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                                    int iLJFF3 = interfaceC1312510kG9.LJFF();
                                                                    setBorderColor(3, Integer.valueOf(iLJFF3));
                                                                    orCreateUIPaintStyles.LJJIIZ = Integer.valueOf(iLJFF3);
                                                                    continue;
                                                                case BdTuring.TYPE_EMAIL /* 11 */:
                                                                    int iLJFF4 = interfaceC1312510kG9.LJFF();
                                                                    setBorderColor(4, Integer.valueOf(iLJFF4));
                                                                    orCreateUIPaintStyles.LJJIIZI = Integer.valueOf(iLJFF4);
                                                                    continue;
                                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                                    C1312880kGk c1312880kGk = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                    setBorderRadius(0, c1312880kGk);
                                                                    orCreateUIPaintStyles.LJIILIIL = c1312880kGk;
                                                                    continue;
                                                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                                    C1312880kGk c1312880kGk2 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                    setBorderRadius(1, c1312880kGk2);
                                                                    orCreateUIPaintStyles.LJIILJJIL = c1312880kGk2;
                                                                    continue;
                                                                case 14:
                                                                    C1312880kGk c1312880kGk3 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                    setBorderRadius(4, c1312880kGk3);
                                                                    orCreateUIPaintStyles.LJIIZILJ = c1312880kGk3;
                                                                    continue;
                                                                case 15:
                                                                    C1312880kGk c1312880kGk4 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                    setBorderRadius(2, c1312880kGk4);
                                                                    orCreateUIPaintStyles.LJIILL = c1312880kGk4;
                                                                    continue;
                                                                case 16:
                                                                    C1312880kGk c1312880kGk5 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                    setBorderRadius(3, c1312880kGk5);
                                                                    orCreateUIPaintStyles.LJIILLIIL = c1312880kGk5;
                                                                    continue;
                                                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                                    int iLIZ = (int) interfaceC1312510kG9.LIZ();
                                                                    setBorderWidth(0, iLIZ);
                                                                    orCreateUIPaintStyles.LJJ = iLIZ;
                                                                    continue;
                                                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                                    int iLIZ2 = (int) interfaceC1312510kG9.LIZ();
                                                                    setBorderWidth(1, iLIZ2);
                                                                    orCreateUIPaintStyles.LJJI = iLIZ2;
                                                                    continue;
                                                                case 19:
                                                                    int iLIZ3 = (int) interfaceC1312510kG9.LIZ();
                                                                    setBorderWidth(2, iLIZ3);
                                                                    orCreateUIPaintStyles.LJJIFFI = iLIZ3;
                                                                    continue;
                                                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                                    int iLIZ4 = (int) interfaceC1312510kG9.LIZ();
                                                                    setBorderWidth(3, iLIZ4);
                                                                    orCreateUIPaintStyles.LJJII = iLIZ4;
                                                                    continue;
                                                                case 21:
                                                                    int iLIZ5 = (int) interfaceC1312510kG9.LIZ();
                                                                    setBorderWidth(4, iLIZ5);
                                                                    orCreateUIPaintStyles.LJJIII = iLIZ5;
                                                                    continue;
                                                                default:
                                                                    switch (key) {
                                                                        case 23:
                                                                            if (this instanceof LynxUI) {
                                                                                float fLJFF = interfaceC1312510kG9.LJFF();
                                                                                setAlpha(fLJFF);
                                                                                orCreateUIPaintStyles.LJJLI = fLJFF;
                                                                            }
                                                                            break;
                                                                        case 25:
                                                                            int iLJFF5 = interfaceC1312510kG9.LJFF();
                                                                            setOverflow(iLJFF5);
                                                                            orCreateUIPaintStyles.LJJIJ = Integer.valueOf(iLJFF5);
                                                                            break;
                                                                        case 47:
                                                                            float fLJFF2 = interfaceC1312510kG9.LJFF();
                                                                            setFontSize(fLJFF2);
                                                                            orCreateUIPaintStyles.LJJIL = fLJFF2;
                                                                            break;
                                                                        case 63:
                                                                            if (this instanceof LynxUI) {
                                                                                C1312880kGk c1312880kGk6 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                setTransform(c1312880kGk6);
                                                                                orCreateUIPaintStyles.LJJJJ = c1312880kGk6;
                                                                            }
                                                                            break;
                                                                        case 74:
                                                                            int iLJFF6 = interfaceC1312510kG9.LJFF();
                                                                            setBorderStyle(0, iLJFF6);
                                                                            orCreateUIPaintStyles.LJIJ = iLJFF6;
                                                                            break;
                                                                        case 104:
                                                                            if (this instanceof LynxUI) {
                                                                                int iLJFF7 = interfaceC1312510kG9.LJFF();
                                                                                ((LynxUI) this).setVisibility(iLJFF7);
                                                                                orCreateUIPaintStyles.LJJLIIIIJ = iLJFF7;
                                                                            }
                                                                            break;
                                                                        case 123:
                                                                            C1312880kGk c1312880kGk7 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                            setBackgroundClip(c1312880kGk7);
                                                                            orCreateUIPaintStyles.LIZ = c1312880kGk7;
                                                                            break;
                                                                        case 147:
                                                                            if (this instanceof UIComponent) {
                                                                                ((UIComponent) this).setZIndex(interfaceC1312510kG9.LJFF());
                                                                            }
                                                                            break;
                                                                        case 170:
                                                                            C1312880kGk c1312880kGk8 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                            setMaskImage(c1312880kGk8);
                                                                            orCreateUIPaintStyles.LJII = c1312880kGk8;
                                                                            break;
                                                                        case 190:
                                                                            C1312880kGk c1312880kGk9 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                            setPerspective(c1312880kGk9);
                                                                            orCreateUIPaintStyles.LJJJI = c1312880kGk9;
                                                                            break;
                                                                        case 193:
                                                                            if (this instanceof LynxUI) {
                                                                                C1312880kGk c1312880kGk10 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                ((LynxUI) this).setClipPath(c1312880kGk10);
                                                                                orCreateUIPaintStyles.LJJJJIZL = c1312880kGk10;
                                                                            }
                                                                            break;
                                                                        case 208:
                                                                            int iLJFF8 = interfaceC1312510kG9.LJFF();
                                                                            setImageRendering(iLJFF8);
                                                                            orCreateUIPaintStyles.LJJJJI = iLJFF8;
                                                                            continue;
                                                                        default:
                                                                            switch (key) {
                                                                                case 200:
                                                                                    C1312880kGk c1312880kGk11 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                    setMaskRepeat(c1312880kGk11);
                                                                                    orCreateUIPaintStyles.LJIIIZ = c1312880kGk11;
                                                                                    break;
                                                                                case 201:
                                                                                    C1312880kGk c1312880kGk12 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                    setMaskPosition(c1312880kGk12);
                                                                                    orCreateUIPaintStyles.LJIIJJI = c1312880kGk12;
                                                                                    break;
                                                                                case 202:
                                                                                    C1312880kGk c1312880kGk13 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                    setMaskClip(c1312880kGk13);
                                                                                    orCreateUIPaintStyles.LJIIL = c1312880kGk13;
                                                                                    break;
                                                                                case 203:
                                                                                    C1312880kGk c1312880kGk14 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                    setMaskOrigin(c1312880kGk14);
                                                                                    orCreateUIPaintStyles.LJIIIIZZ = c1312880kGk14;
                                                                                    break;
                                                                                case 204:
                                                                                    C1312880kGk c1312880kGk15 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                    setMaskSize(c1312880kGk15);
                                                                                    orCreateUIPaintStyles.LJIIJ = c1312880kGk15;
                                                                                    break;
                                                                                default:
                                                                                    switch (key) {
                                                                                        case 83:
                                                                                            if (this instanceof LynxUI) {
                                                                                                double dLIZ = interfaceC1312510kG9.LIZ();
                                                                                                ((LynxUI) this).setLayoutAnimationCreateDuration(dLIZ);
                                                                                                orCreateUIPaintStyles.LJJJJL = dLIZ;
                                                                                            }
                                                                                            break;
                                                                                        case 84:
                                                                                            if (this instanceof LynxUI) {
                                                                                                C1312880kGk c1312880kGk16 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                                ((LynxUI) this).setLayoutAnimationCreateTimingFunc(c1312880kGk16);
                                                                                                orCreateUIPaintStyles.LJJJJLL = c1312880kGk16;
                                                                                            }
                                                                                            break;
                                                                                        case 85:
                                                                                            if (this instanceof LynxUI) {
                                                                                                double dLIZ2 = interfaceC1312510kG9.LIZ();
                                                                                                ((LynxUI) this).setLayoutAnimationCreateDelay(dLIZ2);
                                                                                                orCreateUIPaintStyles.LJJJJJL = dLIZ2;
                                                                                            }
                                                                                            break;
                                                                                        case 86:
                                                                                            if (this instanceof LynxUI) {
                                                                                                int iLJFF9 = interfaceC1312510kG9.LJFF();
                                                                                                ((LynxUI) this).setLayoutAnimationCreateProperty(iLJFF9);
                                                                                                orCreateUIPaintStyles.LJJJJLI = iLJFF9;
                                                                                            }
                                                                                            break;
                                                                                        case 87:
                                                                                            if (this instanceof LynxUI) {
                                                                                                double dLIZ3 = interfaceC1312510kG9.LIZ();
                                                                                                ((LynxUI) this).setLayoutAnimationDeleteDuration(dLIZ3);
                                                                                                orCreateUIPaintStyles.LJJJJZI = dLIZ3;
                                                                                            }
                                                                                            break;
                                                                                        case 88:
                                                                                            if (this instanceof LynxUI) {
                                                                                                C1312880kGk c1312880kGk17 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                                ((LynxUI) this).setLayoutAnimationDeleteTimingFunc(c1312880kGk17);
                                                                                                orCreateUIPaintStyles.LJJJLL = c1312880kGk17;
                                                                                            }
                                                                                            break;
                                                                                        case 89:
                                                                                            if (this instanceof LynxUI) {
                                                                                                double dLIZ4 = interfaceC1312510kG9.LIZ();
                                                                                                ((LynxUI) this).setLayoutAnimationDeleteDelay(dLIZ4);
                                                                                                orCreateUIPaintStyles.LJJJJZ = dLIZ4;
                                                                                            }
                                                                                            break;
                                                                                        case 90:
                                                                                            if (this instanceof LynxUI) {
                                                                                                int iLJFF10 = interfaceC1312510kG9.LJFF();
                                                                                                ((LynxUI) this).setLayoutAnimationDeleteProperty(iLJFF10);
                                                                                                orCreateUIPaintStyles.LJJJLIIL = iLJFF10;
                                                                                            }
                                                                                            break;
                                                                                        case 91:
                                                                                            if (this instanceof LynxUI) {
                                                                                                double dLIZ5 = interfaceC1312510kG9.LIZ();
                                                                                                ((LynxUI) this).setLayoutAnimationUpdateDuration(dLIZ5);
                                                                                                orCreateUIPaintStyles.LJJJZ = dLIZ5;
                                                                                            }
                                                                                            break;
                                                                                        case 92:
                                                                                            if (this instanceof LynxUI) {
                                                                                                C1312880kGk c1312880kGk18 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                                ((LynxUI) this).setLayoutAnimationUpdateTimingFunc(c1312880kGk18);
                                                                                                orCreateUIPaintStyles.LJJL = c1312880kGk18;
                                                                                            }
                                                                                            break;
                                                                                        case 93:
                                                                                            if (this instanceof LynxUI) {
                                                                                                double dLIZ6 = interfaceC1312510kG9.LIZ();
                                                                                                ((LynxUI) this).setLayoutAnimationUpdateDelay(dLIZ6);
                                                                                                orCreateUIPaintStyles.LJJJLZIJ = dLIZ6;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            switch (key) {
                                                                                                case 98:
                                                                                                    C1312880kGk c1312880kGk19 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                                    setBackgroundImage(c1312880kGk19);
                                                                                                    orCreateUIPaintStyles.LIZJ = c1312880kGk19;
                                                                                                    break;
                                                                                                case 99:
                                                                                                    C1312880kGk c1312880kGk20 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                                    setBackgroundPosition(c1312880kGk20);
                                                                                                    orCreateUIPaintStyles.LJ = c1312880kGk20;
                                                                                                    break;
                                                                                                case 100:
                                                                                                    C1312880kGk c1312880kGk21 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                                    setBackgroundOrigin(c1312880kGk21);
                                                                                                    orCreateUIPaintStyles.LIZLLL = c1312880kGk21;
                                                                                                    break;
                                                                                                case 101:
                                                                                                    C1312880kGk c1312880kGk22 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                                    setBackgroundRepeat(c1312880kGk22);
                                                                                                    orCreateUIPaintStyles.LJFF = c1312880kGk22;
                                                                                                    break;
                                                                                                case 102:
                                                                                                    C1312880kGk c1312880kGk23 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                                    setBackgroundSize(c1312880kGk23);
                                                                                                    orCreateUIPaintStyles.LJI = c1312880kGk23;
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (key) {
                                                                                                        case 115:
                                                                                                            int iLJFF11 = interfaceC1312510kG9.LJFF();
                                                                                                            setBorderStyle(1, iLJFF11);
                                                                                                            orCreateUIPaintStyles.LJIJI = iLJFF11;
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            int iLJFF12 = interfaceC1312510kG9.LJFF();
                                                                                                            setBorderStyle(2, iLJFF12);
                                                                                                            orCreateUIPaintStyles.LJIJJ = iLJFF12;
                                                                                                            break;
                                                                                                        case 117:
                                                                                                            int iLJFF13 = interfaceC1312510kG9.LJFF();
                                                                                                            setBorderStyle(3, iLJFF13);
                                                                                                            orCreateUIPaintStyles.LJIJJLI = iLJFF13;
                                                                                                            break;
                                                                                                        case 118:
                                                                                                            int iLJFF14 = interfaceC1312510kG9.LJFF();
                                                                                                            setBorderStyle(4, iLJFF14);
                                                                                                            orCreateUIPaintStyles.LJIL = iLJFF14;
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (key) {
                                                                                                                case 125:
                                                                                                                    int iLJFF15 = interfaceC1312510kG9.LJFF();
                                                                                                                    setOutlineColor(interfaceC1312510kG9.LJFF());
                                                                                                                    orCreateUIPaintStyles.LJJIJIL = iLJFF15;
                                                                                                                    break;
                                                                                                                case 126:
                                                                                                                    int iLJFF16 = interfaceC1312510kG9.LJFF();
                                                                                                                    setOutlineStyle(iLJFF16);
                                                                                                                    orCreateUIPaintStyles.LJJIJLIJ = iLJFF16;
                                                                                                                    break;
                                                                                                                case 127:
                                                                                                                    float fLIZ = (float) interfaceC1312510kG9.LIZ();
                                                                                                                    setOutlineWidth(fLIZ);
                                                                                                                    orCreateUIPaintStyles.LJJIJL = fLIZ;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (key) {
                                                                                                                        case 186:
                                                                                                                            if (this instanceof LynxUI) {
                                                                                                                                C1312880kGk c1312880kGk24 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                                                                                                                ((LynxUI) this).setFilter(c1312880kGk24);
                                                                                                                                orCreateUIPaintStyles.LJJJJJ = c1312880kGk24;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 187:
                                                                                                                            if (this instanceof AbsLynxList) {
                                                                                                                                ((AbsLynxList) this).setMainAxisGap((float) interfaceC1312510kG9.LIZ());
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 188:
                                                                                                                            if (this instanceof AbsLynxList) {
                                                                                                                                ((AbsLynxList) this).setCrossAxisGap((float) interfaceC1312510kG9.LIZ());
                                                                                                                            }
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                        } else if (this instanceof LynxUI) {
                                                            ((LynxUI) this).setExitTransitionName(new C1312880kGk(interfaceC1312510kG9.LIZIZ()));
                                                        }
                                                    } else if (this instanceof LynxUI) {
                                                        ((LynxUI) this).setEnterTransitionName(new C1312880kGk(interfaceC1312510kG9.LIZIZ()));
                                                    }
                                                } else {
                                                    int iLJFF17 = interfaceC1312510kG9.LJFF();
                                                    setLynxDirection(iLJFF17);
                                                    orCreateUIPaintStyles.LJJIZ = iLJFF17;
                                                }
                                            } else {
                                                setCaretColor(interfaceC1312510kG9.getString());
                                            }
                                        } else {
                                            int iLJFF18 = interfaceC1312510kG9.LJFF();
                                            setOverflowY(Integer.valueOf(iLJFF18));
                                            orCreateUIPaintStyles.LJJIJIIJIL = Integer.valueOf(iLJFF18);
                                        }
                                    } else {
                                        int iLJFF19 = interfaceC1312510kG9.LJFF();
                                        setOverflowX(Integer.valueOf(iLJFF19));
                                        orCreateUIPaintStyles.LJJIJIIJI = Integer.valueOf(iLJFF19);
                                    }
                                } else {
                                    C1312880kGk c1312880kGk25 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                    setTransformOrigin(c1312880kGk25);
                                    orCreateUIPaintStyles.LJJJ = c1312880kGk25;
                                }
                            } else {
                                C1312880kGk c1312880kGk26 = new C1312880kGk(interfaceC1312510kG9.LIZIZ());
                                setBoxShadow(c1312880kGk26);
                                orCreateUIPaintStyles.LJJJIL = c1312880kGk26;
                            }
                        }
                        int iLJFF20 = interfaceC1312510kG9.LJFF();
                        setBackgroundColor(iLJFF20);
                        orCreateUIPaintStyles.LIZIZ = iLJFF20;
                    } else {
                        setCSSPosition(interfaceC1312510kG9.LJFF());
                    }
                }
            }
        }
    }

    public void updateSticky(float[] fArr) {
        C1310290kCZ c1310290kCZ;
        s sVar = this.mContext;
        if (sVar != null && (c1310290kCZ = sVar.LLLIIII) != null && c1310290kCZ.LJJJI) {
            updateNewSticky(fArr);
            return;
        }
        if (fArr != null && fArr.length >= 4) {
            Sticky sticky = new Sticky();
            this.mSticky = sticky;
            ((RectF) sticky).left = fArr[0];
            ((RectF) sticky).top = fArr[1];
            ((RectF) sticky).right = fArr[2];
            ((RectF) sticky).bottom = fArr[3];
            sticky.LLILLJJLI = 0.0f;
            sticky.LL = 0.0f;
            InterfaceC1311410kEN parentBaseUI = getParentBaseUI();
            if (!(parentBaseUI instanceof InterfaceC1314580kJU)) {
                return;
            }
            ((InterfaceC1314580kJU) parentBaseUI).LJJIII();
            return;
        }
        this.mSticky = null;
    }

    public LynxBaseUI(s sVar) {
        this(sVar, null);
    }

    public void setBorderColor(Integer num) {
        setBorderColorForAllSpacingIndex(num);
    }

    public void setOverflow(int i) {
        setOverflowWithMask((short) 3, i);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0kJB] */
    public LynxBaseUI(s sVar, Object obj) {
        this.mChildren = new ArrayList();
        this.mProps = new JavaOnlyMap();
        this.mIncludeNativeGesture = false;
        this.mDataset = new JavaOnlyMap();
        this.mNodeIndex = 0;
        this.mNodeReadyBlockArray = new ArrayList<>();
        this.mHasRadius = false;
        this.mSkipLayoutUpdated = false;
        this.mOverflow = 0;
        this.mClipToRadius = false;
        this.mFocusable = false;
        EnumC1311650kEl enumC1311650kEl = EnumC1311650kEl.Undefined;
        this.mIgnoreFocus = enumC1311650kEl;
        this.mPerspective = null;
        this.mPrePerspectiveValue = 0.0f;
        this.hasTransformChanged = false;
        this.userInteractionEnabled = true;
        this.nativeInteractionEnabled = false;
        this.mSticky = null;
        this.mStickyScrollerSign = -1;
        this.mMaxHeight = -1.0f;
        this.mBackgroundColor = 0;
        this.mEnableExposureUIMargin = null;
        this.mEnableExposureUIClip = enumC1311650kEl;
        this.mIsDetachedWithView = false;
        this.mNeedsBackgroundRecreation = false;
        this.mAlpha = 1.0f;
        this.mSkewX = 0.0f;
        this.mSkewY = 0.0f;
        this.mShouldAttachChildrenView = false;
        this.mExtraOffsetX = 0.0f;
        this.mExtraOffsetY = 0.0f;
        this.mAccessibilityLabel = "";
        this.mAccessibilityId = "";
        this.mAccessibilityElementStatus = -1;
        this.mAccessibilityEnableTap = false;
        this.mAccessibilityKeepFocused = false;
        this.mConsumeHoverEvent = false;
        this.mAccessibilityTraits = EnumC1319630kRd.NONE;
        this.mDrawableCallback = new Drawable.Callback() { // from class: X.0kJB
            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable drawable) {
                this.LL.invalidate();
            }
        };
        this.mBitmapConfig = null;
        this.mCSSPosition = 1;
        this.mTouchSlop = 8.0f;
        this.mOnResponseChain = false;
        this.mBlockNativeEvent = false;
        this.mBlockNativeEventAreas = null;
        this.mEventThrough = enumC1311650kEl;
        this.mEventThroughActiveRegions = null;
        this.mPointerEvents = EnumC1311640kEk.Unset;
        this.mPanInterceptDirection = EnumC1311610kEh.None;
        this.mPanInterceptScope = EnumC1314040kIc.None;
        this.mFlattenChildrenCount = 0;
        this.mNeedSortChildren = false;
        this.mLastTranslateZ = 0.0f;
        this.mEnableTouchPseudoPropagation = true;
        this.mTransformMatrix = new Matrix();
        this.mHitTestMatrix = new Matrix();
        this.mConsumeSlideEventAngles = null;
        this.mBlockListEvent = false;
        this.mOffsetDescendantRectToLynxView = new WeakReference<>(null);
        this.mUseLocalCache = null;
        this.mSkipRedirection = false;
        this.mDisableDefaultResize = false;
        this.mImageRendering = -1;
        this.mBoundingClientRectCallbacks = new ArrayList<>();
        this.mIsFirstAnimatedReady = true;
        this.mHasTranslateDiff = false;
        this.mLynxDirection = 3;
        this.mContext = sVar;
        this.mParam = obj;
        C1313270kHN c1313270kHN = new C1313270kHN(sVar);
        this.mLynxBackground = c1313270kHN;
        c1313270kHN.LIZJ = this.mDrawableCallback;
        float fLIZIZ = C1311130kDv.LIZIZ(14.0f, sVar.LLJJJ.density);
        this.mFontSize = fLIZIZ;
        this.mLynxBackground.LIZLLL = fLIZIZ;
        this.mLatestSize = new Point();
        this.mLastSize = new Point();
        initialize();
    }

    @InterfaceC1967107nB
    public void boundingClientRect(ReadableMap readableMap, Callback callback) {
        C1311720kEs c1311720kEsLJIILIIL = this.mContext.LJIILIIL();
        if (c1311720kEsLJIILIIL == null) {
            boundingClientRectInner(readableMap, callback);
            return;
        }
        UIBody uIBody = c1311720kEsLJIILIIL.LIZIZ;
        if (uIBody == null) {
            boundingClientRectInner(readableMap, callback);
            return;
        }
        T t = uIBody.mView;
        if (t == 0) {
            boundingClientRectInner(readableMap, callback);
        } else if (!t.isLayoutRequested()) {
            boundingClientRectInner(readableMap, callback);
        } else {
            this.mContext.LJIILIIL().LJII.add(this);
            this.mBoundingClientRectCallbacks.add(new ARunnableS53S0300000_20(readableMap, callback, this, 5));
        }
    }

    public void boundingClientRectInner(ReadableMap readableMap, Callback callback) {
        RectF rectFLJFF = C1292490jjr.LJFF(this, readableMap);
        float f = this.mContext.LLJJJ.density;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString(FollowStatusChangeMethod.PARAM_UID, getIdSelector());
        javaOnlyMap.putMap("dataset", (WritableMap) getDataset());
        javaOnlyMap.putDouble("left", rectFLJFF.left / f);
        javaOnlyMap.putDouble("top", rectFLJFF.top / f);
        javaOnlyMap.putDouble("right", rectFLJFF.right / f);
        javaOnlyMap.putDouble("bottom", rectFLJFF.bottom / f);
        javaOnlyMap.putDouble("width", rectFLJFF.width() / f);
        javaOnlyMap.putDouble("height", rectFLJFF.height() / f);
        callback.invoke(0, javaOnlyMap);
    }

    public boolean checkStickyOnParentScroll(int i, int i2) {
        if (this.mSticky == null) {
            return false;
        }
        float left = getLeft() - i;
        float top = getTop() - i2;
        Sticky sticky = this.mSticky;
        float f = ((RectF) sticky).left;
        if (left < f) {
            sticky.LL = f - left;
        } else {
            if (getParentBaseUI() == null) {
                LynxLog.e("LynxBaseUI", "checkStickyOnParentScroll failed, parent is null.");
                return false;
            }
            int width = getParentBaseUI().getWidth();
            float width2 = getWidth() + left;
            Sticky sticky2 = this.mSticky;
            float f2 = ((RectF) sticky2).right;
            float f3 = width;
            if (width2 + f2 > f3) {
                sticky2.LL = Math.max((f3 - width2) - f2, ((RectF) sticky2).left - left);
            } else {
                sticky2.LL = 0.0f;
            }
        }
        Sticky sticky3 = this.mSticky;
        float f4 = ((RectF) sticky3).top;
        if (top < f4) {
            sticky3.LLILLJJLI = f4 - top;
            return true;
        }
        if (getParentBaseUI() == null) {
            LynxLog.e("LynxBaseUI", "checkStickyOnParentScroll failed, parent is null.");
            return false;
        }
        int height = getParentBaseUI().getHeight();
        float height2 = getHeight() + top;
        Sticky sticky4 = this.mSticky;
        float f5 = ((RectF) sticky4).bottom;
        float f6 = height;
        if (height2 + f5 > f6) {
            sticky4.LLILLJJLI = Math.max((f6 - height2) - f5, ((RectF) sticky4).top - top);
            return true;
        }
        sticky4.LLILLJJLI = 0.0f;
        return true;
    }

    public boolean childrenContainPoint(float f, float f2) {
        return childrenContainPoint(f, f2, false);
    }

    @Override // X.InterfaceC1314880kJy
    public void consumeGesture(int i, ReadableMap readableMap) {
        if (isEnableNewGesture() && readableMap != null) {
            boolean z = readableMap.getBoolean("inner", true);
            boolean z2 = readableMap.getBoolean("consume", true);
            if (z) {
                consumeGesture(z2);
            } else {
                interceptGesture(z2);
            }
        }
    }

    public boolean containsPoint(float f, float f2) {
        return containsPoint(f, f2, false);
    }

    public C1310110kCH convertToMeaningfulPaintingArea(int i, int i2) {
        if (!needGenerateMeaningfulPaintingArea()) {
            return null;
        }
        C1310110kCH c1310110kCH = new C1310110kCH(i, i2, getWidth(), getHeight());
        getAlpha();
        getScaleX();
        getScaleY();
        c1310110kCH.LJ = getMeaningfulContentStatus();
        c1310110kCH.LJFF = getFirstMeaningfulContentPresentedTimestampMicros();
        return c1310110kCH;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean eventThrough(float r11, float r12) {
        /*
            r10 = this;
            X.0kEl r1 = r10.mEventThrough
            X.0kEl r0 = X.EnumC1311650kEl.Enable
            r5 = 1
            r4 = 0
            if (r1 != r0) goto Le
            r9 = 1
        L9:
            java.util.ArrayList<java.util.ArrayList<X.0kKI>> r0 = r10.mEventThroughActiveRegions
            if (r0 != 0) goto L4d
            return r9
        Le:
            X.0kEl r0 = X.EnumC1311650kEl.Disable
            if (r1 == r0) goto L4b
            X.0kEN r0 = r10.parent()
            if (r0 == 0) goto L4b
            X.0kEN r3 = r10.parent()
            boolean r0 = r3 instanceof com.lynx.tasm.behavior.ui.UIBody
            if (r0 != 0) goto L4b
            boolean r0 = r3 instanceof com.lynx.tasm.behavior.ui.LynxBaseUI
            if (r0 == 0) goto L48
            r7 = r3
            com.lynx.tasm.behavior.ui.LynxBaseUI r7 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r7
            android.graphics.RectF r6 = new android.graphics.RectF
            int r0 = r7.getWidth()
            float r2 = (float) r0
            int r0 = r7.getHeight()
            float r1 = (float) r0
            r0 = 0
            r6.<init>(r0, r0, r2, r1)
            android.graphics.RectF r2 = X.C1292490jjr.LIZJ(r10, r7, r6)
            float r0 = r2.left
            float r1 = r11 - r0
            float r0 = r2.top
            float r0 = r12 - r0
        L43:
            boolean r9 = r3.eventThrough(r1, r0)
            goto L9
        L48:
            r1 = r11
            r0 = r12
            goto L43
        L4b:
            r9 = 0
            goto L9
        L4d:
            r3 = 0
        L4e:
            java.util.ArrayList<java.util.ArrayList<X.0kKI>> r0 = r10.mEventThroughActiveRegions
            int r0 = r0.size()
            if (r3 >= r0) goto Lba
            java.util.ArrayList<java.util.ArrayList<X.0kKI>> r0 = r10.mEventThroughActiveRegions
            java.lang.Object r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto Lb7
            int r1 = r7.size()
            r0 = 4
            if (r1 != r0) goto Lb7
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r4)
            X.0kKI r1 = (X.C1315080kKI) r1
            int r0 = r10.mWidth
            float r0 = (float) r0
            float r8 = r1.LIZ(r0)
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r5)
            X.0kKI r1 = (X.C1315080kKI) r1
            int r0 = r10.mHeight
            float r0 = (float) r0
            float r6 = r1.LIZ(r0)
            r0 = 2
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r0)
            X.0kKI r1 = (X.C1315080kKI) r1
            int r0 = r10.mWidth
            float r0 = (float) r0
            float r2 = r1.LIZ(r0)
            float r2 = r2 + r8
            r0 = 3
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r0)
            X.0kKI r1 = (X.C1315080kKI) r1
            int r0 = r10.mHeight
            float r0 = (float) r0
            float r1 = r1.LIZ(r0)
            float r1 = r1 + r6
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 < 0) goto Lb7
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lb7
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 < 0) goto Lb7
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb7
            java.lang.String r1 = "LynxBaseUI"
            java.lang.String r0 = "hit the event through active regions!"
            com.lynx.base.log.LynxLog.i(r1, r0)
            return r9
        Lb7:
            int r3 = r3 + 1
            goto L4e
        Lba:
            if (r9 == 0) goto Lbe
            r5 = 0
            return r5
        Lbe:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxBaseUI.eventThrough(float, float):boolean");
    }

    @InterfaceC1967107nB
    public void fetchAccessibilityTargets(ReadableMap readableMap, Callback callback) {
        if (this.mContext.LJIIL() != null) {
            C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
            if (!c1310360kCgLJIIL.LJ() && !c1310360kCgLJIIL.LJFF()) {
                callback.invoke(1, "fetch accessibility targets fail!");
                return;
            }
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            C1310360kCg.LJI(this, false, javaOnlyArray);
            callback.invoke(0, javaOnlyArray);
        }
    }

    public InterfaceC1311410kEN hitTest(float f, float f2) {
        return hitTest(f, f2, false);
    }

    @InterfaceC1967107nB
    public void innerText(ReadableMap readableMap, Callback callback) {
        if (this.mContext.LJIIL() != null) {
            C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
            if (!c1310360kCgLJIIL.LJ() && !c1310360kCgLJIIL.LJFF()) {
                callback.invoke(1, "fetch accessibility inner text fail!");
                return;
            }
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            C1310360kCg.LJI(this, true, javaOnlyArray);
            callback.invoke(0, javaOnlyArray);
        }
    }

    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        ListProtector.add(this.mChildren, i, lynxBaseUI);
        lynxBaseUI.setParent(this);
    }

    @Override // X.InterfaceC1311410kEN
    public void onEventBubble(boolean z, long j) {
        if (z) {
            if (getRootLynxPageUI() != null) {
                getRootLynxPageUI().startEventFire(false, j);
            }
        } else if (getParentLynxPageUI() != null) {
            getParentLynxPageUI().startEventBubble(j);
        } else {
            startEventFire(false, j);
        }
    }

    @Override // X.InterfaceC1311410kEN
    public void onEventCapture(boolean z, long j) {
        LynxBaseUI lynxBaseUI;
        C1298720jtu c1298720jtu;
        if (z) {
            if (getRootLynxPageUI() != null) {
                getRootLynxPageUI().startEventFire(false, j);
            }
        } else {
            if (getChildrenLynxPageUI() != null && (lynxBaseUI = (LynxBaseUI) getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this)))) != null) {
                s sVar = lynxBaseUI.mContext;
                if (sVar == null || (c1298720jtu = sVar.LLIZ) == null) {
                    return;
                }
                c1298720jtu.LJIIIIZZ(j);
                return;
            }
            startEventBubble(j);
        }
    }

    @Override // X.InterfaceC1311410kEN
    public void onEventFire(boolean z, long j) {
        LynxBaseUI lynxBaseUI;
        s sVar;
        C1298720jtu c1298720jtu;
        if (getChildrenLynxPageUI() != null && (lynxBaseUI = (LynxBaseUI) getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this)))) != null && (sVar = lynxBaseUI.mContext) != null && (c1298720jtu = sVar.LLIZ) != null) {
            c1298720jtu.LJIIIZ(z, j);
        }
    }

    public void onListCellAppear(String str, LynxBaseUI lynxBaseUI) {
        if (this.mBlockListEvent) {
            return;
        }
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().onListCellAppear(str, lynxBaseUI);
        }
    }

    public void onListCellPrepareForReuse(String str, LynxBaseUI lynxBaseUI) {
        if (this.mBlockListEvent) {
            return;
        }
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().onListCellPrepareForReuse(str, lynxBaseUI);
        }
    }

    @Override // X.InterfaceC1311410kEN
    public void onPseudoStatusChanged(int i, int i2) {
        this.mPseudoStatus = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r2.LIZJ(r1) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @X.InterfaceC1967107nB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void requestAccessibilityFocus(com.lynx.react.bridge.ReadableMap r9, com.lynx.react.bridge.Callback r10) {
        /*
            r8 = this;
            j27.s r0 = r8.mContext
            X.0kCg r0 = r0.LJIIL()
            if (r0 == 0) goto L26
            j27.s r0 = r8.mContext
            X.0kCg r7 = r0.LJIIL()
            boolean r0 = r7.LJIIJ()
            r6 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r3 = 2
            r4 = 0
            if (r0 != 0) goto L27
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r5
            java.lang.String r0 = "System accessibility is disable!"
            r1[r6] = r0
            r10.invoke(r1)
        L26:
            return
        L27:
            boolean r0 = r7.LJFF()
            if (r0 == 0) goto L5a
            X.0kEG r2 = r7.LJIILIIL
            r2.getClass()
            boolean r0 = r8 instanceof com.lynx.tasm.behavior.ui.LynxUI
            if (r0 == 0) goto L5a
            r1 = r8
            com.lynx.tasm.behavior.ui.LynxUI r1 = (com.lynx.tasm.behavior.ui.LynxUI) r1
            T extends android.view.View r0 = r1.mView
            if (r0 == 0) goto L5a
            boolean r0 = r2.LIZ(r8)
            if (r0 == 0) goto L5a
            T extends android.view.View r1 = r1.mView
            r0 = 128(0x80, float:1.8E-43)
            r1.sendAccessibilityEvent(r0)
        L4a:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r4] = r0
            java.lang.String r0 = "Accessibility element on focused"
            r1[r6] = r0
            r10.invoke(r1)
            return
        L5a:
            boolean r0 = r7.LJ()
            if (r0 == 0) goto L80
            X.0kQK r2 = r7.LJIIL
            boolean r0 = r2.LIZIZ()
            if (r0 == 0) goto L80
            X.0kQJ r0 = r2.LJ
            boolean r0 = r0.LJIIJ(r8)
            if (r0 == 0) goto L80
            X.0kQJ r0 = r2.LJ
            int r1 = r0.LJ(r8)
            r0 = -1
            if (r1 == r0) goto L80
            boolean r0 = r2.LIZJ(r1)
            if (r0 == 0) goto L80
            goto L4a
        L80:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r5
            java.lang.String r0 = "Request accessibility focus fail!"
            r1[r6] = r0
            r10.invoke(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxBaseUI.requestAccessibilityFocus(com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback):void");
    }

    @InterfaceC1967107nB
    public void requestUIInfo(ReadableMap readableMap, Callback callback) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (readableMap.getBoolean(strNextKey, false)) {
                    arrayList.add(strNextKey);
                }
            }
        }
        if (readableMap != null && readableMap.getBoolean("androidEnableTransformProps", false)) {
            z = true;
        } else {
            z = false;
        }
        JavaOnlyMap positionInfo = getPositionInfo(z);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (arrayList.contains(FollowStatusChangeMethod.PARAM_UID)) {
            javaOnlyMap.put(FollowStatusChangeMethod.PARAM_UID, getIdSelector());
        }
        if (arrayList.contains("dataset")) {
            javaOnlyMap.put("dataset", getDataset());
        }
        if (arrayList.contains("rect")) {
            javaOnlyMap.put("left", positionInfo.get("left"));
            javaOnlyMap.put("top", positionInfo.get("top"));
            javaOnlyMap.put("right", positionInfo.get("right"));
            javaOnlyMap.put("bottom", positionInfo.get("bottom"));
        }
        if (arrayList.contains("size")) {
            javaOnlyMap.put("width", positionInfo.get("width"));
            javaOnlyMap.put("height", positionInfo.get("height"));
        }
        if (arrayList.contains("scrollOffset")) {
            float f = this.mContext.LLJJJ.density;
            javaOnlyMap.put("scrollLeft", Float.valueOf(getScrollX() / f));
            javaOnlyMap.put("scrollTop", Float.valueOf(getScrollY() / f));
        }
        if (arrayList.contains("node")) {
            javaOnlyMap.put("node", new JavaOnlyMap());
        }
        callback.invoke(0, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public void scrollIntoView(ReadableMap readableMap, Callback callback) {
        String str;
        String str2;
        String str3;
        if (readableMap == null) {
            if (callback != null) {
                callback.invoke(4, "missing the param of `scrollIntoViewOptions`");
                return;
            }
            return;
        }
        HashMap map = (HashMap) readableMap.asHashMap().get("scrollIntoViewOptions");
        if (map == null) {
            callback.invoke(4, "missing the param of `scrollIntoViewOptions`");
            return;
        }
        if (map.containsKey("behavior")) {
            str = (String) map.get("behavior");
        } else {
            str = "auto";
        }
        if (map.containsKey("block")) {
            str2 = (String) map.get("block");
        } else {
            str2 = "start";
        }
        if (map.containsKey("inline")) {
            str3 = (String) map.get("inline");
        } else {
            str3 = "nearest";
        }
        scrollIntoView(str.equals("smooth"), str2, str3, callback);
    }

    @InterfaceC1312530kGB(customType = "Color", names = {"border-color", "border-left-color", "border-right-color", "border-top-color", "border-bottom-color"})
    public void setBorderColor(int i, Integer num) {
        ensureLynxBackground();
        this.mLynxBackground.LJIILL(SPACING_TYPES[i], num);
    }

    @InterfaceC1312530kGB(names = {"border-radius", "border-top-left-radius", "border-top-right-radius", "border-bottom-right-radius", "border-bottom-left-radius"})
    public void setBorderRadius(int i, ReadableArray readableArray) {
        ensureLynxBackground();
        this.mHasRadius = false;
        if (this.mLynxBackground.LJIILLIIL(i, readableArray)) {
            this.mHasRadius = true;
        }
        onBorderRadiusUpdated(i);
    }

    @InterfaceC1312530kGB(defaultInt = -1, names = {"border-style", "border-left-style", "border-right-style", "border-top-style", "border-bottom-style"})
    public void setBorderStyle(int i, int i2) {
        ensureLynxBackground();
        this.mLynxBackground.LJIJ(SPACING_TYPES[i], i2);
    }

    @InterfaceC1312530kGB(names = {"border-width", "border-left-width", "border-right-width", "border-top-width", "border-bottom-width"})
    public void setBorderWidth(int i, int i2) {
        ensureLynxBackground();
        this.mBorderSpacingIndex = i;
        this.mBorderWidth = i2;
        C1313270kHN c1313270kHN = this.mLynxBackground;
        int[] iArr = SPACING_TYPES;
        float f = i2;
        c1313270kHN.LIZIZ().LIZJ(f, iArr[i]);
        C1314270kIz c1314270kIz = this.mLynxMask;
        if (c1314270kIz != null) {
            c1314270kIz.LIZIZ().LIZJ(f, iArr[i]);
        }
    }

    @Override // X.InterfaceC1314880kJy
    public void setGestureDetectorState(int i, int i2) {
        C1311400kEM gestureArenaManager;
        Map<Integer, WeakReference<InterfaceC1311590kEf>> map;
        AbstractC1311530kEZ next;
        if (!isEnableNewGesture() || (gestureArenaManager = getGestureArenaManager()) == null) {
            return;
        }
        int gestureArenaMemberId = getGestureArenaMemberId();
        if (gestureArenaManager.LIZJ() && gestureArenaManager.LJII != null && (map = gestureArenaManager.LIZ) != null) {
            Reference reference = (Reference) ((HashMap) map).get(Integer.valueOf(gestureArenaMemberId));
            C1311390kEL c1311390kEL = gestureArenaManager.LJII;
            InterfaceC1311590kEf interfaceC1311590kEf = (InterfaceC1311590kEf) reference.get();
            c1311390kEL.getClass();
            if (interfaceC1311590kEf != null) {
                Map<Integer, AbstractC1311530kEZ> gestureHandlers = interfaceC1311590kEf.getGestureHandlers();
                if (gestureHandlers != null) {
                    Iterator<AbstractC1311530kEZ> it2 = gestureHandlers.values().iterator();
                    while (it2.hasNext()) {
                        next = it2.next();
                        if (next.LJ.LIZ == i) {
                            break;
                        }
                    }
                    next = null;
                } else {
                    next = null;
                }
                if (i2 != 2) {
                    if (i2 == 3 && next != null) {
                        next.LIZLLL();
                        return;
                    }
                    return;
                }
                if (next == null) {
                    return;
                }
                next.LJ();
            }
        }
    }

    public void setOverflowWithMask(short s, int i) {
        int i2;
        int i3 = this.mOverflow;
        if (i == 0) {
            i2 = s | i3;
        } else {
            i2 = (~s) & i3;
        }
        this.mOverflow = i2;
        requestLayout();
    }

    public void setPosition(int i, int i2) {
        this.mLeft = i;
        this.mTop = i2;
        this.mOriginTop = i2;
        this.mOriginLeft = i;
    }

    public void setSign(int i, String str) {
        this.mSign = i;
        this.mTagName = str;
    }

    @Override // X.InterfaceC1311410kEN
    public void startEventFire(boolean z, long j) {
        C1298720jtu c1298720jtu;
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            c1298720jtu.LJIIIZ(z, j);
        }
    }

    public void transformFromViewToRootView(View view, float[] fArr) {
        if (!view.getMatrix().isIdentity()) {
            view.getMatrix().mapPoints(fArr);
        }
        View rootView = view.getRootView();
        while (view != rootView) {
            View view2 = (View) view.getParent();
            if (view2 == null) {
                LynxLog.e("LynxBaseUI", "transformFromViewToRootView failed, parent is null.");
                return;
            }
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            fArr[0] = fArr[0] - view2.getScrollX();
            fArr[1] = fArr[1] - view2.getScrollY();
            if (!view2.getMatrix().isIdentity()) {
                view2.getMatrix().mapPoints(fArr);
            }
            view = view2;
        }
    }

    public final void updateLayoutSize(int i, int i2) {
        Point point = this.mLatestSize;
        point.x = i;
        point.y = i2;
    }

    public void setBorderRadius(int i, String str) {
        LynxLog.DTHROW(new RuntimeException("setBorderWidth(int, String) is deprecated.This has no effect."));
    }

    public void setBorderWidth(int i, String str) {
        LynxLog.DTHROW(new RuntimeException("setBorderWidth(int, String) is deprecated.This has no effect."));
    }

    private float[] calculateSiblingCoordinates(LynxBaseUI lynxBaseUI, float f, float f2) {
        float scrollX;
        float scrollY;
        if (this.mContext.LJII()) {
            return getTargetPoint(f, f2, getScrollX(), getScrollY(), lynxBaseUI.getRectWithoutTransform(), lynxBaseUI.getTransformMatrix());
        }
        if (!lynxBaseUI.isCustomHittest() && lynxBaseUI.needCustomLayout() && (lynxBaseUI instanceof UIGroup)) {
            scrollX = f - lynxBaseUI.getOriginLeft();
            scrollY = f2 - lynxBaseUI.getOriginTop();
        } else {
            scrollX = f + ((lynxBaseUI.getScrollX() - lynxBaseUI.getOriginLeft()) - lynxBaseUI.getTranslationX());
            scrollY = f2 + ((lynxBaseUI.getScrollY() - lynxBaseUI.getOriginTop()) - lynxBaseUI.getTranslationY());
        }
        return new float[]{scrollX, scrollY};
    }

    public boolean childrenContainPoint(float f, float f2, boolean z) {
        if (this.mContext.LJII()) {
            for (LynxBaseUI lynxBaseUI : this.mChildren) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LL;
                }
                float[] targetPoint = getTargetPoint(f, f2, getScrollX(), getScrollY(), lynxBaseUI.getRectWithoutTransform(), lynxBaseUI.getTransformMatrix());
                if (z || lynxBaseUI.isUserInteractionEnabled()) {
                    if (lynxBaseUI.getVisibility() && lynxBaseUI.containsPoint(targetPoint[0], targetPoint[1], z)) {
                        return true;
                    }
                }
            }
            return false;
        }
        float scrollX = ((f + getScrollX()) - getOriginLeft()) - getTranslationX();
        float scrollY = ((f2 + getScrollY()) - getOriginTop()) - getTranslationY();
        for (LynxBaseUI lynxBaseUI2 : this.mChildren) {
            if (z || lynxBaseUI2.isUserInteractionEnabled()) {
                if (lynxBaseUI2.getVisibility() && lynxBaseUI2.containsPoint(scrollX, scrollY, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String constructListStateCacheKey(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append(str2);
        sbLIZ.append("_");
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean containsPoint(float f, float f2, boolean z) {
        float touchSlop = getTouchSlop();
        if (this.mContext.LJII()) {
            float f3 = -touchSlop;
            float f4 = f3 - this.mHitSlopLeft;
            float f5 = this.mWidth + touchSlop + this.mHitSlopRight;
            float f6 = f3 - this.mHitSlopTop;
            float f7 = this.mHeight + touchSlop + this.mHitSlopBottom;
            if (f4 <= f && f5 >= f && f6 <= f2 && f7 >= f2) {
                return true;
            }
            if (getOverflow() == 0) {
                return false;
            }
            if (getOverflow() == 1) {
                if (f2 < f6 || f2 > f7) {
                    return false;
                }
            } else if (getOverflow() == 2 && (f < f4 || f > f5)) {
                return false;
            }
            return childrenContainPoint(f, f2, z);
        }
        Rect rect = getRect();
        if (rect.left - touchSlop < f && rect.right + touchSlop > f && rect.top - touchSlop < f2 && rect.bottom + touchSlop > f2) {
            return true;
        }
        if (getOverflow() == 0) {
            return false;
        }
        if (getOverflow() == 1) {
            if (rect.top - touchSlop >= f2 || rect.bottom + touchSlop <= f2) {
                return false;
            }
        } else if (getOverflow() == 2 && (rect.left - touchSlop >= f || rect.right + touchSlop <= f)) {
            return false;
        }
        return childrenContainPoint(f, f2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[PHI: r16
      0x00bf: PHI (r16v2 com.lynx.tasm.behavior.ui.LynxBaseUI) = (r16v3 com.lynx.tasm.behavior.ui.LynxBaseUI), (r16v4 com.lynx.tasm.behavior.ui.LynxBaseUI) binds: [B:37:0x00bd, B:35:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.0kEN, com.lynx.tasm.behavior.ui.LynxBaseUI] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v25, types: [T extends android.view.View, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0kEN] */
    /* JADX WARN: Type inference failed for: r4v30, types: [T extends android.view.View, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0kEN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.InterfaceC1311410kEN hitTest(float r23, float r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxBaseUI.hitTest(float, float, boolean):X.0kEN");
    }

    public void onListCellDisAppear(String str, LynxBaseUI lynxBaseUI, boolean z) {
        if (this.mBlockListEvent) {
            return;
        }
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().onListCellDisAppear(str, lynxBaseUI, z);
        }
    }

    public void scrollIntoView(boolean z, String str, String str2) {
        scrollIntoView(z, str, str2, null);
    }

    public boolean updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        boolean z;
        boolean z2 = true;
        if (this.mLeft != i) {
            this.mLeft = i;
            z = true;
        } else {
            z = false;
        }
        if (this.mTop != i2) {
            this.mTop = i2;
        } else {
            z2 = z;
        }
        this.mBound = rect;
        if (z2) {
            onDrawingPositionChanged();
        }
        return z2;
    }

    private InterfaceC1311410kEN performHitTestOnSibling(LynxBaseUI lynxBaseUI, float f, float f2, boolean z) {
        float[] fArrCalculateSiblingCoordinates = calculateSiblingCoordinates(lynxBaseUI, f, f2);
        float f3 = fArrCalculateSiblingCoordinates[0];
        float f4 = fArrCalculateSiblingCoordinates[1];
        if (!lynxBaseUI.isCustomHittest() && lynxBaseUI.needCustomLayout() && (lynxBaseUI instanceof UIGroup)) {
            UIGroup uIGroup = (UIGroup) lynxBaseUI;
            return uIGroup.findUIWithCustomLayout(f3, f4, uIGroup);
        }
        return lynxBaseUI.hitTest(f3, f4, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean calculateStickyTranslateWithOffset(int r15, boolean r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxBaseUI.calculateStickyTranslateWithOffset(int, boolean, int, int):boolean");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0kJh] */
    public C1314710kJh getTransformValue(float f, float f2, float f3, float f4) {
        ?? r5 = new Object() { // from class: X.0kJh
        };
        getLocationOnScreen(new float[]{f, f3});
        getLocationOnScreen(new float[]{this.mWidth + f2, f3});
        getLocationOnScreen(new float[]{this.mWidth + f2, this.mHeight + f4});
        getLocationOnScreen(new float[]{f, this.mHeight + f4});
        return r5;
    }

    public void scrollIntoView(boolean z, String str, String str2, Callback callback) {
        Boolean bool = Boolean.FALSE;
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        while (true) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) interfaceC1313090kH5;
            if (lynxBaseUI == null) {
                break;
            }
            if (lynxBaseUI instanceof AbsLynxUIScroll) {
                ((AbsLynxUIScroll) lynxBaseUI).LJJIIZI(this, z, str, str2);
                bool = Boolean.TRUE;
                break;
            }
            if (lynxBaseUI instanceof LynxUIScrollViewInternal) {
                LynxUI lynxUI = (LynxUI) lynxBaseUI;
                if (!((C1318220kPM) lynxUI.mView).LLILLL) {
                    str = str2;
                }
                int[] iArr = {0, 0};
                if ("center".equals(str)) {
                    iArr[1] = iArr[1] - ((lynxUI.mView.getHeight() - getHeight()) / 2);
                    iArr[0] = iArr[0] - ((lynxUI.mView.getWidth() - getWidth()) / 2);
                } else if ("end".equals(str)) {
                    iArr[1] = iArr[1] - (lynxUI.mView.getHeight() - getHeight());
                    iArr[0] = iArr[0] - (lynxUI.mView.getWidth() - getWidth());
                }
                LynxBaseUI parentBaseUI = this;
                while (parentBaseUI != lynxUI) {
                    iArr[1] = iArr[1] + parentBaseUI.getTop();
                    iArr[0] = iArr[0] + parentBaseUI.getLeft();
                    parentBaseUI = parentBaseUI.getParentBaseUI();
                    while (parentBaseUI instanceof LynxFlattenUI) {
                        parentBaseUI = (LynxBaseUI) parentBaseUI.mParent;
                    }
                }
                if (z) {
                    ((C1318220kPM) lynxUI.mView).LJ(iArr);
                } else {
                    ((C1318220kPM) lynxUI.mView).LJFF(iArr);
                }
                bool = Boolean.TRUE;
            } else {
                interfaceC1313090kH5 = lynxBaseUI.mParent;
            }
        }
        if (!bool.booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scrollIntoView failed for nodeId:");
            sbLIZ.append(getSign());
            LynxLog.e("LynxBaseUI", C2188811AlT.LIZIZ(sbLIZ));
            if (callback != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("scrollIntoView failed for nodeId:");
                sbLIZ2.append(getSign());
                callback.invoke(8, C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        callback.invoke(0);
    }

    private InterfaceC1311410kEN findHitTargetInSiblings(List<InterfaceC1311410kEN> list, InterfaceC1311410kEN interfaceC1311410kEN, float f, float f2, boolean z) {
        InterfaceC1311410kEN interfaceC1311410kENPerformHitTestOnSibling;
        for (int i = 0; i < list.size(); i++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(list, i);
            if (lynxBaseUI != null && lynxBaseUI != interfaceC1311410kEN && (interfaceC1311410kENPerformHitTestOnSibling = performHitTestOnSibling(lynxBaseUI, f, f2, z)) != null && interfaceC1311410kENPerformHitTestOnSibling.pointerEvents() != EnumC1311640kEk.None) {
                return interfaceC1311410kENPerformHitTestOnSibling;
            }
        }
        return null;
    }

    private InterfaceC1311410kEN performCustomLayoutHitTest(UIGroup uIGroup, float f, float f2, float f3, float f4) {
        if (this.mContext.LJII()) {
            return uIGroup.findUIWithCustomLayout(f3, f4, uIGroup);
        }
        return uIGroup.findUIWithCustomLayout(f - uIGroup.getOriginLeft(), f2 - uIGroup.getOriginTop(), uIGroup);
    }

    public void convertToMeaningfulPaintingAreaRecursive(int i, int i2, int i3, int i4, ArrayList<C1310110kCH> arrayList) {
        int originLeft = i + getOriginLeft();
        int originTop = i2 + getOriginTop();
        if (originLeft < i3 && originTop < i4) {
            C1310110kCH c1310110kCHConvertToMeaningfulPaintingArea = convertToMeaningfulPaintingArea(originLeft, originTop);
            if (c1310110kCHConvertToMeaningfulPaintingArea != null) {
                arrayList.add(c1310110kCHConvertToMeaningfulPaintingArea);
            }
            List<LynxBaseUI> list = this.mChildren;
            if (list != null && list.size() > 0) {
                for (LynxBaseUI lynxBaseUI : this.mChildren) {
                    if (lynxBaseUI != null) {
                        lynxBaseUI.convertToMeaningfulPaintingAreaRecursive(originLeft, originTop, i3, i4, arrayList);
                    }
                }
            }
        }
    }

    private InterfaceC1311410kEN performHitTestOnTarget(LynxBaseUI lynxBaseUI, float f, float f2, float f3, float f4, boolean z) {
        if (!lynxBaseUI.isCustomHittest() && lynxBaseUI.needCustomLayout() && (lynxBaseUI instanceof UIGroup)) {
            return performCustomLayoutHitTest((UIGroup) lynxBaseUI, f, f2, f3, f4);
        }
        return performStandardHitTest(lynxBaseUI, f, f2, f3, f4, z);
    }

    private InterfaceC1311410kEN performStandardHitTest(LynxBaseUI lynxBaseUI, float f, float f2, float f3, float f4, boolean z) {
        if (this.mContext.LJII()) {
            return lynxBaseUI.hitTest(f3, f4, z);
        }
        return lynxBaseUI.hitTest(((f + lynxBaseUI.getScrollX()) - lynxBaseUI.getOriginLeft()) - lynxBaseUI.getTranslationX(), ((f2 + lynxBaseUI.getScrollY()) - lynxBaseUI.getOriginTop()) - lynxBaseUI.getTranslationY(), z);
    }

    public float[] getTargetPoint(float f, float f2, int i, int i2, Rect rect, Matrix matrix) {
        float[] fArr = {(f + i) - rect.left, (f2 + i2) - rect.top};
        Matrix hitTestMatrix = getHitTestMatrix();
        if (matrix.invert(hitTestMatrix)) {
            float[] fArr2 = {fArr[0], fArr[1]};
            hitTestMatrix.mapPoints(fArr2);
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            return fArr;
        }
        fArr[0] = Float.MAX_VALUE;
        fArr[1] = Float.MAX_VALUE;
        return fArr;
    }

    public float[] getTargetPoint(float f, float f2, int i, int i2, View view, Matrix matrix) {
        return getTargetPoint(f, f2, i, i2, new Rect(view.getLeft(), view.getTop(), 0, 0), matrix);
    }

    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect) {
        updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, 0, 0, 0, 0, i9, i10, i11, i12, rect);
        onLayoutUpdated();
    }

    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.mSkipLayoutUpdated = true;
        updateLayoutInfo(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        this.mSkipLayoutUpdated = false;
        onLayoutUpdated();
        sendLayoutChangeEvent();
    }

    public void updateLayoutInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        C1311380kEK c1311380kEK;
        C1311380kEK c1311380kEK2;
        HashSet<Integer> hashSet;
        s sVar = this.mContext;
        if (sVar != null && (c1311380kEK = sVar.LLIZLLLIL) != null && c1311380kEK.LJIILLIIL && Float.compare(this.mWidth, 0.0f) != 0 && Float.compare(this.mHeight, 0.0f) != 0 && ((Float.compare(this.mLeft, i) != 0 || Float.compare(this.mTop, i2) != 0) && (c1311380kEK2 = this.mContext.LLIZLLLIL) != null && (hashSet = c1311380kEK2.LJIJJLI) != null)) {
            hashSet.add(Integer.valueOf(getSign()));
        }
        setPosition(i, i2);
        this.mWidth = i3;
        this.mHeight = i4;
        this.mPaddingLeft = i5;
        this.mPaddingRight = i7;
        this.mPaddingBottom = i8;
        this.mPaddingTop = i6;
        this.mMarginLeft = i9;
        this.mMarginTop = i10;
        this.mMarginRight = i11;
        this.mMarginBottom = i12;
        this.mBorderTopWidth = i14;
        this.mBorderBottomWidth = i16;
        this.mBorderLeftWidth = i13;
        this.mBorderRightWidth = i15;
        this.mBound = rect;
    }
}
