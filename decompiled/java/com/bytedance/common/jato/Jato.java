package com.bytedance.common.jato;

import X.C07TK;
import X.C1702290uOp;
import android.content.Context;
import com.bytedance.common.jato.boost.CpusetManager;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes27.dex */
public class Jato {
    public static void glPrioPromote(String str) {
    }

    public static void preloadBoostInfo() {
    }

    public static void preloadCpusetInfo() {
    }

    public static boolean isInited() {
        return JatoXL.isInited();
    }

    public static void bindBigCore() {
        CpusetManager.bindBigCore();
    }

    public static void bindLittleCore() {
        CpusetManager.bindLittleCore();
    }

    public static void disableClassVerify() {
        JatoXL.disableClassVerify();
    }

    public static void enableClassVerify() {
        JatoXL.enableClassVerify();
    }

    public static void keepBuffers() {
        JatoXL.keepBuffers();
    }

    public static void optTextureBufferQueue() {
        JatoXL.optTextureBufferQueue();
    }

    public static void releaseBoost() {
        JatoXL.releaseBoost();
    }

    public static void releaseBuffers() {
        JatoXL.releaseBuffers();
    }

    public static void resetCoreBind() {
        CpusetManager.resetCoreBind();
    }

    public static void shrinkVM() {
        JatoXL.shrinkVM();
    }

    public static void shrinkWebviewNative() {
        JatoXL.shrinkWebviewNative();
    }

    public static void trimDexMap() {
        JatoXL.trimDexMap();
    }

    public static void bindBigCore(int i) {
        CpusetManager.bindBigCore(i);
    }

    public static void bindLittleCore(int i) {
        CpusetManager.bindLittleCore(i);
    }

    public static void boostGLESInit(boolean z) {
        JatoXL.boostGLESInit(z);
    }

    public static void initBoostFramework(Context context) {
        JatoXL.initBoostFramework(context);
    }

    public static void initScheduler(int i) {
        JatoXL.initScheduler(i);
    }

    public static void requestBlockGc(long j) {
        JatoXL.requestBlockGc(j);
    }

    public static void resetCoreBind(int i) {
        CpusetManager.resetCoreBind(i);
    }

    public static void setDisableGcBlocker(boolean z) {
        JatoXL.setDisableGcBlocker(z);
    }

    public static void startBlockGc(String str) {
        JatoXL.startBlockGc(str);
    }

    public static void stopBlockGc(String str) {
        JatoXL.stopBlockGc(str);
    }

    public static void tryCpuBoost(long j) {
        JatoXL.tryCpuBoost(j);
    }

    public static void tryGpuBoost(long j) {
        JatoXL.tryGpuBoost(j);
    }

    public static void shrinkVM(int i, int i2) {
        JatoXL.shrinkVM(i, i2);
    }

    public static synchronized void init(Context context, boolean z, C07TK c07tk, ExecutorService executorService) {
        init(context, z, c07tk, executorService, null);
    }

    public static synchronized void init(Context context, boolean z, C07TK c07tk, ExecutorService executorService, C1702290uOp c1702290uOp) {
    }
}
