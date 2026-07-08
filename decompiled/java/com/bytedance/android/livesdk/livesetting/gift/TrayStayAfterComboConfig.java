package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class TrayStayAfterComboConfig {

    @C09CT("first_send_extends_duration")
    public int _firstSendExtendsDuration;

    @C09CT("fix_duration")
    public int _fixDuration;
    public static final transient TrayStayAfterComboConfig LIZ = new TrayStayAfterComboConfig();
    public static final TypeAdapter ADAPTER = new TrayStayAfterComboConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("stay_type")
    public String _stayType = "";

    @C09CT("dynamic_duration")
    public List<Integer> _dynamicDuration = C13BV.INSTANCE;
}
