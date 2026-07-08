package com.lynx.tasm.behavior.ui.scroll;

import X.C1298700jts;
import X.C1311130kDv;
import X.C1318190kPJ;
import X.C1318220kPM;
import X.InterfaceC1318200kPK;
import X.InterfaceC1318480kPm;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollViewInternal extends UISimpleView<C1318190kPJ> implements InterfaceC1318200kPK {
    public static final /* synthetic */ int LLJ = 0;
    public long LL;
    public long LLILLJJLI;
    public int[] LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public ArrayList<InterfaceC1318480kPm> LLIZLLLIL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollContainer() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollable() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < getChildCount(); i++) {
            LynxBaseUI childAt = getChildAt(i);
            iMax2 = Math.max(iMax2, childAt.getHeight() + childAt.getTop() + childAt.mMarginBottom + this.mPaddingBottom);
            iMax = Math.max(iMax, childAt.getWidth() + childAt.getLeft() + childAt.mMarginRight + this.mPaddingRight);
        }
        ((C1318220kPM) this.mView).setScrollContentSize(new int[]{iMax, iMax2});
        if (this.mFirstRender) {
            Iterator<InterfaceC1318480kPm> it2 = this.LLIZLLLIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(this);
            }
            this.LLIZLLLIL = null;
            this.mFirstRender = false;
        }
        LJJIJIIJI();
        super.measure();
    }

    public final void LJJIJIIJI() {
        C1318220kPM c1318220kPM = (C1318220kPM) this.mView;
        int scrollOffsetVertically = c1318220kPM.LLILLL ? c1318220kPM.getScrollOffsetVertically() : c1318220kPM.getScrollOffsetHorizontally();
        int[] scrollRangeVertically = c1318220kPM.LLILLL ? c1318220kPM.getScrollRangeVertically() : c1318220kPM.getScrollRangeHorizontally();
        boolean z = scrollOffsetVertically <= scrollRangeVertically[0] + this.LLILZ;
        boolean z2 = scrollOffsetVertically >= scrollRangeVertically[1] - this.LLILZIL;
        if (z && !this.LLILZLL) {
            LJJIJ("scrolltoupper", null);
        }
        if (z2 && !this.LLIZ) {
            LJJIJ("scrolltolower", null);
        }
        this.LLILZLL = z;
        this.LLIZ = z2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        return this.mView.getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        return this.mView.getScrollY();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        ((C1318220kPM) this.mView).setScrollDelegate(null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        ((C1318220kPM) this.mView).LLILZ = getWidth();
        ((C1318220kPM) this.mView).LLILZIL = getHeight();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        super.onNodeReady();
    }

    public LynxUIScrollViewInternal(s sVar) {
        super(sVar);
        this.LLILLL = new int[]{0, 0};
        this.LLIZLLLIL = new ArrayList<>();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        C1318190kPJ c1318190kPJ = new C1318190kPJ(context);
        c1318190kPJ.setScrollDelegate(this);
        return c1318190kPJ;
    }

    public final void LJJIJ(String str, HashMap<String, Object> map) {
        HashMap map2 = new HashMap();
        C1318220kPM c1318220kPM = (C1318220kPM) this.mView;
        map2.put("scrollLeft", Float.valueOf(C1311130kDv.LIZJ(c1318220kPM.getScrollOffsetHorizontally())));
        map2.put("scrollTop", Float.valueOf(C1311130kDv.LIZJ(c1318220kPM.getScrollOffsetVertically())));
        boolean z = true;
        map2.put("scrollHeight", Float.valueOf(C1311130kDv.LIZJ(c1318220kPM.getScrollRangeVertically()[1])));
        map2.put("scrollWidth", Float.valueOf(C1311130kDv.LIZJ(c1318220kPM.getScrollRangeHorizontally()[1])));
        if (c1318220kPM.LLIZLLLIL != 1) {
            z = false;
        }
        map2.put("isDragging", Boolean.valueOf(z));
        map2.put("scrollState", Integer.valueOf(c1318220kPM.LLIZLLLIL));
        if (map != null) {
            map2.putAll(map);
        }
        this.mContext.LLIZ.LIZIZ(new C1298700jts(getSign(), str, map2));
    }

    public static int[] LJJIIZI(LynxBaseUI lynxBaseUI, LynxUIScrollViewInternal lynxUIScrollViewInternal, boolean z) {
        int[] iArr = {0, 0};
        if (lynxUIScrollViewInternal != null && lynxBaseUI != null) {
            if (z) {
                iArr[0] = (((C1318220kPM) lynxUIScrollViewInternal.mView).getScrollRange()[1] - lynxBaseUI.getLeft()) - lynxBaseUI.getWidth();
                iArr[1] = lynxBaseUI.getTop();
            } else {
                iArr[0] = lynxBaseUI.getLeft();
                iArr[1] = lynxBaseUI.getTop();
                return iArr;
            }
        }
        return iArr;
    }
}
