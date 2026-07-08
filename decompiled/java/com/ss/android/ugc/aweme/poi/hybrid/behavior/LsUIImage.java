package com.ss.android.ugc.aweme.poi.hybrid.behavior;

import X.C098200Yq;
import X.C1193750hAb;
import X.C1298530jtb;
import X.C1315710kLJ;
import X.C1315960kLi;
import X.C1325710kbR;
import X.C189200o6;
import X.InterfaceC1312540kGC;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.ui.image.UIImage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.hybrid.behavior.LsUIImage;
import com.ss.android.ugc.aweme.tracker.TrackerImpl;
import j27.s;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS41S2100000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class LsUIImage extends UIImage<C1315710kLJ> {
    public static final Field LLIZ;
    public static final Field LLIZLLLIL;
    public final String LL;
    public final HashMap<String, Long> LLILLJJLI;
    public HashMap<String, Object> LLILLL;
    public C1193750hAb LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;

    static {
        Object obj;
        Object obj2;
        try {
            Field declaredField = C1315710kLJ.class.getDeclaredField("mLoaderCallback");
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
        Object obj3 = obj;
        if (zM7isFailureimpl) {
            obj3 = null;
        }
        LLIZ = (Field) obj3;
        try {
            Field declaredField2 = C1315710kLJ.class.getDeclaredField("mCurImageRequest");
            declaredField2.setAccessible(true);
            C189200o6.m2constructorimpl(declaredField2);
            obj2 = declaredField2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C098200Yq c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
            obj2 = c098200Yq2;
        }
        LLIZLLLIL = (Field) (C189200o6.m7isFailureimpl(obj2) ? null : obj2);
    }

    public final String LJJIIZI() {
        Activity activityLIZ;
        s sVar = this.mContext;
        return (sVar == null || (activityLIZ = C1298530jtb.LIZ(sVar)) == null) ? "1" : (activityLIZ.isFinishing() || activityLIZ.isDestroyed()) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    public final C1325710kbR LJJIJ(C1315710kLJ c1315710kLJ) {
        Object c098200Yq;
        Object obj;
        Object obj2 = null;
        try {
            Field field = LLIZLLLIL;
            if (field != null) {
                obj = field.get(c1315710kLJ);
            } else {
                obj = null;
            }
            if (obj instanceof C1325710kbR) {
                c098200Yq = (C1325710kbR) obj;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (C1325710kbR) obj2;
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI
    public final C1315710kLJ createView(Context context) {
        Object c098200Yq;
        Object obj;
        final C1315710kLJ c1315710kLJCreateView = super.createView(context);
        Object obj2 = null;
        try {
            Field field = LLIZ;
            if (field != null) {
                obj = field.get(c1315710kLJCreateView);
            } else {
                obj = null;
            }
            if (obj instanceof C1315960kLi) {
                c098200Yq = (C1315960kLi) obj;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        final C1315960kLi c1315960kLi = (C1315960kLi) obj2;
        c1315710kLJCreateView.setImageLoaderCallback(new C1315960kLi() { // from class: X.0hD1
            @Override // X.C1315960kLi
            public final void LJFF() {
                InterfaceC665370Q7z interfaceC665370Q7zLIZJ;
                TrackerImpl trackerImpl;
                LsUIImage lsUIImage = this;
                String str = lsUIImage.LLILZIL;
                if (str != null) {
                    lsUIImage.LLILLJJLI.put(str, Long.valueOf(System.currentTimeMillis()));
                    C1336320ksY.LIZ.getClass();
                    C1336320ksY.LIZLLL.LIZLLL(str, new ConcurrentHashMap<>());
                }
                if (C1183030gtJ.LIZ().enableLcpTrack == 0) {
                    return;
                }
                try {
                    HashMap<String, Object> map = this.LLILLL;
                    Object obj3 = map != null ? map.get("page_tag") : null;
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    HashMap<String, Object> map2 = this.LLILLL;
                    Object obj4 = map2 != null ? map2.get("scene_tag") : null;
                    String str3 = obj4 instanceof String ? (String) obj4 : null;
                    if (C123100dR.LIZ(str2) && C123100dR.LIZ(str3)) {
                        LynxView lynxViewLJIILJJIL = this.mContext.LJIILJJIL();
                        C1325710kbR c1325710kbRLJJIJ = this.LJJIJ(c1315710kLJCreateView);
                        String.valueOf(c1325710kbRLJJIJ != null ? c1325710kbRLJJIJ.LIZIZ : null);
                        if (lynxViewLJIILJJIL == null || (interfaceC665370Q7zLIZJ = C1558360qeg.LIZJ(lynxViewLJIILJJIL, "ttls_tracker", 2)) == null || (trackerImpl = (TrackerImpl) C1558520qew.LIZ(interfaceC665370Q7zLIZJ, TrackerImpl.class, null)) == null) {
                            return;
                        }
                        trackerImpl.LJJ(new AwS41S2100000_18(str2, str3, this, 6));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1186030gy9.LIZ(new AwS562S0100000_18(e, 1348));
                }
            }

            @Override // X.C1315960kLi
            public final void LJ(int i, int i2) {
                String string;
                long jCurrentTimeMillis;
                Uri uri;
                C1315960kLi c1315960kLi2 = c1315960kLi;
                if (c1315960kLi2 != null) {
                    c1315960kLi2.LJ(i, i2);
                }
                LsUIImage lsUIImage = this;
                lsUIImage.LLILZLL = true;
                C1325710kbR c1325710kbRLJJIJ = lsUIImage.LJJIJ(c1315710kLJCreateView);
                if (c1325710kbRLJJIJ != null && (uri = c1325710kbRLJJIJ.LIZIZ) != null) {
                    string = uri.toString();
                } else {
                    string = null;
                }
                lsUIImage.LLILZ = new C1193750hAb(System.currentTimeMillis(), Boolean.TRUE, "", string);
                LsUIImage lsUIImage2 = this;
                Long l = (Long) C19719512Dh.LIZJ(lsUIImage2.LLILLJJLI).remove(lsUIImage2.LLILZIL);
                if (l != null) {
                    jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                } else {
                    jCurrentTimeMillis = 0;
                }
                String strLJJIIZI = this.LJJIIZI();
                C1336320ksY c1336320ksY = C1336320ksY.LIZ;
                C1325710kbR c1325710kbRLJJIJ2 = this.LJJIJ(c1315710kLJCreateView);
                LsUIImage lsUIImage3 = this;
                C1336320ksY.LJFF(c1336320ksY, true, c1325710kbRLJJIJ2, jCurrentTimeMillis, lsUIImage3.LLILLL, lsUIImage3.LL, i, i2, strLJJIIZI, null, null, 1792);
            }

            @Override // X.C1315960kLi
            public final void LIZJ(int i, int i2, String str) {
                String string;
                long jCurrentTimeMillis;
                Uri uri;
                C1315960kLi c1315960kLi2 = c1315960kLi;
                if (c1315960kLi2 != null) {
                    c1315960kLi2.LIZJ(i, i2, str);
                }
                LsUIImage lsUIImage = this;
                lsUIImage.LLILZLL = true;
                C1325710kbR c1325710kbRLJJIJ = lsUIImage.LJJIJ(c1315710kLJCreateView);
                if (c1325710kbRLJJIJ != null && (uri = c1325710kbRLJJIJ.LIZIZ) != null) {
                    string = uri.toString();
                } else {
                    string = null;
                }
                lsUIImage.LLILZ = new C1193750hAb(System.currentTimeMillis(), Boolean.FALSE, str, string);
                LsUIImage lsUIImage2 = this;
                Long l = (Long) C19719512Dh.LIZJ(lsUIImage2.LLILLJJLI).remove(lsUIImage2.LLILZIL);
                if (l != null) {
                    jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                } else {
                    jCurrentTimeMillis = 0;
                }
                String strLJJIIZI = this.LJJIIZI();
                C1336320ksY c1336320ksY = C1336320ksY.LIZ;
                C1325710kbR c1325710kbRLJJIJ2 = this.LJJIJ(c1315710kLJCreateView);
                LsUIImage lsUIImage3 = this;
                C1336320ksY.LJFF(c1336320ksY, false, c1325710kbRLJJIJ2, jCurrentTimeMillis, lsUIImage3.LLILLL, lsUIImage3.LL, 0, 0, strLJJIIZI, str, Integer.valueOf(i2), 96);
            }
        });
        return c1315710kLJCreateView;
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.image.AbsUIImage
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

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }

    public LsUIImage(s sVar, String str) {
        super(sVar);
        this.LL = str;
        this.LLILLJJLI = new HashMap<>();
    }
}
