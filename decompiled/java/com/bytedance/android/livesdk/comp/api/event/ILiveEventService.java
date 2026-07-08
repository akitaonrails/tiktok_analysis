package com.bytedance.android.livesdk.comp.api.event;

import X.AbstractC23140094w;
import X.C006A;
import X.C1324720kZq;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.event.api.data.EventDetailData;
import com.bytedance.android.livesdk.comp.impl.event.widget.LivePaidEventMaskWidget;
import com.bytedance.android.livesdk.comp.impl.event.widget.LivePaidEventPreviewCardWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public interface ILiveEventService extends C006A {
    Object NH2(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Object Rk1(String str, int i, String str2, long j, Integer num, int i2, AbstractC23140094w abstractC23140094w);

    LivePaidEventPreviewCardWidget U12();

    Object ZC2(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Bitmap createTopBottomGradientBitmap(int i, int i2);

    Object getStoryStickerBgColor(ImageModel imageModel, InterfaceC1364105Vn<? super Pair<Integer, Integer>> interfaceC1364105Vn);

    Object mk2(String str, InterfaceC1364105Vn<? super EventDetailData> interfaceC1364105Vn);

    void oe0(Context context, DataChannel dataChannel, boolean z, boolean z2, long j);

    LivePaidEventMaskWidget pf1(C1324720kZq c1324720kZq);

    Object reportPreviewInfo(String str, String str2, boolean z, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);
}
