package com.ss.ttm.player;

import X.C1285320jYI;
import X.C1286350jZx;
import X.C1286360jZy;
import X.C2188811AlT;
import android.media.ImageReader;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class AJProducerManager {
    public static final HashMap<Long, C1286360jZy> LIZ = new HashMap<>();
    public static final ArrayList<C1286350jZx> LIZIZ = new ArrayList<>();
    public static final ArrayList<C1286350jZx> LIZJ = new ArrayList<>();

    public static void LIZ(ImageReader.OnImageAvailableListener onImageAvailableListener, int i) {
        if (onImageAvailableListener != null) {
            try {
                Class<?> cls = onImageAvailableListener.getClass();
                Class<?> cls2 = Integer.TYPE;
                cls.getDeclaredMethod("setIntOption", cls2, cls2).invoke(onImageAvailableListener, 1, Integer.valueOf(i));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static synchronized void releaseSurface(long j, int i) {
        C1286350jZx c1286350jZx;
        ImageReader imageReader;
        Iterator<C1286350jZx> it2 = LIZJ.iterator();
        while (it2.hasNext()) {
            C1286350jZx next = it2.next();
            if (next.LIZJ == j && next.LIZIZ == i) {
                it2.remove();
                next.LIZ(null, null);
                next.LIZJ = 0L;
                ArrayList<C1286350jZx> arrayList = LIZIZ;
                if (arrayList.size() >= 2 && (imageReader = (c1286350jZx = (C1286350jZx) ListProtector.remove(arrayList, 0)).LIZ) != null) {
                    imageReader.close();
                    c1286350jZx.LIZ = null;
                }
                arrayList.add(next);
            }
        }
    }

    public static synchronized Surface getAvailableSurface(long j, int i, int i2) {
        Surface surface = null;
        if (j == 0) {
            return null;
        }
        C1286360jZy c1286360jZy = LIZ.get(Long.valueOf(j));
        if (c1286360jZy == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("no listener,playerId:");
            sbLIZ.append(j);
            C1285320jYI.LIZLLL(null, "AJProducerManager", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        for (C1286350jZx c1286350jZx : LIZJ) {
            if (c1286350jZx.LIZJ == j && c1286350jZx.LIZIZ == i) {
                ImageReader imageReader = c1286350jZx.LIZ;
                if (imageReader != null) {
                    surface = imageReader.getSurface();
                }
                return surface;
            }
        }
        Iterator<C1286350jZx> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            C1286350jZx next = it2.next();
            if ((i == 2 && next.LIZIZ == 2) || (i != 2 && next.LIZIZ != 2)) {
                it2.remove();
                next.LIZJ = j;
                LIZJ.add(next);
                next.LIZ(c1286360jZy.LIZ, c1286360jZy.LIZIZ);
                ImageReader imageReader2 = next.LIZ;
                if (imageReader2 != null) {
                    surface = imageReader2.getSurface();
                }
                return surface;
            }
        }
        C1286350jZx c1286350jZx2 = new C1286350jZx(j, i);
        LIZJ.add(c1286350jZx2);
        c1286350jZx2.LIZ(c1286360jZy.LIZ, c1286360jZy.LIZIZ);
        ImageReader imageReader3 = c1286350jZx2.LIZ;
        if (imageReader3 != null) {
            surface = imageReader3.getSurface();
        }
        return surface;
    }
}
