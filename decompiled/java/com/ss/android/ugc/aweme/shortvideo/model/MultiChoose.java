package com.ss.android.ugc.aweme.shortvideo.model;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class MultiChoose implements Serializable {
    public final Map<String, String> musicFilePaths;
    public final MusicModel musicModel;

    public MultiChoose(MusicModel musicModel, Map<String, String> map) {
        this.musicModel = musicModel;
        this.musicFilePaths = map;
    }
}
