package com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource;

import X.C01GW;
import X.C0PEM;
import X.C1341005Mq;
import X.C1341105Mr;
import X.C1341405Mu;
import X.C1341605Mw;
import X.C1BNE;
import X.C2252321DDq;
import X.C2286608xc;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.socialavatar.api.BatchSocialAvatarService;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.MixStudioUseFriendsIDSettingsConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkBackedBatchSocialAvatarService implements BatchSocialAvatarService {
    public final long LIZ = ((MixStudioUseFriendsIDSettingsConfig) C1341605Mw.LIZIZ.getValue()).cacheExpireTime;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(665));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(136));
    public final ConcurrentHashMap<Pair<Integer, String>, C1341105Mr> LIZLLL = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.socialavatar.api.BatchSocialAvatarService
    public final Object LIZIZ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            for (Object obj : (List) entry.getValue()) {
                C1341105Mr c1341105Mr = this.LIZLLL.get(new Pair(C2286608xc.LJ(iIntValue), obj));
                if (c1341105Mr != null && SystemClock.elapsedRealtime() <= c1341105Mr.LIZIZ + this.LIZ) {
                    Integer numLJ = C2286608xc.LJ(iIntValue);
                    Object linkedHashMap3 = linkedHashMap2.get(numLJ);
                    if (linkedHashMap3 == null) {
                        linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap2.put(numLJ, linkedHashMap3);
                    }
                    ((Map) linkedHashMap3).put(obj, c1341105Mr.LIZ);
                } else {
                    Integer numLJ2 = C2286608xc.LJ(iIntValue);
                    Object arrayList = linkedHashMap.get(numLJ2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(numLJ2, arrayList);
                    }
                    ((List) arrayList).add(obj);
                    C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1341405Mu.LIZ);
                    this.LIZLLL.put(new Pair<>(C2286608xc.LJ(iIntValue), obj), new C1341105Mr(SystemClock.elapsedRealtime(), c2252321DDqLIZ));
                    Integer numLJ3 = C2286608xc.LJ(iIntValue);
                    Object linkedHashMap4 = linkedHashMap2.get(numLJ3);
                    if (linkedHashMap4 == null) {
                        linkedHashMap4 = new LinkedHashMap();
                        linkedHashMap2.put(numLJ3, linkedHashMap4);
                    }
                    ((Map) linkedHashMap4).put(obj, c2252321DDqLIZ);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1341005Mq(linkedHashMap, this, null), 3);
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    @Override // com.ss.android.ugc.aweme.socialavatar.api.BatchSocialAvatarService
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<java.lang.String> r15, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, ? extends X.InterfaceC439080HJq>> r16) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<java.lang.String> r12, X.InterfaceC1364105Vn<? super java.util.concurrent.ConcurrentHashMap<java.lang.String, X.InterfaceC439080HJq>> r13) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService.LIZJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x011b -> B:51:0x0124). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0134 -> B:56:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0187 -> B:93:0x01a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0194 -> B:99:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x019b -> B:99:0x01b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:81:0x018a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.Map<java.lang.Integer, ? extends java.util.List<java.lang.String>> r15, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.Integer, ? extends java.util.Map<java.lang.String, ? extends X.InterfaceC439080HJq>>> r16) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService.LIZLLL(java.util.Map, X.05Vn):java.lang.Object");
    }
}
