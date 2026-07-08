package com.ss.android.ugc.aweme.poi.quiz.item;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1177230gjx;
import X.C1179500gnc;
import X.C1179520gne;
import X.C1180600gpO;
import X.C1182890gt5;
import X.C1182900gt6;
import X.C1189060h32;
import X.C1189360h3W;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19659111vp;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
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
import X.EnumC1179510gnd;
import X.EnumC1182880gt4;
import X.EnumC994380bz2;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiCardBottomBtnModel;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizItem;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizHorizontalCardItemCell extends PowerCell<C1179500gnc> implements InterfaceC20631915oL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LL;
    public View LLILLJJLI;
    public View LLILLL;
    public SmartImageView LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C197039127h LLJ;
    public View LLJI;
    public C1749280vcc LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiQuizHorizontalCardItemCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/quiz/vm/PoiQuizPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    public PoiQuizHorizontalCardItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiQuizPageVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1707);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(556);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1692), awS562S0100000_18, AFwS206S0000000_18.get$arr$(439), new AwS562S0100000_18((C03K6) this, 1693), new AwS562S0100000_18((C03K6) this, 1695), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1697), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1699), null, new AwS562S0100000_18((C03K6) this, 1700));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1694);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1696);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1698);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 88));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1701);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1702);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1703);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1704);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1705);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1706), awS562S0100000_18, AFwS206S0000000_18.get$arr$(440), new AwS562S0100000_18((C03K6) this, 1708), new AwS562S0100000_18((C03K6) this, 1709), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1710), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1711), null, new AwS562S0100000_18((C03K6) this, 1712));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1713), awS562S0100000_18, AFwS206S0000000_18.get$arr$(441), new AwS562S0100000_18((C03K6) this, 1714), new AwS562S0100000_18((C03K6) this, 1715), new AwS562S0100000_18((C03K6) this, 1716), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1691));
        }
        this.LL = assemVMLazy;
    }

    public final PoiQuizPageVM L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiQuizPageVM) assemVMLazy.getValue();
    }

    public final PoiQuizHorizontalCardAssem.PoiQuizHorizontalCardAbility I5() {
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            return (PoiQuizHorizontalCardAssem.PoiQuizHorizontalCardAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiQuizHorizontalCardAssem.PoiQuizHorizontalCardAbility.class, null);
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = this.itemView.findViewById(R.id.r8n);
        this.LLILLL = this.itemView.findViewById(R.id.r8i);
        this.LLILZ = (SmartImageView) this.itemView.findViewById(R.id.r8j);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.r8o);
        this.LLILZLL = this.itemView.findViewById(R.id.r8s);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.r8r);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.r8g);
        this.LLJ = (C197039127h) this.itemView.findViewById(R.id.r8h);
        this.LLJI = this.itemView.findViewById(R.id.r8q);
        this.LLJIJIL = (C1749280vcc) this.itemView.findViewById(R.id.r8k);
        View view = this.LLILLJJLI;
        if (view != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            Drawable drawableLIZ = c384050F3z.LIZ(this.itemView.getContext());
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
            c19659111vp.LIZ = C418440Gaw.LIZIZ(14);
            view.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(this.itemView.getContext())));
        }
        C197039127h c197039127h = this.LLJ;
        if (c197039127h != null) {
            C786410Ut5.I7(new AbS699S0100000_18(this, 26), c197039127h);
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            view2.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
        C1749280vcc c1749280vcc = this.LLJIJIL;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJI = this.itemView.getContext().getResources().getString(2131844797);
            c1722300uv6.LJIIIZ = new AwS597S0100000_18(this, 436);
            c1749280vcc.setStatus(c1722300uv6);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        C1179500gnc c1179500gnc = (C1179500gnc) interfaceC1891350zJl;
        int i = C1179520gne.LIZ[c1179500gnc.LLILLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                View view = this.LLILLL;
                if (view != null) {
                    C339190DRl.LIZLLL(view);
                }
                View view2 = this.LLJI;
                if (view2 != null) {
                    C339190DRl.LIZIZ(view2);
                }
                C1749280vcc c1749280vcc = this.LLJIJIL;
                if (c1749280vcc != null) {
                    C339190DRl.LIZIZ(c1749280vcc);
                }
                PoiQuizItem poiQuizItem = c1179500gnc.LL;
                if (poiQuizItem != null) {
                    TuxTextView tuxTextView = this.LLILZIL;
                    String str3 = "";
                    if (tuxTextView != null) {
                        String str4 = poiQuizItem.poiName;
                        if (str4 == null) {
                            str4 = "";
                        }
                        tuxTextView.setText(str4);
                    }
                    String str5 = poiQuizItem.categoryName;
                    if (str5 != null && str5.length() != 0) {
                        TuxTextView tuxTextView2 = this.LLIZ;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(poiQuizItem.categoryName);
                        }
                    } else {
                        C339190DRl.LIZIZ(this.LLILZLL);
                    }
                    TuxTextView tuxTextView3 = this.LLIZLLLIL;
                    if (tuxTextView3 != null) {
                        String str6 = poiQuizItem.formattedAddress;
                        if (str6 == null) {
                            str6 = "";
                        }
                        tuxTextView3.setText(str6);
                    }
                    C197039127h c197039127h = this.LLJ;
                    if (c197039127h != null) {
                        c197039127h.setSupportClickWhenDisable(true);
                        if (Intrinsics.LJFF(c1179500gnc.LL.isFinishPoiQuiz(), Boolean.TRUE)) {
                            PoiCardBottomBtnModel poiCardBottomBtnModel = c1179500gnc.LLILLJJLI;
                            if (poiCardBottomBtnModel == null || (str2 = poiCardBottomBtnModel.finishText) == null) {
                                str2 = "";
                            }
                            c197039127h.setText(str2);
                            c197039127h.setEnabled(false);
                        } else {
                            PoiCardBottomBtnModel poiCardBottomBtnModel2 = c1179500gnc.LLILLJJLI;
                            if (poiCardBottomBtnModel2 == null || (str = poiCardBottomBtnModel2.initialText) == null) {
                                str = "";
                            }
                            c197039127h.setText(str);
                            c197039127h.setEnabled(true);
                        }
                    }
                    C1180600gpO c1180600gpO = new C1180600gpO("poi_quiz", "poi_quiz_cover", null);
                    String str7 = poiQuizItem.poiHeaderImg;
                    if (str7 != null) {
                        str3 = str7;
                    }
                    C1189360h3W c1189360h3WLIZIZ = c1180600gpO.LIZIZ(str3);
                    c1189360h3WLIZIZ.LIZ.LJIL = Bitmap.Config.ARGB_8888;
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_map_pin_fill;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a03);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.zr);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102));
                    c1189360h3WLIZIZ.LIZ.LJJIIZI(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.itemView.getContext())));
                    c1189360h3WLIZIZ.LIZLLL(this.LLILZ);
                    c1189360h3WLIZIZ.LIZIZ();
                    return;
                }
                return;
            }
            C1182900gt6 c1182900gt6 = C1182900gt6.LIZ;
            EnumC994380bz2 enumC994380bz2 = EnumC994380bz2.SHOW;
            c1182900gt6.getClass();
            c1182900gt6.LIZJ("poi_quiz_error_status_view", new AwS132S1100000_18(enumC994380bz2, "poi_pick", 20));
            C1749280vcc c1749280vcc2 = this.LLJIJIL;
            if (c1749280vcc2 != null) {
                C339190DRl.LIZLLL(c1749280vcc2);
            }
            View view3 = this.LLJI;
            if (view3 != null) {
                C339190DRl.LIZIZ(view3);
            }
            View view4 = this.LLILLL;
            if (view4 == null) {
                return;
            }
            C339190DRl.LIZIZ(view4);
            return;
        }
        View view5 = this.LLJI;
        if (view5 != null) {
            C339190DRl.LIZLLL(view5);
        }
        C1749280vcc c1749280vcc3 = this.LLJIJIL;
        if (c1749280vcc3 != null) {
            C339190DRl.LIZIZ(c1749280vcc3);
        }
        View view6 = this.LLILLL;
        if (view6 == null) {
            return;
        }
        C339190DRl.LIZIZ(view6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e6k, viewGroup, false);
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        boolean z;
        boolean z2;
        EnumC1179510gnd enumC1179510gnd;
        boolean z3;
        String str;
        PoiQuizItem poiQuizItem;
        PoiQuizItem poiQuizItem2;
        String str2;
        PoiQuizItem poiQuizItem3;
        PoiQuizHorizontalCardAssem.PoiQuizHorizontalCardAbility poiQuizHorizontalCardAbilityI5 = I5();
        if (poiQuizHorizontalCardAbilityI5 != null && !poiQuizHorizontalCardAbilityI5.d4()) {
            z = true;
        } else {
            z = false;
        }
        PoiQuizHorizontalCardAssem.PoiQuizHorizontalCardAbility poiQuizHorizontalCardAbilityI52 = I5();
        if (poiQuizHorizontalCardAbilityI52 != null && poiQuizHorizontalCardAbilityI52.Bf2()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1179500gnc item = getItem();
        String str3 = null;
        if (item != null) {
            enumC1179510gnd = item.LLILLL;
        } else {
            enumC1179510gnd = null;
        }
        if (enumC1179510gnd == EnumC1179510gnd.SUCCESS) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2) {
            C1182890gt5 c1182890gt5 = C1182890gt5.LIZ;
            EnumC1182880gt4 enumC1182880gt4 = EnumC1182880gt4.CARD;
            c1182890gt5.getClass();
            C1182890gt5.LIZIZ(enumC1182880gt4, false);
        }
        if (z3 && z && z2) {
            C1182890gt5 c1182890gt52 = C1182890gt5.LIZ;
            EnumC1182880gt4 enumC1182880gt42 = EnumC1182880gt4.CARD;
            c1182890gt52.getClass();
            C1182890gt5.LIZIZ(enumC1182880gt42, true);
            PoiQuizPageVM poiQuizPageVML5 = L5();
            C1179500gnc item2 = getItem();
            if (item2 != null && (poiQuizItem3 = item2.LL) != null) {
                str2 = poiQuizItem3.poiId;
            } else {
                str2 = null;
            }
            poiQuizPageVML5.wQ2(str2, true);
        }
        PoiQuizHorizontalCardAssem.PoiQuizHorizontalCardAbility poiQuizHorizontalCardAbilityI53 = I5();
        if (poiQuizHorizontalCardAbilityI53 != null) {
            C1179500gnc item3 = getItem();
            if (item3 != null && (poiQuizItem2 = item3.LL) != null) {
                str = poiQuizItem2.poiId;
            } else {
                str = null;
            }
            C1179500gnc item4 = getItem();
            if (item4 != null && (poiQuizItem = item4.LL) != null) {
                str3 = poiQuizItem.collectInfo;
            }
            poiQuizHorizontalCardAbilityI53.e2(new C1177230gjx(i, str, str3));
        }
    }
}
