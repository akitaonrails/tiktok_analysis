package com.ss.android.ugc.aweme.poi.revisit.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1177230gjx;
import X.C1178910gmf;
import X.C1189060h32;
import X.C1206904nr;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19659111vp;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PoiRevisitHorizontalCell extends PowerCell<PoiRevisitCardItem> implements InterfaceC20631915oL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LL;
    public C1178910gmf LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public View LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRevisitHorizontalCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/revisit/vm/PoiRevisitViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    public PoiRevisitHorizontalCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRevisitViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3073);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(215);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3058), awS577S0100000_33, AFwS224S0000000_33.get$arr$(422), new AwS577S0100000_33((C03K6) this, 3059), new AwS577S0100000_33((C03K6) this, 3061), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3063), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3065), null, new AwS577S0100000_33((C03K6) this, 3066));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3060);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3062);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3064);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 120));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3067);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3068);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3069);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3070);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3071);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3072), awS577S0100000_33, AFwS224S0000000_33.get$arr$(423), new AwS577S0100000_33((C03K6) this, 3074), new AwS577S0100000_33((C03K6) this, 3075), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3076), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3077), null, new AwS577S0100000_33((C03K6) this, 3078));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3079), awS577S0100000_33, AFwS224S0000000_33.get$arr$(424), new AwS577S0100000_33((C03K6) this, 3080), new AwS577S0100000_33((C03K6) this, 3081), new AwS577S0100000_33((C03K6) this, 3082), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3057));
        }
        this.LL = assemVMLazy;
    }

    public final PoiRevisitViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (PoiRevisitViewModel) assemVMLazy.getValue();
    }

    public final PoiRevisitHorizontalCardAssem.PoiRevisitHorizontalCardAbility I5() {
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            return (PoiRevisitHorizontalCardAssem.PoiRevisitHorizontalCardAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiRevisitHorizontalCardAssem.PoiRevisitHorizontalCardAbility.class, null);
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (C1178910gmf) this.itemView.findViewById(R.id.rc2);
        this.LLILLL = this.itemView.findViewById(R.id.msz);
        this.LLILZ = this.itemView.findViewById(R.id.hpr);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.hpt);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.hpu);
        this.LLIZ = this.itemView.findViewById(R.id.tsz);
        this.itemView.findViewById(R.id.tt1);
        this.itemView.findViewById(R.id.tt2);
        this.LLIZLLLIL = this.itemView.findViewById(R.id.eux);
        this.LLJ = this.itemView.findViewById(R.id.ve0);
        View view = this.LLILLL;
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
            Drawable drawableLIZ = c384050F3z.LIZ(this.itemView.getContext());
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
            c19659111vp.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
            view.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(this.itemView.getContext())));
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C1189060h32.LJJIIJ(view2, new AwS588S0100000_9(this, 371));
        }
        View view3 = this.LLIZ;
        if (view3 != null) {
            C1189060h32.LJJIIJ(view3, new AwS588S0100000_9(this, 372));
        }
        InterfaceC665370Q7z interfaceC665370Q7z = L5().LLJ;
        C2211631BhB.LJ(this.itemView, new AwS375S0200000_9(this, interfaceC665370Q7z != null ? (IPoiRevisitNavAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiRevisitNavAssemAbility.class, null) : null, 94));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        int i2;
        C1178910gmf c1178910gmf;
        PoiRevisitCardItem poiRevisitCardItem = (PoiRevisitCardItem) interfaceC1891350zJl;
        if (poiRevisitCardItem.LL) {
            View view = this.LLJ;
            if (view != null) {
                C339190DRl.LIZLLL(view);
            }
            View view2 = this.LLIZLLLIL;
            if (view2 != null) {
                C339190DRl.LIZIZ(view2);
                return;
            }
            return;
        }
        View view3 = this.LLJ;
        if (view3 != null) {
            C339190DRl.LIZIZ(view3);
        }
        View view4 = this.LLIZLLLIL;
        if (view4 != null) {
            C339190DRl.LIZLLL(view4);
        }
        if (!poiRevisitCardItem.LLILZ && (c1178910gmf = this.LLILLJJLI) != null) {
            c1178910gmf.LIZ(PoiRevisitCardItem.LIZ(poiRevisitCardItem, false, -3), L5().LLJ, L5().LLILZIL);
        }
        boolean zLIZ = C1206904nr.LIZ();
        String string = null;
        if (Intrinsics.LJFF(poiRevisitCardItem.isCollected, Boolean.TRUE)) {
            TuxTextView tuxTextView = this.LLILZLL;
            if (tuxTextView != null) {
                Context context = getContext();
                if (context != null) {
                    if (zLIZ) {
                        i2 = 2131844689;
                    } else {
                        i2 = 2131844691;
                    }
                    string = context.getString(i2);
                }
                tuxTextView.setText(string);
            }
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView == null) {
                return;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_bookmark_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1i);
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                if (zLIZ) {
                    i = 2131844688;
                } else {
                    i = 2131844690;
                }
                string = context2.getString(i);
            }
            tuxTextView2.setText(string);
        }
        TuxIconView tuxIconView2 = this.LLILZIL;
        if (tuxIconView2 == null) {
            return;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_bookmark;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1i);
        tuxIconView2.setTuxIcon(c419910GdJ2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e8f, viewGroup, false);
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        String str;
        String str2;
        PoiRevisitCardItem item;
        String str3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Horizontal Card Assem onPageSelected, position is ");
        sbLIZ.append(i);
        sbLIZ.append(", poi_id:");
        PoiRevisitCardItem item2 = getItem();
        String str4 = null;
        if (item2 != null) {
            str = item2.poiId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        PoiRevisitHorizontalCardAssem.PoiRevisitHorizontalCardAbility poiRevisitHorizontalCardAbilityI5 = I5();
        if (poiRevisitHorizontalCardAbilityI5 != null && !poiRevisitHorizontalCardAbilityI5.d4() && (item = getItem()) != null && !item.LL) {
            PoiRevisitViewModel poiRevisitViewModelL5 = L5();
            PoiRevisitCardItem item3 = getItem();
            if (item3 != null) {
                str3 = item3.poiId;
            } else {
                str3 = null;
            }
            PoiRevisitViewModel.zQ2(poiRevisitViewModelL5, str3);
        }
        PoiRevisitHorizontalCardAssem.PoiRevisitHorizontalCardAbility poiRevisitHorizontalCardAbilityI52 = I5();
        if (poiRevisitHorizontalCardAbilityI52 != null) {
            PoiRevisitCardItem item4 = getItem();
            if (item4 != null) {
                str2 = item4.poiId;
            } else {
                str2 = null;
            }
            PoiRevisitCardItem item5 = getItem();
            if (item5 != null) {
                str4 = item5.collectInfo;
            }
            poiRevisitHorizontalCardAbilityI52.e2(new C1177230gjx(i, str2, str4));
        }
    }
}
