package com.ss.android.ugc.aweme.im.sdk.chat.ui.live;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C0ZUX;
import X.C0ZUY;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareLiveEventProtocol implements SkeletonMessageListProtocol<C0ZUY, C0ZUX> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZUY>> LL = ShareLiveEventSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZUX>> LLILLJJLI = ShareLiveEventReceivePowerCell.class;
    public final C898790ZNt LLILLL = new C898790ZNt(new int[]{1034});
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.SHARE_LIVE_EVENT;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ZUX> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C0ZUY> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZUY>> da() {
        return this.LL;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C0ZUX>> gr() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0ZUZ LIZ(com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent r11) {
        /*
            java.lang.String r1 = ""
            if (r11 == 0) goto L6c
            java.lang.String r0 = r11.getLinkUrl()
            boolean r0 = X.C824430WVt.LIZIZ(r0)
            if (r0 != 0) goto L6c
            java.lang.String[] r0 = X.C844450XAt.LIZ
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r11.getOrganizerAvatar()
            boolean r0 = X.C844450XAt.LJ(r0)
            if (r0 != 0) goto L6c
            X.0ZUZ r4 = new X.0ZUZ
            r5 = 0
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r11.getOrganizerAvatar()
            X.04wF r7 = new X.04wF
            java.lang.String r0 = r11.getTitle()
            if (r0 != 0) goto L2a
            r0 = r1
        L2a:
            r7.<init>(r0)
            X.04sA r8 = new X.04sA
            java.lang.String r3 = r11.getStartTime()
            if (r3 != 0) goto L36
            r3 = r1
        L36:
            kotlin.jvm.internal.AwS593S0100000_14 r2 = new kotlin.jvm.internal.AwS593S0100000_14
            r0 = 351(0x15f, float:4.92E-43)
            r2.<init>(r11, r0)
            r8.<init>(r3, r2)
            X.0ZVS r0 = com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService r3 = X.C0ZVS.LIZ()
            if (r3 == 0) goto L6a
            java.lang.String r2 = r11.getOrganizerVerifyReason()
            java.lang.String r0 = r11.getOrganizerEnterprise()
            boolean r0 = r3.LJIIJ(r2, r0)
            r9 = 1
            if (r0 != r9) goto L6a
        L5a:
            X.04wF r10 = new X.04wF
            java.lang.String r0 = r11.getOrganizerName()
            if (r0 == 0) goto L63
            r1 = r0
        L63:
            r10.<init>(r1)
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L6a:
            r9 = 0
            goto L5a
        L6c:
            X.0ZUZ r4 = new X.0ZUZ
            r5 = 1
            r6 = 0
            X.04sB r7 = new X.04sB
            r0 = 2131836214(0x7f113d36, float:1.9305588E38)
            r7.<init>(r0, r6)
            X.04wF r8 = new X.04wF
            r8.<init>(r1)
            r9 = 0
            X.04wF r10 = new X.04wF
            r10.<init>(r1)
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.live.ShareLiveEventProtocol.LIZ(com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent):X.0ZUZ");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C0ZUY(LIZ((ShareLiveEventContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareLiveEventContent.class)), C0ICS.LIZ(true), c0ib0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        return new C0ZUX(LIZ((ShareLiveEventContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareLiveEventContent.class)), C0ICS.LIZ(false), c0ib0);
    }
}
