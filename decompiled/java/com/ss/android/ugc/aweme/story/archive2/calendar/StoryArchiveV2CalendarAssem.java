package com.ss.android.ugc.aweme.story.archive2.calendar;

import X.AbstractC1156990gDJ;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0DXR;
import X.C1157000gDK;
import X.C1173390gdl;
import X.C1208630hYb;
import X.C1209070hZJ;
import X.C1220000hqw;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS45S0100000_18;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchiveV2CalendarAssem extends UIListContentAssem<StoryArchiveV2CalendarViewModel> {
    public final C736950SvV LLIZLLLIL;
    public final C736950SvV LLJ;
    public final C01GW LLJI;

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

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final AssemListViewModel ip() {
        return (AssemListViewModel) this.LLJ.getValue();
    }

    public final StoryArchiveV2ArchiveViewModel Lo() {
        return (StoryArchiveV2ArchiveViewModel) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    public final void No() {
        ?? arrayList;
        LinearLayoutManager linearLayoutManager;
        C1157000gDK c1157000gDK;
        String str;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJ.getValue();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        List<AbstractC1156990gDJ> list = ((C1173390gdl) assemViewModel.getState()).LL.LLILZ;
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
                if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    while (true) {
                        AbstractC1156990gDJ abstractC1156990gDJ = (AbstractC1156990gDJ) C13LP.LJJJLZIJ(iFindLastVisibleItemPosition, list);
                        if ((abstractC1156990gDJ instanceof C1157000gDK) && (str = (c1157000gDK = (C1157000gDK) abstractC1156990gDJ).LLILLL) != null && !c1157000gDK.LLILZ) {
                            arrayList.add(str);
                        }
                        if (arrayList.size() >= 20 || iFindLastVisibleItemPosition == iFindFirstVisibleItemPosition) {
                            break;
                        } else {
                            iFindLastVisibleItemPosition--;
                        }
                    }
                }
            }
        }
        StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModelLo = Lo();
        storyArchiveV2ArchiveViewModelLo.getClass();
        storyArchiveV2ArchiveViewModelLo.setState(new AwS597S0100000_18((List) arrayList, (List<String>) 678));
    }

    public StoryArchiveV2CalendarAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(767);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((AbstractC738140SxQ) this, 2275);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLIZLLLIL = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS256S0000000_18, awS562S0100000_18, c451610HnL, c723700Sa8);
        this.LLJ = new C736950SvV(C13LE.LIZ(StoryArchiveV2CalendarViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(768), new AwS562S0100000_18((AbstractC738140SxQ) this, 2276), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2274));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().LJIILJJIL(StoryArchiveV2DayCell.class, StoryArchiveV2EmptyDayCell.class, StoryArchiveV2TodayDayCell.class, StoryArchiveV2MonthHeaderCell.class);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Go().getContext(), 7);
        gridLayoutManager.LLIZ = new C1208630hYb(this, 2);
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(gridLayoutManager);
        Go().setItemAnimator(null);
        Go().addItemDecoration(new C0DXR() { // from class: X.03If
            public final int LL = 16;
            public final int LLILLJJLI = 16;

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                if (childAdapterPosition == -1) {
                    return;
                }
                if (childAdapterPosition == 0) {
                    rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)));
                    return;
                }
                AbstractC21673619ry adapter = recyclerView.getAdapter();
                if (adapter == null || childAdapterPosition != adapter.getItemCount() - 1) {
                    return;
                }
                rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI)));
            }
        });
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo2 = Go();
        final List<InterfaceC1891350zJl> listItems = Go().getListItems();
        viewOnAttachStateChangeListenerC20604515jvGo2.addItemDecoration(new C0DXR(listItems) { // from class: X.03p1
            public final List<InterfaceC1891350zJl> LL;
            public final int LLILLJJLI = 24;

            {
                this.LL = listItems;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                if (childAdapterPosition != -1 && (C13LP.LJJJLZIJ(childAdapterPosition, this.LL) instanceof C1156960gDG) && childAdapterPosition != 0) {
                    rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI)));
                }
            }
        });
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo3 = Go();
        final List<InterfaceC1891350zJl> listItems2 = Go().getListItems();
        viewOnAttachStateChangeListenerC20604515jvGo3.addItemDecoration(new C0DXR(listItems2) { // from class: X.03p0
            public final List<InterfaceC1891350zJl> LL;
            public final int LLILLJJLI = 7;
            public final int LLILLL = 4;

            {
                this.LL = listItems2;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                Object objLJJJLZIJ;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                if (childAdapterPosition == -1 || (objLJJJLZIJ = C13LP.LJJJLZIJ(childAdapterPosition, this.LL)) == null || !(!(objLJJJLZIJ instanceof C1156960gDG))) {
                    return;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)) / 2);
                rect.left = iLIZIZ;
                rect.right = iLIZIZ;
                List<InterfaceC1891350zJl> list = this.LL;
                int iMin = Math.min(this.LLILLJJLI + childAdapterPosition, list.size());
                int i = childAdapterPosition + 1;
                if (i <= iMin) {
                    while (i < list.size()) {
                        if (!(ListProtector.get(list, i) instanceof C1156960gDG)) {
                            if (i == iMin) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            return;
                        }
                    }
                }
                if (childAdapterPosition + this.LLILLJJLI < list.size()) {
                    rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL)));
                }
            }
        });
        Go().addOnScrollListener(new AsS45S0100000_18(this, 7));
        C786410Ut5.LLF(4, Go());
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0gdy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1173560ge2) obj).LLILZLL);
            }
        }, null, new AwS632S0100000_18(this, 226), 6);
        StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModelLo = Lo();
        selectSubscribe(storyArchiveV2ArchiveViewModelLo, new C2217381BqS() { // from class: X.0ge3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0gdz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1173560ge2) obj).LLIZ);
            }
        }, new C2217381BqS() { // from class: X.0ge6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LLILLL;
            }
        }, C736820SvI.LIZIZ(storyArchiveV2ArchiveViewModelLo.usedInReusedScene), null, new C1209070hZJ(this, 4));
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ge0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1173560ge2) obj).LLIZ);
            }
        }, null, new AwS618S0100000_4(this, 58), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ge4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1173560ge2) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 225), 6);
    }
}
