package com.lynx.tasm.behavior.ui.scroll;

import X.C1292490jjr;
import X.C1312920kGo;
import X.C1318190kPJ;
import X.C1318220kPM;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1312540kGC;
import X.InterfaceC1318480kPm;
import X.InterfaceC1967107nB;
import X.RunnableC1318230kPN;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import android.view.Display;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.scroll.LynxUIScrollViewInternal;
import j27.s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollView extends LynxUIScrollViewInternal {
    public LynxUIScrollView(s sVar) {
        super(sVar);
    }

    @InterfaceC1312540kGC(name = "backwards-nested-scroll")
    public void setBackwardsNestedScroll(int i) {
        ((C1318190kPJ) this.mView).setBackwardNestedScrollMode(i);
    }

    @InterfaceC1312540kGC(name = "bounces")
    public void setBounces(boolean z) {
        ((C1318220kPM) this.mView).LLILLJJLI = z;
    }

    @InterfaceC1312540kGC(name = "enable-scroll")
    public void setEnableScroll(boolean z) {
        ((C1318220kPM) this.mView).LLILZLL = z;
    }

    @InterfaceC1312540kGC(name = "forwards-nested-scroll")
    public void setForwardsNestedScroll(int i) {
        ((C1318190kPJ) this.mView).setForwardNestedScrollMode(i);
    }

    @InterfaceC1312540kGC(name = "initial-scroll-index")
    public void setInitialScrollIndex(final int i) {
        ArrayList<InterfaceC1318480kPm> arrayList = this.LLIZLLLIL;
        if (arrayList != null) {
            arrayList.add(new InterfaceC1318480kPm() { // from class: X.0kPS
                @Override // X.InterfaceC1318480kPm
                public final void LIZ(LynxUIScrollViewInternal lynxUIScrollViewInternal) {
                    int i2 = i;
                    int i3 = LynxUIScrollViewInternal.LLJ;
                    if (i2 >= 0 && i2 < lynxUIScrollViewInternal.getChildCount()) {
                        ((C1318220kPM) lynxUIScrollViewInternal.mView).LJFF(LynxUIScrollViewInternal.LJJIIZI(lynxUIScrollViewInternal.getChildAt(i2), lynxUIScrollViewInternal, lynxUIScrollViewInternal.isRtl()));
                    }
                }
            });
        }
    }

    @InterfaceC1312540kGC(name = "initial-scroll-offset")
    public void setInitialScrollOffset(final String str) {
        ArrayList<InterfaceC1318480kPm> arrayList = this.LLIZLLLIL;
        if (arrayList != null) {
            arrayList.add(new InterfaceC1318480kPm() { // from class: X.0kPL
                @Override // X.InterfaceC1318480kPm
                public final void LIZ(LynxUIScrollViewInternal lynxUIScrollViewInternal) {
                    int width;
                    LynxUIScrollViewInternal lynxUIScrollViewInternal2 = this;
                    String str2 = str;
                    int i = LynxUIScrollViewInternal.LLJ;
                    lynxUIScrollViewInternal2.getClass();
                    if (((C1318220kPM) lynxUIScrollViewInternal.mView).LLILLL) {
                        width = lynxUIScrollViewInternal.getHeight();
                    } else {
                        width = lynxUIScrollViewInternal.getWidth();
                    }
                    int iLIZLLL = (int) C1312920kGo.LIZLLL(str2, width, 0.0f, lynxUIScrollViewInternal2.mContext.LLJJJ);
                    int[] iArr = {iLIZLLL, iLIZLLL};
                    if (lynxUIScrollViewInternal.isRtl()) {
                        iArr[0] = ((C1318220kPM) lynxUIScrollViewInternal.mView).getScrollRange()[1] - iArr[0];
                    }
                    ((C1318220kPM) lynxUIScrollViewInternal.mView).LJFF(iArr);
                }
            });
        }
    }

    @InterfaceC1312540kGC(name = "lower-threshold")
    public void setLowerThreshold(String str) {
        int width;
        if (((C1318220kPM) this.mView).LLILLL) {
            width = getHeight();
        } else {
            width = getWidth();
        }
        this.LLILZIL = (int) C1312920kGo.LIZLLL(str, width, 0.0f, this.mContext.LLJJJ);
    }

    @InterfaceC1312540kGC(name = "scroll-event-throttle")
    public void setScrollEventThrottle(float f) {
        this.LL = (long) f;
    }

    @InterfaceC1312540kGC(name = "scroll-orientation")
    public void setScrollOrientation(String str) {
        ((C1318190kPJ) this.mView).setVertical("vertical".equals(str));
    }

    @InterfaceC1312540kGC(name = "upper-threshold")
    public void setUpperThreshold(String str) {
        int width;
        if (((C1318220kPM) this.mView).LLILLL) {
            width = getHeight();
        } else {
            width = getWidth();
        }
        this.LLILZ = (int) C1312920kGo.LIZLLL(str, width, 0.0f, this.mContext.LLJJJ);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0kPR] */
    @InterfaceC1967107nB
    public void autoScroll(ReadableMap readableMap, Callback callback) {
        int width;
        int iMin;
        DisplayManager displayManager;
        Display display;
        if (readableMap.getBoolean("start", true)) {
            String string = readableMap.getString("rate", "0px");
            if (((C1318220kPM) this.mView).LLILLL) {
                width = getHeight();
            } else {
                width = getWidth();
            }
            int iLIZLLL = (int) C1312920kGo.LIZLLL(string, width, 0.0f, this.mContext.LLJJJ);
            s sVar = this.mContext;
            float refreshRate = 60.0f;
            if (sVar != null && (displayManager = (DisplayManager) sVar.LIZ().getSystemService(DisplayManager.class)) != null && (display = displayManager.getDisplay(0)) != null) {
                refreshRate = display.getRefreshRate();
            }
            int i = (int) refreshRate;
            if (i <= 0) {
                i = 60;
            }
            C1318220kPM c1318220kPM = (C1318220kPM) this.mView;
            if (iLIZLLL > 0) {
                iMin = Math.max(iLIZLLL / i, 1);
            } else {
                iMin = Math.min(iLIZLLL / i, -1);
            }
            c1318220kPM.LJIIIIZZ(2);
            c1318220kPM.LJIIIZ();
            final RunnableC1318230kPN runnableC1318230kPN = c1318220kPM.LL;
            runnableC1318230kPN.LJII(false);
            runnableC1318230kPN.LJIIIIZZ();
            runnableC1318230kPN.LLILZ = iMin;
            runnableC1318230kPN.LLILZIL = new Choreographer.FrameCallback() { // from class: X.0kPR
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    RunnableC1318230kPN runnableC1318230kPN2 = runnableC1318230kPN;
                    int i2 = runnableC1318230kPN2.LLILZ;
                    C1318240kPO c1318240kPO = runnableC1318230kPN2.LLILZLL;
                    if (i2 < 0 ? !(!c1318240kPO.LLILLL ? c1318240kPO.getScrollOffsetHorizontally() > c1318240kPO.getScrollRangeHorizontally()[0] : c1318240kPO.getScrollOffsetVertically() > c1318240kPO.getScrollRangeVertically()[0]) : !(!c1318240kPO.LLILLL ? c1318240kPO.getScrollOffsetHorizontally() < c1318240kPO.getScrollRangeHorizontally()[1] : c1318240kPO.getScrollOffsetVertically() < c1318240kPO.getScrollRangeVertically()[1])) {
                        runnableC1318230kPN.LJIIIIZZ();
                        return;
                    }
                    RunnableC1318230kPN runnableC1318230kPN3 = runnableC1318230kPN;
                    int i3 = runnableC1318230kPN3.LLILZ;
                    C1318240kPO c1318240kPO2 = runnableC1318230kPN3.LLILZLL;
                    if (c1318240kPO2.LLILLL) {
                        int scrollY = c1318240kPO2.getScrollY() + i3;
                        int[] scrollRangeVertically = c1318240kPO2.getScrollRangeVertically();
                        c1318240kPO2.LJII(Math.min(Math.max(scrollY, scrollRangeVertically[0]), scrollRangeVertically[1]));
                    } else {
                        int scrollX = c1318240kPO2.getScrollX() + i3;
                        int[] scrollRangeHorizontally = c1318240kPO2.getScrollRangeHorizontally();
                        c1318240kPO2.LJI(Math.min(Math.max(scrollX, scrollRangeHorizontally[0]), scrollRangeHorizontally[1]));
                    }
                    if (runnableC1318230kPN.LLILZIL == null) {
                        return;
                    }
                    C786410Ut5.v2().postFrameCallback(runnableC1318230kPN.LLILZIL);
                }
            };
            C786410Ut5.v2().postFrameCallback(runnableC1318230kPN.LLILZIL);
            runnableC1318230kPN.LLILLJJLI = null;
        } else {
            C1318220kPM c1318220kPM2 = (C1318220kPM) this.mView;
            c1318220kPM2.LL.LJII(false);
            c1318220kPM2.LL.LJIIIIZZ();
            c1318220kPM2.LJIIIIZZ(0);
        }
        callback.invoke(0);
    }

    @InterfaceC1967107nB
    public void getScrollInfo(ReadableMap readableMap, Callback callback) {
        C1318220kPM c1318220kPM = (C1318220kPM) this.mView;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("scrollLeft", C1292490jjr.LJI(c1318220kPM.getScrollOffsetHorizontally(), this.mContext));
        javaOnlyMap.putInt("scrollTop", C1292490jjr.LJI(c1318220kPM.getScrollOffsetVertically(), this.mContext));
        javaOnlyMap.putInt("scrollWidth", C1292490jjr.LJI(c1318220kPM.getScrollRangeHorizontally()[1], this.mContext));
        javaOnlyMap.putInt("scrollHeight", C1292490jjr.LJI(c1318220kPM.getScrollRangeVertically()[1], this.mContext));
        callback.invoke(0, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public void scrollBy(ReadableMap readableMap, Callback callback) {
        int width;
        String string = readableMap.getString("offset", "0px");
        if (((C1318220kPM) this.mView).LLILLL) {
            width = getHeight();
        } else {
            width = getWidth();
        }
        int iLIZLLL = (int) C1312920kGo.LIZLLL(string, width, 0.0f, this.mContext.LLJJJ);
        C1318220kPM c1318220kPM = (C1318220kPM) this.mView;
        if (c1318220kPM.LLILLL) {
            int scrollY = c1318220kPM.getScrollY() + iLIZLLL;
            int[] scrollRangeVertically = c1318220kPM.getScrollRangeVertically();
            c1318220kPM.LJII(Math.min(Math.max(scrollY, scrollRangeVertically[0]), scrollRangeVertically[1]));
        } else {
            int scrollX = c1318220kPM.getScrollX() + iLIZLLL;
            int[] scrollRangeHorizontally = c1318220kPM.getScrollRangeHorizontally();
            c1318220kPM.LJI(Math.min(Math.max(scrollX, scrollRangeHorizontally[0]), scrollRangeHorizontally[1]));
        }
        callback.invoke(0);
    }

    @InterfaceC1967107nB
    public void scrollTo(ReadableMap readableMap, Callback callback) {
        int width;
        int i;
        String string = readableMap.getString("offset", "0px");
        if (((C1318220kPM) this.mView).LLILLL) {
            width = getHeight();
        } else {
            width = getWidth();
        }
        int iLIZLLL = (int) C1312920kGo.LIZLLL(string, width, 0.0f, this.mContext.LLJJJ);
        boolean z = readableMap.getBoolean("smooth", readableMap.getBoolean("animated", true));
        int i2 = readableMap.getInt("index", -1);
        if (i2 >= 0 && i2 < getChildCount()) {
            int[] iArrLJJIIZI = LynxUIScrollViewInternal.LJJIIZI(getChildAt(i2), this, isRtl());
            int[] iArr = {iLIZLLL, iLIZLLL};
            boolean zIsRtl = isRtl();
            int i3 = iArrLJJIIZI[0];
            if (zIsRtl) {
                i = -iArr[0];
            } else {
                i = iArr[0];
            }
            iArrLJJIIZI[0] = i3 + i;
            iArrLJJIIZI[1] = iArrLJJIIZI[1] + iArr[1];
            if (z) {
                ((C1318220kPM) this.mView).LJ(iArrLJJIIZI);
            } else {
                ((C1318220kPM) this.mView).LJFF(iArrLJJIIZI);
            }
            callback.invoke(0);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scrollTo index: ");
        sbLIZ.append(i2);
        sbLIZ.append(" is out of range[0, ");
        sbLIZ.append(getChildCount());
        sbLIZ.append(").");
        callback.invoke(4, C2188811AlT.LIZIZ(sbLIZ));
    }
}
