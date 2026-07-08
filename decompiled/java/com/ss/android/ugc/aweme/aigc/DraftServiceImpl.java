package com.ss.android.ugc.aweme.aigc;

import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09JC;
import X.C0CHQ;
import X.C0LOK;
import X.C0VSV;
import X.C1280904zn;
import X.C189200o6;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C23260099m;
import X.C452501pT;
import X.C546230LbZ;
import X.C546330Lbj;
import X.C546400Lbq;
import X.C546560Lc6;
import X.C546620LcC;
import X.C547160Ld4;
import X.C547180Ld6;
import X.C547860LeC;
import X.C558570LvT;
import X.C560950LzJ;
import X.C570330MYl;
import X.InterfaceC1364105Vn;
import X.InterfaceC545620Laa;
import X.InterfaceC546090LbL;
import X.InterfaceC546470Lbx;
import X.InterfaceC546480Lby;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.aigc.proto.Level;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService;
import com.ss.android.ugc.aweme.aikit.api.common.FileService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftServiceImpl implements DraftService<VideoPublishEditModel, AwemeDraft> {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(46));

    public final C547180Ld6 LJIILLIIL() {
        return (C547180Ld6) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final boolean LIZLLL(CreativeModel creativeModel) {
        Function1<CreativeModel, Boolean> function1;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(false).iterator();
        while (it2.hasNext()) {
            C546400Lbq<Object> c546400LbqLIZJ = it2.next().LIZJ();
            if (c546400LbqLIZJ != null && (function1 = c546400LbqLIZJ.LJFF) != null && function1.invoke(creativeModel).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final boolean LJFF(AwemeDraft awemeDraft) {
        Function1<Object, Boolean> function1;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(true).iterator();
        while (it2.hasNext()) {
            C546400Lbq<Object> c546400LbqLIZJ = it2.next().LIZJ();
            if (c546400LbqLIZJ != null && (function1 = c546400LbqLIZJ.LIZJ) != null && function1.invoke(awemeDraft).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final boolean LJI(CreativeModel creativeModel) {
        Function1<CreativeModel, Boolean> function1;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(true).iterator();
        while (it2.hasNext()) {
            C546400Lbq<Object> c546400LbqLIZJ = it2.next().LIZJ();
            if (c546400LbqLIZJ != null && (function1 = c546400LbqLIZJ.LIZLLL) != null && function1.invoke(creativeModel).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final boolean LJIIIIZZ(CreativeModel creativeModel) {
        C1280904zn c1280904zn;
        List<InterfaceC546470Lbx<Object>> list;
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(true);
        if ((listLJFF instanceof Collection) && listLJFF.isEmpty()) {
            return false;
        }
        Iterator<C546230LbZ> it2 = listLJFF.iterator();
        while (it2.hasNext()) {
            C546400Lbq<Object> c546400LbqLIZJ = it2.next().LIZJ();
            if (c546400LbqLIZJ != null && (c1280904zn = c546400LbqLIZJ.LJIIIIZZ) != null && (list = c1280904zn.LIZ) != null && !list.isEmpty()) {
                Iterator<InterfaceC546470Lbx<Object>> it3 = list.iterator();
                while (it3.hasNext()) {
                    if (it3.next().LIZIZ(creativeModel)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final void LJIIIZ(CreativeModel creativeModel) {
        Function1<CreativeModel, Unit> function1;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(false).iterator();
        while (it2.hasNext()) {
            C546400Lbq<Object> c546400LbqLIZJ = it2.next().LIZJ();
            if (c546400LbqLIZJ != null && (function1 = c546400LbqLIZJ.LJIIIZ) != null) {
                function1.invoke(creativeModel);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final boolean LJIIJ(CreativeModel creativeModel) {
        Function1<CreativeModel, Boolean> function1;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(false).iterator();
        while (it2.hasNext()) {
            C546400Lbq<Object> c546400LbqLIZJ = it2.next().LIZJ();
            if (c546400LbqLIZJ != null && (function1 = c546400LbqLIZJ.LJ) != null && function1.invoke(creativeModel).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final boolean LJIILIIL(CreativeModel creativeModel) {
        Function1<CreativeModel, Boolean> function1;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(true).iterator();
        while (it2.hasNext()) {
            C546400Lbq<Object> c546400LbqLIZJ = it2.next().LIZJ();
            if (c546400LbqLIZJ != null && (function1 = c546400LbqLIZJ.LJIIJJI) != null && function1.invoke(creativeModel).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static String LJIILL(Source source, CreativeInfo creativeInfo) throws Throwable {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawColor(-7829368);
        C547860LeC.LIZ.getClass();
        FileService fileServiceLJ = C547860LeC.LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draft_placeholder_");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".jpg");
        File fileLIZLLL = fileServiceLJ.LIZLLL(source, creativeInfo, C2188811AlT.LIZIZ(sbLIZ), true);
        C0VSV c0vsv = new C0VSV(fileLIZLLL);
        Throwable th = null;
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 70, c0vsv);
            C2107108Nh.LIZ(c0vsv, null);
            bitmapCreateBitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
            String absolutePath = fileLIZLLL.getAbsolutePath();
            if (absolutePath == null) {
                return "";
            }
            return absolutePath;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                throw th2;
            } catch (Throwable th4) {
                th = th4;
                th = th2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(c0vsv, th);
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final void LIZ(Context context, VideoPublishEditModel videoPublishEditModel) {
        C1280904zn c1280904zn;
        List<InterfaceC546470Lbx<Object>> list;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(true).iterator();
        while (it2.hasNext()) {
            C546400Lbq<Object> c546400LbqLIZJ = it2.next().LIZJ();
            if (c546400LbqLIZJ != null && (c1280904zn = c546400LbqLIZJ.LJIIIIZZ) != null && (list = c1280904zn.LIZ) != null) {
                for (InterfaceC546470Lbx<Object> interfaceC546470Lbx : list) {
                    if (interfaceC546470Lbx.LIZIZ(videoPublishEditModel.creativeModel)) {
                        interfaceC546470Lbx.LIZ(context, videoPublishEditModel);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C546440Lbu
            if (r0 == 0) goto L61
            r3 = r7
            X.0Lbu r3 = (X.C546440Lbu) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r1 = r3.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r2 = 1
            if (r0 == 0) goto L4b
            if (r0 != r2) goto L6a
            java.lang.Object r0 = r3.LLILLJJLI
            java.util.Iterator r0 = (java.util.Iterator) r0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r6 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            X.0LbZ r1 = (X.C546230LbZ) r1
            X.0Lbq r1 = r1.LIZJ()
            if (r1 == 0) goto L28
            kotlin.jvm.functions.Function2<com.ss.android.ugc.aweme.creative.model.CreativeModel, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r1.LJI
            if (r1 == 0) goto L28
            r3.LL = r6
            r3.LLILLJJLI = r0
            r3.LLILZIL = r2
            java.lang.Object r1 = r1.invoke(r6, r3)
            if (r1 != r4) goto L28
            return r4
        L4b:
            X.C155000ia.LIZIZ(r1)
            X.0LeC r0 = X.C547860LeC.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.common.AIConfigService r1 = X.C547860LeC.LIZIZ()
            r0 = 0
            java.util.List r0 = r1.LJFF(r0)
            java.util.Iterator r0 = r0.iterator()
            goto L28
        L61:
            X.0Lbu r3 = new X.0Lbu
            r3.<init>(r5, r7)
            goto L12
        L67:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.DraftServiceImpl.LIZIZ(com.ss.android.ugc.aweme.creative.model.CreativeModel, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final Object LJ(C09JC c09jc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(c09jc.LIZIZ, true, false, false, 12));
        if (awemeDraftLJI == null) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            c23260099m.resumeWith(unit);
        } else {
            C0CHQ.LIZ().LJI().LIZIZ().LJ(new C570330MYl(awemeDraftLJI, new C560950LzJ("Delete AIGC Auto draft", "deleteAIGCAutoDraft"), false, null, null, 124), new InterfaceC545620Laa() { // from class: X.0Lbw
                @Override // X.InterfaceC545620Laa
                public final void onSuccess() {
                    InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                    Unit unit2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(unit2);
                    interfaceC1364105Vn2.resumeWith(unit2);
                }

                @Override // X.InterfaceC545620Laa
                public final void LIZ(C545650Lad c545650Lad) {
                    InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                    Throwable exc = c545650Lad.LIZ.codeException;
                    if (exc == null) {
                        exc = new Exception("deleteAIGCDraft unknown fail");
                    }
                    C098200Yq c098200Yq = new C098200Yq(exc);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn2.resumeWith(c098200Yq);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: IllegalArgumentException -> 0x00bf, TryCatch #0 {IllegalArgumentException -> 0x00bf, blocks: (B:14:0x0037, B:16:0x0049, B:17:0x0068, B:20:0x0084, B:24:0x0098, B:26:0x00a0, B:29:0x00a7, B:30:0x00ad), top: B:41:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[Catch: IllegalArgumentException -> 0x00bf, TryCatch #0 {IllegalArgumentException -> 0x00bf, blocks: (B:14:0x0037, B:16:0x0049, B:17:0x0068, B:20:0x0084, B:24:0x0098, B:26:0x00a0, B:29:0x00a7, B:30:0x00ad), top: B:41:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0 A[Catch: IllegalArgumentException -> 0x00bf, TryCatch #0 {IllegalArgumentException -> 0x00bf, blocks: (B:14:0x0037, B:16:0x0049, B:17:0x0068, B:20:0x0084, B:24:0x0098, B:26:0x00a0, B:29:0x00a7, B:30:0x00ad), top: B:41:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[Catch: IllegalArgumentException -> 0x00bf, TryCatch #0 {IllegalArgumentException -> 0x00bf, blocks: (B:14:0x0037, B:16:0x0049, B:17:0x0068, B:20:0x0084, B:24:0x0098, B:26:0x00a0, B:29:0x00a7, B:30:0x00ad), top: B:41:0x0037 }] */
    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(final X.C546410Lbr r22, X.AbstractC23140094w r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.DraftServiceImpl.LJIIL(X.0Lbr, X.094w):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final void LJIILJJIL(CreativeModel creativeModel, Map<String, String> map) {
        Function2<CreativeModel, Map<String, String>, Unit> function2;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(false).iterator();
        while (it2.hasNext()) {
            C546400Lbq<Object> c546400LbqLIZJ = it2.next().LIZJ();
            if (c546400LbqLIZJ != null && (function2 = c546400LbqLIZJ.LJIIJ) != null) {
                function2.invoke(creativeModel, map);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    /* JADX INFO: renamed from: LJIJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C546450Lbv
            if (r0 == 0) goto L61
            r3 = r7
            X.0Lbv r3 = (X.C546450Lbv) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r1 = r3.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r2 = 1
            if (r0 == 0) goto L4b
            if (r0 != r2) goto L6a
            java.lang.Object r0 = r3.LLILLJJLI
            java.util.Iterator r0 = (java.util.Iterator) r0
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r6 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            X.0LbZ r1 = (X.C546230LbZ) r1
            X.0Lbq r1 = r1.LIZJ()
            if (r1 == 0) goto L28
            X.0Lby<java.lang.Object> r1 = r1.LJII
            if (r1 == 0) goto L28
            r3.LL = r6
            r3.LLILLJJLI = r0
            r3.LLILZIL = r2
            java.lang.Object r1 = r1.LIZ(r6, r3)
            if (r1 != r4) goto L28
            return r4
        L4b:
            X.C155000ia.LIZIZ(r1)
            X.0LeC r0 = X.C547860LeC.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.common.AIConfigService r1 = X.C547860LeC.LIZIZ()
            r0 = 0
            java.util.List r0 = r1.LJFF(r0)
            java.util.Iterator r0 = r0.iterator()
            goto L28
        L61:
            X.0Lbv r3 = new X.0Lbv
            r3.<init>(r5, r7)
            goto L12
        L67:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.DraftServiceImpl.LIZJ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC546090LbL r11, java.lang.String r12, X.C0LOJ r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.draft.model.AwemeDraft> r14) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.DraftServiceImpl.LJII(X.0LbL, java.lang.String, X.0LOJ, X.05Vn):java.lang.Object");
    }

    public final void LJIIZILJ(String str, Function1<? super Map<String, String>, Unit> function1, InterfaceC546090LbL interfaceC546090LbL, String str2, Level level) {
        C01GW c01gw = C547160Ld4.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        C547160Ld4.LJ(level, str2, C546330Lbj.LIZIZ(interfaceC546090LbL), C547180Ld6.LIZ(LJIILLIIL(), str), function1);
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
    public final InterfaceC546480Lby LJIIJJI(C0LOK c0lok, AwS409S0200000_8 awS409S0200000_8, AwS409S0200000_8 awS409S0200000_82, AwS587S0100000_8 awS587S0100000_8, AwS622S0100000_8 awS622S0100000_8, AwS622S0100000_8 awS622S0100000_82, AwS587S0100000_8 awS587S0100000_82, C546560Lc6 c546560Lc6) {
        return new C546620LcC(c0lok, awS409S0200000_8, awS409S0200000_82, awS587S0100000_8, awS622S0100000_8, awS622S0100000_82, awS587S0100000_82, c546560Lc6);
    }
}
