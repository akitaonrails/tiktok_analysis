package com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1561130qj9;
import X.C1573700r3Q;
import X.C1573990r3t;
import X.C1574470r4f;
import X.C1578660rBQ;
import X.C1578940rBs;
import X.C1620670sHB;
import X.C1749280vcc;
import X.C20632315oP;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.EnumC1574490r4h;
import X.EnumC1579060rC4;
import X.InterfaceC1573860r3g;
import X.InterfaceC1573880r3i;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.appdiff.ICommonMiniDramaAppDiffProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssem;
import com.ss.android.ugc.aweme.service.MiniDramaAccountService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class SeriesCenterMainPageAssem extends UIContentAssem implements InterfaceC1573880r3i {
    public final C736950SvV LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;
    public C1578940rBs LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public C20632315oP LLJILLL;
    public C1749280vcc LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    public final C1561130qj9 Go() {
        return (C1561130qj9) this.LLJ.getValue();
    }

    public final SeriesCenterMainPageAssemViewModel Ho() {
        return (SeriesCenterMainPageAssemViewModel) this.LLIZLLLIL.getValue();
    }

    public SeriesCenterMainPageAssem() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 981);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(SeriesCenterMainPageAssemViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), new AwS568S0100000_24((AbstractC738140SxQ) this, 980), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJ = new C1559260qg8(new C723580SZw(this, C1561130qj9.class, "series_center_list_key"), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 979));
        this.LLJJI = true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        MiniDramaAccountService.LIZ.getClass();
        MiniDramaAccountService miniDramaAccountServiceLIZ = C1578660rBQ.LIZ();
        if (miniDramaAccountServiceLIZ != null) {
            miniDramaAccountServiceLIZ.LIZIZ(this);
        }
        Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
        C1574470r4f.LIZLLL(EnumC1574490r4h.SERIES_CENTER);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        MiniDramaAccountService.LIZ.getClass();
        MiniDramaAccountService miniDramaAccountServiceLIZ = C1578660rBQ.LIZ();
        if (miniDramaAccountServiceLIZ != null) {
            miniDramaAccountServiceLIZ.LIZ(this);
        }
        this.LLJJ = (C1749280vcc) view.findViewById(R.id.w28);
        C20632315oP c20632315oP = (C20632315oP) view.findViewById(R.id.ur9);
        this.LLJILLL = c20632315oP;
        if (c20632315oP != null) {
            c20632315oP.LIZIZ(new C1620670sHB(this, 2));
        }
        C1578940rBs c1578940rBs = (C1578940rBs) view.findViewById(R.id.ur5);
        this.LLJIJIL = c1578940rBs;
        c1578940rBs.setVariant(EnumC1579060rC4.CAPSULE);
        c1578940rBs.setHorizontalMargin(16);
        c1578940rBs.setWidthRule(new C1573990r3t(0));
        c1578940rBs.setFont(52);
        c1578940rBs.setOnSelectedChangeListener(new InterfaceC1573860r3g() { // from class: X.0r3R
            @Override // X.InterfaceC1573860r3g
            public final void LIZ(int i, boolean z, AbstractC1573810r3b abstractC1573810r3b) {
                boolean z2;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                RecyclerView recyclerView;
                View viewFindViewByPosition;
                int left;
                int left2;
                int width;
                if (z) {
                    String str8 = this.LIZ.Ho().getState().LLILZIL;
                    this.LIZ.Ho().AQ2(i);
                    if (Math.abs(i - this.LIZ.Ho().getState().LLILZ) <= 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C20632315oP c20632315oP2 = this.LIZ.LLJILLL;
                    if (c20632315oP2 != null) {
                        c20632315oP2.LJ(i, z2);
                    }
                    SeriesCenterMainPageAssem seriesCenterMainPageAssem = this.LIZ;
                    C1578940rBs c1578940rBs2 = seriesCenterMainPageAssem.LLJIJIL;
                    if (c1578940rBs2 != null && (recyclerView = c1578940rBs2.getRecyclerView()) != null) {
                        int size = seriesCenterMainPageAssem.Ho().getState().LLIZ.size() - 1;
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                        if (((linearLayoutManager.findFirstVisibleItemPosition() != 0 && linearLayoutManager.findLastVisibleItemPosition() != size) || (i >= 3 && size - i >= 3)) && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(i)) != null) {
                            Rect rect = new Rect();
                            viewFindViewByPosition.getGlobalVisibleRect(rect);
                            int i2 = rect.right - rect.left;
                            if (i2 > 0 && i2 < viewFindViewByPosition.getWidth()) {
                                if (viewFindViewByPosition.getLeft() > recyclerView.getWidth() / 2) {
                                    left2 = viewFindViewByPosition.getLeft();
                                    width = ((recyclerView.getWidth() - viewFindViewByPosition.getWidth()) / 2) + (viewFindViewByPosition.getWidth() - i2);
                                } else {
                                    left2 = viewFindViewByPosition.getLeft();
                                    width = ((recyclerView.getWidth() - viewFindViewByPosition.getWidth()) / 2) - (viewFindViewByPosition.getWidth() - i2);
                                }
                                left = left2 - width;
                            } else {
                                left = viewFindViewByPosition.getLeft() - ((recyclerView.getWidth() - viewFindViewByPosition.getWidth()) / 2);
                            }
                            recyclerView.smoothScrollBy(left, 0);
                        }
                    }
                    SeriesCenterCenterScene seriesCenterCenterScene = (SeriesCenterCenterScene) C13LP.LJJJLZIJ(i, this.LIZ.Ho().getState().LLIZ);
                    String str9 = "";
                    if (seriesCenterCenterScene == null || (str = seriesCenterCenterScene.categoryId) == null) {
                        str = "";
                    }
                    SeriesCenterMainPageAssem seriesCenterMainPageAssem2 = this.LIZ;
                    if (!seriesCenterMainPageAssem2.LLJJIII) {
                        seriesCenterMainPageAssem2.LLJJIII = true;
                        C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                        C1561130qj9 c1561130qj9Go = seriesCenterMainPageAssem2.Go();
                        if (c1561130qj9Go == null || (str5 = c1561130qj9Go.LLIZLLLIL) == null) {
                            str5 = "";
                        }
                        C1561130qj9 c1561130qj9Go2 = seriesCenterMainPageAssem2.Go();
                        if (c1561130qj9Go2 == null || (str6 = c1561130qj9Go2.LLILZ) == null) {
                            str6 = "";
                        }
                        List<SeriesCenterCenterScene> list = seriesCenterMainPageAssem2.Ho().getState().LLIZ;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<SeriesCenterCenterScene> it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str10 = it2.next().categoryId;
                            if (str10 == null) {
                                str10 = "";
                            }
                            arrayList.add(str10);
                        }
                        boolean z3 = false;
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                        C1561130qj9 c1561130qj9Go3 = seriesCenterMainPageAssem2.Go();
                        if (c1561130qj9Go3 != null && c1561130qj9Go3.LLIZ) {
                            z3 = true;
                        }
                        C1561130qj9 c1561130qj9Go4 = seriesCenterMainPageAssem2.Go();
                        if (c1561130qj9Go4 == null || (str7 = c1561130qj9Go4.LLJ) == null) {
                            str7 = "";
                        }
                        C1611660s2e.LJJJ(c1581520rG2, str5, str6, str7, strLJJLIIIJ, str, null, z3, 64);
                    }
                    SeriesCenterMainPageAssem seriesCenterMainPageAssem3 = this.LIZ;
                    if (Intrinsics.LJFF(abstractC1573810r3b, C1573820r3c.LIZ)) {
                        str2 = "click";
                    } else {
                        str2 = "slide";
                    }
                    seriesCenterMainPageAssem3.getClass();
                    boolean zLJFF = Intrinsics.LJFF(str8, "");
                    boolean zLJFF2 = Intrinsics.LJFF(str, str8);
                    if (!zLJFF && !zLJFF2) {
                        C1581520rG2 c1581520rG22 = C1581520rG2.LJI;
                        C1561130qj9 c1561130qj9Go5 = seriesCenterMainPageAssem3.Go();
                        if (c1561130qj9Go5 == null || (str3 = c1561130qj9Go5.LLIZLLLIL) == null) {
                            str3 = "";
                        }
                        C1561130qj9 c1561130qj9Go6 = seriesCenterMainPageAssem3.Go();
                        if (c1561130qj9Go6 != null && (str4 = c1561130qj9Go6.LLJ) != null) {
                            str9 = str4;
                        }
                        C1611660s2e.LJJJI("series_center", str2, str3, str8, str, str9, "tab");
                    }
                }
            }
        });
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217371BqR() { // from class: X.0r2n
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573270r2j) obj).LLILLJJLI;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1573270r2j) obj).LLILLJJLI = (C1567820qtw) obj2;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 73), 4);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0r2o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573270r2j) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 74), 4);
        ICommonMiniDramaAppDiffProtocol.LIZ.getClass();
        C1573700r3Q.LIZIZ.getValue().LIZ();
        Ho().zQ2();
    }

    @Override // X.InterfaceC1573880r3i
    public final void LLLLLLL(int i, boolean z) {
        if (i != 4 && z) {
            ICommonMiniDramaAppDiffProtocol.LIZ.getClass();
            C1573700r3Q.LIZIZ.getValue().LIZLLL();
        }
    }
}
