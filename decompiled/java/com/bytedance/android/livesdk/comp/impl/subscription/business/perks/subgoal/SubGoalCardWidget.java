package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subgoal;

import X.C0IJT;
import X.C1108790exZ;
import X.C1124870fNV;
import X.C19748512Ol;
import X.C474500IjA;
import X.C782110Um9;
import X.C786410Ut5;
import X.EnumC1108700exQ;
import X.InterfaceC743640TFa;
import android.net.Uri;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.api.SubGoalPinCard;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.chatroom.api.SubPinCardText;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeGoalsLynxUrlSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: loaded from: classes18.dex */
public final class SubGoalCardWidget extends SubscriptionExplainCardWidget {
    public final int LLJJIJI = 2;

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public final void D1() {
        final C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_sub_goal_pin_confirm_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJIIZI(this.LLILZIL);
        c474500IjALIZ.LJJII(this.LLILZLL.name().toLowerCase(Locale.ROOT), "original_card_type");
        C782110Um9 c782110Um9 = new C782110Um9(this.context);
        c782110Um9.LJIIZILJ(2131844399);
        c782110Um9.LJII(2131844398);
        c782110Um9.LJIILIIL(2131843773, new InterfaceC743640TFa() { // from class: X.0exG
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) throws JSONException {
                if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Ly1()) {
                    ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).bC1(new C1108810exb(this.LIZ));
                } else {
                    this.LIZ.C1(true);
                }
                liveDialog.dismiss();
                C474500IjA c474500IjA = c474500IjALIZ;
                c474500IjA.LJJII(this.LIZ.LLILZLL.name().toLowerCase(Locale.ROOT), "original_card_type");
                c474500IjA.LJJII("confirm", "click_type");
                c474500IjA.LIZ();
            }
        });
        c782110Um9.LJIIJ(2131843772, new InterfaceC743640TFa() { // from class: X.0exT
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) throws JSONException {
                this.LIZ.C1(false);
                liveDialog.dismiss();
                C474500IjA c474500IjA = c474500IjALIZ;
                c474500IjA.LJJII("cancel", "click_type");
                c474500IjA.LIZ();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public final int z1() {
        return this.LLJJIJI;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public final void A1(EnumC1108700exQ enumC1108700exQ) {
        this.LLILZ = SystemClock.elapsedRealtime();
        if (this.LLILLJJLI) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_sub_goal_pin_duration");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJIIZI(this.LLILZIL);
            c474500IjALIZ.LJJII(Long.valueOf((this.LLILZ - this.LLILLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "anchor_pin_duration");
            c474500IjALIZ.LJJII(enumC1108700exQ.name().toLowerCase(Locale.ROOT), "finished_type");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceC1108360ews
    public final void LLLLZI(C1108790exZ c1108790exZ) {
        if (B1(c1108790exZ.LIZ, c1108790exZ.LIZJ, c1108790exZ.LIZLLL)) {
            this.dataChannel.zW(SubGoalCardVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC1108360ews
    public final void I(EnumC1108700exQ enumC1108700exQ, Long l) {
        if (E1(enumC1108700exQ, null)) {
            this.dataChannel.zW(SubGoalCardVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.pincard.SubscriptionExplainCardWidget
    public final String x1(SubPinCard subPinCard, boolean z) {
        Integer numValueOf;
        String strLIZIZ;
        long j;
        String str;
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        SubscribeInfo subscribeInfo2;
        SubPinCardText subPinCardText;
        SubPinCardText subPinCardText2;
        SubPinCardText subPinCardText3;
        SubGoalPinCard subGoalPinCard = subPinCard.goalPinCard;
        String str2 = null;
        if (subGoalPinCard != null && (subPinCardText3 = subGoalPinCard.desc) != null) {
            numValueOf = Integer.valueOf(subPinCardText3.type);
        } else {
            numValueOf = null;
        }
        String str3 = "";
        if (numValueOf == null) {
            strLIZIZ = "";
            str3 = strLIZIZ;
        } else {
            if (numValueOf.intValue() == 1) {
                SubGoalPinCard subGoalPinCard2 = subPinCard.goalPinCard;
                if (subGoalPinCard2 != null && (subPinCardText2 = subGoalPinCard2.desc) != null) {
                    strLIZIZ = subPinCardText2.content;
                }
            } else {
                if (numValueOf.intValue() == 2) {
                    C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                    SubGoalPinCard subGoalPinCard3 = subPinCard.goalPinCard;
                    if (subGoalPinCard3 != null && (subPinCardText = subGoalPinCard3.desc) != null) {
                        str2 = subPinCardText.content;
                    }
                    c1124870fNVLIZJ.getClass();
                    strLIZIZ = C1124870fNV.LIZIZ(str2);
                }
                strLIZIZ = "";
                str3 = strLIZIZ;
            }
            if (strLIZIZ != null) {
                str3 = strLIZIZ;
            }
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(SubscribeGoalsLynxUrlSetting.INSTANCE.getPinCard()).buildUpon().appendQueryParameter("goal_id", String.valueOf(subPinCard.id)).appendQueryParameter("description", str3);
        SubGoalPinCard subGoalPinCard4 = subPinCard.goalPinCard;
        long j2 = 0;
        if (subGoalPinCard4 != null) {
            j = subGoalPinCard4.progress;
        } else {
            j = 0;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("progress", String.valueOf(j));
        SubGoalPinCard subGoalPinCard5 = subPinCard.goalPinCard;
        if (subGoalPinCard5 != null) {
            j2 = subGoalPinCard5.target;
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("target", String.valueOf(j2));
        Room room = this.LL;
        if (room != null && (owner2 = room.getOwner()) != null && (subscribeInfo2 = owner2.getSubscribeInfo()) != null && subscribeInfo2.isSubscribed()) {
            str = "subscribed_not_expired";
        } else {
            Room room2 = this.LL;
            if (room2 != null && (owner = room2.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isInGracePeriod()) {
                str = "subscribed_expired_grace_period";
            } else {
                str = "not_subscribed";
            }
        }
        return builderAppendQueryParameter3.appendQueryParameter("subscription_state", str).appendQueryParameter("logParams", GsonProtectorUtils.toJson(C19748512Ol.LIZJ, this.LLILZIL)).build().toString();
    }
}
