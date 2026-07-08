package com.ss.android.ugc.aweme.feed.adapter.viewholdervm;

import X.AbstractC19484711Kz;
import X.AbstractC745150TKv;
import X.C01GW;
import X.C077W;
import X.C083S;
import X.C09JN;
import X.C0IVR;
import X.C0J75;
import X.C0J76;
import X.C0J77;
import X.C0J7B;
import X.C1161920gLG;
import X.C11JF;
import X.C11S5;
import X.C1386210mB1;
import X.C1389340mG4;
import X.C1440005kM;
import X.C1483410ohn;
import X.C14LC;
import X.C168M;
import X.C188N;
import X.C1A7N;
import X.C1AAV;
import X.C1ABT;
import X.C1AC7;
import X.C1ACA;
import X.C1ACS;
import X.C1ACV;
import X.C1AD2;
import X.C1ADI;
import X.C1ADO;
import X.C1AE5;
import X.C20441214yg;
import X.C20448214zo;
import X.C20684815ws;
import X.C2095008Iq;
import X.C21630019kw;
import X.C2175121AAs;
import X.C2175591ACn;
import X.C2344009Gk;
import X.C452501pT;
import X.C466460IQy;
import X.C483280IxK;
import X.C497820Jfg;
import X.C500260Jjc;
import X.C745090TKp;
import X.C745160TKw;
import X.C786410Ut5;
import X.C823050WQl;
import X.C939160aXy;
import X.C940170aZb;
import X.C942150acn;
import X.C956980b0i;
import X.C998890c6J;
import X.EnumC744960TKc;
import X.EnumC939140aXw;
import X.EnumC940090aZT;
import X.InterfaceC420801kM;
import X.InterfaceC472850IgV;
import X.InterfaceC480520Iss;
import Y.ACallableS60S1100000_7;
import Y.AObjectS375S0100000_33;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRecInfoPtySetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveOptSmoothEnterRoomSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkFeedPreviewAddMultiGuestParamsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCadSmoothExitSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveSurveyAfterScrolledSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LiveCardCheckAliveConfigSetting;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.LiveOptFluencyRecoExp;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.exp.PreviewEndLiveOptimizeConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.BoardUsingInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MultiGuestLayoutInfo;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserApplySettings;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserSettings;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCommentItem;
import com.ss.android.ugc.aweme.feed.model.live.SMBInfo;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class FeedLiveViewHolderVM extends LiveWidgetViewModel implements Handler.Callback {
    public static final /* synthetic */ int LLLJL = 0;
    public boolean LL;
    public InterfaceC420801kM LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLJ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;
    public C188N LLJJI;
    public boolean LLJJIII;
    public long LLJJIJIIJIL;
    public C11JF LLJJIJIL;
    public C1ADI LLJJJ;
    public AObjectS375S0100000_33 LLJLIL;
    public C1ACS LLLFF;
    public long LLLFFI;
    public boolean LLLFZ;
    public final C1AD2 LLLI;
    public long LLLII;
    public long LLLIIII;
    public boolean LLLIIIIL;
    public String LLLIIIL;
    public final MutableLiveData<Integer> LLLIIL;
    public final MutableLiveData<Integer> LLLIILIL;
    public final MutableLiveData<Integer> LLLIL;
    public final NextLiveData<C0J75> LLLILZ;
    public final NextLiveData<C0J77> LLLILZJ;
    public final MutableLiveData<Integer> LLLILZLLLI;
    public boolean LLLIZZ;
    public final C01GW LLLJ;
    public boolean LLLJIL;
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2084));
    public String LLIZLLLIL = "";
    public String LLJI = "user_swipe";
    public final BPEAHandler LLJJIJI = new BPEAHandler(Looper.getMainLooper(), this);
    public final NextLiveData<Boolean> LLJJJIL = new NextLiveData<>();
    public final NextLiveData<C998890c6J> LLJJJJ = new NextLiveData<>();
    public final NextLiveData<Integer> LLJJJJJIL = new NextLiveData<>();
    public final NextLiveData<Pair<Boolean, Boolean>> LLJJJJLIIL = new NextLiveData<>();
    public final NextLiveData<Boolean> LLJJL = new NextLiveData<>(Boolean.TRUE);
    public final NextLiveData<Unit> LLJJLIIIJLLLLLLLZ = new NextLiveData<>();
    public final MutableLiveData<C1AAV> LLJL = new MutableLiveData<>();
    public final NextLiveData<Boolean> LLJLILLLLZIIL = new NextLiveData<>();
    public final MutableLiveData<Boolean> LLJLL = new MutableLiveData<>(Boolean.FALSE);
    public final MutableLiveData<Integer> LLJLLIL = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLJLLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJZIJLIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLL = new MutableLiveData<>();
    public final MutableLiveData<String> LLLF = new MutableLiveData<>();

    public final void JQ2() {
        this.LLJJ = false;
        this.LLJI = "auto_swipe";
        C1ACA c1acaDQ2 = DQ2();
        if (c1acaDQ2 == null || !c1acaDQ2.LJII) {
            return;
        }
        this.LLJJIJIIJIL = 0L;
        NQ2();
        if (((Boolean) C077W.LIZ.getValue()).booleanValue()) {
            C1ACA c1acaDQ22 = DQ2();
            if (c1acaDQ22 != null) {
                C1440005kM.LIZ(new C0J7B(true, c1acaDQ22.LIZIZ, c1acaDQ22.LJ, null, null, false, false, false));
            }
        } else {
            C1440005kM.LIZ(new C483280IxK());
        }
        C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderVM", "moveToNext post FeedScrollToNextEvent");
    }

    public static void HQ2() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_follow");
        C1386210mB1.LIZ.getClass();
        c2344009Gk.LJIIIIZZ("notice_type", C1386210mB1.LIZIZ);
        c2344009Gk.LJIIIIZZ("show_cnt", String.valueOf(0));
        c2344009Gk.LJIIIIZZ("yellow_dot_logid", C1386210mB1.LIZJ);
        C20684815ws.LJIILLIIL("live_play_page_notice", c2344009Gk.LIZ);
    }

    public final void AQ2() {
        C11JF c11jf = this.LLJJIJIL;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        InterfaceC420801kM interfaceC420801kM = this.LLILZIL;
        if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
            interfaceC420801kM.dispose();
        }
        this.LLILZIL = null;
    }

    public final void BQ2() {
        PreviewEndLiveOptimizeConfig previewEndLiveOptimizeConfig = C21630019kw.LIZ;
        long j = previewEndLiveOptimizeConfig.enable ? previewEndLiveOptimizeConfig.autoSlideInterval : Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LLJJIJI.removeMessages(100);
        if (this.LLJJIJIIJIL > 0 && System.currentTimeMillis() - this.LLJJIJIIJIL >= j) {
            C786410Ut5.LJLJJI(100, 0L, this.LLJJIJI);
        } else {
            C786410Ut5.LJLJJI(100, j, this.LLJJIJI);
            this.LLJJIJIIJIL = System.currentTimeMillis();
        }
    }

    public final C1ACA DQ2() {
        return (C1ACA) this.LLILZ.getValue();
    }

    public final void NQ2() {
        this.LLJJIJI.removeMessages(100);
    }

    public FeedLiveViewHolderVM() {
        new MutableLiveData();
        this.LLLFF = C1ACS.IDLE;
        this.LLLFZ = true;
        this.LLLI = new C1AD2();
        this.LLLIIL = new MutableLiveData<>();
        this.LLLIILIL = new MutableLiveData<>(0);
        this.LLLIL = new MutableLiveData<>(0);
        this.LLLILZ = new NextLiveData<>();
        this.LLLILZJ = new NextLiveData<>();
        this.LLLILZLLLI = new MutableLiveData<>(0);
        this.LLLJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(179));
        this.LLLJIL = true;
    }

    public final long EQ2() {
        C1ACA c1acaDQ2 = DQ2();
        if (c1acaDQ2 == null) {
            return 0L;
        }
        C1ADO c1ado = c1acaDQ2.LJIIJ;
        long j = c1ado.LJ;
        if (j > 0) {
            long j2 = c1ado.LIZ;
            if (j2 > 0) {
                if (j < j2) {
                    j = j2;
                }
                return System.currentTimeMillis() - j;
            }
        }
        return 0L;
    }

    public final long FQ2() {
        C1ACA c1acaDQ2 = DQ2();
        if (c1acaDQ2 == null) {
            return 0L;
        }
        return c1acaDQ2.LJIIJ.LIZLLL + EQ2();
    }

    public final void GQ2() {
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        C1ACA c1acaDQ2 = DQ2();
        if (c1acaDQ2 == null || c1acaDQ2.LJLLLL <= 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1ACA c1acaDQ22 = DQ2();
        c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaDQ22 != null ? c1acaDQ22.LIZLLL : null);
        c2344009Gk.LJIIIIZZ("action_type", "click");
        C1ACA c1acaDQ23 = DQ2();
        c2344009Gk.LJ((c1acaDQ23 == null || (liveRoomStruct2 = c1acaDQ23.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct2.ownerUserId), "anchor_id");
        C1ACA c1acaDQ24 = DQ2();
        c2344009Gk.LJ((c1acaDQ24 == null || (liveRoomStruct = c1acaDQ24.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.id), "room_id");
        C1ACA c1acaDQ25 = DQ2();
        c2344009Gk.LJ(c1acaDQ25 != null ? Integer.valueOf(c1acaDQ25.LJLLLL) : null, "operation_scope");
        C20684815ws.LJIILLIIL("livesdk_live_cell_operation", c2344009Gk.LIZ);
        C1ACA c1acaDQ26 = DQ2();
        if (c1acaDQ26 != null) {
            c1acaDQ26.LJLLLL = -1;
        }
    }

    public final void LJJJJZI() {
        Aweme aweme;
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaDQ2 = DQ2();
        String requestId = null;
        Long lValueOf = (c1acaDQ2 == null || (liveRoomStruct = c1acaDQ2.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.id);
        C1ACA c1acaDQ22 = DQ2();
        if (c1acaDQ22 != null && (aweme = c1acaDQ22.LIZIZ) != null) {
            requestId = aweme.getRequestId();
        }
        if (!LiveFeedRecInfoPtySetting.INSTANCE.value().enable || lValueOf == null) {
            return;
        }
        lValueOf.longValue();
        if (requestId != null) {
            AbstractC19484711Kz.LJIJI(new ACallableS60S1100000_7(lValueOf, requestId, 0)).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.00ON
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveFeedRecInfoManager@aada.uploadRecInfo2Pty$2");
                    C1C7U.LIZIZ("LiveFeedRecInfoManager@aada.uploadRecInfo2Pty$2");
                }
            }, new C09JN() { // from class: X.00OO
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveFeedRecInfoManager@aada.uploadRecInfo2Pty$3");
                    C1C7U.LIZIZ("LiveFeedRecInfoManager@aada.uploadRecInfo2Pty$3");
                }
            });
        }
    }

    public final void PQ2() {
        C1ACA c1acaDQ2;
        C2175121AAs c2175121AAs;
        C1ADO c1ado;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1ACA c1acaDQ22 = DQ2();
        if (c1acaDQ22 != null && (c1ado = c1acaDQ22.LJIIJ) != null) {
            c1ado.LIZ = jCurrentTimeMillis;
        }
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            dataChannel.SX0(C956980b0i.class, new C940170aZb(System.currentTimeMillis()));
        }
        C1ACA c1acaDQ23 = DQ2();
        if (c1acaDQ23 == null || !c1acaDQ23.LJIILIIL || (c1acaDQ2 = DQ2()) == null || (c2175121AAs = c1acaDQ2.LJIIJJI) == null) {
            return;
        }
        c2175121AAs.LIZJ = jCurrentTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:404:0x0723  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdkapi.session.EnterRoomConfig yQ2(com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM r21) {
        /*
            Method dump skipped, instruction units count: 2138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM.yQ2(com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM):com.bytedance.android.livesdkapi.session.EnterRoomConfig");
    }

    public final void IQ2(final boolean z) {
        LiveRoomStruct liveRoomStruct;
        final String str;
        C1ACA c1acaDQ2;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        boolean z2;
        long jUptimeMillis;
        long j;
        long j2;
        String requestId;
        int i;
        Long lValueOf;
        boolean z3;
        List<LiveRoomStatesTag> liveRoomStatesTags;
        StreamUrlStruct streamUrlStruct;
        String str2;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiGuestLayoutInfo multiGuestLayoutInfo;
        SMBInfo sMBInfo;
        int i2 = C20448214zo.LIZ;
        C1ACA c1acaDQ22 = DQ2();
        if (c1acaDQ22 != null) {
            liveRoomStruct = c1acaDQ22.LIZJ;
        } else {
            liveRoomStruct = null;
        }
        Pair pairLIZ = C20448214zo.LIZ(liveRoomStruct);
        C1ACA c1acaDQ23 = DQ2();
        if (c1acaDQ23 != null) {
            c1acaDQ23.LJIILJJIL = (Set) pairLIZ.getSecond();
        }
        C1AC7 c1ac7 = C1AC7.LIZ;
        final C1ACA c1acaDQ24 = DQ2();
        C1ADI c1adi = this.LLJJJ;
        if (c1adi != null && c1adi.LLILLJJLI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1ac7.getClass();
        if (LiveOptFluencyRecoExp.isEnable()) {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0euD
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LivePreviewLogUtil@b1cf.logLiveShow$1");
                    try {
                        C1AC7 c1ac72 = C1AC7.LIZ;
                        C1ACA c1aca = c1acaDQ24;
                        String str3 = str;
                        boolean z4 = z;
                        c1ac72.getClass();
                        C1AC7.LJIILJJIL(c1aca, str3, z4);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LivePreviewLogUtil@b1cf.logLiveShow$1");
                }
            });
        } else {
            C1AC7.LJIILJJIL(c1acaDQ24, str, z);
        }
        C1ACA c1acaDQ25 = DQ2();
        if (c1acaDQ25 != null) {
            c1acaDQ25.LJLJJI = C1483410ohn.LJLJJI().LJLIIIL();
        }
        C1ACA c1acaDQ26 = DQ2();
        C1ACS c1acs = this.LLLFF;
        long j3 = this.LLLII;
        long j4 = this.LLLIIII;
        C1AD2 c1ad2 = this.LLLI;
        if (c1acaDQ26 != null && (liveRoomStruct3 = c1acaDQ26.LIZJ) != null) {
            long j5 = 0;
            if (j4 > 0 && j3 > 0 && j4 > j3) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = C2175591ACn.LIZ[c1acs.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        j2 = c1ad2.LIZJ;
                    }
                } else if (z2) {
                    jUptimeMillis = j4 - j3;
                    j = c1ad2.LIZJ;
                    j2 = j + jUptimeMillis;
                }
                j2 = 0;
            } else {
                if (j3 > 0) {
                    jUptimeMillis = SystemClock.uptimeMillis() - j3;
                    j = c1ad2.LIZJ;
                    j2 = j + jUptimeMillis;
                }
                j2 = 0;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaDQ26.LIZLLL);
            c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
            c2344009Gk.LJIIIIZZ("action_type", "click");
            c2344009Gk.LJIIIIZZ("anchor_id", liveRoomStruct3.owner.getUid());
            c2344009Gk.LIZLLL(liveRoomStruct3.id, "room_id");
            Aweme aweme = c1acaDQ26.LIZIZ;
            if (aweme != null) {
                requestId = aweme.getRequestId();
            } else {
                requestId = null;
            }
            c2344009Gk.LJIIIIZZ("request_id", requestId);
            c2344009Gk.LIZJ(c1acaDQ26.LJIIIIZZ, "room_position");
            c2344009Gk.LIZJ(c1acs.ordinal(), "preview_stream_status");
            c2344009Gk.LIZLLL(j2, "waste_duration");
            c2344009Gk.LIZJ(liveRoomStruct3.liveRoomMode, "live_room_mode");
            c2344009Gk.LJIIIIZZ("trigger_scene", c1ad2.LIZLLL);
            c2344009Gk.LIZLLL(c1ad2.LJ, "real_start_interval");
            c2344009Gk.LJII(liveRoomStruct3.getMultiStreamLogParams());
            c2344009Gk.LIZJ(C1ABT.LJIJI(c1acaDQ26), "preview_stream_trigger_type");
            c2344009Gk.LIZLLL(c1acaDQ26.LJLJI, "predict_pre_pull_stream_time");
            c2344009Gk.LIZLLL(c1acaDQ26.LJLJJI, "vod_play_time");
            c2344009Gk.LIZJ(c1acaDQ26.LJLJJL, "p95_predict_code");
            c2344009Gk.LJIIIIZZ("pre_pull_stream_idle_phase", c1acaDQ26.LJLJJLL);
            c2344009Gk.LIZJ(c1acaDQ26.LJLLI, "strategy_state");
            c2344009Gk.LIZLLL(c1acaDQ26.LJLLILLLL, "strategy_time");
            c2344009Gk.LIZLLL(c1acaDQ26.LJLLJ, "strategy_pull_time");
            c2344009Gk.LIZLLL(c1acaDQ26.LJLLL, "strategy_delay_time");
            LiveRoomStruct liveRoomStruct4 = c1acaDQ26.LIZJ;
            if (liveRoomStruct4 != null && (sMBInfo = liveRoomStruct4.smbInfo) != null && sMBInfo.optInStatus == 1 && sMBInfo.activeSkuCount > 0) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_smb_creator");
            LiveRoomStruct liveRoomStruct5 = c1acaDQ26.LIZJ;
            if (liveRoomStruct5 != null) {
                lValueOf = Long.valueOf(liveRoomStruct5.smbBoardId);
            } else {
                lValueOf = null;
            }
            c2344009Gk.LJ(lValueOf, "decoration_set_id");
            c2344009Gk.LIZJ(c1acaDQ26.LJJIIJZLJL, "end_type");
            c2344009Gk.LJII(C1AC7.LIZLLL(c1acaDQ26));
            if (LiveSdkFeedPreviewAddMultiGuestParamsSetting.isEnable()) {
                MultiLiveUserSettings multiLiveUserSettings = liveRoomStruct3.multiLiveUserSettings;
                if (multiLiveUserSettings != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo = multiLiveUserApplySettings.multiGuestLayoutInfo) != null) {
                    j5 = multiGuestLayoutInfo.guestCnt;
                }
                int i4 = (int) j5;
                c1acaDQ26.LJJLIIIJLLLLLLLZ = i4;
                c2344009Gk.LIZJ(i4, "guest_cnt");
            }
            LiveRoomStruct liveRoomStruct6 = c1acaDQ26.LIZJ;
            if (liveRoomStruct6 != null && (streamUrlStruct = liveRoomStruct6.stream_url) != null && (str2 = streamUrlStruct.streamLanguage) != null && C500260Jjc.LJJIIZ(str2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                c2344009Gk.LIZJ(1, "is_translated_stream");
            } else {
                c2344009Gk.LIZJ(0, "is_translated_stream");
            }
            String str3 = c1ad2.LIZIZ;
            if (str3 != null) {
                c2344009Gk.LJFF("resume_play_scene", str3);
            }
            Aweme aweme2 = c1acaDQ26.LIZIZ;
            if (aweme2 != null && (liveRoomStatesTags = aweme2.getLiveRoomStatesTags()) != null) {
                for (LiveRoomStatesTag liveRoomStatesTag : liveRoomStatesTags) {
                    String str4 = liveRoomStatesTag.tagKey;
                    if (str4 != null) {
                        c2344009Gk.LJFF(str4, liveRoomStatesTag.tagValue);
                    }
                }
            }
            C1AC7.LIZ.getClass();
            String str5 = c1acaDQ26.LJIILL;
            if (str5 != null) {
                c2344009Gk.LJFF("cta_content_lv_1", str5);
            }
            c2344009Gk.LJIIIIZZ("live_type", RoomStruct.getStreamType(liveRoomStruct3).logStreamingType);
            c2344009Gk.LJIIIIZZ("live_play_session_id", c1acaDQ26.LJJJJ);
            c2344009Gk.LJIIIIZZ("live_session_id", c1acaDQ26.LJJJJI);
            C20684815ws.LJIILLIIL("livesdk_preview_live_show", c2344009Gk.LIZ);
        }
        C1AE5.LIZ.getClass();
        C1AE5.LIZ(1);
        if (LiveDedupOptExp.INSTANCE.enable() && (c1acaDQ2 = DQ2()) != null && (liveRoomStruct2 = c1acaDQ2.LIZJ) != null) {
            ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).fW0(liveRoomStruct2.id);
        }
        this.LLJILJILJ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OQ2(java.lang.String r5) {
        /*
            r4 = this;
            X.1ACA r0 = r4.DQ2()
            r3 = 0
            if (r0 == 0) goto L94
            java.lang.String r1 = r0.LIZLLL
            java.lang.String r0 = "homepage_hot"
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            r0 = 1
            if (r1 != r0) goto L94
            com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LiveCardCheckAliveConfigSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LiveCardCheckAliveConfigSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.watchlive.previewlive.CheckAliveConfig r2 = r0.getValue()
            if (r2 != 0) goto L1b
            return r3
        L1b:
            int r1 = r5.hashCode()
            r0 = 3524(0xdc4, float:4.938E-42)
            if (r1 == r0) goto L89
            r0 = 100571(0x188db, float:1.4093E-40)
            if (r1 == r0) goto L7e
            r0 = 106440182(0x65825f6, float:4.0652974E-35)
            if (r1 == r0) goto L73
            r0 = 1567246465(0x5d6a4881, float:1.0551178E18)
            if (r1 != r0) goto L70
            java.lang.String r0 = "nostream"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L70
            boolean r3 = r2.disableNoStream
        L3c:
            if (r3 == 0) goto L70
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "checkLiveAlive: reverse delete card, state="
            r2.append(r0)
            X.1ACA r0 = r4.DQ2()
            r1 = 0
            if (r0 == 0) goto L71
            X.0gA3 r0 = r0.LJI
        L50:
            r2.append(r0)
            java.lang.String r0 = ", result="
            r2.append(r0)
            X.1ACA r0 = r4.DQ2()
            if (r0 == 0) goto L64
            int r0 = r0.LJJ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L64:
            r2.append(r1)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "ttlive_preview_FeedLiveViewHolderVM"
            X.C20441214yg.LJIIIZ(r0, r1)
        L70:
            return r3
        L71:
            r0 = r1
            goto L50
        L73:
            java.lang.String r0 = "pause"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L70
            boolean r3 = r2.disablePause
            goto L3c
        L7e:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L70
            boolean r3 = r2.disableLiveEnd
            goto L3c
        L89:
            java.lang.String r0 = "nr"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L70
            boolean r3 = r2.disableNr
            goto L3c
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM.OQ2(java.lang.String):boolean");
    }

    public final void QQ2(EnterRoomConfig enterRoomConfig) {
        C1ACV c1acv;
        EnumC940090aZT enumC940090aZTLIZJ;
        C942150acn c942150acnLJIJ;
        int i;
        int i2;
        EnumC939140aXw enumC939140aXw;
        C1ACV c1acv2;
        C1ACV c1acv3;
        C942150acn c942150acn;
        C1ACA c1acaDQ2 = DQ2();
        String str = null;
        previewLayoutHandoff = null;
        EnterRoomConfig.FeedCoverData.PreviewLayoutHandoff previewLayoutHandoff = null;
        if (c1acaDQ2 != null) {
            c1acv = c1acaDQ2.LJJLIL;
        } else {
            c1acv = null;
        }
        if (c1acv == null) {
            EnterRoomConfig.FeedCoverData feedCoverData = enterRoomConfig.mFeedCoverData;
            DataChannel dataChannel = getDataChannel();
            if (dataChannel != null && (c942150acn = (C942150acn) dataChannel.gg0(C168M.class)) != null) {
                previewLayoutHandoff = new EnterRoomConfig.FeedCoverData.PreviewLayoutHandoff(2, 0, c942150acn.LIZIZ);
            }
            feedCoverData.previewLayoutHandoff = previewLayoutHandoff;
            C20441214yg.LIZIZ("wws_test_layout", "writePreviewLayoutHandoff from LivePreviewLayoutSnapshot");
            return;
        }
        C20441214yg.LIZIZ("wws_test_layout", "writePreviewLayoutHandoff from playerLinkMicCallback");
        C1ACA c1acaDQ22 = DQ2();
        if (c1acaDQ22 != null && (c1acv3 = c1acaDQ22.LJJLIL) != null) {
            enumC940090aZTLIZJ = c1acv3.LIZJ();
        } else {
            enumC940090aZTLIZJ = null;
        }
        C1ACA c1acaDQ23 = DQ2();
        if (c1acaDQ23 != null && (c1acv2 = c1acaDQ23.LJJLIL) != null) {
            c942150acnLJIJ = c1acv2.LJIJ();
        } else {
            c942150acnLJIJ = null;
        }
        if (enumC940090aZTLIZJ == null) {
            i = -1;
        } else {
            i = C939160aXy.LIZ[enumC940090aZTLIZJ.ordinal()];
        }
        int i3 = 0;
        if (i != 1) {
            if (i != 2) {
                i2 = 0;
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        if (c942150acnLJIJ != null && (enumC939140aXw = c942150acnLJIJ.LIZ) != null) {
            int i4 = C939160aXy.LIZIZ[enumC939140aXw.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    i3 = 2;
                }
            } else {
                i3 = 1;
            }
        }
        EnterRoomConfig.FeedCoverData feedCoverData2 = enterRoomConfig.mFeedCoverData;
        if (c942150acnLJIJ != null) {
            str = c942150acnLJIJ.LIZIZ;
        }
        feedCoverData2.previewLayoutHandoff = new EnterRoomConfig.FeedCoverData.PreviewLayoutHandoff(i3, i2, str);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C0J76 c0j76;
        boolean z;
        int i = message.what;
        if (i != 100) {
            if (i != 102) {
                if (i != 103) {
                    return false;
                }
                JQ2();
                return true;
            }
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj instanceof C0J76) {
                c0j76 = (C0J76) messageObj;
            } else {
                c0j76 = null;
            }
            this.LLJI = "toast_swipe";
            C1ACA c1acaDQ2 = DQ2();
            if (c1acaDQ2 != null && c1acaDQ2.LJIIIIZZ == 0) {
                z = true;
            } else {
                z = this.LLLJIL;
            }
            this.LLLILZJ.setValue(new C0J77(c0j76, z));
            return true;
        }
        JQ2();
        return true;
    }

    public static void vQ2(C1ACA c1aca, EnterRoomConfig enterRoomConfig) {
        LiveRoomStruct liveRoomStruct;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            boolean z = liveRoomStruct.isTag2SfvRelationPair;
            if (TextUtils.equals(c1aca.LIZLLL, "homepage_hot")) {
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_sfv_relation_pair", str);
            }
        }
        enterRoomConfig.mLogData.logMap = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void xQ2(X.C1ACA r6, com.bytedance.android.livesdkapi.session.EnterRoomConfig r7) {
        /*
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            if (r6 == 0) goto L65
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r6.LIZJ
            if (r0 == 0) goto L1b
            long r4 = r0.isRepostedExpect
            java.lang.String r1 = "is_reposted_expect"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r3.put(r1, r0)
        L1b:
            X.1AC7 r0 = X.C1AC7.LIZ
            r0.getClass()
            java.util.Map r0 = X.C1AC7.LIZLLL(r6)
            r3.putAll(r0)
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r6.LIZJ
            if (r0 == 0) goto L6c
            boolean r0 = r0.isTopGifter
            r4 = 1
            if (r0 != r4) goto L6c
            java.lang.String r1 = "1"
        L32:
            java.lang.String r0 = "is_live_cache_refresh"
            r2.put(r0, r1)
            if (r4 == 0) goto L45
            X.0J89 r0 = X.C0J89.LIZ
            r0.getClass()
            java.util.Map r0 = X.C0J89.LIZ()
            r2.putAll(r0)
        L45:
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r6.LIZJ
            java.lang.String r1 = X.C1AC7.LJFF(r0)
            if (r1 == 0) goto L52
            java.lang.String r0 = "reason_id_expect_list"
            r3.put(r0, r1)
        L52:
            com.ss.android.ugc.aweme.feed.model.live.WatchReasonItem r0 = r6.LJZ
            if (r0 != 0) goto L5a
            com.ss.android.ugc.aweme.feed.model.live.WatchReasonItem r0 = r6.LJLZ
            if (r0 == 0) goto L65
        L5a:
            long r0 = r0.reasonId
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "reason_id"
            r3.put(r0, r1)
        L65:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r7.mLogData
            r0.singleRoomLogMapV2 = r3
            r0.singleRoomLogMapWithSlide = r2
            return
        L6c:
            r4 = 0
            java.lang.String r1 = "0"
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM.xQ2(X.1ACA, com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }

    public final void CQ2(String str, boolean z) {
        Aweme aweme;
        NextLiveData<C0J75> nextLiveData = this.LLLILZ;
        C1ACA c1acaDQ2 = DQ2();
        if (c1acaDQ2 != null) {
            aweme = c1acaDQ2.LIZIZ;
        } else {
            aweme = null;
        }
        nextLiveData.setValue(new C0J75(aweme, z, str));
    }

    public final void wQ2(C1ACA c1aca, EnterRoomConfig enterRoomConfig) {
        boolean z;
        List<LiveRoomStatesTag> liveExtraInfoStruct;
        String str;
        Integer numLJIIJJI;
        String string;
        BoardUsingInfo boardUsingInfo;
        BoardUsingInfo boardUsingInfo2;
        PreviewCommentItem previewCommentItem;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1aca != null) {
            Boolean bool = c1aca.LJJLIIIIJ;
            if (bool != null) {
                linkedHashMap.put("is_blue_v_user", String.valueOf(bool.booleanValue() ? 1 : 0));
            }
            String str2 = c1aca.LJIILL;
            if (str2 != null) {
                linkedHashMap.put("cta_content_lv_1", str2);
            }
            LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
            if (liveRoomStruct != null && (previewCommentItem = liveRoomStruct.commentItem) != null) {
                linkedHashMap.put("cmt_interact_preview_type", previewCommentItem.contentType);
            }
            int i = C20448214zo.LIZ;
            linkedHashMap.putAll(C20448214zo.LIZIZ(DQ2()));
            C745090TKp c745090TKp = C745090TKp.LIZ;
            C1ACA c1acaDQ2 = DQ2();
            C745160TKw c745160TKw = new AbstractC745150TKv() { // from class: X.0TKw
            };
            c745090TKp.getClass();
            Map mapLIZIZ = C745090TKp.LIZIZ(c1acaDQ2, c745160TKw);
            LiveRoomStatesTag liveRoomStatesTag = null;
            if (!mapLIZIZ.isEmpty()) {
                linkedHashMap.putAll(mapLIZIZ);
            }
            LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
            if (liveRoomStruct2 != null && (boardUsingInfo2 = liveRoomStruct2.boardUsingInfo) != null && boardUsingInfo2.usingBoard == 1) {
                z = true;
            } else {
                z = false;
            }
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (z && liveRoomStruct2 != null && (boardUsingInfo = liveRoomStruct2.boardUsingInfo) != null && boardUsingInfo.recommendSource == 2) {
                linkedHashMap.put("is_in_room_ai_summary_board_show", "1");
            } else {
                linkedHashMap.put("is_in_room_ai_summary_board_show", CardStruct.IStatusCode.DEFAULT);
            }
            Aweme aweme = c1aca.LIZIZ;
            if (aweme != null && (liveExtraInfoStruct = aweme.getLiveExtraInfoStruct()) != null) {
                Iterator<LiveRoomStatesTag> it2 = liveExtraInfoStruct.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    LiveRoomStatesTag next = it2.next();
                    if (Intrinsics.LJFF(next.tagKey, "chandler_liveboost_type")) {
                        liveRoomStatesTag = next;
                        break;
                    }
                }
                LiveRoomStatesTag liveRoomStatesTag2 = liveRoomStatesTag;
                if (liveRoomStatesTag2 != null && (str = liveRoomStatesTag2.tagValue) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null && (string = Integer.valueOf(numLJIIJJI.intValue() + 1).toString()) != null) {
                    str3 = string;
                }
            }
            linkedHashMap.put("is_wand", str3);
        }
        linkedHashMap.putAll(C0IVR.LJI(enterRoomConfig));
        if (this.LLILLJJLI.length() > 0) {
            linkedHashMap.put("repost_length", this.LLILLJJLI);
            linkedHashMap.put("message_type", this.LLILLL);
        }
        enterRoomConfig.mLogData.singleRoomLogMap = linkedHashMap;
    }

    public final void zQ2(final boolean z, final boolean z2, final boolean z3, final EnumC744960TKc enumC744960TKc) {
        LiveRoomStruct liveRoomStruct;
        String strJoin;
        C1ACA c1acaDQ2;
        Iterable arrayList;
        boolean zLJI = MethodIDManager.LJI(137323);
        if (LiveCardCheckAliveConfigSetting.INSTANCE.matchAnyReverseConfig() && enumC744960TKc == EnumC744960TKc.ON_PLAYER_CALLBACK && this.LLLIZZ) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1ACA c1acaDQ22 = DQ2();
        if (c1acaDQ22 != null && (liveRoomStruct = c1acaDQ22.LIZJ) != null) {
            if (!z3 || ((c1acaDQ2 = DQ2()) != null && c1acaDQ2.LJIIIIZZ == 0)) {
                if (z2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("pause");
                    arrayList2.add("nostream");
                    strJoin = TextUtils.join(",", arrayList2);
                } else {
                    strJoin = null;
                }
            } else {
                C1ACA c1acaDQ23 = DQ2();
                if (c1acaDQ23 == null || (arrayList = c1acaDQ23.LJIJJ) == null) {
                    arrayList = new ArrayList();
                }
                strJoin = TextUtils.join(",", arrayList);
            }
            AQ2();
            this.LLILZIL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJI("preview_card_inspection", strJoin, liveRoomStruct.id, new InterfaceC472850IgV() { // from class: X.1AAl
                @Override // X.InterfaceC472850IgV
                public final void onFailed() {
                }

                @Override // X.InterfaceC472850IgV
                public final void LIZ(FilterInfoData filterInfoData, boolean z4) {
                    boolean z5;
                    String str;
                    boolean z6;
                    LiveRoomStruct liveRoomStruct2;
                    Aweme aweme;
                    C1ACA c1acaDQ24;
                    FeedLiveViewHolderVM feedLiveViewHolderVM = this.LIZ;
                    if (feedLiveViewHolderVM.LLILZLL) {
                        feedLiveViewHolderVM.LLILZLL = false;
                        feedLiveViewHolderVM.LLIZ = z4;
                    }
                    if (enumC744960TKc == EnumC744960TKc.ON_PLAYER_CALLBACK) {
                        feedLiveViewHolderVM.LLLIZZ = true;
                    }
                    C1ACA c1acaDQ25 = feedLiveViewHolderVM.DQ2();
                    if (c1acaDQ25 != null && c1acaDQ25.LJFF == z4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z7 = !z5;
                    C1ACA c1acaDQ26 = this.LIZ.DQ2();
                    if (c1acaDQ26 != null) {
                        c1acaDQ26.LJFF = z4;
                    }
                    AObjectS375S0100000_33 aObjectS375S0100000_33 = this.LIZ.LLJLIL;
                    if (aObjectS375S0100000_33 != null) {
                        aObjectS375S0100000_33.invoke(Boolean.valueOf(z4));
                    }
                    FeedLiveViewHolderVM feedLiveViewHolderVM2 = this.LIZ;
                    if (z2) {
                        str = "abnormal";
                    } else {
                        str = "normal";
                    }
                    feedLiveViewHolderVM2.LLIZLLLIL = str;
                    feedLiveViewHolderVM2.LLJJJJLIIL.setValue(new Pair<>(Boolean.valueOf(z7), Boolean.valueOf(z4)));
                    if (z2) {
                        this.LIZ.LLJL.setValue(new C1AAV(filterInfoData, 3));
                    }
                    C1ACA c1acaDQ27 = this.LIZ.DQ2();
                    if (c1acaDQ27 != null && c1acaDQ27.LJFF) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    String str2 = null;
                    if (!z6) {
                        C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderVM", "checkLiveAlive: isFinish");
                        C1ACA c1acaDQ28 = this.LIZ.DQ2();
                        if (c1acaDQ28 != null) {
                            c1acaDQ28.LJI = EnumC1154970gA3.CHECK_ALIVE_STATE_END;
                        }
                        this.LIZ.LLJJJIL.setValue(Boolean.FALSE);
                        if (this.LIZ.OQ2("end")) {
                            C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderVM", "handleCheckAlive: reverse REMOVE_LIVE_END");
                            return;
                        }
                        if (z && ((c1acaDQ24 = this.LIZ.DQ2()) == null || !c1acaDQ24.LJII)) {
                            this.LIZ.CQ2(null, false);
                        }
                        if (!z2) {
                            return;
                        }
                        this.LIZ.LLJJIJI.removeMessages(102);
                        this.LIZ.NQ2();
                        Message messageObtain = Message.obtain(this.LIZ.LLJJIJI, 102);
                        messageObtain.obj = new C0J76("end", 2131842905, 12);
                        C786410Ut5.LJLJLJ(this.LIZ.LLJJIJI, messageObtain, 500L);
                        return;
                    }
                    FeedLiveViewHolderVM feedLiveViewHolderVM3 = this.LIZ;
                    boolean z8 = z3;
                    if (filterInfoData != null) {
                        C1ACA c1acaDQ29 = feedLiveViewHolderVM3.DQ2();
                        if (c1acaDQ29 == null || (liveRoomStruct2 = c1acaDQ29.LIZJ) == null || !filterInfoData.isFiltered) {
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("checkLiveAlive: filtered reason ");
                        String str3 = filterInfoData.reason;
                        if (str3 == null) {
                            str3 = "";
                        }
                        sbLIZ.append(str3);
                        C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderVM", C2188811AlT.LIZIZ(sbLIZ));
                        String str4 = filterInfoData.reason;
                        if (str4 == null) {
                            return;
                        }
                        int iHashCode = str4.hashCode();
                        if (iHashCode != 3524) {
                            if (iHashCode != 106440182) {
                                if (iHashCode != 1567246465 || !str4.equals("nostream")) {
                                    return;
                                }
                                C1ACA c1acaDQ210 = feedLiveViewHolderVM3.DQ2();
                                if (c1acaDQ210 != null) {
                                    c1acaDQ210.LJI = EnumC1154970gA3.CHECK_ALIVE_STATE_NO_STREAM;
                                }
                                if (z8) {
                                    if (feedLiveViewHolderVM3.OQ2("nostream")) {
                                        C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderVM", "handleCheckAlive: reverse REMOVE_NO_STREAM-preBind");
                                        return;
                                    }
                                    C1ACA c1acaDQ211 = feedLiveViewHolderVM3.DQ2();
                                    if (c1acaDQ211 == null || c1acaDQ211.LJII) {
                                        return;
                                    }
                                    feedLiveViewHolderVM3.CQ2("disconnected", true);
                                    return;
                                }
                                feedLiveViewHolderVM3.LLJL.setValue(new C1AAV(filterInfoData, 1));
                                if (feedLiveViewHolderVM3.OQ2("nostream")) {
                                    C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderVM", "handleCheckAlive: reverse REMOVE_NO_STREAM");
                                    return;
                                }
                                feedLiveViewHolderVM3.LLJJIJI.removeMessages(102);
                                feedLiveViewHolderVM3.LLJILLL = "disconnected";
                                Message messageObtain2 = Message.obtain(feedLiveViewHolderVM3.LLJJIJI, 102);
                                messageObtain2.obj = new C0J76("disconnected", 2131840997, 12);
                                C786410Ut5.LJLJLJ(feedLiveViewHolderVM3.LLJJIJI, messageObtain2, 500L);
                                return;
                            }
                            if (!str4.equals("pause")) {
                                return;
                            }
                            C1ACA c1acaDQ212 = feedLiveViewHolderVM3.DQ2();
                            if (c1acaDQ212 != null) {
                                c1acaDQ212.LJI = EnumC1154970gA3.CHECK_ALIVE_STATE_PAUSE;
                            }
                            if (z8) {
                                if (feedLiveViewHolderVM3.OQ2("pause")) {
                                    C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderVM", "handleCheckAlive: reverse REMOVE_PAUSE-preBind");
                                    return;
                                } else {
                                    if (liveRoomStruct2.isShow) {
                                        return;
                                    }
                                    feedLiveViewHolderVM3.CQ2("paused", true);
                                    return;
                                }
                            }
                            feedLiveViewHolderVM3.LLJL.setValue(new C1AAV(filterInfoData, 2));
                            if (feedLiveViewHolderVM3.OQ2("pause")) {
                                C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderVM", "handleCheckAlive: reverse REMOVE_PAUSE");
                                return;
                            }
                            feedLiveViewHolderVM3.LLJILLL = "paused";
                            C1ACA c1acaDQ213 = feedLiveViewHolderVM3.DQ2();
                            if (c1acaDQ213 == null || c1acaDQ213.LJIIZILJ) {
                                return;
                            }
                            C1ACA c1acaDQ214 = feedLiveViewHolderVM3.DQ2();
                            if (c1acaDQ214 != null && c1acaDQ214.LJIILLIIL) {
                                return;
                            }
                            C1ACA c1acaDQ215 = feedLiveViewHolderVM3.DQ2();
                            if (c1acaDQ215 != null) {
                                str2 = c1acaDQ215.LJ;
                            }
                            if (!C2093608Ic.LIZJ(str2, "homepage_hot")) {
                                return;
                            }
                            feedLiveViewHolderVM3.LLJJIJI.removeMessages(102);
                            Message messageObtain3 = Message.obtain(feedLiveViewHolderVM3.LLJJIJI, 102);
                            messageObtain3.obj = new C0J76(2131840998, "paused", true, false);
                            C786410Ut5.LJLJLJ(feedLiveViewHolderVM3.LLJJIJI, messageObtain3, 2000L);
                            return;
                        }
                        if (!str4.equals("nr")) {
                            return;
                        }
                        C1ACA c1acaDQ216 = feedLiveViewHolderVM3.DQ2();
                        if (c1acaDQ216 != null) {
                            c1acaDQ216.LJI = EnumC1154970gA3.CHECK_ALIVE_STATE_NR;
                        }
                        if (feedLiveViewHolderVM3.OQ2("nr")) {
                            C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderVM", "handleCheckAlive: reverse REMOVE_NOT_RECOMMEND");
                            return;
                        }
                        C1ACA c1acaDQ217 = feedLiveViewHolderVM3.DQ2();
                        if ((c1acaDQ217 != null && (aweme = c1acaDQ217.LIZIZ) != null && aweme.isAd()) || liveRoomStruct2.isShow || !z8) {
                            return;
                        }
                        feedLiveViewHolderVM3.CQ2("nr", true);
                        return;
                    }
                    feedLiveViewHolderVM3.getClass();
                }
            });
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void MQ2(InterfaceC480520Iss interfaceC480520Iss, EnterRoomConfig enterRoomConfig, String str, String str2, LiveRoomStruct liveRoomStruct, Context context) {
        View videoView;
        ViewGroup.LayoutParams layoutParams;
        C1A7N c1a7n;
        Integer numLIZJ;
        C1A7N c1a7n2;
        Integer numLIZLLL;
        C1A7N c1a7n3;
        Pair<Integer, Integer> pairLIZIZ;
        int iLIZJ;
        float fFloatValue;
        Float f;
        LiveRoomStruct liveRoomStruct2;
        UrlModel avatarLarger;
        User user;
        C1A7N c1a7n4;
        C1ACA c1acaDQ2 = DQ2();
        if (c1acaDQ2 != null) {
            c1acaDQ2.LLFII = true;
            c1acaDQ2.LLFFF = true;
        }
        C1ACA c1acaDQ22 = DQ2();
        if (c1acaDQ22 != null && (c1a7n4 = c1acaDQ22.LJLILLLLZI) != null) {
            c1a7n4.LJ = true;
        }
        interfaceC480520Iss.LJJJJI(false);
        enterRoomConfig.mStreamData.sharePullStreamData = str;
        enterRoomConfig.mRoomsData.warmUpPlayerTag = str2;
        C1440005kM.LIZ(new IEvent() { // from class: X.0T0G
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        if (!RemoveSurveyAfterScrolledSetting.INSTANCE.getValue()) {
            this.LLJLILLLLZIIL.setValue(Boolean.FALSE);
            C1440005kM.LIZ(new C466460IQy());
        }
        C1ACA c1acaDQ23 = DQ2();
        if (c1acaDQ23 != null && (liveRoomStruct2 = c1acaDQ23.LIZJ) != null) {
            UrlModel urlModel = liveRoomStruct2.roomCover;
            if (urlModel != null) {
                avatarLarger = new UrlModel();
                avatarLarger.setUrlList(urlModel.getUrlList());
                avatarLarger.setUri(urlModel.getUri());
            } else {
                avatarLarger = liveRoomStruct2.roomCover;
                if (avatarLarger != null || ((user = liveRoomStruct2.owner) != null && (avatarLarger = user.getAvatarLarger()) != null)) {
                }
            }
            List<String> urlList = avatarLarger.getUrlList();
            if (urlList != null) {
                enterRoomConfig.mFeedCoverData.urlList = urlList;
            }
        }
        if (this.LLLIIIIL) {
            enterRoomConfig.mFeedCoverData.immersiveMarginTop = C497820Jfg.LIZJ(context);
        }
        GameLiveOptSmoothEnterRoomSetting gameLiveOptSmoothEnterRoomSetting = GameLiveOptSmoothEnterRoomSetting.INSTANCE;
        if (gameLiveOptSmoothEnterRoomSetting.isOptLandscape()) {
            EnterRoomConfig.FeedCoverData feedCoverData = enterRoomConfig.mFeedCoverData;
            C1ACA c1acaDQ24 = DQ2();
            if (c1acaDQ24 != null && (f = c1acaDQ24.LJIJ) != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            feedCoverData.gameCurrentRatio = fFloatValue;
        }
        if (gameLiveOptSmoothEnterRoomSetting.isOptPortrait()) {
            EnterRoomConfig.FeedCoverData feedCoverData2 = enterRoomConfig.mFeedCoverData;
            if (this.LLLIIIIL) {
                iLIZJ = C1389340mG4.LIZJ(context, null).LIZJ - C497820Jfg.LIZJ(context);
            } else {
                iLIZJ = C1389340mG4.LIZJ(context, null).LIZJ;
            }
            feedCoverData2.screenHeight = iLIZJ;
        }
        enterRoomConfig.mFeedCoverData.statusBarHeight = C497820Jfg.LIZJ(context);
        EnterRoomConfig.FeedCoverData feedCoverData3 = enterRoomConfig.mFeedCoverData;
        feedCoverData3.navigationBarHeight = C14LC.LJIILLIIL;
        feedCoverData3.enterPreviewSmooth = true;
        feedCoverData3.enterPreviewSmoothWithFirstFrame = interfaceC480520Iss.isPlaying();
        C1ACA c1acaDQ25 = DQ2();
        if (c1acaDQ25 != null && (c1a7n3 = c1acaDQ25.LJLILLLLZI) != null && (pairLIZIZ = c1a7n3.LIZIZ()) != null) {
            enterRoomConfig.mFeedCoverData.playerContainerSize = new Pair<>(pairLIZIZ.getFirst(), pairLIZIZ.getSecond());
        }
        C1ACA c1acaDQ26 = DQ2();
        if (c1acaDQ26 != null && (c1a7n2 = c1acaDQ26.LJLILLLLZI) != null && (numLIZLLL = c1a7n2.LIZLLL()) != null) {
            enterRoomConfig.mFeedCoverData.smoothEnterStreamGravity = Integer.valueOf(numLIZLLL.intValue());
        }
        C1ACA c1acaDQ27 = DQ2();
        if (c1acaDQ27 != null && (c1a7n = c1acaDQ27.LJLILLLLZI) != null && (numLIZJ = c1a7n.LIZJ()) != null) {
            enterRoomConfig.mFeedCoverData.smoothEnterContainerGravity = Integer.valueOf(numLIZJ.intValue());
        }
        C1ACA c1acaDQ28 = DQ2();
        if (c1acaDQ28 != null && c1acaDQ28.LJLILLLLZI != null && (videoView = interfaceC480520Iss.getVideoView()) != null && (layoutParams = videoView.getLayoutParams()) != null && (layoutParams instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            enterRoomConfig.mFeedCoverData.smoothEnterStreamMargin = new Rect(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
        }
        NextLiveData<C998890c6J> nextLiveData = this.LLJJJJ;
        LiveCadSmoothExitSetting liveCadSmoothExitSetting = LiveCadSmoothExitSetting.INSTANCE;
        nextLiveData.setValue(new C998890c6J(true, liveCadSmoothExitSetting.getPreviewCardDuration()));
        C1440005kM.LIZ(new C083S(false, liveCadSmoothExitSetting.getPreviewCardDuration()));
        interfaceC480520Iss.LJJIJIIJI(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0af9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void KQ2(boolean r27, android.content.Context r28, java.lang.String r29, boolean r30, boolean r31, boolean r32, int r33, X.C188R r34, boolean r35, java.lang.Integer r36) {
        /*
            Method dump skipped, instruction units count: 3294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM.KQ2(boolean, android.content.Context, java.lang.String, boolean, boolean, boolean, int, X.188R, boolean, java.lang.Integer):void");
    }
}
