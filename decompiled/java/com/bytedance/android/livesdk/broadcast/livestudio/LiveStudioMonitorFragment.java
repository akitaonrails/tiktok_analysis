package com.bytedance.android.livesdk.broadcast.livestudio;

import X.C001A;
import X.C01GW;
import X.C01QD;
import X.C098200Yq;
import X.C09JN;
import X.C0IEN;
import X.C0IJR;
import X.C0IJT;
import X.C0IP3;
import X.C0IR5;
import X.C0IXP;
import X.C0TZM;
import X.C0U3L;
import X.C0U4P;
import X.C0U4Q;
import X.C0U4R;
import X.C0U4S;
import X.C0U4T;
import X.C0U4W;
import X.C0U4X;
import X.C0UO0;
import X.C0UVW;
import X.C1087000eOQ;
import X.C1148310fzJ;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1AKO;
import X.C20632315oP;
import X.C21546719Ub;
import X.C439101nJ;
import X.C452501pT;
import X.C465520INi;
import X.C474500IjA;
import X.C497740JfY;
import X.C513220KAu;
import X.C748880TZe;
import X.C751340Tdc;
import X.C764240TyQ;
import X.C766270U4b;
import X.C781270Ukn;
import X.C786410Ut5;
import X.C930940aKi;
import X.C931020aKq;
import X.InterfaceC777420Uea;
import Y.ARunnableS112S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.android.livesdk.dataChannel.IsLiveStudioMonitorChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.OperateToastMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveStudioMonitorFragment extends BaseFragment implements C1AKO, C0IP3 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4HELIOSZyM6PiA/PTo3ISpiBSYlLRY4PCs6JwgjJyYnJzcKOy40JSAiPQ==";
    public C0U4W LLILLJJLI;
    public IMessageManager LLILLL;
    public DataChannel LLILZ;
    public Room LLILZIL;
    public C0U4P LLILZLL;
    public C21546719Ub LLIZ;
    public C20632315oP LLIZLLLIL;
    public C0U3L LLJ;
    public ImageView LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public C0U4Q LLJJ;
    public C0U4X LLJJI;
    public boolean LL = true;
    public long LLJILJILJ = System.currentTimeMillis();
    public String LLJILLL = "liveoff";
    public final ArrayList<C764240TyQ> LLJJIII = new ArrayList<>();
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(53));

    @Override // X.C1AKO
    public final void finish() {
    }

    @Override // X.C1AKO
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.C1AKO
    public final boolean onBackPressed() {
        return false;
    }

    public final void PR() {
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C0UVW c0uvwLIZ = C01QD.LIZ();
        c0uvwLIZ.getClass();
        LiveStudioMonitorApi liveStudioMonitorApi = (LiveStudioMonitorApi) c0uvwLIZ.LIZJ(LiveStudioMonitorApi.class);
        Room room = this.LLILZIL;
        liveStudioMonitorApi.leaveMonitor(room != null ? Long.valueOf(room.getId()) : null).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0T77
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LiveStudioMonitorFragment@8735.leaveRoomForServer$1");
                C1C7U.LIZIZ("LiveStudioMonitorFragment@8735.leaveRoomForServer$1");
            }
        }, new C09JN() { // from class: X.0T76
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveStudioMonitorFragment@8735.leaveRoomForServer$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error = ");
                sbLIZ.append(((Throwable) obj).getMessage());
                C20441214yg.LJIIIZ("LiveStudioMonitorFragment", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("LiveStudioMonitorFragment@8735.leaveRoomForServer$2");
            }
        });
    }

    public final void RR() {
        IMessageManager iMessageManager = this.LLILLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.CONTROL.getIntType(), this.LLILLJJLI);
        }
        IMessageManager iMessageManager2 = this.LLILLL;
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(C001A.OPERATE_TOAST_MESSAGE.getIntType(), this.LLILLJJLI);
        }
    }

    public final void UR() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_monitor_stay");
        c474500IjALIZ.LJII((String) this.LLJJIJI.getValue());
        c474500IjALIZ.LJJ(LiveMode.LIVE_STUDIO.logStreamingType);
        Room room = this.LLILZIL;
        c474500IjALIZ.LJJIJIIJI(room != null ? Long.valueOf(room.getId()) : null);
        c474500IjALIZ.LJJII(this.LLJILLL, "page_name");
        c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - this.LLJILJILJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "stay_duration_s");
        c474500IjALIZ.LIZ();
    }

    public final InterfaceC777420Uea NR() {
        return isAdded() ? ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Ea0(ViewModelProviders.of(this)) : new C513220KAu();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LLJIJIL) {
            PR();
        }
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).removeNetworkChangeObserver(this.LLJJ);
        this.LLJJ = null;
        C0U4X c0u4x = this.LLJJI;
        if (c0u4x != null) {
            c0u4x.LIZ();
        }
        this.LLJJI = null;
        RR();
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.zW(IsLiveStudioMonitorChannel.class, Boolean.FALSE);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C930940aKi.class, null);
        dataChannelGlobal.IQ2(C931020aKq.class);
        dataChannelGlobal.IQ2(C1148310fzJ.class);
        DataChannel dataChannel2 = this.LLILZ;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        C465520INi.LIZ.setIsAnchor(false);
        C0U3L c0u3l = this.LLJ;
        if (c0u3l != null) {
            c0u3l.LIZIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Room room = this.LLILZIL;
        if (room != null) {
            C781270Ukn.LJIILLIIL().release(room.getId());
        }
        C781270Ukn.LJIILLIIL().retryReleaseAll();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        UR();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLJILJILJ = System.currentTimeMillis();
    }

    @Override // X.C0IP3
    public final DataChannel provideDataChannel() {
        return this.LLILZ;
    }

    public final void OR(String str) {
        if (this.LLJILJIL) {
            return;
        }
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).removeNetworkChangeObserver(this.LLJJ);
        Bundle bundle = null;
        this.LLJJ = null;
        C0U4X c0u4x = this.LLJJI;
        if (c0u4x != null) {
            c0u4x.LIZ();
        }
        this.LLJJI = null;
        RR();
        C21546719Ub c21546719Ub = this.LLIZ;
        if (c21546719Ub != null) {
            C439101nJ.LJI(c21546719Ub);
        }
        ImageView imageView = this.LLJI;
        if (imageView != null) {
            C439101nJ.LJI(imageView);
        }
        C20632315oP c20632315oP = this.LLIZLLLIL;
        if (c20632315oP != null) {
            C439101nJ.LJI(c20632315oP);
        }
        if (Intrinsics.LJFF(str, "end_live")) {
            UR();
        }
        this.LLILZIL = null;
        this.LLJILLL = "liveoff";
        SR(str);
        if (isAdded()) {
            LiveStudioEndFragment liveStudioEndFragment = new LiveStudioEndFragment();
            Bundle arguments = getArguments();
            if (arguments != null) {
                bundle = arguments.getBundle("extra");
            }
            liveStudioEndFragment.setArguments(bundle);
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.h4j, liveStudioEndFragment);
            c19ehLJIIJ.LJIIJ();
        }
        this.LLJIJIL = true;
        this.LLJILJIL = true;
    }

    public final void SR(String str) {
        Long lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_monitor_page_show");
        c474500IjALIZ.LJII((String) this.LLJJIJI.getValue());
        c474500IjALIZ.LJJ(LiveMode.LIVE_STUDIO.logStreamingType);
        Room room = this.LLILZIL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJIJIIJI(lValueOf);
        c474500IjALIZ.LJJII(this.LLJILLL, "page_name");
        c474500IjALIZ.LJJII(str, "enter_type");
        c474500IjALIZ.LIZ();
        this.LLJILJILJ = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        if (!this.LLJIJIL && (view = getView()) != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 59));
        }
        Room room = this.LLILZIL;
        if (room != null && room.getOwner().getSecUid() != null) {
            ((ITreasureBoxService) C1161920gLG.LIZJ(ITreasureBoxService.class)).BW0(Long.valueOf(room.getId()), room.getOwner().getSecUid(), this.LLILZ, null, false);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        Long lValueOf;
        DataChannel dataChannel;
        super.onCreate(bundle);
        DataChannel dataChannelLIZ = C0IJR.LIZ(ViewModelProviders.of(this), this);
        dataChannelLIZ.SX0(C748880TZe.class, getChildFragmentManager());
        this.LLILZ = dataChannelLIZ;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C931020aKq.class, dataChannelLIZ);
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        this.LLILZIL = room;
        if (room == null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJIJIL = z;
        if (room != null && (dataChannel = this.LLILZ) != null) {
            dataChannel.zW(RoomChannel.class, room);
        }
        DataChannel dataChannel2 = this.LLILZ;
        C0IXP c0ixp = null;
        if (dataChannel2 != null) {
            Room room2 = this.LLILZIL;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getId());
            } else {
                lValueOf = null;
            }
            dataChannel2.SX0(C751340Tdc.class, lValueOf);
        }
        DataChannel dataChannel3 = this.LLILZ;
        if (dataChannel3 != null) {
            dataChannel3.zW(UserIsAnchorChannel.class, Boolean.TRUE);
        }
        DataChannel dataChannel4 = this.LLILZ;
        if (dataChannel4 != null) {
            dataChannel4.zW(LiveModeChannel.class, LiveMode.LIVE_STUDIO);
        }
        DataChannel dataChannel5 = this.LLILZ;
        if (dataChannel5 != null) {
            dataChannel5.zW(IsLiveStudioMonitorChannel.class, Boolean.TRUE);
        }
        DataChannel dataChannel6 = this.LLILZ;
        if (dataChannel6 != null) {
            dataChannel6.SX0(C0U4T.class, Boolean.FALSE);
        }
        DataChannel dataChannel7 = this.LLILZ;
        if (dataChannel7 != null) {
            dataChannel7.zW(CommentOrMessageData.class, Boolean.FALSE);
        }
        DataChannel dataChannel8 = this.LLILZ;
        if (dataChannel8 != null) {
            dataChannel8.SX0(C0TZM.class, Boolean.TRUE);
        }
        Room room3 = this.LLILZIL;
        if (room3 != null) {
            C0IEN c0ien = new C0IEN();
            c0ien.LIZIZ = room3;
            c0ien.LIZLLL = Long.valueOf(room3.getOwnerUserId());
            c0ien.LIZ = "live_take_detail";
            Room room4 = this.LLILZIL;
            if (room4 != null) {
                c0ixp = new C0IXP(room4.getCreateTime());
            }
            c0ien.LJ = c0ixp;
            C0IR5 c0ir5LIZ = c0ien.LIZ();
            dataChannelGlobal.JQ2(C1148310fzJ.class, c0ir5LIZ);
            DataChannel dataChannel9 = this.LLILZ;
            if (dataChannel9 != null) {
                dataChannel9.SX0(C1087000eOQ.class, c0ir5LIZ);
            }
            C465520INi.LIZ.setIsAnchor(true);
        }
    }

    public final void VR(CharSequence charSequence, OperateToastMessage operateToastMessage) {
        Text text;
        List<C0U4S> listGT = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).gT(operateToastMessage.scene);
        if (listGT != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<C0U4S> it2 = listGT.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(operateToastMessage, linkedHashMap);
            }
            String str = null;
            if (!linkedHashMap.isEmpty()) {
                C0U4R c0u4r = new C0U4R();
                c0u4r.LIZIZ = charSequence.toString();
                c0u4r.LIZ = C497740JfY.LJII();
                CommonMessageData commonMessageData = operateToastMessage.baseMessage;
                if (commonMessageData != null && (text = commonMessageData.displayText) != null) {
                    str = text.key;
                }
                c0u4r.LIZJ = str;
                c0u4r.LJ = operateToastMessage.displayDuration;
                c0u4r.LJFF = true;
                c0u4r.LJI = linkedHashMap;
                c0u4r.LJII = this.LLILZ;
                C766270U4b.LJIIJ(c0u4r);
                return;
            }
        }
        C766270U4b.LJIIIIZZ(operateToastMessage.displayDuration, C497740JfY.LJII(), charSequence.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0U4Q] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.livestudio.LiveStudioMonitorFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gjg, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
