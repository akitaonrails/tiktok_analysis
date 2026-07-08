package com.bytedance.ies.nle.editor_jni;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
public interface INLEBrushRuntime {
    int addBrushStickerStroke(String str, Bitmap bitmap, NLERectF nLERectF);

    int addBrushStickerStroke(String str, String str2, String str3, Long l);

    int begin2DBrush(String str);

    int clear2DBrush(String str);

    int end2DBrush(String str);

    NLEBrushStickerState getBrushStickerOutState(String str, boolean z);

    int processPanEvent(String str, float f, float f2, float f3, float f4, float f5);

    int processTouchDownEvent(String str, float f, float f2, float f3, float f4, float f5);

    int processTouchUpEvent(String str, float f, float f2, float f3, float f4, float f5);

    int processTouchUpEvent2(String str, float f, float f2, float f3, float f4, float f5);

    int redo2DBrush(String str);

    int reverse2DBrush(String str);

    int saveBrushStickerContext(String str, String str2, INLEBrushSaveCallback iNLEBrushSaveCallback);

    int saveStickerBrushMask(String str, String str2, INLEBrushSaveCallback iNLEBrushSaveCallback);

    int saveStickerBrushToPng(String str, String str2, INLEBrushSaveCallback iNLEBrushSaveCallback);

    int setBrushStickerOutStateCallback(String str, INLEBrushStateCallback iNLEBrushStateCallback);

    int undo2DBrush(String str);
}
