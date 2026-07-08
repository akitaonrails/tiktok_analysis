package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C0CAU;
import X.C1157910gEn;
import X.C1175960ghu;
import X.C1175970ghv;
import X.C1178920gmg;
import X.C1178990gmn;
import X.C1179050gmt;
import X.C1180170goh;
import X.C1181030gq5;
import X.C1186840gzS;
import X.C123100dR;
import X.C1558520qew;
import X.C1559260qg8;
import X.C20684815ws;
import X.C2211631BhB;
import X.C263580AUq;
import X.C418440Gaw;
import X.C426750GoL;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1173990gej;
import X.InterfaceC1181010gq3;
import X.InterfaceC332260D0u;
import X.InterfaceC665370Q7z;
import Y.ARunnableS118S0100000_18;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.slash.cell.arc.BaseSlashCellData;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class SlashCell<T extends BaseSlashCellData> extends UISlotAssem {
    public C1175960ghu LLJJI;
    public volatile T LLJJIII;
    public final Map<String, Object> LLJJIJI = new LinkedHashMap();

    public final String hp() {
        LifecycleOwner lifecycleOwnerLIZ = this;
        while (lifecycleOwnerLIZ != null && !(lifecycleOwnerLIZ instanceof InterfaceC1173990gej)) {
            lifecycleOwnerLIZ = C1178920gmg.LIZ(lifecycleOwnerLIZ);
        }
        InterfaceC1173990gej interfaceC1173990gej = (InterfaceC1173990gej) lifecycleOwnerLIZ;
        if (interfaceC1173990gej != null) {
            return interfaceC1173990gej.S2();
        }
        return null;
    }

    public final String ip() {
        SlashComposeComponentModel slashComposeComponentModel;
        LifecycleOwner lifecycleOwnerLIZ = this;
        while (lifecycleOwnerLIZ != null && !(lifecycleOwnerLIZ instanceof InterfaceC1173990gej)) {
            lifecycleOwnerLIZ = C1178920gmg.LIZ(lifecycleOwnerLIZ);
        }
        InterfaceC1173990gej interfaceC1173990gej = (InterfaceC1173990gej) lifecycleOwnerLIZ;
        BaseComponentData baseComponentDataB = interfaceC1173990gej != null ? interfaceC1173990gej.B() : null;
        if (!(baseComponentDataB instanceof SlashComposeComponentModel) || (slashComposeComponentModel = (SlashComposeComponentModel) baseComponentDataB) == null) {
            return null;
        }
        return slashComposeComponentModel.bizName;
    }

    public abstract void zp(SlashCellModel slashCellModel);

    public Padding Ap() {
        T t = this.LLJJIII;
        if (t != null) {
            return t.padding;
        }
        return null;
    }

    public final SlashCellModel lp() {
        InterfaceC332260D0u<SlashCellModel> interfaceC332260D0u;
        C1175960ghu c1175960ghu = this.LLJJI;
        if (c1175960ghu == null || (interfaceC332260D0u = c1175960ghu.LL) == null) {
            return null;
        }
        return interfaceC332260D0u.getValue();
    }

    public Map<String, String> mp() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strHp = hp();
        if (strHp == null) {
            strHp = "";
        }
        linkedHashMap.put("component_instance_id", strHp);
        return linkedHashMap;
    }

    public void Bp() {
        Padding paddingAp = Ap();
        if (paddingAp == null) {
            return;
        }
        if (C426750GoL.LIZLLL(getContentView().getContext())) {
            getContentView().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.right))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.top))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.left))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.bottom))));
        } else {
            getContentView().setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.left))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.top))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.right))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(paddingAp.bottom))));
        }
    }

    public final String kp() {
        SlashCellModel slashCellModelLp = lp();
        if (slashCellModelLp != null) {
            return slashCellModelLp.cellId;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        String strLIZJ = C1175970ghv.LIZJ(str);
        C1180170goh.LIZLLL().LIZ(new AwS167S1100000_18((SlashCell) this, strLIZJ, (String) 11));
        this.LLJJI = (C1175960ghu) new C1559260qg8(new C723580SZw(this, C1175960ghu.class, strLIZJ), checkSupervisorPrepared()).getValue();
    }

    public final boolean sp() {
        List<SlashCommonEvent> list;
        SlashCellModel slashCellModelLp = lp();
        if (slashCellModelLp == null || (list = slashCellModelLp.events) == null) {
            return false;
        }
        Iterator<SlashCommonEvent> it2 = list.iterator();
        while (it2.hasNext()) {
            SlashCommonEvent next = it2.next();
            String str = next.name;
            T t = this.LLJJIII;
            if (Intrinsics.LJFF(str, t != null ? t.clickEvent : null)) {
                return next != null;
            }
        }
        return false;
    }

    public static RecyclerView tp(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof RecyclerView)) {
            parent = parent.getParent();
        }
        if (parent instanceof RecyclerView) {
            return (RecyclerView) parent;
        }
        return null;
    }

    public final SlashTrackConfig Ep(String str) {
        List<SlashTrackConfig> list;
        SlashCellModel slashCellModelLp = lp();
        SlashTrackConfig slashTrackConfig = null;
        if (slashCellModelLp == null || (list = slashCellModelLp.trackConfig) == null) {
            return null;
        }
        Iterator<SlashTrackConfig> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SlashTrackConfig next = it2.next();
            if (Intrinsics.LJFF(next.trackName, str)) {
                slashTrackConfig = next;
                break;
            }
        }
        return slashTrackConfig;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(final View view) {
        super.onViewCreated(view);
        if (view.isAttachedToWindow()) {
            RecyclerView recyclerViewTp = tp(view);
            if (recyclerViewTp != null) {
                C1180170goh.LIZLLL().LIZ(new AwS547S0100000_3(recyclerViewTp, 12));
                view.setTag(R.id.yh8, Integer.valueOf(recyclerViewTp.hashCode()));
            }
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0gmm
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    SlashCell slashCell = this;
                    View view3 = view;
                    slashCell.getClass();
                    RecyclerView recyclerViewTp2 = SlashCell.tp(view3);
                    if (recyclerViewTp2 != null) {
                        C1180170goh.LIZLLL().LIZ(new AwS547S0100000_3(recyclerViewTp2, 12));
                        view.setTag(R.id.yh8, Integer.valueOf(recyclerViewTp2.hashCode()));
                    }
                }
            });
        }
        C2211631BhB.LJ(view, new AwS384S0200000_18((SlashCell) this, (SlashCell<BaseSlashCellData>) view, (View) 17));
        C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS118S0100000_18(this, 48));
    }

    public final void op(SlashCommonAction slashCommonAction) {
        String str;
        Map map;
        Map<String, Object> map2 = slashCommonAction.params;
        Object obj = null;
        if (map2 != null) {
            obj = map2.get("track_name");
        }
        if ((obj instanceof String) && (str = (String) obj) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(mp());
            Object obj2 = slashCommonAction.params.get("params");
            if ((obj2 instanceof Map) && (map = (Map) obj2) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            C1179050gmt c1179050gmt = C1179050gmt.LIZ;
            InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
            InterfaceC1173990gej<?> interfaceC1173990gejLIZ = C1178990gmn.LIZ(this);
            c1179050gmt.getClass();
            C1181030gq5.LIZIZ(interfaceC1173990gejLIZ, interfaceC1181010gq3LIZIZ, str, linkedHashMap);
        }
    }

    public final void up(SlashTrackConfig slashTrackConfig) {
        String str;
        if (slashTrackConfig != null && (str = slashTrackConfig.eventName) != null && str.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(mp());
            Map<String, String> map = slashTrackConfig.params;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (((Number) C263580AUq.LIZ.getValue()).intValue() >= 1) {
                C1179050gmt c1179050gmt = C1179050gmt.LIZ;
                String str2 = slashTrackConfig.eventName;
                InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
                InterfaceC1173990gej<?> interfaceC1173990gejLIZ = C1178990gmn.LIZ(this);
                c1179050gmt.getClass();
                C1181030gq5.LIZIZ(interfaceC1173990gejLIZ, interfaceC1181010gq3LIZIZ, str2, linkedHashMap);
                return;
            }
            C1179050gmt c1179050gmt2 = C1179050gmt.LIZ;
            String str3 = slashTrackConfig.eventName;
            InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ2 = C1178990gmn.LIZIZ(this);
            c1179050gmt2.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Map<String, String> mapLIZIZ = C1181030gq5.LIZ(interfaceC1181010gq3LIZIZ2).LIZIZ(interfaceC665370Q7zLJIIL);
            if (mapLIZIZ != null) {
                linkedHashMap2.putAll(mapLIZIZ);
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (C123100dR.LIZ((String) entry2.getValue())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            C20684815ws.LJIILLIIL(str3, linkedHashMap2);
        }
    }

    public void yp(View view) {
        String str;
        List<SlashCommonEvent> list;
        Object obj;
        List<SlashCommonAction> list2;
        C1186840gzS c1186840gzSLw1;
        if (sp()) {
            SlashCellModel slashCellModelLp = lp();
            if (slashCellModelLp != null && (list = slashCellModelLp.events) != null) {
                Iterator<SlashCommonEvent> it2 = list.iterator();
                while (true) {
                    obj = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    SlashCommonEvent next = it2.next();
                    String str2 = next.name;
                    T t = this.LLJJIII;
                    if (t != null) {
                        obj = t.clickEvent;
                    }
                    if (Intrinsics.LJFF(str2, obj)) {
                        obj = next;
                        break;
                    }
                }
                SlashCommonEvent slashCommonEvent = (SlashCommonEvent) obj;
                if (slashCommonEvent != null && (list2 = slashCommonEvent.actions) != null) {
                    for (SlashCommonAction slashCommonAction : list2) {
                        if (slashCommonAction.isTrackEvent()) {
                            op(slashCommonAction);
                        } else {
                            InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ(this);
                            if (interfaceC1181010gq3LIZIZ != null && (c1186840gzSLw1 = interfaceC1181010gq3LIZIZ.lw1()) != null) {
                                String strIp = ip();
                                if (strIp == null) {
                                    strIp = "";
                                }
                                c1186840gzSLw1.LIZ(C1157910gEn.LIZ(slashCommonAction, view, strIp));
                            }
                        }
                    }
                }
            }
        } else {
            SlashTrackConfig slashTrackConfigEp = Ep("cell_click");
            if (slashTrackConfigEp != null && (str = slashTrackConfigEp.eventName) != null && str.length() != 0) {
                up(slashTrackConfigEp);
            } else {
                return;
            }
        }
        SlashCellModel slashCellModelLp2 = lp();
        if (slashCellModelLp2 != null) {
            slashCellModelLp2.LLILLL.invoke(view);
        }
    }
}
