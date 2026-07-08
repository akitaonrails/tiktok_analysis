package com.bytedance.android.livesdk.impl.revenue.playentity;

import X.AbstractC20356314kz;
import X.C013C;
import X.C1104630eqr;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20353714kZ;
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
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.event.TreasureBoxCurrentData;
import com.bytedance.android.livesdk.impl.revenue.playentity.TreasureBoxEntity;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class TreasureBoxEntity extends AbstractC20356314kz {
    public C20361214lm LLJJJJLIIL;
    public InterfaceC20354714kj LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public final C20357914lF LLJJJJJIL = new C20357914lF("treasure_box", 0, 39000003, 0, C1697810uHb.LJIIJJI("treasure_box_ongoing", "treasure_box_finished_one", "treasure_box_finished_all", "never"), null, 20464);
    public final C20353714kZ LLJL = new InterfaceC978780bZs() { // from class: X.14kZ
        @Override // X.InterfaceC978780bZs
        public final void LIZ() {
            TreasureBoxEntity treasureBoxEntity = this.LIZ;
            C20361214lm c20361214lm = treasureBoxEntity.LLJJJJLIIL;
            InterfaceC20354714kj interfaceC20354714kj = treasureBoxEntity.LLJJL;
            if (c20361214lm == null || interfaceC20354714kj == null) {
                return;
            }
            PlayEntityUtilKt.LJII(treasureBoxEntity, 2, c20361214lm, interfaceC20354714kj, true);
        }

        @Override // X.InterfaceC978780bZs
        public final void onSuccess() {
            TreasureBoxEntity treasureBoxEntity = this.LIZ;
            if (treasureBoxEntity.LLJJLIIIJLLLLLLLZ > 0) {
                treasureBoxEntity.LLJJLIIIJLLLLLLLZ = 0L;
            }
        }

        @Override // X.InterfaceC978780bZs
        public final void LIZIZ(boolean z) {
            this.LIZ.LJJLIIIIJ(0);
            if (z) {
                TreasureBoxEntity treasureBoxEntity = this.LIZ;
                C20361214lm c20361214lm = treasureBoxEntity.LLJJJJLIIL;
                InterfaceC20354714kj interfaceC20354714kj = treasureBoxEntity.LLJJL;
                if (c20361214lm != null && interfaceC20354714kj != null) {
                    PlayEntityUtilKt.LJ(treasureBoxEntity, 2, c20361214lm, interfaceC20354714kj);
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
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 182));
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
        Boolean bool;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJJI(bool)) {
            return ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).enableRedEnvelope();
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        List list;
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && (list = (List) dataChannel.gg0(TreasureBoxCurrentData.class)) != null && (!list.isEmpty())) {
            LJJIJ();
            return;
        }
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.CQ2(TreasureBoxCurrentData.class, this, new AwS610S0100000_31(this, 102));
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131844585), C497740JfY.LJIJI(2131844585), R.attr.dhs, R.attr.dhs, C13BV.INSTANCE, null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        C013C c013c = new C013C();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LLJ, AFwS276S0000000_31.get$arr$(40), new AwS126S0400000_31(this, c20361214lm, interfaceC20354714kj, c013c, 5), AFwS276S0000000_31.get$arr$(41), C497740JfY.LJIJI(2131844585), Boolean.TRUE, null, Boolean.valueOf(z));
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
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new AwS575S0100000_31(c259800zU, (C259800zU<InterfaceC20354714kj>) 183));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        this.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C1104630eqr c1104630eqr = new C1104630eqr("start_treasure_box", new WeakReference(this.LLJL));
        c1104630eqr.LIZJ = "playbooks";
        c784440UpuLIZ.LIZIZ(c1104630eqr);
    }
}
