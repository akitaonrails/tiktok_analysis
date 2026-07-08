package com.ss.android.ugc.aweme.effect.download;

import X.C1427230nFB;
import X.C2188811AlT;
import X.C297880Bly;
import X.C356901a3;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import X.InterfaceC1635410sex;
import X.InterfaceC19347710mh;
import X.InterfaceC194315110n;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS34S0201000_29;
import Y.ARunnableS98S0200000_29;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import w1p.a;

/* JADX INFO: loaded from: classes30.dex */
@InterfaceC1294060jmO
public final class EffectDownloadController {
    public static InterfaceC1635410sex LJIIJJI;
    public final InterfaceC194315110n LIZ;
    public final LifecycleOwner LIZIZ;
    public final AtomicInteger LJIIIZ;
    public final Queue<Effect> LIZJ = new ConcurrentLinkedQueue();
    public final Queue<Effect> LIZLLL = new ConcurrentLinkedQueue();
    public final Queue<Effect> LJ = new ConcurrentLinkedQueue();
    public final List<InterfaceC19347710mh> LJFF = Collections.synchronizedList(new ArrayList());
    public final List<Effect> LJI = Collections.synchronizedList(new ArrayList());
    public final AtomicBoolean LJII = new AtomicBoolean(false);
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final BPEAHandler LJIIJ = new BPEAHandler(Looper.getMainLooper());

    /* JADX WARN: Type inference failed for: r0v33, types: [X.0sda] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.0sda] */
    public final void LJIIJJI() {
        final Effect effect;
        boolean z = true;
        while (this.LJIIIIZZ.get() && this.LJIIIZ.get() > 0 && z) {
            if (!((ConcurrentLinkedQueue) this.LIZLLL).isEmpty()) {
                effect = (Effect) ((ConcurrentLinkedQueue) this.LIZLLL).poll();
            } else {
                if (!((ConcurrentLinkedQueue) this.LJ).isEmpty()) {
                    if (this.LIZ.LIZ()) {
                        this.LIZ.LIZJ();
                    } else {
                        effect = (Effect) ((ConcurrentLinkedQueue) this.LJ).poll();
                    }
                } else if (this.LIZ.LIZ()) {
                    this.LIZ.LIZJ();
                }
                z = false;
                this.LJIIIIZZ.set(!((ConcurrentLinkedQueue) this.LIZJ).isEmpty());
            }
            if (effect != null) {
                boolean zLJI = MethodIDManager.LJI(202112);
                if (!((ConcurrentLinkedQueue) this.LIZJ).contains(effect)) {
                    ((ConcurrentLinkedQueue) this.LIZJ).add(effect);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    this.LJIIIZ.decrementAndGet();
                    LIZ(effect);
                    if (C297880Bly.LIZ() || a.LIZ().effectDownloadInsertAtHeadEnabled) {
                        InterfaceC1635410sex interfaceC1635410sexLIZ = C1427230nFB.LIZ();
                        if (interfaceC1635410sexLIZ != null) {
                            final boolean zContains = this.LJI.contains(effect);
                            final IEffectDownloadProgressListener iEffectDownloadProgressListener = new IEffectDownloadProgressListener() { // from class: X.110l
                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onStart(Effect effect2) {
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(Effect effect2) {
                                    this.LIZ.LJIIIZ(effect, effect2);
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                                    this.LIZ.LJII(effect, effect2, exceptionResult);
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                                public final void onProgress(Effect effect2, int i, long j) {
                                    this.LIZ.LJIIIIZZ(effect, effect2, i);
                                }
                            };
                            final ?? r0 = new IEffectDownloadProgressListener(zContains, iEffectDownloadProgressListener) { // from class: X.0sda
                                public final boolean LIZIZ;
                                public final IEffectDownloadProgressListener LIZJ;
                                public final String LIZ = "edit_effect";
                                public final C138P LIZLLL = C138P.LIZ();

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onStart(Effect effect2) {
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.LIZJ;
                                    if (iEffectDownloadProgressListener2 != null) {
                                        iEffectDownloadProgressListener2.onStart(effect2);
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(Effect effect2) {
                                    String effectId;
                                    Effect effect3 = effect2;
                                    long jLIZIZ = this.LIZLLL.LIZIZ(TimeUnit.MILLISECONDS);
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.LIZJ;
                                    if (iEffectDownloadProgressListener2 != null) {
                                        iEffectDownloadProgressListener2.onSuccess(effect3);
                                    }
                                    String strLIZ = C1634570sdb.LIZ(this.LIZ);
                                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                                    C0LAB c0lab = new C0LAB();
                                    c0lab.LJ("resource_type", strLIZ);
                                    c0lab.LIZIZ(jLIZIZ, "duration");
                                    c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                    c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(!this.LIZIZ)), "is_auto_download");
                                    String unzipPath = null;
                                    if (effect3 != null) {
                                        effectId = effect3.getEffectId();
                                    } else {
                                        effectId = null;
                                    }
                                    c0lab.LJ("resource_id", effectId);
                                    if (effect3 != null) {
                                        unzipPath = effect3.getUnzipPath();
                                    }
                                    c0lab.LIZIZ(C20012413Ry.LJIIJ(unzipPath), "source_file_size");
                                    C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
                                    if (Intrinsics.LJFF(strLIZ, "effect")) {
                                        C305790Byj.LIZ(Long.valueOf(System.currentTimeMillis() - jLIZIZ), Long.valueOf(jLIZIZ));
                                    }
                                }

                                {
                                    this.LIZIZ = zContains;
                                    this.LIZJ = iEffectDownloadProgressListener;
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                                    String effectId;
                                    long jLIZIZ = this.LIZLLL.LIZIZ(TimeUnit.MILLISECONDS);
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.LIZJ;
                                    if (iEffectDownloadProgressListener2 != null) {
                                        iEffectDownloadProgressListener2.onFail(effect2, exceptionResult);
                                    }
                                    String strLIZ = C1634570sdb.LIZ(this.LIZ);
                                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                                    C0LAB c0lab = new C0LAB();
                                    c0lab.LJ("resource_type", strLIZ);
                                    c0lab.LIZIZ(jLIZIZ, "duration");
                                    c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                    c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(true ^ this.LIZIZ)), "is_auto_download");
                                    if (effect2 != null) {
                                        effectId = effect2.getEffectId();
                                    } else {
                                        effectId = null;
                                    }
                                    c0lab.LJ("resource_id", effectId);
                                    c0lab.LIZLLL(ListProtector.get(((IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class)).getHosts(), 0), "error_domain");
                                    c0lab.LIZ(exceptionResult.getErrorCode(), "error_code");
                                    String msg = exceptionResult.getMsg();
                                    if (msg == null) {
                                        msg = "empty_error_msg";
                                    }
                                    c0lab.LJ("error_msg", msg);
                                    C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
                                    if (Intrinsics.LJFF(strLIZ, "effect")) {
                                        C305790Byj.LIZ(Long.valueOf(System.currentTimeMillis() - jLIZIZ), Long.valueOf(jLIZIZ));
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                                public final void onProgress(Effect effect2, int i, long j) {
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.LIZJ;
                                    if (iEffectDownloadProgressListener2 != null) {
                                        iEffectDownloadProgressListener2.onProgress(effect2, i, j);
                                    }
                                }
                            };
                            interfaceC1635410sexLIZ.LJ(effect, true, true, true, new IEffectDownloadProgressListener(r0) { // from class: X.0sdd
                                public static final /* synthetic */ int LIZJ = 0;
                                public final IEffectDownloadProgressListener LIZ;
                                public long LIZIZ;

                                {
                                    this.LIZ = r0;
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onStart(Effect effect2) {
                                    this.LIZIZ = System.currentTimeMillis();
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.LIZ;
                                    if (iEffectDownloadProgressListener2 != null) {
                                        iEffectDownloadProgressListener2.onStart(effect2);
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(Effect effect2) {
                                    Effect effect3 = effect2;
                                    InterfaceC1637880siw interfaceC1637880siw = C1448700nno.LIZ;
                                    C1448700nno.LIZ(effect3, true, this.LIZIZ, null);
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.LIZ;
                                    if (iEffectDownloadProgressListener2 != null) {
                                        iEffectDownloadProgressListener2.onSuccess(effect3);
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                                    InterfaceC1637880siw interfaceC1637880siw = C1448700nno.LIZ;
                                    C1448700nno.LIZ(effect2, false, this.LIZIZ, exceptionResult);
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.LIZ;
                                    if (iEffectDownloadProgressListener2 != null) {
                                        iEffectDownloadProgressListener2.onFail(effect2, exceptionResult);
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                                public final void onProgress(Effect effect2, int i, long j) {
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener2 = this.LIZ;
                                    if (iEffectDownloadProgressListener2 != null) {
                                        iEffectDownloadProgressListener2.onProgress(effect2, i, j);
                                    }
                                }
                            });
                        }
                    } else {
                        InterfaceC1635410sex interfaceC1635410sexLIZ2 = C1427230nFB.LIZ();
                        if (interfaceC1635410sexLIZ2 != null) {
                            final boolean zContains2 = this.LJI.contains(effect);
                            final IEffectDownloadProgressListener iEffectDownloadProgressListener2 = new IEffectDownloadProgressListener() { // from class: X.110m
                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onStart(Effect effect2) {
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(Effect effect2) {
                                    this.LIZ.LJIIIZ(effect, effect2);
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                                    this.LIZ.LJII(effect, effect2, exceptionResult);
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                                public final void onProgress(Effect effect2, int i, long j) {
                                    this.LIZ.LJIIIIZZ(effect, effect2, i);
                                }
                            };
                            final ?? r02 = new IEffectDownloadProgressListener(zContains2, iEffectDownloadProgressListener2) { // from class: X.0sda
                                public final boolean LIZIZ;
                                public final IEffectDownloadProgressListener LIZJ;
                                public final String LIZ = "edit_effect";
                                public final C138P LIZLLL = C138P.LIZ();

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onStart(Effect effect2) {
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener22 = this.LIZJ;
                                    if (iEffectDownloadProgressListener22 != null) {
                                        iEffectDownloadProgressListener22.onStart(effect2);
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(Effect effect2) {
                                    String effectId;
                                    Effect effect3 = effect2;
                                    long jLIZIZ = this.LIZLLL.LIZIZ(TimeUnit.MILLISECONDS);
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener22 = this.LIZJ;
                                    if (iEffectDownloadProgressListener22 != null) {
                                        iEffectDownloadProgressListener22.onSuccess(effect3);
                                    }
                                    String strLIZ = C1634570sdb.LIZ(this.LIZ);
                                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                                    C0LAB c0lab = new C0LAB();
                                    c0lab.LJ("resource_type", strLIZ);
                                    c0lab.LIZIZ(jLIZIZ, "duration");
                                    c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                    c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(!this.LIZIZ)), "is_auto_download");
                                    String unzipPath = null;
                                    if (effect3 != null) {
                                        effectId = effect3.getEffectId();
                                    } else {
                                        effectId = null;
                                    }
                                    c0lab.LJ("resource_id", effectId);
                                    if (effect3 != null) {
                                        unzipPath = effect3.getUnzipPath();
                                    }
                                    c0lab.LIZIZ(C20012413Ry.LJIIJ(unzipPath), "source_file_size");
                                    C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
                                    if (Intrinsics.LJFF(strLIZ, "effect")) {
                                        C305790Byj.LIZ(Long.valueOf(System.currentTimeMillis() - jLIZIZ), Long.valueOf(jLIZIZ));
                                    }
                                }

                                {
                                    this.LIZIZ = zContains2;
                                    this.LIZJ = iEffectDownloadProgressListener2;
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                                    String effectId;
                                    long jLIZIZ = this.LIZLLL.LIZIZ(TimeUnit.MILLISECONDS);
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener22 = this.LIZJ;
                                    if (iEffectDownloadProgressListener22 != null) {
                                        iEffectDownloadProgressListener22.onFail(effect2, exceptionResult);
                                    }
                                    String strLIZ = C1634570sdb.LIZ(this.LIZ);
                                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                                    C0LAB c0lab = new C0LAB();
                                    c0lab.LJ("resource_type", strLIZ);
                                    c0lab.LIZIZ(jLIZIZ, "duration");
                                    c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                    c0lab.LIZ(C308560C7q.LIZ(Boolean.valueOf(true ^ this.LIZIZ)), "is_auto_download");
                                    if (effect2 != null) {
                                        effectId = effect2.getEffectId();
                                    } else {
                                        effectId = null;
                                    }
                                    c0lab.LJ("resource_id", effectId);
                                    c0lab.LIZLLL(ListProtector.get(((IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class)).getHosts(), 0), "error_domain");
                                    c0lab.LIZ(exceptionResult.getErrorCode(), "error_code");
                                    String msg = exceptionResult.getMsg();
                                    if (msg == null) {
                                        msg = "empty_error_msg";
                                    }
                                    c0lab.LJ("error_msg", msg);
                                    C2341909Fp.LIZ("tool_performance_resource_download", c0lab.LIZ);
                                    if (Intrinsics.LJFF(strLIZ, "effect")) {
                                        C305790Byj.LIZ(Long.valueOf(System.currentTimeMillis() - jLIZIZ), Long.valueOf(jLIZIZ));
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                                public final void onProgress(Effect effect2, int i, long j) {
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener22 = this.LIZJ;
                                    if (iEffectDownloadProgressListener22 != null) {
                                        iEffectDownloadProgressListener22.onProgress(effect2, i, j);
                                    }
                                }
                            };
                            interfaceC1635410sexLIZ2.LIZJ(effect, new IEffectDownloadProgressListener(r02) { // from class: X.0sdd
                                public static final /* synthetic */ int LIZJ = 0;
                                public final IEffectDownloadProgressListener LIZ;
                                public long LIZIZ;

                                {
                                    this.LIZ = r02;
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onStart(Effect effect2) {
                                    this.LIZIZ = System.currentTimeMillis();
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener22 = this.LIZ;
                                    if (iEffectDownloadProgressListener22 != null) {
                                        iEffectDownloadProgressListener22.onStart(effect2);
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(Effect effect2) {
                                    Effect effect3 = effect2;
                                    InterfaceC1637880siw interfaceC1637880siw = C1448700nno.LIZ;
                                    C1448700nno.LIZ(effect3, true, this.LIZIZ, null);
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener22 = this.LIZ;
                                    if (iEffectDownloadProgressListener22 != null) {
                                        iEffectDownloadProgressListener22.onSuccess(effect3);
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                                    InterfaceC1637880siw interfaceC1637880siw = C1448700nno.LIZ;
                                    C1448700nno.LIZ(effect2, false, this.LIZIZ, exceptionResult);
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener22 = this.LIZ;
                                    if (iEffectDownloadProgressListener22 != null) {
                                        iEffectDownloadProgressListener22.onFail(effect2, exceptionResult);
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                                public final void onProgress(Effect effect2, int i, long j) {
                                    IEffectDownloadProgressListener iEffectDownloadProgressListener22 = this.LIZ;
                                    if (iEffectDownloadProgressListener22 != null) {
                                        iEffectDownloadProgressListener22.onProgress(effect2, i, j);
                                    }
                                }
                            });
                        }
                    }
                } else if (zLJI) {
                    MethodIDManager.LJ();
                }
                z = true;
            } else {
                z = false;
            }
            this.LJIIIIZZ.set(!((ConcurrentLinkedQueue) this.LIZJ).isEmpty());
        }
    }

    public static boolean LJFF() {
        return !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper());
    }

    public final void LJI() {
        InterfaceC1635410sex interfaceC1635410sexLIZ = C1427230nFB.LIZ();
        if (interfaceC1635410sexLIZ != null) {
            interfaceC1635410sexLIZ.destroy();
        }
        LJIIJJI = null;
        ((ConcurrentLinkedQueue) this.LIZJ).clear();
        ((ConcurrentLinkedQueue) this.LIZLLL).clear();
        this.LJFF.clear();
        this.LJIIIIZZ.set(false);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.effect.download.EffectDownloadController$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
            EffectDownloadController.this.LJI();
        }
    }

    public static boolean LJ(Effect effect) {
        InterfaceC1635410sex interfaceC1635410sexLIZ;
        if (!Intrinsics.LJFF(effect.getUnzipPath(), effect.getZipPath()) && ((interfaceC1635410sexLIZ = C1427230nFB.LIZ()) == null || !interfaceC1635410sexLIZ.LJIIIIZZ(effect))) {
            return false;
        }
        return true;
    }

    public final void LIZ(Effect effect) {
        this.LIZ.LIZIZ();
        if (LJFF()) {
            C786410Ut5.LJJZZIII(this.LJIIJ, new ARunnableS98S0200000_29(this, effect, 15));
            return;
        }
        Iterator<InterfaceC19347710mh> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().g(effect);
        }
    }

    public final boolean LIZJ(EffectModel effectModel) {
        String name;
        if (effectModel == null) {
            return false;
        }
        for (Effect effect : this.LIZJ) {
            if (effect != null) {
                name = effect.getName();
            } else {
                name = null;
            }
            if (Intrinsics.LJFF(name, effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZLLL(EffectModel effectModel) {
        String name;
        if (effectModel == null) {
            return false;
        }
        for (Effect effect : this.LIZLLL) {
            if (effect != null) {
                name = effect.getName();
            } else {
                name = null;
            }
            if (Intrinsics.LJFF(name, effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIJ(List<? extends Effect> list) {
        for (Object obj : (ArrayList) list) {
            if (!((ConcurrentLinkedQueue) this.LJ).contains(obj)) {
                ((ConcurrentLinkedQueue) this.LJ).add(obj);
            }
        }
        this.LJIIIIZZ.set(true);
        this.LJII.set(true);
        LJIIJJI();
    }

    public final void LIZIZ(Effect effect, boolean z) {
        if (effect == null) {
            return;
        }
        if (z) {
            this.LJI.add(effect);
        }
        if (!((ConcurrentLinkedQueue) this.LIZLLL).contains(effect) && !((ConcurrentLinkedQueue) this.LIZJ).contains(effect)) {
            ((ConcurrentLinkedQueue) this.LIZLLL).add(effect);
        }
        LIZ(effect);
        if (!this.LJIIIIZZ.get()) {
            C786410Ut5.LJJZZIII(this.LJIIJ, new ARunnableS129S0100000_29(this, 33));
        }
    }

    public final void LJIIIZ(Effect effect, Effect effect2) {
        ((ConcurrentLinkedQueue) this.LIZJ).remove(effect);
        this.LJI.remove(effect);
        this.LJIIIZ.incrementAndGet();
        this.LIZ.LIZIZ();
        if (LJFF()) {
            C786410Ut5.LJJZZIII(this.LJIIJ, new ARunnableS98S0200000_29(this, effect, effect2, 46));
        } else {
            Iterator<InterfaceC19347710mh> it2 = this.LJFF.iterator();
            while (it2.hasNext()) {
                it2.next().Vs(effect);
            }
        }
        this.LJIIIIZZ.set(true);
        C786410Ut5.LJJZZIII(this.LJIIJ, new ARunnableS129S0100000_29(this, 34));
    }

    public EffectDownloadController(int i, InterfaceC194315110n interfaceC194315110n, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        this.LIZ = interfaceC194315110n;
        this.LIZIZ = lifecycleOwner;
        this.LJIIIZ = new AtomicInteger(i);
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new AnonymousClass1());
        }
    }

    public final void LJII(Effect effect, Effect effect2, ExceptionResult exceptionResult) {
        String name;
        ((ConcurrentLinkedQueue) this.LIZJ).remove(effect);
        this.LJI.remove(effect);
        this.LJIIIZ.incrementAndGet();
        this.LIZ.LIZIZ();
        if (LJFF()) {
            C786410Ut5.LJJZZIII(this.LJIIJ, new ARunnableS98S0200000_29(this, effect2, exceptionResult, 45));
        } else {
            Iterator<InterfaceC19347710mh> it2 = this.LJFF.iterator();
            while (it2.hasNext()) {
                it2.next().Iz(effect2);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Intrinsics.LJFF(effect, effect2));
        sbLIZ.append(", name: ");
        if (effect2 != null) {
            name = effect2.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        sbLIZ.append(", download failed, reason: ");
        sbLIZ.append(exceptionResult.getMsg());
        sbLIZ.append(", ");
        sbLIZ.append(Log.getStackTraceString(exceptionResult.getException()));
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIIIZZ.set(!((ConcurrentLinkedQueue) this.LIZJ).isEmpty());
    }

    public final void LJIIIIZZ(Effect effect, Effect effect2, int i) {
        this.LIZ.LIZIZ();
        if (LJFF()) {
            C786410Ut5.LJJZZIII(this.LJIIJ, new ARunnableS34S0201000_29(this, effect, effect2, i, 8));
            return;
        }
        Iterator<InterfaceC19347710mh> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().zf(effect, i);
        }
    }
}
