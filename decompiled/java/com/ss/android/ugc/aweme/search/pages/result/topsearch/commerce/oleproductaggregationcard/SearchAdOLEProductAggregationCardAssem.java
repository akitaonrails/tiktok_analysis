package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.oleproductaggregationcard;

import X.C01GW;
import X.C0PLM;
import X.C0QSJ;
import X.C0R45;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C452501pT;
import X.C655610Pnb;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC435460H5s;
import X.InterfaceC656110PoP;
import X.InterfaceC656120PoQ;
import X.InterfaceC657240PqE;
import X.InterfaceC657510Pqf;
import X.InterfaceC660150Puv;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.communication.SearchGridScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdOLEProductAggregationCardAssem extends ReusedUISlotAssem<SearchAdOLEProductAggregationCardAssem> implements InterfaceC712990Rxx<C0PLM>, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 696));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 695));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 697));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 694));
    public Aweme LLJLL;
    public InterfaceC656120PoQ LLJLLIL;
    public volatile InterfaceC656110PoP LLJLLL;
    public InterfaceC656110PoP LLJZ;
    public InterfaceC665370Q7z LLJZIJLIL;
    public C0QSJ LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchAdOLEProductAggregationCardAssem.class, "searchGridAbility", "getSearchGridAbility()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/grid/ability/SearchGridAbility;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.esu;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC656110PoP.class) {
            this.LLJZ = (InterfaceC656110PoP) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchGridScope.class, SearchGridScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC656110PoP.class) {
            return this.LLJZ;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchGridScope.class);
        arrayList.add(SearchGridScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchGridScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final InterfaceC656110PoP tp() {
        InterfaceC656110PoP interfaceC656110PoP = this.LLJLLL;
        if (interfaceC656110PoP == null) {
            synchronized (this) {
                interfaceC656110PoP = this.LLJLLL;
                if (interfaceC656110PoP == null) {
                    InterfaceC656110PoP interfaceC656110PoPOp = op();
                    this.LLJLLL = interfaceC656110PoPOp;
                    return interfaceC656110PoPOp;
                }
            }
        }
        return interfaceC656110PoP;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC656110PoP.class) {
            this.LLJZ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC656120PoQ interfaceC656120PoQ = this.LLJLLIL;
        if (interfaceC656120PoQ != null) {
            interfaceC656120PoQ.onDestroy();
        }
        this.LLJLLIL = null;
    }

    public final InterfaceC656110PoP op() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJZIJLIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJZIJLIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{SearchGridScope.class});
            this.LLL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC656110PoP interfaceC656110PoP = (InterfaceC656110PoP) c0qsjLIZLLL.getAbility(InterfaceC656110PoP.class);
        C687700QyG.LJ(interfaceC656110PoP, InterfaceC656110PoP.class);
        return interfaceC656110PoP;
    }

    public static Integer sp(Integer num) {
        if (num != null) {
            if (num.intValue() == 6) {
                return Integer.valueOf(R.attr.a1q);
            }
            if (num.intValue() == 8) {
                return Integer.valueOf(R.attr.g5);
            }
            return null;
        }
        return null;
    }

    public static InterfaceC660150Puv up(InterfaceC1891350zJl interfaceC1891350zJl) {
        Aweme aweme;
        InterfaceC435460H5s interfaceC435460H5s;
        if ((interfaceC1891350zJl instanceof InterfaceC657240PqE) && (interfaceC435460H5s = (InterfaceC435460H5s) interfaceC1891350zJl) != null) {
            aweme = interfaceC435460H5s.getAweme();
        } else {
            aweme = null;
        }
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL == null) {
            return null;
        }
        return interfaceC657510PqfLIZLLL.LJIJ(aweme);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, this, 52));
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0R45(this, 19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0PoO] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0PLM r22) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.oleproductaggregationcard.SearchAdOLEProductAggregationCardAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0PLM c0plm) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0PLM c0plm) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
