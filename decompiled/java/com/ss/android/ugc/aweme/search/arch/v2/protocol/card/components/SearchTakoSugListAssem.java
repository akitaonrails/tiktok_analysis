package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C01GW;
import X.C07E5;
import X.C098200Yq;
import X.C0Q4Y;
import X.C0Q7D;
import X.C1558520qew;
import X.C1559260qg8;
import X.C189200o6;
import X.C2097608Jq;
import X.C342880DcM;
import X.C452501pT;
import X.C661350Pwr;
import X.C665150Q7d;
import X.C723580SZw;
import X.InterfaceC1587906Jp;
import X.InterfaceC655050Pmh;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoSugCell;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoSugListAssem extends ReusedUISlotAssem<SearchTakoSugListAssem> implements SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility, InterfaceC712990Rxx<InterfaceC655050Pmh> {
    public ViewOnAttachStateChangeListenerC20604515jv LLJLL;
    public TuxTextView LLJLLIL;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C665150Q7d.class, null), checkSupervisorPrepared());
    public final Map<String, String> LLJL = new LinkedHashMap();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 232));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 233));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(146));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.euy;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1558520qew.LJI(this, SearchCardScope.class, this, SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility.class, null, null);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() throws IllegalAccessException {
        C1558520qew.LJIIJ(this, SearchCardScope.class, SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility.class, null);
    }

    public final C665150Q7d op() {
        return (C665150Q7d) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.txf);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.xco);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            TuxTextView tuxTextView = this.LLJLLIL;
            if (tuxTextView != null) {
                C342880DcM.LIZIZ(viewOnAttachStateChangeListenerC20604515jv, viewOnAttachStateChangeListenerC20604515jv.getContext(), tuxTextView);
            }
            C661350Pwr.LJIIL(viewOnAttachStateChangeListenerC20604515jv);
            viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SearchTakoSugCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC655050Pmh interfaceC655050Pmh) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC655050Pmh interfaceC655050Pmh) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC655050Pmh interfaceC655050Pmh) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ST0(int r39, java.lang.String r40, boolean r41) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchTakoSugListAssem.ST0(int, java.lang.String, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility
    public final void tu1(int i, String str, boolean z) {
        if (((SparseBooleanArray) this.LLJLLL.getValue()).get(i)) {
            return;
        }
        ((SparseBooleanArray) this.LLJLLL.getValue()).put(i, true);
        if (!z) {
            sp(i, str, null, true);
        }
    }

    public final void sp(int i, String str, String str2, boolean z) {
        Function0<? extends Map<String, String>> function0;
        Map<String, String> mapInvoke;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LLJL);
        C665150Q7d c665150Q7dOp = op();
        if (c665150Q7dOp != null && (function0 = c665150Q7dOp.LLILLJJLI) != null && (mapInvoke = function0.invoke()) != null) {
            linkedHashMap.putAll(mapInvoke);
        }
        C0Q7D.LIZ.getClass();
        C0Q7D.LIZIZ(i, str, linkedHashMap, z);
        if (!z) {
            try {
                JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIZILJ(linkedHashMap));
                jSONObject.put("button_type", str2);
                AppLogNewUtils.onEventV3("search_result_click", jSONObject);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
