package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class TrayComboConfig {

    @C09CT("animation_duration")
    public List<Integer> _animationDuration;

    @C09CT("combo_type")
    public String _comboType;

    @C09CT("dynamic_jump_interval")
    public List<Integer> _jumpInterval;
    public static final transient TrayComboConfig LIZ = new TrayComboConfig();
    public static final TypeAdapter ADAPTER = new TrayComboConfig_OptTypeAdapter(NormalGson.singleton());

    public TrayComboConfig() {
        C13BV c13bv = C13BV.INSTANCE;
        this._animationDuration = c13bv;
        this._comboType = "";
        this._jumpInterval = c13bv;
    }
}
