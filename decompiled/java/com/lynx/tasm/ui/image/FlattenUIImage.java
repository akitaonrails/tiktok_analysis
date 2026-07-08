package com.lynx.tasm.ui.image;

import X.AbstractC1320320kSk;
import X.AbstractC1325130kaV;
import X.AbstractC1327750kej;
import X.C089P;
import X.C1289620jfE;
import X.C1297700jsG;
import X.C1298150jsz;
import X.C1298160jt0;
import X.C1299120juY;
import X.C1301610jyZ;
import X.C1311730kEt;
import X.C1312920kGo;
import X.C1313900kIO;
import X.C1315720kLK;
import X.C1315750kLN;
import X.C1315790kLR;
import X.C1315850kLX;
import X.C1315900kLc;
import X.C1315960kLi;
import X.C1316130kLz;
import X.C1317680kOU;
import X.C1317710kOX;
import X.C1319980kSC;
import X.C1320770kTT;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1323050kX9;
import X.C1331070kk5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1311070kDp;
import X.EnumC1316020kLo;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import X.InterfaceC1313090kH5;
import X.InterfaceC1314870kJx;
import X.InterfaceC1316210kM7;
import X.InterfaceC1316380kMO;
import X.InterfaceC1317720kOY;
import X.InterfaceC1320380kSq;
import X.InterfaceC1967107nB;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.ui.image.FlattenUIImage;
import com.lynx.tasm.utils.ColorUtils;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class FlattenUIImage extends LynxFlattenUI implements Drawable.Callback, InterfaceC1316210kM7 {
    public C1317680kOU mBigImageHelper;
    public String mCapInsets;
    public String mCapInsetsScale;
    public boolean mDeferInvalidation;
    public boolean mEnableImageAsyncRedirectOnCreate;
    public boolean mFrescoNinePatch;
    public final Handler mHandler;
    public boolean mHasPendingPlaceholder;
    public boolean mHasPendingSource;
    public Drawable mImageDrawable;
    public final C1315750kLN mLynxImageManager;
    public String mOriginPlaceholder;
    public boolean mPendingLoad;
    public float mPreFetchHeight;
    public float mPreFetchWidth;
    public C1323050kX9<?> mRef;
    public boolean mRepeat;
    public InterfaceC1320380kSq mScaleType;
    public int mScrollState;
    public InterfaceC1314870kJx mScrollStateChangeListener;
    public int mShowCnt;
    public boolean mSkipRedirection;
    public String mSources;
    public boolean mSuspendable;
    public boolean mUseLocalCache;

    private void attachWhenSetPrefetchSize() {
        C1315750kLN c1315750kLN;
        if (this.mPreFetchWidth <= 0.0f || this.mPreFetchHeight <= 0.0f || (c1315750kLN = this.mLynxImageManager) == null || !c1315750kLN.LJJJJJ) {
            return;
        }
        c1315750kLN.LJIILJJIL();
    }

    private void configureBounds() {
        Drawable drawable = this.mImageDrawable;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, getWidth(), getHeight());
    }

    private void onSourceSetted() {
        int i = this.mShowCnt + 1;
        this.mShowCnt = i;
        C1317680kOU c1317680kOU = this.mBigImageHelper;
        if (c1317680kOU != null) {
            c1317680kOU.LIZLLL = i;
            c1317680kOU.LIZJ();
        }
    }

    private void updateImageSource() {
        if (!this.mSkipRedirection && this.mHasPendingPlaceholder && this.mHasPendingSource) {
            C1315750kLN c1315750kLN = this.mLynxImageManager;
            c1315750kLN.LJJIIZI.LJIL(this.mSources, this.mOriginPlaceholder);
            this.mHasPendingSource = false;
            this.mHasPendingPlaceholder = false;
        }
        if (this.mHasPendingSource) {
            if (this.mSkipRedirection) {
                C1315750kLN c1315750kLN2 = this.mLynxImageManager;
                c1315750kLN2.LJJIIZI.LJJ(this.mSources, false);
            } else {
                C1315750kLN c1315750kLN3 = this.mLynxImageManager;
                c1315750kLN3.LJJIIZI.LJJ(this.mSources, true);
            }
            this.mHasPendingSource = false;
        }
        if (this.mHasPendingPlaceholder) {
            this.mHasPendingPlaceholder = false;
            C1315750kLN c1315750kLN4 = this.mLynxImageManager;
            String str = this.mOriginPlaceholder;
            boolean z = true ^ this.mSkipRedirection;
            C1315720kLK c1315720kLK = c1315750kLN4.LJJIIZI;
            if (z) {
                c1315720kLK.LJIL(null, str);
            } else {
                c1315720kLK.LJIJJLI(str);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public EnumC1311070kDp getMeaningfulContentStatus() {
        C1315720kLK c1315720kLK;
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        return (c1315750kLN == null || c1315750kLN.LJIIJJI == null || (c1315720kLK = c1315750kLN.LJJIIZI) == null || c1315720kLK.LJIILLIIL <= 0) ? EnumC1311070kDp.PENDING : EnumC1311070kDp.PRESENTED;
    }

    public void maybeUpdateView() {
        if (this.mSuspendable && this.mScrollState != 0) {
            this.mPendingLoad = true;
            return;
        }
        if (getWidth() <= 0 && getHeight() <= 0) {
            float f = this.mPreFetchWidth;
            if (f > 0.0f) {
                float f2 = this.mPreFetchHeight;
                if (f2 > 0.0f) {
                    this.mLynxImageManager.LJIILIIL((int) f, (int) f2, this.mPaddingLeft + this.mBorderLeftWidth, this.mPaddingTop + this.mBorderTopWidth, this.mPaddingRight + this.mBorderRightWidth, this.mPaddingBottom + this.mBorderBottomWidth);
                    return;
                }
            }
        }
        this.mLynxImageManager.LJIILIIL(getWidth(), getHeight(), this.mPaddingLeft + this.mBorderLeftWidth, this.mPaddingTop + this.mBorderTopWidth, this.mPaddingRight + this.mBorderRightWidth, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public void postInvalidate() {
        Handler handler = this.mHandler;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 64));
        }
    }

    @InterfaceC1967107nB
    public void startAnimate() {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (c1315750kLN != null && c1315750kLN.LJIIJJI()) {
            if (c1315750kLN.LJJJJJ) {
                c1315750kLN.LJJJJLL.stop();
                c1315750kLN.LJJJJLL.start();
            } else {
                c1315750kLN.LJIIJJI.LLILZIL.LIZ().stop();
                c1315750kLN.LJIIJJI.LLILZIL.LIZ().start();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        this.mLynxImageManager.LJIILL();
        C1317680kOU c1317680kOU = this.mBigImageHelper;
        if (c1317680kOU != null) {
            c1317680kOU.LIZJ();
        }
        C1323050kX9<?> c1323050kX9 = this.mRef;
        if (c1323050kX9 != null) {
            c1323050kX9.close();
            this.mRef = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public long getMemoryUsageBytes() {
        long memoryUsageBytes = super.getMemoryUsageBytes();
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (c1315750kLN == null) {
            return memoryUsageBytes;
        }
        C1315720kLK c1315720kLK = c1315750kLN.LJJIIZI;
        return (c1315720kLK == null ? 0L : c1315720kLK.LJIILLIIL) + memoryUsageBytes;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public Map<String, String> getMemoryUsageDetail() {
        float memoryUsageBytes = getMemoryUsageBytes();
        String str = this.mSources;
        if (memoryUsageBytes == 0.0f || str == null || str.isEmpty() || str.startsWith("data:image")) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(str, String.valueOf(memoryUsageBytes));
        return map;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        this.mLynxImageManager.LJIILJJIL();
        this.mLynxImageManager.LJIIIIZZ = true;
        maybeUpdateView();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        this.mLynxImageManager.LJIILL();
        C1317680kOU c1317680kOU = this.mBigImageHelper;
        if (c1317680kOU != null) {
            c1317680kOU.LIZJ();
        }
        this.mImageDrawable = null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (c1315750kLN != null) {
            int left = getLeft();
            int top = getTop();
            int left2 = getLeft() + getWidth();
            int top2 = getTop() + getHeight();
            View view = c1315750kLN.LJJLIIIIJ;
            if (view != null) {
                view.setLeft(left);
                c1315750kLN.LJJLIIIIJ.setTop(top);
                c1315750kLN.LJJLIIIIJ.setRight(left2);
                c1315750kLN.LJJLIIIIJ.setBottom(top2);
            }
        }
        configureBounds();
        maybeUpdateView();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onNodeReady() {
        super.onNodeReady();
        C1315720kLK c1315720kLK = this.mLynxImageManager.LJJIIZI;
        if (c1315720kLK.LJJJJJL) {
            c1315720kLK.LJJJJJL = false;
            if (c1315720kLK.LJIIL) {
                c1315720kLK.LJIIIIZZ();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        super.onPropsUpdated();
        if (!this.mEnableImageAsyncRedirectOnCreate) {
            updateImageSource();
        }
        maybeUpdateView();
    }

    public Drawable getImageDrawable() {
        return this.mImageDrawable;
    }

    public String getSource() {
        return this.mSources;
    }

    public void onImageLoaded() {
        configureBounds();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void renderIfNeeded() {
        maybeUpdateView();
    }

    public FlattenUIImage(Context context) {
        this((s) context);
    }

    public C1315750kLN createImageManager(Context context) {
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        this.mContext.getClass();
        return new C1315750kLN(context, c1320810kTXLIZJ, this, false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 63));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onBorderRadiusUpdated(int i) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        C1313900kIO c1313900kIOLJIIL = this.mLynxBackground.LJIIL();
        if (c1315750kLN.LJIIIZ == c1313900kIOLJIIL) {
            if (c1313900kIOLJIIL == null || c1313900kIOLJIIL.LIZLLL == null) {
                c1315750kLN.LJIIIIZZ = true;
            }
        } else {
            c1315750kLN.LJIIIZ = c1313900kIOLJIIL;
            c1315750kLN.LJIIIIZZ = true;
        }
        c1315750kLN.LJJJJL = true;
    }

    @Override // X.InterfaceC1316210kM7
    public void onCloseableRefReady(C1323050kX9<?> c1323050kX9) {
        if (c1323050kX9 != null && this.mUseLocalCache) {
            this.mRef = c1323050kX9.clone();
            invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI
    public void onDraw(Canvas canvas) throws Throwable {
        Bitmap underlyingBitmap;
        super.onDraw(canvas);
        if (this.mPendingLoad) {
            return;
        }
        if (this.mImageDrawable == null && this.mRef == null) {
            return;
        }
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            String str = this.mLynxImageManager.LJJIIZI.LJIJJLI;
            if (str != null && str.startsWith("http")) {
                map.put("src", this.mSources);
            }
            TraceEvent.LIZJ("FlattenUIImage.onDraw", map);
        }
        C1323050kX9<?> c1323050kX9 = this.mRef;
        String string = null;
        if (c1323050kX9 != null && c1323050kX9.LJIILLIIL() && this.mUseLocalCache) {
            Object obj = this.mRef.get();
            if (obj instanceof AbstractC1325130kaV) {
                underlyingBitmap = ((AbstractC1325130kaV) obj).getUnderlyingBitmap();
            } else if (obj instanceof Bitmap) {
                underlyingBitmap = (Bitmap) obj;
            }
            if (underlyingBitmap != null) {
                LynxLog.i("Lynx Android Flatten Image", "draw image from local cache");
                if (C1315900kLc.customDraw(getWidth(), getHeight(), underlyingBitmap.getWidth(), underlyingBitmap.getHeight(), this.mScaleType, this.mCapInsets, this.mCapInsetsScale, canvas, underlyingBitmap)) {
                    if (TraceController.isTracingStarted()) {
                        TraceEvent.LJII("FlattenUIImage.onDraw");
                        return;
                    }
                    return;
                }
            }
        }
        if (!this.mFrescoNinePatch && this.mCapInsets != null && !LynxEnv.inst().disableBigImageHelper()) {
            LynxLog.i("Lynx Android Flatten Image", "load origin bitmap to draw image with cap-insets");
            if (this.mBigImageHelper == null) {
                this.mBigImageHelper = new C1317680kOU(new InterfaceC1317720kOY() { // from class: X.0jmZ
                    @Override // X.InterfaceC1317720kOY
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1317720kOY
                    public final void LIZJ() {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            this.LIZ.invalidate();
                        } else {
                            this.LIZ.postInvalidate();
                        }
                    }
                }, this.mShowCnt);
            }
            int i = this.mShowCnt;
            float width = getWidth();
            float height = getHeight();
            boolean z = this.mRepeat;
            InterfaceC1320380kSq interfaceC1320380kSq = this.mScaleType;
            C089P c089p = this.mLynxImageManager.LJJIIZI.LJJ;
            if (c089p != null) {
                string = c089p.LIZIZ().toString();
            }
            if (this.mBigImageHelper.LIZLLL(this.mContext, canvas, this.mLynxImageManager.LJIIZILJ, new C1317710kOX(i, width, height, z, interfaceC1320380kSq, string, C1317680kOU.LJFF(canvas), this.mCapInsets, this.mCapInsetsScale))) {
                if (TraceController.isTracingStarted()) {
                    TraceEvent.LJII("FlattenUIImage.onDraw");
                    return;
                }
                return;
            }
        }
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (c1315750kLN.LJJJJJ && c1315750kLN.LJIIL()) {
            if (TraceController.isTracingStarted()) {
                TraceEvent.LJII("FlattenUIImage.onDraw");
                return;
            }
            return;
        }
        try {
            this.mImageDrawable.draw(canvas);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", view sie:");
            sbLIZ.append(getWidth());
            sbLIZ.append("x");
            sbLIZ.append(getHeight());
            sbLIZ.append(", url:");
            sbLIZ.append(this.mSources);
            LynxLog.e("Lynx-Image", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII("FlattenUIImage.onDraw");
        }
    }

    @Override // X.InterfaceC1316210kM7
    public void onDrawableReady(Drawable drawable) {
        this.mImageDrawable = drawable;
        if (drawable != null) {
            this.mImageDrawable.setCallback(this);
            int i = this.mImageRendering;
            if (i == 2) {
                this.mImageDrawable.setFilterBitmap(false);
            } else if (i == 1 || i == 0) {
                this.mImageDrawable.setFilterBitmap(true);
            }
        }
        configureBounds();
        invalidate();
    }

    @InterfaceC1312540kGC(name = "async-redirect")
    public void setAsyncRedirect(boolean z) {
        this.mLynxImageManager.LJJIIZI.LJJJJL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "async-request")
    public void setAsyncRequest(boolean z) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        c1315750kLN.LJJJJJ = z;
        c1315750kLN.LJJIIZI.LJJIJ = z;
        if (z) {
            c1315750kLN.LJIIIIZZ();
            if (c1315750kLN.LJJIL == null) {
                c1315750kLN.LJIIJ();
            }
            if (c1315750kLN.LJJLIIIJ == null) {
                c1315750kLN.LJJLIIIJ = new WeakReference<>(c1315750kLN.LJJIJ);
            }
        } else {
            C1323050kX9<AbstractC1327750kej> c1323050kX9 = c1315750kLN.LJJJI;
            if (c1323050kX9 != null) {
                C1323050kX9.LJII(c1323050kX9);
                c1315750kLN.LJJJI = null;
            }
            C1319980kSC<C1331070kk5> c1319980kSC = c1315750kLN.LJJIL;
            if (c1319980kSC != null) {
                c1319980kSC.LIZIZ = false;
                if (c1319980kSC.LIZ) {
                    c1319980kSC.LIZ = false;
                    ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1319980kSC, 73);
                    if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
                        aRunnableS120S0100000_20.run();
                    } else {
                        C1301610jyZ.LIZLLL().execute(aRunnableS120S0100000_20);
                    }
                }
            }
            c1315750kLN.LJJJLL = null;
            C1323050kX9<?> c1323050kX92 = c1315750kLN.LJJJJZ;
            if (c1323050kX92 != null) {
                C1323050kX9.LJII(c1323050kX92);
                c1315750kLN.LJJJJZ = null;
            }
        }
        c1315750kLN.LJIIIIZZ = true;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "autoplay")
    public void setAutoPlay(boolean z) {
        this.mLynxImageManager.LJJIJIIJIL = z;
    }

    @InterfaceC1312540kGC(name = "auto-size")
    public void setAutoSize(boolean z) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        C1315720kLK c1315720kLK = c1315750kLN.LJJIIZI;
        c1315720kLK.LJIIL = z;
        if (!z || (c1315720kLK.LJ != 0 && c1315720kLK.LIZLLL != 0)) {
            c1315720kLK.LJIIIIZZ();
        }
        c1315720kLK.LJJII.LIZ();
        c1315750kLN.LJJIII = !z;
    }

    @InterfaceC1312540kGC(name = "blur-radius")
    public void setBlurRadius(String str) {
        UIBody uIBody = this.mContext.LLJILJILJ;
        this.mLynxImageManager.LJJIIZI.LJIIZILJ(Math.round(C1312920kGo.LIZJ(str, uIBody.mFontSize, this.mFontSize, uIBody.getWidth(), uIBody.getHeight(), this.mContext.LLJJJ)));
    }

    @InterfaceC1312540kGC(name = "android-cache-key-path-only")
    public void setCacheKeyPathOnly(boolean z) {
        this.mLynxImageManager.LJJIIZI.LJIIJJI = z;
    }

    @InterfaceC1312540kGC(name = "capInsets")
    public void setCapInsets(String str) {
        if (str != null && !str.equalsIgnoreCase("")) {
            this.mCapInsets = str;
        } else {
            this.mCapInsets = null;
        }
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        String str2 = this.mCapInsets;
        C1315720kLK c1315720kLK = c1315750kLN.LJJIIZI;
        c1315720kLK.LJI = str2;
        c1315720kLK.LJJII.LIZ();
    }

    @InterfaceC1312540kGC(name = "cap-insets")
    public void setCapInsetsBackUp(String str) {
        setCapInsets(str);
    }

    @InterfaceC1312540kGC(name = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
        if (str != null && !str.equalsIgnoreCase("")) {
            this.mCapInsetsScale = str;
        } else {
            this.mCapInsetsScale = null;
        }
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        String str2 = this.mCapInsetsScale;
        C1315720kLK c1315720kLK = c1315750kLN.LJJIIZI;
        c1315720kLK.LJII = str2;
        c1315720kLK.LJJII.LIZ();
    }

    @InterfaceC1312540kGC(name = "additional-custom-info")
    public void setCustomParams(ReadableMap readableMap) {
        this.mLynxImageManager.LJJIIZI.LJIJ(readableMap);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "defer-src-invalidation")
    public void setDeferInvalidation(boolean z) {
        this.mDeferInvalidation = z;
        this.mLynxImageManager.LJJIFFI = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "disable-default-resize")
    public void setDisableDefaultResize(boolean z) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (c1315750kLN == null) {
            return;
        }
        if (z) {
            EnumC1316020kLo enumC1316020kLo = EnumC1316020kLo.SCALE;
            C1315720kLK c1315720kLK = c1315750kLN.LJJIIZI;
            c1315720kLK.LJIIZILJ = enumC1316020kLo;
            c1315720kLK.LJJII.LIZ();
            return;
        }
        EnumC1316020kLo enumC1316020kLo2 = EnumC1316020kLo.RESIZE;
        C1315720kLK c1315720kLK2 = c1315750kLN.LJJIIZI;
        c1315720kLK2.LJIIZILJ = enumC1316020kLo2;
        c1315720kLK2.LJJII.LIZ();
    }

    @InterfaceC1312540kGC(name = "enable-custom-gif-decoder")
    public void setEnableCustomGifDecoder(boolean z) {
        this.mLynxImageManager.LJJIIZI.LJJJJJ = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-report-info")
    public void setEnableReportInfo(boolean z) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        c1315750kLN.LJJIJLIJ = z;
        c1315750kLN.LJJIIZI.LJJJI = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-resource-hint")
    public void setEnableResourceHint(boolean z) {
        this.mLynxImageManager.LJJIIZI.LJFF = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-enable-smooth-animation")
    public void setEnableSmoothAnimation(boolean z) {
        this.mLynxImageManager.LJJIIZI.LJJIZ = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map == null) {
            return;
        }
        this.mLynxImageManager.LJJIIZI.LJIJI(map);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "extra-load-info")
    public void setExtraLoadInfo(boolean z) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        c1315750kLN.LJJIJL = z;
        c1315750kLN.LJJIIZI.LJJJ = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "fresco-nine-patch")
    public void setFrescoNinePatch(boolean z) {
        this.mFrescoNinePatch = z;
    }

    @InterfaceC1312540kGC(name = "cache-choice")
    public void setImageCacheChoice(String str) {
        this.mLynxImageManager.LJJIIZI.LJIIIZ = str;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "image-config")
    public void setImageConfig(String str) {
        super.setImageConfig(str);
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        Bitmap.Config config = this.mBitmapConfig;
        C1315720kLK c1315720kLK = c1315750kLN.LJJIIZI;
        c1315720kLK.LJIILL = config;
        c1315720kLK.LJJII.LIZ();
    }

    @InterfaceC1312540kGC(name = "placeholder-hash-config")
    public void setImagePlaceHolderHashConfig(ReadableMap readableMap) {
        this.mLynxImageManager.LJJIIZI.LJIJJ(readableMap);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setImageRendering(int i) {
        boolean z;
        super.setImageRendering(i);
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        c1315750kLN.LJJJLIIL = z;
        c1315750kLN.LJIIIIZZ = true;
    }

    @InterfaceC1312540kGC(name = "fetch-priority")
    public void setImageRequestPriority(String str) {
        this.mLynxImageManager.LJJIIZI.LJIIIIZZ = str;
    }

    @InterfaceC1312540kGC(name = "enable-super-resolution")
    public void setImageSR(boolean z) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (z && c1315750kLN.LJJLIIIIJ == null) {
            c1315750kLN.LJJLIIIIJ = new View(c1315750kLN.LIZ);
        }
        C1315720kLK c1315720kLK = c1315750kLN.LJJIIZI;
        c1315720kLK.LJJJJLI = z;
        c1315720kLK.LJIILL = Bitmap.Config.ARGB_8888;
    }

    @InterfaceC1312540kGC(name = "super-resolution-scale")
    public void setImageSRScale(float f) {
        C1315720kLK c1315720kLK = this.mLynxImageManager.LJJIIZI;
        if (f > 0.0f) {
            c1315720kLK.LJJJJLI = true;
            c1315720kLK.LJIILL = Bitmap.Config.ARGB_8888;
            c1315720kLK.LJJJJLL = f;
        } else {
            c1315720kLK.LJJJJLI = false;
            c1315720kLK.LJJJJLL = 0.0f;
        }
    }

    @InterfaceC1312540kGC(name = "image-transition-style")
    public void setImageTransitionStyle(String str) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (c1315750kLN == null) {
            return;
        }
        c1315750kLN.getClass();
        if ("fadeIn".equals(str)) {
            c1315750kLN.LJJJJJL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        } else {
            c1315750kLN.LJJJJJL = 0;
        }
        C1331070kk5 c1331070kk5 = c1315750kLN.LJJIIZ;
        if (c1331070kk5 != null) {
            c1331070kk5.LJIJI(c1315750kLN.LJJJJJL);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLocalCache(InterfaceC1298070jsr interfaceC1298070jsr) {
        super.setLocalCache(interfaceC1298070jsr);
        if (this.mLynxImageManager == null) {
            return;
        }
        C1298160jt0 c1298160jt0LIZIZ = C1298150jsz.LIZIZ(interfaceC1298070jsr);
        boolean z = c1298160jt0LIZIZ.LIZ;
        this.mUseLocalCache = z;
        boolean z2 = c1298160jt0LIZIZ.LIZIZ;
        C1315720kLK c1315720kLK = this.mLynxImageManager.LJJIIZI;
        c1315720kLK.LJIJI = z;
        c1315720kLK.LJIJJ = z2;
    }

    @InterfaceC1312540kGC(name = "loop-count")
    public void setLoopCount(int i) {
        if (i <= 0) {
            i = 0;
        }
        this.mLynxImageManager.LJJIIZI.LJJIL = i;
    }

    @InterfaceC1312540kGC(name = "mode")
    public void setObjectFit(String str) {
        AbstractC1320320kSk abstractC1320320kSkLIZIZ = C1316130kLz.LIZIZ(str);
        this.mScaleType = abstractC1320320kSkLIZIZ;
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        c1315750kLN.LJII = abstractC1320320kSkLIZIZ;
        c1315750kLN.LJJJJLI = true;
        c1315750kLN.LJIIIIZZ = true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setParent(InterfaceC1313090kH5 interfaceC1313090kH5) {
        super.setParent(interfaceC1313090kH5);
        this.mLynxImageManager.LJIILJJIL();
    }

    @InterfaceC1312540kGC(name = "placeholder")
    public void setPlaceholder(String str) {
        this.mHasPendingPlaceholder = true;
        this.mOriginPlaceholder = str;
    }

    @InterfaceC1312540kGC(name = "prefetch-height")
    public void setPreFetchHeight(String str) {
        this.mPreFetchHeight = C1312920kGo.LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LLJJJ);
        attachWhenSetPrefetchSize();
    }

    @InterfaceC1312540kGC(name = "prefetch-width")
    public void setPreFetchWidth(String str) {
        this.mPreFetchWidth = C1312920kGo.LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LLJJJ);
        attachWhenSetPrefetchSize();
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "progressive-rendering")
    public void setProgressiveRendering(boolean z) {
        this.mLynxImageManager.LJJIIZI.LJJLIIIJJI = z;
    }

    @InterfaceC1312540kGC(name = "region-to-decode")
    public void setRegionToDecode(ReadableMap readableMap) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        Rect rectLIZJ = C1298150jsz.LIZJ(readableMap);
        C1315720kLK c1315720kLK = c1315750kLN.LJJIIZI;
        if (rectLIZJ == null) {
            c1315720kLK.LJJLIIIJJIZ = null;
        } else {
            c1315720kLK.getClass();
            c1315720kLK.LJJLIIIJJIZ = new Rect(rectLIZJ);
        }
        c1315750kLN.LJIIIIZZ = true;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "repeat")
    public void setRepeat(boolean z) {
        this.mRepeat = z;
    }

    @InterfaceC1312540kGC(name = "android-simple-cache-key")
    public void setSimpleCacheKey(boolean z) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (c1315750kLN == null) {
            return;
        }
        c1315750kLN.LJJIIZI.LJIIJ = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(defaultBoolean = false, name = "skip-redirection")
    public void setSkipRedirection(boolean z) {
        this.mSkipRedirection = z;
    }

    @InterfaceC1312540kGC(name = "src")
    public void setSource(String str) {
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(str, this.mLynxImageManager.LJJIIZI.LJIJJLI)) {
            if (!this.mDeferInvalidation) {
                this.mImageDrawable = null;
            }
            C1323050kX9<?> c1323050kX9 = this.mRef;
            if (c1323050kX9 != null) {
                c1323050kX9.close();
                this.mRef = null;
            }
        }
        this.mSources = str;
        this.mHasPendingSource = true;
        onSourceSetted();
        invalidate();
    }

    @InterfaceC1312540kGC(name = "subsample")
    public void setSubSample(boolean z) {
        this.mLynxImageManager.LJJIIZI.LJJLIIIJL = !z;
    }

    @InterfaceC1312540kGC(name = "suspendable")
    public void setSuspendable(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.mSuspendable = false;
        if (interfaceC1298070jsr != null) {
            int i = C1297700jsG.LIZ[interfaceC1298070jsr.getType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.mSuspendable = TextUtils.equals("true", interfaceC1298070jsr.asString());
                }
            } else {
                this.mSuspendable = interfaceC1298070jsr.asBoolean();
            }
        }
        if (!this.mSuspendable) {
            unRegisterScrollStateListener(this.mScrollStateChangeListener);
            return;
        }
        if (this.mScrollStateChangeListener == null) {
            this.mScrollStateChangeListener = new InterfaceC1314870kJx() { // from class: X.0kM6
                @Override // X.InterfaceC1314870kJx
                public final void LIZ(int i2) {
                    FlattenUIImage flattenUIImage = this.LIZ;
                    flattenUIImage.mScrollState = i2;
                    if (flattenUIImage.mPendingLoad && i2 == 0) {
                        flattenUIImage.mPendingLoad = false;
                        flattenUIImage.maybeUpdateView();
                    }
                }
            };
        }
        registerScrollStateListener(this.mScrollStateChangeListener);
    }

    @InterfaceC1312540kGC(name = "tint-color")
    public void setTintColor(String str) {
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        c1315750kLN.getClass();
        if (!ColorUtils.LIZ(str)) {
            c1315750kLN.LJJIJIL = null;
        } else {
            c1315750kLN.LJJIJIL = new PorterDuffColorFilter(ColorUtils.LIZIZ(str), PorterDuff.Mode.SRC_IN);
        }
        if (c1315750kLN.LJJJJJ) {
            C1331070kk5 c1331070kk5 = c1315750kLN.LJJIIZ;
            c1331070kk5.LJI.setColorFilter(c1315750kLN.LJJIJIL);
            return;
        }
        C1315850kLX c1315850kLX = c1315750kLN.LJIILJJIL;
        if (c1315850kLX != null) {
            ColorFilter colorFilter = c1315750kLN.LJJIJIL;
            Drawable drawable = c1315850kLX.LLIZLLLIL;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
        C1320770kTT<C1331070kk5> c1320770kTT = c1315750kLN.LJIIJJI;
        if (c1320770kTT == null) {
            return;
        }
        c1320770kTT.LLILZ.getClass();
        DH dh = c1315750kLN.LJIIJJI.LLILZ;
        dh.getClass();
        ((C1331070kk5) dh).LJI.setColorFilter(c1315750kLN.LJJIJIL);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updatePropertiesInterval(C1311730kEt c1311730kEt) {
        C1315750kLN c1315750kLN;
        super.updatePropertiesInterval(c1311730kEt);
        if (!this.mSkipRedirection && (c1315750kLN = this.mLynxImageManager) != null) {
            c1315750kLN.LJJIIZI.LJJIII(this.mSources, this.mOriginPlaceholder, this.mHasPendingSource, this.mHasPendingPlaceholder);
        }
        if (this.mEnableImageAsyncRedirectOnCreate) {
            updateImageSource();
        }
    }

    public FlattenUIImage(s sVar) {
        this(sVar, null);
    }

    public void setLocalCache(Boolean bool) {
        if (this.mLynxImageManager == null) {
            return;
        }
        if (bool == null) {
            this.mUseLocalCache = false;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.mUseLocalCache = zBooleanValue;
        this.mLynxImageManager.LJJIIZI.LJIJI = zBooleanValue;
    }

    public FlattenUIImage(s sVar, Object obj) {
        super(sVar, obj);
        this.mPreFetchWidth = -1.0f;
        this.mPreFetchHeight = -1.0f;
        this.mScaleType = InterfaceC1320380kSq.LIZ;
        C1315750kLN c1315750kLNCreateImageManager = createImageManager(sVar);
        this.mLynxImageManager = c1315750kLNCreateImageManager;
        c1315750kLNCreateImageManager.LJJIJ = this;
        if (c1315750kLNCreateImageManager.LJJJJJ) {
            c1315750kLNCreateImageManager.LJJLIIIJ = new WeakReference<>(c1315750kLNCreateImageManager.LJJIJ);
        }
        c1315750kLNCreateImageManager.LJJIIZI.LJJIIZ = this;
        c1315750kLNCreateImageManager.LJIJ = new C1315960kLi() { // from class: X.0jwI
            @Override // X.C1315960kLi
            public final void LJ(int i, int i2) {
                Map<String, C1299120juY> map = this.LIZ.mEvents;
                if (map != null && map.containsKey("load")) {
                    C1289960jfm c1289960jfm = new C1289960jfm(this.LIZ.getSign(), "load");
                    c1289960jfm.LIZIZ(Integer.valueOf(i2), "height");
                    c1289960jfm.LIZIZ(Integer.valueOf(i), "width");
                    this.LIZ.mContext.LLIZ.LIZIZ(c1289960jfm);
                }
            }

            @Override // X.C1315960kLi
            public final void LIZLLL(LynxError lynxError, int i, int i2) {
                C1289960jfm c1289960jfm = new C1289960jfm(this.LIZ.getSign(), "error");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(lynxError.LJ());
                sbLIZ.append(": ");
                sbLIZ.append(lynxError.LIZLLL());
                c1289960jfm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "errMsg");
                c1289960jfm.LIZIZ(Integer.valueOf(i), "lynx_categorized_code");
                c1289960jfm.LIZIZ(Integer.valueOf(i2), "error_code");
                this.LIZ.mContext.LLIZ.LIZIZ(c1289960jfm);
                FlattenUIImage flattenUIImage = this.LIZ;
                flattenUIImage.mContext.LJJIFFI(flattenUIImage.mSources, "image", lynxError);
            }
        };
        c1315750kLNCreateImageManager.LJJIIZI.LJJIFFI = new InterfaceC1316380kMO() { // from class: X.0kMC
            @Override // X.InterfaceC1316380kMO
            public final void LIZ() {
                this.LIZ.maybeUpdateView();
            }
        };
        this.mHandler = new BPEAHandler(Looper.getMainLooper());
        this.mShowCnt = 0;
        this.mRepeat = false;
        this.mEnableImageAsyncRedirectOnCreate = LynxEnv.inst().enableImageAsyncRedirectOnCreate();
    }

    @InterfaceC1967107nB
    public void pauseAnimation(ReadableMap readableMap, Callback callback) {
        Animatable animatableLIZ;
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (c1315750kLN != null && c1315750kLN.LJIIJJI()) {
            if (c1315750kLN.LJJJJJ) {
                animatableLIZ = c1315750kLN.LJJJJLL;
            } else {
                animatableLIZ = c1315750kLN.LJIIJJI.LLILZIL.LIZ();
            }
            if (animatableLIZ instanceof AnimatedDrawable2) {
                if (C1315790kLR.LIZLLL((AnimatedDrawable2) animatableLIZ)) {
                    callback.invoke(0, "Animation paused.");
                } else {
                    callback.invoke(4, "Not support pause yet");
                }
            }
        }
    }

    @InterfaceC1967107nB
    public void resumeAnimation(ReadableMap readableMap, Callback callback) {
        Animatable animatableLIZ;
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (c1315750kLN != null && c1315750kLN.LJIIJJI()) {
            if (c1315750kLN.LJJJJJ) {
                animatableLIZ = c1315750kLN.LJJJJLL;
            } else {
                animatableLIZ = c1315750kLN.LJIIJJI.LLILZIL.LIZ();
            }
            animatableLIZ.start();
            callback.invoke(0, "Animation resumed.");
        }
    }

    @InterfaceC1967107nB
    public void stopAnimation(ReadableMap readableMap, Callback callback) {
        Animatable animatableLIZ;
        C1315750kLN c1315750kLN = this.mLynxImageManager;
        if (c1315750kLN != null && c1315750kLN.LJIIJJI()) {
            if (c1315750kLN.LJJJJJ) {
                animatableLIZ = c1315750kLN.LJJJJLL;
            } else {
                animatableLIZ = c1315750kLN.LJIIJJI.LLILZIL.LIZ();
            }
            animatableLIZ.stop();
            callback.invoke(0, "Animation stopped.");
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C1289620jfE.LIZ().removeCallbacks(runnable, drawable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C786410Ut5.LJLIIIL(C1289620jfE.LIZ(), runnable, drawable, j);
    }
}
