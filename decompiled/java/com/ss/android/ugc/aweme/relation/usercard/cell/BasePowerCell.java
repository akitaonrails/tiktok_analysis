package com.ss.android.ugc.aweme.relation.usercard.cell;

import X.AbstractC19994813Le;
import X.C1261270ivV;
import X.C1261710iwD;
import X.C1262300ixA;
import X.C1264320j0Q;
import X.C1388190mED;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C946803n0;
import X.InterfaceC1261590iw1;
import X.InterfaceC1263010iyJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC1906740zia;
import X.InterfaceC494301wD;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BasePowerCell<ITEM extends InterfaceC1891350zJl> extends PowerCell<ITEM> {
    public InterfaceC1263010iyJ LL;
    public boolean LLILLJJLI;

    public void R5(int i, ITEM item, boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1261580iw0 L5() {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell.L5():X.0iw0");
    }

    public final int N5() {
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
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
        if (iUserCardListAbility == null) {
            return -1;
        }
        ITEM item = getItem();
        if (item != null) {
            return iUserCardListAbility.H40(item);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float P5() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell.P5():float");
    }

    public final Context S5() {
        Context context = this.itemView.getContext();
        if (context != null) {
            return context;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final InterfaceC1263010iyJ I5() {
        InterfaceC1263010iyJ interfaceC1263010iyJ;
        InterfaceC1263010iyJ interfaceC1263010iyJ2;
        InterfaceC1906740zia chunk = getChunk();
        if ((chunk instanceof InterfaceC1263010iyJ) && (interfaceC1263010iyJ2 = (InterfaceC1263010iyJ) chunk) != null) {
            return interfaceC1263010iyJ2;
        }
        Object bindingAdapter = getBindingAdapter();
        return (!(bindingAdapter instanceof InterfaceC1263010iyJ) || (interfaceC1263010iyJ = (InterfaceC1263010iyJ) bindingAdapter) == null) ? this.LL : interfaceC1263010iyJ;
    }

    public final LifecycleOwner getLifecycleOwner() {
        LifecycleOwner currentLifecycleOwner;
        C1262300ixA config;
        C19EG c19eg;
        C1262300ixA config2;
        InterfaceC1263010iyJ interfaceC1263010iyJI5 = I5();
        if (interfaceC1263010iyJI5 == null || (config2 = interfaceC1263010iyJI5.getConfig()) == null || (currentLifecycleOwner = config2.hostFragment) == null) {
            InterfaceC1263010iyJ interfaceC1263010iyJI52 = I5();
            if (interfaceC1263010iyJI52 != null && (config = interfaceC1263010iyJI52.getConfig()) != null && (c19eg = config.hostActivity) != null) {
                return c19eg;
            }
            currentLifecycleOwner = getCurrentLifecycleOwner();
            if (currentLifecycleOwner == null && (currentLifecycleOwner = C946803n0.LIZ(this.itemView)) == null) {
                return C1388190mED.LIZIZ(this.itemView.getContext());
            }
        }
        return currentLifecycleOwner;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ITEM item = getItem();
        if (item != null) {
            R5(N5(), item, false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void unBind() {
        super.unBind();
        this.itemView.setTag(R.id.usercard_unbind_tag, Boolean.TRUE);
    }

    public void T5(ITEM item) {
        this.itemView.setTag(R.id.usercard_unbind_tag, Boolean.FALSE);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(ITEM item) {
        InterfaceC494301wD interfaceC494301wDLIZ;
        Function0<C1261270ivV> function0;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        super.onBindItemView(item);
        if (item instanceof InterfaceC1261590iw1) {
            this.LL = ((InterfaceC1261590iw1) item).getSection();
        }
        T5(item);
        setItem(item);
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
            C1261270ivV c1261270ivVInvoke = null;
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
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
                            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), RecUserCellTrackAbility.class, strLJJJLIIL);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(RecUserCellTrackAbility.class).LJI());
                                sbLIZ.append(" not found, parent: ");
                                sbLIZ.append(this.itemView.getParent());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c1264320j0Q.getClass();
                                C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                            }
                        }
                    }
                }
                interfaceC494301wDLIZ = null;
            } else {
                interfaceC494301wDLIZ = null;
            }
            RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) interfaceC494301wDLIZ;
            if (recUserCellTrackAbility != null && (function0 = recUserCellTrackAbility.LL) != null) {
                c1261270ivVInvoke = function0.invoke();
            }
            C2211751BhN.LIZ(this.itemView, new C1261710iwD(this, c1261270ivVInvoke, AbstractC19994813Le.Default.nextInt()));
        }
    }
}
