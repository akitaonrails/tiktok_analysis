package com.bytedance.android.livesdk.widget;

import X.C01GW;
import X.C098200Yq;
import X.C0IHY;
import X.C1161920gLG;
import X.C1274100jGC;
import X.C1276840jKc;
import X.C189200o6;
import X.C20145713s7;
import X.C20441214yg;
import X.C20736316Cj;
import X.C20743716Ff;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2197108jB;
import X.C292401Bi;
import X.C464950ILd;
import X.C497740JfY;
import X.C758140Toa;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC465240IMg;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.debug.DebugRoomItem;
import com.bytedance.android.livesdkapi.depend.model.live.debug.DebugToolState;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class LiveAnchorDebugInfoWidget extends LiveRecyclableWidget implements View.OnClickListener, InterfaceC465240IMg, View.OnLongClickListener {
    public TextView LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public C20743716Ff LLJILJIL;
    public LinearLayout LLJILJILJ;
    public LinearLayout LLJILLL;
    public LinearLayout LLJJ;
    public LinearLayout LLJJI;
    public Room LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public C1274100jGC LLJJJ;
    public String LL = "";
    public List<DebugRoomItem> LLILLJJLI = new ArrayList();
    public final List<DebugRoomItem> LLILLL = new ArrayList();
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 337));
    public Boolean LLJJIJIL = Boolean.TRUE;
    public Map<String, String> LLJJJIL = C2097608Jq.LJ();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h66;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void B1() {
        TextView textView = this.LLILZIL;
        if (textView == null) {
            textView = null;
        }
        textView.setText(C497740JfY.LJIJI(2131841323));
        TextView textView2 = this.LLIZLLLIL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText("");
        if (!this.LLILLL.isEmpty()) {
            DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LLILLL, 0);
            if (!TextUtils.isEmpty(debugRoomItem.tabContent)) {
                TextView textView3 = this.LLIZLLLIL;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setText(C786410Ut5.j4("%s%s %s", Arrays.copyOf(new Object[]{debugRoomItem.tabContent, C497740JfY.LJIJI(2131841325), this.LL}, 3)));
            }
            TextView textView4 = this.LLILZIL;
            (textView4 != null ? textView4 : null).setText(debugRoomItem.tabTitle);
        }
    }

    public final void C1() {
        if (Intrinsics.LJFF(C0IHY.LIZ, Boolean.TRUE)) {
            View view = getView();
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
    }

    public final void D1() {
        C20743716Ff c20743716Ff = this.LLJILJIL;
        if (c20743716Ff == null) {
            c20743716Ff = null;
        }
        c20743716Ff.setChecked(C0IHY.LIZIZ);
        LinearLayout linearLayout = this.LLJILJILJ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (C0IHY.LIZIZ) {
            LinearLayout linearLayout2 = this.LLJILJILJ;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C786410Ut5.LJZL(0, linearLayout2);
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.width = 0;
            layoutParams.height = 0;
        }
        LinearLayout linearLayout3 = this.LLJILJILJ;
        C786410Ut5.d6(linearLayout3 != null ? linearLayout3 : null, layoutParams);
    }

    public final void E1() {
        TextView textView = this.LLIZ;
        if (textView == null) {
            textView = null;
        }
        textView.setText(C497740JfY.LJIJI(2131841328));
        if (!(!this.LLILLL.isEmpty()) || ((ArrayList) this.LLILLL).size() <= 2) {
            return;
        }
        DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LLILLL, 2);
        TextView textView2 = this.LLIZLLLIL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(debugRoomItem.tabContent);
        TextView textView3 = this.LLIZ;
        (textView3 != null ? textView3 : null).setText(debugRoomItem.tabTitle);
    }

    public final void F1() {
        TextView textView = this.LLILZLL;
        if (textView == null) {
            textView = null;
        }
        textView.setText(C497740JfY.LJIJI(2131841329));
        TextView textView2 = this.LLIZLLLIL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText("");
        if (!(!this.LLILLL.isEmpty()) || ((ArrayList) this.LLILLL).size() <= 1) {
            TextView textView3 = this.LLIZLLLIL;
            (textView3 != null ? textView3 : null).setText(z1());
            return;
        }
        DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LLILLL, 1);
        TextView textView4 = this.LLIZLLLIL;
        if (textView4 == null) {
            textView4 = null;
        }
        textView4.setText(debugRoomItem.tabContent);
        TextView textView5 = this.LLILZLL;
        (textView5 != null ? textView5 : null).setText(debugRoomItem.tabTitle);
    }

    public final void G1() {
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.nm, this.context);
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.c66, this.context);
        TextView textView = this.LLILZIL;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(iLIZIZ);
        TextView textView2 = this.LLILZLL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(iLIZIZ);
        TextView textView3 = this.LLIZ;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setTextColor(iLIZIZ);
        View view = this.LLJ;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
        View view2 = this.LLJI;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJLLLLLL(8, view2);
        View view3 = this.LLJIJIL;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(8, view3);
        int i = this.LLJJIJI;
        if (i == 1) {
            TextView textView4 = this.LLILZLL;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setTextColor(iLIZIZ2);
            View view4 = this.LLJI;
            C786410Ut5.LJLLLLLL(0, view4 != null ? view4 : null);
            return;
        }
        if (i != 2) {
            TextView textView5 = this.LLILZIL;
            if (textView5 == null) {
                textView5 = null;
            }
            textView5.setTextColor(iLIZIZ2);
            View view5 = this.LLJ;
            C786410Ut5.LJLLLLLL(0, view5 != null ? view5 : null);
            return;
        }
        TextView textView6 = this.LLIZ;
        if (textView6 == null) {
            textView6 = null;
        }
        textView6.setTextColor(iLIZIZ2);
        View view6 = this.LLJIJIL;
        C786410Ut5.LJLLLLLL(0, view6 != null ? view6 : null);
    }

    public final void H1() {
        ((ArrayList) this.LLILLL).clear();
        if (this.LLILLJJLI.isEmpty()) {
            DebugRoomItem debugRoomItem = new DebugRoomItem("", "", "");
            String strLJIJI = C497740JfY.LJIJI(2131841323);
            if (strLJIJI == null) {
                strLJIJI = "";
            }
            debugRoomItem.setTabTitle(strLJIJI);
            debugRoomItem.setTabContent("");
            ((ArrayList) this.LLILLL).add(debugRoomItem);
        } else {
            ((ArrayList) this.LLILLL).add(ListProtector.get(this.LLILLJJLI, 0));
        }
        DebugRoomItem debugRoomItem2 = new DebugRoomItem("", "", "");
        String strLJIJI2 = C497740JfY.LJIJI(2131841329);
        if (strLJIJI2 == null) {
            strLJIJI2 = "";
        }
        debugRoomItem2.setTabTitle(strLJIJI2);
        debugRoomItem2.setTabContent(z1());
        ((ArrayList) this.LLILLL).add(debugRoomItem2);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        DebugRoomItem debugRoomItem3 = new DebugRoomItem("", "", "");
        String strLJIJI3 = C497740JfY.LJIJI(2131841328);
        debugRoomItem3.setTabTitle(strLJIJI3 != null ? strLJIJI3 : "");
        debugRoomItem3.setTabContent(iInteractService.T6());
        ((ArrayList) this.LLILLL).add(debugRoomItem3);
        show();
    }

    public final WeakHandler y1() {
        return (WeakHandler) this.LLILZ.getValue();
    }

    public final String z1() {
        try {
            StringBuilder sb = new StringBuilder("Host：\n");
            C1276840jKc.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is_hw:");
            sbLIZ.append(C1276840jKc.LJJIFFI("is_hw"));
            sbLIZ.append("\r\n");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("Codec：video_codec:");
            sb.append(A1("video_codec"));
            sb.append("\r\nBitrate：");
            sb.append(A1("bitrate"));
            sb.append("kb/s\r\n\nResolution:\n");
            sb.append(C1276840jKc.LJJIJL());
            sb.append("push resolution：");
            sb.append(A1("resolution_width"));
            sb.append(" x ");
            sb.append(A1("resolution_height"));
            sb.append("\n\nFPS:\nin cap fps：");
            Object[] objArr = new Object[1];
            String str = this.LLJJJIL.get("in_cap_fps");
            objArr[0] = str != null ? Float.valueOf(CastFloatProtector.parseFloat(str)) : null;
            sb.append(x1(C786410Ut5.j4("%.3f", Arrays.copyOf(objArr, 1))));
            sb.append("fps\r\nout cap fps：");
            Object[] objArr2 = new Object[1];
            String str2 = this.LLJJJIL.get("out_cap_fps");
            objArr2[0] = str2 != null ? Float.valueOf(CastFloatProtector.parseFloat(str2)) : null;
            sb.append(x1(C786410Ut5.j4("%.3f", Arrays.copyOf(objArr2, 1))));
            sb.append("fps\r\nencode fps：");
            Object[] objArr3 = new Object[1];
            String str3 = this.LLJJJIL.get("encode_fps");
            objArr3[0] = str3 != null ? Float.valueOf(CastFloatProtector.parseFloat(str3)) : null;
            sb.append(x1(C786410Ut5.j4("%.3f", Arrays.copyOf(objArr3, 1))));
            sb.append("fps\r\nreal video frame rate：");
            Object[] objArr4 = new Object[1];
            String str4 = this.LLJJJIL.get("push_fps");
            objArr4[0] = str4 != null ? Float.valueOf(CastFloatProtector.parseFloat(str4)) : null;
            sb.append(x1(C786410Ut5.j4("%.3f", Arrays.copyOf(objArr4, 1))));
            sb.append("fps\r\n\nNetwork Info(push stream):\n");
            sb.append(C1276840jKc.LJJIIJZLJL(this.context));
            sb.append("Effect:\n");
            sb.append(C1276840jKc.LJIIJJI());
            sb.append("Remote Info:\n");
            sb.append(C1276840jKc.LJJIJ());
            sb.append(C1276840jKc.LJJII());
            String string = sb.toString();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Others：\nResolution_commend：");
            sbLIZ2.append("");
            sbLIZ2.append("\r\nspeed_test_result：");
            sbLIZ2.append(C758140Toa.LIZ);
            sbLIZ2.append("\r\ntemperature：");
            sbLIZ2.append(A1("thermal_value"));
            sbLIZ2.append("\r\nmax_bitrate：");
            C1274100jGC c1274100jGC = this.LLJJJ;
            sbLIZ2.append(c1274100jGC != null ? Integer.valueOf(c1274100jGC.LIZJ) : null);
            sbLIZ2.append("\r\ndefault_bitrate：");
            C1274100jGC c1274100jGC2 = this.LLJJJ;
            sbLIZ2.append(c1274100jGC2 != null ? Integer.valueOf(c1274100jGC2.LIZIZ) : null);
            sbLIZ2.append("\r\nmin_bitrate：");
            C1274100jGC c1274100jGC3 = this.LLJJJ;
            sbLIZ2.append(c1274100jGC3 != null ? Integer.valueOf(c1274100jGC3.LIZ) : null);
            sbLIZ2.append("\r\nrtmp buffer duration：");
            String str5 = (String) ((LinkedHashMap) C1276840jKc.LJIIL).get("rtmp_buffer_time");
            if (str5 == null) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            sbLIZ2.append(str5);
            sbLIZ2.append("ms\r\n");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(string);
            sbLIZ3.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                return "";
            }
            throw new C2197108jB();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        y1().removeCallbacksAndMessages(null);
        C20743716Ff c20743716Ff = this.LLJILJIL;
        (c20743716Ff != null ? c20743716Ff : null).clearAnimation();
    }

    public static String x1(String str) {
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 1444) {
                if (iHashCode != 1445) {
                    if (iHashCode != 1389158) {
                        if (iHashCode != 1390119) {
                            if (iHashCode != 1334982374 || !str.equals("-1.000")) {
                                return str;
                            }
                        } else if (!str.equals("-2.0")) {
                            return str;
                        }
                    } else if (!str.equals("-1.0")) {
                        return str;
                    }
                    return "-";
                }
                if (str.equals("-2")) {
                    return "-";
                }
                return str;
            }
            if (str.equals("-1")) {
                return "-";
            }
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                return "-";
            }
            throw new C2197108jB();
        }
    }

    public final String A1(String str) {
        try {
            String str2 = this.LLJJJIL.get(str);
            if (str2 == null) {
                str2 = "-";
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 1444) {
                if (iHashCode != 1445) {
                    if (iHashCode != 1389158) {
                        if (iHashCode != 1390119) {
                            if (iHashCode != 1334982374 || !str2.equals("-1.000")) {
                                return str2;
                            }
                        } else if (!str2.equals("-2.0")) {
                            return str2;
                        }
                    } else if (!str2.equals("-1.0")) {
                        return str2;
                    }
                    return "-";
                }
                if (str2.equals("-2")) {
                    return "-";
                }
                return str2;
            }
            if (str2.equals("-1")) {
                return "-";
            }
            return str2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                return "-";
            }
            throw new C2197108jB();
        }
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        Integer numValueOf;
        long id;
        if (message != null && (numValueOf = Integer.valueOf(message.what)) != null) {
            if (numValueOf.intValue() == 18) {
                if (!Intrinsics.LJFF(this.LLJJIJIL, Boolean.TRUE)) {
                    return;
                }
                if (this.LLILLJJLI.isEmpty() && this.LLJJIJIIJIL < 2) {
                    C464950ILd c464950ILd = C464950ILd.LJI;
                    WeakHandler weakHandlerY1 = y1();
                    Room room = this.LLJJIII;
                    if (room != null) {
                        id = room.getId();
                    } else {
                        id = 0;
                    }
                    c464950ILd.getClass();
                    C464950ILd.LJII(weakHandlerY1, id);
                    this.LLJJIJIIJIL++;
                }
                H1();
                int i = this.LLJJIJI;
                if (i != 1) {
                    if (i != 2) {
                        B1();
                    } else {
                        E1();
                    }
                } else {
                    F1();
                }
                y1().sendEmptyMessageDelayed(18, Mp4ScreenVideoLoadTimeout.CONTROL);
                return;
            }
            if (numValueOf.intValue() == 39) {
                if (HandlerHook.getMessageObj(message.obj) != null && (HandlerHook.getMessageObj(message.obj) instanceof ArrayList)) {
                    this.LLILLJJLI = (ArrayList) HandlerHook.getMessageObj(message.obj);
                    H1();
                    int i2 = this.LLJJIJI;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            B1();
                            return;
                        } else {
                            E1();
                            return;
                        }
                    }
                    F1();
                    return;
                }
                return;
            }
            if (numValueOf.intValue() == 38 && HandlerHook.getMessageObj(message.obj) != null && (HandlerHook.getMessageObj(message.obj) instanceof DebugToolState)) {
                Boolean bool = ((DebugToolState) HandlerHook.getMessageObj(message.obj)).canDebugTool;
                C0IHY.LIZ = bool;
                this.LLJJIJIL = bool;
                C0IHY.LIZJ = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
                C1();
                y1().sendEmptyMessage(18);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.wx8) {
                this.LLJJIJI = 0;
                G1();
                B1();
                return;
            }
            if (numValueOf == null) {
                return;
            }
            if (numValueOf.intValue() == R.id.wyk) {
                this.LLJJIJI = 1;
                G1();
                F1();
            } else if (numValueOf.intValue() == R.id.wye) {
                this.LLJJIJI = 2;
                G1();
                E1();
            } else {
                if (numValueOf.intValue() != R.id.fgy) {
                    return;
                }
                C0IHY.LIZIZ = !C0IHY.LIZIZ;
                D1();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILZIL = (TextView) findViewById(R.id.tv_tab_basic);
        this.LLILZLL = (TextView) findViewById(R.id.tv_tab_performance);
        this.LLIZ = (TextView) findViewById(R.id.tv_tab_linkmic);
        this.LLIZLLLIL = (TextView) findViewById(R.id.zhe);
        this.LLJILJILJ = (LinearLayout) findViewById(R.id.mq1);
        this.LLJILJIL = (C20743716Ff) findViewById(R.id.fgy);
        this.LLJILLL = (LinearLayout) findViewById(R.id.wx8);
        this.LLJJ = (LinearLayout) findViewById(R.id.wyk);
        this.LLJJI = (LinearLayout) findViewById(R.id.wye);
        this.LLJ = findViewById(R.id.mpc);
        this.LLJI = findViewById(R.id.mpm);
        this.LLJIJIL = findViewById(R.id.mpl);
        LinearLayout linearLayout = this.LLJILLL;
        C20743716Ff c20743716Ff = null;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.R7(linearLayout, this);
        LinearLayout linearLayout2 = this.LLJJ;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        C786410Ut5.R7(linearLayout2, this);
        LinearLayout linearLayout3 = this.LLJJI;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        C786410Ut5.R7(linearLayout3, this);
        C20743716Ff c20743716Ff2 = this.LLJILJIL;
        if (c20743716Ff2 == null) {
            c20743716Ff2 = null;
        }
        C786410Ut5.k8(c20743716Ff2, this);
        TextView textView = this.LLIZLLLIL;
        if (textView == null) {
            textView = null;
        }
        textView.setOnLongClickListener(this);
        C20743716Ff c20743716Ff3 = this.LLJILJIL;
        if (c20743716Ff3 != null) {
            c20743716Ff = c20743716Ff3;
        }
        C786410Ut5.LLJJJIL(c20743716Ff, 0);
        View view = getView();
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r7) {
        /*
            r6 = this;
            java.lang.Boolean r0 = X.C0IHY.LIZ
            r5 = 0
            if (r0 == 0) goto L2b
            java.lang.Long r0 = X.C0IHY.LIZJ
            r3 = 0
            if (r0 == 0) goto L2b
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2b
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r3 = r0.getCurrentUserId()
            java.lang.Long r0 = X.C0IHY.LIZJ
            if (r0 == 0) goto L2b
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L37
        L2b:
            X.0ILd r1 = X.C464950ILd.LJI
            com.bytedance.android.livesdkapi.depend.handler.WeakHandler r0 = r6.y1()
            r1.getClass()
            X.C464950ILd.LJIIIIZZ(r0)
        L37:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            if (r1 == 0) goto L98
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
        L43:
            r6.LLJJIII = r0
            if (r0 != 0) goto L52
            android.view.View r1 = r6.getView()
            if (r1 == 0) goto L52
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L52:
            r6.LLJJIJIIJIL = r5
            r6.LLJJIJI = r5
            r6.G1()
            r6.D1()
            com.bytedance.android.livesdkapi.depend.handler.WeakHandler r1 = r6.y1()
            r0 = 18
            r1.sendEmptyMessage(r0)
            long r2 = java.lang.System.currentTimeMillis()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            r1.<init>(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = r1.format(r0)
            r6.LL = r0
            r6.C1()
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r3 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.HostDebugStreamInfo> r2 = com.bytedance.android.livesdk.dataChannel.HostDebugStreamInfo.class
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 36
            r1.<init>(r6, r0)
            r3.DQ2(r2, r6, r1)
            com.bytedance.android.livesdk.log.monitor.IPerformanceManager r2 = X.C465520INi.LIZ
            kotlin.jvm.internal.AwS605S0100000_26 r1 = new kotlin.jvm.internal.AwS605S0100000_26
            r0 = 37
            r1.<init>(r6, r0)
            r2.L11(r1)
            return
        L98:
            r0 = 0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveAnchorDebugInfoWidget.onLoad(java.lang.Object[]):void");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (!((ArrayList) this.LLILLL).isEmpty()) {
            y1().removeMessages(18);
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((DebugRoomItem) ((ArrayList) this.LLILLL).get(0)).tabTitle);
                sbLIZ.append('\n');
                sbLIZ.append(((DebugRoomItem) ((ArrayList) this.LLILLL).get(0)).tabContent);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int size = ((ArrayList) this.LLILLL).size();
                for (int i = 1; i < size; i++) {
                    if (!TextUtils.isEmpty(((DebugRoomItem) ((ArrayList) this.LLILLL).get(i)).tabContent)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append("\r\n\n");
                        sbLIZ2.append(((DebugRoomItem) ((ArrayList) this.LLILLL).get(i)).tabTitle);
                        sbLIZ2.append('\n');
                        sbLIZ2.append(((DebugRoomItem) ((ArrayList) this.LLILLL).get(i)).tabContent);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                C20145713s7.LIZJ((ClipboardManager) C786410Ut5.H2(getContext(), "clipboard"), ClipData.newPlainText(strLIZIZ, strLIZIZ), CertProviderManagerKt.findCert("bpea-1055", 1476399119));
                C766270U4b.LJIIJJI("copied");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("LiveAnchorDebugInfoWidget", e);
            }
            y1().sendEmptyMessageDelayed(18, Mp4ScreenVideoLoadTimeout.CONTROL);
        }
        return false;
    }
}
