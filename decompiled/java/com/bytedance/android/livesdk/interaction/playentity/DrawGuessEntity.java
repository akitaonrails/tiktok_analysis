package com.bytedance.android.livesdk.interaction.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C01GW;
import X.C0JFL;
import X.C0KWW;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20348014je;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C334801Rq;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C766720U5u;
import X.C768290UBv;
import X.C769040UEs;
import X.C946060aj6;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC20354714kj;
import X.InterfaceC953350aur;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.DrawGuessChannel;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class DrawGuessEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("draw_guess", 0, 39000003, 0, C1697810uHb.LJIIJJI("draw_guess_ongoing", "draw_guess_finished", "never"), "draw_guess_ongoing", 4080);
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 194));
    public InterfaceC953350aur LLJJL;

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.DRAW_GUESS, (C20348014je) this.LLJJJJLIIL.getValue());
        this.LLJJL = null;
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
        Boolean bool;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJJI(bool)) {
            C0KWW hostToolsUtil = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
            DataChannel dataChannel2 = this.LLJ;
            hostToolsUtil.getClass();
            LiveEffect liveEffectLIZIZ = C769040UEs.LIZIZ(dataChannel2);
            if (liveEffectLIZIZ == null || !C766720U5u.LJIILLIIL(liveEffectLIZIZ)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.DRAW_GUESS;
        if (iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ == EnumC771230UNd.APPLYING) {
            LJJIJ();
        } else {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(enumC773040UUc, (C20348014je) this.LLJJJJLIIL.getValue());
        }
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131841392), C497740JfY.LJIJI(2131841392), R.attr.daa, R.attr.daa, C13BV.INSTANCE, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        C013C c013c = new C013C();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LLJ, AFwS276S0000000_31.get$arr$(42), new AwS126S0400000_31(this, c20361214lm, interfaceC20354714kj, c013c, 6), AFwS276S0000000_31.get$arr$(43), C497740JfY.LJIJI(2131841392), Boolean.TRUE, null, Boolean.valueOf(z));
        return c013c.element;
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) {
        this.LLJJL = interfaceC953350aur;
        if (Intrinsics.LJFF(str, "liveCenter")) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.DRAW_GUESS, (C20348014je) this.LLJJJJLIIL.getValue());
        }
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).openOrApplyHostToolsAbility(EnumC773040UUc.DRAW_GUESS, this.LLJ, context, new JSONObject());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 195));
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        if (C769040UEs.LIZJ()) {
            C766270U4b.LIZLLL(2131854098);
            PlayEntityUtilKt.LJ(this, 1, c20361214lm, (InterfaceC20354714kj) c259800zU.element);
            return;
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(C768290UBv.LIZ(C497740JfY.LJII(), this.LLJ)))) {
            return;
        }
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zW(DrawGuessChannel.class, new C946060aj6(null, str3, null, null, new AwS575S0100000_31(this, 196), new AwS240S0300000_31(this, (DrawGuessEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 25), null, new AwS240S0300000_31(this, (DrawGuessEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 26), false, this.LLIZ, new AwS275S0300000_31(this, (DrawGuessEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 11), null, 9880));
        }
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        if (iRoomFunctionService != null) {
            iRoomFunctionService.Nf1();
            C0JFL.LIZIZ(this.LLJ);
        }
    }
}
