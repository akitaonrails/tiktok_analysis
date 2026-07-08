package com.ss.android.ugc.aweme.search.arch.v2.docker.components.common;

import X.InterfaceC644890PRf;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ComponentHelper {
    public static final Map<LifecycleOwner, ComponentHelper> LIZJ = new LinkedHashMap();
    public final Map<String, InterfaceC644890PRf> LIZ = new LinkedHashMap();
    public final Map<String, ComponentInfo> LIZIZ = new LinkedHashMap();

    public static final class Companion {
        public static ComponentHelper LIZ(LifecycleOwner lifecycleOwner) {
            Map<LifecycleOwner, ComponentHelper> map = ComponentHelper.LIZJ;
            ComponentHelper componentHelper = (ComponentHelper) ((LinkedHashMap) map).get(lifecycleOwner);
            if (componentHelper == null) {
                ComponentHelper componentHelper2 = new ComponentHelper();
                map.put(lifecycleOwner, componentHelper2);
                lifecycleOwner.getLifecycle().addObserver(new ComponentHelper$Companion$get$1$1(lifecycleOwner));
                return componentHelper2;
            }
            return componentHelper;
        }
    }
}
