package com.ss.android.ugc.aweme.ecommerce.search.vision.record.model;

import X.C09JS;
import X.C0PEM;
import X.C0R1M;
import X.C107000aq;
import X.C1204404nS;
import X.C1255704vj;
import X.C1309470kBF;
import X.C1309500kBI;
import X.C1309530kBL;
import X.C1309540kBM;
import X.C1325290kal;
import X.C13LP;
import X.C1419905h7;
import X.C15438062q;
import X.C948503nH;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api.PhotoSearchSysRecommendApi;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.df.api.visualsearch.ISearchVisualSearchService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class EcPhotoSearchAlbumVM extends ViewModel {
    public static final /* synthetic */ int LLILZLL = 0;
    public final ConcurrentHashMap<String, C1309500kBI> LL = new ConcurrentHashMap<>();
    public final C1309530kBL<SysRecommendModel> LLILLJJLI = new C1309530kBL<>();
    public final NextLiveData<SysRecommendModel> LLILLL = new NextLiveData<>();
    public final NextLiveData<List<MediaModel>> LLILZ = new NextLiveData<>();
    public boolean LLILZIL;

    public final List<PhotoSearchSysRecommendApi.ExposureRecommendItem> yQ2() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        C1309530kBL<SysRecommendModel> c1309530kBL = this.LLILLJJLI;
        ArrayList<List> arrayList3 = new ArrayList(C15438062q.LJIJJ(c1309530kBL, 10));
        Iterator<SysRecommendModel> it2 = c1309530kBL.iterator();
        while (it2.hasNext()) {
            List<SysRecommendFeedItem> list = it2.next().feedList;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<SysRecommendFeedItem> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new PhotoSearchSysRecommendApi.ExposureRecommendItem(it3.next().id, 1, 1));
                }
            } else {
                arrayList = null;
            }
            arrayList3.add(arrayList);
        }
        for (List list2 : arrayList3) {
            if (list2 != null) {
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(it4.next());
                }
            }
        }
        return arrayList2;
    }

    public static Unit zQ2(List list) {
        if (((Number) C107000aq.LIZ.getValue()).intValue() > 0) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                int i2 = i + 1;
                MediaModel mediaModel = (MediaModel) it2.next();
                if (i >= list.size() || i >= ((Number) C107000aq.LIZ.getValue()).intValue()) {
                    break;
                }
                String strLJFF = mediaModel.LJFF();
                if (strLJFF != null) {
                    C09JS.LIZ.getClass();
                    Uri uri = UriProtector.parse(C09JS.LIZ(strLJFF));
                    C1325290kal.LIZIZ(uri, false, new C1419905h7(uri, strLJFF, null), null);
                }
                i = i2;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public final void xQ2(Function1 function1) {
        C948503nH.LJFF(this, C0PEM.LIZJ, new C1309540kBM(this, function1, null));
    }

    public static void AQ2(List list, List list2) {
        int iLIZ = C1204404nS.LIZ();
        if (iLIZ > 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!list.contains(obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(C13LP.LL(arrayList, iLIZ));
            if (arrayList2.size() < iLIZ) {
                arrayList2.addAll(C13LP.LL(list, iLIZ - arrayList2.size()));
            }
            Pair<Integer, Integer> pairLJIJJ = C1255704vj.LIZ().LJIJJ(C0R1M.CHOOSE_FROM_ALBUM);
            int iIntValue = pairLJIJJ.getFirst().intValue();
            int iIntValue2 = pairLJIJJ.getSecond().intValue();
            ISearchVisualSearchService iSearchVisualSearchServiceLIZ = C1255704vj.LIZ();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String strLJFF = ((MediaModel) it2.next()).LJFF();
                if (strLJFF == null) {
                    strLJFF = "";
                }
                arrayList3.add(strLJFF);
            }
            iSearchVisualSearchServiceLIZ.LJIILJJIL(C13LP.LJLJJLL(arrayList3), iIntValue, iIntValue2, C0R1M.CHOOSE_FROM_ALBUM);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(android.content.Context r15, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel>> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C1309480kBG
            if (r0 == 0) goto L24
            r4 = r3
            X.0kBG r4 = (X.C1309480kBG) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZ = r2
        L14:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r10 = 1
            if (r0 == 0) goto L36
            if (r0 != r10) goto L2e
            java.lang.Object r1 = r4.LL
            goto L2a
        L24:
            X.0kBG r4 = new X.0kBG
            r4.<init>(r14, r3)
            goto L14
        L2a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L71
            goto L6d
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r3)
            r9 = 0
            r6 = 0
            r7 = -1
            r5 = r15
            r8 = r7
            r11 = r10
            r12 = r6
            r13 = r7
            java.util.List r1 = X.C2400609au.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L71
            boolean r0 = r14.LLILZIL     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L53
            int r0 = X.C1204404nS.LIZ()     // Catch: java.lang.Throwable -> L71
            if (r0 > 0) goto L50
            r10 = 0
        L50:
            if (r10 == 0) goto L6d
            goto L5e
        L53:
            r4.LL = r1     // Catch: java.lang.Throwable -> L71
            r4.LLILZ = r10     // Catch: java.lang.Throwable -> L71
            kotlin.Unit r0 = zQ2(r1)     // Catch: java.lang.Throwable -> L71
            if (r0 != r2) goto L6d
            return r2
        L5e:
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel>> r0 = r14.LLILZ     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L6a
            X.13BV r0 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L71
        L6a:
            AQ2(r0, r1)     // Catch: java.lang.Throwable -> L71
        L6d:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L71
            goto L7d
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L7d:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L84
            r1 = 0
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM.vQ2(android.content.Context, X.05Vn):java.lang.Object");
    }

    public final void wQ2(Context context, Function1<? super List<? extends MediaModel>, Unit> function1) {
        if (context == null) {
            return;
        }
        C948503nH.LJFF(this, C0PEM.LIZJ, new C1309470kBF(this, context, function1, null));
    }
}
