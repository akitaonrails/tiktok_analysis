package com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders;

import X.C01GW;
import X.C0P51;
import X.C0P6E;
import X.C0PAN;
import X.C0PBU;
import X.C0PBW;
import X.C0PBY;
import X.C0PBZ;
import X.C0PCF;
import X.C0PCW;
import X.C13BV;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C21681919tJ;
import X.C301200BrK;
import X.C452501pT;
import X.C587060N0u;
import X.C588600N6s;
import X.C640700PBc;
import X.C640750PBh;
import X.C641510PEf;
import X.C650660Pfc;
import X.C652310PiH;
import X.C664400Q4g;
import X.C737030Svd;
import X.InterfaceC494301wD;
import X.InterfaceC648310Pbp;
import X.InterfaceC648350Pbt;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class BackFromDetailProvider implements C0PBY {
    public final /* synthetic */ C640700PBc LL = new C640700PBc();
    public final Fragment LLILLJJLI;
    public final RecyclerView LLILLL;
    public final C0P6E LLILZ;
    public final Function0<Boolean> LLILZIL;
    public final C0PBU LLILZLL;
    public final Function0<List<C0PAN>> LLIZ;
    public final C01GW LLIZLLLIL;

    public interface ISearchLiveExitLocatorAbility extends InterfaceC494301wD {
        void ut2(int i);
    }

    @Override // X.C0PBY
    public final void Q1(List<? extends InterfaceC648350Pbt> list, C587060N0u c587060N0u) {
        this.LL.Q1(list, c587060N0u);
    }

    @Override // X.C0P74
    public final void LJL() {
        this.LL.LL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C737030Svd r20) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.BackFromDetailProvider.LIZIZ(X.0Svd):void");
    }

    @Override // X.C0P74
    public final void z1(C588600N6s c588600N6s) {
        this.LL.LL = c588600N6s;
    }

    public final void LIZ(final int i, C737030Svd c737030Svd, final Aweme aweme) {
        this.LL.LIZIZ();
        if (i >= 0) {
            C0P6E c0p6e = this.LLILZ;
            if (c0p6e != null && aweme != null) {
                this.LLILZ.LIZIZ(c0p6e.LIZ(i), c737030Svd, aweme);
            } else {
                this.LLILLL.scrollToPosition(i);
            }
            RecyclerView recyclerView = this.LLILLL;
            if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
                LIZJ(aweme, Integer.valueOf(i), null);
                return;
            } else {
                recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0P9m
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        view.removeOnLayoutChangeListener(this);
                        this.LL.LIZJ(aweme, Integer.valueOf(i), null);
                    }
                });
                return;
            }
        }
        LIZJ(aweme, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0Pbt] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.13BV] */
    public final void LIZJ(Aweme aweme, Integer num, C0PBZ c0pbz) {
        ?? r3;
        ?? arrayList;
        if (num != null) {
            num.intValue();
            ?? FindViewHolderForAdapterPosition = this.LLILLL.findViewHolderForAdapterPosition(num.intValue());
            if (FindViewHolderForAdapterPosition == 0) {
                return;
            }
            RecyclerView.ViewHolder viewHolder = null;
            if ((FindViewHolderForAdapterPosition instanceof InterfaceC648350Pbt) && (r3 = (InterfaceC648350Pbt) FindViewHolderForAdapterPosition) != 0) {
                RecyclerView recyclerView = this.LLILLL;
                if (recyclerView == null) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    List<Integer> listLIZ = C641510PEf.LIZ(recyclerView);
                    if (listLIZ.isEmpty()) {
                        arrayList = C13BV.INSTANCE;
                    } else {
                        arrayList = new ArrayList();
                        Iterator<Integer> it2 = listLIZ.iterator();
                        while (it2.hasNext()) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(it2.next().intValue());
                            if (viewHolderFindViewHolderForAdapterPosition != null && (viewHolderFindViewHolderForAdapterPosition instanceof InterfaceC648350Pbt)) {
                                arrayList.add(new Pair(viewHolderFindViewHolderForAdapterPosition, viewHolderFindViewHolderForAdapterPosition));
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                int i = 0;
                for (Pair pair : arrayList) {
                    C21681919tJ c21681919tJ = (C21681919tJ) ((RecyclerView.ViewHolder) pair.getFirst()).itemView.getLayoutParams();
                    if (c21681919tJ.LL == 0) {
                        i++;
                    }
                    hashSet.add(new C650660Pfc((InterfaceC648350Pbt) pair.getSecond(), i, c21681919tJ.LL));
                }
                this.LL.LJFF(hashSet);
                if (r3 instanceof InterfaceC648310Pbp) {
                    InterfaceC648310Pbp interfaceC648310Pbp = (InterfaceC648310Pbp) r3;
                    if (interfaceC648310Pbp.K4() && aweme != null) {
                        interfaceC648310Pbp.LJJLL(aweme, new C0PBW(this, interfaceC648310Pbp));
                        RecyclerView recyclerView2 = this.LLILLL;
                        if (r3 instanceof RecyclerView.ViewHolder) {
                            viewHolder = (RecyclerView.ViewHolder) r3;
                        }
                        C0PCF.LIZJ(recyclerView2, viewHolder);
                        return;
                    }
                }
                if (c0pbz instanceof C640750PBh) {
                    C640750PBh c640750PBh = (C640750PBh) c0pbz;
                    if (c640750PBh.LIZIZ != null) {
                        if (this.LLILZLL == null) {
                            return;
                        }
                        C640750PBh c640750PBh2 = c640750PBh.LIZIZ;
                        if (c640750PBh2 != null) {
                            C0PBU.LIZ(FindViewHolderForAdapterPosition, c640750PBh2, new AwS411S0200000_10((InterfaceC648350Pbt) r3, this, 33));
                            return;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
                if (!r3.N1()) {
                    return;
                }
                C664400Q4g c664400Q4g = new C664400Q4g();
                c664400Q4g.LIZJ = System.currentTimeMillis();
                c664400Q4g.LJIIJ = "back_from_detail";
                List<? extends InterfaceC648350Pbt> listLIZ2 = C0PCW.LIZ(this.LLILLL, r3);
                InterfaceC648350Pbt interfaceC648350Pbt = (InterfaceC648350Pbt) C13LP.LJJJLL(listLIZ2);
                if (interfaceC648350Pbt != null) {
                    interfaceC648350Pbt.setPlayMetrics(c664400Q4g);
                }
                Q1(listLIZ2, null);
                RecyclerView recyclerView3 = this.LLILLL;
                if (r3 instanceof RecyclerView.ViewHolder) {
                    viewHolder = (RecyclerView.ViewHolder) r3;
                }
                C0PCF.LIZJ(recyclerView3, viewHolder);
            }
        }
    }

    public BackFromDetailProvider(Fragment fragment, RecyclerView recyclerView, C0P51 c0p51, AwS554S0100000_10 awS554S0100000_10, C0PBU c0pbu, AwS554S0100000_10 awS554S0100000_102) {
        this.LLILLJJLI = fragment;
        this.LLILLL = recyclerView;
        this.LLILZ = c0p51;
        this.LLILZIL = awS554S0100000_10;
        this.LLILZLL = c0pbu;
        this.LLIZ = awS554S0100000_102;
        if (C301200BrK.LIZ()) {
            C1558520qew.LJII(C1558360qeg.LJFF(this.LLILLJJLI, null), new ISearchLiveExitLocatorAbility() { // from class: com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.BackFromDetailProvider.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v5, types: [X.13BV] */
                @Override // com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.BackFromDetailProvider.ISearchLiveExitLocatorAbility
                public final void ut2(int i) {
                    ?? arrayList;
                    RecyclerView recyclerView2 = BackFromDetailProvider.this.LLILLL;
                    if (recyclerView2 == null) {
                        arrayList = C13BV.INSTANCE;
                    } else {
                        List<Integer> listLIZ = C641510PEf.LIZ(recyclerView2);
                        if (listLIZ.isEmpty()) {
                            arrayList = C13BV.INSTANCE;
                        } else {
                            arrayList = new ArrayList();
                            Iterator<Integer> it2 = listLIZ.iterator();
                            while (it2.hasNext()) {
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(it2.next().intValue());
                                if ((viewHolderFindViewHolderForAdapterPosition instanceof C652310PiH) && viewHolderFindViewHolderForAdapterPosition != null) {
                                    arrayList.add(viewHolderFindViewHolderForAdapterPosition);
                                }
                            }
                        }
                    }
                    C652310PiH c652310PiH = (C652310PiH) C13LP.LJJJLL(arrayList);
                    if (c652310PiH != null) {
                        BackFromDetailProvider backFromDetailProvider = BackFromDetailProvider.this;
                        if (backFromDetailProvider.LLILZLL != null) {
                            C0PBU.LIZ(c652310PiH, new C640750PBh(i, null, false, 0, 14), new AwS411S0200000_10(backFromDetailProvider, c652310PiH, 68));
                        }
                    }
                }
            }, ISearchLiveExitLocatorAbility.class, null, null);
        }
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, LSPassThroughRecordSizeConfig.DEFAULT));
    }
}
