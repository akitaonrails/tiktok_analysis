package com.bytedance.ies.abmock;

/* JADX INFO: loaded from: classes5.dex */
public class ConfigItem {
    public Object defaultValue;
    public boolean isAB;
    public boolean isHybrid;
    public boolean isLaunch;
    public SaveConfigType$ConfigType type;

    public ConfigItem(SaveConfigType$ConfigType saveConfigType$ConfigType, Object obj, boolean z) {
        this.type = saveConfigType$ConfigType;
        this.defaultValue = obj;
        this.isAB = z;
    }

    public ConfigItem(SaveConfigType$ConfigType saveConfigType$ConfigType, Object obj, boolean z, boolean z2) {
        this.type = saveConfigType$ConfigType;
        this.defaultValue = obj;
        this.isAB = z;
        this.isHybrid = z2;
    }

    public ConfigItem(SaveConfigType$ConfigType saveConfigType$ConfigType, Object obj, boolean z, boolean z2, boolean z3) {
        this.type = saveConfigType$ConfigType;
        this.defaultValue = obj;
        this.isAB = z;
        this.isLaunch = z2;
        this.isHybrid = z3;
    }
}
