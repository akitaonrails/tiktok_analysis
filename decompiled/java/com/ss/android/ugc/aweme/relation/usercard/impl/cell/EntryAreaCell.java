package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C1261270ivV;
import X.C1261920iwY;
import X.C1261940iwa;
import X.C1261970iwd;
import X.C1262300ixA;
import X.C1262590ixd;
import X.C1264320j0Q;
import X.C1308910kAL;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427690Gpr;
import X.C444960Hcc;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.EnumC1261960iwc;
import X.EnumC1262370ixH;
import X.InterfaceC1263010iyJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS166S1200000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EntryAreaCell extends BasePowerCell<C1261920iwY> {
    public static final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
    public static final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
    public static final float LLIZ = C418440Gaw.LIZIZ(28);
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(14.5d)));
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(11.5d)));
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(12.5d)));
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(13.5d)));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.elv;
    }

    public final void U5(String str) {
        InterfaceC494301wD interfaceC494301wDLIZ;
        EnumC1262370ixH enumC1262370ixH;
        InterfaceC494301wD interfaceC494301wDLIZ2;
        C1261270ivV c1261270ivV;
        String str2;
        C1262300ixA config;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        C1262300ixA config2;
        C1262590ixd c1262590ixd;
        Fragment fragmentLIZ2;
        Lifecycle lifecycle2;
        String strLJJJLIIL2;
        C1261940iwa c1261940iwa = C1261940iwa.LIZ;
        String str3 = null;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
        }
        if (!Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
            LifecycleOwner lifecycleOwner = getLifecycleOwner();
            if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ2 = (Fragment) lifecycleOwner) != null) || (fragmentLIZ2 = C946803n0.LIZ(this.itemView)) != null) && (fragmentLIZ2.isDetached() || !fragmentLIZ2.isAdded())) {
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
            } else {
                LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                    if (lifecycle2.getCurrentState() == Lifecycle.State.DESTROYED) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                    } else {
                        InterfaceC1263010iyJ interfaceC1263010iyJI5 = I5();
                        if (interfaceC1263010iyJI5 != null) {
                            strLJJJLIIL2 = interfaceC1263010iyJI5.LJJJLIIL();
                        } else {
                            strLJJJLIIL2 = null;
                        }
                        interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL2);
                        if (interfaceC494301wDLIZ == null) {
                            C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLJJJLIIL2);
                            sbLIZ.append("'s ");
                            sbLIZ.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
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
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
        if (iUserCardListAbility != null && (config2 = iUserCardListAbility.getConfig()) != null && (c1262590ixd = config2.apiConfig) != null) {
            enumC1262370ixH = c1262590ixd.LIZ;
        } else {
            enumC1262370ixH = null;
        }
        c1261940iwa.getClass();
        EnumC1261960iwc enumC1261960iwcLIZLLL = C1261940iwa.LIZLLL(enumC1262370ixH);
        try {
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("Ability", "get ability error!", th2);
        }
        if (!Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
            LifecycleOwner lifecycleOwner3 = getLifecycleOwner();
            if ((((lifecycleOwner3 instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner3) != null) || (fragmentLIZ = C946803n0.LIZ(this.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
            } else {
                LifecycleOwner lifecycleOwner4 = getLifecycleOwner();
                if (lifecycleOwner4 != null && (lifecycle = lifecycleOwner4.getLifecycle()) != null) {
                    if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                    } else {
                        InterfaceC1263010iyJ interfaceC1263010iyJI52 = I5();
                        if (interfaceC1263010iyJI52 != null) {
                            strLJJJLIIL = interfaceC1263010iyJI52.LJJJLIIL();
                        } else {
                            strLJJJLIIL = null;
                        }
                        interfaceC494301wDLIZ2 = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL);
                        if (interfaceC494301wDLIZ2 == null) {
                            C1264320j0Q c1264320j0Q2 = C1264320j0Q.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLJJJLIIL);
                            sbLIZ2.append("'s ");
                            sbLIZ2.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                            sbLIZ2.append(" not found, parent: ");
                            sbLIZ2.append(this.itemView.getParent());
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            c1264320j0Q2.getClass();
                            C1264320j0Q.LIZIZ("Ability", strLIZIZ2, null);
                        }
                    }
                }
            }
            interfaceC494301wDLIZ2 = null;
        } else {
            interfaceC494301wDLIZ2 = null;
        }
        IUserCardListAbility iUserCardListAbility2 = (IUserCardListAbility) interfaceC494301wDLIZ2;
        if (iUserCardListAbility2 != null && (config = iUserCardListAbility2.getConfig()) != null) {
            c1261270ivV = config.trackerConfig;
        } else {
            c1261270ivV = null;
        }
        if (enumC1261960iwcLIZLLL == EnumC1261960iwc.INBOX_PAGE) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (c1261270ivV != null) {
                str2 = c1261270ivV.LIZ;
            } else {
                str2 = null;
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            if (c1261270ivV != null) {
                str3 = c1261270ivV.LJII;
            }
            c2344009Gk.LJIIIIZZ("position", str3);
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        if (enumC1261960iwcLIZLLL == EnumC1261960iwc.FOLLOWING_LIST) {
            if (c1261270ivV != null) {
                str3 = c1261270ivV.LIZ;
            }
        } else if (c1261270ivV != null) {
            str3 = c1261270ivV.LJIILLIIL;
        }
        c2344009Gk2.LJIIIIZZ("enter_from", str3);
        C20684815ws.LJIILLIIL(str, c2344009Gk2.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC494301wD interfaceC494301wDLIZ;
        C1262300ixA config;
        C1262590ixd c1262590ixd;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        C1261920iwY c1261920iwY = (C1261920iwY) interfaceC1891350zJl;
        super.onBindItemView(c1261920iwY);
        Context context = this.itemView.getContext();
        int iLIZIZ = c1261920iwY.LLILLJJLI.LIZIZ();
        String strLIZLLL = c1261920iwY.LLILLJJLI.LIZLLL();
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.l5g);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.z7j);
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.z74);
        TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.rtz);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
        if (numLIZJ != null) {
            C427690Gpr.LIZLLL(this.itemView, numLIZJ.intValue());
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = LLILLL;
        c419910GdJ.LIZJ = LLILZ;
        c419910GdJ.LIZ = c1261920iwY.LLILLJJLI.LJ();
        c419910GdJ.LJ = Integer.valueOf(c1261920iwY.LLILLJJLI.LJFF());
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) c419910GdJ.LIZ(context), LLIZLLLIL, LLJI, LLJ, LLJIJIL);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = LLILZIL;
        c384050F3z.LJI = LLILZLL;
        c384050F3z.LIZIZ = Integer.valueOf(c1261920iwY.LLILLJJLI.LIZ());
        c384050F3z.LIZJ = Float.valueOf(LLIZ);
        tuxIconView2.setBackground(c384050F3z.LIZ(context));
        tuxIconView2.setImageDrawable(insetDrawable);
        if (C444960Hcc.LIZIZ()) {
            C786410Ut5.hc(tuxIconView2, -1.0f);
        } else {
            C786410Ut5.hc(tuxIconView2, 1.0f);
        }
        if (tuxIconView != null) {
            tuxIconView.setIconRes(iLIZIZ);
            tuxIconView.setTintColorRes(c1261920iwY.LLILLJJLI.LIZJ());
        }
        if (tuxTextView != null) {
            tuxTextView.setText(context.getString(c1261920iwY.LLILLJJLI.LJII()));
            tuxTextView.setTuxFont(c1261920iwY.LLILLJJLI.LJIIIIZZ());
            tuxTextView.setTextColorRes(c1261920iwY.LLILLJJLI.LJI());
        }
        if (tuxTextView2 != null) {
            tuxTextView2.setText(context.getString(c1261920iwY.LLILLJJLI.LJIIJ()));
            tuxTextView2.setTuxFont(c1261920iwY.LLILLJJLI.LJIIJJI());
            tuxTextView2.setTextColorRes(c1261920iwY.LLILLJJLI.LJIIIZ());
        }
        C1261940iwa c1261940iwa = C1261940iwa.LIZ;
        EnumC1262370ixH enumC1262370ixH = null;
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
                        interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL);
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
                    }
                }
            }
            interfaceC494301wDLIZ = null;
        } else {
            interfaceC494301wDLIZ = null;
        }
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
        if (iUserCardListAbility != null && (config = iUserCardListAbility.getConfig()) != null && (c1262590ixd = config.apiConfig) != null) {
            enumC1262370ixH = c1262590ixd.LIZ;
        }
        c1261940iwa.getClass();
        EnumC1261960iwc enumC1261960iwcLIZLLL = C1261940iwa.LIZLLL(enumC1262370ixH);
        C786410Ut5.I7(new AbS166S1200000_19(enumC1261960iwcLIZLLL, this, strLIZLLL, 1), this.itemView);
        C2211751BhN.LIZ(this.itemView, new C1261970iwd(enumC1261960iwcLIZLLL, this));
    }
}
