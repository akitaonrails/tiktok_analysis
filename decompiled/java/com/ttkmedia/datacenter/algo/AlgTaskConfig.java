package com.ttkmedia.datacenter.algo;

/* JADX INFO: loaded from: classes10.dex */
public class AlgTaskConfig {
    public int mCallType;
    public String mEntrance;
    public float mTimeOut;

    public static class Builder {
        public int callType;
        public String entrance;
        public float timeout;

        public AlgTaskConfig build() {
            return new AlgTaskConfig(this.entrance, this.timeout, this.callType);
        }

        public Builder setCallType(int i) {
            this.callType = i;
            return this;
        }

        public Builder setEntrance(String str) {
            this.entrance = str;
            return this;
        }

        public Builder setTimeOut(float f) {
            this.timeout = f;
            return this;
        }
    }

    public int getCallType() {
        return this.mCallType;
    }

    public String getEntrance() {
        return this.mEntrance;
    }

    public float getTimeOut() {
        return this.mTimeOut;
    }

    public AlgTaskConfig(String str, float f, int i) {
        this.mEntrance = str;
        this.mTimeOut = f;
        this.mCallType = i;
    }
}
