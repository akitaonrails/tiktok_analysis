package com.google.firebase.components;

import X.C0WBP;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new ComponentRegistrarProcessor() { // from class: X.0WAs
        @Override // com.google.firebase.components.ComponentRegistrarProcessor
        public final List processRegistrar(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<C0WBP<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
