package com.bytedance.ies.sdk.widgets;

import X.C0ULM;
import X.InterfaceC2262151DgT;

/* JADX INFO: loaded from: classes36.dex */
public interface RecyclableWidgetEventListener extends InterfaceC2262151DgT {
    @Override // X.InterfaceC2262151DgT
    /* bridge */ /* synthetic */ void onHide(C0ULM c0ulm, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC2262151DgT
    /* bridge */ /* synthetic */ void onPostCreate(C0ULM c0ulm, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC2262151DgT
    /* bridge */ /* synthetic */ void onPostCreateView(C0ULM c0ulm, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC2262151DgT
    /* bridge */ /* synthetic */ void onPostDestroy(C0ULM c0ulm, com.bytedance.android.widget.Widget widget);

    void onPostInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget);

    void onPostLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget);

    void onPostUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget);

    @Override // X.InterfaceC2262151DgT
    /* bridge */ /* synthetic */ void onPreCreate(C0ULM c0ulm, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC2262151DgT
    /* bridge */ /* synthetic */ void onPreCreateView(C0ULM c0ulm, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC2262151DgT
    /* bridge */ /* synthetic */ void onPreDestroy(C0ULM c0ulm, com.bytedance.android.widget.Widget widget);

    void onPreInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget);

    void onPreLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget);

    void onPreUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget);

    @Override // X.InterfaceC2262151DgT
    /* bridge */ /* synthetic */ void onShow(C0ULM c0ulm, com.bytedance.android.widget.Widget widget);

    @Override // X.InterfaceC2262151DgT
    /* bridge */ /* synthetic */ void onWidgetPreRequestLoading(C0ULM c0ulm, com.bytedance.android.widget.Widget widget, boolean z);

    @Override // X.InterfaceC2262151DgT
    /* bridge */ /* synthetic */ void onWidgetRequestLoading(C0ULM c0ulm, com.bytedance.android.widget.Widget widget, boolean z);
}
