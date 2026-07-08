package com.ss.android.ugc.aweme.services;

/* JADX INFO: loaded from: classes28.dex */
public interface IPreloadVESo {
    long getPreLoadVESoCostTime();

    PreloadVESoStatus getPreLoadVESoStatus();

    void makeSureVESoLoaded();

    void preLoadVESo();
}
