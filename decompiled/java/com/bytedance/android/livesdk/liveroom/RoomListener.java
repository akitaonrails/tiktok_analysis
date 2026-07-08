package com.bytedance.android.livesdk.liveroom;

import X.AbstractC1387200mCc;
import X.C08LW;
import X.C0II1;
import X.C0IIQ;
import X.C0IIR;
import X.C0IIS;
import X.C0IJT;
import X.C0IKP;
import X.C0IL2;
import X.C0INV;
import X.C1161920gLG;
import X.C128Y;
import X.C1397950mTx;
import X.C1440005kM;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C464510IJl;
import X.C464520IJm;
import X.C474500IjA;
import X.C786410Ut5;
import X.InterfaceC214902198i;
import X.InterfaceC463580IFw;
import X.InterfaceC463830IGv;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.livesetting.feed.GameLiveBottomBarSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCadSmoothExitSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRoomBackLiveCardFix;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRoomBackLiveCardOpt;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class RoomListener implements ISubController {
    public LiveRoomFragment fragment;
    public InterfaceC463580IFw mRoomAction;
    public InterfaceC463830IGv mRoomEventListener;
    public boolean previewEnter;

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestroy() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onPause() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    private String getLiveEnterMerge() {
        return C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.enterFromMerge;
    }

    private String getLiveEnterMethod() {
        return C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.enterMethod;
    }

    public boolean initRoomEnvironment() {
        if (this.mRoomAction == null) {
            this.mRoomAction = new C464520IJm(this);
        }
        if (this.mRoomEventListener == null) {
            this.mRoomEventListener = new C464510IJl(this);
        }
        if (this.mRoomAction == null || !UserService.getInstance().user().LJIILJJIL()) {
            return true;
        }
        HashMap map = new HashMap();
        map.put("enter_from_merge", getLiveEnterMerge());
        map.put("enter_method", getLiveEnterMethod());
        map.put("source", "live room fg");
        C1CC2.LJII(1, "ttlive_minor_mode_live", map);
        Event event = new Event("room_fg_enter_room_fail", 33028, C0IIR.BussinessApiCall);
        event.LIZIZ("ftc or delete by age gate.");
        C0INV c0inv = C0IL2.LIZ;
        c0inv.LIZ().LIZIZ(event);
        C0IIS.LIZJ(c0inv.LIZ().mEnterRoomConfig, C0II1.IS_MINOR_AGE);
        ((C464520IJm) this.mRoomAction).LIZ(C0IIQ.ERROR);
        return false;
    }

    public void sendIncentiveLog() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_live_leave");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public InterfaceC463580IFw getRoomAction() {
        return this.mRoomAction;
    }

    public InterfaceC463830IGv getRoomEventListener() {
        return this.mRoomEventListener;
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
        initRoomEnvironment();
    }

    public void trySendRoomLists(String str) {
        if (!GameLiveBottomBarSetting.INSTANCE.isEnable() || "error".equals(str)) {
            return;
        }
        try {
            if (getLiveEnterMethod() != null && getLiveEnterMerge() != null && this.fragment != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(getLiveEnterMerge());
                sbLIZ.append("_");
                sbLIZ.append(getLiveEnterMethod());
                if (C0IKP.LIZIZ(C2188811AlT.LIZIZ(sbLIZ))) {
                    this.fragment.BS();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("RoomListener", e);
        }
    }

    public RoomListener(LiveRoomFragment liveRoomFragment, boolean z) {
        this.fragment = liveRoomFragment;
        this.previewEnter = z;
    }

    public void finishActivity(AbstractC1387200mCc abstractC1387200mCc, C0IIQ c0iiq) {
        Activity activity;
        Intent intent;
        boolean z;
        C128Y detailSafRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getDetailSafRootFragment(this.fragment);
        if (detailSafRootFragment instanceof InterfaceC214902198i) {
            ((InterfaceC214902198i) detailSafRootFragment).finish();
            return;
        }
        if (abstractC1387200mCc != null) {
            abstractC1387200mCc.LIZ();
            if (!LiveRoomBackLiveCardFix.INSTANCE.fixed() || !(abstractC1387200mCc instanceof C1397950mTx) || (intent = (activity = ((C1397950mTx) abstractC1387200mCc).LIZLLL).getIntent()) == null) {
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("intent_smooth_exit_room", false);
            boolean zEnable = LiveRoomBackLiveCardOpt.INSTANCE.enable();
            if (LiveCadSmoothExitSetting.INSTANCE.enable() && booleanExtra) {
                z = true;
            } else {
                z = false;
            }
            if (intent.getBooleanExtra("intent_exit_and_swipe_feed", false)) {
                C786410Ut5.ae(0, activity, 0);
                return;
            }
            if ((!zEnable && !z) || !this.previewEnter) {
                return;
            }
            C1440005kM.LIZ(new C08LW(Long.valueOf(intent.getLongExtra("intent_cur_enter_room_id", 0L)), zEnable, z));
            if (!z) {
                return;
            }
            C786410Ut5.ae(0, activity, 0);
            return;
        }
        C20441214yg.LJ("RoomListener", "finishActivity exception");
    }
}
