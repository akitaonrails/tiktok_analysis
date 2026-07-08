package com.ss.android.ugc.aweme.comment.model;

import X.C2188811AlT;
import android.text.Editable;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInputContent {
    public List<AudioCommentModel> audioList;
    public List<CommentImageModel> imageList;
    public CommentStickerStruct stickerStruct;
    public Editable text;
    public String uniqueId;

    public CommentInputContent() {
        this("", null, null, null, null);
    }

    public final CommentInputContent copy(String str, Editable editable, List<CommentImageModel> list, CommentStickerStruct commentStickerStruct, List<AudioCommentModel> list2) {
        return new CommentInputContent(str, editable, list, commentStickerStruct, list2);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentInputContent(uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(", text=");
        sbLIZ.append((Object) this.text);
        sbLIZ.append(", imageList=");
        sbLIZ.append(this.imageList);
        sbLIZ.append(", stickerStruct=");
        sbLIZ.append(this.stickerStruct);
        sbLIZ.append(", audioList=");
        sbLIZ.append(this.audioList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean hasContent() {
        if (this.text != null && (!a0.LJJJIL(r0))) {
            return true;
        }
        if ((this.imageList != null && (!r0.isEmpty())) || this.stickerStruct != null) {
            return true;
        }
        List<AudioCommentModel> list = this.audioList;
        return list != null && (list.isEmpty() ^ true);
    }

    public final void setAudioList(List<AudioCommentModel> list) {
        this.audioList = list;
    }

    public final void setImageList(List<CommentImageModel> list) {
        this.imageList = list;
    }

    public final void setStickerStruct(CommentStickerStruct commentStickerStruct) {
        this.stickerStruct = commentStickerStruct;
    }

    public final void setText(Editable editable) {
        this.text = editable;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public CommentInputContent(String str, Editable editable, List<CommentImageModel> list, CommentStickerStruct commentStickerStruct, List<AudioCommentModel> list2) {
        this.uniqueId = str;
        this.text = editable;
        this.imageList = list;
        this.stickerStruct = commentStickerStruct;
        this.audioList = list2;
    }
}
