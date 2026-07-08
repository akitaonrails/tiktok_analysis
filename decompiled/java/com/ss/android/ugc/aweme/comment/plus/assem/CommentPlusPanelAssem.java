package com.ss.android.ugc.aweme.comment.plus.assem;

import X.C01GW;
import X.C0T4M;
import X.C1344030l4z;
import X.C1345700l7g;
import X.C1348010lBP;
import X.C1348260lBo;
import X.C1348280lBq;
import X.C1349440lDi;
import X.C1349470lDl;
import X.C13BV;
import X.C13LE;
import X.C15438062q;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C687700QyG;
import X.C726120Se2;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC1347870lBB;
import X.InterfaceC1146704e9;
import X.InterfaceC1348290lBr;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPlusPanelAssem extends UISlotAssem implements IKeyboardProtocol, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C726120Se2 LLJJI = new C726120Se2();
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C1349440lDi LLJJIJIL;
    public final Set<String> LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentPlusPanelAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentPlusPanelAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJJIII = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 52));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 621));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 620));
        this.LLJJJ = new LinkedHashSet();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a45;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommentKeyboardScope.class});
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommentKeyboardScope.class);
        return arrayList;
    }

    public final C0T4M hp() {
        CommentContextSource commentContextSourceIp = ip();
        return new C0T4M(commentContextSourceIp != null ? CommentContextSourceKt.aweme(commentContextSourceIp) : null, C1558520qew.LJIIL(this), ip(), C1345700l7g.LJIIIIZZ(ip()));
    }

    public final CommentContextSource ip() {
        C726120Se2 c726120Se2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return c726120Se2.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    public final void kp() {
        ?? arrayList;
        InterfaceC1348290lBr interfaceC1348290lBr;
        List<String> list = C1348010lBP.LIZ().plusPanelButtons;
        C0T4M c0t4mHp = hp();
        if (list.isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList(list.size());
            for (String str : list) {
                EnumC1347870lBB.Companion.getClass();
                EnumC1347870lBB enumC1347870lBB = EnumC1347870lBB.byRaw.get(str);
                if (enumC1347870lBB != null && (interfaceC1348290lBr = C1348280lBq.LIZ.get(enumC1347870lBB)) != null && interfaceC1348290lBr.LIZ(c0t4mHp)) {
                    arrayList.add(interfaceC1348290lBr);
                }
            }
        }
        IKeyboardIconGroupAssemAbility iKeyboardIconGroupAssemAbility = (IKeyboardIconGroupAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IKeyboardIconGroupAssemAbility.class, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshButtons config=");
        sbLIZ.append(list);
        sbLIZ.append(" visible.size=");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(" iconGroupAbility=");
        sbLIZ.append(iKeyboardIconGroupAssemAbility != null);
        sbLIZ.append(" poll=");
        sbLIZ.append(iKeyboardIconGroupAssemAbility != null ? Boolean.valueOf(iKeyboardIconGroupAssemAbility.SE2(EnumC1347870lBB.POLL)) : null);
        sbLIZ.append(" product=");
        sbLIZ.append(iKeyboardIconGroupAssemAbility != null ? Boolean.valueOf(iKeyboardIconGroupAssemAbility.SE2(EnumC1347870lBB.PRODUCT)) : null);
        sbLIZ.append(" groupChat=");
        sbLIZ.append(iKeyboardIconGroupAssemAbility != null ? Boolean.valueOf(iKeyboardIconGroupAssemAbility.SE2(EnumC1347870lBB.GROUP_CHAT)) : null);
        sbLIZ.append(" gift=");
        sbLIZ.append(iKeyboardIconGroupAssemAbility != null ? Boolean.valueOf(iKeyboardIconGroupAssemAbility.SE2(EnumC1347870lBB.GIFT)) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        for (InterfaceC1348290lBr interfaceC1348290lBr2 : arrayList) {
            if (this.LLJJJ.add(interfaceC1348290lBr2.getId().getRaw()) && iKeyboardIconGroupAssemAbility != null) {
                iKeyboardIconGroupAssemAbility.rF2(interfaceC1348290lBr2.getId());
            }
        }
        C1349440lDi c1349440lDi = this.LLJJIJIL;
        if (c1349440lDi == null) {
            return;
        }
        List<InterfaceC1348290lBr> list2 = c1349440lDi.LLILLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC1348290lBr) it2.next()).getId().getRaw());
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((InterfaceC1348290lBr) it3.next()).getId().getRaw());
        }
        if (Intrinsics.LJFF(arrayList2, arrayList3)) {
            c1349440lDi.notifyDataSetChanged();
            return;
        }
        ((ArrayList) c1349440lDi.LLILLL).clear();
        ((ArrayList) c1349440lDi.LLILLL).addAll(arrayList);
        c1349440lDi.notifyDataSetChanged();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
        if (C1345700l7g.LJIIIIZZ(ip()) || this.LLJJIJIL == null) {
            return;
        }
        kp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (C1345700l7g.LJIIIIZZ(ip())) {
            C1344030l4z.LIZJ("CommentPlusPanelAssem", "onViewCreated landscape → skip PlusPanel render");
            return;
        }
        C1349470lDl.LIZ();
        C1349440lDi c1349440lDi = new C1349440lDi(hp(), new C1348260lBo(this));
        this.LLJJIJIL = c1349440lDi;
        ((RecyclerView) this.LLJJIJI.getValue()).setLayoutManager(new GridLayoutManager(4, 1, LJJIJL().getContext(), false));
        ((RecyclerView) this.LLJJIJI.getValue()).setAdapter(c1349440lDi);
        View view2 = (View) this.LLJJIJIIJIL.getValue();
        int visibility = view2.getVisibility();
        view2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, view2);
        this.LLJJJ.clear();
        IKeyboardIconGroupAssemAbility iKeyboardIconGroupAssemAbility = (IKeyboardIconGroupAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IKeyboardIconGroupAssemAbility.class, null);
        if (iKeyboardIconGroupAssemAbility != null) {
            iKeyboardIconGroupAssemAbility.hg1();
        }
        kp();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0lBp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 47), 4);
    }
}
