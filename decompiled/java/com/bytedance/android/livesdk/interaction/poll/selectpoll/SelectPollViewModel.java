package com.bytedance.android.livesdk.interaction.poll.selectpoll;

import X.C01GW;
import X.C1086630eNp;
import X.C1086830eO9;
import X.C292401Bi;
import X.C466200IPy;
import X.C776250Uch;
import X.C963140bAe;
import X.CountDownTimerC1151440g4M;
import X.EnumC1086920eOI;
import X.InterfaceC1125320fOE;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class SelectPollViewModel extends ViewModel implements OnMessageListener {
    public final DataChannel LL;
    public EnumC1086920eOI LLILLJJLI;
    public final C1086630eNp LLILLL = new InterfaceC1125320fOE() { // from class: X.0eNp
        @Override // X.InterfaceC1125320fOE
        public final void onSuccess() {
            ((LiveData) this.LIZ.LLILZIL.getValue()).setValue(new VoteResponseData());
        }

        @Override // X.InterfaceC1125320fOE
        public final void onFailed(Throwable th) {
            this.LIZ.vQ2().setValue(th);
        }
    };
    public final C01GW LLILZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(64));
    public final C01GW LLILZIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(65));
    public final C01GW LLILZLL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(62));
    public final C01GW LLIZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(63));
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(61));
    public CountDownTimerC1151440g4M LLJ;
    public final IMessageManager LLJI;

    public final NextLiveData<Throwable> vQ2() {
        return (NextLiveData) this.LLILZLL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0eNp] */
    public SelectPollViewModel(DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLJI = (IMessageManager) dataChannel.gg0(C776250Uch.class);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Integer num;
        Room room;
        PollInfo pollInfo;
        PollData pollData;
        PollStartContent pollStartContent;
        List<PollOptionInfo> list;
        if (iMessage instanceof PollMessage) {
            PollMessage pollMessage = (PollMessage) iMessage;
            Integer num2 = pollMessage.pollKind;
            if (((num2 == null || num2.intValue() != 1) && ((num = pollMessage.pollKind) == null || num.intValue() != 0)) || pollMessage.baseMessage.createTime / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < ((Room) this.LL.gg0(RoomChannel.class)).nowTime) {
                return;
            }
            long j = 0;
            if (pollMessage.messageType == 0 && (pollStartContent = pollMessage.startContent) != null && (list = pollStartContent.optionList) != null && (!list.isEmpty())) {
                C1086830eO9.LJ = true;
                C1086830eO9.LJFF = pollMessage;
            }
            if (pollMessage.messageType == 1) {
                CommonMessageData commonMessageData = pollMessage.baseMessage;
                if (commonMessageData != null) {
                    j = commonMessageData.roomId;
                }
                BaseResponse<Room, EnterRoomExtra> baseResponseLIZIZ = C466200IPy.LIZIZ(j, false);
                if (baseResponseLIZIZ != null && (room = baseResponseLIZIZ.data) != null && (pollInfo = room.advancedPollInfo) != null && (pollData = pollInfo.pollData) != null && pollData.pollId == pollMessage.pollId) {
                    pollData.endTime = C963140bAe.LIZIZ();
                }
            }
            ((LiveData) this.LLILZ.getValue()).postValue(iMessage);
        }
    }
}
