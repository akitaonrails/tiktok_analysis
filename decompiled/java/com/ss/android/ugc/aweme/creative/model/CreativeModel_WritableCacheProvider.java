package com.ss.android.ugc.aweme.creative.model;

import X.C1448650nnj;
import X.C1448680nnm;
import X.C1448690nnn;
import X.C2217371BqR;
import X.InterfaceC1448670nnl;
import com.bytedance.creationmodel.core.WritableCacheProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class CreativeModel_WritableCacheProvider implements WritableCacheProvider {
    @Override // com.bytedance.creationmodel.core.WritableCacheProvider
    public void register(C1448690nnn c1448690nnn) {
        C1448650nnj c1448650nnj = new C2217371BqR() { // from class: X.0nnj
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CreativeModel) obj).editEffectModel;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((CreativeModel) obj).editEffectModel = (EditEffectModel) obj2;
            }
        };
        C1448680nnm c1448680nnm = InterfaceC1448670nnl.LIZ;
        final AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(42);
        final AwS636S0100000_22 awS636S0100000_22 = new AwS636S0100000_22(this, 0);
        c1448680nnm.getClass();
        InterfaceC1448670nnl<Object, Object> interfaceC1448670nnl = new InterfaceC1448670nnl<Object, Object>() { // from class: X.0nni
            @Override // X.InterfaceC1448670nnl
            public final C1448660nnk LIZIZ(InterfaceC1448670nnl interfaceC1448670nnl2) {
                return new C1448660nnk(interfaceC1448670nnl2, this);
            }

            @Override // X.InterfaceC1448670nnl
            public final Object get(Object obj) {
                return aFwS261S0000000_22.invoke(obj);
            }

            @Override // X.InterfaceC1448670nnl
            public final Object LIZ(Object obj, Object obj2) {
                return awS636S0100000_22.invoke(obj, obj2);
            }
        };
        Map map = (Map) ((HashMap) c1448690nnn.LIZ).get(CreativeModel.class);
        if (map == null) {
            map = new HashMap();
            ((HashMap) c1448690nnn.LIZ).put(CreativeModel.class, map);
        }
        map.put(c1448650nnj, interfaceC1448670nnl);
    }

    public final CreativeModel copyNonConstructParams(CreativeModel creativeModel, CreativeModel creativeModel2) {
        creativeModel.isInStoryTab = creativeModel2.isInStoryTab;
        creativeModel.quickPostOnEditPageModel = creativeModel2.quickPostOnEditPageModel;
        creativeModel.shortcutPublishStatusModel = creativeModel2.shortcutPublishStatusModel;
        creativeModel.toUploadAlbum = creativeModel2.toUploadAlbum;
        creativeModel.toAiSelfTab = creativeModel2.toAiSelfTab;
        creativeModel.challengeId = creativeModel2.challengeId;
        creativeModel.isCopiedModel = creativeModel2.isCopiedModel;
        creativeModel.videoDetectionRiskInfo = creativeModel2.videoDetectionRiskInfo;
        creativeModel.commentForwardModel = creativeModel2.commentForwardModel;
        creativeModel.workspace = creativeModel2.workspace;
        creativeModel.defaultCameraSpec = creativeModel2.defaultCameraSpec;
        creativeModel.defaultEnableMP4Encoding = creativeModel2.defaultEnableMP4Encoding;
        creativeModel.isTextModeWhenInit = creativeModel2.isTextModeWhenInit;
        creativeModel.conversionRateTime = creativeModel2.conversionRateTime;
        creativeModel.ffdEventReport = creativeModel2.ffdEventReport;
        creativeModel.propETGroupModel = creativeModel2.propETGroupModel;
        return creativeModel;
    }
}
