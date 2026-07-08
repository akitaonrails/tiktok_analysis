package com.ss.android.ugc.aweme.comment.model;

import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoCacheModel implements Serializable {
    public final ArrayList<CommentImageModel> data;
    public final transient Intent intent;
    public final String outPage;
    public final int panelSessionCode;
    public final int requestCode;
    public final int resultCode;

    public PhotoCacheModel(Intent intent, int i, int i2, ArrayList<CommentImageModel> arrayList, String str, int i3) {
        this.intent = intent;
        this.requestCode = i;
        this.resultCode = i2;
        this.data = arrayList;
        this.outPage = str;
        this.panelSessionCode = i3;
    }
}
