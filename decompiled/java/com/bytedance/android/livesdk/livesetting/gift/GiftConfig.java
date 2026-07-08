package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftConfig {

    @C09CT("msg_enqueue")
    public MsgEnqueueConfig _msgEnqueueConfig;

    @C09CT("receive_msg")
    public ReceiveMsgConfig _receiveMsgConfig;

    @C09CT("tray_combo")
    public TrayComboConfig _trayComboConfig;

    @C09CT("tray_dismiss")
    public TrayDismissConfig _trayDismissConfig;

    @C09CT("tray_show")
    public TrayShowConfig _trayShowConfig;

    @C09CT("tray_stay_after_combo")
    public TrayStayAfterComboConfig _trayStayAfterComboConfig;
    public static final transient GiftConfig LIZ = new GiftConfig();
    public static final TypeAdapter ADAPTER = new GiftConfig_OptTypeAdapter(NormalGson.singleton());

    public GiftConfig() {
        ReceiveMsgConfig receiveMsgConfig = ReceiveMsgConfig.LIZ;
        this._receiveMsgConfig = ReceiveMsgConfig.LIZ;
        MsgEnqueueConfig msgEnqueueConfig = MsgEnqueueConfig.LIZ;
        this._msgEnqueueConfig = MsgEnqueueConfig.LIZ;
        TrayShowConfig trayShowConfig = TrayShowConfig.LIZ;
        this._trayShowConfig = TrayShowConfig.LIZ;
        TrayComboConfig trayComboConfig = TrayComboConfig.LIZ;
        this._trayComboConfig = TrayComboConfig.LIZ;
        TrayStayAfterComboConfig trayStayAfterComboConfig = TrayStayAfterComboConfig.LIZ;
        this._trayStayAfterComboConfig = TrayStayAfterComboConfig.LIZ;
        TrayDismissConfig trayDismissConfig = TrayDismissConfig.LIZ;
        this._trayDismissConfig = TrayDismissConfig.LIZ;
    }
}
