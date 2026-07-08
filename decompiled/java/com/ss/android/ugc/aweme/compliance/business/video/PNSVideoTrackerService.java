package com.ss.android.ugc.aweme.compliance.business.video;

import X.C13BV;
import X.C13LP;
import X.C828080We6;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.video.IPNSVideoTrackerService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class PNSVideoTrackerService implements IPNSVideoTrackerService {
    public String LIZIZ;
    public long LIZJ;
    public volatile int LJ;
    public volatile long LJFF;
    public final Object LIZ = new Object();
    public final ArrayDeque<C828080We6> LIZLLL = new ArrayDeque<>(16);
    public volatile long LJI = -1;
    public volatile int LJII = -1;
    public volatile List<String> LJIIIIZZ = C13BV.INSTANCE;

    @Override // com.ss.android.ugc.aweme.compliance.api.services.video.IPNSVideoTrackerService
    public final void LIZ(String str) {
        boolean z;
        if (a0.LJJJIL(str)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.LIZ) {
            try {
                String str2 = this.LIZIZ;
                if (str2 != null) {
                    if (!Intrinsics.LJFF(str2, str)) {
                        long j = this.LIZJ;
                        int i = 0;
                        if (1 <= j && j <= jElapsedRealtime && jElapsedRealtime - j < 3000) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.LIZLLL.addLast(new C828080We6(str2));
                        while (this.LIZLLL.size() > 16) {
                            this.LIZLLL.removeFirst();
                        }
                        if (z && (i = this.LJ + 1) > 16) {
                            i = 16;
                        }
                        this.LJ = i;
                        this.LJFF++;
                        this.LJI = -1L;
                    }
                    if (!Intrinsics.LJFF(str2, str)) {
                        this.LIZIZ = str;
                        this.LIZJ = jElapsedRealtime;
                    }
                    return;
                }
                this.LIZIZ = str;
                this.LIZJ = jElapsedRealtime;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.video.IPNSVideoTrackerService
    public final List<String> LIZIZ(int i) {
        if (i <= 0) {
            return C13BV.INSTANCE;
        }
        if (i > 16) {
            i = 16;
        }
        if (this.LJ < i) {
            return C13BV.INSTANCE;
        }
        if (this.LJI == this.LJFF && this.LJII == i) {
            return this.LJIIIIZZ;
        }
        synchronized (this.LIZ) {
            try {
                if (this.LJ < i) {
                    return C13BV.INSTANCE;
                }
                int i2 = i + 1;
                int size = this.LIZLLL.size();
                if (i2 > size) {
                    i2 = size;
                }
                if (i2 <= 0) {
                    return C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(i2);
                Iterator<C828080We6> itDescendingIterator = this.LIZLLL.descendingIterator();
                for (int i3 = 0; itDescendingIterator.hasNext() && i3 < i2; i3++) {
                    arrayList.add(itDescendingIterator.next().LIZ);
                }
                Collections.reverse(arrayList);
                List<String> listLLIIII = C13LP.LLIIII(arrayList);
                this.LJI = this.LJFF;
                this.LJII = i;
                this.LJIIIIZZ = listLLIIII;
                return listLLIIII;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.video.IPNSVideoTrackerService
    public final boolean LIZJ(int i) {
        if (i <= 0) {
            return false;
        }
        if (i > 16) {
            i = 16;
        }
        if (this.LJ < i) {
            return false;
        }
        return true;
    }
}
