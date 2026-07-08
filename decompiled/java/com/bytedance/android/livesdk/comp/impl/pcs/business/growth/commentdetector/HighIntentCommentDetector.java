package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector;

import X.C01GW;
import X.C09GI;
import X.C1082260eGm;
import X.C1082270eGn;
import X.C1122340fJQ;
import X.C1122420fJY;
import X.C1122510fJh;
import X.C1122530fJj;
import X.C1122550fJl;
import X.C1122820fKC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C500260Jjc;
import X.C786410Ut5;
import android.net.Uri;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ToolbarTipEvent;
import com.bytedance.android.livesdk.comp.api.pcs.data.event.SmbCommentDetectorState;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.DmGuidancePredictionStrategyEnableSetting;
import com.bytedance.android.livesdk.dataChannel.PcsAudienceServicePlusIconVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class HighIntentCommentDetector extends LiveRecyclableWidget {
    public int LL;
    public Room LLILZ;
    public C1122420fJY LLIZ;
    public long LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public volatile String LLILLJJLI = "";
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1082270eGn());
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1122340fJQ());
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1082260eGm(this));

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        if (C500260Jjc.LJJIJ(this.LLILLJJLI) && this.LLJ && DmGuidancePredictionStrategyEnableSetting.INSTANCE.getValue() && y1().vQ2()) {
            if (this.LLIZ == null) {
                this.LLIZ = new C1122420fJY(new C1122550fJl(this), new C1122820fKC(this));
            }
            C1122420fJY c1122420fJY = this.LLIZ;
            if (c1122420fJY != null) {
                c1122420fJY.LIZIZ();
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skip strategy setting=");
        sbLIZ.append(DmGuidancePredictionStrategyEnableSetting.INSTANCE.getValue());
        sbLIZ.append(" frequency=");
        sbLIZ.append(y1().vQ2());
        sbLIZ.append(" dmSchema.isNotNullOrEmpty()=");
        sbLIZ.append(C500260Jjc.LJJIJ(this.LLILLJJLI));
        sbLIZ.append(" isServiceIconShow=");
        sbLIZ.append(this.LLJ);
        C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final HighIntentCommentDetectorViewModel y1() {
        return (HighIntentCommentDetectorViewModel) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        HighIntentCommentDetectorViewModel highIntentCommentDetectorViewModelY1 = y1();
        highIntentCommentDetectorViewModelY1.LLILLJJLI.Pz(new C09GI());
        highIntentCommentDetectorViewModelY1.LLILZLL.LJ();
        this.LLILZ = null;
        this.LLJ = false;
        C1122420fJY c1122420fJY = this.LLIZ;
        if (c1122420fJY != null) {
            c1122420fJY.LIZJ();
        }
        ((Handler) this.LLILLL.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILZ = room;
        y1().LLILZIL = this.LLILZ;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, SmbCommentDetectorState.class, new C1122530fJj(this));
        }
        this.dataChannel.EQ2(this, PcsAudienceServicePlusIconVisibleChannel.class, new C1122510fJh(this));
    }

    public final String x1(String str) {
        boolean z;
        JSONObject jSONObject;
        if (this.LLILLJJLI.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            Uri uri = UriProtector.parse(this.LLILLJJLI);
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "biz_event_tracking_extra");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = new JSONObject();
            }
            return C500260Jjc.LJJJZ(C500260Jjc.LJJJZ(uri.buildUpon().appendQueryParameter("input_auto_filled_content", str).build(), "enter_method", "live_comment"), "biz_event_tracking_extra", C786410Ut5.J3(jSONObject.put("is_potential_guide", "1"))).toString();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return "";
        }
    }

    public final void z1(final String str, final String str2, final String str3, final Map<String, String> map) {
        int i;
        final Room room = this.LLILZ;
        if (room == null || !y1().vQ2()) {
            return;
        }
        if (System.currentTimeMillis() - this.LLIZLLLIL < 30000) {
            i = 30000;
        } else {
            i = 50;
        }
        this.LLIZLLLIL = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DelayToolTipShow latency=");
        sbLIZ.append(i);
        sbLIZ.append("  showDmCreatorTooltip ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLIIL(i, (Handler) this.LLILLL.getValue(), new Runnable() { // from class: X.0fJa
            public final void LIZ() {
                if (!this.LL.y1().vQ2()) {
                    C1122420fJY c1122420fJY = this.LL.LLIZ;
                    if (c1122420fJY != null) {
                        c1122420fJY.LIZJ();
                        return;
                    }
                    return;
                }
                DataChannel dataChannel = this.LL.dataChannel;
                if (dataChannel != null) {
                    C1106150etJ c1106150etJ = new C1106150etJ();
                    c1106150etJ.LIZ = this.LL.LL;
                    String strLJIJI = C497740JfY.LJIJI(2131852992);
                    if (strLJIJI == null) {
                        strLJIJI = "";
                    }
                    c1106150etJ.LIZIZ = strLJIJI;
                    c1106150etJ.LIZJ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    c1106150etJ.LIZLLL = R.raw.icon_paperplane_fill;
                    c1106150etJ.LJ = true;
                    c1106150etJ.LJFF = false;
                    c1106150etJ.LJI = new C1122450fJb(this.LL, room, str2, str3, map);
                    c1106150etJ.LJII = new C1122460fJc(this.LL, room, str2, str3, map, str);
                    c1106150etJ.LJIIIIZZ = new C1122560fJm(room, str2, str3, map);
                    dataChannel.LC0(ToolbarTipEvent.class, c1106150etJ.LIZ());
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("HighIntentCommentDetector@b20c.showDmCreatorTooltip$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("HighIntentCommentDetector@b20c.showDmCreatorTooltip$1");
            }
        });
    }
}
