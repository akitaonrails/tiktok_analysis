package com.ss.android.ugc.aweme.services.storage;

import X.InterfaceC345370DgN;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes31.dex */
public interface IAVStorageService {
    AVStorageInfo getAVStorageInfo();

    Set<String> getPrefixAllowList();

    List<InterfaceC345370DgN> getStorageList();
}
