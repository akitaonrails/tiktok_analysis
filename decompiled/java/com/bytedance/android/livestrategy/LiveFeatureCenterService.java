package com.bytedance.android.livestrategy;

import X.AbstractC1106650eu7;
import X.C018C;
import X.C0IEG;
import X.C0J0Q;
import X.C0J0R;
import X.C1090000eTG;
import X.C1887507aL;
import X.C1954807lC;
import X.C786410Ut5;
import X.EnumC1094630eaj;
import X.InterfaceC1093100eYG;
import X.InterfaceC466370IQp;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livestrategy.config.LiveFeatureCenterAllConfigSetting;
import com.bytedance.android.livestrategy.config.LiveFeatureCenterConfig;
import com.bytedance.android.livestrategy.config.LiveFeatureCenterConfigSetting;
import com.bytedance.android.livestrategy.config.LiveFeatureCenterEnableExp;
import com.bytedance.keva.Keva;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class LiveFeatureCenterService implements ILiveFeatureCenterService {
    public LiveFeatureCenterConfig LL;
    public AbstractC1106650eu7 LLILLJJLI;
    public AbstractC1106650eu7 LLILLL;
    public AbstractC1106650eu7 LLILZ;
    public C0IEG LLILZIL;
    public final ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1093100eYG>> LLILZLL;

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void Ng() {
        if (LiveFeatureCenterEnableExp.INSTANCE.isDisable()) {
            return;
        }
        LiveFeatureCenterAllConfigSetting liveFeatureCenterAllConfigSetting = LiveFeatureCenterAllConfigSetting.INSTANCE;
        this.LL = liveFeatureCenterAllConfigSetting.isNotEmpty() ? liveFeatureCenterAllConfigSetting.getValue() : LiveFeatureCenterConfigSetting.INSTANCE.getValue();
        yG0(C0J0Q.APP);
    }

    public LiveFeatureCenterService() {
        LiveFeatureCenterAllConfigSetting liveFeatureCenterAllConfigSetting = LiveFeatureCenterAllConfigSetting.INSTANCE;
        this.LL = liveFeatureCenterAllConfigSetting.isNotEmpty() ? liveFeatureCenterAllConfigSetting.getValue() : LiveFeatureCenterConfigSetting.INSTANCE.getValue();
        this.LLILZLL = new ConcurrentHashMap<>();
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1093100eYG>> yT0() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final Map<String, C1090000eTG> Du2(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC1106650eu7 abstractC1106650eu7LIZ = LIZ(C0J0Q.ROOM, false);
        if (abstractC1106650eu7LIZ != null) {
            for (Map.Entry entry : ((LinkedHashMap) abstractC1106650eu7LIZ.LIZLLL(str)).entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        AbstractC1106650eu7 abstractC1106650eu7LIZ2 = LIZ(C0J0Q.ANCHOR, true);
        if (abstractC1106650eu7LIZ2 != null) {
            for (Map.Entry entry2 : ((LinkedHashMap) abstractC1106650eu7LIZ2.LIZLLL(str)).entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        AbstractC1106650eu7 abstractC1106650eu7LIZ3 = LIZ(C0J0Q.LIVE, true);
        if (abstractC1106650eu7LIZ3 != null) {
            for (Map.Entry entry3 : ((LinkedHashMap) abstractC1106650eu7LIZ3.LIZLLL(str)).entrySet()) {
                linkedHashMap.put(entry3.getKey(), entry3.getValue());
            }
        }
        AbstractC1106650eu7 abstractC1106650eu7LIZ4 = LIZ(C0J0Q.APP, true);
        if (abstractC1106650eu7LIZ4 != null) {
            for (Map.Entry entry4 : ((LinkedHashMap) abstractC1106650eu7LIZ4.LIZLLL(str)).entrySet()) {
                linkedHashMap.put(entry4.getKey(), entry4.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void Iy(LiveRoomFragment liveRoomFragment) {
        if (LiveFeatureCenterEnableExp.INSTANCE.isDisable()) {
            return;
        }
        this.LLILZIL = liveRoomFragment;
    }

    public final void LIZIZ(AbstractC1106650eu7 abstractC1106650eu7) {
        InterfaceC466370IQp currentFragment;
        int i = C0J0R.LIZ[abstractC1106650eu7.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.LLILZ = abstractC1106650eu7;
                        return;
                    }
                    throw new C1954807lC();
                }
                C0IEG c0ieg = this.LLILZIL;
                if (c0ieg == null || (currentFragment = c0ieg.getCurrentFragment()) == null) {
                    return;
                }
                currentFragment.AJ(abstractC1106650eu7);
                return;
            }
            this.LLILLL = abstractC1106650eu7;
            return;
        }
        this.LLILLJJLI = abstractC1106650eu7;
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void SW(C0IEG c0ieg) {
        if (!LiveFeatureCenterEnableExp.INSTANCE.isDisable() && Intrinsics.LJFF(c0ieg, this.LLILZIL)) {
            this.LLILZIL = null;
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void yG0(C0J0Q c0j0q) {
        if (LiveFeatureCenterEnableExp.INSTANCE.isDisable() || LIZ(c0j0q, false) != null) {
            return;
        }
        int i = C0J0R.LIZ[c0j0q.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        AbstractC1106650eu7 abstractC1106650eu7 = new AbstractC1106650eu7() { // from class: X.0eu9
                            {
                                C0J0Q c0j0q2 = C0J0Q.ANCHOR;
                            }
                        };
                        abstractC1106650eu7.LIZ(this.LL.liveAnchorFeatureCenter, this);
                        LIZIZ(abstractC1106650eu7);
                        return;
                    }
                    throw new C1954807lC();
                }
                AbstractC1106650eu7 abstractC1106650eu72 = new AbstractC1106650eu7() { // from class: X.0euA
                    {
                        C0J0Q c0j0q2 = C0J0Q.ROOM;
                    }
                };
                abstractC1106650eu72.LIZ(this.LL.liveRoomFeatureCenter, this);
                LIZIZ(abstractC1106650eu72);
                return;
            }
            AbstractC1106650eu7 abstractC1106650eu73 = new AbstractC1106650eu7() { // from class: X.0euB
                {
                    C0J0Q c0j0q2 = C0J0Q.LIVE;
                }
            };
            abstractC1106650eu73.LIZ(this.LL.liveSessionFeatureCenter, this);
            LIZIZ(abstractC1106650eu73);
            return;
        }
        AbstractC1106650eu7 abstractC1106650eu74 = new AbstractC1106650eu7() { // from class: X.0eu8
            {
                C0J0Q c0j0q2 = C0J0Q.APP;
            }
        };
        abstractC1106650eu74.LIZ(this.LL.appFeatureCenter, this);
        LIZIZ(abstractC1106650eu74);
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final boolean zr0(C0J0Q c0j0q) {
        InterfaceC466370IQp currentFragment;
        ILiveFeatureCenterService iLiveFeatureCenterService;
        ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1093100eYG>> concurrentHashMapYT0;
        if (LIZ(c0j0q, false) == null) {
            return false;
        }
        AbstractC1106650eu7 abstractC1106650eu7LIZ = LIZ(c0j0q, false);
        if (abstractC1106650eu7LIZ != null && (iLiveFeatureCenterService = abstractC1106650eu7LIZ.LIZJ) != null && (concurrentHashMapYT0 = iLiveFeatureCenterService.yT0()) != null) {
            concurrentHashMapYT0.clear();
        }
        int i = C0J0R.LIZ[c0j0q.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.LLILZ = null;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C0IEG c0ieg = this.LLILZIL;
                    if (c0ieg != null && (currentFragment = c0ieg.getCurrentFragment()) != null) {
                        currentFragment.AJ(null);
                        return true;
                    }
                }
                return true;
            }
            this.LLILLL = null;
            return true;
        }
        this.LLILLJJLI = null;
        return true;
    }

    public final AbstractC1106650eu7 LIZ(C0J0Q c0j0q, boolean z) {
        Object objXJ;
        InterfaceC466370IQp currentFragment;
        int i = C0J0R.LIZ[c0j0q.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (this.LLILZ == null && z) {
                            yG0(C0J0Q.ANCHOR);
                        }
                        return this.LLILZ;
                    }
                    throw new C1954807lC();
                }
                C0IEG c0ieg = this.LLILZIL;
                if (c0ieg != null && (currentFragment = c0ieg.getCurrentFragment()) != null) {
                    objXJ = currentFragment.XJ();
                } else {
                    objXJ = null;
                }
                if (!(objXJ instanceof AbstractC1106650eu7)) {
                    return null;
                }
                return (AbstractC1106650eu7) objXJ;
            }
            if (this.LLILLL == null && z) {
                yG0(C0J0Q.LIVE);
            }
            return this.LLILLL;
        }
        if (this.LLILLJJLI == null && z) {
            yG0(C0J0Q.APP);
        }
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void nl0(String str, String str2) {
        AbstractC1106650eu7 abstractC1106650eu7;
        InterfaceC466370IQp currentFragment;
        AbstractC1106650eu7 abstractC1106650eu72 = this.LLILLJJLI;
        if (abstractC1106650eu72 != null) {
            abstractC1106650eu72.LIZIZ(str, str2);
        }
        AbstractC1106650eu7 abstractC1106650eu73 = this.LLILLL;
        if (abstractC1106650eu73 != null) {
            abstractC1106650eu73.LIZIZ(str, str2);
        }
        AbstractC1106650eu7 abstractC1106650eu74 = this.LLILZ;
        if (abstractC1106650eu74 != null) {
            abstractC1106650eu74.LIZIZ(str, str2);
        }
        C0IEG c0ieg = this.LLILZIL;
        Object objXJ = null;
        if (c0ieg != null && (currentFragment = c0ieg.getCurrentFragment()) != null) {
            objXJ = currentFragment.XJ();
        }
        if ((objXJ instanceof AbstractC1106650eu7) && (abstractC1106650eu7 = (AbstractC1106650eu7) objXJ) != null) {
            abstractC1106650eu7.LIZIZ(str, str2);
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final InterfaceC1093100eYG Ll(String str, String str2, InterfaceC1093100eYG interfaceC1093100eYG) {
        CopyOnWriteArraySet<InterfaceC1093100eYG> copyOnWriteArraySet = this.LLILZLL.get(C1887507aL.LIZ(str, str2));
        if (copyOnWriteArraySet == null) {
            ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1093100eYG>> concurrentHashMap = this.LLILZLL;
            String strLIZ = C1887507aL.LIZ(str, str2);
            CopyOnWriteArraySet<InterfaceC1093100eYG> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
            copyOnWriteArraySet2.add(interfaceC1093100eYG);
            concurrentHashMap.put(strLIZ, copyOnWriteArraySet2);
            return interfaceC1093100eYG;
        }
        copyOnWriteArraySet.add(interfaceC1093100eYG);
        return interfaceC1093100eYG;
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void MG1(C0J0Q c0j0q, String str, String str2) {
        AbstractC1106650eu7 abstractC1106650eu7LIZ = LIZ(c0j0q, true);
        if (abstractC1106650eu7LIZ != null) {
            abstractC1106650eu7LIZ.LJ(str2, "default", str, false);
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final C1090000eTG O3(EnumC1094630eaj enumC1094630eaj, String str, String str2) {
        AbstractC1106650eu7 abstractC1106650eu7LIZ;
        C0J0Q c0j0q = C0J0Q.ROOM;
        AbstractC1106650eu7 abstractC1106650eu7LIZ2 = LIZ(c0j0q, false);
        if (abstractC1106650eu7LIZ2 != null && abstractC1106650eu7LIZ2.LIZJ(enumC1094630eaj, str, str2) != null) {
            AbstractC1106650eu7 abstractC1106650eu7LIZ3 = LIZ(c0j0q, false);
            if (abstractC1106650eu7LIZ3 == null) {
                return null;
            }
            return abstractC1106650eu7LIZ3.LIZJ(enumC1094630eaj, str, str2);
        }
        C0J0Q c0j0q2 = C0J0Q.ANCHOR;
        AbstractC1106650eu7 abstractC1106650eu7LIZ4 = LIZ(c0j0q2, true);
        if (abstractC1106650eu7LIZ4 != null && abstractC1106650eu7LIZ4.LIZJ(enumC1094630eaj, str, str2) != null) {
            AbstractC1106650eu7 abstractC1106650eu7LIZ5 = LIZ(c0j0q2, false);
            if (abstractC1106650eu7LIZ5 == null) {
                return null;
            }
            return abstractC1106650eu7LIZ5.LIZJ(enumC1094630eaj, str, str2);
        }
        C0J0Q c0j0q3 = C0J0Q.LIVE;
        AbstractC1106650eu7 abstractC1106650eu7LIZ6 = LIZ(c0j0q3, true);
        if (abstractC1106650eu7LIZ6 != null && abstractC1106650eu7LIZ6.LIZJ(enumC1094630eaj, str, str2) != null) {
            AbstractC1106650eu7 abstractC1106650eu7LIZ7 = LIZ(c0j0q3, false);
            if (abstractC1106650eu7LIZ7 == null) {
                return null;
            }
            return abstractC1106650eu7LIZ7.LIZJ(enumC1094630eaj, str, str2);
        }
        C0J0Q c0j0q4 = C0J0Q.APP;
        AbstractC1106650eu7 abstractC1106650eu7LIZ8 = LIZ(c0j0q4, true);
        if (abstractC1106650eu7LIZ8 == null || abstractC1106650eu7LIZ8.LIZJ(enumC1094630eaj, str, str2) == null || (abstractC1106650eu7LIZ = LIZ(c0j0q4, false)) == null) {
            return null;
        }
        return abstractC1106650eu7LIZ.LIZJ(enumC1094630eaj, str, str2);
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void Xu0(C0J0Q c0j0q, String str, Map map) {
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str2 = (String) entry.getKey();
            String strValueOf = String.valueOf(entry.getValue());
            AbstractC1106650eu7 abstractC1106650eu7LIZ = LIZ(c0j0q, true);
            if (abstractC1106650eu7LIZ != null) {
                abstractC1106650eu7LIZ.LJ(strValueOf, str, str2, true);
            }
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void sl(String str, String str2, InterfaceC1093100eYG interfaceC1093100eYG) {
        CopyOnWriteArraySet<InterfaceC1093100eYG> copyOnWriteArraySet = this.LLILZLL.get(C1887507aL.LIZ(str, str2));
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.remove(interfaceC1093100eYG);
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void nI2(long j, Object obj, String str, String str2) throws JSONException {
        ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1093100eYG>> concurrentHashMapYT0;
        CopyOnWriteArraySet<InterfaceC1093100eYG> copyOnWriteArraySet;
        AbstractC1106650eu7 abstractC1106650eu7LIZ = LIZ(C0J0Q.APP, true);
        if (abstractC1106650eu7LIZ != null) {
            String strLIZ = C1887507aL.LIZ(str2, str);
            if (obj != null) {
                C018C c018c = abstractC1106650eu7LIZ.LIZIZ;
                Object obj2 = c018c.LIZIZ.get(strLIZ);
                c018c.LIZIZ.put(strLIZ, obj);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(strLIZ, obj);
                jSONObject.put("aliveTime", System.currentTimeMillis() + j);
                ((Keva) c018c.LIZJ.getValue()).storeString(strLIZ, C786410Ut5.J3(jSONObject.put("valueType", obj.getClass().getName())));
                ILiveFeatureCenterService iLiveFeatureCenterService = abstractC1106650eu7LIZ.LIZJ;
                if (iLiveFeatureCenterService != null && (concurrentHashMapYT0 = iLiveFeatureCenterService.yT0()) != null && (copyOnWriteArraySet = concurrentHashMapYT0.get(strLIZ)) != null) {
                    Iterator<InterfaceC1093100eYG> it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZJ(obj2, obj, str, str2);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void zG1(C0J0Q c0j0q, String str, String str2, String str3) {
        AbstractC1106650eu7 abstractC1106650eu7LIZ = LIZ(c0j0q, true);
        if (abstractC1106650eu7LIZ != null) {
            abstractC1106650eu7LIZ.LJ(str2, str3, str, false);
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    public final void bg(C0J0Q c0j0q, String str, Object obj, String str2, boolean z) {
        AbstractC1106650eu7 abstractC1106650eu7LIZ = LIZ(c0j0q, true);
        if (abstractC1106650eu7LIZ != null) {
            abstractC1106650eu7LIZ.LJ(obj, str2, str, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    @Override // com.bytedance.android.livestrategy.ILiveFeatureCenterService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zq1(X.C0J0Q r9, X.EnumC1094630eaj r10, java.lang.String r11, java.lang.Object r12, int r13) {
        /*
            r8 = this;
            java.lang.String r6 = "latest_n_perf"
            r7 = 0
            r4 = r11
            r2 = r8
            X.0eTG r1 = r2.O3(r10, r6, r4)
            if (r1 == 0) goto L2a
            java.lang.Object r0 = r1.LIZJ
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r1.LIZJ
            boolean r0 = r1 instanceof java.util.ArrayList
            if (r0 == 0) goto L2a
            java.util.List r5 = X.C19719512Dh.LIZIZ(r1)
        L19:
            r5.add(r12)
            int r0 = r5.size()
            if (r0 <= r13) goto L25
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r5, r7)
        L25:
            r3 = r9
            r2.bg(r3, r4, r5, r6, r7)
            return
        L2a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livestrategy.LiveFeatureCenterService.zq1(X.0J0Q, X.0eaj, java.lang.String, java.lang.Object, int):void");
    }
}
