package com.ss.android.ugc.aweme.services.external.ability;

import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;

/* JADX INFO: loaded from: classes22.dex */
public interface IAVTransformService {

    public interface ITransformCallback<T> {
        void finish(T t);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface ITransformProgress {
        void update(int i);
    }

    void video2gif(VideoShare2GifEditContext videoShare2GifEditContext, ITransformProgress iTransformProgress, ITransformCallback<Boolean> iTransformCallback);

    void video2webp(String str, String str2, int i, int i2, int i3, int i4, int i5, ITransformCallback<Integer> iTransformCallback, ITransformProgress iTransformProgress);
}
