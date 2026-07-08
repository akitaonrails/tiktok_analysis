package com.bytedance.ies.im.core.bridge.init;

import X.AnonymousClass0629;
import X.C05OY;
import X.C06LY;
import X.C0BB0;
import X.C0CCZ;
import X.C0T94;
import X.C0VZ0;
import X.C0YM2;
import X.C0YNY;
import X.C0Z57;
import X.C1492110ovp;
import X.C1586906Jf;
import X.C289850BXr;
import X.C300810Bqh;
import X.C5182020e;
import X.C706070Rmn;
import X.C706080Rmo;
import X.C882400YjW;
import X.C890330YwJ;
import X.C893710Z4f;
import X.C895630ZBp;
import X.C897370ZIh;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC754190TiD;
import X.InterfaceC874680YTa;
import X.InterfaceC897380ZIi;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.common.experiment.IMRecentActivityConfig;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.service.service.IMufAffinityScoreRepositoryInitializer;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: loaded from: classes15.dex */
public final class IMInitReadyBootFinishLegoTask implements C0CCZ {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "im_init_ready_boot_finish_task";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C882400YjW c882400YjW = C882400YjW.LIZ;
        C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
        c882400YjW.getClass();
        C882400YjW.LIZIZ(c0ym2).LJIIJ().LJI();
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIILLIIL();
        IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
        if (iAwemeImManager != null) {
            iAwemeImManager.LJFF();
        }
        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIJJLI();
        ArrayList arrayList = new ArrayList();
        arrayList.add(AFwS190S0000000_4.get$arr$(761));
        boolean z = false;
        if (((Number) C289850BXr.LIZ.getValue()).intValue() == 0) {
            arrayList.add(AFwS192S0000000_6.get$arr$(21));
            arrayList.add(AFwS192S0000000_6.get$arr$(22));
        }
        if (((IMRecentActivityConfig) C0Z57.LIZIZ.getValue()).enabled == 1) {
            IMChatListApi.LJJIII.getClass();
            InterfaceC754190TiD interfaceC754190TiDLJI = C890330YwJ.LIZ().LJI();
            if (interfaceC754190TiDLJI != null) {
                C0T94.LIZ.add(interfaceC754190TiDLJI);
            }
        }
        if (C0T94.LIZ.size() > 0) {
            arrayList.add(AFwS199S0000000_12.get$arr$(151));
        }
        if ((((Number) C0BB0.LIZ.getValue()).intValue() & 1) == 1) {
            arrayList.add(AFwS201S0000000_14.get$arr$(29));
        }
        if (C300810Bqh.LIZ()) {
            arrayList.add(AFwS201S0000000_14.get$arr$(30));
            arrayList.add(AFwS201S0000000_14.get$arr$(31));
            arrayList.add(AFwS201S0000000_14.get$arr$(32));
        }
        arrayList.add(AFwS201S0000000_14.get$arr$(28));
        C5182020e c5182020e = new C5182020e(arrayList, (List<Function0<Unit>>) 105);
        if (C706070Rmn.LIZ().topKAffinityRanking > 0 || C706080Rmo.LIZ().topKAffinityRanking > 0 || C05OY.LIZ()) {
            IMufAffinityScoreRepositoryInitializer.LIZ.getClass();
            IMufAffinityScoreRepositoryInitializer value = C893710Z4f.LIZIZ.getValue();
            if (value != null) {
                value.init();
            }
        }
        IStreakService.LJJIIZ.getClass();
        C06LY.LIZ().M();
        IStreakPetService.LIZ.getClass();
        C1586906Jf.LIZ().LJJIJIIJI();
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJJII();
        IMAIServiceAPI.LIZ.getClass();
        AnonymousClass0629.LIZ().LIZ().onBootFinish();
        AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3((List) arrayList, (List<? extends Effect>) 16);
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && iMFoundationBridgeApiLIZ.LIZ()) {
            z = true;
        }
        C1492110ovp.LIZJ("imrequest_sparse", c5182020e, awS547S0100000_3, z);
    }
}
