package com.bytedance.ies.xelement.banner;

import X.C1299120juY;
import X.C1312920kGo;
import X.C1339320kxO;
import X.C1888060zES;
import X.C21607519hJ;
import X.C786410Ut5;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.featurecount.LynxFeatureCounter;
import com.lynx.tasm.utils.ColorUtils;
import cx4.c;
import j27.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes34.dex */
public class LynxSwiperView extends UISimpleView<c> {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public int LLILZIL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityDirectionVertical() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityHostUI() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollable() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final View getAccessibilityHostView() {
        return ((c) this.mView).LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        this.mView.setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
        ((c) this.mView).LLJJJJLIIL = getWidth();
        ((c) this.mView).LJII();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReload() {
        super.onNodeReload();
        ((c) this.mView).LJI(0);
    }

    public LynxSwiperView(Context context) {
        super((s) context, null);
    }

    public final int LJJIIZI(InterfaceC1298070jsr interfaceC1298070jsr) {
        Integer numValueOf;
        int iIntValue;
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            String strAsString = interfaceC1298070jsr.asString();
            if ((u.LJIIZILJ(strAsString, "px", false) || u.LJIIZILJ(strAsString, "rpx", false)) && (iIntValue = (numValueOf = Integer.valueOf((int) C1312920kGo.LIZLLL(strAsString, 0.0f, 10.0f, this.mContext.LLJJJ))).intValue()) >= 0 && iIntValue <= this.mContext.LLJJJ.widthPixels) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        LynxFeatureCounter.LIZ(71, this.mContext.LLJLILLLLZIIL);
        LynxError lynxError = new LynxError(220101, "A legacy x-swiper is created, please use the new x-swiper instead.", "Please check the official Lynx documentation to enable the `useNewSwiper` config", "error");
        lynxError.LIZ = true;
        this.mContext.LJIILLIIL(lynxError);
        c cVar = new c(context);
        cVar.setTwoItemCircularSwipe(false);
        cVar.setOnPageChangeListener(new C1339320kxO(this, 3));
        return cVar;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            c cVar = (c) this.mView;
            Iterator it2 = ((CopyOnWriteArrayList) cVar.LLJLLIL).iterator();
            while (it2.hasNext()) {
                if (it2.next() == lynxBaseUI) {
                    ((CopyOnWriteArrayList) cVar.LLJLLIL).remove(lynxBaseUI);
                    if (cVar.LLJILLL) {
                        try {
                            ((ArrayList) cVar.LLJJL).remove(0);
                            LinearLayout linearLayout = cVar.LLJL;
                            C786410Ut5.LJJL(linearLayout.getChildAt(0), linearLayout);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (cVar.LLJLIL != null) {
                        cVar.LJ();
                        cVar.LLJLIL.notifyDataSetChanged();
                    }
                    cVar.LIZJ();
                    return;
                }
            }
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "autoplay")
    public final void setAutoPlay(boolean z) {
        c cVar = (c) this.mView;
        cVar.LLJJI = z;
        cVar.LJIIIIZZ();
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "circular")
    public final void setCircular(boolean z) {
        c cVar = (c) this.mView;
        if (cVar.LLJJ != z) {
            int iLJIIIZ = cVar.LJIIIZ(cVar.LLJJLIIIJLLLLLLLZ.getCurrentItem());
            cVar.LLJJ = z;
            C21607519hJ c21607519hJ = cVar.LLJLIL;
            if (c21607519hJ != null) {
                c21607519hJ.notifyDataSetChanged();
                cVar.LLJJLIIIJLLLLLLLZ.setCurrentItem(iLJIIIZ);
            }
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "current")
    public final void setCurrentIndex(int i) {
        ((c) this.mView).LJI(i);
    }

    @InterfaceC1312540kGC(name = "current-item-id")
    public final void setCurrentItemId(String str) {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            if (Intrinsics.LJFF(lynxBaseUI.mName, str)) {
                if (lynxBaseUI != null) {
                    ((c) this.mView).LJI(this.mChildren.indexOf(lynxBaseUI));
                    return;
                }
                return;
            }
        }
    }

    @InterfaceC1312540kGC(defaultInt = 500, name = "duration")
    public final void setDuration(int i) {
        ((c) this.mView).LLILZLL = i;
    }

    @InterfaceC1312540kGC(name = "end-margin")
    public final void setEndMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        ((c) this.mView).LLJIJIL = LJJIIZI(interfaceC1298070jsr);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LL = map.containsKey("change");
            this.LLILLJJLI = map.containsKey("transition");
            this.LLILLL = map.containsKey("scrollstart");
            this.LLILZ = map.containsKey("scrollend");
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "hideshadow")
    public final void setHideShadow(boolean z) {
        ((c) this.mView).LLJJIJI = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "indicator-dots")
    public final void setIndicator(boolean z) {
        ((c) this.mView).LLJILLL = z;
    }

    @InterfaceC1312540kGC(name = "indicator-active-color")
    public final void setIndicatorActiveColor(String str) {
        try {
            ((c) this.mView).LLJJJ = ColorUtils.LIZIZ(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @InterfaceC1312540kGC(name = "indicator-color")
    public final void setIndicatorColor(String str) {
        try {
            ((c) this.mView).LLJJJIL = ColorUtils.LIZIZ(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @InterfaceC1312540kGC(defaultInt = 5000, name = "interval")
    public final void setInterval(int i) {
        c cVar = (c) this.mView;
        cVar.LLILZIL = i;
        cVar.LJIIIIZZ();
    }

    @InterfaceC1312540kGC(name = "item-width")
    public final void setItemWidth(InterfaceC1298070jsr interfaceC1298070jsr) {
        ((c) this.mView).LLJILJIL = LJJIIZI(interfaceC1298070jsr);
    }

    @InterfaceC1312540kGC(name = "mode")
    public final void setMode(String str) {
        c cVar = (c) this.mView;
        cVar.LLJILJILJ = str;
        if (!str.equals("coverflow") && !str.equals("flat-coverflow")) {
            cVar.LLJJIJI = true;
            cVar.LLJJIJIL = Color.argb(128, 0, 0, 0);
        }
        cVar.LJFF(cVar.LLIZ, cVar.LLIZLLLIL, cVar.LLJ, cVar.LLJILJILJ);
    }

    @InterfaceC1312540kGC(name = "next-margin")
    public final void setNextMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        Integer numValueOf;
        int iIntValue;
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            String strAsString = interfaceC1298070jsr.asString();
            if ((u.LJIIZILJ(strAsString, "px", false) || u.LJIIZILJ(strAsString, "rpx", false)) && (iIntValue = (numValueOf = Integer.valueOf((int) C1312920kGo.LIZLLL(strAsString, 0.0f, -1.0f, this.mContext.LLJJJ))).intValue()) >= 0 && iIntValue <= this.mContext.LLJJJ.widthPixels) {
                int iIntValue2 = numValueOf.intValue();
                c cVar = (c) this.mView;
                cVar.LLJ = iIntValue2;
                cVar.LJFF(cVar.LLIZ, cVar.LLIZLLLIL, iIntValue2, cVar.LLJILJILJ);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(int i) {
        super.setOverflow(i);
        ((c) this.mView).setOverflow(i);
    }

    @InterfaceC1312540kGC(name = "page-margin")
    public final void setPageMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        Integer numValueOf;
        int iIntValue;
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            String strAsString = interfaceC1298070jsr.asString();
            if ((u.LJIIZILJ(strAsString, "px", false) || u.LJIIZILJ(strAsString, "rpx", false)) && (iIntValue = (numValueOf = Integer.valueOf((int) C1312920kGo.LIZLLL(strAsString, 0.0f, 10.0f, this.mContext.LLJJJ))).intValue()) >= 0 && iIntValue <= this.mContext.LLJJJ.widthPixels) {
                int iIntValue2 = numValueOf.intValue();
                c cVar = (c) this.mView;
                cVar.LLIZ = iIntValue2;
                cVar.LJFF(iIntValue2, cVar.LLIZLLLIL, cVar.LLJ, cVar.LLJILJILJ);
            }
        }
    }

    @InterfaceC1312540kGC(name = "previous-margin")
    public final void setPreviousMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        Integer numValueOf;
        int iIntValue;
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            String strAsString = interfaceC1298070jsr.asString();
            if ((u.LJIIZILJ(strAsString, "px", false) || u.LJIIZILJ(strAsString, "rpx", false)) && (iIntValue = (numValueOf = Integer.valueOf((int) C1312920kGo.LIZLLL(strAsString, 0.0f, -1.0f, this.mContext.LLJJJ))).intValue()) >= 0 && iIntValue <= this.mContext.LLJJJ.widthPixels) {
                int iIntValue2 = numValueOf.intValue();
                c cVar = (c) this.mView;
                cVar.LLIZLLLIL = iIntValue2;
                cVar.LJFF(cVar.LLIZ, iIntValue2, cVar.LLJ, cVar.LLJILJILJ);
            }
        }
    }

    @InterfaceC1312540kGC(name = "hardware_texture")
    public final void setRenderHardwareTexture(boolean z) {
        if (z) {
            ((c) this.mView).setLayerTextureType(2);
        } else {
            ((c) this.mView).setLayerTextureType(0);
        }
    }

    @InterfaceC1312540kGC(name = "shadow-color")
    public final void setShadowColor(String str) {
        try {
            ((c) this.mView).LLJJIJIL = ColorUtils.LIZIZ(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "smooth-scroll")
    public final void setSmoothScroll(boolean z) {
        c cVar = (c) this.mView;
        cVar.LLJJIJIIJIL = z;
        cVar.LJFF(cVar.LLIZ, cVar.LLIZLLLIL, cVar.LLJ, cVar.LLJILJILJ);
    }

    @InterfaceC1312540kGC(name = "start-margin")
    public final void setStartMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        ((c) this.mView).LLJI = LJJIIZI(interfaceC1298070jsr);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "touchable")
    public final void setTouchable(boolean z) {
        c cVar = (c) this.mView;
        cVar.LLJJIII = z;
        C1888060zES c1888060zES = cVar.LLJJLIIIJLLLLLLLZ;
        if (c1888060zES != null) {
            c1888060zES.setScrollable(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        if (lynxBaseUI instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            c cVar = (c) this.mView;
            if (lynxBaseUI != null) {
                ((CopyOnWriteArrayList) cVar.LLJLLIL).add(lynxBaseUI);
                if (cVar.LLJILLL) {
                    View view = new View(cVar.getContext());
                    view.setClickable(false);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(cVar.LLILLL, cVar.LLILZ);
                    int i2 = cVar.LLILLJJLI;
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i2;
                    cVar.LLJL.addView(view, layoutParams);
                    view.setBackground(c.LIZ(cVar.LLJJJIL));
                    ((ArrayList) cVar.LLJJL).add(view);
                }
            }
            if (cVar.LLJLIL != null) {
                cVar.LJ();
                cVar.LLJLIL.notifyDataSetChanged();
            }
            cVar.LIZJ();
            lynxBaseUI.setParent(this);
        }
    }
}
