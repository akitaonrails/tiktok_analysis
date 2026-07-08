package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixedcreativecard;

import X.C01GW;
import X.C09R3;
import X.C0PLF;
import X.C0QSJ;
import X.C0R45;
import X.C1010120cOQ;
import X.C13LE;
import X.C1558520qew;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C655390PnF;
import X.C655610Pnb;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.C724270Sb3;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC435460H5s;
import X.InterfaceC652300PiG;
import X.InterfaceC652810Pj5;
import X.InterfaceC656040PoI;
import X.InterfaceC657240PqE;
import X.InterfaceC657510Pqf;
import X.InterfaceC660150Puv;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdMixedCreativeCardAssem extends ReusedUISlotAssem<SearchAdMixedCreativeCardAssem> implements InterfaceC712990Rxx<C0PLF>, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 691));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 686));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 689));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 685));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 687));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 690));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 688));
    public Aweme LLJZIJLIL;
    public InterfaceC656040PoI LLL;
    public int LLLF;
    public boolean LLLFF;
    public volatile InterfaceC652300PiG LLLFFI;
    public volatile InterfaceC652810Pj5 LLLFZ;
    public InterfaceC652300PiG LLLI;
    public InterfaceC652810Pj5 LLLII;
    public List<InterfaceC687730QyJ> LLLIIII;
    public InterfaceC665370Q7z LLLIIIIL;
    public C0QSJ LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchAdMixedCreativeCardAssem.class, "searchHorizontalListAbility", "getSearchHorizontalListAbility()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/horizontallist/ability/SearchHorizontalListAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchAdMixedCreativeCardAssem.class, "searchScrollToOpenAbility", "getSearchScrollToOpenAbility()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/horizontallist/ability/SearchScrollToOpenAbility;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.est;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            this.LLLI = (InterfaceC652300PiG) obj;
        } else if (cls == InterfaceC652810Pj5.class) {
            this.LLLII = (InterfaceC652810Pj5) obj;
            C687700QyG.LJFF(this, this.LLLIIII, obj, cls);
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchHorizontalListScope.class, SearchHorizontalListScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            return this.LLLI;
        }
        if (cls == InterfaceC652810Pj5.class) {
            return this.LLLII;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchHorizontalListScope.class);
        arrayList.add(SearchHorizontalListScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchHorizontalListScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC652300PiG.class) {
            this.LLLI = null;
        } else if (cls == InterfaceC652810Pj5.class) {
            this.LLLII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLLIIII;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC656040PoI interfaceC656040PoI = this.LLL;
        if (interfaceC656040PoI != null) {
            interfaceC656040PoI.onDestroy();
        }
        this.LLL = null;
    }

    public final C0QSJ op() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLIIIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIIIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLIIIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{SearchHorizontalListScope.class});
        this.LLLIIIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final TuxTextView sp() {
        return (TuxTextView) this.LLJLIL.getValue();
    }

    public final InterfaceC652300PiG tp() {
        InterfaceC652300PiG interfaceC652300PiG;
        InterfaceC652300PiG interfaceC652300PiG2 = this.LLLFFI;
        if (interfaceC652300PiG2 == null) {
            synchronized (this) {
                interfaceC652300PiG2 = this.LLLFFI;
                if (interfaceC652300PiG2 == null) {
                    C0QSJ c0qsjOp = op();
                    if (c0qsjOp != null) {
                        interfaceC652300PiG = (InterfaceC652300PiG) c0qsjOp.getAbility(InterfaceC652300PiG.class);
                        C687700QyG.LJ(interfaceC652300PiG, InterfaceC652300PiG.class);
                    } else {
                        interfaceC652300PiG = null;
                    }
                    this.LLLFFI = interfaceC652300PiG;
                    return interfaceC652300PiG;
                }
            }
        }
        return interfaceC652300PiG2;
    }

    public final InterfaceC652810Pj5 up() {
        InterfaceC652810Pj5 interfaceC652810Pj5;
        InterfaceC652810Pj5 interfaceC652810Pj52 = this.LLLFZ;
        if (interfaceC652810Pj52 == null) {
            synchronized (this) {
                interfaceC652810Pj52 = this.LLLFZ;
                if (interfaceC652810Pj52 == null) {
                    C0QSJ c0qsjOp = op();
                    if (c0qsjOp != null) {
                        interfaceC652810Pj5 = (InterfaceC652810Pj5) c0qsjOp.getAbility(InterfaceC652810Pj5.class);
                        C687700QyG.LJ(interfaceC652810Pj5, InterfaceC652810Pj5.class);
                    } else {
                        interfaceC652810Pj5 = null;
                    }
                    this.LLLFZ = interfaceC652810Pj5;
                    return interfaceC652810Pj5;
                }
            }
        }
        return interfaceC652810Pj52;
    }

    public SearchAdMixedCreativeCardAssem(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, this, 50));
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0R45(this, 18));
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLLIIII == null) {
            this.LLLIIII = new ArrayList();
        }
        ((ArrayList) this.LLLIIII).add(interfaceC687730QyJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x036e  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r5v10, types: [X.0Pnq] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [X.0PoD] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.0PiG] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0PLF r14) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixedcreativecard.SearchAdMixedCreativeCardAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0PLF c0plf) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0PLF c0plf) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final InterfaceC660150Puv yp(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        Aweme aweme;
        InterfaceC435460H5s interfaceC435460H5s;
        AwemeRawAd awemeRawAd;
        Object obj;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
        InterfaceC660150Puv interfaceC660150PuvLJIJ = null;
        if ((interfaceC1891350zJl instanceof InterfaceC657240PqE) && (interfaceC435460H5s = (InterfaceC435460H5s) interfaceC1891350zJl) != null) {
            aweme = interfaceC435460H5s.getAweme();
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1010120cOQ.LJIIZILJ(awemeRawAd)) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                String strLIZJ = C655390PnF.LIZJ(i, ((C0PLF) obj).LLILZLL);
                C655610Pnb c655610Pnb = C655610Pnb.LIZIZ;
                if (c655610Pnb != null && (interfaceC657510PqfLIZLLL = c655610Pnb.LIZLLL()) != null) {
                    interfaceC660150PuvLJIJ = interfaceC657510PqfLIZLLL.LJJII(strLIZJ);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[getSubModule] index=");
            sbLIZ.append(i);
            sbLIZ.append(", module=");
            sbLIZ.append(interfaceC660150PuvLJIJ);
            C2188811AlT.LIZIZ(sbLIZ);
            return interfaceC660150PuvLJIJ;
        }
        aweme = null;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL2 = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL2 != null) {
            interfaceC660150PuvLJIJ = interfaceC657510PqfLIZLLL2.LJIJ(aweme);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[getSubModule] index=");
        sbLIZ2.append(i);
        sbLIZ2.append(", module=");
        sbLIZ2.append(interfaceC660150PuvLJIJ);
        C2188811AlT.LIZIZ(sbLIZ2);
        return interfaceC660150PuvLJIJ;
    }
}
