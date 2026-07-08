package kotlin.jvm.internal;

import X.C09AY;
import X.C0CYD;
import X.C0OM1;
import X.C1229200i5m;
import X.C1246150iX7;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1390920mIc;
import X.C1667300tUO;
import X.C197039127h;
import X.C19737012Ka;
import X.C19EG;
import X.C259800zU;
import X.C319480Cfi;
import X.C341440Da2;
import X.C418440Gaw;
import X.C460140I2q;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogInterfaceOnCancelListenerC346360Dhy;
import X.InterfaceC1680500tpg;
import X.InterfaceC489860JIy;
import Y.ACListenerS108S0200000_4;
import Y.ACListenerS22S0500000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class AwS118S0201000_4 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS118S0201000_4 awS118S0201000_4, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667300tUO.LIZ((C319480Cfi) awS118S0201000_4.l0, (Function1) awS118S0201000_4.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS118S0201000_4.i2 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, X.127h, android.view.View, android.widget.TextView, java.lang.Object] */
    public static final Object invoke$1(AwS118S0201000_4 awS118S0201000_4, Object obj, Object obj2) {
        FragmentManager supportFragmentManager;
        Context context;
        Integer numIt2;
        T tValueOf;
        String string;
        boolean z;
        String string2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        if (zBooleanValue) {
            if (!zBooleanValue2) {
                int i = awS118S0201000_4.i2;
                if (i != -1) {
                    C460140I2q c460140I2q = ((SchoolUsersListFragment) awS118S0201000_4.l0).LLILLL;
                    if (c460140I2q != null) {
                        C460140I2q.LIZ(c460140I2q, i, true);
                    }
                } else {
                    C460140I2q c460140I2q2 = ((SchoolUsersListFragment) awS118S0201000_4.l0).LLILLL;
                    if (c460140I2q2 != null) {
                        C460140I2q.LIZ(c460140I2q2, 0, false);
                    }
                }
            }
        } else {
            if (zBooleanValue2) {
            }
            return Unit.LIZ;
        }
        SchoolUsersListFragment schoolUsersListFragment = (SchoolUsersListFragment) awS118S0201000_4.l0;
        Pair pair = (Pair) awS118S0201000_4.l1;
        C19EG activity = schoolUsersListFragment.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (context = schoolUsersListFragment.getContext()) != null) {
            C0OM1 c0om1 = new C0OM1();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TuxSheet tuxSheet = new C1390920mIc(false, 0).LIZ;
            tuxSheet.LLJJIJIL = c0om1;
            tuxSheet.LLJJJ = null;
            tuxSheet.LLJJIII = linearLayout;
            tuxSheet.LL = new DialogInterfaceOnCancelListenerC346360Dhy(schoolUsersListFragment, 3);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = context.getString(2131846926);
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LIZJ(new AwS405S0200000_4(schoolUsersListFragment, tuxSheet, 48));
            c0om1.LIZIZ(c1251150ifB);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setText(2131846920);
            tuxTextView.setTuxFont(42);
            tuxTextView.setTextColorRes(R.attr.a1k);
            tuxTextView.setGravity(17);
            linearLayout2.addView(tuxTextView, new LinearLayout.LayoutParams(-1, -2, 1.0f));
            TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
            tuxTextView2.setText(2131846923);
            tuxTextView2.setTuxFont(42);
            tuxTextView2.setTextColorRes(R.attr.a1k);
            tuxTextView2.setGravity(17);
            linearLayout2.addView(tuxTextView2, new LinearLayout.LayoutParams(-1, -2, 1.0f));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            marginLayoutParams.topMargin = ((Number) schoolUsersListFragment.LLJJJJJIL.getValue()).intValue();
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            linearLayout.addView(linearLayout2, marginLayoutParams);
            C1246150iX7.LIZ.getClass();
            int i2 = C1246150iX7.LIZ().graduationYearMin;
            int i3 = C1246150iX7.LIZ().graduationYearMax;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ContainerAbility containerAbilityRR = schoolUsersListFragment.RR();
            if (containerAbilityRR != null) {
                numIt2 = containerAbilityRR.It2();
            } else {
                numIt2 = null;
            }
            final C259800zU c259800zU = new C259800zU();
            if (schoolUsersListFragment.LLJLLL) {
                if (pair != null) {
                    tValueOf = pair.getFirst();
                } else {
                    tValueOf = 0;
                }
            } else if (pair != null) {
                tValueOf = Integer.valueOf(((Number) pair.getFirst()).intValue());
            } else {
                tValueOf = numIt2;
            }
            c259800zU.element = tValueOf;
            final C259800zU c259800zU2 = new C259800zU();
            T tValueOf2 = numIt2;
            if (schoolUsersListFragment.LLJLLL) {
                if (pair != null) {
                    tValueOf2 = pair.getSecond();
                } else {
                    tValueOf2 = 0;
                }
            } else if (pair != null) {
                tValueOf2 = Integer.valueOf(((Number) pair.getSecond()).intValue());
            }
            c259800zU2.element = tValueOf2;
            final C259800zU c259800zU3 = new C259800zU();
            String string3 = context.getString(2131846921);
            arrayList.add(string3);
            if (i2 <= i3) {
                while (true) {
                    arrayList.add(String.valueOf(i2));
                    arrayList2.add(String.valueOf(i2));
                    if (i2 == i3) {
                        break;
                    }
                    i2++;
                }
            }
            arrayList2.add(string3);
            final C19737012Ka c19737012Ka = new C19737012Ka(context, null, 6);
            final int iLIZLLL = c19737012Ka.LIZLLL(arrayList);
            final int iLIZLLL2 = c19737012Ka.LIZLLL(arrayList2);
            Integer num = (Integer) c259800zU.element;
            if (num == null || (string = num.toString()) == null) {
                string = string3;
            }
            c19737012Ka.LJFF(iLIZLLL, string);
            Integer num2 = (Integer) c259800zU2.element;
            if (num2 != null && (string2 = num2.toString()) != null) {
                string3 = string2;
            }
            c19737012Ka.LJFF(iLIZLLL2, string3);
            c19737012Ka.LJ(iLIZLLL, new InterfaceC489860JIy() { // from class: X.0DhW
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Integer] */
                @Override // X.InterfaceC489860JIy
                public final void LIZ(int i4, String str) {
                    boolean z2;
                    C259800zU<Integer> c259800zU4 = c259800zU;
                    T t = 0;
                    Integer numValueOf = null;
                    if (str != null) {
                        try {
                            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
                            t = numValueOf;
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                            t = numValueOf;
                        }
                    }
                    c259800zU4.element = t;
                    Integer num3 = c259800zU.element;
                    C259800zU<Integer> c259800zU5 = c259800zU2;
                    Integer num4 = c259800zU5.element;
                    C19737012Ka c19737012Ka2 = c19737012Ka;
                    int i5 = iLIZLLL2;
                    if (num3 != null && num4 != null) {
                        int iIntValue = num4.intValue();
                        int iIntValue2 = num3.intValue();
                        if (iIntValue < iIntValue2) {
                            c19737012Ka2.LJFF(i5, String.valueOf(iIntValue2));
                            c259800zU5.element = Integer.valueOf(iIntValue2);
                        }
                    }
                    C197039127h c197039127h = c259800zU3.element;
                    if (c197039127h != null) {
                        if (c259800zU.element == null && c259800zU2.element == null) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        c197039127h.setEnabled(z2);
                    }
                }
            });
            c19737012Ka.LJ(iLIZLLL2, new InterfaceC489860JIy() { // from class: X.0DhX
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Integer] */
                @Override // X.InterfaceC489860JIy
                public final void LIZ(int i4, String str) {
                    boolean z2;
                    int iIntValue;
                    C259800zU<Integer> c259800zU4 = c259800zU2;
                    T t = 0;
                    Integer numValueOf = null;
                    if (str != null) {
                        try {
                            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
                            t = numValueOf;
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                            t = numValueOf;
                        }
                    }
                    c259800zU4.element = t;
                    C259800zU<Integer> c259800zU5 = c259800zU;
                    Integer num3 = c259800zU5.element;
                    Integer num4 = c259800zU2.element;
                    C19737012Ka c19737012Ka2 = c19737012Ka;
                    int i5 = iLIZLLL;
                    if (num3 != null && num4 != null && (iIntValue = num4.intValue()) < num3.intValue()) {
                        c19737012Ka2.LJFF(i5, String.valueOf(iIntValue));
                        c259800zU5.element = Integer.valueOf(iIntValue);
                    }
                    C197039127h c197039127h = c259800zU3.element;
                    if (c197039127h != null) {
                        if (c259800zU.element == null && c259800zU2.element == null) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        c197039127h.setEnabled(z2);
                    }
                }
            });
            linearLayout.addView(c19737012Ka, C1229200i5m.LIZIZ(-1, -2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, 0, 104));
            ?? c197039127h = new C197039127h(context, null, 6, 0);
            c197039127h.setText(2131846917);
            c197039127h.setButtonSize(3);
            c197039127h.setButtonVariant(0);
            C786410Ut5.U8(c197039127h, new ACListenerS22S0500000_4(c259800zU, c259800zU2, c197039127h, schoolUsersListFragment, tuxSheet, 1));
            if (c259800zU.element == 0 && c259800zU2.element == 0) {
                z = false;
            } else {
                z = true;
            }
            c197039127h.setEnabled(z);
            linearLayout.addView((View) c197039127h, C1229200i5m.LIZIZ(-1, -2, schoolUsersListFragment.ZR(), ((Number) schoolUsersListFragment.LLJJJJLIIL.getValue()).intValue(), schoolUsersListFragment.ZR(), 0, 0, 96));
            c259800zU3.element = c197039127h;
            C197039127h c197039127h2 = new C197039127h(context, null, 6, 0);
            c197039127h2.setButtonSize(3);
            c197039127h2.setButtonVariant(-1);
            c197039127h2.setText(2131846918);
            c197039127h2.setTextColorRes(R.attr.a1h);
            C786410Ut5.U8(c197039127h2, new ACListenerS108S0200000_4(tuxSheet, schoolUsersListFragment, 26));
            linearLayout.addView(c197039127h2, C1229200i5m.LIZIZ(-1, -2, schoolUsersListFragment.ZR(), 0, schoolUsersListFragment.ZR(), ((Number) schoolUsersListFragment.LLJJLIIIJLLLLLLLZ.getValue()).intValue(), 0, 72));
            tuxSheet.show(supportFragmentManager, "FindSchoolFriendsPage_GraduationYearPopup");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS118S0201000_4(int i, int i2, SchoolUsersListFragment schoolUsersListFragment, Pair<Integer, Integer> pair) {
        super(2);
        this.$t = pair;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = schoolUsersListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS118S0201000_4(C319480Cfi c319480Cfi, C319480Cfi c319480Cfi2, Function1<? super C0CYD, Unit> function1, int i) {
        super(2);
        this.$t = i;
        this.l0 = c319480Cfi;
        this.l1 = c319480Cfi2;
        this.i2 = function1;
    }
}
