package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.AbstractC1098270egb;
import X.C001A;
import X.C011Z;
import X.C01C5;
import X.C08D5;
import X.C0IFW;
import X.C0IJT;
import X.C0IK5;
import X.C0J1N;
import X.C1090490eU3;
import X.C1091250eVH;
import X.C1097970eg7;
import X.C1097990eg9;
import X.C1098010egB;
import X.C1098230egX;
import X.C1098280egc;
import X.C1098290egd;
import X.C1098330egh;
import X.C1098420egq;
import X.C1098500egy;
import X.C1098510egz;
import X.C1098550eh3;
import X.C1098730ehL;
import X.C1102070emj;
import X.C1102250en1;
import X.C1148130fz1;
import X.C1161920gLG;
import X.C11NN;
import X.C11OY;
import X.C11RD;
import X.C13LP;
import X.C1516000pYM;
import X.C15438062q;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C19491311Nn;
import X.C1954807lC;
import X.C1EOY;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C2348809Ig;
import X.C262100zr;
import X.C354201Zc;
import X.C417850GZz;
import X.C418440Gaw;
import X.C465520INi;
import X.C474500IjA;
import X.C474520IjC;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501590Jll;
import X.C521960KdW;
import X.C635860Owq;
import X.C750060TbY;
import X.C750100Tbc;
import X.C766270U4b;
import X.C775900Uc8;
import X.C776250Uch;
import X.C784060UpI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC040300Cj;
import X.EnumC1098310egf;
import X.EnumC1098600eh8;
import X.EnumC1101430elh;
import X.EnumC781860Ulk;
import X.InterfaceC1098380egm;
import X.InterfaceC1098410egp;
import X.InterfaceC1102300en6;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1300390jwb;
import X.InterfaceC1631630sYr;
import X.InterfaceC19483011Ki;
import X.InterfaceC420801kM;
import X.InterfaceC474510IjB;
import X.InterfaceC482090IvP;
import X.InterfaceC499240Jhy;
import Y.ARunnableS11S0301000_17;
import Y.AfS176S0100000_7;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.banner.BannerVisibilityEvent;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.LiveEffectNotifyCheckParamsSetting;
import com.bytedance.android.livesdk.livesetting.LiveEffectNotifyDelaySetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerVisibilityOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveBannerAndMidBigWordModeOptEnableSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyAvoidControlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyTypeNameMappingSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveBannerPlaceholderSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveBannerRequestOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveLynxBannerReverseSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveMainFrameworkExpandSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveMainFrameworkFixSizeSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidRule;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS141S0201000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.AwS69S0210000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public final class NewTopRightBannerWidget extends PerformProcessWidget implements InterfaceC1098410egp, OnMessageListener, C0IFW, InterfaceC1141530foN, InterfaceC1300390jwb {
    public FrameLayout LL;
    public FrameLayout LLILLJJLI;
    public TextView LLILLL;
    public BannerInRoom LLILZ;
    public Room LLILZIL;
    public boolean LLILZLL;
    public IMessageManager LLIZ;
    public AbstractC1098270egb LLIZLLLIL;
    public InterfaceC420801kM LLJI;
    public InterfaceC420801kM LLJIJIL;
    public boolean LLJILLL;
    public int LLJJ;
    public boolean LLJJIJI;
    public List<? extends BannerInRoom> LLJJIJIIJIL;
    public Long LLJJIJIL;
    public Long LLJJJ;
    public Long LLJJJIL;
    public long LLJJJJJIL;
    public long LLJJJJLIIL;
    public boolean LLJL;
    public C1098230egX LLJLIL;
    public final HashMap<Long, Boolean> LLJ = new HashMap<>();
    public boolean LLJILJIL = true;
    public final List<Runnable> LLJILJILJ = new ArrayList();
    public float LLJJI = -1.0f;
    public EnumC040300Cj LLJJIII = EnumC040300Cj.LYNX;
    public final BPEAHandler LLJJJJ = new BPEAHandler(Looper.getMainLooper());
    public final Map<String, InterfaceC1102300en6> LLJJL = new LinkedHashMap();
    public final boolean LLJJLIIIJLLLLLLLZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();

    @Override // X.InterfaceC1098410egp
    public final void L() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0o;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        InterfaceC420801kM interfaceC420801kM;
        InterfaceC420801kM interfaceC420801kM2;
        InterfaceC420801kM interfaceC420801kM3 = this.LLJIJIL;
        if (interfaceC420801kM3 != null && !interfaceC420801kM3.isDisposed() && (interfaceC420801kM2 = this.LLJIJIL) != null) {
            interfaceC420801kM2.dispose();
        }
        InterfaceC420801kM interfaceC420801kM4 = this.LLJI;
        if (interfaceC420801kM4 != null && !interfaceC420801kM4.isDisposed() && (interfaceC420801kM = this.LLJI) != null) {
            interfaceC420801kM.dispose();
        }
        C0IK5.LIZ().removeCallbacksAndMessages(this);
        FrameLayout frameLayout = this.LL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJJJJIZL(frameLayout);
        AbstractC1098270egb abstractC1098270egb = this.LLIZLLLIL;
        if (abstractC1098270egb != null) {
            abstractC1098270egb.LIZJ();
        }
        this.LLIZLLLIL = null;
    }

    public final void B1() {
        if (!LiveMainFrameworkFixSizeSetting.INSTANCE.enable() || C011Z.LIZ.LJJII()) {
            View view = getView();
            if (view != null) {
                C635860Owq.LIZ(view, 2, 4, 8, 4);
                return;
            }
            return;
        }
        FrameLayout frameLayout = this.LL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C635860Owq.LIZ(frameLayout, 0, 0, 0, 4);
        View view2 = getView();
        if (view2 != null) {
            FrameLayout frameLayout2 = this.LL;
            C635860Owq.LIZIZ(6, 4, 8, -48, view2, frameLayout2 != null ? frameLayout2 : null, true);
        }
    }

    public final void C1() {
        C1091250eVH c1091250eVH;
        if (!LiveMainFrameworkFixSizeSetting.INSTANCE.enable() || C011Z.LIZ.LJJII()) {
            return;
        }
        View view = getView();
        if (!(view instanceof C1091250eVH) || (c1091250eVH = (C1091250eVH) view) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c1091250eVH.getLayoutParams();
        layoutParams.height = (int) C497740JfY.LIZIZ(72.0f);
        layoutParams.width = (int) C497740JfY.LIZIZ(106.0f);
        C786410Ut5.A6(c1091250eVH, layoutParams);
        c1091250eVH.setEnableFixedSize(true);
    }

    public final long F1() {
        if (this.LLILZLL) {
            Long l = (Long) DataChannelGlobal.LLILZ.gg0(C1148130fz1.class);
            if (l != null) {
                return l.longValue();
            }
            return 0L;
        }
        Long l2 = (Long) this.dataChannel.gg0(C750060TbY.class);
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    @Override // X.InterfaceC1098410egp
    public final void LJJJJJL() {
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1097990eg9.LIZIZ().LJIIJ = System.currentTimeMillis();
        c1097990eg9.LJFF();
    }

    public final void O1() {
        AbstractC1098270egb abstractC1098270egb = this.LLIZLLLIL;
        if (abstractC1098270egb == null) {
            FrameLayout frameLayout = this.LL;
            if (frameLayout == null) {
                frameLayout = null;
            }
            C786410Ut5.LJZ(0, frameLayout);
        } else if (y1(abstractC1098270egb)) {
            abstractC1098270egb.LJIIJ();
        } else if (!abstractC1098270egb.LJII()) {
            FrameLayout frameLayout2 = this.LL;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            C786410Ut5.LJZ(0, frameLayout2);
            abstractC1098270egb.LJIIJ();
        }
        if (!isViewValid()) {
            FrameLayout frameLayout3 = this.LL;
            C786410Ut5.LJZ(8, frameLayout3 != null ? frameLayout3 : null);
        }
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1097990eg9.LIZIZ().LJIIJJI = System.currentTimeMillis();
        c1097990eg9.LJI();
    }

    public final void Q1() {
        LiveMode streamType;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_banner_routine_show");
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJII(C500260Jjc.LJIIZILJ(this.dataChannel) ? "anchor" : C01C5.LIZ(this.dataChannel) ? "admin" : "viewer", "user_type");
        Room room = this.LLILZIL;
        c474500IjALIZ.LJJII((room == null || (streamType = room.getStreamType()) == null) ? null : C354201Zc.LIZ(streamType), "live_type");
        c474500IjALIZ.LJJII(this.LLILZLL ? "live_take_detail" : "live_detail", "event_page");
        x1(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1300390jwb
    public final Integer getBannerType() {
        return Integer.valueOf(this.LLJJIII == EnumC040300Cj.NATIVE ? 1 : 0);
    }

    @Override // X.C0IFW
    public final void pause() {
        C20441214yg.LJIIIZ("matao-test", "Banner pause");
        this.LLJILLL = true;
    }

    @Override // X.C0IFW
    public final void resume() {
        C20441214yg.LJIIIZ("matao-test", "Banner resume");
        this.LLJILLL = false;
        if (((ArrayList) this.LLJILJILJ).isEmpty()) {
            return;
        }
        Iterator<Runnable> it2 = this.LLJILJILJ.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        ((ArrayList) this.LLJILJILJ).clear();
    }

    @Override // X.InterfaceC1300390jwb
    public final String z() {
        List<? extends BannerInRoom> list = this.LLJJIJIIJIL;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (BannerInRoom bannerInRoom : list) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("banner_id", Long.valueOf(bannerInRoom.id));
            List<? extends BannerInRoom> list2 = this.LLJJIJIIJIL;
            pairArr[1] = new Pair("position", list2 != null ? Integer.valueOf(list2.indexOf(bannerInRoom)) : null);
            pairArr[2] = new Pair("is_dynamic", Boolean.valueOf(!C1097970eg7.LIZLLL(bannerInRoom)));
            arrayList.add(C2097608Jq.LJIIIIZZ(pairArr));
        }
        return C1516000pYM.LIZJ(arrayList);
    }

    public final void M1() {
        C1097990eg9.LIZIZ().LJII = System.currentTimeMillis();
    }

    @Override // X.C0IFW
    public final void W() {
        cancel();
        ((ArrayList) this.LLJILJILJ).clear();
        this.LLJILLL = false;
    }

    @Override // X.C0IFW
    public final void cancel() {
        C0IK5.LIZ().removeCallbacksAndMessages(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(BannerVisibilityEvent.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        AbstractC1098270egb abstractC1098270egb = this.LLIZLLLIL;
        if (abstractC1098270egb != null) {
            abstractC1098270egb.LJIILL();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        AbstractC1098270egb abstractC1098270egb = this.LLIZLLLIL;
        if (abstractC1098270egb != null) {
            abstractC1098270egb.LJIILLIIL();
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1098230egX c1098230egX;
        C0IK5.LIZ().removeCallbacksAndMessages(this.dataChannel);
        this.LLJJJJ.removeCallbacksAndMessages(null);
        A1();
        C1548820qPI.LJIIIIZZ("banner_lynx_slide_init", this);
        IMessageManager iMessageManager = this.LLIZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LLIZ = null;
        C1097990eg9.LIZIZ = null;
        this.LLJ.clear();
        this.LLJILJIL = true;
        this.LLJJ = 0;
        this.LLJJI = 0.0f;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJIJIIJIL = null;
        if (C500260Jjc.LJJJJIZL(this.LLILLJJLI) && (c1098230egX = this.LLJLIL) != null) {
            C474500IjA c474500IjAE1 = E1(this.LLILZ, "banner_load_duration");
            c474500IjAE1.LJJII(Long.valueOf((SystemClock.elapsedRealtime() - this.LLJJJJLIIL) - c1098230egX.LJI), "load_duration");
            c474500IjAE1.LJJII("leave_room", "report_status");
            c474500IjAE1.LIZ();
        }
        C500260Jjc.LJIILIIL(this.LLILLJJLI);
        C465520INi.LIZ.PB2(null);
        C1EOY c1eoy = C1EOY.LIZ;
        C1EOY.LJIJ = new WeakReference<>(null);
        ((LinkedHashMap) this.LLJJL).clear();
        InterfaceC499240Jhy interfaceC499240JhyHi = ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).Hi();
        if (interfaceC499240JhyHi != null) {
            C1098500egy c1098500egy = ((C1098510egz) interfaceC499240JhyHi).LIZIZ;
            InterfaceC474510IjB.LIZ.getClass();
            C474520IjC.LIZIZ.remove(c1098500egy);
        }
        if (!LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getAdaptBannerExpandDowngrade() || C500260Jjc.LJIIZILJ(this.dataChannel)) {
            return;
        }
        ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.BANNER_EXPAND_DOWNGRADE);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public final void onViewAttached() {
        super.onViewAttached();
        if (enableAttachOpt()) {
            C1();
            B1();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.show();
        if (!LiveBannerVisibilityOptimizeSetting.INSTANCE.enable()) {
            View view = getView();
            ViewGroup.LayoutParams layoutParams = null;
            if ((view instanceof ViewGroup) && view != null) {
                layoutParams = view.getLayoutParams();
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(BannerVisibilityEvent.class, Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC1300390jwb
    public final Long LJLJI() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1300390jwb
    public final Long LLJILJILJ() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1300390jwb
    public final Long LLLJ() {
        return this.LLJJJIL;
    }

    public static void x1(C474500IjA c474500IjA) {
        String str = LiveEffectNotifyTypeNameMappingSetting.getValue().biz.get("25");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c474500IjA.LJJII(str, "business_type");
        String str3 = LiveEffectNotifyTypeNameMappingSetting.getValue().scene.get("42");
        if (str3 != null) {
            str2 = str3;
        }
        c474500IjA.LJJII(str2, "sub_business_type");
    }

    public static boolean y1(AbstractC1098270egb abstractC1098270egb) {
        EnumC040300Cj enumC040300Cj;
        if (LiveLynxBannerReverseSetting.INSTANCE.enable()) {
            return false;
        }
        LiveBannerPlaceholderSetting liveBannerPlaceholderSetting = LiveBannerPlaceholderSetting.INSTANCE;
        if (!liveBannerPlaceholderSetting.enable()) {
            return false;
        }
        if (abstractC1098270egb instanceof C1098550eh3) {
            enumC040300Cj = EnumC040300Cj.NATIVE;
        } else if (abstractC1098270egb instanceof C1098730ehL) {
            enumC040300Cj = EnumC040300Cj.LYNX;
        } else {
            enumC040300Cj = EnumC040300Cj.WEB;
        }
        if (enumC040300Cj == EnumC040300Cj.NATIVE) {
            return false;
        }
        return liveBannerPlaceholderSetting.enable();
    }

    public final Map<String, String> D1(List<? extends BannerInRoom> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("has_default_imgs", String.valueOf(this.LLJJ));
        linkedHashMap.put("performance_score", String.valueOf(this.LLJJI));
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<? extends BannerInRoom> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C1097970eg7.LIZIZ(it2.next()));
            }
        }
        linkedHashMap.put("banner_types", C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63));
        return linkedHashMap;
    }

    public final String G1(BannerInRoom bannerInRoom) {
        n nVarLJFF;
        k kVarLJJIIZ;
        if (bannerInRoom == null) {
            return "";
        }
        if (a0.LJLIIIL(bannerInRoom.schemaUrl).toString().length() > 0) {
            return bannerInRoom.schemaUrl;
        }
        String str = bannerInRoom.dynamicBanner.jsonResource;
        if (str == null || (nVarLJFF = C2348809Ig.LJFF(str)) == null || (kVarLJJIIZ = nVarLJFF.LJJIIZ("jumpSchema")) == null) {
            return null;
        }
        return kVarLJJIIZ.LJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04db  */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget, com.bytedance.android.widget.Widget, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.0egb] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
    public final void H1(com.bytedance.android.livesdk.model.message.BannerInRoomCollection.BannerInfo r15) {
        /*
            Method dump skipped, instruction units count: 1465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget.H1(com.bytedance.android.livesdk.model.message.BannerInRoomCollection$BannerInfo):void");
    }

    @Override // X.InterfaceC1098410egp
    public final void LJJLI(String str) {
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1097990eg9.LIZIZ().LJIIJ = System.currentTimeMillis();
        c1097990eg9.LJ(str);
    }

    public final void P1(EnumC1098600eh8 enumC1098600eh8) {
        FrameLayout frameLayout = this.LL;
        C1091250eVH c1091250eVH = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent instanceof C1091250eVH) {
            c1091250eVH = (C1091250eVH) parent;
        }
        int i = C1098280egc.LIZLLL[enumC1098600eh8.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new C1954807lC();
            }
            if (c1091250eVH != null) {
                c1091250eVH.setEnableFixedSize(false);
                return;
            }
            return;
        }
        if (c1091250eVH != null) {
            c1091250eVH.setEnableFixedSize(true);
        }
    }

    public final void R1(C1098290egd c1098290egd) {
        int iIntValue;
        this.LLJJJJ.removeCallbacksAndMessages(c1098290egd.LIZ);
        AbstractC1098270egb abstractC1098270egb = this.LLIZLLLIL;
        if (abstractC1098270egb != null) {
            abstractC1098270egb.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(106.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(24.0f))), c1098290egd);
        }
        if (this.LLJJL.remove(c1098290egd.LIZ) != null) {
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel = this.dataChannel;
            String str = c1098290egd.LIZ;
            Integer num = c1098290egd.LJI;
            if (num != null && num.intValue() != 0) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            c1102070emj.getClass();
            C1102070emj.LJIIL(dataChannel, iIntValue, str);
            Q1();
        }
    }

    public final void T1(C1098290egd c1098290egd) {
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = this.dataChannel;
        int i = c1098290egd.LIZIZ;
        int i2 = c1098290egd.LIZJ;
        int i3 = c1098290egd.LIZLLL;
        c1102070emj.getClass();
        if (!C1102070emj.LJI(dataChannel, i, i2, i3)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rule not found for component(");
            sbLIZ.append(c1098290egd.LIZIZ);
            sbLIZ.append(")/biz(");
            sbLIZ.append(c1098290egd.LIZJ);
            sbLIZ.append(")/scene(");
            sbLIZ.append(c1098290egd.LIZLLL);
            sbLIZ.append(')');
            C20441214yg.LJ("effect_notify", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC499240Jhy interfaceC499240JhyHi = ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).Hi();
            if (interfaceC499240JhyHi != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("rule not found for component, ");
                sbLIZ2.append(c1098290egd);
                ((C1098510egz) interfaceC499240JhyHi).LIZ("BannerHybrid", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            return;
        }
        C1098330egh c1098330egh = new C1098330egh(c1098290egd, new AwS418S0200000_17(this, c1098290egd, 50), new AwS418S0200000_17(this, c1098290egd, 51), new AwS383S0200000_17(this, c1098290egd, 20));
        this.LLJJL.put(c1098290egd.LIZ, c1098330egh);
        DataChannel dataChannel2 = this.dataChannel;
        c1102070emj.getClass();
        C1102070emj.LJJ(dataChannel2, c1098330egh, false, null);
    }

    public final void U1(C1098290egd c1098290egd) {
        int iIntValue;
        if (this.LLJJL.remove(c1098290egd.LIZ) != null) {
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel = this.dataChannel;
            String str = c1098290egd.LIZ;
            Integer num = c1098290egd.LJI;
            if (num != null && num.intValue() != 0) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            c1102070emj.getClass();
            C1102070emj.LJIIL(dataChannel, iIntValue, str);
            Q1();
        }
    }

    public final void V1(AbstractC1098270egb abstractC1098270egb) {
        C1098230egX c1098230egX;
        this.LLJILJIL = false;
        abstractC1098270egb.LJIIIIZZ();
        FrameLayout frameLayout = this.LL;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJJJJIZL(frameLayout);
        View viewLJFF = abstractC1098270egb.LJFF();
        if (viewLJFF != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(106.0f);
            int iLIZIZ2 = (int) C497740JfY.LIZIZ(24.0f);
            if (LiveBannerVisibilityOptimizeSetting.INSTANCE.enable()) {
                show();
            }
            FrameLayout frameLayout3 = this.LL;
            if (frameLayout3 == null) {
                frameLayout3 = null;
            }
            frameLayout3.addView(viewLJFF, iLIZIZ, iLIZIZ2);
            if (!LiveBannerAndMidBigWordModeOptEnableSetting.INSTANCE.enable()) {
                FrameLayout frameLayout4 = this.LL;
                if (frameLayout4 == null) {
                    frameLayout4 = null;
                }
                C1090490eU3.LIZ(106.0f, 24.0f, frameLayout4);
            }
            if (abstractC1098270egb.LJII() && !y1(abstractC1098270egb)) {
                FrameLayout frameLayout5 = this.LL;
                if (frameLayout5 != null) {
                    frameLayout2 = frameLayout5;
                }
                C786410Ut5.LJZ(0, frameLayout2);
                abstractC1098270egb.LJIIJ();
            } else if (y1(abstractC1098270egb)) {
                FrameLayout frameLayout6 = this.LL;
                if (frameLayout6 != null) {
                    frameLayout2 = frameLayout6;
                }
                C786410Ut5.LJZ(0, frameLayout2);
            } else {
                FrameLayout frameLayout7 = this.LL;
                if (frameLayout7 != null) {
                    frameLayout2 = frameLayout7;
                }
                C786410Ut5.LJZ(8, frameLayout2);
            }
            this.LLIZLLLIL = abstractC1098270egb;
        } else {
            FrameLayout frameLayout8 = this.LL;
            if (frameLayout8 != null) {
                frameLayout2 = frameLayout8;
            }
            C786410Ut5.LJZ(8, frameLayout2);
        }
        if ((abstractC1098270egb instanceof C1098730ehL) && (c1098230egX = this.LLJLIL) != null) {
            c1098230egX.LJFF = SystemClock.elapsedRealtime() - this.LLJJJJLIIL;
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        int iLIZLLL;
        Long lValueOf;
        int size;
        BannerInRoom bannerInRoom;
        BannerInRoom bannerInRoom2;
        BannerInRoom bannerInRoom3;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "banner_lynx_slide_init")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null) {
            iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "index", 0);
        } else {
            iLIZLLL = 0;
        }
        Long l = this.LLJJIJIL;
        if (l != null) {
            this.LLJJJ = Long.valueOf(l.longValue());
        }
        Long lValueOf2 = null;
        if (c262100zr.LIZIZ != null) {
            lValueOf = Long.valueOf(C1871910yoP.LIZLLL(r1, "bannerId", 0));
        } else {
            lValueOf = null;
        }
        this.LLJJIJIL = lValueOf;
        List<? extends BannerInRoom> list = this.LLJJIJIIJIL;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        int i = size - 1;
        if (iLIZLLL < i) {
            List<? extends BannerInRoom> list2 = this.LLJJIJIIJIL;
            if (list2 != null && (bannerInRoom3 = (BannerInRoom) ListProtector.get(list2, iLIZLLL + 1)) != null) {
                this.LLJJJIL = Long.valueOf(bannerInRoom3.id);
            }
        } else if (iLIZLLL == i && i > 0) {
            List<? extends BannerInRoom> list3 = this.LLJJIJIIJIL;
            if (list3 != null && (bannerInRoom2 = (BannerInRoom) ListProtector.get(list3, 0)) != null) {
                this.LLJJJIL = Long.valueOf(bannerInRoom2.id);
            }
            List<? extends BannerInRoom> list4 = this.LLJJIJIIJIL;
            if (list4 != null && (bannerInRoom = (BannerInRoom) ListProtector.get(list4, 0)) != null) {
                lValueOf2 = Long.valueOf(bannerInRoom.id);
            }
            this.LLJJJIL = lValueOf2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentBannerID: ");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(", prevBannerId: ");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(", nextBannerId: ");
        sbLIZ.append(this.LLJJJIL);
        C20441214yg.LJIIIZ("BannerPerf", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C1091250eVH c1091250eVH;
        this.LL = (FrameLayout) findViewById(R.id.w0d);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.bs0);
        this.LLILLL = (TextView) findViewById(R.id.za2);
        C417850GZz.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), this.LLILLJJLI);
        FrameLayout frameLayout = this.LL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewParent parent = frameLayout.getParent();
        if ((parent instanceof C1091250eVH) && (c1091250eVH = (C1091250eVH) parent) != null) {
            c1091250eVH.setEnableFixedSize(true);
        }
        if (!enableAttachOpt()) {
            C1();
            B1();
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        long jLongValue;
        Room room;
        boolean zBooleanValue;
        BannerInRoomCollection.BannerInfo bannerInfo;
        Room room2;
        BannerInRoomCollection bannerInRoomCollection;
        Boolean bool;
        this.LLJJJJJIL = System.currentTimeMillis();
        Long l = (Long) this.dataChannel.gg0(C750100Tbc.class);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LLJJJJLIIL = jLongValue;
        DataChannel dataChannel = this.dataChannel;
        Long lValueOf = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILZIL = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZLL = zBooleanValue;
        C1098230egX c1098230egX = (C1098230egX) this.dataChannel.gg0(C1098420egq.class);
        this.LLJLIL = c1098230egX;
        if (c1098230egX != null) {
            c1098230egX.LJII = SystemClock.elapsedRealtime() - this.LLJJJJLIIL;
        }
        Room room3 = this.LLILZIL;
        if (room3 != null && (bannerInRoomCollection = room3.roomBanner) != null) {
            bannerInfo = bannerInRoomCollection.topRightBanner;
        } else {
            bannerInfo = null;
        }
        InRoomBannerManager inRoomBannerManager = InRoomBannerManager.LL;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (room2 = (Room) dataChannel3.gg0(RoomChannel.class)) != null) {
            lValueOf = Long.valueOf(room2.getId());
        }
        inRoomBannerManager.getClass();
        C0J1N c0j1n = (C0J1N) InRoomBannerManager.LLILZIL.LJJIL(new C521960KdW(lValueOf, 0)).LIZJ(C11RD.LJ(this));
        if (c0j1n != null) {
            c0j1n.LIZJ(new AfS176S0100000_7(this, 47));
        }
        InterfaceC499240Jhy interfaceC499240JhyHi = ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).Hi();
        if (interfaceC499240JhyHi != null) {
            C1098500egy c1098500egy = ((C1098510egz) interfaceC499240JhyHi).LIZIZ;
            InterfaceC474510IjB.LIZ.getClass();
            C474520IjC.LIZIZ.add(c1098500egy);
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.BQ2(this, KeyboardStatusChannel.class, new AwS596S0100000_17(this, 97));
            dataChannel4.BQ2(this, PreShowKeyboardEvent.class, new AwS596S0100000_17(this, 98));
            dataChannel4.BQ2(this, LinkStateForH5Event.class, new AwS596S0100000_17(this, 99));
            dataChannel4.BQ2(this, MicRoomDisableInteractionEvent.class, new AwS596S0100000_17(this, 100));
        }
        C11NN<C784060UpI> c11nnLJII = UserService.getInstance().user().LJII();
        c11nnLJII.getClass();
        ((InterfaceC1098380egm) C11RD.LJ(this).LIZJ(new C11OY(new C19491311Nn(c11nnLJII), new InterfaceC19483011Ki() { // from class: X.0Jhz
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((C784060UpI) obj).LIZ == EnumC1098720ehK.Login) {
                    return true;
                }
                return false;
            }
        }))).LIZ(new AfS176S0100000_7(this, 48));
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        this.LLIZ = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.LLIZ;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.MG_ACTIVITY_IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        }
        C1548820qPI.LIZLLL("banner_lynx_slide_init", this);
        C465520INi.LIZ.PB2(this);
        C1EOY c1eoy = C1EOY.LIZ;
        C1EOY.LJIJ = new WeakReference<>(this);
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getAdaptBannerExpandDowngrade() && !C500260Jjc.LJIIZILJ(this.dataChannel)) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.BANNER_EXPAND_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.0egk
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    boolean z;
                    NewTopRightBannerWidget newTopRightBannerWidget = this.LIZ;
                    if (((Number) c0is4.LIZ).intValue() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    newTopRightBannerWidget.LLJL = z;
                }
            });
        }
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            C775900Uc8.LJFF(EnumC781860Ulk.BANNER_EXPAND_BLOCK, new AwS631S0100000_17(this, 4));
        }
        if (LiveBannerRequestOptSetting.INSTANCE.enable() && bannerInfo != null) {
            C486790J7d.LJFF(20, 100L, this, new AwS408S0200000_7(this, bannerInfo, 5));
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AbstractC1098270egb abstractC1098270egb;
        AbstractC1098270egb abstractC1098270egb2;
        if (iMessage != null && (abstractC1098270egb = this.LLIZLLLIL) != null && abstractC1098270egb.LJIJI(iMessage) && (abstractC1098270egb2 = this.LLIZLLLIL) != null) {
            abstractC1098270egb2.LIZIZ(iMessage);
        }
    }

    @Override // X.InterfaceC1098410egp
    public final void y0(String str) {
        C1098010egB c1098010egBLIZIZ = C1097990eg9.LIZIZ();
        c1098010egBLIZIZ.LJIIIZ = System.currentTimeMillis();
        if (str != null) {
            c1098010egBLIZIZ.LIZLLL = str;
        }
    }

    public final C474500IjA E1(BannerInRoom bannerInRoom, String str) {
        Object obj;
        Object objLIZ;
        Object obj2;
        LiveMode streamType;
        C474500IjA c474500IjALIZ = C1097970eg7.LIZ(bannerInRoom, str, 1);
        c474500IjALIZ.LJJII(1, "banner_position");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZLL ? 1 : 0), "is_anchor");
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            obj = "anchor";
        } else if (C01C5.LIZ(this.dataChannel)) {
            obj = "admin";
        } else {
            obj = "viewer";
        }
        c474500IjALIZ.LJJII(obj, "user_type");
        Room room = this.LLILZIL;
        if (room != null && (streamType = room.getStreamType()) != null) {
            objLIZ = C354201Zc.LIZ(streamType);
        } else {
            objLIZ = null;
        }
        c474500IjALIZ.LJJII(objLIZ, "live_type");
        if (this.LLILZLL) {
            obj2 = "live_take_detail";
        } else {
            obj2 = "live_detail";
        }
        c474500IjALIZ.LJJII(obj2, "event_page");
        c474500IjALIZ.LJJII(1, "is_native_placeholder");
        c474500IjALIZ.LJJII(G1(bannerInRoom), "next_page_url");
        c474500IjALIZ.LJJII(1, "is_first_rotation");
        return c474500IjALIZ;
    }

    public final void L1(String str, List<? extends BannerInRoom> list) {
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1097990eg9.LIZIZ().LJIIIIZZ = System.currentTimeMillis();
        Map<String, String> mapD1 = D1(list);
        C1098010egB c1098010egBLIZIZ = C1097990eg9.LIZIZ();
        long jLIZ = C1097990eg9.LIZ(c1098010egBLIZIZ.LJII, c1098010egBLIZIZ.LJIIIIZZ);
        HashMap map = new HashMap(c1098010egBLIZIZ.LIZIZ());
        map.put("duration", Long.valueOf(jLIZ));
        if (str == null) {
            str = "unknown";
        }
        map.put("error_message", str);
        for (Map.Entry entry : ((LinkedHashMap) mapD1).entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        C1097990eg9.LIZJ(c1097990eg9, "container_create", 1, map);
    }

    public final void N1(int i, List<? extends BannerInRoom> list) {
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1098010egB c1098010egBLIZIZ = C1097990eg9.LIZIZ();
        c1098010egBLIZIZ.LJIIL = i;
        c1098010egBLIZIZ.LJIIIIZZ = System.currentTimeMillis();
        c1097990eg9.LIZLLL(D1(list));
    }

    @Override // X.InterfaceC1098410egp
    public final void m0(int i, BannerInRoom bannerInRoom) {
        String str;
        C474500IjA c474500IjALIZ = C1097970eg7.LIZ(bannerInRoom, "banner_slide", i);
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZLL ? 1 : 0), "is_anchor");
        c474500IjALIZ.LJJII(Integer.valueOf(i + 1), "banner_position");
        if (this.LLILZLL) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        c474500IjALIZ.LJJII(str, "event_page");
        c474500IjALIZ.LIZ();
    }

    public static void I1(int i, long j, boolean z) {
        int i2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_banner_pitaya_result");
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "success");
        if (z) {
            if (i > 0) {
                c474500IjALIZ.LJJII(Integer.valueOf(i), "pitaya_result");
            }
            if (j > 0) {
                c474500IjALIZ.LJJII(Long.valueOf(j), "delay_duration");
            }
        }
        c474500IjALIZ.LIZ();
    }

    public final void S1(int i, C1098290egd c1098290egd, InterfaceC1631630sYr<? super C1098290egd, ? super Integer, ? super String, ? super Boolean, Unit> interfaceC1631630sYr) {
        int bannerAudienceDelay;
        boolean z;
        NotifyAvoidRule notifyAvoidRuleLJIILIIL;
        if (this.LLJL) {
            if (interfaceC1631630sYr != null) {
                interfaceC1631630sYr.invoke(c1098290egd, null, "ptf downgrade", Boolean.FALSE);
                return;
            }
            return;
        }
        if (!LiveMainFrameworkExpandSetting.INSTANCE.enable()) {
            if (interfaceC1631630sYr != null) {
                interfaceC1631630sYr.invoke(c1098290egd, null, "not in main framework experiment group", Boolean.FALSE);
                return;
            }
            return;
        }
        if (this.LLILZLL) {
            bannerAudienceDelay = LiveEffectNotifyDelaySetting.INSTANCE.getBannerAnchorDelay();
        } else {
            bannerAudienceDelay = LiveEffectNotifyDelaySetting.INSTANCE.getBannerAudienceDelay();
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = this.dataChannel;
        int i2 = c1098290egd.LIZIZ;
        int i3 = c1098290egd.LIZJ;
        int i4 = c1098290egd.LIZLLL;
        c1102070emj.getClass();
        C1102250en1 c1102250en1 = C1102250en1.LIZ;
        c1102250en1.getClass();
        if (dataChannel != null && (notifyAvoidRuleLJIILIIL = C1102250en1.LJIILIIL(dataChannel, i2, i3, i4)) != null) {
            z = notifyAvoidRuleLJIILIIL.timely;
        } else {
            z = false;
        }
        long j = bannerAudienceDelay;
        if (System.currentTimeMillis() - this.LLJJJJJIL < j) {
            if (!z) {
                C08D5.LIZIZ(this.LLJJJJ, new ARunnableS11S0301000_17(this, i, c1098290egd, interfaceC1631630sYr, 0), c1098290egd.LIZ, j - (System.currentTimeMillis() - this.LLJJJJJIL));
                return;
            }
            if (interfaceC1631630sYr != null) {
                interfaceC1631630sYr.invoke(c1098290egd, null, "performance protection", Boolean.valueOf(z));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("banner can expand after ");
            sbLIZ.append(bannerAudienceDelay);
            sbLIZ.append(" ms");
            C20441214yg.LJIIIZ("effect_notify", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        c1102250en1.getClass();
        if (!LiveEffectNotifyAvoidControlSetting.enable()) {
            AbstractC1098270egb abstractC1098270egb = this.LLIZLLLIL;
            if (abstractC1098270egb != null) {
                abstractC1098270egb.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(106.0f))), Math.min(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(72.0f)))), c1098290egd);
                return;
            }
            return;
        }
        if (!C1102070emj.LJI(this.dataChannel, c1098290egd.LIZIZ, c1098290egd.LIZJ, c1098290egd.LIZLLL)) {
            if (interfaceC1631630sYr != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("rule not found for component(");
                sbLIZ2.append(c1098290egd.LIZIZ);
                sbLIZ2.append(")/biz(");
                sbLIZ2.append(c1098290egd.LIZJ);
                sbLIZ2.append(")/scene(");
                sbLIZ2.append(c1098290egd.LIZLLL);
                sbLIZ2.append(')');
                interfaceC1631630sYr.invoke(c1098290egd, null, C2188811AlT.LIZIZ(sbLIZ2), Boolean.valueOf(z));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("invalid biz(");
            sbLIZ3.append(c1098290egd.LIZJ);
            sbLIZ3.append(") or scene(");
            sbLIZ3.append(c1098290egd.LIZLLL);
            sbLIZ3.append("), you must pass a valid biz and scene for component ");
            sbLIZ3.append(c1098290egd.LIZIZ);
            C20441214yg.LJ("effect_notify", C2188811AlT.LIZIZ(sbLIZ3));
            if (this.LLJJLIIIJLLLLLLLZ) {
                if (!LiveEffectNotifyCheckParamsSetting.INSTANCE.enable()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("invalid biz(");
                    sbLIZ4.append(c1098290egd.LIZJ);
                    sbLIZ4.append(") or scene(");
                    sbLIZ4.append(c1098290egd.LIZLLL);
                    sbLIZ4.append("), you must pass a valid biz and scene for component ");
                    sbLIZ4.append(c1098290egd.LIZIZ);
                    C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("invalid biz(");
                sbLIZ5.append(c1098290egd.LIZJ);
                sbLIZ5.append(") or scene(");
                sbLIZ5.append(c1098290egd.LIZLLL);
                sbLIZ5.append("), you must pass a valid biz and scene for component ");
                sbLIZ5.append(c1098290egd.LIZIZ);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
            }
            return;
        }
        if (z && C1102070emj.LJFF(this.dataChannel, c1098290egd.LIZIZ, c1098290egd.LIZJ, c1098290egd.LIZLLL)) {
            if (interfaceC1631630sYr != null) {
                interfaceC1631630sYr.invoke(c1098290egd, null, "conflict", Boolean.valueOf(z));
            }
        } else {
            C1098330egh c1098330egh = new C1098330egh(c1098290egd, new AwS141S0201000_17(this, i, c1098290egd, 0), new AwS418S0200000_17(this, c1098290egd, 13), new AwS69S0210000_17((InterfaceC1631630sYr) interfaceC1631630sYr, (InterfaceC1631630sYr<? super C1098290egd, ? super Integer, ? super String, ? super Boolean, Unit>) c1098290egd, (C1098290egd) z, true));
            this.LLJJL.put(c1098290egd.LIZ, c1098330egh);
            if (!C1102070emj.LJJ(this.dataChannel, c1098330egh, false, null) && interfaceC1631630sYr != null) {
                interfaceC1631630sYr.invoke(c1098290egd, null, "conflict", Boolean.valueOf(z));
            }
        }
    }

    @Override // X.InterfaceC1098410egp
    public final void LLLILZ(int i, BannerInRoom bannerInRoom, EnumC1098310egf enumC1098310egf, boolean z) {
        Object obj;
        String str;
        String str2;
        String str3;
        LiveMode streamType;
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        HashMap map = new HashMap(C1097990eg9.LIZIZ().LIZIZ());
        if (bannerInRoom != null) {
            map.put("banner_id", Long.valueOf(bannerInRoom.id));
        }
        C501590Jll.LIZLLL(map);
        C1097990eg9.LIZJ(c1097990eg9, "banner_show", 0, map);
        C474500IjA c474500IjALIZ = C1097970eg7.LIZ(bannerInRoom, "banner_show", i);
        c474500IjALIZ.LJJII(Integer.valueOf(i + 1), "banner_position");
        c474500IjALIZ.LJJII(0, "is_native_placeholder");
        String str4 = "live_take_detail";
        if (this.LLILZLL) {
            obj = "live_take_detail";
        } else {
            obj = "live_detail";
        }
        c474500IjALIZ.LJJII(obj, "event_page");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZLL ? 1 : 0), "is_anchor");
        int i2 = C1098280egc.LIZJ[enumC1098310egf.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str = "detail_enter";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "slide";
            }
        } else {
            str = "auto";
        }
        c474500IjALIZ.LJJII(str, "show_type");
        String strLIZ = null;
        if (bannerInRoom != null) {
            str2 = bannerInRoom.schemaUrl;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "next_page_url");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_first_rotation");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
        AbstractC1098270egb abstractC1098270egb = this.LLIZLLLIL;
        if (abstractC1098270egb == null || abstractC1098270egb.LJIIIZ()) {
            Q1();
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_banner_show_frame_check");
        c474500IjALIZ2.LJIIIIZZ();
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            str3 = "anchor";
        } else if (C01C5.LIZ(this.dataChannel)) {
            str3 = "admin";
        } else {
            str3 = "viewer";
        }
        c474500IjALIZ2.LJJII(str3, "user_type");
        Room room = this.LLILZIL;
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        c474500IjALIZ2.LJJII(strLIZ, "live_type");
        if (!this.LLILZLL) {
            str4 = "live_detail";
        }
        c474500IjALIZ2.LJJII(str4, "event_page");
        c474500IjALIZ2.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0295  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1(java.util.List<? extends com.bytedance.android.livesdk.model.BannerInRoom> r25, java.util.List<? extends com.bytedance.android.livesdk.model.BannerInRoom> r26, X.EnumC1098320egg r27, com.bytedance.android.livesdk.model.message.BannerInRoomCollection.BannerInfo r28) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget.z1(java.util.List, java.util.List, X.0egg, com.bytedance.android.livesdk.model.message.BannerInRoomCollection$BannerInfo):void");
    }

    @Override // X.InterfaceC1098410egp
    public final void LJJJJZI(int i, BannerInRoom bannerInRoom, String str, long j, long j2, int i2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_banner_show_end");
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJII(Long.valueOf(bannerInRoom.id), "banner_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i + 1), "banner_position");
        c474500IjALIZ.LJJII(Long.valueOf(j), "start_time");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "end_time");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "last_click_time");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "click_cnt");
        c474500IjALIZ.LJJII(str, "end_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(this.LLILZLL)) ? 1 : 0), "is_anchor");
        c474500IjALIZ.LIZ();
    }
}
