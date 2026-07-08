package com.bytedance.realx.video;

import X.C1C7U;
import X.C2188811AlT;
import android.graphics.Matrix;
import android.opengl.GLES20;
import com.bytedance.realx.base.JniCommon;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.GlGenericDrawer;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class YuvConverter {
    public static float[] TEX_MATRIX = new float[16];
    public final GlGenericDrawer drawer;
    public final GlTextureFrameBuffer i420TextureFrameBuffer;
    public GlRectDrawer mTextureDrawer;
    public final ShaderCallbacks shaderCallbacks;
    public final ThreadUtils.ThreadChecker threadChecker;
    public List<Integer> mTextureFreeQueue = new LinkedList();
    public List<Integer> mTextureUsedQueue = new LinkedList();
    public HashMap<Integer, Integer> mTextureWidthMap = new HashMap<>();
    public HashMap<Integer, Integer> mTextureHeightMap = new HashMap<>();
    public int mTextureCnt = 0;
    public int mFrameBufferId = 0;

    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        public float[] coeffs;
        public int coeffsLoc;
        public float stepSize;
        public int xUnitLoc;
        public static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        public static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        public static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

        public void setPlaneU() {
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneY() {
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }

        public ShaderCallbacks() {
        }

        @Override // com.bytedance.realx.video.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // com.bytedance.realx.video.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i5 = this.xUnitLoc;
            float f = this.stepSize;
            float f2 = i;
            GLES20.glUniform2f(i5, (fArr[0] * f) / f2, (f * fArr[1]) / f2);
        }
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        GlRectDrawer glRectDrawer = this.mTextureDrawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.mTextureDrawer = null;
        }
        int i = this.mFrameBufferId;
        if (i > 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.mFrameBufferId = 0;
        }
        List<Integer> list = this.mTextureFreeQueue;
        if (list != null && list.size() > 0) {
            Iterator<Integer> it2 = this.mTextureFreeQueue.iterator();
            while (it2.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it2.next().intValue()}, 0);
            }
            this.mTextureFreeQueue.clear();
        }
        List<Integer> list2 = this.mTextureUsedQueue;
        if (list2 != null && list2.size() > 0) {
            Iterator<Integer> it3 = this.mTextureUsedQueue.iterator();
            while (it3.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it3.next().intValue()}, 0);
            }
            this.mTextureUsedQueue.clear();
        }
        this.threadChecker.detachThread();
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer("uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n", shaderCallbacks);
        threadChecker.detachThread();
    }

    public static /* synthetic */ void lambda$convert$0(ByteBuffer byteBuffer) {
        C1C7U.LIZ("YuvConverter@6958.convert$1L");
        JniCommon.nativeFreeByteBuffer(byteBuffer);
        C1C7U.LIZIZ("YuvConverter@6958.convert$1L");
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        return convert(textureBuffer, FilterType.Origin, 0, 0);
    }

    public void queueTexture(int i) {
        List<Integer> list = this.mTextureUsedQueue;
        if (list != null && list.contains(Integer.valueOf(i))) {
            this.mTextureUsedQueue.remove(new Integer(i));
            List<Integer> list2 = this.mTextureFreeQueue;
            if (list2 != null) {
                list2.add(Integer.valueOf(i));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        r0 = generateTexture(3553, r8, r9);
        r4[0] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        if (r0 <= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        r7.mTextureUsedQueue.add(java.lang.Integer.valueOf(r0));
        r7.mTextureWidthMap.put(java.lang.Integer.valueOf(r4[0]), java.lang.Integer.valueOf(r8));
        r7.mTextureHeightMap.put(java.lang.Integer.valueOf(r4[0]), java.lang.Integer.valueOf(r9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int dequeueTexture(int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.video.YuvConverter.dequeueTexture(int, int):int");
    }

    private int generateTexture(int i, int i2, int i3) {
        if (this.mTextureCnt == 45) {
            return 0;
        }
        int iGenerateTexture = GlUtil.generateTexture(i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iGenerateTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        if (GLES20.glGetError() != 0) {
            return 0;
        }
        this.mTextureCnt++;
        return iGenerateTexture;
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer, FilterType filterType, int i, int i2) {
        this.threadChecker.checkIsOnValidThread();
        GlUtil.clearGLES2Error("YUVConverter");
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i3 = ((width + 63) / 64) * 64;
        int i4 = ((width + 7) / 8) * 8;
        int i5 = (height + 1) / 2;
        int i6 = height + i5;
        final ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i3 * i6) + i3);
        if (byteBufferNativeAllocateByteBuffer == null) {
            return null;
        }
        int i7 = i3 / 4;
        int i8 = i4 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        if (i4 != width) {
            matrix.preScale((i4 * 1.0f) / width, 1.0f);
        }
        this.i420TextureFrameBuffer.setSize(i7, i6);
        GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setPlaneY();
        RTCVideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, 0, i8, height, filterType, i, i2);
        this.shaderCallbacks.setPlaneU();
        int i9 = i8 / 2;
        RTCVideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, height, i9, i5, filterType, i, i2);
        this.shaderCallbacks.setPlaneV();
        RTCVideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, i7 / 2, height, i9, i5, filterType, i, i2);
        GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, byteBufferNativeAllocateByteBuffer);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("convert i420 failed as opengl error ");
            sbLIZ.append(iGlGetError);
            Logging.e("YUVConverter", C2188811AlT.LIZIZ(sbLIZ));
            if (1285 != iGlGetError && 1282 != iGlGetError) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("YuvConverter.convert: GLES20 error: ");
                sbLIZ2.append(iGlGetError);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            JniCommon.nativeFreeByteBuffer(byteBufferNativeAllocateByteBuffer);
            return null;
        }
        GLES20.glBindFramebuffer(36160, 0);
        int i10 = i3 * height;
        int i11 = i3 / 2;
        int i12 = i10 + i11;
        byteBufferNativeAllocateByteBuffer.position(0);
        byteBufferNativeAllocateByteBuffer.limit(i10);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i10);
        int i13 = ((i5 - 1) * i3) + i11;
        byteBufferNativeAllocateByteBuffer.limit(i10 + i13);
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i12);
        byteBufferNativeAllocateByteBuffer.limit(i12 + i13);
        return JavaI420Buffer.wrap(width, height, byteBufferSlice, i3, byteBufferSlice2, i3, byteBufferNativeAllocateByteBuffer.slice(), i3, new Runnable() { // from class: X.0jPt
            @Override // java.lang.Runnable
            public final void run() {
                YuvConverter.lambda$convert$0(byteBufferNativeAllocateByteBuffer);
            }
        });
    }

    public void drawTexture(int i, int i2, int i3, int i4, int i5) {
        if (this.mTextureDrawer == null) {
            this.mTextureDrawer = new GlRectDrawer();
        }
        GlUtil.checkNoGLES2Error("TextureHelper construct");
        android.opengl.Matrix.setIdentityM(TEX_MATRIX, 0);
        if (this.mFrameBufferId == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.mFrameBufferId = iArr[0];
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBufferId);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
        if (i != 10) {
            if (i == 11) {
                this.mTextureDrawer.drawOes(i2, TEX_MATRIX, i4, i5, 0, 0, i4, i5);
            }
        } else {
            this.mTextureDrawer.drawRgb(i2, TEX_MATRIX, i4, i5, 0, 0, i4, i5);
        }
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glFinish();
        GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
    }
}
