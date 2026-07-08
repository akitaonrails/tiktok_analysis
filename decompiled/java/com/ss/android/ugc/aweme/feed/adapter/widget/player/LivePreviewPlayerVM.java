package com.ss.android.ugc.aweme.feed.adapter.widget.player;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C086I;
import X.C0ITW;
import X.C0J89;
import X.C0K9R;
import X.C0NAL;
import X.C0UO0;
import X.C0XQ7;
import X.C1082950eHt;
import X.C1100750ekb;
import X.C1155820gBQ;
import X.C1161920gLG;
import X.C11IW;
import X.C11NZ;
import X.C1386210mB1;
import X.C1699360uK6;
import X.C1699430uKD;
import X.C176600m4;
import X.C19487111Lx;
import X.C19748512Ol;
import X.C1A69;
import X.C1A7N;
import X.C1ABT;
import X.C1ABV;
import X.C1AC7;
import X.C1AC8;
import X.C1ACA;
import X.C1ACD;
import X.C1ACS;
import X.C1ACV;
import X.C1ACY;
import X.C1ADB;
import X.C1ADO;
import X.C20441214yg;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2174311A7p;
import X.C2175491ACd;
import X.C2175601ACo;
import X.C2175701ACy;
import X.C2183841AdS;
import X.C2188811AlT;
import X.C2189721Amw;
import X.C2276281E7u;
import X.C2344009Gk;
import X.C291530Bbj;
import X.C300960Bqw;
import X.C452501pT;
import X.C468980IaG;
import X.C473100Igu;
import X.C473110Igv;
import X.C473250Ih9;
import X.C480460Ism;
import X.C500260Jjc;
import X.C510380Jzw;
import X.C583460MuW;
import X.C584960Mww;
import X.C945320ahu;
import X.C969340bKe;
import X.EnumC1913520ztW;
import X.EnumC1913550ztZ;
import X.EnumC2175041AAk;
import X.EnumC510330Jzr;
import X.InterfaceC2175541ACi;
import X.InterfaceC2175971ADz;
import X.InterfaceC486670J6r;
import Y.ARunnableS109S0100000_9;
import Y.AfS30S0210000_7;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameEnableIntelligentRotationSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubSuperFanFeedPreviewUseLocalTextSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSeiFormatErrIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkEnableFeedLiveTrackAddMultiParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestAddPreviewCommonParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMockSeiNotReceiveSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkEnterExitRoomSeiSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnableFeedFullLinkTrackAddMultiParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRtcRatioOptimize;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3VideoSeiEndSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBoardsAudienceReportSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCadSmoothExitSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewCardEnableSrSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveStaticLogOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveNetworkCtlSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveSlowMethodOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveEnablePlayerSetTimeoutSetting;
import com.bytedance.android.livesdk.sei.LinkMicSei;
import com.bytedance.android.livesdk.sei.LiveBoardsSeiData;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiContainerInfo;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MultiGuestLayoutInfo;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserApplySettings;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserSettings;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.live.SMBInfo;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.feed.setting.LivePreviewLinkPerfSendSetting;
import com.ss.android.ugc.aweme.feed.vm.VideoStateViewModel;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewPlayerVM extends LiveWidgetViewModel {
    public static final /* synthetic */ int LLJLLL = 0;
    public boolean LLJJIII;
    public EnumC2175041AAk LLJJIJI;
    public boolean LLJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJL;
    public C0ITW LLJJLIIIJLLLLLLLZ;
    public C19487111Lx LLJLILLLLZIIL;
    public final C1ACD LLJLLIL;
    public final MutableLiveData<Pair<EnumC1913550ztZ, Object>> LL = new MutableLiveData<>();
    public final MutableLiveData<C473250Ih9> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<C473250Ih9> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<C0K9R> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<String> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJ = new MutableLiveData<>();
    public final NextLiveData LLJI = new NextLiveData();
    public final MutableLiveData<Boolean> LLJIJIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJILJIL = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLJILJILJ = new MutableLiveData<>();
    public final MutableLiveData<C1100750ekb> LLJILLL = new MutableLiveData<>();
    public final MutableLiveData<C2174311A7p> LLJJ = new MutableLiveData<>();
    public final C473100Igu LLJJI = new C473100Igu();
    public final NextLiveData LLJJIJIIJIL = new NextLiveData();
    public final NextLiveData LLJJIJIL = new NextLiveData();
    public int LLJJJIL = -1;
    public int LLJJJJ = -1;
    public C1ABV LLJJJJLIIL = C1ABV.IDLE;
    public String LLJL = "null";
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(294));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2129));

    public final View BQ2() {
        C2175491ACd c2175491ACdLJJJJLI = this.LLJLLIL.LJJJJLI();
        if (c2175491ACdLJJJJLI != null) {
            return c2175491ACdLJJJJLI.LIZ;
        }
        return null;
    }

    public final void IQ2() {
        if (this.LLJJJ) {
            return;
        }
        this.LLJJJ = true;
        this.LLJLLIL.LJIILL(false);
    }

    public final C1ACA zQ2() {
        return (C1ACA) this.LLJLL.getValue();
    }

    public LivePreviewPlayerVM() {
        C1ACD c1acdGenerateLivePlayHelper;
        InterfaceC2175541ACi interfaceC2175541ACi = new InterfaceC2175541ACi() { // from class: X.1AC9
            @Override // X.InterfaceC2175541ACi
            public final Integer Dk() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean LLILLIZIL() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final void T5() {
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean U1() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean We() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final void w9(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLIL() {
                if (LiveCadSmoothExitSetting.INSTANCE.enable()) {
                    this.LL.LLJLLIL.LJIIJJI(true);
                    this.LL.LLJI.setValue(Boolean.FALSE);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLLLIL() {
                LiveRoomStruct liveRoomStruct;
                Long lLJIILIIL;
                this.LL.LLJJI.LIZJ = new C1ADB() { // from class: X.1ADk
                };
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.LL.LLJJI.LJFF("sdk_player_first_frame", String.valueOf(jCurrentTimeMillis));
                String str = this.LL.LLJJI.LIZIZ.get("sdk_player_start");
                long jLongValue = (str == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null) ? 0L : lLJIILIIL.longValue();
                C1AC7 c1ac7 = C1AC7.LIZ;
                Pair[] pairArr = new Pair[6];
                C1ACA c1acaZQ2 = this.LL.zQ2();
                pairArr[0] = new Pair("roomId", Long.valueOf((c1acaZQ2 == null || (liveRoomStruct = c1acaZQ2.LIZJ) == null) ? 0L : liveRoomStruct.id));
                C1ACA c1acaZQ22 = this.LL.zQ2();
                pairArr[1] = new Pair("etaEnabled", c1acaZQ22 != null ? Boolean.valueOf(c1acaZQ22.LLFF) : null);
                C1ACA c1acaZQ23 = this.LL.zQ2();
                pairArr[2] = new Pair("startPlayReason", c1acaZQ23 != null ? c1acaZQ23.LJJLIIIJ : null);
                C1ACA c1acaZQ24 = this.LL.zQ2();
                pairArr[3] = new Pair("pulseCount", c1acaZQ24 != null ? Integer.valueOf(c1acaZQ24.LLF) : null);
                pairArr[4] = new Pair("costMs", Long.valueOf(jLongValue > 0 ? jCurrentTimeMillis - jLongValue : -1L));
                pairArr[5] = new Pair("firstFrameTs", Long.valueOf(jCurrentTimeMillis));
                c1ac7.getClass();
                C1AC7.LJIILL("preview_first_frame", pairArr);
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Md() {
                C1ACA c1acaZQ2 = this.LL.zQ2();
                if (c1acaZQ2 != null) {
                    return c1acaZQ2.LJLILLLLZI;
                }
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Y7() {
                return this.LL.zQ2();
            }

            @Override // X.InterfaceC2175541ACi
            public final void o() {
                LiveRoomStruct liveRoomStruct;
                this.LL.LLJJI.LIZJ = new C1ADB() { // from class: X.1ADh
                };
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.LL.LLJJI.LJFF("sdk_player_start", String.valueOf(jCurrentTimeMillis));
                C1AC7 c1ac7 = C1AC7.LIZ;
                Pair[] pairArr = new Pair[4];
                C1ACA c1acaZQ2 = this.LL.zQ2();
                pairArr[0] = new Pair("roomId", Long.valueOf((c1acaZQ2 == null || (liveRoomStruct = c1acaZQ2.LIZJ) == null) ? 0L : liveRoomStruct.id));
                C1ACA c1acaZQ22 = this.LL.zQ2();
                pairArr[1] = new Pair("etaEnabled", c1acaZQ22 != null ? Boolean.valueOf(c1acaZQ22.LLFF) : null);
                C1ACA c1acaZQ23 = this.LL.zQ2();
                pairArr[2] = new Pair("startPlayReason", c1acaZQ23 != null ? c1acaZQ23.LJJLIIIJ : null);
                pairArr[3] = new Pair("startTs", Long.valueOf(jCurrentTimeMillis));
                c1ac7.getClass();
                C1AC7.LJIILL("preview_start_pull", pairArr);
            }

            @Override // X.InterfaceC2175541ACi
            public final void v() {
                String aid;
                C1ACA c1acaZQ2;
                Aweme aweme;
                String str;
                String str2;
                C1ADO c1ado;
                C2175861ADo c2175861ADo;
                C1ACA c1acaZQ22;
                Aweme aweme2;
                Aweme aweme3;
                RoomFeedCellStruct roomFeedCellStruct;
                LiveRoomStruct newLiveRoomData;
                Aweme aweme4;
                RoomFeedCellStruct roomFeedCellStruct2;
                LiveRoomStruct newLiveRoomData2;
                C1ACA c1acaZQ23;
                LiveRoomStruct liveRoomStruct;
                C1ADO c1ado2;
                C2175861ADo c2175861ADo2;
                Aweme aweme5;
                C0X37 c0x37 = C0X37.FYP;
                EnumC586050Myh enumC586050Myh = EnumC586050Myh.Live;
                C1ACA c1acaZQ24 = this.LL.zQ2();
                if (c1acaZQ24 == null || (aweme5 = c1acaZQ24.LIZIZ) == null || (aid = aweme5.getAid()) == null) {
                    aid = "";
                }
                C0X35.LJIIZILJ(c0x37, enumC586050Myh, aid);
                C290340BZo.LIZ.getClass();
                long j = 0;
                int i = 0;
                if (((Boolean) C290340BZo.LIZIZ.getValue()).booleanValue() && C1150504el.LIZ().LJII) {
                    C202098145w c202098145wLIZ = C08TN.LIZ();
                    if (c202098145wLIZ.LJJLIIIJLJLI <= 0) {
                        c202098145wLIZ.LJJJJL(EnumC1609850rzj.FEED_TOTAL);
                        c202098145wLIZ.LJJLIIIJLJLI = SystemClock.elapsedRealtime();
                    }
                    C0X35.LJIIJJI("feed_ui_to_video", true);
                    C0X35.LJIIJJI("cold_boot_start_to_ui_to_video_end", true);
                    C1150504el.LIZ().LJI("feed_total", true);
                    C1150504el.LIZ().LJFF(SystemClock.elapsedRealtime() - C202094145s.LIZIZ, "feed_total_v2", false);
                    C1150504el.LIZ().LJIIJJI = 2;
                    C0C6E.LIZ();
                    C844300XAe.LIZ.getClass();
                    C202099145x c202099145xLIZ = C1150504el.LIZ();
                    C844470XAv.LIZ.getClass();
                    c202099145xLIZ.LJIJ = C844300XAe.LIZ(C844470XAv.LIZ());
                    C1150504el.LIZ().LJIIL();
                    C807430Vlt.LIZ("feed_total");
                }
                if (((Number) C0A5U.LIZ.getValue()).intValue() == 1) {
                    C20639086r.LJ(new ARunnableS109S0100000_9(this, 42));
                } else if (C0CMX.LIZ()) {
                    C1602200rnO.LIZ().LIZLLL(EnumC585000Mx0.FIRST_FEED_COMPLETED);
                }
                MutableLiveData<Unit> mutableLiveData = this.LL.LLILZ;
                Unit unit = Unit.LIZ;
                mutableLiveData.setValue(unit);
                C1ACA c1acaZQ25 = this.LL.zQ2();
                if ((c1acaZQ25 == null || (c2175861ADo2 = c1acaZQ25.LJIIIZ) == null || c2175861ADo2.LIZIZ) ? false : true) {
                    C1ACA c1acaZQ26 = this.LL.zQ2();
                    if (c1acaZQ26 != null && (c1ado2 = c1acaZQ26.LJIIJ) != null) {
                        c1ado2.LJ = System.currentTimeMillis();
                    }
                    this.LL.CQ2(true);
                    LivePreviewPlayerVM livePreviewPlayerVM = this.LL;
                    C1ACA c1acaZQ27 = livePreviewPlayerVM.zQ2();
                    if (c1acaZQ27 == null || !c1acaZQ27.LJII || ((c1acaZQ23 = livePreviewPlayerVM.zQ2()) != null && c1acaZQ23.LJIILIIL)) {
                        livePreviewPlayerVM.LJIILJJIL(true);
                    } else {
                        livePreviewPlayerVM.LJIILJJIL(false);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("first frame ");
                        C1ACA c1acaZQ28 = livePreviewPlayerVM.zQ2();
                        sbLIZ.append((c1acaZQ28 == null || (liveRoomStruct = c1acaZQ28.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.id));
                        livePreviewPlayerVM.LLJLLIL.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    livePreviewPlayerVM.KQ2();
                    this.LL.LLJLLIL.changeSRSupportScene(LivePreviewCardEnableSrSetting.INSTANCE.isEnable());
                    LivePreviewPlayerVM livePreviewPlayerVM2 = this.LL;
                    C1ACA c1acaZQ29 = livePreviewPlayerVM2.zQ2();
                    if (c1acaZQ29 != null && c1acaZQ29.LJIJJLI && (c1acaZQ22 = livePreviewPlayerVM2.zQ2()) != null && (aweme2 = c1acaZQ22.LIZIZ) != null && (aweme2.isAd() || AwemeExtKt.isPseudoAd(aweme2))) {
                        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "play", aweme2.getAwemeRawAd());
                        C1022820ciu c1022820ciuLJJIJIL = C1017070cZd.LJJIJIL(aweme2, "draw_ad", "play");
                        if (c1022820ciuLJJIJIL != null) {
                            c1022820ciuLIZLLL = c1022820ciuLJJIJIL;
                        }
                        C1ACA c1acaZQ210 = livePreviewPlayerVM2.zQ2();
                        c1022820ciuLIZLLL.LIZIZ((c1acaZQ210 == null || (aweme4 = c1acaZQ210.LIZIZ) == null || (roomFeedCellStruct2 = aweme4.getRoomFeedCellStruct()) == null || (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) == null) ? null : Long.valueOf(newLiveRoomData2.getAnchorId()).toString(), "anchor_id");
                        C1ACA c1acaZQ211 = livePreviewPlayerVM2.zQ2();
                        c1022820ciuLIZLLL.LIZIZ((c1acaZQ211 == null || (aweme3 = c1acaZQ211.LIZIZ) == null || (roomFeedCellStruct = aweme3.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null) ? null : Long.valueOf(newLiveRoomData.id).toString(), "room_id");
                        c1022820ciuLIZLLL.LJII();
                        C1ACA c1acaZQ212 = livePreviewPlayerVM2.zQ2();
                        if (c1acaZQ212 != null) {
                            c1acaZQ212.LJIJJLI = false;
                        }
                        C1ACA c1acaZQ213 = livePreviewPlayerVM2.zQ2();
                        if (c1acaZQ213 != null) {
                            c1acaZQ213.LJIL = true;
                        }
                    }
                    C1ACA c1acaZQ214 = this.LL.zQ2();
                    if (c1acaZQ214 != null && (c2175861ADo = c1acaZQ214.LJIIIZ) != null) {
                        c2175861ADo.LIZIZ = true;
                    }
                    LivePreviewPlayerVM livePreviewPlayerVM3 = this.LL;
                    C1ACA c1acaZQ215 = livePreviewPlayerVM3.zQ2();
                    if (c1acaZQ215 != null) {
                        c1acaZQ215.LJJJIL = livePreviewPlayerVM3.LLJLLIL.getCurrentResolution();
                    }
                    C291530Bbj.LIZ.getClass();
                    if (((Boolean) C291530Bbj.LIZIZ.getValue()).booleanValue() && (c1acaZQ2 = this.LL.zQ2()) != null && (aweme = c1acaZQ2.LIZIZ) != null) {
                        LivePreviewPlayerVM livePreviewPlayerVM4 = this.LL;
                        HashMap map = new HashMap();
                        C1ACA c1acaZQ216 = livePreviewPlayerVM4.zQ2();
                        if (c1acaZQ216 == null || (str = c1acaZQ216.LJ) == null) {
                            str = "";
                        }
                        map.put("enter_from", str);
                        C1ACA c1acaZQ217 = livePreviewPlayerVM4.zQ2();
                        if (c1acaZQ217 != null && (c1ado = c1acaZQ217.LJIIJ) != null) {
                            j = c1ado.LJ;
                        }
                        map.put("start_playing_timestamp", Long.valueOf(j));
                        MLCommonService.Companion.getClass();
                        C0NAL.LIZ.updateFeedItemFeatureInfo(aweme, map);
                        C1ACA c1acaZQ218 = livePreviewPlayerVM4.zQ2();
                        if (c1acaZQ218 != null && (str2 = c1acaZQ218.LJ) != null) {
                            C2183841AdS c2183841AdS = C584960Mww.LIZ;
                            c2183841AdS.getClass();
                            c2183841AdS.LIZJ(new C583510Mub(aweme, str2));
                        }
                    }
                }
                this.LL.LLILZIL.setValue(unit);
                C0ITW c0itw = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c0itw != null) {
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                    c0itw.LJFF = true;
                }
                VideoStateViewModel.LLIZ = true;
                ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
                if (iSpecActService != null) {
                    C1ACA c1acaZQ219 = this.LL.zQ2();
                    Aweme aweme6 = c1acaZQ219 != null ? c1acaZQ219.LIZIZ : null;
                    LivePreviewPlayerVM livePreviewPlayerVM5 = this.LL;
                    C1ACA c1acaZQ220 = livePreviewPlayerVM5.zQ2();
                    if (c1acaZQ220 == null || !TextUtils.equals(c1acaZQ220.LIZLLL, "homepage_follow")) {
                        C1ACA c1acaZQ221 = livePreviewPlayerVM5.zQ2();
                        if (c1acaZQ221 != null && TextUtils.equals(c1acaZQ221.LIZLLL, "homepage_live")) {
                            i = 100;
                        }
                    } else {
                        i = 1;
                    }
                    iSpecActService.LJJLIL(i, aweme6, null, "");
                }
                LiveNetworkCtlSetting liveNetworkCtlSetting = LiveNetworkCtlSetting.INSTANCE;
                if (liveNetworkCtlSetting.isEnable()) {
                    C486790J7d.LIZLLL(new Runnable() { // from class: X.0N7e
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LivePreviewPlayerVM@d8f0.playHelperListener$1$firstFrame$3");
                            try {
                                if (C588730N7f.LIZ) {
                                    C588730N7f.LIZ = false;
                                    C823050WQl.LIZJ().execute(RunnableC1206180hUe.LL);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LivePreviewPlayerVM@d8f0.playHelperListener$1$firstFrame$3");
                        }
                    }, null, liveNetworkCtlSetting.getDelayMs());
                }
            }

            @Override // X.InterfaceC2175541ACi
            /* JADX INFO: renamed from: if */
            public final void mo29if(String str) {
                Aweme aweme;
                AwemeRawAd awemeRawAd;
                String string;
                RoomFeedCellStruct roomFeedCellStruct;
                LiveRoomStruct newLiveRoomData;
                RoomFeedCellStruct roomFeedCellStruct2;
                LiveRoomStruct newLiveRoomData2;
                C1ACA c1acaZQ2 = this.LL.zQ2();
                if (c1acaZQ2 != null) {
                    Aweme aweme2 = c1acaZQ2.LIZIZ;
                    if ((aweme2 != null && aweme2.isAd()) || ((aweme = c1acaZQ2.LIZIZ) != null && AwemeExtKt.isPseudoAd(aweme))) {
                        Aweme aweme3 = c1acaZQ2.LIZIZ;
                        String string2 = null;
                        if (aweme3 != null) {
                            awemeRawAd = aweme3.getAwemeRawAd();
                        } else {
                            awemeRawAd = null;
                        }
                        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "over", awemeRawAd);
                        C1022820ciu c1022820ciuLJJIJIL = C1017070cZd.LJJIJIL(c1acaZQ2.LIZIZ, "draw_ad", "over");
                        if (c1022820ciuLJJIJIL != null) {
                            c1022820ciuLIZLLL = c1022820ciuLJJIJIL;
                        }
                        c1022820ciuLIZLLL.LIZJ(Long.valueOf(System.currentTimeMillis() - c1acaZQ2.LJIIJ.LIZ), "duration");
                        Aweme aweme4 = c1acaZQ2.LIZIZ;
                        if (aweme4 != null && (roomFeedCellStruct2 = aweme4.getRoomFeedCellStruct()) != null && (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) != null) {
                            string = Long.valueOf(newLiveRoomData2.getAnchorId()).toString();
                        } else {
                            string = null;
                        }
                        c1022820ciuLIZLLL.LIZIZ(string, "anchor_id");
                        Aweme aweme5 = c1acaZQ2.LIZIZ;
                        if (aweme5 != null && (roomFeedCellStruct = aweme5.getRoomFeedCellStruct()) != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                            string2 = Long.valueOf(newLiveRoomData.id).toString();
                        }
                        c1022820ciuLIZLLL.LIZIZ(string2, "room_id");
                        c1022820ciuLIZLLL.LJII();
                        c1acaZQ2.LJIL = false;
                    }
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void oc(C945320ahu c945320ahu) {
                if (c945320ahu != null) {
                    this.LL.GQ2(c945320ahu);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void oe(String str) {
                String aid;
                C1ACA c1acaZQ2 = this.LL.zQ2();
                if (c1acaZQ2 != null) {
                    C1510130pOt c1510130pOtLIZIZ = C1510150pOv.LIZIZ(c1acaZQ2.LIZIZ, c1acaZQ2.LJ);
                    c1510130pOtLIZIZ.LJ(c1acaZQ2.LIZLLL, "enter_from");
                    MLCommonService.Companion.getClass();
                    C0NAL.LIZ.onNotifyCommonEvent("live_play_prepare", c1510130pOtLIZIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("prepare play ");
                    Aweme aweme = c1acaZQ2.LIZIZ;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    sbLIZ.append(aid);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void sk(String str) {
                this.LL.GQ2(new C945320ahu(null, str));
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                int i;
                String str;
                this.LL.LL.setValue(new Pair<>(enumC1913550ztZ, obj));
                int i2 = C1891670zKH.LIZ[enumC1913550ztZ.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        String str2 = null;
                        Long lValueOf = null;
                        if (i2 != 3) {
                            if (i2 != 4 || !((LivePreviewLinkPerfSendSetting.PreviewLinkPerfSendConfig) LivePreviewLinkPerfSendSetting.LIZIZ.getValue()).isEnable) {
                                return;
                            }
                            try {
                                if ((obj instanceof String) && (str = (String) obj) != null) {
                                    i = CastIntegerProtector.parseInt(str);
                                } else {
                                    i = 0;
                                }
                                int i3 = 65535 & i;
                                int i4 = i >> 16;
                                C1ACA c1acaZQ2 = this.LL.zQ2();
                                if (c1acaZQ2 != null) {
                                    c1acaZQ2.LJJJI = i3 * i4;
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onVideoSizeChange: streamResolution = ");
                                C1ACA c1acaZQ22 = this.LL.zQ2();
                                if (c1acaZQ22 != null) {
                                    lValueOf = Long.valueOf(c1acaZQ22.LJJJI);
                                }
                                sbLIZ.append(lValueOf);
                                C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerVM", C2188811AlT.LIZIZ(sbLIZ));
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C20441214yg.LJFF("ttlive_preview_LivePreviewPlayerVM", "onVideoSizeChange: ", e);
                                return;
                            }
                        }
                        LivePreviewPlayerVM livePreviewPlayerVM = this.LL;
                        if (obj instanceof String) {
                            str2 = (String) obj;
                        }
                        livePreviewPlayerVM.LLJJI.LIZJ = new C2175721ADa(str2);
                        return;
                    }
                    C1ACA c1acaZQ23 = this.LL.zQ2();
                    if (c1acaZQ23 != null && c1acaZQ23.LJJIJIIJI > 0) {
                        c1acaZQ23.LJJJ += SystemClock.elapsedRealtime() - c1acaZQ23.LJJIJIIJI;
                        return;
                    }
                    return;
                }
                C1ACA c1acaZQ24 = this.LL.zQ2();
                if (c1acaZQ24 != null) {
                    c1acaZQ24.LJJIJ++;
                    if (c1acaZQ24.LJJIJIIJI == 0) {
                        c1acaZQ24.LJJIJIIJI = SystemClock.elapsedRealtime();
                    }
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void Th(int i, int i2, View view) {
                this.LL.LLILLJJLI.setValue(new C473250Ih9(i, i2));
            }
        };
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (c1acdGenerateLivePlayHelper = iLiveOuterService.generateLivePlayHelper(interfaceC2175541ACi, EnumC1913520ztW.NORMAL)) == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        this.LLJLLIL = c1acdGenerateLivePlayHelper;
    }

    public final String AQ2() {
        LiveRoomStruct liveRoomStruct;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomId=");
        C1ACA c1acaZQ2 = zQ2();
        sbLIZ.append((c1acaZQ2 == null || (liveRoomStruct = c1acaZQ2.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.id));
        sbLIZ.append(", hashCode=");
        sbLIZ.append(hashCode());
        sbLIZ.append(", isSelected=");
        C1ACA c1acaZQ22 = zQ2();
        sbLIZ.append(c1acaZQ22 != null ? Boolean.valueOf(c1acaZQ22.LJII) : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void DQ2() {
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        C1ACA c1acaZQ2 = zQ2();
        if (c1acaZQ2 == null || (liveRoomStruct = c1acaZQ2.LIZJ) == null) {
            return;
        }
        this.LLJLLIL.LJIILIIL(xQ2(false));
        C1ACD c1acd = this.LLJLLIL;
        C1ACY c1acy = C1ACY.LIZ;
        C1ACA c1acaZQ22 = zQ2();
        String aid = (c1acaZQ22 == null || (aweme = c1acaZQ22.LIZIZ) == null) ? null : aweme.getAid();
        c1acy.getClass();
        c1acd.LJ(liveRoomStruct, C1ACY.LJIIIZ(aid), zQ2());
    }

    public final void KQ2() {
        C1ADO c1ado;
        C1ADO c1ado2;
        C1ACA c1acaZQ2 = zQ2();
        if (c1acaZQ2 == null || !c1acaZQ2.LJII) {
            return;
        }
        C1ACA c1acaZQ22 = zQ2();
        long j = (c1acaZQ22 == null || (c1ado2 = c1acaZQ22.LJIIJ) == null) ? 0L : c1ado2.LJ;
        C1ACA c1acaZQ23 = zQ2();
        long j2 = (c1acaZQ23 == null || (c1ado = c1acaZQ23.LJIIJ) == null) ? 0L : c1ado.LIZ;
        if (j <= 0 || j2 <= 0) {
            return;
        }
        MQ2(new C1ADB() { // from class: X.1ADi
        });
    }

    public final void CQ2(boolean z) {
        C1ACA c1acaZQ2;
        JSONObject jSONObjectLJI;
        Object obj;
        HashMap map;
        String strOptString;
        String uid;
        Object objValueOf;
        String requestId;
        LiveRoomStruct liveRoomStruct;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiGuestLayoutInfo multiGuestLayoutInfo;
        Long first;
        Long lValueOf;
        Pair<Long, Boolean> pair;
        LiveRoomStruct liveRoomStruct2;
        MultiLiveUserSettings multiLiveUserSettings2;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        MultiGuestLayoutInfo multiGuestLayoutInfo2;
        User user;
        Aweme aweme;
        List<LiveRoomStatesTag> liveRoomStatesTags;
        C1ACA c1acaZQ22;
        Aweme aweme2;
        HashMap map2;
        int iIntValue;
        int iIntValue2;
        JSONObject jSONObjectLJI2;
        Object obj2;
        int iIntValue3;
        if ((z || this.LLJJIII) && (c1acaZQ2 = zQ2()) != null) {
            C1ADO c1ado = c1acaZQ2.LJIIJ;
            if (c1ado.LIZ > 0) {
                long j = c1ado.LJ;
                if (j > 0 && c1acaZQ2.LJII && c1acaZQ2.LIZIZ != null && c1acaZQ2.LIZJ != null) {
                    this.LLJJI.LJFF("first_frame", String.valueOf(j));
                    C1AC7 c1ac7 = C1AC7.LIZ;
                    C473100Igu c473100Igu = this.LLJJI;
                    c1ac7.getClass();
                    LiveRoomStruct liveRoomStruct3 = c1acaZQ2.LIZJ;
                    if (liveRoomStruct3 != null && liveRoomStruct3.isTopGifter) {
                        C0J89.LIZ.getClass();
                        Set<String> set = C0J89.LJIIJ;
                        if (!set.contains("livesdk_strategy_top_gifter_live_card_first_show")) {
                            set.add("livesdk_strategy_top_gifter_live_card_first_show");
                            long jLIZLLL = c473100Igu.LIZLLL();
                            long jLIZJ = c473100Igu.LIZJ();
                            C0J89.LIZ.getClass();
                            Map mapLIZ = C0J89.LIZ();
                            if (!mapLIZ.isEmpty()) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJII(mapLIZ);
                                c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                                c2344009Gk.LIZLLL(jLIZLLL, "duration");
                                c2344009Gk.LIZLLL(jLIZJ, "get_stream_duration");
                                C1AC7.LIZ(c2344009Gk, c1acaZQ2);
                                C20684815ws.LJIILLIIL("livesdk_strategy_top_gifter_live_card_first_show", c2344009Gk.LIZ);
                            }
                        }
                    }
                    String str = "1";
                    String str2 = "-1";
                    if (LiveStaticLogOptSetting.enable()) {
                        map = new HashMap();
                        String strLJJ = this.LLJLLIL.LJJ(307);
                        if (Intrinsics.LJFF(strLJJ, "bytevc1")) {
                            obj2 = "1";
                        } else if (!Intrinsics.LJFF(strLJJ, "h264")) {
                            obj2 = "-1";
                        } else {
                            obj2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        String strLJJ2 = this.LLJLLIL.LJJ(312);
                        if (!Intrinsics.LJFF(strLJJ2, "true")) {
                            if (!Intrinsics.LJFF(strLJJ2, "false")) {
                                str = "-1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                        }
                        String strLJJ3 = this.LLJLLIL.LJJ(303);
                        if (strLJJ3.length() == 0) {
                            strLJJ3 = "-1";
                        }
                        String strLJJ4 = this.LLJLLIL.LJJ(305);
                        if (strLJJ4.length() == 0) {
                            strLJJ4 = "-1";
                        }
                        Integer numLJIIJJI = C2095008Iq.LJIIJJI(this.LLJLLIL.LJJ(304));
                        if (numLJIIJJI != null) {
                            iIntValue3 = numLJIIJJI.intValue();
                        } else {
                            iIntValue3 = -1;
                        }
                        map.put("vquality", strLJJ3);
                        map.put("bitrate", String.valueOf(iIntValue3));
                        map.put("definition", strLJJ4);
                        map.put("is_hw", str);
                        map.put("is_bytevc1", obj2);
                        jSONObjectLJI = null;
                    } else {
                        jSONObjectLJI = this.LLJLLIL.LJI();
                        String strOptString2 = jSONObjectLJI.optString("Codec_Type:", "-1");
                        if (Intrinsics.LJFF(strOptString2, "bytevc1")) {
                            obj = "1";
                        } else if (!Intrinsics.LJFF(strOptString2, "h264")) {
                            obj = "-1";
                        } else {
                            obj = CardStruct.IStatusCode.DEFAULT;
                        }
                        String strOptString3 = jSONObjectLJI.optString("HardDecode:", "-1");
                        if (!Intrinsics.LJFF(strOptString3, "true")) {
                            if (!Intrinsics.LJFF(strOptString3, "false")) {
                                str = "-1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                        }
                        map = new HashMap();
                        String strOptString4 = jSONObjectLJI.optString("settings_res:", "-1");
                        strOptString4.toString();
                        map.put("vquality", strOptString4);
                        map.put("bitrate", String.valueOf(jSONObjectLJI.optInt("download_Speed:", -1)));
                        String strOptString5 = jSONObjectLJI.optString("width:", "-1");
                        strOptString5.toString();
                        map.put("definition", strOptString5);
                        map.put("is_hw", str);
                        map.put("is_bytevc1", obj);
                    }
                    C291530Bbj.LIZ.getClass();
                    if (((Boolean) C291530Bbj.LIZIZ.getValue()).booleanValue() && (c1acaZQ22 = zQ2()) != null && (aweme2 = c1acaZQ22.LIZIZ) != null) {
                        try {
                            map2 = new HashMap();
                            map2.put("first_frame_duration", Long.valueOf(this.LLJJI.LIZJ()));
                            long jLongValue = -1;
                            if (!LiveStaticLogOptSetting.enable()) {
                                if (jSONObjectLJI != null) {
                                    jSONObjectLJI2 = jSONObjectLJI;
                                } else {
                                    jSONObjectLJI2 = this.LLJLLIL.LJI();
                                }
                                map2.put("is_h265", Boolean.valueOf(TextUtils.equals("bytevc1", jSONObjectLJI2.optString("Codec_Type:", "-1"))));
                                map2.put("video_bitrate", Long.valueOf(jSONObjectLJI2.optLong("download_Speed:", -1L)));
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(jSONObjectLJI2.optInt("width:", -1));
                                sbLIZ.append('*');
                                sbLIZ.append(jSONObjectLJI2.optInt("height:", -1));
                                map2.put("video_resolution", C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                String strLJJ5 = this.LLJLLIL.LJJ(307);
                                if (strLJJ5 != null) {
                                    str2 = strLJJ5;
                                }
                                map2.put("is_h265", Boolean.valueOf(TextUtils.equals("bytevc1", str2)));
                                Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLJLLIL.LJJ(304));
                                if (lLJIILIIL != null) {
                                    jLongValue = lLJIILIIL.longValue();
                                }
                                map2.put("video_bitrate", Long.valueOf(jLongValue));
                                Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(this.LLJLLIL.LJJ(305));
                                if (numLJIIJJI2 != null) {
                                    iIntValue = numLJIIJJI2.intValue();
                                } else {
                                    iIntValue = -1;
                                }
                                Integer numLJIIJJI3 = C2095008Iq.LJIIJJI(this.LLJLLIL.LJJ(306));
                                if (numLJIIJJI3 != null) {
                                    iIntValue2 = numLJIIJJI3.intValue();
                                } else {
                                    iIntValue2 = -1;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(iIntValue);
                                sbLIZ2.append('*');
                                sbLIZ2.append(iIntValue2);
                                map2.put("video_resolution", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            map2.put("enter_from", c1acaZQ2.LJ);
                            MLCommonService.Companion.getClass();
                            C0NAL.LIZ.updateFeedItemFeatureInfo(aweme2, map2);
                        } catch (Exception e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1ACA c1acaZQ23 = zQ2();
                    if (c1acaZQ23 != null && (aweme = c1acaZQ23.LIZIZ) != null && (liveRoomStatesTags = aweme.getLiveRoomStatesTags()) != null) {
                        for (LiveRoomStatesTag liveRoomStatesTag : liveRoomStatesTags) {
                            linkedHashMap.put(liveRoomStatesTag.tagKey, liveRoomStatesTag.tagValue);
                        }
                    }
                    String str3 = "";
                    if (((Boolean) this.LLJLIL.getValue()).booleanValue()) {
                        if (jSONObjectLJI == null) {
                            if (LiveStaticLogOptSetting.enable()) {
                                strOptString = this.LLJLLIL.LJJ(308);
                            } else {
                                strOptString = this.LLJLLIL.LJI().optString("push_client_push_protocol:", "");
                            }
                        } else {
                            strOptString = jSONObjectLJI.optString("push_client_push_protocol:", "");
                        }
                    } else {
                        strOptString = this.LLJLLIL.LJI().optString("push_client_push_protocol:", "");
                    }
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("scene_id", "1007");
                    c2344009Gk2.LJII(linkedHashMap);
                    c2344009Gk2.LJIIIIZZ("enter_from_merge", c1acaZQ2.LIZLLL);
                    c2344009Gk2.LJIIIIZZ("action_type", "click");
                    LiveRoomStruct liveRoomStruct4 = c1acaZQ2.LIZJ;
                    if (liveRoomStruct4 != null && (user = liveRoomStruct4.owner) != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    c2344009Gk2.LJIIIIZZ("anchor_id", uid);
                    LiveRoomStruct liveRoomStruct5 = c1acaZQ2.LIZJ;
                    if (liveRoomStruct5 != null) {
                        objValueOf = Long.valueOf(liveRoomStruct5.id);
                    } else {
                        objValueOf = null;
                    }
                    c2344009Gk2.LJ(objValueOf, "room_id");
                    Aweme aweme3 = c1acaZQ2.LIZIZ;
                    if (aweme3 != null) {
                        requestId = aweme3.getRequestId();
                    } else {
                        requestId = null;
                    }
                    c2344009Gk2.LJIIIIZZ("request_id", requestId);
                    c2344009Gk2.LJIIIIZZ("enter_method", "live_cell");
                    C1386210mB1.LIZ.getClass();
                    c2344009Gk2.LJIIIIZZ("notice_type", C1386210mB1.LIZIZ);
                    c2344009Gk2.LJIIIIZZ("show_cnt", String.valueOf(0));
                    c2344009Gk2.LJIIIIZZ("yellow_dot_logid", C1386210mB1.LIZJ);
                    c2344009Gk2.LIZLLL(this.LLJJI.LIZJ(), "duration");
                    c2344009Gk2.LJII(this.LLJJI.LIZIZ);
                    c2344009Gk2.LJIIIIZZ("live_play_session_id", c1acaZQ2.LJJJJ);
                    String str4 = c1acaZQ2.LJJJJI;
                    if (str4 == null) {
                        str4 = "";
                    }
                    c2344009Gk2.LJIIIIZZ("live_session_id", str4);
                    c2344009Gk2.LJI(map);
                    if (strOptString != null) {
                        str3 = strOptString;
                    }
                    c2344009Gk2.LJIIIIZZ("push_client_push_protocol", str3);
                    c2344009Gk2.LIZJ(c1acaZQ2.LJIIIIZZ, "room_position");
                    LiveSdkMultiGuestAddPreviewCommonParamsSetting liveSdkMultiGuestAddPreviewCommonParamsSetting = LiveSdkMultiGuestAddPreviewCommonParamsSetting.INSTANCE;
                    if (liveSdkMultiGuestAddPreviewCommonParamsSetting.isEnable() && (liveRoomStruct2 = c1acaZQ2.LIZJ) != null && (multiLiveUserSettings2 = liveRoomStruct2.multiLiveUserSettings) != null && (multiLiveUserApplySettings2 = multiLiveUserSettings2.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo2 = multiLiveUserApplySettings2.multiGuestLayoutInfo) != null && multiGuestLayoutInfo2.multiLayoutChanged == 1) {
                        vQ2(c2344009Gk2, c1acaZQ2);
                    }
                    C1AC7.LIZ.getClass();
                    c2344009Gk2.LJII(C1AC7.LIZLLL(c1acaZQ2));
                    if (LiveSdkEnableFeedLiveTrackAddMultiParamsSetting.INSTANCE.isEnable() && (liveRoomStruct = c1acaZQ2.LIZJ) != null && (multiLiveUserSettings = liveRoomStruct.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo = multiLiveUserApplySettings.multiGuestLayoutInfo) != null && multiGuestLayoutInfo.multiLayoutChanged == 1) {
                        if (!liveSdkMultiGuestAddPreviewCommonParamsSetting.isEnable()) {
                            vQ2(c2344009Gk2, c1acaZQ2);
                        }
                        if (c1acaZQ2.LJJLIIIJJI && !LiveSdkMultiGuestMockSeiNotReceiveSetting.INSTANCE.isEnable()) {
                            c2344009Gk2.LIZJ(c1acaZQ2.LJJLIIIJL, "guest_cnt");
                            c2344009Gk2.LJFF("multi_layout_key", c1acaZQ2.LJJLIIIJLJLI);
                            return;
                        }
                        Pair<Long, Boolean> pair2 = c1acaZQ2.LJJLIIIJJIZ;
                        if (pair2 != null) {
                            first = pair2.getFirst();
                        } else {
                            first = null;
                        }
                        if (liveRoomStruct != null) {
                            lValueOf = Long.valueOf(liveRoomStruct.id);
                        } else {
                            lValueOf = null;
                        }
                        if (Intrinsics.LJFF(first, lValueOf) && (pair = c1acaZQ2.LJJLIIIJJIZ) != null && pair.getSecond().booleanValue()) {
                            c2344009Gk2.LIZJ(c1acaZQ2.LJJLIIIJL, "guest_cnt");
                            c2344009Gk2.LJFF("multi_layout_key", c1acaZQ2.LJJLIIIJLJLI);
                            EQ2(c2344009Gk2);
                            return;
                        } else {
                            if (liveRoomStruct == null) {
                                return;
                            }
                            long j2 = liveRoomStruct.id;
                            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Wd1(j2, new C1A69(c1acaZQ2, j2, c2344009Gk2, this), new AwS434S0200000_33(c2344009Gk2, this, 0));
                            return;
                        }
                    }
                    EQ2(c2344009Gk2);
                }
            }
        }
    }

    public final void EQ2(C2344009Gk c2344009Gk) {
        Map<String, String> map = c2344009Gk.LIZ;
        C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerVM", map.toString());
        this.LLJJI.LJ();
        C20684815ws.LJIILLIIL("livesdk_enter_window_from_draw_duration", map);
    }

    public final void GQ2(C945320ahu c945320ahu) {
        LinkMicSei linkMicSei;
        int i;
        SeiDsl seiDsl;
        String str;
        C1ACA c1acaZQ2;
        String str2;
        String str3;
        Map<String, String> map;
        String str4;
        int iIntValue;
        C1ACA c1acaZQ22;
        C1A7N c1a7n;
        LiveRoomStruct liveRoomStruct;
        C0ITW c0itw;
        LiveRoomStruct liveRoomStruct2;
        LiveMode streamType;
        String strOptString;
        String str5;
        Map<String, Map<String, String>> map2;
        Map<String, String> map3;
        String strOptString2;
        String str6;
        LiveRoomStruct liveRoomStruct3;
        Map<String, Map<String, String>> map4;
        Map<String, String> map5;
        LiveBoardsSeiData liveBoardsSeiData;
        String str7;
        String uid;
        Long lValueOf;
        LiveRoomStruct liveRoomStruct4;
        LiveRoomStruct liveRoomStruct5;
        User user;
        String uid2;
        Long lValueOf2;
        String str8;
        String requestId;
        int i2;
        LiveRoomStruct liveRoomStruct6;
        SMBInfo sMBInfo;
        Aweme aweme;
        LiveRoomStruct liveRoomStruct7;
        LiveRoomStruct liveRoomStruct8;
        User user2;
        String uid3;
        Long lValueOf3;
        LiveRoomStruct liveRoomStruct9;
        LiveRoomStruct liveRoomStruct10;
        User user3;
        if (LiveBoardsAudienceReportSettings.enable()) {
            LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
            if (liveSeiStruct != null) {
                liveBoardsSeiData = liveSeiStruct.liveBoardsSeiData;
            } else {
                liveBoardsSeiData = null;
            }
            if (zQ2() != null && liveBoardsSeiData != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(liveBoardsSeiData.boardId);
                sbLIZ.append(liveBoardsSeiData.timestamp);
                if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), this.LLJL)) {
                    NextLiveData nextLiveData = this.LLJJIJIL;
                    String str9 = liveBoardsSeiData.boardId;
                    String str10 = CardStruct.IStatusCode.DEFAULT;
                    if (str9 == null) {
                        str9 = CardStruct.IStatusCode.DEFAULT;
                    }
                    nextLiveData.setValue(str9);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("sei=");
                    sbLIZ2.append(this.LLJJIJIL.hashCode());
                    sbLIZ2.append(". pcsDecorationSei.value = ");
                    String str11 = liveBoardsSeiData.boardId;
                    if (str11 != null) {
                        str10 = str11;
                    }
                    sbLIZ2.append(str10);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(liveBoardsSeiData.boardId);
                    sbLIZ3.append(liveBoardsSeiData.timestamp);
                    this.LLJL = C2188811AlT.LIZIZ(sbLIZ3);
                    if (Intrinsics.LJFF(liveBoardsSeiData.bizType, "queue")) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("user_type", "user");
                        c2344009Gk.LJIIIIZZ("queue_id", liveBoardsSeiData.boardId);
                        C1ACA c1acaZQ23 = zQ2();
                        if (c1acaZQ23 != null && (liveRoomStruct10 = c1acaZQ23.LIZJ) != null && (user3 = liveRoomStruct10.owner) != null) {
                            uid3 = user3.getUid();
                        } else {
                            uid3 = null;
                        }
                        c2344009Gk.LJIIIIZZ("anchor_id", uid3);
                        C1ACA c1acaZQ24 = zQ2();
                        if (c1acaZQ24 != null && (liveRoomStruct9 = c1acaZQ24.LIZJ) != null) {
                            lValueOf3 = Long.valueOf(liveRoomStruct9.id);
                        } else {
                            lValueOf3 = null;
                        }
                        c2344009Gk.LJ(lValueOf3, "room_id");
                        c2344009Gk.LJIIIIZZ("queue_user_type", liveBoardsSeiData.queueUserType);
                        c2344009Gk.LJIIIIZZ("queue_viewers_cnt", liveBoardsSeiData.queueViewersCnt);
                        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                        Map<String, String> map6 = c2344009Gk.LIZ;
                        this.LLJJI.LJ();
                        C20684815ws.LJIILLIIL("livesdk_queue_board_show", map6);
                    } else if (TextUtils.equals(liveBoardsSeiData.boardType, "rich_text_decoration")) {
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                        C1ACA c1acaZQ25 = zQ2();
                        if (c1acaZQ25 != null && (liveRoomStruct8 = c1acaZQ25.LIZJ) != null && (user2 = liveRoomStruct8.owner) != null) {
                            uid2 = user2.getUid();
                        } else {
                            uid2 = null;
                        }
                        c2344009Gk2.LJIIIIZZ("anchor_id", uid2);
                        C1ACA c1acaZQ26 = zQ2();
                        if (c1acaZQ26 != null && (liveRoomStruct7 = c1acaZQ26.LIZJ) != null) {
                            lValueOf2 = Long.valueOf(liveRoomStruct7.id);
                        } else {
                            lValueOf2 = null;
                        }
                        c2344009Gk2.LJ(lValueOf2, "room_id");
                        c2344009Gk2.LJIIIIZZ("decoration_set_id", liveBoardsSeiData.boardId);
                        c2344009Gk2.LJIIIIZZ("board_source", liveBoardsSeiData.boardSource);
                        c2344009Gk2.LJIIIIZZ("rec_template_id", liveBoardsSeiData.recTemplateId);
                        C1ACA c1acaZQ27 = zQ2();
                        if (c1acaZQ27 != null) {
                            str8 = c1acaZQ27.LIZLLL;
                        } else {
                            str8 = null;
                        }
                        c2344009Gk2.LJIIIIZZ("enter_from_merge", str8);
                        c2344009Gk2.LJIIIIZZ("enter_method", "live_cell");
                        C1ACA c1acaZQ28 = zQ2();
                        if (c1acaZQ28 != null && (aweme = c1acaZQ28.LIZIZ) != null) {
                            requestId = aweme.getRequestId();
                        } else {
                            requestId = null;
                        }
                        c2344009Gk2.LJIIIIZZ("request_id", requestId);
                        c2344009Gk2.LJIIIIZZ("action_type", "click");
                        c2344009Gk2.LJIIIIZZ("live_window_mode", "preview_card");
                        C1ACA c1acaZQ29 = zQ2();
                        if (c1acaZQ29 != null && (liveRoomStruct6 = c1acaZQ29.LIZJ) != null && (sMBInfo = liveRoomStruct6.smbInfo) != null && sMBInfo.optInStatus == 1 && sMBInfo.activeSkuCount > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        c2344009Gk2.LIZJ(i2, "is_smb_creator");
                        c2344009Gk2.LJIIIIZZ("in_room_ai_summary_board_content", liveBoardsSeiData.aiSummaryContent);
                        C20684815ws.LJIILLIIL("livesdk_decoration_set_show", c2344009Gk2.LIZ);
                    } else {
                        C2344009Gk c2344009Gk3 = new C2344009Gk();
                        c2344009Gk3.LJIIIIZZ("board_set_id", liveBoardsSeiData.boardId);
                        c2344009Gk3.LJIIIIZZ("board_type", liveBoardsSeiData.boardType);
                        c2344009Gk3.LJIIIIZZ("board_source", liveBoardsSeiData.boardSource);
                        C1ACA c1acaZQ210 = zQ2();
                        if (c1acaZQ210 != null) {
                            str7 = c1acaZQ210.LIZLLL;
                        } else {
                            str7 = null;
                        }
                        c2344009Gk3.LJIIIIZZ("enter_from_merge", str7);
                        C1ACA c1acaZQ211 = zQ2();
                        if (c1acaZQ211 != null && (liveRoomStruct5 = c1acaZQ211.LIZJ) != null && (user = liveRoomStruct5.owner) != null) {
                            uid = user.getUid();
                        } else {
                            uid = null;
                        }
                        c2344009Gk3.LJIIIIZZ("anchor_id", uid);
                        C1ACA c1acaZQ212 = zQ2();
                        if (c1acaZQ212 != null && (liveRoomStruct4 = c1acaZQ212.LIZJ) != null) {
                            lValueOf = Long.valueOf(liveRoomStruct4.id);
                        } else {
                            lValueOf = null;
                        }
                        c2344009Gk3.LJ(lValueOf, "room_id");
                        c2344009Gk3.LJIIIIZZ("enter_method", "live_cell");
                        c2344009Gk3.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                        c2344009Gk3.LJIIIIZZ("in_room_ai_summary_board_content", liveBoardsSeiData.aiSummaryContent);
                        Map<String, String> map7 = c2344009Gk3.LIZ;
                        this.LLJJI.LJ();
                        C20684815ws.LJIILLIIL("livesdk_audience_board_set_show", map7);
                    }
                }
            }
        }
        MutableLiveData<String> mutableLiveData = this.LLIZLLLIL;
        String str12 = c945320ahu.LIZIZ;
        String str13 = "";
        if (str12 == null) {
            str12 = "";
        }
        mutableLiveData.setValue(str12);
        SeiAppData seiAppDataLJII = C969340bKe.LJII(c945320ahu);
        try {
            linkMicSei = (LinkMicSei) C19748512Ol.LIZIZ.LJII(c945320ahu.LIZIZ, LinkMicSei.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            linkMicSei = null;
        }
        if (!this.LLJJJJJIL) {
            LiveSeiStruct liveSeiStruct2 = c945320ahu.LIZ;
            if (liveSeiStruct2 != null) {
                strOptString2 = liveSeiStruct2.subOnlyLive;
                if (strOptString2 == null) {
                    strOptString2 = "";
                }
            } else {
                String str14 = c945320ahu.LIZIZ;
                if (str14 == null) {
                    str14 = "";
                }
                strOptString2 = new JSONObject(str14).optString("sub_only_live");
            }
            if (seiAppDataLJII != null && (map4 = seiAppDataLJII.businessExtraInfo) != null && (map5 = map4.get("sub_only_live")) != null) {
                str6 = map5.get("sub_only_live");
            } else {
                str6 = null;
            }
            boolean zLIZJ = C2093608Ic.LIZJ(String.valueOf(str6), "1");
            if (C2093608Ic.LIZJ(strOptString2, "1") || zLIZJ) {
                C1ACA c1acaZQ213 = zQ2();
                if (c1acaZQ213 != null && (liveRoomStruct3 = c1acaZQ213.LIZJ) != null) {
                    liveRoomStruct3.liveSubOnly = 1L;
                }
                this.LLJJJJJIL = true;
                if (LiveFansClubSuperFanFeedPreviewUseLocalTextSettings.INSTANCE.getValue()) {
                    this.LLJJIJIIJIL.setValue(Boolean.TRUE);
                }
                wQ2(null, false);
            }
        }
        if (this.LLJJJJLIIL == C1ABV.SHOW && !this.LLJJL) {
            LiveSeiStruct liveSeiStruct3 = c945320ahu.LIZ;
            if (liveSeiStruct3 != null) {
                strOptString = liveSeiStruct3.closePreview;
                if (strOptString == null) {
                    strOptString = "";
                }
            } else {
                String str15 = c945320ahu.LIZIZ;
                if (str15 == null) {
                    str15 = "";
                }
                strOptString = new JSONObject(str15).optString("close_preview");
            }
            if (seiAppDataLJII != null && (map2 = seiAppDataLJII.businessExtraInfo) != null && (map3 = map2.get("close_preview")) != null) {
                str5 = map3.get("close_preview");
            } else {
                str5 = null;
            }
            boolean zLIZJ2 = C2093608Ic.LIZJ(String.valueOf(str5), "1");
            if (C2093608Ic.LIZJ(strOptString, "1") || zLIZJ2) {
                this.LLJJL = true;
                this.LLILZLL.setValue(new C0K9R(false, false));
            }
        }
        String str16 = c945320ahu.LIZIZ;
        if (str16 != null && (c0itw = this.LLJJLIIIJLLLLLLLZ) != null) {
            try {
                C468980IaG c468980IaG = C0ITW.LJI;
                C1ACA c1acaZQ214 = zQ2();
                if (c1acaZQ214 != null) {
                    liveRoomStruct2 = c1acaZQ214.LIZJ;
                } else {
                    liveRoomStruct2 = null;
                }
                c468980IaG.getClass();
                if (liveRoomStruct2 != null && (streamType = RoomStruct.getStreamType(liveRoomStruct2)) != null && TtliveGameEnableIntelligentRotationSetting.INSTANCE.isEnable() && streamType == LiveMode.SCREEN_RECORD) {
                    c0itw.LIZJ(new JSONObject(str16), this.LLILLJJLI, streamType, zQ2());
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (LivesdkEnterExitRoomSeiSwitchSetting.INSTANCE.getValue() && seiAppDataLJII == null && linkMicSei != null && linkMicSei.infos != null) {
            return;
        }
        String str17 = c945320ahu.LIZIZ;
        if (str17 != null && a0.LJJIIZI(str17, "app_data", false) && ((c1acaZQ22 = zQ2()) == null || (liveRoomStruct = c1acaZQ22.LIZJ) == null || liveRoomStruct.liveRoomMode != 6)) {
            C1ACA c1acaZQ215 = zQ2();
            if (c1acaZQ215 != null && (c1a7n = c1acaZQ215.LJLILLLLZI) != null) {
                c1a7n.LIZ = c945320ahu.LIZIZ;
            }
            DataChannel dataChannel = getDataChannel();
            if (dataChannel != null) {
                dataChannel.SX0(C2276281E7u.class, new C1155820gBQ(c945320ahu, System.currentTimeMillis()));
            }
        }
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null) {
            dataChannel2.SX0(C1082950eHt.class, c945320ahu);
        }
        if (seiAppDataLJII != null) {
            String str18 = seiAppDataLJII.anchorLinkMicId;
            if (str18 != null && str18.length() != 0) {
                SeiDsl seiDsl2 = seiAppDataLJII.dsl;
                if (seiDsl2 == null || (str2 = seiDsl2.layoutId) == null) {
                    str2 = "";
                }
                SeiContainerInfo seiContainerInfo = seiAppDataLJII.linkMicContainer;
                if (seiContainerInfo == null || (str3 = seiContainerInfo.layoutKey) == null) {
                    str3 = "";
                }
                LinkMicRtcRatioOptimize linkMicRtcRatioOptimize = LinkMicRtcRatioOptimize.INSTANCE;
                if (!Intrinsics.LJFF(linkMicRtcRatioOptimize.getCacheAnchorLinkMicId(), str18) || !Intrinsics.LJFF(linkMicRtcRatioOptimize.getCacheLayoutKey(), str3) || !Intrinsics.LJFF(linkMicRtcRatioOptimize.getCacheLayoutId(), str2)) {
                    try {
                        linkMicRtcRatioOptimize.setValueFromSEI(0);
                        Map<String, Map<String, String>> map8 = seiAppDataLJII.businessExtraInfo;
                        if (map8 != null && (map = map8.get("canvasRatioOpt")) != null && (str4 = map.get("value")) != null) {
                            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str4);
                            if (numLJIIJJI != null) {
                                iIntValue = numLJIIJJI.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            linkMicRtcRatioOptimize.setValueFromSEI(iIntValue);
                        }
                        linkMicRtcRatioOptimize.setCacheAnchorLinkMicId(str18);
                        linkMicRtcRatioOptimize.setCacheLayoutId(str2);
                        linkMicRtcRatioOptimize.setCacheLayoutKey(str3);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C20441214yg.LJ("LinkmicRtcRatioOptimizeHelper", e3.toString());
                    }
                }
            }
            if (!C086I.LIZIZ(seiAppDataLJII.grids)) {
                LQ2(true);
                C19487111Lx c19487111Lx = this.LLJLILLLLZIIL;
                if (c19487111Lx != null) {
                    c19487111Lx.dispose();
                }
                this.LLJLILLLLZIIL = null;
                List<SeiRegion> list = seiAppDataLJII.grids;
                if (list != null) {
                    Iterator<SeiRegion> it2 = list.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (!C2093608Ic.LJ(it2.next().uidStr) && (i = i + 1) >= 2 && (c1acaZQ2 = zQ2()) != null) {
                            c1acaZQ2.LJIIZILJ = true;
                        }
                    }
                } else {
                    i = 0;
                }
                if (MultiGuestEnableFeedFullLinkTrackAddMultiParamsSetting.INSTANCE.isEnable() && (seiDsl = seiAppDataLJII.dsl) != null && seiDsl.scene == 4) {
                    C1ACA c1acaZQ216 = zQ2();
                    if (c1acaZQ216 != null) {
                        c1acaZQ216.LJJLIIIJJI = true;
                    }
                    C1ACA c1acaZQ217 = zQ2();
                    if (c1acaZQ217 != null) {
                        c1acaZQ217.LJJLIIIJL = i - 1;
                    }
                    C1ACA c1acaZQ218 = zQ2();
                    if (c1acaZQ218 != null) {
                        SeiContainerInfo seiContainerInfo2 = seiAppDataLJII.linkMicContainer;
                        if (seiContainerInfo2 != null && (str = seiContainerInfo2.layoutKey) != null) {
                            str13 = str;
                        }
                        c1acaZQ218.LJJLIIIJLJLI = str13;
                        return;
                    }
                    return;
                }
                return;
            }
            LQ2(false);
            return;
        }
        if (MultiGuestV3VideoSeiEndSetting.INSTANCE.enableVideoSeiEndLayout() && C969340bKe.LJI(c945320ahu)) {
            LQ2(false);
            return;
        }
        C19487111Lx c19487111Lx2 = this.LLJLILLLLZIIL;
        if (c19487111Lx2 != null && !C500260Jjc.LJJJI(Boolean.valueOf(c19487111Lx2.isDisposed()))) {
            return;
        }
        this.LLJLILLLLZIIL = (C19487111Lx) new C11IW(C11NZ.LJLJJLL(LinkMicSeiFormatErrIntervalSetting.INSTANCE.getValue(), TimeUnit.MILLISECONDS).LJJIIJZLJL(new C2189721Amw(this, 0))).LJIILL().LJIIZILJ();
    }

    public final void HQ2(int i) {
        C2175491ACd c2175491ACdLJJJJLI = this.LLJLLIL.LJJJJLI();
        if (c2175491ACdLJJJJLI != null) {
            C2175491ACd.LJ(c2175491ACdLJJJJLI, i);
        }
    }

    public final void JQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopWithStreamData Reason: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(AQ2());
        C20441214yg.LJIIIZ("ttlive_preview_LivePreviewPlayerVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLLIL.LIZIZ();
        this.LLJJIII = false;
    }

    public final void LJIILJJIL(boolean z) {
        this.LLJLLIL.LJIILJJIL(z);
    }

    public final void LQ2(boolean z) {
        if (!Intrinsics.LJFF(this.LLJ.getValue(), Boolean.valueOf(z))) {
            this.LLJ.setValue(Boolean.valueOf(z));
        }
    }

    public final void MQ2(C1ADB c1adb) {
        this.LLJJI.LIZJ = c1adb;
    }

    public final C1699360uK6 xQ2(boolean z) {
        String str;
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZQ2 = zQ2();
        if (c1acaZQ2 != null) {
            str = c1acaZQ2.LIZLLL;
        } else {
            str = null;
        }
        C1699360uK6 c1699360uK6 = new C1699360uK6(str, "live_cell", "", null, z, true, 32);
        C1ACA c1acaZQ22 = zQ2();
        if (c1acaZQ22 != null && (liveRoomStruct = c1acaZQ22.LIZJ) != null && C1ABT.LJII(liveRoomStruct)) {
            c1699360uK6.LJFF = "ecom";
        }
        return c1699360uK6;
    }

    public static void vQ2(C2344009Gk c2344009Gk, C1ACA c1aca) {
        long j;
        String str;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiGuestLayoutInfo multiGuestLayoutInfo;
        MultiLiveUserSettings multiLiveUserSettings2;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        MultiGuestLayoutInfo multiGuestLayoutInfo2;
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        if (liveRoomStruct != null && (multiLiveUserSettings2 = liveRoomStruct.multiLiveUserSettings) != null && (multiLiveUserApplySettings2 = multiLiveUserSettings2.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo2 = multiLiveUserApplySettings2.multiGuestLayoutInfo) != null) {
            j = multiGuestLayoutInfo2.guestCnt;
        } else {
            j = 0;
        }
        c1aca.LJJLIIIJLLLLLLLZ = (int) j;
        if (liveRoomStruct == null || (multiLiveUserSettings = liveRoomStruct.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiGuestLayoutInfo = multiLiveUserApplySettings.multiGuestLayoutInfo) == null || (str = multiGuestLayoutInfo.multiLayoutKey) == null) {
            str = "";
        }
        c1aca.LJJLIIJ = str;
        c2344009Gk.LIZJ(1, "has_multi_track_data");
        c2344009Gk.LIZJ(c1aca.LJJLIIIJLLLLLLLZ, "guest_cnt_pre");
        c2344009Gk.LJFF("multi_layout_key_pre", c1aca.LJJLIIJ);
    }

    public final void FQ2(C1ACS c1acs, long j) {
        LiveRoomStruct liveRoomStruct;
        String str;
        String streamData;
        String str2;
        long bitrate;
        C1699430uKD playerThreadBlockStatus;
        boolean z;
        String streamData2;
        String str3;
        long bitrate2;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiGuestLayoutInfo multiGuestLayoutInfo;
        Pair<Long, Boolean> pair;
        MultiLiveUserSettings multiLiveUserSettings2;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        MultiGuestLayoutInfo multiGuestLayoutInfo2;
        Map<String, String> mapLIZIZ;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        StreamUrlStruct streamUrlStruct;
        LiveCoreSDKData liveCoreSDKData2;
        LiveCoreSDKData.PullData pullData2;
        StreamUrlStruct streamUrlStruct2;
        LiveCoreSDKData liveCoreSDKData3;
        LiveCoreSDKData.PullData pullData3;
        LiveCoreSDKData.Options options;
        LiveCoreSDKData.Quality defaultQuality;
        C1ACA c1acaZQ2;
        Aweme aweme;
        long jLongValue;
        String str4;
        C1ACA c1acaZQ22;
        String str5;
        boolean zLJI = MethodIDManager.LJI(137781);
        C291530Bbj.LIZ.getClass();
        if (((Boolean) C291530Bbj.LIZIZ.getValue()).booleanValue() && (c1acaZQ2 = zQ2()) != null && (aweme = c1acaZQ2.LIZIZ) != null) {
            try {
                HashMap map = new HashMap();
                long jLongValue2 = -1;
                if (!LiveStaticLogOptSetting.enable()) {
                    JSONObject jSONObjectLJI = this.LLJLLIL.LJI();
                    map.put("block_count", Long.valueOf(jSONObjectLJI.optLong("Stall_Total_Count:", -1L)));
                    map.put("block_duration", Long.valueOf(jSONObjectLJI.optLong("Stall_Total_Time:", -1L)));
                } else {
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLJLLIL.LJJ(301));
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = -1;
                    }
                    map.put("block_count", Long.valueOf(jLongValue));
                    Long lLJIILIIL2 = C2095008Iq.LJIILIIL(this.LLJLLIL.LJJ(302));
                    if (lLJIILIIL2 != null) {
                        jLongValue2 = lLJIILIIL2.longValue();
                    }
                    map.put("block_duration", Long.valueOf(jLongValue2));
                }
                C1ACA c1acaZQ23 = zQ2();
                if (c1acaZQ23 == null || (str4 = c1acaZQ23.LJ) == null) {
                    str4 = "";
                }
                map.put("enter_from", str4);
                MLCommonService.Companion.getClass();
                C0NAL.LIZ.updateFeedItemFeatureInfo(aweme, map);
                if (C300960Bqw.LIZ() && (c1acaZQ22 = zQ2()) != null && (str5 = c1acaZQ22.LJ) != null) {
                    C2183841AdS c2183841AdS = C584960Mww.LIZ;
                    c2183841AdS.getClass();
                    c2183841AdS.LIZJ(new C583460MuW(aweme, str5));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1AC8 c1ac8 = C1AC8.LIZ;
        C1ACA c1acaZQ24 = zQ2();
        C473100Igu c473100Igu = this.LLJJI;
        C1ACD c1acd = this.LLJLLIL;
        c1ac8.getClass();
        long j2 = 0;
        if (c1acaZQ24 != null) {
            Aweme aweme2 = c1acaZQ24.LIZIZ;
            LiveRoomStruct liveRoomStruct2 = c1acaZQ24.LIZJ;
            if (c1acaZQ24.LJIIJ.LIZ > 0 && aweme2 != null && liveRoomStruct2 != null) {
                long j3 = c1acaZQ24.LJJIJIIJI;
                long jElapsedRealtime = c1acaZQ24.LJJJ;
                if (j3 > 0) {
                    jElapsedRealtime += SystemClock.elapsedRealtime() - j3;
                }
                LiveRoomStruct liveRoomStruct3 = c1acaZQ24.LIZJ;
                if (liveRoomStruct3 == null || (streamUrlStruct2 = liveRoomStruct3.stream_url) == null || (liveCoreSDKData3 = streamUrlStruct2.liveCoreSDKData) == null || (pullData3 = liveCoreSDKData3.getPullData()) == null || (options = pullData3.getOptions()) == null || (defaultQuality = options.getDefaultQuality()) == null || (str = defaultQuality.sdkKey) == null) {
                    str = "";
                }
                LiveRoomStruct liveRoomStruct4 = c1acaZQ24.LIZJ;
                if (liveRoomStruct4 != null && (streamUrlStruct = liveRoomStruct4.stream_url) != null && (liveCoreSDKData2 = streamUrlStruct.liveCoreSDKData) != null && (pullData2 = liveCoreSDKData2.getPullData()) != null) {
                    streamData = pullData2.getStreamData();
                } else {
                    streamData = null;
                }
                String str6 = "1";
                if (LiveSlowMethodOpt.INSTANCE.enable()) {
                    int i = c1acaZQ24.LJJIJ;
                    String str7 = c1acaZQ24.LJJJIL;
                    if (RoomStruct.getStreamType(liveRoomStruct2) != LiveMode.LIVE_STUDIO && RoomStruct.getStreamType(liveRoomStruct2) != LiveMode.SCREEN_RECORD && RoomStruct.getStreamType(liveRoomStruct2) != LiveMode.THIRD_PARTY) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (liveRoomStruct2.multiStreamScene == 1 && liveRoomStruct2.multiStreamUrl != null) {
                            StreamUrlStruct streamUrlStruct3 = liveRoomStruct2.multiStreamUrl;
                            if (streamUrlStruct3 != null && (liveCoreSDKData = streamUrlStruct3.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null) {
                                streamData2 = pullData.getStreamData();
                            } else {
                                streamData2 = null;
                            }
                        } else {
                            streamData2 = streamData;
                        }
                    } else {
                        streamData2 = null;
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C1AC8.LIZIZ(c2344009Gk, c1acaZQ24, j);
                    C1AC8.LJIIIIZZ(c2344009Gk, c1acaZQ24, c473100Igu, c1acs, c1acaZQ24);
                    C1AC8.LJIIIZ(c2344009Gk, c1acaZQ24);
                    C1AC8.LJ(c2344009Gk, c1acaZQ24);
                    C1AC8.LJII(c2344009Gk, c1acaZQ24.LJJJZ);
                    C1AC8.LIZLLL(c2344009Gk, c1acd);
                    C1AC8.LJI(c2344009Gk, c1acaZQ24, j);
                    C1ACV c1acv = c1acaZQ24.LJJLIL;
                    if (c1acv != null && (mapLIZIZ = c1acv.LIZIZ()) != null) {
                        c2344009Gk.LJII(mapLIZIZ);
                    }
                    C1AC8.LIZ(c2344009Gk, c1acaZQ24);
                    c2344009Gk.LIZJ(c1acaZQ24.LJLI ? 1 : 0, "is_follow_btn_show");
                    c2344009Gk.LJFF("follow_btn_fail_show_reason", c1acaZQ24.LJLIIIL);
                    c2344009Gk.LJIIIIZZ("live_play_session_id", c1acaZQ24.LJJJJ);
                    String str8 = c1acaZQ24.LJJJJI;
                    if (str8 == null) {
                        str8 = "";
                    }
                    c2344009Gk.LJIIIIZZ("live_session_id", str8);
                    c2344009Gk.LIZJ(C176600m4.LIZIZ(Boolean.valueOf(c1acaZQ24.LJJJJL)) ? 1 : 0, "enter_room_boost_type");
                    if (c1acaZQ24.LLFFF || c1acaZQ24.LJJJJI != null) {
                        str3 = "1";
                    } else {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk.LJIIIIZZ("has_enter_room_before", str3);
                    if (!c1acaZQ24.LJIIIZ.LIZIZ) {
                        str6 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk.LJIIIIZZ("has_first_frame", str6);
                    c2344009Gk.LJIIIIZZ("start_play_reason", c1acaZQ24.LJJLIIIJ);
                    InterfaceC2175971ADz interfaceC2175971ADz = c1acaZQ24.LJJJJLL;
                    if (interfaceC2175971ADz != null) {
                        bitrate2 = interfaceC2175971ADz.getBitrate();
                    } else {
                        bitrate2 = 0;
                    }
                    c2344009Gk.LIZLLL(bitrate2, "play_bitrate");
                    LiveSdkMultiGuestAddPreviewCommonParamsSetting liveSdkMultiGuestAddPreviewCommonParamsSetting = LiveSdkMultiGuestAddPreviewCommonParamsSetting.INSTANCE;
                    if (liveSdkMultiGuestAddPreviewCommonParamsSetting.isEnable() && (multiLiveUserSettings2 = liveRoomStruct2.multiLiveUserSettings) != null && (multiLiveUserApplySettings2 = multiLiveUserSettings2.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo2 = multiLiveUserApplySettings2.multiGuestLayoutInfo) != null && multiGuestLayoutInfo2.multiLayoutChanged == 1) {
                        C1AC8.LJFF(c2344009Gk, c1acaZQ24, liveRoomStruct2);
                    }
                    LiveRoomStruct liveRoomStruct5 = c1acaZQ24.LIZJ;
                    if (liveRoomStruct5 != null && liveRoomStruct5.isRepostedExpect > 0) {
                        c2344009Gk.LJFF("repost_tag_display_fail_reason", c1acaZQ24.LJLJLJ);
                    }
                    String str9 = c1acaZQ24.LJLJLLL;
                    if (str9 != null) {
                        c2344009Gk.LJFF("repost_trigger_button_result", str9);
                    }
                    if ((MultiGuestEnableFeedFullLinkTrackAddMultiParamsSetting.INSTANCE.isEnable() || LiveSdkEnableFeedLiveTrackAddMultiParamsSetting.INSTANCE.isEnable()) && (multiLiveUserSettings = liveRoomStruct2.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo = multiLiveUserApplySettings.multiGuestLayoutInfo) != null && multiGuestLayoutInfo.multiLayoutChanged == 1) {
                        if (!liveSdkMultiGuestAddPreviewCommonParamsSetting.isEnable()) {
                            C1AC8.LJFF(c2344009Gk, c1acaZQ24, liveRoomStruct2);
                        }
                        if (c1acaZQ24.LJJLIIIJJI && !LiveSdkMultiGuestMockSeiNotReceiveSetting.INSTANCE.isEnable()) {
                            c2344009Gk.LIZJ(c1acaZQ24.LJJLIIIJL, "guest_cnt");
                            c2344009Gk.LJFF("multi_layout_key", c1acaZQ24.LJJLIIIJLJLI);
                            C1AC8.LJIIJ(i, jElapsedRealtime, c2344009Gk, c1acd, streamData, str7, streamData2, str);
                        } else {
                            Pair<Long, Boolean> pair2 = c1acaZQ24.LJJLIIIJJIZ;
                            if (pair2 != null && pair2.getFirst().longValue() == liveRoomStruct2.id && (pair = c1acaZQ24.LJJLIIIJJIZ) != null && pair.getSecond().booleanValue()) {
                                c2344009Gk.LIZJ(c1acaZQ24.LJJLIIIJL, "guest_cnt");
                                c2344009Gk.LJFF("multi_layout_key", c1acaZQ24.LJJLIIIJLJLI);
                                C1AC8.LJIIJ(i, jElapsedRealtime, c2344009Gk, c1acd, streamData, str7, streamData2, str);
                            } else {
                                ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Wd1(liveRoomStruct2.id, new C2175601ACo(i, jElapsedRealtime, c2344009Gk, c1acd, streamData, str7, streamData2, str), new C2175701ACy(i, jElapsedRealtime, c2344009Gk, c1acd, streamData, str7, streamData2, str));
                            }
                        }
                    } else {
                        C1AC8.LJIIJ(i, jElapsedRealtime, c2344009Gk, c1acd, streamData, str7, streamData2, str);
                    }
                } else {
                    C1AC7.LIZ.getClass();
                    String strLJ = C1AC7.LJ(c1acaZQ24);
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    C1AC8.LIZIZ(c2344009Gk2, c1acaZQ24, j);
                    C1AC8.LJIIIIZZ(c2344009Gk2, c1acaZQ24, c473100Igu, c1acs, c1acaZQ24);
                    C1AC8.LJIIIZ(c2344009Gk2, c1acaZQ24);
                    C1AC8.LJ(c2344009Gk2, c1acaZQ24);
                    C1AC8.LIZJ(c2344009Gk2);
                    C1AC8.LJII(c2344009Gk2, c1acaZQ24.LJJJZ);
                    C1AC8.LIZLLL(c2344009Gk2, c1acd);
                    if (LiveEnablePlayerSetTimeoutSetting.INSTANCE.getValue() && (playerThreadBlockStatus = c1acd.getPlayerThreadBlockStatus()) != null) {
                        c2344009Gk2.LIZJ(playerThreadBlockStatus.LIZ, "block_msg");
                    }
                    C1AC8.LJI(c2344009Gk2, c1acaZQ24, j);
                    c2344009Gk2.LIZJ(c1acaZQ24.LJLI ? 1 : 0, "is_follow_btn_show");
                    c2344009Gk2.LJFF("follow_btn_fail_show_reason", c1acaZQ24.LJLIIIL);
                    C1AC8.LIZ(c2344009Gk2, c1acaZQ24);
                    c2344009Gk2.LJIIIIZZ("live_play_session_id", c1acaZQ24.LJJJJ);
                    String str10 = c1acaZQ24.LJJJJI;
                    if (str10 == null) {
                        str10 = "";
                    }
                    c2344009Gk2.LJIIIIZZ("live_session_id", str10);
                    c2344009Gk2.LIZJ(c1acaZQ24.LJJIJ, "stall_count");
                    c2344009Gk2.LIZLLL(jElapsedRealtime, "stall_duration");
                    c2344009Gk2.LJIIIIZZ("resolution_list", strLJ);
                    c2344009Gk2.LJIIIIZZ("default_resolution", str);
                    c2344009Gk2.LJIIIIZZ("play_resolution", c1acaZQ24.LJJJIL);
                    c2344009Gk2.LIZJ(C176600m4.LIZIZ(Boolean.valueOf(c1acaZQ24.LJJJJL)) ? 1 : 0, "enter_room_boost_type");
                    if (c1acaZQ24.LLFFF || c1acaZQ24.LJJJJI != null) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk2.LJIIIIZZ("has_enter_room_before", str2);
                    InterfaceC2175971ADz interfaceC2175971ADz2 = c1acaZQ24.LJJJJLL;
                    if (interfaceC2175971ADz2 != null) {
                        bitrate = interfaceC2175971ADz2.getBitrate();
                    } else {
                        bitrate = 0;
                    }
                    c2344009Gk2.LIZLLL(bitrate, "play_bitrate");
                    if (!c1acaZQ24.LJIIIZ.LIZIZ) {
                        str6 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk2.LJIIIIZZ("has_first_frame", str6);
                    c2344009Gk2.LJIIIIZZ("start_play_reason", c1acaZQ24.LJJLIIIJ);
                    C20684815ws.LJIILLIIL("livesdk_live_card_full_link", c2344009Gk2.LIZ);
                }
            }
        }
        C1ACA c1acaZQ25 = zQ2();
        if (c1acaZQ25 != null && (liveRoomStruct = c1acaZQ25.LIZJ) != null) {
            long j4 = liveRoomStruct.id;
            C1ADO c1ado = c1acaZQ25.LJIIJ;
            long j5 = c1ado.LIZ;
            if (j5 > 0) {
                if (this.LLJJI.LIZJ.LIZ >= 5) {
                    long j6 = c1ado.LJ;
                    if (j6 > 0) {
                        long jMax = Math.max(j6, j5);
                        if (jMax > 0) {
                            j2 = j - jMax;
                        }
                    }
                }
                InterfaceC486670J6r interfaceC486670J6rOt = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ot();
                if (interfaceC486670J6rOt != null) {
                    interfaceC486670J6rOt.LIZ(j4, j2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateLiveShowPreviewDuration roomID: ");
                sbLIZ.append(j4);
                sbLIZ.append(", previewDuration: ");
                sbLIZ.append(j2);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C473110Igv c473110Igv = C473110Igv.LIZIZ;
        C473100Igu c473100Igu2 = this.LLJJI;
        c473100Igu2.LIZJ = c473110Igv;
        c473100Igu2.LIZIZ.clear();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void wQ2(Function0 function0, boolean z) {
        LiveRoomStruct liveRoomStruct;
        String secUid;
        String secUid2;
        C1ACA c1acaZQ2 = zQ2();
        if (c1acaZQ2 != null && (liveRoomStruct = c1acaZQ2.LIZJ) != null && liveRoomStruct.id > 0) {
            User user = liveRoomStruct.owner;
            if (user != null) {
                secUid = user.getSecUid();
            } else {
                secUid = null;
            }
            if (!C2093608Ic.LJ(secUid)) {
                C480460Ism.LIZ().getClass();
                SubscribeApi subscribeApi = (SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class);
                User user2 = liveRoomStruct.owner;
                if (user2 == null || (secUid2 = user2.getSecUid()) == null) {
                    secUid2 = "";
                }
                C510380Jzw.LJIILJJIL(subscribeApi.getUserInfo(secUid2, 0L, 0L, 0), EnumC510330Jzr.GENERAL, "checkSubscribeStatus", "sub/user/info", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0()).LJJLJLI(new AfS30S0210000_7(this, z, function0, 0));
            }
        }
    }

    public final void yQ2(String str, boolean z) {
        Long lValueOf;
        LiveRoomStruct liveRoomStruct;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy Reason: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(AQ2());
        sbLIZ.append(" roomId: ");
        C1ACA c1acaZQ2 = zQ2();
        if (c1acaZQ2 != null && (liveRoomStruct = c1acaZQ2.LIZJ) != null) {
            lValueOf = Long.valueOf(liveRoomStruct.id);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C20441214yg.LJIIIZ("ttlive_preview_LivePreviewPlayerVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLLIL.LJJIJIL(str, z);
        C19487111Lx c19487111Lx = this.LLJLILLLLZIIL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLJLILLLLZIIL = null;
        this.LLJJIII = false;
    }
}
