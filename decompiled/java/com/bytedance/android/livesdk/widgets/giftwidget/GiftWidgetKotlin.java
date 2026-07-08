package com.bytedance.android.livesdk.widgets.giftwidget;

import X.AbstractC1135610fep;
import X.AbstractC1143340frI;
import X.C001A;
import X.C012A;
import X.C012H;
import X.C086I;
import X.C093Y;
import X.C096800Yc;
import X.C0IJT;
import X.C0IK5;
import X.C0QSJ;
import X.C0TZM;
import X.C1077800e9a;
import X.C1101370elb;
import X.C1101480elm;
import X.C1118220fCm;
import X.C1118340fCy;
import X.C1118370fD1;
import X.C1120770fGt;
import X.C1121430fHx;
import X.C1121570fIB;
import X.C1123300fKy;
import X.C1123590fLR;
import X.C1124420fMm;
import X.C1125250fO7;
import X.C1125300fOC;
import X.C1125360fOI;
import X.C1125800fP0;
import X.C1125820fP2;
import X.C1126610fQJ;
import X.C1127330fRT;
import X.C1128450fTH;
import X.C1128630fTZ;
import X.C1128760fTm;
import X.C1128970fU7;
import X.C1129070fUH;
import X.C1129570fV5;
import X.C1129650fVD;
import X.C1129760fVO;
import X.C1130100fVw;
import X.C1130790fX3;
import X.C1131070fXV;
import X.C1131090fXX;
import X.C1131110fXZ;
import X.C1131140fXc;
import X.C1131150fXd;
import X.C1131200fXi;
import X.C1131350fXx;
import X.C1131370fXz;
import X.C1131900fYq;
import X.C1131940fYu;
import X.C1131950fYv;
import X.C1132000fZ0;
import X.C1132070fZ7;
import X.C1132190fZJ;
import X.C1132240fZO;
import X.C1132350fZZ;
import X.C1132700fa8;
import X.C1132840faM;
import X.C1132890faR;
import X.C1132970faZ;
import X.C1133470fbN;
import X.C1134030fcH;
import X.C1135580fem;
import X.C1138230fj3;
import X.C1142070fpF;
import X.C1143170fr1;
import X.C1143180fr2;
import X.C1143330frH;
import X.C1143560fre;
import X.C1145050fu3;
import X.C1161920gLG;
import X.C11JF;
import X.C11NJ;
import X.C145800h6;
import X.C149600hi;
import X.C1548820qPI;
import X.C177100m9;
import X.C177500mD;
import X.C1802460x0O;
import X.C182800n4;
import X.C19994513Lb;
import X.C19GO;
import X.C1AF0;
import X.C1CC2;
import X.C20441214yg;
import X.C21287018Se;
import X.C2188811AlT;
import X.C2209808lE;
import X.C249900xt;
import X.C250000xu;
import X.C262100zr;
import X.C2632010c;
import X.C2633010d;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501510Jld;
import X.C501520Jle;
import X.C673150Qan;
import X.C687700QyG;
import X.C766270U4b;
import X.C776250Uch;
import X.C781880Ulm;
import X.C784440Upu;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC1120600fGc;
import X.EnumC1125400fOM;
import X.EnumC1129230fUX;
import X.EnumC1130940fXI;
import X.EnumC1131980fYy;
import X.EnumC1133020fae;
import X.EnumC1805420x5A;
import X.EnumC994150byf;
import X.InterfaceC1077780e9Y;
import X.InterfaceC1077820e9c;
import X.InterfaceC1078630eAv;
import X.InterfaceC1107590evd;
import X.InterfaceC1118240fCo;
import X.InterfaceC1128210fSt;
import X.InterfaceC1131100fXY;
import X.InterfaceC1132010fZ1;
import X.InterfaceC1133090fal;
import X.InterfaceC1133110fan;
import X.InterfaceC1133530fbT;
import X.InterfaceC1141530foN;
import X.InterfaceC1145110fu9;
import X.InterfaceC1146704e9;
import X.InterfaceC687730QyJ;
import X.RunnableC514501zT;
import X.RunnableC514801zW;
import Y.ARunnableS23S0101000_12;
import Y.ARunnableS86S0200000_17;
import Y.AUListenerS220S0200000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.toolbar.HideShareLeadEvent;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.livesdk.CollaborateGiftingStateChannel;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.effect.LiveGiftEffectWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.LiveNewGiftDialog;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.GiftLeafRootWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.DynamicRestriction;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftOption;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftRecommendInfo;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueSettings;
import com.bytedance.android.livesdk.livesetting.gift.GiftToUserHelperResetLeaveRoomSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftAnchorListCacheSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftIconGuideSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSyncAnchorAudienceV2Setting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSyncCustomSettingDelay;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.GiftDynamicRestrictionMessage;
import com.bytedance.android.livesdk.model.message.GiftGlobalMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftRecommendationMessage;
import com.bytedance.android.livesdk.model.message.LiveTrayMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceGift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidgetKotlin;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdk.wishlistv2.dialog.LiveStreamGoalMessageDialog;
import com.bytedance.android.livesdkapi.depend.model.live.FilterMsgRuleParamRandom;
import com.bytedance.android.livesdkapi.depend.model.live.LiveFilterMsgRule;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftWidgetKotlin extends LiveRecyclableWidget implements InterfaceC1133530fbT, InterfaceC1077780e9Y, InterfaceC1132010fZ1, InterfaceC1118240fCo, InterfaceC1141530foN, C0QSJ, InterfaceC1146704e9 {
    public static final Set<Integer> LLLIIL = C093Y.LJ(2, 3, 18, 5, 10, 23, 27, 101);
    public BPEAHandler LL;
    public LiveNewGiftDialog LLILLJJLI;
    public AbsNormalGiftAnimWidget LLILLL;
    public LiveGiftEffectWidget LLILZ;
    public GiftLeafRootWidget LLILZIL;
    public IMessageManager LLIZ;
    public C1131110fXZ LLJ;
    public C1134030fcH LLJI;
    public C1118220fCm LLJIJIL;
    public C1132070fZ7 LLJILJIL;
    public C1132350fZZ LLJILJILJ;
    public C1118370fD1 LLJILLL;
    public C2632010c LLJJ;
    public C249900xt LLJJI;
    public InterfaceC1078630eAv LLJJIII;
    public InterfaceC1077820e9c LLJJIJI;
    public Room LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C149600hi LLJJJ;
    public C1129760fVO LLJJJIL;
    public C1132890faR LLJJJJ;
    public ValueAnimator LLJJJJJIL;
    public C1131200fXi LLJJL;
    public C145800h6 LLJJLIIIJLLLLLLLZ;
    public C1132190fZJ LLJLILLLLZIIL;
    public ARunnableS86S0200000_17 LLJLLL;
    public ARunnableS86S0200000_17 LLJZ;
    public C1131150fXd LLJZIJLIL;
    public C1132840faM LLL;
    public int LLLFF;
    public C1133470fbN LLLI;
    public boolean LLLII;
    public int LLLIIII;
    public final C1131090fXX LLILZLL = new C1131090fXX();
    public final WidgetCreateTimeUtil LLIZLLLIL = new WidgetCreateTimeUtil(null);
    public final C11NJ LLJJJJLIIL = new C11NJ();
    public final C1121430fHx LLJL = new InterfaceC1145110fu9() { // from class: X.0fHx
        public final List<String> LIZ = Collections.singletonList("catch_bean_gift_guide");

        @Override // X.InterfaceC1145110fu9
        public final List<String> LIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC1145110fu9
        public final void LIZIZ(String str, C01JS c01js) {
            C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0fHw
            });
            C20441214yg.LIZIZ("updateBattleCountDown", "post MatchGameGiftGuideBubbleEvent");
        }
    };
    public final C1135580fem LLJLIL = new C1135580fem();
    public final RunnableC514801zW LLJLL = new RunnableC514801zW(this, 43);
    public final RunnableC514801zW LLJLLIL = new RunnableC514801zW(this, 42);
    public List<GiftPage> LLLF = new ArrayList();
    public final C1131350fXx LLLFFI = new InterfaceC1133110fan() { // from class: X.0fXx
        @Override // X.InterfaceC1133110fan
        public final void LIZLLL(GiftListResult giftListResult, int i) {
            InterfaceC1100860ekm interfaceC1100860ekmSg;
            if (GiftWidgetKotlin.LLLIIL.contains(Integer.valueOf(i)) && giftListResult != null && giftListResult.giftPages != null) {
                this.LL.LLLF = new ArrayList(giftListResult.giftPages);
                GiftWidgetKotlin giftWidgetKotlin = this.LL;
                giftWidgetKotlin.LLLFF = i;
                giftWidgetKotlin.LLJLILLLLZIIL = new C1132190fZJ(giftListResult.giftsInfo.strategyContext, giftListResult.realtimeServerPassthrough);
                GiftLeafRootWidget giftLeafRootWidget = giftWidgetKotlin.LLILZIL;
                if (giftLeafRootWidget != null) {
                    giftLeafRootWidget.LL.LIZ = giftListResult.giftPages;
                }
                IDebugService iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
                if (iDebugService != null && (interfaceC1100860ekmSg = iDebugService.Sg()) != null) {
                    try {
                        C1129310fUf.LIZ.getClass();
                        ((C1133970fcB) interfaceC1100860ekmSg).LIZIZ(giftListResult, i, C1129310fUf.LIZIZ, C1129310fUf.LIZJ);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
    };
    public final C1123300fKy LLLFZ = new InterfaceC1133110fan() { // from class: X.0fKy
        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
        @Override // X.InterfaceC1133110fan
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZLLL(com.bytedance.android.livesdk.gift.model.GiftListResult r15, int r16) {
            /*
                Method dump skipped, instruction units count: 586
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1123300fKy.LIZLLL(com.bytedance.android.livesdk.gift.model.GiftListResult, int):void");
        }
    };
    public final C177500mD LLLIIIIL = new OnIMMessageListener() { // from class: X.00mD
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "GiftRestriction";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            if (iMessage instanceof GiftDynamicRestrictionMessage) {
                C177100m9 filterManager = GiftManager.inst().getFilterManager();
                GiftDynamicRestrictionMessage giftDynamicRestrictionMessage = (GiftDynamicRestrictionMessage) iMessage;
                DynamicRestriction dynamicRestriction = giftDynamicRestrictionMessage.dynamicRestriction;
                long j = giftDynamicRestrictionMessage.baseMessage.roomId;
                filterManager.getClass();
                if (dynamicRestriction != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("applyOrUpdateInfoFromIM:");
                    sbLIZ.append(j);
                    sbLIZ.append(' ');
                    sbLIZ.append(C177100m9.LIZLLL(dynamicRestriction));
                    C20441214yg.LJ("GiftFilterManager", C2188811AlT.LIZIZ(sbLIZ));
                    filterManager.LIZ.put(Long.valueOf(j), dynamicRestriction);
                }
            }
        }
    };
    public final C2633010d LLLIIIL = new OnIMMessageListener() { // from class: X.010d
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "RecommendExclusiveGift";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.ASYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            if (iMessage instanceof GiftRecommendationMessage) {
                C012A c012a = C012A.LIZ;
                Map<Long, GiftRecommendInfo> map = ((GiftRecommendationMessage) iMessage).recommendInfos;
                c012a.getClass();
                C012A.LIZ(map);
            }
        }
    };

    @Override // X.InterfaceC1077780e9Y
    public final void LJJLJ() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{GiftWidgetScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hz8;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(GiftWidgetScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(GiftWidgetScope.class);
        return arrayList;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
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
        BPEAHandler bPEAHandler;
        BPEAHandler bPEAHandler2;
        DataChannel dataChannel;
        try {
            C1125800fP0.LIZLLL = false;
            IMessageManager iMessageManager = null;
            if (GiftToUserHelperResetLeaveRoomSetting.INSTANCE.isEnabled()) {
                ((LinkedList) C1125800fP0.LIZIZ).clear();
                C1125800fP0.LIZJ = null;
            }
            C1133470fbN c1133470fbN = this.LLLI;
            if (c1133470fbN != null) {
                c1133470fbN.LIZ();
            }
            this.LLILZLL.LJI();
            C20441214yg.LIZ("GiftWidget unLoad");
            C149600hi c149600hi = this.LLJJJ;
            if (c149600hi != null) {
                IMessageManager iMessageManager2 = c149600hi.LL;
                if (iMessageManager2 != null) {
                    iMessageManager2.removeMessageListener(C001A.GIFT_COLLECTION_UPDATE_MESSAGE.getIntType(), c149600hi);
                }
                IMessageManager iMessageManager3 = c149600hi.LL;
                if (iMessageManager3 != null) {
                    iMessageManager3.removeMessageListener(C001A.GIFT_PROGRESS_MESSAGE.getIntType(), c149600hi);
                }
            }
            if (E1()) {
                C1132700fa8.LIZ.clear();
            }
            if (LiveGiftAnchorListCacheSetting.INSTANCE.enable()) {
                C096800Yc.LIZ = null;
            }
            GiftManager.inst().unRegisterGiftListListener(this.LLLFFI);
            GiftManager.inst().unRegisterGiftListListener(this.LLLFZ);
            ((ILiveClientAIService) C1161920gLG.LIZJ(ILiveClientAIService.class)).IM0();
            List<String> list = C1101480elm.LIZ;
            C1131200fXi c1131200fXi = this.LLJJL;
            if (c1131200fXi != null) {
                c1131200fXi.LIZ();
                c1131200fXi.LIZLLL();
            }
            this.LLJJL = null;
            C145800h6 c145800h6 = this.LLJJLIIIJLLLLLLLZ;
            if (c145800h6 != null) {
                c145800h6.LIZLLL();
            }
            this.LLJJLIIIJLLLLLLLZ = null;
            C012A.LIZ.getClass();
            C012H c012h = C012H.LJIIIIZZ;
            if (c012h != null) {
                c012h.LJ = null;
                RunnableC514501zT runnableC514501zT = c012h.LIZLLL;
                if (runnableC514501zT != null) {
                    c012h.LIZ.removeCallbacks(runnableC514501zT);
                }
                c012h.LIZLLL = null;
            }
            C012H c012h2 = C012H.LJIIIZ;
            if (c012h2 != null) {
                c012h2.LJ = null;
                RunnableC514501zT runnableC514501zT2 = c012h2.LIZLLL;
                if (runnableC514501zT2 != null) {
                    c012h2.LIZ.removeCallbacks(runnableC514501zT2);
                }
                c012h2.LIZLLL = null;
            }
            C1142070fpF.LIZ.getClass();
            C1142070fpF.LJIIJJI = false;
            IMusicGiftService iMusicGiftServiceLJIILIIL = C1142070fpF.LJIILIIL();
            if (iMusicGiftServiceLJIILIIL != null && iMusicGiftServiceLJIILIIL.b20() == C1142070fpF.LJIIL) {
                iMusicGiftServiceLJIILIIL.HB2(null);
            }
            C1142070fpF.LJIL();
            C2209808lE.LIZ.getClass();
            C2209808lE.LIZIZ.clear();
            this.LLJLIL.LJFF();
            this.LLJJJJLIIL.LJ();
            x1();
            C1131110fXZ c1131110fXZ = this.LLJ;
            if (c1131110fXZ != null) {
                DataChannel dataChannel2 = c1131110fXZ.LJ;
                if (dataChannel2 != null) {
                    dataChannel2.zQ2(c1131110fXZ);
                }
                C1118340fCy teamRankManager = GiftManager.inst().getTeamRankManager();
                if (teamRankManager != null) {
                    teamRankManager.LJI.clear();
                    teamRankManager.LIZ();
                }
            }
            C2632010c c2632010c = this.LLJJ;
            if (c2632010c != null) {
                IMessageManager iMessageManager4 = c2632010c.LLILZIL;
                if (iMessageManager4 != null) {
                    iMessageManager4.removeMessageListener(c2632010c);
                }
                LiveStreamGoalMessageDialog liveStreamGoalMessageDialog = c2632010c.LLILZLL;
                if (liveStreamGoalMessageDialog != null) {
                    liveStreamGoalMessageDialog.dismissAllowingStateLoss();
                }
                c2632010c.LLILZLL = null;
                c2632010c.LLILZ.LJ();
                c2632010c.LLJI.clear();
                C1125820fP2.LIZJ(false);
                c2632010c.LLILLL = null;
            }
            this.LLJJ = null;
            C1118220fCm c1118220fCm = this.LLJIJIL;
            if (c1118220fCm != null) {
                DataChannel dataChannel3 = c1118220fCm.LIZ;
                if (dataChannel3 != null) {
                    dataChannel3.zQ2(c1118220fCm);
                }
                c1118220fCm.LJIIIZ = null;
                c1118220fCm.LJIIIIZZ.LJ();
                C21287018Se c21287018Se = c1118220fCm.LIZLLL;
                if (c21287018Se != null) {
                    c21287018Se.LIZ();
                }
            }
            C1134030fcH c1134030fcH = this.LLJI;
            if (c1134030fcH != null && (dataChannel = c1134030fcH.LIZIZ) != null) {
                dataChannel.zQ2(c1134030fcH);
            }
            C1118370fD1 c1118370fD1 = this.LLJILLL;
            if (c1118370fD1 != null) {
                C1126610fQJ.LIZ = false;
                IMessageManager iMessageManager5 = c1118370fD1.LLILZIL;
                if (iMessageManager5 != null) {
                    iMessageManager5.removeMessageListener(c1118370fD1);
                }
            }
            C249900xt c249900xt = this.LLJJI;
            if (c249900xt != null) {
                IMessageManager iMessageManager6 = c249900xt.LLILLJJLI;
                if (iMessageManager6 != null) {
                    iMessageManager6.removeMessageListener(c249900xt);
                }
                C250000xu.LIZ.getClass();
                C250000xu.LJJIJIL = null;
            }
            C1129760fVO c1129760fVO = this.LLJJJIL;
            if (c1129760fVO != null) {
                c1129760fVO.LJFF.LJ();
            }
            C1132890faR c1132890faR = this.LLJJJJ;
            if (c1132890faR != null) {
                c1132890faR.LIZJ.LJ();
            }
            C1101370elb.LJ = null;
            InterfaceC1078630eAv interfaceC1078630eAv = this.LLJJIII;
            if (interfaceC1078630eAv != null) {
                interfaceC1078630eAv.destroy();
            }
            ValueAnimator valueAnimator = this.LLJJJJJIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            BPEAHandler bPEAHandler3 = this.LL;
            if (bPEAHandler3 != null) {
                bPEAHandler3.removeCallbacks(this.LLJLL);
            }
            BPEAHandler bPEAHandler4 = this.LL;
            if (bPEAHandler4 != null) {
                bPEAHandler4.removeCallbacks(this.LLJLLIL);
            }
            ARunnableS86S0200000_17 aRunnableS86S0200000_17 = this.LLJLLL;
            if (aRunnableS86S0200000_17 != null && (bPEAHandler2 = this.LL) != null) {
                bPEAHandler2.removeCallbacks(aRunnableS86S0200000_17);
            }
            ARunnableS86S0200000_17 aRunnableS86S0200000_172 = this.LLJZ;
            if (aRunnableS86S0200000_172 != null && (bPEAHandler = this.LL) != null) {
                bPEAHandler.removeCallbacks(aRunnableS86S0200000_172);
            }
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null && (iMessageManager = (IMessageManager) dataChannel4.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) this.LLLIIIIL);
            }
            if (!E1() && iMessageManager != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) this.LLLIIIL);
            }
            Room room = this.LLJJIJIIJIL;
            if (room != null) {
                C177100m9 filterManager = GiftManager.inst().getFilterManager();
                long id = room.getId();
                filterManager.getClass();
                if (id > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onWidgetUnload:");
                    sbLIZ.append(id);
                    C20441214yg.LJ("GiftFilterManager", C2188811AlT.LIZIZ(sbLIZ));
                    filterManager.LIZ.remove(Long.valueOf(id));
                }
                C1120770fGt c1120770fGt = C1120770fGt.LIZ;
                long id2 = room.getId();
                c1120770fGt.getClass();
                if (LiveGiftIconGuideSetting.INSTANCE.isEnable()) {
                    ((ConcurrentHashMap) C1120770fGt.LIZIZ).remove(Long.valueOf(id2));
                }
            }
            C1131370fXz.LIZ();
            C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0fa7
            });
            LiveNewGiftDialog liveNewGiftDialog = this.LLILLJJLI;
            if (liveNewGiftDialog != null) {
                liveNewGiftDialog.dismiss();
            }
            C182800n4.LIZIZ(hashCode(), this.dataChannel);
            C1130100fVw.LIZ.LJJIFFI = false;
            LinkedList<AbstractC1143340frI> linkedList = C1143330frH.LIZ;
            C1143330frH.LIZ(C1143560fre.LIZ);
            C1121430fHx c1121430fHx = this.LLJL;
            c1121430fHx.getClass();
            C1145050fu3.LIZIZ(c1121430fHx);
            ((ICoinIncentiveService) C1161920gLG.LIZJ(ICoinIncentiveService.class)).qY1();
            C781880Ulm.LIZIZ = false;
            C781880Ulm.LIZJ = false;
            C781880Ulm.LIZLLL = false;
            C781880Ulm.LJ = false;
            C781880Ulm.LJFF = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "gift_widget_unload_exception");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "gift_widget_unload_exception");
                C1CC2.LJ("gift_core_monitor", jSONObject, new JSONObject(), new JSONObject());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        C1548820qPI.LJIIIIZZ("ug_task_banner_show", this);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final boolean B1() {
        if (this.widgetCallback.getFragment() != null && C500260Jjc.LJJIFFI(Boolean.valueOf(this.widgetCallback.getFragment().isDetached()))) {
            return true;
        }
        C1AF0.LJ(new Throwable("Fragment cannot be null to open Gift Panel"));
        C20441214yg.LIZLLL("Fragment null");
        return false;
    }

    public final void C1() {
        C1132840faM c1132840faM = new C1132840faM();
        DataChannel dataChannel = this.dataChannel;
        this.widgetCallback.getFragment();
        c1132840faM.LLILZLL = dataChannel;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        c1132840faM.LLIZ = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addStickyMessageListener(C001A.COLLAB_GIFT_MESSAGE.getIntType(), c1132840faM);
        }
        C20441214yg.LJIIIZ("CollaborateGiftingStateMachine", "init");
        this.LLL = c1132840faM;
        C1131150fXd c1131150fXd = new C1131150fXd();
        DataChannel dataChannel2 = this.dataChannel;
        Fragment fragment = this.widgetCallback.getFragment();
        Context context = getContext();
        C20441214yg.LJIIIZ("CollaborateGiftingBiz", "init");
        c1131150fXd.LIZ = dataChannel2;
        c1131150fXd.LIZIZ = fragment;
        c1131150fXd.LIZJ = context;
        dataChannel2.EQ2(fragment, CollaborateGiftingStateChannel.class, c1131150fXd.LJIIIZ);
        C1548820qPI.LIZLLL("EVENT_GIFT_MECHANIC_DESTROY", c1131150fXd.LJIIJ);
        this.LLJZIJLIL = c1131150fXd;
    }

    public final boolean E1() {
        return C500260Jjc.LJIIZILJ(this.dataChannel);
    }

    @Override // X.InterfaceC1118240fCo
    public final void LJJIJ() {
        Iterator<InterfaceC1133090fal> it2 = C1132970faZ.LIZ.values().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIZILJ();
        }
        C1135580fem c1135580fem = this.LLJLIL;
        c1135580fem.getClass();
        if (GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.isEnabled() && c1135580fem.LIZIZ != null) {
            C20441214yg.LJIIIZ("GiftEffectPreDownloadManager", "clearMsg");
            Iterator<AbstractC1135610fep> it3 = c1135580fem.LIZ.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ();
            }
            ((LinkedHashMap) c1135580fem.LIZLLL).clear();
        }
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.LLILLL;
        if (absNormalGiftAnimWidget != null) {
            absNormalGiftAnimWidget.y1();
        }
    }

    @Override // X.InterfaceC1118240fCo
    public final void LJL() {
        C1134030fcH c1134030fcH = this.LLJI;
        if (c1134030fcH != null) {
            c1134030fcH.LJFF("", false);
        }
    }

    @Override // X.InterfaceC1118240fCo
    public final void LLJZIJLIL() {
        this.containerView.requestFocus();
    }

    @Override // X.InterfaceC1118240fCo
    public final void LLZZZZ() {
        InterfaceC1077820e9c interfaceC1077820e9c;
        if (LiveGiftReceivingRefactorSetting.INSTANCE.isEnableWidget() || !this.LLJJIJIL || (interfaceC1077820e9c = this.LLJJIJI) == null) {
            return;
        }
        ((C1077800e9a) interfaceC1077820e9c).LIZ.aS();
    }

    public final void x1() {
        C1131150fXd c1131150fXd = this.LLJZIJLIL;
        if (c1131150fXd != null) {
            C20441214yg.LJIIIZ("CollaborateGiftingBiz", "reset");
            c1131150fXd.LIZIZ();
            c1131150fXd.LIZ();
            C1548820qPI.LJIIIIZZ("EVENT_GIFT_MECHANIC_DESTROY", c1131150fXd.LJIIJ);
            DataChannel dataChannel = c1131150fXd.LIZ;
            if (dataChannel != null) {
                dataChannel.GQ2(c1131150fXd.LIZIZ, CollaborateGiftingStateChannel.class, c1131150fXd.LJIIIZ);
            }
            Map<Long, C1131940fYu> map = C1131950fYv.LIZ;
            if (!map.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clear, size=");
                sbLIZ.append(map.size());
                C20441214yg.LJIIIZ("GiftEffectDownloadTimeoutWatcher", C2188811AlT.LIZIZ(sbLIZ));
                for (C1131940fYu c1131940fYu : ((LinkedHashMap) map).values()) {
                    C0IK5.LIZLLL(c1131940fYu.LIZJ);
                    Object obj = c1131940fYu.LJFF;
                    if (obj != null) {
                        C0IK5.LIZLLL(obj);
                    }
                    c1131940fYu.LIZIZ = EnumC1131980fYy.LLILLL;
                }
                ((LinkedHashMap) C1131950fYv.LIZ).clear();
            }
            c1131150fXd.LIZ = null;
            c1131150fXd.LIZIZ = null;
            c1131150fXd.LIZJ = null;
        }
        this.LLJZIJLIL = null;
        C1132840faM c1132840faM = this.LLL;
        if (c1132840faM != null) {
            C20441214yg.LJIIIZ("CollaborateGiftingStateMachine", "reset");
            IMessageManager iMessageManager = c1132840faM.LLIZ;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(c1132840faM);
            }
            c1132840faM.LLIZ = null;
            c1132840faM.LIZ();
            C11JF c11jf = c1132840faM.LLILZIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c1132840faM.LLILZIL = null;
            c1132840faM.LJFF(C1132240fZO.LIZ);
            c1132840faM.LLILZLL = null;
        }
        this.LLL = null;
    }

    public static void D1() {
        C1129650fVD giftRepository = GiftManager.inst().getGiftRepository();
        giftRepository.getClass();
        long value = LiveGiftSyncCustomSettingDelay.getValue();
        int value2 = LiveGiftUserConsumeLayerSetting.INSTANCE.getValue();
        LiveGiftSyncAnchorAudienceV2Setting liveGiftSyncAnchorAudienceV2Setting = LiveGiftSyncAnchorAudienceV2Setting.INSTANCE;
        if (value2 < liveGiftSyncAnchorAudienceV2Setting.getMinConsumeValue() || value2 > liveGiftSyncAnchorAudienceV2Setting.getMaxConsumeValue() || liveGiftSyncAnchorAudienceV2Setting.isEnabled() != null) {
            return;
        }
        C786410Ut5.LJLIIL(value, new BPEAHandler(Looper.getMainLooper()), new ARunnableS23S0101000_12(value2, giftRepository, 25));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05ca A[Catch: Exception -> 0x06f8, TryCatch #0 {Exception -> 0x06f8, blocks: (B:209:0x052a, B:211:0x053a, B:212:0x053c, B:214:0x0554, B:216:0x0570, B:217:0x0574, B:219:0x057a, B:222:0x0582, B:224:0x05be, B:225:0x05c0, B:226:0x05c4, B:228:0x05ca, B:230:0x05d7, B:240:0x05f1, B:241:0x05f8, B:243:0x05fd, B:245:0x0607, B:246:0x060b, B:248:0x0618, B:249:0x061c, B:251:0x0622, B:253:0x062f, B:255:0x0633, B:256:0x0637, B:258:0x063d, B:260:0x0649, B:262:0x064d, B:264:0x0651, B:266:0x0658, B:270:0x0661, B:271:0x066a, B:273:0x0670, B:275:0x0678, B:276:0x067a, B:278:0x067e, B:280:0x0682, B:294:0x06b5, B:296:0x06bd, B:297:0x06d7, B:299:0x06df, B:300:0x06e3, B:303:0x06f1, B:305:0x06f5, B:282:0x0688, B:283:0x0697, B:285:0x069d, B:287:0x06a5, B:288:0x06a7, B:290:0x06ab, B:292:0x06af, B:234:0x05e0), top: B:412:0x052a }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05f1 A[Catch: Exception -> 0x06f8, TRY_ENTER, TryCatch #0 {Exception -> 0x06f8, blocks: (B:209:0x052a, B:211:0x053a, B:212:0x053c, B:214:0x0554, B:216:0x0570, B:217:0x0574, B:219:0x057a, B:222:0x0582, B:224:0x05be, B:225:0x05c0, B:226:0x05c4, B:228:0x05ca, B:230:0x05d7, B:240:0x05f1, B:241:0x05f8, B:243:0x05fd, B:245:0x0607, B:246:0x060b, B:248:0x0618, B:249:0x061c, B:251:0x0622, B:253:0x062f, B:255:0x0633, B:256:0x0637, B:258:0x063d, B:260:0x0649, B:262:0x064d, B:264:0x0651, B:266:0x0658, B:270:0x0661, B:271:0x066a, B:273:0x0670, B:275:0x0678, B:276:0x067a, B:278:0x067e, B:280:0x0682, B:294:0x06b5, B:296:0x06bd, B:297:0x06d7, B:299:0x06df, B:300:0x06e3, B:303:0x06f1, B:305:0x06f5, B:282:0x0688, B:283:0x0697, B:285:0x069d, B:287:0x06a5, B:288:0x06a7, B:290:0x06ab, B:292:0x06af, B:234:0x05e0), top: B:412:0x052a }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05f8 A[Catch: Exception -> 0x06f8, TryCatch #0 {Exception -> 0x06f8, blocks: (B:209:0x052a, B:211:0x053a, B:212:0x053c, B:214:0x0554, B:216:0x0570, B:217:0x0574, B:219:0x057a, B:222:0x0582, B:224:0x05be, B:225:0x05c0, B:226:0x05c4, B:228:0x05ca, B:230:0x05d7, B:240:0x05f1, B:241:0x05f8, B:243:0x05fd, B:245:0x0607, B:246:0x060b, B:248:0x0618, B:249:0x061c, B:251:0x0622, B:253:0x062f, B:255:0x0633, B:256:0x0637, B:258:0x063d, B:260:0x0649, B:262:0x064d, B:264:0x0651, B:266:0x0658, B:270:0x0661, B:271:0x066a, B:273:0x0670, B:275:0x0678, B:276:0x067a, B:278:0x067e, B:280:0x0682, B:294:0x06b5, B:296:0x06bd, B:297:0x06d7, B:299:0x06df, B:300:0x06e3, B:303:0x06f1, B:305:0x06f5, B:282:0x0688, B:283:0x0697, B:285:0x069d, B:287:0x06a5, B:288:0x06a7, B:290:0x06ab, B:292:0x06af, B:234:0x05e0), top: B:412:0x052a }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06f5 A[Catch: Exception -> 0x06f8, TRY_LEAVE, TryCatch #0 {Exception -> 0x06f8, blocks: (B:209:0x052a, B:211:0x053a, B:212:0x053c, B:214:0x0554, B:216:0x0570, B:217:0x0574, B:219:0x057a, B:222:0x0582, B:224:0x05be, B:225:0x05c0, B:226:0x05c4, B:228:0x05ca, B:230:0x05d7, B:240:0x05f1, B:241:0x05f8, B:243:0x05fd, B:245:0x0607, B:246:0x060b, B:248:0x0618, B:249:0x061c, B:251:0x0622, B:253:0x062f, B:255:0x0633, B:256:0x0637, B:258:0x063d, B:260:0x0649, B:262:0x064d, B:264:0x0651, B:266:0x0658, B:270:0x0661, B:271:0x066a, B:273:0x0670, B:275:0x0678, B:276:0x067a, B:278:0x067e, B:280:0x0682, B:294:0x06b5, B:296:0x06bd, B:297:0x06d7, B:299:0x06df, B:300:0x06e3, B:303:0x06f1, B:305:0x06f5, B:282:0x0688, B:283:0x0697, B:285:0x069d, B:287:0x06a5, B:288:0x06a7, B:290:0x06ab, B:292:0x06af, B:234:0x05e0), top: B:412:0x052a }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x05da A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0fXh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1(X.C1121570fIB r41) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.giftwidget.GiftWidgetKotlin.A1(X.0fIB):void");
    }

    public final void F1(List<? extends GiftPage> list) {
        GiftLeafRootWidget giftLeafRootWidget;
        if (this.LLJJIJIL) {
            GiftListResult giftListResult = GiftManager.inst().getGiftListResult();
            if (giftListResult != null && (giftLeafRootWidget = this.LLILZIL) != null) {
                giftLeafRootWidget.LL.LIZ = giftListResult.giftPages;
                return;
            }
            return;
        }
        LiveNewGiftDialog liveNewGiftDialog = this.LLILLJJLI;
        if (liveNewGiftDialog == null) {
            return;
        }
        if (list != null) {
            liveNewGiftDialog.OR(list);
        }
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = liveNewGiftDialog.LLILZIL;
        if (liveNewGiftPanelWidget == null) {
            return;
        }
        liveNewGiftPanelWidget.LLJJIJI = false;
        liveNewGiftPanelWidget.LLJJI = false;
    }

    @Override // X.InterfaceC1118240fCo
    public final void LJIILL(boolean z) {
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget;
        if (!LiveGiftReceivingRefactorSetting.INSTANCE.isEnableWidget() && (absNormalGiftAnimWidget = this.LLILLL) != null && this.LLILZ != null) {
            if (z) {
                this.LLJLIL.LJIIIIZZ(true);
                AbsNormalGiftAnimWidget absNormalGiftAnimWidget2 = this.LLILLL;
                if (absNormalGiftAnimWidget2 != null) {
                    absNormalGiftAnimWidget2.y1();
                }
                AbsNormalGiftAnimWidget absNormalGiftAnimWidget3 = this.LLILLL;
                if (absNormalGiftAnimWidget3 != null) {
                    absNormalGiftAnimWidget3.F1();
                }
                LiveGiftEffectWidget liveGiftEffectWidget = this.LLILZ;
                if (liveGiftEffectWidget != null) {
                    liveGiftEffectWidget.stopVideoPlay();
                }
                AbsNormalGiftAnimWidget absNormalGiftAnimWidget4 = this.LLILLL;
                if (absNormalGiftAnimWidget4 != null) {
                    absNormalGiftAnimWidget4.LL = true;
                    return;
                }
                return;
            }
            absNormalGiftAnimWidget.LL = false;
            this.LLJLIL.LJIIIIZZ(false);
        }
    }

    @Override // X.InterfaceC1132010fZ1, X.InterfaceC1118240fCo
    public final void LJJIIJZLJL(List<? extends GiftPage> list) {
        F1(list);
        if (this.LLJJIJIL && B1()) {
            GiftLeafRootViewModel giftLeafRootViewModel = (GiftLeafRootViewModel) ViewModelProviders.of(this.widgetCallback.getFragment()).get(GiftLeafRootViewModel.class);
            if (list != null) {
                giftLeafRootViewModel.LLILLL.LIZ(new C1125250fO7(list));
            }
            if (C500260Jjc.LJJJIL(this.dataChannel)) {
                giftLeafRootViewModel.LLILZIL.LIZ(new C1124420fMm(""));
            }
        }
    }

    @Override // X.InterfaceC1077780e9Y
    public final void LJLIIL(C1077800e9a c1077800e9a) {
        this.LLJJIJI = c1077800e9a;
    }

    @Override // X.InterfaceC1118240fCo
    public final void LJLLJ(C1121570fIB c1121570fIB) throws JSONException {
        String str;
        Boolean bool;
        String str2;
        boolean zLJI = MethodIDManager.LJI(71996);
        String str3 = "icon";
        if (c1121570fIB == null || (str = c1121570fIB.LIZJ) == null) {
            str = "icon";
        }
        if (C1129070fUH.LIZIZ(this.dataChannel)) {
            C1129070fUH.LJ(getView(), this.dataChannel);
            C1131070fXV.LJIIJ(3, 0, Boolean.valueOf(this.LLJJIJIL), str);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        if (iGiftService.isNewsAccount(this.dataChannel)) {
            iGiftService.showGiftBannedPopup(getContext(), false);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1132070fZ7 c1132070fZ7 = this.LLJILJIL;
        if (c1132070fZ7 != null) {
            boolean zBooleanValue = true;
            if (UserService.getInstance().user().getCurrentUser().childrenManagerForbidWalletFunctions()) {
                C766270U4b.LJFF(2131851606, c1132070fZ7.LIZ);
            } else if (((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).isNeedProtectMinor()) {
                C766270U4b.LIZLLL(2131853495);
            } else {
                DataChannel dataChannel = c1132070fZ7.LIZIZ;
                if (dataChannel != null) {
                    dataChannel.LC0(HideShareLeadEvent.class, Boolean.TRUE);
                }
                GiftWidgetKotlin giftWidgetKotlin = c1132070fZ7.LIZJ;
                if (giftWidgetKotlin != null) {
                    giftWidgetKotlin.A1(c1121570fIB);
                }
            }
            if (c1121570fIB != null && (str2 = c1121570fIB.LIZJ) != null) {
                str3 = str2;
            }
            DataChannel dataChannel2 = c1132070fZ7.LIZIZ;
            if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(C0TZM.class)) != null) {
                zBooleanValue = bool.booleanValue();
            }
            C1131070fXV.LJIIJ(3, 0, Boolean.valueOf(zBooleanValue), str3);
        } else {
            C1131070fXV.LJIIJ(5, 0, Boolean.valueOf(this.LLJJIJIL), str);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1133530fbT
    public final void LLZLLIL(LiveTrayMessage liveTrayMessage) {
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget;
        if (liveTrayMessage != null && !LiveGiftReceivingRefactorSetting.INSTANCE.isEnableWidget() && (absNormalGiftAnimWidget = this.LLILLL) != null) {
            absNormalGiftAnimWidget.D1(liveTrayMessage);
        }
    }

    @Override // X.InterfaceC1133530fbT
    public final void O(AssetMessage assetMessage) {
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget;
        if (assetMessage != null && !LiveGiftReceivingRefactorSetting.INSTANCE.isEnableWidget() && (absNormalGiftAnimWidget = this.LLILLL) != null) {
            absNormalGiftAnimWidget.A1(assetMessage);
        }
    }

    @Override // X.InterfaceC1133530fbT
    public final void V0(GiftGlobalMessage giftGlobalMessage) {
        Text text;
        long j;
        IMessageManager iMessageManager;
        RoomNotifyMessage roomNotifyMessage;
        CommonMessageData commonMessageData;
        Text text2;
        List<LiveFilterMsgRule> arrayList;
        List arrayList2;
        int i;
        CommonMessageData commonMessageData2;
        RoomNotifyMessage roomNotifyMessage2;
        CommonMessageData commonMessageData3;
        Boolean bool;
        C1132350fZZ c1132350fZZ = this.LLJILJILJ;
        if (c1132350fZZ != null) {
            DataChannel dataChannel = c1132350fZZ.LIZ;
            if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
                bool.booleanValue();
            }
            RoomNotifyMessage roomNotifyMessage3 = null;
            if (giftGlobalMessage != null && (roomNotifyMessage2 = giftGlobalMessage.mNotifyMessage) != null && (commonMessageData3 = roomNotifyMessage2.baseMessage) != null) {
                text = commonMessageData3.displayText;
            } else {
                text = null;
            }
            long j2 = 0;
            if (text != null && !C086I.LIZIZ(text.pieces)) {
                Iterator<TextPiece> it2 = text.pieces.iterator();
                while (it2.hasNext()) {
                    TextPieceGift textPieceGift = it2.next().giftValue;
                    if (textPieceGift != null) {
                        j = textPieceGift.giftId;
                        break;
                    }
                }
                j = 0;
            } else {
                j = 0;
            }
            if (giftGlobalMessage != null) {
                j2 = giftGlobalMessage.mFromUserId;
            }
            boolean z = false;
            if (j2 != UserService.getInstance().user().getCurrentUserId()) {
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room == null || (arrayList = room.filterRule) == null) {
                    arrayList = new ArrayList();
                }
                if (giftGlobalMessage == null || (commonMessageData2 = giftGlobalMessage.baseMessage) == null || (arrayList2 = commonMessageData2.filterTags) == null) {
                    arrayList2 = new ArrayList();
                }
                for (Object obj : arrayList2) {
                    for (LiveFilterMsgRule liveFilterMsgRule : arrayList) {
                        if (Intrinsics.LJFF(liveFilterMsgRule.name, obj) && liveFilterMsgRule.rule == 0) {
                            int iNextInt = C19994513Lb.LIZIZ(System.currentTimeMillis()).nextInt(0, 100);
                            FilterMsgRuleParamRandom filterMsgRuleParamRandom = liveFilterMsgRule.random;
                            if (filterMsgRuleParamRandom != null) {
                                i = filterMsgRuleParamRandom.percentage;
                            } else {
                                i = 0;
                            }
                            if (iNextInt < i) {
                                Long lValueOf = Long.valueOf(j);
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("abandon_announcements");
                                c474500IjALIZ.LJIL();
                                c474500IjALIZ.LJJII(lValueOf, "gift_id");
                                c474500IjALIZ.LJJII("gift", "reason");
                                c474500IjALIZ.LJJII(C1128450fTH.LJIIIZ().getDesc(), Scene.SCENE_SERVICE);
                                c474500IjALIZ.LIZ();
                                return;
                            }
                        }
                    }
                }
            }
            DataChannel dataChannel2 = c1132350fZZ.LIZ;
            if (dataChannel2 != null) {
                iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class);
            } else {
                iMessageManager = null;
            }
            if (giftGlobalMessage != null) {
                RoomNotifyMessage roomNotifyMessage4 = giftGlobalMessage.mNotifyMessage;
                if (roomNotifyMessage4 != null) {
                    if (giftGlobalMessage.mFromUserId == UserService.getInstance().user().getCurrentUserId()) {
                        z = true;
                    }
                    roomNotifyMessage4.LLILLJJLI = z;
                }
                RoomNotifyMessage roomNotifyMessage5 = giftGlobalMessage.mNotifyMessage;
                if (roomNotifyMessage5 != null) {
                    roomNotifyMessage5.LL = j;
                }
                RoomNotifyMessage roomNotifyMessage6 = giftGlobalMessage.mNotifyMessage;
                if (roomNotifyMessage6 != null) {
                    roomNotifyMessage6.LLILLL = giftGlobalMessage.mLeftIcon;
                }
            }
            if (LiveAnchorGiftDisableSetting.INSTANCE.getValue()) {
                if (giftGlobalMessage != null) {
                    RoomNotifyMessage roomNotifyMessage7 = giftGlobalMessage.mNotifyMessage;
                    if (roomNotifyMessage7 != null) {
                        roomNotifyMessage7.schema = null;
                    }
                    roomNotifyMessage = giftGlobalMessage.mNotifyMessage;
                }
                roomNotifyMessage = null;
            } else if (giftGlobalMessage != null) {
                roomNotifyMessage = giftGlobalMessage.mNotifyMessage;
            } else {
                roomNotifyMessage = null;
            }
            Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
            if (giftFindGiftById != null && roomNotifyMessage != null && (commonMessageData = roomNotifyMessage.baseMessage) != null && (text2 = commonMessageData.displayText) != null && !C086I.LIZIZ(text2.pieces)) {
                Iterator<TextPiece> it3 = text2.pieces.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    TextPieceGift textPieceGift2 = it3.next().giftValue;
                    if (textPieceGift2 != null) {
                        textPieceGift2.LIZ = giftFindGiftById;
                        break;
                    }
                }
            }
            if (iMessageManager == null) {
                return;
            }
            if (giftGlobalMessage != null) {
                roomNotifyMessage3 = giftGlobalMessage.mNotifyMessage;
            }
            iMessageManager.insertMessage(roomNotifyMessage3, true);
        }
    }

    @Override // X.InterfaceC1118240fCo
    public final void b1(int i) {
        View view;
        View viewFindViewById;
        if (!isViewValid() || getContext() == null || (view = this.contentView) == null || (viewFindViewById = view.findViewById(R.id.pbd)) == null) {
            return;
        }
        if (C497740JfY.LJJ()) {
            i = -i;
        }
        C786410Ut5.Jc(viewFindViewById, i);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (Intrinsics.LJFF("ug_task_banner_show", c262100zr.LIZ) && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
            C500260Jjc.LJJJI(Boolean.valueOf(interfaceC1107590evd.getBoolean("is_showing")));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0c64  */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.00l6] */
    /* JADX WARN: Type inference failed for: r3v208, types: [X.0fYY] */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r23) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 3205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.giftwidget.GiftWidgetKotlin.onLoad(java.lang.Object[]):void");
    }

    @Override // X.InterfaceC1132010fZ1
    public final void LJZ(Exception exc, InterfaceC1131100fXY interfaceC1131100fXY) {
        String str;
        boolean z;
        int i;
        int i2;
        boolean z2;
        Context context = getContext();
        View view = getView();
        C1134030fcH c1134030fcH = this.LLJI;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && dataChannel.gg0(RoomChannel.class) != null) {
            boolean z3 = false;
            i = 0;
            i = 0;
            int i3 = 0;
            Map<String, ? extends Object> map = null;
            if (!(exc instanceof C501510Jld)) {
                if (exc instanceof C501470JlZ) {
                    if (((C501520Jle) exc).getErrorCode() != 40001) {
                        if (((C501520Jle) exc).getErrorCode() == 4006056) {
                            C766270U4b.LIZLLL(2131841593);
                            return;
                        }
                        C501520Jle c501520Jle = (C501520Jle) exc;
                        if (c501520Jle.getErrorCode() != 4006057 && c501520Jle.getErrorCode() != 4006058) {
                            if (((C501520Jle) exc).getErrorCode() == 4005283) {
                                C766270U4b.LIZLLL(2131843930);
                                return;
                            }
                            if (((C501520Jle) exc).getErrorCode() == 4005282) {
                                C766270U4b.LIZLLL(2131843929);
                                return;
                            }
                            if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().wk0(exc).booleanValue()) {
                                if (C1131140fXc.LIZJ(interfaceC1131100fXY) == 0) {
                                    i2 = 1002;
                                    z2 = true;
                                } else {
                                    BalanceStruct balanceStructG52 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().g52();
                                    if (balanceStructG52 != null && balanceStructG52.exchangeInfo != null && balanceStructG52.validUser) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    i2 = i ^ 1;
                                    z2 = false;
                                }
                                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().MF1(context, exc, 11, i2, z2, interfaceC1131100fXY.getSource());
                                return;
                            }
                            if (C1802460x0O.LIZ(((C501520Jle) exc).getErrorCode())) {
                                ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().iu2(context, exc);
                                return;
                            }
                            if (((C501520Jle) exc).getErrorCode() == 90501) {
                                C19GO c19go = new C19GO(context);
                                c19go.LJJIIJ = true;
                                c19go.LIZIZ(2131853494);
                                c19go.LJ(2131853157, new DialogInterface.OnClickListener() { // from class: X.0fZS
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i4) {
                                        dialogInterface.dismiss();
                                    }
                                }, false);
                                C786410Ut5.M4(c19go.LIZ());
                                return;
                            }
                            C501470JlZ c501470JlZ = (C501470JlZ) exc;
                            if (c501470JlZ.getErrorCode() == 4004051) {
                                C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
                                C1132000fZ0.LIZ(EnumC994150byf.ANCHOR);
                                return;
                            }
                            C501470JlZ c501470JlZ2 = (C501470JlZ) exc;
                            if (c501470JlZ2.getErrorCode() == 4004052) {
                                C766270U4b.LJIIJJI(c501470JlZ2.getPrompt());
                                C1132000fZ0.LIZ(EnumC994150byf.GUEST);
                                return;
                            }
                            C501470JlZ c501470JlZ3 = (C501470JlZ) exc;
                            if (c501470JlZ3.getErrorCode() == 4025008) {
                                C766270U4b.LJIIJJI(c501470JlZ3.getPrompt());
                                C1128760fTm.LJIIJ.getClass();
                                C1128760fTm.LJJJIL();
                                return;
                            }
                            C501470JlZ c501470JlZ4 = (C501470JlZ) exc;
                            if (c501470JlZ4.getErrorCode() == 43006) {
                                C766270U4b.LJIILIIL(view, c501470JlZ4.getPrompt());
                                C1128760fTm.LJIIJ.getClass();
                                C1128760fTm.LJJJIL();
                                C1129570fV5.LIZ.getClass();
                                HashMap map2 = new HashMap();
                                if (Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                                    map2.put("user_type", "anchor");
                                    Room room = (Room) dataChannel.gg0(RoomChannel.class);
                                    if (room != null) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(room.getOwnerUserId());
                                        sbLIZ.append("");
                                        map2.put("violation_anchor_id", C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                } else {
                                    map2.put("user_type", "user");
                                }
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_toast");
                                c474500IjALIZ.LJJIIZI(map2);
                                c474500IjALIZ.LJJII("gift_ban", "violation_type");
                                c474500IjALIZ.LJJII("gift", "scene_type");
                                c474500IjALIZ.LJIJJLI(dataChannel);
                                c474500IjALIZ.LIZ();
                                return;
                            }
                            C501470JlZ c501470JlZ5 = (C501470JlZ) exc;
                            int errorCode = c501470JlZ5.getErrorCode();
                            switch (errorCode) {
                                case 40030:
                                case 40032:
                                    if (c1134030fcH != null) {
                                        c1134030fcH.LJFF(interfaceC1131100fXY.getSource(), false);
                                    }
                                    break;
                                case 4005256:
                                    if (c1134030fcH != null) {
                                        c1134030fcH.LJII(true);
                                    }
                                    break;
                                case 4005257:
                                    if (c1134030fcH != null) {
                                        c1134030fcH.LJII(false);
                                    }
                                    break;
                                case 4005284:
                                case 4005285:
                                    BalanceStruct balanceStructG522 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().g52();
                                    if (balanceStructG522 != null && balanceStructG522.exchangeInfo != null && balanceStructG522.validUser) {
                                        i3 = 1;
                                    }
                                    ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJIII(context, 11, i3 ^ 1, c501470JlZ5.getPrompt());
                                    break;
                                case 4006063:
                                    if (c1134030fcH != null) {
                                        c1134030fcH.LIZJ(errorCode, "reject");
                                    }
                                    break;
                                case 4006064:
                                    if (c1134030fcH != null) {
                                        c1134030fcH.LIZJ(errorCode, "frequency");
                                    }
                                    break;
                                case 4006076:
                                    FreqLimitGiftOption freqLimitOption = GiftManager.inst().getFreqLimitOption(Long.valueOf(interfaceC1131100fXY.getGiftId()));
                                    if (freqLimitOption != null) {
                                        int i4 = freqLimitOption.frequencyLimit;
                                        if (i4 == 1) {
                                            C766270U4b.LJIIJJI(context.getResources().getString(2131843656));
                                        } else if (i4 == 2) {
                                            C766270U4b.LJIIJJI(context.getResources().getString(2131843657));
                                        } else if (i4 >= 3) {
                                            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843658, Integer.valueOf(i4)));
                                        }
                                    }
                                    break;
                                default:
                                    C766270U4b.LJIIJJI(c501470JlZ5.getPrompt());
                                    if (errorCode == 4006052) {
                                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_consume_limit_toast_show");
                                        c474500IjALIZ2.LJIL();
                                        c474500IjALIZ2.LIZ();
                                    }
                                    break;
                            }
                            return;
                        }
                        C766270U4b.LIZLLL(2131841594);
                        return;
                    }
                } else {
                    C766270U4b.LIZLLL(2131842733);
                    return;
                }
            }
            C766270U4b.LIZLLL(2131855990);
            long jLJJJJIZL = ((long) interfaceC1131100fXY.LJJJJIZL()) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
            C1129570fV5 c1129570fV5 = C1129570fV5.LIZ;
            String source = interfaceC1131100fXY.getSource();
            long giftId = interfaceC1131100fXY.getGiftId();
            c1129570fV5.getClass();
            C1127330fRT c1127330fRT = new C1127330fRT(C1129570fV5.LIZ(interfaceC1131100fXY, source, giftId), jLJJJJIZL, "normal", interfaceC1131100fXY.getSource(), interfaceC1131100fXY.getNotificationType());
            long giftId2 = interfaceC1131100fXY.getGiftId();
            C1143180fr2 c1143180fr2 = C1143170fr1.LIZJ;
            if ((c1143180fr2 != null && giftId2 == c1143180fr2.LJI) || C1125360fOI.LIZJ > 1) {
                str = "combo_click_gift";
            } else {
                str = "single_gift";
            }
            c1127330fRT.LJII = str;
            c1127330fRT.LJIIIIZZ = interfaceC1131100fXY.getGiftId();
            c1127330fRT.LJIIJ = interfaceC1131100fXY.LJJJLL();
            c1127330fRT.LJIIIZ = interfaceC1131100fXY.LJJJJIZL();
            interfaceC1131100fXY.LJJJJLL();
            c1127330fRT.LJIIJJI = null;
            c1127330fRT.LJFF = true;
            if (interfaceC1131100fXY.LJJJJZ().LIZ != EnumC1129230fUX.GIFT_PANEL_PORTRAIT && interfaceC1131100fXY.LJJJJZ().LIZ != EnumC1129230fUX.GIFT_PANEL_LANDSCAPE) {
                z = false;
            } else {
                z = true;
            }
            c1127330fRT.LJI = z;
            if (interfaceC1131100fXY.LJJJJZ().LIZ == EnumC1129230fUX.FAST_GIFT) {
                z3 = true;
            }
            c1127330fRT.LJIIL = z3;
            c1127330fRT.LJIILJJIL = interfaceC1131100fXY.LJIIJ();
            C1125300fOC c1125300fOCLJJJLZIJ = interfaceC1131100fXY.LJJJLZIJ();
            if (c1125300fOCLJJJLZIJ != null) {
                map = c1125300fOCLJJJLZIJ.LIZIZ;
            }
            c1127330fRT.LJIILIIL = map;
            if (interfaceC1131100fXY.LJIILIIL() != null) {
                HashMap map3 = new HashMap();
                Map<String, ? extends Object> map4 = c1127330fRT.LJIILIIL;
                if (map4 != null) {
                    map3.putAll(map4);
                }
                Map<String, Object> mapLJIILIIL = interfaceC1131100fXY.LJIILIIL();
                if (mapLJIILIIL != null) {
                    map3.putAll(mapLJIILIIL);
                }
                c1127330fRT.LJIILIIL = map3;
            }
            if (interfaceC1131100fXY.LL() != null || interfaceC1131100fXY.LJLJJL() != null) {
                HashMap map5 = new HashMap();
                Map<String, ? extends Object> map6 = c1127330fRT.LJIILIIL;
                if (map6 != null) {
                    map5.putAll(map6);
                }
                String strLL = interfaceC1131100fXY.LL();
                if (strLL != null) {
                    map5.put("request_panel_id", strLL);
                }
                String strLJLJJL = interfaceC1131100fXY.LJLJJL();
                if (strLJLJJL != null) {
                    map5.put("recommend_info", strLJLJJL);
                }
                c1127330fRT.LJIILIIL = map5;
            }
            interfaceC1131100fXY.LJJIIZI();
            if (c1134030fcH == null) {
                return;
            }
            c1134030fcH.LIZLLL(c1127330fRT);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r23.toUser.getId() != r1.getId()) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    @Override // X.InterfaceC1133530fbT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(com.bytedance.android.livesdk.model.message.GiftMessage r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.giftwidget.GiftWidgetKotlin.V(com.bytedance.android.livesdk.model.message.GiftMessage, boolean):void");
    }

    public final void y1(GiftMessage giftMessage, EnumC1133020fae enumC1133020fae) {
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget;
        if (giftMessage == null) {
            return;
        }
        if (!LiveGiftReceivingRefactorSetting.INSTANCE.isEnableWidget() && (absNormalGiftAnimWidget = this.LLILLL) != null) {
            absNormalGiftAnimWidget.B1(giftMessage);
        }
        if (this.LLJI != null) {
            C1134030fcH.LIZ(giftMessage, enumC1133020fae);
        }
    }

    public final void z1(C1121570fIB c1121570fIB, FragmentManager fragmentManager) {
        User owner;
        EnumC1125400fOM enumC1125400fOM;
        int iCheckTabCanDisplay;
        IWalletCenter iWalletCenterWalletCenter;
        C1128970fU7 c1128970fU7 = C1130100fVw.LIZ;
        c1128970fU7.LIZJ(c1121570fIB.LIZJ);
        c1128970fU7.LJII = c1121570fIB.LJIILIIL;
        c1128970fU7.LIZIZ = Long.valueOf(c1121570fIB.LJIIIZ);
        if (c1121570fIB.LIZ.size() == 1) {
            owner = (User) ListProtector.get(c1121570fIB.LIZ, 0);
        } else {
            Room room = this.LLJJIJIIJIL;
            if (room != null) {
                owner = room.getOwner();
            } else {
                owner = null;
            }
        }
        Room room2 = this.LLJJIJIIJIL;
        EnumC1120600fGc enumC1120600fGc = c1121570fIB.LIZLLL;
        String str = c1121570fIB.LIZJ;
        if (str == null) {
            str = "icon";
        }
        Runnable runnable = c1121570fIB.LJ;
        long j = c1121570fIB.LJIIIZ;
        List<GiftPage> list = this.LLLF;
        long j2 = c1121570fIB.LJIILLIIL;
        String str2 = c1121570fIB.LJJIII;
        LiveNewGiftDialog liveNewGiftDialog = new LiveNewGiftDialog();
        liveNewGiftDialog.LLJJJJ = str2;
        if (owner == null || (room2 != null && owner.getId() == room2.getOwnerUserId())) {
            enumC1125400fOM = EnumC1125400fOM.ANCHOR;
        } else {
            enumC1125400fOM = EnumC1125400fOM.GUEST;
        }
        liveNewGiftDialog.LLILZLL = enumC1125400fOM;
        liveNewGiftDialog.LLILLL = room2;
        if (C1123590fLR.LIZ && Intrinsics.LJFF("icon", str)) {
            str = "gift_guide_bubble";
        }
        liveNewGiftDialog.LLJJIII = str;
        C1130790fX3 c1130790fX3 = new C1130790fX3();
        liveNewGiftDialog.LLJI = c1130790fX3;
        c1130790fX3.LIZ = owner;
        C1128630fTZ c1128630fTZ = new C1128630fTZ();
        MutableLiveData<Integer> mutableLiveData = c1128630fTZ.LIZIZ;
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        if (EnumC1120600fGc.DEFAULT != enumC1120600fGc) {
            iCheckTabCanDisplay = enumC1120600fGc.value;
        } else {
            iCheckTabCanDisplay = interfaceC1128210fStInst.checkTabCanDisplay(C1131900fYq.LIZ(C497740JfY.LJII(), 1));
        }
        if (Intrinsics.LJFF("gift_panel", str) || (Intrinsics.LJFF("viewer_wishes", str) && j > 0 && interfaceC1128210fStInst.getTabByGiftId(j) != -1)) {
            iCheckTabCanDisplay = interfaceC1128210fStInst.checkTabCanDisplay(interfaceC1128210fStInst.getTabByGiftId(j));
        }
        mutableLiveData.setValue(Integer.valueOf(iCheckTabCanDisplay));
        c1128630fTZ.LJI.setValue(Long.valueOf(j));
        c1128630fTZ.LIZ = owner;
        c1128630fTZ.LJII = j2;
        c1128630fTZ.LJIIIIZZ.setValue(EnumC1130940fXI.DEFAULT);
        liveNewGiftDialog.LLIZ = c1128630fTZ;
        liveNewGiftDialog.LLJJIJI = runnable;
        liveNewGiftDialog.LLILLJJLI = list;
        this.LLILLJJLI = liveNewGiftDialog;
        if (fragmentManager != null) {
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            if (iWalletService == null || iWalletService.walletCenter() == null) {
                C1131070fXV.LIZJ("doOpenDialogLandscape_v1");
            }
            IWalletService iWalletService2 = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            if (iWalletService2 != null && (iWalletCenterWalletCenter = iWalletService2.walletCenter()) != null) {
                iWalletCenterWalletCenter.Ri2(EnumC1805420x5A.RECHARGE_PANEL);
            }
            LiveNewGiftDialog liveNewGiftDialog2 = this.LLILLJJLI;
            if (liveNewGiftDialog2 != null) {
                liveNewGiftDialog2.show(fragmentManager, "LiveNewGiftDialog");
            }
        }
    }

    @Override // X.InterfaceC1118240fCo
    public final void LJLLL(int i, boolean z, boolean z2) {
        RelativeLayout.LayoutParams layoutParams;
        boolean z3;
        if (isViewValid() && getContext() != null) {
            View viewFindViewById = this.contentView.findViewById(R.id.pbd);
            if (viewFindViewById == null) {
                C1138230fj3.LIZ("adjustNormalGiftLayoutBottomMargin", "container view is null");
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                if (z2) {
                    boolean z4 = this.LLLII;
                    if (i > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.LLLII = z3;
                    this.LLLIIII = i;
                    if (i > 0 || z4) {
                        i += layoutParams.bottomMargin;
                    }
                    if (i < 0) {
                        return;
                    }
                } else if (this.LLLII) {
                    i += this.LLLIIII;
                }
                int i2 = layoutParams.bottomMargin;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i2);
                sbLIZ.append(" -> ");
                sbLIZ.append(i);
                C1138230fj3.LIZ("adjustNormalGiftLayoutBottomMargin", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("useAnimation = ");
                sbLIZ2.append(z);
                C1138230fj3.LIZ("adjustNormalGiftLayoutBottomMargin", C2188811AlT.LIZIZ(sbLIZ2));
                if (z) {
                    if (i2 != i) {
                        ValueAnimator valueAnimator = this.LLJJJJJIL;
                        if (valueAnimator == null) {
                            ValueAnimator valueAnimator2 = new ValueAnimator();
                            this.LLJJJJJIL = valueAnimator2;
                            valueAnimator2.setDuration(200L);
                            ValueAnimator valueAnimator3 = this.LLJJJJJIL;
                            if (valueAnimator3 != null) {
                                valueAnimator3.setInterpolator(new LinearInterpolator());
                            }
                        } else {
                            valueAnimator.removeAllUpdateListeners();
                            ValueAnimator valueAnimator4 = this.LLJJJJJIL;
                            if (valueAnimator4 != null) {
                                valueAnimator4.cancel();
                            }
                        }
                        ValueAnimator valueAnimator5 = this.LLJJJJJIL;
                        if (valueAnimator5 != null) {
                            valueAnimator5.setIntValues(i2, i);
                        }
                        ValueAnimator valueAnimator6 = this.LLJJJJJIL;
                        if (valueAnimator6 != null) {
                            valueAnimator6.addUpdateListener(new AUListenerS220S0200000_12(viewFindViewById, layoutParams, 0));
                        }
                        ValueAnimator valueAnimator7 = this.LLJJJJJIL;
                        if (valueAnimator7 != null) {
                            valueAnimator7.start();
                            return;
                        }
                        return;
                    }
                    ValueAnimator valueAnimator8 = this.LLJJJJJIL;
                    if (valueAnimator8 != null) {
                        valueAnimator8.cancel();
                    }
                    layoutParams.bottomMargin = i;
                    C786410Ut5.W5(viewFindViewById, layoutParams);
                    return;
                }
                ValueAnimator valueAnimator9 = this.LLJJJJJIL;
                if (valueAnimator9 != null) {
                    valueAnimator9.cancel();
                }
                layoutParams.bottomMargin = i;
                C786410Ut5.W5(viewFindViewById, layoutParams);
                return;
            }
            return;
        }
        C1138230fj3.LIZ("adjustNormalGiftLayoutBottomMargin", "invalid view or context");
    }
}
