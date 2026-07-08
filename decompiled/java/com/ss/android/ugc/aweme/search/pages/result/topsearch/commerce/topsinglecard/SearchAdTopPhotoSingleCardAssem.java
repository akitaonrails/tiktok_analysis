package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard;

import X.C01GW;
import X.C098200Yq;
import X.C0R45;
import X.C1558520qew;
import X.C189200o6;
import X.C452501pT;
import X.C640750PBh;
import X.C650630PfZ;
import X.C656300Poi;
import X.C657320PqM;
import X.C659080PtC;
import X.C723830SaL;
import X.InterfaceC1587906Jp;
import X.InterfaceC583720Muw;
import X.InterfaceC657570Pql;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdTopPhotoSingleCardAssem extends ReusedUISlotAssem<SearchAdTopVideoSingleCardAssem> implements InterfaceC712990Rxx<C656300Poi> {
    public InterfaceC657570Pql LLJZIJLIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 709));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 710));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 707));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 706));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 711));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 708));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(310));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 712));
    public final C01GW LLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(309));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.etb;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC657570Pql interfaceC657570Pql = this.LLJZIJLIL;
        if (interfaceC657570Pql != null) {
            interfaceC657570Pql.onDestroy();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        InterfaceC657570Pql interfaceC657570Pql = this.LLJZIJLIL;
        if (interfaceC657570Pql != null) {
            interfaceC657570Pql.onDestroy();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(view, this, 57));
        ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$CardCommonAbility.class)).A12(new C0R45(this, 23));
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard.SearchAdTopPhotoSingleCardAssem.onViewCreated.3
                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void LJJLIIIJLLLLLLLZ() {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void Mu(C650630PfZ c650630PfZ) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean N1() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final View Vt() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void kC0(int i) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean mm() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void wp(C650630PfZ c650630PfZ) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void J0() {
                    Iterator it2 = ((CopyOnWriteArrayList) SearchAdTopPhotoSingleCardAssem.this.LLJLLL.getValue()).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC583720Muw) it2.next()).LJJZ();
                    }
                    InterfaceC657570Pql interfaceC657570Pql = SearchAdTopPhotoSingleCardAssem.this.LLJZIJLIL;
                    if (interfaceC657570Pql != null) {
                        interfaceC657570Pql.J0();
                    }
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void LLZZZZ() {
                    InterfaceC657570Pql interfaceC657570Pql = SearchAdTopPhotoSingleCardAssem.this.LLJZIJLIL;
                    if (interfaceC657570Pql != null) {
                        interfaceC657570Pql.LLZZZZ();
                    }
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final View getDetectView() {
                    return SearchAdTopPhotoSingleCardAssem.this.LJJIJL();
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final boolean isPlaying() {
                    InterfaceC657570Pql interfaceC657570Pql = SearchAdTopPhotoSingleCardAssem.this.LLJZIJLIL;
                    if (interfaceC657570Pql != null) {
                        return interfaceC657570Pql.isPlaying();
                    }
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
                public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                    function0.invoke();
                }
            }, SearchServiceCenter$AutoPlayAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            C1558520qew.LJI(this, SearchPlayerScope.class, new SearchComponentCenter$Player$PlayerControlAbility() { // from class: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard.SearchAdTopPhotoSingleCardAssem.onViewCreated.4
                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
                public final void VV1(C657320PqM c657320PqM) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
                public final void qq1(C657320PqM c657320PqM) {
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
                public final View LLLLLLLZIL() {
                    View view2 = (View) SearchAdTopPhotoSingleCardAssem.this.LLJL.getValue();
                    return view2 == null ? SearchAdTopPhotoSingleCardAssem.this.LJJIJL() : view2;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
                public final boolean isPlaying() {
                    InterfaceC657570Pql interfaceC657570Pql = SearchAdTopPhotoSingleCardAssem.this.LLJZIJLIL;
                    if (interfaceC657570Pql != null) {
                        return interfaceC657570Pql.isPlaying();
                    }
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
                public final boolean isMute() {
                    return C659080PtC.LIZIZ();
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
                public final void Im2(InterfaceC583720Muw interfaceC583720Muw) {
                    ((CopyOnWriteArrayList) SearchAdTopPhotoSingleCardAssem.this.LLJLLL.getValue()).add(interfaceC583720Muw);
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
                public final void LJIILJJIL(boolean z) {
                    InterfaceC657570Pql interfaceC657570Pql = SearchAdTopPhotoSingleCardAssem.this.LLJZIJLIL;
                    if (interfaceC657570Pql != null) {
                        interfaceC657570Pql.LJIILJJIL(z);
                    }
                }

                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
                public final void yA2(InterfaceC583720Muw interfaceC583720Muw) {
                    ((CopyOnWriteArrayList) SearchAdTopPhotoSingleCardAssem.this.LLJLLL.getValue()).remove(interfaceC583720Muw);
                }
            }, SearchComponentCenter$Player$PlayerControlAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0155  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C656300Poi r12) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard.SearchAdTopPhotoSingleCardAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C656300Poi c656300Poi) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C656300Poi c656300Poi) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
