package com.tiktok.ttr.video;

import android.graphics.SurfaceTexture;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class TTRSurfaceTexture extends SurfaceTexture {
    public final float[] mTmpMatrix;

    public TTRSurfaceTexture(int i) {
        super(i);
        this.mTmpMatrix = new float[16];
    }

    public void updateTexAndGetMatrix(ByteBuffer byteBuffer) {
        super.updateTexImage();
        super.getTransformMatrix(this.mTmpMatrix);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.order(ByteOrder.nativeOrder());
            byteBuffer.clear();
            FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
            floatBufferAsFloatBuffer.position(0);
            floatBufferAsFloatBuffer.put(this.mTmpMatrix, 0, 16);
            byteBuffer.position(0);
            byteBuffer.limit(64);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
            throw th;
        }
    }

    public TTRSurfaceTexture(int i, boolean z) {
        super(i, z);
        this.mTmpMatrix = new float[16];
    }
}
