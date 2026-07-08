package com.ss.android.ugc.aweme.music.model;

/* JADX INFO: loaded from: classes10.dex */
public final class ArtistHonorLabelKt {
    public static final ArtistHonorLabel toArtistHonorLabel(int i) {
        for (ArtistHonorLabel artistHonorLabel : ArtistHonorLabel.values()) {
            if (artistHonorLabel.getValue() == i) {
                return artistHonorLabel;
            }
        }
        return null;
    }
}
