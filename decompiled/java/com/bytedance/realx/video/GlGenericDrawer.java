package com.bytedance.realx.video;

import X.C08FF;
import X.C2188811AlT;
import android.opengl.GLES20;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.video.RendererCommon;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class GlGenericDrawer implements RendererCommon.GlDrawer {
    public static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    public static final FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    public FilterType currentScaleFilter;
    public GlShader currentShader;
    public ShaderType currentShaderType;
    public int dstHeight;
    public int dstWidth;
    public int frameHeight;
    public int frameWidth;
    public final String genericFragmentSource;
    public int inPosLocation;
    public int inTcLocation;
    public FloatBuffer mPosCoordinate;
    public int oriTexSizeLocation;
    public final ShaderCallbacks shaderCallbacks;
    public int tarTexSizeLocation;
    public int texMatrixLocation;
    public final String vertexShader;

    public interface ShaderCallbacks {
        void onNewShader(GlShader glShader);

        void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4);
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void release() {
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
            this.currentShaderType = null;
        }
    }

    public enum ShaderType {
        OES,
        RGB,
        YUV;

        public static ShaderType valueOf(String str) {
            return (ShaderType) C08FF.LIZ(ShaderType.class, str);
        }
    }

    public GlGenericDrawer(String str, ShaderCallbacks shaderCallbacks) {
        this("varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n", str, shaderCallbacks);
    }

    public GlShader createShader(ShaderType shaderType, FilterType filterType) {
        return new GlShader(this.vertexShader, createFragmentShaderString(this.genericFragmentSource, shaderType, filterType));
    }

    public GlGenericDrawer(String str, String str2, ShaderCallbacks shaderCallbacks) {
        this.mPosCoordinate = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks;
    }

    public static String createFragmentShaderString(String str, ShaderType shaderType, FilterType filterType) {
        String str2;
        StringBuilder sb = new StringBuilder();
        ShaderType shaderType2 = ShaderType.OES;
        if (shaderType == shaderType2) {
            sb.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb.append("precision mediump float;\nvarying vec2 tc;\n");
        if (filterType != FilterType.Origin) {
            sb.append("uniform vec2 tar_tex_size;\nuniform vec2 ori_tex_size;\n");
        }
        if (shaderType == ShaderType.YUV) {
            sb.append("uniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\n");
            if (filterType == FilterType.Bilinear) {
                sb.append("float bilinearTextureSample(sampler2D tex, vec2 p) {\n        vec2 c_onePixel =  vec2(1.0 / ori_tex_size.y - tar_tex_size.x + tar_tex_size.x, 1.0 / ori_tex_size.y);\n    vec2 frac = vec2(0.5, 0.5);\n    float C11 = texture2D(tex, p - c_onePixel).r;\n    float C21 = texture2D(tex, p + vec2( c_onePixel.x , -c_onePixel.y)).r;\n    float C12 = texture2D(tex, p + vec2( -c_onePixel.x , c_onePixel.y)).r;\n    float C22 = texture2D(tex, p + c_onePixel).r;\n    float x1 = mix(C11, C21, frac.x);\n    float x2 = mix(C12, C22, frac.x);\n    return mix(x1, x2, frac.y);\n}\nvec4 sample(vec2 p) {\n  float y = bilinearTextureSample(y_tex, p) * 1.16438;\n  float u = bilinearTextureSample(u_tex, p);\n  float v = bilinearTextureSample(v_tex, p);\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\n");
            } else if (filterType == FilterType.Bicubic) {
                sb.append("vec3 cubic_hermite (vec3 A, vec3 B, vec3 C, vec3 D, float t) {\n\t  float t2 = t*t;\n    float t3 = t*t*t;\n    vec3 a = -A/2.0 + (3.0*B)/2.0 - (3.0*C)/2.0 + D/2.0;\n    vec3 b = A - (5.0*B)/2.0 + 2.0*C - D / 2.0;\n    vec3 c = -A/2.0 + C/2.0;\n   \tvec3 d = B;\n    return a*t3 + b*t2 + c*t + d;\n}\nvec4 bicubic_sample (sampler2D tex, , vec2 P) {\n    float c_onePixel_x = 1.0 / ori_tex_size.x - tar_tex_size.x + tar_tex_size.x;\n    float c_onePixel_y = 1.0 / ori_tex_size.y;\n    float c_twoPixels_x = 2.0 / ori_tex_size.x;\n    float c_twoPixels_y = 2.0 / ori_tex_size.y;\n    vec2 pixel = vec2(P.x * ori_tex_size.x, P.y * ori_tex_size.y) + 0.5;\n    vec2 frac = fract(pixel);\n    pixel = floor(pixel);\n    pixel = vec2(pixel.x / ori_tex_size.x, pixel.y / ori_tex_size.y) - vec2(c_onePixel_x, c_onePixel_y) / 2.0;\n    vec3 C00 = texture2D(tex, pixel + vec2(-c_onePixel_x ,-c_onePixel_y)).rgb;\n    vec3 C10 = texture2D(tex, pixel + vec2( 0.0        ,-c_onePixel_y)).rgb;\n    vec3 C20 = texture2D(tex, pixel + vec2( c_onePixel_x ,-c_onePixel_y)).rgb;\n    vec3 C30 = texture2D(tex, pixel + vec2( c_twoPixels_x,-c_onePixel_y)).rgb;\n    vec3 C01 = texture2D(tex, pixel + vec2(-c_onePixel_x , 0.0)).rgb;\n    vec3 C11 = texture2D(tex, pixel + vec2( 0.0        , 0.0)).rgb;\n    vec3 C21 = texture2D(tex, pixel + vec2( c_onePixel_x , 0.0)).rgb;\n    vec3 C31 = texture2D(tex, pixel + vec2( c_twoPixels_x, 0.0)).rgb;\n    vec3 C02 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_onePixel_y)).rgb;\n    vec3 C12 = texture2D(tex, pixel + vec2( 0.0        , c_onePixel_y)).rgb;\n    vec3 C22 = texture2D(tex, pixel + vec2( c_onePixel_x , c_onePixel_y)).rgb;\n    vec3 C32 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_onePixel_y)).rgb;\n    vec3 C03 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_twoPixels_y)).rgb;\n    vec3 C13 = texture2D(tex, pixel + vec2( 0.0        , c_twoPixels_y)).rgb;\n    vec3 C23 = texture2D(tex, pixel + vec2( c_onePixel_x , c_twoPixels_y)).rgb;\n    vec3 C33 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_twoPixels_y)).rgb;  \n    vec3 CP0X = cubic_hermite(C00, C10, C20, C30, frac.x);\n    vec3 CP1X = cubic_hermite(C01, C11, C21, C31, frac.x);\n    vec3 CP2X = cubic_hermite(C02, C12, C22, C32, frac.x);\n    vec3 CP3X = cubic_hermite(C03, C13, C23, C33, frac.x);\n    return vec4(cubic_hermite(CP0X, CP1X, CP2X, CP3X, frac.y), 1.0);}\nvec4 sample(vec2 p) {\n  float y = bicubic_sample(y_tex, p) * 1.16438;\n  float u = bicubic_sample(u_tex, p);\n  float v = bicubic_sample(v_tex, p);\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\n");
            } else if (filterType == FilterType.BOX) {
                sb.append("float box_filter(sampler2D tex, vec2 p) {\n  vec2 c_onePixel =  1.0 / ori_tex_size;\n  float C11, C12, C13, C21, C22, C23, C31, C32, C33;\n  C11 = texture2D(tex, p - c_onePixel).r;\n  C12 = texture2D(tex, p + vec2( 0, -c_onePixel.y)).r;\n  C13 = texture2D(tex, p + vec2( c_onePixel.x, -c_onePixel.y)).r;\n  C21 = texture2D(tex, p + vec2( -c_onePixel.x , 0)).r;\n  C22 = texture2D(tex, p).r;\n  C23 = texture2D(tex, p + vec2( c_onePixel.x , 0)).r;\n  C31 = texture2D(tex, p + vec2( -c_onePixel.x , c_onePixel.y)).r;\n  C32 = texture2D(tex, p + vec2( 0 , c_onePixel.y)).r;\n  C33 = texture2D(tex, p + c_onePixel).r;\n  return (C11 + C12 + C13 + C21 + C22 + C23 + C31 + C32 + C33) / 9.0;\n}\nvec4 sample(vec2 p) {\n  float y = box_filter(y_tex, p) * 1.16438;\n  float u = box_filter(u_tex, p);\n  float v = box_filter(v_tex, p);\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\n");
            } else {
                sb.append("vec4 sample(vec2 p) {\n  float y = texture2D(y_tex, p).r * 1.16438;\n  float u = texture2D(u_tex, p).r;\n  float v = texture2D(v_tex, p).r;\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\n");
            }
            sb.append(str);
        } else {
            if (shaderType == shaderType2) {
                str2 = "samplerExternalOES";
            } else {
                str2 = "sampler2D";
            }
            sb.append("uniform ");
            sb.append(str2);
            sb.append(" tex;\n");
            if (filterType == FilterType.Bilinear) {
                sb.append("vec4 sample(vec2 p) {\n    vec2 c_onePixel =  vec2(1.0 / ori_tex_size.y - tar_tex_size.x + tar_tex_size.x, 1.0 / ori_tex_size.y);\n    vec2 frac = vec2(0.5, 0.5);\n    vec3 C11 = texture2D(tex, p - c_onePixel).rgb;\n    vec3 C21 = texture2D(tex, p + vec2( c_onePixel.x , -c_onePixel.y)).rgb;\n    vec3 C12 = texture2D(tex, p + vec2( -c_onePixel.x , c_onePixel.y)).rgb;\n    vec3 C22 = texture2D(tex, p + c_onePixel).rgb;\n    vec3 x1 = mix(C11, C21, frac.x);\n    vec3 x2 = mix(C12, C22, frac.x);\n    return vec4(mix(x1, x2, frac.y), 1);\n}\n");
                sb.append(str);
            } else if (filterType == FilterType.Bicubic) {
                sb.append("vec3 cubic_hermite (vec3 A, vec3 B, vec3 C, vec3 D, float t) {\n\t  float t2 = t*t;\n    float t3 = t*t*t;\n    vec3 a = -A/2.0 + (3.0*B)/2.0 - (3.0*C)/2.0 + D/2.0;\n    vec3 b = A - (5.0*B)/2.0 + 2.0*C - D / 2.0;\n    vec3 c = -A/2.0 + C/2.0;\n   \tvec3 d = B;\n    return a*t3 + b*t2 + c*t + d;\n}\nvec4 sample (vec2 P) {\n    float c_onePixel_x = 1.0 / ori_tex_size.x - tar_tex_size.x + tar_tex_size.x;\n    float c_onePixel_y = 1.0 / ori_tex_size.y;\n    float c_twoPixels_x = 2.0 / ori_tex_size.x;\n    float c_twoPixels_y = 2.0 / ori_tex_size.y;\n    vec2 pixel = vec2(P.x * ori_tex_size.x, P.y * ori_tex_size.y) + 0.5;\n    vec2 frac = fract(pixel);\n    pixel = floor(pixel);\n    pixel = vec2(pixel.x / ori_tex_size.x, pixel.y / ori_tex_size.y) - vec2(c_onePixel_x, c_onePixel_y) / 2.0;\n    vec3 C00 = texture2D(tex, pixel + vec2(-c_onePixel_x ,-c_onePixel_y)).rgb;\n    vec3 C10 = texture2D(tex, pixel + vec2( 0.0        ,-c_onePixel_y)).rgb;\n    vec3 C20 = texture2D(tex, pixel + vec2( c_onePixel_x ,-c_onePixel_y)).rgb;\n    vec3 C30 = texture2D(tex, pixel + vec2( c_twoPixels_x,-c_onePixel_y)).rgb;\n    vec3 C01 = texture2D(tex, pixel + vec2(-c_onePixel_x , 0.0)).rgb;\n    vec3 C11 = texture2D(tex, pixel + vec2( 0.0        , 0.0)).rgb;\n    vec3 C21 = texture2D(tex, pixel + vec2( c_onePixel_x , 0.0)).rgb;\n    vec3 C31 = texture2D(tex, pixel + vec2( c_twoPixels_x, 0.0)).rgb;\n    vec3 C02 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_onePixel_y)).rgb;\n    vec3 C12 = texture2D(tex, pixel + vec2( 0.0        , c_onePixel_y)).rgb;\n    vec3 C22 = texture2D(tex, pixel + vec2( c_onePixel_x , c_onePixel_y)).rgb;\n    vec3 C32 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_onePixel_y)).rgb;\n    vec3 C03 = texture2D(tex, pixel + vec2(-c_onePixel_x , c_twoPixels_y)).rgb;\n    vec3 C13 = texture2D(tex, pixel + vec2( 0.0        , c_twoPixels_y)).rgb;\n    vec3 C23 = texture2D(tex, pixel + vec2( c_onePixel_x , c_twoPixels_y)).rgb;\n    vec3 C33 = texture2D(tex, pixel + vec2( c_twoPixels_x, c_twoPixels_y)).rgb;  \n    vec3 CP0X = cubic_hermite(C00, C10, C20, C30, frac.x);\n    vec3 CP1X = cubic_hermite(C01, C11, C21, C31, frac.x);\n    vec3 CP2X = cubic_hermite(C02, C12, C22, C32, frac.x);\n    vec3 CP3X = cubic_hermite(C03, C13, C23, C33, frac.x);\n    return vec4(cubic_hermite(CP0X, CP1X, CP2X, CP3X, frac.y), 1.0);}\n");
                sb.append(str);
            } else if (filterType == FilterType.BOX) {
                sb.append("vec4 sample(vec2 p) {\n  vec2 c_onePixel =  1.0 / ori_tex_size;\n  vec3 C11 = texture2D(tex, p - c_onePixel).rgb;\n  vec3 C12 = texture2D(tex, p + vec2( 0, -c_onePixel.y)).rgb;\n  vec3 C13 = texture2D(tex, p + vec2( c_onePixel.x, -c_onePixel.y)).rgb;\n  vec3 C21 = texture2D(tex, p + vec2( -c_onePixel.x , 0)).rgb;\n  vec3 C22 = texture2D(tex, p).rgb;\n  vec3 C23 = texture2D(tex, p + vec2( c_onePixel.x , 0)).rgb;\n  vec3 C31 = texture2D(tex, p + vec2( -c_onePixel.x , c_onePixel.y)).rgb;\n  vec3 C32 = texture2D(tex, p + vec2( 0 , c_onePixel.y)).rgb;\n  vec3 C33 = texture2D(tex, p + c_onePixel).rgb;\n  return vec4((C11 + C12 + C13 + C21 + C22 + C23 + C31 + C32 + C33) / 9.0, 1.0);\n}\n");
                sb.append(str);
            } else {
                sb.append(str.replace("sample(", "texture2D(tex, "));
            }
        }
        return sb.toString();
    }

    private void prepareTexAndPosCoord(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0 && i <= i3 && i2 <= i4) {
            if (this.frameWidth == i && this.frameHeight == i2 && this.dstWidth == i3 && this.dstHeight == i4) {
                return;
            }
            this.frameWidth = i;
            this.frameHeight = i2;
            this.dstWidth = i3;
            this.dstHeight = i4;
            float f = (((i4 - i2) * 2.0f) / i4) - 1.0f;
            float f2 = ((i * 2.0f) / i3) - 1.0f;
            this.mPosCoordinate = GlUtil.createFloatBuffer(new float[]{-1.0f, f, f2, f, -1.0f, 1.0f, f2, 1.0f});
        }
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        drawOes(i, fArr, i2, i3, i4, i5, i6, i7, FilterType.Origin, 0, 0);
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        drawRgb(i, fArr, i2, i3, i4, i5, i6, i7, FilterType.Origin, 0, 0);
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        drawYuv(iArr, fArr, i, i2, i3, i4, i5, i6, FilterType.Origin, 0, 0);
    }

    private void prepareShader(ShaderType shaderType, float[] fArr, int i, int i2, int i3, int i4, FilterType filterType, int i5, int i6) {
        GlShader glShaderCreateShader;
        int i7 = i6;
        int i8 = i5;
        FilterType filterType2 = filterType;
        if (filterType2 == null || i8 == 0 || i7 == 0) {
            filterType2 = FilterType.Origin;
            i8 = 0;
            i7 = 0;
        }
        if (shaderType.equals(this.currentShaderType) && filterType2.equals(this.currentScaleFilter)) {
            glShaderCreateShader = this.currentShader;
        } else {
            this.currentShaderType = shaderType;
            GlShader glShader = this.currentShader;
            if (glShader != null) {
                glShader.release();
            }
            glShaderCreateShader = createShader(shaderType, filterType2);
            this.currentShader = glShaderCreateShader;
            this.currentScaleFilter = filterType2;
            glShaderCreateShader.useProgram();
            if (shaderType == ShaderType.YUV) {
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("v_tex"), 2);
            } else {
                GLES20.glUniform1i(glShaderCreateShader.getUniformLocation("tex"), 0);
            }
            GlUtil.checkNoGLES2Error("Create shader");
            this.shaderCallbacks.onNewShader(glShaderCreateShader);
            this.texMatrixLocation = glShaderCreateShader.getUniformLocation("tex_mat");
            this.inPosLocation = glShaderCreateShader.getAttribLocation("in_pos");
            this.inTcLocation = glShaderCreateShader.getAttribLocation("in_tc");
        }
        FilterType filterType3 = FilterType.Origin;
        if (filterType2 != filterType3) {
            if (filterType2 != FilterType.BOX) {
                this.tarTexSizeLocation = glShaderCreateShader.getUniformLocation("tar_tex_size");
            }
            this.oriTexSizeLocation = glShaderCreateShader.getUniformLocation("ori_tex_size");
        }
        GlUtil.checkNoGLES2Error("before useProgram ");
        glShaderCreateShader.useProgram();
        GLES20.glEnableVertexAttribArray(this.inPosLocation);
        GLES20.glVertexAttribPointer(this.inPosLocation, 2, 5126, false, 0, (Buffer) this.mPosCoordinate);
        GLES20.glEnableVertexAttribArray(this.inTcLocation);
        GLES20.glVertexAttribPointer(this.inTcLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        GLES20.glUniformMatrix4fv(this.texMatrixLocation, 1, false, fArr, 0);
        if (filterType2 != filterType3 && i8 > 0) {
            int i9 = this.tarTexSizeLocation;
            if (i9 != 0) {
                GLES20.glUniform2f(i9, i, i2);
            }
            int i10 = this.oriTexSizeLocation;
            if (i10 != 0) {
                GLES20.glUniform2f(i10, i8, i7);
            }
        }
        this.shaderCallbacks.onPrepareShader(glShaderCreateShader, fArr, i, i2, i3, i4);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9) {
        prepareShader(ShaderType.OES, fArr, i2, i3, i6, i7, filterType, i8, i9);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("drawOes glBindTexture error: ");
            sbLIZ.append(iGlGetError);
            Logging.e("GlGenericDrawer", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
        GlUtil.checkNoGLES2Error("drawOes done");
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9) {
        prepareShader(ShaderType.RGB, fArr, i2, i3, i6, i7, filterType, i8, i9);
        GlUtil.checkNoGLES2Error("after prepare shader");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("drawRgb glBindTexture error: ");
            sbLIZ.append(iGlGetError);
            Logging.e("GlGenericDrawer", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        GLES20.glViewport(i4, i5, i6, i7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkNoGLES2Error("drawRgb done");
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8) {
        prepareShader(ShaderType.YUV, fArr, i, i2, i5, i6, filterType, i7, i8);
        for (int i9 = 0; i9 < 3; i9++) {
            GLES20.glActiveTexture(33984 + i9);
            GLES20.glBindTexture(3553, iArr[i9]);
        }
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("drawYuv glBindTexture error: ");
            sbLIZ.append(iGlGetError);
            Logging.e("GlGenericDrawer", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        GLES20.glViewport(i3, i4, i5, i6);
        GLES20.glDrawArrays(5, 0, 4);
        int i10 = 0;
        do {
            GLES20.glActiveTexture(i10 + 33984);
            GLES20.glBindTexture(3553, 0);
            i10++;
        } while (i10 < 3);
        GlUtil.checkNoGLES2Error("drawYuv done");
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9, int i10, int i11) {
        prepareTexAndPosCoord(i2, i3, i10, i11);
        drawOes(i, fArr, i2, i3, i4, i5, i6, i7, filterType, i8, i9);
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9, int i10, int i11) {
        prepareTexAndPosCoord(i2, i3, i10, i11);
        drawRgb(i, fArr, i2, i3, i4, i5, i6, i7, filterType, i8, i9);
    }

    @Override // com.bytedance.realx.video.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8, int i9, int i10) {
        prepareTexAndPosCoord(i, i2, i9, i10);
        drawYuv(iArr, fArr, i, i2, i3, i4, i5, i6, filterType, i7, i8);
    }
}
