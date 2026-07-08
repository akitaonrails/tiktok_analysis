package com.ss.android.ugc.aweme.liveevent;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.tux.sheet.BaseSheet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import webcast.api.room.PreviewTimeReportResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface ILiveEventOuterService {
    Bitmap createTopBottomGradientBitmap(int i, int i2);

    boolean enableAnchorPeriodicLiveEvent();

    boolean enableCreateLiveEventInGroupChat();

    boolean getAnchorManagerABConfigIfFullRollout();

    boolean getAnchorManagerABConfigWithSubParam(String str);

    String getLiveEventCreateSchema();

    String getLiveEventListSchema();

    String getLiveEventSchemaInGroupChat();

    boolean getLiveEventShieldConfirmValue();

    boolean getLiveEventSimplifyCreateEnable();

    void getLiveEventUser(Context context, long j, LifecycleOwner lifecycleOwner, Function1<? super Pair<? extends List<Long>, ? extends List<String>>, Unit> function1, Function0<Unit> function0);

    boolean getPublishPageCreationEnable();

    Object getStoryStickerBgColor(ImageModel imageModel, InterfaceC1364105Vn<? super Pair<Integer, Integer>> interfaceC1364105Vn);

    void inviteLiveEventUser(Context context, long j, List<Long> list, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Function0<Unit> function02);

    void openLiveEventBgMaskSparkContainer(Context context, String str, String str2);

    void openLiveEventSparkContainer(Context context, String str, String str2);

    void reportLinkMicRelatedEvent(String str, Map<String, String> map);

    C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> reportPaidEventPreviewTime(long j, long j2);

    void setLiveEventShieldConfirmValue(boolean z);

    void showLiveEventSelectionDialog(Context context, String str, boolean z, float f, int i, Function2<? super BaseSheet, ? super Integer, Unit> function2, Function2<? super BaseSheet, ? super Integer, Unit> function22, Function2<? super BaseSheet, ? super Integer, Unit> function23, Function1<? super BaseSheet, Unit> function1);

    void startStoryEditFromLiveEvent(Context context, String str, String str2, Number number, String str3);
}
