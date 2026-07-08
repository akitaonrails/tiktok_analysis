package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.AbstractC1320710kTN;
import X.C0GSX;
import X.C0IJT;
import X.C0IKI;
import X.C0IUA;
import X.C0IZK;
import X.C0IZP;
import X.C0K04;
import X.C1098990ehl;
import X.C1121670fIL;
import X.C1143680frq;
import X.C1161920gLG;
import X.C11S5;
import X.C12ES;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1324720kZq;
import X.C1325700kbQ;
import X.C1331070kk5;
import X.C1701940uOG;
import X.C19R7;
import X.C1CC2;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C427340GpI;
import X.C439101nJ;
import X.C466640IRq;
import X.C467800IWc;
import X.C467820IWe;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C931400aLS;
import X.InterfaceC1320380kSq;
import X.InterfaceC2262081DgM;
import X.InterfaceC468260IXw;
import Y.ACListenerS142S0100000_7;
import Y.AObjectS350S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS76S0200000_7;
import Y.AUListenerS257S0100000_7;
import Y.AfS176S0100000_7;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveInflowSkylightExptTypeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.Skin;
import com.bytedance.android.livesdkapi.depend.model.live.SkinDrawerEntrance;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public class LiveDrawerEntranceWidget extends RoomRecycleFunctionWidget {
    public C19R7 LLILLJJLI;
    public LiveIconView LLILLL;
    public C1324720kZq LLILZ;
    public View LLILZIL;
    public C1324720kZq LLILZLL;
    public ViewGroup LLIZ;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public C1324720kZq LLJIJIL;
    public C1324720kZq LLJILJIL;
    public C1324720kZq LLJILJILJ;
    public C0GSX LLJILLL;
    public C0GSX LLJJ;
    public C0GSX LLJJI;
    public C427340GpI LLJJIII;
    public View LLJJIJI;
    public ARunnableS107S0100000_7 LLJJIJIIJIL;
    public int LLJJIJIL;
    public String LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public ValueAnimator LLJJJJLIIL;
    public boolean LLJJL;
    public final Handler LLJJLIIIJLLLLLLLZ = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget.1
        /* JADX WARN: Removed duplicated region for block: B:52:0x01a1  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r11) {
            /*
                Method dump skipped, instruction units count: 551
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };
    public boolean LLJL = false;
    public long LLJLIL = 0;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.fzm;
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LL = false;
        ValueAnimator valueAnimator = this.LLJJJJLIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LLJJJJLIIL = null;
        }
        C1324720kZq c1324720kZq = this.LLILZ;
        if (c1324720kZq != null) {
            c1324720kZq.setPadding(0, 0, 0, 0);
        }
        Handler handler = this.LLJJLIIIJLLLLLLLZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C427340GpI c427340GpI = this.LLJJIII;
        if (c427340GpI != null) {
            c427340GpI.LJJJJIZL();
        }
        E1(8);
        C12ES.LJIILL(8, this.LLIZ);
        C12ES.LJIILL(8, this.LLIZLLLIL);
        C12ES.LJIILL(8, this.LLJ);
        C12ES.LJIILL(8, this.LLJI);
        this.LLJJJJJIL = 0;
        this.LLJJJIL = 0;
        this.LLJJJ = "";
        this.LLJJL = false;
    }

    public final void x1() {
        C467820IWe.LJIIJ = 1;
        C427340GpI c427340GpI = this.LLJJIII;
        if (c427340GpI == null || c427340GpI.getText() == null) {
            return;
        }
        String string = this.LLJJIII.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(string.indexOf(0));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Paint paint = new Paint();
        paint.setTextSize(this.LLJJIII.getTextSize());
        if (((int) C497740JfY.LIZIZ(80.0f)) <= paint.measureText(strLIZIZ)) {
            C467820IWe.LJIIJ = 0;
        }
    }

    public final void D1() {
        C12ES.LJIILL(8, this.LLILZLL);
        C12ES.LJIILL(0, this.LLILZIL);
    }

    public final void H1() {
        int iLIZIZ = (int) C497740JfY.LIZIZ(2.0f);
        if (C497740JfY.LJJ()) {
            C439101nJ.LIZLLL(R.drawable.dl6, this.LLILLJJLI);
            this.LLILZIL.setPadding(0, 0, iLIZIZ, 0);
        } else {
            C439101nJ.LIZLLL(R.drawable.dl5, this.LLILLJJLI);
            this.LLILZIL.setPadding(iLIZIZ, 0, 0, 0);
        }
        C12ES.LJIILL(0, this.LLILZ);
        C12ES.LJIILL(8, this.LLIZ);
        C12ES.LJIILL(8, this.LLIZLLLIL);
        C12ES.LJIILL(8, this.LLJ);
        C12ES.LJIILL(8, this.LLJI);
    }

    public final void I1() {
        C427340GpI c427340GpI;
        C12ES.LJIILL(8, this.LLIZ);
        if (LiveDrawerFollowSetting.INSTANCE.isFollowEntrance(C0IUA.LJIILLIIL, C0IUA.LJIIZILJ) && (c427340GpI = this.LLJJIII) != null && this.LLILZIL != null && c427340GpI.getVisibility() == 0) {
            if (TextUtils.isEmpty(this.LLJJJ) || !this.LLJJJ.equals(this.LLJJIII.getText().toString())) {
                Paint paint = new Paint();
                paint.setTextSize(this.LLJJIII.getTextSize());
                String string = this.LLJJIII.getText().toString();
                this.LLJJJ = string;
                this.LLJJJIL = this.LLILZIL.getPaddingStart() + Math.min((int) paint.measureText(string), (int) C497740JfY.LIZIZ(80.0f)) + ((int) C497740JfY.LIZIZ(22.0f));
                C1324720kZq c1324720kZq = this.LLILZ;
                if (c1324720kZq != null && c1324720kZq.getVisibility() != 8) {
                    this.LLJJJIL += (int) C497740JfY.LIZIZ(24.0f);
                }
                View view = this.LLJJIJI;
                if (view != null && view.getVisibility() != 8) {
                    this.LLJJJIL += (int) C497740JfY.LIZIZ(4.0f);
                }
                F1(this.LLJJJIL);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (LiveInfeedSkylightEntranceSetting.matchEntrance(C0IUA.LJIILLIIL, C0IUA.LJIIZILJ)) {
            LiveInflowSkylightExptTypeSetting liveInflowSkylightExptTypeSetting = LiveInflowSkylightExptTypeSetting.INSTANCE;
            if (liveInflowSkylightExptTypeSetting.getValue() == 2 || liveInflowSkylightExptTypeSetting.getValue() == 4) {
                return;
            }
        }
        super.show();
    }

    public final Room y1() {
        return (Room) this.dataChannel.gg0(RoomChannel.class);
    }

    public final boolean z1() {
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        return iRoomFunctionService != null && iRoomFunctionService.Tt1(this.dataChannel);
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [REQUEST, X.0kbR] */
    public final void J1() {
        SkinDrawerEntrance skinDrawerEntrance;
        int i;
        if (!C0IKI.LIZIZ()) {
            C467800IWc c467800IWc = C467800IWc.LJIJ;
            if (!Intrinsics.LJFF(c467800IWc.LJIIIZ, "game_drawer_is_game")) {
                Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
                if (room == null) {
                    D1();
                    return;
                }
                Skin skin = room.skin;
                if (skin == null) {
                    D1();
                    return;
                }
                SkinDrawerEntrance skinDrawerEntrance2 = skin.drawerEntrance;
                if (skinDrawerEntrance2 == null) {
                    D1();
                    return;
                }
                if (skinDrawerEntrance2.cover == null) {
                    D1();
                    return;
                }
                if ((skinDrawerEntrance2.style != 1 || (!c467800IWc.LJI() && !c467800IWc.LJFF())) && !Intrinsics.LJFF(c467800IWc.LJIIIZ, "game_drawer_guessing")) {
                    C1121670fIL.LJ(room.skin.drawerEntrance.cover).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 144), new AfS176S0100000_7(this, 145));
                    return;
                }
                Skin skin2 = room.skin;
                if (skin2 == null || (skinDrawerEntrance = skin2.drawerEntrance) == null) {
                    C20441214yg.LJIIIZ("LiveDrawerEntranceWidget", "skin is null when this is an esports Drawer");
                    return;
                }
                ImageModel imageModel = skinDrawerEntrance.cover;
                if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                    C20441214yg.LJIIIZ("LiveDrawerEntranceWidget", "urls is empty when this is an esports Drawer");
                    return;
                }
                if (this.LLILZ == null) {
                    C20441214yg.LJIIIZ("LiveDrawerEntranceWidget", "mDrawerAnimIv is null");
                    return;
                }
                Uri uri = UriProtector.parse((String) ListProtector.get(imageModel.getUrls(), 0));
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = this.LLILZ.getController();
                c1320810kTXLIZJ.LIZLLL = C1325700kbQ.LIZLLL(uri).LIZ();
                AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
                this.LLILZ.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
                String str = c467800IWc.LJIIIZ;
                InterfaceC1320380kSq interfaceC1320380kSq = InterfaceC1320380kSq.LJ;
                str.getClass();
                if (str.equals("game_drawer_drops")) {
                    i = R.drawable.ehz;
                } else if (str.equals("game_drawer_guessing")) {
                    C1331070kk5 hierarchy = this.LLILZ.getHierarchy();
                    interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
                    hierarchy.LJIIZILJ(interfaceC1320380kSq);
                    i = R.drawable.ei0;
                } else {
                    i = R.drawable.ee9;
                }
                this.LLILZ.getHierarchy().LJJI(i, interfaceC1320380kSq);
                this.LLILZ.setController(abstractC1320710kTNLIZ);
                return;
            }
        }
        D1();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L1() {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget.L1():void");
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.InterfaceC1078250eAJ
    public final void LJLIL() {
        if (z1()) {
            C0IZP.LIZLLL("explore", y1(), Long.valueOf(this.LLJLIL));
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.InterfaceC1078250eAJ
    public final void X0() {
        if (z1()) {
            this.LLJLIL = System.currentTimeMillis();
        }
    }

    public final void E1(int i) {
        if (this.LLILZIL == null) {
            return;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(i);
        if (C497740JfY.LJJ()) {
            this.LLILZIL.setPadding(0, 0, iLIZIZ, 0);
        } else {
            this.LLILZIL.setPadding(iLIZIZ, 0, 0, 0);
        }
    }

    public final void F1(int i) {
        View view;
        if (i >= this.LLJJJIL && (view = this.LLILZIL) != null && view.getLayoutParams() != null) {
            if (this.LLJJJJ <= 0) {
                this.LLJJJJ = (int) C497740JfY.LIZIZ(22.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.LLILZIL.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = this.LLJJJJ;
            C786410Ut5.W5(this.LLILZIL, layoutParams);
        }
    }

    public final void G1(boolean z) {
        Room room;
        Skin skin;
        SkinDrawerEntrance skinDrawerEntrance;
        C427340GpI c427340GpI;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (skin = room.skin) != null && (skinDrawerEntrance = skin.drawerEntrance) != null) {
            long j = skinDrawerEntrance.style;
            if ((2 == j || 3 == j) && !TextUtils.isEmpty(skinDrawerEntrance.title) && (c427340GpI = this.LLJJIII) != null) {
                c427340GpI.setText(room.skin.drawerEntrance.title);
                if (z) {
                    this.LLJJIII.LJJJJI();
                }
            }
            if (!TextUtils.isEmpty(room.skin.drawerEntrance.titleKey)) {
                C467820IWe.LJIIIIZZ = room.skin.drawerEntrance.titleKey;
            }
            if (3 == room.skin.drawerEntrance.style) {
                C12ES.LJIILL(8, this.LLILZ);
                C12ES.LJIILL(0, this.LLJJIJI);
            } else {
                C12ES.LJIILL(0, this.LLILZ);
                C12ES.LJIILL(8, this.LLJJIJI);
            }
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILLL = (LiveIconView) getView().findViewById(R.id.h7z);
        if (C497740JfY.LJJ()) {
            C786410Ut5.Db(this.LLILLL, 90.0f);
        } else {
            C786410Ut5.Db(this.LLILLL, -90.0f);
        }
        this.LLILLJJLI = (C19R7) getView().findViewById(R.id.h7h);
        this.LLILZIL = getView().findViewById(R.id.h7u);
        this.LLILZLL = (C1324720kZq) getView().findViewById(R.id.h7v);
        this.LLJJIII = (C427340GpI) getView().findViewById(R.id.h89);
        this.LLJJIJI = getView().findViewById(R.id.h80);
        this.LLIZ = (ViewGroup) getView().findViewById(R.id.ier);
        this.LLIZLLLIL = (FrameLayout) getView().findViewById(R.id.jhl);
        this.LLJ = (FrameLayout) getView().findViewById(R.id.jhm);
        this.LLJI = (FrameLayout) getView().findViewById(R.id.jhn);
        this.LLJIJIL = (C1324720kZq) getView().findViewById(R.id.ldg);
        this.LLJILJIL = (C1324720kZq) getView().findViewById(R.id.ldi);
        this.LLJILJILJ = (C1324720kZq) getView().findViewById(R.id.ldk);
        this.LLJILLL = (C0GSX) getView().findViewById(R.id.ldh);
        this.LLJJ = (C0GSX) getView().findViewById(R.id.ldj);
        this.LLJJI = (C0GSX) getView().findViewById(R.id.ldl);
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Handler handler;
        Number numberValueOf;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        FollowInfo followInfo;
        super.onLoad(objArr);
        View view = getView();
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
        if (LiveInfeedSkylightEntranceSetting.matchEntrance(C0IUA.LJIILLIIL, C0IUA.LJIIZILJ)) {
            LiveInflowSkylightExptTypeSetting liveInflowSkylightExptTypeSetting = LiveInflowSkylightExptTypeSetting.INSTANCE;
            if (liveInflowSkylightExptTypeSetting.getValue() == 2 || liveInflowSkylightExptTypeSetting.getValue() == 4) {
                hide();
                return;
            }
        }
        show();
        if (this.LLJJL) {
            return;
        }
        this.LLJJL = true;
        if (getView() == null) {
            C20441214yg.LJFF("LiveDrawerEntranceWidget", "getView == null", new Throwable());
            hide();
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0IZK c0izk = (C0IZK) dataChannelGlobal.gg0(C931400aLS.class);
        if (c0izk == null) {
            dataChannelGlobal.JQ2(C931400aLS.class, new C0IZK(0));
        } else {
            c0izk.LIZ = 0;
        }
        C1324720kZq c1324720kZq = (C1324720kZq) getView().findViewById(R.id.g_p);
        this.LLILZ = c1324720kZq;
        C786410Ut5.LLJJIII(c1324720kZq, 0);
        C786410Ut5.LJLLLLLL(8, this.LLJJIJI);
        this.LLILZ.setImageResource(R.drawable.ee9);
        if (C497740JfY.LJJ()) {
            C786410Ut5.Db(this.LLILLL, 90.0f);
            C500260Jjc.LLFFF(this.LLILLL);
        } else {
            C786410Ut5.Db(this.LLILLL, -90.0f);
            C500260Jjc.LLFFF(this.LLILLL);
        }
        L1();
        J1();
        I1();
        C1098990ehl.LIZ(new ACListenerS142S0100000_7(this, 175), getView());
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_audience_room_with_drawer", 0.0d)) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LIZLLL(0, "error_code", jSONObject);
            C0K04.LJFF("error_msg", "load drawer widget", jSONObject);
            C0K04.LJFF("enter_method", C466640IRq.LIZJ().LIZIZ(), jSONObject);
            C1CC2.LJIILL(0, 0, "ttlive_audience_room_with_drawer", jSONObject);
        }
        if (!z1() && !this.LLJL) {
            this.LLJL = true;
            C0IZP.LIZJ(y1(), "explore");
        }
        if (this.dataChannel != null && (handler = this.LLJJLIIIJLLLLLLLZ) != null) {
            Room room = null;
            handler.removeCallbacksAndMessages(null);
            Handler handler2 = this.LLJJLIIIJLLLLLLLZ;
            DataChannel dataChannel = this.dataChannel;
            C0IKI.LIZIZ = dataChannel;
            if (dataChannel != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
            }
            C0IKI.LIZJ = room;
            LiveDrawerFollowSetting liveDrawerFollowSetting = LiveDrawerFollowSetting.INSTANCE;
            if (liveDrawerFollowSetting.isFollowEntranceExp() && !C0IKI.LIZ()) {
                Room room2 = C0IKI.LIZJ;
                if (room2 != null && (interfaceC2262081DgMAuthor = room2.author()) != null && (followInfo = interfaceC2262081DgMAuthor.getFollowInfo()) != null) {
                    numberValueOf = Long.valueOf(followInfo.getFollowStatus());
                } else {
                    numberValueOf = 0;
                }
                if (liveDrawerFollowSetting.isFollowEntrance(C0IUA.LJIILLIIL, C0IUA.LJIIZILJ) && liveDrawerFollowSetting.hasFollow(numberValueOf.intValue()) && liveDrawerFollowSetting.getShowTime() > 0 && !LiveInfeedSkylightEntranceSetting.matchEntrance(C0IUA.LJIILLIIL, C0IUA.LJIIZILJ)) {
                    ARunnableS76S0200000_7 aRunnableS76S0200000_7 = C0IKI.LIZ;
                    if (aRunnableS76S0200000_7 != null && handler2 != null) {
                        handler2.removeCallbacks(aRunnableS76S0200000_7);
                    }
                    ARunnableS76S0200000_7 aRunnableS76S0200000_72 = new ARunnableS76S0200000_7(dataChannel, handler2, 88);
                    C0IKI.LIZ = aRunnableS76S0200000_72;
                    if (handler2 != null) {
                        C786410Ut5.LJLIIL(3000L, handler2, aRunnableS76S0200000_72);
                    }
                }
            }
            this.dataChannel.EQ2(this, RoomChannel.class, new AObjectS350S0100000_7(this, 75));
        }
        C467820IWe.LJIIL = C0IUA.LJJIIJZLJL;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_explore_entrance_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJJII(C467800IWc.LJIJ.LIZIZ(), "entrance_type");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
            return;
        }
        c474500IjALIZIZ.LJJIJLIJ();
        c474500IjALIZIZ.LJIIIIZZ();
        w.LIZ.getClass();
        c474500IjALIZIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZIZ.LJJIJL();
    }

    public final void C1(int i, int i2) {
        ValueAnimator valueAnimator = this.LLJJJJLIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        this.LLJJJJLIIL = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(100L);
        this.LLJJJJLIIL.start();
        this.LLJJJJLIIL.addUpdateListener(new AUListenerS257S0100000_7(this, 12));
    }

    public final void A1(ImageModel imageModel, C1324720kZq c1324720kZq, C0GSX c0gsx, FrameLayout frameLayout) {
        if (this.LLJJIJIL <= 0) {
            this.LLJJIJIL = C20736316Cj.LIZIZ(R.attr.a1a, getContext());
        }
        C1143680frq.LJJI(c1324720kZq, imageModel, true);
        int i = this.LLJJIJIL;
        c0gsx.LIZ(i, i);
        C12ES.LJIILL(0, frameLayout);
    }

    public final void B1(FeedItem feedItem, C1324720kZq c1324720kZq, C0GSX c0gsx, FrameLayout frameLayout) {
        InterfaceC468260IXw interfaceC468260IXw;
        Room room;
        if (feedItem != null && (interfaceC468260IXw = feedItem.item) != null && (interfaceC468260IXw instanceof Room) && (room = (Room) interfaceC468260IXw) != null && room.getOwner() != null && room.getOwner().getAvatarThumb() != null && c1324720kZq != null && c0gsx != null && frameLayout != null) {
            A1(room.getOwner().getAvatarThumb(), c1324720kZq, c0gsx, frameLayout);
        }
    }
}
