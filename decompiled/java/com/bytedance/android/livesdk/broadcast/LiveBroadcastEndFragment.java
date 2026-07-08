package com.bytedance.android.livesdk.broadcast;

import X.C011Z;
import X.C098200Yq;
import X.C0IEN;
import X.C0IJR;
import X.C0IJT;
import X.C0IK0;
import X.C0IKY;
import X.C0IP3;
import X.C0IR5;
import X.C0J0Q;
import X.C0J39;
import X.C0J3M;
import X.C0UKZ;
import X.C0URJ;
import X.C0UWE;
import X.C1087000eOQ;
import X.C10JP;
import X.C1119850fFP;
import X.C1119920fFW;
import X.C1133830fbx;
import X.C1148310fzJ;
import X.C1161920gLG;
import X.C1163660gO4;
import X.C11NZ;
import X.C11S5;
import X.C1338270kvh;
import X.C13LQ;
import X.C13LZ;
import X.C1548820qPI;
import X.C158B;
import X.C15CZ;
import X.C1685300txQ;
import X.C168R;
import X.C168Y;
import X.C1743710vTd;
import X.C1770906wd;
import X.C1871910yoP;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AKR;
import X.C20441214yg;
import X.C20480615Ca;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C262100zr;
import X.C294780Bgy;
import X.C354201Zc;
import X.C446980Hfs;
import X.C473410IhP;
import X.C474500IjA;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C504210Jpz;
import X.C520010KaN;
import X.C531650Kt9;
import X.C748880TZe;
import X.C749400TaU;
import X.C771340UNo;
import X.C774610Ua3;
import X.C781270Ukn;
import X.C782110Um9;
import X.C782530Ump;
import X.C782540Umq;
import X.C782550Umr;
import X.C782580Umu;
import X.C782630Umz;
import X.C783370UoB;
import X.C783380UoC;
import X.C786410Ut5;
import X.C930620aKC;
import X.C930640aKE;
import X.C930670aKH;
import X.C930690aKJ;
import X.C930930aKh;
import X.C930940aKi;
import X.C931100aKy;
import X.C931170aL5;
import X.C931200aL8;
import X.EnumC500290Jjf;
import X.InterfaceC1059280dfi;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1541990qEH;
import X.InterfaceC1871920yoQ;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC770380UJw;
import X.InterfaceC782600Umw;
import X.InterfaceC782610Umx;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.AcS495S0100000_12;
import Y.AfS148S0200000_12;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastEndPageSchemaOpenPanelEvent;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.CaptchaCheckFailedChannel;
import com.bytedance.android.livesdk.dataChannel.NotifyRemoveLiveBroadcastFragmentEvent;
import com.bytedance.android.livesdk.dataChannel.NotifyServerLiveEndSucceedEvent;
import com.bytedance.android.livesdk.dataChannel.PerceptionDialogChannel;
import com.bytedance.android.livesdk.dataChannel.PunishInfoChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTnsSafetyTools;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEndPageHighlightPreloadEnable;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostBackToInnerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookUGCAISetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.PlaybookRepublishSuccessEvent;
import com.bytedance.android.livesdk.model.PlaybookUnPublishSuccessEvent;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.performance.memory.BroadcastMemoryCleanersEnableSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.model.LivePreloadHighlightVideoModel;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBroadcastEndFragment extends BaseFragment implements C1AKR, InterfaceC1059280dfi, InterfaceC1141530foN, InterfaceC782600Umw, C0IP3 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjHELIOSKCswKTY4ZwM6PiAOOyAyLCYtOjsWJiEKOy40JSAiPQ==";
    public C15CZ LL;
    public C20480615Ca LLILLJJLI;
    public FrameLayout LLILLL;
    public ImageView LLILZ;
    public DataChannel LLILZIL;
    public Room LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJILJIL;
    public PerceptionDialogInfo LLJILJILJ;
    public PunishEventInfo LLJILLL;
    public Integer LLJJ;
    public Integer LLJJI;
    public boolean LLJJIII;
    public String LLJJIJI;

    @Override // X.C1AKR
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
    }

    public final ImageView NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bnn) : null;
            this.LLILZ = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final C15CZ OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h4w) : null;
            this.LL = (C15CZ) viewFindViewById;
        }
        return (C15CZ) viewFindViewById;
    }

    public final C20480615Ca PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h4x) : null;
            this.LLILLJJLI = (C20480615Ca) viewFindViewById;
        }
        return (C20480615Ca) viewFindViewById;
    }

    public final void SR() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        String str = (String) C782630Umz.LIZJ.getValue();
        Context context = getContext();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVn2 = context != null ? C781270Ukn.LJIILIIL().Vn2(context, str, null, "live_broadcast_end", true, new AwS626S0100000_12(this, 36)) : null;
        this.LLJILJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVn2;
        boolean z = true;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVn2 != null && C0J39.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVn2) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJILJIL) != null) {
            C0J39.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        try {
            View viewFindViewById = this.LLILLL;
            if (viewFindViewById == null) {
                View view = getView();
                viewFindViewById = view != null ? view.findViewById(R.id.ac7) : null;
                this.LLILLL = (FrameLayout) viewFindViewById;
            }
            ((FrameLayout) viewFindViewById).addView(this.LLJILJIL, -1, -1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ImageView imageViewNR = NR();
        if (imageViewNR != null) {
            C786410Ut5.Q7(imageViewNR, new ACListenerS147S0100000_12(this, 285));
        }
        ImageView imageViewNR2 = NR();
        if (imageViewNR2 != null) {
            C786410Ut5.LJZI(8, imageViewNR2);
        }
        try {
            boolean zZR = ZR();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (C500260Jjc.LJJJI((Boolean) dataChannelGlobal.gg0(C931170aL5.class))) {
                WR();
                dataChannelGlobal.JQ2(C931170aL5.class, Boolean.FALSE);
            } else {
                z = false;
            }
            if (zZR || z) {
                return;
            }
            final C0IKY c0iky = new C0IKY(null);
            Map<String, String> map = c0iky.LIZLLL;
            Room room = this.LLILZLL;
            map.put("room_id", String.valueOf(room != null ? Long.valueOf(room.getId()) : null));
            Map<String, String> map2 = c0iky.LIZLLL;
            Room room2 = this.LLILZLL;
            map2.put("anchor_id", String.valueOf(room2 != null ? Long.valueOf(room2.getOwnerUserId()) : null));
            Map<String, String> map3 = c0iky.LIZLLL;
            C0IK0 c0ik0 = C0IK0.BroadcastEnd;
            map3.put("trigger_method", c0ik0.enterMethod);
            c0iky.LIZLLL.put("popup_type", "skippable");
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).tryRequestAndShowAceBindPhoneDialog(getActivity(), c0ik0, c0iky, new C10JP() { // from class: X.0IJt
                @Override // X.C10JP
                public final /* synthetic */ void LIZIZ() {
                }

                @Override // X.C10JP
                public final void onDismiss() {
                }

                @Override // X.C10JP
                public final void onShow() {
                    C464570IJr.LIZ(c0iky, C0IK0.BroadcastEnd.enterMethod);
                    C464570IJr.LIZJ(c0iky);
                }

                @Override // X.C10JP
                public final void LIZ(String str2) {
                    c0iky.LIZLLL.put("click_status", str2);
                    C464570IJr.LIZIZ(c0iky);
                }
            });
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final void WR() {
        LiveDialog liveDialogLIZ;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Integer num = (Integer) dataChannelGlobal.gg0(C930690aKJ.class);
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) dataChannelGlobal.gg0(C930670aKH.class);
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        if (C13LQ.LJLIIL(new Integer[]{30001, 50002, 30003}).contains(Integer.valueOf(iIntValue))) {
            C782110Um9 c782110Um9 = new C782110Um9(getContext());
            c782110Um9.LJIIZILJ(2131842204);
            c782110Um9.LJII(2131842203);
            c782110Um9.LJIILIIL(2131842011, new AcS495S0100000_12(this, 30));
            c782110Um9.LJIIJ(2131843678, new AcS495S0100000_12(this, 31));
            c782110Um9.LJIILL = false;
            liveDialogLIZ = c782110Um9.LIZ();
        } else if (iIntValue == 30003001) {
            C782110Um9 c782110Um92 = new C782110Um9(getContext());
            c782110Um92.LJIIZILJ(2131843717);
            c782110Um92.LJII(2131843716);
            c782110Um92.LJIILIIL(2131843701, new AcS495S0100000_12(this, 32));
            c782110Um92.LJIILL = false;
            liveDialogLIZ = c782110Um92.LIZ();
        } else if (iIntValue == 9) {
            C782110Um9 c782110Um93 = new C782110Um9(getContext());
            c782110Um93.LJIIZILJ(2131842204);
            c782110Um93.LJII(2131851978);
            c782110Um93.LJIILIIL(2131843701, new AcS495S0100000_12(this, 29));
            c782110Um93.LJIILL = false;
            liveDialogLIZ = c782110Um93.LIZ();
        } else if (C0UWE.LIZIZ(iIntValue, iIntValue2)) {
            C782110Um9 c782110Um94 = new C782110Um9(getContext());
            c782110Um94.LJIIZILJ(2131842204);
            c782110Um94.LJII(2131852228);
            c782110Um94.LJIILIIL(2131843701, new AcS495S0100000_12(this, 28));
            c782110Um94.LJIILL = false;
            liveDialogLIZ = c782110Um94.LIZ();
        } else {
            if (!C0UWE.LJ(iIntValue, iIntValue2)) {
                return;
            }
            C782110Um9 c782110Um95 = new C782110Um9(getContext());
            c782110Um95.LJIIZILJ(2131842204);
            c782110Um95.LJII(2131852229);
            c782110Um95.LJIILIIL(2131843701, new AcS495S0100000_12(this, 33));
            c782110Um95.LJIILL = false;
            liveDialogLIZ = c782110Um95.LIZ();
        }
        C786410Ut5.E4(liveDialogLIZ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ttlive_video_stream_abnormal_end_popup_show");
        Room room = this.LLILZLL;
        c474500IjALIZ.LJJII(room != null ? Long.valueOf(room.getId()) : null, "room_id");
        Room room2 = this.LLILZLL;
        c474500IjALIZ.LJJII(room2 != null ? Long.valueOf(room2.getOwnerUserId()) : null, "anchor_id");
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930690aKJ.class), "error_code");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930670aKH.class), "livecore_error_code");
        c474500IjALIZ.LJJIIZI((Map) dataChannelGlobal.gg0(C930640aKE.class));
        c474500IjALIZ.LJJII(String.valueOf(C158B.LIZJ()), "show_time");
        c474500IjALIZ.LIZ();
    }

    public final boolean ZR() {
        Spannable spannableLJIILIIL;
        Spannable spannableLJIILIIL2;
        Spannable spannableLJIILIIL3;
        Spannable spannableLJIILIIL4;
        LiveDialog liveDialogLIZ;
        Long lValueOf;
        Text text;
        Text text2;
        String str;
        Text text3;
        String str2;
        Text text4;
        Text text5;
        if (this.LLJILJILJ != null && getContext() != null) {
            Spannable spannable = C1133830fbx.LIZ;
            PerceptionDialogInfo perceptionDialogInfo = this.LLJILJILJ;
            String str3 = null;
            if ((perceptionDialogInfo == null || perceptionDialogInfo.title == null) ? false : true) {
                if (perceptionDialogInfo != null) {
                    text4 = perceptionDialogInfo.title;
                    text5 = perceptionDialogInfo.title;
                } else {
                    text4 = null;
                    text5 = null;
                }
                spannableLJIILIIL = C1133830fbx.LJIILIIL(text4, text5.defaultPattern);
                C786410Ut5.o2(spannableLJIILIIL, new ForegroundColorSpan(C446980Hfs.LIZ(getContext(), R.color.da)), 0, spannableLJIILIIL.length(), 18);
                C1119920fFW.LJ(getContext(), spannableLJIILIIL, 0, spannableLJIILIIL.length(), 33, 2, OppoPermissionPopupMaskDelayExp.DEFAULT);
            } else {
                spannableLJIILIIL = spannable;
            }
            PerceptionDialogInfo perceptionDialogInfo2 = this.LLJILJILJ;
            if (perceptionDialogInfo2 == null || perceptionDialogInfo2.subTitle == null) {
                spannableLJIILIIL2 = spannable;
            } else {
                if (perceptionDialogInfo2 != null) {
                    text3 = perceptionDialogInfo2.subTitle;
                    Text text6 = perceptionDialogInfo2.subTitle;
                    if (text6 != null) {
                        str2 = text6.defaultPattern;
                    }
                    spannableLJIILIIL2 = C1133830fbx.LJIILIIL(text3, str2);
                    C1119920fFW.LJIIIZ(getContext(), spannableLJIILIIL2, 0, spannableLJIILIIL2.length(), 33, 6);
                } else {
                    text3 = null;
                }
                str2 = null;
                spannableLJIILIIL2 = C1133830fbx.LJIILIIL(text3, str2);
                C1119920fFW.LJIIIZ(getContext(), spannableLJIILIIL2, 0, spannableLJIILIIL2.length(), 33, 6);
            }
            PerceptionDialogInfo perceptionDialogInfo3 = this.LLJILJILJ;
            if (perceptionDialogInfo3 == null || perceptionDialogInfo3.adviceActionText == null) {
                spannableLJIILIIL3 = spannable;
            } else {
                if (perceptionDialogInfo3 != null) {
                    text2 = perceptionDialogInfo3.adviceActionText;
                    Text text7 = perceptionDialogInfo3.adviceActionText;
                    if (text7 != null) {
                        str = text7.defaultPattern;
                    }
                    spannableLJIILIIL3 = C1133830fbx.LJIILIIL(text2, str);
                    C786410Ut5.o2(spannableLJIILIIL3, new ForegroundColorSpan(C446980Hfs.LIZ(getContext(), R.color.f569bc)), 0, spannableLJIILIIL3.length(), 18);
                    C1119920fFW.LJ(getContext(), spannableLJIILIIL3, 0, spannableLJIILIIL3.length(), 33, 6, 500);
                } else {
                    text2 = null;
                }
                str = null;
                spannableLJIILIIL3 = C1133830fbx.LJIILIIL(text2, str);
                C786410Ut5.o2(spannableLJIILIIL3, new ForegroundColorSpan(C446980Hfs.LIZ(getContext(), R.color.f569bc)), 0, spannableLJIILIIL3.length(), 18);
                C1119920fFW.LJ(getContext(), spannableLJIILIIL3, 0, spannableLJIILIIL3.length(), 33, 6, 500);
            }
            int iLIZ = C446980Hfs.LIZ(getContext(), R.color.df);
            PerceptionDialogInfo perceptionDialogInfo4 = this.LLJILJILJ;
            if (perceptionDialogInfo4 == null || perceptionDialogInfo4.defaultActionText == null) {
                spannableLJIILIIL4 = spannable;
            } else {
                if (perceptionDialogInfo4 != null) {
                    text = perceptionDialogInfo4.defaultActionText;
                    Text text8 = perceptionDialogInfo4.defaultActionText;
                    if (text8 != null) {
                        str3 = text8.defaultPattern;
                    }
                } else {
                    text = null;
                }
                spannableLJIILIIL4 = C1133830fbx.LJIILIIL(text, str3);
                C786410Ut5.o2(spannableLJIILIIL4, new ForegroundColorSpan(iLIZ), 0, spannableLJIILIIL4.length(), 18);
                C1119920fFW.LJ(getContext(), spannableLJIILIIL4, 0, spannableLJIILIIL4.length(), 33, 6, 400);
            }
            if (!Intrinsics.LJFF(spannableLJIILIIL3, spannable) && !Intrinsics.LJFF(spannableLJIILIIL4, spannable)) {
                C782110Um9 c782110Um9 = new C782110Um9(getContext());
                c782110Um9.LJIIIZ(spannableLJIILIIL2);
                c782110Um9.LJIILL(spannableLJIILIIL3, new AcS495S0100000_12(this, 7));
                c782110Um9.LJIILLIIL(spannableLJIILIIL4, new AcS495S0100000_12(this, 8));
                c782110Um9.LJIILL = false;
                liveDialogLIZ = c782110Um9.LIZ();
            } else if (Intrinsics.LJFF(spannableLJIILIIL3, spannable) && !Intrinsics.LJFF(spannableLJIILIIL4, spannable)) {
                C786410Ut5.o2(spannableLJIILIIL4, new ForegroundColorSpan(C446980Hfs.LIZ(getContext(), R.color.da)), 0, spannableLJIILIIL4.length(), 18);
                C1119920fFW.LJ(getContext(), spannableLJIILIIL4, 0, spannableLJIILIIL4.length(), 33, 6, 500);
                C782110Um9 c782110Um92 = new C782110Um9(getContext());
                c782110Um92.LJIIIZ(spannableLJIILIIL2);
                c782110Um92.LJIIJJI(spannableLJIILIIL4, new AcS495S0100000_12(this, 9));
                c782110Um92.LJIILL = false;
                liveDialogLIZ = c782110Um92.LIZ();
            }
            if (liveDialogLIZ != null) {
                PerceptionDialogInfo perceptionDialogInfo5 = this.LLJILJILJ;
                if (perceptionDialogInfo5 != null && (lValueOf = Long.valueOf(perceptionDialogInfo5.iconType)) != null && lValueOf.longValue() != 0) {
                    Integer numLIZ = C1770906wd.LIZ(lValueOf.longValue());
                    if (numLIZ != null) {
                        int iIntValue = numLIZ.intValue();
                        C783370UoB c783370UoB = C783380UoC.LIZ;
                        Context context = liveDialogLIZ.getContext();
                        c783370UoB.getClass();
                        liveDialogLIZ.LJLJLJ(C783370UoB.LIZ(iIntValue, context));
                        boolean zLIZIZ = c783370UoB.LIZIZ(iIntValue, false);
                        liveDialogLIZ.LLJLILLLLZIIL = zLIZIZ;
                        LiveIconView liveIconView = liveDialogLIZ.LLJILLL;
                        if (liveIconView != null) {
                            liveIconView.setIconAutoMirrored(zLIZIZ);
                        }
                    }
                    liveDialogLIZ.LLJLILLLLZIIL = false;
                    LiveIconView liveIconView2 = liveDialogLIZ.LLJILLL;
                    if (liveIconView2 != null) {
                        liveIconView2.setIconAutoMirrored(false);
                    }
                }
                if (!Intrinsics.LJFF(spannableLJIILIIL, spannable)) {
                    liveDialogLIZ.setTitle(spannableLJIILIIL);
                }
                C786410Ut5.E4(liveDialogLIZ);
                VR("show", "", this.LLJILLL, this.LLJILJILJ);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        RR("close_method");
    }

    @Override // X.InterfaceC782600Umw
    public final void t8() {
        if (this.LLJJIII) {
            return;
        }
        this.LLJJIII = true;
        DataChannelGlobal.LLILZ.GQ2(NotifyRemoveLiveBroadcastFragmentEvent.class);
    }

    public LiveBroadcastEndFragment() {
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        if (lValueOf != null) {
            lValueOf.longValue();
            C782530Ump.LIZ = lValueOf.longValue();
        }
    }

    @Override // X.InterfaceC782600Umw
    public final void AA() {
        SR();
        this.LLIZ = SystemClock.elapsedRealtime();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJILJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
            if (kitView != null) {
                kitView.onShow();
            } else {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJILJIL;
                C1743710vTd.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getSparkContext() : null);
            }
            C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "container_appear", new JSONObject());
        }
    }

    @Override // X.C1AKR
    public final boolean onBackPressed() {
        C20480615Ca c20480615CaPR = PR();
        if (c20480615CaPR != null && c20480615CaPR.getVisibility() == 0) {
            C20480615Ca c20480615CaPR2 = PR();
            if (c20480615CaPR2 != null) {
                c20480615CaPR2.j0(false);
            }
            return true;
        }
        C15CZ c15czOR = OR();
        if (c15czOR == null || c15czOR.getVisibility() != 0) {
            RR("back_press");
            return true;
        }
        C15CZ c15czOR2 = OR();
        if (c15czOR2 != null) {
            c15czOR2.e0(false);
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        int i = C771340UNo.LIZ;
        ((ArrayList) C771340UNo.LIZJ).remove(C0J3M.LIVE_HOST_END);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.HQ2(PerceptionDialogChannel.class, new PerceptionDialogInfo());
        dataChannelGlobal.HQ2(PunishInfoChannel.class, new PunishEventInfo());
        dataChannelGlobal.JQ2(C931170aL5.class, Boolean.FALSE);
        dataChannelGlobal.JQ2(C930690aKJ.class, 0);
        dataChannelGlobal.JQ2(C930670aKH.class, 0);
        dataChannelGlobal.JQ2(C930640aKE.class, null);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJILJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        C774610Ua3.LL.LLLZLZ();
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("live_end_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LJIILL("video_type");
        c474500IjALIZIZ.LJIILJJIL("live_detail");
        c474500IjALIZIZ.LJJII(String.valueOf(this.LLIZLLLIL), "duration");
        c474500IjALIZIZ.LIZ();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (((IGameService) C1161920gLG.LIZJ(IGameService.class)).yP1()) {
            Room room = this.LLILZLL;
            if ((room != null ? room.getStreamType() : null) == LiveMode.SCREEN_RECORD) {
                C1548820qPI.LJIIIIZZ("screen_anchor_diagnose", this);
            }
        }
        if (LiveEndPageHighlightPreloadEnable.INSTANCE.enable()) {
            C1548820qPI.LJIIIIZZ("live_finishpage_highlight_preload", this);
        }
        Long l = -1L;
        if (l != null) {
            l.longValue();
            C782530Ump.LIZ = l.longValue();
        }
        Long l2 = -1L;
        if (l2 != null) {
            l2.longValue();
            C782530Ump.LIZIZ = l2.longValue();
        }
        LiveMonitorSampleSetting.INSTANCE.release();
        C1163660gO4.LIZ.getClass();
        C1163660gO4.LJ(true);
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).VW1();
        ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).zr0(C0J0Q.ANCHOR);
        ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).onDestroy();
        if (LiveBroadcastTnsSafetyTools.enableSolutionB()) {
            DataChannel dataChannel = this.LLILZIL;
            if (dataChannel != null) {
                dataChannel.LLILZ = null;
                dataChannel.AQ2();
            }
            dataChannelGlobal.zQ2(this);
        }
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI != null) {
            ((C0URJ) c1119850fFP.LJJI).LIZ = false;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.SX0(C749400TaU.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        super.onPause();
        CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList = C782550Umr.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("schedulePreloadOnIdle: cancelAndPreloadNow scheduledIdleHandler null: ");
        sbLIZ.append(C782550Umr.LJ == null);
        C20441214yg.LIZIZ("BroadcastMemoryCleaners", C2188811AlT.LIZIZ(sbLIZ));
        C782580Umu c782580Umu = C782550Umr.LJ;
        if (c782580Umu != null) {
            Looper.getMainLooper().getQueue().removeIdleHandler(c782580Umu);
            C782550Umr.LJ = null;
        }
        C782540Umq.LIZ();
        C15CZ c15czOR = OR();
        if (c15czOR != null) {
            try {
                MediaPlayer mediaPlayer3 = c15czOR.LLJILLL;
                if (mediaPlayer3 != null && mediaPlayer3.isPlaying() && (mediaPlayer = c15czOR.LLJILLL) != null) {
                    mediaPlayer.pause();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C20480615Ca c20480615CaPR = PR();
        if (c20480615CaPR != null) {
            try {
                MediaPlayer mediaPlayer4 = c20480615CaPR.LLJILJILJ;
                if (mediaPlayer4 != null && mediaPlayer4.isPlaying() && (mediaPlayer2 = c20480615CaPR.LLJILJILJ) != null) {
                    mediaPlayer2.pause();
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        this.LLIZLLLIL += SystemClock.elapsedRealtime() - this.LLIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJILJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
            if (kitView != null) {
                kitView.onHide();
            }
            C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "container_disappear", new JSONObject());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC770380UJw interfaceC770380UJw;
        super.onResume();
        this.LLIZ = SystemClock.elapsedRealtime();
        CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList = C782550Umr.LIZLLL;
        if (BroadcastMemoryCleanersEnableSetting.isPreloadAfterLiveEnabled()) {
            C782580Umu c782580Umu = C782580Umu.LL;
            C782550Umr.LJ = c782580Umu;
            C20441214yg.LIZIZ("BroadcastMemoryCleaners", "schedulePreloadOnIdle: add idle handler");
            C786410Ut5.f3(c782580Umu, Looper.getMainLooper().getQueue());
        }
        C15CZ c15czOR = OR();
        if (c15czOR != null && !c15czOR.LLJJ) {
            try {
                c15czOR.LLJJ = false;
                MediaPlayer mediaPlayer = c15czOR.LLJILLL;
                if (mediaPlayer != null) {
                    mediaPlayer.start();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C20480615Ca c20480615CaPR = PR();
        if (c20480615CaPR != null) {
            if (!c20480615CaPR.LLJILLL) {
                try {
                    c20480615CaPR.LLJILLL = false;
                    MediaPlayer mediaPlayer2 = c20480615CaPR.LLJILJILJ;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.start();
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            c20480615CaPR.e0();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJILJIL;
        InterfaceC214902198i interfaceC214902198i = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
            if (kitView != null) {
                kitView.onShow();
            } else {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJILJIL;
                C1743710vTd.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getSparkContext() : null);
            }
            C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, "container_appear", new JSONObject());
        }
        Context context = getContext();
        ComponentCallbacks2 componentCallbacks2LJFF = context != null ? SAFExtensionKt.LJFF(context) : null;
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            Fragment parentFragment = this;
            while (true) {
                if (!(parentFragment instanceof InterfaceC214902198i)) {
                    parentFragment = parentFragment.getParentFragment();
                    if (parentFragment == null) {
                        break;
                    }
                } else {
                    interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                    break;
                }
            }
        }
        if (!(interfaceC214902198i instanceof InterfaceC770380UJw) || (interfaceC770380UJw = (InterfaceC770380UJw) interfaceC214902198i) == null) {
            return;
        }
        interfaceC770380UJw.Ot();
    }

    @Override // X.C0IP3
    public final DataChannel provideDataChannel() {
        return this.LLILZIL;
    }

    public final void RR(String str) {
        if (LiveHostBackToInnerSetting.INSTANCE.enableOpt()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Map map = (Map) dataChannelGlobal.gg0(C930620aKC.class);
            if (map != null) {
                String str2 = (String) map.get("inner_room_id");
                String str3 = (String) map.get("inner_enter_from_merge");
                String str4 = (String) map.get("inner_enter_method");
                dataChannelGlobal.JQ2(C930620aKC.class, new LinkedHashMap());
                if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0 && str4 != null && str4.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleExitAndOpenLiveStream - source: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", roomId: ");
                    sbLIZ.append(str2);
                    sbLIZ.append(", enterFromMerge: ");
                    sbLIZ.append(str3);
                    sbLIZ.append(", enterMethod: ");
                    sbLIZ.append(str4);
                    C20441214yg.LIZIZ("LiveBroadcastEndFragment", C2188811AlT.LIZIZ(sbLIZ));
                    if (!((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).hasLivePlayPage()) {
                        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                        Context context = getContext();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sslocal://live?room_id=");
                        sbLIZ2.append(str2);
                        sbLIZ2.append("&enter_from_merge=");
                        sbLIZ2.append(str3);
                        sbLIZ2.append("&enter_method=");
                        sbLIZ2.append(str4);
                        iActionHandlerService.handle(context, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    dataChannelGlobal.JQ2(C931100aKy.class, Boolean.TRUE);
                    C786410Ut5.LJLIIL(100L, C473410IhP.LIZ(), new ARunnableS112S0100000_12(this, 43));
                    return;
                }
            }
        }
        C520010KaN.LIZLLL(this);
    }

    public final void UR(String str) {
        Long lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ttlive_video_stream_abnormal_end_popup_click");
        Room room = this.LLILZLL;
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        Room room2 = this.LLILZLL;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getOwnerUserId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII(str, "btn_type");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930690aKJ.class), "error_code");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930670aKH.class), "livecore_error_code");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1871920yoQ interfaceC1871920yoQLIZ;
        String strLJFF;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "screen_anchor_diagnose")) {
            C11NZ.LJJJJZ(Boolean.TRUE).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS148S0200000_12(this, c262100zr, 27));
            return;
        }
        if (!Intrinsics.LJFF(str, "live_finishpage_highlight_preload") || !LiveEndPageHighlightPreloadEnable.INSTANCE.enable()) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        String str2 = "";
        if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, Scene.SCENE_SERVICE, "")) != null) {
            str2 = strLJFF;
        }
        if (str2.length() <= 0 || !Intrinsics.LJFF(str2, "1")) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 != null && (interfaceC1871920yoQLIZ = C1871910yoP.LIZ(interfaceC1107590evd2, "video_data", null)) != null) {
            IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, interfaceC1871920yoQLIZ.size());
            ArrayList arrayList2 = new ArrayList();
            C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
            while (it2.LLILLL) {
                InterfaceC1107590evd map = interfaceC1871920yoQLIZ.getMap(it2.nextInt());
                if (map != null) {
                    LivePreloadHighlightVideoModel livePreloadHighlightVideoModel = new LivePreloadHighlightVideoModel(null, null, null, null, null);
                    livePreloadHighlightVideoModel.setVideoUrl(map.getString("videoUrl"));
                    livePreloadHighlightVideoModel.setVideoID(map.getString("videoID"));
                    livePreloadHighlightVideoModel.setAnchorId(map.getString("anchorId"));
                    livePreloadHighlightVideoModel.setRoomId(map.getString("roomId"));
                    livePreloadHighlightVideoModel.setFileId(map.getString("fileId"));
                    Boolean boolValueOf = Boolean.valueOf(arrayList.add(livePreloadHighlightVideoModel));
                    if (boolValueOf != null) {
                        arrayList2.add(boolValueOf);
                    }
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            return;
        }
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).preloadLiveHighlightVideo(arrayList);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Boolean boolValueOf;
        Room room;
        Long lValueOf;
        User owner;
        LiveMode streamType;
        C19EG activity;
        Window window;
        Long lValueOf2;
        long id;
        DataChannel dataChannel;
        int i = C771340UNo.LIZ;
        ((ArrayList) C771340UNo.LIZJ).add(C0J3M.LIVE_HOST_END);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Function1 function1 = (Function1) dataChannelGlobal.gg0(C168Y.class);
        if (function1 != null) {
            function1.invoke(0);
        }
        DataChannel dataChannelLIZ = C0IJR.LIZ(ViewModelProviders.of(this), this);
        this.LLILZIL = dataChannelLIZ;
        dataChannelLIZ.SX0(C748880TZe.class, getChildFragmentManager());
        if (LinkMicPlaybookUGCAISetting.INSTANCE.isEnable()) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).IB(this.LLILZIL, this, this, false);
            DataChannel dataChannel2 = this.LLILZIL;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this, PlaybookRepublishSuccessEvent.class, new AwS591S0100000_12(this, 159));
                dataChannel2.BQ2(this, PlaybookUnPublishSuccessEvent.class, new AwS591S0100000_12(this, 160));
            }
        }
        Long lValueOf3 = null;
        if (LiveBroadcastTnsSafetyTools.enableSolutionB()) {
            C0IEN c0ien = new C0IEN();
            Room room2 = (Room) dataChannelGlobal.gg0(C931200aL8.class);
            c0ien.LIZIZ = room2;
            c0ien.LIZ = "broadcast_end";
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getOwnerUserId());
            } else {
                lValueOf2 = null;
            }
            c0ien.LIZLLL = lValueOf2;
            C0IR5 c0ir5LIZ = c0ien.LIZ();
            DataChannel dataChannel3 = this.LLILZIL;
            if (dataChannel3 != null) {
                dataChannel3.SX0(C1087000eOQ.class, c0ir5LIZ);
            }
            dataChannelGlobal.JQ2(C1148310fzJ.class, c0ir5LIZ);
            Room room3 = c0ien.LIZIZ;
            if (room3 != null && (dataChannel = this.LLILZIL) != null) {
                dataChannel.zW(RoomChannel.class, room3);
            }
            DataChannel dataChannel4 = this.LLILZIL;
            if (dataChannel4 != null) {
                dataChannel4.zW(UserIsAnchorChannel.class, Boolean.TRUE);
            }
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            DataChannel dataChannel5 = this.LLILZIL;
            Room room4 = c0ien.LIZIZ;
            if (room4 != null) {
                id = room4.getId();
            } else {
                id = 0;
            }
            iRoomFunctionService.MO1(id, dataChannel5);
        }
        List list = (List) dataChannelGlobal.gg0(C168R.class);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC782610Umx) it2.next()).LIZ(0);
            }
        }
        super.onCreate(bundle);
        EnumC500290Jjf.END.config();
        C0UKZ.LLII.LIZJ(Boolean.FALSE);
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("is_one_tap_go_live", false));
        } else {
            boolValueOf = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            this.LLJJ = Integer.valueOf(arguments2.getInt("live_end_error_code", 0));
            this.LLJJI = Integer.valueOf(arguments2.getInt("live_end_livecore_error_code", 0));
            arguments2.getInt("end_room_reason", 0);
            this.LLJIJIL = arguments2.getBoolean("is_video_live", false);
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
        this.LLJILJILJ = (PerceptionDialogInfo) dataChannelGlobal2.gg0(PerceptionDialogChannel.class);
        this.LLJILLL = (PunishEventInfo) dataChannelGlobal2.gg0(PunishInfoChannel.class);
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            room = (Room) dataChannelGlobal2.gg0(C930930aKh.class);
        } else {
            room = (Room) dataChannelGlobal2.gg0(C930940aKi.class);
        }
        this.LLILZLL = room;
        dataChannelGlobal2.JQ2(C931200aL8.class, room);
        if (!C504210Jpz.LIZ && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(18);
        }
        C774610Ua3.LL.LLLZLL(this, this.LLILZIL);
        Map<String, Object> map = C1338270kvh.LIZ;
        if (((IGameService) C1161920gLG.LIZJ(IGameService.class)).yP1()) {
            Room room5 = this.LLILZLL;
            if (room5 != null) {
                streamType = room5.getStreamType();
            } else {
                streamType = null;
            }
            if (streamType == LiveMode.SCREEN_RECORD) {
                C1548820qPI.LIZLLL("screen_anchor_diagnose", this);
            }
        }
        if (LiveEndPageHighlightPreloadEnable.INSTANCE.enable()) {
            C1548820qPI.LIZLLL("live_finishpage_highlight_preload", this);
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("user_id", Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        Room room6 = this.LLILZLL;
        if (room6 != null) {
            lValueOf = Long.valueOf(room6.getId());
        } else {
            lValueOf = null;
        }
        pairArr[1] = new Pair("room_id", lValueOf);
        Room room7 = this.LLILZLL;
        if (room7 != null && (owner = room7.getOwner()) != null) {
            lValueOf3 = Long.valueOf(owner.getId());
        }
        pairArr[2] = new Pair("anchor_id", lValueOf3);
        Map<? extends String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        Map<String, Object> map2 = C782530Ump.LIZJ;
        ((LinkedHashMap) map2).clear();
        map2.putAll(mapLJIIIIZZ);
        DataChannelGlobal.LLILZ.BQ2(this, this, NotifyServerLiveEndSucceedEvent.class, new AwS591S0100000_12(this, 161));
        DataChannelGlobal.LLILZ.BQ2(this, this, BroadcastEndPageSchemaOpenPanelEvent.class, new AwS591S0100000_12(this, 677));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[PHI: r1
      0x006f: PHI (r1v8 android.view.View) = (r1v7 android.view.View), (r1v11 android.view.View) binds: [B:17:0x0059, B:22:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.LiveBroadcastEndFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.gj8, viewGroup, false);
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

    public final void VR(String str, String str2, PunishEventInfo punishEventInfo, PerceptionDialogInfo perceptionDialogInfo) {
        String str3;
        String str4;
        String str5;
        Long lValueOf;
        Long l;
        String str6;
        String str7;
        String strLIZ;
        String str8;
        long createTime;
        LiveMode streamType;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_popup");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII("finish_card", "scene_type");
        String str9 = null;
        if (punishEventInfo != null) {
            str3 = punishEventInfo.punishId;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "record_id");
        if (punishEventInfo != null) {
            str4 = punishEventInfo.punishType;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "violation_type");
        if (punishEventInfo != null) {
            str5 = punishEventInfo.punishReason;
        } else {
            str5 = null;
        }
        c474500IjALIZ.LJJII(str5, "violation_reason");
        if (punishEventInfo != null) {
            lValueOf = Long.valueOf(punishEventInfo.violationUid);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "violation_anchor_id");
        c474500IjALIZ.LJJII(str2, "click_tab");
        if (punishEventInfo != null) {
            l = punishEventInfo.duration;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "period");
        if (perceptionDialogInfo != null) {
            str6 = perceptionDialogInfo.violationDetailUrl;
        } else {
            str6 = null;
        }
        if (!TextUtils.isEmpty(str6)) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str7, "is_detail_button");
        Room room = this.LLILZLL;
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        if (punishEventInfo != null) {
            str8 = punishEventInfo.punishPerceptionCode;
        } else {
            str8 = null;
        }
        c474500IjALIZ.LJJII(str8, "perception_code");
        if (C500260Jjc.LJJJI((Boolean) DataChannelGlobal.LLILZ.gg0(CaptchaCheckFailedChannel.class))) {
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            Room room2 = this.LLILZLL;
            if (room2 != null) {
                createTime = room2.getCreateTime();
            } else {
                createTime = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis - createTime), "live_duration");
        }
        if (punishEventInfo != null) {
            str9 = punishEventInfo.showReason;
        }
        c474500IjALIZ.LJJII(str9, "show_reason");
        c474500IjALIZ.LIZ();
    }
}
