package com.bytedance.crash;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface AttachUserData {
    Map<? extends String, ? extends String> getUserData(CrashType crashType);
}
