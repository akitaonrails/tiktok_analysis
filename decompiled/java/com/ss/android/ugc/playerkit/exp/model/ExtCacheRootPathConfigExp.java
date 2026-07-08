package com.ss.android.ugc.playerkit.exp.model;

import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class ExtCacheRootPathConfigExp {
    public Map<String, Boolean> removeOldRootPath;
    public Map<String, Integer> rootPathTypeConfig;

    public Map<String, Integer> getConfig() {
        return this.rootPathTypeConfig;
    }

    public Map<String, Boolean> getRemoveOldRootPath() {
        return this.removeOldRootPath;
    }
}
