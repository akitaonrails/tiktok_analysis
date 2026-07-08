package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C13LP;
import X.C1697810uHb;
import X.C18N0;
import X.C1954807lC;
import X.C20441214yg;
import X.C2097608Jq;
import X.C21271018Ma;
import X.C21271218Mc;
import X.C21272018Mk;
import X.C214827195l;
import X.C2188811AlT;
import X.EnumC21158817r8;
import Y.ARunnableS36S0201000_32;
import Y.ARunnableS8S1201000_32;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.VideoProductDaInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS11S1301000_32 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S1301000_32 awS11S1301000_32, Object obj) {
        List<PromotionLabel> list;
        PromotionLabel promotionLabelLJJIIZI;
        PromotionInfo promotionInfo;
        PromotionInfo promotionInfo2;
        List<PromotionLogo> list2;
        List<PromotionLabel> list3;
        PromotionInfo promotionInfo3;
        C18N0 c18n0 = (C18N0) obj;
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        C21271018Ma c21271018Ma = (C21271018Ma) awS11S1301000_32.l1;
        AnchorPanelProductManager anchorPanelProductManager = (AnchorPanelProductManager) awS11S1301000_32.l2;
        int i = awS11S1301000_32.i4;
        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) awS11S1301000_32.l3;
        String str = awS11S1301000_32.s0;
        if (c21271018Ma != null) {
            Map<String, Object> map = c21271018Ma.LJIIIZ;
            if (map != null) {
                anchorBizUtils.getClass();
                AnchorBizUtils.LJIIIIZZ(c18n0, map);
            }
            VideoProductDaInfo videoProductDaInfo = c21271018Ma.LJIILLIIL;
            if (videoProductDaInfo != null) {
                anchorBizUtils.getClass();
                AnchorBizUtils.LJII(c18n0, videoProductDaInfo);
            }
        }
        int i2 = anchorPanelProductManager.LIZJ.panelStyle;
        anchorBizUtils.getClass();
        boolean zLJJLIIIJJIZ = AnchorBizUtils.LJJLIIIJJIZ(i2, i);
        Map mapLJIIJ = null;
        if (zLJJLIIIJJIZ) {
            if (c21271018Ma != null && (promotionInfo3 = c21271018Ma.LJI) != null) {
                list3 = promotionInfo3.promotionLabels;
            } else {
                list3 = null;
            }
            promotionLabelLJJIIZI = AnchorBizUtils.LJJIIZI(list3, true);
        } else {
            if (c21271018Ma != null && (promotionInfo = c21271018Ma.LJI) != null) {
                list = promotionInfo.promotionLabels;
            } else {
                list = null;
            }
            promotionLabelLJJIIZI = AnchorBizUtils.LJJIIZI(list, false);
        }
        c18n0.LJJLI = AnchorBizUtils.LJJIL(promotionLabelLJJIIZI);
        Pair[] pairArr = new Pair[1];
        if (c21271018Ma != null) {
            promotionInfo2 = c21271018Ma.LJI;
        } else {
            promotionInfo2 = null;
        }
        pairArr[0] = new Pair(str, promotionInfo2);
        AnchorBizUtils.LJFF(c18n0, anchorProductInfoModel, C2097608Jq.LJIIJ(pairArr));
        AnchorBizUtils.LJ(anchorPanelProductManager.LJIJI, c18n0, str);
        AnchorBizUtils.LJI(anchorPanelProductManager.LJIJJ, c18n0, str);
        C21272018Mk.LIZ.getClass();
        C21272018Mk.LIZIZ(str, c18n0);
        String[] strArr = new String[2];
        strArr[0] = C21272018Mk.LJIJJLI(str, anchorPanelProductManager.LJIIZILJ);
        if (c21271018Ma != null && (list2 = c21271018Ma.LJIIIIZZ) != null) {
            mapLJIIJ = C2097608Jq.LJIIJ(new Pair(str, list2));
        }
        strArr[1] = C21272018Mk.LJJ(str, mapLJIIJ);
        List listLJIIJJI = C1697810uHb.LJIIJJI(strArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listLJIIJJI) {
            if (((String) obj2).length() > 0) {
                arrayList.add(obj2);
            }
        }
        c18n0.LJLILLLLZI = C13LP.LJJLIIIJ(arrayList, "|||", null, null, 0, null, null, 62);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S1301000_32 awS11S1301000_32, Object obj) {
        List<PromotionLabel> list;
        PromotionLabel promotionLabelLJJIIZI;
        PromotionInfo promotionInfo;
        PromotionInfo promotionInfo2;
        List<PromotionLogo> list2;
        List<PromotionLabel> list3;
        PromotionInfo promotionInfo3;
        C18N0 c18n0 = (C18N0) obj;
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        AnchorPanelProductManager anchorPanelProductManager = (AnchorPanelProductManager) awS11S1301000_32.l1;
        String str = awS11S1301000_32.s0;
        int i = awS11S1301000_32.i4;
        C21271018Ma c21271018Ma = (C21271018Ma) awS11S1301000_32.l2;
        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) awS11S1301000_32.l3;
        Map<String, C21271218Mc> map = anchorPanelProductManager.LJIJI;
        anchorBizUtils.getClass();
        AnchorBizUtils.LJ(map, c18n0, str);
        AnchorBizUtils.LJI(anchorPanelProductManager.LJIJJ, c18n0, str);
        boolean zLJJLIIIJJIZ = AnchorBizUtils.LJJLIIIJJIZ(anchorPanelProductManager.LIZJ.panelStyle, i);
        Map mapLJIIJ = null;
        if (zLJJLIIIJJIZ) {
            if (c21271018Ma != null && (promotionInfo3 = c21271018Ma.LJI) != null) {
                list3 = promotionInfo3.promotionLabels;
            } else {
                list3 = null;
            }
            promotionLabelLJJIIZI = AnchorBizUtils.LJJIIZI(list3, true);
        } else {
            if (c21271018Ma != null && (promotionInfo = c21271018Ma.LJI) != null) {
                list = promotionInfo.promotionLabels;
            } else {
                list = null;
            }
            promotionLabelLJJIIZI = AnchorBizUtils.LJJIIZI(list, false);
        }
        c18n0.LJJLI = AnchorBizUtils.LJJIL(promotionLabelLJJIIZI);
        if (c21271018Ma != null) {
            Map<String, Object> map2 = c21271018Ma.LJIIIZ;
            if (map2 != null) {
                AnchorBizUtils.LJIIIIZZ(c18n0, map2);
            }
            VideoProductDaInfo videoProductDaInfo = c21271018Ma.LJIILLIIL;
            if (videoProductDaInfo != null) {
                AnchorBizUtils.LJII(c18n0, videoProductDaInfo);
            }
        }
        Pair[] pairArr = new Pair[1];
        if (c21271018Ma != null) {
            promotionInfo2 = c21271018Ma.LJI;
        } else {
            promotionInfo2 = null;
        }
        pairArr[0] = new Pair(str, promotionInfo2);
        AnchorBizUtils.LJFF(c18n0, anchorProductInfoModel, C2097608Jq.LJIIJ(pairArr));
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        String str2 = awS11S1301000_32.s0;
        c21272018Mk.getClass();
        C21272018Mk.LIZIZ(str2, c18n0);
        String[] strArr = new String[2];
        strArr[0] = C21272018Mk.LJIJJLI(awS11S1301000_32.s0, ((AnchorPanelProductManager) awS11S1301000_32.l1).LJIIZILJ);
        C21271018Ma c21271018Ma2 = (C21271018Ma) awS11S1301000_32.l2;
        if (c21271018Ma2 != null && (list2 = c21271018Ma2.LJIIIIZZ) != null) {
            mapLJIIJ = C2097608Jq.LJIIJ(new Pair(awS11S1301000_32.s0, list2));
        }
        strArr[1] = C21272018Mk.LJJ(awS11S1301000_32.s0, mapLJIIJ);
        List listLJIIJJI = C1697810uHb.LJIIJJI(strArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listLJIIJJI) {
            if (((String) obj2).length() > 0) {
                arrayList.add(obj2);
            }
        }
        c18n0.LJLILLLLZI = C13LP.LJJLIIIJ(arrayList, "|||", null, null, 0, null, null, 62);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS11S1301000_32 awS11S1301000_32, Object obj) {
        C214827195l c214827195l = (C214827195l) awS11S1301000_32.l1;
        ViewGroup viewGroup = (ViewGroup) awS11S1301000_32.l2;
        int i = awS11S1301000_32.i4;
        String str = awS11S1301000_32.s0;
        boolean z = ((C013C) awS11S1301000_32.l3).element;
        c214827195l.getClass();
        int iOrdinal = ((EnumC21158817r8) obj).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("applyLayout — phase=");
                    sbLIZ.append(str);
                    sbLIZ.append(" commit deferred due to zero-size container (epoch=");
                    sbLIZ.append(i);
                    sbLIZ.append("), scheduling active recovery re-apply");
                    C20441214yg.LJIIIZ("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ));
                    if (!c214827195l.LJIIIZ) {
                        c214827195l.LJIIIZ = true;
                        ViewGroup viewGroup2 = c214827195l.LIZJ;
                        if (viewGroup2 != null) {
                            View view = c214827195l.LJI;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("zeroSizeRecoveryScheduled epoch=");
                            sbLIZ2.append(i);
                            sbLIZ2.append(" phase=");
                            sbLIZ2.append(str);
                            C20441214yg.LJIIIZ("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ2));
                            HandlerHook.viewPost(viewGroup2, new ARunnableS8S1201000_32(i, c214827195l, view, str, 2));
                        }
                    }
                } else {
                    throw new C1954807lC();
                }
            }
        } else {
            c214827195l.LJII = true;
            if (z) {
                c214827195l.LJIIIIZZ = true;
                View view2 = c214827195l.LJI;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("applyLayout — phase=");
                sbLIZ3.append(str);
                sbLIZ3.append(" posted one-shot bootstrap re-apply after commit success (epoch=");
                sbLIZ3.append(i);
                sbLIZ3.append(')');
                C20441214yg.LJIIIZ("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ3));
                HandlerHook.viewPost(viewGroup, new ARunnableS36S0201000_32(c214827195l, i, view2, 5));
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS11S1301000_32(int r3, com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager r4, X.C21271018Ma r5, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r6, java.lang.String r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.s0 = r7
            r1.l1 = r4
            r1.l2 = r5
            r1.i4 = r3
            r1.l3 = r6
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l1 = r5
            r1.l2 = r4
            r1.i4 = r3
            r1.l3 = r6
            r1.s0 = r7
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS11S1301000_32.<init>(int, com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager, X.18Ma, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S1301000_32(C214827195l c214827195l, ViewGroup viewGroup, int i, String str, C013C c013c, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c214827195l;
        this.l2 = viewGroup;
        this.i4 = i;
        this.s0 = str;
        this.l3 = c013c;
    }
}
