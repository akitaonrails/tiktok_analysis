package com.bytedance.android.livesdk.grouplive.widget;

import X.C001A;
import X.C00JG;
import X.C00JH;
import X.C01GW;
import X.C020W;
import X.C13BV;
import X.C13LE;
import X.C15438062q;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2850018m;
import X.C452501pT;
import X.C500260Jjc;
import X.C5182020e;
import X.C723850SaN;
import X.C776250Uch;
import X.C930760aKQ;
import X.EnumC2851018n;
import X.InterfaceC1097170eep;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.grouplive.assem.icyclash.GroupLiveIcyClashAssem;
import com.bytedance.android.livesdk.grouplive.assem.mvpseat.GroupLiveMvpSeatAssem;
import com.bytedance.android.livesdk.grouplive.assem.timedcompetition.TimedCompetitionAssem;
import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveMemberList;
import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveStatus;
import com.bytedance.android.livesdk.grouplive.inroomranking.panel.GroupLiveRankingPanelAssem;
import com.bytedance.android.livesdk.livesetting.linkmic.match.GroupLiveMemberMatchOptimizationSetting;
import com.bytedance.android.livesdk.model.message.MemberInfo;
import com.bytedance.android.livesdkapi.depend.model.live.GroupLiveMember;
import com.bytedance.android.livesdkapi.depend.model.live.GroupLiveSession;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GroupLiveAudienceWidget extends LiveRecyclableWidget {
    public final C01GW LL = C452501pT.LIZIZ(new C5182020e(this, 99));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gor;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Fragment fragment;
        Fragment fragment2;
        IMessageManager iMessageManager;
        DataChannelGlobal.LLILZ.JQ2(C930760aKQ.class, Boolean.FALSE);
        C00JG c00jg = (C00JG) this.LL.getValue();
        DataChannel dataChannel = c00jg.LL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(c00jg);
        }
        View view = getView();
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment2 = interfaceC1097170eep.getFragment()) != null) {
            C723850SaN.LJIIIIZZ(fragment2, C13LE.LIZ(TimedCompetitionAssem.class));
            if (GroupLiveMemberMatchOptimizationSetting.INSTANCE.isEnable()) {
                C723850SaN.LJIIIIZZ(fragment2, C13LE.LIZ(GroupLiveMvpSeatAssem.class));
            }
            C723850SaN.LJIIIIZZ(fragment2, C13LE.LIZ(GroupLiveRankingPanelAssem.class));
        }
        InterfaceC1097170eep interfaceC1097170eep2 = this.widgetCallback;
        if (interfaceC1097170eep2 != null && (fragment = interfaceC1097170eep2.getFragment()) != null) {
            C723850SaN.LJIIIIZZ(fragment, C13LE.LIZ(GroupLiveIcyClashAssem.class));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(GroupLiveStatus.class, new C2850018m(EnumC2851018n.NOTGROUPLIVE, null));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Fragment fragment;
        IMessageManager iMessageManager;
        Room room;
        List<GroupLiveMember> list;
        long j;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(GroupLiveStatus.class, new C2850018m(EnumC2851018n.NORMAL, null));
        }
        DataChannelGlobal.LLILZ.JQ2(C930760aKQ.class, Boolean.TRUE);
        C00JG c00jg = (C00JG) this.LL.getValue();
        DataChannel dataChannel2 = c00jg.LL;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            GroupLiveSession groupLiveSession = room.groupLiveSession;
            if (groupLiveSession == null || (list = groupLiveSession.groupLiveMembers) == null) {
                list = C13BV.INSTANCE;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init Data;member size = ");
            sbLIZ.append(list.size());
            C20441214yg.LIZIZ("GroupLiveMemberService", C2188811AlT.LIZIZ(sbLIZ));
            room.getOwnerUserId();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (GroupLiveMember groupLiveMember : list) {
                MemberInfo memberInfo = new MemberInfo();
                memberInfo.userId = groupLiveMember.userId;
                memberInfo.nickname = groupLiveMember.nickname;
                memberInfo.avatar = groupLiveMember.avatar;
                memberInfo.isStaged = true;
                arrayList.add(memberInfo);
            }
            GroupLiveSession groupLiveSession2 = room.groupLiveSession;
            if (groupLiveSession2 != null) {
                j = groupLiveSession2.lastVisitTime;
            } else {
                j = 0;
            }
            C00JH c00jh = new C00JH(arrayList, j);
            DataChannel dataChannel3 = c00jg.LL;
            if (dataChannel3 != null) {
                dataChannel3.zW(GroupLiveMemberList.class, c00jh);
            }
        }
        DataChannel dataChannel4 = c00jg.LL;
        if (dataChannel4 != null && (iMessageManager = (IMessageManager) dataChannel4.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.GROUP_LIVE_MEMBER_NOTIFY_MESSAGE.getIntType(), c00jg);
        }
        View view = getView();
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
            C723850SaN.LIZ(fragment, false, null, new C020W(fragment, this, 8), 3);
        }
    }
}
