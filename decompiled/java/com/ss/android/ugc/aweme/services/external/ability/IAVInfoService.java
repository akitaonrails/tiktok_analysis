package com.ss.android.ugc.aweme.services.external.ability;

import X.InterfaceC1631630sYr;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public interface IAVInfoService {

    public interface IFilterMedia<T> {
        boolean filter(T t);
    }

    public interface IGetInfoCallback<T> {
        void finish(T t);
    }

    public interface VEFrameAvailableListener {
        boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3);
    }

    void audioLegal(Context context, List<? extends MusicModel> list, IFilterMedia<Integer> iFilterMedia, IGetInfoCallback<List<MusicModel>> iGetInfoCallback);

    void audioLegal(String str, int i, IGetInfoCallback<Integer> iGetInfoCallback);

    int getMusicDuration(String str);

    void importLegal(Context context, String str, boolean z, int i, int i2, Function2<? super String, ? super Long, Unit> function2, InterfaceC1631630sYr<? super String, ? super Long, ? super Integer, ? super String, Unit> interfaceC1631630sYr);

    void mp3Legal(Context context, String str, IGetInfoCallback<Integer> iGetInfoCallback);

    void mp3Legal(String str, IGetInfoCallback<Integer> iGetInfoCallback);

    int[] photoInfo(String str);

    boolean supportTrimmedMuisc(MusicModel musicModel);

    void videoCover(AwemeDraft awemeDraft, IGetInfoCallback<Bitmap> iGetInfoCallback);

    void videoInfo(String str, boolean z, IGetInfoCallback<int[]> iGetInfoCallback);
}
