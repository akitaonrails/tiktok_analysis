package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C01GW;
import X.C0ALF;
import X.C0BS4;
import X.C0C64;
import X.C0OPT;
import X.C0OPX;
import X.C0OSB;
import X.C1196320hEk;
import X.C1220000hqw;
import X.C13LE;
import X.C384050F3z;
import X.C417460GYm;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452501pT;
import X.C639010P4p;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC620430OVd;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.IBulletinQuickPublishAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinPostTypeAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS500S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public class BulletinQuickPostCell extends PowerCell<BulletinPublishAction> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(188));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 769));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 764));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 766));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 760));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 768));
    public final C736950SvV LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class, BulletinEditFragmentScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a61;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        arrayList.add(BulletinEditFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    public BulletinQuickPostCell() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 765);
        this.LLIZ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(332), null, null, null);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 762));
        this.LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 767));
        this.LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 761));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 763));
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf((((Number) C0ALF.LIZ.getValue()).intValue() == 1 && Intrinsics.LJFF(C0BS4.LIZ.getValue(), "quick_post_opt")) ? 20 : 16)));
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        int i2;
        BulletinPublishAction bulletinPublishAction = (BulletinPublishAction) interfaceC1891350zJl;
        super.onBindItemView(bulletinPublishAction);
        C0OSB.LJI((TuxTextView) this.LLJ.getValue(), bulletinPublishAction.getText());
        C01GW c01gw = C0BS4.LIZ;
        if (Intrinsics.LJFF(c01gw.getValue(), "quick_post_opt")) {
            i = 6;
        } else {
            i = 4;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLIZLLLIL.getValue(), 0);
        C0OSB.LJFF((TuxIconView) this.LLIZLLLIL.getValue(), bulletinPublishAction.getIconUrlModel(), (C639010P4p) this.LLJIJIL.getValue());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.LLJ.getValue()).getLayoutParams();
        marginLayoutParams.leftMargin = iLIZIZ;
        C786410Ut5.R6((TuxTextView) this.LLJ.getValue(), marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (((Number) C0ALF.LIZ.getValue()).intValue() == 1 && Intrinsics.LJFF(c01gw.getValue(), "quick_post_opt")) {
            i2 = 40;
        } else {
            i2 = 32;
        }
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        C786410Ut5.W5(this.itemView, layoutParams);
        this.itemView.requestLayout();
        C786410Ut5.I7(new AbS500S0200000_9(this, bulletinPublishAction, 1, 42), this.itemView);
        if (bulletinPublishAction.getPublishActionType() == EnumC620430OVd.POLL.getPostType()) {
            C0OPT.LIZ.getClass();
            if (C0OPT.LIZ().getInt("show_count", 0) < C0C64.LJIILLIIL().LJIJ(31744, 0, "bulletin_quick_post_dot_max_show", true)) {
                C786410Ut5.g0((C417460GYm) this.LLJI.getValue(), 0);
                if (!C0OPT.LIZIZ) {
                    C0OPT.LIZIZ = true;
                    C0OPT.LIZ().storeInt("show_count", C0OPT.LIZ().getInt("show_count", 0) + 1);
                    return;
                }
                return;
            }
        }
        C786410Ut5.g0((C417460GYm) this.LLJI.getValue(), 8);
    }

    public final void Yl(int i, String str, List list, boolean z) {
        if (this.LLILLL.getValue() != null) {
            BulletinPostTypeAbility bulletinPostTypeAbility = (BulletinPostTypeAbility) this.LLILLL.getValue();
            if (bulletinPostTypeAbility != null) {
                bulletinPostTypeAbility.Yl(i, str, list, true);
                return;
            }
            return;
        }
        if (this.LLILZ.getValue() != null) {
            IBulletinQuickPublishAbility iBulletinQuickPublishAbility = (IBulletinQuickPublishAbility) this.LLILZ.getValue();
            if (iBulletinQuickPublishAbility == null) {
                return;
            }
            iBulletinQuickPublishAbility.Yl(i, str, list, true);
            return;
        }
        C0OPX.LJII("BulletinQuickPostCell click but not found ability");
    }
}
