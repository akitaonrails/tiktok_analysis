package com.ss.android.ugc.aweme.tools.sticker.core;

import X.AbstractC1442160ndG;
import X.C0FKI;
import X.C1440500naa;
import X.EnumC1466150oFx;
import android.content.Context;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public interface StickerModel extends Parcelable, Serializable {
    BaseStickerModel getBaseModel();

    int getId();

    InteractStickerStruct getInteractStickerStruct();

    EnumC1466150oFx getStickerType();

    boolean isNotEmptyModel();

    boolean isVERenderSticker();

    boolean needCompile();

    AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2);

    StickerModel updateMediaSize(Pair<Integer, Integer> pair);
}
