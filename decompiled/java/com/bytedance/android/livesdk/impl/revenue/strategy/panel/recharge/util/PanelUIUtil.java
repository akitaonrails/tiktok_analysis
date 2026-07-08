package com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.util;

import X.AbstractC426530Gnz;
import X.C1126800fQc;
import X.C1134410fct;
import X.C1151360g4E;
import X.C1151400g4I;
import X.C1308910kAL;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C418340Gam;
import X.C419890GdH;
import X.C419910GdJ;
import X.C426750GoL;
import X.C439101nJ;
import X.C444920HcY;
import X.C495520Jby;
import X.C497740JfY;
import X.C786410Ut5;
import X.EnumC1134460fcy;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS131S1100000_17;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public final class PanelUIUtil {
    public static final int LIZ = C439101nJ.LIZ(14);

    public static SpannableStringBuilder LIZIZ(Context context) {
        TaskManagerV2 taskManagerV2KE0;
        C1134410fct c1134410fctLJI;
        boolean z;
        C1134410fct c1134410fctLJI2;
        if (context != null && (c1134410fctLJI = (taskManagerV2KE0 = C1126800fQc.LIZ.KE0()).LJI(11)) != null) {
            if (c1134410fctLJI.LJIIIZ().LIZIZ == 5) {
                z = true;
            } else {
                z = false;
            }
            if (z && (c1134410fctLJI2 = taskManagerV2KE0.LJI(11)) != null) {
                if ((c1134410fctLJI2.LIZJ().compareTo(EnumC1134460fcy.TASK_IN_PROGRESS) >= 0 && !c1134410fctLJI2.LJIIJJI()) || c1134410fctLJI2.LIZJ().compareTo(EnumC1134460fcy.TASK_EXIT) >= 0) {
                    return null;
                }
                C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?spark_page=live_income_task_page");
                c495520Jby.LIZJ("enter_from", "recharge_task_page");
                String strLIZLLL = c495520Jby.LIZLLL();
                String strLJIJI = C497740JfY.LJIJI(2131853063);
                String strLJIJJ = C497740JfY.LJIJJ(2131853064, strLJIJI);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJJ);
                int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
                int length = strLJIJI.length() + iLJJJ;
                try {
                    final AwS131S1100000_17 awS131S1100000_17 = new AwS131S1100000_17(context, strLIZLLL, 9);
                    final Integer numValueOf = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.ezs, context));
                    C786410Ut5.q2(spannableStringBuilder, new AbstractC426530Gnz(numValueOf, awS131S1100000_17) { // from class: X.0GqH
                        public final Function1<View, Unit> LL;
                        public final Integer LLILLJJLI;
                        public long LLILLL;

                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - this.LLILLL > 300) {
                                this.LLILLL = jCurrentTimeMillis;
                                this.LL.invoke(view);
                            }
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            Integer num = this.LLILLJJLI;
                            if (num != null) {
                                textPaint.setColor(num.intValue());
                            }
                            textPaint.setUnderlineText(false);
                        }

                        {
                            this.LL = awS131S1100000_17;
                            this.LLILLJJLI = numValueOf;
                        }
                    }, iLJJJ, length, 18);
                    C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, false), iLJJJ, length, 18);
                    return spannableStringBuilder;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setPolicySpan error: ");
                    sbLIZ.append(e);
                    C20441214yg.LJ("PanelUIUtil", C2188811AlT.LIZIZ(sbLIZ));
                    return spannableStringBuilder;
                }
            }
        }
        return null;
    }

    public static void LIZ(C418340Gam c418340Gam, String str) {
        if (a0.LJJIIZI(str, "img", false)) {
            c418340Gam.setAdjustSize(-2.0f);
        }
    }

    public static SpannableStringBuilder LIZJ(C1151400g4I c1151400g4I, Context context, final int i) {
        int iIntValue;
        StringBuilder sbLIZ;
        String strLIZIZ;
        StringBuilder sbLIZ2;
        int length;
        try {
            c1151400g4I.getClass();
            Integer numLIZLLL = C1151360g4E.LIZLLL();
            if (numLIZLLL != null) {
                iIntValue = numLIZLLL.intValue();
            } else {
                iIntValue = 0;
            }
            int iMax = Math.max(c1151400g4I.LLILZIL - iIntValue, 0);
            boolean zLIZLLL = C426750GoL.LIZLLL(context);
            if (iMax > 0) {
                if (zLIZLLL) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(iMax);
                    sbLIZ3.append('+');
                    sbLIZ3.append(c1151400g4I.LLILZ);
                    sbLIZ3.append(" img");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("img ");
                    sbLIZ4.append(c1151400g4I.LLILZ);
                    sbLIZ4.append('+');
                    sbLIZ4.append(iMax);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                }
                if (!zLIZLLL) {
                    sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('+');
                    sbLIZ2.append(iMax);
                } else {
                    sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(iMax);
                    sbLIZ2.append('+');
                }
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int iLJJJ = a0.LJJJ(strLIZIZ, strLIZIZ2, 0, false, 6);
                if (strLIZIZ2.length() + iLJJJ >= strLIZIZ.length()) {
                    length = strLIZIZ.length();
                } else {
                    length = strLIZIZ2.length() + iLJJJ;
                }
                if (iLJJJ == -1) {
                    return new SpannableStringBuilder("");
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
                if (i == 0) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f00, context);
                    if (numLIZJ != null) {
                        i = numLIZJ.intValue();
                    } else {
                        i = 0;
                    }
                }
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(i) { // from class: com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.util.PanelUIUtil$getRechargeCellText$foregroundSpan$1
                    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                    }
                }, iLJJJ, length, 34);
                LIZLLL(context, spannableStringBuilder, strLIZIZ);
                return spannableStringBuilder;
            }
            if (!zLIZLLL) {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("img ");
                sbLIZ.append(c1151400g4I.LLILZ);
            } else {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1151400g4I.LLILZ);
                sbLIZ.append(" img ");
            }
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strLIZIZ3);
            LIZLLL(context, spannableStringBuilder2, strLIZIZ3);
            return spannableStringBuilder2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("getRechargeCellText error: ");
            sbLIZ5.append(e.getMessage());
            C20441214yg.LJ("PanelUIUtil", C2188811AlT.LIZIZ(sbLIZ5));
            return new SpannableStringBuilder("");
        }
    }

    public static void LIZLLL(Context context, SpannableStringBuilder spannableStringBuilder, String str) {
        try {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_tiktok_coin;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            int i = LIZ;
            tuxIconDrawableLIZ.setBounds(0, 0, i, i);
            int iLJJJ = a0.LJJJ(str, "img", 0, false, 6);
            if (iLJJJ == -1) {
                return;
            }
            C786410Ut5.q2(spannableStringBuilder, new C419890GdH(tuxIconDrawableLIZ, 2), iLJJJ, iLJJJ + 3, 17);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replaceIconSpan error: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("PanelUIUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
