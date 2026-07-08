package com.ss.android.ugc.aweme.socialavatar.mixstudio.ids;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C05YD;
import X.C0H6S;
import X.C0HGK;
import X.C0HGL;
import X.C0HKU;
import X.C0HO0;
import X.C0HOE;
import X.C0HOF;
import X.C0HOM;
import X.C0HPS;
import X.C0HPZ;
import X.C0HQC;
import X.C0HZV;
import X.C0VSV;
import X.C1372405Ys;
import X.C1372605Yu;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1559260qg8;
import X.C1697820uHc;
import X.C1910890zpH;
import X.C1BNE;
import X.C2097608Jq;
import X.C2106208My;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C2219308ml;
import X.C23250099c;
import X.C435610H6h;
import X.C435750H6v;
import X.C439970HNb;
import X.C439990HNd;
import X.C440000HNe;
import X.C440010HNf;
import X.C440020HNg;
import X.C440040HNi;
import X.C440080HNm;
import X.C440110HNp;
import X.C440440HOw;
import X.C440480HPa;
import X.C440500HPc;
import X.C440630HPp;
import X.C440710HPx;
import X.C443120HZe;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC440090HNn;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.BufferedInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class IdAndElementViewModel extends AssemViewModel<C0HPZ> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C440500HPc.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(266));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(269));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(267));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(268));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 628));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(270));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C440710HPx c440710HPx = C440710HPx.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        C1372605Yu c1372605Yu = C1372605Yu.LIZIZ;
        return new C0HPZ(c440710HPx, c13bv, C1BNE.LIZ(c1372605Yu), new LinkedHashMap(), C2097608Jq.LJ(), C1BNE.LIZ(c1372605Yu), null);
    }

    public final C1910890zpH getLogger() {
        return (C1910890zpH) this.LLIZ.getValue();
    }

    public final String xQ2() {
        return (String) this.LLILZ.getValue();
    }

    public final C0HKU yQ2() {
        return (C0HKU) this.LLILZLL.getValue();
    }

    public final String zQ2() {
        C0HOF c0hof = C0HOE.Companion;
        C0HOM<? extends List<C440440HOw>> value = getState().LLILZLL.getValue();
        String strXQ2 = xQ2();
        c0hof.getClass();
        C0HOE c0hoeLIZ = C0HOF.LIZ(value, strXQ2);
        if (c0hoeLIZ != null) {
            return c0hoeLIZ.getParam();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C440630HPp(this, null), 3);
    }

    public final int wQ2() {
        Iterator<C0HQC> it2 = getState().LLILLJJLI.iterator();
        int size = 0;
        while (it2.hasNext()) {
            size += it2.next().LIZIZ.size();
        }
        return size;
    }

    public static List AQ2(C0HGL c0hgl, int i) {
        ArrayList arrayList = new ArrayList(c0hgl.LIZ(new C0H6S(Integer.valueOf(i), Boolean.TRUE)));
        if (arrayList.size() < 8) {
            arrayList.addAll(C13LP.LL(C1697820uHc.LIZLLL(c0hgl.LIZ(new C0H6S(Integer.valueOf(i), Boolean.FALSE))), 8 - arrayList.size()));
        }
        return arrayList;
    }

    public final File CQ2(BufferedInputStream bufferedInputStream, String str) throws Throwable {
        bufferedInputStream.mark(64);
        boolean zLIZ = C2219308ml.LIZ(bufferedInputStream);
        bufferedInputStream.reset();
        if (zLIZ) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStream);
            try {
                if (bitmapDecodeStream != null) {
                    try {
                        File fileCreateTempFile = File.createTempFile("sa_frame_", ".png");
                        C0VSV c0vsv = new C0VSV(fileCreateTempFile);
                        try {
                            bitmapDecodeStream.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
                            C2107108Nh.LIZ(c0vsv, null);
                            bitmapDecodeStream.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeStream);
                            return fileCreateTempFile;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsv, th);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = null;
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsv, th);
                                throw th;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        getLogger().LIZJ("IdAndElementViewModel", "Failed to save sticker first frame", e);
                        bitmapDecodeStream.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeStream);
                        return null;
                    }
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
                bitmapDecodeStream.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeStream);
            }
        } else {
            Uri uri = UriProtector.parse(str);
            if (!Intrinsics.LJFF(uri.getScheme(), "http") && !Intrinsics.LJFF(uri.getScheme(), "https")) {
                return null;
            }
            try {
                File fileCreateTempFile2 = File.createTempFile("sa_static_", ".png");
                C0VSV c0vsv2 = new C0VSV(fileCreateTempFile2);
                try {
                    C2106208My.LIZ(bufferedInputStream, c0vsv2);
                    C2107108Nh.LIZ(c0vsv2, null);
                    return fileCreateTempFile2;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(c0vsv2, th);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                getLogger().LIZJ("IdAndElementViewModel", "Failed to copy remote sticker image", e2);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher$IdAndElementConfiguration] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher$IdAndElementConfiguration] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher.IdAndElementConfiguration r17, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher.IdAndElementConfiguration> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel.DQ2(com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher$IdAndElementConfiguration, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[PHI: r0 r2
      0x0098: PHI (r0v14 java.lang.String) = (r0v12 java.lang.String), (r0v15 java.lang.String) binds: [B:36:0x0084, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r2v8 java.io.File) = (r2v5 java.io.File), (r2v10 java.io.File) binds: [B:36:0x0084, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(java.lang.String r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C2219608mo
            if (r0 == 0) goto L9a
            r4 = r15
            X.08mo r4 = (X.C2219608mo) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 2
            r6 = 1
            r12 = 0
            if (r0 == 0) goto L27
            if (r0 == r6) goto L69
            if (r0 != r3) goto La1
            X.C155000ia.LIZIZ(r2)
        L26:
            return r2
        L27:
            X.C155000ia.LIZIZ(r2)
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r7 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r8 = 0
            r11 = 14
            r9 = r8
            r10 = r8
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r1 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r1
            if (r1 == 0) goto La9
            X.0mCc r0 = X.C1906580ziK.LJFF()
            if (r0 == 0) goto L67
            android.app.Activity r0 = r0.LIZIZ()
        L43:
            boolean r0 = r1.LJI(r0)
            if (r0 != r6) goto La9
            X.0mCc r0 = X.C1906580ziK.LJFF()
            if (r0 == 0) goto L7b
            android.app.Activity r2 = r0.LIZIZ()
            if (r2 == 0) goto L7b
            X.1DFB r1 = X.C0PEM.LIZJ
            X.08mm r0 = new X.08mm
            r0.<init>(r2, r14, r13, r12)
            r4.LL = r14
            r4.LLILZ = r6
            java.lang.Object r2 = X.C23250099c.LJI(r4, r1, r0)
            if (r2 != r5) goto L70
            return r5
        L67:
            r0 = r12
            goto L43
        L69:
            java.lang.Object r14 = r4.LL
            java.lang.String r14 = (java.lang.String) r14
            X.C155000ia.LIZIZ(r2)
        L70:
            java.io.File r2 = (java.io.File) r2
            if (r2 == 0) goto L7c
            java.lang.String r0 = r2.getAbsolutePath()
            if (r0 != 0) goto L98
            goto L7c
        L7b:
            r2 = r12
        L7c:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r14)
            java.lang.String r0 = r0.getPath()
            if (r0 != 0) goto L98
        L86:
            X.1DFH r1 = X.C0PEM.LIZ
            X.08mn r0 = new X.08mn
            r0.<init>(r14, r13, r2, r12)
            r4.LL = r12
            r4.LLILZ = r3
            java.lang.Object r2 = X.C23250099c.LJI(r4, r1, r0)
            if (r2 != r5) goto L26
            return r5
        L98:
            r14 = r0
            goto L86
        L9a:
            X.08mo r4 = new X.08mo
            r4.<init>(r13, r15)
            goto L12
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La9:
            X.0zpH r2 = r13.getLogger()
            java.lang.String r1 = "IdAndElementViewModel"
            java.lang.String r0 = "VE plugin not ready, skip sticker face detection"
            r2.LIZ(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel.EQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static C0HPS BQ2(int i, InterfaceC440090HNn interfaceC440090HNn, Map map) {
        C0HZV c0hzv;
        Object c439970HNb;
        C0HGK c0hgk;
        C0HZV c0hzv2;
        Object c439970HNb2;
        C0HGK c0hgk2;
        C0HGL c0hgl = (C0HGL) map.get(Integer.valueOf(i));
        if (c0hgl != null) {
            if (i != 0) {
                if (i == 1) {
                    List listLIZLLL = C1697820uHc.LIZLLL(AQ2(c0hgl, 4));
                    ArrayList<C435750H6v> arrayList = new ArrayList();
                    for (Object obj : listLIZLLL) {
                        if (obj instanceof C435750H6v) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    for (C435750H6v c435750H6v : arrayList) {
                        arrayList2.add(new C440000HNe(c435750H6v.LIZ, c435750H6v.LIZIZ, c435750H6v.LIZJ));
                    }
                    if (arrayList2.size() >= 8) {
                        C0HZV c0hzvLIZ = C0HO0.LIZ(arrayList2);
                        if (C440480HPa.LIZJ()) {
                            c0hzv2 = new C0HZV(ListProtector.get(arrayList2, 5), ListProtector.get(arrayList2, 6), ListProtector.get(arrayList2, 7), new C440080HNm(), new C440020HNg(true));
                        } else {
                            Object obj2 = ListProtector.get(arrayList2, 5);
                            C440080HNm c440080HNm = new C440080HNm();
                            C440020HNg c440020HNg = new C440020HNg(true);
                            if (interfaceC440090HNn instanceof C0HGK) {
                                c439970HNb2 = new C439990HNd(1, null, ((C0HGK) interfaceC440090HNn).LIZ);
                            } else {
                                c439970HNb2 = new C439970HNb(1, null, null);
                            }
                            c0hzv2 = new C0HZV(obj2, c440080HNm, c440020HNg, c439970HNb2, new C440040HNi(1, 4));
                        }
                        Object objLJLJJI = C13LP.LJLJJI(c0hgl.LIZ(new C0H6S((Integer) 2, 2)), AbstractC19994813Le.Default);
                        if ((objLJLJJI instanceof C0HGK) && (c0hgk2 = (C0HGK) objLJLJJI) != null) {
                            return new C0HPS(c0hzvLIZ, c0hzv2, c0hgk2.LIZ);
                        }
                        throw new IllegalArgumentException("Not enough text prompts");
                    }
                    throw new IllegalArgumentException("Not enough meme elements for AISelf.");
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Illegal idType, cannot find element row builder: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            List listLIZLLL2 = C1697820uHc.LIZLLL(AQ2(c0hgl, 3));
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : listLIZLLL2) {
                if (obj3 instanceof C435610H6h) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new C440010HNf(((C435610H6h) it2.next()).LIZ));
            }
            if (arrayList4.size() >= 8) {
                C0HZV c0hzvLIZ2 = C0HO0.LIZ(arrayList4);
                if (C440480HPa.LIZJ()) {
                    c0hzv = new C0HZV(ListProtector.get(arrayList4, 5), ListProtector.get(arrayList4, 6), ListProtector.get(arrayList4, 7), new C440110HNp(), new C440020HNg(false));
                } else {
                    Object obj4 = ListProtector.get(arrayList4, 5);
                    C440110HNp c440110HNp = new C440110HNp();
                    C440020HNg c440020HNg2 = new C440020HNg(false);
                    if (interfaceC440090HNn instanceof C0HGK) {
                        c439970HNb = new C439990HNd(0, null, ((C0HGK) interfaceC440090HNn).LIZ);
                    } else {
                        c439970HNb = new C439970HNb(0, null, null);
                    }
                    c0hzv = new C0HZV(obj4, c440110HNp, c440020HNg2, c439970HNb, new C440040HNi(0, 3));
                }
                Object objLJLJJI2 = C13LP.LJLJJI(c0hgl.LIZ(new C0H6S((Integer) 2, 2)), AbstractC19994813Le.Default);
                if ((objLJLJJI2 instanceof C0HGK) && (c0hgk = (C0HGK) objLJLJJI2) != null) {
                    return new C0HPS(c0hzvLIZ2, c0hzv, c0hgk.LIZ);
                }
                throw new IllegalArgumentException("Not enough text prompts");
            }
            throw new IllegalArgumentException("Not enough emoji elements for SA.");
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Missing idType from elementsResponse: ");
        sbLIZ2.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C05YD vQ2(int i, String str, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator<C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>>> it3 = ((C0HQC) it2.next()).LIZIZ.iterator();
            while (it3.hasNext()) {
                C05YD<C0HOM<? extends C440440HOw>> third = it3.next().getThird();
                C0HOM<? extends C440440HOw> value = third.getValue();
                if (value instanceof C1372405Ys) {
                    C440440HOw c440440HOw = (C440440HOw) ((C1372405Ys) value).LIZIZ;
                    if (c440440HOw.LJ == i && Intrinsics.LJFF(c440440HOw.LIZJ, str)) {
                        return third;
                    }
                }
            }
        }
        return null;
    }
}
