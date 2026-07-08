package com.ss.android.ugc.aweme.im.sdk.chat.feature.inlinenotice;

import X.C01GW;
import X.C06H2;
import X.C06LY;
import X.C06XO;
import X.C06XP;
import X.C0I0B;
import X.C0YNY;
import X.C1509305vX;
import X.C1558420qem;
import X.C1558520qew;
import X.C1586906Jf;
import X.C1587106Jh;
import X.C1697810uHb;
import X.C817503Hh;
import X.C869590Y9l;
import X.C891480YyA;
import X.EnumC1514605wO;
import X.InterfaceC874680YTa;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.analytics.IIMReadMessageAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.ability.SystemNoticeBindAbility;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemNoticePowerCell extends AssemPowerCell<SystemNoticeReusedUISlotAssem, C06XO> {
    public final C01GW LLIZ = C1509305vX.LIZ(new AwS546S0100000_2(this, 368));
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 369));

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new SystemNoticeReusedUISlotAssem();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String scene;
        super.onViewAttachedToWindow();
        C06XO c06xo = (C06XO) getItem();
        if (c06xo == null) {
            return;
        }
        C06XP c06xp = c06xo.LL;
        SessionInfo sessionInfo = (SessionInfo) this.LLIZLLLIL.getValue();
        if (sessionInfo == null || !sessionInfo.isChatroomAnalyticsBlocked() || c06xp.LIZ.getMsgType() == 4084) {
            IIMReadMessageAnalytics.LIZ.getClass();
            IIMReadMessageAnalytics value = C1587106Jh.LIZIZ.getValue();
            if (value != null) {
                value.LIZ(c06xp.LIZ, (SessionInfo) this.LLIZLLLIL.getValue(), new C891480YyA(), C0I0B.LJFF.LIZIZ(), C817503Hh.LL, C0YNY.LIZ(InterfaceC874680YTa.LIZ));
            }
            String conversationId = c06xp.LIZ.getConversationId();
            C869590Y9l c869590Y9l = c06xp.LIZ;
            if (c869590Y9l.getMsgType() == 1 && (scene = c869590Y9l.getScene()) != null) {
                IStreakService.LJJIIZ.getClass();
                if (C06LY.LIZ().R(c869590Y9l)) {
                    IStreakService iStreakServiceLIZ = C06LY.LIZ();
                    String uuid = c869590Y9l.getUuid();
                    if (uuid == null) {
                        uuid = "";
                    }
                    iStreakServiceLIZ.e(conversationId, uuid, C06H2.CHAT, scene);
                }
                if (C1697810uHb.LJIIJJI("streak_start", "streak_milestone_unlock", "streak_start_egg_hatched", "streak_interaction_unlock", "streak_end", "streak_end_no_restore", "streak_end_with_restore", "streak_restore", "streak_recover", "streak_new_recover_no_pet", "streak_new_recover_few_restore_left", "streak_guidance", "streak_milestone_upgrade", "streak_pet_ready", "streak_group_pet_ready", "streak_pet_removed", "streak_group_pet_removed", "streak_restore_pet", "streak_end_pet", "streak_end_no_restore_with_pet", "streak_end_with_restore_with_pet", "streak_recover_pet", "streak_new_recover_with_pet", "streak_new_recover_with_pet_few_restore_left", "streak_group_end_with_restore", "streak_group_end_no_restore", "streak_group_recover", "streak_group_upgrade", "streak_group_unlock").contains(scene)) {
                    IStreakService iStreakServiceLIZ2 = C06LY.LIZ();
                    int conversationType = c869590Y9l.getConversationType();
                    String uuid2 = c869590Y9l.getUuid();
                    if (uuid2 == null) {
                        uuid2 = "";
                    }
                    iStreakServiceLIZ2.n(conversationId, conversationType, uuid2, C06H2.CHAT, scene, c869590Y9l);
                    IStreakPetService.LIZ.getClass();
                    IStreakPetService iStreakPetServiceLIZ = C1586906Jf.LIZ();
                    String uuid3 = c869590Y9l.getUuid();
                    iStreakPetServiceLIZ.LJJIJ(conversationId, uuid3 != null ? uuid3 : "", EnumC1514605wO.CHAT, scene);
                }
            }
            SystemNoticeBindAbility systemNoticeBindAbility = (SystemNoticeBindAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), SystemNoticeBindAbility.class, null);
            if (systemNoticeBindAbility != null) {
                systemNoticeBindAbility.cH1(c06xp.LIZ);
            }
        }
    }
}
