package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class RTCLogConfig {
    public int logFileSize;
    public String logFilenamePrefix;
    public LocalLogLevel logLevel;
    public String logPath;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCLogConfig{log_level='");
        sbLIZ.append(this.logLevel);
        sbLIZ.append('\'');
        sbLIZ.append(", log_path='");
        sbLIZ.append(this.logPath);
        sbLIZ.append('\'');
        sbLIZ.append(", log_file_size='");
        sbLIZ.append(this.logFileSize);
        sbLIZ.append('\'');
        sbLIZ.append(", log_filename_prefix='");
        sbLIZ.append(this.logFilenamePrefix);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RTCLogConfig(LocalLogLevel localLogLevel, String str, int i, String str2) {
        this.logFileSize = 10;
        this.logLevel = localLogLevel;
        this.logPath = str;
        this.logFileSize = i;
        this.logFilenamePrefix = str2;
    }

    public static RTCLogConfig create(LocalLogLevel localLogLevel, String str, int i, String str2) {
        return new RTCLogConfig(localLogLevel, str, i, str2);
    }
}
