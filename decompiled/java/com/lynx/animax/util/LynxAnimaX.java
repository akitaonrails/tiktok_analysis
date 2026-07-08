package com.lynx.animax.util;

import X.C0X8C;
import X.C1285680jYs;
import X.C1285740jYy;
import X.C1288390jdF;
import X.C2188811AlT;
import X.InterfaceC1285870jZB;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.UIAnimaX;
import com.lynx.animax.service.AnimaXFrescoImageService;
import com.lynx.animax.service.IAnimaXImageService;
import com.lynx.animax.util.AnimaXLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.service.ILynxTrailService;
import j27.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxAnimaX {
    public static volatile LynxAnimaX sInstance;
    public C1285680jYs mScope = new C1285680jYs("LynxAnimaX");
    public volatile boolean mHasLibInit = false;

    public void init() {
        init(null);
    }

    public static LynxAnimaX inst() {
        if (sInstance == null) {
            synchronized (LynxAnimaX.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LynxAnimaX();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void createGlobalServices() {
        C1285740jYy.LIZ().LIZIZ(this.mScope, InterfaceC1285870jZB.class, new InterfaceC1285870jZB() { // from class: X.0jZC
            public final ConcurrentHashMap<String, C1285830jZ7> LIZ = new ConcurrentHashMap<>();

            public static C1285830jZ7 LIZJ(Collection collection) {
                String name;
                if (collection.isEmpty()) {
                    List listEmptyList = Collections.emptyList();
                    if (listEmptyList == null) {
                        listEmptyList = Collections.emptyList();
                    }
                    return new C1285830jZ7(listEmptyList);
                }
                ArrayList arrayList = new ArrayList(collection.size());
                for (Object obj : collection) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Collection contains non-string element: ");
                        if (obj != null) {
                            name = obj.getClass().getName();
                        } else {
                            name = "null";
                        }
                        sbLIZ.append(name);
                        AnimaXLog.LIZJ("LynxAnimaXSettingService", C2188811AlT.LIZIZ(sbLIZ));
                        List listEmptyList2 = Collections.emptyList();
                        if (listEmptyList2 == null) {
                            listEmptyList2 = Collections.emptyList();
                        }
                        return new C1285830jZ7(listEmptyList2);
                    }
                }
                return new C1285830jZ7(arrayList);
            }

            @Override // X.InterfaceC1285870jZB
            public final C1285830jZ7 LIZIZ(String str) {
                C1285830jZ7 c1285830jZ7;
                Object objObjectValueForTrailKey;
                if (str == null) {
                    return new C1285830jZ7("");
                }
                C1285830jZ7 c1285830jZ72 = this.LIZ.get(str);
                if (c1285830jZ72 != null) {
                    return c1285830jZ72;
                }
                ILynxTrailService iLynxTrailService = (ILynxTrailService) C1285920jZG.LIZJ().LIZ(ILynxTrailService.class);
                if (iLynxTrailService == null) {
                    AnimaXLog.LIZJ("LynxAnimaXSettingService", "Trail service not available");
                    c1285830jZ7 = new C1285830jZ7("");
                } else {
                    try {
                        objObjectValueForTrailKey = iLynxTrailService.objectValueForTrailKey(str);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Failed to get value for key: ");
                        sbLIZ.append(str);
                        sbLIZ.append(", message: ");
                        sbLIZ.append(th.getMessage());
                        AnimaXLog.LIZ("LynxAnimaXSettingService", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (objObjectValueForTrailKey == null) {
                        c1285830jZ7 = new C1285830jZ7("");
                    } else if (objObjectValueForTrailKey instanceof String) {
                        c1285830jZ7 = new C1285830jZ7((String) objObjectValueForTrailKey);
                    } else if (objObjectValueForTrailKey instanceof Collection) {
                        c1285830jZ7 = LIZJ((Collection) objObjectValueForTrailKey);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Unsupported value type: ");
                        sbLIZ2.append(objObjectValueForTrailKey.getClass().getName());
                        AnimaXLog.LIZJ("LynxAnimaXSettingService", C2188811AlT.LIZIZ(sbLIZ2));
                        c1285830jZ7 = new C1285830jZ7("");
                    }
                }
                C1285830jZ7 c1285830jZ7PutIfAbsent = this.LIZ.putIfAbsent(str, c1285830jZ7);
                if (c1285830jZ7PutIfAbsent != null) {
                    return c1285830jZ7PutIfAbsent;
                }
                return c1285830jZ7;
            }
        });
        C1285740jYy.LIZ().LIZIZ(this.mScope, IAnimaXImageService.class, new AnimaXFrescoImageService());
    }

    public boolean hasInitialized() {
        return AnimaX.LIZJ().LIZ && this.mHasLibInit;
    }

    public C1285680jYs getScope() {
        return this.mScope;
    }

    private synchronized void initWithLock(C0X8C c0x8c) {
        C1288390jdF c1288390jdF;
        if (!AnimaX.LIZJ().LIZ) {
            AnimaX animaXLIZJ = AnimaX.LIZJ();
            if (c0x8c == null) {
                c1288390jdF = null;
            } else {
                c1288390jdF = new C1288390jdF(c0x8c);
            }
            animaXLIZJ.LIZIZ(c1288390jdF);
        }
        if (!this.mHasLibInit) {
            if (!AnimaX.LIZJ().LIZLLL("animax_napi")) {
                return;
            }
            createGlobalServices();
            this.mHasLibInit = true;
        }
    }

    public LynxUI createUI(s sVar) {
        try {
            init();
            return new UIAnimaX(sVar);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("animax ui init error");
            sbLIZ.append(th.toString());
            AnimaXLog.LIZ("LynxAnimaX", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public void init(C0X8C c0x8c) {
        if (!hasInitialized()) {
            initWithLock(c0x8c);
        }
    }
}
