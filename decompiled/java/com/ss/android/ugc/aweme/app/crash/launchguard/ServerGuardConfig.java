package com.ss.android.ugc.aweme.app.crash.launchguard;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ServerGuardConfig implements Serializable {
    public List<ExceptionInfo> emergencyList;
    public List<ExceptionInfo> rollbackList;

    public static class ExceptionInfo implements Serializable {
        public String exceptionMessage;
        public String exceptionName;
        public String exceptionStack;
    }
}
