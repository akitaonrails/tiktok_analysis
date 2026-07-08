package com.bytedance.android.livesdk.widget;

import X.C01GW;
import X.C098200Yq;
import X.C0IHY;
import X.C1161920gLG;
import X.C1276840jKc;
import X.C12ES;
import X.C189200o6;
import X.C20145713s7;
import X.C20441214yg;
import X.C20743716Ff;
import X.C2188811AlT;
import X.C2197108jB;
import X.C292401Bi;
import X.C439101nJ;
import X.C464950ILd;
import X.C476230Ilx;
import X.C497740JfY;
import X.C753840The;
import X.C753850Thf;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC465240IMg;
import X.InterfaceC480510Isr;
import Y.ACListenerS142S0100000_7;
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
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.debugtool.DebugInfoDetailFragment;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.debug.DebugRoomItem;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class LiveDebugInfoWidget extends LiveRecyclableWidget implements View.OnClickListener, InterfaceC465240IMg, View.OnLongClickListener {
    public String LL = "";
    public final int LLILLJJLI = 18;
    public final long LLILLL = Mp4ScreenVideoLoadTimeout.CONTROL;
    public final String LLILZ = "LiveDebugInfoView";
    public List<DebugRoomItem> LLILZIL = new ArrayList();
    public final List<DebugRoomItem> LLILZLL = new ArrayList();
    public final C01GW LLIZ = C292401Bi.LIZ(new AwS551S0100000_7(this, 112));
    public TextView LLIZLLLIL;
    public TextView LLJ;
    public TextView LLJI;
    public TextView LLJIJIL;
    public TextView LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public C20743716Ff LLJJIII;
    public LinearLayout LLJJIJI;
    public LinearLayout LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public LinearLayout LLJJJ;
    public LinearLayout LLJJJIL;
    public TextView LLJJJJ;
    public Room LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public DebugInfoDetailFragment LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h6d;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        TextView textView = this.LLJJJJ;
        if (textView == null) {
            textView = null;
        }
        C439101nJ.LJI(textView);
        TextView textView2 = this.LLIZLLLIL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(C497740JfY.LJIJI(2131841323));
        TextView textView3 = this.LLJILJIL;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText("");
        if (!this.LLILZLL.isEmpty()) {
            DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LLILZLL, 0);
            if (!TextUtils.isEmpty(debugRoomItem.tabContent)) {
                TextView textView4 = this.LLJILJIL;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setText(C786410Ut5.j4("%s%s %s", Arrays.copyOf(new Object[]{debugRoomItem.tabContent, C497740JfY.LJIJI(2131841325), this.LL}, 3)));
            }
            TextView textView5 = this.LLIZLLLIL;
            (textView5 != null ? textView5 : null).setText(debugRoomItem.tabTitle);
        }
    }

    public final void B1() {
        C20743716Ff c20743716Ff = this.LLJJIII;
        if (c20743716Ff == null) {
            c20743716Ff = null;
        }
        c20743716Ff.setChecked(C0IHY.LIZIZ);
        LinearLayout linearLayout = this.LLJJIJI;
        if (linearLayout == null) {
            linearLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (C0IHY.LIZIZ) {
            LinearLayout linearLayout2 = this.LLJJIJI;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C786410Ut5.LJZL(0, linearLayout2);
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.width = 0;
            layoutParams.height = 0;
            TextView textView = this.LLJJJJ;
            if (textView == null) {
                textView = null;
            }
            C439101nJ.LJI(textView);
        }
        LinearLayout linearLayout3 = this.LLJJIJI;
        C786410Ut5.d6(linearLayout3 != null ? linearLayout3 : null, layoutParams);
    }

    public final void C1() {
        TextView textView = this.LLJJJJ;
        if (textView == null) {
            textView = null;
        }
        C439101nJ.LJI(textView);
        TextView textView2 = this.LLJIJIL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(C497740JfY.LJIJI(2131841328));
        if (!(!this.LLILZLL.isEmpty()) || ((ArrayList) this.LLILZLL).size() <= 3) {
            return;
        }
        DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LLILZLL, 3);
        TextView textView3 = this.LLJILJIL;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(debugRoomItem.tabContent);
        TextView textView4 = this.LLJIJIL;
        (textView4 != null ? textView4 : null).setText(debugRoomItem.tabTitle);
    }

    public final void D1() {
        TextView textView = this.LLJJJJ;
        if (textView == null) {
            textView = null;
        }
        C439101nJ.LJI(textView);
        TextView textView2 = this.LLJ;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(C497740JfY.LJIJI(2131841329));
        TextView textView3 = this.LLJILJIL;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText("");
        if (!(!this.LLILZLL.isEmpty()) || ((ArrayList) this.LLILZLL).size() <= 1) {
            String strZ1 = z1();
            if (strZ1.length() == 0) {
                strZ1 = x1();
            }
            TextView textView4 = this.LLJILJIL;
            (textView4 != null ? textView4 : null).setText(strZ1);
            return;
        }
        DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LLILZLL, 1);
        TextView textView5 = this.LLJILJIL;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setText(debugRoomItem.tabContent);
        TextView textView6 = this.LLJ;
        (textView6 != null ? textView6 : null).setText(debugRoomItem.tabTitle);
    }

    public final void E1() {
        TextView textView = this.LLJJJJ;
        if (textView == null) {
            textView = null;
        }
        C439101nJ.LJI(textView);
        TextView textView2 = this.LLJI;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(C497740JfY.LJIJI(2131841330));
        TextView textView3 = this.LLJILJIL;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText("");
        if (!(!this.LLILZLL.isEmpty()) || ((ArrayList) this.LLILZLL).size() <= 2) {
            return;
        }
        DebugRoomItem debugRoomItem = (DebugRoomItem) ListProtector.get(this.LLILZLL, 2);
        TextView textView4 = this.LLJILJIL;
        if (textView4 == null) {
            textView4 = null;
        }
        textView4.setText(debugRoomItem.tabContent);
        TextView textView5 = this.LLJI;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setText(debugRoomItem.tabTitle);
        if (debugRoomItem.tabDetail.length() > 0) {
            TextView textView6 = this.LLJJJJ;
            C12ES.LJIILL(0, textView6 != null ? textView6 : null);
        }
    }

    public final void F1() {
        TextView textView = this.LLIZLLLIL;
        if (textView == null) {
            textView = null;
        }
        textView.setSelected(false);
        TextView textView2 = this.LLJ;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setSelected(false);
        TextView textView3 = this.LLJI;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setSelected(false);
        TextView textView4 = this.LLJIJIL;
        if (textView4 == null) {
            textView4 = null;
        }
        textView4.setSelected(false);
        View view = this.LLJILJILJ;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
        View view2 = this.LLJILLL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJLLLLLL(8, view2);
        View view3 = this.LLJJ;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(8, view3);
        View view4 = this.LLJJI;
        if (view4 == null) {
            view4 = null;
        }
        C786410Ut5.LJLLLLLL(8, view4);
        int i = this.LLJJJJLIIL;
        if (i == 1) {
            TextView textView5 = this.LLJ;
            if (textView5 == null) {
                textView5 = null;
            }
            textView5.setSelected(true);
            View view5 = this.LLJILLL;
            C786410Ut5.LJLLLLLL(0, view5 != null ? view5 : null);
            return;
        }
        if (i == 2) {
            TextView textView6 = this.LLJI;
            if (textView6 == null) {
                textView6 = null;
            }
            textView6.setSelected(true);
            View view6 = this.LLJJ;
            C786410Ut5.LJLLLLLL(0, view6 != null ? view6 : null);
            return;
        }
        if (i != 3) {
            TextView textView7 = this.LLIZLLLIL;
            if (textView7 == null) {
                textView7 = null;
            }
            textView7.setSelected(true);
            View view7 = this.LLJILJILJ;
            C786410Ut5.LJLLLLLL(0, view7 != null ? view7 : null);
            return;
        }
        TextView textView8 = this.LLJIJIL;
        if (textView8 == null) {
            textView8 = null;
        }
        textView8.setSelected(true);
        View view8 = this.LLJJI;
        C786410Ut5.LJLLLLLL(0, view8 != null ? view8 : null);
    }

    public final void G1() {
        String str;
        String str2;
        ((ArrayList) this.LLILZLL).clear();
        if (this.LLILZIL.isEmpty()) {
            DebugRoomItem debugRoomItem = new DebugRoomItem("", "", "");
            String strLJIJI = C497740JfY.LJIJI(2131841323);
            if (strLJIJI == null) {
                strLJIJI = "";
            }
            debugRoomItem.setTabTitle(strLJIJI);
            debugRoomItem.setTabContent("");
            ((ArrayList) this.LLILZLL).add(debugRoomItem);
        } else {
            ((ArrayList) this.LLILZLL).add(ListProtector.get(this.LLILZIL, 0));
        }
        DebugRoomItem debugRoomItem2 = new DebugRoomItem("", "", "");
        String strLJIJI2 = C497740JfY.LJIJI(2131841329);
        if (strLJIJI2 == null) {
            strLJIJI2 = "";
        }
        debugRoomItem2.setTabTitle(strLJIJI2);
        String strZ1 = z1();
        if (strZ1.length() == 0) {
            strZ1 = x1();
        }
        debugRoomItem2.setTabContent(strZ1);
        ((ArrayList) this.LLILZLL).add(debugRoomItem2);
        DebugRoomItem debugRoomItem3 = new DebugRoomItem("", "", "");
        String strLJIJI3 = C497740JfY.LJIJI(2131841330);
        if (strLJIJI3 == null) {
            strLJIJI3 = "";
        }
        debugRoomItem3.setTabTitle(strLJIJI3);
        DataChannel dataChannelProvideDataChannel = provideDataChannel();
        if (dataChannelProvideDataChannel == null || (str = (String) dataChannelProvideDataChannel.gg0(C753850Thf.class)) == null) {
            str = "";
        }
        debugRoomItem3.setTabContent(str);
        DataChannel dataChannelProvideDataChannel2 = provideDataChannel();
        if (dataChannelProvideDataChannel2 == null || (str2 = (String) dataChannelProvideDataChannel2.gg0(C753840The.class)) == null) {
            str2 = "";
        }
        debugRoomItem3.setTabDetail(str2);
        ((ArrayList) this.LLILZLL).add(debugRoomItem3);
        if (TextUtils.isEmpty(debugRoomItem3.tabContent)) {
            TextView textView = this.LLJI;
            C786410Ut5.LLIL(textView != null ? textView : null, 8);
        } else {
            TextView textView2 = this.LLJI;
            C786410Ut5.LLIL(textView2 != null ? textView2 : null, 0);
        }
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        DebugRoomItem debugRoomItem4 = new DebugRoomItem("", "", "");
        String strLJIJI4 = C497740JfY.LJIJI(2131841328);
        debugRoomItem4.setTabTitle(strLJIJI4 != null ? strLJIJI4 : "");
        debugRoomItem4.setTabContent(iInteractService.T6());
        ((ArrayList) this.LLILZLL).add(debugRoomItem4);
        show();
    }

    public final WeakHandler y1() {
        return (WeakHandler) this.LLIZ.getValue();
    }

    public final String z1() {
        JSONObject jSONObjectLJI;
        InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
        if (interfaceC480510Isr == null || (jSONObjectLJI = interfaceC480510Isr.LJI()) == null) {
            return "";
        }
        int iOptInt = jSONObjectLJI.optInt("push_client_is_hardware_encode:", -1);
        String str = "+hw";
        String str2 = iOptInt != 0 ? iOptInt != 1 ? "" : "+hw" : "+sw";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Host：\nResolution：");
        sbLIZ.append(jSONObjectLJI.optString("push_client_resolution:", ""));
        sbLIZ.append("\r\nCodec：");
        sbLIZ.append(jSONObjectLJI.optString("push_client_codec_type:", ""));
        sbLIZ.append(str2);
        sbLIZ.append("\r\nFrame rate：");
        int iOptInt2 = jSONObjectLJI.optInt("push_client_fps:", -1);
        sbLIZ.append(iOptInt2 >= 0 ? String.valueOf(iOptInt2) : "-");
        sbLIZ.append("fps\r\nBitrate：");
        int iOptInt3 = jSONObjectLJI.optInt("push_client_bitrate:", -1);
        sbLIZ.append(iOptInt3 >= 0 ? String.valueOf(iOptInt3) : "-");
        sbLIZ.append("kb/s\r\nPush protocol：");
        sbLIZ.append(jSONObjectLJI.optString("push_client_push_protocol:", ""));
        sbLIZ.append("\r\neffect type：");
        sbLIZ.append(jSONObjectLJI.optString("sr_type:"));
        sbLIZ.append(',');
        sbLIZ.append(jSONObjectLJI.optString("sr_algo_type:", ""));
        sbLIZ.append("\r\n\n");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Object objOpt = jSONObjectLJI.opt("HardDecode:");
        if (objOpt == null || !(objOpt instanceof Boolean)) {
            str = "";
        } else if (!Intrinsics.LJFF(objOpt, Boolean.TRUE)) {
            str = "+sw";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("User：\nResolution：");
        sbLIZ2.append(jSONObjectLJI.optInt("width:", -1));
        sbLIZ2.append('*');
        sbLIZ2.append(jSONObjectLJI.optInt("height:", -1));
        sbLIZ2.append("\r\nCodec：");
        sbLIZ2.append(jSONObjectLJI.optString("Codec_Type:", ""));
        sbLIZ2.append(str);
        sbLIZ2.append("\r\nFrame rate：");
        int iOptInt4 = jSONObjectLJI.optInt("render_fps:", -1);
        sbLIZ2.append(iOptInt4 >= 0 ? String.valueOf(iOptInt4) : "-");
        sbLIZ2.append("fps\r\nBitrate：");
        long jOptLong = jSONObjectLJI.optLong("download_Speed:", -1L);
        sbLIZ2.append(jOptLong >= 0 ? String.valueOf(jOptLong) : "-");
        sbLIZ2.append("kb/s\r\nPlayer status：");
        sbLIZ2.append(jSONObjectLJI.optString("player_state:"));
        sbLIZ2.append("\r\nPlayer error code：");
        sbLIZ2.append(jSONObjectLJI.optString("Error_Code:"));
        sbLIZ2.append("\r\n\n");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sb = new StringBuilder("Others：\nStream protocol：");
        sb.append(jSONObjectLJI.optString("play_format:", ""));
        sb.append("\nTransport protocol：");
        sb.append(jSONObjectLJI.optString("play_protocol:", ""));
        sb.append("\nPush client：");
        sb.append(jSONObjectLJI.optString("sei_source:", ""));
        sb.append("\r\nDownload speed：");
        sb.append(jSONObjectLJI.optString("download_Speed:", ""));
        sb.append("kb/s\r\nBuffer health：");
        sb.append(jSONObjectLJI.optLong("audio_Buffer_Time:", -1L));
        sb.append("ms\r\nLatency：");
        sb.append(jSONObjectLJI.optLong("delay:", -1L));
        sb.append("ms\r\nSuper resolution：");
        sb.append(jSONObjectLJI.optString("sr_type:", ""));
        sb.append(',');
        sb.append(jSONObjectLJI.optString("sr_algo_type:", ""));
        sb.append("\r\nTemplate：");
        sb.append(jSONObjectLJI.optString("resolution:", ""));
        sb.append("\r\nDomain：");
        sb.append(jSONObjectLJI.optString("domain:", ""));
        sb.append("\r\nPull Stream URL：");
        sb.append(jSONObjectLJI.optString("url:", ""));
        sb.append("\r\nABR-Enabled: ");
        int iOptInt5 = jSONObjectLJI.optInt("using_abr:", -1);
        sb.append(iOptInt5 >= 0 ? String.valueOf(iOptInt5) : "-");
        sb.append("\r\nABR-RawBitrateList：");
        sb.append(jSONObjectLJI.optString("abr_rawbitrate_list:", ""));
        sb.append("\r\nABR-StartupRealBitrateList：");
        sb.append(jSONObjectLJI.optString("abr_startup_realbitrate_list:", ""));
        sb.append("\r\nABR-SwitchRealBitrateList：");
        sb.append(jSONObjectLJI.optString("abr_switch_realbitrate_list:", ""));
        sb.append("\r\nABR-Startup：");
        sb.append(jSONObjectLJI.optString("abr_startup_res:", ""));
        sb.append(',');
        sb.append(jSONObjectLJI.optString("abr_startup_bitrate:", ""));
        sb.append(',');
        sb.append(jSONObjectLJI.optInt("abr_startup_bandwidth_est:", -1));
        sb.append("\r\nABR-Switch：");
        sb.append(jSONObjectLJI.optString("abr_switch_res:", ""));
        sb.append(',');
        sb.append(jSONObjectLJI.optString("abr_switch_bitrate:", ""));
        sb.append(',');
        sb.append(jSONObjectLJI.optInt("abr_switch_bandwidth_est:", -1));
        sb.append("\r\ntemperature：");
        sb.append(C476230Ilx.LIZ.LJFF);
        sb.append("\r\n\n");
        String string = sb.toString();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Network: \ndownload_speed: ");
        long jOptLong2 = jSONObjectLJI.optLong("download_Speed:", -1L);
        sbLIZ3.append(jOptLong2 >= 0 ? String.valueOf(jOptLong2) : "-");
        sbLIZ3.append("kbps\r\nnetwork_connection_type: ");
        sbLIZ3.append(C786410Ut5.b3(this.context));
        sbLIZ3.append("\r\nloss_rate: ");
        sbLIZ3.append(jSONObjectLJI.optDouble("loss_rate:"));
        sbLIZ3.append("\r\njitter_ms: ");
        sbLIZ3.append(jSONObjectLJI.optInt("jitter_ms:"));
        sbLIZ3.append("\r\nrtt: ");
        sbLIZ3.append(jSONObjectLJI.optInt("rtt:"));
        sbLIZ3.append("\r\nmessage: ");
        sbLIZ3.append(jSONObjectLJI.optString("message:", ""));
        sbLIZ3.append("\r\n\n");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append(strLIZIZ3);
        sbLIZ4.append(string);
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (y1() != null) {
            y1().removeCallbacksAndMessages(null);
        }
        C20743716Ff c20743716Ff = this.LLJJIII;
        (c20743716Ff != null ? c20743716Ff : null).clearAnimation();
    }

    public final String x1() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Host：\n");
            C1276840jKc.LIZ.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("is_hw:");
            sbLIZ2.append(C1276840jKc.LJJIFFI("is_hw"));
            sbLIZ2.append("\r\n");
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            sbLIZ.append("Codec：video_codec:");
            Map<String, String> map = C1276840jKc.LJIIL;
            sbLIZ.append((String) ((LinkedHashMap) map).get("video_codec"));
            sbLIZ.append("\r\nBitrate：");
            sbLIZ.append((String) ((LinkedHashMap) map).get("bitrate"));
            sbLIZ.append("kb/s\r\n\nResolution:\n");
            sbLIZ.append(C1276840jKc.LJJIJL());
            sbLIZ.append(C1276840jKc.LJJIII());
            sbLIZ.append("FPS:\n");
            sbLIZ.append(C1276840jKc.LJIJ());
            sbLIZ.append("Network Info(push stream):\n");
            sbLIZ.append(C1276840jKc.LJJIIJZLJL(this.context));
            sbLIZ.append("Remote Info:\n");
            sbLIZ.append(C1276840jKc.LJJIJ());
            sbLIZ.append(C1276840jKc.LJJII());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Others：\nrtmp buffer duration：");
            String str = (String) ((LinkedHashMap) map).get("rtmp_buffer_time");
            if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            sbLIZ3.append(str);
            sbLIZ3.append("ms\r\n");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(strLIZIZ2);
            return C2188811AlT.LIZIZ(sbLIZ4);
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

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        Integer numValueOf;
        Room room = null;
        if (message != null) {
            numValueOf = Integer.valueOf(message.what);
        } else {
            numValueOf = null;
        }
        int i = this.LLILLJJLI;
        if (numValueOf != null) {
            if (numValueOf.intValue() == i) {
                if (this.LLILZIL.isEmpty() && this.LLJJL < 2) {
                    C464950ILd c464950ILd = C464950ILd.LJI;
                    WeakHandler weakHandlerY1 = y1();
                    Room room2 = this.LLJJJJJIL;
                    if (room2 != null) {
                        room = room2;
                    }
                    long id = room.getId();
                    c464950ILd.getClass();
                    C464950ILd.LJII(weakHandlerY1, id);
                    this.LLJJL++;
                }
                G1();
                int i2 = this.LLJJJJLIIL;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            A1();
                        } else {
                            C1();
                        }
                    } else {
                        E1();
                    }
                } else {
                    D1();
                }
                y1().sendEmptyMessageDelayed(this.LLILLJJLI, this.LLILLL);
                return;
            }
            if (numValueOf.intValue() != 39 || HandlerHook.getMessageObj(message.obj) == null || !(HandlerHook.getMessageObj(message.obj) instanceof ArrayList)) {
                return;
            }
            this.LLILZIL = (ArrayList) HandlerHook.getMessageObj(message.obj);
            G1();
            int i3 = this.LLJJJJLIIL;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        A1();
                        return;
                    } else {
                        C1();
                        return;
                    }
                }
                E1();
                return;
            }
            D1();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.wx8) {
                this.LLJJJJLIIL = 0;
                F1();
                A1();
                return;
            }
            if (numValueOf == null) {
                return;
            }
            if (numValueOf.intValue() == R.id.wyk) {
                this.LLJJJJLIIL = 1;
                F1();
                D1();
            } else if (numValueOf.intValue() == R.id.wyr) {
                this.LLJJJJLIIL = 2;
                F1();
                E1();
            } else if (numValueOf.intValue() == R.id.wye) {
                this.LLJJJJLIIL = 3;
                F1();
                C1();
            } else {
                if (numValueOf.intValue() != R.id.fgy) {
                    return;
                }
                C0IHY.LIZIZ = !C0IHY.LIZIZ;
                B1();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.LLJJJJ = (TextView) findViewById(R.id.cq3);
        this.LLIZLLLIL = (TextView) findViewById(R.id.tv_tab_basic);
        this.LLJ = (TextView) findViewById(R.id.tv_tab_performance);
        this.LLJI = (TextView) findViewById(R.id.tv_tab_recommend);
        this.LLJIJIL = (TextView) findViewById(R.id.tv_tab_linkmic);
        this.LLJILJIL = (TextView) findViewById(R.id.zhe);
        this.LLJJIJI = (LinearLayout) findViewById(R.id.mq1);
        this.LLJJIII = (C20743716Ff) findViewById(R.id.fgy);
        this.LLJJIJIIJIL = (LinearLayout) findViewById(R.id.wx8);
        this.LLJJIJIL = (LinearLayout) findViewById(R.id.wyk);
        this.LLJJJ = (LinearLayout) findViewById(R.id.wyr);
        this.LLJJJIL = (LinearLayout) findViewById(R.id.wye);
        this.LLJILJILJ = findViewById(R.id.mpc);
        this.LLJILLL = findViewById(R.id.mpm);
        this.LLJJ = findViewById(R.id.mpo);
        this.LLJJI = findViewById(R.id.mpl);
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        TextView textView = null;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.R7(linearLayout, this);
        LinearLayout linearLayout2 = this.LLJJIJIL;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        C786410Ut5.R7(linearLayout2, this);
        LinearLayout linearLayout3 = this.LLJJJ;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        C786410Ut5.R7(linearLayout3, this);
        LinearLayout linearLayout4 = this.LLJJJIL;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        C786410Ut5.R7(linearLayout4, this);
        C20743716Ff c20743716Ff = this.LLJJIII;
        if (c20743716Ff == null) {
            c20743716Ff = null;
        }
        C786410Ut5.k8(c20743716Ff, this);
        TextView textView2 = this.LLJILJIL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setOnLongClickListener(this);
        C20743716Ff c20743716Ff2 = this.LLJJIII;
        if (c20743716Ff2 == null) {
            c20743716Ff2 = null;
        }
        C786410Ut5.LLJJJIL(c20743716Ff2, 0);
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if ((obj instanceof Room) && Room.isValid((Room) obj)) {
                this.LLJJJJJIL = (Room) objArr[0];
            }
        }
        this.LLJJL = 0;
        F1();
        B1();
        y1().sendEmptyMessage(this.LLILLJJLI);
        this.LL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(System.currentTimeMillis()));
        TextView textView3 = this.LLJJJJ;
        if (textView3 != null) {
            textView = textView3;
        }
        C786410Ut5.T7(textView, new ACListenerS142S0100000_7(this, 111));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (!((ArrayList) this.LLILZLL).isEmpty()) {
            y1().removeMessages(this.LLILLJJLI);
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((DebugRoomItem) ((ArrayList) this.LLILZLL).get(0)).tabTitle);
                sbLIZ.append('\n');
                sbLIZ.append(((DebugRoomItem) ((ArrayList) this.LLILZLL).get(0)).tabContent);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int size = ((ArrayList) this.LLILZLL).size();
                for (int i = 1; i < size; i++) {
                    if (!TextUtils.isEmpty(((DebugRoomItem) ((ArrayList) this.LLILZLL).get(i)).tabContent)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append("\r\n\n");
                        sbLIZ2.append(((DebugRoomItem) ((ArrayList) this.LLILZLL).get(i)).tabTitle);
                        sbLIZ2.append('\n');
                        sbLIZ2.append(((DebugRoomItem) ((ArrayList) this.LLILZLL).get(i)).tabContent);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                C20145713s7.LIZJ((ClipboardManager) C786410Ut5.H2(getContext(), "clipboard"), ClipData.newPlainText(strLIZIZ, strLIZIZ), CertProviderManagerKt.findCert("bpea-1055", 1476399119));
                C766270U4b.LJIIJJI("copied");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI(this.LLILZ, e);
            }
            y1().sendEmptyMessageDelayed(this.LLILLJJLI, this.LLILLL);
        }
        return false;
    }
}
