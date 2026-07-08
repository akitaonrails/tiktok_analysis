package com.ss.android.ugc.aweme.services.external.ability;

import X.InterfaceC1325800kba;
import X.InterfaceC1364105Vn;
import X.InterfaceC1635410sex;
import X.InterfaceC1904907d9;
import X.InterfaceC2385309Wh;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public interface IAVEffectService {

    public static final class DefaultImpls {
    }

    public interface EffectPlatformLoader {
        void load(InterfaceC2385309Wh<InterfaceC1635410sex, Void> interfaceC2385309Wh);
    }

    /* JADX INFO: loaded from: classes31.dex */
    public interface IAVEffectReadyCallback<T> {
        void finish(T t);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface OnFetchResult {
        void onResult(String str);
    }

    /* JADX INFO: loaded from: classes31.dex */
    public interface ResourceFinder {
        long createNativeMD5ResourceFinder(long j);

        long createNativeResourceFinder(long j);

        void release(long j);
    }

    void buildEffectPlatform(Context context, IAVEffectReadyCallback<InterfaceC1635410sex> iAVEffectReadyCallback, Function1<? super EffectPlatformBuilder, Unit> function1);

    void buildEffectPlatform(Context context, boolean z, IAVEffectReadyCallback<InterfaceC1635410sex> iAVEffectReadyCallback, Function1<? super EffectPlatformBuilder, Unit> function1);

    int checkUrlValid(String str);

    void clearCacheInFTC();

    void fetchEffectListResource(List<String> list, Map<String, String> map, boolean z, InterfaceC1635410sex interfaceC1635410sex, IFetchEffectListListener iFetchEffectListListener);

    void fetchEffectModel(String[] strArr, IAVEffectReadyCallback<String[]> iAVEffectReadyCallback);

    void fetchEffectResource(String str, boolean z, Map<String, String> map, InterfaceC1635410sex interfaceC1635410sex, IFetchEffectListener iFetchEffectListener);

    void fetchEffectResourcePathById(String str, OnFetchResult onFetchResult);

    Object generateAppEffectId(InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    Function1<EffectPlatformBuilder, Unit> getEffectPlatformDefaultRegionCallback();

    String getEffectSDKVersion();

    Object getEffects(String str, String str2, InterfaceC1364105Vn<? super CategoryPageModel> interfaceC1364105Vn);

    InterfaceC1904907d9 getEpRequestInterceptor();

    InterfaceC1325800kba getVideoCoverBitmapCache(LifecycleOwner lifecycleOwner, String str, int i, int i2, int i3, float f, boolean z);

    boolean isEffectControlGame(Effect effect);

    void provideResourceFinder(IAVEffectReadyCallback<ResourceFinder> iAVEffectReadyCallback);

    void updateRecentEffect(String str, List<String> list, Map<String, String> map);
}
