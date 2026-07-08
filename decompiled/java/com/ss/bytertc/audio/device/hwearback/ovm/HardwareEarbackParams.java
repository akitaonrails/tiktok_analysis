package com.ss.bytertc.audio.device.hwearback.ovm;

import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public class HardwareEarbackParams {
    public List<Play> playParamsList;
    public List<Record> recordParamsList;

    public static class Play {
        public int flags;
        public int format;
        public int sampleRate;
        public int streamType;
        public int version;
    }

    public static class Record {
        public int flags;
        public int format;
        public int sampleRate;
        public int source;
        public int streamType;
        public int version;
    }
}
