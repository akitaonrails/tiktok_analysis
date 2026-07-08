package com.ss.android.ugc.aweme.account.util;

import X.InterfaceC742080T9a;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;

/* JADX INFO: loaded from: classes13.dex */
public final class Ticker implements WeakHandler.IHandler {
    public long mDuration;
    public WeakHandler mHandler = new WeakHandler(this);
    public InterfaceC742080T9a mListener;
    public long mRemainTick;
    public long mStartTime;

    public void setListener(InterfaceC742080T9a interfaceC742080T9a) {
    }

    public void start() {
        long jCurrentTimeMillis = this.mDuration - ((System.currentTimeMillis() - this.mStartTime) / 1000);
        this.mRemainTick = jCurrentTimeMillis;
        if (jCurrentTimeMillis <= 0) {
            this.mRemainTick = 0L;
        } else {
            this.mHandler.sendEmptyMessageDelayed(101, 1000L);
        }
    }

    public void stop() {
        this.mHandler.removeMessages(101);
    }

    public void reset() {
        stop();
        this.mRemainTick = 0L;
    }

    public long getRemainTick() {
        return this.mRemainTick;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        long j = this.mRemainTick - 1;
        this.mRemainTick = j;
        if (j <= 0) {
            this.mRemainTick = 0L;
        } else {
            this.mHandler.sendEmptyMessageDelayed(101, 1000L);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("ticker_start_time", this.mStartTime);
        bundle.putLong("ticker_duration", this.mDuration);
        if (this.mHandler.hasMessages(101)) {
            bundle.putBoolean("ticker_is_running", true);
            stop();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mStartTime = bundle.getLong("ticker_start_time", 0L);
        this.mDuration = bundle.getLong("ticker_duration", 0L);
        if (bundle.getBoolean("ticker_is_running", false)) {
            start();
        }
    }

    public void setRemainTick(long j) {
        this.mRemainTick = j;
    }

    public void setStartTime(long j) {
        this.mStartTime = j;
    }

    public void restart(long j, int i) {
        stop();
        this.mStartTime = j;
        this.mDuration = i;
        start();
    }

    public Ticker(long j, int i, InterfaceC742080T9a interfaceC742080T9a) {
        this.mStartTime = j;
        this.mDuration = i;
    }

    public void restart(long j, int i, InterfaceC742080T9a interfaceC742080T9a) {
        stop();
        this.mStartTime = j;
        this.mDuration = i;
        start();
    }

    public void start(long j, int i, InterfaceC742080T9a interfaceC742080T9a) {
        long jCurrentTimeMillis = ((long) i) - ((System.currentTimeMillis() - j) / 1000);
        this.mRemainTick = jCurrentTimeMillis;
        if (jCurrentTimeMillis <= 0) {
            this.mRemainTick = 0L;
        } else {
            this.mHandler.sendEmptyMessageDelayed(101, 1000L);
        }
        if (interfaceC742080T9a != null) {
            interfaceC742080T9a.LIZIZ();
        }
    }
}
