package com.ss.android.ugc.aweme.poi.hybrid.behavior;

import X.C098200Yq;
import X.C1193750hAb;
import X.C1298530jtb;
import X.C1315750kLN;
import X.C1315960kLi;
import X.C189200o6;
import X.InterfaceC1312540kGC;
import android.app.Activity;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.ui.image.FlattenUIImage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.hybrid.behavior.LsFlattenUIImage;
import com.ss.android.ugc.aweme.tracker.TrackerImpl;
import j27.s;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS41S2100000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class LsFlattenUIImage extends FlattenUIImage {
    public static final Field LLIZ;
    public final String LL;
    public final HashMap<String, Long> LLILLJJLI;
    public HashMap<String, Object> LLILLL;
    public C1193750hAb LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;

    static {
        Object obj;
        try {
            Field declaredField = C1315750kLN.class.getDeclaredField("LJIJ");
            declaredField.setAccessible(true);
            C189200o6.m2constructorimpl(declaredField);
            obj = declaredField;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = null;
        }
        LLIZ = (Field) obj2;
    }

    public final String LJJIIZI() {
        Activity activityLIZ;
        s sVar = this.mContext;
        return (sVar == null || (activityLIZ = C1298530jtb.LIZ(sVar)) == null) ? "1" : (activityLIZ.isFinishing() || activityLIZ.isDestroyed()) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage
    public final void setSource(String str) {
        super.setSource(str);
        this.LLILZIL = str;
    }

    @InterfaceC1312540kGC(name = "track-params")
    public final void setTrackParams(ReadableMap readableMap) {
        HashMap<String, Object> mapAsHashMap;
        if (readableMap != null) {
            mapAsHashMap = readableMap.asHashMap();
        } else {
            mapAsHashMap = null;
        }
        this.LLILLL = mapAsHashMap;
    }

    public LsFlattenUIImage(s sVar, String str) {
        Object obj;
        final C1315960kLi c1315960kLi;
        super(sVar);
        this.LL = str;
        this.LLILLJJLI = new HashMap<>();
        try {
            Field field = LLIZ;
            Unit unit = null;
            if (field != null) {
                obj = field.get(this.mLynxImageManager);
            } else {
                obj = null;
            }
            if (obj instanceof C1315960kLi) {
                c1315960kLi = (C1315960kLi) obj;
            } else {
                c1315960kLi = null;
            }
            if (field != null) {
                field.set(this.mLynxImageManager, new C1315960kLi() { // from class: X.0hD2
                    @Override // X.C1315960kLi
                    public final void LJFF() {
                        LynxView lynxViewLJIILJJIL;
                        InterfaceC665370Q7z interfaceC665370Q7zLIZJ;
                        TrackerImpl trackerImpl;
                        LsFlattenUIImage lsFlattenUIImage = this.LIZ;
                        String str2 = lsFlattenUIImage.LLILZIL;
                        if (str2 != null) {
                            lsFlattenUIImage.LLILLJJLI.put(str2, Long.valueOf(System.currentTimeMillis()));
                        }
                        String str3 = this.LIZ.LLILZIL;
                        if (str3 != null) {
                            C1336320ksY.LIZ.getClass();
                            C1336320ksY.LIZLLL.LIZLLL(str3, new ConcurrentHashMap<>());
                        }
                        if (C1183030gtJ.LIZ().enableLcpTrack == 0) {
                            return;
                        }
                        try {
                            HashMap<String, Object> map = this.LIZ.LLILLL;
                            Object obj2 = map != null ? map.get("page_tag") : null;
                            String str4 = obj2 instanceof String ? (String) obj2 : null;
                            HashMap<String, Object> map2 = this.LIZ.LLILLL;
                            Object obj3 = map2 != null ? map2.get("scene_tag") : null;
                            String str5 = obj3 instanceof String ? (String) obj3 : null;
                            if (!C123100dR.LIZ(str4) || !C123100dR.LIZ(str5) || (lynxViewLJIILJJIL = this.LIZ.mContext.LJIILJJIL()) == null || (interfaceC665370Q7zLIZJ = C1558360qeg.LIZJ(lynxViewLJIILJJIL, "ttls_tracker", 2)) == null || (trackerImpl = (TrackerImpl) C1558520qew.LIZ(interfaceC665370Q7zLIZJ, TrackerImpl.class, null)) == null) {
                                return;
                            }
                            trackerImpl.LJJ(new AwS41S2100000_18(str4, str5, this.LIZ, 5));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1186030gy9.LIZ(new AwS562S0100000_18(e, 1347));
                        }
                    }

                    @Override // X.C1315960kLi
                    public final void LJ(int i, int i2) {
                        String string;
                        long jCurrentTimeMillis;
                        Uri uri;
                        LsFlattenUIImage lsFlattenUIImage = this.LIZ;
                        lsFlattenUIImage.LLILZLL = true;
                        C1325710kbR c1325710kbR = lsFlattenUIImage.mLynxImageManager.LJIIZILJ;
                        if (c1325710kbR != null && (uri = c1325710kbR.LIZIZ) != null) {
                            string = uri.toString();
                        } else {
                            string = null;
                        }
                        this.LIZ.LLILZ = new C1193750hAb(System.currentTimeMillis(), Boolean.TRUE, "", string);
                        C1315960kLi c1315960kLi2 = c1315960kLi;
                        if (c1315960kLi2 != null) {
                            c1315960kLi2.LJ(i, i2);
                        }
                        LsFlattenUIImage lsFlattenUIImage2 = this.LIZ;
                        Long l = (Long) C19719512Dh.LIZJ(lsFlattenUIImage2.LLILLJJLI).remove(lsFlattenUIImage2.LLILZIL);
                        if (l != null) {
                            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                        } else {
                            jCurrentTimeMillis = 0;
                        }
                        String strLJJIIZI = this.LIZ.LJJIIZI();
                        C1336320ksY c1336320ksY = C1336320ksY.LIZ;
                        LsFlattenUIImage lsFlattenUIImage3 = this.LIZ;
                        C1336320ksY.LJFF(c1336320ksY, true, lsFlattenUIImage3.mLynxImageManager.LJIIZILJ, jCurrentTimeMillis, lsFlattenUIImage3.LLILLL, lsFlattenUIImage3.LL, i, i2, strLJJIIZI, null, null, 1792);
                    }

                    @Override // X.C1315960kLi
                    public final void LIZJ(int i, int i2, String str2) {
                        String string;
                        long jCurrentTimeMillis;
                        Uri uri;
                        LsFlattenUIImage lsFlattenUIImage = this.LIZ;
                        lsFlattenUIImage.LLILZLL = true;
                        C1325710kbR c1325710kbR = lsFlattenUIImage.mLynxImageManager.LJIIZILJ;
                        if (c1325710kbR == null || (uri = c1325710kbR.LIZIZ) == null || (string = uri.toString()) == null) {
                            string = "";
                        }
                        this.LIZ.LLILZ = new C1193750hAb(System.currentTimeMillis(), Boolean.FALSE, str2, string);
                        C1315960kLi c1315960kLi2 = c1315960kLi;
                        if (c1315960kLi2 != null) {
                            c1315960kLi2.LIZJ(i, i2, str2);
                        }
                        LsFlattenUIImage lsFlattenUIImage2 = this.LIZ;
                        Long l = (Long) C19719512Dh.LIZJ(lsFlattenUIImage2.LLILLJJLI).remove(lsFlattenUIImage2.LLILZIL);
                        if (l != null) {
                            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                        } else {
                            jCurrentTimeMillis = 0;
                        }
                        String strLJJIIZI = this.LIZ.LJJIIZI();
                        C1336320ksY c1336320ksY = C1336320ksY.LIZ;
                        LsFlattenUIImage lsFlattenUIImage3 = this.LIZ;
                        C1336320ksY.LJFF(c1336320ksY, false, lsFlattenUIImage3.mLynxImageManager.LJIIZILJ, jCurrentTimeMillis, lsFlattenUIImage3.LLILLL, lsFlattenUIImage3.LL, 0, 0, strLJJIIZI, str2, Integer.valueOf(i2), 96);
                    }
                });
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
