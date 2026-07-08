package com.bytedance.android.livesdk.interaction.playentity;

import X.AbstractC20356314kz;
import X.C01GW;
import X.C1161920gLG;
import X.C13BV;
import X.C162100jj;
import X.C1697810uHb;
import X.C20348114jf;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C334801Rq;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C769040UEs;
import X.C782110Um9;
import X.C786410Ut5;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC20354714kj;
import X.InterfaceC743640TFa;
import X.InterfaceC953350aur;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS85S0500000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class LightningQaEntity extends AbstractC20356314kz {
    public InterfaceC953350aur LLJJJJLIIL;
    public final C20357914lF LLJJJJJIL = new C20357914lF("lightning_qa", 0, 35600000, 0, C1697810uHb.LJIIJJI("lightning_qa_ongoing", "lightning_qa_finished", "never"), "lightning_qa_ongoing", 4080);
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 197));

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.LIGHTING_QUESTION, (C20348114jf) this.LLJJL.getValue());
        this.LLJJJJLIIL = null;
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
        Boolean boolValueOf;
        InteractionQuestionInfo interactionQuestionInfo;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        if (C500260Jjc.LJJJI((Boolean) dataChannel.gg0(UserIsAnchorChannel.class))) {
            Room roomLIZ = C162100jj.LIZ(dataChannel);
            if (roomLIZ != null && (interactionQuestionInfo = roomLIZ.interactionQuestion) != null) {
                boolValueOf = Boolean.valueOf(interactionQuestionInfo.hasQuickAnswer);
            } else {
                boolValueOf = null;
            }
            return C500260Jjc.LJJJI(boolValueOf);
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.LIGHTING_QUESTION;
        if (iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ == EnumC771230UNd.APPLYING) {
            LJJIJ();
        } else {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(enumC773040UUc, (C20348114jf) this.LLJJL.getValue());
        }
    }

    public final boolean LJJLIIIJ(Object obj) {
        return ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).ym2(this.LLJ);
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131842942), C497740JfY.LJIJI(2131842942), R.attr.da8, R.attr.da8, C13BV.INSTANCE, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) {
        this.LLJJJJLIIL = interfaceC953350aur;
        if (Intrinsics.LJFF(str, "liveCenter")) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.LIGHTING_QUESTION, (C20348114jf) this.LLJJL.getValue());
        }
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).openOrApplyHostToolsAbility(EnumC773040UUc.LIGHTING_QUESTION, this.LLJ, context, new JSONObject());
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        Context contextLJIIIIZZ;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        if (C769040UEs.LIZJ()) {
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        if (lifecycleOwner != null && (contextLJIIIIZZ = PlayEntityUtilKt.LJIIIIZZ(lifecycleOwner)) != null) {
            if (LJJLIIIJ(null)) {
                C766270U4b.LIZLLL(2131854098);
                if (interfaceC20354714kj != null) {
                    interfaceC20354714kj.LJI(-1L);
                    return;
                }
                return;
            }
            final AwS85S0500000_31 awS85S0500000_31 = new AwS85S0500000_31(this, c20361214lm, interfaceC20354714kj, lifecycleOwner, contextLJIIIIZZ, 0);
            C782110Um9 c782110Um9 = new C782110Um9(contextLJIIIIZZ);
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131854141);
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131854139));
            c782110Um9.LJIILL = false;
            c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131854087), new InterfaceC743640TFa() { // from class: X.14jh
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131854140), new InterfaceC743640TFa() { // from class: X.14jg
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    awS85S0500000_31.invoke();
                }
            });
            C786410Ut5.E4(c782110Um9.LIZ());
            return;
        }
        PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, "context null", 0L, 40);
    }
}
