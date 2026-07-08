package com.ss.android.ugc.aweme.im.sdk.psp.scene;

import X.AbstractC207271168v;
import X.C169J;
import X.C270170AiN;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.experiment.IMPSPMVPExperiment;
import com.ss.android.ugc.aweme.im.sdk.psp.IMPSPManager;
import com.ss.android.ugc.aweme.im.service.psp.IIMPSPSceneManager;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class IMPSPSceneManager implements IIMPSPSceneManager {
    public static final IMPSPSceneManager LIZ = new IMPSPSceneManager();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final List<Function0<AbstractC207271168v>> LIZJ;

    public static final class Service implements IIMPSPSceneManager {
        public final /* synthetic */ IMPSPSceneManager LIZ = IMPSPSceneManager.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.psp.IIMPSPSceneManager
        public final void init() {
            this.LIZ.init();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        if (((Boolean) C270170AiN.LIZ.getValue()).booleanValue()) {
            arrayList.add(new C169J());
        }
        if (((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZLLL()) {
            arrayList.add(AFwS221S0000000_31.get$arr$(197));
        }
        LIZJ = arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.service.psp.IIMPSPSceneManager
    public final void init() {
        final boolean z = true;
        if (LIZIZ.getAndSet(true)) {
            return;
        }
        if (IMPSPMVPExperiment.LIZ().enable) {
            final String str = IMPSPMVPExperiment.LIZ().producerSceneName;
            final String str2 = IMPSPMVPExperiment.LIZ().consumerSceneName;
            IMPSPManager iMPSPManager = IMPSPManager.LIZ;
            AbstractC207271168v abstractC207271168v = new AbstractC207271168v(str, z) { // from class: X.168u
                public final String LIZIZ;
                public final boolean LIZJ;

                @Override // X.AbstractC207271168v
                public final String LJ() {
                    return this.LIZIZ;
                }

                {
                    this.LIZIZ = str;
                    this.LIZJ = z;
                }

                @Override // X.AbstractC830880Wic
                public final TTMParamData LIZIZ(C830870Wib c830870Wib, String str3, AnonymousClass1696 anonymousClass1696) {
                    C207262168m c207262168m;
                    if (this.LIZJ) {
                        return null;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    IMPSPManager.LIZ.getClass();
                    AbstractC207272168w abstractC207272168w = (AbstractC207272168w) ((ConcurrentHashMap) IMPSPManager.LIZJ).get("save_social_interaction_et");
                    if ((abstractC207272168w instanceof C207262168m) && (c207262168m = (C207262168m) abstractC207272168w) != null) {
                        linkedHashMap.put("social_interaction_data_by_event_name", c207262168m.LIZ);
                        linkedHashMap.put("social_interaction_data_by_sequence", c207262168m.LIZIZ);
                    }
                    HashMap map = new HashMap();
                    map.put("strategy_key", str3);
                    map.put("cached_data", linkedHashMap);
                    ITTMParamData iTTMParamData = anonymousClass1696.LIZ;
                    if (iTTMParamData != null) {
                        iTTMParamData.getType();
                    }
                    return new TTMParamData((Map<String, Object>) map);
                }
            };
            iMPSPManager.getClass();
            IMPSPManager.LIZJ(abstractC207271168v);
            final boolean z2 = false;
            IMPSPManager.LIZJ(new AbstractC207271168v(str2, z2) { // from class: X.168u
                public final String LIZIZ;
                public final boolean LIZJ;

                @Override // X.AbstractC207271168v
                public final String LJ() {
                    return this.LIZIZ;
                }

                {
                    this.LIZIZ = str2;
                    this.LIZJ = z2;
                }

                @Override // X.AbstractC830880Wic
                public final TTMParamData LIZIZ(C830870Wib c830870Wib, String str3, AnonymousClass1696 anonymousClass1696) {
                    C207262168m c207262168m;
                    if (this.LIZJ) {
                        return null;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    IMPSPManager.LIZ.getClass();
                    AbstractC207272168w abstractC207272168w = (AbstractC207272168w) ((ConcurrentHashMap) IMPSPManager.LIZJ).get("save_social_interaction_et");
                    if ((abstractC207272168w instanceof C207262168m) && (c207262168m = (C207262168m) abstractC207272168w) != null) {
                        linkedHashMap.put("social_interaction_data_by_event_name", c207262168m.LIZ);
                        linkedHashMap.put("social_interaction_data_by_sequence", c207262168m.LIZIZ);
                    }
                    HashMap map = new HashMap();
                    map.put("strategy_key", str3);
                    map.put("cached_data", linkedHashMap);
                    ITTMParamData iTTMParamData = anonymousClass1696.LIZ;
                    if (iTTMParamData != null) {
                        iTTMParamData.getType();
                    }
                    return new TTMParamData((Map<String, Object>) map);
                }
            });
        }
        for (Function0 function0 : (ArrayList) LIZJ) {
            IMPSPManager iMPSPManager2 = IMPSPManager.LIZ;
            AbstractC207271168v abstractC207271168v2 = (AbstractC207271168v) function0.invoke();
            iMPSPManager2.getClass();
            IMPSPManager.LIZJ(abstractC207271168v2);
        }
    }
}
