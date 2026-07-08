package com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.trigger;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1052390dUb;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.rich.reward.gecko.api.IRewardGeckoPrefetchService;
import com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC20234614Fk
public final class RewardGeckoPrefetchBootFinishTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RewardGeckoPrefetchBootFinishTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0dUY] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IRewardGeckoPrefetchService iRewardGeckoPrefetchService = (IRewardGeckoPrefetchService) PluggableExtentionKt.pluggableSpi$default(IRewardGeckoPrefetchService.class, false, false, false, 14, null);
        if (iRewardGeckoPrefetchService != 0) {
            iRewardGeckoPrefetchService.LIZ(new InterfaceC1052390dUb() { // from class: X.0dUY
                @Override // X.InterfaceC1052390dUb
                public final void onFailure() {
                }

                @Override // X.InterfaceC1052390dUb
                public final void LIZ(RewardGeckoChannelConfig rewardGeckoChannelConfig) {
                    this.LIZ.getClass();
                    Collection collection = rewardGeckoChannelConfig.rewardAnoleGeckoChannels;
                    if (collection == null) {
                        collection = C13BV.INSTANCE;
                    }
                    Iterable iterable = rewardGeckoChannelConfig.rewardAdCommonChannels;
                    if (iterable == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    List listLJLIL = C13LP.LJLIL(iterable, collection);
                    ArrayList arrayList = (ArrayList) listLJLIL;
                    if (!arrayList.isEmpty()) {
                        String strLIZ = C1014230cV3.LIZ("coin_reward_ad");
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new CheckRequestBodyModel.TargetChannel((String) it2.next()));
                        }
                        C1551950qUL c1551950qULLJIILJJIL = C1552050qUV.LJIILJJIL(strLIZ, null);
                        if (c1551950qULLJIILJJIL != null) {
                            c1551950qULLJIILJJIL.LIZIZ("high_priority", null, C2097908Jt.LIZJ(new Pair(strLIZ, arrayList2)), null);
                        }
                    }
                }
            });
        }
    }
}
