package com.bytedance.android.livesdk.comp.impl.pcs.data.playentity;

import X.AbstractC20356314kz;
import X.C01GW;
import X.C086F;
import X.C0JKF;
import X.C1161920gLG;
import X.C13BV;
import X.C1697810uHb;
import X.C20325214fy;
import X.C20347314jX;
import X.C20347514jZ;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.C259800zU;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C518880KWo;
import X.C518950KWv;
import X.C766270U4b;
import X.C930940aKi;
import X.EnumC518930KWt;
import X.InterfaceC20354714kj;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.PlaybookQueueEntityStatusChannel;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.event.SubQueueInitialEvent;
import com.bytedance.android.livesdk.comp.api.pcs.util.SMBPageActionChannel;
import com.bytedance.android.livesdk.comp.impl.pcs.data.playentity.QueueEntity;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class QueueEntity extends AbstractC20356314kz {
    public C20361214lm LLJJJJLIIL;
    public InterfaceC20354714kj LLJJL;
    public final C20357914lF LLJJJJJIL = new C20357914lF("subscription_queue", 0, 39000003, 0, C1697810uHb.LJIIJJI("queue_ongoing", "queue_finished", "never"), null, 20464);
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new C20325214fy());

    public static boolean LJJLIIIJ() {
        C0JKF c0jkfW2;
        IPcsService iPcsService = (IPcsService) C1161920gLG.LIZJ(IPcsService.class);
        if (iPcsService == null || (c0jkfW2 = iPcsService.w2()) == null) {
            return false;
        }
        c0jkfW2.LIZIZ();
        C518880KWo.LIZLLL();
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIL() {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJIZL() {
        C086F c086f = C086F.LIZ;
        Runnable runnable = new Runnable() { // from class: X.14g7
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("QueueEntity@e23f.addSMBPageActionChannelObserver$1");
                try {
                    QueueEntity queueEntity = this.LL;
                    DataChannel dataChannel = queueEntity.LLJ;
                    if (dataChannel != null) {
                        dataChannel.CQ2(SMBPageActionChannel.class, queueEntity, new C20347114jV(queueEntity));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("QueueEntity@e23f.addSMBPageActionChannelObserver$1");
            }
        };
        c086f.getClass();
        C086F.LJII(runnable);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJJZI() {
        LJJIL();
        super.LJJJJZI();
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void destroy() {
        super.destroy();
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        C086F c086f = C086F.LIZ;
        Runnable runnable = new Runnable() { // from class: X.14fk
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("QueueEntity@e23f.clearData$1");
                try {
                    this.LL.LJJIL();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("QueueEntity@e23f.clearData$1");
            }
        };
        c086f.getClass();
        C086F.LJII(runnable);
        LJJLIIIIJ(0);
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        return LJJLIIIJ();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(PlaybookQueueEntityStatusChannel.class), Boolean.TRUE)) {
            LJJIJ();
            return;
        }
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.CQ2(PlaybookQueueEntityStatusChannel.class, this, new C20347314jX(this));
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln(C497740JfY.LJIJI(2131836557), C497740JfY.LJIJI(2131836557), R.attr.czt, R.attr.czt, C13BV.INSTANCE, null, i, null, true, null, 3712);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJFF();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLZIJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        LJJLIIIJILLIZJL(c20361214lm, interfaceC20354714kj, lifecycleOwner, str);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJZ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        if (C500260Jjc.LJJIL()) {
            C766270U4b.LIZLLL(2131856003);
        } else {
            LJJLIIIJILLIZJL(c20361214lm, interfaceC20354714kj, lifecycleOwner, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJILLIZJL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str) {
        long id;
        String secUid;
        User owner;
        this.LLJJJJLIIL = c20361214lm;
        this.LLJJL = interfaceC20354714kj;
        if (!LJJLIIIJ()) {
            PlayEntityUtilKt.LJI(this, c20361214lm, interfaceC20354714kj, null, null, 0L, 56);
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlayEntityUtilKt.LJIILL(lifecycleOwner, new C20347514jZ(c259800zU));
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        System.currentTimeMillis();
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.FQ2(SubQueueInitialEvent.class);
        }
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != null) {
            dataChannel2.zW(SMBPageActionChannel.class, new C518950KWv(EnumC518930KWt.QUEUE, null));
        }
        C0JKF c0jkfW2 = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).w2();
        Context context = ((IHostAppContext) this.LLJJLIIIJLLLLLLLZ.getValue()).context();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        HashMap map = new HashMap();
        if (C500260Jjc.LJJIL()) {
            secUid = UserService.getInstance().user().getCurrentUser().getSecUid();
        } else {
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room2 == null || (owner = room2.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                secUid = CardStruct.IStatusCode.DEFAULT;
            }
        }
        map.put("sec_anchor_id", secUid);
        map.put("queue_source_page", "playbook");
        map.put("has_sub_permission", "1");
        c0jkfW2.LIZ(id, context, map);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        LJJLIIIJILLIZJL(c20361214lm, interfaceC20354714kj, lifecycleOwner, str3);
    }
}
