package com.bytedance.byted_bach_sdk.input;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class BachBitmapInput implements BachAlgorithmInput {
    public Bitmap m_bitmap;

    @Override // com.bytedance.byted_bach_sdk.input.BachAlgorithmInput
    public int getInputType() {
        return 1;
    }

    @Override // com.bytedance.byted_bach_sdk.input.BachAlgorithmInput
    public Bitmap getInput() {
        return this.m_bitmap;
    }

    public BachBitmapInput(Bitmap bitmap) {
        this.m_bitmap = bitmap;
    }
}
