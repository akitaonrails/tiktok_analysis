package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import X.C462180IAm;
import X.C869590Y9l;
import X.C898660ZNg;
import X.C902730ZbD;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class RecallMessageProtocol implements IMMessageListProtocol<C462180IAm> {
    public final C898660ZNg LL = new C898660ZNg(AFwS248S0000000_14.get$arr$(268));
    public final Class<? extends PowerCell<C462180IAm>> LLILLJJLI = RecallMessagePowerCell.class;
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.RECALL_MESSAGE;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C462180IAm> getPowerItemClazz() {
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

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C462180IAm> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LL;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C462180IAm>> getWithCell() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[PHI: r12
      0x0059: PHI (r12v1 boolean) = (r12v0 boolean), (r12v5 boolean) binds: [B:24:0x0056, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d A[PHI: r12 r13
      0x005d: PHI (r12v2 boolean) = (r12v1 boolean), (r12v4 boolean) binds: [B:27:0x005a, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r13v1 boolean) = (r13v0 boolean), (r13v3 boolean) binds: [B:27:0x005a, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1891350zJl mapToPowerItem(java.util.List r17, X.C869590Y9l r18, int r19) {
        /*
            r16 = this;
            int r0 = r19 + (-1)
            r1 = r17
            java.lang.Object r8 = X.C13LP.LJJJLZIJ(r0, r1)
            X.0Y9l r8 = (X.C869590Y9l) r8
            X.0IAm r4 = new X.0IAm
            X.06XP r3 = new X.06XP
            r1 = r18
            r3.<init>(r1)
            boolean r9 = X.C0ZDX.LJJIJIL(r1)
            boolean r10 = X.C0ZOT.LIZIZ(r1, r8)
            java.util.Map r0 = r1.getPropertyItemListMap()
            r7 = 1
            if (r0 == 0) goto L5f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5f
            r0 = 0
        L29:
            r11 = r0 ^ 1
            if (r8 == 0) goto L55
            boolean r0 = X.C0ZDX.LJJIJIL(r8)
            if (r0 != r7) goto L55
            r12 = 1
        L34:
            long r5 = r1.getSender()
            long r1 = r8.getSender()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L59
            r13 = 1
        L41:
            boolean r0 = X.C0ZDX.LJJJ(r8)
            if (r0 != r7) goto L5d
            r14 = 1
        L48:
            if (r19 != 0) goto L53
            r15 = 1
        L4b:
            X.0ZqV r0 = X.C912220ZqW.LIZ(r9, r10, r11, r12, r13, r14, r15)
            r4.<init>(r3, r0)
            return r4
        L53:
            r15 = 0
            goto L4b
        L55:
            r12 = 0
            if (r8 == 0) goto L59
            goto L34
        L59:
            r13 = 0
            if (r8 == 0) goto L5d
            goto L41
        L5d:
            r14 = 0
            goto L48
        L5f:
            r0 = 1
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.RecallMessageProtocol.mapToPowerItem(java.util.List, X.0Y9l, int):X.0zJl");
    }
}
