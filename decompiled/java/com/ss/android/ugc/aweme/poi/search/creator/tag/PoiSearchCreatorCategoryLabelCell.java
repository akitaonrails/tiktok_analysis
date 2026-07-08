package com.ss.android.ugc.aweme.poi.search.creator.tag;

import X.AbstractC2211791BhR;
import X.C1220000hqw;
import X.C13LE;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C2365509Or;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi.search.data.PoiSearchFilterDataItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import org.json.JSONObject;
import wh6.AbS508S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchCreatorCategoryLabelCell extends PowerCell<PoiSearchFilterDataItem> {
    public View LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;
    public boolean LLILZ;
    public PoiSearchFilterDataItem LLILZIL;
    public boolean LLILZLL = true;
    public final C736950SvV LLIZ;

    public final JSONObject I5() {
        JSONObject jSONObject = new JSONObject();
        PoiMobParam poiMobParam = ((PoiSearchVM) this.LLIZ.getValue()).LLJJJJJIL;
        C2365509Or.LIZLLL(jSONObject, "creation_id", poiMobParam != null ? poiMobParam.creationId : null);
        PoiMobParam poiMobParam2 = ((PoiSearchVM) this.LLIZ.getValue()).LLJJJJJIL;
        C2365509Or.LIZLLL(jSONObject, "enter_from", poiMobParam2 != null ? poiMobParam2.enterFrom : null);
        PoiMobParam poiMobParam3 = ((PoiSearchVM) this.LLIZ.getValue()).LLJJJJJIL;
        C2365509Or.LIZLLL(jSONObject, "shoot_way", poiMobParam3 != null ? poiMobParam3.shootWay : null);
        return jSONObject;
    }

    public PoiSearchCreatorCategoryLabelCell() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(530);
        this.LLIZ = new C736950SvV(C13LE.LIZ(PoiSearchVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(687), null, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.LL;
        if (view != null) {
            C2211751BhN.LIZ(view, new AbstractC2211791BhR(this) { // from class: X.0hHD
                public Function0<String> LJ;
                public final int LJFF = 100;
                public final float LJI = 1.0f;
                public final C1208900hZ2 LJII;

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
                    return this.LJII;
                }

                @Override // X.AbstractC2211791BhR
                public final float LJIIL() {
                    return this.LJI;
                }

                {
                    this.LJ = new AwS562S0100000_18(this, 2052);
                    this.LJII = new C1208900hZ2(this, 3);
                }

                @Override // X.AbstractC2211791BhR
                public final void LJIILL(Function0<String> function0) {
                    this.LJ = function0;
                }
            });
        }
    }

    public final void L5(boolean z) {
        if (z) {
            C339190DRl.LIZLLL(this.LLILLL);
            View view = this.LL;
            if (view != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
                c384050F3z.LIZJ = Float.valueOf(C339190DRl.LIZ(5));
                c384050F3z.LJFF = Integer.valueOf(R.attr.a00);
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
                view.setBackground(c384050F3z.LIZ(view.getContext()));
            }
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.a00);
                return;
            }
            return;
        }
        C339190DRl.LIZIZ(this.LLILLL);
        View view2 = this.LL;
        if (view2 != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z2.LIZJ = Float.valueOf(C339190DRl.LIZ(5));
            view2.setBackground(c384050F3z2.LIZ(view2.getContext()));
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setTextColorRes(R.attr.a1j);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        PoiSearchFilterDataItem poiSearchFilterDataItem = (PoiSearchFilterDataItem) interfaceC1891350zJl;
        this.LLILZIL = poiSearchFilterDataItem;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(poiSearchFilterDataItem.getText());
        }
        boolean zIsSelected = poiSearchFilterDataItem.isSelected();
        this.LLILZ = zIsSelected;
        L5(zIsSelected);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLIZ.getValue(), new C2217381BqS() { // from class: X.0hHE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1197490hGd c1197490hGd = (C1197490hGd) obj;
                c1197490hGd.getClass();
                return C627260Oiy.LIZJ(c1197490hGd);
            }
        }, null, new AwS597S0100000_18(this, 730), new AwS562S0100000_18(this, 2478), new AwS597S0100000_18(this, 731), 2, null);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLIZ.getValue(), new C2217381BqS() { // from class: X.0IBv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1197490hGd c1197490hGd = (C1197490hGd) obj;
                c1197490hGd.getClass();
                return C627260Oiy.LIZLLL(c1197490hGd);
            }
        }, null, new AwS597S0100000_18(this, 730), new AwS562S0100000_18(this, 2478), new AwS597S0100000_18(this, 731), 2, null);
        View view = this.LL;
        if (view != null) {
            C786410Ut5.I7(new AbS508S0200000_18(this, poiSearchFilterDataItem, 24), view);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e8o, viewGroup, false);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.rcv);
        this.LLILLL = (TuxIconView) viewTd.findViewById(R.id.rcu);
        this.LL = viewTd.findViewById(R.id.rct);
        return viewTd;
    }
}
