package com.ss.android.ugc.aweme.utils;

import X.C0ZYD;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public interface IChatCustomizeImageLoadHelper {
    public static final C0ZYD LIZ = C0ZYD.LIZ;

    boolean canSkipDefaultLoad(MessageBubbleStyle messageBubbleStyle);

    void clearCache();

    Object getImageDrawable(MessageBubbleStyle messageBubbleStyle, Context context, boolean z, InterfaceC1364105Vn<? super Drawable> interfaceC1364105Vn);

    Drawable getLoadedDrawable(MessageBubbleStyle messageBubbleStyle, boolean z);

    Object loadPreviewImage(SmartImageView smartImageView, MessageBubbleStyle messageBubbleStyle, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object preloadAllImagesFromWeb(Context context, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void preloadImage(Set<String> set);

    Object preloadSettableImagesFromWeb(Context context, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void prepareCache();
}
