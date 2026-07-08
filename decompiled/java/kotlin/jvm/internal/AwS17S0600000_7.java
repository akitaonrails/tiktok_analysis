package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0KS8;
import X.C0KSH;
import X.C0KSW;
import X.C0KSX;
import X.C0KSY;
import X.C1143680frq;
import X.C1324610kZf;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C1819620xS4;
import X.C189200o6;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C444920HcY;
import X.C454590Hs9;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C517700KSa;
import X.C786410Ut5;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.livesdk.livesetting.level.SuperFanPurchaseConfig;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanEmoteNewTipSetting;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanJoinFragment;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import tikcast.api.fans.GetNonFansUserDataResponse;
import tikcast.api.fans.GetSuperFansTreasureBoxDataResponse;
import webcast.data.SuperFanPrivilege;
import webcast.data.SuperFanPrivilegeInfo;
import wh6.AbS188S0400000_7;

/* JADX INFO: loaded from: classes8.dex */
public class AwS17S0600000_7 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0758 A[PHI: r14
      0x0758: PHI (r14v5 java.lang.String) = (r14v4 java.lang.String), (r14v7 java.lang.String), (r14v7 java.lang.String) binds: [B:260:0x0754, B:191:0x0543, B:193:0x0547] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x075b  */
    /* JADX WARN: Type inference failed for: r15v3, types: [X.0KSi, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS17S0600000_7 r33) {
        /*
            Method dump skipped, instruction units count: 2001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS17S0600000_7.invoke$0(kotlin.jvm.internal.AwS17S0600000_7):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS17S0600000_7 awS17S0600000_7) {
        String strLIZ;
        String strLIZIZ;
        SuperFanPrivilege superFanPrivilege;
        String strLJIJJ;
        int size;
        String str;
        SuperFanPrivilege superFanPrivilege2;
        List<SuperFanPrivilegeInfo> list;
        List<SuperFanPrivilegeInfo> list2;
        if (((SuperFanJoinFragment) awS17S0600000_7.l0).isAdded()) {
            SuperFanJoinFragment superFanJoinFragment = (SuperFanJoinFragment) awS17S0600000_7.l0;
            C0KSW c0ksw = ((C0KS8) awS17S0600000_7.l1).LIZIZ;
            if (c0ksw != null) {
                strLIZ = c0ksw.LIZ();
            } else {
                strLIZ = null;
            }
            C0KSW c0ksw2 = ((C0KS8) awS17S0600000_7.l1).LIZIZ;
            if (c0ksw2 != null) {
                strLIZIZ = c0ksw2.LIZIZ();
            } else {
                strLIZIZ = null;
            }
            superFanJoinFragment.LLIZLLLIL = !Intrinsics.LJFF(strLIZ, strLIZIZ);
            SuperFanJoinFragment superFanJoinFragment2 = (SuperFanJoinFragment) awS17S0600000_7.l0;
            boolean z = false;
            superFanJoinFragment2.LLJ = false;
            AwS551S0100000_7 awS551S0100000_7 = superFanJoinFragment2.LLJI;
            if (awS551S0100000_7 != null) {
                awS551S0100000_7.invoke();
            }
            superFanJoinFragment2.LLJI = null;
            C500260Jjc.LJIILIIL((View) awS17S0600000_7.l2);
            C500260Jjc.LLFFF((View) awS17S0600000_7.l3);
            SuperFanJoinFragment superFanJoinFragment3 = (SuperFanJoinFragment) awS17S0600000_7.l0;
            View view = (View) awS17S0600000_7.l4;
            GetNonFansUserDataResponse.Data data = (GetNonFansUserDataResponse.Data) ((C0KSY) awS17S0600000_7.l5).LIZ;
            if (data != null) {
                superFanPrivilege = data.superFanPrivilegeInfo;
            } else {
                superFanPrivilege = null;
            }
            superFanJoinFragment3.getClass();
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.za5);
            appCompatTextView.setTextColor(ColorProtector.parseColor("#734300"));
            if (superFanJoinFragment3.LLILZLL) {
                SuperFanPurchaseConfig superFanPurchaseConfig = SuperFanPurchaseConfig.INSTANCE;
                strLJIJJ = C497740JfY.LJIIL(2131755999, superFanPurchaseConfig.getConfig().getPoints, Integer.valueOf(superFanPurchaseConfig.getConfig().getPoints));
            } else {
                strLJIJJ = C497740JfY.LJIJJ(2131856695, Integer.valueOf(SuperFanPurchaseConfig.INSTANCE.getConfig().reachLevel));
            }
            appCompatTextView.setText(strLJIJJ);
            appCompatTextView.setIncludeFontPadding(false);
            appCompatTextView.setMaxLines(2);
            appCompatTextView.setGravity(16);
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(18, 24, 1, 1);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            if (superFanPrivilege != null && (list2 = superFanPrivilege.privilegeDetails) != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            String strValueOf = String.valueOf(size);
            TextView textView = (TextView) view.findViewById(R.id.tv_privilege_count);
            textView.setTextColor(ColorProtector.parseColor("#734300"));
            String strLJIJJ2 = C497740JfY.LJIJJ(2131856696, strValueOf);
            SpannableString spannableString = new SpannableString(strLJIJJ2);
            int iLJJJ = a0.LJJJ(strLJIJJ2, strValueOf, 0, false, 6);
            int length = strValueOf.length() + iLJJJ;
            C786410Ut5.p2(spannableString, new ReplacementSpan() { // from class: X.0GV8
                public final int LL = (int) C497740JfY.LIZIZ(4.0f);
                public final int LLILLJJLI = (int) C497740JfY.LIZIZ(4.0f);

                @Override // android.text.style.ReplacementSpan
                public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                    return ((int) paint.measureText(charSequence, i, i2)) + (this.LL * 2);
                }

                @Override // android.text.style.ReplacementSpan
                public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                    float fMeasureText = paint.measureText(charSequence, i, i2);
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    float f2 = fontMetrics.bottom;
                    float f3 = fontMetrics.top;
                    float f4 = f2 - f3;
                    float f5 = ((i3 + i5) / 2) - (f4 / 2);
                    float f6 = f5 - f3;
                    RectF rectF = new RectF(f, f5, fMeasureText + f + (this.LL * 2), f4 + f5);
                    Paint paint2 = new Paint(paint);
                    paint2.setColor(ColorProtector.parseColor("#734300"));
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setAntiAlias(true);
                    int i6 = this.LLILLJJLI;
                    canvas.drawRoundRect(rectF, i6, i6, paint2);
                    int color = paint.getColor();
                    paint.setColor(ColorProtector.parseColor("#FFFFFF"));
                    canvas.drawText(charSequence, i, i2, this.LL + f, f6, paint);
                    paint.setColor(color);
                }
            }, iLJJJ, length, 33);
            C786410Ut5.p2(spannableString, new C444920HcY(43, false), iLJJJ, length, 33);
            textView.setText(spannableString);
            View viewFindViewById = view.findViewById(R.id.jvk);
            if (C454590Hs9.LIZ(superFanJoinFragment3.getContext())) {
                str = "ttlive_super_fan_badge_rtl.png";
            } else {
                str = "ttlive_super_fan_badge.png";
            }
            C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_fans_club_join_dialog", str);
            SuperFanJoinFragment superFanJoinFragment4 = (SuperFanJoinFragment) awS17S0600000_7.l0;
            View view2 = (View) awS17S0600000_7.l4;
            C0KSY c0ksy = (C0KSY) awS17S0600000_7.l5;
            C0KS8 c0ks8 = (C0KS8) awS17S0600000_7.l1;
            superFanJoinFragment4.getClass();
            C16F5 c16f5 = (C16F5) view2.findViewById(R.id.zpi);
            String strLJIJI = C497740JfY.LJIJI(2131856589);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(strLJIJI);
            sbLIZ.append(']');
            C517700KSa.LIZLLL(c16f5, C497740JfY.LJIJJ(2131856588, C2188811AlT.LIZIZ(sbLIZ)), 62, C20736316Cj.LIZIZ(R.attr.ey7, superFanJoinFragment4.getContext()), new AwS551S0100000_7(superFanJoinFragment4, 579));
            C16FS c16fs = (C16FS) view2.findViewById(R.id.si7);
            c16fs.setPadding((int) C497740JfY.LIZIZ(12.0f), 0, (int) C497740JfY.LIZIZ(12.0f), 0);
            CharSequence charSequenceLIZIZ = C517700KSa.LIZIZ(superFanJoinFragment4.getContext(), c0ks8);
            if (c0ks8.LIZIZ != null && C0KSX.LIZIZ(c0ksy)) {
                c16fs.setBackgroundTintList(ColorStateList.valueOf(ColorProtector.parseColor("#B47827")));
                superFanJoinFragment4.LLILZ = true;
                superFanJoinFragment4.LLILZIL = true;
            } else {
                c16fs.setBackgroundTintList(ColorStateList.valueOf(ColorProtector.parseColor("#66000000")));
                superFanJoinFragment4.LLILZ = true;
                superFanJoinFragment4.LLILZIL = false;
            }
            c16fs.setText(charSequenceLIZIZ);
            C786410Ut5.I7(new AbS188S0400000_7(c16fs, superFanJoinFragment4, c0ks8, c0ksy, 0), c16fs);
            SuperFanJoinFragment superFanJoinFragment5 = (SuperFanJoinFragment) awS17S0600000_7.l0;
            View view3 = (View) awS17S0600000_7.l4;
            GetNonFansUserDataResponse.Data data2 = (GetNonFansUserDataResponse.Data) ((C0KSY) awS17S0600000_7.l5).LIZ;
            if (data2 != null) {
                superFanPrivilege2 = data2.superFanPrivilegeInfo;
            } else {
                superFanPrivilege2 = null;
            }
            superFanJoinFragment5.getClass();
            ViewGroup viewGroup = (ViewGroup) view3.findViewById(R.id.rvv);
            int iLIZIZ = (int) C497740JfY.LIZIZ(80.0f);
            int iLJIIZILJ = (((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(40.0f))) - (iLIZIZ * 4)) / 3) - 1;
            if (superFanPrivilege2 != null && (list = superFanPrivilege2.privilegeDetails) != null) {
                int i = 0;
                for (SuperFanPrivilegeInfo superFanPrivilegeInfo : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        SuperFanPrivilegeInfo superFanPrivilegeInfo2 = superFanPrivilegeInfo;
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(superFanJoinFragment5.getContext()), R.layout.hpv, viewGroup, z);
                        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
                        layoutParams.height = -2;
                        layoutParams.width = iLIZIZ;
                        C786410Ut5.W5(viewTd, layoutParams);
                        View viewFindViewById2 = viewTd.findViewById(R.id.lry);
                        TextView textView2 = (TextView) viewTd.findViewById(R.id.tv_privilege);
                        if (textView2 != null) {
                            textView2.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, superFanJoinFragment5.getContext()));
                        }
                        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(superFanPrivilegeInfo2.icon);
                        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                        c1324610kZfLJIIIZ.LJJI(viewFindViewById2);
                        textView2.setText(superFanPrivilegeInfo2.title);
                        if (superFanPrivilegeInfo2.privilegeType == 14 && SuperFanEmoteNewTipSetting.INSTANCE.getValue()) {
                            TextView textView3 = (TextView) viewTd.findViewById(R.id.p75);
                            textView3.setText("NEW");
                            C500260Jjc.LLFFF(textView3);
                        }
                        if (i2 % 4 != 0) {
                            C500260Jjc.LJJLJLI(iLJIIZILJ, viewTd);
                        }
                        if (i > 3) {
                            C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(20.0f), viewTd);
                        }
                        viewGroup.addView(viewTd);
                        i = i2;
                        z = false;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            final SuperFanJoinFragment superFanJoinFragment6 = (SuperFanJoinFragment) awS17S0600000_7.l0;
            View view4 = (View) awS17S0600000_7.l4;
            superFanJoinFragment6.getClass();
            view4.findViewById(R.id.u3e).setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0KTb
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view5, int i3, int i4, int i5, int i6) {
                    if (superFanJoinFragment6.getParentFragment() instanceof SuperFanJoinDialog) {
                        SuperFanJoinDialog superFanJoinDialog = (SuperFanJoinDialog) superFanJoinFragment6.getParentFragment();
                        int i7 = superFanJoinDialog.LLLF;
                        if (i4 >= i7) {
                            View view6 = superFanJoinDialog.LLJZIJLIL;
                            if (view6 != null) {
                                C786410Ut5.T4(view6, 0.0f);
                            }
                        } else {
                            View view7 = superFanJoinDialog.LLJZIJLIL;
                            if (view7 != null) {
                                C786410Ut5.T4(view7, 1 - (i4 / i7));
                            }
                        }
                        int i8 = superFanJoinDialog.LLLF;
                        if (i4 <= i8) {
                            View view8 = superFanJoinDialog.LLL;
                            if (view8 != null) {
                                C786410Ut5.T4(view8, 0.0f);
                                return;
                            }
                            return;
                        }
                        if (i4 >= i8 * 2) {
                            View view9 = superFanJoinDialog.LLL;
                            if (view9 == null) {
                                return;
                            }
                            C786410Ut5.T4(view9, 1.0f);
                            return;
                        }
                        View view10 = superFanJoinDialog.LLL;
                        if (view10 == null) {
                            return;
                        }
                        float f = i8;
                        C786410Ut5.T4(view10, (i4 - f) / f);
                    }
                }
            });
            C0KSH.LJIIIIZZ(C475510Ikn.LJ((SuperFanJoinFragment) awS17S0600000_7.l0), ((SuperFanJoinFragment) awS17S0600000_7.l0).LL, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S0600000_7(TreasureBoxDialog treasureBoxDialog, TreasureBoxDialog treasureBoxDialog2, View view, View view2, C0KSY<GetSuperFansTreasureBoxDataResponse.Data> c0ksy, List<C0KS8> list, View view3) {
        super(0);
        this.$t = view3;
        this.l0 = treasureBoxDialog;
        this.l1 = treasureBoxDialog2;
        this.l2 = view;
        this.l3 = view2;
        this.l4 = c0ksy;
        this.l5 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S0600000_7(SuperFanJoinFragment superFanJoinFragment, SuperFanJoinFragment superFanJoinFragment2, C0KS8 c0ks8, View view, View view2, View view3, C0KSY<GetNonFansUserDataResponse.Data> c0ksy) {
        super(0);
        this.$t = c0ksy;
        this.l0 = superFanJoinFragment;
        this.l1 = superFanJoinFragment2;
        this.l2 = c0ks8;
        this.l3 = view;
        this.l4 = view2;
        this.l5 = view3;
    }
}
