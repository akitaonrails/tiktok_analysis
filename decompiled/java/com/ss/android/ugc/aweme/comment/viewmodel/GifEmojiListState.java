package com.ss.android.ugc.aweme.comment.viewmodel;

import X.C004I;
import X.C1761680vwc;
import X.C2188811AlT;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class GifEmojiListState implements C004I {
    public static final int $stable = 8;
    public final String awemeId;
    public final String keyword;
    public final ListState<GifEmoji, C1761680vwc> listState;

    public GifEmojiListState() {
        this("", "", new ListState(new C1761680vwc(3), null, null, null, null, 30, null));
    }

    public final GifEmojiListState copy(String str, String str2, ListState<GifEmoji, C1761680vwc> listState) {
        return new GifEmojiListState(str, str2, listState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GifEmojiListState)) {
            return false;
        }
        GifEmojiListState gifEmojiListState = (GifEmojiListState) obj;
        return Intrinsics.LJFF(this.keyword, gifEmojiListState.keyword) && Intrinsics.LJFF(this.awemeId, gifEmojiListState.awemeId) && Intrinsics.LJFF(this.listState, gifEmojiListState.listState);
    }

    public int hashCode() {
        return (((this.keyword.hashCode() * 31) + this.awemeId.hashCode()) * 31) + this.listState.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GifEmojiListState(keyword=");
        sbLIZ.append(this.keyword);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.listState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final ListState<GifEmoji, C1761680vwc> getListState() {
        return this.listState;
    }

    public GifEmojiListState(String str, String str2, ListState<GifEmoji, C1761680vwc> listState) {
        this.keyword = str;
        this.awemeId = str2;
        this.listState = listState;
    }
}
