package com.ss.android.ugc.aweme.minidrama.common.component.impl;

import X.C1163504gr;
import X.C1611550s2T;
import X.C1611660s2e;
import X.C1612480s3y;
import X.C1612600s4A;
import X.C1612830s4X;
import X.C1613360s5O;
import X.C2344009Gk;
import X.EnumC1612690s4J;
import X.EnumC1613440s5W;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.ss.android.ugc.aweme.util.MiniDramaETService;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaETServiceImpl extends C1611660s2e implements MiniDramaETService {
    @Override // com.ss.android.ugc.aweme.util.MiniDramaETService
    public final void LIZLLL(CollectionDetailModel collectionDetailModel) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612480s3y.LJIIL(c2344009Gk, "video_publish_page", false);
        if (collectionDetailModel != null) {
            C1612480s3y.LJIIJ(c2344009Gk, collectionDetailModel);
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("add_video_collections_add_link", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.util.MiniDramaETService
    public final void LIZJ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("author_id", str2);
        c2344009Gk.LJFF("selected_collection_id_list", str3);
        C1163504gr.LIZIZ.onEventV3("click_submit_series_to_post", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.util.MiniDramaETService
    public final void LIZIZ(int i, String str, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str2);
        c2344009Gk.LJFF("from_user_id", str3);
        c2344009Gk.LJFF("to_user_id", str4);
        c2344009Gk.LIZJ(i, "is_self");
        c2344009Gk.LJFF("previous_page", str5);
        C1163504gr.LIZIZ.onEventV3(str, c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.util.MiniDramaETService
    public final void LJ(EnumC1613440s5W enumC1613440s5W, C1613360s5O c1613360s5O, Boolean bool, String str, String str2, Long l, long j) {
        C1612600s4A c1612600s4A;
        String key;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c1613360s5O != null) {
            CollectionDetailModel collectionDetailModel = c1613360s5O.LIZ;
            if (collectionDetailModel != null) {
                C1612480s3y.LJIIJ(c2344009Gk, collectionDetailModel);
                C1612480s3y.LJIJI(c2344009Gk, collectionDetailModel.category);
                C1611660s2e.LJJI(c2344009Gk, collectionDetailModel);
            }
            C1612830s4X c1612830s4X = c1613360s5O.LIZIZ;
            String strLJIJJ = null;
            if (c1612830s4X != null) {
                C1612480s3y.LJIIL(c2344009Gk, c1612830s4X.enterFrom, c1612830s4X.isFromAd());
                c2344009Gk.LJFF("is_from_bottom_banner", C1612480s3y.LJIJJ(c1612830s4X.isFromBottomBanner()));
                C1612480s3y.LJIILL(c2344009Gk, c1612830s4X.isFromAnchor());
                c2344009Gk.LJ(c1612830s4X.videoCountToPurchase, "video_count_to_purchase");
                c2344009Gk.LIZJ(c1612830s4X.isPurchaseFullSeries() ? 1 : 0, "is_purchase_full_series");
                Long l2 = c1612830s4X.roomId;
                if (l2 != null) {
                    c2344009Gk.LIZLLL(l2.longValue(), "room_id");
                }
                EnumC1612690s4J enumC1612690s4J = c1612830s4X.sourceWay;
                if (enumC1612690s4J != null) {
                    key = enumC1612690s4J.getKey();
                } else {
                    key = null;
                }
                c2344009Gk.LJIIIIZZ("source_way", key);
                c2344009Gk.LJFF("is_from_sdp", C1612480s3y.LJIJJ(c1612830s4X.isFromSDP()));
            }
            c2344009Gk.LJIIIIZZ("payment_type", "IAP");
            if (bool != null) {
                c2344009Gk.LJFF("one_step_payment", C1612480s3y.LJIJJ(bool.booleanValue()));
            }
            c2344009Gk.LJFF("error_code", str);
            c2344009Gk.LJFF("error_message", str2);
            c2344009Gk.LJFF("stage", enumC1613440s5W.getKey());
            c2344009Gk.LJ(l, "total_duration");
            c2344009Gk.LIZLLL(j, "stage_duration");
            C1612830s4X c1612830s4X2 = c1613360s5O.LIZIZ;
            if (c1612830s4X2 != null) {
                c1612600s4A = c1612830s4X2.anchorInfo;
            } else {
                c1612600s4A = null;
            }
            C1612480s3y.LJIIZILJ(c2344009Gk, c1612600s4A);
            C1612830s4X c1612830s4X3 = c1613360s5O.LIZIZ;
            if (c1612830s4X3 != null) {
                strLJIJJ = C1612480s3y.LJIJJ(c1612830s4X3.isUrlLess());
            }
            c2344009Gk.LJFF("is_urlless", strLJIJJ);
        }
        C1163504gr.LIZIZ.onEventV3("series_payment_log", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    @Override // com.ss.android.ugc.aweme.util.MiniDramaETService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.model.CollectionDetailModel r7, java.lang.Boolean r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, java.lang.Boolean r12, java.lang.String r13, java.util.List<com.ss.android.ugc.aweme.model.PurchaseOption> r14, java.lang.Boolean r15) {
        /*
            r6 = this;
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            if (r8 == 0) goto Le
            boolean r0 = r8.booleanValue()
            X.C1612480s3y.LJIILL(r3, r0)
        Le:
            r2 = 0
            X.C1612480s3y.LJIIL(r3, r9, r2)
            java.lang.String r0 = "source_way"
            r3.LJIIIIZZ(r0, r10)
            if (r11 == 0) goto L22
            int r1 = r11.intValue()
            java.lang.String r0 = "index"
            r3.LIZJ(r1, r0)
        L22:
            if (r12 == 0) goto L2d
            boolean r1 = r12.booleanValue()
            java.lang.String r0 = "is_auto_display"
            r3.LIZJ(r1, r0)
        L2d:
            r4 = 0
            if (r14 == 0) goto L9c
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L9a
            java.util.Iterator r1 = r14.iterator()
        L3a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.model.PurchaseOption r0 = (com.ss.android.ugc.aweme.model.PurchaseOption) r0
            java.lang.Long r0 = r0.discountId
            r5 = 1
            if (r0 == 0) goto L3a
        L4b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L97
            java.lang.String r1 = "1"
        L59:
            java.lang.String r0 = "if_offer_bundle_discount"
            r3.LJFF(r0, r1)
            if (r13 == 0) goto L65
            java.lang.String r0 = "group_id"
            r3.LJIIIIZZ(r0, r13)
        L65:
            if (r7 == 0) goto L75
            X.C1612480s3y.LJIIJ(r3, r7)
            X.C1611660s2e.LJJI(r3, r7)
            X.C1612480s3y.LJIIJJI(r3, r7, r2)
            com.ss.android.ugc.aweme.feed.model.SeriesCategory r0 = r7.category
            X.C1612480s3y.LJIJI(r3, r0)
        L75:
            if (r15 == 0) goto L7f
            boolean r0 = r15.booleanValue()
            java.lang.String r4 = X.C1612480s3y.LJIJJ(r0)
        L7f:
            java.lang.String r0 = "is_from_bottom_banner"
            r3.LJFF(r0, r4)
            X.0s2T r0 = com.ss.android.ugc.aweme.service.MiniDramaETInjectService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.MiniDramaETInjectService r2 = X.C1611550s2T.LIZ()
            if (r2 == 0) goto L96
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "close_collection_episode_purchase"
            r2.onEventV3(r0, r1)
        L96:
            return
        L97:
            java.lang.String r1 = "0"
            goto L59
        L9a:
            r5 = 0
            goto L4b
        L9c:
            r1 = r4
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.common.component.impl.MiniDramaETServiceImpl.LIZ(com.ss.android.ugc.aweme.model.CollectionDetailModel, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.util.List, java.lang.Boolean):void");
    }
}
