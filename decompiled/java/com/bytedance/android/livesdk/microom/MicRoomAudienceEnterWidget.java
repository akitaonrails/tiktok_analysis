package com.bytedance.android.livesdk.microom;

import X.AbstractC19994813Le;
import X.C001A;
import X.C09JN;
import X.C1078480eAg;
import X.C1161920gLG;
import X.C11NJ;
import X.C11NZ;
import X.C158B;
import X.C1701940uOG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C521820KdI;
import X.C776250Uch;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestIsLinkedAsAudienceForMicRoomChannelChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestIsLinkedAsGuestForMicRoomChangeChannel;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.OfficialChannelUserMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MicRoomAudienceEnterWidget extends LiveRecyclableWidget {
    public IMessageManager LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public final C11NJ LL = new C11NJ();
    public final AwS586S0100000_7 LLILZIL = new AwS586S0100000_7(this, 159);

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LL.LJ();
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.OFFICIAL_CHANNEL_USER_MESSAGE.getIntType(), new C521820KdI(this.LLILZIL, 0));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        Object obj;
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLILLJJLI = iMessageManager;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            this.LLILLL = room.getId();
            this.LLILZ = room.getOwnerUserId();
        }
        IMessageManager iMessageManager2 = this.LLILLJJLI;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.OFFICIAL_CHANNEL_USER_MESSAGE.getIntType(), new C521820KdI(this.LLILZIL, 0));
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && ((obj = ((C1078480eAg) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    y1((IMessage) obj);
                }
            }
        }
    }

    public final void y1(IMessage iMessage) {
        DataChannel dataChannel;
        final boolean z;
        DataChannel dataChannel2;
        if ((iMessage instanceof OfficialChannelUserMessage) && iMessage != null) {
            this.LL.LJ();
            OfficialChannelUserMessage officialChannelUserMessage = (OfficialChannelUserMessage) iMessage;
            long jLIZ = (officialChannelUserMessage.startTimeStamp - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) + ((long) AbstractC19994813Le.Default.nextInt(2, (int) officialChannelUserMessage.maxEnterTime));
            IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
            final boolean z2 = true;
            if ((iInteractService != null && iInteractService.mJ()) || ((dataChannel = this.dataChannel) != null && Intrinsics.LJFF(dataChannel.gg0(MultiGuestIsLinkedAsGuestForMicRoomChangeChannel.class), Boolean.TRUE))) {
                z = true;
            } else {
                z = false;
            }
            if ((iInteractService == null || !iInteractService.kZ()) && ((dataChannel2 = this.dataChannel) == null || !Intrinsics.LJFF(dataChannel2.gg0(MultiGuestIsLinkedAsAudienceForMicRoomChannelChannel.class), Boolean.TRUE))) {
                z2 = false;
            }
            if (jLIZ <= 0) {
                x1(z, z2);
            } else {
                this.LL.LIZ(C11NZ.LJLJJLL(jLIZ, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0Ii7
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("MicRoomAudienceEnterWidget@a20c.startTimer$1$disposable$1");
                        this.LL.x1(z, z2);
                        C1C7U.LIZIZ("MicRoomAudienceEnterWidget@a20c.startTimer$1$disposable$1");
                    }
                }, new C09JN() { // from class: X.0Ii8
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("MicRoomAudienceEnterWidget@a20c.startTimer$1$disposable$2");
                        C1C7U.LIZIZ("MicRoomAudienceEnterWidget@a20c.startTimer$1$disposable$2");
                    }
                }));
            }
        }
    }

    public final void x1(boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterDirectly isInteractingForGuest=");
        sbLIZ.append(z);
        sbLIZ.append(" isInteractingForAudience=");
        sbLIZ.append(z2);
        C20441214yg.LJIIIZ("MicRoomAudienceEnterWidget", C2188811AlT.LIZIZ(sbLIZ));
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService != null) {
            iMicRoomService.aa2(this.LLILLL, Long.valueOf(this.LLILZ), z, z2);
        }
    }
}
