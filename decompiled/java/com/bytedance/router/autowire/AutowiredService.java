package com.bytedance.router.autowire;

import X.C2188811AlT;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AutowiredService {
    public LruCache<String, ISyringe> classCache;
    public List<String> denyList;

    public static final class Single {
        public static final AutowiredService single = new AutowiredService();
    }

    public AutowiredService() {
        this.classCache = new LruCache<>(66);
        this.denyList = new ArrayList();
    }

    public static AutowiredService inst() {
        return Single.single;
    }

    public void autowire(Object obj) {
        String name = obj.getClass().getName();
        try {
            if (!this.denyList.contains(name)) {
                ISyringe iSyringe = this.classCache.get(name);
                if (iSyringe == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(obj.getClass().getName());
                    sbLIZ.append("$$SmartRouter$$Autowired");
                    iSyringe = (ISyringe) Class.forName(C2188811AlT.LIZIZ(sbLIZ)).getConstructor(new Class[0]).newInstance(new Object[0]);
                }
                iSyringe.inject(obj);
                this.classCache.put(name, iSyringe);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.denyList.add(name);
        }
    }
}
