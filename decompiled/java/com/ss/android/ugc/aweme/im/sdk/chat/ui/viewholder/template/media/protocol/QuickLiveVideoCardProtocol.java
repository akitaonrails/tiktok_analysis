package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C0YC6;
import X.C0Z5J;
import X.C0ZDX;
import X.C0ZRT;
import X.C13BV;
import X.C457780HxI;
import X.C462620ICe;
import X.C869590Y9l;
import X.C896060ZDg;
import X.C898790ZNt;
import X.C901060ZWm;
import X.C902710ZbB;
import X.C911010ZoZ;
import X.C911040Zoc;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class QuickLiveVideoCardProtocol implements SkeletonMessageListProtocol<C911010ZoZ, C911040Zoc> {
    public final C457780HxI LL;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C911010ZoZ>> LLILLJJLI = QuickLiveVideoSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C911040Zoc>> LLILLL = QuickLiveVideoReceivePowerCell.class;
    public final C898790ZNt LLILZ = new C898790ZNt(new int[]{1818});
    public final MessageListProtocolEnum LLILZIL = MessageListProtocolEnum.QUICK_LIVE_REACTION;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C911040Zoc> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C911010ZoZ> Wh() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C911010ZoZ>> da() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C911040Zoc>> gr() {
        return this.LLILLL;
    }

    public QuickLiveVideoCardProtocol(C457780HxI c457780HxI) {
        this.LL = c457780HxI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        C462620ICe c462620ICeLIZ = C0ICS.LIZ(true);
        List<C0YC6> attachments = c869590Y9l.getAttachments();
        if (attachments == null) {
            attachments = C13BV.INSTANCE;
        }
        return new C911010ZoZ(c0ib0, c462620ICeLIZ, attachments, C901060ZWm.LIZJ(c869590Y9l), c869590Y9l.getMsgStatus(), c869590Y9l.getUuid());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        boolean z;
        C457780HxI c457780HxI;
        SessionInfo sessionInfo;
        C462620ICe c462620ICeLIZ = C0ICS.LIZ(false);
        List<C0YC6> attachments = c869590Y9l.getAttachments();
        if (attachments == null) {
            attachments = C13BV.INSTANCE;
        }
        C0ZRT c0zrt = new C0ZRT(C896060ZDg.LIZLLL(c869590Y9l), C0Z5J.LIZJ(c869590Y9l));
        if (C0ZDX.LJJIJ(c869590Y9l) || ((c457780HxI = this.LL) != null && (sessionInfo = c457780HxI.LL) != null && sessionInfo.isMediaMsgMasking())) {
            z = true;
        } else {
            z = false;
        }
        return new C911040Zoc(c0ib0, c462620ICeLIZ, attachments, c0zrt, z);
    }
}
