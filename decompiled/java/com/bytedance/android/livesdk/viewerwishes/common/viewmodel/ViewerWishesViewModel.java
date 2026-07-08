package com.bytedance.android.livesdk.viewerwishes.common.viewmodel;

import X.AnonymousClass0956;
import X.C001A;
import X.C01GW;
import X.C09JN;
import X.C0IJT;
import X.C0J1N;
import X.C0KX5;
import X.C0TZM;
import X.C0UO0;
import X.C1096730ee7;
import X.C1125770fOx;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C11RD;
import X.C1338270kvh;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C181500mr;
import X.C1AI0;
import X.C1AI1;
import X.C1AI2;
import X.C2176881AHm;
import X.C2176931AHr;
import X.C2176991AHx;
import X.C2189711Amv;
import X.C452501pT;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C517101zt;
import X.C5182020e;
import X.C749210TaB;
import X.C766270U4b;
import X.C776250Uch;
import X.C963140bAe;
import X.C969770bLL;
import X.C974320bSg;
import X.EnumC774050UXz;
import X.InterfaceC0148002o;
import Y.AfS172S0100000_3;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractUnifiedStateChangeChannel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.viewerwishes.api.ViewerWishesApi;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.GameTrickyPickedData;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesRequestEndChannel;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.livesetting.game.ViewerWishesStoreSceneParameterSetting;
import com.bytedance.android.livesdk.model.message.GameTricksGiftInfo;
import com.bytedance.android.livesdk.model.message.GameTricksMessageContent;
import com.bytedance.android.livesdk.model.message.ViewerPicksUpdateMessage;
import com.bytedance.android.livesdk.model.message.ViewerWishesGameTricksMessage;
import com.bytedance.android.livesdk.viewer_picks.model.FinishParams;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdk.viewerwishes.common.viewmodel.ViewerWishesViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes34.dex */
public final class ViewerWishesViewModel extends AssemViewModel<C2176931AHr> implements OnMessageListener {
    public static final /* synthetic */ int LLJILJIL = 0;
    public DataChannel LL;
    public ViewerPicksInfo LLILLL;
    public AnonymousClass0956 LLILZ;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C969770bLL.class, (Class<Object>) null, (String) 13), true);
    public long LLILZIL = -1;
    public long LLILZLL = -1;
    public long LLJI = -1;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(50));

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AQ2() {
        /*
            r3 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LL
            r2 = 0
            if (r1 == 0) goto L2e
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r1 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
            if (r1 == 0) goto L2f
            boolean r0 = r1.isGameLiveStreamType()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L17:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L31
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LL
            if (r1 == 0) goto L29
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel> r0 = com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class
            java.lang.Object r2 = r1.gg0(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L29:
            boolean r0 = X.C500260Jjc.LJJJI(r2)
            return r0
        L2e:
            r1 = r2
        L2f:
            r0 = r2
            goto L17
        L31:
            if (r1 == 0) goto L3f
            long r0 = r1.getOwnerUserId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r2 = r0.toString()
        L3f:
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewerwishes.common.viewmodel.ViewerWishesViewModel.AQ2():boolean");
    }

    public final void DQ2() {
        if (AQ2()) {
            return;
        }
        long j = this.LLJI;
        if (j != -1) {
            C1AI2 c1ai2 = new C1AI2(null, null, null, null, null, "live_detail", null, 0L, j, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -289, 2097151);
            C1AI1.LIZ(c1ai2, this.LL, false);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_vw_watch_duration");
            c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
            c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
            w.LIZ.getClass();
            c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
            c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
            c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
            c474500IjALIZ.LJJII(c1ai2.LJJIIJZLJL, "viewer_wishes_live_type");
            c474500IjALIZ.LJJII(Integer.valueOf((int) Math.rint((System.currentTimeMillis() - c1ai2.LJIIIIZZ) / 1000.0f)), "watch_vw_duration");
            c474500IjALIZ.LJJII(c1ai2.LJFF, "event_page");
            c474500IjALIZ.LIZ();
            this.LLJI = -1L;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2176931AHr(null, null, null, null);
    }

    public final C2176991AHx xQ2() {
        return (C2176991AHx) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        IMessageManager iMessageManager;
        DQ2();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(C001A.VIEWER_PICKS_UPDATE_MESSAGE.getIntType(), this);
            iMessageManager.removeMessageListener(C001A.VIEWER_WISHES_GAME_TRICKS_MESSAGE.getIntType(), this);
        }
        xQ2().LIZ();
        this.LLILZLL = this.LLILZIL;
        this.LLILZIL = -1L;
        this.LLIZ = 0;
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        IMessageManager iMessageManager;
        super.onPrepared();
        DataChannel dataChannel = ((C969770bLL) this.LLILLJJLI.getValue()).LL;
        this.LL = dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addStickyMessageListener(C001A.VIEWER_PICKS_UPDATE_MESSAGE.getIntType(), this);
            iMessageManager.addStickyMessageListener(C001A.VIEWER_WISHES_GAME_TRICKS_MESSAGE.getIntType(), this);
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, InteractUnifiedStateChangeChannel.class, new AwS594S0100000_15(this, 576));
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, ViewerWishesRequestEndChannel.class, new AwS596S0100000_17(this, 253));
        }
    }

    public static long wQ2(ViewerPicksInfo viewerPicksInfo) {
        long jLIZJ = viewerPicksInfo.endTimeMs - C963140bAe.LIZJ();
        if (jLIZJ < 0) {
            jLIZJ = 0;
        }
        return jLIZJ / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final boolean BQ2(ViewerPicksUpdateMessage viewerPicksUpdateMessage) {
        long j;
        boolean z;
        int i;
        Boolean boolValueOf;
        ViewerPicksInfo viewerPicksInfo;
        int i2;
        Pair pair;
        Long l;
        Pair pair2;
        Boolean bool = null;
        if (!C500260Jjc.LJJIJIIJIL(Boolean.valueOf(ViewerWishesStoreSceneParameterSetting.INSTANCE.getValue())) && (viewerPicksInfo = viewerPicksUpdateMessage.info) != null) {
            long j2 = viewerPicksInfo.viewerPicksId;
            DataChannel dataChannel = this.LL;
            if (dataChannel != null && (pair = (Pair) dataChannel.gg0(C749210TaB.class)) != null && (l = (Long) pair.getFirst()) != null && l.longValue() == j2) {
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null && (pair2 = (Pair) dataChannel2.gg0(C749210TaB.class)) != null) {
                    int iIntValue = ((Number) pair2.getSecond()).intValue();
                    ViewerPicksInfo viewerPicksInfo2 = viewerPicksUpdateMessage.info;
                    if (viewerPicksInfo2 != null) {
                        viewerPicksInfo2.scene = iIntValue;
                    }
                }
            } else {
                DataChannel dataChannel3 = this.LL;
                if (dataChannel3 != null) {
                    Long lValueOf = Long.valueOf(j2);
                    ViewerPicksInfo viewerPicksInfo3 = viewerPicksUpdateMessage.info;
                    if (viewerPicksInfo3 != null) {
                        i2 = viewerPicksInfo3.scene;
                    } else {
                        i2 = 0;
                    }
                    dataChannel3.SX0(C749210TaB.class, new Pair(lValueOf, Integer.valueOf(i2)));
                }
            }
        }
        ViewerPicksInfo viewerPicksInfo4 = viewerPicksUpdateMessage.info;
        if (viewerPicksInfo4 != null && (viewerPicksInfo4.displayMode == 0 || viewerPicksInfo4.displayMode == 1)) {
            DataChannel dataChannel4 = this.LL;
            if (dataChannel4 != null) {
                boolValueOf = Boolean.valueOf(C500260Jjc.LJIJI(dataChannel4));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                DataChannel dataChannel5 = this.LL;
                if (dataChannel5 != null) {
                    bool = (Boolean) dataChannel5.gg0(C0TZM.class);
                }
                if (C500260Jjc.LJJIJIIJIL(bool)) {
                    return true;
                }
            }
        }
        ViewerPicksInfo viewerPicksInfo5 = viewerPicksUpdateMessage.info;
        if (viewerPicksInfo5 != null) {
            j = viewerPicksInfo5.viewerPicksId;
        } else {
            j = 0;
        }
        int i3 = viewerPicksUpdateMessage.updateType;
        long j3 = this.LLILZIL;
        if ((j == j3 && ((i = this.LLIZ) == 1 || i == 2 || (i == 3 && i3 == 4))) || (j3 == -1 && (i3 == 1 || i3 == 2))) {
            z = true;
        } else {
            z = false;
        }
        long j4 = this.LLILZLL;
        if ((j4 != -1 && j3 == j4) || !z) {
            return true;
        }
        this.LLILZIL = j;
        this.LLIZ = i3;
        return false;
    }

    public final void CQ2(ViewerPicksInfo viewerPicksInfo) {
        EnumC774050UXz enumC774050UXz;
        DataChannel dataChannel;
        if (viewerPicksInfo.displayMode == 0) {
            enumC774050UXz = EnumC774050UXz.AUDIENCE_HORIZONTAL;
        } else if (AQ2()) {
            enumC774050UXz = EnumC774050UXz.SOLO_CREATOR;
        } else {
            enumC774050UXz = EnumC774050UXz.AUDIENCE_VERTICAL;
        }
        List<GiftPickWithScore> list = viewerPicksInfo.giftPickList;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<GiftPickWithScore> it2 = list.iterator();
            while (it2.hasNext()) {
                GiftPick giftPick = it2.next().giftPick;
                if (giftPick != null) {
                    arrayList.add(Long.valueOf(giftPick.giftId));
                }
            }
        }
        if ((!arrayList.isEmpty()) && (dataChannel = this.LL) != null) {
            C2176881AHm c2176881AHm = new C2176881AHm(enumC774050UXz, new C1125770fOx(arrayList, viewerPicksInfo));
            C1AI0.LIZIZ = c2176881AHm;
            dataChannel.zW(ViewerWishesStatus.class, c2176881AHm);
        }
    }

    public final void GQ2(String str) {
        long id;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LL);
        if (roomLJJLIIIIJ != null) {
            id = roomLJJLIIIIJ.getId();
        } else {
            id = 0;
        }
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Jf0(id, C181500mr.LJ(id, str), true, null);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        GameTricksMessageContent gameTricksMessageContent;
        GameTricksGiftInfo gameTricksGiftInfo;
        boolean z;
        int i;
        C2176881AHm c2176881AHm;
        C1125770fOx c1125770fOx;
        ViewerPicksInfo viewerPicksInfo;
        List<GiftPickWithScore> list;
        Long lValueOf;
        Long lValueOf2;
        String str;
        String str2;
        DataChannel dataChannel;
        C974320bSg c974320bSg;
        Long lValueOf3 = null;
        if (iMessage instanceof ViewerPicksUpdateMessage) {
            ViewerPicksUpdateMessage viewerPicksUpdateMessage = (ViewerPicksUpdateMessage) iMessage;
            ViewerPicksInfo viewerPicksInfo2 = viewerPicksUpdateMessage.info;
            if (viewerPicksInfo2 == null) {
                return;
            }
            int i2 = viewerPicksUpdateMessage.updateType;
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (BQ2(viewerPicksUpdateMessage)) {
                            return;
                        } else {
                            yQ2(viewerPicksInfo2, false);
                        }
                    }
                } else if (BQ2(viewerPicksUpdateMessage)) {
                    return;
                } else {
                    zQ2(viewerPicksInfo2);
                }
            } else {
                if (this.LLILZIL == viewerPicksInfo2.viewerPicksId) {
                    z = true;
                } else {
                    z = false;
                }
                if (BQ2(viewerPicksUpdateMessage)) {
                    return;
                }
                if (z) {
                    this.LLILLL = viewerPicksInfo2;
                    setState(new AwS399S0200000_33(viewerPicksInfo2, this, 31));
                    if (!AQ2() && ((i = viewerPicksInfo2.displayMode) == 1 || i == 2)) {
                        List<GiftPickWithScore> list2 = viewerPicksInfo2.giftPickList;
                        DataChannel dataChannel2 = this.LL;
                        if (dataChannel2 != null && (c2176881AHm = (C2176881AHm) dataChannel2.gg0(ViewerWishesStatus.class)) != null && (c1125770fOx = c2176881AHm.LIZIZ) != null && (viewerPicksInfo = c1125770fOx.LIZIZ) != null && (list = viewerPicksInfo.giftPickList) != null && list.size() == list2.size()) {
                            Iterator<GiftPickWithScore> it2 = list.iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                GiftPickWithScore next = it2.next();
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    GiftPickWithScore giftPickWithScore = next;
                                    GiftPickWithScore giftPickWithScore2 = (GiftPickWithScore) ListProtector.get(list2, i3);
                                    GiftPick giftPick = giftPickWithScore.giftPick;
                                    if (giftPick != null) {
                                        lValueOf = Long.valueOf(giftPick.giftId);
                                    } else {
                                        lValueOf = null;
                                    }
                                    GiftPick giftPick2 = giftPickWithScore2.giftPick;
                                    if (giftPick2 != null) {
                                        lValueOf2 = Long.valueOf(giftPick2.giftId);
                                    } else {
                                        lValueOf2 = null;
                                    }
                                    boolean zLJFF = Intrinsics.LJFF(lValueOf, lValueOf2);
                                    GiftPick giftPick3 = giftPickWithScore.giftPick;
                                    if (giftPick3 != null) {
                                        str = giftPick3.customizedDesc;
                                    } else {
                                        str = null;
                                    }
                                    GiftPick giftPick4 = giftPickWithScore2.giftPick;
                                    if (giftPick4 != null) {
                                        str2 = giftPick4.customizedDesc;
                                    } else {
                                        str2 = null;
                                    }
                                    boolean zLJFF2 = Intrinsics.LJFF(str, str2);
                                    if (zLJFF && !zLJFF2) {
                                        C766270U4b.LIZLLL(2131856973);
                                        break;
                                    }
                                    i3 = i4;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                    }
                    CQ2(viewerPicksInfo2);
                } else {
                    this.LLIZLLLIL = false;
                    this.LLJ = false;
                    this.LLILLL = viewerPicksInfo2;
                    this.LLJI = System.currentTimeMillis();
                    setState(new AwS399S0200000_33(viewerPicksInfo2, this, 30));
                    if (viewerPicksInfo2.hasDuration) {
                        xQ2().LIZ();
                        C2176991AHx c2176991AHxXQ2 = xQ2();
                        long jWQ2 = wQ2(viewerPicksInfo2);
                        AwS399S0200000_33 awS399S0200000_33 = new AwS399S0200000_33(viewerPicksInfo2, this, 32);
                        AwS434S0200000_33 awS434S0200000_33 = new AwS434S0200000_33(viewerPicksInfo2, this, 153);
                        if (jWQ2 <= 0) {
                            c2176991AHxXQ2.getClass();
                            awS434S0200000_33.invoke();
                        } else {
                            C11JF c11jf = c2176991AHxXQ2.LIZ;
                            if (c11jf != null) {
                                c11jf.dispose();
                            }
                            c2176991AHxXQ2.LIZ = (C11JF) C11NZ.LJJJJLL(0L, jWQ2 + 1, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJJJZI(new C517101zt(jWQ2, 9)).LJJIJIIJIL(new AfS172S0100000_3((Object) awS399S0200000_33, 31)).LJJIIJZLJL(new C2189711Amv(awS434S0200000_33, c2176991AHxXQ2, 0)).LJJLJ();
                        }
                    } else {
                        xQ2().LIZ();
                    }
                    CQ2(viewerPicksInfo2);
                    int i5 = viewerPicksInfo2.displayMode;
                    if (i5 != 0) {
                        if ((i5 == 1 || i5 == 2) && !AQ2()) {
                            int i6 = viewerPicksInfo2.scene;
                            if (i6 != 3) {
                                if (i6 != 5) {
                                    if (i6 != 6) {
                                        GQ2(C497740JfY.LJIJI(2131856982));
                                    } else {
                                        GQ2(C497740JfY.LJIJI(2131853594));
                                    }
                                }
                            } else {
                                GQ2(C497740JfY.LJIJI(2131853634));
                            }
                        }
                    } else {
                        GQ2(C497740JfY.LJIJI(2131856934));
                        GQ2(C497740JfY.LJIJI(2131856935));
                    }
                }
            }
            if (AQ2() && viewerPicksUpdateMessage.updateType != 4) {
                DataChannel dataChannel3 = this.LL;
                if (dataChannel3 != null && (c974320bSg = (C974320bSg) dataChannel3.gg0(InteractUnifiedStateChangeChannel.class)) != null && c974320bSg.LIZIZ && !Intrinsics.LJFF(c974320bSg.LIZJ, "RECEIVED") && !Intrinsics.LJFF(c974320bSg.LIZJ, "INVITED") && !Intrinsics.LJFF(c974320bSg.LIZJ, "APPLIED")) {
                    if (Intrinsics.LJFF(c974320bSg.LIZ, "guest")) {
                        C766270U4b.LIZLLL(2131857029);
                    } else {
                        C766270U4b.LIZLLL(2131857028);
                    }
                    DataChannel dataChannel4 = this.LL;
                    if (dataChannel4 != null) {
                        dataChannel4.LC0(ViewerWishesRequestEndChannel.class, AFwS203S0000000_15.get$arr$(239));
                        return;
                    }
                    return;
                }
                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                if (iInteractService != null && iInteractService.oh1()) {
                    IInteractService iInteractService2 = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                    if (iInteractService2 == null) {
                        return;
                    }
                    iInteractService2.Jf2();
                    return;
                }
                if (!C0KX5.LIZLLL(this.LL) || (dataChannel = this.LL) == null) {
                    return;
                }
                dataChannel.LC0(ViewerWishesRequestEndChannel.class, AFwS224S0000000_33.get$arr$(563));
                return;
            }
            return;
        }
        if (iMessage instanceof ViewerWishesGameTricksMessage) {
            ViewerWishesGameTricksMessage viewerWishesGameTricksMessage = (ViewerWishesGameTricksMessage) iMessage;
            if (viewerWishesGameTricksMessage.messageType != 0 && (gameTricksMessageContent = viewerWishesGameTricksMessage.content) != null && (gameTricksGiftInfo = gameTricksMessageContent.giftInfo) != null) {
                String str3 = gameTricksGiftInfo.roomIdStr;
                DataChannel dataChannel5 = this.LL;
                if (dataChannel5 != null) {
                    lValueOf3 = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel5));
                }
                if (TextUtils.equals(str3, String.valueOf(lValueOf3))) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    DataChannel dataChannel6 = this.LL;
                    if (dataChannel6 != null) {
                        dataChannel6.zW(GameTrickyPickedData.class, gameTricksGiftInfo);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        return X.EnumC2176961AHu.BILLBOARD;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC2176961AHu vQ2(com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo r4) {
        /*
            r3 = this;
            int r2 = r4.displayMode
            if (r2 == 0) goto L2a
            r1 = 1
            if (r2 == r1) goto Ld
            r0 = 2
            if (r2 == r0) goto L27
            X.1AHu r0 = X.EnumC2176961AHu.VERTICAL
            return r0
        Ld:
            boolean r0 = r3.AQ2()
            if (r0 == 0) goto L1e
            com.bytedance.android.livesdk.livesetting.gift.LiveViewerWishesBillboardEnableSetting r0 = com.bytedance.android.livesdk.livesetting.gift.LiveViewerWishesBillboardEnableSetting.INSTANCE
            boolean r0 = r0.enabled()
            if (r0 == 0) goto L27
        L1b:
            X.1AHu r0 = X.EnumC2176961AHu.BILLBOARD
            return r0
        L1e:
            com.bytedance.android.livesdk.viewer_picks.model.ViewerPickAnchorParam r0 = r4.anchorParam
            if (r0 == 0) goto L27
            boolean r0 = r0.integrateVwIntoLiveboard
            if (r0 != r1) goto L27
            goto L1b
        L27:
            X.1AHu r0 = X.EnumC2176961AHu.VERTICAL
            return r0
        L2a:
            X.1AHu r0 = X.EnumC2176961AHu.HORIZONTAL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewerwishes.common.viewmodel.ViewerWishesViewModel.vQ2(com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo):X.1AHu");
    }

    public final void zQ2(ViewerPicksInfo viewerPicksInfo) {
        boolean z;
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        this.LLILLL = viewerPicksInfo;
        this.LLIZ = 3;
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AnonymousClass0956 anonymousClass09562 = this.LLILZ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LLILZ = null;
        }
        xQ2().LIZ();
        DQ2();
        if (AQ2()) {
            EQ2(1, 5, null);
        }
        setState(new AwS612S0100000_33(viewerPicksInfo, 31));
        this.LLILZ = C500260Jjc.LJJJJJ(this, null, new C1096730ee7(this, viewerPicksInfo, null), 3);
    }

    public final void yQ2(ViewerPicksInfo viewerPicksInfo, boolean z) {
        if (this.LLJ) {
            return;
        }
        boolean z2 = true;
        this.LLJ = true;
        this.LLILLL = viewerPicksInfo;
        this.LLIZ = 4;
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            z2 = false;
        }
        if (z2) {
            AnonymousClass0956 anonymousClass09562 = this.LLILZ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LLILZ = null;
        }
        xQ2().LIZ();
        this.LLILZLL = this.LLILZIL;
        this.LLILZIL = -1L;
        this.LLIZ = 0;
        DQ2();
        if (!z && viewerPicksInfo.displayMode != 0 && AQ2()) {
            if (viewerPicksInfo.enableAutoRestart && !C0KX5.LIZIZ(this.LL)) {
                EQ2(3, 5, new C5182020e(this, 100));
            } else {
                EQ2(3, 5, null);
            }
        }
        setState(new AwS612S0100000_33(viewerPicksInfo, 30));
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            C2176881AHm c2176881AHm = new C2176881AHm(EnumC774050UXz.NONE, null);
            C1AI0.LIZIZ = c2176881AHm;
            dataChannel.zW(ViewerWishesStatus.class, c2176881AHm);
        }
        if (viewerPicksInfo.status == 3 && !AQ2()) {
            if (viewerPicksInfo.displayMode == 0) {
                C766270U4b.LIZLLL(2131856933);
            } else {
                C766270U4b.LIZLLL(2131856974);
            }
        }
    }

    public final void EQ2(final int i, final int i2, final Function0<Unit> function0) {
        long id;
        Room room;
        if (i2 < 0) {
            ViewerPicksInfo viewerPicksInfo = this.LLILLL;
            if (viewerPicksInfo != null && viewerPicksInfo.status == 4) {
                return;
            }
            C766270U4b.LIZLLL(2131857031);
            return;
        }
        FinishParams finishParams = new FinishParams();
        DataChannel dataChannel = this.LL;
        long j = 0;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        finishParams.roomId = id;
        ViewerPicksInfo viewerPicksInfo2 = this.LLILLL;
        if (viewerPicksInfo2 != null) {
            j = viewerPicksInfo2.viewerPicksId;
        }
        finishParams.viewerPicksId = j;
        finishParams.actionType = i;
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((ViewerWishesApi) C480460Ism.LIZLLL(ViewerWishesApi.class)).finishViewerWishes(finishParams).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this))).LIZ(new C09JN() { // from class: X.00vq
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ViewerWishesViewModel@1380.requestFinishWithRetry$1");
                ViewerWishesViewModel viewerWishesViewModel = this.LL;
                ViewerPicksInfo viewerPicksInfo3 = viewerWishesViewModel.LLILLL;
                if (viewerPicksInfo3 != null) {
                    int i3 = i;
                    int i4 = 2;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i4 = 4;
                        } else {
                            i4 = 3;
                        }
                    }
                    viewerPicksInfo3.status = i4;
                }
                if (i != 1 && viewerPicksInfo3 != null) {
                    viewerWishesViewModel.yQ2(viewerPicksInfo3, true);
                }
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
                C1C7U.LIZIZ("ViewerWishesViewModel@1380.requestFinishWithRetry$1");
            }
        }, new C09JN() { // from class: X.00vp
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ViewerWishesViewModel@1380.requestFinishWithRetry$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to start viewer wishes: ");
                sbLIZ.append(((Throwable) obj).getMessage());
                sbLIZ.append(", retryCount = ");
                sbLIZ.append(i2);
                C20441214yg.LJ("ViewerWishesViewModel", C2188811AlT.LIZIZ(sbLIZ));
                this.EQ2(i, i2 - 1, function0);
                C1C7U.LIZIZ("ViewerWishesViewModel@1380.requestFinishWithRetry$2");
            }
        });
    }
}
