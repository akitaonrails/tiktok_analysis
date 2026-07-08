package com.bytedance.ies.sdk.widgets;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public final class PlaceholderElementSpec extends GroupableElementSpecImpl {
    public final List<Integer> groupIds;
    public Function1<? super PlaceholderElementSpec, Unit> onInit;

    public final Function1<PlaceholderElementSpec, Unit> getOnInit() {
        return this.onInit;
    }

    public final void init(ConstraintProperty constraintProperty) {
        List<Integer> list = this.groupIds;
        if (list != null) {
            bindGroups(list);
        }
        Function1<? super PlaceholderElementSpec, Unit> function1 = this.onInit;
        if (function1 != null) {
            function1.invoke(this);
        }
        attach(constraintProperty);
    }

    public final void setOnInit(Function1<? super PlaceholderElementSpec, Unit> function1) {
        this.onInit = function1;
    }

    public PlaceholderElementSpec(int i, List<Integer> list) {
        super(i);
        this.groupIds = list;
    }
}
