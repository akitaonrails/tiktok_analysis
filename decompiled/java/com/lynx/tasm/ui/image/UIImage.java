package com.lynx.tasm.ui.image;

import X.AbstractC1320720kTO;
import X.C1297710jsH;
import X.C1298150jsz;
import X.C1298160jt0;
import X.C1299120juY;
import X.C1311730kEt;
import X.C1312920kGo;
import X.C1315710kLJ;
import X.C1315960kLi;
import X.C1316130kLz;
import X.C1318790kQH;
import X.C1322200kVm;
import X.EnumC1311070kDp;
import X.EnumC1316020kLo;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import X.InterfaceC1314870kJx;
import X.InterfaceC1316380kMO;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.text.TextUtils;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.image.AbsUIImage;
import com.lynx.tasm.ui.image.UIImage;
import j27.s;
import java.util.HashMap;
import java.util.Map;
import u4.q0;

/* JADX INFO: loaded from: classes21.dex */
public class UIImage<T extends C1315710kLJ> extends AbsUIImage<T> {
    public AbstractC1320720kTO mDraweeControllerBuilder;
    public boolean mEnableImageAsyncRedirectOnCreate;
    public boolean mHasPendingPlaceholder;
    public boolean mHasPendingSource;
    public int mImageDstHeight;
    public int mImageDstWidth;
    public String mOriginPlaceholder;
    public boolean mPendingLoad;
    public int mScrollState;
    public InterfaceC1314870kJx mScrollStateChangeListener;
    public boolean mSkipRedirection;
    public String mSources;
    public boolean mSuspendable;

    private void updateImageSource() {
        if (!this.mSkipRedirection && this.mHasPendingPlaceholder && this.mHasPendingSource) {
            ((C1315710kLJ) this.mView).setRedirectImageSource(this.mSources, this.mOriginPlaceholder);
            this.mView.invalidate();
            this.mHasPendingSource = false;
            this.mHasPendingPlaceholder = false;
        }
        if (this.mHasPendingSource) {
            if (this.mSkipRedirection) {
                ((C1315710kLJ) this.mView).setSrcSkippingRedirection(this.mSources);
            } else {
                ((C1315710kLJ) this.mView).setSrc(this.mSources);
                this.mView.invalidate();
            }
            this.mHasPendingSource = false;
        }
        if (this.mHasPendingPlaceholder) {
            this.mHasPendingPlaceholder = false;
            ((C1315710kLJ) this.mView).setPlaceholder(this.mOriginPlaceholder, !this.mSkipRedirection);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public EnumC1311070kDp getMeaningfulContentStatus() {
        T t = this.mView;
        return (t == 0 || ((C1315710kLJ) t).getBitmapMemorySizeBytes() <= 0) ? EnumC1311070kDp.PENDING : EnumC1311070kDp.PRESENTED;
    }

    public void reloadImage() {
        if (!this.mSuspendable || this.mScrollState == 0) {
            ((C1315710kLJ) this.mView).maybeUpdateView();
        } else {
            this.mPendingLoad = true;
        }
    }

    @InterfaceC1967107nB
    public void startAnimate() {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).stopAnimate();
            ((C1315710kLJ) this.mView).startAnimate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        ((C1315710kLJ) this.mView).destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public long getMemoryUsageBytes() {
        long memoryUsageBytes = super.getMemoryUsageBytes();
        T t = this.mView;
        return t == 0 ? memoryUsageBytes : ((C1315710kLJ) t).getBitmapMemorySizeBytes() + memoryUsageBytes;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public Map<String, String> getMemoryUsageDetail() {
        long memoryUsageBytes = getMemoryUsageBytes();
        String str = this.mSources;
        if (memoryUsageBytes == 0 || str == null || str.isEmpty() || str.startsWith("data:image")) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(str, String.valueOf(memoryUsageBytes));
        return map;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public void initAccessibilityDelegate() {
        super.initAccessibilityDelegate();
        T t = this.mView;
        if (t != 0) {
            q0.LJIJ(t, new C1318790kQH(this));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        ((C1315710kLJ) this.mView).destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        int i3 = this.mPaddingTop + this.mBorderTopWidth;
        int i4 = this.mPaddingBottom + this.mBorderBottomWidth;
        if ((getWidth() - this.mImageDstWidth > 1 || getHeight() - this.mImageDstHeight > 1) && !hasAnimationRunning()) {
            ((C1315710kLJ) this.mView).markDirty();
        }
        this.mView.setPadding(i, i3, i2, i4);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onNodeReady() {
        super.onNodeReady();
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).onNodeReady();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        super.onPropsUpdated();
        if (!this.mEnableImageAsyncRedirectOnCreate) {
            updateImageSource();
        }
        ((C1315710kLJ) this.mView).setConsumeHoverEvent(this.mConsumeHoverEvent);
        reloadImage();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void renderIfNeeded() {
        reloadImage();
    }

    public UIImage(Context context) {
        this((s) context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public T createView(Context context) {
        this.mDraweeControllerBuilder = C1322200kVm.LIZJ();
        AbstractC1320720kTO abstractC1320720kTO = this.mDraweeControllerBuilder;
        this.mContext.getClass();
        T t = (T) onCreateView(context, abstractC1320720kTO, null, null, this);
        t.setImageLoaderCallback(new C1315960kLi() { // from class: X.0jwL
            @Override // X.C1315960kLi
            public final boolean LIZ() {
                return this.LIZ.mPendingLoad;
            }

            @Override // X.C1315960kLi
            public final void LIZIZ(int i, int i2) {
                UIImage uIImage = this.LIZ;
                uIImage.mImageDstWidth = i;
                uIImage.mImageDstHeight = i2;
            }

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
                UIImage uIImage = this.LIZ;
                uIImage.mContext.LJJIFFI(uIImage.mSources, "image", lynxError);
            }
        });
        t.setImageRedirectListener(new InterfaceC1316380kMO() { // from class: X.0kLF
            @Override // X.InterfaceC1316380kMO
            public final void LIZ() {
                this.LIZ.reloadImage();
            }
        });
        this.mEnableImageAsyncRedirectOnCreate = LynxEnv.inst().enableImageAsyncRedirectOnCreate();
        return t;
    }

    @InterfaceC1312540kGC(name = "fix-fresco-bug")
    public void fixFrescoWebPBug(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).fixFrescoWebPBug(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onBorderRadiusUpdated(int i) {
        ((C1315710kLJ) this.mView).setBorderRadius(this.mLynxBackground.LJIIL());
    }

    @InterfaceC1312540kGC(name = "async-redirect")
    public void setAsyncRedirect(boolean z) {
        ((C1315710kLJ) this.mView).setAsyncRedirect(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "autoplay")
    public void setAutoPlay(boolean z) {
        ((C1315710kLJ) this.mView).setAutoPlay(z);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setAutoSize(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setAutoSize(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setBlurRadius(String str) {
        ((C1315710kLJ) this.mView).setBlurRadius(Math.round(C1312920kGo.LIZJ(str, this.mContext.LLJILJILJ.mFontSize, this.mFontSize, r2.getWidth(), r2.getHeight(), this.mContext.LLJJJ)));
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-cache-key-path-only")
    public void setCacheKeyPathOnly(boolean z) {
        ((C1315710kLJ) this.mView).setCacheKeyPathOnly(z);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setCapInsets(String str) {
        if (str != null && !str.equalsIgnoreCase("")) {
            ((C1315710kLJ) this.mView).setCapInsets(str);
        } else {
            ((C1315710kLJ) this.mView).setCapInsets(null);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    @InterfaceC1312540kGC(name = "cap-insets")
    public void setCapInsetsBackUp(String str) {
        setCapInsets(str);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    @InterfaceC1312540kGC(name = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
        if (str != null && !str.equalsIgnoreCase("")) {
            ((C1315710kLJ) this.mView).setCapInsetsScale(str);
        } else {
            ((C1315710kLJ) this.mView).setCapInsetsScale(null);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setCoverStart(boolean z) {
        ((C1315710kLJ) this.mView).setCoverStart(z);
    }

    @InterfaceC1312540kGC(name = "additional-custom-info")
    public void setCustomParams(ReadableMap readableMap) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setImageCustomParams(readableMap);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "defer-src-invalidation")
    public void setDeferInvalidation(boolean z) {
        ((C1315710kLJ) this.mView).setDeferInvalidation(z);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setDisableDefaultPlaceholder(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setDisableDefaultPlaceHolder(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setDisableDefaultResize(boolean z) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        if (z) {
            ((C1315710kLJ) t).setResizeMethod(EnumC1316020kLo.SCALE);
        } else {
            ((C1315710kLJ) t).setResizeMethod(EnumC1316020kLo.RESIZE);
        }
    }

    @InterfaceC1312540kGC(name = "enable-custom-gif-decoder")
    public void setEnableCustomGifDecoder(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setEnableCustomGifDecoder(z);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-report-info")
    public void setEnableReportInfo(boolean z) {
        ((C1315710kLJ) this.mView).setEnableReportInfo(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-resource-hint")
    public void setEnableResourceHint(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setEnableResourceHint(z);
        }
    }

    @InterfaceC1312540kGC(name = "android-enable-smooth-animation")
    public void setEnableSmoothAnimation(boolean z) {
        ((C1315710kLJ) this.mView).setSmoothAnimation(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, C1299120juY> map) {
        T t;
        super.setEvents(map);
        if (map != null && (t = this.mView) != 0) {
            ((C1315710kLJ) t).setImageEvents(map);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "extra-load-info")
    public void setExtraLoadInfo(boolean z) {
        ((C1315710kLJ) this.mView).setExtraLoadInfo(z);
    }

    @InterfaceC1312540kGC(name = "fresco-attach")
    public void setFrescoAttach(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
                T t = this.mView;
                ((C1315710kLJ) t).mIsFrescoAttach = true;
                ((C1315710kLJ) t).setFrescoAttach();
            }
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "fresco-nine-patch")
    public void setFrescoNinePatch(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setFrescoNinePatch(z);
        }
    }

    @InterfaceC1312540kGC(name = "fresco-visible")
    public void setFrescoVisible(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
                T t = this.mView;
                ((C1315710kLJ) t).mIsFrescoVisible = true;
                ((C1315710kLJ) t).setFrescoVisible();
            }
        }
    }

    @InterfaceC1312540kGC(name = "cache-choice")
    public void setImageCacheChoice(String str) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setImageCacheChoice(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "image-config")
    public void setImageConfig(String str) {
        super.setImageConfig(str);
        ((C1315710kLJ) this.mView).setBitmapConfig(this.mBitmapConfig);
        invalidate();
    }

    @InterfaceC1312540kGC(name = "placeholder-hash-config")
    public void setImagePlaceHolderHashConfig(ReadableMap readableMap) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setImagePlaceHolderHashConfig(readableMap);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setImageRendering(int i) {
        boolean z;
        super.setImageRendering(i);
        T t = this.mView;
        if (t != 0) {
            C1315710kLJ c1315710kLJ = (C1315710kLJ) t;
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            c1315710kLJ.setIsPixelated(z);
        }
    }

    @InterfaceC1312540kGC(name = "fetch-priority")
    public void setImageRequestPriority(String str) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setImageRequestPriority(str);
        }
    }

    @InterfaceC1312540kGC(name = "enable-super-resolution")
    public void setImageSR(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setEnableImageSR(z);
        }
    }

    @InterfaceC1312540kGC(name = "super-resolution-scale")
    public void setImageSRScale(float f) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setImageSRScale(f);
        }
    }

    @InterfaceC1312540kGC(name = "image-transition-style")
    public void setImageTransitionStyle(String str) {
        ((C1315710kLJ) this.mView).setImageTransitionStyle(str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setLocalCache(InterfaceC1298070jsr interfaceC1298070jsr) {
        super.setLocalCache(interfaceC1298070jsr);
        if (this.mView == 0) {
            return;
        }
        C1298160jt0 c1298160jt0LIZIZ = C1298150jsz.LIZIZ(interfaceC1298070jsr);
        boolean z = c1298160jt0LIZIZ.LIZ;
        boolean z2 = c1298160jt0LIZIZ.LIZIZ;
        ((C1315710kLJ) this.mView).setLocalCache(z);
        ((C1315710kLJ) this.mView).setAwaitLocalCache(z2);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setLoopCount(int i) {
        if (i <= 0) {
            i = 0;
        }
        ((C1315710kLJ) this.mView).setLoopCount(i);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setObjectFit(String str) {
        ((C1315710kLJ) this.mView).setScaleType(C1316130kLz.LIZIZ(str));
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setPlaceholder(String str) {
        this.mHasPendingPlaceholder = true;
        this.mOriginPlaceholder = str;
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setPreFetchHeight(String str) {
        ((C1315710kLJ) this.mView).setPreFetchHeight(C1312920kGo.LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LLJJJ));
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setPreFetchWidth(String str) {
        ((C1315710kLJ) this.mView).setPreFetchWidth(C1312920kGo.LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LLJJJ));
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "progressive-rendering")
    public void setProgressiveRendering(boolean z) {
        ((C1315710kLJ) this.mView).setProgressiveRendering(z);
    }

    @InterfaceC1312540kGC(name = "region-to-decode")
    public void setRegionToDecode(ReadableMap readableMap) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setRegionToDecode(C1298150jsz.LIZJ(readableMap));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setRepeat(boolean z) {
        ((C1315710kLJ) this.mView).setRepeat(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "android-simple-cache-key")
    public void setSimpleCacheKey(boolean z) {
        ((C1315710kLJ) this.mView).setSimpleCacheKey(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(defaultBoolean = false, name = "skip-redirection")
    public void setSkipRedirection(boolean z) {
        this.mSkipRedirection = z;
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setSource(String str) {
        if (str == null) {
            str = "";
        }
        String str2 = this.mSources;
        if (str2 != null && !str2.equals(str)) {
            this.mImageDstWidth = 0;
            this.mImageDstHeight = 0;
        }
        this.mSources = str;
        this.mHasPendingSource = true;
    }

    @InterfaceC1312540kGC(name = "subsample")
    public void setSubSample(String str) {
        boolean z;
        if (str != null && (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no"))) {
            z = true;
        } else {
            z = false;
        }
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setNoSubSampleMode(z);
        }
    }

    @InterfaceC1312540kGC(name = "suspendable")
    public void setSuspendable(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.mSuspendable = false;
        if (interfaceC1298070jsr != null) {
            int i = C1297710jsH.LIZ[interfaceC1298070jsr.getType().ordinal()];
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
            this.mScrollStateChangeListener = new InterfaceC1314870kJx() { // from class: X.0kLE
                @Override // X.InterfaceC1314870kJx
                public final void LIZ(int i2) {
                    UIImage uIImage = this.LIZ;
                    uIImage.mScrollState = i2;
                    if (uIImage.mPendingLoad && i2 == 0) {
                        uIImage.mPendingLoad = false;
                        uIImage.reloadImage();
                    }
                }
            };
        }
        registerScrollStateListener(this.mScrollStateChangeListener);
    }

    @InterfaceC1312540kGC(name = "tint-color")
    public void setTintColor(String str) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).setTintColor(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    @InterfaceC1312540kGC(defaultInt = 1, name = "visibility")
    public void setVisibility(int i) {
        super.setVisibility(i);
        T t = this.mView;
        if (((C1315710kLJ) t).mIsFrescoVisible) {
            ((C1315710kLJ) t).setFrescoVisible();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updatePropertiesInterval(C1311730kEt c1311730kEt) {
        super.updatePropertiesInterval(c1311730kEt);
        if (this.mSkipRedirection) {
            s sVar = this.mContext;
            if (sVar != null) {
                sVar.getClass();
            }
        } else {
            T t = this.mView;
            if (t != 0) {
                ((C1315710kLJ) t).updateRedirectCheckResult(this.mSources, this.mOriginPlaceholder, this.mHasPendingSource, this.mHasPendingPlaceholder);
            }
        }
        if (this.mEnableImageAsyncRedirectOnCreate) {
            updateImageSource();
        }
    }

    public UIImage(s sVar) {
        super(sVar);
    }

    public void setLocalCache(Boolean bool) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        if (bool == null) {
            ((C1315710kLJ) t).setLocalCache(false);
        }
        ((C1315710kLJ) this.mView).setLocalCache(bool.booleanValue());
    }

    public UIImage(s sVar, Object obj) {
        super(sVar, obj);
    }

    @InterfaceC1967107nB
    public void pauseAnimation(ReadableMap readableMap, Callback callback) {
        T t = this.mView;
        if (t != 0) {
            if (((C1315710kLJ) t).pauseAnimate()) {
                callback.invoke(0, "Animation paused.");
            } else {
                callback.invoke(4, "Not support pause yet");
            }
        }
    }

    @InterfaceC1967107nB
    public void resumeAnimation(ReadableMap readableMap, Callback callback) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).startAnimate();
            callback.invoke(0, "Animation resumed.");
        }
    }

    @InterfaceC1967107nB
    public void stopAnimation(ReadableMap readableMap, Callback callback) {
        T t = this.mView;
        if (t != 0) {
            ((C1315710kLJ) t).stopAnimate();
            callback.invoke(0, "Animation stopped.");
        }
    }

    public T onCreateView(Context context, AbstractC1320720kTO abstractC1320720kTO, GlobalImageLoadListener globalImageLoadListener, Object obj, LynxBaseUI lynxBaseUI) {
        AbstractC1320720kTO abstractC1320720kTO2 = this.mDraweeControllerBuilder;
        this.mContext.getClass();
        return (T) new C1315710kLJ(context, abstractC1320720kTO2, null, null, this);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onBeforeAnimation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 > this.mImageDstWidth || i4 > this.mImageDstHeight) {
            ((C1315710kLJ) this.mView).tryFetchImage(i3, i4, i5, i6, i7, i8);
        }
    }
}
