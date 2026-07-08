package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols;

import X.C01GW;
import X.C0IB0;
import X.C0ZRA;
import X.C0ZRC;
import X.C0ZRD;
import X.C0ZRE;
import X.C0ZRG;
import X.C0ZRI;
import X.C0ZRJ;
import X.C0ZRK;
import X.C0ZXS;
import X.C0ZYF;
import X.C1954807lC;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C899710ZRh;
import X.C899730ZRj;
import X.C899740ZRk;
import X.C899780ZRo;
import X.C899790ZRp;
import X.C899800ZRq;
import X.C899810ZRr;
import X.C899820ZRs;
import X.C899840ZRu;
import X.C902710ZbB;
import X.EnumC899760ZRm;
import X.InterfaceC461380I7k;
import X.InterfaceC899750ZRl;
import X.InterfaceC902790ZbJ;
import X.InterfaceC903660Zci;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.experiment.IMMessageBubbleLayoutSetting;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import com.ss.android.ugc.aweme.utils.IChatCustomizeResourceHelper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class VoiceProtocol implements SkeletonMessageListProtocol<C899810ZRr, C899800ZRq> {
    public static final /* synthetic */ int LLIZ = 0;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899810ZRr>> LL = VoiceTranscriptSendPowerCell.class;
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899800ZRq>> LLILLJJLI = VoiceTranscriptReceivePowerCell.class;
    public final C899740ZRk LLILLL = new InterfaceC902790ZbJ<C899810ZRr>(this) { // from class: X.0ZRk
        public final Class<C899810ZRr> LL = C899810ZRr.class;

        @Override // X.InterfaceC902790ZbJ
        public final Integer getCustomViewPoolSize() {
            return null;
        }

        @Override // X.InterfaceC902790ZbJ
        public final Class<C899810ZRr> getPowerItemClazz() {
            return this.LL;
        }

        {
            this.getClass();
        }
    };
    public final C899730ZRj LLILZ = new InterfaceC902790ZbJ<C899800ZRq>(this) { // from class: X.0ZRj
        public final Class<C899800ZRq> LL = C899800ZRq.class;

        @Override // X.InterfaceC902790ZbJ
        public final Integer getCustomViewPoolSize() {
            return null;
        }

        @Override // X.InterfaceC902790ZbJ
        public final Class<C899800ZRq> getPowerItemClazz() {
            return this.LL;
        }

        {
            this.getClass();
        }
    };
    public final C898790ZNt LLILZIL = new C898790ZNt(new int[]{1813});
    public final MessageListProtocolEnum LLILZLL = MessageListProtocolEnum.VOICE;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C899800ZRq> An() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902780ZbI
    public final InterfaceC902790ZbJ<C899810ZRr> Wh() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899810ZRr>> da() {
        return this.LL;
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final Class<? extends IMSkeletonLayoutPowerCell<?, C899800ZRq>> gr() {
        return this.LLILLJJLI;
    }

    public static InterfaceC899750ZRl LIZ(C869590Y9l c869590Y9l) {
        C0ZRE c0zreLIZIZ = C0ZRA.LIZIZ(c869590Y9l);
        if (Intrinsics.LJFF(c0zreLIZIZ, C0ZRI.LIZ)) {
            return C899780ZRo.LIZ;
        }
        if (Intrinsics.LJFF(c0zreLIZIZ, C0ZRG.LIZ)) {
            return C899790ZRp.LIZ;
        }
        if (c0zreLIZIZ instanceof C0ZRC) {
            return new C0ZRD(((C0ZRC) c0zreLIZIZ).LIZ);
        }
        if (Intrinsics.LJFF(c0zreLIZIZ, C0ZRJ.LIZ)) {
            return C0ZRK.LIZ;
        }
        throw new C1954807lC();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final C902710ZbB Vx2(C01GW c01gw) {
        return new C902710ZbB(this, c01gw);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k m72(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        EnumC899760ZRm enumC899760ZRm;
        MessageBubbleStyle bubbleStyleForMessage;
        InterfaceC899750ZRl interfaceC899750ZRlLIZ = LIZ(c869590Y9l);
        if (C0ZRA.LIZ(c869590Y9l).hasInteracted) {
            enumC899760ZRm = EnumC899760ZRm.INTERACTED;
        } else {
            enumC899760ZRm = EnumC899760ZRm.NOT_INTERACTED;
        }
        IMMessageBubbleLayoutSetting.BubbleLayoutSetting bubbleLayoutSettingLIZ = IMMessageBubbleLayoutSetting.LIZ();
        C899840ZRu c899840ZRu = new C899840ZRu(bubbleLayoutSettingLIZ.voicePaddingBottomDp, bubbleLayoutSettingLIZ.voicePaddingTopDp);
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (objPluggableSpiForReal != null) {
            IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) objPluggableSpiForReal;
            IChatCustomizeResourceHelper.LIZ.getClass();
            IChatCustomizeResourceHelper iChatCustomizeResourceHelperLIZ = C0ZYF.LIZ();
            if (iChatCustomizeResourceHelperLIZ != null) {
                bubbleStyleForMessage = iChatCustomizeResourceHelperLIZ.getBubbleStyleForMessage(c869590Y9l);
            } else {
                bubbleStyleForMessage = null;
            }
            return new C899810ZRr(iIMMessageBubbleService.LIZIZ(bubbleStyleForMessage), c0ib0, C899710ZRh.LIZ(c869590Y9l), interfaceC899750ZRlLIZ, enumC899760ZRm, c899840ZRu);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol
    public final InterfaceC461380I7k ts1(C869590Y9l c869590Y9l, C0IB0 c0ib0) {
        EnumC899760ZRm enumC899760ZRm;
        MessageBubbleStyle bubbleStyleForMessage;
        boolean z;
        InterfaceC899750ZRl interfaceC899750ZRlLIZ = LIZ(c869590Y9l);
        if (C0ZRA.LIZ(c869590Y9l).hasInteracted) {
            enumC899760ZRm = EnumC899760ZRm.INTERACTED;
        } else {
            enumC899760ZRm = EnumC899760ZRm.NOT_INTERACTED;
        }
        IMMessageBubbleLayoutSetting.BubbleLayoutSetting bubbleLayoutSettingLIZ = IMMessageBubbleLayoutSetting.LIZ();
        C899840ZRu c899840ZRu = new C899840ZRu(bubbleLayoutSettingLIZ.voicePaddingBottomDp, bubbleLayoutSettingLIZ.voicePaddingTopDp);
        Object objPluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (objPluggableSpiForReal != null) {
            IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) objPluggableSpiForReal;
            IChatCustomizeResourceHelper.LIZ.getClass();
            IChatCustomizeResourceHelper iChatCustomizeResourceHelperLIZ = C0ZYF.LIZ();
            if (iChatCustomizeResourceHelperLIZ != null) {
                bubbleStyleForMessage = iChatCustomizeResourceHelperLIZ.getBubbleStyleForMessage(c869590Y9l);
            } else {
                bubbleStyleForMessage = null;
            }
            C0ZXS c0zxsLJ = iIMMessageBubbleService.LJ(bubbleStyleForMessage);
            C899820ZRs c899820ZRsLIZ = C899710ZRh.LIZ(c869590Y9l);
            if ((interfaceC899750ZRlLIZ instanceof C899790ZRp) && enumC899760ZRm == EnumC899760ZRm.NOT_INTERACTED) {
                z = true;
            } else {
                z = false;
            }
            return new C899800ZRq(c0zxsLJ, c0ib0, c899820ZRsLIZ, interfaceC899750ZRlLIZ, enumC899760ZRm, z, c899840ZRu);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
