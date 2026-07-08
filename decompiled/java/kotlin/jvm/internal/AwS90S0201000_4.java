package kotlin.jvm.internal;

import X.C01LU;
import X.C09AY;
import X.C0XF5;
import X.C1076010e6h;
import X.C1389890mGx;
import X.C15438062q;
import X.C1697810uHb;
import X.C1833730xop;
import X.C1834780xqW;
import X.C23250099c;
import X.C291001Au;
import X.C339250DRr;
import X.C341840Dag;
import X.C341890Dal;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.IFollowingListAbility;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowBottomAssem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowItem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowVM;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.SimpleUser;
import com.ss.android.ugc.ur.experiment.ManageBatchUnfollowAbilityExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS90S0201000_4 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS90S0201000_4 awS90S0201000_4, Object obj) {
        if (!C0XF5.LIZIZ()) {
            C1389890mGx c1389890mGx = new C1389890mGx((View) awS90S0201000_4.l0);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        } else {
            AssemVMLazy assemVMLazy = ((ManageFollowBottomAssem) awS90S0201000_4.l1).LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ManageFollowBottomAssem.LLJIJIL;
            ManageFollowVM manageFollowVM = (ManageFollowVM) assemVMLazy.getValue();
            IFollowingListAbility iFollowingListAbility = (IFollowingListAbility) ((ManageFollowBottomAssem) awS90S0201000_4.l1).LLJI.getValue();
            Set<SimpleUser> set = ((C339250DRr) manageFollowVM.getState()).LL.LIZ;
            List<ITEM> listListGetAll = manageFollowVM.listGetAll();
            if (listListGetAll != 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listListGetAll) {
                    if (!set.contains(((ManageFollowItem) obj2).simpleUser)) {
                        arrayList.add(obj2);
                    }
                }
                manageFollowVM.listSetItems(arrayList);
            }
            if (((Boolean) ManageBatchUnfollowAbilityExp.LJ.getValue()).booleanValue()) {
                for (SimpleUser simpleUser : set) {
                    C1076010e6h.LIZJ.LIZIZ().getRelationObservable().setValue(new FollowStatus(0, 0, null, 0, simpleUser.uid, simpleUser.secUid, true, true, -1, 0, null, null, -1, false));
                }
            }
            if (iFollowingListAbility != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(set, 10));
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((SimpleUser) it2.next()).uid);
                }
                iFollowingListAbility.ZK0(arrayList2);
            }
            C23250099c.LIZLLL(manageFollowVM.getAssemVMScope(), null, null, new C341840Dag(set, manageFollowVM, null), 3);
            C1389890mGx c1389890mGx2 = new C1389890mGx((View) awS90S0201000_4.l0);
            c1389890mGx2.LJIIIZ(2131827261);
            c1389890mGx2.LJIIJJI();
            C23250099c.LIZLLL((InterfaceC497601wk) C341890Dal.LIZ.getValue(), null, null, new C01LU(awS90S0201000_4.i2, "unfollow", null), 3);
            ((ManageFollowBottomAssem) awS90S0201000_4.l1).LLJ = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS90S0201000_4 awS90S0201000_4, Object obj) {
        C1834780xqW c1834780xqW = (C1834780xqW) obj;
        List list = (List) awS90S0201000_4.l0;
        int i = awS90S0201000_4.i2;
        C1833730xop c1833730xop = (C1833730xop) awS90S0201000_4.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (i2 == i) {
                    obj2 = c1833730xop;
                }
                arrayList.add(obj2);
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return C1834780xqW.LIZ(c1834780xqW, null, null, new C291001Au(arrayList), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS90S0201000_4(View view, ManageFollowBottomAssem manageFollowBottomAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = view;
        this.l1 = manageFollowBottomAssem;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS90S0201000_4(List list, List<C1833730xop> list2, int i, C1833730xop c1833730xop) {
        super(1);
        this.$t = c1833730xop;
        this.l0 = list;
        this.i2 = list2;
        this.l1 = i;
    }
}
