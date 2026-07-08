package com.ss.android.ugc.effectmanager.knadapt;

import X.InterfaceC318410Cdz;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;

/* JADX INFO: loaded from: classes4.dex */
public final class KNJsonConverter implements InterfaceC318410Cdz {
    public final IJsonConverter jsonConverter;

    public KNJsonConverter(IJsonConverter iJsonConverter) {
        this.jsonConverter = iJsonConverter;
    }

    @Override // X.InterfaceC318410Cdz
    public <T> String convertObjToJson(T t) {
        return this.jsonConverter.convertObjToJson(t);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x0027
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // X.InterfaceC318410Cdz
    public <T> T convertJsonToObj(java.lang.String r7, java.lang.Class<T> r8) {
        /*
            r6 = this;
            java.nio.charset.Charset r5 = kotlin.text.Charsets.UTF_8
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            byte[] r0 = r7.getBytes(r5)
            r4.<init>(r0)
            r3 = 0
            com.ss.android.ugc.effectmanager.common.listener.IJsonConverter r2 = r6.jsonConverter     // Catch: java.lang.Throwable -> L1f
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L1f
            byte[] r0 = r7.getBytes(r5)     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r2.convertJsonToObj(r1, r8)     // Catch: java.lang.Throwable -> L1f
            X.C2107108Nh.LIZ(r4, r3)
            return r0
        L1f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L27
            throw r1     // Catch: java.lang.Throwable -> L24
        L24:
            r0 = move-exception
            r3 = r1
            goto L28
        L27:
            r0 = move-exception
        L28:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L27
            X.C2107108Nh.LIZ(r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter.convertJsonToObj(java.lang.String, java.lang.Class):java.lang.Object");
    }
}
