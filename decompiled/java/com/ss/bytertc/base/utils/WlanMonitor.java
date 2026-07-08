package com.ss.bytertc.base.utils;

/* JADX INFO: loaded from: classes36.dex */
public final class WlanMonitor {
    public static ConnectionInfo[] getConnectionInfos() {
        return null;
    }

    public static int getFrequency() {
        return 0;
    }

    public static InterfaceInfo[] getInterfaceInfos() {
        return null;
    }

    public static ScanResultInfo[] getScanResultInfos() {
        return null;
    }

    public static int getSignalQuality() {
        return 0;
    }

    public static class ConnectionInfo {
        public String ifName;
        public int noise;
        public int rssi;
        public int rxRate;
        public int txRate;

        public String getIfName() {
            return this.ifName;
        }

        public int getNoise() {
            return this.noise;
        }

        public int getRssi() {
            return this.rssi;
        }

        public int getRxRate() {
            return this.rxRate;
        }

        public int getTxRate() {
            return this.txRate;
        }

        public ConnectionInfo(String str, int i, int i2, int i3, int i4) {
            this.ifName = str;
            this.rssi = i;
            this.noise = i2;
            this.txRate = i3;
            this.rxRate = i4;
        }
    }

    public static class InterfaceInfo {
        public int channelWidth;
        public int channleNum;
        public int frequency;
        public String ifName;
        public int phyMode;
        public boolean state;

        public int getChannelWidth() {
            return this.channelWidth;
        }

        public int getChannleNum() {
            return this.channleNum;
        }

        public int getFrequency() {
            return this.frequency;
        }

        public String getIfName() {
            return this.ifName;
        }

        public int getPhyMode() {
            return this.phyMode;
        }

        public boolean getState() {
            return this.state;
        }

        public InterfaceInfo(String str, boolean z, int i, int i2, int i3, int i4) {
            this.ifName = str;
            this.state = z;
            this.frequency = i;
            this.phyMode = i2;
            this.channleNum = i3;
            this.channelWidth = i4;
        }
    }

    public static class ScanResultInfo {
        public int channelWidth;
        public int channleNum;
        public int frequency;
        public int noise;
        public int rssi;

        public int getChannelWidth() {
            return this.channelWidth;
        }

        public int getChannleNum() {
            return this.channleNum;
        }

        public int getFrequency() {
            return this.frequency;
        }

        public int getNoise() {
            return this.noise;
        }

        public int getRssi() {
            return this.rssi;
        }

        public ScanResultInfo(int i, int i2, int i3, int i4, int i5) {
            this.frequency = i;
            this.channleNum = i2;
            this.channelWidth = i3;
            this.rssi = i4;
            this.noise = i5;
        }
    }
}
