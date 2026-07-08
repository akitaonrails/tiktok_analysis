package com.ss.lyrax.engine;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxVideoStrategyRunner {
    boolean isActive();

    void setResultListener(LyraxVideoStrategyResultListener lyraxVideoStrategyResultListener);

    void updateFeatures(LyraxVideoStrategyParams lyraxVideoStrategyParams);
}
