package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.tab;

import X.C01GW;
import X.C0DXR;
import X.C124900dj;
import X.C15438062q;
import X.C1558520qew;
import X.C1697810uHb;
import X.C20600815jK;
import X.C371330Eh9;
import X.C451760Hna;
import X.C451800Hne;
import X.C452501pT;
import X.C661350Pwr;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovCardAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS133S0201000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchMultiSummaryTabAssem extends ReusedUISlotAssem<SearchMultiSummaryTabAssem> implements InterfaceC712990Rxx<C124900dj>, ISearchMultiSummaryTabAbility {
    public C451760Hna LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 594));
    public C371330Eh9 LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f07;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1558520qew.LJIIJJI((InterfaceC665370Q7z) this.LLJL.getValue(), ISearchMultiSummaryTabAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2 = null;
        C1558520qew.LJII((InterfaceC665370Q7z) this.LLJL.getValue(), this, ISearchMultiSummaryTabAbility.class, null, null);
        C451760Hna c451760Hna = (C451760Hna) view.findViewById(R.id.txa);
        this.LLJJLIIIJLLLLLLLZ = c451760Hna;
        if (c451760Hna != null) {
            c451760Hna.setItemAnimator(null);
            RecyclerView.LayoutManager layoutManager = c451760Hna.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                linearLayoutManager.setOrientation(0);
                linearLayoutManager2 = linearLayoutManager;
            }
            c451760Hna.setLayoutManager(linearLayoutManager2);
            c451760Hna.addItemDecoration(new C0DXR() { // from class: X.0Hni
                public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(2));

                @Override // X.C0DXR
                public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    LinearLayoutManager linearLayoutManager3;
                    float f;
                    float f2;
                    float bottom = recyclerView.getBottom();
                    float fLIZIZ = bottom - C418440Gaw.LIZIZ(Float.valueOf(1.0f));
                    int iLIZIZ = c21673919s1.LIZIZ();
                    boolean zLIZLLL = C426750GoL.LIZLLL(recyclerView.getContext());
                    RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                    if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager3 = (LinearLayoutManager) layoutManager2) != null) {
                        int iFindFirstVisibleItemPosition = linearLayoutManager3.findFirstVisibleItemPosition();
                        float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(4.0f));
                        float fLIZIZ3 = C418440Gaw.LIZIZ(Float.valueOf(12.0f));
                        Iterator it2 = new C462910IDh(recyclerView, 0).iterator();
                        int i = 0;
                        while (true) {
                            C462890IDf c462890IDf = (C462890IDf) it2;
                            if (c462890IDf.hasNext()) {
                                Object next = c462890IDf.next();
                                int i2 = i + 1;
                                if (i >= 0) {
                                    View view2 = (View) next;
                                    int i3 = i + iFindFirstVisibleItemPosition;
                                    float left = view2.getLeft();
                                    float right = view2.getRight();
                                    if (i3 == 0) {
                                        if (zLIZLLL) {
                                            f = -fLIZIZ2;
                                            f2 = fLIZIZ2;
                                        } else {
                                            f = fLIZIZ2;
                                            f2 = -fLIZIZ2;
                                        }
                                    } else if (i3 == iLIZIZ - 1) {
                                        if (zLIZLLL) {
                                            f = fLIZIZ2;
                                            f2 = -fLIZIZ2;
                                        } else {
                                            f = -fLIZIZ2;
                                            f2 = fLIZIZ2;
                                        }
                                    } else {
                                        f = -fLIZIZ2;
                                        f2 = f;
                                    }
                                    if (right - left < recyclerView.getWidth()) {
                                        canvas.drawRect(recyclerView.getLeft() + fLIZIZ3, fLIZIZ, recyclerView.getRight() - fLIZIZ3, bottom, (Paint) this.LL.getValue());
                                    } else {
                                        canvas.drawRect(left + f, fLIZIZ, right - f2, bottom, (Paint) this.LL.getValue());
                                    }
                                    i = i2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    float fLIZIZ;
                    float fLIZIZ2;
                    float fLIZIZ3;
                    float fLIZIZ4;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    int iLIZIZ = c21673919s1.LIZIZ();
                    boolean zLIZLLL = C426750GoL.LIZLLL(recyclerView.getContext());
                    Float fValueOf = Float.valueOf(12.0f);
                    Float fValueOf2 = Float.valueOf(4.0f);
                    if (childAdapterPosition == 0) {
                        if (zLIZLLL) {
                            fLIZIZ3 = C418440Gaw.LIZIZ(fValueOf2);
                        } else {
                            fLIZIZ3 = C418440Gaw.LIZIZ(fValueOf);
                        }
                        rect.left = C814420VxA.LIZIZ(fLIZIZ3);
                        if (zLIZLLL) {
                            fLIZIZ4 = C418440Gaw.LIZIZ(fValueOf);
                        } else {
                            fLIZIZ4 = C418440Gaw.LIZIZ(fValueOf2);
                        }
                        rect.right = C814420VxA.LIZIZ(fLIZIZ4);
                        return;
                    }
                    if (childAdapterPosition == iLIZIZ - 1) {
                        if (zLIZLLL) {
                            fLIZIZ = C418440Gaw.LIZIZ(fValueOf);
                        } else {
                            fLIZIZ = C418440Gaw.LIZIZ(fValueOf2);
                        }
                        rect.left = C814420VxA.LIZIZ(fLIZIZ);
                        if (zLIZLLL) {
                            fLIZIZ2 = C418440Gaw.LIZIZ(fValueOf2);
                        } else {
                            fLIZIZ2 = C418440Gaw.LIZIZ(fValueOf);
                        }
                        rect.right = C814420VxA.LIZIZ(fLIZIZ2);
                        return;
                    }
                    rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf2));
                    rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf2));
                }
            });
            c451760Hna.LJIILJJIL(SearchMultiSummaryTabItemCell.class);
            c451760Hna.setTag(R.id.rnd, this.LLJL.getValue());
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C124900dj c124900dj) {
        int i;
        C20600815jK<InterfaceC1891350zJl> state;
        C124900dj c124900dj2 = c124900dj;
        C451760Hna c451760Hna = this.LLJJLIIIJLLLLLLLZ;
        if (c451760Hna != null) {
            int lastPos = c451760Hna.getLastPos();
            C451760Hna c451760Hna2 = this.LLJJLIIIJLLLLLLLZ;
            if (c451760Hna2 != null && (state = c451760Hna2.getState()) != null) {
                List<String> list = c124900dj2.LL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                int i2 = 0;
                i = lastPos;
                for (String str : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        String str2 = str;
                        boolean zLJFF = Intrinsics.LJFF(c124900dj2.LLILLJJLI, str2);
                        if (zLJFF) {
                            i = i2;
                        }
                        arrayList.add(new C451800Hne(str2, zLJFF, i2));
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                state.LJIILL(arrayList, null);
            } else {
                i = lastPos;
            }
            if (lastPos != i) {
                C371330Eh9 c371330Eh9 = this.LLJLIL;
                if (c371330Eh9 != null) {
                    C661350Pwr.LJFF(new AwS133S0201000_6(c451760Hna, c371330Eh9, i, 0));
                    c451760Hna.LLILZ = i;
                } else {
                    c451760Hna.scrollToPosition(i);
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C124900dj c124900dj) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C124900dj c124900dj) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.tab.ISearchMultiSummaryTabAbility
    public final void rJ(String str, int i, C371330Eh9 c371330Eh9) {
        this.LLJLIL = c371330Eh9;
        ISearchPovCardAbility iSearchPovCardAbility = (ISearchPovCardAbility) C1558520qew.LIZ((InterfaceC665370Q7z) this.LLJL.getValue(), ISearchPovCardAbility.class, null);
        if (iSearchPovCardAbility != null) {
            iSearchPovCardAbility.Sf1(str);
        }
    }
}
