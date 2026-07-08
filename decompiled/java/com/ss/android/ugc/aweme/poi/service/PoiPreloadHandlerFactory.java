package com.ss.android.ugc.aweme.poi.service;

import X.C1697810uHb;
import X.InterfaceC1186540gyy;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.localservice.preload.PreloadHandlerFactory;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumPreloadHandler;
import com.ss.android.ugc.aweme.poi.map.PoiMapDetailPreloadHandler;
import com.ss.android.ugc.aweme.poi.osp.preload.PoiOrderPrepareNetPreload;
import com.ss.android.ugc.aweme.poi.osp.preload.PoiOrderSubmitPreloadExp;
import com.ss.android.ugc.aweme.poi.reviews.preload.PoiReviewEligiblePreload;
import com.ss.android.ugc.aweme.poi.reviews.preload.PoiReviewUserStatsPreload;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPreloadHandlerFactory implements PreloadHandlerFactory {
    @Override // com.ss.android.ugc.aweme.localservice.preload.PreloadHandlerFactory
    public final List<InterfaceC1186540gyy> LIZ() {
        return C1697810uHb.LJIIJJI(new PoiAlbumPreloadHandler(), new InterfaceC1186540gyy() { // from class: X.0gwb
            @Override // X.InterfaceC1186540gyy
            public final void doPreload(Context context, RouteIntent routeIntent) {
            }

            @Override // X.InterfaceC1186540gyy
            public final List<Class<? extends InterfaceC20153313tL>> getNetPreloadConfig(Context context, RouteIntent routeIntent) {
                return null;
            }

            @Override // X.InterfaceC1186540gyy
            public final List<C1181330gqZ> getXmlPreloadConfig(Context context, RouteIntent routeIntent) {
                return null;
            }

            @Override // X.InterfaceC1186540gyy
            public final boolean isEnabled() {
                return ((Number) C279340AxA.LIZ.getValue()).intValue() == 1;
            }

            @Override // X.InterfaceC1186540gyy
            public final List<String> supportedUri() {
                return C1697810uHb.LJIIJJI("//poi/gallery", "//poi/gallery/v2", "//poi/gallery_for_reviews");
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
            @Override // X.InterfaceC1186540gyy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<X.C1202730hP5> getImagePreloadConfig(android.content.Context r7, com.bytedance.router.RouteIntent r8) {
                /*
                    r6 = this;
                    r3 = 0
                    if (r8 == 0) goto Le
                    android.content.Intent r0 = r8.getExtra()
                    if (r0 == 0) goto Le
                    android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Exception -> L10
                    goto L15
                Le:
                    r2 = r3
                    goto L1d
                L10:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    r1 = r3
                L15:
                    if (r1 == 0) goto Le
                    java.lang.String r0 = "poi_gallery_images"
                    java.util.ArrayList r2 = r1.getStringArrayList(r0)
                L1d:
                    if (r2 != 0) goto L21
                    X.13BV r2 = X.C13BV.INSTANCE
                L21:
                    if (r8 == 0) goto L2e
                    android.content.Intent r0 = r8.getExtra()
                    if (r0 == 0) goto L2e
                    android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Exception -> L30
                    goto L35
                L2e:
                    r0 = r3
                    goto L41
                L30:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    r1 = r3
                L35:
                    if (r1 == 0) goto L2e
                    java.lang.String r0 = "poi_gallery_index"
                    int r0 = r1.getInt(r0)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                L41:
                    int r0 = X.C1175120ggY.LIZJ(r0)
                    java.lang.Object r2 = X.C13LP.LJJJLZIJ(r0, r2)
                    java.lang.String r2 = (java.lang.String) r2
                    r5 = 0
                    r1 = 1
                    if (r2 == 0) goto L59
                    int r0 = r2.length()
                    if (r0 == 0) goto L59
                    r0 = 0
                L56:
                    if (r0 == 0) goto L5b
                    return r3
                L59:
                    r0 = 1
                    goto L56
                L5b:
                    X.0hP5[] r4 = new X.C1202730hP5[r1]
                    X.0hP5 r3 = new X.0hP5
                    java.lang.String[] r0 = new java.lang.String[r1]
                    r0[r5] = r2
                    java.util.ArrayList r2 = X.C1697810uHb.LJ(r0)
                    java.lang.String r1 = "poi_gallery"
                    java.lang.String r0 = "poi_gallery_image"
                    r3.<init>(r2, r1, r0)
                    r4[r5] = r3
                    java.util.ArrayList r0 = X.C1697810uHb.LJ(r4)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1185070gwb.getImagePreloadConfig(android.content.Context, com.bytedance.router.RouteIntent):java.util.List");
            }
        }, new PoiMapDetailPreloadHandler(), new InterfaceC1186540gyy() { // from class: X.0gwc
            @Override // X.InterfaceC1186540gyy
            public final void doPreload(Context context, RouteIntent routeIntent) {
            }

            @Override // X.InterfaceC1186540gyy
            public final List<C1202730hP5> getImagePreloadConfig(Context context, RouteIntent routeIntent) {
                return null;
            }

            @Override // X.InterfaceC1186540gyy
            public final List<String> supportedUri() {
                return Collections.singletonList("//poi/review_list");
            }

            @Override // X.InterfaceC1186540gyy
            public final boolean isEnabled() {
                return C0BVC.LIZ();
            }

            @Override // X.InterfaceC1186540gyy
            public final List<Class<? extends InterfaceC20153313tL>> getNetPreloadConfig(Context context, RouteIntent routeIntent) {
                return C1697810uHb.LJIIJJI(PoiReviewUserStatsPreload.class, PoiReviewEligiblePreload.class);
            }

            @Override // X.InterfaceC1186540gyy
            public final List<C1181330gqZ> getXmlPreloadConfig(Context context, RouteIntent routeIntent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C1181330gqZ(1, 1, Integer.valueOf(R.layout.e1g), 1, "poi_fragment_all_reviews"));
                arrayList.add(new C1181330gqZ(5, 1, Integer.valueOf(R.layout.e20), 5, "poi_item_reviews_cell"));
                return arrayList;
            }
        }, new InterfaceC1186540gyy() { // from class: X.0gyz
            @Override // X.InterfaceC1186540gyy
            public final void doPreload(Context context, RouteIntent routeIntent) {
            }

            @Override // X.InterfaceC1186540gyy
            public final List<C1202730hP5> getImagePreloadConfig(Context context, RouteIntent routeIntent) {
                return null;
            }

            @Override // X.InterfaceC1186540gyy
            public final boolean isEnabled() {
                return Intrinsics.LJFF(((PoiOrderSubmitPreloadExp.PoiOrderSubmitPreloadConfigModel) PoiOrderSubmitPreloadExp.LIZIZ.getValue()).enable, Boolean.TRUE);
            }

            @Override // X.InterfaceC1186540gyy
            public final List<String> supportedUri() {
                return Collections.singletonList("//poi/order/submit");
            }

            @Override // X.InterfaceC1186540gyy
            public final List<Class<? extends InterfaceC20153313tL>> getNetPreloadConfig(Context context, RouteIntent routeIntent) {
                if (Intrinsics.LJFF(((PoiOrderSubmitPreloadExp.PoiOrderSubmitPreloadConfigModel) PoiOrderSubmitPreloadExp.LIZIZ.getValue()).netPreload, Boolean.TRUE)) {
                    return Collections.singletonList(PoiOrderPrepareNetPreload.class);
                }
                return null;
            }

            @Override // X.InterfaceC1186540gyy
            public final List<C1181330gqZ> getXmlPreloadConfig(Context context, RouteIntent routeIntent) {
                if (Intrinsics.LJFF(((PoiOrderSubmitPreloadExp.PoiOrderSubmitPreloadConfigModel) PoiOrderSubmitPreloadExp.LIZIZ.getValue()).xmlPreload, Boolean.TRUE)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C1181330gqZ(0, 1, 8, Integer.valueOf(R.layout.e5s), 1, "poi_order_submit_slash_page"));
                    return arrayList;
                }
                return null;
            }
        });
    }
}
