package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0DRK;
import X.C0DU5;
import X.C0ZDN;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1388190mED;
import X.C1575450r6F;
import X.C1697810uHb;
import X.C19EG;
import X.C337180DJs;
import X.C342820DcG;
import X.C345700Dgu;
import X.C345890DhD;
import X.C384050F3z;
import X.C418440Gaw;
import X.C431260Gvc;
import X.C724240Sb0;
import X.C770750ULh;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursDetailScaffoldAssem;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.PadAdaptionFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public class AbS687S0100000_4 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

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
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS687S0100000_4(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS687S0100000_4 abS687S0100000_4, View view) {
        if (view != null) {
            AddYoursInviteFriendsAssem addYoursInviteFriendsAssem = (AddYoursInviteFriendsAssem) abS687S0100000_4.l0;
            addYoursInviteFriendsAssem.Go().setLoading(true);
            addYoursInviteFriendsAssem.withState(addYoursInviteFriendsAssem.Ho(), new AwS583S0100000_4(addYoursInviteFriendsAssem, 363));
        }
    }

    public static final void LIZ$1(AbS687S0100000_4 abS687S0100000_4, View view) {
        if (view != null) {
            ((PadAdaptionFragment) abS687S0100000_4.l0).dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$2(AbS687S0100000_4 abS687S0100000_4, View view) {
        if (view != null) {
            ((C0DU5) abS687S0100000_4.l0).LIZJ.invoke(view.getContext());
        }
    }

    public static final void LIZ$3(AbS687S0100000_4 abS687S0100000_4, View view) {
        Function1<? super View, Unit> function1;
        if (view != null && (function1 = ((C342820DcG) abS687S0100000_4.l0).LIZ) != null) {
            function1.invoke(view);
        }
    }

    public static final void LIZ$4(AbS687S0100000_4 abS687S0100000_4, View view) {
        Function1<View, Unit> function1;
        if (view != null && (function1 = ((C345700Dgu) abS687S0100000_4.l0).LIZJ) != null) {
            function1.invoke(view);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.ViewGroup, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final void LIZ$5(AbS687S0100000_4 abS687S0100000_4, View view) {
        FragmentManager supportFragmentManager;
        ViewGroup viewGroup;
        String string;
        String string2;
        String string3;
        String string4;
        View viewFindViewById;
        if (view != null) {
            C1575450r6F c1575450r6F = (C1575450r6F) abS687S0100000_4.l0;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c1575450r6F.LIZIZ);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                ?? r7 = 0;
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(c1575450r6F.LIZIZ), R.layout.i8l, null, false);
                if ((viewTd instanceof LinearLayout) && (viewGroup = (ViewGroup) viewTd) != null) {
                    C345890DhD[] c345890DhDArr = new C345890DhD[4];
                    if (c1575450r6F.LJI().isGroup()) {
                        string = c1575450r6F.LIZIZ.getString(2131835347);
                    } else {
                        string = c1575450r6F.LIZIZ.getString(2131848019);
                    }
                    c345890DhDArr[0] = new C345890DhD(string, false);
                    if (c1575450r6F.LJI().isGroup()) {
                        string2 = c1575450r6F.LIZIZ.getString(2131835346);
                    } else {
                        string2 = c1575450r6F.LIZIZ.getString(2131848018);
                    }
                    c345890DhDArr[1] = new C345890DhD(string2, true);
                    if (c1575450r6F.LJI().isGroup()) {
                        string3 = c1575450r6F.LIZIZ.getString(2131835344);
                    } else {
                        string3 = c1575450r6F.LIZIZ.getString(2131848016);
                    }
                    c345890DhDArr[2] = new C345890DhD(string3, true);
                    if (c1575450r6F.LJI().isGroup()) {
                        string4 = c1575450r6F.LIZIZ.getString(2131835345);
                    } else {
                        string4 = c1575450r6F.LIZIZ.getString(2131848017);
                    }
                    c345890DhDArr[3] = new C345890DhD(string4, true);
                    int i = 0;
                    for (Object obj : C1697810uHb.LJIIJJI(c345890DhDArr)) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            C345890DhD c345890DhD = (C345890DhD) obj;
                            C1361400lX0 c1361400lX0LIZIZ = C1385040m98.LIZIZ(c1575450r6F.LIZIZ);
                            View viewLJLLJ = C786410Ut5.LJLLJ(c1361400lX0LIZIZ, R.layout.gb, r7);
                            ImageView imageView = (ImageView) viewLJLLJ.findViewById(R.id.cy0);
                            if (c345890DhD.LIZ) {
                                C384050F3z c384050F3z = new C384050F3z();
                                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1k);
                                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                                imageView.setImageDrawable(c384050F3z.LIZ(c1361400lX0LIZIZ));
                                C786410Ut5.LJZI(0, imageView);
                            } else {
                                C786410Ut5.LJZI(8, imageView);
                            }
                            TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.cy1);
                            tuxTextView.setTextColorRes(R.attr.a1k);
                            tuxTextView.setText(c345890DhD.LIZIZ);
                            tuxTextView.setTextDirection(5);
                            tuxTextView.setTuxFont(41);
                            tuxTextView.setMovementMethod(C431260Gvc.LIZ);
                            viewGroup.addView(viewLJLLJ);
                            i = i2;
                            r7 = 0;
                        } else {
                            C1697810uHb.LJIJI();
                            throw r7;
                        }
                    }
                    C770750ULh c770750ULh = new C770750ULh();
                    c770750ULh.LJIILL = viewGroup;
                    c770750ULh.LJIILLIIL = true;
                    TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
                    View view2 = tuxSheet.getView();
                    if (view2 != null && (viewFindViewById = view2.findViewById(R.id.cfr)) != null) {
                        C337180DJs.LIZ(viewFindViewById);
                    }
                    tuxSheet.show(supportFragmentManager, "vibe_info");
                }
            }
        }
    }

    public static final void LIZ$6(AbS687S0100000_4 abS687S0100000_4, View view) {
        if (view != null) {
            ((Function1) abS687S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$7(AbS687S0100000_4 abS687S0100000_4, View view) {
        C19EG c19egLIZ;
        if (view != null && (c19egLIZ = C724240Sb0.LIZ((AddYoursDetailScaffoldAssem) abS687S0100000_4.l0)) != null) {
            C0ZDN c0zdn = (C0ZDN) ((AddYoursDetailScaffoldAssem) abS687S0100000_4.l0).LLJJJIL.getValue();
            if (c0zdn != null) {
                c0zdn.LIZ(0);
            }
            C0DRK.LIZ(c19egLIZ, new AwS553S0100000_9((AddYoursDetailScaffoldAssem) abS687S0100000_4.l0, 1844));
        }
    }
}
