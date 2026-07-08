package com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable;

import X.C01GW;
import X.C0IB0;
import X.C0ZDX;
import X.C0ZN8;
import X.C0ZNH;
import X.C0ZNI;
import X.C0ZNJ;
import X.C0ZNT;
import X.C0ZNU;
import X.C0ZNW;
import X.C0ZNY;
import X.C1229100i5c;
import X.C869590Y9l;
import X.C898640ZNe;
import X.C898650ZNf;
import X.C898660ZNg;
import X.C902710ZbB;
import X.InterfaceC461380I7k;
import X.InterfaceC898720ZNm;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class UnavailableCardProtocol implements SkeletonMessageListProtocol<C898650ZNf, C898640ZNe> {
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C898650ZNf>> LL = UnavailableCardSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C898640ZNe>> LLILLJJLI = UnavailableCardReceivePowerCell.class;
    public final C898660ZNg LLILLL = new C898660ZNg(AFwS248S0000000_14.get$arr$(264));
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.UNAVAILABLE_CARD;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C898640ZNe> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C898650ZNf> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C898650ZNf>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C898640ZNe>> gr() {
        return this.LLILLJJLI;
    }

    public static C0ZNT LIZ(C869590Y9l c869590Y9l) {
        IMMediaThumbnailBridgeApi.LIZ.getClass();
        IMMediaThumbnailBridgeApi iMMediaThumbnailBridgeApiLIZ = C0ZN8.LIZ();
        if (iMMediaThumbnailBridgeApiLIZ == null) {
            return null;
        }
        if (C0ZDX.LJJIJIIJIL(c869590Y9l) && C1229100i5c.LJIIIZ(c869590Y9l.getConversationId())) {
            return new C0ZNH();
        }
        if (C0ZDX.LJJIJIIJIL(c869590Y9l) && C0ZNY.LJFF(c869590Y9l.getConversationId())) {
            return new C0ZNJ();
        }
        if (C0ZDX.LJJIIJ(c869590Y9l)) {
            if (c869590Y9l.getMsgType() != 1803 && c869590Y9l.getMsgType() != 1818) {
                return new C0ZNI(2131831015);
            }
            return new C0ZNI(2131831025);
        }
        if (!iMMediaThumbnailBridgeApiLIZ.LJI(c869590Y9l) || iMMediaThumbnailBridgeApiLIZ.LIZIZ(c869590Y9l)) {
            return null;
        }
        return C0ZNU.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f4 A[Catch: all -> 0x0235, TryCatch #0 {all -> 0x0235, blocks: (B:143:0x01d7, B:145:0x01db, B:147:0x01df, B:149:0x01e3, B:152:0x01ee, B:154:0x01f4, B:156:0x01f8, B:160:0x0202, B:162:0x0208, B:164:0x021b, B:166:0x0221, B:168:0x022b, B:170:0x0231), top: B:350:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x030b A[PHI: r4
      0x030b: PHI (r4v4 java.lang.String) = (r4v0 java.lang.String), (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:247:0x02fc, B:249:0x0300, B:253:0x0309] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4 A[PHI: r0
      0x00c4: PHI (r0v153 java.lang.String) = (r0v152 java.lang.String), (r0v155 java.lang.String) binds: [B:49:0x00ae, B:51:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6 A[PHI: r4
      0x00c6: PHI (r4v9 java.lang.String) = (r4v0 java.lang.String), (r4v12 java.lang.String) binds: [B:47:0x00a8, B:52:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC898720ZNm LIZJ(X.C869590Y9l r10) {
        /*
            Method dump skipped, instruction units count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.UnavailableCardProtocol.LIZJ(X.0Y9l):X.0ZNm");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        InterfaceC898720ZNm interfaceC898720ZNmLIZJ = LIZJ(c869590Y9l);
        return new C898650ZNf(C0ZNW.LIZIZ(C0ZNW.LIZ(c0ib0), interfaceC898720ZNmLIZJ), interfaceC898720ZNmLIZJ);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        InterfaceC898720ZNm interfaceC898720ZNmLIZJ = LIZJ(c869590Y9l);
        return new C898640ZNe(C0ZNW.LIZIZ(C0ZNW.LIZ(c0ib0), interfaceC898720ZNmLIZJ), interfaceC898720ZNmLIZJ);
    }
}
