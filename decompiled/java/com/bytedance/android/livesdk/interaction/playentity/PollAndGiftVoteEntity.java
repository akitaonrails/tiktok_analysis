package com.bytedance.android.livesdk.interaction.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C01GW;
import X.C0KX8;
import X.C0UIM;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C176600m4;
import X.C20350414k2;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C452501pT;
import X.C492400JSs;
import X.C497740JfY;
import X.C748880TZe;
import X.C753250Tgh;
import X.C766270U4b;
import X.C769040UEs;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC20354714kj;
import X.InterfaceC979390bar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.interaction.pollandgiftvote.ToolWrapperDialog;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PollAndGiftVoteEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("poll", 0, 35600000, 0, C1697810uHb.LJIIJJI("quick_poll_ongoing", "quick_poll_finished", "text_poll_ongoing", "text_poll_finished", "gift_poll_ongoing", "gift_poll_finished", "never"), null, 20464);
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 198));

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.POLL_NORMAL, LJJLIIIJ());
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.POLL_QUICK_GIFT, LJJLIIIJ());
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.POLL_CUSTOMIZABLE, LJJLIIIJ());
    }

    public final C20350414k2 LJJLIIIJ() {
        return (C20350414k2) this.LLJJJJLIIL.getValue();
    }

    public final boolean LJJLIIIJILLIZJL() {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC771230UNd enumC771230UNd = iBroadcastService.getHostToolsCurrentStatus(EnumC773040UUc.POLL_NORMAL).LIZ;
        EnumC771230UNd enumC771230UNd2 = EnumC771230UNd.APPLYING;
        if (enumC771230UNd != enumC771230UNd2 && iBroadcastService.getHostToolsCurrentStatus(EnumC773040UUc.POLL_QUICK_GIFT).LIZ != enumC771230UNd2 && iBroadcastService.getHostToolsCurrentStatus(EnumC773040UUc.POLL_CUSTOMIZABLE).LIZ != enumC771230UNd2) {
            return false;
        }
        LJJIJ();
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        LJJIL();
        super.destroy();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        C0KX8 c0kx8;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        if (C176600m4.LIZIZ((Boolean) dataChannel.gg0(UserIsAnchorChannel.class))) {
            if (!C0UIM.LIZJ() || !C0UIM.LJI() || ((c0kx8 = (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class)) != null && c0kx8.LIZLLL)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        if (!LJJLIIIJILLIZJL()) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.POLL_NORMAL, LJJLIIIJ());
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.POLL_QUICK_GIFT, LJJLIIIJ());
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.POLL_CUSTOMIZABLE, LJJLIIIJ());
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131852592), C497740JfY.LJIJI(2131852592), R.attr.d7s, R.attr.d7s, C13BV.INSTANCE, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        C013C c013c = new C013C();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LLJ, AFwS276S0000000_31.get$arr$(44), new AwS126S0400000_31(this, c20361214lm, interfaceC20354714kj, c013c, 7), AFwS276S0000000_31.get$arr$(45), C497740JfY.LJIJI(2131841312), Boolean.TRUE, null, Boolean.valueOf(z));
        return c013c.element;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        FragmentManager fragmentManager;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        if (C769040UEs.LIZJ()) {
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = interfaceC20354714kj;
            if (lifecycleOwner != null) {
                PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 199));
            }
            PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
            ToolWrapperDialog toolWrapperDialogJ32 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).j32(new AwS275S0300000_31(this, (PollAndGiftVoteEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 12), new AwS275S0300000_31(this, (PollAndGiftVoteEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 13));
            if (toolWrapperDialogJ32 != null) {
                if (!toolWrapperDialogJ32.isShowing()) {
                    PlayEntityUtilKt.LJII(this, 2, c20361214lm, (InterfaceC20354714kj) c259800zU.element, true);
                    DataChannel dataChannel2 = this.LLJ;
                    if (dataChannel2 != null) {
                        dataChannel2.SX0(C753250Tgh.class, "toolbar_vote");
                    }
                    C492400JSs.LIZ(toolWrapperDialogJ32, fragmentManager, this.LLJJJJJIL.LIZ);
                    return;
                }
                return;
            }
            PlayEntityUtilKt.LJI(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, null, "dialog null", 0L, 40);
            return;
        }
        PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, null, 0L, 56);
    }
}
