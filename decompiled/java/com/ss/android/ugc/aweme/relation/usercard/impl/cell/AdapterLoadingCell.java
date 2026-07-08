package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AbstractC1623806Xk;
import X.C1075800e6M;
import X.C1261600iw2;
import X.C1264320j0Q;
import X.C1271704yJ;
import X.C1390410mHn;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1623606Xi;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C447550Hgn;
import X.C626160OhC;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.InterfaceC1261750iwH;
import X.InterfaceC1263010iyJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AdapterLoadingCell extends BasePowerCell<C1271704yJ> {
    public final C1261600iw2 LLILLL = new InterfaceC1261750iwH() { // from class: X.0iw2
        @Override // X.InterfaceC1261750iwH
        public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        }

        @Override // X.InterfaceC1261750iwH
        public final void LLF(RecyclerView recyclerView, int i) {
        }

        @Override // X.InterfaceC1261750iwH
        public final void nO0(C1075800e6M c1075800e6M) {
            this.LL.U5(c1075800e6M);
        }
    };
    public C1390410mHn LLILZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.elp;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        super.unBind();
        InterfaceC494301wD interfaceC494301wD = null;
        try {
            if (!Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = getLifecycleOwner();
                if (((!(lifecycleOwner instanceof Fragment) || (fragmentLIZ = (Fragment) lifecycleOwner) == null) && (fragmentLIZ = C946803n0.LIZ(this.itemView)) == null) || (!fragmentLIZ.isDetached() && fragmentLIZ.isAdded())) {
                    LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = I5();
                            String strLJJJLIIL = interfaceC1263010iyJI5 != null ? interfaceC1263010iyJI5.LJJJLIIL() : null;
                            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                                sbLIZ.append(" not found, parent: ");
                                sbLIZ.append(this.itemView.getParent());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c1264320j0Q.getClass();
                                C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                            }
                            interfaceC494301wD = interfaceC494301wDLIZ;
                        }
                    }
                } else {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
        }
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wD;
        if (iUserCardListAbility != null) {
            iUserCardListAbility.ng(this.LLILLL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILZ = (C1390410mHn) this.itemView.findViewById(R.id.gb5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U5(C1075800e6M c1075800e6M) {
        boolean z;
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZIZ;
        if ((abstractC1623806Xk instanceof C1623606Xi) && !((C626160OhC) ((C1623606Xi) abstractC1623806Xk).LIZ).LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        C1390410mHn c1390410mHn = null;
        if (!z) {
            C786410Ut5.LJLLLLLL(0, this.itemView);
            C447550Hgn.LJFF(this.itemView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))));
            C1390410mHn c1390410mHn2 = this.LLILZ;
            if (c1390410mHn2 != null) {
                c1390410mHn = c1390410mHn2;
            }
            c1390410mHn.LIZJ();
            return;
        }
        C786410Ut5.LJLLLLLL(8, this.itemView);
        C447550Hgn.LJFF(this.itemView, null, 0);
        C1390410mHn c1390410mHn3 = this.LLILZ;
        if (c1390410mHn3 != null) {
            c1390410mHn = c1390410mHn3;
        }
        c1390410mHn.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        super.onBindItemView(interfaceC1891350zJl);
        InterfaceC494301wD interfaceC494301wD = null;
        try {
            if (!Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner) != null) || (fragmentLIZ = C946803n0.LIZ(this.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = I5();
                            if (interfaceC1263010iyJI5 != null) {
                                strLJJJLIIL = interfaceC1263010iyJI5.LJJJLIIL();
                            } else {
                                strLJJJLIIL = null;
                            }
                            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                                sbLIZ.append(" not found, parent: ");
                                sbLIZ.append(this.itemView.getParent());
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
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wD;
        if (iUserCardListAbility != null) {
            U5(iUserCardListAbility.getState());
            iUserCardListAbility.Eg(this.LLILLL);
        }
    }
}
