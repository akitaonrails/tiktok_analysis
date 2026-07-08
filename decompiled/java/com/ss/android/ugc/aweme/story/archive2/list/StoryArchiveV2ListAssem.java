package com.ss.android.ugc.aweme.story.archive2.list;

import X.AbstractC1157040gDO;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0DXR;
import X.C1157210gDf;
import X.C1173380gdk;
import X.C1173890geZ;
import X.C1208630hYb;
import X.C1220000hqw;
import X.C1388580mEq;
import X.C13BV;
import X.C13LE;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217241BqE;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS45S0100000_18;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchiveV2ListAssem extends UIListContentAssem<StoryArchiveV2ListViewModel> {
    public final C736950SvV LLIZLLLIL;
    public final C736950SvV LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        return c20603715jn;
    }

    public final StoryArchiveV2ArchiveViewModel Lo() {
        return (StoryArchiveV2ArchiveViewModel) this.LLIZLLLIL.getValue();
    }

    public final C1173890geZ No() {
        return (C1173890geZ) this.LLJILJIL.getValue();
    }

    public final C1749280vcc Oo() {
        return (C1749280vcc) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: So, reason: merged with bridge method [inline-methods] */
    public final StoryArchiveV2ListViewModel ip() {
        return (StoryArchiveV2ListViewModel) this.LLJ.getValue();
    }

    public final boolean Vo() {
        return Intrinsics.LJFF(C723850SaN.LJFF(this, "is_thought_page"), Boolean.TRUE);
    }

    public StoryArchiveV2ListAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(772);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7((AbstractC738140SxQ) this, 423);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLIZLLLIL = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS256S0000000_18, awS551S0100000_7, c451610HnL, c723700Sa8);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 2283);
        this.LLJ = new C736950SvV(C13LE.LIZ(StoryArchiveV2ListViewModel.class), awS562S0100000_18, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(773), new AwS551S0100000_7((AbstractC738140SxQ) this, 424), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2281));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2280));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2282));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 425));
        this.LLJILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 422));
        this.LLJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 421));
    }

    public final void Zo() {
        int i = Vo() ? Lo().LL.thoughtAwemeCount : Lo().LL.awemeCount;
        if (Lo().LL.isValid() && i > 0) {
            C786410Ut5.LJLLLLLL(0, (View) this.LLJIJIL.getValue());
            C786410Ut5.LJLLLLLL(8, Oo());
        } else {
            C786410Ut5.LJLLLLLL(8, (View) this.LLJIJIL.getValue());
            C786410Ut5.LJLLLLLL(0, Oo());
            Oo().LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.13BV] */
    public final void ap() {
        ?? arrayList;
        LinearLayoutManager linearLayoutManager;
        StoryArchiveV2ListViewModel storyArchiveV2ListViewModelJo = Jo();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        List<AbstractC1157040gDO> list = ((C1173380gdk) storyArchiveV2ListViewModelJo.getState()).LL.LLILZ;
        if (list == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jvGo.getLayoutManager();
            if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                arrayList = new ArrayList();
                if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0) {
                    int size = list.size();
                    int i = 0;
                    while (iFindFirstVisibleItemPosition < size && ((i < 20 || !arrayList.isEmpty()) && arrayList.size() < 10)) {
                        AbstractC1157040gDO abstractC1157040gDO = (AbstractC1157040gDO) ListProtector.get(list, iFindFirstVisibleItemPosition);
                        if (abstractC1157040gDO instanceof C1157210gDf) {
                            i++;
                            C1157210gDf c1157210gDf = (C1157210gDf) abstractC1157040gDO;
                            if (!c1157210gDf.LLILLL) {
                                arrayList.add(c1157210gDf.LLILLJJLI);
                            }
                        }
                        iFindFirstVisibleItemPosition++;
                    }
                }
            }
        }
        StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModelLo = Lo();
        storyArchiveV2ArchiveViewModelLo.getClass();
        storyArchiveV2ArchiveViewModelLo.setState(new AwS597S0100000_18((List) arrayList, (List<String>) 678));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Jo().LLILZLL = Vo();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC2217241BqE interfaceC2217241BqE;
        super.onViewCreated(view);
        Go().LJIILJJIL(StoryArchiveV2ListSkeletonCell.class, StoryArchiveV2ListHeaderCell.class, StoryArchiveV2ListStoryCell.class, StoryArchiveV2ListEmptyCell.class, StoryArchiveV2ListSubmissionCell.class, StoryArchiveThoughtSubmissionCell.class);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Go().getContext(), 3);
        gridLayoutManager.LLIZ = new C1208630hYb(this, 3);
        gridLayoutManager.setReverseLayout(true);
        Go().setLayoutManager(gridLayoutManager);
        Go().setLayoutDirection(!C1388580mEq.LIZIZ(getContext()) ? 1 : 0);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.0f)));
        viewOnAttachStateChangeListenerC20604515jvGo.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0DWr
            public final int LL;

            {
                this.LL = iLIZIZ;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                GridLayoutManager gridLayoutManager2;
                C21681919tJ c21681919tJ;
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager2 = (GridLayoutManager) layoutManager) != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
                        int i = gridLayoutManager2.LLILLJJLI;
                        if (1 == c21681919tJ.LLILLJJLI) {
                            int i2 = c21681919tJ.LL;
                            int i3 = this.LL;
                            rect.left = i3 - (((i2 + 1) * i3) / i);
                            rect.right = (i2 * i3) / i;
                            rect.top = i3;
                        }
                    }
                }
            }
        });
        Go().setItemAnimator(null);
        Go().addOnScrollListener(new AsS45S0100000_18(this, 8));
        if (Vo()) {
            interfaceC2217241BqE = new C2217381BqS() { // from class: X.0gdv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1173560ge2) obj).LLILLJJLI;
                }
            };
        } else {
            interfaceC2217241BqE = new C2217381BqS() { // from class: X.0ge5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1173560ge2) obj).LL;
                }
            };
        }
        C736680Sv4.LJIIIZ(this, Lo(), interfaceC2217241BqE, new C2217381BqS() { // from class: X.0ge7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LLILLL;
            }
        }, null, new AwS667S0100000_18(this, 28), 12);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ge8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 230), 6);
        C736680Sv4.LJIIIZ(this, Lo(), new C2217381BqS() { // from class: X.0gds
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1173560ge2) obj).LLILZ);
            }
        }, new C2217381BqS() { // from class: X.0gdt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LLILZIL;
            }
        }, null, new AwS667S0100000_18(this, 22), 12);
        C736680Sv4.LJIIIIZZ(this, Lo(), interfaceC2217241BqE, null, new AwS632S0100000_18(this, 231), 6);
        C736680Sv4.LJIIIZ(this, Jo(), new C2217381BqS() { // from class: X.0gdo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173380gdk) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0gdn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173380gdk) obj).LLILZIL;
            }
        }, null, new AwS667S0100000_18(this, 27), 12);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gdm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173380gdk) obj).LLILZLL;
            }
        }, null, new AwS632S0100000_18(this, 229), 6);
    }
}
