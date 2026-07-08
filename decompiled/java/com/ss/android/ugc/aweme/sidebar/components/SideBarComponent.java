package com.ss.android.ugc.aweme.sidebar.components;

import X.AbstractC738140SxQ;
import X.C0SZ5;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1580540rES;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1580560rEU;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.metric.IDeviceInfoService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public abstract class SideBarComponent<T extends InterfaceC1580560rEU> extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final Map<String, Object> LLJJI = new LinkedHashMap();
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SideBarComponent.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/sidebar/components/SideBarComponentVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void sp(T t, List<? extends InterfaceC1580560rEU> list) {
    }

    public void tp(View view, T t) {
    }

    public final Map<String, String> kp() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", lp("enter_from"));
        linkedHashMap.put("enter_method", lp("enter_method"));
        InterfaceC1580560rEU interfaceC1580560rEUIp = ip();
        linkedHashMap.put("component_field", interfaceC1580560rEUIp != null ? interfaceC1580560rEUIp.getId() : null);
        linkedHashMap.put("entrance_id", lp("entrance_id"));
        return linkedHashMap;
    }

    public final SideBarComponentVM mp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (SideBarComponentVM) assemVMLazy.getValue();
    }

    public SideBarComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SideBarComponentVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1127);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(382);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 1128), aFwS264S0000000_24, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIII = assemVMLazy;
    }

    public final T ip() {
        T t = (T) mp().getState().LL.LIZIZ;
        if (t instanceof InterfaceC1580560rEU) {
            return t;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        ((LinkedHashMap) this.LLJJI).clear();
    }

    public final <T> T lp(String str) {
        T t = (T) ((LinkedHashMap) this.LLJJI).get(str);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0rEV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1156300gCC) obj).LL;
            }
        }, null, new AwS638S0100000_24((SideBarComponent) this, 94), 6);
    }

    public final void hp(String str, Map<String, Object> map) {
        String string;
        Map<String, String> mapKp = kp();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) mapKp).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Object> entry2 : map.entrySet()) {
            String key = entry2.getKey();
            Object value = entry2.getValue();
            if (value != null) {
                string = value.toString();
            } else {
                string = null;
            }
            linkedHashMap.put(key, string);
        }
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }

    public void op(int i, InterfaceC1580560rEU interfaceC1580560rEU) {
        ViewGroup viewGroup;
        AbstractC738140SxQ abstractC738140SxQ;
        View viewLJJIJL;
        int iIntValue;
        int childCount;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        UIAssem uIAssem;
        AbstractC738140SxQ next;
        List<AbstractC738140SxQ> children = getChildren();
        String id = interfaceC1580560rEU.getId();
        View contentView = getContentView();
        View childAt = null;
        if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null) {
            if (children != null) {
                Iterator<AbstractC738140SxQ> it2 = children.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.assemTagInternal, id)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                abstractC738140SxQ = next;
            } else {
                abstractC738140SxQ = null;
            }
            if ((abstractC738140SxQ instanceof UIAssem) && (uIAssem = (UIAssem) abstractC738140SxQ) != null) {
                viewLJJIJL = uIAssem.LJJIJL();
            } else {
                viewLJJIJL = null;
            }
            Integer numValueOf = Integer.valueOf(viewGroup.indexOfChild(viewLJJIJL));
            if (numValueOf != null && (iIntValue = numValueOf.intValue()) >= 0) {
                View contentView2 = getContentView();
                if ((contentView2 instanceof ViewGroup) && (viewGroup5 = (ViewGroup) contentView2) != null) {
                    childAt = viewGroup5.getChildAt(iIntValue);
                }
                if (numValueOf == null || numValueOf.intValue() != i) {
                    View contentView3 = getContentView();
                    if ((contentView3 instanceof ViewGroup) && (viewGroup4 = (ViewGroup) contentView3) != null) {
                        C786410Ut5.LJJLIL(iIntValue, viewGroup4);
                    }
                    View contentView4 = getContentView();
                    if ((contentView4 instanceof ViewGroup) && (viewGroup3 = (ViewGroup) contentView4) != null) {
                        childCount = viewGroup3.getChildCount();
                    } else {
                        childCount = 0;
                    }
                    int iMin = Math.min(i, childCount);
                    View contentView5 = getContentView();
                    if ((contentView5 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) contentView5) != null) {
                        viewGroup2.addView(childAt, iMin);
                    }
                }
            }
        }
    }

    public void up(SideBarComponent<?> sideBarComponent, InterfaceC1580560rEU interfaceC1580560rEU) {
        int iLIZ;
        IDeviceInfoService iDeviceInfoService = (IDeviceInfoService) PluggableExtentionKt.pluggableSpi$default(IDeviceInfoService.class, false, false, false, 14, null);
        if (iDeviceInfoService != null) {
            iLIZ = iDeviceInfoService.LIZ();
        } else {
            iLIZ = 0;
        }
        boolean z = true;
        if ((iLIZ >> 1) != 1) {
            z = false;
        }
        sideBarComponent.zp(Boolean.valueOf(z), "is_small_screen", false);
        sideBarComponent.zp(ip(), "parent_config", false);
        sideBarComponent.zp(lp("enter_from"), "enter_from", false);
        sideBarComponent.zp(lp("enter_method"), "enter_method", false);
        sideBarComponent.zp(lp("entrance_id"), "entrance_id", false);
    }

    public final void yp(Assembler assembler, InterfaceC1580560rEU interfaceC1580560rEU, Function1<? super C0SZ5, Unit> function1) {
        String type;
        C13IQ c13iq;
        if (interfaceC1580560rEU != null && (type = interfaceC1580560rEU.getType()) != null && (c13iq = (C13IQ) ((Map) C1580540rES.LIZ.getValue()).get(type)) != null) {
            assembler.RQ2(this, new AwS233S0300000_24(c13iq, (C13IQ<? extends UISlotAssem>) interfaceC1580560rEU, (InterfaceC1580560rEU) function1, (Function1<? super C0SZ5, Unit>) 8));
        }
    }

    public void zp(Object obj, String str, boolean z) {
        SideBarComponent sideBarComponent;
        this.LLJJI.put(str, obj);
        if (z) {
            List<AbstractC738140SxQ> children = getChildren();
            if (children == null) {
                children = C13BV.INSTANCE;
            }
            for (AbstractC738140SxQ abstractC738140SxQ : children) {
                if ((abstractC738140SxQ instanceof SideBarComponent) && (sideBarComponent = (SideBarComponent) abstractC738140SxQ) != null) {
                    sideBarComponent.zp(obj, str, z);
                }
            }
        }
    }
}
