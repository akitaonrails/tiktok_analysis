package com.bytedance.ies.xelement.pickview;

import X.C13EQ;
import X.InterfaceC1312540kGC;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UIView;
import j27.s;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxPickView extends UIView {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void measureChildren() {
        List<LynxBaseUI> list;
        List<LynxBaseUI> list2;
        List<LynxBaseUI> list3;
        String str = this.LL;
        if (str != null && (list3 = this.mChildren) != null) {
            Iterator it2 = C13EQ.LJJIJL(list3, LynxPickerViewColumn.class).iterator();
            while (it2.hasNext()) {
                ((LynxPickerViewColumn) it2.next()).setIndicatorStyle(str);
            }
        }
        String str2 = this.LLILLJJLI;
        if (str2 != null && (list2 = this.mChildren) != null) {
            Iterator it3 = C13EQ.LJJIJL(list2, LynxPickerViewColumn.class).iterator();
            while (it3.hasNext()) {
                ((LynxPickerViewColumn) it3.next()).setMaskStyle(str2);
            }
        }
        String str3 = this.LLILLL;
        if (str3 != null && (list = this.mChildren) != null) {
            Iterator it4 = C13EQ.LJJIJL(list, LynxPickerViewColumn.class).iterator();
            while (it4.hasNext()) {
                ((LynxPickerViewColumn) it4.next()).setVisibleCount(str3);
            }
        }
        super.measureChildren();
    }

    public LynxPickView(s sVar) {
        super(sVar, null);
    }

    @InterfaceC1312540kGC(name = "indicator-style")
    public final void setIndicatorStyle(String str) {
        this.LL = str;
    }

    @InterfaceC1312540kGC(name = "mask-style")
    public final void setMaskStyle(String str) {
        this.LLILLJJLI = str;
    }

    @InterfaceC1312540kGC(name = "visible-count")
    public final void setVisibleCount(String str) {
        this.LLILLL = str;
    }

    public LynxPickView(s sVar, Object obj) {
        super(sVar, obj);
    }
}
