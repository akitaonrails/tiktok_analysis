package com.ss.android.ugc.aweme.comment.model;

import X.C123100dR;

/* JADX INFO: loaded from: classes22.dex */
public final class AudioCommentModelKt {
    public static final String getPlayId(AudioCommentModel audioCommentModel) {
        if (C123100dR.LIZ(audioCommentModel.audioFilePath)) {
            return audioCommentModel.audioFilePath;
        }
        String str = audioCommentModel.vid;
        if (str == null) {
            return "";
        }
        return str;
    }
}
