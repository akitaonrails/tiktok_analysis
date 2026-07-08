package com.ss.android.ugc.slideslip.util;

import X.C01GW;
import X.C0CHQ;
import X.C0D9A;
import X.C1397705dX;
import X.C13BV;
import X.C13DA;
import X.C13LP;
import X.C13RD;
import X.C13RE;
import X.C15438062q;
import X.C1629080sUk;
import X.C1633070sbB;
import X.C1633200sbO;
import X.C1633270sbV;
import X.C1633750scH;
import X.C1633780scK;
import X.C1869207Tu;
import X.C1869307Tv;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C296610Bjv;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1635410sex;
import X.InterfaceC1869407Tw;
import X.InterfaceC20004513Ox;
import android.content.Context;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.repository.StreamServiceCreator;
import com.ss.android.ugc.aweme.sticker.repository.params.HorizontalEffectsFetcherRequest;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.tiktok.PrefetchEffectChunkedApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import rlf.a;

/* JADX INFO: loaded from: classes26.dex */
public final class PrefetchEffectChunkedApiImpl implements PrefetchEffectChunkedApi {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(363));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(362));

    public static C13RD LIZIZ() {
        Context applicationContext;
        Context contextN3;
        InterfaceC1635410sex interfaceC1635410sexCreate;
        EffectConfiguration effectConfigurationLJJIIZ;
        IAppContextManagerService iAppContextManagerService = (IAppContextManagerService) PluggableExtentionKt.pluggableSpi$default(IAppContextManagerService.class, false, false, false, 14, null);
        if (((iAppContextManagerService == null || (applicationContext = iAppContextManagerService.getApplicationContext()) == null) && (applicationContext = C0CHQ.LIZ) == null) || (contextN3 = C786410Ut5.N3(applicationContext)) == null) {
            return null;
        }
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(contextN3);
        IEffectPlatformFactory iEffectPlatformFactory = (IEffectPlatformFactory) PluggableExtentionKt.pluggableSpi$default(IEffectPlatformFactory.class, false, false, false, 14, null);
        if (iEffectPlatformFactory == null || (interfaceC1635410sexCreate = iEffectPlatformFactory.create(effectPlatformBuilder)) == null || (effectConfigurationLJJIIZ = interfaceC1635410sexCreate.LJJIIZ()) == null) {
            return null;
        }
        return effectConfigurationLJJIIZ.getEffectConfig();
    }

    @Override // com.ss.android.ugc.tiktok.PrefetchEffectChunkedApi
    public final void LIZ(String str, InterfaceC1869407Tw interfaceC1869407Tw, List list) {
        StreamServiceCreator streamServiceCreator;
        C0D9A c0d9aCreate;
        C13RD c13rdLIZIZ;
        int iLIZ;
        List list2 = list;
        C13RD c13rdLIZIZ2 = LIZIZ();
        if (c13rdLIZIZ2 != null && (streamServiceCreator = (StreamServiceCreator) PluggableExtentionKt.pluggableSpi$default(StreamServiceCreator.class, false, false, false, 14, null)) != null && (c0d9aCreate = streamServiceCreator.create()) != null) {
            C1633750scH c1633750scH = new C1633750scH(c0d9aCreate, c13rdLIZIZ2);
            if ((interfaceC1869407Tw instanceof C1869207Tu) && !((Boolean) this.LIZIZ.getValue()).booleanValue()) {
                return;
            }
            if (((interfaceC1869407Tw instanceof C1869307Tv) && !((Boolean) this.LIZ.getValue()).booleanValue()) || (c13rdLIZIZ = LIZIZ()) == null) {
                return;
            }
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            ArrayList arrayList = null;
            C1633200sbO c1633200sbO = new C1633200sbO(list2, 0, C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62));
            InterfaceC20004513Ox interfaceC20004513Ox = c13rdLIZIZ.LJJIFFI;
            C1633780scK c1633780scK = new C1633780scK(new AwS604S0100000_25(interfaceC20004513Ox, 925), new AwS639S0100000_25(interfaceC20004513Ox, 164));
            String shootWay = interfaceC1869407Tw.getShootWay();
            HorizontalEffectsFetcherRequest horizontalEffectsFetcherRequestLIZ = C1629080sUk.LIZ(null, list2);
            C13DA c13da = new C13DA();
            c13da.putAll(C13RE.LIZ(c13rdLIZIZ, true));
            List<String> list3 = horizontalEffectsFetcherRequestLIZ.insertEffectIds;
            if (list3 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                for (String str2 : list3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('\"');
                    sbLIZ.append(str2);
                    sbLIZ.append('\"');
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            c13da.put("insert_effect_ids", String.valueOf(arrayList));
            c13da.put("trending", String.valueOf(horizontalEffectsFetcherRequestLIZ.trending));
            c13da.put("favorite", String.valueOf(horizontalEffectsFetcherRequestLIZ.favorite));
            c13da.put("recent", String.valueOf(horizontalEffectsFetcherRequestLIZ.recent));
            String str3 = horizontalEffectsFetcherRequestLIZ.favoriteType;
            if (str3 != null) {
                c13da.put("favorite_type", str3);
            }
            String str4 = horizontalEffectsFetcherRequestLIZ.recentType;
            if (str4 != null) {
                c13da.put("recent_type", str4);
            }
            c13da.put("recent_effects_limit", String.valueOf(horizontalEffectsFetcherRequestLIZ.recentEffectsLimit));
            c13da.put("source_category", shootWay);
            c13da.put("show_filtered_effects", "true");
            C296610Bjv.LIZ.getClass();
            if (C296610Bjv.LIZ()) {
                Integer numValueOf = Integer.valueOf(a.LIZ.LIZ());
                if (numValueOf.intValue() > -1) {
                    iLIZ = numValueOf.intValue();
                } else {
                    iLIZ = interfaceC1869407Tw.LIZ();
                }
                c13da.put("shoot_tab_name", ShortVideoContext.LJIL(iLIZ));
            }
            C1633270sbV.LIZIZ.LIZIZ(c1633200sbO, c1633750scH, c1633780scK, str, new AwS546S0100000_2(new C1633070sbB(C2097608Jq.LJ()).LIZ(c13da.build()), (Map<String, C1397705dX>) 1207));
        }
    }
}
