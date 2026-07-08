package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C1073950e3N;
import X.C1261760iwI;
import X.C1261770iwJ;
import X.C1262090iwp;
import X.C1264320j0Q;
import X.C13LE;
import X.C14MI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1954807lC;
import X.C197039127h;
import X.C2188811AlT;
import X.C428150Gqb;
import X.C447550Hgn;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC2274741E1w;
import X.EnumC428940Grs;
import X.InterfaceC1263010iyJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS143S0201000_19;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS331S0300000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AbsAuthCell<ITEM extends C1261760iwI> extends BasePowerCell<ITEM> {
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C197039127h LLILZLL;
    public TuxIconView LLIZ;
    public C197039127h LLIZLLLIL;

    public abstract int W5();

    public abstract boolean X5();

    public final TuxIconView V5() {
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return W5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = (TuxIconView) this.itemView.findViewById(R.id.q9p);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.q_9);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.q9e);
        this.LLILZLL = (C197039127h) this.itemView.findViewById(R.id.hyw);
        if (X5()) {
            C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.t5w);
            this.LLIZLLLIL = c197039127h;
            C428150Gqb.LIZ(c197039127h, EnumC428940Grs.ALPHA, 0.0f);
        } else {
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.q9b);
            this.LLIZ = tuxIconView;
            C428150Gqb.LIZ(tuxIconView, EnumC428940Grs.ALPHA, 0.0f);
        }
    }

    public void U5(C1262090iwp c1262090iwp) {
        boolean z;
        C197039127h c197039127h;
        Context context;
        C197039127h c197039127h2;
        Integer num;
        C197039127h c197039127h3;
        Integer num2;
        TuxIconView tuxIconView;
        Integer num3;
        int i;
        Integer num4;
        int i2;
        TuxIconView tuxIconView2 = this.LLIZ;
        if (tuxIconView2 != null) {
            Integer num5 = c1262090iwp.LJJI;
            if ((num5 == null || num5.intValue() != 203) && ((num4 = c1262090iwp.LJJI) == null || num4.intValue() != 200)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, tuxIconView2);
        }
        C197039127h c197039127h4 = this.LLIZLLLIL;
        if (c197039127h4 != null) {
            Integer num6 = c1262090iwp.LJJI;
            if ((num6 == null || num6.intValue() != 203) && ((num3 = c1262090iwp.LJJI) == null || num3.intValue() != 200)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c197039127h4);
        }
        TuxIconView tuxIconView3 = this.LLIZ;
        if (tuxIconView3 != null && tuxIconView3.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        TuxTextView tuxTextView = null;
        if (z && (num2 = c1262090iwp.LJJI) != null && num2.intValue() == 202 && !Intrinsics.LJFF(c1262090iwp.LJJIFFI, Boolean.TRUE) && (tuxIconView = this.LLIZ) != null) {
            tuxIconView.setTuxIcon(null);
        }
        C197039127h c197039127h5 = this.LLIZLLLIL;
        if (c197039127h5 != null && c197039127h5.getVisibility() == 0 && (num = c1262090iwp.LJJI) != null && num.intValue() == 202 && (c197039127h3 = this.LLIZLLLIL) != null) {
            C786410Ut5.LLLLLLJ(c197039127h3, 8);
        }
        if (c1262090iwp.LIZJ) {
            TuxTextView tuxTextView2 = this.LLILZIL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setTextColorRes(R.attr.eh);
            TuxTextView tuxTextView3 = this.LLILZ;
            if (tuxTextView3 != null) {
                tuxTextView = tuxTextView3;
            }
            tuxTextView.setTextColorRes(R.attr.ee);
            TuxIconView tuxIconView4 = this.LLIZ;
            if (tuxIconView4 != null) {
                tuxIconView4.setTintColorRes(R.attr.e8);
            }
        } else {
            TuxTextView tuxTextView4 = this.LLILZIL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setTextColorRes(R.attr.a1k);
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 != null) {
                tuxTextView = tuxTextView5;
            }
            tuxTextView.setTextColorRes(R.attr.a1h);
            TuxIconView tuxIconView5 = this.LLIZ;
            if (tuxIconView5 != null) {
                tuxIconView5.setTintColorRes(R.attr.a1p);
            }
        }
        if (c1262090iwp.LJFF == EnumC2274741E1w.CUSTOM_TT_NOW_NORMAL && (c197039127h = this.LLILZLL) != null && (context = c197039127h.getContext()) != null && (c197039127h2 = this.LLILZLL) != null) {
            c197039127h2.setBackground(C14MI.LIZ(context, R.drawable.bt9));
        }
    }

    public void a6(ITEM item) {
        C197039127h c197039127h;
        C1262090iwp c1262090iwp = item.LLILLL;
        final C1261770iwJ c1261770iwJ = item.LLILZ;
        if (!c1262090iwp.LJIL) {
            C786410Ut5.I7(new AbS331S0300000_19((AbsAuthCell) this, (C1261760iwI) item, c1261770iwJ, 0), this.itemView);
        }
        final AwS263S0300000_19 awS263S0300000_19 = new AwS263S0300000_19(c1262090iwp, (C1262090iwp) this, (AbsAuthCell<int>) item, 7);
        Integer num = c1262090iwp.LJJI;
        if ((num != null && num.intValue() == 201) || Intrinsics.LJFF(c1262090iwp.LJJIFFI, Boolean.TRUE)) {
            TuxIconView tuxIconView = this.LLIZ;
            if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
                TuxIconView tuxIconView2 = this.LLIZ;
                if (tuxIconView2 != null) {
                    C786410Ut5.a9(tuxIconView2, new ACListenerS154S0100000_19(awS263S0300000_19, 129));
                }
            } else {
                C197039127h c197039127h2 = this.LLIZLLLIL;
                if (c197039127h2 != null && c197039127h2.getVisibility() == 0 && (c197039127h = this.LLIZLLLIL) != null) {
                    C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19(awS263S0300000_19, 130));
                }
            }
        }
        Integer num2 = c1262090iwp.LJJI;
        if (num2 != null && num2.intValue() == 200) {
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0iwK
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.S5());
                    if (!(c19egLIZIZ instanceof C19EG)) {
                        c19egLIZIZ = null;
                    }
                    if (c19egLIZIZ == null) {
                        return false;
                    }
                    C1261770iwJ c1261770iwJ2 = c1261770iwJ;
                    Function0<Unit> function0 = awS263S0300000_19;
                    C1390850mIV c1390850mIV = new C1390850mIV();
                    C1247510iZJ c1247510iZJ = new C1247510iZJ();
                    c1247510iZJ.LIZIZ(R.string.gm7);
                    c1247510iZJ.LIZJ = 1;
                    c1247510iZJ.LIZ(new AwS598S0100000_19(function0, (Function0<Unit>) 240));
                    c1390850mIV.LIZIZ(c1247510iZJ);
                    TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
                    FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1261770iwJ2.LL);
                    sbLIZ.append("_auth_cell");
                    tuxActionSheetLIZJ.show(supportFragmentManager, C2188811AlT.LIZIZ(sbLIZ));
                    return true;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1261760iwI c1261760iwI = (C1261760iwI) interfaceC1891350zJl;
        super.onBindItemView(c1261760iwI);
        int i = C1073950e3N.LIZ[c1261760iwI.LLILZ.LL.ordinal()];
        TuxTextView tuxTextView = null;
        if (i != 1) {
            if (i == 2) {
                V5().setIconRes(R.raw.icon_color_contact_circle);
                TuxTextView tuxTextView2 = this.LLILZ;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                tuxTextView2.setText(2131829482);
                TuxTextView tuxTextView3 = this.LLILZIL;
                if (tuxTextView3 != null) {
                    tuxTextView = tuxTextView3;
                }
                tuxTextView.setText(2131829481);
            } else {
                throw new C1954807lC();
            }
        } else {
            V5().setIconRes(R.raw.icon_color_facebook_circle);
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setText(2131834450);
            TuxTextView tuxTextView5 = this.LLILZIL;
            if (tuxTextView5 != null) {
                tuxTextView = tuxTextView5;
            }
            tuxTextView.setText(2131845491);
        }
        U5(c1261760iwI.LLILLL);
        a6(c1261760iwI);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell
    public final void R5(int i, InterfaceC1891350zJl interfaceC1891350zJl, boolean z) {
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        C1261760iwI c1261760iwI = (C1261760iwI) interfaceC1891350zJl;
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
                            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), AuthCardCellTrackAbility.class, strLJJJLIIL);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(AuthCardCellTrackAbility.class).LJI());
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
        AuthCardCellTrackAbility authCardCellTrackAbility = (AuthCardCellTrackAbility) interfaceC494301wD;
        if (authCardCellTrackAbility != null) {
            boolean z2 = authCardCellTrackAbility.LL.invoke().LJIIIIZZ;
            if (z) {
                if (z2) {
                    C447550Hgn.LIZJ(new AwS143S0201000_19(authCardCellTrackAbility, i, c1261760iwI, 4));
                }
            } else {
                if (z2) {
                    return;
                }
                C447550Hgn.LIZJ(new AwS143S0201000_19(authCardCellTrackAbility, i, c1261760iwI, 5));
            }
        }
    }
}
