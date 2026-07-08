package com.lynx.xelement.scroll.coordinator.childitem;

import X.C1970007ne;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import j27.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollCoordinatorSlot extends UIGroup<AndroidView> {
    public Object LL;
    public LynxUIScrollCoordinatorSlotDrag LLILLJJLI;
    public Object LLILLL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }

    public LynxUIScrollCoordinatorSlot(s sVar, Object obj) {
        super(sVar, obj);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) throws Throwable {
        Method[] methods;
        super.insertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxUI) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(this);
            if (lynxBaseUI instanceof LynxUIScrollCoordinatorSlotDrag) {
                LynxUIScrollCoordinatorSlotDrag lynxUIScrollCoordinatorSlotDrag = (LynxUIScrollCoordinatorSlotDrag) lynxBaseUI;
                this.LLILLJJLI = lynxUIScrollCoordinatorSlotDrag;
                Object obj = this.LL;
                if (obj != null) {
                    lynxUIScrollCoordinatorSlotDrag.LJJIJIIJIL(obj);
                }
                Object obj2 = this.LLILLL;
                if (obj2 != null) {
                    lynxUIScrollCoordinatorSlotDrag.getClass();
                    lynxUIScrollCoordinatorSlotDrag.LLILLJJLI = new WeakReference<>(obj2);
                    Object obj3 = lynxUIScrollCoordinatorSlotDrag.LL;
                    if (obj3 != null) {
                        C1970007ne.LIZ(obj2, obj3);
                        return;
                    }
                    return;
                }
                return;
            }
            T t = lynxUI.mView;
            if (t != 0 && (methods = t.getClass().getMethods()) != null) {
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Method method = methods[i2];
                    if (Intrinsics.LJFF(method.getName(), "setTabLayout") && method.getParameterCount() == 1) {
                        for (Method method2 : methods) {
                            if (Intrinsics.LJFF(method2.getName(), "setTabBarElementAdded") && method2.getParameterCount() == 1) {
                                T t2 = lynxUI.mView;
                                if (t2 == 0) {
                                    return;
                                }
                                this.LLILLL = t2;
                                LynxUIScrollCoordinatorSlotDrag lynxUIScrollCoordinatorSlotDrag2 = this.LLILLJJLI;
                                if (lynxUIScrollCoordinatorSlotDrag2 != null) {
                                    lynxUIScrollCoordinatorSlotDrag2.LLILLJJLI = new WeakReference<>(t2);
                                    Object obj4 = lynxUIScrollCoordinatorSlotDrag2.LL;
                                    if (obj4 != null) {
                                        C1970007ne.LIZ(t2, obj4);
                                    }
                                    Object obj5 = lynxUIScrollCoordinatorSlotDrag2.LL;
                                    if (obj5 == null) {
                                        obj5 = this.LL;
                                    }
                                    this.LL = obj5;
                                }
                                Object obj6 = this.LL;
                                if (obj6 == null) {
                                    return;
                                }
                                C1970007ne.LIZ(t2, obj6);
                                return;
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
            if (!C1970007ne.LIZIZ(lynxBaseUI)) {
                return;
            }
            this.LL = lynxBaseUI;
            LynxUIScrollCoordinatorSlotDrag lynxUIScrollCoordinatorSlotDrag3 = this.LLILLJJLI;
            if (lynxUIScrollCoordinatorSlotDrag3 != null) {
                lynxUIScrollCoordinatorSlotDrag3.LJJIJIIJIL(lynxBaseUI);
            }
            Object obj7 = this.LLILLL;
            if (obj7 == null) {
                return;
            }
            C1970007ne.LIZ(obj7, lynxBaseUI);
        }
    }
}
