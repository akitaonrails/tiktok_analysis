package com.bytedance.ies.sdk.widgets;

import com.bytedance.ies.sdk.widgets.ElementSpec;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public interface GroupableElementSpec extends ElementSpec {
    Set<Integer> getGroupIds();

    public static final class DefaultImpls {
        public static void dispose(GroupableElementSpec groupableElementSpec) {
            ElementSpec.DefaultImpls.dispose(groupableElementSpec);
        }

        public static void onDispose(GroupableElementSpec groupableElementSpec) {
            ElementSpec.DefaultImpls.onDispose(groupableElementSpec);
        }

        public static void attach(GroupableElementSpec groupableElementSpec, ConstraintProperty constraintProperty) {
            ElementSpec.DefaultImpls.attach(groupableElementSpec, constraintProperty);
        }
    }
}
