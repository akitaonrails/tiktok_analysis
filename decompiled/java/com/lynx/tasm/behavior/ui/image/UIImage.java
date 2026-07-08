package com.lynx.tasm.behavior.ui.image;

import X.C1299120juY;
import X.C1310110kCH;
import X.C1311730kEt;
import X.C1311740kEu;
import X.C1313210kHH;
import X.C1315680kLG;
import X.C1316590kMj;
import X.EnumC1311070kDp;
import X.InterfaceC1967107nB;
import android.graphics.Canvas;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.view.UIView;
import j27.s;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class UIImage extends UIView {
    public C1315680kLG LL;

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getInitialOverflowType() {
        return 0;
    }

    public final void LJJIJ() {
        if (this.LL != null) {
            return;
        }
        C1315680kLG c1315680kLG = new C1315680kLG(this.mContext);
        this.LL = c1315680kLG;
        c1315680kLG.LLLIIII = this;
        c1315680kLG.LJIJ(this.mEvents);
        this.LL.LJJI(this.mProps);
        this.LL.LJIIJ(getWidth(), getHeight(), this.mPaddingLeft, this.mPaddingRight, this.mPaddingTop, this.mPaddingBottom);
        this.LL.LJIIJJI();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final EnumC1311070kDp getMeaningfulContentStatus() {
        C1315680kLG c1315680kLG = this.LL;
        return (c1315680kLG == null || !c1315680kLG.LIZLLL().booleanValue()) ? EnumC1311070kDp.PENDING : EnumC1311070kDp.PRESENTED;
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        C1315680kLG c1315680kLG = this.LL;
        if (c1315680kLG != null) {
            c1315680kLG.LIZJ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        LJJIJ();
        super.onLayoutUpdated();
        this.LL.LJIIJ(getWidth(), getHeight(), this.mPaddingLeft, this.mPaddingRight, this.mPaddingTop, this.mPaddingBottom);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        LJJIJ();
        super.onNodeReady();
        T t = this.mLynxBackground.LIZIZ;
        if (t != 0) {
            this.LL.LJIIZILJ(t.LIZIZ());
            if (this.mLynxBackground.LJIIL() != null) {
                boolean zLIZLLL = this.mLynxBackground.LJIIL().LIZLLL(getWidth(), getHeight());
                C1315680kLG c1315680kLG = this.LL;
                float[] fArrLIZ = this.mLynxBackground.LJIIL().LIZ();
                if (c1315680kLG.LLLF == null || zLIZLLL) {
                    c1315680kLG.LL |= 4096;
                }
                c1315680kLG.LLLF = fArrLIZ;
            }
        }
        this.LL.LJIIJJI();
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        LJJIJ();
        super.onPropsUpdated();
        this.LL.getClass();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAttach() {
        super.onAttach();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        super.onDetach();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, X.InterfaceC1314130kIl
    public final void beforeDraw(Canvas canvas) {
        LJJIJ();
        super.beforeDraw(canvas);
        this.LL.LJII(canvas);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, X.InterfaceC1314320kJ4
    public final void beforeProcessViewInfo(C1313210kHH c1313210kHH) {
        LJJIJ();
        C1315680kLG c1315680kLG = this.LL;
        if (c1315680kLG != null) {
            this.mViewInfo.LLJJI = c1315680kLG;
        }
        super.beforeProcessViewInfo(c1313210kHH);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void detachWithViewInfo(C1313210kHH c1313210kHH) {
        C1315680kLG c1315680kLG = this.LL;
        if (c1315680kLG != null) {
            c1315680kLG.LLLIIII = null;
            C1313210kHH c1313210kHH2 = this.mViewInfo;
            if (c1313210kHH2 == null) {
                c1313210kHH2 = c1313210kHH;
            }
            c1315680kLG.LLLIIIIL = c1313210kHH2;
            this.mContext.LJIILL().registerImageAccordingToNodeIndex(this.mNodeIndex, this.LL);
            this.LL = null;
        }
        super.detachWithViewInfo(c1313210kHH);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        LJJIJ();
        super.setEvents(map);
        this.LL.LJIJ(map);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setImageRendering(int i) {
        boolean z;
        LJJIJ();
        super.setImageRendering(i);
        C1315680kLG c1315680kLG = this.LL;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        c1315680kLG.LLLLIILLL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updatePropertiesInterval(C1311730kEt c1311730kEt) {
        LJJIJ();
        super.updatePropertiesInterval(c1311730kEt);
        this.LL.LJJI(c1311730kEt.LIZ);
    }

    public UIImage(s sVar, Object obj) {
        super(sVar, obj);
        s sVar2 = this.mContext;
        if (sVar2 != null && sVar2.LLLIIIL && sVar2.LJIILL() != null && (obj instanceof C1311740kEu)) {
            this.mNodeIndex = ((C1311740kEu) obj).LIZIZ;
            this.LL = sVar.LJIILL().obtainImageAccordingToNodeIndex(this.mNodeIndex);
        }
        if (this.LL == null) {
            this.LL = new C1315680kLG(this.mContext);
        }
        this.LL.LLLIIII = this;
        this.mView.setWillNotDraw(false);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final C1310110kCH convertToMeaningfulPaintingArea(int i, int i2) {
        C1316590kMj c1316590kMj;
        if (getMeaningfulContentStatus() == EnumC1311070kDp.IRRELEVANT) {
            return null;
        }
        C1315680kLG c1315680kLG = this.LL;
        if (c1315680kLG != null && (c1316590kMj = c1315680kLG.LLLLLJIL) != null) {
            c1316590kMj.LJ();
        }
        int originLeft = i + getOriginLeft();
        int originTop = i2 + getOriginTop();
        int width = getWidth();
        int height = getHeight();
        C1315680kLG c1315680kLG2 = this.LL;
        if (c1315680kLG2 != null) {
            c1315680kLG2.LIZLLL().booleanValue();
        }
        C1310110kCH c1310110kCH = new C1310110kCH(originLeft, originTop, width, height);
        T t = this.mView;
        if (t != 0) {
            t.getAlpha();
        } else {
            getAlpha();
        }
        T t2 = this.mView;
        if (t2 != 0) {
            t2.getScaleX();
        } else {
            getScaleX();
        }
        T t3 = this.mView;
        if (t3 != 0) {
            t3.getScaleY();
        } else {
            getScaleY();
        }
        T t4 = this.mView;
        if (t4 != 0) {
            t4.getVisibility();
        } else {
            getVisibility();
        }
        c1310110kCH.LJ = getMeaningfulContentStatus();
        c1310110kCH.LJFF = getFirstMeaningfulContentPresentedTimestampMicros();
        return c1310110kCH;
    }

    @InterfaceC1967107nB
    public void pauseAnimation(ReadableMap readableMap, Callback callback) {
        LJJIJ();
        this.LL.LJIIL(callback);
    }

    @InterfaceC1967107nB
    public void resumeAnimation(ReadableMap readableMap, Callback callback) {
        LJJIJ();
        this.LL.LJIILL(callback);
    }

    @InterfaceC1967107nB
    public void startAnimate(ReadableMap readableMap, Callback callback) {
        LJJIJ();
        this.LL.LJIJJLI(callback);
    }

    @InterfaceC1967107nB
    public void stopAnimation(ReadableMap readableMap, Callback callback) {
        LJJIJ();
        this.LL.LJIL(callback);
    }
}
