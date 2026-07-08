package com.bytedance.android.livesdk.impl.revenue.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C1104630eqr;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20353614kY;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C784440Upu;
import X.InterfaceC20354714kj;
import X.InterfaceC978780bZs;
import X.InterfaceC979390bar;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.event.GoodyBagUpdateEvent;
import com.bytedance.android.livesdk.impl.revenue.playentity.GoodyBagEntity;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class GoodyBagEntity extends AbstractC20356314kz {
    public C20361214lm LLJJJJLIIL;
    public InterfaceC20354714kj LLJJL;
    public final C20357914lF LLJJJJJIL = new C20357914lF("goody_bag", 0, 39000003, 0, C1697810uHb.LJIIJJI("goody_bag_ongoing", "goody_bag_finished", "never"), null, 20464);
    public final C20353614kY LLJJLIIIJLLLLLLLZ = new InterfaceC978780bZs() { // from class: X.14kY
        @Override // X.InterfaceC978780bZs
        public final void LIZ() {
            GoodyBagEntity goodyBagEntity = this.LIZ;
            C20361214lm c20361214lm = goodyBagEntity.LLJJJJLIIL;
            InterfaceC20354714kj interfaceC20354714kj = goodyBagEntity.LLJJL;
            if (c20361214lm == null || interfaceC20354714kj == null) {
                return;
            }
            PlayEntityUtilKt.LJII(goodyBagEntity, 2, c20361214lm, interfaceC20354714kj, true);
        }

        @Override // X.InterfaceC978780bZs
        public final void onSuccess() {
            GoodyBagEntity goodyBagEntity = this.LIZ;
            InterfaceC20354714kj interfaceC20354714kj = goodyBagEntity.LLJJL;
            if (interfaceC20354714kj != null) {
                interfaceC20354714kj.LIZIZ(goodyBagEntity.LLJJJJJIL.LIZLLL, "", true);
            }
        }

        @Override // X.InterfaceC978780bZs
        public final void LIZIZ(boolean z) {
            this.LIZ.LJJLIIIIJ(0);
            if (z) {
                GoodyBagEntity goodyBagEntity = this.LIZ;
                C20361214lm c20361214lm = goodyBagEntity.LLJJJJLIIL;
                InterfaceC20354714kj interfaceC20354714kj = goodyBagEntity.LLJJL;
                if (c20361214lm != null && interfaceC20354714kj != null) {
                    PlayEntityUtilKt.LJ(goodyBagEntity, 2, c20361214lm, interfaceC20354714kj);
                }
            }
        }
    };

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 180));
        super.destroy();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        if (C500260Jjc.LJJJI((Boolean) dataChannel.gg0(UserIsAnchorChannel.class))) {
            return ((IGoodyBagService) C1161920gLG.LIZJ(IGoodyBagService.class)).ul2(dataChannel);
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(GoodyBagUpdateEvent.class), Boolean.TRUE)) {
            LJJIJ();
            return;
        }
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.CQ2(GoodyBagUpdateEvent.class, this, new AwS610S0100000_31(this, 101));
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131842036), C497740JfY.LJIJI(2131842036), R.attr.d_r, R.attr.d_r, C13BV.INSTANCE, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        C013C c013c = new C013C();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LLJ, AFwS276S0000000_31.get$arr$(38), new AwS126S0400000_31(this, c20361214lm, interfaceC20354714kj, c013c, 4), AFwS276S0000000_31.get$arr$(39), C497740JfY.LJIJI(2131842036), Boolean.TRUE, null, Boolean.valueOf(z));
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
        this.LLJJJJLIIL = c20361214lm;
        this.LLJJL = interfaceC20354714kj;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 181));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        System.currentTimeMillis();
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C1104630eqr c1104630eqr = new C1104630eqr("start_goody_bag", new WeakReference(this.LLJJLIIIJLLLLLLLZ));
        c1104630eqr.LIZJ = "playbooks";
        c784440UpuLIZ.LIZIZ(c1104630eqr);
    }
}
