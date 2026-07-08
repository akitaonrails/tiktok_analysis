package com.bytedance.android.livesdk.layer;

import X.AbstractC1080560eE2;
import X.C1081550eFd;
import X.C1081740eFw;
import X.C1082380eGy;
import com.bytedance.android.live.layer.ILayerService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class LayerService implements ILayerService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0eFd] */
    @Override // com.bytedance.android.live.layer.ILayerService
    public final C1081550eFd MA(AbstractC1080560eE2 abstractC1080560eE2) {
        return new LayerSpecImpl(abstractC1080560eE2) { // from class: X.0eFd
            {
                super(abstractC1080560eE2);
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.sfs);
                ElementSpecImplKt.onAttach(elementSpecImpl, new AwS596S0100000_17(abstractC1080560eE2, 644));
                elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<C1081600eFi, MultiLiveRTCLayoutChannel>() { // from class: X.0eFe
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<MultiLiveRTCLayoutChannel> getType() {
                        return MultiLiveRTCLayoutChannel.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1081600eFi c1081600eFi) {
                        C1081600eFi c1081600eFi2 = c1081600eFi;
                        if (!C1081540eFc.LIZ(true)) {
                            C1081590eFh.LIZ(layeredElementContext.getDataChannel(), constraintProperty, c1081600eFi2, null);
                        }
                    }
                });
                elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<C956380azk, LinkCrossRoomStateChangeEvent>() { // from class: X.0eFf
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LinkCrossRoomStateChangeEvent> getType() {
                        return LinkCrossRoomStateChangeEvent.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C956380azk c956380azk) {
                        C956380azk c956380azk2 = c956380azk;
                        if (!C1081540eFc.LIZ(true)) {
                            C1081590eFh.LIZ(layeredElementContext.getDataChannel(), constraintProperty, null, c956380azk2);
                        }
                    }
                });
                registerElement(elementSpecImpl);
            }
        };
    }

    @Override // com.bytedance.android.live.layer.ILayerService
    public final C1081740eFw df0(AbstractC1080560eE2 abstractC1080560eE2) {
        return new C1081740eFw(abstractC1080560eE2);
    }

    @Override // com.bytedance.android.live.layer.ILayerService
    public final C1082380eGy ra0(AbstractC1080560eE2 abstractC1080560eE2) {
        return new C1082380eGy(abstractC1080560eE2);
    }
}
