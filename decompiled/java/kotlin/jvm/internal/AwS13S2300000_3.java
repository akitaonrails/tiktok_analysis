package kotlin.jvm.internal;

import X.C080X;
import X.C09AY;
import X.C2130208We;
import X.C2131308Wp;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadApiData;
import com.ss.android.ugc.tiktok.tools.performance.util.DownloadTaskExtensionKt$safeSetSubThreadListener$$inlined$doOnDestroy$1$1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS13S2300000_3 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS13S2300000_3 awS13S2300000_3) {
        ((LifecycleOwner) awS13S2300000_3.l2).getLifecycle().addObserver(new DownloadTaskExtensionKt$safeSetSubThreadListener$$inlined$doOnDestroy$1$1(awS13S2300000_3.s0, (DownloadTask) awS13S2300000_3.l3, awS13S2300000_3.s1, (IDownloadListener) awS13S2300000_3.l4));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS13S2300000_3 awS13S2300000_3) {
        n nVar;
        C080X c080x = ((C2130208We) awS13S2300000_3.l2).LIZIZ;
        String str = awS13S2300000_3.s0;
        Map<String, ? extends Object> map = (Map) awS13S2300000_3.l3;
        n nVar2 = (n) awS13S2300000_3.l4;
        String str2 = awS13S2300000_3.s1;
        if (c080x.LIZIZ().contains(str)) {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayListLIZ = C2131308Wp.LIZ();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayListLIZ) {
                    ECPreloadApiData eCPreloadApiData = (ECPreloadApiData) obj;
                    if (Intrinsics.LJFF(eCPreloadApiData.api, str) && eCPreloadApiData.requestParam == null) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
                if (nVar2 != null) {
                    ArrayList arrayListLIZ2 = C2131308Wp.LIZ();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayListLIZ2) {
                        ECPreloadApiData eCPreloadApiData2 = (ECPreloadApiData) obj2;
                        if (Intrinsics.LJFF(eCPreloadApiData2.api, str) && (nVar = eCPreloadApiData2.requestParam) != null && Intrinsics.LJFF(nVar.toString(), nVar2.toString())) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
                if ((!arrayList.isEmpty()) && map != null) {
                    c080x.LIZ.invoke(arrayList, map, str2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS13S2300000_3(C2130208We c2130208We, C2130208We c2130208We2, String str, Map<String, ? extends Object> map, n nVar, String str2) {
        super(0);
        this.$t = str2;
        this.l2 = c2130208We;
        this.s0 = c2130208We2;
        this.l3 = str;
        this.l4 = map;
        this.s1 = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S2300000_3(LifecycleOwner lifecycleOwner, String str, DownloadTask downloadTask, String str2, IDownloadListener iDownloadListener, int i) {
        super(0);
        this.$t = i;
        this.l2 = lifecycleOwner;
        this.s0 = str;
        this.l3 = downloadTask;
        this.s1 = str2;
        this.l4 = iDownloadListener;
    }
}
