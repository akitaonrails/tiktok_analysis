package com.ss.android.ugc.aweme.pipeline.service;

import X.C098200Yq;
import X.C0CIJ;
import X.C0FQK;
import X.C0LE5;
import X.C189200o6;
import X.C298870BnZ;
import X.C298910Bnd;
import X.C524760Ki2;
import X.C529980KqS;
import X.C531610Kt5;
import X.C531620Kt6;
import X.EnumC1412640mre;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlotKt;
import java.util.List;
import kotlin.Pair;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateAlbumServiceImpl implements ITemplateAlbumService {
    public volatile String LIZ;

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    public final String LJFF() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    public final TemplateSlot LIZ(String str) {
        SummaryData summaryDataLIZIZ = C0FQK.LIZIZ(str);
        if (summaryDataLIZIZ != null) {
            return summaryDataLIZIZ.audioSlot;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    public final boolean LJ(String str) {
        List<TemplateSlot> list;
        SummaryData summaryDataLIZIZ = C0FQK.LIZIZ(str);
        if (summaryDataLIZIZ == null || (list = summaryDataLIZIZ.slots) == null || list.isEmpty()) {
            return false;
        }
        for (TemplateSlot templateSlot : list) {
            double slotEndTTime = templateSlot.getSlotEndTTime() - templateSlot.getSlotStartTime();
            if (slotEndTTime > 0.0d) {
                double duration = templateSlot.getDuration() / slotEndTTime;
                if (duration <= 0.8999999761581421d || duration >= 1.100000023841858d) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    public final void LJII(String str) {
        this.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    public final int LIZIZ(String str, EnumC1412640mre enumC1412640mre) {
        List<TemplateSlot> listLJIIIZ = LJIIIZ(str, enumC1412640mre);
        if (listLJIIIZ != null) {
            return C524760Ki2.LIZ(TemplateSlot.Companion.getMATERIAL_TYPE_VIDEO(), listLJIIIZ);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    public final int LJI(String str, EnumC1412640mre enumC1412640mre) {
        List<TemplateSlot> listLJIIIZ = LJIIIZ(str, enumC1412640mre);
        if (listLJIIIZ != null) {
            return C524760Ki2.LIZ(TemplateSlot.Companion.getMATERIAL_TYPE_IMG(), listLJIIIZ);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    public final List<TemplateSlot> LJIIIZ(String str, EnumC1412640mre enumC1412640mre) {
        List<TemplateSlot> list;
        SummaryData summaryDataLIZIZ = C0FQK.LIZIZ(str);
        if (summaryDataLIZIZ != null && (list = summaryDataLIZIZ.slots) != null) {
            if (enumC1412640mre != EnumC1412640mre.CUT_SAME && !list.isEmpty()) {
                Pair<Boolean, List<TemplateSlot>> pairLIZ = C531610Kt5.LIZ(list);
                boolean zBooleanValue = pairLIZ.getFirst().booleanValue();
                List<TemplateSlot> second = pairLIZ.getSecond();
                if (zBooleanValue) {
                    list = second;
                }
                return C531620Kt6.LIZIZ(list, true).getSecond();
            }
            return list;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    public final int LJIIJ(String str, EnumC1412640mre enumC1412640mre) {
        int iLIZIZ;
        int iLIZIZ2;
        SummaryData summaryDataLIZIZ = C0FQK.LIZIZ(str);
        if (summaryDataLIZIZ == null) {
            return 0;
        }
        List<TemplateSlot> list = summaryDataLIZIZ.slots;
        if (list.isEmpty()) {
            return 0;
        }
        if (enumC1412640mre == EnumC1412640mre.CUT_SAME) {
            int size = list.size();
            if (C0LE5.LIZ() && (iLIZIZ2 = C0LE5.LIZIZ()) <= size) {
                return iLIZIZ2;
            }
            return size;
        }
        Pair<Boolean, List<TemplateSlot>> pairLIZ = C531610Kt5.LIZ(list);
        boolean zBooleanValue = pairLIZ.getFirst().booleanValue();
        Pair<Boolean, List<TemplateSlot>> pairLIZIZ = C531620Kt6.LIZIZ(pairLIZ.getSecond(), true);
        boolean zBooleanValue2 = pairLIZIZ.getFirst().booleanValue();
        int size2 = pairLIZIZ.getSecond().size();
        boolean zIsUsingReverse = TemplateSlotKt.isUsingReverse(list);
        boolean hasMaterialTypeConstraints = TemplateSlotKt.getHasMaterialTypeConstraints(list);
        boolean z = summaryDataLIZIZ.usingMagic;
        if (summaryDataLIZIZ.featureCodes.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue()))) {
            return Math.min(size2, 2);
        }
        if (zBooleanValue || zIsUsingReverse || hasMaterialTypeConstraints) {
            return size2;
        }
        if (zBooleanValue2) {
            if (z || !C298910Bnd.LIZ()) {
                return size2;
            }
            return Math.min(size2, C0LE5.LIZIZ());
        }
        if (z || (iLIZIZ = C0LE5.LIZIZ()) > size2) {
            return size2;
        }
        return iLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    public final String LIZJ(int i, int i2, Context context) {
        Object c098200Yq;
        if (i > i2 && i > 1) {
            return context.getString(2131833895, Integer.valueOf(i));
        }
        try {
            c098200Yq = context.getResources().getQuantityString(2131755301, i, Integer.valueOf(i));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.app.Activity r7, java.lang.String r8, X.InterfaceC1364105Vn<? super X.C531370Ksh> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C531520Ksw
            if (r0 == 0) goto L21
            r5 = r9
            X.0Ksw r5 = (X.C531520Ksw) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            goto L5e
        L21:
            X.0Ksw r5 = new X.0Ksw
            r5.<init>(r6, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.0Ksz r0 = X.C0FQK.LIZ(r8)
            if (r0 == 0) goto L7a
            X.0KuF r0 = r0.LIZJ
            if (r0 == 0) goto L7a
            java.lang.String r1 = r0.LJIIIIZZ
            if (r1 == 0) goto L7a
            int r0 = r1.length()
            if (r0 <= 0) goto L53
            r0 = 1
        L47:
            if (r0 != 0) goto L4a
            r1 = r2
        L4a:
            if (r1 == 0) goto L7a
            com.ss.android.ugc.aweme.interfaces.ITemplateMusicService r0 = X.C524940KiK.LIZ()
            if (r0 != 0) goto L55
            return r2
        L53:
            r0 = 0
            goto L47
        L55:
            r5.LLILLL = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = r0.LIZJ(r7, r1, r5)     // Catch: java.lang.Throwable -> L67
            if (r1 != r4) goto L61
            return r4
        L5e:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L67
        L61:
            X.0Ksh r1 = (X.C531370Ksh) r1     // Catch: java.lang.Throwable -> L67
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L67
            goto L73
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L73:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L7a
            return r1
        L7a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipeline.service.TemplateAlbumServiceImpl.LIZLLL(android.app.Activity, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService
    public final String LJIIIIZZ(Context context, int i, ShortVideoContext shortVideoContext, int i2, boolean z, int i3, int i4) {
        boolean z2;
        Object c098200Yq;
        if (!o.LJI() && (((C529980KqS.LIZJ(i) && !C529980KqS.LIZIZ(i, shortVideoContext)) || C529980KqS.LIZLLL(i)) && C298870BnZ.LIZ())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return context.getString(2131850073);
        }
        if (!z) {
            return LIZJ(i2, C0LE5.LIZIZ(), context);
        }
        try {
            if (i3 == i2) {
                c098200Yq = context.getResources().getQuantityString(2131755760, i2, Integer.valueOf(i2));
            } else if (i4 != i2) {
                c098200Yq = context.getResources().getQuantityString(2131755762, i2, Integer.valueOf(i2));
            } else {
                c098200Yq = context.getResources().getQuantityString(2131755761, i2, Integer.valueOf(i2));
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str != null) {
            return str;
        }
        return "";
    }
}
