package com.lynx.tasm.utils;

import X.C0WZX;
import X.C2204961BRm;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes18.dex */
public class BlurUtils {
    public static Method sCreateBlurEffect = null;
    public static Class sRenderEffectClass = null;
    public static Method sSetNodeRenderEffect = null;
    public static Method sSetRenderEffect = null;
    public static boolean sSupportRenderEffect = true;

    public static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    public static boolean isSupportRenderEffect() {
        return Build.VERSION.SDK_INT >= 31 && sSupportRenderEffect;
    }

    public static boolean prepareRenderEffect() {
        if (sRenderEffectClass == null) {
            try {
                sRenderEffectClass = Class.forName("android.graphics.RenderEffect");
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        Class cls = sRenderEffectClass;
        if (cls != null && sCreateBlurEffect == null) {
            try {
                Class<?> cls2 = Float.TYPE;
                sCreateBlurEffect = cls.getMethod("createBlurEffect", cls2, cls2, Shader.TileMode.class);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LynxLog.e("BlurUtils", "prepareRenderEffectClass failed");
                return false;
            }
        }
        return (sRenderEffectClass == null || sCreateBlurEffect == null) ? false : true;
    }

    public static boolean prepareRenderNodeSetMethod() {
        if (!prepareRenderEffect()) {
            return false;
        }
        if (sSetNodeRenderEffect != null) {
            return true;
        }
        try {
            sSetNodeRenderEffect = RenderNode.class.getMethod("setRenderEffect", sRenderEffectClass);
            return true;
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("BlurUtils", "prepareRenderNodeRenderEffectMethods failed");
            sSupportRenderEffect = false;
            return false;
        }
    }

    public static boolean prepareViewSetMethod() {
        if (!prepareRenderEffect()) {
            return false;
        }
        if (sSetRenderEffect != null) {
            return true;
        }
        try {
            sSetRenderEffect = View.class.getMethod("setRenderEffect", sRenderEffectClass);
            return true;
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("BlurUtils", "prepareRenderEffectMethods failed");
            return false;
        }
    }

    public static boolean removeEffect(View view) {
        if (!isSupportRenderEffect()) {
            return false;
        }
        if (!prepareViewSetMethod()) {
            sSupportRenderEffect = false;
            return false;
        }
        try {
            C2204961BRm.a0(sSetRenderEffect, view, new Object[]{null}, new C0WZX("dzBzEg4jUdKSQVYySFyRcmgk4YS8L6TE94L9Uno=", null));
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            sSupportRenderEffect = false;
            return false;
        }
    }

    public static boolean createEffect(RenderNode renderNode, float f) {
        if (!isSupportRenderEffect() || f <= 0.0f) {
            return false;
        }
        if (!prepareRenderNodeSetMethod()) {
            sSupportRenderEffect = false;
            return false;
        }
        try {
            C2204961BRm.a0(sSetNodeRenderEffect, renderNode, new Object[]{C2204961BRm.a0(sCreateBlurEffect, null, new Object[]{Float.valueOf(f), Float.valueOf(f), Shader.TileMode.CLAMP}, new C0WZX("dzBzEg4jUdKSQVYySFyRcmgk4YS8L6TE94L9Uno=", null))}, new C0WZX("dzBzEg4jUdKSQVYySFyRcmgk4YS8L6TE94L9Uno=", null));
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("BlurUtils", "createNodeEffect failed " + e.getMessage());
            sSupportRenderEffect = false;
            return false;
        }
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i) {
        if (bitmap == null) {
            LynxLog.w("Blur", "bitmap is null");
            return;
        }
        if (i <= 0) {
            LynxLog.w("Blur", "radius <= 0");
            return;
        }
        try {
            TraceEvent.LIZIZ("image.BlurUtils.nativeIterativeBoxBlur");
            nativeIterativeBoxBlur(bitmap, 3, i);
            TraceEvent.LJII("image.BlurUtils.nativeIterativeBoxBlur");
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.w("Blur", e.getMessage());
        }
    }

    public static boolean createEffect(View view, float f) {
        if (!isSupportRenderEffect() || f <= 0.0f) {
            return false;
        }
        if (!prepareViewSetMethod()) {
            sSupportRenderEffect = false;
            return false;
        }
        try {
            C2204961BRm.a0(sSetRenderEffect, view, new Object[]{C2204961BRm.a0(sCreateBlurEffect, null, new Object[]{Float.valueOf(f), Float.valueOf(f), Shader.TileMode.CLAMP}, new C0WZX("dzBzEg4jUdKSQVYySFyRcmgk4YS8L6TE94L9Uno=", null))}, new C0WZX("dzBzEg4jUdKSQVYySFyRcmgk4YS8L6TE94L9Uno=", null));
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("BlurUtils", "createViewEffect failed " + e.getMessage());
            sSupportRenderEffect = false;
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap rs(android.content.Context r6, android.graphics.Bitmap r7, float r8) throws java.lang.Throwable {
        /*
            r5 = 0
            android.renderscript.RenderScript r4 = android.renderscript.RenderScript.create(r6)     // Catch: java.lang.Throwable -> L4a
            android.renderscript.RenderScript$RSMessageHandler r0 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L41
            r0.<init>()     // Catch: java.lang.Throwable -> L41
            r4.setMessageHandler(r0)     // Catch: java.lang.Throwable -> L41
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L41
            r0 = 1
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r4, r7, r1, r0)     // Catch: java.lang.Throwable -> L41
            android.renderscript.Type r0 = r3.getType()     // Catch: java.lang.Throwable -> L45
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r4, r0)     // Catch: java.lang.Throwable -> L45
            android.renderscript.Element r0 = android.renderscript.Element.U8_4(r4)     // Catch: java.lang.Throwable -> L3d
            android.renderscript.ScriptIntrinsicBlur r5 = android.renderscript.ScriptIntrinsicBlur.create(r4, r0)     // Catch: java.lang.Throwable -> L3d
            r5.setInput(r3)     // Catch: java.lang.Throwable -> L3d
            r5.setRadius(r8)     // Catch: java.lang.Throwable -> L3d
            r5.forEach(r2)     // Catch: java.lang.Throwable -> L3d
            r2.copyTo(r7)     // Catch: java.lang.Throwable -> L3d
            r4.destroy()
            r3.destroy()
            r2.destroy()
            r5.destroy()
            return r7
        L3d:
            r1 = move-exception
            r0 = r5
            r5 = r4
            goto L4e
        L41:
            r1 = move-exception
            r3 = r5
            r2 = r5
            goto L47
        L45:
            r1 = move-exception
            r2 = r5
        L47:
            r5 = r4
            r0 = r2
            goto L4e
        L4a:
            r1 = move-exception
            r0 = r5
            r3 = r5
            r2 = r5
        L4e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r1 = move-exception
            goto L4e
        L54:
            if (r5 == 0) goto L59
            r5.destroy()
        L59:
            if (r3 == 0) goto L5e
            r3.destroy()
        L5e:
            if (r2 == 0) goto L63
            r2.destroy()
        L63:
            if (r0 == 0) goto L68
            r0.destroy()
        L68:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.utils.BlurUtils.rs(android.content.Context, android.graphics.Bitmap, float):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [float] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static Bitmap blur(Context context, Bitmap bitmap, int i, int i2, float f, int i3) {
        boolean z;
        Bitmap bitmapCreateScaledBitmap;
        if (i != 0 && i2 != 0) {
            ?? r4 = i3;
            if (r4 > 1) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (boolValueOf.booleanValue()) {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i / (r4 == true ? 1 : 0), i2 / (r4 == true ? 1 : 0), true);
            } else {
                bitmapCreateScaledBitmap = bitmap;
            }
            try {
                r4 = f;
                rs(context, bitmapCreateScaledBitmap, r4 == true ? 1.0f : 0.0f);
            } catch (RSRuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                iterativeBoxBlur(bitmapCreateScaledBitmap, (int) r4);
            }
            if (boolValueOf.booleanValue()) {
                int[] iArr = new int[i * i2];
                Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, i, i2, true).getPixels(iArr, 0, i, 0, 0, i, i2);
                bitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
            }
            return bitmap;
        }
        return null;
    }
}
