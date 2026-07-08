package com.bytedance.ies.sdk.widgets;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiElementSpecImplKt {
    public static final void element(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, int i) {
        multiElementSpecImpl.registerElement(new ElementSpecImpl(i));
    }

    public static final void element(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, ElementSpec elementSpec) {
        multiElementSpecImpl.registerElement(elementSpec);
    }

    public static final void element(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, int i, Function1<? super ElementSpecImpl, Unit> function1) {
        ElementSpecImpl elementSpecImpl = new ElementSpecImpl(i);
        function1.invoke(elementSpecImpl);
        multiElementSpecImpl.registerElement(elementSpecImpl);
    }

    public static final void groupableElement(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, int i, Function1<? super GroupableElementSpecImpl, Unit> function1) {
        GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(i);
        function1.invoke(groupableElementSpecImpl);
        multiElementSpecImpl.registerElement(groupableElementSpecImpl);
    }

    public static final void groupableElement(MultiElementSpecImpl<? extends MultiElementSpecImpl<?>> multiElementSpecImpl, GroupableElementSpecImpl groupableElementSpecImpl, Function1<? super GroupableElementSpecImpl, Unit> function1) {
        function1.invoke(groupableElementSpecImpl);
        multiElementSpecImpl.registerElement(groupableElementSpecImpl);
    }
}
