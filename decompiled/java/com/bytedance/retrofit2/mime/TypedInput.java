package com.bytedance.retrofit2.mime;

import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public interface TypedInput {
    InputStream in();

    long length();

    String mimeType();
}
