package com.bytedance.ies.sdk.widgets;

import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class MultiElementSpecImpl<T extends MultiElementSpecImpl<T>> implements MultiElementSpec {
    public final List<ElementSpec> elements = new ArrayList();
    public final LayeredElementContext layeredElementContext;

    public boolean enableWidgetPlaceholderOpt(int i) {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.MultiElementSpec
    public List<ElementSpec> getElements() {
        return this.elements;
    }

    public final LayeredElementContext getLayeredElementContext() {
        return this.layeredElementContext;
    }

    public MultiElementSpecImpl(LayeredElementContext layeredElementContext) {
        this.layeredElementContext = layeredElementContext;
    }

    public final T registerElement(ElementSpec elementSpec) {
        this.elements.add(elementSpec);
        return this;
    }

    public final T registerElements(MultiElementSpec multiElementSpec) {
        Iterator<ElementSpec> it2 = multiElementSpec.getElements().iterator();
        while (it2.hasNext()) {
            registerElement(it2.next());
        }
        return this;
    }

    public final void placeholderElement(int i, Function1<? super GroupableElementSpecImpl, Unit> function1) {
        ElementSpec elementSpec;
        if (enableWidgetPlaceholderOpt(i)) {
            PlaceholderElementSpec placeholderElementSpec = new PlaceholderElementSpec(i, null);
            placeholderElementSpec.setOnInit(function1);
            elementSpec = placeholderElementSpec;
        } else {
            GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(i);
            elementSpec = groupableElementSpecImpl;
            if (function1 != null) {
                function1.invoke(groupableElementSpecImpl);
                elementSpec = groupableElementSpecImpl;
            }
        }
        registerElement(elementSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void placeholderElement$default(MultiElementSpecImpl multiElementSpecImpl, int i, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                function1 = null;
            }
            multiElementSpecImpl.placeholderElement(i, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeholderElement");
    }
}
