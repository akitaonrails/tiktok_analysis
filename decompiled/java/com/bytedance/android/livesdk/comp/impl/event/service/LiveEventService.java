package com.bytedance.android.livesdk.comp.impl.event.service;

import X.AbstractC23140094w;
import X.C0PEM;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C23250099c;
import X.C2438409h0;
import X.C2441009hQ;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.bytedance.android.livesdk.comp.api.event.api.data.EventDetailData;
import com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi;
import com.bytedance.android.livesdk.comp.impl.event.widget.LivePaidEventMaskWidget;
import com.bytedance.android.livesdk.comp.impl.event.widget.LivePaidEventPreviewCardWidget;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardStartTimeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes34.dex */
public class LiveEventService implements ILiveEventService {
    @Override // com.bytedance.android.livesdk.comp.api.event.ILiveEventService
    public final Object NH2(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LIZJ(this, str, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.livesdk.comp.api.event.ILiveEventService
    public final Object ZC2(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LIZ(this, str, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.livesdk.comp.api.event.ILiveEventService
    public final Object reportPreviewInfo(String str, String str2, boolean z, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LIZIZ(this, str, str2, z, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.livesdk.comp.api.event.ILiveEventService
    public final LivePaidEventPreviewCardWidget U12() {
        return new LivePaidEventPreviewCardWidget();
    }

    @Override // com.bytedance.android.livesdk.comp.api.event.ILiveEventService
    public final LivePaidEventMaskWidget pf1(C1324720kZq c1324720kZq) {
        return new LivePaidEventMaskWidget(c1324720kZq);
    }

    @Override // com.bytedance.android.livesdk.comp.api.event.ILiveEventService
    public final Bitmap createTopBottomGradientBitmap(int i, int i2) {
        if (C2441009hQ.LJIIIIZZ(i) > C2441009hQ.LJIIIIZZ(i2)) {
            return createTopBottomGradientBitmap(i2, i);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float width = bitmapCreateBitmap.getWidth();
        float height = bitmapCreateBitmap.getHeight();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, bitmapCreateBitmap.getHeight(), i, i2, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, width, height, paint);
        return bitmapCreateBitmap;
    }

    @Override // com.bytedance.android.livesdk.comp.api.event.ILiveEventService
    public final Object getStoryStickerBgColor(ImageModel imageModel, InterfaceC1364105Vn<? super Pair<Integer, Integer>> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2438409h0(imageModel, null));
    }

    @Override // com.bytedance.android.livesdk.comp.api.event.ILiveEventService
    public final Object mk2(String str, InterfaceC1364105Vn<? super EventDetailData> interfaceC1364105Vn) {
        return LiveEventApi.LIZ.LIZ(str, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object LIZ(com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService r5, java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof X.C1AL3
            if (r0 == 0) goto L56
            r3 = r7
            X.1AL3 r3 = (X.C1AL3) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r2 = r3.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r5 = 1
            if (r0 == 0) goto L46
            if (r0 != r5) goto L5c
            java.lang.Object r6 = r3.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r2)
        L26:
            com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse r2 = (com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse) r2
            if (r2 == 0) goto L44
            long r3 = r2.code
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostEvent> r0 = com.bytedance.android.livesdkapi.host.IHostEvent.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostEvent r0 = (com.bytedance.android.livesdkapi.host.IHostEvent) r0
            if (r0 == 0) goto L3f
            r0.postRegisterEvent(r6)
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L44:
            r5 = 0
            goto L3f
        L46:
            X.C155000ia.LIZIZ(r2)
            X.1AL6 r0 = com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi.LIZ
            r3.LL = r6
            r3.LLILZ = r5
            java.lang.Object r2 = r0.LIZJ(r6, r3)
            if (r2 != r1) goto L26
            return r1
        L56:
            X.1AL3 r3 = new X.1AL3
            r3.<init>(r5, r7)
            goto L12
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService.LIZ(com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object LIZJ(com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService r5, java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof X.C1AL4
            if (r0 == 0) goto L56
            r3 = r7
            X.1AL4 r3 = (X.C1AL4) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r2 = r3.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r5 = 1
            if (r0 == 0) goto L46
            if (r0 != r5) goto L5c
            java.lang.Object r6 = r3.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r2)
        L26:
            com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse r2 = (com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse) r2
            if (r2 == 0) goto L44
            long r3 = r2.code
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostEvent> r0 = com.bytedance.android.livesdkapi.host.IHostEvent.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostEvent r0 = (com.bytedance.android.livesdkapi.host.IHostEvent) r0
            if (r0 == 0) goto L3f
            r0.postUnregisterEvent(r6)
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L44:
            r5 = 0
            goto L3f
        L46:
            X.C155000ia.LIZIZ(r2)
            X.1AL6 r0 = com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi.LIZ
            r3.LL = r6
            r3.LLILZ = r5
            java.lang.Object r2 = r0.LJ(r6, r3)
            if (r2 != r1) goto L26
            return r1
        L56:
            X.1AL4 r3 = new X.1AL4
            r3.<init>(r5, r7)
            goto L12
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService.LIZJ(com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object LIZIZ(com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService r5, java.lang.String r6, java.lang.String r7, boolean r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            boolean r0 = r9 instanceof X.C1AL5
            if (r0 == 0) goto L43
            r3 = r9
            X.1AL5 r3 = (X.C1AL5) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r2 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r5 = 1
            if (r0 == 0) goto L35
            if (r0 != r5) goto L49
            X.C155000ia.LIZIZ(r2)
        L22:
            com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventReportPreviewResponse r2 = (com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventReportPreviewResponse) r2
            if (r2 == 0) goto L33
            long r3 = r2.code
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L33
        L2e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L33:
            r5 = 0
            goto L2e
        L35:
            X.C155000ia.LIZIZ(r2)
            X.1AL6 r0 = com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi.LIZ
            r3.LLILLL = r5
            java.lang.Object r2 = r0.LIZLLL(r6, r7, r8, r3)
            if (r2 != r1) goto L22
            return r1
        L43:
            X.1AL5 r3 = new X.1AL5
            r3.<init>(r5, r9)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService.LIZIZ(com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService, java.lang.String, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.android.livesdk.comp.api.event.ILiveEventService
    public final void oe0(Context context, DataChannel dataChannel, boolean z, boolean z2, long j) {
        long id;
        String str;
        String strValueOf;
        Long lValueOf;
        Long lValueOf2;
        String str2;
        Object objGg0;
        Room room;
        User owner;
        Room room2;
        User owner2;
        Room room3;
        Long lValueOf3 = Long.valueOf(j);
        if (dataChannel != null && (room3 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room3.getId();
        } else {
            id = 0;
        }
        Map<String, String> value = LiveEventPageLynxUrl.INSTANCE.getValue();
        if (z) {
            str = value.get("event_detail_room");
        } else if (z2) {
            str = value.get("event_pin_hight");
        } else {
            str = value.get("event_pin_low");
        }
        if (str != null) {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            String strValueOf2 = "";
            if (!z) {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(lValueOf3);
            }
            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("event_id", strValueOf);
            if (id != 0) {
                strValueOf2 = String.valueOf(id);
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("room_id", strValueOf2);
            if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner2 = room2.getOwner()) != null) {
                lValueOf = Long.valueOf(owner2.getId());
            } else {
                lValueOf = null;
            }
            Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("anchor_id", String.valueOf(lValueOf));
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
                lValueOf2 = Long.valueOf(owner.getId());
            } else {
                lValueOf2 = null;
            }
            Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("user_id", String.valueOf(lValueOf2));
            if (z) {
                str2 = "profile";
            } else {
                str2 = "presentation_card";
            }
            Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("enter_from", str2);
            if (dataChannel != null) {
                objGg0 = dataChannel.gg0(LiveEventCardStartTimeChannel.class);
            } else {
                objGg0 = null;
            }
            String string = builderAppendQueryParameter5.appendQueryParameter("room_start_time", String.valueOf(objGg0)).build().toString();
            IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
            if (iHybridContainerService != null) {
                iHybridContainerService.YC1(context, string, null);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.event.ILiveEventService
    public final Object Rk1(String str, int i, String str2, long j, Integer num, int i2, AbstractC23140094w abstractC23140094w) {
        return LiveEventApi.LIZ.LIZIZ(str, i, str2, j, num, i2, abstractC23140094w);
    }
}
