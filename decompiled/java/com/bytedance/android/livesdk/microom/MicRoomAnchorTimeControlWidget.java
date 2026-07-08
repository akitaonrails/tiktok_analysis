package com.bytedance.android.livesdk.microom;

import X.C001A;
import X.C0IGM;
import X.C0IUA;
import X.C0U3P;
import X.C0U3Q;
import X.C11JF;
import X.C11NZ;
import X.C158B;
import X.C1701940uOG;
import X.C497690JfT;
import X.C497700JfU;
import X.C776250Uch;
import X.C781150Ukb;
import X.C781160Ukc;
import X.EnumC768840UDy;
import Y.AfS176S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.room.MicRoomDisableDecorationEvent;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.MicDonationStickerShowEnable;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.OfficialChannelAnchorMessage;
import com.bytedance.android.livesdk.model.message.OfficialChannelModifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class MicRoomAnchorTimeControlWidget extends LiveRecyclableWidget implements OnMessageListener {
    public IMessageManager LL;
    public Room LLILLJJLI;
    public C11JF LLILLL;
    public C11JF LLILZ;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LLILZ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    public final void x1() {
        DataChannel dataChannel;
        C497690JfT c497690JfT;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (c497690JfT = (C497690JfT) dataChannel2.gg0(C781150Ukb.class)) != null) {
            boolean z = c497690JfT.LIZ == 1;
            C0IUA.LIZ = true;
            C0IUA.LIZIZ = z;
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.LC0(MicRoomDisableInteractionEvent.class, Boolean.TRUE);
        }
        C497700JfU.LIZ.LIZJ(true, EnumC768840UDy.ORDER);
        if (!MicDonationStickerShowEnable.INSTANCE.inExp() || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.LC0(MicRoomDisableDecorationEvent.class, Boolean.TRUE);
    }

    public final void z1() {
        DataChannel dataChannel;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(MicRoomDisableInteractionEvent.class, Boolean.FALSE);
        }
        if (MicDonationStickerShowEnable.INSTANCE.inExp() && (dataChannel = this.dataChannel) != null) {
            dataChannel.LC0(MicRoomDisableDecorationEvent.class, Boolean.FALSE);
        }
        C497700JfU.LIZ.LIZJ(false, EnumC768840UDy.ORDER);
        C0IUA.LIZ = false;
        C0IUA.LIZIZ = false;
    }

    public final void A1(long j) {
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        long jLIZ = j - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        if (jLIZ <= 10) {
            Room room = this.LLILLJJLI;
            if (room != null) {
                room.liveSubOnly = 0L;
            }
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            C0U3P.LJ(C0U3Q.SUB_ONLY);
            x1();
            return;
        }
        this.LLILLL = (C11JF) C11NZ.LJLJJLL(jLIZ - 10, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS176S0100000_7(this, 79));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        OfficialChannelInfo officialChannelInfo;
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.OFFICIAL_CHANNEL_ANCHOR_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType(), this);
        } else {
            iMessageManager = null;
        }
        this.LL = iMessageManager;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.gg0(RoomChannel.class);
        }
        this.LLILLJJLI = room;
        if (room != null && (officialChannelInfo = room.officialChannelInfo) != null) {
            A1(officialChannelInfo.startTimeStamp);
            y1(officialChannelInfo.endTimeStamp);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        OfficialChannelModifyMessage officialChannelModifyMessage;
        OfficialChannelAnchorMessage officialChannelAnchorMessage;
        Integer numValueOf = null;
        if (iMessage != null) {
            numValueOf = Integer.valueOf(iMessage.getIntType());
        }
        int intType = C001A.OFFICIAL_CHANNEL_ANCHOR_MESSAGE.getIntType();
        if (numValueOf != null && numValueOf.intValue() == intType) {
            if ((iMessage instanceof OfficialChannelAnchorMessage) && (officialChannelAnchorMessage = (OfficialChannelAnchorMessage) iMessage) != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.SX0(C781160Ukc.class, new C0IGM(officialChannelAnchorMessage.linkmicType));
                }
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.SX0(C781150Ukb.class, new C497690JfT(officialChannelAnchorMessage.roleType, officialChannelAnchorMessage.existLinkmic));
                }
                A1(officialChannelAnchorMessage.startTimeStamp);
                y1(officialChannelAnchorMessage.endTimeStamp);
                return;
            }
            return;
        }
        int intType2 = C001A.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType();
        if (numValueOf == null || numValueOf.intValue() != intType2 || !(iMessage instanceof OfficialChannelModifyMessage) || (officialChannelModifyMessage = (OfficialChannelModifyMessage) iMessage) == null) {
            return;
        }
        y1(officialChannelModifyMessage.endTimeStamp);
    }

    public final void y1(long j) {
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        long jLIZ = j - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        if (jLIZ <= 0) {
            z1();
        } else {
            this.LLILZ = (C11JF) C11NZ.LJLJJLL(jLIZ, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS176S0100000_7(this, 78));
        }
    }
}
