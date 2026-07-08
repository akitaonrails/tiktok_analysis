package com.ss.android.ugc.aweme.poi.detail.cells;

import X.C1173300gdc;
import X.C1178990gmn;
import X.C1180070goX;
import X.C1180560gpK;
import X.C1180580gpM;
import X.C1180600gpO;
import X.C1185410gx9;
import X.C1185600gxS;
import X.C1188440h22;
import X.C1188670h2P;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1533950q1J;
import X.C18JG;
import X.C19348710mr;
import X.C19374310qz;
import X.C20642515q3;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2441009hQ;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C430000Gta;
import X.C444920HcY;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1177490gkN;
import X.EnumC1203020hPY;
import X.EnumC1338240kve;
import X.EnumC19356310o5;
import X.InterfaceC1181010gq3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.slash.cell.arc.Padding;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashClickConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PoiBaseCardCell extends SlashCell<PoiCardCellData> {
    public List<PoiDetailTag> LLJJIJIIJIL;
    public C430000Gta LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final Padding Ap() {
        Padding paddingAp = super.Ap();
        return paddingAp == null ? new Padding(12, 12, 16, 16) : paddingAp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final Map<String, String> mp() {
        String str;
        String str2;
        String str3;
        C1173300gdc c1173300gdcQr0;
        C1185600gxS c1185600gxS;
        Map<String, String> mapMp = super.mp();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(mapMp);
        InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
        String str4 = null;
        if (interfaceC1181010gq3LIZIZ != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZIZ.qr0()) != null && (c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ) != null) {
            str4 = c1185600gxS.LIZ;
        }
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("from_poi_id", str4);
        PoiCardCellData poiCardCellData = (PoiCardCellData) this.LLJJIII;
        if (poiCardCellData == null || (str = poiCardCellData.poiId) == null) {
            str = "";
        }
        linkedHashMap.put("target_poi_id", str);
        PoiCardCellData poiCardCellData2 = (PoiCardCellData) this.LLJJIII;
        if (poiCardCellData2 != null && (str3 = poiCardCellData2.keyCategory) != null) {
            str5 = str3;
        }
        linkedHashMap.put("target_local_service_key_category", str5);
        SlashCellModel slashCellModelLp = lp();
        linkedHashMap.put("order", String.valueOf(slashCellModelLp != null ? slashCellModelLp.LL : 0));
        PoiCardCellData poiCardCellData3 = (PoiCardCellData) this.LLJJIII;
        if (poiCardCellData3 != null && (str2 = poiCardCellData3.collectInfo) != null) {
            C1189060h32.LIZLLL(str2, linkedHashMap);
        }
        return linkedHashMap;
    }

    public static boolean Fp(PoiCardCellData poiCardCellData) {
        String str;
        String str2 = null;
        if (poiCardCellData != null) {
            str = poiCardCellData.reviewScore;
        } else {
            str = null;
        }
        if (!C1533950q1J.LJ(str)) {
            return false;
        }
        if (poiCardCellData != null) {
            str2 = poiCardCellData.reviewMaxScore;
        }
        if (!C1533950q1J.LJ(str2) || poiCardCellData == null || poiCardCellData.reviewCount <= 0) {
            return false;
        }
        if (poiCardCellData != null && Intrinsics.LJFF(poiCardCellData.noRating, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    public final void yp(View view) {
        SlashClickConfig slashClickConfig;
        super.yp(view);
        PoiCardCellData poiCardCellData = (PoiCardCellData) this.LLJJIII;
        SlashCellModel slashCellModelLp = lp();
        if (slashCellModelLp != null && (slashClickConfig = slashCellModelLp.clickConfig) != null) {
            if (poiCardCellData != null && poiCardCellData.poiStatus == 3) {
                return;
            }
            if (C1533950q1J.LJ(slashClickConfig.schema)) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), slashClickConfig.schema);
                Map<String, String> map = slashClickConfig.additionalParams;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        smartRouteBuildRoute.withParam(entry.getKey(), entry.getValue());
                    }
                }
                smartRouteBuildRoute.open();
                return;
            }
            Ip(poiCardCellData, slashClickConfig, null);
        }
    }

    public final void Gp(PoiCardCellData poiCardCellData, SmartImageView smartImageView) {
        Integer numLIZJ;
        String str;
        String strHp;
        String str2;
        int iIntValue;
        String str3;
        if (smartImageView != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, getContentView().getContext())) != null) {
            numLIZJ.intValue();
            if (poiCardCellData != null) {
                str = poiCardCellData.coverPageTag;
            } else {
                str = null;
            }
            if (!C1533950q1J.LJ(str) || str == null) {
                str = "poi_detail";
            }
            if (poiCardCellData != null) {
                strHp = poiCardCellData.coverSceneTag;
            } else {
                strHp = null;
            }
            if (!C1533950q1J.LJ(strHp) || strHp == null) {
                strHp = hp();
                if (!C1533950q1J.LJ(strHp) || strHp == null) {
                    strHp = "poi_card_img";
                }
            }
            C1180600gpO c1180600gpO = new C1180600gpO(str, strHp, new C1180560gpK(getContext(), EnumC1177490gkN.FALLBACK_26_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12))), null));
            if (poiCardCellData != null) {
                str2 = poiCardCellData.poiId;
            } else {
                str2 = null;
            }
            String str4 = "";
            if (str2 == null) {
                str2 = "";
            }
            String strHp2 = hp();
            if (strHp2 == null) {
                strHp2 = "";
            }
            c1180600gpO.LIZLLL = new C1202680hP0(str2, null, strHp2, null, null, 26);
            if (poiCardCellData != null && (str3 = poiCardCellData.coverImg) != null) {
                str4 = str3;
            }
            C1189360h3W c1189360h3WLIZIZ = c1180600gpO.LIZIZ(str4);
            c1189360h3WLIZIZ.LIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            C1180070goX.LIZ(c1189360h3WLIZIZ, getContentView().getContext(), smartImageView.getWidth(), smartImageView.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(12);
            c1331750klB.LJII = EnumC1203020hPY.BITMAP_ONLY;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, getContentView().getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            int iLJIIL = C2441009hQ.LJIIL(iIntValue, 30);
            float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
            c1331750klB.LIZJ = iLJIIL;
            c1331750klB.LIZIZ = fLIZIZ;
            c1189360h3WLIZIZ.LIZ.LJJI = new C1331730kl9(c1331750klB);
            c1189360h3WLIZIZ.LIZLLL(smartImageView);
            c1189360h3WLIZIZ.LIZIZ();
        }
    }

    public final void Tp(PoiCardCellData poiCardCellData, TuxTextView tuxTextView) {
        SpannableStringBuilder spannableStringBuilder;
        int i;
        String str;
        int iIntValue;
        long j;
        String str2;
        String str3 = "";
        if (!Fp(poiCardCellData)) {
            if (tuxTextView != null) {
                tuxTextView.setText("");
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                tuxTextView.setCompoundDrawablePadding(0);
                return;
            }
            return;
        }
        if (Fp(poiCardCellData)) {
            if (poiCardCellData == null || (str = poiCardCellData.reviewScore) == null) {
                str = "";
            }
            spannableStringBuilder = new SpannableStringBuilder(str);
            int length = spannableStringBuilder.length();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            if (poiCardCellData != null && (str2 = poiCardCellData.reviewMaxScore) != null) {
                str3 = str2;
            }
            sbLIZ.append(str3);
            spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContentView().getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), 0, length, 17);
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, false), 0, length, 17);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" ");
            C786410Ut5.q2(spannableStringBuilder2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            if (poiCardCellData != null) {
                j = poiCardCellData.reviewCount;
            } else {
                j = 0;
            }
            spannableStringBuilder.append((CharSequence) e3.h).append((CharSequence) String.valueOf(C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28))).append((CharSequence) ")");
        } else {
            spannableStringBuilder = new SpannableStringBuilder(C20642515q3.LJI(2131838910));
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_star_fill;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        if (Fp(poiCardCellData)) {
            i = R.attr.ny;
        } else {
            i = R.attr.a02;
        }
        c419910GdJ.LJ = Integer.valueOf(i);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContentView().getContext());
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
        if (C426750GoL.LIZLLL(getContentView().getContext())) {
            if (tuxTextView != null) {
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
            } else {
                return;
            }
        } else if (tuxTextView == null) {
            return;
        } else {
            tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        tuxTextView.setText(spannableStringBuilder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r1.isEmpty() != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[PHI: r1
      0x014e: PHI (r1v20 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle>) = 
      (r1v9 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle>)
      (r1v21 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle>)
     binds: [B:53:0x00f3, B:42:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Up(com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData r14, X.C430000Gta r15) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.cells.PoiBaseCardCell.Up(com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData, X.0Gta):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Qp(com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData r8, com.bytedance.tux.input.TuxTextView r9, com.bytedance.tux.input.TuxTextView r10) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.cells.PoiBaseCardCell.Qp(com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData, com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ip(PoiCardCellData poiCardCellData, SlashClickConfig slashClickConfig, String str) {
        C1185600gxS c1185600gxS;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiId;
        String initialPoiFromGroupId;
        String str2;
        String fromGroupId;
        String fromGroupId2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean zLJFF;
        Boolean boolValueOf;
        String strLIZ;
        C1185410gx9 c1185410gx9;
        String str10;
        String str11;
        C1185410gx9 c1185410gx92;
        C1185410gx9 c1185410gx93;
        C1185410gx9 c1185410gx94;
        C1185410gx9 c1185410gx95;
        C1185410gx9 c1185410gx96;
        C1185410gx9 c1185410gx97;
        C1173300gdc c1173300gdcQr0;
        String str12 = str;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
        String adClickId = null;
        if (interfaceC1181010gq3LIZIZ != null && (c1173300gdcQr0 = interfaceC1181010gq3LIZIZ.qr0()) != null) {
            c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
        } else {
            c1185600gxS = null;
        }
        Pair[] pairArr = new Pair[8];
        if (c1185600gxS != null && (c1185410gx97 = c1185600gxS.LJFF) != null) {
            initialEnterFrom = c1185410gx97.getInitialEnterFrom();
        } else {
            initialEnterFrom = null;
        }
        pairArr[0] = new Pair("initial_poi_enter_from", initialEnterFrom);
        if (c1185600gxS != null && (c1185410gx96 = c1185600gxS.LJFF) != null) {
            initialEnterMethod = c1185410gx96.getInitialEnterMethod();
        } else {
            initialEnterMethod = null;
        }
        pairArr[1] = new Pair("initial_poi_enter_method", initialEnterMethod);
        if (c1185600gxS != null && (c1185410gx95 = c1185600gxS.LJFF) != null) {
            initialPoiId = c1185410gx95.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        pairArr[2] = new Pair("initial_poi_id", initialPoiId);
        if (c1185600gxS != null && (c1185410gx94 = c1185600gxS.LJFF) != null) {
            initialPoiFromGroupId = c1185410gx94.getInitialPoiFromGroupId();
        } else {
            initialPoiFromGroupId = null;
        }
        pairArr[3] = new Pair("initial_poi_from_group_id", initialPoiFromGroupId);
        if (c1185600gxS != null) {
            str2 = c1185600gxS.LIZ;
        } else {
            str2 = null;
        }
        pairArr[4] = new Pair("from_poi_id", str2);
        if (c1185600gxS != null && (c1185410gx93 = c1185600gxS.LJFF) != null) {
            fromGroupId = c1185410gx93.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        pairArr[5] = new Pair("from_group_id", fromGroupId);
        if (c1185600gxS != null && (c1185410gx92 = c1185600gxS.LJFF) != null) {
            fromGroupId2 = c1185410gx92.getFromGroupId();
        } else {
            fromGroupId2 = null;
        }
        if (poiCardCellData != null) {
            str3 = poiCardCellData.poiId;
            str4 = poiCardCellData.poiName;
        } else {
            str3 = null;
            str4 = null;
        }
        if (poiCardCellData != null) {
            str5 = poiCardCellData.cityCode;
        } else {
            str5 = null;
        }
        String str13 = null;
        if (poiCardCellData != null) {
            str6 = poiCardCellData.regionCode;
            str7 = poiCardCellData.collectInfo;
            str8 = poiCardCellData.typeLevel;
            str9 = poiCardCellData.formattedAddress;
        } else {
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
        }
        if (poiCardCellData != null) {
            zLJFF = Intrinsics.LJFF(poiCardCellData.isCollected, Boolean.TRUE);
            boolValueOf = Boolean.valueOf(poiCardCellData.isClaimed);
        } else {
            zLJFF = false;
            boolValueOf = null;
        }
        pairArr[6] = new Pair("poi_data", new C1188440h22(fromGroupId2, str3, str4, null, str5, null, str6, str7, str8, str9, null, null, zLJFF, boolValueOf, null, null, null));
        String str14 = "";
        if (str12 == null) {
            str12 = "";
        }
        pairArr[7] = new Pair("target_component", str12);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map<String, String> map = slashClickConfig.additionalParams;
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        Map<String, String> map2 = slashClickConfig.additionalParams;
        if (map2 != null && map2.containsKey("btm")) {
            Map<String, String> map3 = slashClickConfig.additionalParams;
            if (map3 == null || (str11 = map3.get("btm")) == null) {
                str11 = "";
            }
            strLIZ = C18JG.LIZ(str11, PageFinder.via(getContentView()), null);
        } else {
            strLIZ = null;
        }
        C1188670h2P c1188670h2P = C1188670h2P.LIZ;
        Context context = getContentView().getContext();
        if (poiCardCellData != null && (str10 = poiCardCellData.poiId) != null) {
            str14 = str10;
        }
        if (poiCardCellData != null) {
            str13 = poiCardCellData.typeLevel;
        }
        if (c1185600gxS != null && (c1185410gx9 = c1185600gxS.LJFF) != null) {
            adClickId = c1185410gx9.getAdClickId();
        }
        c1188670h2P.getClass();
        C1188670h2P.LIZLLL(context, str14, "poi_detail", "", adClickId, str13, strLIZ, mapLJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Vp(com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData r5, X.C19M4 r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = 0
            if (r5 == 0) goto L17
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r1 = r5.upperTag
        L5:
            r3 = 0
            if (r1 != 0) goto L19
            if (r7 == 0) goto L10
            int r0 = r7.length()
            if (r0 != 0) goto L19
        L10:
            if (r6 == 0) goto L16
            r0 = 4
            X.C786410Ut5.LJLLLLLL(r0, r6)
        L16:
            return
        L17:
            r1 = r4
            goto L5
        L19:
            if (r6 == 0) goto L77
            if (r1 == 0) goto L77
            X.0gn2 r2 = com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiTagCell.LLILLJJLI
            X.0gn4 r1 = new X.0gn4
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag r0 = r5.upperTag
            r1.<init>(r3, r0, r4)
            r2.LIZ(r6, r1)
        L29:
            java.lang.CharSequence r0 = r6.getText()
        L2d:
            boolean r0 = X.C041J.LIZ(r0)
            if (r0 == 0) goto L61
            boolean r0 = X.C1533950q1J.LJ(r8)
            if (r0 == 0) goto L61
            if (r6 == 0) goto L75
            java.lang.CharSequence r1 = r6.getText()
        L3f:
            boolean r0 = r1 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L45
            if (r1 != 0) goto L50
        L45:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            if (r6 == 0) goto L4d
            java.lang.CharSequence r4 = r6.getText()
        L4d:
            r1.<init>(r4)
        L50:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r8)
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            if (r6 == 0) goto L5e
            r6.setText(r0)
        L5e:
            X.C339190DRl.LIZLLL(r6)
        L61:
            if (r6 == 0) goto L74
            java.lang.CharSequence r0 = r6.getText()
            if (r0 == 0) goto L6f
            int r0 = r0.length()
            if (r0 != 0) goto L74
        L6f:
            if (r6 == 0) goto L74
            X.C339190DRl.LIZIZ(r6)
        L74:
            return
        L75:
            r1 = r4
            goto L3f
        L77:
            boolean r0 = X.C1533950q1J.LJ(r7)
            if (r0 == 0) goto L83
            if (r6 == 0) goto L86
            r6.setText(r7)
            goto L29
        L83:
            if (r6 == 0) goto L86
            goto L29
        L86:
            r0 = r4
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.cells.PoiBaseCardCell.Vp(com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData, X.19M4, java.lang.String, java.lang.String):void");
    }

    public final void Jp(PoiCardCellData poiCardCellData, TuxTextView tuxTextView, TuxTextView tuxTextView2, View view) {
        if (poiCardCellData != null && poiCardCellData.poiStatus == 3) {
            if (tuxTextView2 != null) {
                Context context = tuxTextView2.getContext();
                if (context != null && C960203pA.LIZIZ(context)) {
                    tuxTextView2.setBackgroundResource(R.drawable.ctg);
                } else {
                    tuxTextView2.setBackgroundResource(R.drawable.cth);
                }
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, new ContextThemeWrapper(getContext(), R.style.y0));
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(iIntValue);
                }
            }
            C339190DRl.LIZLLL(tuxTextView);
            C339190DRl.LIZLLL(tuxTextView2);
            C339190DRl.LIZLLL(view);
            return;
        }
        C339190DRl.LIZIZ(tuxTextView);
        C339190DRl.LIZIZ(tuxTextView2);
        C339190DRl.LIZIZ(view);
    }
}
