package com.lynx.tasm.rendernode.compat;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.DisplayList;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes33.dex */
public class RenderNodeV14Impl extends RenderNodeCompat {
    public static Method sDrawDisplayListMethod;
    public static Method sEndMethod;
    public static Method sIsValidMethod;
    public static Method sOnPostDrawMethod;
    public static Method sOnPreDrawMethod;
    public static Method sSetViewportMethod;
    public static Method sStartMethod;
    public int bottom;
    public DisplayList displayList;
    public int height;
    public int left;
    public int right;
    public Constructor<?> sGLESConstructor;
    public int top;
    public int width;

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public boolean hasDisplayList() {
        try {
            if (sIsValidMethod == null) {
                Method declaredMethod = DisplayList.class.getDeclaredMethod("isValid", new Class[0]);
                sIsValidMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            return ((Boolean) sIsValidMethod.invoke(this.displayList, new Object[0])).booleanValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void init() {
        try {
            if (this.sGLESConstructor == null) {
                Constructor<?> constructor = Class.forName("android.view.GLES20DisplayList").getConstructor(new Class[0]);
                this.sGLESConstructor = constructor;
                constructor.setAccessible(true);
            }
            this.displayList = (DisplayList) this.sGLESConstructor.newInstance(new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public Object getRenderNode() {
        return this.displayList;
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void drawRenderNode(Canvas canvas) {
        drawRenderNode(canvas, this.displayList);
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void endRecording(Canvas canvas) {
        try {
            if (sOnPostDrawMethod == null) {
                Method declaredMethod = Canvas.class.getDeclaredMethod("onPostDraw", new Class[0]);
                sOnPostDrawMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            sOnPostDrawMethod.invoke(canvas, new Object[0]);
            try {
                if (sEndMethod == null) {
                    Method declaredMethod2 = DisplayList.class.getDeclaredMethod("end", new Class[0]);
                    sEndMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                sEndMethod.invoke(this.displayList, new Object[0]);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public Canvas beginRecording(int i, int i2) {
        this.width = i;
        this.height = i2;
        try {
            if (sStartMethod == null) {
                Method declaredMethod = DisplayList.class.getDeclaredMethod("start", new Class[0]);
                sStartMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Canvas canvas = (Canvas) sStartMethod.invoke(this.displayList, new Object[0]);
            setViewport(i, i2, canvas);
            try {
                if (sOnPreDrawMethod == null) {
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("onPreDraw", Rect.class);
                    sOnPreDrawMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                sOnPreDrawMethod.invoke(canvas, null);
                return canvas;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void drawRenderNode(Canvas canvas, Object obj) {
        try {
            if (sDrawDisplayListMethod == null) {
                Class cls = Integer.TYPE;
                Method declaredMethod = Canvas.class.getDeclaredMethod("drawDisplayList", DisplayList.class, cls, cls, Rect.class);
                sDrawDisplayListMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            sDrawDisplayListMethod.invoke(canvas, obj, Integer.valueOf(this.width), Integer.valueOf(this.height), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public void setViewport(int i, int i2, Canvas canvas) {
        try {
            if (sSetViewportMethod == null) {
                Class cls = Integer.TYPE;
                Method declaredMethod = Canvas.class.getDeclaredMethod("setViewport", cls, cls);
                sSetViewportMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            sSetViewportMethod.invoke(canvas, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.rendernode.compat.RenderNodeCompat
    public void setPosition(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }
}
