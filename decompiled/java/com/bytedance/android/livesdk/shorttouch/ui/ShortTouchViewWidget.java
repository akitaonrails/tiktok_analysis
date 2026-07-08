package com.bytedance.android.livesdk.shorttouch.ui;

import X.AbstractC1101760emE;
import X.C011Z;
import X.C01C5;
import X.C09RD;
import X.C1078030e9x;
import X.C1099020eho;
import X.C1101600ely;
import X.C1101610elz;
import X.C1101640em2;
import X.C1101730emB;
import X.C1101750emD;
import X.C1101780emG;
import X.C1101790emH;
import X.C1101820emK;
import X.C1101830emL;
import X.C1101850emN;
import X.C1101880emQ;
import X.C1101900emS;
import X.C1102000emc;
import X.C1102070emj;
import X.C1107810evz;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C19ME;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C262100zr;
import X.C460180I2u;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751980Tee;
import X.C786410Ut5;
import X.InterfaceC1097760efm;
import X.InterfaceC1101720emA;
import X.InterfaceC1101890emR;
import X.InterfaceC1102350enB;
import X.InterfaceC1107590evd;
import X.InterfaceC1107760evu;
import X.InterfaceC1141530foN;
import Y.ALAdapterS12S0200000_17;
import Y.ARunnableS117S0100000_17;
import Y.AUListenerS253S0100000_2;
import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.livesdk.dataChannel.MiddleTouchExpandedAreaChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShortTouchContainerLoaded;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchWidgetRecycleSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAllInOneReportSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchBigCardOptSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchNewFrameworkSetting;
import com.bytedance.android.livesdk.shorttouch.ShortTouchMessageEvent;
import com.bytedance.android.livesdk.shorttouch.ui.ShortTouchViewWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS101S1200000_17;
import kotlin.jvm.internal.AwS131S1100000_17;
import kotlin.jvm.internal.AwS133S1200000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ShortTouchViewWidget extends LiveRecyclableWidget implements InterfaceC1101890emR, InterfaceC1141530foN {
    public boolean LLILLJJLI;
    public ViewGroup LLILZ;
    public HorizontalScrollView LLILZIL;
    public List<C1101640em2> LLILZLL;
    public List<AbstractC1101760emE> LLIZ;
    public boolean LLIZLLLIL;
    public Room LLJI;
    public boolean LLJIJIL;
    public final Map<String, C1101850emN> LL = new LinkedHashMap();
    public final C1101830emL LLILLL = new InterfaceC1102350enB() { // from class: X.0emL
        @Override // X.InterfaceC1102350enB
        public final void LIZ() {
            ShortTouchViewWidget shortTouchViewWidget = this.LIZ;
            shortTouchViewWidget.LLILLJJLI = false;
            List<AbstractC1101760emE> list = shortTouchViewWidget.LLIZ;
            if (list != null) {
                Iterator<AbstractC1101760emE> it2 = list.iterator();
                while (it2.hasNext()) {
                    View viewLJI = it2.next().LJI();
                    if (viewLJI != null) {
                        C786410Ut5.T4(viewLJI, 1.0f);
                    }
                }
            }
        }

        @Override // X.InterfaceC1102350enB
        public final void LIZIZ() {
            ShortTouchViewWidget shortTouchViewWidget = this.LIZ;
            shortTouchViewWidget.LLILLJJLI = true;
            HorizontalScrollView horizontalScrollView = shortTouchViewWidget.LLILZIL;
            if (horizontalScrollView != null) {
                HandlerHook.viewPost(horizontalScrollView, new ARunnableS117S0100000_17(shortTouchViewWidget, 116));
            }
        }
    };
    public final ArrayList<Animator> LLJ = new ArrayList<>();
    public final Map<String, Boolean> LLJILJIL = new LinkedHashMap();
    public final C1101880emQ LLJILJILJ = new InterfaceC1107760evu() { // from class: X.0emQ
        @Override // X.InterfaceC1107760evu
        public final void LIZ() {
        }

        @Override // X.InterfaceC1107760evu
        public final void LIZJ() {
        }

        @Override // X.InterfaceC1107760evu
        public final void LIZIZ(C1107810evz c1107810evz, boolean z, C1107780evw c1107780evw) {
            if (this.LIZ.LLJIJIL) {
                return;
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIIZILJ)) {
                this.LIZ.LLJILJIL.put(C1101900emS.LIZIZ, Boolean.valueOf(z));
            }
            if (Intrinsics.LJFF(c1107810evz, C1107810evz.LJIILLIIL)) {
                this.LIZ.LLJILJIL.put(C1101900emS.LIZJ, Boolean.valueOf(z));
            }
        }
    };

    public void A1() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract int y1(String str);

    public final void B1() {
        Rect rect;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (rect = (Rect) dataChannel.gg0(MiddleTouchExpandedAreaChannel.class)) == null) {
            return;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(40.0f);
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            for (View view : new C09RD(viewGroup)) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams != null ? layoutParams.width : 0) > iLIZIZ) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    C786410Ut5.T4(view, Rect.intersects(new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()), rect) ? 0.2f : 1.0f);
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return LiveShortTouchWidgetRecycleSetting.INSTANCE.getViewWidgetRecycle();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ArrayList<AbstractC1101760emE> arrayList;
        String strSr;
        C1101820emK c1101820emK;
        if (!LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            C1548820qPI.LJIIIIZZ("shorttouch_lynx_container_client_event", this);
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = this.dataChannel;
        C1101830emL c1101830emL = this.LLILLL;
        c1102070emj.getClass();
        C1102070emj.LJJIIZ(dataChannel, 1, 2, c1101830emL);
        this.LLILLJJLI = false;
        if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
            ((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).Eq(this.dataChannel, this.LLJILJILJ);
            List<C1101640em2> list = this.LLILZLL;
            if (list != null) {
                for (C1101640em2 c1101640em2 : (ArrayList) list) {
                    C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(c1101640em2.LIZ.Sr());
                    if (c1101820emKLIZIZ != null) {
                        c1101820emKLIZIZ.LJIIJJI = System.currentTimeMillis();
                        c1101820emKLIZIZ.LJIILLIIL = 1;
                        List<C1101640em2> list2 = this.LLILZLL;
                        c1101820emKLIZIZ.LJIILJJIL = list2 != null ? ((ArrayList) list2).size() : 0;
                        C1101750emD.LIZJ(c1101820emKLIZIZ, this.dataChannel, this.LLJI, this.LLJILJIL);
                    }
                    C1101750emD.LJI(c1101640em2);
                }
            }
            List<AbstractC1101760emE> list3 = this.LLIZ;
            if (list3 != null) {
                for (AbstractC1101760emE abstractC1101760emE : (ArrayList) list3) {
                    C1101820emK c1101820emKLIZIZ2 = C1101750emD.LIZIZ(abstractC1101760emE.LJII());
                    if (c1101820emKLIZIZ2 != null) {
                        c1101820emKLIZIZ2.LJIIJJI = System.currentTimeMillis();
                        c1101820emKLIZIZ2.LJIILLIIL = 1;
                        List<AbstractC1101760emE> list4 = this.LLIZ;
                        c1101820emKLIZIZ2.LJIILJJIL = list4 != null ? ((ArrayList) list4).size() : 0;
                        C1101750emD.LIZJ(c1101820emKLIZIZ2, this.dataChannel, this.LLJI, this.LLJILJIL);
                    }
                    C1101750emD.LJFF(abstractC1101760emE);
                }
            }
            DataChannel dataChannel2 = this.dataChannel;
            Room room = this.LLJI;
            Map<String, Boolean> map = this.LLJILJIL;
            List<C1101640em2> list5 = C1102000emc.LIZ.LIZIZ;
            if (list5 != null) {
                for (C1101640em2 c1101640em22 : (ArrayList) list5) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) C1101900emS.LIZ;
                    C1101820emK c1101820emK2 = (C1101820emK) linkedHashMap.get(c1101640em22.LIZ.Sr());
                    if (c1101820emK2 != null) {
                        c1101820emK2.LJIILLIIL = -2;
                        C1101750emD.LIZJ(c1101820emK2, dataChannel2, room, map);
                    } else {
                        InterfaceC1101720emA interfaceC1101720emA = c1101640em22.LIZIZ;
                        if (interfaceC1101720emA != null && (strSr = interfaceC1101720emA.Sr()) != null && (c1101820emK = (C1101820emK) linkedHashMap.get(strSr)) != null) {
                            c1101820emK.LJIILLIIL = -2;
                            C1101750emD.LIZJ(c1101820emK, dataChannel2, room, map);
                        }
                    }
                }
            }
            C1101730emB c1101730emB = C1102000emc.LIZ.LJIIJ.LLILZLL;
            if (c1101730emB != null && (arrayList = c1101730emB.LIZIZ) != null) {
                Iterator<AbstractC1101760emE> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C1101820emK c1101820emK3 = (C1101820emK) ((LinkedHashMap) C1101900emS.LIZ).get(it2.next().LJII());
                    if (c1101820emK3 != null) {
                        c1101820emK3.LJIILLIIL = -2;
                        C1101750emD.LIZJ(c1101820emK3, dataChannel2, room, map);
                    }
                }
            }
            ((LinkedHashMap) this.LLJILJIL).clear();
        }
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = false;
        this.LLJI = null;
        Iterator<Animator> it3 = this.LLJ.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
        ((LinkedHashMap) this.LL).clear();
        C1102000emc.LIZ.LJ = false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStart() {
        super.onStart();
        this.LLJIJIL = false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
        this.LLJIJIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    @Override // X.InterfaceC1101890emR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIL(X.AbstractC1101760emE r10) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.shorttouch.ui.ShortTouchViewWidget.LLIL(X.0emE):void");
    }

    @Override // X.InterfaceC1101890emR
    public final void LLJJIII(AbstractC1101760emE abstractC1101760emE) {
        int childCount;
        String strLIZJ = abstractC1101760emE.LIZJ();
        String strLJIILL = abstractC1101760emE.LJIILL();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("container_id", strLIZJ);
        linkedHashMap.put("card_name", strLJIILL);
        C1099020eho.LIZIZ("ttlive_short_touch_remove_item", linkedHashMap);
        if (z1(abstractC1101760emE.LJI(), abstractC1101760emE.LIZJ())) {
            C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(abstractC1101760emE.LJII());
            if (c1101820emKLIZIZ != null) {
                c1101820emKLIZIZ.LJIIJJI = System.currentTimeMillis();
                ViewGroup viewGroup = this.LLILZ;
                if (viewGroup != null) {
                    childCount = viewGroup.getChildCount();
                } else {
                    childCount = 0;
                }
                c1101820emKLIZIZ.LJIILJJIL = childCount;
                C1101750emD.LIZJ(c1101820emKLIZIZ, this.dataChannel, this.LLJI, this.LLJILJIL);
            }
            C1101750emD.LJFF(abstractC1101760emE);
            ViewGroup viewGroup2 = this.LLILZ;
            if (viewGroup2 != null) {
                C786410Ut5.LJJJLZIJ(abstractC1101760emE.LJI(), viewGroup2);
            }
            List<AbstractC1101760emE> list = this.LLIZ;
            if (list != null) {
                ((ArrayList) list).remove(abstractC1101760emE);
            }
            A1();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        long j;
        int i;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "shorttouch_lynx_container_client_event") || LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework() || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        String string = interfaceC1107590evd.getString("container_id");
        if (string.length() > 0) {
            Object obj = null;
            if (1 != 0) {
                String string2 = interfaceC1107590evd.getString("action");
                if (string2.length() > 0) {
                    String string3 = interfaceC1107590evd.getString(FollowStatusChangeMethod.PARAM_UID);
                    int i2 = interfaceC1107590evd.getInt(Scene.SCENE_SERVICE);
                    int i3 = interfaceC1107590evd.getInt("biz");
                    int i4 = interfaceC1107590evd.getInt("target_width");
                    long j2 = interfaceC1107590evd.getLong("animate_duration");
                    try {
                        j = interfaceC1107590evd.getLong("show_duration");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        j = 0;
                    }
                    C20441214yg.LJ("matao-short", "onReceiveJsEvent(controlGroup): action=" + string2 + ", id=" + string3 + ", containerId=" + string + ", targetWidth=" + i4 + ", biz=" + i3 + ", scene=" + i2);
                    List<C1101640em2> list = this.LLILZLL;
                    if (list != null) {
                        Iterator it2 = ((ArrayList) list).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (Intrinsics.LJFF(((C1101640em2) next).LIZ.dT1(), string)) {
                                obj = next;
                                break;
                            }
                        }
                        C1101640em2 c1101640em2 = (C1101640em2) obj;
                        if (c1101640em2 != null) {
                            switch (string2.hashCode()) {
                                case -1939100487:
                                    if (!string2.equals("expanded")) {
                                        return;
                                    }
                                    C20441214yg.LJ("matao-short", "onReceiveJsEvent(controlGroup): expanded, id=" + string3 + ", targetWidth=" + i4);
                                    LJLILLLLZI(c1101640em2.LIZ.LLLILZJ(), new C1101780emG(string3, CastIntegerProtector.parseInt(interfaceC1107590evd.getString("component")), i3, i2, string, i4, j2));
                                    return;
                                case -1289167206:
                                    if (!string2.equals("expand")) {
                                        return;
                                    }
                                    break;
                                case -903068151:
                                    if (!string2.equals("shrink")) {
                                        return;
                                    }
                                    try {
                                        i = interfaceC1107590evd.getInt("consume_method");
                                        break;
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        i = 1;
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("onReceiveJsEvent(controlGroup): shrink, id=");
                                    sbLIZ.append(string3);
                                    sbLIZ.append(", animateDuration=");
                                    sbLIZ.append(j2);
                                    C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ));
                                    LJLLLLLL(i, j2, c1101640em2.LIZ.LLLILZJ(), string3);
                                    return;
                                case 260850286:
                                    if (!string2.equals("force_expand")) {
                                        return;
                                    }
                                    break;
                                default:
                                    return;
                            }
                            C20441214yg.LJ("matao-short", "onReceiveJsEvent(controlGroup): requestExpand, id=" + string3 + ", forceExpand=" + Intrinsics.LJFF(string2, "force_expand"));
                            LJLJJI(new C1101780emG(string3, CastIntegerProtector.parseInt(interfaceC1107590evd.getString("component")), i3, i2, j, string, i4, j2, Intrinsics.LJFF(string2, "force_expand")), new AwS131S1100000_17(c1101640em2, string, 2), new AwS131S1100000_17(c1101640em2, string, 3));
                            return;
                        }
                    }
                    C20441214yg.LJ("matao-short", "onReceiveJsEvent(controlGroup): item not found for containerId=".concat(string));
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        float fLIZIZ;
        IHostConfig iHostConfig;
        this.LLILZ = (ViewGroup) findViewById(R.id.eqx);
        this.LLILZIL = (HorizontalScrollView) findViewById(R.id.u3e);
        float f = 1;
        if (C011Z.LIZ.LJFF() != null && (iHostConfig = (IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)) != null) {
            fLIZIZ = iHostConfig.i32().LIZIZ();
        } else {
            fLIZIZ = 1.0f;
        }
        float f2 = f / fLIZIZ;
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            C786410Ut5.Lb(f2, viewGroup);
        }
        ViewGroup viewGroup2 = this.LLILZ;
        if (viewGroup2 != null) {
            C786410Ut5.mc(f2, viewGroup2);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Long lValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        Room roomLJJLIIIIJ = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("room_id", lValueOf);
        linkedHashMap.put("user_id", Long.valueOf(UserService.getInstance().user().getCurrentUser().getId()));
        linkedHashMap.put("is_anchor", this.dataChannel.gg0(UserIsAnchorChannel.class));
        Map<String, Object> map = C1099020eho.LIZ;
        ((LinkedHashMap) map).clear();
        map.putAll(linkedHashMap);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        }
        this.LLJI = roomLJJLIIIIJ;
        this.LLILZLL = new ArrayList();
        this.LLIZ = new ArrayList();
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(this.LLILZ, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f)));
            layoutTransition.disableTransitionType(3);
            viewGroup.setLayoutTransition(layoutTransition);
        }
        this.dataChannel.CQ2(ShortTouchMessageEvent.class, this, new AwS596S0100000_17(this, 243));
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof C1078030e9x) {
                    C1099020eho.LIZIZ = ((C1078030e9x) obj).LIZ;
                }
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_short_touch_view_widget_load_finished")) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            long j = C1099020eho.LIZIZ;
            long j2 = -1;
            if (j != -1) {
                j2 = jElapsedRealtime - j;
            }
            linkedHashMap2.put("duration", Long.valueOf(j2));
            C1099020eho.LIZIZ("ttlive_short_touch_view_widget_load_finished", linkedHashMap2);
        }
        C1101610elz c1101610elz = C1102000emc.LIZ;
        C1101600ely c1101600ely = c1101610elz.LJIIJ;
        c1101600ely.getClass();
        LiveShortTouchNewFrameworkSetting liveShortTouchNewFrameworkSetting = LiveShortTouchNewFrameworkSetting.INSTANCE;
        if (liveShortTouchNewFrameworkSetting.enableNewFramework()) {
            c1101600ely.LLIZLLLIL = this;
            c1101600ely.LLILZLL = new C1101730emB(this);
            c1101600ely.LJFF();
        }
        if (LiveShortTouchBigCardOptSetting.INSTANCE.enable() || liveShortTouchNewFrameworkSetting.enableNewFramework()) {
            c1101610elz.LJIIIZ = this;
        }
        c1101610elz.LJ = true;
        c1101610elz.LIZLLL();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(ShortTouchContainerLoaded.class, Boolean.TRUE);
        }
        if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
            ((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).sf(this.dataChannel, C1697810uHb.LJIIJJI(C1107810evz.LJIIZILJ, C1107810evz.LJIILLIIL), this.LLJILJILJ, "short_touch", null, false);
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel3 = this.dataChannel;
        C1101830emL c1101830emL = this.LLILLL;
        c1102070emj.getClass();
        C1102070emj.LIZ(dataChannel3, 1, 2, c1101830emL);
        HorizontalScrollView horizontalScrollView = this.LLILZIL;
        if (horizontalScrollView != null) {
            horizontalScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0emX
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    ShortTouchViewWidget shortTouchViewWidget = this.LIZ;
                    if (shortTouchViewWidget.LLILLJJLI) {
                        shortTouchViewWidget.B1();
                    }
                }
            });
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.BQ2(this, MiddleTouchExpandedAreaChannel.class, new AwS596S0100000_17(this, 242));
        }
        if (!liveShortTouchNewFrameworkSetting.enableNewFramework()) {
            C1548820qPI.LIZLLL("shorttouch_lynx_container_client_event", this);
        }
    }

    @Override // X.InterfaceC1101890emR
    public final int[] r(String str) {
        int childCount;
        int i;
        int width;
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams = null;
        if (this.LLILZ == null) {
            return null;
        }
        int iY1 = y1(str);
        int[] iArr = new int[2];
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup != null) {
            childCount = viewGroup.getChildCount();
        } else {
            childCount = 0;
        }
        if (iY1 != 0 && childCount > 0) {
            int width2 = -1;
            if (iY1 != -1 && iY1 <= childCount) {
                ViewGroup viewGroup2 = this.LLILZ;
                if (viewGroup2 != null) {
                    C460180I2u.LIZ(iY1, viewGroup2).getLocationOnScreen(iArr);
                }
            } else {
                ViewGroup viewGroup3 = this.LLILZ;
                if (viewGroup3 != null) {
                    C460180I2u.LIZ(viewGroup3.getChildCount() - 1, viewGroup3).getLocationOnScreen(iArr);
                    iArr[0] = iArr[0] + C460180I2u.LIZ(viewGroup3.getChildCount() - 1, viewGroup3).getWidth();
                }
                ViewGroup viewGroup4 = this.LLILZ;
                if (viewGroup4 != null) {
                    layoutParams = viewGroup4.getLayoutParams();
                }
                if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                    i = c19me.matchConstraintMaxWidth;
                } else {
                    i = Integer.MAX_VALUE;
                }
                ViewGroup viewGroup5 = this.LLILZ;
                if (viewGroup5 != null) {
                    width2 = viewGroup5.getWidth();
                }
                if (width2 >= i) {
                    ViewGroup viewGroup6 = this.LLILZ;
                    if (viewGroup6 != null) {
                        viewGroup6.getLocationOnScreen(iArr);
                    }
                    int i2 = iArr[0];
                    ViewGroup viewGroup7 = this.LLILZ;
                    if (viewGroup7 != null) {
                        width = viewGroup7.getWidth();
                    } else {
                        width = 0;
                    }
                    iArr[0] = i2 + width;
                }
            }
        } else {
            ViewGroup viewGroup8 = this.LLILZ;
            if (viewGroup8 != null) {
                viewGroup8.getLocationOnScreen(iArr);
            }
        }
        iArr[1] = iArr[1] + ((int) C497740JfY.LIZIZ(28.0f));
        return iArr;
    }

    @Override // X.InterfaceC1101890emR
    public final void LJLILLLLZI(View view, C1101780emG c1101780emG) {
        int iLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Widget.realExpandShortTouch: id=");
        sbLIZ.append(c1101780emG.LIZ);
        sbLIZ.append(", targetWidthDp=");
        sbLIZ.append(c1101780emG.LJI);
        sbLIZ.append(", animateDurationMs=");
        sbLIZ.append(c1101780emG.LJII);
        sbLIZ.append(", containerId=");
        sbLIZ.append(c1101780emG.LJFF);
        C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ));
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            iLIZIZ = layoutParams.width;
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(40.0f);
        }
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(c1101780emG.LJI);
        if (iLIZIZ != iLIZIZ2) {
            String.valueOf(c1101780emG.LIZJ);
            long j = c1101780emG.LJII;
            AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(this, view, 122);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iLIZIZ, iLIZIZ2);
            valueAnimatorOfInt.setDuration(j);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(view, 40));
            valueAnimatorOfInt.addListener(new ALAdapterS12S0200000_17(awS418S0200000_17, view, 33));
            valueAnimatorOfInt.start();
        }
    }

    public final Map<String, String> x1(String str, AbstractC1101760emE abstractC1101760emE) {
        String str2;
        String str3;
        String str4;
        String strLIZIZ;
        Integer numValueOf;
        Map<String, String> mapLJ;
        String strLJIILLIIL;
        LiveMode liveModeLIZJ;
        Pair[] pairArr = new Pair[8];
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            str2 = "anchor";
        } else {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null && C01C5.LIZ(dataChannel2)) {
                str2 = "admin";
            } else {
                str2 = "viewer";
            }
        }
        pairArr[0] = new Pair("user_type", str2);
        DataChannel dataChannel3 = this.dataChannel;
        String str5 = "";
        if (dataChannel3 == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel3)) == null || (str3 = liveModeLIZJ.logStreamingType) == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("live_type", str3);
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null && C500260Jjc.LJIIZILJ(dataChannel4)) {
            str4 = "live_take_detail";
        } else {
            str4 = "live_detail";
        }
        pairArr[2] = new Pair("event_page", str4);
        pairArr[3] = new Pair("name", str);
        if (abstractC1101760emE == null || (strLIZIZ = abstractC1101760emE.LIZIZ()) == null) {
            strLIZIZ = "default";
        }
        pairArr[4] = new Pair("business_type", strLIZIZ);
        pairArr[5] = new Pair("sub_business_type", str);
        if (abstractC1101760emE != null) {
            numValueOf = Integer.valueOf(abstractC1101760emE.LJIIIIZZ());
        } else {
            numValueOf = null;
        }
        pairArr[6] = new Pair("is_template", String.valueOf(numValueOf));
        if (abstractC1101760emE != null && (strLJIILLIIL = abstractC1101760emE.LJIILLIIL()) != null) {
            str5 = strLJIILLIIL;
        }
        pairArr[7] = new Pair("template_id", str5);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        if (abstractC1101760emE == null || (mapLJ = abstractC1101760emE.LL) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return C2097608Jq.LJIIL(mapLJIIIIZZ, mapLJ);
    }

    public final boolean z1(View view, String str) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (view == null) {
            return false;
        }
        if (LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            List<AbstractC1101760emE> list = this.LLIZ;
            if (list == null) {
                return false;
            }
            for (AbstractC1101760emE abstractC1101760emE : list) {
                if (Intrinsics.LJFF(abstractC1101760emE.LIZJ(), str)) {
                    if (abstractC1101760emE == null || (viewGroup2 = this.LLILZ) == null || viewGroup2.indexOfChild(view) == -1) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        List<C1101640em2> list2 = this.LLILZLL;
        if (list2 == null) {
            return false;
        }
        for (C1101640em2 c1101640em2 : list2) {
            if (Intrinsics.LJFF(c1101640em2.LIZLLL, str)) {
                if (c1101640em2 == null || (viewGroup = this.LLILZ) == null || viewGroup.indexOfChild(view) == -1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1101890emR
    public final void LJLJJI(C1101780emG c1101780emG, Function1<? super C1101790emH, Unit> function1, Function1<? super C1101790emH, Unit> function12) {
        String string;
        Room roomLJJLIIIIJ;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) == null || (string = Long.valueOf(roomLJJLIIIIJ.getId()).toString()) == null) {
            string = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Widget.requestExpandShortTouch: id=");
        sbLIZ.append(c1101780emG.LIZ);
        sbLIZ.append(", forceExpand=");
        sbLIZ.append(c1101780emG.LJIIIIZZ);
        sbLIZ.append(", containerId=");
        sbLIZ.append(c1101780emG.LJFF);
        sbLIZ.append(", targetWidthDp=");
        sbLIZ.append(c1101780emG.LJI);
        sbLIZ.append(", biz=");
        sbLIZ.append(c1101780emG.LIZJ);
        sbLIZ.append(", scene=");
        sbLIZ.append(c1101780emG.LIZLLL);
        C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ));
        if (c1101780emG.LJIIIIZZ) {
            C20441214yg.LJ("matao-short", "Widget.requestExpandShortTouch forceExpand -> success");
            function1.invoke(new C1101790emH(c1101780emG.LIZ, c1101780emG.LIZLLL, c1101780emG.LIZJ, string, Boolean.TRUE, null, null, c1101780emG.LIZIZ, 96));
            return;
        }
        C1101850emN c1101850emN = new C1101850emN(c1101780emG, new AwS133S1200000_17(c1101780emG, (C1101780emG) function1, (Function1<? super C1101790emH, Unit>) string, (String) 2), new AwS133S1200000_17(c1101780emG, (C1101780emG) function12, (Function1<? super C1101790emH, Unit>) string, (String) 3), new AwS101S1200000_17(c1101780emG, (C1101780emG) function1, (Function1<? super C1101790emH, Unit>) string, (String) 0));
        this.LL.put(c1101780emG.LIZ, c1101850emN);
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel2 = this.dataChannel;
        c1102070emj.getClass();
        if (!C1102070emj.LJJ(dataChannel2, c1101850emN, false, null)) {
            this.LL.remove(c1101780emG.LIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Widget.requestExpandShortTouch notifyReady=false -> fail, id=");
            sbLIZ2.append(c1101780emG.LIZ);
            C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ2));
            function1.invoke(new C1101790emH(c1101780emG.LIZ, c1101780emG.LIZLLL, c1101780emG.LIZJ, string, Boolean.FALSE, "conflict", null, c1101780emG.LIZIZ, 64));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Widget.requestExpandShortTouch notifyReady=true, id=");
        sbLIZ3.append(c1101780emG.LIZ);
        C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC1101890emR
    public final void LJLLLLLL(int i, long j, View view, String str) {
        ViewGroup.LayoutParams layoutParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Widget.shrinkShortTouch: id=");
        sbLIZ.append(str);
        sbLIZ.append(", animateDurationMs=");
        sbLIZ.append(j);
        C20441214yg.LJ("matao-short", C2188811AlT.LIZIZ(sbLIZ));
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            int i2 = layoutParams.width;
            int iLIZIZ = (int) C497740JfY.LIZIZ(40.0f);
            if (i2 != iLIZIZ) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = iLIZIZ;
                }
                C786410Ut5.W5(view, layoutParams2);
            }
            if (this.LL.remove(str) != null) {
                C1102070emj c1102070emj = C1102070emj.LIZ;
                DataChannel dataChannel = this.dataChannel;
                c1102070emj.getClass();
                C1102070emj.LJIIL(dataChannel, i, str);
            }
        }
    }
}
