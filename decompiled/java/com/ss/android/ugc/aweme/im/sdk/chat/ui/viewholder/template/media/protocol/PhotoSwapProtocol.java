package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C01GW;
import X.C0IB0;
import X.C0ICS;
import X.C0YC6;
import X.C0Z5J;
import X.C0ZDX;
import X.C0ZRS;
import X.C0ZRT;
import X.C13BV;
import X.C2095008Iq;
import X.C457780HxI;
import X.C462620ICe;
import X.C869590Y9l;
import X.C896060ZDg;
import X.C896400ZEo;
import X.C898790ZNt;
import X.C901060ZWm;
import X.C902710ZbB;
import X.C911020Zoa;
import X.C911030Zob;
import X.InterfaceC461380I7k;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class PhotoSwapProtocol implements SkeletonMessageListProtocol<C911020Zoa, C911030Zob> {
    public final C457780HxI LL;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C911020Zoa>> LLILLJJLI = PhotoSwapSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C911030Zob>> LLILLL = PhotoSwapReceivePowerCell.class;
    public final C898790ZNt LLILZ = new C898790ZNt(new int[]{1802}, AFwS248S0000000_14.get$arr$(270));
    public final MessageListProtocolEnum LLILZIL = MessageListProtocolEnum.PHOTO_SWAP;

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C911030Zob> An() {
        return null;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C911020Zoa> Wh() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C911020Zoa>> da() {
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
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C911030Zob>> gr() {
        return this.LLILLL;
    }

    public PhotoSwapProtocol(C457780HxI c457780HxI) {
        this.LL = c457780HxI;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        C0ZRS c0zrs;
        C462620ICe c462620ICeLIZ = C0ICS.LIZ(true);
        List<C0YC6> attachments = c869590Y9l.getAttachments();
        if (attachments == null) {
            attachments = C13BV.INSTANCE;
        }
        boolean zLIZJ = C901060ZWm.LIZJ(c869590Y9l);
        Long lLJIILIIL = null;
        if (C896400ZEo.LJI(c869590Y9l)) {
            Boolean boolValueOf = Boolean.valueOf(C896400ZEo.LJII(c869590Y9l));
            String strLIZLLL = C896400ZEo.LIZLLL(c869590Y9l);
            if (strLIZLLL != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(strLIZLLL);
            }
            c0zrs = new C0ZRS(boolValueOf, lLJIILIIL);
        } else {
            c0zrs = null;
        }
        return new C911020Zoa(c0ib0, c0zrs, c462620ICeLIZ, attachments, zLIZJ, c869590Y9l.getMsgStatus(), c869590Y9l.getUuid());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        C0ZRS c0zrs;
        boolean z = false;
        C462620ICe c462620ICeLIZ = C0ICS.LIZ(false);
        List<C0YC6> attachments = c869590Y9l.getAttachments();
        if (attachments == null) {
            attachments = C13BV.INSTANCE;
        }
        Long lLJIILIIL = null;
        if (C896400ZEo.LJI(c869590Y9l)) {
            Boolean boolValueOf = Boolean.valueOf(C896400ZEo.LJII(c869590Y9l));
            String strLIZLLL = C896400ZEo.LIZLLL(c869590Y9l);
            if (strLIZLLL != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(strLIZLLL);
            }
            c0zrs = new C0ZRS(boolValueOf, lLJIILIIL);
        } else {
            c0zrs = null;
        }
        boolean zLIZJ = C901060ZWm.LIZJ(c869590Y9l);
        C0ZRT c0zrt = new C0ZRT(C896060ZDg.LIZLLL(c869590Y9l), C0Z5J.LIZJ(c869590Y9l));
        if (C0ZDX.LJJIJ(c869590Y9l) || this.LL.LL.isMediaMsgMasking()) {
            z = true;
        }
        return new C911030Zob(c0ib0, c0zrs, c462620ICeLIZ, attachments, zLIZJ, c0zrt, z);
    }
}
