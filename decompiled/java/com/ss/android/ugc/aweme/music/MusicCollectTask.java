package com.ss.android.ugc.aweme.music;

import X.C0CCZ;
import X.C0OGJ;
import X.C0VZ0;
import X.C1323820kYO;
import X.C1440005kM;
import X.C14EU;
import X.C1548820qPI;
import X.C262100zr;
import X.C397901gf;
import X.C622680Oba;
import X.EnumC1323480kXq;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1871820yoG;
import android.content.Context;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicCollectTask implements C0CCZ, InterfaceC1141530foN {
    public String LL = "";
    public int LLILLJJLI = -1;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MusicCollectTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ColdBootTasksDegradeExperiment.LIZ().musicCollectTask ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (Intrinsics.LJFF(c262100zr.LIZ, "music_chart_collect_sync_event") && (interfaceC1107590evd = c262100zr.LIZIZ) != null && interfaceC1107590evd.hasKey("music_id") && interfaceC1107590evd.hasKey("collect_status")) {
            InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd.get("music_id");
            InterfaceC1871820yoG interfaceC1871820yoG2 = interfaceC1107590evd.get("collect_status");
            if (interfaceC1871820yoG.getType() == EnumC1323480kXq.String && interfaceC1871820yoG2.getType() == EnumC1323480kXq.Int) {
                String strAsString = interfaceC1871820yoG.asString();
                int iAsInt = interfaceC1871820yoG2.asInt();
                if (Intrinsics.LJFF(strAsString, this.LL) && iAsInt == this.LLILLJJLI) {
                    return;
                }
                this.LL = strAsString;
                this.LLILLJJLI = iAsInt;
                C1440005kM.LIZ(new C0OGJ(strAsString, iAsInt, true));
            }
        }
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onCollectMusicEvent(C0OGJ c0ogj) throws JSONException {
        if (Intrinsics.LJFF(c0ogj.LIZ, this.LL) && this.LLILLJJLI == c0ogj.LIZIZ) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str = c0ogj.LIZ;
        this.LL = str;
        this.LLILLJJLI = c0ogj.LIZIZ;
        jSONObject.put("music_id", str);
        jSONObject.put("collect_status", c0ogj.LIZIZ);
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "music_chart_collect_sync_event"));
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C622680Oba.LIZJ(this);
        C1548820qPI.LIZLLL("music_chart_collect_sync_event", this);
    }
}
