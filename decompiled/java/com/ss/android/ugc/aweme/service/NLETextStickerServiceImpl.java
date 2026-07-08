package com.ss.android.ugc.aweme.service;

import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0F8D;
import X.C189200o6;
import X.C2252611DEt;
import X.C389400FOo;
import X.C452501pT;
import X.InterfaceC20236714Gf;
import com.bytedance.ies.nle.editor_jni.EpResourceCallback;
import com.ss.android.ugc.aweme.interfaces.INLETextStickerService;
import com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class NLETextStickerServiceImpl implements INLETextStickerService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(43));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 62));

    public static Object LIZLLL(C0F8D c0f8d, Function1 function1) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c0f8d));
        c2252611DEt.LJIJJ();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        EpResourceCallback epResourceCallback = new EpResourceCallback() { // from class: X.0F8I
            @Override // com.bytedance.ies.nle.editor_jni.EpResourceCallback
            public final void onSuccess(String str) {
                NLETextStickerServiceImpl.LJ(atomicBoolean, c2252611DEt, true);
            }

            @Override // com.bytedance.ies.nle.editor_jni.EpResourceCallback
            public final void onFailure(int i, String str) {
                NLETextStickerServiceImpl.LJ(atomicBoolean, c2252611DEt, false);
            }
        };
        c2252611DEt.LJJII(new AwS584S0100000_5(atomicBoolean, 948));
        if (!((Boolean) function1.invoke(epResourceCallback)).booleanValue()) {
            LJ(atomicBoolean, c2252611DEt, false);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c0f8d);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r11, X.InterfaceC1364105Vn<? super com.ss.android.ugc.effectmanager.effect.model.Effect> r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static final void LJ(AtomicBoolean atomicBoolean, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf, boolean z) {
        if (atomicBoolean.compareAndSet(false, true)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(boolValueOf);
            interfaceC20236714Gf.resumeWith(boolValueOf);
        }
    }

    public static final Effect LIZJ(String str, String str2, NLETextStickerServiceImpl nLETextStickerServiceImpl, String str3) {
        boolean z;
        Effect effect;
        Effect effectLIZIZ;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && (effectLIZIZ = ((C389400FOo) nLETextStickerServiceImpl.LIZ.getValue()).LIZIZ(str, str2)) != null) {
            return effectLIZIZ;
        }
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C389400FOo c389400FOo = (C389400FOo) nLETextStickerServiceImpl.LIZ.getValue();
            c389400FOo.getClass();
            if (str3 != null && !a0.LJJJIL(str3) && (effect = (Effect) ((LinkedHashMap) c389400FOo.LIZIZ).get(str3)) != null) {
                return effect;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01b9  */
    @Override // com.ss.android.ugc.aweme.interfaces.INLETextStickerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.ies.nle.editor_jni.NLEModel r20, com.ss.android.ugc.aweme.creative.model.CreativeModel r21, int r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl.LIZ(com.bytedance.ies.nle.editor_jni.NLEModel, com.ss.android.ugc.aweme.creative.model.CreativeModel, int, X.05Vn):java.lang.Object");
    }
}
