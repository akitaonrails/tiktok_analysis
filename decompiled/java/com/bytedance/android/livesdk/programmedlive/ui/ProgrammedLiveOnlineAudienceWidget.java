package com.bytedance.android.livesdk.programmedlive.ui;

import X.C001A;
import X.C011Z;
import X.C0IZP;
import X.C0UO0;
import X.C1119850fFP;
import X.C11JF;
import X.C11NZ;
import X.C162100jj;
import X.C20743416Fc;
import X.C749310TaL;
import X.C776250Uch;
import Y.AfS186S0100000_17;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ProgrammedLiveOnlineAudienceWidget extends LiveRecyclableWidget implements OnMessageListener {
    public C20743416Fc LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public IMessageManager LLILZ;
    public C11JF LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.hjl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C11JF c11jf;
        this.LLILLJJLI = 0;
        this.LLILLL = false;
        IMessageManager iMessageManager = this.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.USER_SEQ.getIntType(), this);
        }
        C11JF c11jf2 = this.LLILZIL;
        if (c11jf2 == null || c11jf2.isDisposed() || (c11jf = this.LLILZIL) == null) {
            return;
        }
        c11jf.dispose();
    }

    public abstract void x1();

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = (C20743416Fc) findViewById(R.id.pms);
        if (LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) {
            C1119850fFP c1119850fFP = C011Z.LIZ;
            C20743416Fc c20743416Fc = this.LL;
            c1119850fFP.getClass();
            C1119850fFP.LIZ(c20743416Fc);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        int iIntValue;
        RoomStats stats;
        Integer num = (Integer) this.dataChannel.gg0(C749310TaL.class);
        int totalUser = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILLJJLI = iIntValue;
        if (iIntValue == 0) {
            Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
            if (room != null && (stats = room.getStats()) != null) {
                totalUser = stats.getTotalUser();
            }
            this.LLILLJJLI = totalUser;
            this.dataChannel.SX0(C749310TaL.class, Integer.valueOf(totalUser));
        }
        x1();
        this.dataChannel.BQ2(this, ProgrammedLiveMenuVisibilityChannel.class, new AwS596S0100000_17(this, 228));
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        this.LLILZ = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.USER_SEQ.getIntType(), this);
        }
        this.LLILZIL = (C11JF) C11NZ.LJJJJLI(2L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS186S0100000_17(this, 62));
        Room roomLIZ = C162100jj.LIZ(this.dataChannel);
        if (roomLIZ != null) {
            C0IZP.LIZJ(roomLIZ, "watch_cnt");
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        int iLongValue;
        if (iMessage instanceof RoomUserSeqMessage) {
            Long l = ((RoomUserSeqMessage) iMessage).totalUser;
            if (l != null) {
                iLongValue = (int) l.longValue();
            } else {
                iLongValue = 0;
            }
            this.LLILLJJLI = iLongValue;
            this.dataChannel.SX0(C749310TaL.class, Integer.valueOf(iLongValue));
        }
    }
}
