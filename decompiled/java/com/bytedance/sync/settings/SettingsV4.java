package com.bytedance.sync.settings;

import X.C09CT;
import X.InterfaceC1525970poR;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes24.dex */
public class SettingsV4 implements InterfaceC1525970poR {

    @C09CT("channel")
    public int channel;

    @C09CT("enable_reconnect_poll")
    public boolean enableReconnectPoll;

    @C09CT("switch_sync_poll")
    public boolean switchSyncPoll;

    @C09CT("version")
    public int version;

    @C09CT("sync")
    public int sync = 60;

    @C09CT("poll")
    public int poll = 600;

    @C09CT("background_sync")
    public int backgroundSync = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    @C09CT("background_poll")
    public int backgroundPoll = 1200;

    @C09CT("report_size_limit")
    public int reportSizeLimit = 6144;

    @C09CT("submit_size_limit")
    public int submitSizeLimit = 51200;

    @C09CT("db_store_size_limit")
    public int dbStoreSizeLimit = 51200;

    @C09CT("event_change_interval")
    public int eventChangeInterval = 5;

    @C09CT("is_compress")
    public int isCompress = 1;

    @C09CT("history_size_limit")
    public int historyLimit = 10;

    @C09CT("poll_interval_limit")
    public int pollIntervalLimit = 5000;

    @C09CT("poll_try")
    public int pollTry = 1;

    @C09CT("reconnect_poll_interval")
    public int reconnectPollInterval = 3;

    @C09CT("enable_batch_ack")
    public boolean enableBatchAck = true;

    @C09CT("batch_ack_interval")
    public int batchAckInterval = 5;

    @C09CT("batch_ack_count")
    public int batchAckCount = 10;

    @Override // X.InterfaceC1525970poR
    public final int LIZIZ() {
        int i = this.batchAckCount;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    @Override // X.InterfaceC1525970poR
    public final boolean LIZLLL() {
        return this.isCompress > 0;
    }

    @Override // X.InterfaceC1525970poR
    public final int LJ() {
        int i = this.batchAckInterval;
        if (i <= 0) {
            return 5;
        }
        return i;
    }

    @Override // X.InterfaceC1525970poR
    public final boolean LJIIIIZZ() {
        return this.channel == 0;
    }

    @Override // X.InterfaceC1525970poR
    public final long LJIIIZ() {
        return this.eventChangeInterval;
    }

    @Override // X.InterfaceC1525970poR
    public final int LIZ() {
        return this.sync;
    }

    @Override // X.InterfaceC1525970poR
    public final boolean LIZJ() {
        return this.enableReconnectPoll;
    }

    @Override // X.InterfaceC1525970poR
    public final int LJFF() {
        return this.historyLimit;
    }

    @Override // X.InterfaceC1525970poR
    public final int LJI() {
        return this.reportSizeLimit;
    }

    @Override // X.InterfaceC1525970poR
    public final int LJII() {
        return this.backgroundPoll;
    }

    @Override // X.InterfaceC1525970poR
    public final int LJIIJ() {
        return this.dbStoreSizeLimit;
    }

    @Override // X.InterfaceC1525970poR
    public final int LJIIJJI() {
        return this.backgroundSync;
    }

    @Override // X.InterfaceC1525970poR
    public final boolean LJIIL() {
        return this.enableBatchAck;
    }

    @Override // X.InterfaceC1525970poR
    public final int LJIILIIL() {
        return this.reconnectPollInterval;
    }

    @Override // X.InterfaceC1525970poR
    public final int poll() {
        return this.poll;
    }
}
