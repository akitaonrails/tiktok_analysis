package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.AbstractC683560Qra;
import X.C019F;
import X.C01GW;
import X.C0WIY;
import X.C1170980gZs;
import X.C1171050gZz;
import X.C1171210gaF;
import X.C1208640hYc;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C294880Bh8;
import X.C419890GdH;
import X.C419910GdJ;
import X.C452501pT;
import X.C487280J9a;
import X.C723580SZw;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionContentAssem extends UIContentAssem implements InterfaceC487330J9f {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, CollectionDetail.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C1170980gZs.class, null), checkSupervisorPrepared());
    public boolean LLJI;
    public GridLayoutManager LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public int LLJJ;
    public final boolean LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollectionContentAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/favorites/business/collection/vm/VideoCollectionContentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CollectionContentAssem() {
        C0WIY<Boolean, Integer> c0wiyLJJLIIIJJIZ;
        IPoiMapService iPoiMapService;
        C019F c019f = C019F.LIZ;
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 276);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionContentViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 189), AFwS256S0000000_18.get$arr$(94), awS562S0100000_18, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 277));
        this.LLJILLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(126));
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        boolean z = false;
        if (iPoiService != null && (c0wiyLJJLIIIJJIZ = iPoiService.LJJLIIIJJIZ()) != null && Intrinsics.LJFF(c0wiyLJJLIIIJJIZ.LIZ, Boolean.TRUE) && (iPoiMapService = (IPoiMapService) PluggableExtentionKt.pluggableSpi$default(IPoiMapService.class, false, false, false, 14, null)) != null && iPoiMapService.LJFF()) {
            z = true;
        }
        this.LLJJI = z;
    }

    public final C1170980gZs Ho() {
        return (C1170980gZs) this.LLJ.getValue();
    }

    public final VideoCollectionContentViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (VideoCollectionContentViewModel) assemVMLazy.getValue();
    }

    public final CollectionDetail Lo() {
        return (CollectionDetail) this.LLIZLLLIL.getValue();
    }

    public final void No(boolean z) {
        Integer numValueOf;
        C1170980gZs c1170980gZsHo = Ho();
        if (c1170980gZsHo != null && (numValueOf = Integer.valueOf(c1170980gZsHo.LL)) != null) {
            if (numValueOf.intValue() == 1) {
                VideoCollectionContentViewModel videoCollectionContentViewModelJo = Jo();
                videoCollectionContentViewModelJo.withState(new AwS105S0110000_18(videoCollectionContentViewModelJo, z, 20));
            } else if (numValueOf.intValue() == 0) {
                Jo().vQ2(z);
            } else {
                if (numValueOf.intValue() != 2) {
                    return;
                }
                VideoCollectionContentViewModel videoCollectionContentViewModelJo2 = Jo();
                videoCollectionContentViewModelJo2.withState(new AwS105S0110000_18(videoCollectionContentViewModelJo2, z, 18));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0QrV, X.0gaF, X.19ry, java.lang.Object] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        GridLayoutManager gridLayoutManager;
        RecyclerView recyclerView = (RecyclerView) view;
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        C1170980gZs c1170980gZsHo = Ho();
        if (c1170980gZsHo != null && c1170980gZsHo.LL == 0) {
            z = true;
        } else {
            z = false;
        }
        final boolean z2 = !z;
        final ?? r2 = new AbstractC683560Qra<C1171050gZz>(c19egLIZ, this, z2) { // from class: X.0gaF
            public final C19EG LLILLL;
            public final boolean LLILZ;
            public final /* synthetic */ CollectionContentAssem LLILZIL;

            @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
            public final int getBasicItemViewType(int i) {
                if (this.LLILZ) {
                    return 1;
                }
                if (i == 0) {
                    return 0;
                }
                if (i != 1 || !this.LLILZIL.LLJJI) {
                    return 1;
                }
                return 2;
            }

            @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                super.onViewAttachedToWindow(viewHolder);
                if (viewHolder instanceof C1171230gaH) {
                    ((AbstractC1620180sGO) viewHolder).LJLJJLL(true);
                }
            }

            @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
            public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
                super.onViewDetachedFromWindow(viewHolder);
                if (viewHolder instanceof C1171230gaH) {
                    AbstractC1620180sGO abstractC1620180sGO = (AbstractC1620180sGO) viewHolder;
                    abstractC1620180sGO.LJLJJLL(false);
                    abstractC1620180sGO.c1();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:140:0x0216  */
            /* JADX WARN: Removed duplicated region for block: B:149:0x0299  */
            /* JADX WARN: Removed duplicated region for block: B:245:0x0450  */
            /* JADX WARN: Removed duplicated region for block: B:258:0x0474  */
            /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
            @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r33, int r34) throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 1311
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1171210gaF.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
            }

            @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) throws Exception {
                if (i == 0) {
                    return new C1171220gaG(this.LLILZIL, viewGroup);
                }
                if (i == 1) {
                    return new C1171230gaH(this.LLILZIL, viewGroup);
                }
                if (i == 2) {
                    return new C1171080ga2(this.LLILZIL, viewGroup);
                }
                throw new Exception("not match view type");
            }

            {
                this.LLILZIL = this;
                this.LLILLL = c19egLIZ;
                this.LLILZ = z2;
            }
        };
        r2.setLoadMoreListener(new AwS419S0200000_18((C1171210gaF) r2, this, 23));
        r2.spanSizeLookup = new C1208640hYc(r2, this, 0);
        int iLLLIZZ = C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0);
        if (C294880Bh8.LIZ()) {
            gridLayoutManager = new GridLayoutManager(iLLLIZZ, getContext()) { // from class: com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem.onViewCreated.1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollVertically() {
                    List<C1171050gZz> data;
                    C1170980gZs c1170980gZsHo2 = this.Ho();
                    if (c1170980gZsHo2 == null || c1170980gZsHo2.LL != 0 || ((data = getData()) != null && data.size() > 1)) {
                        return super.canScrollVertically();
                    }
                    return false;
                }
            };
        } else {
            gridLayoutManager = new GridLayoutManager(getContext(), iLLLIZZ);
        }
        this.LLJIJIL = gridLayoutManager;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(r2);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gZt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1170570gZD) obj).LL;
            }
        }, null, new AwS597S0100000_18(recyclerView, 91), null, new AwS384S0200000_18(this, recyclerView, 45), 10, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gZw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1170570gZD) obj).LLILLJJLI;
            }
        }, null, new AwS597S0100000_18(recyclerView, 92), new AwS419S0200000_18(recyclerView, (C1171210gaF) r2, 22), new AwS227S0300000_18(this, recyclerView, (C1171210gaF) r2, 16), 2, null);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gZv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1170570gZD) obj).LLILZIL;
            }
        }, null, new AwS632S0100000_18(this, 37), 6);
        No(true);
        C487280J9a.LIZ(c19egLIZ.hashCode(), this);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        GridLayoutManager gridLayoutManager = this.LLJIJIL;
        if (gridLayoutManager != null) {
            gridLayoutManager.LJIJ(C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0));
        }
    }

    public final void Go(TextView textView, int i, int i2) {
        TuxTextView tuxTextView;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_lock_small;
        c419910GdJ.LJ = Integer.valueOf(i);
        Context context = getContext();
        if (context != null) {
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            tuxIconDrawableLIZ.setBounds(0, 0, i2, i2);
            C419890GdH c419890GdH = new C419890GdH(tuxIconDrawableLIZ, 2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" a");
            C786410Ut5.q2(spannableStringBuilder, c419890GdH, 1, 2, 18);
            if (C294880Bh8.LIZ()) {
                if (textView != null) {
                    textView.setBreakStrategy(0);
                }
                if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
                    tuxTextView.setMinTextSize(12.0f);
                }
            }
            if (textView != null) {
                textView.append(spannableStringBuilder);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
