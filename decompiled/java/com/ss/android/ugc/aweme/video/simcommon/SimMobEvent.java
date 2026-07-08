package com.ss.android.ugc.aweme.video.simcommon;

import X.C20684815ws;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SimMobEvent implements IEvent {
    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent
    public void onEvent(String str, JSONObject jSONObject) {
        C20684815ws.LJIJ(str, jSONObject);
    }

    public void onEvent(String str, String str2, long j) {
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName(str);
        mobClickObtain.setLabelName(str2);
        mobClickObtain.setExtValueLong(j);
        C20684815ws.onEvent(mobClickObtain);
    }

    public void onEvent(String str, String str2, String str3) {
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName(str);
        mobClickObtain.setLabelName(str2);
        mobClickObtain.setExtValueString(str3);
        C20684815ws.onEvent(mobClickObtain);
    }
}
