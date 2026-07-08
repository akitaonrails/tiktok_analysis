package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.AbstractC775560Uba;
import X.AbstractC775660Ubk;
import X.C013C;
import X.C01C3;
import X.C01GW;
import X.C01Q0;
import X.C01Q2;
import X.C01Q3;
import X.C020W;
import X.C098200Yq;
import X.C0IJT;
import X.C0IR5;
import X.C0KA1;
import X.C0KPJ;
import X.C0KWM;
import X.C0KYR;
import X.C0TZ7;
import X.C0UF5;
import X.C0UJW;
import X.C0UNN;
import X.C0UX6;
import X.C1087000eOQ;
import X.C1100630ekP;
import X.C1106750euH;
import X.C1119920fFW;
import X.C1133830fbx;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C13LP;
import X.C1548820qPI;
import X.C168L;
import X.C1697810uHb;
import X.C16F5;
import X.C1790620whI;
import X.C1834150xpV;
import X.C1871910yoP;
import X.C189200o6;
import X.C19EG;
import X.C19GO;
import X.C20094213jo;
import X.C20337914i1;
import X.C20441214yg;
import X.C20484615Do;
import X.C20736316Cj;
import X.C20743716Ff;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C21578619ce;
import X.C21658019pS;
import X.C2188811AlT;
import X.C23250099c;
import X.C262100zr;
import X.C2845018h;
import X.C354201Zc;
import X.C356901a3;
import X.C444140HbI;
import X.C452501pT;
import X.C462101r1;
import X.C468960IaE;
import X.C473410IhP;
import X.C473420IhQ;
import X.C474500IjA;
import X.C491510JPh;
import X.C494680Jac;
import X.C497740JfY;
import X.C499640Jic;
import X.C500260Jjc;
import X.C521520Kco;
import X.C521680Kd4;
import X.C521710Kd7;
import X.C522020Kdc;
import X.C748880TZe;
import X.C754670Tiz;
import X.C755600TkU;
import X.C758130ToZ;
import X.C758220Toi;
import X.C758680TpS;
import X.C758750TpZ;
import X.C760180Trs;
import X.C770730ULf;
import X.C772130UQp;
import X.C773970UXr;
import X.C781270Ukn;
import X.C782710Un7;
import X.C785920UsI;
import X.C785990UsP;
import X.C786410Ut5;
import X.DialogInterfaceOnClickListenerC786020UsS;
import X.EnumC1815680xLi;
import X.EnumC2636010g;
import X.EnumC754690Tj1;
import X.InterfaceC1106030et7;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1809520xBm;
import X.InterfaceC390601fU;
import X.InterfaceC500690JkJ;
import X.InterfaceC500940Jki;
import X.InterfaceC769410UGd;
import X.InterfaceC772190UQv;
import X.InterfaceC781810Ulf;
import X.ViewOnAttachStateChangeListenerC521700Kd6;
import Y.ACListenerS116S0200000_12;
import Y.ACListenerS142S0100000_7;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS163S0100000_29;
import Y.ACListenerS40S0210000_7;
import Y.ACListenerS72S0110000_12;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS17S0100100_12;
import Y.ARunnableS76S0200000_7;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.broadcast.api.LivePreviewHasMultiGuestPermissionChannel;
import com.bytedance.android.live.broadcast.api.MultiGuestPreviewLiveSettingHighLightEvent;
import com.bytedance.android.live.broadcast.api.PanelLayoutTypeChangeEvent;
import com.bytedance.android.live.broadcast.api.PreviewLiveMultiGuestSettingRedDot;
import com.bytedance.android.live.broadcast.api.SMBLegacyBoardsPermission;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.broadcast.OptOutGiftGalleryChannel;
import com.bytedance.android.livesdk.broadcast.ViolationStatusChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.setting.BroadcastNoiseSuppressionSetting;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.event.AISummaryStatusEvent;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.SmbGoLivePageUnifyEnable;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.LivePcsOneStopShopCacheDurationSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop.OneStopShopEntranceSetting;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAutoShareBBSwitchEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LocationSwitchType;
import com.bytedance.android.livesdk.dataChannel.PreviewPageSelectLiveMode;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.highlight.LiveRecordingsSettingsEnableSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayHighlightRecoverSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMarkViewerOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.performance.BroadcastNewStableModeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReplayShareSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.BoardsPermissionChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS34S0310000_12;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS448S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS74S0500000_12;
import kotlin.jvm.internal.AwS95S0210000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import kotlinx.coroutines.CoroutineExceptionHandler;
import tikcast.api.perception.ViolationStatusResponse;
import u4.q0;
import webcast.data.AboveGoLiveButtonComponent;
import webcast.data.AnchorReminderWordStatus;
import webcast.data.AutoShareLiveCardToBulletinBoard;
import webcast.data.LiveGoLivePageContainer;
import webcast.data.RechargeCustomError;
import wh6.AbS503S0200000_12;
import wh6.AbS689S0100000_7;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class BasePreviewSettingMainFragmentSheetInitializer implements InterfaceC781810Ulf, InterfaceC1141530foN, GenericLifecycleObserver {
    public static final /* synthetic */ int LLLIIIIL = 0;
    public final Fragment LL;
    public final DataChannel LLILLJJLI;
    public final C20484615Do LLILLL;
    public final LifecycleOwner LLILZ;
    public boolean LLILZIL;
    public C21578619ce LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public C16F5 LLJILLL;
    public C21658019pS LLJJ;
    public InterfaceC500690JkJ LLJJI;
    public View LLJJIII;
    public boolean LLJJIJIIJIL;
    public C21658019pS LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public RechargeCustomError LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public boolean LLJLLIL;
    public View LLJZIJLIL;
    public C20743716Ff LLL;
    public LiveIconView LLLF;
    public C16F5 LLLFF;
    public C16F5 LLLFFI;
    public View LLLFZ;
    public View LLLI;
    public C16F5 LLLII;
    public C20743716Ff LLLIIII;
    public boolean LLIZ = true;
    public final BPEAHandler LLJJIJI = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(24));
    public boolean LLJLILLLLZIIL = true;
    public final Boolean LLJLL = C0KPJ.hf.LIZIZ();
    public final List<EnumC1815680xLi> LLJLLL = new ArrayList();
    public final String LLJZ = "live_take_page";

    @Override // X.InterfaceC781810Ulf
    public final void init() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final Map<String, String> LIZIZ() {
        HashMap map = new HashMap();
        map.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("event_page", "live_take_page");
        return map;
    }

    public final String LJ() {
        return (String) this.LLJLIL.getValue();
    }

    public final void LJJJIL() {
        if (this.LLJJIJIIJIL) {
            View view = this.LLLFZ;
            if (view == null) {
                view = this.LLJJL;
            }
            BPEAHandler bPEAHandler = this.LLJJIJI;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS76S0200000_7(this, view, 43));
                return;
            }
            return;
        }
        if (this.LLJILJIL) {
            if (C500260Jjc.LJJJJIZL(this.LLJJJJLIIL)) {
                C786410Ut5.LJJZZIII(this.LLJJIJI, new ARunnableS107S0100000_7(this, 179));
                return;
            }
            return;
        }
        if (LiveRecordingsSettingsEnableSetting.INSTANCE.enable()) {
            if (Intrinsics.LJFF(this.LLJILJILJ, "auto_scroll_item_live_recordings_settings_popup") || Intrinsics.LJFF(this.LLJILJILJ, "auto_scroll_item_live_recordings_settings_red_dot")) {
                C786410Ut5.LJJZZIII(this.LLJJIJI, new ARunnableS107S0100000_7(this, 178));
                return;
            }
            return;
        }
        if (LiveReplayHighlightRecoverSetting.INSTANCE.enable()) {
            if (this.LLJI) {
                C786410Ut5.LJLIIL(300L, this.LLJJIJI, new ARunnableS107S0100000_7(this, 177));
                return;
            }
            if (this.LLJIJIL) {
                InterfaceC1809520xBm interfaceC1809520xBm = new InterfaceC1809520xBm() { // from class: X.0JjW
                    @Override // X.InterfaceC1809520xBm
                    public final void LIZ(C21578619ce c21578619ce, int i, int i2, int i3, int i4) {
                        ViewGroup viewGroup;
                        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LIZ;
                        View view2 = basePreviewSettingMainFragmentSheetInitializer.LLJL;
                        C21578619ce c21578619ce2 = basePreviewSettingMainFragmentSheetInitializer.LLILZLL;
                        basePreviewSettingMainFragmentSheetInitializer.getClass();
                        if (view2 != null && c21578619ce2 != null) {
                            int[] iArr = new int[2];
                            view2.getLocationOnScreen(iArr);
                            int i5 = iArr[1];
                            int height = view2.getHeight() + i5;
                            int[] iArr2 = new int[2];
                            c21578619ce2.getLocationOnScreen(iArr2);
                            int i6 = iArr2[1];
                            int height2 = c21578619ce2.getHeight() + i6;
                            if (height > i6 && i5 < height2) {
                                RedDotExtensionKt.LIZ(C0UX6.RECORD_COMMENTS_GIFTS_IN_SETTING);
                                BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer2 = this.LIZ;
                                View view3 = basePreviewSettingMainFragmentSheetInitializer2.LLJL;
                                if (view3 instanceof ViewGroup) {
                                    viewGroup = (ViewGroup) view3;
                                } else {
                                    viewGroup = null;
                                }
                                basePreviewSettingMainFragmentSheetInitializer2.LJJJJJL(viewGroup);
                                C21578619ce c21578619ce3 = this.LIZ.LLILZLL;
                                if (c21578619ce3 != null) {
                                    c21578619ce3.setOnScrollChangeListener((InterfaceC1809520xBm) null);
                                }
                            }
                        }
                    }
                };
                C21578619ce c21578619ce = this.LLILZLL;
                if (c21578619ce != null) {
                    c21578619ce.setOnScrollChangeListener(interfaceC1809520xBm);
                }
            }
        }
    }

    public static boolean LIZJ() {
        InterfaceC769410UGd interfaceC769410UGdM70 = C781270Ukn.LJIILJJIL().M70();
        return (interfaceC769410UGdM70 == null || interfaceC769410UGdM70.getPanelLayoutType() != 1) && LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage();
    }

    @Override // X.InterfaceC781810Ulf
    public final void b42() {
        LJJJIL();
    }

    public final String LJFF(int i) {
        return this.LL.getString(i);
    }

    public final void LJIILIIL(View view) {
        final boolean zLIZ = C758680TpS.LIZ(this.LLILLJJLI);
        final boolean zLIZIZ = C758680TpS.LIZIZ(this.LLILLJJLI);
        if (view != null) {
            C500260Jjc.LLFFF(view);
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Jjj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LiveMode liveMode;
                    IAdminSettingService iAdminSettingService = (IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class);
                    DataChannel dataChannel = this.LL.LLILLJJLI;
                    if (dataChannel != null) {
                        liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
                    } else {
                        liveMode = null;
                    }
                    LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheetP80 = iAdminSettingService.p80(true, false, liveMode, zLIZ, zLIZIZ, true);
                    if (liveCommercialContentToggleFragmentSheetP80 != null) {
                        this.LL.LLILLL.LJIIJ(liveCommercialContentToggleFragmentSheetP80, "live_commercial_content_toggle");
                    }
                }
            }, view);
            C444140HbI.LIZ(view, AFwS290S0000000_7.get$arr$(8));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_commercial_icon_show");
        c474500IjALIZ.LJJII(LJ(), "anchor_id");
        c474500IjALIZ.LJIILJJIL("live_take_page");
        c474500IjALIZ.LJJII(C772130UQp.LIZ(zLIZ, zLIZIZ), "anchor_type");
        c474500IjALIZ.LIZ();
    }

    public final void LJIILL(View view) {
        C20743716Ff c20743716Ff;
        LiveIconView liveIconView;
        C16F5 c16f5;
        C16F5 c16f52;
        View viewFindViewById;
        View viewFindViewById2;
        C16F5 c16f53;
        C20743716Ff c20743716Ff2;
        Integer numLIZJ;
        Integer numLIZJ2;
        LiveMode liveMode;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        CharSequence text;
        C20743716Ff c20743716Ff3;
        ViolationStatusResponse.ResponseData responseData;
        BroadcastSettingResponse broadcastSettingResponse;
        C16F5 c16f54;
        Integer num;
        C16F5 c16f55;
        CharSequence text2 = null;
        if (view != null) {
            c20743716Ff = (C20743716Ff) view.findViewById(R.id.ix6);
        } else {
            c20743716Ff = null;
        }
        this.LLL = c20743716Ff;
        if (view != null) {
            liveIconView = (LiveIconView) view.findViewById(R.id.ix4);
        } else {
            liveIconView = null;
        }
        this.LLLF = liveIconView;
        if (view != null) {
            c16f5 = (C16F5) view.findViewById(R.id.ix7);
        } else {
            c16f5 = null;
        }
        this.LLLFF = c16f5;
        if (view != null) {
            c16f52 = (C16F5) view.findViewById(R.id.ix3);
        } else {
            c16f52 = null;
        }
        this.LLLFFI = c16f52;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.ix5);
        } else {
            viewFindViewById = null;
        }
        this.LLLFZ = viewFindViewById;
        if (view != null) {
            viewFindViewById2 = view.findViewById(R.id.ixg);
        } else {
            viewFindViewById2 = null;
        }
        this.LLLI = viewFindViewById2;
        if (view != null) {
            c16f53 = (C16F5) view.findViewById(R.id.ixc);
        } else {
            c16f53 = null;
        }
        this.LLLII = c16f53;
        if (view != null) {
            c20743716Ff2 = (C20743716Ff) view.findViewById(R.id.ixp);
        } else {
            c20743716Ff2 = null;
        }
        this.LLLIIII = c20743716Ff2;
        if (!this.LLJJJJ) {
            return;
        }
        int i = this.LLJJJIL;
        if (i == 5 || i == 6 || i == 8 || i == 9) {
            Context contextLJII = C497740JfY.LJII();
            if (contextLJII != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ewz, contextLJII)) != null) {
                int iIntValue = numLIZJ2.intValue();
                C16F5 c16f56 = this.LLLFF;
                if (c16f56 != null) {
                    c16f56.setTextColor(iIntValue);
                }
            }
            Context contextLJII2 = C497740JfY.LJII();
            if (contextLJII2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ewz, contextLJII2)) != null) {
                int iIntValue2 = numLIZJ.intValue();
                C16F5 c16f57 = this.LLLFFI;
                if (c16f57 != null) {
                    c16f57.setTextColor(iIntValue2);
                }
            }
        }
        if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount() && (c16f55 = this.LLLFFI) != null) {
            c16f55.setText(2131852617);
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        View view2 = this.LLLFZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLLFZ;
        if (view3 != null) {
            view3.setImportantForAccessibility(1);
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && dataChannel2.gg0(GiftFeatureChannel.class) != null) {
            DataChannel dataChannel3 = this.LLILLJJLI;
            if (dataChannel3 != null && (num = (Integer) dataChannel3.gg0(GiftFeatureChannel.class)) != null && num.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = this.LLJJJ;
        }
        C20743716Ff c20743716Ff4 = this.LLL;
        if (c20743716Ff4 != null) {
            c20743716Ff4.setChecked(z);
        }
        DataChannel dataChannel4 = this.LLILLJJLI;
        if (dataChannel4 != null && (broadcastSettingResponse = (BroadcastSettingResponse) dataChannel4.gg0(BroadcastSettingResponseChannel.class)) != null && broadcastSettingResponse.showGiftGallerySettingSwitch == 1) {
            View view4 = this.LLLI;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
            }
            if (LiveHostSettingsUIConfig.enable() && (c16f54 = this.LLLII) != null) {
                c16f54.setText(C497740JfY.LJIJI(2131853256));
            }
            C20743716Ff c20743716Ff5 = this.LLLIIII;
            if (c20743716Ff5 != null) {
                C786410Ut5.A7(c20743716Ff5, new C521710Kd7(this, 3));
            }
            LJJJJ(true, z);
        }
        DataChannel dataChannel5 = this.LLILLJJLI;
        if (dataChannel5 != null && (responseData = (ViolationStatusResponse.ResponseData) dataChannel5.gg0(ViolationStatusChannel.class)) != null && responseData.status == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJJJJI(z2);
        DataChannel dataChannel6 = this.LLILLJJLI;
        if (dataChannel6 != null) {
            dataChannel6.BQ2(this.LLILZ, ViolationStatusChannel.class, new AwS591S0100000_12(this, 405));
        }
        if (this.LLJJJIL == 10 && (c20743716Ff3 = this.LLL) != null) {
            c20743716Ff3.setChecked(false);
        }
        if (this.LLJJJIL == 9) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z && z3) {
            C20743716Ff c20743716Ff6 = this.LLL;
            if (c20743716Ff6 != null) {
                c20743716Ff6.setEnabled(false);
            }
            View view5 = this.LLLFZ;
            if (view5 != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 164), view5);
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_settings_gift_icon_show");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJIILJJIL("live_take_page");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (z2) {
            str = "ban_";
        } else {
            str = "";
        }
        sbLIZ.append(str);
        if (z) {
            str2 = "open";
        } else {
            str2 = "close";
        }
        sbLIZ.append(str2);
        c474500IjALIZ.LJJII(C2188811AlT.LIZIZ(sbLIZ), "send_gift_type");
        int i2 = C2845018h.LIZ[liveMode.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                str3 = "third_party";
            } else {
                str3 = "screen_share";
            }
        } else {
            str3 = "video_live";
        }
        c474500IjALIZ.LJJII(str3, "live_type");
        c474500IjALIZ.LIZ();
        C20743716Ff c20743716Ff7 = this.LLL;
        if (c20743716Ff7 != null) {
            C786410Ut5.A7(c20743716Ff7, new C785990UsP(this, 16));
        }
        View view6 = this.LLLFZ;
        C20743716Ff c20743716Ff8 = this.LLL;
        CharSequence[] charSequenceArr = new CharSequence[2];
        C16F5 c16f58 = this.LLLFF;
        if (c16f58 != null) {
            text = c16f58.getText();
        } else {
            text = null;
        }
        charSequenceArr[0] = text;
        C16F5 c16f59 = this.LLLFFI;
        if (c16f59 != null) {
            text2 = c16f59.getText();
        }
        charSequenceArr[1] = text2;
        LIZ(view6, c20743716Ff8, C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(charSequenceArr), null, null, null, 0, null, null, 63));
    }

    public final void LJIJI(View view) {
        if (LiveMarkViewerOptimizationSetting.INSTANCE.getValue() && view != null) {
            C500260Jjc.LLFFF(view);
            LJIJJ(this, "show");
            C786410Ut5.I7(new AbS694S0100000_12(this, 14), view);
        }
    }

    public final void LJJ(final C499640Jic c499640Jic) {
        Boolean boolValueOf;
        LiveMode liveMode;
        if (BroadcastNoiseSuppressionSetting.INSTANCE.enable()) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
                boolValueOf = Boolean.valueOf(C354201Zc.LJFF(liveMode));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                final LifecycleOwner lifecycleOwner = this.LLILZ;
                new AbstractC775560Uba(c499640Jic, lifecycleOwner) { // from class: X.0Ubd
                    @Override // X.AbstractC775560Uba
                    public final String LIZ() {
                        return "prepare_manually";
                    }

                    {
                        super(lifecycleOwner);
                        C1813280xHq.LIZ(this, AbstractC775560Uba.LIZIZ(), lifecycleOwner);
                        View view = c499640Jic.LIZ;
                        if (view != null) {
                            C786410Ut5.LJLLLLLL(0, view);
                        }
                        LIZJ(c499640Jic.LJI);
                        AbstractC775560Uba.LIZIZ().vQ2(C775550UbZ.LIZ);
                    }
                };
            }
        }
    }

    public final void LJJII(View view) {
        BroadcastSettingResponse broadcastSettingResponse;
        LiveMode liveMode;
        String str;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (broadcastSettingResponse = (BroadcastSettingResponse) dataChannel.gg0(BroadcastSettingResponseChannel.class)) != null) {
            if (broadcastSettingResponse.giftRankSwitchStatus == 0 && broadcastSettingResponse.friendRankSwitch == 0 && broadcastSettingResponse.ecRankSwitchStatus == 0 && broadcastSettingResponse.gameRankSwitchStatus == 0) {
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                    return;
                }
                return;
            }
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 == null || (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) == null) {
                liveMode = LiveMode.VIDEO;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_rankings_settings_show");
            c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
            c474500IjALIZ.LJIILJJIL("live_take_page");
            int i = C2845018h.LIZ[liveMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str = "third_party";
                } else {
                    str = "screen_share";
                }
            } else {
                str = "video_live";
            }
            c474500IjALIZ.LJJII(str, "live_type");
            c474500IjALIZ.LIZ();
            if (view == null) {
                return;
            }
            C786410Ut5.I7(new AbS694S0100000_12(this, 16), view);
            C444140HbI.LIZ(view, AFwS290S0000000_7.get$arr$(6));
        }
    }

    public final void LJJIIJZLJL(final C499640Jic c499640Jic) {
        Boolean boolValueOf;
        DataChannel dataChannel;
        long jLongValue;
        Long l;
        LiveMode liveMode;
        if (BroadcastNewStableModeSetting.INSTANCE.enable()) {
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) != null) {
                boolValueOf = Boolean.valueOf(C354201Zc.LJFF(liveMode));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && (dataChannel = this.LLILLJJLI) != null) {
                C0IR5 c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class);
                if (c0ir5 != null && (l = c0ir5.LIZLLL) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                final String strValueOf = String.valueOf(jLongValue);
                final String strValueOf2 = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                final Fragment fragment = this.LL;
                new AbstractC775660Ubk(c499640Jic, strValueOf, strValueOf2, fragment) { // from class: X.0Ubl
                    @Override // X.AbstractC775660Ubk
                    public final String LIZ() {
                        return "center";
                    }

                    {
                        super(0L, strValueOf, strValueOf2, fragment);
                        C1813280xHq.LIZ(this, AbstractC775660Ubk.LIZJ(), fragment);
                        View view = c499640Jic.LIZ;
                        if (view != null) {
                            C786410Ut5.LJLLLLLL(0, view);
                        }
                        C20743716Ff c20743716Ff = c499640Jic.LJI;
                        C16F5 c16f5 = c499640Jic.LIZLLL;
                        LJ(c20743716Ff);
                        LIZLLL(c16f5);
                        AbstractC775660Ubk.LIZJ().vQ2(C775790Ubx.LIZ);
                        C473410IhP.LIZJ(new ARunnableS17S0100100_12(this, 1), 200L);
                    }
                };
            }
        }
    }

    public final void LJJIJIL(String str) {
        HashMap mapLJI = C2097608Jq.LJI(new Pair("action_type", "click"), new Pair("click_type", str));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gpppa_popup");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("start_broadcast");
        c474500IjALIZ.LJIILIIL("start_broadcast");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJJIIZI(mapLJI);
        c474500IjALIZ.LIZ();
    }

    public final void LJJIJL(String str) {
        LiveMode liveMode;
        String str2;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_moderator_icon");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJIILJJIL("live_take_page");
        int i = C2845018h.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str2 = "third_party";
            } else {
                str2 = "screen_share";
            }
        } else {
            str2 = "video_live";
        }
        c474500IjALIZ.LJJII(str2, "live_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public final void LJJIJLIJ(String str) {
        Boolean boolValueOf;
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(this.LLILZIL));
        C758750TpZ c758750TpZ = (C758750TpZ) DataChannelGlobal.LLILZ.gg0(C168L.class);
        if (c758750TpZ != null) {
            boolValueOf = Boolean.valueOf(c758750TpZ.LIZJ);
        } else {
            boolValueOf = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_one_stop_shop_stable_entrance");
        c474500IjALIZ.LJJII(LJ(), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0), "has_setup");
        c474500IjALIZ.LJJII(Integer.valueOf(zLJJJI ? 1 : 0), "has_reddot");
        c474500IjALIZ.LIZ();
    }

    public final void LJJIZ(String str) {
        LiveMode liveMode;
        String str2;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_title_cover_icon");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJIILJJIL("live_take_page");
        int i = C2845018h.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str2 = "third_party";
            } else {
                str2 = "screen_share";
            }
        } else {
            str2 = "video_live";
        }
        c474500IjALIZ.LJJII(str2, "live_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public final void LJJJI(View view) {
        C21578619ce c21578619ce = this.LLILZLL;
        if (c21578619ce == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        c21578619ce.getLocationInWindow(iArr2);
        c21578619ce.smoothScrollTo(0, (((iArr[1] - iArr2[1]) + c21578619ce.getScrollY()) + (view.getHeight() / 2)) - (c21578619ce.getHeight() / 2));
        C473410IhP.LIZJ(new ARunnableS107S0100000_7(this, 19), 500L);
    }

    public final void LJJJJI(boolean z) {
        Text text;
        ViolationStatusResponse.ResponseData responseData;
        PerceptionDialogInfo perceptionDialogInfo;
        Integer numLIZJ;
        Integer numLIZJ2;
        if (z) {
            C20743716Ff c20743716Ff = this.LLL;
            if (c20743716Ff != null) {
                c20743716Ff.setEnabled(false);
            }
            LiveIconView liveIconView = this.LLLF;
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 0);
            }
            Context contextLJII = C497740JfY.LJII();
            if (contextLJII != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ewz, contextLJII)) != null) {
                int iIntValue = numLIZJ2.intValue();
                C16F5 c16f5 = this.LLLFF;
                if (c16f5 != null) {
                    c16f5.setTextColor(iIntValue);
                }
            }
            C16F5 c16f52 = this.LLLFFI;
            if (c16f52 != null) {
                Context contextLJII2 = C497740JfY.LJII();
                if (contextLJII2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ewz, contextLJII2)) != null) {
                    c16f52.setTextColor(numLIZJ.intValue());
                }
                DataChannel dataChannel = this.LLILLJJLI;
                if (dataChannel != null && (responseData = (ViolationStatusResponse.ResponseData) dataChannel.gg0(ViolationStatusChannel.class)) != null && (perceptionDialogInfo = responseData.perceptionDialog) != null) {
                    text = perceptionDialogInfo.subTitle;
                } else {
                    text = null;
                }
                c16f52.setText(C1133830fbx.LJIILIIL(text, "").toString());
            }
        }
    }

    public final void LJJJJIZL(boolean z) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C01Q2(z, this, null), 3);
    }

    public final void LJJJJJ(C19EG c19eg) {
        FragmentManager fragmentManager;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        Context context = this.LL.getContext();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            iHostAction.showAutoPostLivingGuideSheet("live_take_page", context, fragmentManager, new AwS95S0210000_12(this, c19eg, 2));
        }
    }

    public final void LJJJJJL(ViewGroup viewGroup) {
        InterfaceC500690JkJ interfaceC500690JkJNw1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nw1(viewGroup);
        this.LLJJI = interfaceC500690JkJNw1;
        if (interfaceC500690JkJNw1 != null) {
            interfaceC500690JkJNw1.LIZ();
        }
    }

    public final void LJJJJLI(int i) {
        String strLJFF = LJFF(2131840922);
        String str = "";
        if (i != 5) {
            if (i == 8) {
                strLJFF = LJFF(2131840922);
                String strLJFF2 = LJFF(2131840923);
                if (strLJFF2 != null) {
                    str = strLJFF2;
                }
            }
        } else {
            strLJFF = u.LJJIFFI(LJFF(2131840917), "{0}", LowAgeAnchorLimitSetting.INSTANCE.getValue(), false);
        }
        C19GO c19go = new C19GO(this.LL.getContext());
        c19go.LJJIIJ = true;
        c19go.LJII = strLJFF;
        c19go.LIZLLL = str;
        c19go.LJ(2131840915, new DialogInterfaceOnClickListenerC786020UsS(this, 1), false);
        c19go.LIZJ(2131840916, new DialogInterface.OnClickListener() { // from class: X.0TiQ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }, false);
        C786410Ut5.M4(c19go.LIZ());
    }

    public final void LJJJJZ(C16F5 c16f5) {
        boolean zBooleanValue;
        IHostAppContext iHostAppContext;
        Boolean boolValueOf;
        int iPm2 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Pm2();
        Context context = this.LL.getContext();
        if (context != null && (iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) != null && (boolValueOf = Boolean.valueOf(iHostAppContext.isLocationPermissionGranted(context))) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (iPm2 != 1 && zBooleanValue) {
            String strFq1 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Fq1();
            if (strFq1.length() > 0) {
                C500260Jjc.LLFFF(c16f5);
                if (c16f5 != null) {
                    c16f5.setText(strFq1);
                    return;
                }
                return;
            }
            C500260Jjc.LJIILIIL(c16f5);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), null, null, new C01Q0(this, c16f5, null), 3);
            return;
        }
        C500260Jjc.LJIILIIL(c16f5);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Integer numValueOf;
        if (Intrinsics.LJFF("live_goal_update_event", c262100zr.LIZ)) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd, "goalStatus", 0));
            } else {
                numValueOf = null;
            }
            int code = EnumC2636010g.ONGOING.getCode();
            if (numValueOf != null && numValueOf.intValue() == code) {
                this.LLIZLLLIL = true;
                return;
            }
            int code2 = EnumC2636010g.DELETED.getCode();
            if (numValueOf == null || numValueOf.intValue() != code2) {
                return;
            }
            this.LLIZLLLIL = false;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        C356901a3.LIZ(this, lifecycleOwner);
        C20441214yg.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer", "onCreate");
        Bundle arguments = this.LL.getArguments();
        if (arguments != null) {
            try {
                arguments.getString("enter_from");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        boolean z4 = true;
        if (arguments != null && arguments.getBoolean("scroll_to_record_comments_gifts")) {
            z = true;
        } else {
            z = false;
        }
        this.LLJI = z;
        if (arguments != null && arguments.getBoolean("is_record_comments_gifts_red_dot_show")) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJIJIL = z2;
        if (arguments != null && arguments.getBoolean("show_location_high_light")) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLJILJIL = z3;
        if (this.LLJILJILJ == null) {
            String str = "";
            if (arguments != null && (string = arguments.getString("auto_scroll_item", "")) != null) {
                str = string;
            }
            this.LLJILJILJ = str;
        }
        if (arguments == null || !arguments.getBoolean("scroll_to_live_gifts")) {
            z4 = false;
        }
        this.LLJJIJIIJIL = z4;
        C189200o6.m2constructorimpl(Unit.LIZ);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        BPEAHandler bPEAHandler = this.LLJJIJI;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        LJJIJLIJ("show");
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ei().LJIIIIZZ();
        C1790620whI.LJIIJ();
        if (this.LLJLILLLLZIIL) {
            new AwS556S0100000_12(this, 748).invoke();
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C1548820qPI.LJIIIIZZ("live_goal_update_event", this);
        C21578619ce c21578619ce = this.LLILZLL;
        if (c21578619ce != null) {
            c21578619ce.setOnScrollChangeListener((InterfaceC1809520xBm) null);
        }
    }

    @Override // X.InterfaceC781810Ulf
    public final void onHiddenChanged(boolean z) {
        if (!z) {
            C21658019pS c21658019pS = this.LLJJ;
            if (c21658019pS != null) {
                c21658019pS.LIZJ();
                c21658019pS.LJ = false;
                C21658019pS c21658019pS2 = this.LLJJ;
                if (c21658019pS2 != null) {
                    c21658019pS2.LIZIZ();
                }
                C21658019pS c21658019pS3 = this.LLJJ;
                if (c21658019pS3 != null) {
                    c21658019pS3.LIZ();
                }
            }
            C21658019pS c21658019pS4 = this.LLJJIJIL;
            if (c21658019pS4 != null) {
                c21658019pS4.LIZJ();
                c21658019pS4.LJ = false;
                C21658019pS c21658019pS5 = this.LLJJIJIL;
                if (c21658019pS5 != null) {
                    c21658019pS5.LIZIZ();
                }
                C21658019pS c21658019pS6 = this.LLJJIJIL;
                if (c21658019pS6 != null) {
                    c21658019pS6.LIZ();
                }
            }
            if (!this.LLILLL.LJIIL) {
                LJJJ(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount(), C494680Jac.LIZJ());
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        int i;
        C16F5 c16f5;
        String strLJIJI;
        C356901a3.LIZLLL(this, lifecycleOwner);
        C20441214yg.LIZIZ("ShareBB", "onResume");
        AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard = C0UF5.LJFF;
        if (autoShareLiveCardToBulletinBoard != null && (i = autoShareLiveCardToBulletinBoard.switchStatus) > 0 && (c16f5 = this.LLJILLL) != null) {
            if (i == 1) {
                strLJIJI = C497740JfY.LJIJI(2131851474);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131851473);
            }
            c16f5.setText(strLJIJI);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        Context context = this.LL.getContext();
        DataChannel dataChannel = this.LLILLJJLI;
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 754);
        c0tz7.getClass();
        C0TZ7.LJFF(context, dataChannel, awS556S0100000_12);
    }

    @Override // X.InterfaceC781810Ulf
    public final void onViewCreated(View view) {
        BroadcastSettingResponse broadcastSettingResponse;
        C20441214yg.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer", "onViewCreated");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (broadcastSettingResponse = (BroadcastSettingResponse) dataChannel.gg0(BroadcastSettingResponseChannel.class)) != null) {
            this.LLJJJ = broadcastSettingResponse.LIZLLL();
            this.LLJJJJ = broadcastSettingResponse.LIZJ();
            this.LLJJJIL = broadcastSettingResponse.giftFeature;
            this.LLJJJJJIL = broadcastSettingResponse.rechargeCustomError;
        }
    }

    public static final void LJIJJ(BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, String str) {
        String str2;
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_mark_viewer_icon");
        c474500IjALIZ.LJIJJLI(basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI);
        c474500IjALIZ.LJ(str);
        DataChannel dataChannel = basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            str2 = liveMode.logStreamingType;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJ(str2);
        c474500IjALIZ.LIZ();
    }

    public final void LJIIL(View view, View view2) {
        LiveMode liveMode;
        String str;
        RoomCreateInfo roomCreateInfo;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_comment_settings_show");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJIILJJIL("live_take_page");
        int i = C2845018h.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "third_party";
            } else {
                str = "screen_share";
            }
        } else {
            str = "video_live";
        }
        c474500IjALIZ.LJJII(str, "live_type");
        c474500IjALIZ.LJJII(C0KYR.LIZJ(this.LLILLJJLI), "admin_type");
        c474500IjALIZ.LIZ();
        if (view != null) {
            C500260Jjc.LLFFF(view);
            C786410Ut5.I7(new AbS503S0200000_12(view2, this, 2), view);
            C444140HbI.LIZ(view, AFwS290S0000000_7.get$arr$(7));
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && (roomCreateInfo = (RoomCreateInfo) dataChannel2.gg0(RoomCreateInfoChannel.class)) != null && roomCreateInfo.anchorStarCommentPermission && !Intrinsics.LJFF(InterfaceC1106030et7.D4.LIZIZ().get("1"), Boolean.FALSE)) {
            if (view2 != null) {
                C500260Jjc.LLFFF(view2);
            } else {
                return;
            }
        } else if (view2 == null) {
            return;
        }
        if (view2.getVisibility() == 8) {
            RedDotExtensionKt.LJI(view2, this.LL, null, C0UX6.LIVE_BROADCAST_PREVIEW_COMMENT_SETTING, null);
        }
    }

    public final void LJIILLIIL(View view, C20743716Ff c20743716Ff) {
        boolean zBooleanValue;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        Boolean boolLIZ = InterfaceC1106030et7.z9.LIZ();
        if (boolLIZ != null) {
            zBooleanValue = boolLIZ.booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (c20743716Ff != null) {
            c20743716Ff.setChecked(zBooleanValue);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C01Q3(this, zBooleanValue, c20743716Ff, null), 3);
        if (c20743716Ff != null) {
            C786410Ut5.k8(c20743716Ff, new ACListenerS116S0200000_12(c20743716Ff, this, 25));
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLILZ, GiftFeatureChannel.class, new C020W(c20743716Ff, this, 4));
        }
    }

    public final void LJIIZILJ(View view, View view2) {
        RedDotExtensionKt.LJI(view2, this.LLILZ, null, C0UX6.LIVE_BROADCAST_PREVIEW_SETTING_IN_GAME_RANK, null);
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
            C786410Ut5.I7(new AbS694S0100000_12(this, 18), view);
            C444140HbI.LIZ(view, AFwS290S0000000_7.get$arr$(2));
        }
    }

    public final void LJIJ(View view, View view2) {
        this.LLJJLIIIJLLLLLLLZ = view;
        RedDotExtensionKt.LJI(view2, this.LLILZ, null, C0UX6.LIVE_REPLAY_SETTINGS_GUIDE, null);
        if (Intrinsics.LJFF(this.LLJILJILJ, "auto_scroll_item_live_recordings_settings_popup")) {
            RedDotExtensionKt.LJI(view2, this.LL, null, C0UX6.LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_WITH_POPUP, null);
        } else if (Intrinsics.LJFF(this.LLJILJILJ, "auto_scroll_item_live_recordings_settings_red_dot")) {
            RedDotExtensionKt.LJI(view2, this.LL, null, C0UX6.LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_DIRECT, null);
        }
        if (view != null) {
            C500260Jjc.LLFFF(view);
            C786410Ut5.I7(new AbS694S0100000_12(this, 13), view);
        }
    }

    public final void LJIJJLI(View view, View view2) {
        LJJIJL("show");
        C500260Jjc.LLFFF(view);
        if (LiveReplayShareSetting.INSTANCE.enable()) {
            RedDotExtensionKt.LJI(view2, this.LLILZ, null, C0UX6.RED_DOT_MODERATOR_REPLAY_SHARE_SETTING, new AwS586S0100000_7(view2, 56));
        }
        if (view != null) {
            C786410Ut5.I7(new AbS503S0200000_12(view2, this, 1), view);
        }
        C444140HbI.LIZ(view, AFwS290S0000000_7.get$arr$(4));
    }

    public final void LJJI(View view, View view2) {
        Object objGg0;
        if (MultiGuestPlaybookEnableSetting.INSTANCE.enable()) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                objGg0 = dataChannel.gg0(PreviewPageSelectLiveMode.class);
            } else {
                objGg0 = null;
            }
            if (objGg0 == LiveMode.VIDEO) {
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                C773970UXr.LIZ("show");
                RedDotExtensionKt.LJI(view2, this.LL, null, C0UX6.MG_PLAYBOOK_PREVIEW_SETTING_GUIDE, null);
                if (view != null) {
                    C786410Ut5.I7(new ACListenerS147S0100000_12(this, 163), view);
                    C444140HbI.LIZ(view, AFwS290S0000000_7.get$arr$(5));
                    return;
                }
                return;
            }
        }
        if (view == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public final void LJJIII(View view, C16F5 c16f5) {
        String strLJIJI;
        AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard = C0UF5.LJFF;
        if (autoShareLiveCardToBulletinBoard != null && autoShareLiveCardToBulletinBoard.switchStatus != 0) {
            LJJIL("livesdk_live_bbautoshare_entrance_show", false);
            this.LLJJIII = view;
            this.LLJILLL = c16f5;
            if (c16f5 != null) {
                C500260Jjc.LLFFF(c16f5);
            }
            View view2 = this.LLJJIII;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            C16F5 c16f52 = this.LLJILLL;
            if (c16f52 != null) {
                if (autoShareLiveCardToBulletinBoard.switchStatus == 1) {
                    strLJIJI = C497740JfY.LJIJI(2131851474);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131851473);
                }
                c16f52.setText(strLJIJI);
            }
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.BQ2(this.LL, LiveAutoShareBBSwitchEvent.class, new AwS591S0100000_12(this, 402));
            }
            View view3 = this.LLJJIII;
            if (view3 != null) {
                C500260Jjc.LJLIIIL(500L, view3, new AwS591S0100000_12(this, 404));
                return;
            }
            return;
        }
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
    }

    public final void LJJIIJ(View view, View view2) {
        Boolean boolValueOf;
        boolean z;
        C1106750euH c1106750euHLJJIIZI;
        LiveMode liveMode;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(C354201Zc.LJFF(liveMode));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf) || !OneStopShopEntranceSetting.INSTANCE.isEnabled()) {
            return;
        }
        LivePcsOneStopShopCacheDurationSetting livePcsOneStopShopCacheDurationSetting = LivePcsOneStopShopCacheDurationSetting.INSTANCE;
        if (livePcsOneStopShopCacheDurationSetting.isPrefetchEnabled() && (c1106750euHLJJIIZI = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LJJIIZI()) != null) {
            c1106750euHLJJIIZI.LIZIZ(new C1100630ekP(new C0KA1(livePcsOneStopShopCacheDurationSetting.getValue())), "/webcast/sub/upsell/one_stop_shop_setup/info/", C2097908Jt.LIZJ(new Pair("need_setup_data", Boolean.TRUE)), AFwS237S0000000_7.get$arr$(363), AFwS237S0000000_7.get$arr$(364));
        }
        C500260Jjc.LLFFF(view);
        Long lLIZIZ = C0KPJ.Pe.LIZIZ();
        if (lLIZIZ == null || lLIZIZ.longValue() != 0) {
            Long lLIZIZ2 = C0KPJ.Qe.LIZIZ();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis <= lLIZIZ.longValue() + 2592000000L && (jCurrentTimeMillis <= lLIZIZ2.longValue() + 2592000000L || lLIZIZ2.longValue() == 0)) {
                if (lLIZIZ2.longValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C0UX6 c0ux6 = C0UX6.LIVE_GENERAL_SETTINGS_ONE_STOP_SHOP;
                if (!RedDotExtensionKt.LJ(c0ux6) && z) {
                    C782710Un7.LIZ.getClass();
                    C782710Un7.LJIILJJIL.clear();
                }
                RedDotExtensionKt.LJI(view2, this.LL, null, c0ux6, new C491510JPh(this, z, jCurrentTimeMillis));
            }
        }
        if (view != null) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 4), view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(android.view.View r7, X.C16F5 r8) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer.LJJIIZ(android.view.View, X.16F5):void");
    }

    public final void LJJIJIIJI(View view, final C20743716Ff c20743716Ff) {
        DataChannel dataChannel;
        LiveMode liveMode;
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannel2.gg0(RoomCreateInfoChannel.class);
            boolean zLJFF = false;
            if (roomCreateInfo != null && roomCreateInfo.streamTranslationState == 1 && (dataChannel = this.LLILLJJLI) != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null && C354201Zc.LJFF(liveMode)) {
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                if (c20743716Ff == null) {
                    return;
                }
                DataChannel dataChannel3 = this.LLILLJJLI;
                if (dataChannel3 != null) {
                    zLJFF = Intrinsics.LJFF(dataChannel3.gg0(C755600TkU.class), Boolean.FALSE);
                }
                c20743716Ff.setChecked(!zLJFF);
                C786410Ut5.A7(c20743716Ff, new CompoundButton.OnCheckedChangeListener() { // from class: X.01CH
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        c20743716Ff.setChecked(z);
                        DataChannel dataChannel4 = this.LLILLJJLI;
                        if (dataChannel4 != null) {
                            dataChannel4.SX0(C755600TkU.class, Boolean.valueOf(z));
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stream_translation_switch_click");
                        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                        c474500IjALIZ.LJJII("anchor", "admin_type");
                        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
                        c474500IjALIZ.LIZ();
                    }
                });
                return;
            }
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public final void LJJIJIIJIL(boolean z, boolean z2) {
        String str;
        LiveMode liveMode;
        String str2;
        Long lValueOf;
        Pair[] pairArr = new Pair[5];
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        pairArr[0] = new Pair("send_gift_type", str);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        pairArr[1] = new Pair("live_type", C354201Zc.LIZ(liveMode));
        pairArr[2] = new Pair("anchor_id", LJ());
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_gpppa_account", str2);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        pairArr[4] = new Pair("user_id", String.valueOf(lValueOf));
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_click_gift_icon");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_take_page");
        c474500IjALIZ.LJIILIIL("start_broadcast");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJJIIZI(mapLJI);
        c474500IjALIZ.LIZ();
    }

    public final void LJJIL(String str, boolean z) {
        Object objGg0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_bbautoshare_entrance_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_take_page");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (objGg0 = dataChannel.gg0(C0UNN.class)) == null) {
            objGg0 = "";
        }
        c474500IjALIZ.LJJII(objGg0, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.FALSE) ? 1 : 0), "has_red_dot");
        c474500IjALIZ.LIZ();
    }

    public final void LJJJ(boolean z, boolean z2) {
        Object obj;
        Integer numValueOf;
        C758220Toi c758220Toi;
        C758220Toi c758220Toi2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_distribution_scope_icon");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII("show", "event_action_type");
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_private_account");
        if (!z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_sub_only_live");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (c758220Toi2 = (C758220Toi) dataChannel.gg0(VisibleScopeSelectedChannel.class)) != null) {
            int i = c758220Toi2.LIZ;
            if (!z || i != 0) {
                c474500IjALIZ.LJJII(C473420IhQ.LIZ(Integer.valueOf(i)), "distribution_type");
            }
        } else if (!z && !z2) {
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 != null && (c758220Toi = (C758220Toi) dataChannel2.gg0(VisibleScopeSelectedChannel.class)) != null) {
                numValueOf = Integer.valueOf(c758220Toi.LIZ);
            } else {
                numValueOf = null;
            }
            c474500IjALIZ.LJJII(C473420IhQ.LIZ(numValueOf), "distribution_type");
        }
        c474500IjALIZ.LIZ();
    }

    public final void LJJJJ(boolean z, boolean z2) {
        BroadcastSettingResponse broadcastSettingResponse;
        DataChannel dataChannel;
        Boolean bool;
        DataChannel dataChannel2 = this.LLILLJJLI;
        boolean zIsChecked = false;
        if (dataChannel2 != null && (broadcastSettingResponse = (BroadcastSettingResponse) dataChannel2.gg0(BroadcastSettingResponseChannel.class)) != null && broadcastSettingResponse.showGiftGallerySettingSwitch == 1) {
            if (z2) {
                if (z && (dataChannel = this.LLILLJJLI) != null && (bool = (Boolean) dataChannel.gg0(OptOutGiftGalleryChannel.class)) != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    C20743716Ff c20743716Ff = this.LLLIIII;
                    if (c20743716Ff != null) {
                        c20743716Ff.setChecked(!zBooleanValue);
                    }
                }
                C20743716Ff c20743716Ff2 = this.LLLIIII;
                if (c20743716Ff2 != null) {
                    c20743716Ff2.setEnabled(true);
                }
            } else {
                C20743716Ff c20743716Ff3 = this.LLLIIII;
                if (c20743716Ff3 != null) {
                    c20743716Ff3.setChecked(false);
                }
                C20743716Ff c20743716Ff4 = this.LLLIIII;
                if (c20743716Ff4 != null) {
                    c20743716Ff4.setEnabled(false);
                }
            }
            C20743716Ff c20743716Ff5 = this.LLLIIII;
            if (c20743716Ff5 != null) {
                zIsChecked = c20743716Ff5.isChecked();
            }
            DataChannel dataChannel3 = this.LLILLJJLI;
            if (dataChannel3 != null) {
                dataChannel3.zW(OptOutGiftGalleryChannel.class, Boolean.valueOf(!zIsChecked));
            }
        }
    }

    public final void LJJJJLL(LiveMode liveMode, C16F5 c16f5) {
        String strLJIJI;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        EnumC754690Tj1.Companion.getClass();
        EnumC754690Tj1 enumC754690Tj1LIZ = C754670Tiz.LIZ(liveMode);
        if (enumC754690Tj1LIZ != null) {
            Hashtag hashtag = enumC754690Tj1LIZ.getHashtag();
            GameTag gameTag = enumC754690Tj1LIZ.getGameTag();
            StringBuffer stringBuffer = new StringBuffer();
            if (hashtag != null && C468960IaE.LIZ(hashtag)) {
                strLJIJI = hashtag.title;
            } else {
                strLJIJI = C497740JfY.LJIJI(2131842853);
            }
            stringBuffer.append(strLJIJI);
            if (gameTag != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" | ");
                sbLIZ.append(gameTag.showName);
                stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (c16f5 != null) {
                c16f5.setText(stringBuffer);
            }
            Hashtag hashtag2 = enumC754690Tj1LIZ.getHashtag();
            if (hashtag2 != null && (dataChannel2 = this.LLILLJJLI) != null) {
                dataChannel2.zW(HashtagChangedChannel.class, hashtag2);
            }
            GameTag gameTagFB = ((IGameTopicService) C1161920gLG.LIZJ(IGameTopicService.class)).fB(liveMode);
            if (gameTagFB != null && (dataChannel = this.LLILLJJLI) != null) {
                dataChannel.zW(PreviewPagerSelectedGameItem.class, gameTagFB);
            }
        }
    }

    public final void LIZ(final View view, final C20743716Ff c20743716Ff, final CharSequence charSequence) {
        if (view == null || c20743716Ff == null) {
            return;
        }
        final String string = this.LL.getString(2131844520);
        final String string2 = this.LL.getString(2131840896);
        final String string3 = this.LL.getString(2131840895);
        c20743716Ff.setImportantForAccessibility(2);
        q0.LJIJ(view, new C20094213jo() { // from class: X.127F
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                String str;
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (!view.hasOnClickListeners() && c20743716Ff.isEnabled()) {
                    C786410Ut5.I7(new ACListenerS163S0100000_29(c20743716Ff, 16), view);
                }
                accessibilityNodeInfoCompat.setCheckable(true);
                accessibilityNodeInfoCompat.setChecked(c20743716Ff.isChecked());
                accessibilityNodeInfoCompat.setEnabled(c20743716Ff.isEnabled());
                accessibilityNodeInfoCompat.setContentDescription(charSequence);
                accessibilityNodeInfoCompat.setRoleDescription(string);
                View view3 = view;
                if (c20743716Ff.isChecked()) {
                    str = string2;
                } else {
                    str = string3;
                }
                q0.LJJIFFI(view3, str);
            }
        });
    }

    public final SpannableString LIZLLL(String str, String str2, ClickableSpan clickableSpan) {
        int length;
        int length2;
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        if (str2 != null) {
            length2 = str2.length();
        } else {
            length2 = 0;
        }
        int i = length - length2;
        SpannableString spannableString = new SpannableString(str);
        C1119920fFW.LJ(this.LL.getContext(), spannableString, 0, i, 17, 8, 400);
        C1119920fFW.LJ(this.LL.getContext(), spannableString, i, spannableString.length(), 17, 8, 500);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.fy6, this.LL.getContext())), 0, i, 17);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ewy, this.LL.getContext())), i, spannableString.length(), 17);
        C786410Ut5.p2(spannableString, clickableSpan, i, spannableString.length(), 17);
        return spannableString;
    }

    public final void LJI(View view, View view2, C16F5 c16f5) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), new C522020Kdc(CoroutineExceptionHandler.LJJLIL, 0), null, new BasePreviewSettingMainFragmentSheetInitializer$initAIReply$1(view, this, view2, c16f5, null), 2);
    }

    public final void LJII(View view, View view2, C16F5 c16f5) {
        String strLJIJI;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        RedDotExtensionKt.LJI(view2, this.LL, null, C0UX6.LIVE_AI_SUMMARY_PREVIEW_SETTING_GUIDE, null);
        if (c16f5 != null) {
            C758130ToZ c758130ToZLJ = C0UF5.LJ();
            if (c758130ToZLJ != null && c758130ToZLJ.LIZ) {
                strLJIJI = C497740JfY.LJIJI(2131851024);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131851023);
            }
            c16f5.setText(strLJIJI);
        }
        if (view != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 162), view);
            C444140HbI.LIZ(view, AFwS290S0000000_7.get$arr$(3));
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LL, AISummaryStatusEvent.class, new AwS586S0100000_7(c16f5, 57));
        }
    }

    public final void LJIIIZ(View view, C20743716Ff c20743716Ff, C16F5 c16f5) {
        int i;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (c20743716Ff == null) {
            return;
        }
        c20743716Ff.setChecked(Intrinsics.LJFF(InterfaceC772190UQv.O3.LIZ(), Boolean.TRUE));
        C786410Ut5.A7(c20743716Ff, new C521680Kd4(c20743716Ff, this, 0));
        if (LiveHostSettingsUIConfig.enable()) {
            i = 2131853402;
        } else {
            i = 2131850524;
        }
        if (c16f5 != null) {
            String strLJIJI = C497740JfY.LJIJI(2131850525);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C497740JfY.LJIJI(i));
            sbLIZ.append(' ');
            sbLIZ.append(strLJIJI);
            c16f5.setText(LIZLLL(C2188811AlT.LIZIZ(sbLIZ), strLJIJI, new C521520Kco(this, c20743716Ff, 2)));
            c16f5.setLinksClickable(true);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setHighlightColor(0);
        }
    }

    public final void LJIIJJI(View view, C20743716Ff c20743716Ff, LiveIconView liveIconView) {
        RoomCreateInfo roomCreateInfo;
        DataChannel dataChannel;
        LiveMode liveMode;
        String str;
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && (roomCreateInfo = (RoomCreateInfo) dataChannel2.gg0(RoomCreateInfoChannel.class)) != null && roomCreateInfo.anchorCanOpenCaption && (dataChannel = this.LLILLJJLI) != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null && C354201Zc.LJFF(liveMode)) {
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            if (c20743716Ff != null) {
                c20743716Ff.setChecked(InterfaceC1106030et7.v6.LIZIZ().booleanValue());
                C786410Ut5.A7(c20743716Ff, new C785920UsI(this, c20743716Ff, 1));
            }
            if (liveIconView != null) {
                C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 28));
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_caption_icon_show");
            c474500IjALIZ.LJIL();
            Map<String, String> mapLIZIZ = LIZIZ();
            if (InterfaceC1106030et7.v6.LIZIZ().booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            ((HashMap) mapLIZIZ).put("current_status", str);
            c474500IjALIZ.LJJIIZI(mapLIZIZ);
            c474500IjALIZ.LJ("show");
            c474500IjALIZ.LIZ();
            return;
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public final void LJJIIZI(View view, C16F5 c16f5, LiveIconView liveIconView) {
        C758220Toi c758220Toi;
        if (view != null) {
            C500260Jjc.LLFFF(view);
            boolean zIsPrivateAccount = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount();
            LJJJ(zIsPrivateAccount, C494680Jac.LIZJ());
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.EQ2(this.LLILZ, VisibleScopeSelectedChannel.class, new AwS34S0310000_12(view, c16f5, liveIconView, zIsPrivateAccount, 1));
            }
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 != null) {
                c758220Toi = (C758220Toi) dataChannel2.gg0(VisibleScopeSelectedChannel.class);
            } else {
                c758220Toi = null;
            }
            LJJIJ(view, c16f5, liveIconView, zIsPrivateAccount, c758220Toi);
            C786410Ut5.I7(new ACListenerS72S0110000_12(this, zIsPrivateAccount, 4), view);
            if (!this.LLJILJIL && !this.LLJJIJIIJIL) {
                C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.t9;
                if (c20337914i1.LIZIZ().booleanValue()) {
                    c20337914i1.LJFF(Boolean.FALSE);
                    InterfaceC500690JkJ interfaceC500690JkJNw1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nw1(view);
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC521700Kd6(interfaceC500690JkJNw1, 0));
                    if (interfaceC500690JkJNw1 != null) {
                        interfaceC500690JkJNw1.LIZ();
                    }
                }
            }
        }
    }

    public final void LJJJJL(View view, C16F5 c16f5, DataChannel dataChannel) {
        Boolean boolValueOf;
        RoomCreateInfo roomCreateInfo;
        LiveGoLivePageContainer liveGoLivePageContainer;
        List<AboveGoLiveButtonComponent> list;
        AboveGoLiveButtonComponent next;
        String strValueOf;
        LiveMode liveMode;
        CharSequence text = null;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(C354201Zc.LJFF(liveMode));
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIFFI(boolValueOf)) {
            if (C770730ULf.LJII(dataChannel)) {
                if (C770730ULf.LJFF(dataChannel) && AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable()) {
                    return;
                }
            } else {
                return;
            }
        }
        if (dataChannel != null && (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) != null && (liveGoLivePageContainer = roomCreateInfo.liveGoLivePageContainer) != null && (list = liveGoLivePageContainer.aboveGoLiveButtonContainer) != null) {
            Iterator<AboveGoLiveButtonComponent> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.type == 25) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AboveGoLiveButtonComponent aboveGoLiveButtonComponent = next;
            if (aboveGoLiveButtonComponent != null) {
                this.LLJJJJLIIL = view;
                if (view != null) {
                    C500260Jjc.LLFFF(view);
                    C500260Jjc.LJLIIIL(500L, view, new AwS221S0300000_12(this, dataChannel, aboveGoLiveButtonComponent, 3));
                }
                LJJJJZ(c16f5);
                if (dataChannel != null) {
                    dataChannel.BQ2(this.LLILZ, LocationSwitchType.class, new AwS373S0200000_7(c16f5, this, 3));
                }
                Map<String, String> map = aboveGoLiveButtonComponent.trackExtra;
                if (C500260Jjc.LJJJJIZL(c16f5)) {
                    if (c16f5 != null) {
                        text = c16f5.getText();
                    }
                    strValueOf = String.valueOf(text);
                } else {
                    strValueOf = "";
                }
                map.put("displayed_location", strValueOf);
                C760180Trs.LJIIL(dataChannel, map);
            }
        }
    }

    public BasePreviewSettingMainFragmentSheetInitializer(Fragment fragment, DataChannel dataChannel, C20484615Do c20484615Do, LifecycleOwner lifecycleOwner) {
        this.LL = fragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = c20484615Do;
        this.LLILZ = lifecycleOwner;
    }

    public final void LJIIJ(View view, View view2, LiveIconView liveIconView, C16F5 c16f5) {
        Boolean boolValueOf;
        LiveMode liveMode;
        Context context = this.LL.getContext();
        this.LLJZIJLIL = view;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLJLILLLLZIIL = false;
        if (LIZJ()) {
            if (c16f5 != null) {
                c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.ezt, context));
            }
            if (liveIconView != null) {
                liveIconView.setIconTint(C497740JfY.LIZLLL(R.attr.ezt, context));
            }
        }
        if (C760180Trs.LJII() && C0UJW.LIZ) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
                boolValueOf = Boolean.valueOf(C354201Zc.LJFF(liveMode));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                DataChannel dataChannel2 = this.LLILLJJLI;
                if (dataChannel2 != null) {
                    dataChannel2.EQ2(this.LLILZ, BoardsPermissionChannel.class, new AwS591S0100000_12(this, 797));
                }
                AwS448S0200000_12 awS448S0200000_12 = new AwS448S0200000_12(view2, this, 4);
                if (SmbGoLivePageUnifyEnable.INSTANCE.getValue()) {
                    DataChannel dataChannel3 = this.LLILLJJLI;
                    if (dataChannel3 != null) {
                        dataChannel3.EQ2(this.LLILZ, SMBLegacyBoardsPermission.class, new AwS591S0100000_12(awS448S0200000_12, 798));
                    }
                } else {
                    DataChannel dataChannel4 = this.LLILLJJLI;
                    if (dataChannel4 != null) {
                        dataChannel4.BQ2(this.LLILZ, SMBLegacyBoardsPermission.class, new AwS591S0100000_12(awS448S0200000_12, 801));
                    }
                }
                View view3 = this.LLJZIJLIL;
                if (view3 != null) {
                    C786410Ut5.I7(new ACListenerS147S0100000_12(this, 320), view3);
                }
                View view4 = this.LLJZIJLIL;
                if (view4 != null) {
                    C444140HbI.LIZ(view4, AFwS289S0000000_6.get$arr$(41));
                }
            }
        }
    }

    public final void LJIILJJIL(View view, View view2, C16F5 c16f5, C16F5 c16f52) {
        String str;
        Boolean boolValueOf;
        RoomCreateInfo roomCreateInfo;
        LiveMode liveMode;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null || (str = liveMode.logStreamingType) == null) {
            str = "";
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C01C3.LJ(this.LLILLJJLI, "setting", str, false, false, true);
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && (roomCreateInfo = (RoomCreateInfo) dataChannel2.gg0(RoomCreateInfoChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(C0KWM.LIZJ(Long.valueOf(roomCreateInfo.pollTemplateOptimizeGroup)));
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        if (zLJJJI) {
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131855314));
            }
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131855313));
            }
        }
        if (view != null) {
            C786410Ut5.I7(new ACListenerS40S0210000_7(this, view2, zLJJJI, 0), view);
            C444140HbI.LIZ(view, AFwS290S0000000_7.get$arr$(10));
        }
    }

    public final void LJIL(View view, View view2, LiveIconView liveIconView, C16F5 c16f5) {
        Object objGg0;
        Boolean bool;
        InterfaceC390601fU effectBoardService;
        C013C c013c = new C013C();
        c013c.element = true;
        DataChannel dataChannel = this.LLILLJJLI;
        ViewGroup viewGroup = null;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(PreviewPageSelectLiveMode.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == LiveMode.VIDEO) {
            IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
            if (iEffectService != null && (effectBoardService = iEffectService.getEffectBoardService("anchor", "")) != null && effectBoardService.LJIIIIZZ()) {
                c013c.element = false;
                int iLIZLLL = C497740JfY.LIZLLL(R.attr.ezt, this.LL.getContext());
                if (c16f5 != null) {
                    c16f5.setTextColor(iLIZLLL);
                }
                if (liveIconView != null) {
                    liveIconView.setIconTint(iLIZLLL);
                }
            }
            C21658019pS c21658019pS = new C21658019pS(this.LLILZLL, view, new AwS556S0100000_12(this, 755));
            c21658019pS.LIZIZ();
            this.LLJJIJIL = c21658019pS;
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(LivePreviewHasMultiGuestPermissionChannel.class), Boolean.TRUE)) {
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
            } else if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C773970UXr.LIZ("show");
            DataChannel dataChannel3 = this.LLILLJJLI;
            if (dataChannel3 != null && Intrinsics.LJFF(dataChannel3.gg0(PreviewLiveMultiGuestSettingRedDot.class), Boolean.TRUE)) {
                RedDotExtensionKt.LJI(view2, this.LLILZ, null, C0UX6.MG_PREVIEW_LIVE_LAYOUT_SETTING_GUIDE, null);
            }
            DataChannel dataChannel4 = this.LLILLJJLI;
            if (dataChannel4 != null) {
                dataChannel4.BQ2(this.LLILZ, PreviewLiveMultiGuestSettingRedDot.class, new AwS378S0200000_12(view2, this, 59));
            }
            DataChannel dataChannel5 = this.LLILLJJLI;
            if (dataChannel5 != null) {
                bool = (Boolean) dataChannel5.gg0(MultiGuestPreviewLiveSettingHighLightEvent.class);
            } else {
                bool = null;
            }
            if (C500260Jjc.LJJJI(bool)) {
                if (view instanceof LinearLayout) {
                    viewGroup = (ViewGroup) view;
                }
                LJJJJJL(viewGroup);
                DataChannel dataChannel6 = this.LLILLJJLI;
                if (dataChannel6 != null) {
                    dataChannel6.zW(MultiGuestPreviewLiveSettingHighLightEvent.class, Boolean.FALSE);
                }
            }
            if (view != null) {
                C786410Ut5.I7(new ACListenerS116S0200000_12(c013c, this, 60), view);
            }
            C21658019pS c21658019pS2 = this.LLJJIJIL;
            if (c21658019pS2 != null) {
                c21658019pS2.LIZ();
            }
        } else if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        DataChannel dataChannel7 = this.LLILLJJLI;
        if (dataChannel7 != null) {
            dataChannel7.BQ2(this.LL, LivePreviewHasMultiGuestPermissionChannel.class, new AwS582S0100000_3(view, 91));
        }
    }

    public final void LJJIFFI(View view, C16F5 c16f5, C16F5 c16f52, LiveIconView liveIconView) {
        AwS74S0500000_12 awS74S0500000_12 = new AwS74S0500000_12(view, this, c16f5, c16f52, liveIconView, 0);
        awS74S0500000_12.invoke();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLILZ, PanelLayoutTypeChangeEvent.class, new AwS591S0100000_12(awS74S0500000_12, 400));
        }
    }

    public final void ne2(View view, C16F5 c16f5, C16F5 c16f52, C20743716Ff c20743716Ff) {
        Object objGg0;
        RoomCreateInfo roomCreateInfo;
        List<AnchorReminderWordStatus> list;
        DataChannel dataChannel = this.LLILLJJLI;
        AnchorReminderWordStatus anchorReminderWordStatus = null;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(LiveModeChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 != LiveMode.VIDEO) {
            return;
        }
        AnchorReminderWordStatus anchorReminderWordStatus2 = C0UF5.LJ;
        if (anchorReminderWordStatus2 == null) {
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 != null && (roomCreateInfo = (RoomCreateInfo) dataChannel2.gg0(RoomCreateInfoChannel.class)) != null && (list = roomCreateInfo.reminderWordStatus) != null) {
                Iterator<AnchorReminderWordStatus> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AnchorReminderWordStatus next = it2.next();
                    if (Intrinsics.LJFF(next.scene, "agency_platform")) {
                        anchorReminderWordStatus = next;
                        break;
                    }
                }
                AnchorReminderWordStatus anchorReminderWordStatus3 = anchorReminderWordStatus;
                if (anchorReminderWordStatus3 != null) {
                    anchorReminderWordStatus2 = anchorReminderWordStatus3;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_manager_cues_switch_show");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJJII("live_take_setting", "event_page");
        c474500IjALIZ.LJJII(Integer.valueOf(anchorReminderWordStatus2.status), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LIZ();
        if (c16f5 != null) {
            c16f5.setText(anchorReminderWordStatus2.title);
        }
        if (c16f52 != null) {
            c16f52.setText(anchorReminderWordStatus2.desc);
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (c20743716Ff == null) {
            return;
        }
        c20743716Ff.setToggleEnabled(false);
        c20743716Ff.setDebounceClickEnabled(true);
        c20743716Ff.setDelayInterval(500L);
        c20743716Ff.setEnabled(false);
        c20743716Ff.setDisabledAlpha(1.0f);
        C1834150xpV.LJIIJ(c20743716Ff, true);
        int i = anchorReminderWordStatus2.status;
        if (i != 0) {
            if (i == 1) {
                c20743716Ff.setChecked(true);
            }
        } else {
            c20743716Ff.setChecked(false);
        }
        C500260Jjc.LJLIIIL(500L, c20743716Ff, new AwS221S0300000_12(c20743716Ff, this, anchorReminderWordStatus2, 2));
    }

    public static final void LJJIJ(View view, C16F5 c16f5, LiveIconView liveIconView, boolean z, C758220Toi c758220Toi) {
        Integer numValueOf;
        int size;
        List<Long> list;
        if (c758220Toi != null) {
            numValueOf = Integer.valueOf(c758220Toi.LIZ);
        } else if (!z && !C494680Jac.LIZJ()) {
            numValueOf = 0;
        } else {
            numValueOf = null;
        }
        C500260Jjc.LLFFF(c16f5);
        if (numValueOf != null && numValueOf.intValue() == 0) {
            if (c16f5 != null) {
                c16f5.setText(2131856080);
            }
            if (LiveHostSettingsUIConfig.enable() && liveIconView != null) {
                liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.dm0, view.getContext()));
                return;
            }
            return;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 3) {
                if (c16f5 != null) {
                    c16f5.setText(2131853486);
                }
                if (!LiveHostSettingsUIConfig.enable() || liveIconView == null) {
                    return;
                }
                liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.dm0, view.getContext()));
                return;
            }
            if (numValueOf != null) {
                if (numValueOf.intValue() == 1) {
                    if (c16f5 != null) {
                        c16f5.setText(2131856082);
                    }
                    if (!LiveHostSettingsUIConfig.enable() || liveIconView == null) {
                        return;
                    }
                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.e77, view.getContext()));
                    return;
                }
                if (numValueOf.intValue() == 2) {
                    if (c758220Toi != null && (list = c758220Toi.LIZIZ) != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    String strLJIIL = C497740JfY.LJIIL(2131755976, size, Integer.valueOf(size));
                    if (c16f5 != null) {
                        c16f5.setText(strLJIIL);
                    }
                    if (!LiveHostSettingsUIConfig.enable() || liveIconView == null) {
                        return;
                    }
                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.e8_, view.getContext()));
                    return;
                }
            }
        }
        if (((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount()) {
            if (c16f5 != null) {
                c16f5.setText(2131853486);
            }
        } else {
            C500260Jjc.LJIILIIL(c16f5);
        }
        if (!LiveHostSettingsUIConfig.enable() || liveIconView == null) {
            return;
        }
        liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.dm0, view.getContext()));
    }

    public final void LJIIIIZZ(View view, C16F5 c16f5, C16F5 c16f52, View view2, C20743716Ff c20743716Ff, LiveIconView liveIconView) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C462101r1(this, view, c16f5, c16f52, view2, c20743716Ff, liveIconView, null), 3);
    }
}
