package com.ss.android.ugc.aweme.poi.creator;

import X.C1197690hGx;
import X.C1197720hH0;
import X.C1197910hHJ;
import X.C1198620hIS;
import X.C1209080hZK;
import X.C1220000hqw;
import X.C13LE;
import X.C2105908Mv;
import X.C2211751BhN;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCreatorPromoteStoresCell extends PowerCell<C1198620hIS> {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public final String LLILZIL = String.valueOf(System.currentTimeMillis());
    public final C736950SvV LLILZLL;

    public final PoiCreatorVM I5() {
        return (PoiCreatorVM) this.LLILZLL.getValue();
    }

    public PoiCreatorPromoteStoresCell() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(308);
        this.LLILZLL = new C736950SvV(C13LE.LIZ(PoiCreatorVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(334), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new C1209080hZK(this, 4));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        C1197720hH0 c1197720hH0LIZ;
        String str4;
        C1198620hIS c1198620hIS = (C1198620hIS) interfaceC1891350zJl;
        super.onBindItemView(c1198620hIS);
        PoiData poiData = c1198620hIS.LL;
        TuxTextView tuxTextView = null;
        if (poiData != null && (str3 = poiData.name) != null) {
            C1197690hGx c1197690hGx = I5().LLIZLLLIL;
            if (c1197690hGx != null && (c1197720hH0LIZ = c1197690hGx.LIZ()) != null && (str4 = c1197720hH0LIZ.LIZ) != null && str4.length() != 0) {
                TuxTextView tuxTextView2 = this.LL;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                tuxTextView2.setTuxFont(101);
                TuxTextView tuxTextView3 = this.LL;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                C1197910hHJ.LJFF(tuxTextView3, str3, c1198620hIS.LLILLL, c1198620hIS.LLILZLL);
            } else {
                TuxTextView tuxTextView4 = this.LL;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                tuxTextView4.setTuxFont(102);
                TuxTextView tuxTextView5 = this.LL;
                if (tuxTextView5 == null) {
                    tuxTextView5 = null;
                }
                tuxTextView5.setText(str3);
            }
            TuxTextView tuxTextView6 = this.LL;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView6, 0);
        } else {
            TuxTextView tuxTextView7 = this.LL;
            if (tuxTextView7 == null) {
                tuxTextView7 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView7, 4);
        }
        PoiData poiData2 = c1198620hIS.LL;
        if (poiData2 != null && (str2 = poiData2.address) != null) {
            if (!Intrinsics.LJFF(str2, poiData2.name) && str2.length() != 0) {
                TuxTextView tuxTextView8 = this.LLILLJJLI;
                if (tuxTextView8 == null) {
                    tuxTextView8 = null;
                }
                tuxTextView8.setText(str2);
                TuxTextView tuxTextView9 = this.LLILLJJLI;
                if (tuxTextView9 == null) {
                    tuxTextView9 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView9, 0);
            } else {
                TuxTextView tuxTextView10 = this.LLILLJJLI;
                if (tuxTextView10 == null) {
                    tuxTextView10 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView10, 8);
            }
        } else {
            TuxTextView tuxTextView11 = this.LLILLJJLI;
            if (tuxTextView11 == null) {
                tuxTextView11 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView11, 8);
        }
        PoiData poiData3 = c1198620hIS.LL;
        TuxTextView tuxTextView12 = this.LLILLL;
        if (tuxTextView12 == null) {
            tuxTextView12 = null;
        }
        tuxTextView12.setText("");
        TuxTextView tuxTextView13 = this.LLILLL;
        if (tuxTextView13 == null) {
            tuxTextView13 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView13, 8);
        TuxTextView tuxTextView14 = this.LLILZ;
        if (tuxTextView14 == null) {
            tuxTextView14 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView14, 8);
        if (poiData3 != null && I5().LLIZ && (str = poiData3.distance) != null && (!C2105908Mv.LIZ(str))) {
            TuxTextView tuxTextView15 = this.LLILLL;
            if (tuxTextView15 == null) {
                tuxTextView15 = null;
            }
            tuxTextView15.setText(str);
            TuxTextView tuxTextView16 = this.LLILLL;
            if (tuxTextView16 == null) {
                tuxTextView16 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView16, 0);
            TuxTextView tuxTextView17 = this.LLILZ;
            if (tuxTextView17 != null) {
                tuxTextView = tuxTextView17;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C786410Ut5.I7(new AkS87S0100000_18(this, 64), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dz_, viewGroup, false);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.tv_poi_name);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.tv_poi_address);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.tv_poi_distance);
        viewTd.findViewById(R.id.dxw);
        this.LLILZ = (TuxTextView) viewTd.findViewById(R.id.tv_poi_divider);
        return viewTd;
    }
}
