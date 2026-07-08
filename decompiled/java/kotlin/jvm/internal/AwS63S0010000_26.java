package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1758200vr0;
import X.C1759030vsL;
import X.C1768440w7W;
import X.C1770900wBU;
import X.C189200o6;
import X.C21322218cO;
import X.C2188811AlT;
import X.C599820Nfo;
import X.C786410Ut5;
import Y.ARunnableS3S0010000_26;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardModelV2;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPreloadConfigV2Model;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPreloadSceneConfigV2Model;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS63S0010000_26 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS63S0010000_26 awS63S0010000_26) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS3S0010000_26(awS63S0010000_26.z0, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS63S0010000_26 awS63S0010000_26) {
        Object c098200Yq;
        boolean z = awS63S0010000_26.z0;
        try {
            ArrayList<ECMixMallCardConfig> arrayList = new ArrayList();
            C1770900wBU.LIZ.getClass();
            List listLJ = C1770900wBU.LJ();
            if (listLJ != null) {
                arrayList.addAll(listLJ);
            }
            List listLJFF = C1770900wBU.LJFF();
            if (listLJFF != null) {
                arrayList.addAll(listLJFF);
            }
            for (ECMixMallCardConfig eCMixMallCardConfig : arrayList) {
                if (z) {
                    C1537060q6K c1537060q6K = C1529590puH.LIZ;
                    C1537060q6K.LIZIZ(eCMixMallCardConfig.lynxSchema, "ec_mmk_preload", null);
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearSparkCache, exception=");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS63S0010000_26 awS63S0010000_26) {
        EcMixMallPreloadSceneConfigV2Model ecMixMallPreloadSceneConfigV2Model;
        List<ECMixMallCardModelV2> list;
        EcMixMallPreloadSceneConfigV2Model ecMixMallPreloadSceneConfigV2Model2;
        List<ECMixMallCardModelV2> list2;
        EcMixMallPreloadSceneConfigV2Model ecMixMallPreloadSceneConfigV2Model3;
        List<ECMixMallCardModelV2> list3;
        C1770900wBU.LIZ.getClass();
        if (C1770900wBU.LJII()) {
            LinkedHashSet<ECMixMallCardModelV2> linkedHashSet = new LinkedHashSet();
            C1768440w7W.LIZ.getClass();
            EcMixMallPreloadConfigV2Model ecMixMallPreloadConfigV2ModelLIZ = C1768440w7W.LIZ();
            if (ecMixMallPreloadConfigV2ModelLIZ != null && (ecMixMallPreloadSceneConfigV2Model3 = ecMixMallPreloadConfigV2ModelLIZ.preloadScene) != null && (list3 = ecMixMallPreloadSceneConfigV2Model3.beforeMallConfig) != null) {
                linkedHashSet.addAll(list3);
            }
            EcMixMallPreloadConfigV2Model ecMixMallPreloadConfigV2ModelLIZ2 = C1768440w7W.LIZ();
            if (ecMixMallPreloadConfigV2ModelLIZ2 != null && (ecMixMallPreloadSceneConfigV2Model2 = ecMixMallPreloadConfigV2ModelLIZ2.preloadScene) != null && (list2 = ecMixMallPreloadSceneConfigV2Model2.clickMallTab) != null) {
                linkedHashSet.addAll(list2);
            }
            EcMixMallPreloadConfigV2Model ecMixMallPreloadConfigV2ModelLIZ3 = C1768440w7W.LIZ();
            if (ecMixMallPreloadConfigV2ModelLIZ3 != null && (ecMixMallPreloadSceneConfigV2Model = ecMixMallPreloadConfigV2ModelLIZ3.preloadScene) != null && (list = ecMixMallPreloadSceneConfigV2Model.afterCacheRender) != null) {
                linkedHashSet.addAll(list);
            }
            boolean z = awS63S0010000_26.z0;
            for (ECMixMallCardModelV2 eCMixMallCardModelV2 : linkedHashSet) {
                C1770900wBU c1770900wBU = C1770900wBU.LIZ;
                String str = eCMixMallCardModelV2.type;
                c1770900wBU.getClass();
                if (Intrinsics.LJFF(str, "header") || Intrinsics.LJFF(str, "operation") || Intrinsics.LJFF(str, "runtime_card") || z) {
                    String strLJIIJ = C1770900wBU.LJIIJ(eCMixMallCardModelV2.type, eCMixMallCardModelV2.containerType);
                    if (strLJIIJ == null) {
                        continue;
                    } else if (Intrinsics.LJFF(eCMixMallCardModelV2.containerType, "lynx")) {
                        C1537060q6K c1537060q6K = C1529590puH.LIZ;
                        C1537060q6K.LIZIZ(strLJIIJ, "ec_mmk_preload", null);
                    } else if (Intrinsics.LJFF(eCMixMallCardModelV2.containerType, "gec_card")) {
                        C21322218cO.LIZ.getClass();
                        C21322218cO.LJI.LIZ.remove(strLJIIJ);
                        C1759030vsL c1759030vsL = C21322218cO.LJII;
                        synchronized (c1759030vsL) {
                            C1758200vr0 c1758200vr0 = c1759030vsL.LIZ.get(strLJIIJ);
                            if (c1758200vr0 != null) {
                                c1758200vr0.LIZ.clear();
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S0010000_26(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
