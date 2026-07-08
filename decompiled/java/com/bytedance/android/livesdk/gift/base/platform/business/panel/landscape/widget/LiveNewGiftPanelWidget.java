package com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget;

import X.AbstractC1126600fQI;
import X.AbstractC1126700fQS;
import X.AnonymousClass0054;
import X.C020W;
import X.C098200Yq;
import X.C1097050eed;
import X.C1123380fL6;
import X.C1124730fNH;
import X.C1125500fOW;
import X.C1125820fP2;
import X.C1125840fP4;
import X.C1126040fPO;
import X.C1126220fPg;
import X.C1126720fQU;
import X.C1126810fQd;
import X.C1127380fRY;
import X.C1128240fSw;
import X.C1128250fSx;
import X.C1128590fTV;
import X.C1128600fTW;
import X.C1128630fTZ;
import X.C1128640fTa;
import X.C1128760fTm;
import X.C1128780fTo;
import X.C1128970fU7;
import X.C1129710fVJ;
import X.C1130100fVw;
import X.C1130140fW0;
import X.C1130160fW2;
import X.C1130220fW8;
import X.C1130300fWG;
import X.C1130860fXA;
import X.C1131070fXV;
import X.C1131080fXW;
import X.C1131790fYf;
import X.C1133350fbB;
import X.C1134740fdQ;
import X.C1161920gLG;
import X.C11NJ;
import X.C189200o6;
import X.C190400oI;
import X.C1AF0;
import X.C1EOY;
import X.C20441214yg;
import X.C21683819tc;
import X.C2187701Ajg;
import X.C2684012c;
import X.C434980H3w;
import X.C500260Jjc;
import X.C772770UTb;
import X.C784440Upu;
import X.EnumC1125400fOM;
import X.EnumC1130940fXI;
import X.InterfaceC1118350fCz;
import X.InterfaceC1126780fQa;
import X.InterfaceC1128210fSt;
import X.ViewTreeObserverOnDrawListenerC1128660fTc;
import Y.AObserverS221S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS28S0101000_17;
import Y.AfS186S0100000_17;
import Y.AsS44S0100000_17;
import android.app.Dialog;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.CancelAllAnimationEvent;
import com.bytedance.android.livesdk.api.coin.incentive.UgPointsGiftEndEvent;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.RiskCtl;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftInteractiveEnlargedPreviewSettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftRankingExclusiveTabSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.event.LiveCurrentGoalGlobalData;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalDeleteEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import org.json.JSONException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveNewGiftPanelWidget extends LiveWidget implements InterfaceC1126780fQa {
    public RecyclerView LL;
    public C1126220fPg LLILLJJLI;
    public Room LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public C434980H3w LLJ;
    public C1128630fTZ LLJI;
    public long LLJIJIL;
    public String LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Dialog LLJJJ;
    public final C1128600fTW LLJJJJ;
    public final C190400oI LLJJJJJIL;
    public final C1133350fbB LLJJJJLIIL;
    public int LLJJL;
    public GiftPage LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public final ViewTreeObserverOnDrawListenerC1128660fTc LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public final AtomicBoolean LLL;
    public boolean LLLF;
    public String LLLFF;
    public RiskCtl LLLFFI;
    public EnumC1125400fOM LLIZ = EnumC1125400fOM.ANCHOR;
    public final LinkedList<GiftPage> LLIZLLLIL = new LinkedList<>();
    public LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LLJILJIL = new LinkedList<>();
    public final C11NJ LLJJ = new C11NJ();
    public boolean LLJJI = true;
    public boolean LLJJIJIL = true;
    public Map<Long, C1130160fW2> LLJJJIL = new HashMap();

    @Override // X.InterfaceC1126780fQa
    public final void LLLZLL() {
        this.LLJJIII = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hzv;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() throws JSONException {
        MutableLiveData<Integer> mutableLiveData;
        ViewTreeObserver viewTreeObserver;
        try {
            IDebugService iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
            C189200o6.m2constructorimpl((iDebugService == null || iDebugService.Sg() == null) ? null : Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1128590fTV c1128590fTV = C1128590fTV.LIZ;
        C1128590fTV.LJJJJ = SystemClock.uptimeMillis();
        String str = this.LLLFF;
        C1128970fU7 c1128970fU7 = C1130100fVw.LIZ;
        String str2 = c1128970fU7.LIZJ;
        int i = this.LLJZ;
        int i2 = this.LLJZIJLIL;
        int i3 = C1128590fTV.LJ;
        int i4 = C1128590fTV.LJJIIJZLJL;
        C1131790fYf c1131790fYf = new C1131790fYf(str, str2, i, i2, i3, i4, Math.min(i4, Math.max(C1128590fTV.LJJIJ, C1128590fTV.LJJIIZI)), Math.min(C1128590fTV.LJJIIJZLJL, C1128590fTV.LJJIIZI), true);
        C1130140fW0 c1130140fW0 = new C1130140fW0(c1128590fTV);
        C1129710fVJ c1129710fVJ = new C1129710fVJ(c1128590fTV, this.LLJLILLLLZIIL - c1128970fU7.LJII);
        C1128640fTa c1128640fTa = new C1128640fTa(c1128590fTV);
        if (C1123380fL6.LIZIZ()) {
            C1123380fL6.LIZJ(204, false);
        }
        C1131070fXV.LJIIJJI(c1131790fYf, c1130140fW0, c1129710fVJ, c1128640fTa, SystemClock.uptimeMillis() - this.LLJLILLLLZIIL, C1128590fTV.LIZJ(), C1128590fTV.LIZLLL(), C1128590fTV.LJI, false, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        int i5 = this.LLJZ;
        if (i5 == 2 || i5 == 0) {
            C1131080fXW.LIZIZ(c1131790fYf, c1130140fW0, c1129710fVJ, c1128640fTa, SystemClock.uptimeMillis() - this.LLJLILLLLZIIL, C1128590fTV.LIZJ(), C1128590fTV.LIZLLL(), C1128590fTV.LJI, 0L, 0L, 0);
        }
        super.onDestroy();
        C1128590fTV.LIZ();
        this.LLJJ.LJ();
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            ViewTreeObserverOnDrawListenerC1128660fTc viewTreeObserverOnDrawListenerC1128660fTc = this.LLJLLL;
            viewTreeObserver.removeOnDrawListener(viewTreeObserverOnDrawListenerC1128660fTc);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnDrawListenerC1128660fTc, ViewTreeObserver.OnDrawListener.class);
        }
        C1128630fTZ c1128630fTZ = this.LLJI;
        if (c1128630fTZ != null && (mutableLiveData = c1128630fTZ.LIZIZ) != null) {
            mutableLiveData.removeObservers(this);
        }
        if (LiveGiftRankingExclusiveTabSetting.isEnabled()) {
            GiftManager.inst().getTeamRankManager().LJFF = null;
        }
        C1124730fNH.LIZIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC1126780fQa
    public final boolean LJIIIZ() {
        User user;
        C1128630fTZ c1128630fTZ = this.LLJI;
        long id = (c1128630fTZ == null || (user = c1128630fTZ.LIZ) == null) ? 0L : user.getId();
        RiskCtl riskCtl = this.LLLFFI;
        return riskCtl != null && riskCtl.disableSendGift && id == UserService.getInstance().user().getCurrentUserId();
    }

    @Override // X.InterfaceC1126780fQa
    public final boolean LJJJI() {
        C1126220fPg c1126220fPg = this.LLILLJJLI;
        if (c1126220fPg != null) {
            return C500260Jjc.LJJJJIZL(c1126220fPg);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0fTc] */
    public LiveNewGiftPanelWidget() {
        C1128600fTW c1128600fTW = new C1128600fTW();
        this.LLJJJJ = c1128600fTW;
        this.LLJJJJJIL = new C190400oI(c1128600fTW);
        this.LLJJJJLIIL = new C1133350fbB();
        c1128600fTW.LIZLLL = new AwS561S0100000_17(this, 163);
        this.LLJLIL = true;
        this.LLJLLIL = true;
        this.LLJLLL = new ViewTreeObserver.OnDrawListener() { // from class: X.0fTc
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.LL;
                if (liveNewGiftPanelWidget.LLJLLIL) {
                    liveNewGiftPanelWidget.LLJLLIL = false;
                    C1128590fTV.LJJJ = SystemClock.uptimeMillis();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    LiveNewGiftPanelWidget liveNewGiftPanelWidget2 = this.LL;
                    long j = jUptimeMillis - liveNewGiftPanelWidget2.LLJLILLLLZIIL;
                    C1128590fTV.LJJIII = j;
                    C1128750fTl.LIZLLL(j, liveNewGiftPanelWidget2.LLJLL);
                }
            }
        };
        this.LLJZ = 1;
        this.LLJZIJLIL = 1;
        this.LLL = new AtomicBoolean(true);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0H3w, X.0fQS] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList;
        MutableLiveData<EnumC1130940fXI> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        RecyclerView recyclerView;
        MutableLiveData<Long> mutableLiveData3;
        Long value;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        super.onCreate();
        C1128240fSw c1128240fSw = C1128250fSx.LIZ;
        c1128240fSw.LIZ = -1;
        c1128240fSw.LIZIZ = -1;
        c1128240fSw.LJIIJ = true;
        RecyclerView recyclerView2 = (RecyclerView) this.contentView.findViewById(R.id.iz4);
        this.LL = recyclerView2;
        if (recyclerView2 != null) {
            C500260Jjc.LLFFF(recyclerView2);
        }
        RecyclerView recyclerView3 = this.LL;
        if (recyclerView3 != null && (viewTreeObserver2 = recyclerView3.getViewTreeObserver()) != null) {
            ViewTreeObserverOnDrawListenerC1128660fTc viewTreeObserverOnDrawListenerC1128660fTc = this.LLJLLL;
            viewTreeObserver2.removeOnDrawListener(viewTreeObserverOnDrawListenerC1128660fTc);
            C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnDrawListenerC1128660fTc, ViewTreeObserver.OnDrawListener.class);
        }
        RecyclerView recyclerView4 = this.LL;
        if (recyclerView4 != null && (viewTreeObserver = recyclerView4.getViewTreeObserver()) != null) {
            ViewTreeObserverOnDrawListenerC1128660fTc viewTreeObserverOnDrawListenerC1128660fTc2 = this.LLJLLL;
            viewTreeObserver.addOnDrawListener(viewTreeObserverOnDrawListenerC1128660fTc2);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnDrawListenerC1128660fTc2, ViewTreeObserver.OnDrawListener.class);
        }
        this.LLILLJJLI = (C1126220fPg) this.containerView.findViewById(R.id.e9d);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            this.LLILLL = (Room) dataChannel.gg0(RoomChannel.class);
            Boolean bool = (Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class);
            this.LLILZLL = bool != null ? bool.booleanValue() : false;
            this.LLJJ.LIZ(C784440Upu.LIZ().LJ(C1134740fdQ.class).LJJLJLI(new AfS186S0100000_17(this, 203)));
            this.LLJJ.LIZ(C784440Upu.LIZ().LJ(C1130860fXA.class).LJJLJLI(new AfS186S0100000_17(this, 204)));
            this.LLJJ.LIZ(C784440Upu.LIZ().LJ(C1127380fRY.class).LJJLJLI(new AfS186S0100000_17(this, 205)));
            if (this.LLILLL != null) {
                InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
                Room room = this.LLILLL;
                this.LLLFFI = interfaceC1128210fStInst.getTargetRoomGiftRiskCtl(room != null ? room.getId() : 0L);
            }
            CopyOnWriteArrayList<C1125840fP4> copyOnWriteArrayList = C1125820fP2.LIZ;
            AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 723);
            AwS631S0100000_17 awS631S0100000_17 = new AwS631S0100000_17(this, 48);
            DataChannelGlobal.LLILZ.BQ2(this, this, LiveGoalDeleteEvent.class, new C020W(awS596S0100000_17, (Function1<? super Long, Integer>) awS631S0100000_17, (Function2<? super Integer, ? super Long, Unit>) 20));
            DataChannelGlobal.LLILZ.BQ2(this, this, LiveCurrentGoalGlobalData.class, new AwS383S0200000_17(awS596S0100000_17, (Function1<? super Long, Integer>) awS631S0100000_17, (Function2<? super Integer, ? super Long, Unit>) 49));
        }
        C1133350fbB c1133350fbB = this.LLJJJJLIIL;
        c1133350fbB.LIZ = false;
        c1133350fbB.LIZIZ = false;
        final Context context = this.context;
        ?? r1 = new AbstractC1126700fQS(context, this) { // from class: X.0H3w
            @Override // X.AbstractC1126700fQS
            public final AbstractC1126590fQH LLLII(int i, ViewGroup viewGroup) {
                AbstractC1126590fQH abstractC1126590fQHLLLII = super.LLLII(i, viewGroup);
                C786410Ut5.W5(abstractC1126590fQHLLLII.itemView, new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(91.0f), (int) C497740JfY.LIZIZ(110.0f)));
                return abstractC1126590fQHLLLII;
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                AbstractC1126590fQH abstractC1126590fQHLLLII = LLLII(i, viewGroup);
                try {
                    View view = abstractC1126590fQHLLLII.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                abstractC1126590fQHLLLII.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (abstractC1126590fQHLLLII.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(abstractC1126590fQHLLLII.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) abstractC1126590fQHLLLII.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(abstractC1126590fQHLLLII.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = abstractC1126590fQHLLLII.getClass().getName();
                return abstractC1126590fQHLLLII;
            }
        };
        this.LLJ = r1;
        r1.LLJ = this.dataChannel;
        C1128630fTZ c1128630fTZ = this.LLJI;
        if (c1128630fTZ != null && (mutableLiveData3 = c1128630fTZ.LJI) != null && (value = mutableLiveData3.getValue()) != null) {
            long jLongValue = value.longValue();
            C434980H3w c434980H3w = this.LLJ;
            if (c434980H3w != null) {
                c434980H3w.LLILZLL = jLongValue;
            }
        }
        C434980H3w c434980H3w2 = this.LLJ;
        if (c434980H3w2 != null) {
            c434980H3w2.LLJI = new C1128780fTo(this);
        }
        RecyclerView recyclerView5 = this.LL;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(c434980H3w2);
        }
        RecyclerView recyclerView6 = this.LL;
        Unit unit = null;
        if (recyclerView6 != null) {
            recyclerView6.setItemAnimator(null);
        }
        C434980H3w c434980H3w3 = this.LLJ;
        if (c434980H3w3 != null) {
            c434980H3w3.LLILLJJLI = this;
            c434980H3w3.LLIZLLLIL = this.LLJIJIL;
        }
        GiftSSGridLayoutManager giftSSGridLayoutManager = new GiftSSGridLayoutManager(this.context, new ARunnableS117S0100000_17(this, 314));
        giftSSGridLayoutManager.mRecycleChildrenOnDetach = true;
        if (LiveGiftInteractiveEnlargedPreviewSettings.INSTANCE.getEnabled() && (recyclerView = this.LL) != null) {
            recyclerView.setOverScrollMode(2);
        }
        RecyclerView recyclerView7 = this.LL;
        if (recyclerView7 != null) {
            recyclerView7.setLayoutManager(giftSSGridLayoutManager);
            recyclerView7.setHasFixedSize(true);
            recyclerView7.setItemViewCacheSize(16);
            recyclerView7.setClipChildren(false);
            recyclerView7.addOnScrollListener(new AsS44S0100000_17(this, 8));
            C1124730fNH.LIZIZ();
        }
        RecyclerView recyclerView8 = this.LL;
        if (recyclerView8 != null) {
            C1EOY c1eoy = C1EOY.LIZ;
            Dialog dialog = this.LLJJJ;
            recyclerView8.addOnScrollListener(new C772770UTb(c1eoy.LIZIZ("panel_gift_slide"), dialog != null ? dialog.getWindow() : null));
        }
        C21683819tc c21683819tc = new C21683819tc() { // from class: X.0fTd
            @Override // X.C21683819tc, X.AbstractC1144210fsh
            public final View LIZLLL(RecyclerView.LayoutManager layoutManager) {
                View viewLIZLLL = super.LIZLLL(layoutManager);
                if (viewLIZLLL == null) {
                    return null;
                }
                this.LJI.LLILZ = layoutManager.getPosition(viewLIZLLL);
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.LJI;
                liveNewGiftPanelWidget.A1(liveNewGiftPanelWidget.LLILZ);
                return viewLIZLLL;
            }

            @Override // X.C21683819tc, X.AbstractC1144210fsh
            public final int LJ(RecyclerView.LayoutManager layoutManager, int i, int i2) {
                this.LJI.LLILZ = super.LJ(layoutManager, i, i2);
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.LJI;
                liveNewGiftPanelWidget.A1(liveNewGiftPanelWidget.LLILZ);
                return this.LJI.LLILZ;
            }
        };
        if (c21683819tc.LIZJ <= 0) {
            throw new IllegalArgumentException("row must be greater than zero");
        }
        c21683819tc.LIZJ = 2;
        if (c21683819tc.LIZLLL <= 0) {
            throw new IllegalArgumentException("column must be greater than zero");
        }
        c21683819tc.LIZLLL = 4;
        try {
            c21683819tc.LIZIZ(this.LL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZIZ();
        }
        RecyclerView recyclerView9 = this.LL;
        if (recyclerView9 != null) {
            recyclerView9.addOnScrollListener(new AsS44S0100000_17(this, 7));
        }
        C1128630fTZ c1128630fTZ2 = this.LLJI;
        if (c1128630fTZ2 != null && (mutableLiveData2 = c1128630fTZ2.LIZIZ) != null) {
            mutableLiveData2.observe(this, new AObserverS221S0100000_17(this, 58));
        }
        C1128630fTZ c1128630fTZ3 = this.LLJI;
        if (c1128630fTZ3 != null && (mutableLiveData = c1128630fTZ3.LJIIIIZZ) != null) {
            mutableLiveData.observe(this, new AObserverS221S0100000_17(this, 59));
        }
        this.dataChannel.BQ2(this, CancelAllAnimationEvent.class, new AwS596S0100000_17(this, 724));
        this.dataChannel.BQ2(this, UgPointsGiftEndEvent.class, new AwS596S0100000_17(this, 725));
        if (LiveGiftRankingExclusiveTabSetting.isEnabled() && (linkedList = this.LLJILJIL) != null) {
            GiftManager.inst().getTeamRankManager().LJFF = new InterfaceC1118350fCz() { // from class: X.0fMr
                @Override // X.InterfaceC1118350fCz
                public final void LIZ(long j) {
                    GiftPanelBanner giftPanelBanner;
                    int size = linkedList.size();
                    for (int i = 0; i < size; i++) {
                        AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) C13LP.LJJJLZIJ(i, linkedList);
                        if (abstractC1126600fQI != null && abstractC1126600fQI.LJI() == j) {
                            T t = abstractC1126600fQI.LIZIZ;
                            if (t instanceof Gift) {
                                Gift gift = (Gift) t;
                                this.getClass();
                                if (gift != null) {
                                    if (gift.giftSubInfo == null) {
                                        gift.giftSubInfo = new GiftLockInfo();
                                    }
                                    GiftLockInfo giftLockInfo = gift.giftSubInfo;
                                    if (giftLockInfo != null) {
                                        giftLockInfo.mLock = true;
                                        giftLockInfo.mLockType = 6;
                                    }
                                    GiftsInfo.LimitedTimeRewardGiftInfo limitedTimeRewardGiftInfo = (GiftsInfo.LimitedTimeRewardGiftInfo) ((LinkedHashMap) GiftManager.inst().getTeamRankManager().LIZIZ).get(Long.valueOf(gift.id));
                                    if (limitedTimeRewardGiftInfo != null && (giftPanelBanner = limitedTimeRewardGiftInfo.giftPanelBanner) != null) {
                                        gift.giftPanelBanner = giftPanelBanner;
                                    }
                                    GiftManager.inst().getTeamRankManager().LIZJ.put(Long.valueOf(gift.id), gift);
                                }
                                LiveNewGiftPanelWidget liveNewGiftPanelWidget = this;
                                C434980H3w c434980H3w4 = liveNewGiftPanelWidget.LLJ;
                                if (c434980H3w4 != null) {
                                    int iLLLFZ = c434980H3w4.LLLFZ(j);
                                    C434980H3w c434980H3w5 = liveNewGiftPanelWidget.LLJ;
                                    if (c434980H3w5 != null) {
                                        c434980H3w5.notifyItemChanged(iLLLFZ);
                                    }
                                }
                            }
                        }
                    }
                }
            };
        }
        try {
            IDebugService iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
            if (iDebugService != null && iDebugService.Sg() != null) {
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1126780fQa
    public final RiskCtl LLLLLLZ() {
        return this.LLLFFI;
    }

    public final void A1(int i) {
        C1128630fTZ c1128630fTZ;
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        MutableLiveData<Integer> mutableLiveData2;
        Integer value2;
        MutableLiveData<C1097050eed> mutableLiveData3;
        boolean z;
        int i2 = i / 8;
        if (i2 >= 0 && i2 < this.LLILZIL) {
            int iIntValue = 0;
            if (i2 != this.LLJILLL) {
                this.LLJILLL = i2;
                C1130300fWG c1130300fWG = C1130220fW8.LIZ;
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1130300fWG.LIZ = z;
            }
            this.dataChannel.FQ2(CancelAllAnimationEvent.class);
            C1126720fQU c1126720fQU = C1126810fQd.LIZ;
            if (c1126720fQU.LIZLLL != i2) {
                c1126720fQU.LIZLLL();
            }
            C1097050eed c1097050eed = new C1097050eed();
            c1097050eed.LIZIZ = i2;
            c1097050eed.LIZ = this.LLILZIL;
            C1128630fTZ c1128630fTZ2 = this.LLJI;
            if (c1128630fTZ2 != null && (mutableLiveData3 = c1128630fTZ2.LJFF) != null) {
                mutableLiveData3.setValue(c1097050eed);
            }
            if (this.LLJJIII && ((c1128630fTZ = this.LLJI) == null || (mutableLiveData2 = c1128630fTZ.LIZIZ) == null || (value2 = mutableLiveData2.getValue()) == null || 5 != value2.intValue())) {
                C1128970fU7 c1128970fU7 = C1130100fVw.LIZ;
                C1128630fTZ c1128630fTZ3 = this.LLJI;
                if (c1128630fTZ3 != null && (mutableLiveData = c1128630fTZ3.LIZIZ) != null && (value = mutableLiveData.getValue()) != null) {
                    iIntValue = value.intValue();
                }
                c1128970fU7.LJFF = iIntValue;
                GiftPage giftPage = this.LLJJLIIIJLLLLLLLZ;
                if (giftPage != null) {
                    C1128760fTm.LJIIJ.LJJJI(this.LLLFF, c1097050eed.LIZIZ, this.LLJJL, giftPage, false, this.LLJILJILJ, C1125820fP2.LJFF().LIZ, this.LLJJJJ);
                }
            }
            C1128250fSx.LIZ.LJI(i2);
        }
    }

    @Override // X.InterfaceC1126780fQa
    public final void LJIIJJI(boolean z) {
        C1125500fOW.LIZ(this.LLILLJJLI, z);
    }

    @Override // X.InterfaceC1126780fQa
    public final void LJLJLJ(int i) {
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        RecyclerView recyclerView2 = this.LL;
        if (recyclerView2 != null) {
            HandlerHook.viewPostDelay(recyclerView2, new ARunnableS28S0101000_17(this, i, 5), 100L);
        }
    }

    public final AbstractC1126600fQI<? extends AnonymousClass0054> y1(Gift gift) {
        if (gift.type == 3) {
            return new C2684012c(gift);
        }
        return new C1126040fPO(gift);
    }

    @Override // X.InterfaceC1126780fQa
    public final void LLILZLL(int i, int i2) {
        MutableLiveData<C1097050eed> mutableLiveData;
        C1097050eed c1097050eed = new C1097050eed();
        c1097050eed.LIZIZ = i;
        c1097050eed.LIZ = i2;
        this.LLILZIL = i2;
        C1128630fTZ c1128630fTZ = this.LLJI;
        if (c1128630fTZ != null && (mutableLiveData = c1128630fTZ.LJFF) != null) {
            mutableLiveData.setValue(c1097050eed);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1(java.util.LinkedList<X.AbstractC1126600fQI<? extends X.AnonymousClass0054>> r32, boolean r33) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget.x1(java.util.LinkedList, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[PHI: r2
      0x00af: PHI (r2v45 long) = (r2v44 long), (r2v44 long), (r2v53 long) binds: [B:37:0x008a, B:39:0x0098, B:42:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2  */
    @Override // X.InterfaceC1126780fQa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIZ(X.AbstractC1126600fQI<?> r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget.LLIZ(X.0fQI, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x016e A[LOOP:4: B:70:0x0168->B:72:0x016e, LOOP_END] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1(int r47, boolean r48, java.util.List r49) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget.z1(int, boolean, java.util.List):void");
    }

    @Override // X.InterfaceC1126780fQa
    public final void LJJIIZ(long j, float f, float f2, int i, AwS561S0100000_17 awS561S0100000_17) {
        long id;
        User user;
        C1126220fPg c1126220fPg = this.LLILLJJLI;
        if (c1126220fPg == null) {
            return;
        }
        C1128630fTZ c1128630fTZ = this.LLJI;
        if (c1128630fTZ != null && (user = c1128630fTZ.LIZ) != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        C1125500fOW.LIZLLL(c1126220fPg, j, id, f, f2, i, true, new AwS631S0100000_17(awS561S0100000_17, 47), awS561S0100000_17);
        C20441214yg.LJIIIZ("GiftPanelCombo", "showCombo $comboView");
    }
}
