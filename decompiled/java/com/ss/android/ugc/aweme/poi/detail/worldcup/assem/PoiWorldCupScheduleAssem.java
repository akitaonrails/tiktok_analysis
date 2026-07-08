package com.ss.android.ugc.aweme.poi.detail.worldcup.assem;

import X.AbstractC1195750hDp;
import X.AbstractC1195770hDr;
import X.C0V0N;
import X.C1173300gdc;
import X.C1174850gg7;
import X.C1174900ggC;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1185600gxS;
import X.C1195630hDd;
import X.C1195710hDl;
import X.C1195720hDm;
import X.C1195800hDu;
import X.C1195810hDv;
import X.C1195820hDw;
import X.C1205640hTm;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C1954807lC;
import X.C2188811AlT;
import X.C717610SCx;
import X.C717620SCy;
import X.C786410Ut5;
import X.C789130UxT;
import X.InterfaceC1195790hDt;
import X.InterfaceC1195850hDz;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.worldcup.assem.PoiWorldCupScheduleAssem;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.PoiWorldCupScheduleModule;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.WorldCupDateMatchGroup;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.WorldCupMatch;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiWorldCupScheduleAssem extends BaseSlashReusedComponent<PoiWorldCupScheduleModule> {
    public View LLJL;
    public TuxTextView LLJLIL;
    public C1195630hDd LLJLILLLLZIIL;
    public C1195720hDm LLJLL;
    public LinearLayout LLJLLIL;
    public Integer LLJZ;
    public Integer LLJZIJLIL;
    public List<WorldCupDateMatchGroup> LLJLLL = C13BV.INSTANCE;
    public final C1174900ggC LLL = new C1174900ggC("poi_detail", "world_cup_schedule", null);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e3q;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    public final void fm1() {
        C1174850gg7.LJII(this);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = S2();
        }
        C1185430gxB.LJJIJIL(c1185430gxB, interfaceC665370Q7zLJIIL, strLJFF, S2(), new C1185050gwZ(PageFinder.via(getContentView())), 16);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJL = view.findViewById(R.id.world_cup_schedule_title_row);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.tv_world_cup_schedule_title);
        this.LLJLILLLLZIIL = (C1195630hDd) view.findViewById(R.id.cwz);
        C1195720hDm c1195720hDm = (C1195720hDm) view.findViewById(R.id.world_cup_date_chips);
        this.LLJLL = c1195720hDm;
        this.LLJLLIL = (LinearLayout) view.findViewById(R.id.world_cup_match_list_container);
        c1195720hDm.setSelectionMode(C1195810hDv.LIZ);
        c1195720hDm.setOnReselectedListener(new InterfaceC1195850hDz() { // from class: X.0hDs
            @Override // X.InterfaceC1195850hDz
            public final void B3() {
            }
        });
        c1195720hDm.setTrackParams(this.LLL);
        c1195720hDm.setHorizontalMargin(16);
    }

    public final void sp(List<WorldCupMatch> list) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout linearLayout = this.LLJLLIL;
        if (linearLayout == null) {
            return;
        }
        C786410Ut5.LJJJJJL(linearLayout);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(linearLayout.getContext());
        int i = 0;
        for (WorldCupMatch worldCupMatch : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C1205640hTm c1205640hTm = (C1205640hTm) C786410Ut5.Td(layoutInflaterNe, R.layout.e22, linearLayout, false);
                c1205640hTm.e0(worldCupMatch, new AwS597S0100000_18(this, 380));
                if (i < list.size() - 1) {
                    ViewGroup.LayoutParams layoutParams2 = c1205640hTm.getLayoutParams();
                    if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                        layoutParams.bottomMargin = (int) (8 * c1205640hTm.getResources().getDisplayMetrics().density);
                    }
                }
                linearLayout.addView(c1205640hTm);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public final void up(PoiWorldCupScheduleModule poiWorldCupScheduleModule) {
        TuxTextView tuxTextView;
        C1195630hDd c1195630hDd;
        C1195720hDm c1195720hDm;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i;
        int iIntValue;
        super.up(poiWorldCupScheduleModule);
        View view = this.LLJL;
        if (view == null || (tuxTextView = this.LLJLIL) == null || (c1195630hDd = this.LLJLILLLLZIIL) == null || (c1195720hDm = this.LLJLL) == null) {
            return;
        }
        List<WorldCupDateMatchGroup> matchList = poiWorldCupScheduleModule.getMatchList();
        if (matchList == null) {
            matchList = C13BV.INSTANCE;
        }
        C717620SCy c717620SCyLLIIL = C13LP.LLIIL(matchList);
        final ArrayList arrayList = new ArrayList();
        Iterator it2 = c717620SCyLLIIL.iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                break;
            }
            Object next = c717610SCx.next();
            List<WorldCupMatch> list = ((WorldCupDateMatchGroup) ((IndexedValue) next).LIZIZ).matches;
            if (list != null && !list.isEmpty()) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        List<WorldCupDateMatchGroup> matchList2 = poiWorldCupScheduleModule.getMatchList();
        if (matchList2 != null) {
            iHashCode = matchList2.hashCode();
        } else {
            iHashCode = 0;
        }
        int i2 = iHashCode * 31;
        Integer dateDisplayIndex = poiWorldCupScheduleModule.getDateDisplayIndex();
        if (dateDisplayIndex != null) {
            iHashCode2 = dateDisplayIndex.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i3 = (i2 + iHashCode2) * 31;
        String viewAllSchema = poiWorldCupScheduleModule.getViewAllSchema();
        if (viewAllSchema != null) {
            iHashCode3 = viewAllSchema.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i4 = i3 + iHashCode3;
        Integer num = this.LLJZ;
        if (num == null || num.intValue() != i4) {
            this.LLJZ = Integer.valueOf(i4);
            this.LLJZIJLIL = null;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((IndexedValue) it3.next()).LIZIZ);
        }
        this.LLJLLL = arrayList2;
        tuxTextView.setText(2131858555);
        c1195720hDm.setOnSelectedChangeListener(null);
        List<WorldCupDateMatchGroup> list2 = this.LLJLLL;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<WorldCupDateMatchGroup> it4 = list2.iterator();
        while (it4.hasNext()) {
            String str = it4.next().dateDisplay;
            if (str == null) {
                str = "";
            }
            arrayList3.add(new C789130UxT(str, 6));
        }
        c1195720hDm.setChips(arrayList3);
        Iterator it5 = arrayList.iterator();
        int i5 = 0;
        while (true) {
            i = -1;
            if (it5.hasNext()) {
                int i6 = ((IndexedValue) it5.next()).LIZ;
                Integer dateDisplayIndex2 = poiWorldCupScheduleModule.getDateDisplayIndex();
                if (dateDisplayIndex2 != null && i6 == dateDisplayIndex2.intValue()) {
                    break;
                } else {
                    i5++;
                }
            } else {
                i5 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i5);
        if (numValueOf.intValue() >= 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num2 = this.LLJZIJLIL;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Iterator it6 = arrayList.iterator();
            int i7 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((IndexedValue) it6.next()).LIZ == iIntValue2) {
                    i = i7;
                    break;
                }
                i7++;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            if (numValueOf2.intValue() >= 0) {
                iIntValue = numValueOf2.intValue();
            }
        }
        C1195820hDw c1195820hDw = new AbstractC1195770hDr() { // from class: X.0hDw
        };
        C1195710hDl c1195710hDl = c1195720hDm.LL;
        if (iIntValue >= 0 && iIntValue < c1195710hDl.LLILLJJLI.size()) {
            AbstractC1195750hDp abstractC1195750hDp = c1195710hDl.LLILZ;
            if (abstractC1195750hDp instanceof C1195810hDv) {
                c1195710hDl.LLLIIIIL(iIntValue, c1195820hDw, false);
            } else if (abstractC1195750hDp instanceof C1195800hDu) {
                c1195710hDl.LLLII(iIntValue, true, c1195820hDw, false);
            } else {
                throw new C1954807lC();
            }
            List<WorldCupMatch> list3 = ((WorldCupDateMatchGroup) ListProtector.get(this.LLJLLL, iIntValue)).matches;
            if (list3 == null) {
                list3 = C13BV.INSTANCE;
            }
            sp(list3);
            c1195720hDm.setOnSelectedChangeListener(new InterfaceC1195790hDt() { // from class: X.0hDn
                @Override // X.InterfaceC1195790hDt
                public final void LIZ(int i8, AbstractC1195770hDr abstractC1195770hDr, boolean z) {
                    List<WorldCupMatch> list4;
                    if (z) {
                        PoiWorldCupScheduleAssem poiWorldCupScheduleAssem = this.LIZ;
                        IndexedValue indexedValue = (IndexedValue) C13LP.LJJJLZIJ(i8, arrayList);
                        Integer numValueOf3 = null;
                        if (indexedValue != null) {
                            numValueOf3 = Integer.valueOf(indexedValue.LIZ);
                        }
                        poiWorldCupScheduleAssem.LLJZIJLIL = numValueOf3;
                        if (abstractC1195770hDr instanceof C1195840hDy) {
                            this.LIZ.yp("click_filter_tab");
                        }
                        PoiWorldCupScheduleAssem poiWorldCupScheduleAssem2 = this.LIZ;
                        WorldCupDateMatchGroup worldCupDateMatchGroup = (WorldCupDateMatchGroup) C13LP.LJJJLZIJ(i8, poiWorldCupScheduleAssem2.LLJLLL);
                        if (worldCupDateMatchGroup == null || (list4 = worldCupDateMatchGroup.matches) == null) {
                            list4 = C13BV.INSTANCE;
                        }
                        poiWorldCupScheduleAssem2.sp(list4);
                    }
                }
            });
            String viewAllSchema2 = poiWorldCupScheduleModule.getViewAllSchema();
            if (viewAllSchema2 != null && !a0.LJJJIL(viewAllSchema2)) {
                int visibility = c1195630hDd.getVisibility();
                c1195630hDd.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1195630hDd);
                C0V0N c0v0n = new C0V0N(c1195630hDd.getContext().getString(2131858554));
                c1195630hDd.setTrackParams(this.LLL);
                c1195630hDd.LIZ(c0v0n);
                AwS167S1100000_18 awS167S1100000_18 = new AwS167S1100000_18(this, viewAllSchema2, 10);
                C786410Ut5.I7(new AkS87S0100000_18(awS167S1100000_18, 42), c1195630hDd);
                C786410Ut5.I7(new AkS87S0100000_18(awS167S1100000_18, 43), view);
                return;
            }
            int visibility2 = c1195630hDd.getVisibility();
            c1195630hDd.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c1195630hDd);
            C786410Ut5.Ha(c1195630hDd);
            C786410Ut5.I7(null, view);
            view.setClickable(false);
            return;
        }
        c1195710hDl.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No chip at position ");
        sbLIZ.append(iIntValue);
        sbLIZ.append('.');
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void yp(String str) {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_method", str);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(view));
        c1185040gwY.getClass();
        C1185040gwY.LIZJ("ttls_poi_worldcup_matches_click", jSONObject, c1185050gwZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void up(String str, String str2) {
        Context context;
        String str3;
        C1185600gxS c1185600gxS;
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null && (context = view.getContext()) != null) {
            C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
            if (c1173300gdcLJ == null || (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) == null || (str3 = c1185600gxS.LIZ) == null) {
                str3 = "";
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
            smartRouteBuildRoute.withParam("poi_id", str3);
            smartRouteBuildRoute.withParam("enter_from", "poi_detail");
            smartRouteBuildRoute.withParam("enter_method", str2);
            smartRouteBuildRoute.open();
        }
    }
}
