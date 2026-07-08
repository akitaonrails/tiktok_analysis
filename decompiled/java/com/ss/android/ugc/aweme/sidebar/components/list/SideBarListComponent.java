package com.ss.android.ugc.aweme.sidebar.components.list;

import X.AbstractC214823195h;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09R7;
import X.C0DXR;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1580600rEY;
import X.C1580610rEZ;
import X.C1580670rEf;
import X.C1580730rEl;
import X.C1580820rEu;
import X.C1723500ux2;
import X.C19719912Dl;
import X.C20600815jK;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C717610SCx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1580560rEU;
import X.InterfaceC1580740rEm;
import X.InterfaceC1594550rb3;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.sidebar.components.SideBarComponent;
import com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarListDataConverterProtocol;
import com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarListPowerCellProtocol;
import com.ss.android.ugc.aweme.sidebar.components.vm.SideBarListVM;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentUiData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarListComponent extends SideBarComponent<InterfaceC1580560rEU> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1138));
    public final AssemVMLazy LLJJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJJ;
    public boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SideBarListComponent.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/sidebar/components/vm/SideBarListVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cdv;
    }

    public final void Ap() {
        C20600815jK<InterfaceC1891350zJl> state;
        ViewGroup.LayoutParams layoutParams;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJ;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null || state.LJIIIIZZ() <= 0) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        } else {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (layoutParams = viewOnAttachStateChangeListenerC20604515jv2.getLayoutParams()) != null) {
                layoutParams.height = -2;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                viewOnAttachStateChangeListenerC20604515jv3.invalidateItemDecorations();
            }
        }
        Long l = (Long) lp("section_load_start_timestamp");
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue >= 0) {
                JSONObject jSONObjectPut = new JSONObject().put("duration", System.currentTimeMillis() - jLongValue);
                InterfaceC1580560rEU interfaceC1580560rEULp = lp("parent_config");
                C20684815ws.LJIJ("sidebar_card_load_time", jSONObjectPut.put("component_field", interfaceC1580560rEULp != null ? interfaceC1580560rEULp.getId() : null).put("result", 0).put("is_first_feed_show", lp("is_first_feed_show")).put("is_coldlaunch", lp("is_coldlaunch")));
            }
        }
    }

    public SideBarListComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SideBarListVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1139);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(384);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 1140), aFwS264S0000000_24, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIJIL = assemVMLazy;
        this.LLJJJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public final void tp(View view, InterfaceC1580560rEU interfaceC1580560rEU) {
        SideBarListComponentUiData sideBarListComponentUiData;
        final int i;
        final int i2;
        final int i3;
        C13BV arrayList;
        List<SideBarComponentUiData> list;
        ISideBarListDataConverterProtocol next;
        InterfaceC1580740rEm interfaceC1580740rEmFL0;
        String str;
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        n nVarLIZIZ;
        if (interfaceC1580560rEU != null && (nVarLIZIZ = interfaceC1580560rEU.LIZIZ()) != null) {
            sideBarListComponentUiData = (SideBarListComponentUiData) C1580820rEu.LIZ(nVarLIZIZ.toString(), SideBarListComponentUiData.class);
        } else {
            sideBarListComponentUiData = null;
        }
        C1580610rEZ c1580610rEZ = (C1580610rEZ) lp("list_config");
        if (c1580610rEZ != null) {
            i = c1580610rEZ.LIZ;
        } else {
            i = 1;
        }
        if (c1580610rEZ != null) {
            i2 = c1580610rEZ.LIZJ;
            i3 = c1580610rEZ.LIZIZ;
        } else {
            i2 = 0;
            i3 = 0;
        }
        C1580600rEY c1580600rEY = (C1580600rEY) lp("container_config");
        if (c1580600rEY != null) {
            c1580600rEY.LL.invoke(LJJIJL());
        }
        if (this.LLJJJIL) {
            this.LLJJJIL = false;
            if ((view instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view) != null) {
                this.LLJJJ = viewOnAttachStateChangeListenerC20604515jv;
                List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), ISideBarListPowerCellProtocol.class, false);
                if (listLIZIZ != null) {
                    for (ISideBarListPowerCellProtocol iSideBarListPowerCellProtocol : (ArrayList) listLIZIZ) {
                        viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(iSideBarListPowerCellProtocol.getContentType(), C09R7.LIZ(iSideBarListPowerCellProtocol.dB())));
                    }
                }
                viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
                viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i);
                gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.0rEe
                    @Override // X.AbstractC214823195h
                    public final int LJFF(int i4) {
                        C1580730rEl c1580730rEl;
                        T t;
                        if (i4 < 0) {
                            return 0;
                        }
                        Object obj = ListProtector.get(viewOnAttachStateChangeListenerC20604515jv.getListItems(), i4);
                        if ((obj instanceof C1580730rEl) && (c1580730rEl = (C1580730rEl) obj) != null && (t = c1580730rEl.LL) != 0) {
                            return t.LIZIZ(i);
                        }
                        return 1;
                    }
                };
                viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(gridLayoutManager);
                viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR(i2, i3) { // from class: X.0Goo
                    public final int LL;
                    public final int LLILLJJLI;
                    public final boolean LLILLL = false;

                    {
                        this.LL = i2;
                        this.LLILLJJLI = i3;
                    }

                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                        GridLayoutManager gridLayoutManager2;
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                        if (childAdapterPosition == -1) {
                            rect.set(0, 0, 0, 0);
                            return;
                        }
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager2 = (GridLayoutManager) layoutManager) != null) {
                            int i4 = gridLayoutManager2.LLILLJJLI;
                            int i5 = childAdapterPosition % i4;
                            boolean z = this.LLILLL;
                            if (z) {
                                int i6 = this.LL;
                                rect.left = i6 - ((i5 * i6) / i4);
                                rect.right = ((i5 + 1) * i6) / i4;
                            } else {
                                int i7 = this.LL;
                                rect.left = (i5 * i7) / i4;
                                rect.right = i7 - (((i5 + 1) * i7) / i4);
                            }
                            int i8 = this.LLILLJJLI;
                            if (z) {
                                if (childAdapterPosition < i4) {
                                    rect.top = i8;
                                }
                                rect.bottom = i8;
                            } else {
                                if (childAdapterPosition < i4) {
                                    return;
                                }
                                rect.top = i8;
                            }
                        }
                    }
                });
                AssemVMLazy assemVMLazy = this.LLJJIJIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
                C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0rEg
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1580690rEh) obj).LL;
                    }
                }, null, new AwS638S0100000_24(this, 97), 6);
            } else {
                return;
            }
        }
        AssemVMLazy assemVMLazy2 = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJJJ;
        AssemViewModel value = assemVMLazy2.getValue();
        C1580670rEf c1580670rEf = (C1580670rEf) this.LLJJIJIIJIL.getValue();
        if (c1580670rEf != null) {
            Map<String, Object> map = this.LLJJI;
            arrayList = new ArrayList();
            if (sideBarListComponentUiData != null && (list = sideBarListComponentUiData.itemList) != null) {
                Iterator it2 = C13LP.LLIIL(list).iterator();
                while (true) {
                    C717610SCx c717610SCx = (C717610SCx) it2;
                    if (!c717610SCx.hasNext()) {
                        break;
                    }
                    SideBarComponentUiData sideBarComponentUiData = (SideBarComponentUiData) ((IndexedValue) c717610SCx.next()).LIZIZ;
                    String str2 = sideBarComponentUiData.componentType;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Iterator<ISideBarListDataConverterProtocol> it3 = c1580670rEf.LIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(next.getComponentType(), str2)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ISideBarListDataConverterProtocol iSideBarListDataConverterProtocol = next;
                    if (iSideBarListDataConverterProtocol != null && (interfaceC1580740rEmFL0 = iSideBarListDataConverterProtocol.FL0(sideBarComponentUiData.componentUiData)) != null) {
                        C1580730rEl c1580730rEl = new C1580730rEl(interfaceC1580740rEmFL0);
                        c1580730rEl.LLILLJJLI = sideBarComponentUiData;
                        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            c1580730rEl.LLILLL.put((String) entry.getKey(), entry.getValue());
                        }
                        Object obj = linkedHashMap.get("current_path");
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append('_');
                        sbLIZ.append(sideBarComponentUiData.componentId);
                        c1580730rEl.LLILLL.put("current_path", C2188811AlT.LIZIZ(sbLIZ));
                        arrayList.add(c1580730rEl);
                    }
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        value.setState(new AwS603S0100000_24((List) arrayList, (List<? extends InterfaceC1594550rb3>) 542));
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.SideBarComponent
    public final void zp(Object obj, String str, boolean z) {
        List<InterfaceC1891350zJl> listLJII;
        C1580730rEl c1580730rEl;
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLJJI.put(str, obj);
        if (z) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                listLJII = state.LJII();
            } else {
                listLJII = C13BV.INSTANCE;
            }
            for (InterfaceC1891350zJl interfaceC1891350zJl : listLJII) {
                if ((interfaceC1891350zJl instanceof C1580730rEl) && (c1580730rEl = (C1580730rEl) interfaceC1891350zJl) != null) {
                    c1580730rEl.LLILLL.put(str, obj);
                }
            }
        }
    }
}
