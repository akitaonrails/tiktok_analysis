package com.bytedance.android.livesdk.comp.impl.pcs.data.playentity;

import X.AbstractC20356314kz;
import X.C086F;
import X.C0JKF;
import X.C1161920gLG;
import X.C13BV;
import X.C20347614ja;
import X.C20347714jb;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C518880KWo;
import X.InterfaceC20354714kj;
import X.InterfaceC979390bar;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.util.SMBPageActionChannel;
import com.bytedance.android.livesdk.comp.impl.pcs.data.playentity.ServicePlusEntity;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes32.dex */
public final class ServicePlusEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("leads", 0, 39000003, 0, Collections.singletonList("always_true"), null, 28656);
    public C20361214lm LLJJJJLIIL;
    public InterfaceC20354714kj LLJJL;

    @Override // X.AbstractC20356314kz
    public final void LJJJJIZL() {
        C20441214yg.LIZIZ("ServicePlusEntity", "init");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addSMBPageActionChannelObserver ");
        sbLIZ.append(this.LLJ);
        C20441214yg.LIZIZ("ServicePlusEntity", C2188811AlT.LIZIZ(sbLIZ));
        C086F c086f = C086F.LIZ;
        Runnable runnable = new Runnable() { // from class: X.14g8
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ServicePlusEntity@7a11.addSMBPageActionChannelObserver$1");
                try {
                    ServicePlusEntity servicePlusEntity = this.LL;
                    DataChannel dataChannel = servicePlusEntity.LLJ;
                    if (dataChannel != null) {
                        dataChannel.CQ2(SMBPageActionChannel.class, servicePlusEntity, new C20346914jT(servicePlusEntity));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ServicePlusEntity@7a11.addSMBPageActionChannelObserver$1");
            }
        };
        c086f.getClass();
        C086F.LJII(runnable);
        C20441214yg.LIZIZ("ServicePlusEntity", "addSMBPageActionChannelObserver end");
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        super.destroy();
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        C500260Jjc.LJJLIIIJILLIZJL(new C20347714jb(this));
        LJJLIIIIJ(0);
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131856022), C497740JfY.LJIJI(2131856022), R.attr.cze, R.attr.cze, C13BV.INSTANCE, null, i, null, true, null, 3712);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLZIJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        LJJLIIIJ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        LJJLIIIJ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        C0JKF c0jkfW2;
        C20441214yg.LIZIZ("ServicePlusEntity", "readyToStartInner");
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return;
        }
        this.LLJJJJLIIL = c20361214lm;
        this.LLJJL = interfaceC20354714kj;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new C20347614ja(c259800zU));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        C20441214yg.LIZIZ("ServicePlusEntity", "readyToStartInner openServicePlusPage");
        IPcsService iPcsService = (IPcsService) C1161920gLG.LIZJ(IPcsService.class);
        if (iPcsService != null && (c0jkfW2 = iPcsService.w2()) != null) {
            c0jkfW2.LIZIZ();
            C518880KWo c518880KWo = C518880KWo.LL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("state_id", String.valueOf(c20361214lm.LIZIZ));
            c518880KWo.LJ(dataChannel, linkedHashMap);
            PlayEntityUtilKt.LJII(this, 2, c20361214lm, interfaceC20354714kj, true);
        } else {
            PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, null, 0L, 56);
        }
        C20441214yg.LIZIZ("ServicePlusEntity", "readyToStartInner openServicePlusPage end");
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        LJJLIIIJ(c20361214lm, interfaceC20354714kj, lifecycleOwner, str3);
    }
}
