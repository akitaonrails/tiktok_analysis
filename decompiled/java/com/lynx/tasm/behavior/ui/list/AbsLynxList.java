package com.lynx.tasm.behavior.ui.list;

import X.C1311860kF6;
import X.InterfaceC1298070jsr;
import X.InterfaceC1311870kF7;
import X.InterfaceC1312540kGC;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import j27.s;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbsLynxList<T extends ViewGroup> extends UISimpleView<T> {
    public final InterfaceC1311870kF7 LL;
    public LynxBaseUI LLILLJJLI;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollable() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
    }

    @InterfaceC1312540kGC(customType = "1", name = "cache-queue-ratio")
    public abstract void setCacheQueueRatio(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(defaultInt = 1, name = "column-count")
    public abstract void setColumnCount(int i);

    @InterfaceC1312540kGC(defaultBoolean = false, name = "component-init-measure")
    public abstract void setComponentInitMeasure(boolean z);

    @InterfaceC1312540kGC(customType = CardStruct.IStatusCode.DEFAULT, name = "list-cross-axis-gap")
    public abstract void setCrossAxisGap(float f);

    @InterfaceC1312540kGC(customType = "false", name = "paging-enabled")
    public abstract void setEnablePagerSnap(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(name = "sticky")
    public abstract void setEnableSticky(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(customType = CardStruct.IStatusCode.DEFAULT, name = "initial-scroll-index")
    public abstract void setInitialScrollIndex(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(defaultBoolean = false, name = "internal-cell-appear-notification")
    public void setInternalCellAppearNotification(boolean z) {
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "internal-cell-disappear-notification")
    public void setInternalCellDisappearNotification(boolean z) {
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "internal-cell-prepare-for-reuse-notification")
    public void setInternalCellPrepareForReuseNotification(boolean z) {
    }

    @InterfaceC1312540kGC(customType = "single", name = "list-type")
    public abstract void setListType(String str);

    @InterfaceC1312540kGC(defaultInt = BaseNotice.RECOMMEND_LIVE, name = "lower-threshold")
    public abstract void setLowerThreshold(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(defaultInt = 0, name = "lower-threshold-item-count")
    public void setLowerThresholdItemCount(InterfaceC1298070jsr interfaceC1298070jsr) {
    }

    @InterfaceC1312540kGC(customType = CardStruct.IStatusCode.DEFAULT, name = "list-main-axis-gap")
    public abstract void setMainAxisGap(float f);

    @InterfaceC1312540kGC(defaultBoolean = false, name = "needs-visible-cells")
    public abstract void setNeedVisibleCells(boolean z);

    @InterfaceC1312540kGC(defaultBoolean = false, name = "no-invalidate")
    public abstract void setNoInvalidate(boolean z);

    @InterfaceC1312540kGC(name = "item-snap")
    public abstract void setPagingAlignment(ReadableMap readableMap);

    @InterfaceC1312540kGC(customType = "true", name = "enable-scroll")
    public abstract void setScrollEnable(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(customType = "200", name = "scroll-event-throttle")
    public abstract void setScrollEventThrottle(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(customType = "10", name = "scroll-state-change-event-throttle")
    public abstract void setScrollStateChangeEventThrottle(String str);

    @InterfaceC1312540kGC(customType = "false", name = "scroll-x")
    public abstract void setScrollX(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(customType = "true", name = "scroll-y")
    public abstract void setScrollY(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(defaultBoolean = false, name = "should-request-state-restore")
    public void setShouldRequestStateRestore(boolean z) {
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "sticky-offset")
    public abstract void setStickyOffset(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(customType = "true", name = "touch-scroll")
    public abstract void setTouchScroll(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(customType = "none", name = "update-animation")
    public abstract void setUpdateAnimation(String str);

    @InterfaceC1312540kGC(defaultInt = BaseNotice.RECOMMEND_LIVE, name = "upper-threshold")
    public abstract void setUpperThreshold(InterfaceC1298070jsr interfaceC1298070jsr);

    @InterfaceC1312540kGC(defaultInt = 0, name = "upper-threshold-item-count")
    public void setUpperThresholdItemCount(InterfaceC1298070jsr interfaceC1298070jsr) {
    }

    public final JavaOnlyMap LJJIIZI() {
        InterfaceC1311870kF7 interfaceC1311870kF7 = this.LL;
        int sign = getSign();
        LynxTemplateRender lynxTemplateRender = ((C1311860kF6) interfaceC1311870kF7).LIZ;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJIL(sign);
        }
        return null;
    }

    public final void LJJIJIIJIL(LynxUI lynxUI) {
        InterfaceC1311870kF7 interfaceC1311870kF7 = this.LL;
        int sign = getSign();
        int sign2 = lynxUI.getSign();
        LynxTemplateRender lynxTemplateRender = ((C1311860kF6) interfaceC1311870kF7).LIZ;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJJJZI(sign, sign2);
        }
    }

    @InterfaceC1312540kGC(customType = "false", name = "over-scroll")
    public void setOverScroll(InterfaceC1298070jsr interfaceC1298070jsr) {
        boolean zAsBoolean;
        ReadableType type = interfaceC1298070jsr.getType();
        if (type == ReadableType.String) {
            zAsBoolean = "true".equals(interfaceC1298070jsr.asString());
        } else {
            if (type == ReadableType.Boolean) {
                zAsBoolean = interfaceC1298070jsr.asBoolean();
            }
            this.mView.setOverScrollMode(0);
        }
        if (!zAsBoolean) {
            this.mView.setOverScrollMode(2);
            return;
        }
        this.mView.setOverScrollMode(0);
    }

    public AbsLynxList(s sVar, Object obj) {
        super(sVar, obj);
        this.LL = sVar.LLJ;
        this.LLILLJJLI = null;
    }

    public final void LJJIJIIJI(int i, long j) {
        InterfaceC1311870kF7 interfaceC1311870kF7 = this.LL;
        int sign = getSign();
        LynxTemplateRender lynxTemplateRender = ((C1311860kF6) interfaceC1311870kF7).LIZ;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJIJL(sign, i, j);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.LLILLJJLI = lynxBaseUI;
        lynxBaseUI.setParent(this);
        List<LynxBaseUI> list = this.mChildren;
        ListProtector.add(list, list.size(), lynxBaseUI);
        onInsertChild(lynxBaseUI, i);
    }

    public final UIComponent LJJIJ(int i, long j, boolean z) {
        int iLJJIJIL;
        LynxBaseUI lynxBaseUILJ;
        InterfaceC1311870kF7 interfaceC1311870kF7 = this.LL;
        int sign = getSign();
        LynxTemplateRender lynxTemplateRender = ((C1311860kF6) interfaceC1311870kF7).LIZ;
        if (lynxTemplateRender != null && (iLJJIJIL = lynxTemplateRender.LJJIJIL(sign, i, j, z)) > 0 && (lynxBaseUILJ = this.mContext.LJ(iLJJIJIL)) != null && (lynxBaseUILJ instanceof UIComponent)) {
            return (UIComponent) lynxBaseUILJ;
        }
        return null;
    }

    public final void LJJIJIL(UIComponent uIComponent, int i, long j) {
        InterfaceC1311870kF7 interfaceC1311870kF7 = this.LL;
        int sign = getSign();
        int sign2 = uIComponent.getSign();
        LynxTemplateRender lynxTemplateRender = ((C1311860kF6) interfaceC1311870kF7).LIZ;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJLLL(sign, sign2, i, j);
        }
    }
}
