package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class SlardarExemptionSchema {
    public static final TypeAdapter ADAPTER = new SlardarExemptionSchema_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_slardar_event_exemption_list")
    public ArrayList<String> liveSlardarEventExemptionList = new ArrayList<>();

    @C09CT("live_slardar_exemption_enabled")
    public boolean liveSlardarExemptionEnabled;
}
