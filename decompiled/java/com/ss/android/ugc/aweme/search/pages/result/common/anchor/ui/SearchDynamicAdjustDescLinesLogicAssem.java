package com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui;

import X.AbstractC656960Ppm;
import X.AnonymousClass0957;
import X.C01GW;
import X.C090F;
import X.C13LP;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2188811AlT;
import X.C452501pT;
import X.C656980Ppo;
import X.C660990PwH;
import X.C661000PwI;
import X.C723580SZw;
import X.EnumC657070Ppx;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicAdjustDescLinesLogicAssem extends ReusedUIContentAssem<SearchDynamicAdjustDescLinesLogicAssem> implements InterfaceC712990Rxx<InterfaceC435460H5s>, IAdjustAbility {
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 424));
    public final C1559260qg8 LLJJJJJIL = new C1559260qg8(new C723580SZw(this, C660990PwH.class, null), checkSupervisorPrepared());
    public C661000PwI LLJJJJLIIL;
    public AnonymousClass0957<Pair<Boolean, Integer>> LLJJL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility
    public final AnonymousClass0957<Pair<Boolean, Integer>> uX0() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility
    public final boolean Tm1(int i) {
        CharSequence text;
        if (this.LLJJJJ.getValue() == null) {
            return false;
        }
        TextView textView = (TextView) this.LLJJJJ.getValue();
        if (textView != null && textView.getMaxLines() == i) {
            return false;
        }
        TextView textView2 = (TextView) this.LLJJJJ.getValue();
        if (textView2 != null) {
            textView2.setMaxLines(i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adjust max line: ");
        sbLIZ.append(i);
        sbLIZ.append(", for ");
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.LLJJJJ.getValue();
        if (appCompatTextView != null) {
            text = appCompatTextView.getText();
        } else {
            text = null;
        }
        sbLIZ.append((Object) text);
        C2188811AlT.LIZIZ(sbLIZ);
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C1558520qew.LJI(this, SearchCardScope.class, this, IAdjustAbility.class, null, null);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC435460H5s interfaceC435460H5s) {
        TextView textView = (TextView) this.LLJJJJ.getValue();
        if (textView != null) {
            textView.setMaxLines(2);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC435460H5s interfaceC435460H5s) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void vr(InterfaceC435460H5s interfaceC435460H5s) {
        C661000PwI c661000PwI;
        String strLJJLIIIJ;
        EnumSet<EnumC657070Ppx> enumSet;
        EnumSet<EnumC657070Ppx> enumSet2;
        this.LLJJL = C090F.LIZIZ();
        C660990PwH c660990PwH = (C660990PwH) this.LLJJJJJIL.getValue();
        Integer numValueOf = null;
        if (c660990PwH != null && (enumSet2 = c660990PwH.LL) != null) {
            c661000PwI = new C661000PwI(enumSet2, new AwS589S0100000_10(this, 187));
        } else {
            c661000PwI = null;
        }
        this.LLJJJJLIIL = c661000PwI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("========= start track [");
        C660990PwH c660990PwH2 = (C660990PwH) this.LLJJJJJIL.getValue();
        if (c660990PwH2 != null && (enumSet = c660990PwH2.LL) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(enumSet, null, null, null, 0, null, null, 63);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append("], for ");
        C661000PwI c661000PwI2 = this.LLJJJJLIIL;
        if (c661000PwI2 != null) {
            numValueOf = Integer.valueOf(c661000PwI2.hashCode());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" ===========");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility
    public final void qw1(EnumC657070Ppx enumC657070Ppx, AbstractC656960Ppm abstractC656960Ppm) {
        C656980Ppo c656980Ppo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Track(");
        sbLIZ.append(enumC657070Ppx);
        sbLIZ.append(", ");
        sbLIZ.append(abstractC656960Ppm);
        sbLIZ.append(") for ");
        C661000PwI c661000PwI = this.LLJJJJLIIL;
        Integer numValueOf = null;
        if (c661000PwI != null) {
            numValueOf = Integer.valueOf(c661000PwI.hashCode());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C661000PwI c661000PwI2 = this.LLJJJJLIIL;
        if (c661000PwI2 != null) {
            c661000PwI2.LIZJ.put(enumC657070Ppx, abstractC656960Ppm);
            if (Intrinsics.LJFF(((LinkedHashMap) c661000PwI2.LIZJ).keySet(), c661000PwI2.LIZ)) {
                Object obj = ((LinkedHashMap) c661000PwI2.LIZJ).get(EnumC657070Ppx.DESC);
                if ((obj instanceof C656980Ppo) && (c656980Ppo = (C656980Ppo) obj) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C13LP.LJJLIIIJ(((LinkedHashMap) c661000PwI2.LIZJ).entrySet(), null, null, null, 0, null, AFwS229S0000000_2.get$arr$(482), 31));
                    sbLIZ2.append(", for ");
                    sbLIZ2.append(c661000PwI2.hashCode());
                    sbLIZ2.append(", desc: ");
                    sbLIZ2.append(c656980Ppo.LIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Collection collectionValues = ((LinkedHashMap) c661000PwI2.LIZJ).values();
                    boolean z = true;
                    if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        for (Object obj2 : collectionValues) {
                            if (!(obj2 instanceof C656980Ppo) && obj2 != null) {
                                Function1<Boolean, Unit> function1 = c661000PwI2.LIZIZ;
                                if (c656980Ppo.LIZIZ < 2) {
                                    z = false;
                                }
                                function1.invoke(Boolean.valueOf(z));
                                return;
                            }
                        }
                    }
                    c661000PwI2.LIZIZ.invoke(Boolean.FALSE);
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
