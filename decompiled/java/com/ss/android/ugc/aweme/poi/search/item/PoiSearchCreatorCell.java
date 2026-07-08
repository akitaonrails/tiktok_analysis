package com.ss.android.ugc.aweme.poi.search.item;

import X.AbstractC2211791BhR;
import X.C1189600h3u;
import X.C1195410hDH;
import X.C1197490hGd;
import X.C1197910hHJ;
import X.C1198630hIT;
import X.C1205490hTX;
import X.C1220000hqw;
import X.C123100dR;
import X.C13LE;
import X.C13LZ;
import X.C1697810uHb;
import X.C1EMR;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C531650Kt9;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS51S0300000_18;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.PoiAllianceDetail;
import com.ss.android.ugc.aweme.poi.PoiAllianceTag;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import wh6.AbS508S0200000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchCreatorCell extends PowerCell<C1198630hIT> {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public LinearLayout LLILZLL;
    public final List<String> LLIZ = new ArrayList();
    public final List<String> LLIZLLLIL = new ArrayList();
    public final C736950SvV LLJ;

    public final PoiSearchVM L5() {
        return (PoiSearchVM) this.LLJ.getValue();
    }

    public PoiSearchCreatorCell() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(534);
        this.LLJ = new C736950SvV(C13LE.LIZ(PoiSearchVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(691), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        ((ArrayList) this.LLIZ).clear();
        ((ArrayList) this.LLIZLLLIL).clear();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0hHH
            public Function0<String> LJ;
            public final int LJFF = 100;
            public final C1198510hIH LJI;

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.0hIH] */
            {
                this.LJ = new AwS562S0100000_18(this, 2056);
                this.LJI = new InterfaceC2211931Bhf() { // from class: X.0hIH
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:110:0x01ee  */
                    /* JADX WARN: Removed duplicated region for block: B:113:0x01fe  */
                    /* JADX WARN: Removed duplicated region for block: B:117:0x0233  */
                    /* JADX WARN: Removed duplicated region for block: B:120:0x0247  */
                    /* JADX WARN: Removed duplicated region for block: B:121:0x0249  */
                    /* JADX WARN: Removed duplicated region for block: B:131:0x0270  */
                    /* JADX WARN: Removed duplicated region for block: B:133:0x0278  */
                    /* JADX WARN: Removed duplicated region for block: B:134:0x027b  */
                    /* JADX WARN: Removed duplicated region for block: B:135:0x027e  */
                    /* JADX WARN: Removed duplicated region for block: B:136:0x0281  */
                    /* JADX WARN: Removed duplicated region for block: B:137:0x0284  */
                    /* JADX WARN: Removed duplicated region for block: B:138:0x0287  */
                    /* JADX WARN: Removed duplicated region for block: B:139:0x028a  */
                    /* JADX WARN: Removed duplicated region for block: B:140:0x028d  */
                    /* JADX WARN: Removed duplicated region for block: B:146:0x02b5 A[LOOP:2: B:144:0x02af->B:146:0x02b5, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:149:0x02d1  */
                    /* JADX WARN: Removed duplicated region for block: B:152:0x02e0  */
                    /* JADX WARN: Removed duplicated region for block: B:155:0x02eb  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
                    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
                    /* JADX WARN: Removed duplicated region for block: B:82:0x015c  */
                    /* JADX WARN: Removed duplicated region for block: B:90:0x0198  */
                    /* JADX WARN: Removed duplicated region for block: B:93:0x01b2  */
                    /* JADX WARN: Type inference failed for: r0v139 */
                    /* JADX WARN: Type inference failed for: r0v140 */
                    /* JADX WARN: Type inference failed for: r0v38 */
                    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
                    /* JADX WARN: Type inference failed for: r0v43 */
                    /* JADX WARN: Type inference failed for: r0v44, types: [int] */
                    @Override // X.InterfaceC2211931Bhf
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(android.view.View r18, java.lang.String r19) {
                        /*
                            Method dump skipped, instruction units count: 749
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1198510hIH.LIZ(android.view.View, java.lang.String):void");
                    }
                };
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N5(C1198630hIT c1198630hIT) {
        String str;
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            PoiData poiData = c1198630hIT.LL;
            if (poiData != null && (str = poiData.name) != null) {
                String str2 = ((C1197490hGd) L5().getState()).LL;
                if (str2 != null && str2.length() != 0) {
                    tuxTextView.setTuxFont(101);
                    C1197910hHJ.LJFF(tuxTextView, str, c1198630hIT.LLILLJJLI, c1198630hIT.LLILZLL);
                } else {
                    tuxTextView.setTuxFont(102);
                    tuxTextView.setText(str);
                }
                C339190DRl.LIZLLL(tuxTextView);
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(com.ss.android.ugc.aweme.poi.PoiData r5) {
        /*
            r4 = this;
            com.bytedance.tux.input.TuxTextView r2 = r4.LLILZ
            r3 = 0
            if (r2 == 0) goto L69
            if (r5 == 0) goto L66
            java.lang.String r1 = r5.address
            if (r1 == 0) goto L66
            int r0 = r1.length()
            if (r0 == 0) goto L66
            java.lang.String r0 = r5.name
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L66
            r2.setText(r1)
            X.C339190DRl.LIZLLL(r2)
        L1f:
            com.ss.android.ugc.aweme.poi.PoiAllianceDetail r0 = r5.getPoiAllianceDetail()
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.poi.PoiAllianceBaseInfo r2 = r0.baseInfo
            if (r2 == 0) goto L6d
            boolean r0 = r2.shouldShowScore()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L31:
            boolean r0 = X.C1189060h32.LJIILJJIL(r0)
            if (r0 == 0) goto L60
            android.widget.LinearLayout r0 = r4.LL
            X.C339190DRl.LIZLLL(r0)
            com.bytedance.tux.input.TuxTextView r1 = r4.LLILLJJLI
            if (r1 == 0) goto L47
            if (r2 == 0) goto L5e
            java.lang.String r0 = r2.score
        L44:
            r1.setText(r0)
        L47:
            com.bytedance.tux.input.TuxTextView r1 = r4.LLILZIL
            if (r1 == 0) goto L5d
            if (r5 == 0) goto L4f
            java.lang.String r3 = r5.distance
        L4f:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 == 0) goto L6f
            X.C339190DRl.LIZLLL(r1)
            java.lang.String r0 = r5.distance
            r1.setText(r0)
        L5d:
            return
        L5e:
            r0 = r3
            goto L44
        L60:
            android.widget.LinearLayout r0 = r4.LL
            X.C339190DRl.LIZIZ(r0)
            goto L47
        L66:
            X.C339190DRl.LIZIZ(r2)
        L69:
            if (r5 == 0) goto L6c
            goto L1f
        L6c:
            r2 = r3
        L6d:
            r0 = r3
            goto L31
        L6f:
            X.C339190DRl.LIZIZ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.item.PoiSearchCreatorCell.P5(com.ss.android.ugc.aweme.poi.PoiData):void");
    }

    public final void R5(PoiData poiData) {
        PoiAllianceDetail poiAllianceDetail;
        List<PoiAllianceTag> list;
        String str = null;
        if (poiData != null && (poiAllianceDetail = poiData.getPoiAllianceDetail()) != null && (list = poiAllianceDetail.tags) != null && !list.isEmpty()) {
            C339190DRl.LIZLLL(this.LLILZLL);
            List<String> list2 = this.LLIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<PoiAllianceTag> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().tagId;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            ((ArrayList) list2).addAll(arrayList);
            LinearLayout linearLayout = this.LLILZLL;
            if (linearLayout != null) {
                HandlerHook.viewPost(linearLayout, new ARunnableS51S0300000_18(this, poiData, list, 6));
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (poiData != null) {
            str = poiData.name;
        }
        sbLIZ.append(str);
        sbLIZ.append(" tags is null");
        C2188811AlT.LIZIZ(sbLIZ);
        C339190DRl.LIZIZ(this.LLILZLL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        C1198630hIT c1198630hIT = (C1198630hIT) interfaceC1891350zJl;
        super.onBindItemView(c1198630hIT);
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiSearchCreatorCell ");
            sbLIZ.append(this);
            sbLIZ.append(' ');
            PoiData poiData = c1198630hIT.LL;
            if (poiData != null) {
                str = poiData.name;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            ((ArrayList) this.LLIZ).clear();
            ((ArrayList) this.LLIZLLLIL).clear();
            PoiData poiData2 = c1198630hIT.LL;
            N5(c1198630hIT);
            P5(poiData2);
            TuxTextView tuxTextView = this.LLILZIL;
            if (tuxTextView != null) {
                tuxTextView.setText("");
                C339190DRl.LIZIZ(tuxTextView);
                if (poiData2 != null && L5().LLJJI && (str2 = poiData2.distance) != null && (!TextUtils.isEmpty(str2))) {
                    tuxTextView.setText(str2);
                    C339190DRl.LIZLLL(tuxTextView);
                }
            }
            R5(poiData2);
            C786410Ut5.I7(new AbS699S0100000_18(this, 51), this.itemView);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_CREATOR_STRENGTH_FEAT;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "poi_creator_cell", null, e);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e9l, viewGroup, false);
        this.LL = (LinearLayout) viewTd.findViewById(R.id.rd3);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.rd6);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.rd2);
        this.LLILZ = (TuxTextView) viewTd.findViewById(R.id.rd0);
        this.LLILZIL = (TuxTextView) viewTd.findViewById(R.id.rd1);
        viewTd.findViewById(R.id.dxy);
        this.LLILZLL = (LinearLayout) viewTd.findViewById(R.id.rd8);
        return viewTd;
    }

    public final void I5(List<PoiAllianceTag> list, PoiData poiData) {
        LinearLayout linearLayout;
        int i;
        ViewGroup.MarginLayoutParams layoutParams;
        Context context = getContext();
        if (context != null && (linearLayout = this.LLILZLL) != null) {
            C786410Ut5.LJJJJJL(linearLayout);
            int width = linearLayout.getWidth();
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, linearLayout.getChildCount()).iterator();
            int measuredWidth = 0;
            while (it2.LLILLL) {
                measuredWidth += linearLayout.getChildAt(it2.nextInt()).getMeasuredWidth();
            }
            int i2 = width - measuredWidth;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            int i3 = 0;
            for (PoiAllianceTag poiAllianceTag : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    PoiAllianceTag poiAllianceTag2 = poiAllianceTag;
                    C1195410hDH c1195410hDH = new C1195410hDH(context);
                    AwS262S0300000_18 awS262S0300000_18 = new AwS262S0300000_18(this, poiAllianceTag2, poiData, 9);
                    try {
                        c1195410hDH.LLILLL.setText(poiAllianceTag2.text);
                        C1195410hDH.LIZ(c1195410hDH.getContext(), c1195410hDH.LLILLJJLI, poiAllianceTag2.leftIconUrl);
                        C1195410hDH.LIZ(c1195410hDH.getContext(), c1195410hDH.LLILZ, poiAllianceTag2.rightIconUrl);
                        Integer numLIZJ = C1189600h3u.LIZJ(c1195410hDH.getContext(), R.attr.a1w, poiAllianceTag2.textColor);
                        if (numLIZJ != null) {
                            c1195410hDH.LLILLL.setTextColor(numLIZJ.intValue());
                        }
                        Integer numLIZJ2 = C1189600h3u.LIZJ(c1195410hDH.getContext(), R.attr.a19, poiAllianceTag2.backgroundColor);
                        if (numLIZJ2 != null) {
                            int iIntValue = numLIZJ2.intValue();
                            ViewGroup viewGroup = c1195410hDH.LL;
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LIZ = Integer.valueOf(iIntValue);
                            c384050F3z.LIZJ = Float.valueOf(C339190DRl.LIZ(4));
                            viewGroup.setBackground(c384050F3z.LIZ(c1195410hDH.getContext()));
                        }
                        if (C123100dR.LIZ(poiAllianceTag2.clickUrl)) {
                            C786410Ut5.I7(new AbS508S0200000_18(poiAllianceTag2, awS262S0300000_18, 23), c1195410hDH.LL);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                        C1EMR c1emr = C1EMR.POI_CREATOR_STRENGTH_FEAT;
                        c1205490hTX.getClass();
                        C1205490hTX.LIZLLL(c1emr, "poi_creator_tag_view", null, e);
                    }
                    c1195410hDH.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(linearLayout.getHeight(), 1073741824));
                    if (i3 == 0) {
                        i = 0;
                    } else {
                        i = iLIZIZ;
                    }
                    int measuredWidth2 = c1195410hDH.getMeasuredWidth() + i;
                    if (measuredWidth2 < i2) {
                        if (i3 != 0) {
                            ViewGroup.LayoutParams layoutParams2 = c1195410hDH.getLayoutParams();
                            if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || (layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                                layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            }
                            layoutParams.setMarginStart(i);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1195410hDH);
                            c1195410hDH.setLayoutParams(layoutParams);
                        }
                        String str = poiAllianceTag2.tagId;
                        if (str != null) {
                            ((ArrayList) this.LLIZLLLIL).add(str);
                        }
                        linearLayout.addView(c1195410hDH);
                        i2 -= measuredWidth2;
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
