package com.ss.android.ugc.aweme.tako.botpage.components.source;

import X.AbstractC738140SxQ;
import X.C013C;
import X.C01GW;
import X.C0PHT;
import X.C0PI2;
import X.C0R3Y;
import X.C13BV;
import X.C13IQ;
import X.C13LC;
import X.C13LE;
import X.C15438062q;
import X.C1860820yWW;
import X.C1863920ybW;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C259800zU;
import X.C289470BWf;
import X.C326880Cre;
import X.C452070Ho5;
import X.C452501pT;
import X.C642420PHs;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSourceItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS122S0400000_27;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS60S0500000_27;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS706S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoReferenceAssem extends ReusedUISlotAssem<TakoReferenceAssem> implements InterfaceC712990Rxx<C0R3Y> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public C0R3Y LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxIconView LLJLIL;
    public ConstraintLayout LLJLILLLLZIIL;
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 803));
    public final AssemVMLazy LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoReferenceAssem.class, "takoInnerDetailVM", "getTakoInnerDetailVM()Lcom/ss/android/ugc/aweme/tako/detail/operator/TakoInnerDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flx;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public TakoReferenceAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoInnerDetailVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 856);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(225);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((AbstractC738140SxQ) this, 804), aFwS269S0000000_27, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJLLIL = assemVMLazy;
        this.LLJLLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 805));
        this.LLJZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 806));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLILLLLZIIL = (ConstraintLayout) view.findViewById(R.id.vqv);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.xcj);
        this.LLJL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(52);
        }
        TuxTextView tuxTextView2 = this.LLJL;
        if (tuxTextView2 != null) {
            C786410Ut5.I7(new AbS706S0100000_27(this, 0), tuxTextView2);
        }
        this.LLJLIL = (TuxIconView) view.findViewById(R.id.xck);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0R3Y c0r3y) {
        boolean z;
        List<TakoSourceItem> listLLILZIL;
        String str;
        String str2;
        String str3;
        String str4;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        C0R3Y c0r3y2 = c0r3y;
        List<TakoSourceItem> listLLILZIL2 = c0r3y2.LLILZIL();
        if (listLLILZIL2 != null && !listLLILZIL2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ConstraintLayout constraintLayout = this.LLJLILLLLZIIL;
            if (constraintLayout != null) {
                C786410Ut5.LL(8, constraintLayout);
            }
            TuxTextView tuxTextView = this.LLJL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            TuxIconView tuxIconView = this.LLJLIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            this.LLJJLIIIJLLLLLLLZ = c0r3y2;
            return;
        }
        List<TakoSourceItem> listLLILZIL3 = c0r3y2.LLILZIL();
        C0R3Y c0r3y3 = this.LLJJLIIIJLLLLLLLZ;
        if (c0r3y3 == null || (listLLILZIL = c0r3y3.LLILZIL()) == null) {
            listLLILZIL = C13BV.INSTANCE;
        }
        if (listLLILZIL3 == null) {
            listLLILZIL3 = C13BV.INSTANCE;
        }
        if (listLLILZIL3.size() == listLLILZIL.size()) {
            int size = listLLILZIL3.size();
            for (int i = 0; i < size; i++) {
                if (((TakoSourceItem) ListProtector.get(listLLILZIL3, i)).type == ((TakoSourceItem) ListProtector.get(listLLILZIL, i)).type) {
                    int i2 = ((TakoSourceItem) ListProtector.get(listLLILZIL3, i)).type;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    continue;
                                } else {
                                    TakoProductItem takoProductItem = ((TakoSourceItem) ListProtector.get(listLLILZIL3, i)).goods;
                                    if (takoProductItem != null) {
                                        lValueOf3 = Long.valueOf(takoProductItem.productId);
                                    } else {
                                        lValueOf3 = null;
                                    }
                                    TakoProductItem takoProductItem2 = ((TakoSourceItem) ListProtector.get(listLLILZIL, i)).goods;
                                    if (takoProductItem2 != null) {
                                        lValueOf4 = Long.valueOf(takoProductItem2.productId);
                                    } else {
                                        lValueOf4 = null;
                                    }
                                    if (!Intrinsics.LJFF(lValueOf3, lValueOf4)) {
                                    }
                                }
                            } else {
                                TakoUserItem takoUserItem = ((TakoSourceItem) ListProtector.get(listLLILZIL3, i)).user;
                                if (takoUserItem != null) {
                                    lValueOf = Long.valueOf(takoUserItem.userId);
                                } else {
                                    lValueOf = null;
                                }
                                TakoUserItem takoUserItem2 = ((TakoSourceItem) ListProtector.get(listLLILZIL, i)).user;
                                if (takoUserItem2 != null) {
                                    lValueOf2 = Long.valueOf(takoUserItem2.userId);
                                } else {
                                    lValueOf2 = null;
                                }
                                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                                }
                            }
                        } else {
                            TakoVideoItem takoVideoItem = ((TakoSourceItem) ListProtector.get(listLLILZIL3, i)).video;
                            if (takoVideoItem != null) {
                                str3 = takoVideoItem.awemeId;
                            } else {
                                str3 = null;
                            }
                            TakoVideoItem takoVideoItem2 = ((TakoSourceItem) ListProtector.get(listLLILZIL, i)).video;
                            if (takoVideoItem2 != null) {
                                str4 = takoVideoItem2.awemeId;
                            } else {
                                str4 = null;
                            }
                            if (Intrinsics.LJFF(str3, str4)) {
                            }
                        }
                    } else {
                        TakoLinkItem takoLinkItem = ((TakoSourceItem) ListProtector.get(listLLILZIL3, i)).link;
                        if (takoLinkItem != null) {
                            str = takoLinkItem.link;
                        } else {
                            str = null;
                        }
                        TakoLinkItem takoLinkItem2 = ((TakoSourceItem) ListProtector.get(listLLILZIL, i)).link;
                        if (takoLinkItem2 != null) {
                            str2 = takoLinkItem2.link;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str, str2)) {
                        }
                    }
                }
            }
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = c0r3y2;
        if (!C289470BWf.LIZ()) {
            op(null, false);
        }
        List<TakoSourceItem> listLLILZIL4 = c0r3y2.LLILZIL();
        if (listLLILZIL4 != null && !listLLILZIL4.isEmpty() && listLLILZIL4 != null) {
            TuxTextView tuxTextView2 = this.LLJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(C786410Ut5.j4(tuxTextView2.getContext().getString(2131849879), Arrays.copyOf(new Object[]{Integer.valueOf(listLLILZIL4.size())}, 1)));
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
            TuxIconView tuxIconView2 = this.LLJLIL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            ConstraintLayout constraintLayout2 = this.LLJLILLLLZIIL;
            if (constraintLayout2 == null) {
                return;
            }
            C786410Ut5.LL(0, constraintLayout2);
            return;
        }
        TuxTextView tuxTextView3 = this.LLJL;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        TuxIconView tuxIconView3 = this.LLJLIL;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        }
        ConstraintLayout constraintLayout3 = this.LLJLILLLLZIIL;
        if (constraintLayout3 == null) {
            return;
        }
        C786410Ut5.LL(8, constraintLayout3);
    }

    public final void tp(View view) {
        List<TakoSourceItem> listLLILZIL;
        TakoCardAbility takoCardAbility;
        C0R3Y c0r3y = this.LLJJLIIIJLLLLLLLZ;
        if (c0r3y != null && (listLLILZIL = c0r3y.LLILZIL()) != null && (takoCardAbility = (TakoCardAbility) this.LLJLL.getValue()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZIL, 10));
            Iterator<TakoSourceItem> it2 = listLLILZIL.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next().rank));
            }
            takoCardAbility.Kk(view, arrayList, "click_all_sources", "reply");
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0R3Y c0r3y) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0R3Y c0r3y) {
    }

    public final void op(Function0 function0, boolean z) {
        ArrayList arrayList;
        String str;
        String str2;
        List<TakoSourceItem> listLLILZIL;
        TakoVideoItem takoVideoItem;
        C0R3Y c0r3y = this.LLJJLIIIJLLLLLLLZ;
        if (c0r3y != null && (listLLILZIL = c0r3y.LLILZIL()) != null) {
            arrayList = new ArrayList();
            for (TakoSourceItem takoSourceItem : listLLILZIL) {
                TakoSourceItem takoSourceItem2 = takoSourceItem;
                if (takoSourceItem2.type == 1 && (takoVideoItem = takoSourceItem2.video) != null && takoVideoItem.LIZ == null) {
                    arrayList.add(takoSourceItem);
                }
            }
        } else {
            arrayList = null;
        }
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        if (arrayList != null && (true ^ arrayList.isEmpty())) {
            if (z) {
                AssemVMLazy assemVMLazy = this.LLJLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZIJLIL;
                TakoInnerDetailVM takoInnerDetailVM = (TakoInnerDetailVM) assemVMLazy.getValue();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    TakoVideoItem takoVideoItem2 = ((TakoSourceItem) it2.next()).video;
                    if (takoVideoItem2 != null) {
                        str2 = takoVideoItem2.awemeId;
                    } else {
                        str2 = null;
                    }
                    arrayList2.add(str2);
                }
                takoInnerDetailVM.wQ2(arrayList2.toString(), new AwS60S0500000_27(c259800zU, (C259800zU<DialogC1389620mGW>) this, (TakoReferenceAssem) arrayList, (List<TakoSourceItem>) c013c, (C013C) function0, (Function0<Unit>) 2), new AwS122S0400000_27(c259800zU, (C259800zU<DialogC1389620mGW>) this, (TakoReferenceAssem) c013c, (C013C) function0, (Function0<Unit>) 11), new AwS271S0300000_27(this, (TakoReferenceAssem) c259800zU, (C259800zU<DialogC1389620mGW>) c013c, (C013C) 11));
                return;
            }
            AssemVMLazy assemVMLazy2 = this.LLJLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJZIJLIL;
            TakoInnerDetailVM takoInnerDetailVM2 = (TakoInnerDetailVM) assemVMLazy2.getValue();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                TakoVideoItem takoVideoItem3 = ((TakoSourceItem) it3.next()).video;
                if (takoVideoItem3 != null) {
                    str = takoVideoItem3.awemeId;
                } else {
                    str = null;
                }
                arrayList3.add(str);
            }
            takoInnerDetailVM2.vQ2(arrayList3.toString());
            AssemVMLazy assemVMLazy3 = this.LLJLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LLJZIJLIL;
            ((TakoInnerDetailVM) assemVMLazy3.getValue()).xQ2(null, null, new AwS393S0200000_27(this, (TakoReferenceAssem) arrayList, (List<TakoSourceItem>) 69));
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void sp(BatchDetailList batchDetailList, List<TakoSourceItem> list) {
        C0PHT c0pht;
        String str;
        String str2;
        C326880Cre c326880CreM50;
        C13LC<C1863920ybW> c13lcRg1;
        C1863920ybW c1863920ybW;
        TakoVideoItem takoVideoItem;
        String str3;
        Iterator<C0PI2> it2 = batchDetailList.items.iterator();
        while (true) {
            TakoSourceItem takoSourceItem = null;
            if (!it2.hasNext()) {
                break;
            }
            C0PI2 next = it2.next();
            Iterator<TakoSourceItem> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                TakoSourceItem next2 = it3.next();
                TakoVideoItem takoVideoItem2 = next2.video;
                if (takoVideoItem2 != null) {
                    str3 = takoVideoItem2.awemeId;
                } else {
                    str3 = null;
                }
                if (Intrinsics.LJFF(str3, next.getAid())) {
                    takoSourceItem = next2;
                    break;
                }
            }
            TakoSourceItem takoSourceItem2 = takoSourceItem;
            if (takoSourceItem2 != null && (takoVideoItem = takoSourceItem2.video) != null) {
                takoVideoItem.LIZ = next;
            }
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJZ.getValue();
        if (iTakoContextAbility == null || (c13lcRg1 = iTakoContextAbility.rg1()) == null || (c1863920ybW = (C1863920ybW) c13lcRg1.LIZIZ()) == null || (c0pht = c1863920ybW.LL) == null) {
            c0pht = new C0PHT(null, 511);
        }
        List<C0PI2> list2 = batchDetailList.items;
        TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLJLLL.getValue();
        if (takoCardAbility == null || (c326880CreM50 = takoCardAbility.m50()) == null || (str = c326880CreM50.LLILLL.uuid) == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<TakoSourceItem> it4 = list.iterator();
        while (it4.hasNext()) {
            TakoVideoItem takoVideoItem3 = it4.next().video;
            if (takoVideoItem3 == null || (str2 = takoVideoItem3.awemeId) == null) {
                str2 = "";
            }
            arrayList.add(str2);
        }
        C642420PHs.LIZIZ(c0pht, list2, C1860820yWW.LIZIZ(str, arrayList.toString()));
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
