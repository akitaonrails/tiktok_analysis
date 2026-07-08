package com.bytedance.android.livesdk.rank.impl;

import X.C07UB;
import X.C0IJT;
import X.C0J1R;
import X.C0UO0;
import X.C1082860eHk;
import X.C1086250eND;
import X.C1086280eNG;
import X.C1097290ef1;
import X.C1105280eru;
import X.C1119060fE8;
import X.C1119110fED;
import X.C1119120fEE;
import X.C1119210fEN;
import X.C1119410fEh;
import X.C1119430fEj;
import X.C1119850fFP;
import X.C1161920gLG;
import X.C158B;
import X.C176600m4;
import X.C1810700xDg;
import X.C1846800y9u;
import X.C188000nu;
import X.C19ME;
import X.C2029207xC;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C480460Ism;
import X.C485880J3q;
import X.C496970JeJ;
import X.C516201zk;
import X.C766270U4b;
import X.C782710Un7;
import X.C786410Ut5;
import X.InterfaceC1094280eaA;
import X.InterfaceC1846850y9z;
import X.InterfaceC1847290yAh;
import X.InterfaceC188100nv;
import X.InterfaceC211300rf;
import X.InterfaceC496980JeK;
import Y.AfS138S0000000_16;
import Y.AfS2S0200200_3;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseLongArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceRootWidget;
import com.bytedance.android.live.rank.impl.list.OfflineRankListFragment;
import com.bytedance.android.live.rank.impl.setting.AnchorRankingSettingDialog;
import com.bytedance.android.live.rank.impl.setting.AnchorRankingSettingFragment;
import com.bytedance.android.live.rank.impl.setting.NewRankSettingDialog;
import com.bytedance.android.live.rank.impl.setting.PreviewRankingSettingFragmentSheet;
import com.bytedance.android.live.rank.impl.sticker.dialog.TabRankStickerDialog;
import com.bytedance.android.live.rank.impl.sticker.team.TeamRankStickerDialog;
import com.bytedance.android.live.rank.impl.sticker.team.TeamRankStickerModelChannel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubStickerRegisterWithRankSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingCompetitiveAtmosphereSetting;
import com.bytedance.android.livesdk.livesetting.rank.RankDialogHideSourceSettings;
import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankLandScapeWidget;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AwS101S1200000_17;

/* JADX INFO: loaded from: classes18.dex */
public class RankService implements IRankService, InterfaceC496980JeK {
    public volatile C07UB LL;

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final Class<? extends LiveRecyclableWidget> BC0() {
        C1097290ef1.LIZ(new InterfaceC1847290yAh() { // from class: X.0yAP
            @Override // X.InterfaceC1847290yAh
            public final int getType() {
                return 8;
            }

            @Override // X.InterfaceC1847290yAh
            public final AbstractC1847300yAi LIZ(RoomSticker roomSticker, Context context, DataChannel dataChannel) {
                return new C1847070yAL(roomSticker, context, dataChannel);
            }
        });
        C1097290ef1.LIZ(new InterfaceC1847290yAh() { // from class: X.0yAQ
            @Override // X.InterfaceC1847290yAh
            public final int getType() {
                return 12;
            }

            @Override // X.InterfaceC1847290yAh
            public final AbstractC1847300yAi LIZ(RoomSticker roomSticker, Context context, DataChannel dataChannel) {
                return new C1847080yAM(roomSticker, context, dataChannel);
            }
        });
        C1097290ef1.LIZ(new InterfaceC1847290yAh() { // from class: X.0y9x
            @Override // X.InterfaceC1847290yAh
            public final int getType() {
                return 9;
            }

            @Override // X.InterfaceC1847290yAh
            public final AbstractC1847300yAi LIZ(RoomSticker roomSticker, Context context, DataChannel dataChannel) {
                return new C1846820y9w(roomSticker, context, dataChannel);
            }
        });
        C1097290ef1.LIZ(new InterfaceC1847290yAh() { // from class: X.0yAR
            @Override // X.InterfaceC1847290yAh
            public final int getType() {
                return 10;
            }

            @Override // X.InterfaceC1847290yAh
            public final AbstractC1847300yAi LIZ(RoomSticker roomSticker, Context context, DataChannel dataChannel) {
                return new C1847090yAN(roomSticker, context, dataChannel);
            }
        });
        C1097290ef1.LIZ(new InterfaceC1847290yAh() { // from class: X.0yAO
            @Override // X.InterfaceC1847290yAh
            public final int getType() {
                return 11;
            }

            @Override // X.InterfaceC1847290yAh
            public final AbstractC1847300yAi LIZ(RoomSticker roomSticker, Context context, DataChannel dataChannel) {
                return new C1847060yAK(roomSticker, context, dataChannel);
            }
        });
        if (!LiveFansClubStickerRegisterWithRankSetting.INSTANCE.getValue()) {
            return RankEntranceRootWidget.class;
        }
        ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).lI2();
        return RankEntranceRootWidget.class;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final long GS1() {
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        return C1810700xDg.LIZIZ(RankTypeV2.LJJIIZI.type, false);
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void It1() {
        C1086250eND c1086250eND = C1086280eNG.LIZIZ;
        String str = c1086250eND.LIZJ;
        String str2 = c1086250eND.LJ;
        String str3 = c1086250eND.LIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("end_live_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "task_id");
        c474500IjALIZ.LJJII(str2, "card_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(str3, "task_source");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final PreviewRankingSettingFragmentSheet LV() {
        return new PreviewRankingSettingFragmentSheet();
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final C1119120fEE XI2() {
        return new C1119120fEE();
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final C07UB et2() {
        C07UB c07ub = this.LL;
        this.LL = null;
        return c07ub;
    }

    public final void onInit() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(R.layout.h8x));
        hashSet.add(Integer.valueOf(R.layout.h3w));
        hashSet.add(Integer.valueOf(R.layout.h3v));
        C1105280eru.LIZIZ(null, hashSet);
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final String po2() {
        DataChannel dataChannelGA0;
        IUserLevelService iUserLevelService = (IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class);
        return (iUserLevelService == null || (dataChannelGA0 = iUserLevelService.gA0()) == null || dataChannelGA0.gg0(C1082860eHk.class) == null || !((Boolean) dataChannelGA0.gg0(C1082860eHk.class)).booleanValue()) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final OfflineRankListFragment ti0() {
        return new OfflineRankListFragment();
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void yu() {
        C485880J3q.LIZ.getClass();
        C485880J3q.LJ(R.layout.hkb, 2, 0);
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final int yy2() {
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        return C1810700xDg.LJFF;
    }

    public RankService() {
        C496970JeJ.LIZ = this;
        C1119850fFP.LJJIII = true;
        C1119850fFP.LJJIFFI = true;
        C1119850fFP.LJJII = true;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final int WS1() {
        boolean zLJI = MethodIDManager.LJI(202281);
        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
        int i = (int) C1810700xDg.LJI;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return i;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final boolean XD2() {
        return C1810700xDg.LIZJ();
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void Zk() {
        C480460Ism.LIZ().getClass();
        RankApi rankApi = (RankApi) C480460Ism.LIZLLL(RankApi.class);
        rankApi.queryRankEntrancesV3(0L, 0L);
        rankApi.getOnlineRankList(0L, 0L, 0, false);
        rankApi.getRankListV2(0L, 0L, "", 0, 0L, false, 0);
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final int hD0() {
        return C1810700xDg.LIZ();
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void l82() {
        DataChannel dataChannelLJIIIZ;
        InterfaceC1846850y9z interfaceC1846850y9z;
        C1119430fEj c1119430fEj;
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ == null || (dataChannelLJIIIZ = C782710Un7.LJIIIZ(C782710Un7.LIZ)) == null || (interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannelLJIIIZ.gg0(C1119110fED.class)) == null || (c1119430fEj = (C1119430fEj) dataChannelLJIIIZ.gg0(TeamRankStickerModelChannel.class)) == null) {
            return;
        }
        long j = c1119430fEj.LJIILL;
        long j2 = c1119430fEj.LJIILLIIL;
        long jLIZJ = C158B.LIZJ();
        if (j > jLIZJ || jLIZJ >= j2) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC1094280eaA.Pd;
            if (c20337914i1.LIZIZ().booleanValue()) {
                C766270U4b.LIZLLL(TeamRankStickerSetting.INSTANCE.getUseNewStyle() ? 2131855338 : 2131855320);
            } else {
                c20337914i1.LJFF(Boolean.TRUE);
                C766270U4b.LJII(TeamRankStickerSetting.INSTANCE.getUseNewStyle() ? 2131855337 : 2131855319, C1846800y9u.LJIILLIIL(c1119430fEj.LJIILL), C1846800y9u.LJIILLIIL(c1119430fEj.LJIILLIIL));
            }
            C1119410fEh.LJ(dataChannelLJIIIZ, RankTypeV2.LJIJJLI, "jsb", new C1119060fE8());
            return;
        }
        if (interfaceC1846850y9z.LJIIIZ() || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
            return;
        }
        C1119210fEN c1119210fEN = C1119210fEN.LIZ;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIJJLI;
        AwS101S1200000_17 awS101S1200000_17 = new AwS101S1200000_17(interfaceC1846850y9z, dataChannelLJIIIZ, 3);
        c1119210fEN.getClass();
        C1119210fEN.LJ(contextLIZ, dataChannelLJIIIZ, rankTypeV2, interfaceC1846850y9z, awS101S1200000_17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final View AH1(ViewParent viewParent) {
        View viewFindViewById;
        if (viewParent instanceof ViewGroup) {
            viewFindViewById = ((View) viewParent).findViewById(R.id.ba7);
        } else {
            viewFindViewById = null;
        }
        if (!(viewFindViewById instanceof ViewGroup)) {
            return null;
        }
        return viewFindViewById.findViewById(R.id.nfy);
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final boolean I00(int i) {
        long jLIZIZ = C1810700xDg.LIZIZ(i, false);
        if (1 > jLIZIZ || jLIZIZ >= 100) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final long Ig0(int i) {
        return C1810700xDg.LIZIZ(i, false);
    }

    public final boolean LIZ(BorderInfo borderInfo) {
        if (!TextUtils.equals(borderInfo.source, "hourly_rank") && !TextUtils.equals(borderInfo.source, "weekly_rank") && !TextUtils.equals(borderInfo.source, "weekly_rising") && !TextUtils.equals(borderInfo.source, "daily_rank")) {
            return true;
        }
        return !LiveAnchorGiftDisableSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void Tj2(View view) {
        if (LiveRankingCompetitiveAtmosphereSetting.INSTANCE.getRankingEntrancePositionOpt()) {
            View viewFindViewById = view.findViewById(R.id.tqe);
            View viewFindViewById2 = view.findViewById(R.id.jgy);
            View viewFindViewById3 = view.findViewById(R.id.sqk);
            View viewFindViewById4 = view.findViewById(R.id.sql);
            View viewFindViewById5 = view.findViewById(R.id.hh1);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                c19me.endToStart = viewFindViewById3.getId();
                C786410Ut5.W5(viewFindViewById, c19me);
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
                if (layoutParams2 != null) {
                    C19ME c19me2 = (C19ME) layoutParams2;
                    c19me2.endToStart = viewFindViewById5.getId();
                    c19me2.startToEnd = viewFindViewById4.getId();
                    C786410Ut5.W5(viewFindViewById2, c19me2);
                    ViewGroup.LayoutParams layoutParams3 = viewFindViewById3.getLayoutParams();
                    if (layoutParams3 != null) {
                        C19ME c19me3 = (C19ME) layoutParams3;
                        c19me3.startToEnd = viewFindViewById.getId();
                        C786410Ut5.W5(viewFindViewById3, c19me3);
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById4.getLayoutParams();
                        if (layoutParams4 != null) {
                            C19ME c19me4 = (C19ME) layoutParams4;
                            ((ViewGroup.MarginLayoutParams) c19me4).width = -2;
                            c19me4.endToStart = viewFindViewById2.getId();
                            C786410Ut5.W5(viewFindViewById4, c19me4);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tn1(int r7) {
        /*
            r6 = this;
            X.0eND r0 = X.C1086280eNG.LIZIZ
            java.lang.String r5 = r0.LIZJ
            java.lang.String r4 = r0.LJ
            java.lang.String r1 = r0.LIZLLL
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "end_live_click"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            r2.LJIL()
            java.lang.String r0 = "task_id"
            r2.LJJII(r5, r0)
            java.lang.String r0 = "card_id"
            r2.LJJII(r4, r0)
            java.lang.String r0 = "task_source"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "user_id"
            r2.LJJII(r1, r0)
            if (r3 == 0) goto L56
            int r0 = r3.intValue()
            if (r0 != 0) goto L4c
            java.lang.String r1 = "think_again"
        L43:
            java.lang.String r0 = "click_button"
            r2.LJJII(r1, r0)
            r2.LIZ()
            return
        L4c:
            int r1 = r3.intValue()
            r0 = 1
            if (r1 != r0) goto L56
            java.lang.String r1 = "confirm"
            goto L43
        L56:
            java.lang.String r1 = "no_selection"
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.RankService.Tn1(int):void");
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final AnchorRankingSettingFragment Wq0(int i) {
        if (i != 1) {
            return null;
        }
        return new AnchorRankingSettingFragment();
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final Class<? extends LiveRecyclableWidget> jm1(boolean z) {
        if (z) {
            return OnlineAudienceRankWidget.class;
        }
        return OnlineAudienceRankLandScapeWidget.class;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void oA(DataChannel dataChannel, String str) {
        List<String> value;
        if (!TextUtils.isEmpty(str) && dataChannel != null && (value = RankDialogHideSourceSettings.INSTANCE.getValue()) != null && value.contains(str)) {
            dataChannel.FQ2(CloseAudienceRankDialogEvent.class);
            dataChannel.FQ2(CloseRankDialogEvent.class);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.00nu] */
    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final C188000nu xI2(Context context, DataChannel dataChannel) {
        return new InterfaceC188100nv() { // from class: X.00nu
        };
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void bZ1(long j, long j2, C2029207xC c2029207xC) {
        this.LL = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestFriendRankMatchSuggestion start, roomAnchorId=");
        sbLIZ.append(j);
        sbLIZ.append(", toAnchorId=");
        sbLIZ.append(j2);
        C20441214yg.LJIIIZ("RankService", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        ((RankApi) C480460Ism.LIZLLL(RankApi.class)).getRankInteractList(j, j2, 1).LJIILIIL(new C0UO0()).LJJLL(new AfS2S0200200_3(this, j, j2, c2029207xC, 0), new AfS2S0200200_3(this, j, j2, c2029207xC, 1));
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final LiveDialogFragment YP(int i, int i2, String str, String str2) {
        C1119060fE8 c1119060fE8 = new C1119060fE8(str2);
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIIL;
        if (i == rankTypeV2.type) {
            TabRankStickerDialog tabRankStickerDialog = new TabRankStickerDialog(i2, str, rankTypeV2);
            tabRankStickerDialog.LLJJIJIL = c1119060fE8;
            return tabRankStickerDialog;
        }
        if (i == RankTypeV2.LJIJJLI.type) {
            TeamRankStickerDialog teamRankStickerDialog = new TeamRankStickerDialog(i2, str);
            teamRankStickerDialog.LLJILJILJ = c1119060fE8;
            return teamRankStickerDialog;
        }
        RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
        if (i == rankTypeV22.type) {
            TabRankStickerDialog tabRankStickerDialog2 = new TabRankStickerDialog(i2, str, rankTypeV22);
            tabRankStickerDialog2.LLJJIJIL = c1119060fE8;
            return tabRankStickerDialog2;
        }
        RankTypeV2 rankTypeV23 = RankTypeV2.LJIL;
        if (i == rankTypeV23.type) {
            TabRankStickerDialog tabRankStickerDialog3 = new TabRankStickerDialog(i2, str, rankTypeV23);
            tabRankStickerDialog3.LLJJIJIL = c1119060fE8;
            return tabRankStickerDialog3;
        }
        RankTypeV2 rankTypeV24 = RankTypeV2.LJIILJJIL;
        if (i == rankTypeV24.type) {
            TabRankStickerDialog tabRankStickerDialog4 = new TabRankStickerDialog(i2, str, rankTypeV24);
            tabRankStickerDialog4.LLJJIJIL = c1119060fE8;
            return tabRankStickerDialog4;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final LiveDialogFragment dC(int i, int i2, String str, String str2, boolean z) {
        if (z) {
            return new AnchorRankingSettingDialog();
        }
        NewRankSettingDialog newRankSettingDialog = new NewRankSettingDialog();
        newRankSettingDialog.LLJ = i;
        newRankSettingDialog.LLJI = i2;
        newRankSettingDialog.LLJIJIL = str;
        newRankSettingDialog.LLJILJIL = Uri.decode(str2);
        return newRankSettingDialog;
    }

    @Override // com.bytedance.android.livesdk.rank.api.IRankService
    public final void OJ(long j, long j2, int i, int i2, Fragment fragment, InterfaceC211300rf interfaceC211300rf) {
        if (fragment.isAdded()) {
            C480460Ism.LIZ().getClass();
            RankApi rankApi = (RankApi) C480460Ism.LIZLLL(RankApi.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("");
            rankApi.getRankListV2(j, j2, C2188811AlT.LIZIZ(sbLIZ), 1, 0L, true, i2).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new C516201zk(interfaceC211300rf, 112), new AfS138S0000000_16(12));
        }
    }
}
