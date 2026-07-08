package com.bytedance.android.livesdk.interaction.custompoll.shorttouch;

import X.C01C1;
import X.C01C3;
import X.C0IUQ;
import X.C1085340eLk;
import X.C1086960eOM;
import X.C2645010p;
import X.EnumC1085350eLl;
import X.InterfaceC1085330eLj;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class PollShortTouchHelper$addShortTouch$1$1$1$1$observerView$1 implements InterfaceC1085330eLj, GenericLifecycleObserver {
    public long LL;
    public final /* synthetic */ InterfaceC1085330eLj LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C01C1 LLILZ;

    @Override // X.InterfaceC1085330eLj
    public final void JG1(String str, JSONObject jSONObject) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC1085330eLj
    public final void Ec2() {
        this.LLILLJJLI.Ec2();
        this.LL = SystemClock.elapsedRealtime();
        C1086960eOM.LL.getClass();
        C01C3.LIZIZ(C1086960eOM.LLILLJJLI.get(this.LLILLL), this.LLILZ, "short_touch");
    }

    @Override // X.InterfaceC1085330eLj
    public final void LJLJL() {
        String str;
        PollEndContent pollEndContent;
        User user;
        Room room;
        PollEndContent pollEndContent2;
        this.LLILLJJLI.LJLJL();
        C01C1 c01c1 = this.LLILZ;
        EnumC1085350eLl enumC1085350eLl = c01c1.LJI;
        if (enumC1085350eLl == EnumC1085350eLl.CANCEL) {
            PollMessage pollMessage = c01c1.LJFF;
            if (pollMessage == null || (pollEndContent2 = pollMessage.endContent) == null || pollEndContent2.endType != 0) {
                C1086960eOM.LL.getClass();
                DataChannel dataChannel = C1086960eOM.LLILLJJLI.get(this.LLILLL);
                Long lValueOf = null;
                Long lValueOf2 = (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? null : Long.valueOf(room.getOwnerUserId());
                PollMessage pollMessage2 = this.LLILZ.LJFF;
                if (pollMessage2 != null && (pollEndContent = pollMessage2.endContent) != null && (user = pollEndContent.operator) != null) {
                    lValueOf = Long.valueOf(user.getId());
                }
                str = Intrinsics.LJFF(lValueOf2, lValueOf) ? "anchor_close" : "moderator_close";
            } else {
                str = "poll_timeout";
            }
        } else {
            int i = C1085340eLk.LIZ[enumC1085350eLl.ordinal()];
            str = i != 1 ? i != 2 ? "others" : "leave_room" : "close_take";
        }
        C1086960eOM.LL.getClass();
        C0IUQ.LIZ(new C2645010p(C1086960eOM.LLILLJJLI.get(this.LLILLL), this.LLILZ, SystemClock.elapsedRealtime() - this.LL, str, "short_touch"));
    }

    @Override // X.InterfaceC1085330eLj
    public final View LLLILZJ() {
        return this.LLILLJJLI.LLLILZJ();
    }

    @Override // X.InterfaceC1085330eLj
    public final void LLLZI() {
        this.LLILLJJLI.LLLZI();
    }

    @Override // X.InterfaceC1085330eLj
    public final void Pl() {
        this.LLILLJJLI.Pl();
    }

    @Override // X.InterfaceC1085330eLj
    public final String Sr() {
        return this.LLILLJJLI.Sr();
    }

    @Override // X.InterfaceC1085330eLj
    public final String dT1() {
        return this.LLILLJJLI.dT1();
    }

    @Override // X.InterfaceC1085330eLj
    public final String mP0() {
        return this.LLILLJJLI.mP0();
    }

    @Override // X.InterfaceC1085330eLj
    public final void kk0(Map<String, String> map) {
        this.LLILLJJLI.kk0(map);
    }

    public PollShortTouchHelper$addShortTouch$1$1$1$1$observerView$1(InterfaceC1085330eLj interfaceC1085330eLj, long j, C01C1 c01c1) {
        this.LLILLJJLI = interfaceC1085330eLj;
        this.LLILLL = j;
        this.LLILZ = c01c1;
    }
}
