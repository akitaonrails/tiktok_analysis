package com.ss.android.ugc.aweme.im.streak.impl.pet.assem;

import X.AbstractC738140SxQ;
import X.C054G;
import X.C06C6;
import X.C06C8;
import X.C06HP;
import X.C06HR;
import X.C06HT;
import X.C06IT;
import X.C13LE;
import X.C1559260qg8;
import X.C1590906Kt;
import X.C1598406Nq;
import X.C1807670x8n;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C457780HxI;
import X.C723580SZw;
import X.EnumC1596306Mv;
import X.InterfaceC2217461Bqa;
import X.InterfaceC332260D0u;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakCampaignInfo;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakWheeDriveTrafficAssem extends AbstractC738140SxQ implements C06C8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C054G LLILLJJLI;
    public volatile boolean LLILLL;
    public volatile boolean LLILZ;
    public final AssemVMLazy LLILZIL;
    public volatile C1598406Nq LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StreakWheeDriveTrafficAssem.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C06C8
    public final void SI2(String str, StreakPetData streakPetData, StreakPetData streakPetData2) {
    }

    public final String bo() {
        SessionInfo sessionInfo;
        String conversationId;
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        return (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null || (conversationId = sessionInfo.getConversationId()) == null) ? "" : conversationId;
    }

    public StreakWheeDriveTrafficAssem() {
        C1598406Nq c1598406Nq = this.LLILZLL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLILZLL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLILZLL = c1598406Nq;
                }
            }
        }
        this.LLILLJJLI = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        this.LLILZIL = C06IT.LIZ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        String strBo = bo();
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WheeDriveTrafficDisplayState reset conversationId=");
        sbLIZ.append(strBo);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC332260D0u<C06HR> interfaceC332260D0u = C06HP.LIZ.get(strBo);
        if (interfaceC332260D0u != null) {
            interfaceC332260D0u.setValue(C06HR.UNDECIDED);
        }
        C06C6.LIZIZ.getClass();
        C06C6.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        StreakCampaignInfo streakCampaignInfo;
        super.onDestroy();
        if (this.LLILZIL.isInitialized()) {
            ((ICommonChatNoticeViewModel) this.LLILZIL.getValue()).BQ2(EnumC1596306Mv.STREAK_EXCLUSIVE_OUTFIT_FOR_WHEE);
        }
        C2296808zG.LIZJ(this.LLILLJJLI, null);
        C06C6.LIZIZ.getClass();
        C06C6.LJ(this);
        if (this.LLILZ) {
            C1590906Kt.LIZ("StreakWheeDriveTrafficAssem onDestroy, card banner was showing, set NOT_SHOWING");
            C06HP.LIZ(bo(), C06HR.NOT_SHOWING);
        }
        String strBo = bo();
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WheeDriveTrafficDisplayState clear conversationId=");
        sbLIZ.append(strBo);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C06HP.LIZ.remove(strBo);
        StreakExtension streakExtensionLIZ = C06HT.LIZ(strBo);
        if (streakExtensionLIZ == null || (streakCampaignInfo = streakExtensionLIZ.campaign) == null || !streakCampaignInfo.widgetEligibleByClient) {
            return;
        }
        ((ConcurrentHashMap) C06HT.LL).put(strBo, new StreakExtension(streakExtensionLIZ.shouldDisplayPromotionalWidget, StreakCampaignInfo.LIZ(streakCampaignInfo, false)));
    }

    @Override // X.C06C8
    public final void Ro1(String str) {
        if (!Intrinsics.LJFF(bo(), str) || !this.LLILZIL.isInitialized()) {
            return;
        }
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakWheeDriveTrafficAssem onCountdownTimerEnd, conversationId=");
        sbLIZ.append(str);
        sbLIZ.append(", dismiss card banner");
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((ICommonChatNoticeViewModel) this.LLILZIL.getValue()).BQ2(EnumC1596306Mv.STREAK_EXCLUSIVE_OUTFIT_FOR_WHEE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    @Override // X.C06C8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wK0(java.lang.String r18, com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension r19, com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r20) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakWheeDriveTrafficAssem.wK0(java.lang.String, com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension, com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData):void");
    }
}
