package com.bytedance.android.livesdk.gift.receiving.model;

import X.C09CT;
import X.C1135880ffG;
import X.C1136240ffq;
import X.C2188811AlT;
import X.InterfaceC1136020ffU;
import X.InterfaceC1136160ffi;
import X.InterfaceC1136230ffp;
import X.InterfaceC1136800fgk;
import X.InterfaceC1136850fgp;
import com.bytedance.android.livesdk.gift.model.MatchInfo;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftQueueMessageModel implements InterfaceC1136020ffU {

    @C09CT("disable_gift_tracking")
    public boolean disableGiftTracking;

    @C09CT("effect_model")
    public InterfaceC1136230ffp effectModel;

    @C09CT("fan_ticket_count")
    public int fanTicketCount;

    @C09CT("user")
    public InterfaceC1136800fgk fromUser;

    @C09CT("gift")
    public InterfaceC1136160ffi gift;

    @C09CT("gift_dynamic")
    public InterfaceC1136850fgp giftDynamic;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("monitor_info")
    public GiftMonitorInfo giftMonitorInfo;

    @C09CT("group_id")
    public long groupId;

    @C09CT("interactive_gift_info")
    public GiftMessage.InteractiveGiftInfo interactiveGiftInfo;

    @C09CT("is_first_sent")
    public boolean isFirstSendGift;

    @C09CT("is_history_message")
    public boolean isHistoryMessage;

    @C09CT("is_local")
    public transient boolean isLocal;

    @C09CT("is_minute_game_timed_prop")
    public transient boolean isMinuteGameTimedProp;

    @C09CT("is_urgent")
    public transient boolean isUrgent;

    @C09CT("linkmic_gift_expression_strategy")
    public int linkmicGiftExpressionStrategy;

    @C09CT("match_info")
    public MatchInfo matchInfo;

    @C09CT("msg_id")
    public long messageId;

    @C09CT("monitor_extra")
    public String monitorExtra;

    @C09CT("multi_generate_message")
    public boolean multiGenerateMessage;

    @C09CT("order_id")
    public String orderId;

    @C09CT("repeat_count")
    public int repeatCount;

    @C09CT("repeat_end")
    public int repeatEnd;

    @C09CT("sponsorship_info")
    public List<GiftMessage.SponsorshipInfo> sponsorshipInfo;

    @C09CT("to_user")
    public InterfaceC1136800fgk toUser;

    @C09CT("tray_info")
    public GiftTrayInfo trayInfo;

    @C09CT("log_id")
    public String logId = "";

    @C09CT("send_gift_from")
    public transient String sendGiftFrom = "";

    @C09CT("to_member_nickname")
    public String toMemberNickname = "";

    @C09CT("client_monitor_info")
    public C1136240ffq clientMonitorInfo = new C1136240ffq();

    @C09CT("client_local_info")
    public C1135880ffG clientLocalInfo = new C1135880ffG(this);

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftQueueMessageModel(orderId=");
        sbLIZ.append(this.orderId);
        sbLIZ.append(", fromUser=");
        sbLIZ.append(this.fromUser);
        sbLIZ.append(", toUser=");
        sbLIZ.append(this.toUser);
        sbLIZ.append(", repeatCount=");
        sbLIZ.append(this.repeatCount);
        sbLIZ.append(", giftId=");
        sbLIZ.append(this.giftId);
        sbLIZ.append(", gift=");
        sbLIZ.append(this.gift);
        sbLIZ.append(", giftDynamic=");
        sbLIZ.append(this.giftDynamic);
        sbLIZ.append(", clientLocalInfo=");
        sbLIZ.append(this.clientLocalInfo);
        sbLIZ.append(", effectModel=");
        sbLIZ.append(this.effectModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1136020ffU
    public final String LIZIZ() {
        return this.sendGiftFrom;
    }

    @Override // X.InterfaceC1136020ffU
    public final InterfaceC1136800fgk LIZJ() {
        return this.toUser;
    }

    @Override // X.InterfaceC1136020ffU
    public final boolean LJ() {
        return this.isLocal;
    }

    @Override // X.InterfaceC1136020ffU
    public final boolean LJFF() {
        return this.isHistoryMessage;
    }

    @Override // X.InterfaceC1136020ffU
    public final InterfaceC1136160ffi LJIIIIZZ() {
        return this.gift;
    }

    @Override // X.InterfaceC1136020ffU
    public final int LJIIIZ() {
        return this.repeatEnd;
    }

    @Override // X.InterfaceC1136020ffU
    public final boolean LJIIJ() {
        return this.isFirstSendGift;
    }

    @Override // X.InterfaceC1136020ffU
    public final boolean LJIIJJI() {
        return this.isUrgent;
    }

    @Override // X.InterfaceC1136020ffU
    public final GiftMonitorInfo LJIIL() {
        return this.giftMonitorInfo;
    }

    @Override // X.InterfaceC1136020ffU
    public final boolean LJIILJJIL() {
        return this.multiGenerateMessage;
    }

    @Override // X.InterfaceC1136020ffU
    public final InterfaceC1136800fgk LJIILL() {
        return this.fromUser;
    }

    @Override // X.InterfaceC1136020ffU
    public final int LJIILLIIL() {
        return this.linkmicGiftExpressionStrategy;
    }

    @Override // X.InterfaceC1136020ffU
    public final MatchInfo LJIIZILJ() {
        return this.matchInfo;
    }

    @Override // X.InterfaceC1136020ffU
    public final InterfaceC1136850fgp LJIJ() {
        return this.giftDynamic;
    }

    @Override // X.InterfaceC1136020ffU
    public final List<GiftMessage.SponsorshipInfo> LJIJI() {
        return this.sponsorshipInfo;
    }

    @Override // X.InterfaceC1136020ffU
    public final boolean LJIJJ() {
        return this.isMinuteGameTimedProp;
    }

    @Override // X.InterfaceC1136020ffU
    public final boolean LJIJJLI() {
        return this.disableGiftTracking;
    }

    @Override // X.InterfaceC1136020ffU
    public final String LJIL() {
        return this.monitorExtra;
    }

    @Override // X.InterfaceC1136020ffU
    public final GiftTrayInfo LJJ() {
        return this.trayInfo;
    }

    @Override // X.InterfaceC1136020ffU
    public final C1135880ffG LJJI() {
        return this.clientLocalInfo;
    }

    @Override // X.InterfaceC1136020ffU
    public final C1136240ffq LJJIFFI() {
        return this.clientMonitorInfo;
    }

    @Override // X.InterfaceC1136020ffU
    public final InterfaceC1136230ffp LJJII() {
        return this.effectModel;
    }

    @Override // X.InterfaceC1136020ffU
    public final GiftMessage.InteractiveGiftInfo LJJIII() {
        return this.interactiveGiftInfo;
    }

    @Override // X.InterfaceC1136020ffU
    public final String LJJIIJ() {
        return this.toMemberNickname;
    }

    @Override // X.InterfaceC1136020ffU
    public final int getFanTicketCount() {
        return this.fanTicketCount;
    }

    @Override // X.InterfaceC1136020ffU
    public final long getGiftId() {
        return this.giftId;
    }

    @Override // X.InterfaceC1136020ffU
    public final long getGroupId() {
        return this.groupId;
    }

    @Override // X.InterfaceC1136020ffU
    public final String getLogId() {
        return this.logId;
    }

    @Override // X.InterfaceC1136020ffU
    public final long getMessageId() {
        return this.messageId;
    }

    @Override // X.InterfaceC1136020ffU
    public final String getOrderId() {
        return this.orderId;
    }

    @Override // X.InterfaceC1136020ffU
    public final int getRepeatCount() {
        return this.repeatCount;
    }

    public final void LIZ(boolean z) {
        this.disableGiftTracking = z;
    }

    public final void LIZLLL(InterfaceC1136230ffp interfaceC1136230ffp) {
        this.effectModel = interfaceC1136230ffp;
    }

    public final void LJI(int i) {
        this.fanTicketCount = i;
    }

    @Override // X.InterfaceC1136020ffU
    public final void LJII(int i) {
        this.repeatCount = i;
    }

    @Override // X.InterfaceC1136020ffU
    public final void LJIILIIL(List<GiftMessage.SponsorshipInfo> list) {
        this.sponsorshipInfo = list;
    }

    public final void LJJIIJZLJL(boolean z) {
        this.isFirstSendGift = z;
    }

    public final void LJJIIZ(InterfaceC1136800fgk interfaceC1136800fgk) {
        this.fromUser = interfaceC1136800fgk;
    }

    public final void LJJIIZI(InterfaceC1136160ffi interfaceC1136160ffi) {
        this.gift = interfaceC1136160ffi;
    }

    public final void LJJIJ(InterfaceC1136850fgp interfaceC1136850fgp) {
        this.giftDynamic = interfaceC1136850fgp;
    }

    public final void LJJIJIIJI(long j) {
        this.giftId = j;
    }

    public final void LJJIJIIJIL(GiftMonitorInfo giftMonitorInfo) {
        this.giftMonitorInfo = giftMonitorInfo;
    }

    public final void LJJIJIL(long j) {
        this.groupId = j;
    }

    public final void LJJIJL(boolean z) {
        this.isHistoryMessage = z;
    }

    public final void LJJIJLIJ(GiftMessage.InteractiveGiftInfo interactiveGiftInfo) {
        this.interactiveGiftInfo = interactiveGiftInfo;
    }

    public final void LJJIL(int i) {
        this.linkmicGiftExpressionStrategy = i;
    }

    public final void LJJIZ(boolean z) {
        this.isLocal = z;
    }

    public final void LJJJ(String str) {
        this.logId = str;
    }

    public final void LJJJI(MatchInfo matchInfo) {
        this.matchInfo = matchInfo;
    }

    public final void LJJJIL(long j) {
        this.messageId = j;
    }

    public final void LJJJJ(boolean z) {
        this.isMinuteGameTimedProp = z;
    }

    public final void LJJJJI(String str) {
        this.monitorExtra = str;
    }

    public final void LJJJJIZL(boolean z) {
        this.multiGenerateMessage = z;
    }

    public final void LJJJJJ(String str) {
        this.orderId = str;
    }

    public final void LJJJJJL(int i) {
        this.repeatEnd = i;
    }

    public final void LJJJJL(String str) {
        this.sendGiftFrom = str;
    }

    public final void LJJJJLI(String str) {
        this.toMemberNickname = str;
    }

    public final void LJJJJLL(InterfaceC1136800fgk interfaceC1136800fgk) {
        this.toUser = interfaceC1136800fgk;
    }

    public final void LJJJJZ(GiftTrayInfo giftTrayInfo) {
        this.trayInfo = giftTrayInfo;
    }

    public final void LJJJJZI(boolean z) {
        this.isUrgent = z;
    }
}
