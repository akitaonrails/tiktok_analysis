package com.ss.android.ugc.aweme.slash.component.lynx.icon;

import X.AbstractC1539010q9T;
import X.C08CN;
import X.C1173980gei;
import X.C1174850gg7;
import X.C1180170goh;
import X.C1180530gpH;
import X.C1183030gtJ;
import X.C1187790h0z;
import X.C1187810h11;
import X.C1187820h12;
import X.C1192290h8F;
import X.C1209090hZL;
import X.C1209100hZM;
import X.C123100dR;
import X.C1541950qED;
import X.C1552050qUV;
import X.C1558360qeg;
import X.C2097608Jq;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1187770h0x;
import X.InterfaceC1174130gex;
import X.InterfaceC1181010gq3;
import X.InterfaceC1187750h0v;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent;
import com.ss.android.ugc.aweme.slash.component.lynx.icon.BaseLynxComponent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseLynxComponent<T extends C1180530gpH> extends BaseSlashSlotAssemComponent<T> {
    public InterfaceC1541990qEH LLJJI;
    public String LLJJIII;
    public boolean LLJJIJI;
    public long LLJJIJIL;
    public long LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public Boolean LLJJJJJIL;
    public final C1187810h11 LLJJIJIIJIL = new C1187810h11();
    public EnumC1187770h0x LLJJJJLIIL = EnumC1187770h0x.BEFORE_APPEAR;

    public final Map<String, Object> ip() {
        InterfaceC1187750h0v interfaceC1187750h0vQz;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null && (interfaceC1187750h0vQz = interfaceC1181010gq3LIZ.Qz()) != null) {
            String strLIZ = C1173980gei.LIZ(this);
            String str = this.LLJJJIL;
            String str2 = this.LLJJJJ;
            Boolean bool = this.LLJJJJJIL;
            C1180530gpH c1180530gpH = (C1180530gpH) C1174850gg7.LIZJ(this);
            Map<String, Object> mapLIZJ = interfaceC1187750h0vQz.LIZJ(strLIZ, new C1187790h0z(str, str2, bool, c1180530gpH != null ? c1180530gpH.getUrl() : null, this.LLJJJ, this.LLJJIJIL));
            if (mapLIZJ != null) {
                return mapLIZJ;
            }
        }
        return C2097608Jq.LJ();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Fragment fragmentS8;
        super.onCreate();
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null && (fragmentS8 = interfaceC1181010gq3LIZ.S8()) != null) {
            int i = C1187820h12.LIZ[fragmentS8.getLifecycle().getCurrentState().ordinal()];
            this.LLJJJJLIIL = (i == 1 || i == 2) ? EnumC1187770h0x.APPEAR : i != 3 ? EnumC1187770h0x.DESTROY : EnumC1187770h0x.DISAPPEAR;
            fragmentS8.getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: com.ss.android.ugc.aweme.slash.component.lynx.icon.BaseLynxComponent$setupLynxLifecycle$1
                public final /* synthetic */ BaseLynxComponent<C1180530gpH> LL;

                {
                    this.LL = this;
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    int i2 = C08CN.LIZ[event.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                this.LL.LLJJJJLIIL = EnumC1187770h0x.DESTROY;
                                C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(584));
                                return;
                            }
                            return;
                        }
                        BaseLynxComponent<C1180530gpH> baseLynxComponent = this.LL;
                        baseLynxComponent.LLJJJJLIIL = EnumC1187770h0x.DISAPPEAR;
                        InterfaceC1541990qEH interfaceC1541990qEH = baseLynxComponent.LLJJI;
                        if (interfaceC1541990qEH != null) {
                            interfaceC1541990qEH.onHide();
                        }
                        C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(583));
                        return;
                    }
                    BaseLynxComponent<C1180530gpH> baseLynxComponent2 = this.LL;
                    baseLynxComponent2.LLJJJJLIIL = EnumC1187770h0x.APPEAR;
                    InterfaceC1541990qEH interfaceC1541990qEH2 = baseLynxComponent2.LLJJI;
                    if (interfaceC1541990qEH2 != null) {
                        interfaceC1541990qEH2.onShow();
                    }
                    C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(582));
                }
            });
        }
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ2 != null) {
            interfaceC1181010gq3LIZ2.Wd2(new InterfaceC1174130gex(this) { // from class: X.0h0y
                public final /* synthetic */ BaseLynxComponent<C1180530gpH> LL;

                @Override // X.InterfaceC1174130gex
                public final void LIZLLL(List<C1174050gep> list) {
                }

                {
                    this.LL = this;
                }

                @Override // X.InterfaceC1174130gex
                public final void LJJJJJ(int i2) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.LL.JG1("slash_body_begin_scroll", null);
                            C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(592));
                            return;
                        }
                        return;
                    }
                    this.LL.JG1("slash_body_end_scroll", null);
                    C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(593));
                }
            });
        }
    }

    public static Map kp(C1180530gpH c1180530gpH) {
        Pair[] pairArr = new Pair[1];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c1180530gpH.updateType;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("update_type", str);
        pairArr[0] = new Pair("slash_extra_info", linkedHashMap);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(mapLJIIJ, (Map<String, Object>) 2243));
        return mapLJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        String channel;
        InterfaceC1187750h0v interfaceC1187750h0vQz;
        InterfaceC1187750h0v interfaceC1187750h0vQz2;
        InterfaceC1541990qEH interfaceC1541990qEH;
        InterfaceC1187750h0v interfaceC1187750h0vQz3;
        final C1180530gpH c1180530gpH = (C1180530gpH) baseComponentData;
        super.CG1(c1180530gpH);
        C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(585));
        String bundle = null;
        if (this.LLJJI != null && this.LLJJIJI && Intrinsics.LJFF(this.LLJJIII, c1180530gpH.getUrl())) {
            InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
            if (interfaceC1181010gq3LIZ != null && (interfaceC1187750h0vQz3 = interfaceC1181010gq3LIZ.Qz()) != null) {
                interfaceC1187750h0vQz3.LIZLLL("update", c1180530gpH);
            }
            InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLJJI;
            if (interfaceC1541990qEH2 != null) {
                interfaceC1541990qEH2.U0(ip());
            }
            String businessData = c1180530gpH.getBusinessData();
            if (businessData != null && businessData.length() > 0 && (interfaceC1541990qEH = this.LLJJI) != null) {
                interfaceC1541990qEH.c1(businessData, kp(c1180530gpH));
                return;
            }
            return;
        }
        this.LLJJIJIIJIL.LIZ = Long.valueOf(System.currentTimeMillis());
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ2 != null && (interfaceC1187750h0vQz2 = interfaceC1181010gq3LIZ2.Qz()) != null) {
            interfaceC1187750h0vQz2.LIZLLL("init", c1180530gpH);
        }
        this.LLJJIII = c1180530gpH.getUrl();
        String url = c1180530gpH.getUrl();
        if (url == null) {
            return;
        }
        final String businessData2 = c1180530gpH.getBusinessData();
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.LLJJIJI = false;
        C786410Ut5.LJJJJI((ViewGroup) getContentView());
        this.LLJJJ = SystemClock.elapsedRealtime();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(url);
        SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        if (sparkSchemaParamLJJJI != null) {
            channel = sparkSchemaParamLJJJI.getChannel();
        } else {
            channel = null;
        }
        this.LLJJJIL = channel;
        if (sparkSchemaParamLJJJI != null) {
            bundle = sparkSchemaParamLJJJI.getBundle();
        }
        this.LLJJJJ = bundle;
        String str = this.LLJJJIL;
        if (C123100dR.LIZ(str) && str != null) {
            this.LLJJJJJIL = Boolean.valueOf(C1552050qUV.LJIIZILJ(str));
        }
        sparkContext.lifecycleOwner = this;
        sparkContext.LJJLIIIJILLIZJL(ip());
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            sparkContext.LJJ(Fragment.class, fragmentLJI);
        }
        sparkContext.LJJJJZ(new C1209090hZL(this, 2));
        sparkContext.LJJJJZI(new C1209100hZM(this, 7));
        sparkContext.LJJJJZ(new AbstractC1539010q9T(this) { // from class: X.0h0w
            public final /* synthetic */ BaseLynxComponent<C1180530gpH> LLILLJJLI;

            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1537910q7h c1537910q7h;
                Map mapKp;
                if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                    BaseLynxComponent<C1180530gpH> baseLynxComponent = this.LLILLJJLI;
                    TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(businessData2);
                    C1180530gpH c1180530gpH2 = c1180530gpH;
                    baseLynxComponent.getClass();
                    if (c1180530gpH2 != null && (mapKp = BaseLynxComponent.kp(c1180530gpH2)) != null) {
                        for (Map.Entry entry : mapKp.entrySet()) {
                            templateDataLJIIIIZZ.LJIILIIL((String) entry.getKey(), entry.getValue());
                        }
                    }
                    c1537910q7h.LJIJJ = templateDataLJIIIIZZ;
                }
            }

            {
                this.LLILLJJLI = this;
            }
        });
        this.LLJJIJIIJIL.LIZIZ = Long.valueOf(System.currentTimeMillis());
        C1541950qED.LIZJ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
        if (C1183030gtJ.LIZ().enableLcpTrack > 0) {
            C1558360qeg.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, "ttls_tracker").getTree().LJI();
            C1558360qeg.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, "ttls_tracker").getTree().LIZIZ(this);
        }
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ3 = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ3 != null && (interfaceC1187750h0vQz = interfaceC1181010gq3LIZ3.Qz()) != null) {
            interfaceC1187750h0vQz.LJ(c1180530gpH, new C1187790h0z(this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, c1180530gpH.getUrl(), this.LLJJJ, this.LLJJIJIL));
        }
        this.LLJJIJIL = SystemClock.elapsedRealtime();
        this.LLJJIJIIJIL.LIZJ = Long.valueOf(System.currentTimeMillis());
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        ViewGroup viewGroup = (ViewGroup) getContentView();
        viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new ViewGroup.LayoutParams(-1, -1));
        viewGroup.invalidate();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(581));
        C1192290h8F.LIZ(this, String.valueOf(C1173980gei.LIZ(this)), C1173980gei.LIZ(this), false, null, null, 24);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18((BaseLynxComponent) this, 567));
    }

    public final void JG1(String str, JSONObject jSONObject) {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJI;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LIZ(str, jSONObject);
        }
        C1180170goh.LIZLLL().LIZ(new AwS167S1100000_18(str, jSONObject, 12));
    }
}
