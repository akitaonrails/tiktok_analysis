package com.ss.android.ugc.aweme.services.effect;

import X.InterfaceC1635410sex;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes26.dex */
public interface IEffectService {

    /* JADX INFO: loaded from: classes9.dex */
    public interface OnVideoCoverCallback {
        void onGetVideoCoverFailed(int i);

        void onGetVideoCoverSuccess(Bitmap bitmap);
    }

    InterfaceC1635410sex createEffectPlatform(Context context, String str);

    InterfaceC1635410sex createFontEffectPlatform(Context context);

    InterfaceC1635410sex createMvEffectPlatform(Context context);

    InterfaceC1635410sex createMvEffectPlatform(Context context, String str);

    void fetchEffectWithMusicBind(InterfaceC1635410sex interfaceC1635410sex, String str, String str2, IFetchEffectListener iFetchEffectListener);

    void fetchEffectWithMusicBind(InterfaceC1635410sex interfaceC1635410sex, String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    String getCacheDir();

    ArrayList<String> getDraftEffectList();

    String getLiveStickerPannel();

    String getModelCacheDir();

    Size getRealVideoSize(String str);

    void getVideoCoverByCallback(List<? extends EffectPointModel> list, FilterBean filterBean, float f, int i, boolean z, AwemeDraft awemeDraft, OnVideoCoverCallback onVideoCoverCallback);

    void getVideoCoverByCallback(List<? extends EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, OnVideoCoverCallback onVideoCoverCallback);
}
