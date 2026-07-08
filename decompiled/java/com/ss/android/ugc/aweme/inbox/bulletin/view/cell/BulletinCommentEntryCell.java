package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C01GW;
import X.C0OQC;
import X.C1196320hEk;
import X.C13LP;
import X.C1558520qew;
import X.C1867407Tc;
import X.C19348710mr;
import X.C19374310qz;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC19356310o5;
import X.EnumC619900OTc;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC619970OTj;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS144S0100000_9;
import Y.ARunnableS78S0200000_9;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.scope.BulletinEmojiCellScope;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentEntryCell extends PowerCell<C0OQC> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(170));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 643));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 642));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 425));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 424));
    public TuxTextView LLILZLL;
    public View LLIZ;
    public C0OQC LLIZLLLIL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class, BulletinEmojiCellScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a79;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinEmojiCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.ear);
        View viewFindViewById = this.itemView.findViewById(R.id.eao);
        this.LLIZ = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setBackground((Drawable) this.LLILZIL.getValue());
        }
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 50), this.itemView);
    }

    public final void I5(C0OQC c0oqc) {
        CharSequence string;
        int i;
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            if (c0oqc.LLILLL && (i = c0oqc.LLILLJJLI) > 0) {
                string = C19374310qz.LIZ(Integer.valueOf(i), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28);
            } else {
                string = this.itemView.getContext().getString(2131827941);
            }
            tuxTextView.setText(string);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0OQC c0oqc = (C0OQC) interfaceC1891350zJl;
        super.onBindItemView(c0oqc);
        this.LLIZLLLIL = c0oqc;
        I5(c0oqc);
        final View view = this.itemView;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        BulletinTooltipAbility bulletinTooltipAbility = null;
        if (interfaceC665370Q7zLIZ != null) {
            bulletinTooltipAbility = (BulletinTooltipAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinTooltipAbility.class, null);
        }
        C0OQC c0oqc2 = this.LLIZLLLIL;
        if (c0oqc2 != null) {
            BulletinCommonAbility bulletinCommonAbility = (BulletinCommonAbility) this.LLILLL.getValue();
            if (bulletinCommonAbility != null && bulletinCommonAbility.q11() && c0oqc2.LLILZ) {
                BulletinCommonAbility bulletinCommonAbility2 = (BulletinCommonAbility) this.LLILLL.getValue();
                if (bulletinCommonAbility2 != null && bulletinCommonAbility2.To()) {
                    if (bulletinTooltipAbility != null) {
                        bulletinTooltipAbility.WK0(EnumC619900OTc.COMMENT_ENTRY_TOOLTIP);
                        return;
                    }
                    return;
                } else {
                    if (bulletinTooltipAbility == null) {
                        return;
                    }
                    bulletinTooltipAbility.gA2(EnumC619900OTc.COMMENT_ENTRY_TOOLTIP, new InterfaceC619970OTj() { // from class: X.0OQy
                        @Override // X.InterfaceC619970OTj
                        public final boolean isAvailable() {
                            C0OP4.LIZ.getClass();
                            return !C0OP4.LIZ().getBoolean("has_show_comment_entry_tooltip", false);
                        }

                        @Override // X.InterfaceC619970OTj
                        public final void q0(Function0<Unit> function0) {
                            View view2 = view;
                            HandlerHook.viewPostDelay(view2, new ARunnableS78S0200000_9(view2, function0, 0), 1000L);
                        }
                    });
                    return;
                }
            }
            if (bulletinTooltipAbility == null) {
                return;
            }
            bulletinTooltipAbility.WK0(EnumC619900OTc.COMMENT_ENTRY_TOOLTIP);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C0OQC c0oqc = (C0OQC) interfaceC1891350zJl;
        super.onBindItemView(c0oqc, list);
        this.LLIZLLLIL = c0oqc;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (objLJJJLZIJ != null && (objLJJJLZIJ instanceof C1867407Tc)) {
            C1867407Tc c1867407Tc = (C1867407Tc) objLJJJLZIJ;
            if (c1867407Tc.LIZ || c1867407Tc.LIZIZ) {
                I5(c0oqc);
            }
        }
    }
}
