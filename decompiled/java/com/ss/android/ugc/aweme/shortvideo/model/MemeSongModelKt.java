package com.ss.android.ugc.aweme.shortvideo.model;

/* JADX INFO: loaded from: classes30.dex */
public final class MemeSongModelKt {
    public static final MemeSongModel deepClone(MemeSongModel memeSongModel) {
        return new MemeSongModel(memeSongModel.getUri(), memeSongModel.getStyle(), memeSongModel.getTemplateId(), memeSongModel.getLyrics(), memeSongModel.getTimestampSecs(), memeSongModel.getLocalSongPath(), memeSongModel.getBgImageUrl(), memeSongModel.isSelected(), memeSongModel.getHasConsumed(), memeSongModel.getSongDuration());
    }
}
