package com.ss.android.ugc.aweme.ecommerce.mall.recommend.video;

import X.C098200Yq;
import X.C09AE;
import X.C1227904rF;
import X.C189200o6;
import X.C1943507jN;
import X.C1DEV;
import X.C2188811AlT;
import X.C2191201ApK;
import X.C2341109Fh;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.IVideoDetailLoadService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.RecommendItemsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class VideoDetailLoadImpl implements IVideoDetailLoadService {
    public final ConcurrentHashMap<String, C09AE> LIZ = new ConcurrentHashMap<>();
    public final C1DEV LIZIZ = C2191201ApK.LIZ();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.video.IVideoDetailLoadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.Aweme LIZIZ(java.lang.String r6) {
        /*
            r5 = this;
            r2 = 0
            if (r6 == 0) goto L30
            X.07jN r0 = X.C1943507jN.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.LIZIZ(r6)
            if (r4 == 0) goto L31
            java.lang.String r0 = r4.getAid()
        Lf:
            java.lang.String r3 = "EcAwemeStruct VideoDetailLoadImpl getCatchDetail awemeId="
            if (r0 != 0) goto L33
            X.09Fh r1 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            if (r4 == 0) goto L22
            java.lang.String r2 = r4.getAid()
        L22:
            r0.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.getClass()
            X.C2341109Fh.LIZJ(r0)
            return r4
        L30:
            r4 = r2
        L31:
            r0 = r2
            goto Lf
        L33:
            X.09Fh r2 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = r4.getAid()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C2341109Fh.LIZ(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl.LIZIZ(java.lang.String):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    public static void LIZJ(String str, RecommendItemsResponse.DetailItem detailItem) {
        Unit unit;
        RecommendItemsResponse.VideoInfo videoInfo;
        RecommendItemsResponse.VideoPlayInfo videoPlayInfo;
        String str2;
        try {
            RecommendItemsResponse.StandardData standardData = detailItem.standardData;
            if (standardData != null && (videoInfo = standardData.videoInfo) != null && (videoPlayInfo = videoInfo.videoPlayInfo) != null && (str2 = videoPlayInfo.awemeStruct) != null) {
                C1227904rF.LIZ.getClass();
                Aweme aweme = (Aweme) C1227904rF.LIZIZ(str2, Aweme.class);
                C1943507jN c1943507jN = C1943507jN.LIZ;
                c1943507jN.LIZJ(aweme, aweme.getAid(), str);
                if (c1943507jN.LIZIZ(aweme.getAid()) != null) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EcAwemeStruct VideoDetailLoadImpl putCacheDetail success awemeId=");
                    sbLIZ.append(aweme.getAid());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LIZ(strLIZIZ);
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.video.IVideoDetailLoadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams r10, X.InterfaceC1364105Vn r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl.LIZ(com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|2|(2:4|(1:6)(1:11))(0)|7|(1:(3:10|67|22)(2:12|13))(17:14|71|15|(4:17|73|18|(1:20)(1:21))(14:32|69|33|42|(1:44)|45|(3:75|47|(2:49|51)(1:50))(0)|(1:53)(1:54)|55|(1:57)(1:62)|58|(1:60)|61|63)|39|41|42|(0)|45|(0)(0)|(0)(0)|55|(0)(0)|58|(0)|61|63)|23|(1:30)(1:29)|31|69|33|42|(0)|45|(0)(0)|(0)(0)|55|(0)(0)|58|(0)|61|63|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3 A[Catch: all -> 0x00ee, TryCatch #4 {all -> 0x00ee, blocks: (B:47:0x00a9, B:55:0x00b8, B:57:0x00c3, B:58:0x00c7, B:60:0x00cd, B:61:0x00d5), top: B:75:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd A[Catch: all -> 0x00ee, TryCatch #4 {all -> 0x00ee, blocks: (B:47:0x00a9, B:55:0x00b8, B:57:0x00c3, B:58:0x00c7, B:60:0x00cd, B:61:0x00d5), top: B:75:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams r14, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.mall.service.video.RecommendItemsResponse.DetailItem>> r15) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl.LIZLLL(com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0229 A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:112:0x0240, B:113:0x0243, B:114:0x0245, B:16:0x004e, B:105:0x0216, B:106:0x0219, B:108:0x0229, B:102:0x01de, B:103:0x01e1, B:18:0x0056, B:20:0x005a, B:21:0x0069, B:23:0x006f, B:26:0x007e, B:32:0x008a, B:34:0x0097, B:36:0x009e, B:38:0x00a2, B:53:0x00ca, B:41:0x00a9, B:42:0x00ad, B:44:0x00b3, B:55:0x00d7, B:57:0x00db, B:72:0x0105, B:104:0x01e2, B:60:0x00e2, B:61:0x00e6, B:63:0x00ec, B:76:0x011d, B:78:0x0121, B:92:0x0149, B:93:0x0169, B:95:0x016f, B:97:0x0177, B:98:0x01a3, B:99:0x01a6, B:81:0x0128, B:82:0x012c, B:84:0x0132), top: B:122:0x0028, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, X.0956, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.video.IVideoDetailLoadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preloadDetail(com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams r18, boolean r19, java.lang.String r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl.preloadDetail(com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams, boolean, java.lang.String, X.05Vn):java.lang.Object");
    }
}
