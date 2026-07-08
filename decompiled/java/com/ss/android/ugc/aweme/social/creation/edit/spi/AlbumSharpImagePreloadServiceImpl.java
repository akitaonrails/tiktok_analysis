package com.ss.android.ugc.aweme.social.creation.edit.spi;

import X.C0PEM;
import X.C13LP;
import X.C2296808zG;
import X.C23250099c;
import X.C2490309pN;
import X.C2490409pO;
import X.C2490509pP;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.social.creation.api.edit.spi.IAlbumSharpImagePreloadService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS105S1200000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AlbumSharpImagePreloadServiceImpl implements IAlbumSharpImagePreloadService {
    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.spi.IAlbumSharpImagePreloadService
    public final void clear() {
        C2490409pO.LIZ.getClass();
        Iterator it2 = C13LP.LLIIII(C2490409pO.LIZIZ.keySet()).iterator();
        while (it2.hasNext()) {
            C2490509pP c2490509pPRemove = C2490409pO.LIZIZ.remove(it2.next());
            if (c2490509pPRemove != null) {
                synchronized (c2490509pPRemove) {
                    try {
                        if (!c2490509pPRemove.LIZLLL) {
                            Bitmap bitmap = c2490509pPRemove.LIZIZ;
                            if (bitmap != null && (!bitmap.isRecycled())) {
                                bitmap.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                            }
                            c2490509pPRemove.LIZIZ = null;
                            c2490509pPRemove.LIZLLL = true;
                            c2490509pPRemove.LJ = null;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.spi.IAlbumSharpImagePreloadService
    public final Bitmap LIZIZ(String str) {
        boolean z;
        ConcurrentHashMap<String, C2490509pP> concurrentHashMap;
        C2490509pP c2490509pP;
        C2490409pO.LIZ.getClass();
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (c2490509pP = (concurrentHashMap = C2490409pO.LIZIZ).get(str)) == null) {
            return null;
        }
        synchronized (c2490509pP) {
            try {
                if (!c2490509pP.LIZJ || c2490509pP.LIZLLL) {
                    return null;
                }
                Bitmap bitmap = c2490509pP.LIZIZ;
                c2490509pP.LIZIZ = null;
                c2490509pP.LIZLLL = true;
                concurrentHashMap.remove(str);
                return bitmap;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.spi.IAlbumSharpImagePreloadService
    public final boolean LIZJ(String str) {
        C2490409pO.LIZ.getClass();
        if (str == null || str.length() == 0) {
            return false;
        }
        return C2490409pO.LIZIZ.containsKey(str);
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.spi.IAlbumSharpImagePreloadService
    public final boolean LJ(String str) {
        C2490509pP c2490509pP;
        C2490409pO.LIZ.getClass();
        if (str != null && str.length() != 0 && (c2490509pP = C2490409pO.LIZIZ.get(str)) != null) {
            if (c2490509pP.LIZJ) {
                return true;
            }
            try {
                return c2490509pP.LIZ.await(500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.u3().interrupt();
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.spi.IAlbumSharpImagePreloadService
    public final boolean LIZLLL(String str, AwS105S1200000_22 awS105S1200000_22) {
        ConcurrentHashMap<String, C2490509pP> concurrentHashMap;
        C2490509pP c2490509pP;
        C2490409pO.LIZ.getClass();
        boolean z = false;
        if (str != null && str.length() != 0 && (c2490509pP = (concurrentHashMap = C2490409pO.LIZIZ).get(str)) != null) {
            synchronized (c2490509pP) {
                try {
                    if (!c2490509pP.LIZLLL) {
                        if (c2490509pP.LJ == null) {
                            Bitmap bitmap = null;
                            if (c2490509pP.LIZJ) {
                                Bitmap bitmap2 = c2490509pP.LIZIZ;
                                c2490509pP.LIZIZ = null;
                                c2490509pP.LIZLLL = true;
                                bitmap = bitmap2;
                                z = true;
                            } else {
                                c2490509pP.LJ = awS105S1200000_22;
                            }
                            if (!z) {
                                return true;
                            }
                            concurrentHashMap.remove(str);
                            awS105S1200000_22.invoke(bitmap);
                            return true;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.edit.spi.IAlbumSharpImagePreloadService
    public final void LIZ(Context context, int i, String str) {
        Context context2 = context;
        int iIntValue = i;
        C2490409pO.LIZ.getClass();
        if (context2 != null && str != null && str.length() != 0) {
            if (iIntValue <= 0) {
                iIntValue = ((Number) C2490409pO.LIZJ.getValue()).intValue();
            }
            Set<String> setKeySet = C2490409pO.LIZIZ.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (!Intrinsics.LJFF(obj, str)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C2490509pP c2490509pPRemove = C2490409pO.LIZIZ.remove(it2.next());
                if (c2490509pPRemove != null) {
                    synchronized (c2490509pPRemove) {
                        try {
                            if (!c2490509pPRemove.LIZLLL) {
                                Bitmap bitmap = c2490509pPRemove.LIZIZ;
                                if (bitmap != null && (!bitmap.isRecycled())) {
                                    bitmap.recycle();
                                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                                }
                                c2490509pPRemove.LIZIZ = null;
                                c2490509pPRemove.LIZLLL = true;
                                c2490509pPRemove.LJ = null;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
            C2490509pP c2490509pP = new C2490509pP();
            if (C2490409pO.LIZIZ.putIfAbsent(str, c2490509pP) == null) {
                Context contextN3 = C786410Ut5.N3(context2);
                if (contextN3 != null) {
                    context2 = contextN3;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2490309pN(context2, str, iIntValue, c2490509pP, null), 3);
            }
        }
    }
}
