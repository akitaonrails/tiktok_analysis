package com.ss.android.ugc.aweme.api;

import android.content.Intent;

/* JADX INFO: loaded from: classes17.dex */
public interface ISandboxService {

    public static final class DefaultImpls {
        public static void appendDataFlowId(ISandboxService iSandboxService, Intent intent, int i) {
        }

        public static boolean needInterceptBySandbox(ISandboxService iSandboxService, Intent intent, int i) {
            return false;
        }
    }

    void appendDataFlowId(Intent intent, int i);

    boolean needInterceptBySandbox(Intent intent, int i);
}
