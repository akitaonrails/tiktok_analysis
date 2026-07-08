package wh6;

import X.AbstractC879060Ye8;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0Z9N;
import X.C1218270ho9;
import X.C1219570hqF;
import X.C1219580hqG;
import X.C1229100i5c;
import X.C1261390ivh;
import X.C1261760iwI;
import X.C1261770iwJ;
import X.C1261860iwS;
import X.C1264320j0Q;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C197039127h;
import X.C19EG;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C443630HaT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C913380ZsO;
import X.C946803n0;
import X.C985403tE;
import X.EnumC1260930iux;
import X.InterfaceC1263010iyJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.adaptive.TuxModal;
import com.ss.android.ugc.aweme.detailpage.manageadmin.view.ManageAdminCell;
import com.ss.android.ugc.aweme.detailpage.manageadmin.viewmodel.ManageAdminViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.label.popup.MutualRelationPopupFragment;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRedesignRecUserCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS103S1200000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AbS331S0300000_19 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(wh6.AbS331S0300000_19 r21, android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS331S0300000_19.LIZ$0(wh6.AbS331S0300000_19, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$1(wh6.AbS331S0300000_19 r9, android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS331S0300000_19.LIZ$1(wh6.AbS331S0300000_19, android.view.View):void");
    }

    public static final void LIZ$2(AbS331S0300000_19 abS331S0300000_19, View view) {
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        C19EG c19egLIZ;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (view != null) {
            LifecycleOwner lifecycleOwner = ((RectRedesignRecUserCell) abS331S0300000_19.l0).getLifecycleOwner();
            InterfaceC494301wD interfaceC494301wD = null;
            if (lifecycleOwner != null && (c19egLIZ = C724240Sb0.LIZ(lifecycleOwner)) != null && (c19egLIZIZ = C1388190mED.LIZIZ(c19egLIZ)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1261390ivh c1261390ivh = new C1261390ivh();
                C443630HaT c443630HaT = MutualRelationPopupFragment.LLJIJIL;
                MatchedFriendStruct matchedFriendStruct = (MatchedFriendStruct) abS331S0300000_19.l2;
                c443630HaT.getClass();
                MutualRelationPopupFragment mutualRelationPopupFragment = new MutualRelationPopupFragment();
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIZ(bundle, "maf_struct", matchedFriendStruct);
                mutualRelationPopupFragment.setArguments(bundle);
                TuxModal tuxModal = c1261390ivh.LIZ;
                tuxModal.LLILZ = mutualRelationPopupFragment;
                tuxModal.LLILZIL = true;
                tuxModal.LLILLJJLI = false;
                tuxModal.show(supportFragmentManager, (String) null);
            }
            RectRedesignRecUserCell rectRedesignRecUserCell = (RectRedesignRecUserCell) abS331S0300000_19.l0;
            try {
                if (!Intrinsics.LJFF(rectRedesignRecUserCell.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                    LifecycleOwner lifecycleOwner2 = rectRedesignRecUserCell.getLifecycleOwner();
                    if ((((lifecycleOwner2 instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner2) != null) || (fragmentLIZ = C946803n0.LIZ(rectRedesignRecUserCell.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                    } else {
                        LifecycleOwner lifecycleOwner3 = rectRedesignRecUserCell.getLifecycleOwner();
                        if (lifecycleOwner3 != null && (lifecycle = lifecycleOwner3.getLifecycle()) != null) {
                            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                                C1264320j0Q.LIZ.getClass();
                                C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                            } else {
                                InterfaceC1263010iyJ interfaceC1263010iyJI5 = rectRedesignRecUserCell.I5();
                                if (interfaceC1263010iyJI5 != null) {
                                    strLJJJLIIL = interfaceC1263010iyJI5.LJJJLIIL();
                                } else {
                                    strLJJJLIIL = null;
                                }
                                InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(rectRedesignRecUserCell.itemView, null), RecUserCellTrackAbility.class, strLJJJLIIL);
                                if (interfaceC494301wDLIZ == null) {
                                    C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(strLJJJLIIL);
                                    sbLIZ.append("'s ");
                                    sbLIZ.append(C13LE.LIZ(RecUserCellTrackAbility.class).LJI());
                                    sbLIZ.append(" not found, parent: ");
                                    sbLIZ.append(rectRedesignRecUserCell.itemView.getParent());
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    c1264320j0Q.getClass();
                                    C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                                }
                                interfaceC494301wD = interfaceC494301wDLIZ;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
            RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) interfaceC494301wD;
            if (recUserCellTrackAbility != null) {
                C1261860iwS c1261860iwS = (C1261860iwS) abS331S0300000_19.l1;
                RectRedesignRecUserCell rectRedesignRecUserCell2 = (RectRedesignRecUserCell) abS331S0300000_19.l0;
                recUserCellTrackAbility.LJFF(c1261860iwS, rectRedesignRecUserCell2.LLJLILLLLZIIL, rectRedesignRecUserCell2.LLJLL, rectRedesignRecUserCell2.LLJLLIL, EnumC1260930iux.VIEW_RELATION_LABEL);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$3(wh6.AbS331S0300000_19 r27, android.view.View r28) {
        /*
            Method dump skipped, instruction units count: 1443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS331S0300000_19.LIZ$3(wh6.AbS331S0300000_19, android.view.View):void");
    }

    public static final void LIZ$4(AbS331S0300000_19 abS331S0300000_19, View view) {
        String uid;
        int i;
        if (view != null && (uid = ((C1218270ho9) abS331S0300000_19.l0).LL.getUid()) != null) {
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null && iIMContactUtilServiceLIZ.LJIIIZ(((C1218270ho9) abS331S0300000_19.l0).LL)) {
                AssemVMLazy assemVMLazy = ((ManageAdminCell) abS331S0300000_19.l1).LL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ManageAdminCell.LLJ;
                ManageAdminViewModel manageAdminViewModel = (ManageAdminViewModel) assemVMLazy.getValue();
                Context context = ((C197039127h) abS331S0300000_19.l2).getContext();
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJII = false;
                c1397580mTM.LJFF(2131830130);
                if (C1229100i5c.LJII(manageAdminViewModel.vQ2().LL)) {
                    int i2 = C1219570hqF.LIZ[C1229100i5c.LIZ(manageAdminViewModel.vQ2().LL).ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            i = 2131834302;
                        } else {
                            i = 2131830128;
                        }
                    } else {
                        i = 2131830129;
                    }
                } else {
                    i = 2131828490;
                }
                c1397580mTM.LIZ(i);
                C985403tE.LIZ(c1397580mTM, new AwS103S1200000_19(context, manageAdminViewModel, uid, 13));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            AssemVMLazy assemVMLazy2 = ((ManageAdminCell) abS331S0300000_19.l1).LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = ManageAdminCell.LLJ;
            ManageAdminViewModel manageAdminViewModel2 = (ManageAdminViewModel) assemVMLazy2.getValue();
            ((AbstractC879060Ye8) manageAdminViewModel2.LLILLJJLI.getValue()).LJIIZILJ(uid, C0Z9N.ORDINARY.getValue(), C2097608Jq.LJ(), new C1219580hqG(((C197039127h) abS331S0300000_19.l2).getContext(), manageAdminViewModel2, uid));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS331S0300000_19(AbsAuthCell absAuthCell, C1261760iwI c1261760iwI, C1261770iwJ c1261770iwJ, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = absAuthCell;
        this.l1 = c1261760iwI;
        this.l2 = c1261770iwJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS331S0300000_19(Object obj, Object obj2, Object obj3, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
