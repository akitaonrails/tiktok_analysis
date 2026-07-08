package com.heytap.mcssdk.liquid;

/* JADX INFO: loaded from: classes14.dex */
public class SettingChangeBean {
    public int changeType;
    public int switchStatus;

    public int getChangeType() {
        return this.changeType;
    }

    public int getSwitchStatus() {
        return this.switchStatus;
    }

    public void setChangeType(int i) {
        this.changeType = i;
    }

    public void setSwitchStatus(int i) {
        this.switchStatus = i;
    }

    public String toString() {
        return "SettingChangeBean{changeType=" + this.changeType + ", switchStatus=" + this.switchStatus + '}';
    }
}
